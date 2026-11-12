package kd0;

import org.joda.time.Duration;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/y6;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k2;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y6 implements com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2 {
    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2
    public final Object a(t13.d<? super String> dVar) {
        long millis = Duration.standardDays(1L).getMillis();
        jw.c0 c0Var = new jw.c0(millis, millis);
        c0Var.e("https://connectapi.garmin.com/periodichealth-service/menstrualcycle/pregnancy/weightgoals");
        return c0Var.a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/y6$a;", "", "<init>", "()V", "", "PERIODIC_HEALTH_SERVICE_BASE_URL", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
