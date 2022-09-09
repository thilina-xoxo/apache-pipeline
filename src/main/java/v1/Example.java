package v1;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.Create;


import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {


        IntrotoPipeLine pipeLineCreate = new IntrotoPipeLine();
        Pipeline pipeline = pipeLineCreate.createPipeLine();

        final List<String> input = Arrays.asList("first","second","third","fourth");

        // Create of - take collection as input and turn it into PCollection
        pipeline.apply(Create.of(input)).apply(TextIO.write().to("D:\\Engineering\\Internship\\Code\\Team\\1st beam pipeline\\Output\\example").withSuffix(".txt"));
        pipeline.run().waitUntilFinish();


    }
}
