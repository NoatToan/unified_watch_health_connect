package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.topoactivemaps.TopoActiveMapsScreenActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/m1;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "Lpc0/j;", "deviceRepo", "<init>", "(Lb31/f;Lpc0/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc0.j f96911c;

    public m1(b31.f fVar, pc0.j jVar) {
        fVar.getClass();
        jVar.getClass();
        this.f96910b = fVar;
        this.f96911c = jVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        Object objG = this.f96911c.g(String.valueOf(j8), cVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        Context context2;
        Intent intentA;
        context.getClass();
        str.getClass();
        str2.getClass();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null) {
            context2 = context;
            intentA = null;
        } else {
            if (this.f96910b.f(fVarI.getUnitID(), e31.a.HAS_TOPO_ACTIVE_MAPS_SUPPORT) && km2.a.i(fVarI.getUnitID(), null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
                RTSSettingsLauncherActivity.f34352a.getClass();
                context2 = context;
                intentA = RTSSettingsLauncherActivity.a.a(context2, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.TOPOACTIVE_MAPS_MENU_VALUE, true, null, null);
            } else {
                context2 = context;
                intentA = null;
            }
        }
        if (intentA == null) {
            zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str2);
            com.garmin.android.apps.connectmobile.devices.model.l lVarG = fVarI != null ? zb0.k.g(fVarI) : null;
            TopoActiveMapsScreenActivity.f45071a.getClass();
            Intent intent = new Intent(context2, (Class<?>) TopoActiveMapsScreenActivity.class);
            intent.putExtra("GCM_deviceEnumValue", u0Var);
            intent.putExtra("GCM_deviceDTO", lVarG);
            intentA = intent;
        }
        context2.startActivity(intentA);
    }
}
