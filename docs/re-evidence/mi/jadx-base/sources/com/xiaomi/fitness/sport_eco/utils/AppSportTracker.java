package com.xiaomi.fitness.sport_eco.utils;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.sport_eco.bean.LaunchSportTrackBean;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/AppSportTracker;", "", "<init>", "()V", "appLaunchSportTrack", "", "request", "Lcom/xiaomi/fitness/sport_eco/bean/LaunchSportTrackBean;", "appFinishSportTrack", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppSportTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AppSportTracker instance = new AppSportTracker();

    @NotNull
    private static final String startTip = "56.46.1.1.19517";

    @NotNull
    private static final String finishTip = "56.12.1.1.19518";

    @NotNull
    private static final String TIP = "tip";

    @NotNull
    private static final String EVENT_NAME = RelativeCareConstants.RELATIVE_CARE_EVENT_V3;

    @NotNull
    private static final String NAME = "name";

    @NotNull
    private static final String EXERCISE_TYPE_DETAIL = "exercise_type_detail";

    @NotNull
    private static final String SOURCE = "source";

    @NotNull
    private static final String IS_GPS = "is_GPS";

    @NotNull
    private static final String DEVICE_MODEL = "device_model";

    @NotNull
    private static final String INSTRUMENT_MODEL = "instrument_model";

    @NotNull
    private static final String TARGET_TYPE = "target_type";

    @NotNull
    private static final String TARGET_VALUE = "target_value";

    @NotNull
    private static final String TEMPO_AVG = "tempo_avg";

    @NotNull
    private static final String IS_DISPLAY = "is_display";

    @NotNull
    private static final String IS_LIGHTEN = "is_lighten";

    @NotNull
    private static final String IS_AUTO = "is_auto";

    @NotNull
    private static final String IS_VOICE = "is_voice";

    @NotNull
    private static final String IS_REMIND = "is_remind";

    @NotNull
    private static final String SPEED_REMIND = "speed_remind";

    @NotNull
    private static final String TYPE_STR = "type_str";

    @NotNull
    private static final String RESULT = "result";

    @NotNull
    private static final String ERROR_INFO = "error_info";

    @NotNull
    private static final String DURATION_MIN = "duration_min";

    @NotNull
    private static final String DISTANCE = "distance";

    @NotNull
    private static final String TARGET_COMPLETENESS = "target_completeness";

    @NotNull
    private static final String COUNT = "count";

    @NotNull
    private static final String EXERCISE_RESULT_PAGE = "exercise_result_page";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b7\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000bR\u0014\u0010\u001e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000bR\u0014\u0010$\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0014\u0010&\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000bR\u0014\u0010(\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u0014\u0010,\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000bR\u0014\u0010.\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000bR\u0014\u00100\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u0014\u00102\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u000bR\u0014\u00104\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u000bR\u0014\u00106\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000bR\u0014\u00108\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000bR\u0014\u0010:\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000bR\u0014\u0010<\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000bR\u0014\u0010>\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u000b¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/AppSportTracker$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/sport_eco/utils/AppSportTracker;", "getInstance", "()Lcom/xiaomi/fitness/sport_eco/utils/AppSportTracker;", "startTip", "", "getStartTip", "()Ljava/lang/String;", "finishTip", "getFinishTip", "TIP", "getTIP", "EVENT_NAME", "getEVENT_NAME", "NAME", "getNAME", "EXERCISE_TYPE_DETAIL", "getEXERCISE_TYPE_DETAIL", "SOURCE", "getSOURCE", "IS_GPS", "getIS_GPS", "DEVICE_MODEL", "getDEVICE_MODEL", "INSTRUMENT_MODEL", "getINSTRUMENT_MODEL", "TARGET_TYPE", "getTARGET_TYPE", "TARGET_VALUE", "getTARGET_VALUE", "TEMPO_AVG", "getTEMPO_AVG", "IS_DISPLAY", "getIS_DISPLAY", "IS_LIGHTEN", "getIS_LIGHTEN", "IS_AUTO", "getIS_AUTO", "IS_VOICE", "getIS_VOICE", "IS_REMIND", "getIS_REMIND", "SPEED_REMIND", "getSPEED_REMIND", "TYPE_STR", "getTYPE_STR", "RESULT", "getRESULT", "ERROR_INFO", "getERROR_INFO", "DURATION_MIN", "getDURATION_MIN", "DISTANCE", "getDISTANCE", "TARGET_COMPLETENESS", "getTARGET_COMPLETENESS", "COUNT", "getCOUNT", "EXERCISE_RESULT_PAGE", "getEXERCISE_RESULT_PAGE", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getCOUNT() {
            return AppSportTracker.COUNT;
        }

        @NotNull
        public final String getDEVICE_MODEL() {
            return AppSportTracker.DEVICE_MODEL;
        }

        @NotNull
        public final String getDISTANCE() {
            return AppSportTracker.DISTANCE;
        }

        @NotNull
        public final String getDURATION_MIN() {
            return AppSportTracker.DURATION_MIN;
        }

        @NotNull
        public final String getERROR_INFO() {
            return AppSportTracker.ERROR_INFO;
        }

        @NotNull
        public final String getEVENT_NAME() {
            return AppSportTracker.EVENT_NAME;
        }

        @NotNull
        public final String getEXERCISE_RESULT_PAGE() {
            return AppSportTracker.EXERCISE_RESULT_PAGE;
        }

        @NotNull
        public final String getEXERCISE_TYPE_DETAIL() {
            return AppSportTracker.EXERCISE_TYPE_DETAIL;
        }

        @NotNull
        public final String getFinishTip() {
            return AppSportTracker.finishTip;
        }

        @NotNull
        public final String getINSTRUMENT_MODEL() {
            return AppSportTracker.INSTRUMENT_MODEL;
        }

        @NotNull
        public final String getIS_AUTO() {
            return AppSportTracker.IS_AUTO;
        }

        @NotNull
        public final String getIS_DISPLAY() {
            return AppSportTracker.IS_DISPLAY;
        }

        @NotNull
        public final String getIS_GPS() {
            return AppSportTracker.IS_GPS;
        }

        @NotNull
        public final String getIS_LIGHTEN() {
            return AppSportTracker.IS_LIGHTEN;
        }

        @NotNull
        public final String getIS_REMIND() {
            return AppSportTracker.IS_REMIND;
        }

        @NotNull
        public final String getIS_VOICE() {
            return AppSportTracker.IS_VOICE;
        }

        @NotNull
        public final AppSportTracker getInstance() {
            return AppSportTracker.instance;
        }

        @NotNull
        public final String getNAME() {
            return AppSportTracker.NAME;
        }

        @NotNull
        public final String getRESULT() {
            return AppSportTracker.RESULT;
        }

        @NotNull
        public final String getSOURCE() {
            return AppSportTracker.SOURCE;
        }

        @NotNull
        public final String getSPEED_REMIND() {
            return AppSportTracker.SPEED_REMIND;
        }

        @NotNull
        public final String getStartTip() {
            return AppSportTracker.startTip;
        }

        @NotNull
        public final String getTARGET_COMPLETENESS() {
            return AppSportTracker.TARGET_COMPLETENESS;
        }

        @NotNull
        public final String getTARGET_TYPE() {
            return AppSportTracker.TARGET_TYPE;
        }

        @NotNull
        public final String getTARGET_VALUE() {
            return AppSportTracker.TARGET_VALUE;
        }

        @NotNull
        public final String getTEMPO_AVG() {
            return AppSportTracker.TEMPO_AVG;
        }

        @NotNull
        public final String getTIP() {
            return AppSportTracker.TIP;
        }

        @NotNull
        public final String getTYPE_STR() {
            return AppSportTracker.TYPE_STR;
        }
    }

    private AppSportTracker() {
    }

    public final void appFinishSportTrack(@NotNull LaunchSportTrackBean request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(TIP, finishTip);
        linkedHashMap.put(NAME, request.getName());
        linkedHashMap.put(RESULT, request.getResult());
        linkedHashMap.put(ERROR_INFO, request.getErrorInfo());
        linkedHashMap.put(EXERCISE_TYPE_DETAIL, request.getExerciseTypeDetail());
        linkedHashMap.put(DURATION_MIN, request.getDurationMin());
        linkedHashMap.put(DISTANCE, request.getDistance());
        linkedHashMap.put(TARGET_COMPLETENESS, request.getTargetCompleteness());
        linkedHashMap.put(DEVICE_MODEL, request.getDeviceModel());
        linkedHashMap.put(INSTRUMENT_MODEL, request.getInstrumentModel());
        linkedHashMap.put(COUNT, request.getCount());
        linkedHashMap.put(TEMPO_AVG, request.getTempoAvg());
        linkedHashMap.put(IS_DISPLAY, request.getIsDisplay());
        linkedHashMap.put(IS_LIGHTEN, request.getIsLighten());
        linkedHashMap.put(IS_AUTO, request.getIsAuto());
        linkedHashMap.put(IS_VOICE, request.getIsVoice());
        linkedHashMap.put(IS_REMIND, request.getIsRemind());
        linkedHashMap.put(SPEED_REMIND, request.getSpeedRemind());
        linkedHashMap.put(TYPE_STR, request.getTypeStr());
        linkedHashMap.put(EXERCISE_RESULT_PAGE, request.getExerciseResultPage());
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(EVENT_NAME, linkedHashMap);
    }

    public final void appLaunchSportTrack(@NotNull LaunchSportTrackBean request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(TIP, startTip);
        linkedHashMap.put(NAME, request.getName());
        linkedHashMap.put(EXERCISE_TYPE_DETAIL, request.getExerciseTypeDetail());
        linkedHashMap.put(SOURCE, request.getSource());
        linkedHashMap.put(IS_GPS, request.getIsGPS());
        linkedHashMap.put(DEVICE_MODEL, request.getDeviceModel());
        linkedHashMap.put(INSTRUMENT_MODEL, request.getInstrumentModel());
        linkedHashMap.put(TARGET_TYPE, request.getTargetType());
        linkedHashMap.put(TARGET_VALUE, request.getTargetValue());
        linkedHashMap.put(TEMPO_AVG, request.getTempoAvg());
        linkedHashMap.put(IS_DISPLAY, request.getIsDisplay());
        linkedHashMap.put(IS_LIGHTEN, request.getIsLighten());
        linkedHashMap.put(IS_AUTO, request.getIsAuto());
        linkedHashMap.put(IS_VOICE, request.getIsVoice());
        linkedHashMap.put(IS_REMIND, request.getIsRemind());
        linkedHashMap.put(SPEED_REMIND, request.getSpeedRemind());
        linkedHashMap.put(TYPE_STR, request.getTypeStr());
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(EVENT_NAME, linkedHashMap);
    }
}
