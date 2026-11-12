package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz10/l0;", "", "", "dismissPersistKey", "", "showDataStorageOptOut", "showAccountSuspended", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum l0 {
    DEVICE_SETTINGS("device_settings", true, true),
    CALENDAR("calendar", true, true),
    INSIGHTS("insights", true, true),
    SEGMENTS("segments", true, true),
    /* JADX INFO: Fake field, exist only in values array */
    GEAR("gear", true, true),
    APP_SETTINGS("app_settings", false, true),
    PARTNER_APPS("partner_apps", false, true),
    DATA_CONSENT("data_consent", false, true),
    USER_DEVICES("user-devices", false, true),
    CHALLENGES("challenges", false, true),
    DAILY_SUMMARY("daily-summary", false, true),
    ACTIVITIES("activities", false, true),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY_DETAILS("activity-details", false, true),
    HEALTH_STATS("health-stats", false, true),
    ECG("ecg", true, true),
    /* JADX INFO: Fake field, exist only in values array */
    PERSONAL_RECORD("personal-records", false, true),
    /* JADX INFO: Fake field, exist only in values array */
    REPORTS("reports", false, true),
    /* JADX INFO: Fake field, exist only in values array */
    BADGES("badges", false, true);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f201102d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201119c;

    l0(String str, boolean z14, boolean z15) {
        this.f201117a = str;
        this.f201118b = z14;
        this.f201119c = z15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/l0$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
