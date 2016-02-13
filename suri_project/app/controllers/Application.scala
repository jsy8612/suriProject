package controllers

import play.api.mvc._
import play.api.db._
import play.api.Play.current

object Application extends Controller {

//  DB 연결 테스트
//  def index = Action {
//    var outString = "Number is "
//    val conn = DB.getConnection()
//    try {
//      val stmt = conn.createStatement
//      val rs = stmt.executeQuery("SELECT 9 AS COL2 FROM DUAL")
//      while (rs.next()) {
//        outString += rs.getString("COL2")
//      }
//    } finally {
//      conn.close()
//    }
//    Ok(outString)
//  }

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  def main = Action { implicit request =>
    Ok(views.html.main())
  }

}