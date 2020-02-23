import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Author: 肖维光
 * @Date: 2020/2/23 22:11
 * @Version 1.0
 */
@Mojo(name = "demo1")
public class Demo1Mojo extends AbstractMojo {

    @Parameter(property = "argsOne", defaultValue = "one")
    private String argsStr;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().info("xiao wei guang" + this.argsStr + "12");
    }
}
