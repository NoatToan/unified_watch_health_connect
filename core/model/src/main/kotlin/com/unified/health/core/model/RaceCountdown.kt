package com.unified.health.core.model

import java.time.LocalDate
import java.time.temporal.ChronoUnit

/**
 * "Còn N ngày" (N days left) countdown shown on a [Race] card (docs/DECISIONS.md D-1106), computed
 * from [Race.startDate]/`endDate` against [today] — a pure function (lives in `core/model` rather
 * than `core/domain` so `core/designsystem`'s `RaceCard`, which only depends on `core/model`, can
 * compute it directly) so the UI can re-evaluate it live without any clock baked into the card.
 */
sealed interface RaceCountdown {
    /** Strictly before [Race.startDate]: shows "Còn N ngày". */
    data class DaysUntilStart(val days: Long) : RaceCountdown

    /** On/after [Race.startDate] and on/before `endDate ?: startDate`: race weekend is happening now. */
    data object Ongoing : RaceCountdown

    /** After `endDate ?: startDate`. Repositories filter these out before they reach a card, but the
     *  UI can still fall back to a plain date if one ever slips through. */
    data object Past : RaceCountdown

    companion object {
        fun of(startDate: LocalDate, endDate: LocalDate?, today: LocalDate = LocalDate.now()): RaceCountdown {
            val effectiveEnd = endDate ?: startDate
            return when {
                today.isBefore(startDate) -> DaysUntilStart(ChronoUnit.DAYS.between(today, startDate))
                today.isAfter(effectiveEnd) -> Past
                else -> Ongoing
            }
        }
    }
}
