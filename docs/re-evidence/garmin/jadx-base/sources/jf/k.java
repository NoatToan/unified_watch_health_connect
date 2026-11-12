package jf;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f5.g2;
import o4.e0;
import p005kotlin.Metadata;
import p3.a2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljf/k;", "Lt4/d;", TtmlNode.START, TtmlNode.END, "Lf5/k;", "contentScale", "Le53/c;", "duration", "Le53/p;", "timeSource", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(Lt4/d;Lt4/d;Lf5/k;JLe53/p;ZZLkotlin/jvm/internal/j;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends t4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.d f98663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5.k f98664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e53.p f98666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f98667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f98668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e53.b f98669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f98670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f98671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f98672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t4.d f98673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f98674l;

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    private k(t4.d dVar, t4.d dVar2, f5.k kVar, long j8, e53.p pVar, boolean z14, boolean z15) {
        long jFloatToRawIntBits;
        this.f98663a = dVar2;
        this.f98664b = kVar;
        this.f98665c = j8;
        this.f98666d = pVar;
        this.f98667e = z14;
        this.f98668f = new a2(0);
        this.f98671i = 1.0f;
        this.f98673k = dVar;
        long f98674l = 0;
        if (dVar != null) {
            jFloatToRawIntBits = dVar.getF162260d();
        } else {
            n4.g.f123559b.getClass();
            jFloatToRawIntBits = 0;
        }
        if (dVar2 != null) {
            f98674l = dVar2.getF162260d();
        } else {
            n4.g.f123559b.getClass();
        }
        boolean z16 = jFloatToRawIntBits != 9205357640488583168L;
        boolean z17 = f98674l != 9205357640488583168L;
        if (z16 && z17) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (f98674l >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (f98674l & 4294967295L))))));
            n4.g.a aVar = n4.g.f123559b;
        } else if (!z15) {
            n4.g.f123559b.getClass();
            jFloatToRawIntBits = n4.g.f123560c;
        } else if (!z16) {
            if (z17) {
                jFloatToRawIntBits = f98674l;
            } else {
                n4.g.f123559b.getClass();
                jFloatToRawIntBits = n4.g.f123560c;
            }
        }
        this.f98674l = jFloatToRawIntBits;
    }

    public final void a(q4.f fVar, t4.d dVar, float f14) {
        if (dVar == null || f14 <= 0.0f) {
            return;
        }
        long jB = fVar.b();
        long f98674l = dVar.getF162260d();
        long jA = (f98674l == 9205357640488583168L || n4.g.h(f98674l) || jB == 9205357640488583168L || n4.g.h(jB)) ? jB : g2.a(f98674l, this.f98664b.a(f98674l, jB));
        if (jB == 9205357640488583168L || n4.g.h(jB)) {
            dVar.m501drawx_KDEd0(fVar, jA, f14, this.f98672j);
            return;
        }
        float f15 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jB >> 32)) - Float.intBitsToFloat((int) (jA >> 32))) / f15;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jB & 4294967295L)) - Float.intBitsToFloat((int) (jA & 4294967295L))) / f15;
        fVar.getF142543b().f142550a.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            dVar.m501drawx_KDEd0(fVar, jA, f14, this.f98672j);
        } finally {
            float f16 = -fIntBitsToFloat;
            float f17 = -fIntBitsToFloat2;
            fVar.getF142543b().f142550a.e(f16, f17, f16, f17);
        }
    }

    @Override // t4.d
    public final boolean applyAlpha(float f14) {
        this.f98671i = f14;
        return true;
    }

    @Override // t4.d
    public final boolean applyColorFilter(e0 e0Var) {
        this.f98672j = e0Var;
        return true;
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public final long getF162260d() {
        return this.f98674l;
    }

    @Override // t4.d
    public final void onDraw(q4.f fVar) {
        boolean z14 = this.f98670h;
        t4.d dVar = this.f98663a;
        if (z14) {
            a(fVar, dVar, this.f98671i);
            return;
        }
        e53.b bVarA = this.f98669g;
        if (bVarA == null) {
            bVarA = this.f98666d.a();
            this.f98669g = bVarA;
        }
        float fE = e53.c.e(bVarA.k2()) / e53.c.e(this.f98665c);
        float fD = j23.t.d(fE, 0.0f, 1.0f);
        float f14 = this.f98671i;
        float f15 = fD * f14;
        if (this.f98667e) {
            f14 -= f15;
        }
        this.f98670h = fE >= 1.0f;
        a(fVar, this.f98673k, f14);
        a(fVar, dVar, f15);
        if (this.f98670h) {
            this.f98673k = null;
        } else {
            a2 a2Var = this.f98668f;
            a2Var.t(a2Var.getIntValue() + 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(t4.d dVar, t4.d dVar2, f5.k kVar, long j8, e53.p pVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        long jE;
        if ((i14 & 4) != 0) {
            f5.k.f68985a.getClass();
            kVar = f5.k.a.f68988c;
        }
        f5.k kVar2 = kVar;
        if ((i14 & 8) != 0) {
            e53.c.a aVar = e53.c.f63094b;
            jE = e53.e.e(200, e53.f.MILLISECONDS);
        } else {
            jE = j8;
        }
        this(dVar, dVar2, kVar2, jE, (i14 & 16) != 0 ? e53.p.a.f63127a : pVar, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15, null);
    }

    public /* synthetic */ k(t4.d dVar, t4.d dVar2, f5.k kVar, long j8, e53.p pVar, boolean z14, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(dVar, dVar2, kVar, j8, pVar, z14, z15);
    }
}
