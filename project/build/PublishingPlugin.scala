import sbt._

trait PublishingPlugin extends BasicScalaProject {
  override def publishAction = task { log.info("Publishing..."); None }
}
