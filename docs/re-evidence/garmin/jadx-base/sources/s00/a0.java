package s00;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.healthstatus.presentation.HealthStatusActivity;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/a0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends j {
    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        boolean z14;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string = bundle.getString("calibrationCompleted", "");
        int i14 = 0;
        try {
            string.getClass();
            z14 = string.length() > 0 && Boolean.parseBoolean(string);
        } catch (Exception e4) {
            a2 a2Var = a2.HEALTH_STATUS;
            String strN = fb1.c.n("Failed to parse calibrationComplete: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "HealthStatusPushNotificationHandler", strN);
            z14 = false;
        }
        String string2 = bundle.getString("outliers", "");
        try {
            string2.getClass();
            if (string2.length() > 0) {
                i14 = Integer.parseInt(string2);
            }
        } catch (NumberFormatException e14) {
            a2 a2Var2 = a2.HEALTH_STATUS;
            String strN2 = fb1.c.n("Failed to parse outliersCount: ", e14.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "HealthStatusPushNotificationHandler", strN2);
        }
        int i15 = i14;
        a2 a2Var3 = a2.HEALTH_STATUS;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "HealthStatusPushNotificationHandler", "Received health status outliers notification with count: " + i15 + " & calibration complete: " + z14);
        l22.a aVar = new l22.a(garminConnectMobileApp);
        jn0.a aVar2 = (jn0.a) KoinJavaComponent.get$default(jn0.a.class, null, null, 6, null);
        String string3 = aVar.getString(R.string.lbl_health_status);
        PendingIntent pendingIntentC = j.c(garminConnectMobileApp, new Intent(garminConnectMobileApp, (Class<?>) HealthStatusActivity.class));
        if (z14) {
            j.e(garminConnectMobileApp, sz0.e.N0, d(cVar), string3, aVar.getString(R.string.msg_health_status_calibration_alert), pendingIntentC);
        }
        if (i15 <= 0 || !aVar2.c()) {
            i2.a.b(a2Var3, "HealthStatusPushNotificationHandler", "Outliers notification disabled or count is zero, not showing notification");
        } else {
            i2.a.b(a2Var3, "HealthStatusPushNotificationHandler", "Outliers count is greater than zero and notifications are enabled, showing outliers notification");
            j.e(garminConnectMobileApp, sz0.e.N0, d(cVar), string3, i15 == 1 ? aVar.getString(R.string.msg_health_status_one_outlier_push_notification) : aVar.a(R.string.msg_health_status_x_outliers, String.valueOf(i15)), pendingIntentC);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.HEALTH_STATUS};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ls00/a0$a;", "", "<init>", "()V", "", "HEALTH_STATUS_OUTLIERS", "Ljava/lang/String;", "HEALTH_STATUS_CALIBRATION_COMPLETE", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
