package r02;

import j23.t;
import o53.c0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.c2;
import p3.d0;
import p3.p0;
import p3.z1;
import s1.j1;
import s1.q1;
import s1.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lr02/m;", "", "Ls1/y;", "", "decayAnimationSpec", "initialScale", "initialTranslationX", "initialTranslationY", "<init>", "(Ls1/y;FFF)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f148892q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y<Float> f148893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5.e f148894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f148895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1.b<Float, s1.n> f148896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1.b<Float, s1.n> f148897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f148898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f148899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l1 f148900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f148901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1 f148902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f148903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f148904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f148905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f148906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f148907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f148908p;

    static {
        new a(null);
    }

    public m(y<Float> yVar, float f14, float f15, float f16) {
        yVar.getClass();
        this.f148893a = yVar;
        this.f148894b = new c5.e();
        this.f148895c = new z1(f14);
        this.f148896d = s1.d.a(f15, 0.5f);
        this.f148897e = s1.d.a(f16, 0.5f);
        g6.m.f76012b.getClass();
        this.f148898f = p0.n(g6.m.a(0L));
        n4.g.f123559b.getClass();
        this.f148899g = p0.n(n4.g.a(0L));
        g6.k.f76003b.getClass();
        this.f148901i = p0.n(g6.k.a(0L));
        this.f148902j = new z1(0.0f);
        this.f148903k = p0.f(new j(this, 3));
        this.f148904l = p0.n(Boolean.FALSE);
        this.f148905m = 1.0f;
        this.f148906n = 4.0f;
        this.f148907o = p0.n(null);
        this.f148908p = 2.0f;
    }

    public static Object a(m mVar, float f14, long j8, v13.i iVar, int i14) {
        if ((i14 & 2) != 0) {
            float fD = mVar.d();
            float fE = mVar.e();
            long jFloatToRawIntBits = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fE)) & 4294967295L;
            n4.c.a aVar = n4.c.f123541b;
            j8 = n4.c.k(f14, n4.c.c(mVar.f148895c.getFloatValue(), jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)));
        }
        j1 j1VarC = s1.l.c(7, 0.0f, 0.0f, null);
        mVar.getClass();
        Object objE = c0.e(new o(mVar, f14, j1VarC, j8, null), iVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public final long b(long j8) {
        long jB = n4.h.b(g6.n.c(g()));
        float fD = d();
        return n4.c.c(this.f148895c.getFloatValue(), n4.c.i(n4.c.j(jB, (((long) Float.floatToRawIntBits(e())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)), j8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j8, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f148932c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f148932c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f148930a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f148932c;
        if (i15 == 0) {
            o13.r.b(obj);
            q qVar = new q(this, j8, null);
            pVar.f148932c = 1;
            if (c0.e(qVar, pVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f148904l.setValue(Boolean.FALSE);
        this.f148900h = null;
        return Unit.INSTANCE;
    }

    public final float d() {
        return this.f148896d.e().floatValue();
    }

    public final float e() {
        return this.f148897e.e().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((n4.g) this.f148899g.getF182175a()).f123561a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((g6.m) this.f148898f.getF182175a()).f76013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        z1 z1Var = this.f148895c;
        float floatValue = z1Var.getFloatValue();
        float f14 = this.f148905m;
        b bVar = (b) this.f148907o.getF182175a();
        return floatValue > Math.max(f14, bVar != null ? bVar.f148829a : 0.0f) && z1Var.getFloatValue() <= this.f148906n;
    }

    public final Object i(v13.i iVar) {
        Object objC = q1.c(this.f148902j.getFloatValue(), 0.0f, null, new ov1.q(this, 29), iVar, 12);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r10.g(r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j8, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f148945d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f148945d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f148943b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f148945d;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = rVar.f148942a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        s1.b<Float, s1.n> bVar = this.f148896d;
        Float f14 = new Float(Float.intBitsToFloat((int) (j8 >> 32)) + bVar.e().floatValue());
        rVar.f148942a = j8;
        rVar.f148945d = 1;
        if (bVar.g(f14, rVar) != aVar) {
        }
        return aVar;
        s1.b<Float, s1.n> bVar2 = this.f148897e;
        Float f15 = new Float(Float.intBitsToFloat((int) (4294967295L & j8)) + bVar2.e().floatValue());
        rVar.f148942a = j8;
        rVar.f148945d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        if (r19.f148897e.g(r7, r5) == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j8, long j14, float f14, v13.c cVar) {
        s sVar;
        long j15;
        long j16;
        long j17;
        float f15 = f14;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f148952g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f148952g = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f148950e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f148952g;
        if (i15 != 0) {
            if (i15 == 1) {
                j16 = sVar.f148948c;
                f15 = sVar.f148949d;
                j17 = sVar.f148947b;
                j15 = sVar.f148946a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        long jB = b(n4.c.i(j8, j14));
        z1 z1Var = this.f148895c;
        l(z1Var.getFloatValue() * f15);
        long j18 = n4.c.j(n4.c.i(n4.c.k(z1Var.getFloatValue(), jB), n4.h.b(g6.n.c(g()))), j8);
        Float f16 = new Float(Float.intBitsToFloat((int) (j18 >> 32)));
        sVar.f148946a = j8;
        sVar.f148947b = j14;
        sVar.f148949d = f15;
        sVar.f148948c = j18;
        sVar.f148952g = 1;
        if (this.f148896d.g(f16, sVar) != aVar) {
            j15 = j8;
            j16 = j18;
            j17 = j14;
        }
        return aVar;
        Float f17 = new Float(Float.intBitsToFloat((int) (4294967295L & j16)));
        sVar.f148946a = j15;
        sVar.f148947b = j17;
        sVar.f148949d = f15;
        sVar.f148948c = j16;
        sVar.f148952g = 2;
    }

    public final void l(float f14) {
        this.f148895c.i(t.d(f14, this.f148905m, this.f148906n));
        m();
    }

    public final void m() {
        long jF = f();
        n4.g.f123559b.getClass();
        if (n4.g.c(jF, 0L)) {
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        z1 z1Var = this.f148895c;
        float floatValue = (z1Var.getFloatValue() * fIntBitsToFloat) - ((int) (g() >> 32));
        float floatValue2 = (z1Var.getFloatValue() * Float.intBitsToFloat((int) (f() & 4294967295L))) - ((int) (g() & 4294967295L));
        long jC = (((long) MathKt.c(floatValue2 / 2.0f)) & 4294967295L) | (((long) MathKt.c(floatValue / 2.0f)) << 32);
        g6.k.a aVar = g6.k.f76003b;
        this.f148901i.setValue(g6.k.a(jC));
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        float f14 = floatValue / 2.0f;
        if (floatValue2 < 0.0f) {
            floatValue2 = 0.0f;
        }
        float f15 = floatValue2 / 2.0f;
        this.f148896d.i(Float.valueOf(-f14), Float.valueOf(f14));
        this.f148897e.i(Float.valueOf(-f15), Float.valueOf(f15));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lr02/m$a;", "", "<init>", "()V", "", "PX_VISIBILITY_THRESHOLD", "F", "DISMISS_DRAG_RESISTANCE_FACTOR", "DISMISS_DRAG_THRESHOLD", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(y yVar, float f14, float f15, float f16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(yVar, (i14 & 2) != 0 ? 1.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? 0.0f : f16);
    }
}
