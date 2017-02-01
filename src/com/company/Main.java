package com.company;



import java.io.File;

import javax.xml.bind.*;

public class Main {




    public static void main(String[] args) {

//     getbike(args);
        File ConfigurationDump = new File("src/com/company/resources/src/Configuration.xml");




        try {
            JAXBContext context = JAXBContext.newInstance(ConfigurationFactory.class);

            Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
            ConfigurationObject unMarshalledConfiguration = (ConfigurationObject) jaxbUnmarshaller.unmarshal(ConfigurationDump);
            System.out.println(unMarshalledConfiguration);

        } catch (JAXBException e) {
            e.printStackTrace();
        }



        File ShediledJobsDump = new File("src/com/company/resources/src/ScheduledJobs/ПервоеРегламентноеЗадание.xml");

        try {
            JAXBContext contextJob = JAXBContext.newInstance(ScheduledJobsObject.class);

            Unmarshaller jaxbUnmarshallerJob = contextJob.createUnmarshaller();
            ScheduledJobsObject unMarshalledJob = (ScheduledJobsObject) jaxbUnmarshallerJob.unmarshal(ShediledJobsDump);
            System.out.println(unMarshalledJob);

        } catch (JAXBException e) {
            e.printStackTrace();
        }




    }
}
