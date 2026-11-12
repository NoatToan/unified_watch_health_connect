package s00;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachFinishSetupLauncherActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/b0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155286a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.INREACH_ACTIVATION_SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f155286a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (y80.p0.f195202c) {
            return;
        }
        if (b.f155286a[cVar.ordinal()] != 1) {
            String str = "onPushNotificationReceived: " + cVar + " not handled";
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InReachFinishSetupPushNotificationHandler", str);
            return;
        }
        InReachFinishSetupLauncherActivity.f43503d.getClass();
        Intent intent = new Intent(garminConnectMobileApp, (Class<?>) InReachFinishSetupLauncherActivity.class);
        intent.addFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(garminConnectMobileApp, 0, intent, 1140850688);
        String string = garminConnectMobileApp.getString(R.string.lbl_finish_inReach_setup);
        string.getClass();
        String string2 = garminConnectMobileApp.getString(R.string.pn_activation_succeeded_body);
        string2.getClass();
        j.e(garminConnectMobileApp, sz0.e.I0, d(cVar), string, string2, activity);
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.INREACH_ACTIVATION_SUCCEEDED};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls00/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
