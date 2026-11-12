package com.huami.bluetooth.profile.channel.module.sport;

import com.huami.proto.Phn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0004*\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNExerciseInfoMessageDto;", "Lcom/huami/proto/Phn$PHNExerciseInfoMessage;", "toPHNExerciseInfoMessage", "toPHNExerciseInfoMessageDto", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNResultMessageDto;", "", "startTime", "restDay", "Lcom/huami/proto/Phn$PHNResultMessage;", "toPHNResultMessage", "toPHNResultMessageDto", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class PHNModelKt {
    @NotNull
    public static final Phn.PHNExerciseInfoMessage toPHNExerciseInfoMessage(@NotNull PHNExerciseInfoMessageDto pHNExerciseInfoMessageDto) {
        Phn.PHNExerciseInfoMessage.Builder builderNewBuilder = Phn.PHNExerciseInfoMessage.newBuilder();
        if (pHNExerciseInfoMessageDto.getFlag_recommended_exercise() != null) {
            builderNewBuilder.setFlagRecommendedExercise(pHNExerciseInfoMessageDto.getFlag_recommended_exercise().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_lower_zone1() != null) {
            builderNewBuilder.setHrLowerZone1(pHNExerciseInfoMessageDto.getHr_lower_zone1().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_lower_zone2() != null) {
            builderNewBuilder.setHrLowerZone2(pHNExerciseInfoMessageDto.getHr_lower_zone2().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_lower_zone3() != null) {
            builderNewBuilder.setHrLowerZone3(pHNExerciseInfoMessageDto.getHr_lower_zone3().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_upper_zone1() != null) {
            builderNewBuilder.setHrUpperZone1(pHNExerciseInfoMessageDto.getHr_upper_zone1().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_upper_zone2() != null) {
            builderNewBuilder.setHrUpperZone2(pHNExerciseInfoMessageDto.getHr_upper_zone2().intValue());
        }
        if (pHNExerciseInfoMessageDto.getHr_upper_zone3() != null) {
            builderNewBuilder.setHrUpperZone3(pHNExerciseInfoMessageDto.getHr_upper_zone3().intValue());
        }
        if (pHNExerciseInfoMessageDto.getDuration_zone1() != null) {
            builderNewBuilder.setDurationZone1(pHNExerciseInfoMessageDto.getDuration_zone1().intValue());
        }
        if (pHNExerciseInfoMessageDto.getDuration_zone2() != null) {
            builderNewBuilder.setDurationZone2(pHNExerciseInfoMessageDto.getDuration_zone2().intValue());
        }
        if (pHNExerciseInfoMessageDto.getDuration_zone3() != null) {
            builderNewBuilder.setDurationZone3(pHNExerciseInfoMessageDto.getDuration_zone3().intValue());
        }
        return builderNewBuilder.build();
    }

    @NotNull
    public static final PHNExerciseInfoMessageDto toPHNExerciseInfoMessageDto(@NotNull Phn.PHNExerciseInfoMessage pHNExerciseInfoMessage) {
        return new PHNExerciseInfoMessageDto(pHNExerciseInfoMessage.hasFlagRecommendedExercise() ? Integer.valueOf(pHNExerciseInfoMessage.getFlagRecommendedExercise()) : null, pHNExerciseInfoMessage.hasHrLowerZone1() ? Integer.valueOf(pHNExerciseInfoMessage.getHrLowerZone1()) : null, pHNExerciseInfoMessage.hasHrUpperZone1() ? Integer.valueOf(pHNExerciseInfoMessage.getHrUpperZone1()) : null, pHNExerciseInfoMessage.hasHrLowerZone2() ? Integer.valueOf(pHNExerciseInfoMessage.getHrLowerZone2()) : null, pHNExerciseInfoMessage.hasHrUpperZone2() ? Integer.valueOf(pHNExerciseInfoMessage.getHrUpperZone2()) : null, pHNExerciseInfoMessage.hasHrLowerZone3() ? Integer.valueOf(pHNExerciseInfoMessage.getHrLowerZone3()) : null, pHNExerciseInfoMessage.hasHrUpperZone3() ? Integer.valueOf(pHNExerciseInfoMessage.getHrUpperZone3()) : null, pHNExerciseInfoMessage.hasDurationZone1() ? Integer.valueOf(pHNExerciseInfoMessage.getDurationZone1()) : null, pHNExerciseInfoMessage.hasDurationZone2() ? Integer.valueOf(pHNExerciseInfoMessage.getDurationZone2()) : null, pHNExerciseInfoMessage.hasDurationZone3() ? Integer.valueOf(pHNExerciseInfoMessage.getDurationZone3()) : null);
    }

    @NotNull
    public static final Phn.PHNResultMessage toPHNResultMessage(@NotNull PHNResultMessageDto pHNResultMessageDto, int i, int i2) {
        Phn.PHNResultMessage.Builder builderNewBuilder = Phn.PHNResultMessage.newBuilder();
        if (pHNResultMessageDto.getVersion() != null) {
            builderNewBuilder.setVersion(pHNResultMessageDto.getVersion());
        } else {
            builderNewBuilder.setVersion("1");
        }
        if (pHNResultMessageDto.getDaily_trimp_scores() != null) {
            builderNewBuilder.setDailyTrimpScores(pHNResultMessageDto.getDaily_trimp_scores().intValue());
        }
        if (pHNResultMessageDto.getMinutes_over_20m() != null) {
            builderNewBuilder.setMinutesOver20M(pHNResultMessageDto.getMinutes_over_20m().intValue());
        }
        if (pHNResultMessageDto.getTrimp_42_days() != null) {
            builderNewBuilder.addAllTrimp42Days(pHNResultMessageDto.getTrimp_42_days());
        }
        if (pHNResultMessageDto.getAtl_42_days() != null) {
            builderNewBuilder.addAllAtl42Days(pHNResultMessageDto.getAtl_42_days());
        }
        if (pHNResultMessageDto.getCtl_42_days() != null) {
            builderNewBuilder.addAllCtl42Days(pHNResultMessageDto.getCtl_42_days());
        }
        if (pHNResultMessageDto.getTsb_42_days() != null) {
            builderNewBuilder.addAllTsb42Days(pHNResultMessageDto.getTsb_42_days());
        }
        if (pHNResultMessageDto.getCurrent_weekday() != null) {
            builderNewBuilder.setCurrentWeekday(pHNResultMessageDto.getCurrent_weekday().intValue());
        }
        if (pHNResultMessageDto.getFlag_tsb_below_20_in_a_week() != null) {
            builderNewBuilder.setFlagTsbBelow20InAWeek(pHNResultMessageDto.getFlag_tsb_below_20_in_a_week().intValue());
        }
        if (pHNResultMessageDto.getFlag_tsb_below_20_in_10_days() != null) {
            builderNewBuilder.setFlagTsbBelow20In10Days(pHNResultMessageDto.getFlag_tsb_below_20_in_10_days().intValue());
        }
        if (pHNResultMessageDto.getFlag_tsb_below_20_ever() != null) {
            builderNewBuilder.setFlagTsbBelow20Ever(pHNResultMessageDto.getFlag_tsb_below_20_ever().intValue());
        }
        if (pHNResultMessageDto.getFlag_historical_trimp() != null) {
            builderNewBuilder.setFlagHistoricalTrimp(pHNResultMessageDto.getFlag_historical_trimp().intValue());
        }
        if (pHNResultMessageDto.getThelast_historical_trimp_ctl() != null) {
            builderNewBuilder.setThelastHistoricalTrimpCtl(pHNResultMessageDto.getThelast_historical_trimp_ctl().floatValue());
        }
        if (pHNResultMessageDto.getThelast_trimp_ctl_last_week() != null) {
            builderNewBuilder.setThelastHistoricalTrimpCtl(pHNResultMessageDto.getThelast_trimp_ctl_last_week().floatValue());
        }
        if (pHNResultMessageDto.getThelast_trimp_ctl_a_week_before_last_week() != null) {
            builderNewBuilder.setThelastTrimpCtlAWeekBeforeLastWeek(pHNResultMessageDto.getThelast_trimp_ctl_a_week_before_last_week().floatValue());
        }
        if (pHNResultMessageDto.getCount_daily_exercise() != null) {
            builderNewBuilder.setCountDailyExercise(pHNResultMessageDto.getCount_daily_exercise().intValue());
        }
        if (pHNResultMessageDto.getTrimp_weekly_recommend() != null) {
            builderNewBuilder.setTrimpWeeklyRecommend(pHNResultMessageDto.getTrimp_weekly_recommend().floatValue());
        }
        if (pHNResultMessageDto.getTrimp_daily_max() != null) {
            builderNewBuilder.setTrimpDailyMax(pHNResultMessageDto.getTrimp_daily_max().floatValue());
        }
        if (pHNResultMessageDto.getTrimp_daily_recommended() != null) {
            builderNewBuilder.setTrimpDailyRecommended(pHNResultMessageDto.getTrimp_daily_recommended().floatValue());
        }
        if (pHNResultMessageDto.getTrimp_week_completed() != null) {
            builderNewBuilder.setTrimpWeekCompleted(pHNResultMessageDto.getTrimp_week_completed().floatValue());
        }
        if (pHNResultMessageDto.getPercent_completed_week_trimp() != null) {
            builderNewBuilder.setPercentCompletedWeekTrimp(pHNResultMessageDto.getPercent_completed_week_trimp().intValue());
        }
        if (pHNResultMessageDto.getPercent_completed_daily_trimp() != null) {
            builderNewBuilder.setPercentCompletedDailyTrimp(pHNResultMessageDto.getPercent_completed_daily_trimp().intValue());
        }
        if (pHNResultMessageDto.getExercise_recommended_info() != null) {
            builderNewBuilder.setExerciseRecommendedInfo(toPHNExerciseInfoMessage(pHNResultMessageDto.getExercise_recommended_info()));
        }
        if (i >= 0) {
            builderNewBuilder.setPlanStartUtc0Time(i);
        }
        if (i2 >= 0) {
            builderNewBuilder.setRestDay(i2);
        }
        Integer last_update_time_zone = pHNResultMessageDto.getLast_update_time_zone();
        builderNewBuilder.setLastUpdateTimeZone(last_update_time_zone == null ? 0 : last_update_time_zone.intValue());
        Integer last_update_time = pHNResultMessageDto.getLast_update_time();
        builderNewBuilder.setLastUpdateTime(last_update_time != null ? last_update_time.intValue() : 0);
        return builderNewBuilder.build();
    }

    public static /* synthetic */ Phn.PHNResultMessage toPHNResultMessage$default(PHNResultMessageDto pHNResultMessageDto, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return toPHNResultMessage(pHNResultMessageDto, i, i2);
    }

    @NotNull
    public static final PHNResultMessageDto toPHNResultMessageDto(@NotNull Phn.PHNResultMessage pHNResultMessage) {
        return new PHNResultMessageDto(pHNResultMessage.hasVersion() ? pHNResultMessage.getVersion() : null, pHNResultMessage.hasDailyTrimpScores() ? Integer.valueOf(pHNResultMessage.getDailyTrimpScores()) : null, pHNResultMessage.hasMinutesOver20M() ? Integer.valueOf(pHNResultMessage.getMinutesOver20M()) : null, pHNResultMessage.getTrimp42DaysList(), pHNResultMessage.getAtl42DaysList(), pHNResultMessage.getCtl42DaysList(), pHNResultMessage.getTsb42DaysList(), pHNResultMessage.hasCurrentWeekday() ? Integer.valueOf(pHNResultMessage.getCurrentWeekday()) : null, pHNResultMessage.hasFlagTsbBelow20InAWeek() ? Integer.valueOf(pHNResultMessage.getFlagTsbBelow20InAWeek()) : null, pHNResultMessage.hasFlagTsbBelow20In10Days() ? Integer.valueOf(pHNResultMessage.getFlagTsbBelow20In10Days()) : null, pHNResultMessage.hasFlagTsbBelow20Ever() ? Integer.valueOf(pHNResultMessage.getFlagTsbBelow20Ever()) : null, pHNResultMessage.hasFlagHistoricalTrimp() ? Integer.valueOf(pHNResultMessage.getFlagHistoricalTrimp()) : null, pHNResultMessage.hasThelastHistoricalTrimpCtl() ? Float.valueOf(pHNResultMessage.getThelastHistoricalTrimpCtl()) : null, pHNResultMessage.hasThelastTrimpCtlLastWeek() ? Float.valueOf(pHNResultMessage.getThelastTrimpCtlLastWeek()) : null, pHNResultMessage.hasThelastTrimpCtlAWeekBeforeLastWeek() ? Float.valueOf(pHNResultMessage.getThelastTrimpCtlAWeekBeforeLastWeek()) : null, pHNResultMessage.hasCountDailyExercise() ? Integer.valueOf(pHNResultMessage.getCountDailyExercise()) : null, pHNResultMessage.hasTrimpWeeklyRecommend() ? Float.valueOf(pHNResultMessage.getTrimpWeeklyRecommend()) : null, pHNResultMessage.hasTrimpDailyMax() ? Float.valueOf(pHNResultMessage.getTrimpDailyMax()) : null, pHNResultMessage.hasTrimpDailyRecommended() ? Float.valueOf(pHNResultMessage.getTrimpDailyRecommended()) : null, pHNResultMessage.hasTrimpWeekCompleted() ? Float.valueOf(pHNResultMessage.getTrimpWeeklyRecommend()) : null, pHNResultMessage.hasPercentCompletedWeekTrimp() ? Integer.valueOf(pHNResultMessage.getPercentCompletedWeekTrimp()) : null, pHNResultMessage.hasPercentCompletedDailyTrimp() ? Integer.valueOf(pHNResultMessage.getPercentCompletedDailyTrimp()) : null, pHNResultMessage.hasExerciseRecommendedInfo() ? toPHNExerciseInfoMessageDto(pHNResultMessage.getExerciseRecommendedInfo()) : null, pHNResultMessage.hasLastUpdateTime() ? Integer.valueOf(pHNResultMessage.getLastUpdateTime()) : null, pHNResultMessage.hasLastUpdateTimeZone() ? Integer.valueOf(pHNResultMessage.getLastUpdateTimeZone()) : null);
    }
}
