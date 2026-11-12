package com.garmin.android.apps.connectmobile.incidentdetection;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import cq0.l;
import kq0.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/b;", "Landroid/os/CountDownTimer;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EdgeIncidentDetectionService f36850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EdgeIncidentDetectionService edgeIncidentDetectionService, long j8) {
        super(j8, 1000L);
        this.f36850a = edgeIncidentDetectionService;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36850a;
        try {
            edgeIncidentDetectionService.f36788c.set(0);
            edgeIncidentDetectionService.f36793h = l.TICKING_TIMER_INCIDENT_DETECTED;
            edgeIncidentDetectionService.f36800o.send(Message.obtain((Handler) null, 3));
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer:onFinish sent [MSG_CURRENT_STATE] to bound clients (0)");
        } catch (RemoteException e4) {
            kq0.a.b("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer.onFinish", e4);
        }
        EdgeIncidentDetectionService.c cVar = edgeIncidentDetectionService.f36798m;
        if (cVar != null) {
            cVar.sendEmptyMessage(3);
        }
        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer: timer finished, [WHAT_NOTIFY_CONTACTS_INCIDENT_DETECTED] sent to handler");
        f.f106156a.getClass();
        f.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36850a;
        try {
            edgeIncidentDetectionService.f36788c.set(((int) j8) / 1000);
            edgeIncidentDetectionService.f36793h = l.TICKING_TIMER_INCIDENT_DETECTED;
            edgeIncidentDetectionService.f36800o.send(Message.obtain((Handler) null, 3));
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer:onTick sent [MSG_CURRENT_STATE] to bound clients (" + edgeIncidentDetectionService.f36788c.intValue() + ")");
        } catch (RemoteException e4) {
            kq0.a.b("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer.onTick", e4);
        }
    }
}
