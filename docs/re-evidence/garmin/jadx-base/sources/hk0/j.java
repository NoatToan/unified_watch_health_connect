package hk0;

import de2.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhk0/j;", "Lde2/b0$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f84074a;

    public j(f fVar) {
        this.f84074a = fVar;
    }

    @Override // de2.b0.a
    public final void a(rs2.c cVar) {
        cVar.getClass();
        f fVar = this.f84074a;
        fVar.f84065c.trace("Stop live track requested");
        fVar.k(cVar, "com.garmin.livetrack.ACTION_ON_STOP_LIVE_TRACK_REQUEST_RECEIVED", null, true);
    }

    @Override // de2.b0.a
    public final void b(rs2.c cVar) {
        cVar.getClass();
        f fVar = this.f84074a;
        fVar.f84065c.trace("Cancel auto start live track requested");
        fVar.k(cVar, "com.garmin.livetrack.ACTION_ON_CANCEL_START_LIVE_TRACK_REQUEST_RECEIVED", null, true);
    }

    @Override // de2.b0.a
    public final void c(rs2.c cVar) {
        cVar.getClass();
        f fVar = this.f84074a;
        fVar.f84065c.trace("Auto start live track requested");
        fVar.k(cVar, "com.garmin.livetrack.ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED", null, true);
    }
}
