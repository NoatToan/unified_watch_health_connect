package ks2;

import p005kotlin.Metadata;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lks2/d;", "Lwl2/f;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends wl2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s<wl2.b> f106397a;

    public d(s<wl2.b> sVar) {
        this.f106397a = sVar;
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        if (bVar != tl2.c.b.SUCCESS) {
            ((e13.a.C1312a) this.f106397a).a(new Exception("Failed to finish transfer, status = " + bVar));
        }
    }

    @Override // wl2.f
    public final void c(wl2.b bVar) {
        ((e13.a.C1312a) this.f106397a).c(bVar);
    }
}
