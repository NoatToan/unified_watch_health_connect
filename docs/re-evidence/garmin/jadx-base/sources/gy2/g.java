package gy2;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgy2/g;", "", "", "number", "", "value", "", "isFitFile", "<init>", "(Ljava/lang/String;IILjava/lang/String;Z)V", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum g {
    /* JADX INFO: Fake field, exist only in values array */
    SCHEDULES(0, "schedules", true),
    SETTINGS(1, "settings", true),
    /* JADX INFO: Fake field, exist only in values array */
    GOALS(2, "goals", true),
    WORKOUTS(3, "workouts", true),
    COURSES(4, "courses", false),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITIES(5, "activities", true),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONAL_RECORDS(6, "personal-records", true),
    UNKNOWN_TYPE(7, "unknown_type", false),
    SOFTWARE_UPDATE(8, "software-update", false),
    DEVICE_SETTINGS(9, "device-settings", true),
    /* JADX INFO: Fake field, exist only in values array */
    LANGUAGE_SETTINGS(10, "language-settings", true),
    /* JADX INFO: Fake field, exist only in values array */
    USER_PROFILE(11, "user-profile", true),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS(12, "sports", true),
    /* JADX INFO: Fake field, exist only in values array */
    SEGMENT_LEADERS(13, "segment-leaders", true),
    GOLF_CLUB(14, "golf_club", false),
    /* JADX INFO: Fake field, exist only in values array */
    WELLNESS_DEVICE_CCF(15, "wellness_device_info", true),
    /* JADX INFO: Fake field, exist only in values array */
    WELLNESS_DEVICE_CCF(16, "wellness_device_ccf", true),
    INSTALL_APP(17, "install_app", false),
    /* JADX INFO: Fake field, exist only in values array */
    CHECK_BACK(18, "check_back", true),
    /* JADX INFO: Fake field, exist only in values array */
    TRUE_UP(19, "true_up", true),
    SETTINGS_CHANGE(20, "settings-change", true),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY_SUMMARY(21, "activity-summary", true),
    /* JADX INFO: Fake field, exist only in values array */
    METRICS_FILE(22, "metrics-file", false),
    /* JADX INFO: Fake field, exist only in values array */
    PACE_BAND(23, "pace-band", true),
    /* JADX INFO: Fake field, exist only in values array */
    SPORT_BACKUP(24, "sports-backup", true),
    /* JADX INFO: Fake field, exist only in values array */
    ULF_CONFIG(25, "ulfconfig", false),
    /* JADX INFO: Fake field, exist only in values array */
    SLEEP(26, "sleep", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXERCISE_BENCHMARK(27, "exercise-benchmark", true),
    /* JADX INFO: Fake field, exist only in values array */
    POWER_GUIDANCE(28, "power-guidance", true),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTING_EVENT(29, "sporting-event", true),
    /* JADX INFO: Fake field, exist only in values array */
    ACTUAL_STEP_RECORDING_CONFIGURATION(30, "actual-step-recording-configuration", false),
    /* JADX INFO: Fake field, exist only in values array */
    LHA_BACKUP(31, "lha-backup", false),
    /* JADX INFO: Fake field, exist only in values array */
    BBI_RECORDING_CONFIGURATION(32, "bbi-recording-configuration", false),
    /* JADX INFO: Fake field, exist only in values array */
    HRV_STATUS(36, "hrv-status", false),
    /* JADX INFO: Fake field, exist only in values array */
    UNINSTALL_APP(39, "uninstall_app", false);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f80311d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f80312e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashMap f80313f = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80326c;

    static {
        for (g gVar : values()) {
            f80312e.put(gVar.f80325b, gVar);
            f80313f.put(Integer.valueOf(gVar.f80324a), gVar);
        }
    }

    g(int i14, String str, boolean z14) {
        this.f80324a = i14;
        this.f80325b = str;
        this.f80326c = z14;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lgy2/g$a;", "", "<init>", "()V", "", "", "Lgy2/g;", "lookup", "Ljava/util/Map;", "", "lookupByName", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
