package xc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxc0/c;", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f189908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw2.b f189909b;

    public c(b bVar, vw2.b bVar2) {
        this.f189908a = bVar;
        this.f189909b = bVar2;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        b.f189904e.debug("Device connection status changed: ConnectionEvent");
        if (bVar.f111632a.getF172494b() != this.f189908a.f189905b.f192449a) {
            return;
        }
        this.f189909b.b("CONNECTED");
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        b.f189904e.debug("Device connection status changed: DisconnectionEvent");
        if (hVar.f111673a.getF172494b() != this.f189908a.f189905b.f192449a) {
            return;
        }
        this.f189909b.b("NOT_CONNECTED");
    }
}
