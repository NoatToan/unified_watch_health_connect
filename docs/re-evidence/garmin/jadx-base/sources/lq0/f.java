package lq0;

import android.os.CountDownTimer;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llq0/f;", "Landroid/os/CountDownTimer;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f114330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j8, d dVar) {
        super(j8, AbstractComponentTracker.LINGERING_TIMEOUT);
        this.f114330a = dVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        d dVar = this.f114330a;
        dVar.f114327b.set(0);
        kq0.h hVar = dVar.f114328c;
        if (hVar != null) {
            hVar.a(com.garmin.android.apps.connectmobile.incidentdetection.service.a.i.f36891c);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        int i14 = ((int) j8) / 1000;
        d dVar = this.f114330a;
        dVar.f114327b.set(i14);
        kq0.h hVar = dVar.f114328c;
        if (hVar != null) {
            hVar.a(new com.garmin.android.apps.connectmobile.incidentdetection.service.a.j(i14));
        }
    }
}
