package c22;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/m0;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23142a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/m0$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a() {
            f12.l.f68084a.getClass();
            f12.l lVar = new ht.c(f12.l.a.a()).f85466a;
            if (lVar.W2("key_heart_rate_alert_enabled_event", false)) {
                return;
            }
            Bundle bundleD = tn.k.d("Screen", "HeartRateAlerts", "Action", "HRAlertsEnabled");
            ht.a.f85464a.getClass();
            ht.a.a(bundleD, "UserAction");
            lVar.O2("key_heart_rate_alert_enabled_event", true);
        }

        private a() {
        }
    }
}
