    package AgeMapReduce;

    import java.io.IOException;
    import org.apache.hadoop.io.IntWritable;
    import org.apache.hadoop.io.LongWritable;
    import org.apache.hadoop.io.Text;
    import org.apache.hadoop.mapred.MapReduceBase;
    import org.apache.hadoop.mapred.Mapper;
    import org.apache.hadoop.mapred.OutputCollector;
    import org.apache.hadoop.mapred.Reporter;

    public class AgeMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
        private final static IntWritable one = new IntWritable(1);
        private Text ageGroup = new Text();

        public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter)
                throws IOException {
            String line = value.toString();
            String[] fields = line.split(",");

            try {
                int age = Integer.parseInt(fields[2]);


                if (age < 20) {
                    ageGroup.set("LessThan20");
                } else {
                    ageGroup.set("GreaterThan20");
                }

                output.collect(ageGroup, one);
            } catch (NumberFormatException e) {
                System.err.println("Invalid age format: " + fields[2]);
            }
        }
    }
