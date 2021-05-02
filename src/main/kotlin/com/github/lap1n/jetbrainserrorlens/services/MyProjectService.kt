package com.github.lap1n.jetbrainserrorlens.services

import com.github.lap1n.jetbrainserrorlens.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
