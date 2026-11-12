package com.garmin.android.apps.connectmobile.util.location;

import am.j;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.room.a0;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c22.c1;
import c22.h;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.device.datatypes.DeviceProfile;
import f12.l;
import hk0.p;
import i22.f;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import qw0.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/SignificantLocationUpdateJobService;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"Instantiatable"})
public final class SignificantLocationUpdateJobService extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f47270e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f47271f;

    static {
        l3.f23124b.getClass();
        f47271f = 80467.2d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignificantLocationUpdateJobService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final androidx.work.d.a c() {
        Object objFromJson;
        try {
            objFromJson = GsonUtil.f47253b.fromJson(this.f11470b.f11427b.e("extra_location_payload"), (Class<Object>) i22.d.class);
        } catch (Throwable th3) {
            String strP = j.p("ERROR parsing LocationPayload input ", th3);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "SignifLocUpdJobService", strP);
            objFromJson = null;
        }
        if (objFromJson == null) {
            return new androidx.work.d.a.C0165a();
        }
        String strF = e5.f(objFromJson, "doWork: newSignificantLocation=");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "SignifLocUpdJobService", strF);
        l.f68084a.getClass();
        i22.d dVarU4 = l.a.a().u4();
        if (dVarU4 != null && dVarU4.a((i22.d) objFromJson) <= f47271f) {
            return new androidx.work.d.a.c();
        }
        i22.d dVar = (i22.d) objFromJson;
        l.a.a().X0(dVar);
        Set<Long> setKeySet = GCMSettingManager.p().keySet();
        ArrayList arrayListD = p.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((DeviceProfile) it.next()).getF92746j()));
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var3, "SignifLocUpdJobService", "onHandleWork: New valid location: " + objFromJson + " | subscribedDevices=" + setKeySet + ". | connectedDevices=" + arrayList + ".");
        for (Long l14 : setKeySet) {
            if (arrayList.contains(l14)) {
                Context context = this.f11469a;
                context.getClass();
                l14.getClass();
                long jLongValue = l14.longValue();
                h81.a aVar4 = new h81.a(21);
                qw0.b.a aVar5 = qw0.b.f148296j;
                i22.e eVar = new i22.e(aVar4, dVar, jLongValue);
                aVar5.getClass();
                qw0.b.a.a(context, "SignifLocUpdJobService", eVar);
            } else {
                l14.getClass();
                GCMSettingManager.U(l14.longValue(), dVar);
                StringBuilder sb3 = new StringBuilder("LocationListener: (SUCCESS) Sent notification to: device=");
                sb3.append(l14);
                sb3.append(" | location=");
                String strK = j.k(objFromJson, ". => No subscribed device connected: Save location to cache.", sb3);
                i2.a aVar6 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var4, "SignifLocUpdJobService", strK);
            }
        }
        return new androidx.work.d.a.c();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/SignificantLocationUpdateJobService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "THRESHOLD_METERS", "D", "", "LOCATION_ACCURACY_METERS", "I", "EXTRA_LOCATION_PAYLOAD", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            ArrayList arrayListA = f.a();
            if (arrayListA.isEmpty()) {
                String strK = a0.k("Start service(NO): connectedSubscribedDevices = ", arrayListA);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SignifLocUpdJobService", strK);
                return;
            }
            String strK2 = a0.k("Start service(YES): connectedSubscribedDevices = ", arrayListA);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "SignifLocUpdJobService", strK2);
            qw0.b.a aVar3 = qw0.b.f148296j;
            LocationUpdatesBroadcastReceiver.f47269a.getClass();
            PendingIntent pendingIntentA = LocationUpdatesBroadcastReceiver.a.a(context);
            float f14 = (float) SignificantLocationUpdateJobService.f47271f;
            aVar3.getClass();
            qw0.b bVar = new qw0.b(context, "SignifLocUpdJobService", null);
            bVar.f148301e = pendingIntentA;
            g.f148313b.getClass();
            bVar.f148304h = qw0.b.e(g.c.f148316c, -1L, f14);
            Context context2 = bVar.f148297a;
            if (!c1.a(context2) && !c1.b(context2)) {
                i2.a.b(a2.LOCATION, "GCMBackgroundLocationClient", bVar.f148298b + " connect: LocationService is disabled.");
                return;
            }
            if (bVar.f148300d != null && h.c(context2) && qw0.e.a()) {
                bVar.c();
            } else {
                bVar.d("gps");
                bVar.d("network");
            }
        }

        public static void b(Context context) {
            context.getClass();
            ArrayList arrayListA = f.a();
            if (!arrayListA.isEmpty()) {
                String strK = a0.k("Stop service (NO): connectedSubscribedDevices = ", arrayListA);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SignifLocUpdJobService", strK);
                return;
            }
            String strK2 = a0.k("Stop service(YES): connectedSubscribedDevices = ", arrayListA);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "SignifLocUpdJobService", strK2);
            qw0.b.a aVar3 = qw0.b.f148296j;
            LocationUpdatesBroadcastReceiver.f47269a.getClass();
            PendingIntent pendingIntentA = LocationUpdatesBroadcastReceiver.a.a(context);
            aVar3.getClass();
            qw0.b bVar = new qw0.b(context, "SignifLocUpdJobService", null);
            bVar.f148301e = pendingIntentA;
            bVar.b();
            i2.a.b(a2.LOCATION, "GCMBackgroundLocationClient", "SignifLocUpdJobService".concat(" stopLocationUpdate with PendingIntent"));
        }

        private a() {
        }
    }
}
