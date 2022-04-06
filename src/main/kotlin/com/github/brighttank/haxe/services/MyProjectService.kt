package com.github.brighttank.haxe.services

import com.intellij.openapi.project.Project
import com.github.brighttank.haxe.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
