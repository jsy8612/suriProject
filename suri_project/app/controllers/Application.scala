package controllers

import play.api._
import play.api.mvc._
import play.api.db._
import play.api.Play.current

object Application extends Controller {

  def index = Action {
    var outString = "Number is "
    val conn = DB.getConnection()
    try {
      val stmt = conn.createStatement
      val rs = stmt.executeQuery("SELECT COL2 FROM TEST_TABLE ")
      while (rs.next()) {
        outString += rs.getString("COL2")
      }
    } finally {
      conn.close()
    }
    Ok(outString)
  }

//  def index = Action { implicit request =>
//    Ok(views.html.index())
//  }

  def main = Action { implicit request =>
    Ok(views.html.main())
  }

}