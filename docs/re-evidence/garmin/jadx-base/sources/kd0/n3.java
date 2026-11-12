package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.AssistanceConsentActivity;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/n3;", "Lcq0/j;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n3 implements cq0.j {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/n3$a", "Lwm2/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements wm2.b {
        @Override // wm2.b
        public final void onResponseFailed(int i14) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "IncidentDetectionAppService", "requestCancelIncident:remote device says 'onResponseFailed'");
        }

        @Override // wm2.b
        public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
            smart.getClass();
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "IncidentDetectionAppService", "requestCancelIncident:remote device says 'onResponseReceived'");
        }
    }

    @Override // cq0.j
    public final void a(int i14, long j8, GDISmartProto.Smart smart) {
        ProtobufRequestManager.getInstance().respondToRequest(i14, j8, smart);
    }

    @Override // cq0.j
    public final void c(GDISmartProto.Smart smart, long j8) {
        ProtobufRequestManager.getInstance().initiateNotification(smart, j8);
    }

    @Override // cq0.j
    public final void d(GDISmartProto.Smart smart, long j8) {
        hq0.b bVar = (hq0.b) zb0.k.b(hq0.b.class, j8);
        if (bVar == null || smart == null) {
            return;
        }
        u53.d dVar = bVar.f85203d;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new hq0.c(bVar, smart, null), 3);
        } else {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
    }

    @Override // cq0.j
    public final void e() {
        vn1.f.d();
    }

    @Override // cq0.j
    public final void f() {
        vn1.f.e();
        vn1.f.b(R.raw.emergency_alert_06b, false);
    }

    @Override // cq0.j
    public final void g(long j8) {
        wd2.m.h(j8, com.garmin.android.library.livetrack.i.b.f50229a);
    }

    @Override // cq0.j
    public final void h(int i14, long j8, GDISmartProto.Smart smart) {
        ProtobufRequestManager.getInstance().respondToRequest(i14, j8, smart);
    }

    @Override // cq0.j
    public final void i(IncidentDetectionTermsActivity incidentDetectionTermsActivity, Pair pair, Bundle bundle, hl.a aVar) {
        aVar.getClass();
        Intent intent = new Intent(incidentDetectionTermsActivity, (Class<?>) AssistanceConsentActivity.class);
        if (pair != null) {
            String str = (String) pair.first;
            Object obj = pair.second;
            obj.getClass();
            intent.putExtra(str, ((Boolean) obj).booleanValue());
        }
        intent.putExtra("GCM_extra_screen_access_role", aVar);
        if (bundle != null) {
            intent.putExtra("GCM_extra_activity_extras", bundle);
        }
        incidentDetectionTermsActivity.startActivity(intent);
    }

    @Override // cq0.j
    public final void j(GDISmartProto.Smart smart, long j8, wm2.b bVar) {
        ProtobufRequestManager.getInstance().initiateRequest(smart, j8, bVar);
    }

    @Override // cq0.j
    public final void k() {
        vn1.f.c();
    }

    @Override // cq0.j
    public final void l(long j8) {
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setCancelIncidentRequest(GDIIncidentDetectionProto.CancelIncidentRequest.newBuilder()).build()).build();
        smartBuild.getClass();
        protobufRequestManager.initiateRequest(smartBuild, j8, new a());
    }

    @Override // cq0.j
    public final void m() {
        vn1.f.a();
    }

    @Override // cq0.j
    public final void n(long j8, GDIIncidentDetectionProto.IncidentStatusNotification.Status status) {
        status.getClass();
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setIncidentStatusNotification(GDIIncidentDetectionProto.IncidentStatusNotification.newBuilder().setStatus(status)).build()).build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, j8);
    }

    @Override // cq0.j
    public final void o() {
        Vibrator vibrator = (Vibrator) GarminConnectMobileApp.f28688j.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // cq0.j
    public final void p(long j8) {
        wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
    }

    @Override // cq0.j
    public final long q(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<l20.r> interfaceC0995b) {
        eq0.a aVarA = eq0.a.f65038b.a();
        aVarA.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.a(aVarA), interfaceC0995b);
    }

    @Override // cq0.j
    public final void r(boolean z14) {
        if (z14) {
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.HAS_EMERGENCY_CONTACTS);
        }
    }

    @Override // cq0.j
    public final void s() {
        Vibrator vibrator = (Vibrator) GarminConnectMobileApp.f28688j.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(new long[]{0, 1000, 600}, 0);
        }
    }

    @Override // cq0.j
    public final boolean t(Context context, long j8) {
        context.getClass();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        boolean zI = km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
        if (fVarI != null && zI) {
            RTSSettingsLauncherActivity.f34352a.getClass();
            context.startActivity(RTSSettingsLauncherActivity.a.a(context, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.FALL_DETECTION_PAUSE_VALUE, true, null, null));
            return true;
        }
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.INCIDENT_DETECTION;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "Device does not support RTS or deviceDatabaseRecord is null.");
        return false;
    }
}
