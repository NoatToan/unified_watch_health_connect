package vc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/e;", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f176980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh2.b f176981b;

    public e(d dVar, zh2.b bVar) {
        this.f176980a = dVar;
        this.f176981b = bVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        if (bVar.f111632a.getF172494b() != this.f176980a.f176978c.getUnitID()) {
            return;
        }
        this.f176981b.b("CONNECTED");
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (hVar.f111673a.getF172494b() != this.f176980a.f176978c.getUnitID()) {
            return;
        }
        this.f176981b.b("NOT_CONNECTED");
    }
}
