workspace(name = "verify_status")

load("//:bazlets.bzl", "load_bazlets")

load_bazlets(
    commit = "8faa61d19d53cc125ac7fd51eb213a496ab14f8d",
    # local_path = "/home/<user>/projects/bazlets",
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
