package p008y1;

import a2.j;
import e23.p;
import h4.s;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.o0;
import t13.g;
import u1.k1;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f193654a = new y0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f193655b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f193656c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f193657d = new c();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/t2$a", "Lh4/s;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements s {
        @Override // t13.g
        public final <R> R fold(R r14, p<? super R, ? super g.a, ? extends R> pVar) {
            return (R) g.a.C3052a.a(this, r14, pVar);
        }

        @Override // t13.g
        public final <E extends g.a> E get(g.b<E> bVar) {
            return (E) g.a.C3052a.b(this, bVar);
        }

        @Override // t13.g
        public final g minusKey(g.b<?> bVar) {
            return g.a.C3052a.c(this, bVar);
        }

        @Override // t13.g
        public final g plus(g gVar) {
            return g.a.C3052a.d(gVar, this);
        }

        @Override // h4.s
        public final float z() {
            return 1.0f;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/t2$b", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements o2 {
        @Override // p008y1.o2
        public final float f(float f14) {
            return f14;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/t2$c", "Lg6/c;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements g6.c {
        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            return 1.0f;
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            return 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(h3 h3Var, long j8, v13.c cVar) {
        u2 u2Var;
        o0 o0Var;
        h3 h3Var2;
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i14 = u2Var.f193677d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u2Var.f193677d = i14 - Integer.MIN_VALUE;
            } else {
                u2Var = new u2(cVar);
            }
        } else {
            u2Var = new u2(cVar);
        }
        Object obj = u2Var.f193676c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u2Var.f193677d;
        if (i15 == 0) {
            r.b(obj);
            o0Var = new o0();
            k1 k1Var = k1.Default;
            v2 v2Var = new v2(h3Var, j8, o0Var, null);
            u2Var.f193674a = h3Var;
            u2Var.f193675b = o0Var;
            u2Var.f193677d = 1;
            if (h3Var.h(k1Var, v2Var, u2Var) == aVar) {
                return aVar;
            }
            h3Var2 = h3Var;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0 o0Var2 = u2Var.f193675b;
            h3 h3Var3 = u2Var.f193674a;
            r.b(obj);
            o0Var = o0Var2;
            h3Var2 = h3Var3;
        }
        return n4.c.a(h3Var2.j(o0Var.f105806a));
    }

    public static h4.r b(h4.r rVar, e3 e3Var, b2 b2Var, boolean z14, boolean z15, j jVar, int i14) {
        return rVar.then(new s2(e3Var, b2Var, null, z14, z15, null, jVar, null));
    }
}
