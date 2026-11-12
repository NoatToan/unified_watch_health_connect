package kotlin;

import android.os.Build;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import e23.p;
import g6.k;
import g6.m;
import g6.o;
import h4.n;
import h5.n1;
import i3.e5;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import lc.u0;
import n4.g;
import o4.a1;
import o4.b1;
import o4.d0;
import o4.e0;
import o4.f1;
import o4.j;
import o4.l1;
import o4.n0;
import o4.o1;
import o4.q;
import o4.q0;
import o4.y;
import o4.z1;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import q4.f;
import r4.c;
import r4.d;
import r4.e;
import vb.h;
import zf.b;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li5/e2;", "Lh5/n1;", "", "Lr4/c;", "graphicsLayer", "Lo4/q0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Li5/m;", "ownerView", "Lkotlin/Function2;", "Lo4/y;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Lr4/c;Lo4/q0;Li5/m;Le23/p;Le23/a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e2 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f91147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f91148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f91149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p<? super y, ? super c, p005kotlin.Unit> f91150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.a<p005kotlin.Unit> f91151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f91152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f91154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f91155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f91156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g6.c f91157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f91158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q4.a f91159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f91161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1 f91162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f91163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f91164r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f91165t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f91166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f91167w;

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<f, p005kotlin.Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final p005kotlin.Unit invoke(f fVar) {
            f fVar2 = fVar;
            y yVarA = fVar2.getF142543b().a();
            p<? super y, ? super c, p005kotlin.Unit> pVar = e2.this.f91150d;
            if (pVar != null) {
                pVar.invoke(yVarA, fVar2.getF142543b().f142551b);
            }
            return p005kotlin.Unit.INSTANCE;
        }
    }

    public e2(c cVar, q0 q0Var, m mVar, p<? super y, ? super c, p005kotlin.Unit> pVar, e23.a<p005kotlin.Unit> aVar) {
        this.f91147a = cVar;
        this.f91148b = q0Var;
        this.f91149c = mVar;
        this.f91150d = pVar;
        this.f91151e = aVar;
        long j8 = Integer.MAX_VALUE;
        m.a aVar2 = m.f76012b;
        this.f91152f = (j8 & 4294967295L) | (j8 << 32);
        this.f91154h = a1.b();
        this.f91157k = b.c();
        this.f91158l = o.Ltr;
        this.f91159m = new q4.a();
        z1.f129046b.getClass();
        this.f91161o = z1.f129047c;
        this.f91165t = true;
        this.f91167w = new a();
    }

    @Override // h5.n1
    public final void a(y yVar, c cVar) {
        h();
        this.f91166v = this.f91147a.f150141a.getF150241v() > 0.0f;
        q4.a aVar = this.f91159m;
        q4.a.b bVar = aVar.f142543b;
        bVar.f(yVar);
        bVar.f142551b = cVar;
        e.a(aVar, this.f91147a);
    }

    @Override // h5.n1
    public final void b(float[] fArr) {
        a1.h(fArr, m());
    }

    @Override // h5.n1
    public final long c(long j8, boolean z14) {
        float[] fArrM;
        if (z14) {
            fArrM = l();
            if (fArrM == null) {
                n4.c.f123541b.getClass();
                return n4.c.f123542c;
            }
        } else {
            fArrM = m();
        }
        return this.f91165t ? j8 : a1.c(j8, fArrM);
    }

    @Override // h5.n1
    public final void d(e23.a aVar, p pVar) {
        q0 q0Var = this.f91148b;
        if (q0Var == null) {
            throw e5.m("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f91147a.f150159s) {
            e5.a.a("layer should have been released before reuse");
        }
        this.f91147a = q0Var.a();
        this.f91153g = false;
        this.f91150d = pVar;
        this.f91151e = aVar;
        this.f91163q = false;
        this.f91164r = false;
        this.f91165t = true;
        a1.e(this.f91154h);
        float[] fArr = this.f91155i;
        if (fArr != null) {
            a1.e(fArr);
        }
        z1.f129046b.getClass();
        this.f91161o = z1.f129047c;
        this.f91166v = false;
        long j8 = Integer.MAX_VALUE;
        m.a aVar2 = m.f76012b;
        this.f91152f = (j8 & 4294967295L) | (j8 << 32);
        this.f91162p = null;
        this.f91160n = 0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // h5.n1
    public final void destroy() {
        q3.c<Reference<T>> cVar;
        Object objPoll;
        this.f91150d = null;
        this.f91151e = null;
        this.f91153g = true;
        boolean z14 = this.f91156j;
        m mVar = this.f91149c;
        if (z14) {
            this.f91156j = false;
            mVar.b0(this, false);
        }
        q0 q0Var = this.f91148b;
        if (q0Var != null) {
            q0Var.b(this.f91147a);
            g4<n1> g4Var = mVar.f91302u1;
            do {
                ReferenceQueue<n1> referenceQueue = g4Var.f91196b;
                cVar = g4Var.f91195a;
                objPoll = referenceQueue.poll();
                if (objPoll != null) {
                    cVar.j((Reference<T>) objPoll);
                }
            } while (objPoll != null);
            cVar.b(new WeakReference(this, g4Var.f91196b));
            mVar.I.k(this);
        }
    }

    @Override // h5.n1
    public final boolean e(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        c cVar = this.f91147a;
        if (cVar.f150163w) {
            return l3.a(cVar.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // h5.n1
    public final void f(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            a1.h(fArr, fArrL);
        }
    }

    @Override // h5.n1
    public final void g(long j8) {
        m mVar = this.f91149c;
        mVar.getClass();
        if (m.X()) {
            n.f81572b.getClass();
            mVar.z(n.f81573c);
        }
        c cVar = this.f91147a;
        if (!k.c(cVar.f150160t, j8)) {
            cVar.f150160t = j8;
            cVar.f150141a.L((int) (j8 >> 32), (int) (j8 & 4294967295L), cVar.f150161u);
        }
        x4.f91646a.getClass();
        ViewParent parent = mVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(mVar, mVar);
        }
    }

    @Override // h5.n1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo322getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // h5.n1
    public final void h() {
        m mVar = this.f91149c;
        mVar.getClass();
        m.X();
        if (this.f91156j) {
            long j8 = this.f91161o;
            z1.f129046b.getClass();
            if (!z1.b(j8, z1.f129047c) && !m.c(this.f91147a.f150161u, this.f91152f)) {
                c cVar = this.f91147a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f91161o >> 32)) * ((int) (this.f91152f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f91161o & 4294967295L)) * ((int) (this.f91152f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                n4.c.a aVar = n4.c.f123541b;
                if (!n4.c.d(cVar.f150162v, jFloatToRawIntBits)) {
                    cVar.f150162v = jFloatToRawIntBits;
                    cVar.f150141a.D(jFloatToRawIntBits);
                }
            }
            c cVar2 = this.f91147a;
            g6.c cVar3 = this.f91157k;
            o oVar = this.f91158l;
            long j14 = this.f91152f;
            long j15 = cVar2.f150161u;
            d dVar = cVar2.f150141a;
            if (!m.c(j15, j14)) {
                cVar2.f150161u = j14;
                long j16 = cVar2.f150160t;
                k.a aVar2 = k.f76003b;
                dVar.L((int) (j16 >> 32), (int) (4294967295L & j16), j14);
                if (cVar2.f150149i == 9205357640488583168L) {
                    cVar2.f150147g = true;
                    cVar2.a();
                }
            }
            cVar2.f150142b = cVar3;
            cVar2.f150143c = oVar;
            cVar2.f150144d = this.f91167w;
            dVar.getClass();
            dVar.y(cVar2.f150142b, cVar2.f150143c, cVar2, cVar2.f150145e);
            if (this.f91156j) {
                this.f91156j = false;
                mVar.b0(this, false);
            }
        }
    }

    @Override // h5.n1
    public final void i(o1 o1Var) {
        boolean z14;
        e23.a<p005kotlin.Unit> aVar;
        int i14;
        e23.a<p005kotlin.Unit> aVar2;
        int i15 = o1Var.f128902a | this.f91160n;
        this.f91158l = o1Var.f128921v;
        this.f91157k = o1Var.f128920t;
        int i16 = i15 & 4096;
        if (i16 != 0) {
            this.f91161o = o1Var.f128915n;
        }
        if ((i15 & 1) != 0) {
            c cVar = this.f91147a;
            float f14 = o1Var.f128903b;
            d dVar = cVar.f150141a;
            if (dVar.getF150237r() != f14) {
                dVar.v(f14);
            }
        }
        if ((i15 & 2) != 0) {
            c cVar2 = this.f91147a;
            float f15 = o1Var.f128904c;
            d dVar2 = cVar2.f150141a;
            if (dVar2.getF150238s() != f15) {
                dVar2.w(f15);
            }
        }
        if ((i15 & 4) != 0) {
            this.f91147a.f(o1Var.f128905d);
        }
        if ((i15 & 8) != 0) {
            c cVar3 = this.f91147a;
            float f16 = o1Var.f128906e;
            d dVar3 = cVar3.f150141a;
            if (dVar3.getF150239t() != f16) {
                dVar3.x(f16);
            }
        }
        if ((i15 & 16) != 0) {
            c cVar4 = this.f91147a;
            float f17 = o1Var.f128907f;
            d dVar4 = cVar4.f150141a;
            if (dVar4.getF150240u() != f17) {
                dVar4.q(f17);
            }
        }
        if ((i15 & 32) != 0) {
            c cVar5 = this.f91147a;
            float f18 = o1Var.f128908g;
            d dVar5 = cVar5.f150141a;
            if (dVar5.getF150241v() != f18) {
                dVar5.j(f18);
                cVar5.f150147g = true;
                cVar5.a();
            }
            if (o1Var.f128908g > 0.0f && !this.f91166v && (aVar2 = this.f91151e) != null) {
                aVar2.invoke();
            }
        }
        if ((i15 & 64) != 0) {
            c cVar6 = this.f91147a;
            long j8 = o1Var.f128909h;
            d dVar6 = cVar6.f150141a;
            if (!d0.d(j8, dVar6.getF150242w())) {
                dVar6.m(j8);
            }
        }
        if ((i15 & 128) != 0) {
            c cVar7 = this.f91147a;
            long j14 = o1Var.f128910i;
            d dVar7 = cVar7.f150141a;
            if (!d0.d(j14, dVar7.getF150243x())) {
                dVar7.n(j14);
            }
        }
        if ((i15 & 1024) != 0) {
            c cVar8 = this.f91147a;
            float f19 = o1Var.f128913l;
            d dVar8 = cVar8.f150141a;
            if (dVar8.getA() != f19) {
                dVar8.k(f19);
            }
        }
        if ((i15 & 256) != 0) {
            c cVar9 = this.f91147a;
            float f22 = o1Var.f128911j;
            d dVar9 = cVar9.f150141a;
            if (dVar9.getF150244y() != f22) {
                dVar9.h(f22);
            }
        }
        if ((i15 & 512) != 0) {
            c cVar10 = this.f91147a;
            float f24 = o1Var.f128912k;
            d dVar10 = cVar10.f150141a;
            if (dVar10.getF150245z() != f24) {
                dVar10.i(f24);
            }
        }
        if ((i15 & 2048) != 0) {
            c cVar11 = this.f91147a;
            float f25 = o1Var.f128914m;
            d dVar11 = cVar11.f150141a;
            if (dVar11.getF150216v() != f25) {
                dVar11.s(f25);
            }
        }
        if (i16 != 0) {
            long j15 = this.f91161o;
            z1.f129046b.getClass();
            boolean zB = z1.b(j15, z1.f129047c);
            c cVar12 = this.f91147a;
            if (zB) {
                n4.c.f123541b.getClass();
                long j16 = n4.c.f123543d;
                if (!n4.c.d(cVar12.f150162v, j16)) {
                    cVar12.f150162v = j16;
                    cVar12.f150141a.D(j16);
                }
            } else {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f91161o >> 32)) * ((int) (this.f91152f >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f91161o & 4294967295L)) * ((int) (this.f91152f & 4294967295L)))) & 4294967295L);
                n4.c.a aVar3 = n4.c.f123541b;
                if (!n4.c.d(cVar12.f150162v, jFloatToRawIntBits)) {
                    cVar12.f150162v = jFloatToRawIntBits;
                    cVar12.f150141a.D(jFloatToRawIntBits);
                }
            }
        }
        if ((i15 & 16384) != 0) {
            c cVar13 = this.f91147a;
            boolean z15 = o1Var.f128917p;
            if (cVar13.f150163w != z15) {
                cVar13.f150163w = z15;
                cVar13.f150147g = true;
                cVar13.a();
            }
        }
        if ((131072 & i15) != 0) {
            c cVar14 = this.f91147a;
            o4.n1 n1Var = o1Var.f128922w;
            d dVar12 = cVar14.f150141a;
            if (!s.g(dVar12.getB(), n1Var)) {
                dVar12.t(n1Var);
            }
        }
        if ((262144 & i15) != 0) {
            c cVar15 = this.f91147a;
            e0 e0Var = o1Var.f128923x;
            d dVar13 = cVar15.f150141a;
            if (!s.g(dVar13.getF150234o(), e0Var)) {
                dVar13.d(e0Var);
            }
        }
        if ((524288 & i15) != 0) {
            c cVar16 = this.f91147a;
            int i17 = o1Var.f128924y;
            d dVar14 = cVar16.f150141a;
            int f150233n = dVar14.getF150233n();
            q.a aVar4 = q.f128930b;
            if (f150233n != i17) {
                dVar14.l(i17);
            }
        }
        if ((32768 & i15) != 0) {
            c cVar17 = this.f91147a;
            int i18 = o1Var.f128918q;
            n0.f128892b.getClass();
            if (i18 == 0) {
                r4.b.f150137b.getClass();
                i14 = 0;
            } else if (i18 == n0.f128893c) {
                r4.b.f150137b.getClass();
                i14 = r4.b.f150138c;
            } else if (i18 != n0.f128894d) {
                h.z("Not supported composition strategy");
                return;
            } else {
                r4.b.f150137b.getClass();
                i14 = r4.b.f150139d;
            }
            d dVar15 = cVar17.f150141a;
            if (dVar15.getF150235p() != i14) {
                dVar15.O(i14);
            }
        }
        if ((i15 & 7963) != 0) {
            this.f91163q = true;
            this.f91164r = true;
        }
        if (s.g(this.f91162p, o1Var.f128925z)) {
            z14 = false;
        } else {
            b1 b1Var = o1Var.f128925z;
            this.f91162p = b1Var;
            if (b1Var != null) {
                c cVar18 = this.f91147a;
                if (b1Var instanceof b1.b) {
                    n4.d dVar16 = ((b1.b) b1Var).f128812a;
                    float f26 = dVar16.f123547a;
                    float f27 = dVar16.f123548b;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f27)) & 4294967295L) | (((long) Float.floatToRawIntBits(f26)) << 32);
                    n4.c.a aVar5 = n4.c.f123541b;
                    float f28 = dVar16.f123549c - dVar16.f123547a;
                    float f29 = dVar16.f123550d - f27;
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(f28);
                    long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f29)) & 4294967295L;
                    g.a aVar6 = g.f123559b;
                    cVar18.g(jFloatToRawIntBits2, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32), 0.0f);
                } else if (b1Var instanceof b1.a) {
                    f1 f1Var = ((b1.a) b1Var).f128811a;
                    cVar18.e();
                    cVar18.f150152l = f1Var;
                    cVar18.a();
                } else {
                    if (!(b1Var instanceof b1.c)) {
                        u0.r();
                        return;
                    }
                    b1.c cVar19 = (b1.c) b1Var;
                    j jVar = cVar19.f128814b;
                    if (jVar != null) {
                        cVar18.e();
                        cVar18.f150152l = jVar;
                        cVar18.a();
                    } else {
                        n4.e eVar = cVar19.f128813a;
                        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(eVar.f123551a)) << 32) | (((long) Float.floatToRawIntBits(eVar.f123552b)) & 4294967295L);
                        n4.c.a aVar7 = n4.c.f123541b;
                        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(eVar.b())) << 32) | (((long) Float.floatToRawIntBits(eVar.a())) & 4294967295L);
                        g.a aVar8 = g.f123559b;
                        cVar18.g(jFloatToRawIntBits5, jFloatToRawIntBits6, Float.intBitsToFloat((int) (eVar.f123558h >> 32)));
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((b1Var instanceof b1.a) || ((b1Var instanceof b1.c) && !n4.f.d(((b1.c) b1Var).f128813a))) && (aVar = this.f91151e) != null)) {
                    aVar.invoke();
                }
            }
            z14 = true;
        }
        this.f91160n = o1Var.f128902a;
        if (i15 != 0 || z14) {
            x4.f91646a.getClass();
            m mVar = this.f91149c;
            ViewParent parent = mVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(mVar, mVar);
            }
            mVar.getClass();
            if (m.X()) {
                mVar.z(0.0f);
            }
        }
    }

    @Override // h5.n1
    public final void invalidate() {
        if (this.f91156j || this.f91153g) {
            return;
        }
        m mVar = this.f91149c;
        mVar.invalidate();
        if (true != this.f91156j) {
            this.f91156j = true;
            mVar.b0(this, true);
        }
    }

    @Override // h5.n1
    public final void j(n4.b bVar, boolean z14) {
        float[] fArrL = z14 ? l() : m();
        if (this.f91165t) {
            return;
        }
        if (fArrL != null) {
            a1.d(fArrL, bVar);
            return;
        }
        bVar.f123537a = 0.0f;
        bVar.f123538b = 0.0f;
        bVar.f123539c = 0.0f;
        bVar.f123540d = 0.0f;
    }

    @Override // h5.n1
    public final void k(long j8) {
        if (m.c(j8, this.f91152f)) {
            return;
        }
        m mVar = this.f91149c;
        mVar.getClass();
        if (m.X()) {
            n.f81572b.getClass();
            mVar.z(n.f81573c);
        }
        this.f91152f = j8;
        if (this.f91156j || this.f91153g) {
            return;
        }
        mVar.invalidate();
        if (true != this.f91156j) {
            this.f91156j = true;
            mVar.b0(this, true);
        }
    }

    public final float[] l() {
        float[] fArrB = this.f91155i;
        if (fArrB == null) {
            fArrB = a1.b();
            this.f91155i = fArrB;
        }
        if (this.f91164r) {
            this.f91164r = false;
            float[] fArrM = m();
            if (this.f91165t) {
                return fArrM;
            }
            if (!o3.a(fArrM, fArrB)) {
                fArrB[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrB[0])) {
            return null;
        }
        return fArrB;
    }

    public final float[] m() {
        boolean z14 = this.f91163q;
        float[] fArr = this.f91154h;
        if (z14) {
            c cVar = this.f91147a;
            long jB = cVar.f150162v;
            d dVar = cVar.f150141a;
            if ((9223372034707292159L & jB) == 9205357640488583168L) {
                jB = n4.h.b(g6.n.c(this.f91152f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
            float f150239t = dVar.getF150239t();
            float f150240u = dVar.getF150240u();
            float f150244y = dVar.getF150244y();
            float f150245z = dVar.getF150245z();
            float a14 = dVar.getA();
            float f150237r = dVar.getF150237r();
            float f150238s = dVar.getF150238s();
            int i14 = a1.f128807b;
            double d14 = ((double) f150244y) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d14);
            float fCos = (float) Math.cos(d14);
            float f14 = -fSin;
            float f15 = (f150240u * fCos) - (0.0f * fSin);
            float f16 = (0.0f * fCos) + (f150240u * fSin);
            double d15 = ((double) f150245z) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d15);
            float fCos2 = (float) Math.cos(d15);
            float f17 = -fSin2;
            float f18 = fSin * fSin2;
            float f19 = fSin * fCos2;
            float f22 = fCos * fSin2;
            float f24 = fCos * fCos2;
            float f25 = (f16 * fSin2) + (f150239t * fCos2);
            float f26 = (f16 * fCos2) + ((-f150239t) * fSin2);
            double d16 = ((double) a14) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d16);
            float fCos3 = (float) Math.cos(d16);
            float f27 = -fSin3;
            float f28 = (fCos3 * f18) + (f27 * fCos2);
            float f29 = (f18 * fSin3) + (fCos2 * fCos3);
            float f34 = fSin3 * fCos;
            float f35 = f29 * f150237r;
            float f36 = f34 * f150237r;
            float f37 = ((fSin3 * f19) + (fCos3 * f17)) * f150237r;
            float f38 = f28 * f150238s;
            float f39 = fCos * fCos3 * f150238s;
            float f44 = ((fCos3 * f19) + (f27 * f17)) * f150238s;
            float f45 = f22 * 1.0f;
            float f46 = f14 * 1.0f;
            float f47 = f24 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f35;
                fArr[1] = f36;
                fArr[2] = f37;
                fArr[3] = 0.0f;
                fArr[4] = f38;
                fArr[5] = f39;
                fArr[6] = f44;
                fArr[7] = 0.0f;
                fArr[8] = f45;
                fArr[9] = f46;
                fArr[10] = f47;
                fArr[11] = 0.0f;
                float f48 = -fIntBitsToFloat;
                fArr[12] = ((f35 * f48) - (fIntBitsToFloat2 * f38)) + f25 + fIntBitsToFloat;
                fArr[13] = ((f36 * f48) - (fIntBitsToFloat2 * f39)) + f15 + fIntBitsToFloat2;
                fArr[14] = ((f48 * f37) - (fIntBitsToFloat2 * f44)) + f26;
                fArr[15] = 1.0f;
            }
            this.f91163q = false;
            this.f91165t = l1.c(fArr);
        }
        return fArr;
    }
}
