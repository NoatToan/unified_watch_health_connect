package n70;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln70/t5;", "", "Lbv/d;", "userPreferences", "Lf12/l;", "userSettings", "Lkn/e;", "getTodayLastActivityUseCase", "<init>", "(Lbv/d;Lf12/l;Lkn/e;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bv.d f124597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f124598b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124599a;

        static {
            int[] iArr = new int[o70.z.values().length];
            try {
                iArr[o70.z.DURING_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.z.AFTER_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.z.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.z.BEFORE_SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f124599a = iArr;
        }
    }

    static {
        new a(null);
    }

    public t5(bv.d dVar, f12.l lVar, kn.e eVar) {
        dVar.getClass();
        lVar.getClass();
        eVar.getClass();
        this.f124597a = dVar;
        this.f124598b = lVar;
    }

    public static Integer a(DateTime dateTime) {
        Minutes minutesMinutesBetween;
        Integer numValueOf = (dateTime == null || (minutesMinutesBetween = Minutes.minutesBetween(dateTime, DateTime.now(DateTimeZone.UTC))) == null) ? null : Integer.valueOf(minutesMinutesBetween.getMinutes());
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strG = androidx.room.a0.g(numValueOf, "SortKeyStatsItemsUseCase minutes elapsed since last activity ended: ");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strG);
        return numValueOf;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/t5$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
