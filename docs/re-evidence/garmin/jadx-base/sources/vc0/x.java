package vc0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvc0/x;", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f177032a;

    public x(w wVar) {
        this.f177032a = wVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        if (bVar.f111632a.getF172494b() != this.f177032a.f177027c.getUnitID()) {
            return;
        }
        lh2.u uVar = w.f177026h;
        if (uVar != null) {
            uVar.e(true);
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
        if (hVar.f111673a.getF172494b() != this.f177032a.f177027c.getUnitID()) {
            return;
        }
        lh2.u uVar = w.f177026h;
        if (uVar != null) {
            uVar.e(false);
        } else {
            p005kotlin.jvm.internal.s.m("syncListener");
            throw null;
        }
    }
}
