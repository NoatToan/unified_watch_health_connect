package yz0;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.notifications.system.LocationServicesOnTaskService;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import hk0.p;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import la2.c;
import la2.h;
import p005kotlin.Metadata;
import rd2.f;
import rd2.j;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import ve.t0;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyz0/a;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f200228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f200229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f200230c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yz0/a$b", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            a.a(a.this.f200229b);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
        }
    }

    static {
        new C3748a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f200229b = context;
        this.f200230c = new b();
    }

    public static void a(Context context) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LocationServiceReceiver", "Remove Bluetooth Troubleshooting notification from notification bar ");
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(3);
        i0.f170088a.getClass();
        t0 t0VarG = t0.g(context);
        t0VarG.getClass();
        t0VarG.d("LocationServicesOnTaskService_PostNotification");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i14;
        ArrayList arrayList;
        context.getClass();
        intent.getClass();
        String strN = fb1.c.n("Action received ", intent.getAction());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LocationServiceReceiver", strN);
        int i15 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_location_services_setting), -1);
        try {
            i14 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException e4) {
            String strN2 = fb1.c.n("isLocationServiceEnabled: ", e4.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "LocationServiceReceiver", strN2);
            i14 = 0;
        }
        boolean z14 = i14 != 0;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("Location status ", z14);
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var3, "LocationServiceReceiver", strH);
        if (!z14) {
            GCMSettingManager.f41536b.edit().putInt(GCMSettingManager.f41535a.getString(R.string.key_location_services_setting), 0).apply();
            a(context);
            return;
        }
        if (i15 == 0 && oa2.a.b(context)) {
            ArrayList arrayListD = p.d();
            f.a().f152045a.getClass();
            ArrayList arrayListE = j.e();
            if (arrayListE != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListE) {
                    if (!u0.l(((sd2.f) obj).getProductNumber())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!n0.i(u0.H0, ((sd2.f) obj2).getProductNumber())) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty() && arrayListD.isEmpty()) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var4, "LocationServiceReceiver", "Schedule Bluetooth Troubleshooting notification");
                t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
                l lVar = l.REPLACE;
                x.a aVar5 = new x.a((Class<? extends d>) LocationServicesOnTaskService.class);
                ue.f.a aVar6 = new ue.f.a();
                aVar6.b(v.NOT_REQUIRED);
                aVar5.f170098c.f26950j = aVar6.a();
                aVar5.f170099d.add("LocationServicesOnTaskService_PostNotification");
                t0VarO.a("LocationServicesOnTaskService_PostNotification", lVar, aVar5.e(70L, TimeUnit.SECONDS).a()).a();
            }
        }
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_location_services_setting, GCMSettingManager.f41536b.edit(), 1);
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(10);
    }

    /* JADX INFO: renamed from: yz0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lyz0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LOCATION_SERVICES_DISABLED", "I", "LOCATION_SERVICES_ENABLED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3748a {
        public /* synthetic */ C3748a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3748a() {
        }
    }
}
