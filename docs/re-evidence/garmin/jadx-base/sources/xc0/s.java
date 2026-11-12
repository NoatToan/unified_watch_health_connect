package xc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxc0/s;", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f189963a;

    public s(r rVar) {
        this.f189963a = rVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        r.f189956f.debug("Device connection status changed: ConnectionEvent");
        if (bVar.f111632a.getF172494b() != this.f189963a.f189958b.f192449a) {
            return;
        }
        bv2.p pVar = r.f189957g;
        if (pVar != null) {
            pVar.e(true);
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        r.f189956f.debug("Device connection status changed: DisconnectionEvent");
        if (hVar.f111673a.getF172494b() != this.f189963a.f189958b.f192449a) {
            return;
        }
        bv2.p pVar = r.f189957g;
        if (pVar != null) {
            pVar.e(false);
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }
}
