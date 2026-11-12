package com.garmin.android.apps.connectmobile.incidentdetection;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import cq0.f;
import cq0.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/a;", "Landroid/os/CountDownTimer;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EdgeIncidentDetectionService f36849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EdgeIncidentDetectionService edgeIncidentDetectionService) {
        super(300000L, AbstractComponentTracker.LINGERING_TIMEOUT);
        this.f36849a = edgeIncidentDetectionService;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36849a;
        try {
            edgeIncidentDetectionService.f36788c.set(0);
            edgeIncidentDetectionService.f36793h = l.TICKING_TIMER_I_AM_OKAY;
            edgeIncidentDetectionService.f36800o.send(Message.obtain((Handler) null, 3));
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIAmOkayCountdownTimer:onFinish sent [MSG_CURRENT_STATE] to bound clients (0)");
        } catch (RemoteException e4) {
            kq0.a.b("EdgeIncidentDetectionService", "backgroundTaskStartIAmOkayCountdownTimer.onFinish", e4);
        }
        Message.obtain(edgeIncidentDetectionService.f36798m, 6, f.FROM_GCM_I_AM_OKAY_TIMER_EXPIRED.ordinal(), 0).sendToTarget();
        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIAmOkayCountdownTimer: timer finished, [WHAT_FINISH_INCIDENT] sent to handler with finish how [FROM_GCM_I_AM_OKAY_TIMER_EXPIRED]");
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36849a;
        try {
            edgeIncidentDetectionService.f36788c.set(((int) j8) / 1000);
            edgeIncidentDetectionService.f36793h = l.TICKING_TIMER_I_AM_OKAY;
            edgeIncidentDetectionService.f36800o.send(Message.obtain((Handler) null, 3));
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIAmOkayCountdownTimer:onTick sent [MSG_CURRENT_STATE] to bound clients (" + edgeIncidentDetectionService.f36788c.intValue() + ")");
        } catch (RemoteException e4) {
            kq0.a.b("EdgeIncidentDetectionService", "backgroundTaskStartIAmOkayCountdownTimer.onTick", e4);
        }
    }
}
