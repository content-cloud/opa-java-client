package eu.xenit.contentcloud.opa.rego.ast;

import eu.xenit.contentcloud.opa.rego.ast.Term.ScalarValue;
import java.util.List;
import lombok.Data;

@Data
public class Package {
    private List<ScalarValue> path;
}
