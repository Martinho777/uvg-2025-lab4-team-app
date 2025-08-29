package com.example.teamapp.data

import com.example.teamapp.model.TeamMember

interface TeamRepository {
    fun getTeam(): List<TeamMember>
}

class FakeTeamRepository : TeamRepository {
    override fun getTeam(): List<TeamMember> = listOf(
        TeamMember("Esteban", "Android dev y fan de Compose."),
        TeamMember("Martin", "Líder de pruebas y QA."),
        TeamMember("Alejandro", "Diseño UI/UX y accesibilidad."),
    )
}