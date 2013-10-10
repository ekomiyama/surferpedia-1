package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Stephanie;
import views.html.laird;
import views.html.bethany;
import views.html.jake;
import views.html.koloheandino;
import views.html.Stephanie;
import views.html.adriano;


/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns Laird Hamilton, a simple example of a second page to illustrate navigation.
   * @return Laird Hamilton.
   */
  public static Result laird() {
    return ok(laird.render("Laird Hamilton"));
    
  }
  
  /**
   * Returns Bethany Hamilton, a simple example of a second page to illustrate navigation.
   * @return Bethany Hamilton.
   */
  public static Result bethany() {
    return ok(bethany.render("Bethany Hamilton"));
    
  }
  
  /**
   * Returns Jake Marshall, a simple example of a second page to illustrate navigation.
   * @return Jake Marshall.
   */
  public static Result jake() {
    return ok(jake.render("Jake Marshall"));
    
  }
  /**
   * Returns Adriano de Souza, a simple example of a second page to illustrate navigation.
   * @return Adriano de Souza.
   */
  public static Result adriano() {
    return ok(adriano.render("Adriano de Souza"));
    
  }
  
  /**
   * Returns Kolohe Andino, a simple example of a second page to illustrate navigation.
   * @return Kolohe Andino.
   */
  public static Result koloheandino() {
    return ok(koloheandino.render("Kolohe Andino"));
    
  }
  
  /**
   * Returns the Stephanie Gilmore page
   * @return Stephanie Gilmore
   */
  public static Result stephanie() {
    return ok(Stephanie.render("Stephanie Gilmore"));
  }
}
