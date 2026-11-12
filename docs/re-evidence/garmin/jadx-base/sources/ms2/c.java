package ms2;

import ps2.o;

/* JADX INFO: loaded from: classes11.dex */
public interface c {
    is2.b a();

    Object b(e eVar, o oVar);

    Object c(hs2.a aVar, t13.d<? super ns2.a<? extends e>> dVar);

    default Object d(long j8, e eVar, ns2.a<? extends f> aVar, t13.d<? super Boolean> dVar) {
        return Boolean.FALSE;
    }

    default Object e(long j8, f fVar, t13.d<? super Boolean> dVar) {
        return Boolean.FALSE;
    }
}
