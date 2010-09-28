projectVersion.get match {
  case Some(v: BasicVersion) => {
    val newVersion = v.withExtra(None)
    log.info("Changing version to " + newVersion)
    projectVersion() = newVersion
    saveEnvironment()
  }
  case _ => ()
}

