// Copyright (C) 2015 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.googlesource.gerrit.plugins.ci.server.schema;

import org.eclipse.jgit.lib.Config;

import com.google.gerrit.extensions.annotations.PluginName;
import com.google.gerrit.server.config.PluginConfigFactory;
import com.google.gerrit.server.config.SitePaths;
import com.google.inject.Inject;

class H2 extends CiBaseDataSourceType {

  private final Config cfg;
  private final SitePaths site;

  @Inject
  H2(SitePaths site,
      PluginConfigFactory pluginConfig,
      @PluginName String pluginName) {
    super("org.h2.Driver");
    this.cfg = pluginConfig.getGlobalPluginConfig(pluginName);
    this.site = site;
  }

  @Override
  public String getUrl() {
    String database = cfg.getString("database", null, "database");
    if (database == null || database.isEmpty()) {
      database = "db/CiDB";
    }
    return "jdbc:h2:" + site.resolve(database).toUri().toString();
  }
}
