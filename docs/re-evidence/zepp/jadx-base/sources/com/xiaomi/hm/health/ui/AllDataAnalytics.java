package com.xiaomi.hm.health.ui;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataAnalytics;", "", "", "id", "", "extras", "", "recordEvent", "<init>", "()V", "EventId", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AllDataAnalytics {

    @NotNull
    public static final AllDataAnalytics INSTANCE = new AllDataAnalytics();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataAnalytics$EventId;", "", "", "ALL_DATA_PAGE_STEPS_C", "Ljava/lang/String;", "ALL_DATA_PAGE_CALORIES_C", "ALL_DATA_PAGE_PAI_C", "ALL_DATA_PAGE_EXERCISE_RECORD_C", "ALL_DATA_PAGE_SLEEP_C", "ALL_DATA_PAGE_HEARTRATE_C", "ALL_DATA_PAGE_BODYSCORE_C", "ALL_DATA_PAGE_VO2MAX_C", "ALL_DATA_PAGE_FEMALE_C", "ALL_DATA_PAGE_EXERCISE_CAPACITY_C", "ALL_DATA_PAGE_CHEST_C", "ALL_DATA_PAGE_WAIST_C", "ALL_DATA_PAGE_HIP_C", "ALL_DATA_PAGE_ARM_C", "ALL_DATA_PAGE_THIGH_C", "ALL_DATA_PAGE_CALF_C", "ALL_DATA_PAGE_WEIGHT_C", "ALL_DATA_PAGE_ECG_C", "ALL_DATA_PAGE_BLOOD_GLUCOSE_C", "ALL_DATA_PAGE_BLOOD_PRESSURE_C", "ALL_DATA_PAGE_BODY_TEMPERATURE_C", "ALL_DATA_PAGE_STRESS_C", "ALL_DATA_PAGE_SPO2_C", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class EventId {

        @NotNull
        public static final String ALL_DATA_PAGE_ARM_C = "ALLDATAPAGE_ARM_C";

        @NotNull
        public static final String ALL_DATA_PAGE_BLOOD_GLUCOSE_C = "ALLDATAPAGE_BLOODGLUCOSE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_BLOOD_PRESSURE_C = "ALLDATAPAGE_BLOODPRESSURE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_BODYSCORE_C = "ALLDATAPAGE_BODYSCORE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_BODY_TEMPERATURE_C = "ALLDATAPAGE_BODYTEMPERATURE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_CALF_C = "ALLDATAPAGE_CALF_C";

        @NotNull
        public static final String ALL_DATA_PAGE_CALORIES_C = "ALLDATAPAGE_CALORIES_C";

        @NotNull
        public static final String ALL_DATA_PAGE_CHEST_C = "ALLDATAPAGE_CHEST_C";

        @NotNull
        public static final String ALL_DATA_PAGE_ECG_C = "ALLDATAPAGE_ECG_C";

        @NotNull
        public static final String ALL_DATA_PAGE_EXERCISE_CAPACITY_C = "ALLDATAPAGE_EXERCISECAPACITY_C";

        @NotNull
        public static final String ALL_DATA_PAGE_EXERCISE_RECORD_C = "ALLDATAPAGE_EXERCISERECORD_C";

        @NotNull
        public static final String ALL_DATA_PAGE_FEMALE_C = "ALLDATAPAGE_FEMALE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_HEARTRATE_C = "ALLDATAPAGE_HEARTRATE_C";

        @NotNull
        public static final String ALL_DATA_PAGE_HIP_C = "ALLDATAPAGE_HIP_C";

        @NotNull
        public static final String ALL_DATA_PAGE_PAI_C = "ALLDATAPAGE_PAI_C";

        @NotNull
        public static final String ALL_DATA_PAGE_SLEEP_C = "ALLDATAPAGE_SLEEP_C";

        @NotNull
        public static final String ALL_DATA_PAGE_SPO2_C = "ALLDATAPAGE_SPO2_C";

        @NotNull
        public static final String ALL_DATA_PAGE_STEPS_C = "ALLDATAPAGE_STEPS_C";

        @NotNull
        public static final String ALL_DATA_PAGE_STRESS_C = "ALLDATAPAGE_STRESS_C";

        @NotNull
        public static final String ALL_DATA_PAGE_THIGH_C = "ALLDATAPAGE_THIGH_C";

        @NotNull
        public static final String ALL_DATA_PAGE_VO2MAX_C = "ALLDATAPAGE_VO2MAX_C";

        @NotNull
        public static final String ALL_DATA_PAGE_WAIST_C = "ALLDATAPAGE_WAIST_C";

        @NotNull
        public static final String ALL_DATA_PAGE_WEIGHT_C = "ALLDATAPAGE_WEIGHT_C";

        @NotNull
        public static final EventId INSTANCE = new EventId();

        private EventId() {
        }
    }

    private AllDataAnalytics() {
    }

    @JvmStatic
    public static final void recordEvent(@NotNull String id, @NotNull Map<String, String> extras) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(id);
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            countEventBuilder.addExtra(entry.getKey(), entry.getValue());
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static /* synthetic */ void recordEvent$default(String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = r.emptyMap();
        }
        recordEvent(str, map);
    }
}
