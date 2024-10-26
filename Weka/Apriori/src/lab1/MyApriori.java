package lab1;

import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.associations.AssociationRules;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.util.List;

public class MyApriori {
    public static void main(String[] args) throws Exception {
        Instances data = DataSource.read("D:\\Downloads\\shopping.arff");
        Apriori model = new Apriori();
        model.setClassIndex(data.numAttributes() - 1);
        model.setLowerBoundMinSupport(0.4);
        model.setMinMetric(0.8);
        model.setNumRules(5);
        model.setUpperBoundMinSupport(0.9);
        model.buildAssociations(data);
        System.out.println(model);

        List<AssociationRule> rules = model.getAssociationRules().getRules();
        for (AssociationRule rule : rules) {
            rule.getPremise();
            rule.getConsequence();
            rule.getTotalSupport();
            rule.getConsequenceSupport();
            System.out.println(rule);
        }
    }
}
