package u1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu1/o;", "Lh5/s;", "Lh4/r$c;", "Lh5/i1;", "Lh5/y1;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lo4/w;", "brush", "", "alpha", "Lo4/r1;", "shape", "<init>", "(JLo4/w;FLo4/r1;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends h4.r.c implements h5.s, h5.i1, h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f167637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o4.w f167638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f167639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o4.r1 f167640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f167641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g6.o f167642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o4.b1 f167643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o4.r1 f167644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o4.b1 f167645i;

    private o(long j8, o4.w wVar, float f14, o4.r1 r1Var) {
        this.f167637a = j8;
        this.f167638b = wVar;
        this.f167639c = f14;
        this.f167640d = r1Var;
        n4.g.f123559b.getClass();
        this.f167641e = n4.g.f123560c;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        p5.h0.y(k0Var, this.f167640d);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.y1
    public final boolean o1() {
        return false;
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        o4.b1 b1Var;
        o4.w wVar;
        o4.f1 f1Var;
        q4.a aVar = h0Var.f81825a;
        if (this.f167640d == o4.m1.f128891a) {
            long j8 = this.f167637a;
            o4.d0.f128823b.getClass();
            if (!o4.d0.d(j8, o4.d0.f128832k)) {
                q4.f.A0(h0Var, this.f167637a, 0L, 0L, 0.0f, null, null, 126);
            }
            o4.w wVar2 = this.f167638b;
            if (wVar2 != null) {
                q4.f.C0(h0Var, wVar2, 0L, 0L, this.f167639c, null, 0, 118);
            }
        } else {
            if (n4.g.c(aVar.b(), this.f167641e) && h0Var.getLayoutDirection() == this.f167642f && p005kotlin.jvm.internal.s.g(this.f167644h, this.f167640d)) {
                b1Var = this.f167643g;
                b1Var.getClass();
            } else {
                h5.j1.a(this, new tb0.d(18, this, h0Var));
                b1Var = this.f167645i;
                this.f167645i = null;
            }
            this.f167643g = b1Var;
            this.f167641e = aVar.b();
            this.f167642f = h0Var.getLayoutDirection();
            this.f167644h = this.f167640d;
            b1Var.getClass();
            long j14 = this.f167637a;
            o4.d0.f128823b.getClass();
            if (!o4.d0.d(j14, o4.d0.f128832k)) {
                o4.c1.a(h0Var, b1Var, this.f167637a);
            }
            o4.w wVar3 = this.f167638b;
            if (wVar3 != null) {
                float f14 = this.f167639c;
                q4.j jVar = q4.j.f142560a;
                q4.f.f142555o0.getClass();
                int i14 = q4.f.a.f142557b;
                if (b1Var instanceof o4.b1.b) {
                    n4.d dVar = ((o4.b1.b) b1Var).f128812a;
                    float f15 = dVar.f123547a;
                    float f16 = dVar.f123548b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f15);
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f16)) & 4294967295L;
                    n4.c.a aVar2 = n4.c.f123541b;
                    h0Var.z(wVar3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), o4.c1.b(dVar), f14, jVar, i14);
                } else {
                    if (b1Var instanceof o4.b1.c) {
                        o4.b1.c cVar = (o4.b1.c) b1Var;
                        wVar = wVar3;
                        f1Var = cVar.f128814b;
                        if (f1Var == null) {
                            n4.e eVar = cVar.f128813a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f123558h >> 32));
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(eVar.f123551a)) << 32) | (((long) Float.floatToRawIntBits(eVar.f123552b)) & 4294967295L);
                            n4.c.a aVar3 = n4.c.f123541b;
                            float fB = eVar.b();
                            h0Var.q1(wVar, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(eVar.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f14, jVar, i14);
                        }
                    } else if (!(b1Var instanceof o4.b1.a)) {
                        lc.u0.r();
                        return;
                    } else {
                        o4.f1 f1Var2 = ((o4.b1.a) b1Var).f128811a;
                        wVar = wVar3;
                        f1Var = f1Var2;
                    }
                    h0Var.L1(f1Var, wVar, f14, jVar, i14);
                }
            }
        }
        h0Var.m1();
    }

    @Override // h5.i1
    public final void x1() {
        n4.g.f123559b.getClass();
        this.f167641e = n4.g.f123560c;
        this.f167642f = null;
        this.f167643g = null;
        this.f167644h = null;
        h5.t.a(this);
    }

    public /* synthetic */ o(long j8, o4.w wVar, float f14, o4.r1 r1Var, p005kotlin.jvm.internal.j jVar) {
        this(j8, wVar, f14, r1Var);
    }
}
