workspace(name = "verify_status")

load("//:bazlets.bzl", "load_bazlets")

load_bazlets(
    commit = "d4e586bd341207f0b8aafcbe7dbcd4843f852826",
    #local_path = "/home/<user>/projects/bazlets",
)

# Snapshot Plugin API
#load(
#    "@com_googlesource_gerrit_bazlets//:gerrit_api_maven_local.bzl",
#    "gerrit_api_maven_local",
#)

# Release Plugin API
load(
    "@com_googlesource_gerrit_bazlets//:gerrit_api.bzl",
    "gerrit_api",
)
load(
    "@com_googlesource_gerrit_bazlets//:gerrit_gwt.bzl",
    "gerrit_gwt",
)

# Load release Plugin API
gerrit_api()

# Load snapshot Plugin API
#gerrit_api_maven_local()

gerrit_gwt()

load("@com_googlesource_gerrit_bazlets//tools:maven_jar.bzl", "maven_jar")
