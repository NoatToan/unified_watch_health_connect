package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class q extends o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c53/q$a", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f24574a;

        public a(Iterator it) {
            this.f24574a = it;
        }

        @Override // c53.j
        public final Iterator<T> iterator() {
            return this.f24574a;
        }
    }

    public static <T> j<T> b(Iterator<? extends T> it) {
        it.getClass();
        return new c53.a(new a(it));
    }

    public static final h c(j jVar, e23.l lVar) {
        if (!(jVar instanceof h0)) {
            return new h(jVar, new com.google.maps.android.compose.clustering.d(21), lVar);
        }
        h0 h0Var = (h0) jVar;
        return new h(h0Var.f24558a, h0Var.f24559b, lVar);
    }

    public static <T> j<T> d(e23.a<? extends T> aVar) {
        return new c53.a(new i(aVar, new a03.h0(aVar, 11)));
    }

    public static j e(e23.l lVar, Object obj) {
        lVar.getClass();
        return obj == null ? f.f24532a : new i(new p(obj, 0), lVar);
    }
}
