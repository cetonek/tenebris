package com.github.cetonek.tenebris.services

import com.github.cetonek.tenebris.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
