package com.uvg.teamapp.ui
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uvg.teamapp.model.TeamMember

@Composable
fun TeamListScreen(members: List<TeamMember>) {
    LazyColumn {
        items(members) { member ->
            Text(
                text = member.name,
                modifier = Modifier.padding(16.dp) // un poco de espacio
            )
        }
    }
}
