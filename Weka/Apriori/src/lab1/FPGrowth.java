package lab1;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class FPGrowth {
    public static void main(String[] args) throws Exception {
        Instances data = DataSource.read("D:\\Downloads\\data.arff");
        FPGrowth model = new FPGrowth();

    }
}
