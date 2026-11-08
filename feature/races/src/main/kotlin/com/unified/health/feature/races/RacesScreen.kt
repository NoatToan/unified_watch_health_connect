package com.unified.health.feature.races

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RaceCard
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.util.launchInCustomTab
import com.unified.health.core.domain.repository.RacesState

@Composable
internal fun RacesRoute(onBack: () -> Unit, viewModel: RacesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    RacesScreen(state = state, isRefreshing = refreshing, onRefresh = viewModel::refresh, onBack = onBack)
}

/**
 * Full "Giải chạy sắp tới" list (docs/DECISIONS.md D-1105): every upcoming race sorted by date
 * (already done by [com.unified.health.core.domain.repository.RacesRepository]), using the exact
 * same [RaceCard] as Home's carousel. Unlike Home — which hides its section entirely on
 * [RacesState.Empty]/[RacesState.Error] — this screen shows them, since the user navigated here on
 * purpose and a silent blank screen would look broken.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun RacesScreen(state: RacesState, isRefreshing: Boolean, onRefresh: () -> Unit, onBack: () -> Unit) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Giải chạy sắp tới") },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } },
            )
        },
    ) { padding ->
        when (state) {
            RacesState.Loading -> LoadingState(Modifier.padding(padding))
            is RacesState.Error -> ErrorState(state.message, Modifier.padding(padding), onRetry = onRefresh)
            RacesState.Empty -> EmptyState(
                title = "Chưa có giải chạy nào",
                message = "Dữ liệu giải chạy đang được cập nhật, quay lại sau nhé.",
                modifier = Modifier.padding(padding),
                actionLabel = "Thử lại",
                onAction = onRefresh,
            )
            is RacesState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize().padding(padding),
            ) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize().testTag("races_list"),
                    contentPadding = PaddingValues(Spacing.lg),
                    verticalArrangement = Arrangement.spacedBy(Spacing.md),
                ) {
                    items(state.races, key = { it.id }) { race ->
                        RaceCard(
                            race = race,
                            onClick = { launchInCustomTab(context, race.registrationUrl) },
                            modifier = Modifier.fillMaxWidth().testTag("race_card_${race.id}"),
                        )
                    }
                }
            }
        }
    }
}
