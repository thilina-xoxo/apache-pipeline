package v2;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TypeDescriptor;
import org.apache.beam.sdk.values.TypeDescriptors;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Pipeline pipeline = Pipeline.create();

        // create PCollection object
        PCollection<Customer> pList = pipeline.apply(Create.of(getCustomers()));



        // PCollection object with type string
        PCollection<String> pString = pList.apply(MapElements.into(TypeDescriptors.strings()).via((Customer::getName)));

        //write p collection into the file
        pString.apply(TextIO.write().to("D:\\Engineering\\Internship\\Code\\Team\\1st beam pipeline\\Output").withNumShards(1).withSuffix("csv"));

        pipeline.run();





    }

    static List<Customer> getCustomers() {
        List<Customer> cList = new ArrayList<>();

        Customer cus1 = new Customer("1","Kamal");
        Customer cus2 = new Customer("2","Nimal");
        cList.add(cus1);
        cList.add(cus2);

        return cList;
    }
}
