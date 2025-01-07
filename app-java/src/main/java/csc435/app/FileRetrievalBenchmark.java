package csc435.app;

import java.util.ArrayList;

class BenchmarkWorker implements Runnable {
    // TO-DO keep track of a ClientProcessingEngine object
    private String datasetPath;

    pubic BenchmarkWorker(String datasetPath) {
        this.datasetPath = datasetPath;
    }

    @Override
    public void run() {
        // TO-DO create a ClientProcessinEngine object
        // TO-DO connect the ClientProcessingEngine to the server
        // TO-DO index the dataset
    }

    public void search() {
        // TO-DO perform search on the ClientProcessingEngine object
        // TO-DO print the results and performance
    }

    public void disconnect() {
        // TO-DO disconnect the ClientProcessingEngine object from the server
    }
}

public class FileRetrievalBenchmark {
    public static void main(String[] args)
    {
        String serverIP;
        String serverPort;
        int numberOfClients;
        ArrayList<String> clientsDatasetPath;

        // TO-DO extract the arguments from args
        // TO-DO measure the execution start time
        // TO-DO create Benchmark Worker objects equal to the number of clients
        // TO-DO create and start benchmark worker threads equal to the number of clients
        // TO-DO join the benchmark worker threads
        // TO-DO measure the execution stop time and print the performance
        // TO-DO run search queries on the first client
        // TO-DO disconnect all clients
    }
}
