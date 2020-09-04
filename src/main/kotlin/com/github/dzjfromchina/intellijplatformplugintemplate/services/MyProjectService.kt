package com.github.dzjfromchina.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.dzjfromchina.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
