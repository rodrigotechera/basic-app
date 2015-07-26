package basic;

import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.hbs.Hbs;

public class App extends Jooby {

  {

    /**
     * classpath resources under /assets are accessible.
     */
    assets("/assets/**");

    /**
     * Use handlebars engine (or freemarker, etc...)
     */
    use(new Hbs());

    /**
     * Serve home page, render 'index' page and add a model attribute: name.
     */
    get("/", req -> Results.html("index").put("name", req.param("name").value("World")));

  }

}
