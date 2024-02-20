# Hadoop and MapReduce

## Overview:
Hadoop is an open-source framework for distributed storage and processing of large data sets. It enables the reliable and scalable handling of massive amounts of data across clusters of computers.

## MapReduce:
MapReduce is a programming model within Hadoop that simplifies large-scale data processing. It divides tasks into smaller sub-tasks, processed in parallel. It consists of two main phases: Map, where data is processed concurrently, and Reduce, where results are consolidated. This approach allows efficient and parallelized data processing, making it suitable for big data analytics and computations.

## Getting Started:
1. **Installation:**
   - Follow the official [Hadoop installation guide](https://drive.google.com/file/d/1JEplhIJuTFDcUomMppC1xN59NMMnB9uP/view) for setting up Hadoop.

# AgeMapReduce

This project demonstrates a basic MapReduce job using Hadoop to count age groups from a dataset.

## Classes

### 1. AgeRunner

- **Description:**
  - The main class that configures and runs the Hadoop MapReduce job for counting age groups.
# AgeMapReduce

## 2. AgeMapper

- **Description:**
  - Mapper class responsible for extracting age information from input records and categorizing them into age groups.

- **Logic:**
  - Reads input records, extracts age information, and categorizes individuals into two groups: "LessThan20" and "GreaterThan20".

- **Input:**
  - Expects input records with comma-separated values, where age is the third field.

## 3. AgeReducer

- **Description:**
  - Reducer class that aggregates the count of individuals in each age group.

- **Logic:**
  - Receives the output from mappers, sums up the counts for each age group, and emits the final count for each group.

- **Output:**
  - Produces the count of individuals in each age group.

# YearMapReduce

This project demonstrates a basic Hadoop MapReduce job to count occurrences of different years in a dataset.

## Classes

### 1. YearMapper

- **Description:**
  - Mapper class responsible for extracting year information from input records and emitting key-value pairs.

- **Logic:**
  - Reads input records, extracts the year information from the fifth column (adjustable), and emits key-value pairs.

### 2. YearCounter

- **Description:**
  - Main class that configures and runs the Hadoop MapReduce job for counting occurrences of each year.

- **Usage:**
  - Execute the `main` method to initiate the MapReduce job. Provide input and output paths as command-line arguments.

### 3. YearReducer

- **Description:**
  - Reducer class responsible for aggregating the count of occurrences for each year.

- **Logic:**
  - Receives the output from mappers, sums up the counts for each year, and emits the final count for each year.

# CourseMapReduce

This project demonstrates a basic Hadoop MapReduce job to count occurrences of different courses in a dataset.

## Classes

### 1. CourseReducer

- **Description:**
  - Reducer class responsible for aggregating the count of occurrences for each course.

- **Logic:**
  - Receives the output from mappers, sums up the counts for each course, and emits the final count for each course.

### 2. CourseMapper

- **Description:**
  - Mapper class responsible for extracting course information from input records and emitting key-value pairs.

- **Logic:**
  - Reads input records, extracts the course information from the fourth column (adjustable), and emits key-value pairs.

### 3. CourseCounter

- **Description:**
  - Main class that configures and runs the Hadoop MapReduce job for counting occurrences of each course.

- **Usage:**
  - Execute the `main` method to initiate the MapReduce job. Provide input and output paths as command-line arguments.



- **Example:**
  ```bash
  hadoop jar (your jar file) (package name).(class name) inputPath outputPath
```


