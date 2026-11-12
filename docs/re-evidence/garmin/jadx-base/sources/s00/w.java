package s00;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/w;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends j {
    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string = bundle.getString("pushnotification_gear_name");
        if (string == null) {
            i2.f36769a.getClass();
            i2.a.p(a2.GEAR, "GearPushNotificationHandler", "Received incomplete gear notification: " + bundle);
            return;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.GEAR, "GearPushNotificationHandler", "Received gear notification: " + bundle);
        String string2 = bundle.getString("gearUuid");
        PendingIntent pendingIntentC = null;
        if (string2 != null) {
            rk0.f0 f0Var = new rk0.f0(string2, (i53.c) null, (c80.u) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (b63.o) null, (b63.o) null, (c80.w) null, (i53.c) null, (b63.o) null, (Double) null, (Long) null, (Long) null, (Double) null, (Integer) null, (Long) null, (i53.d) null, (i53.c) null, 2097150, (p005kotlin.jvm.internal.j) null);
            GearActivity.f35500b.getClass();
            Intent intent = new Intent(garminConnectMobileApp, (Class<?>) GearActivity.class);
            intent.putExtra("StartDestinationKey", new GearRoute.i(f0Var, null));
            pendingIntentC = j.c(garminConnectMobileApp, intent);
        }
        j.e(garminConnectMobileApp, sz0.e.Q0, d(cVar), string, garminConnectMobileApp.getString(R.string.pn_reached_maximum_usage_for_gear, string), pendingIntentC);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.GEAR_MAX_USAGE};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ls00/w$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GEAR_NAME_KEY", "GEAR_UUID_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
