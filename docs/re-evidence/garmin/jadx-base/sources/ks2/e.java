package ks2;

import e13.p;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ks2/e$a", "Lul2/d;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ul2.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<ul2.c, Unit> f106398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<tl2.c.b, Unit> f106399b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super ul2.c, Unit> lVar, l<? super tl2.c.b, Unit> lVar2) {
            this.f106398a = lVar;
            this.f106399b = lVar2;
        }

        @Override // tl2.f
        public final void b(tl2.c.b bVar) {
            bVar.getClass();
            this.f106399b.invoke(bVar);
        }

        @Override // ul2.d
        public final void c(ul2.c cVar) {
            this.f106398a.invoke(cVar);
        }
    }

    @o13.e
    public static final p a(hs2.d dVar) {
        dVar.getClass();
        b bVar = new b(dVar, 0);
        int i14 = w03.b.f181178a;
        return new e13.a(bVar).g(l13.a.f108328c);
    }

    @o13.e
    public static final p b(hs2.d dVar) {
        dVar.getClass();
        b bVar = new b(dVar, 1);
        int i14 = w03.b.f181178a;
        return new e13.a(bVar).g(l13.a.f108328c);
    }

    public static final <R> Object c(hs2.d dVar, e23.p<? super ul2.c, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar2) {
        return new g(pVar, new ks2.a(dVar, 0)).b(dVar2);
    }

    public static final Object d(hs2.d dVar, e23.p pVar, v13.c cVar) {
        return new g(pVar, new ks2.a(dVar, 1)).b(cVar);
    }
}
