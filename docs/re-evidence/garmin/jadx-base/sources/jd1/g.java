package jd1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljd1/g;", "Ljd1/b$b;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements b.InterfaceC1886b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f98442a;

    public g(f fVar) {
        this.f98442a = fVar;
    }

    @Override // jd1.b.InterfaceC1886b
    public final void a() {
        f fVar = this.f98442a;
        pd1.c cVarD = fVar.H6().C4().d();
        if (cVarD != null) {
            fVar.H6().D4(cVarD);
        }
    }

    @Override // jd1.b.InterfaceC1886b
    public final void b(pd1.b bVar, int i14) {
        f fVar = this.f98442a;
        fVar.A6().debug("removeReminder: id=[" + bVar.getUserReminderId() + "]");
        fVar.u6(bVar, Integer.valueOf(i14));
    }

    @Override // jd1.b.InterfaceC1886b
    public final void c(pd1.b bVar) {
        f fVar = this.f98442a;
        fVar.K6(false);
        f.b bVar2 = fVar.f98425e;
        if (bVar2 != null) {
            bVar2.k2(bVar);
        }
    }
}
