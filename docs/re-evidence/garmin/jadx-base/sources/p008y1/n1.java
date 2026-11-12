package p008y1;

import a5.j;
import b5.a0;
import b5.q;
import c53.k;
import c53.m;
import c53.n;
import ch.qos.logback.core.CoreConstants;
import e23.p;
import g6.c;
import g6.s;
import java.util.List;
import o13.r;
import o53.c2;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import q53.b;
import q53.l;
import q6.f;
import s1.v;
import t13.d;
import u1.g0;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ly1/n1;", "", "Ly1/h3;", "scrollingLogic", "Ly1/g2;", "mouseWheelScrollConfig", "Lkotlin/Function2;", "Lg6/s;", "Lt13/d;", "", "onScrollStopped", "Lg6/c;", "density", "<init>", "(Ly1/h3;Ly1/g2;Le23/p;Lg6/c;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f193437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f193438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<s, d<? super Unit>, Object> f193439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f193440d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f193442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f193443g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f193441e = l.a(Integer.MAX_VALUE, 6, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x1 f193444h = new x1();

    /* JADX WARN: Multi-variable type inference failed */
    public n1(h3 h3Var, g2 g2Var, p<? super s, ? super d<? super Unit>, ? extends Object> pVar, c cVar) {
        this.f193437a = h3Var;
        this.f193438b = g2Var;
        this.f193439c = pVar;
        this.f193440d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, y1.n1$a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, s1.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n1 n1Var, h3 h3Var, a aVar, float f14, float f15, v13.c cVar) {
        p1 p1Var;
        o0 o0Var;
        float f16;
        h3 h3Var2;
        n1Var.getClass();
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i14 = p1Var.f193551f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f193551f = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(n1Var, cVar);
            }
        } else {
            p1Var = new p1(n1Var, cVar);
        }
        p1 p1Var2 = p1Var;
        Object obj = p1Var2.f193549d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var2.f193551f;
        if (i15 != 0) {
            if (i15 == 1) {
                f16 = p1Var2.f193548c;
                o0Var = p1Var2.f193547b;
                h3Var2 = p1Var2.f193546a;
                r.b(obj);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r0 r0VarS = g.s(obj);
        r0VarS.f105810a = aVar;
        n1Var.g(aVar);
        a aVarF = f(n1Var.f193441e);
        if (aVarF != null) {
            n1Var.g(aVarF);
            r0VarS.f105810a = ((a) r0VarS.f105810a).a(aVarF);
        }
        o0 o0Var2 = new o0();
        float fI = h3Var.i(h3Var.g(((a) r0VarS.f105810a).f193445a));
        o0Var2.f105806a = fI;
        if (m1.a(fI)) {
            return Unit.INSTANCE;
        }
        r0 r0Var = new r0();
        r0Var.f105810a = v.a(0.0f, 0.0f, 30);
        q1 q1Var = new q1(o0Var2, r0Var, r0VarS, f14, n1Var, f15, h3Var, null);
        p1Var2.f193546a = h3Var;
        p1Var2.f193547b = o0Var2;
        p1Var2.f193548c = f15;
        p1Var2.f193551f = 1;
        if (n1Var.h(h3Var, q1Var, p1Var2) != obj2) {
            o0Var = o0Var2;
            f16 = f15;
            h3Var2 = h3Var;
        }
        return obj2;
        x1 x1Var = n1Var.f193444h;
        long jH = xy2.b.h(x1Var.f193706a.b(Float.MAX_VALUE), x1Var.f193707b.b(Float.MAX_VALUE));
        s.f76026b.getClass();
        if (jH == 0) {
            float f17 = h3Var2.f(Math.signum(o0Var.f105806a)) * Math.min(Math.abs(o0Var.f105806a) / 100, f16) * 1000;
            if (f17 == 0.0f) {
                jH = 0;
            } else {
                jH = h3Var2.f193257d == b2.Horizontal ? xy2.b.h(f17, 0.0f) : xy2.b.h(0.0f, f17);
            }
        }
        p<s, d<? super Unit>, Object> pVar = n1Var.f193439c;
        s sVarA = s.a(jH);
        p1Var2.f193546a = null;
        p1Var2.f193547b = null;
        p1Var2.f193551f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, s1.m] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, y1.n1$a] */
    public static final Object b(n1 n1Var, r0 r0Var, o0 o0Var, h3 h3Var, r0 r0Var2, long j8, v13.c cVar) {
        r1 r1Var;
        h3 h3Var2;
        r0 r0Var3;
        r0 r0Var4;
        o0 o0Var2;
        boolean z14;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f193613g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f193613g = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(cVar);
            }
        } else {
            r1Var = new r1(cVar);
        }
        Object objC = r1Var.f193612f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f193613g;
        if (i15 == 0) {
            r.b(objC);
            if (j8 < 0) {
                return Boolean.FALSE;
            }
            s1 s1Var = new s1(n1Var, null);
            r1Var.f193607a = n1Var;
            r1Var.f193608b = r0Var;
            r1Var.f193609c = o0Var;
            h3Var2 = h3Var;
            r1Var.f193610d = h3Var2;
            r0Var3 = r0Var2;
            r1Var.f193611e = r0Var3;
            r1Var.f193613g = 1;
            objC = j2.c(j8, s1Var, r1Var);
            if (objC == aVar) {
                return aVar;
            }
            r0Var4 = r0Var;
            o0Var2 = o0Var;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0 r0Var5 = r1Var.f193611e;
            h3 h3Var3 = r1Var.f193610d;
            o0Var2 = r1Var.f193609c;
            r0Var4 = r1Var.f193608b;
            n1 n1Var2 = r1Var.f193607a;
            r.b(objC);
            r0Var3 = r0Var5;
            h3Var2 = h3Var3;
            n1Var = n1Var2;
        }
        a aVar2 = (a) objC;
        if (aVar2 != null) {
            ?? aVar3 = new a(aVar2.f193445a, aVar2.f193446b, ((a) r0Var4.f105810a).f193447c, null);
            r0Var4.f105810a = aVar3;
            boolean z15 = g0.f167502i;
            long j14 = aVar3.f193445a;
            o0Var2.f105806a = z15 ? h3Var2.k(h3Var2.g(j14)) : h3Var2.i(h3Var2.g(j14));
            r0Var3.f105810a = v.a(0.0f, 0.0f, 30);
            n1Var.g(aVar2);
            z14 = !m1.a(o0Var2.f105806a);
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    public static void c(q qVar) {
        List<a0> list = qVar.f15870a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            list.get(i14).a();
        }
    }

    public static a f(b bVar) {
        a aVar = null;
        k kVarA = n.a(new m(new u1(new xn.r(bVar, 5), null)).f24571a);
        while (kVarA.hasNext()) {
            a aVarA = (a) kVarA.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final float d(y1 y1Var, float f14) {
        h3 h3Var = this.f193437a;
        long j8 = h3Var.j(h3Var.f(f14));
        j.f1233b.getClass();
        return h3Var.i(h3Var.g(y1Var.b(j.f1234c, j8)));
    }

    public final boolean e(q qVar, long j8) {
        boolean zC;
        long jA = this.f193438b.a(qVar);
        boolean z14 = g0.f167502i;
        h3 h3Var = this.f193437a;
        float fK = z14 ? h3Var.k(h3Var.g(jA)) : h3Var.i(h3Var.g(jA));
        if (fK == 0.0f) {
            zC = false;
        } else {
            zC = fK > 0.0f ? h3Var.f193254a.c() : h3Var.f193254a.e();
        }
        if (!zC) {
            return this.f193442f;
        }
        Object objI = this.f193441e.i(new a(jA, ((a0) h0.b0(qVar.f15870a)).f15749b, false, null));
        q53.m.b bVar = q53.m.f142998b;
        return !(objI instanceof q53.m.c);
    }

    public final void g(a aVar) {
        long j8 = aVar.f193446b;
        long j14 = aVar.f193445a;
        x1 x1Var = this.f193444h;
        x1Var.f193706a.a(Float.intBitsToFloat((int) (j14 >> 32)), j8);
        x1Var.f193707b.a(Float.intBitsToFloat((int) (j14 & 4294967295L)), j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(h3 h3Var, q1 q1Var, v13.c cVar) {
        v1 v1Var;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i14 = v1Var.f193682c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v1Var.f193682c = i14 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, cVar);
            }
        } else {
            v1Var = new v1(this, cVar);
        }
        Object obj = v1Var.f193680a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v1Var.f193682c;
        if (i15 == 0) {
            r.b(obj);
            this.f193442f = true;
            w1 w1Var = new w1(h3Var, q1Var, null);
            v1Var.f193682c = 1;
            if (ge1.b.Y(w1Var, v1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f193442f = false;
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/n1$a;", "", "Ln4/c;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f193445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f193446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f193447c;

        private a(long j8, long j14, boolean z14) {
            this.f193445a = j8;
            this.f193446b = j14;
            this.f193447c = z14;
        }

        public final a a(a aVar) {
            return new a(n4.c.j(this.f193445a, aVar.f193445a), Math.max(this.f193446b, aVar.f193446b), this.f193447c, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n4.c.d(this.f193445a, aVar.f193445a) && this.f193446b == aVar.f193446b && this.f193447c == aVar.f193447c;
        }

        public final int hashCode() {
            n4.c.a aVar = n4.c.f123541b;
            return Boolean.hashCode(this.f193447c) + f.e(Long.hashCode(this.f193445a) * 31, 31, this.f193446b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MouseWheelScrollDelta(value=");
            sb3.append((Object) n4.c.l(this.f193445a));
            sb3.append(", timeMillis=");
            sb3.append(this.f193446b);
            sb3.append(", shouldApplyImmediately=");
            return am.j.t(sb3, this.f193447c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ a(long j8, long j14, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(j8, j14, z14);
        }
    }
}
