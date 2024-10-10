package com.lab.taskzen.dto

import java.util.UUID

data class TaskDTO(
    val idTask: UUID,
    val title: String,
    val description: String
)