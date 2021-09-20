import com.deepoove.swagger.diff.SwaggerDiff;
import com.deepoove.swagger.diff.output.HtmlRender;

import java.io.FileWriter;
import java.io.IOException;

public class Difference {
    public static void main(String []args){
        SwaggerDiff diff = SwaggerDiff.compareV2("src/main/resources/NewSwaggers/swagger47.json", "src/main/resources/NewSwaggers/swagger48.json");
       // diff.getChangedEndpoints();
        String html = new HtmlRender("Changelog",
                "http://deepoove.com/swagger-diff/stylesheets/demo.css")
                .render(diff);

        try {
            FileWriter fw = new FileWriter("testNewApi.html");
            fw.write(html);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
