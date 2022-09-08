import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

public class IntrotoPipeLine {

    public Pipeline createPipeLine() {

        // configure different aspects of the pipeline
        // eg : pipeline runner

        PipelineOptions pipelineOptions = PipelineOptionsFactory.create();

        // initialize pipeline
        Pipeline pipeline = Pipeline.create(pipelineOptions);

        return pipeline;
    }
}
