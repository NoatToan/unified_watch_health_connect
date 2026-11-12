package com.xiaomi.fitness.health.sleep.utils;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.OneTrack;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\tJ\u000e\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020$2\u0006\u0010'\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0005J\u0006\u00103\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u00105\u001a\u00020\u0005J\u000e\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0007J\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09J\u0006\u0010<\u001a\u00020\u0005R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepTrackHelper;", "", "<init>", "()V", "trackSleepEvaluationCard", "", "accurateStatus", "", "score", "", "trackSleepScoreIconClick", "trackOpenAssistClick", "trackOpenAssistSuccessByGuide", "trackSleepLandDetailActivityOrigin", "twoTapAction", "trackShowReasonableRange", "openStatus", "trackLandChartItemClick", "type", "trackSleepDayItemClick", "trackSleepSettingItemClick", "trackSleepGoalValue", "value", "trackSleepAnimalCardClick", "trackSleepGuideBuy", "trackSleepCollectDialogExposeOrClick", "clickEvent", "trackSleepAnimalReportPageExpose", "animalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "trackSleepAnimalReportHistoryClick", "trackSleepAnimalReportShareClick", "trackSleepAnimalReportUnderstandAnimalClick", "trackSleepAnimalReportCollectDetailClick", "trackSleepAnimalUnderstandDeviceSleepClick", "buildSleepAnimalUnderstandDeviceExposeTag", "Lcom/example/statistics/export/TrackContentBean;", "buildSleepWeekMonthRegularCardExpose", "week", "pagerOffset", "trackSleepScoreClick", "trackSleepDurationCardQuestionClick", "trackSleepDurationCardClick", "getSleepRhythmCardExposeContent", "trackSleepRhythmCardClick", "trackSleepRhythmLandingPageExpose", "hasRhythm", "trackSleepRhythmOpenClick", "trackSleepRhythmEndClick", "trackSleepDailyRecordClick", "trackSleepRhythmCalendarClick", "trackSleepRhythmAllRecordEntranceClick", "trackSleepRhythmRecordButtonClick", "trackSleepRhythmCalendarMenuMoreClick", "trackSleepRhythmDairyRemindClick", "enable", "sleepWmTrackRecordSharedSet", "", "", "getSleepWmSharedTrackRecordSharedSet", "clearSleepWmSharedTrackRecordSharedSet", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTrackHelper {

    @NotNull
    public static final SleepTrackHelper INSTANCE = new SleepTrackHelper();

    @NotNull
    private static final Set<String> sleepWmTrackRecordSharedSet = new LinkedHashSet();

    private SleepTrackHelper() {
    }

    @NotNull
    public final TrackContentBean buildSleepAnimalUnderstandDeviceExposeTag() {
        return new TrackContentBean("sleep_animal_understand", false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "sleep_animal_detail_know"), TuplesKt.to("tip", "56.75.1.1.32610")), 1.0f);
    }

    @NotNull
    public final TrackContentBean buildSleepWeekMonthRegularCardExpose(boolean week, int pagerOffset) {
        String str = "sleep_distribution_card_" + (week ? "week" : "month") + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + pagerOffset;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("name", "sleep_distribution_card");
        pairArr[1] = TuplesKt.to("tip", "56.75.1.1.33070");
        pairArr[2] = TuplesKt.to("page_fragment", week ? "week" : "month");
        return new TrackContentBean(str, false, "expose_v3", MapsKt__MapsKt.mapOf(pairArr), 0.05f);
    }

    public final void clearSleepWmSharedTrackRecordSharedSet() {
        sleepWmTrackRecordSharedSet.clear();
    }

    @NotNull
    public final TrackContentBean getSleepRhythmCardExposeContent(int pagerOffset) {
        return new TrackContentBean("sleep_rhythm_disorders_card_day_" + pagerOffset, false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "sleep_rhythm_disorders_card"), TuplesKt.to("tip", "56.37.3.1.35874")), 0.9f);
    }

    @NotNull
    public final Set<String> getSleepWmSharedTrackRecordSharedSet() {
        return sleepWmTrackRecordSharedSet;
    }

    public final void trackLandChartItemClick(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.37.0.1.29649"), TuplesKt.to("btn_id", Integer.valueOf(type))));
    }

    public final void trackOpenAssistClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsJVMKt.mapOf(TuplesKt.to("tip", "56.37.0.1.29625")));
    }

    public final void trackOpenAssistSuccessByGuide() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsJVMKt.mapOf(TuplesKt.to("tip", "56.37.0.1.29627")));
    }

    public final void trackShowReasonableRange(boolean openStatus) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("tip", "56.37.0.1.29628");
        pairArr[1] = TuplesKt.to("status", Integer.valueOf(openStatus ? 1 : 2));
        oneTrackExtKt.reportData("c_pa_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepAnimalCardClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32601"), TuplesKt.to("name", "sleep_animal_card")));
    }

    public final void trackSleepAnimalReportCollectDetailClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32609"), TuplesKt.to("name", "sleep_animal_detail_i")));
    }

    public final void trackSleepAnimalReportHistoryClick(@Nullable SleepAnimalReport animalReport) {
        boolean z = (animalReport != null ? animalReport.getAnimal() : null) != null;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.75.1.1.32606");
        pairArr[1] = TuplesKt.to("name", "sleep_animal_history_btn");
        pairArr[2] = TuplesKt.to("type", Integer.valueOf(z ? 1 : 2));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepAnimalReportPageExpose(@Nullable SleepAnimalReport animalReport) {
        AnimalInfo animal;
        int i = 1;
        boolean z = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() != 0;
        boolean z2 = (animalReport != null ? animalReport.getAnimal() : null) != null;
        int type = (animalReport == null || (animal = animalReport.getAnimal()) == null) ? 0 : animal.getType();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.75.1.1.32605");
        pairArr[1] = TuplesKt.to("name", "sleep_animal_detail");
        if (!z) {
            i = 3;
        } else if (!z2) {
            i = 2;
        }
        pairArr[2] = TuplesKt.to("type", Integer.valueOf(i));
        pairArr[3] = TuplesKt.to("animal_name", String.valueOf(type));
        oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepAnimalReportShareClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32607"), TuplesKt.to("name", "sleep_animal_detail_share")));
    }

    public final void trackSleepAnimalReportUnderstandAnimalClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32608"), TuplesKt.to("name", "sleep_animal_detail_more")));
    }

    public final void trackSleepAnimalUnderstandDeviceSleepClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32611"), TuplesKt.to("name", "sleep_animal_detail_know")));
    }

    public final void trackSleepCollectDialogExposeOrClick(boolean clickEvent) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        String str = clickEvent ? "click_v3" : "expose_v3";
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("tip", clickEvent ? "56.75.1.1.32604" : "56.75.1.1.32603");
        pairArr[1] = TuplesKt.to("name", "data_missing_card");
        oneTrackExtKt.reportData(str, MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepDailyRecordClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35879"), TuplesKt.to("name", "sleep_diary_button")));
    }

    public final void trackSleepDayItemClick(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.37.0.1.29663"), TuplesKt.to("btn_id", Integer.valueOf(type))));
    }

    public final void trackSleepDurationCardClick(boolean week) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.75.1.1.32614");
        pairArr[1] = TuplesKt.to("name", "sleep_duration_card");
        pairArr[2] = TuplesKt.to("page_fragment", week ? "week" : "month");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepDurationCardQuestionClick(boolean week) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.75.1.1.32613");
        pairArr[1] = TuplesKt.to("name", "sleep_duration_i_btn");
        pairArr[2] = TuplesKt.to("page_fragment", week ? "week" : "month");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepEvaluationCard(boolean accurateStatus, int score) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tip", "56.37.0.1.29623");
        linkedHashMap.put(OneTrack.Param.ELEMENT_NAME, Integer.valueOf(accurateStatus ? 2 : 1));
        linkedHashMap.put("target_value", Integer.valueOf(score));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.toMap(linkedHashMap));
    }

    public final void trackSleepGoalValue(int value) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.36.0.1.29658"), TuplesKt.to("target_value", Integer.valueOf(value))));
    }

    public final void trackSleepGuideBuy() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.75.1.1.32602"), TuplesKt.to("name", "purchase_guidance_card")));
    }

    public final void trackSleepLandDetailActivityOrigin(boolean twoTapAction) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("tip", "56.37.0.1.29626");
        pairArr[1] = TuplesKt.to("origin", Integer.valueOf(twoTapAction ? 1 : 2));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepRhythmAllRecordEntranceClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35883"), TuplesKt.to("name", "sleep_rhythm_disorders_data")));
    }

    public final void trackSleepRhythmCalendarClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35881"), TuplesKt.to("name", "sleep_calendar")));
    }

    public final void trackSleepRhythmCalendarMenuMoreClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35931"), TuplesKt.to("name", "sleep_rhythm_disorders_card_detail_more")));
    }

    public final void trackSleepRhythmCardClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.37.0.1.35875"), TuplesKt.to("name", "sleep_rhythm_disorders_card")));
    }

    public final void trackSleepRhythmDairyRemindClick(boolean enable) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.84.0.1.35932");
        pairArr[1] = TuplesKt.to("name", "sleep_rhythm_disorders_card_detail_more_button");
        pairArr[2] = TuplesKt.to("type", Integer.valueOf(enable ? 1 : 2));
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepRhythmEndClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35878"), TuplesKt.to("name", "sleep_rhythm_disorders_stop")));
    }

    public final void trackSleepRhythmLandingPageExpose(boolean hasRhythm) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.84.0.1.35876");
        pairArr[1] = TuplesKt.to("name", "sleep_rhythm_disorders_card_detail");
        pairArr[2] = TuplesKt.to("type", Integer.valueOf(hasRhythm ? 1 : 2));
        oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepRhythmOpenClick(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.84.0.1.35877"), TuplesKt.to("name", "sleep_rhythm_disorders_start"), TuplesKt.to("type", Integer.valueOf(type))));
    }

    public final void trackSleepRhythmRecordButtonClick(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.86.0.1.35930"), TuplesKt.to("name", "sleep_rhythm_disorders_data_tabulation_button"), TuplesKt.to("type", Integer.valueOf(type))));
    }

    public final void trackSleepScoreClick(boolean week) {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.75.1.1.32612");
        pairArr[1] = TuplesKt.to("name", "sleep_quality_card");
        pairArr[2] = TuplesKt.to("page_fragment", week ? "week" : "month");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    public final void trackSleepScoreIconClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsJVMKt.mapOf(TuplesKt.to("tip", "56.37.0.1.29624")));
    }

    public final void trackSleepSettingItemClick(int type) {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.36.0.1.29653"), TuplesKt.to("btn_id", Integer.valueOf(type))));
    }
}
