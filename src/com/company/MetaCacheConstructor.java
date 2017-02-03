package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 03.02.2017.
 */
public class MetaCacheConstructor {

    public static void MakeCache(String srcDir){

      BslConfiguration Conf = new BslConfiguration();

        File ConfigurationDump = new File("src/com/company/resources/src/Configuration.xml");




        try {
            JAXBContext context = JAXBContext.newInstance(ConfigurationFactory.class);

            Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
            ConfigurationObject unMarshalledConfiguration = (ConfigurationObject) jaxbUnmarshaller.unmarshal(ConfigurationDump);
            Conf.setMetadata(unMarshalledConfiguration);

            List<BslScheduledJob> ScheduledJobs = new ArrayList<BslScheduledJob>();
            Conf.setScheduledJobs(ScheduledJobs);
            System.out.println(unMarshalledConfiguration);

        } catch (JAXBException e) {
            e.printStackTrace();
        }


      BslScheduledJob job = new BslScheduledJob();

      String filesrc = "src/com/company/resources/src/ScheduledJobs/ПервоеРегламентноеЗадание.xml";
      File ShediledJobsDump = new File(filesrc);

      try {
            JAXBContext contextJob = JAXBContext.newInstance(ScheduledJobsFactory.class);

            Unmarshaller jaxbUnmarshallerJob = contextJob.createUnmarshaller();
            ScheduledJobsObject unMarshalledJob = (ScheduledJobsObject) jaxbUnmarshallerJob.unmarshal(ShediledJobsDump);
            System.out.println(unMarshalledJob);
            job.setMetadata(unMarshalledJob);
            job.setFileSrc(filesrc);

            Conf.ScheduledJobs.add(job);

      } catch (JAXBException e) {
            e.printStackTrace();
      }





    }
}
