publishTo := {
    val corporateRepo = "http://maven-repo.mfms/"
    if (isSnapshot.value)
        Some("snapshots" at corporateRepo + "nexus/content/repositories/mfmd-snapshot/")
    else
        Some("releases" at corporateRepo + "nexus/content/repositories/mfmd-release/")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
