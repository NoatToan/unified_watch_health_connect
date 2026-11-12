package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/k3;", "Lfo0/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k3 implements fo0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ho0.i f104169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yr1.q f104170b = new yr1.q("HeartRateDelegate", new b(), null, null, 12, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/k3$b", "Lyr1/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements yr1.r {
        public b() {
        }

        @Override // yr1.r
        public final void B1(al2.c cVar) {
        }

        @Override // yr1.r
        public final void F1(al2.a aVar, boolean z14) {
        }

        @Override // yr1.r
        public final void g5(al2.c cVar, boolean z14) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "HeartRateDelegate", "syncEventReceiver: onSyncFinished() " + cVar);
            ho0.i iVar = k3.this.f104169a;
            if (iVar != null) {
                iVar.invoke();
            }
        }
    }

    static {
        new a(null);
    }

    @Override // fo0.a
    public final void b(Context context) {
        this.f104170b.e();
        this.f104169a = null;
    }

    @Override // fo0.a
    public final String c(Context context, gs1.b bVar) {
        bVar.getClass();
        return fr.b.b(context, bVar);
    }

    @Override // fo0.a
    public final void d(Context context, sd2.f fVar) {
        String displayName;
        context.getClass();
        fVar.getClass();
        String productNumber = fVar.getProductNumber();
        productNumber.getClass();
        if (productNumber.length() <= 0 || (displayName = fVar.getDisplayName()) == null || displayName.length() <= 0) {
            return;
        }
        DeviceSettingsActivityTrackerSetupDefault.a aVar = DeviceSettingsActivityTrackerSetupDefault.a.HEART_RATE_DETAILS;
        if (fVar.s2()) {
            aVar = DeviceSettingsActivityTrackerSetupDefault.a.HEART_RATE_ALERTS;
        }
        DeviceSettingsActivityTrackerSetupDefault.a aVar2 = aVar;
        String displayName2 = fVar.getDisplayName();
        if (displayName2 != null) {
            ni1.a.C2424a c2424a = ni1.a.f126196a;
            long unitID = fVar.getUnitID();
            String productNumber2 = fVar.getProductNumber();
            productNumber2.getClass();
            boolean zS2 = fVar.s2();
            c2424a.getClass();
            aVar2.getClass();
            Intent intentA = ni1.a.C2424a.a(context, aVar2, unitID, productNumber2, displayName2);
            intentA.putExtra("GCM_low_hr_alert_capable", zS2);
            context.startActivity(intentA);
        }
    }

    @Override // fo0.a
    public final void e(Activity activity, sn.h hVar) {
        if (hVar != null) {
            String uuid = hVar.getActivityUuid().getUuid();
            EcgDetailActivity.f34869p.getClass();
            activity.startActivity(EcgDetailActivity.a.a(activity, uuid));
        }
    }

    @Override // fo0.a
    public final void f(Activity activity, sn.h hVar) {
        if (hVar == null) {
            return;
        }
        HealthSnapshotActivity.f29015d.getClass();
        Intent intent = new Intent(activity, (Class<?>) HealthSnapshotActivity.class);
        intent.putExtra("ACTIVITY_EXTRA", hVar);
        activity.startActivityForResult(intent, 1235);
    }

    @Override // fo0.a
    public final String g(Context context, sn.h hVar) {
        hVar.getClass();
        return new wn.c(context).b(hVar);
    }

    @Override // fo0.a
    public final p1.z<sd2.f> h() {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        p1.z<sd2.f> zVar = new p1.z<>();
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (sd2.f fVar : arrayListE) {
                boolean z14 = fVar.getApplicationKey() != null && fVar.getApplicationKey().contains("instinctTactical");
                boolean z15 = fVar.s2() || fVar.c2();
                if (z14 || z15) {
                    zVar.f(fVar.getUnitID(), fVar);
                }
            }
        }
        return zVar;
    }

    @Override // fo0.a
    public final void i(Context context, ho0.i iVar) {
        this.f104169a = iVar;
        this.f104170b.b();
    }

    @Override // fo0.a
    public final void j(Activity activity, gs1.b bVar) {
        activity.startActivityForResult(ar.a.a(activity, bVar), 1235);
    }

    @Override // fo0.a
    public final void k(Activity activity, gs1.f fVar) {
        if (fVar != null) {
            MoveIQEventDetailsActivity.f39211k.getClass();
            MoveIQEventDetailsActivity.a.a(activity, fVar, 1237);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/k3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
