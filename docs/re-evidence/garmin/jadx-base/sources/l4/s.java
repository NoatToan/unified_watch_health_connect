package l4;

import ch.qos.logback.core.CoreConstants;
import f5.a1;
import f5.b1;
import f5.g2;
import f5.v1;
import f5.x;
import f5.y0;
import h5.c0;
import h5.h0;
import o4.e0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll4/s;", "Lh5/c0;", "Lh4/r$c;", "Lh5/s;", "Lt4/d;", "painter", "", "sizeToIntrinsics", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "<init>", "(Lt4/d;ZLh4/d;Lf5/k;FLo4/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends h4.r.c implements c0, h5.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t4.d f109863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h4.d f109865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f5.k f109866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f109867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f109868f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1 f109869a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1 v1Var) {
            super(1);
            this.f109869a = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            v1.a.B(aVar, this.f109869a, 0, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(t4.d dVar, boolean z14, h4.d dVar2, f5.k kVar, float f14, e0 e0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            h4.d.f81522a.getClass();
            dVar2 = h4.d.a.f81528f;
        }
        h4.d dVar3 = dVar2;
        if ((i14 & 8) != 0) {
            f5.k.f68985a.getClass();
            kVar = f5.k.a.f68991f;
        }
        this(dVar, z14, dVar3, kVar, (i14 & 16) != 0 ? 1.0f : f14, (i14 & 32) != 0 ? null : e0Var);
    }

    public static boolean V1(long j8) {
        n4.g.f123559b.getClass();
        return !n4.g.c(j8, n4.g.f123560c) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean W1(long j8) {
        n4.g.f123559b.getClass();
        return !n4.g.c(j8, n4.g.f123560c) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean U1() {
        return this.f109864b && this.f109863a.getF162260d() != 9205357640488583168L;
    }

    public final long X1(long j8) {
        boolean z14 = false;
        boolean z15 = g6.a.f(j8) && g6.a.e(j8);
        if (g6.a.h(j8) && g6.a.g(j8)) {
            z14 = true;
        }
        if ((!U1() && z15) || z14) {
            return g6.a.c(g6.a.j(j8), 0, g6.a.i(j8), 0, 10, j8);
        }
        long jMo54getIntrinsicSizeNHjbRc = this.f109863a.getF162260d();
        int iRound = W1(jMo54getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc >> 32))) : g6.a.l(j8);
        int iRound2 = V1(jMo54getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc & 4294967295L))) : g6.a.k(j8);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g6.b.f(iRound2, j8))) & 4294967295L) | (((long) Float.floatToRawIntBits(g6.b.g(iRound, j8))) << 32);
        if (U1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!W1(this.f109863a.getF162260d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f109863a.getF162260d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!V1(this.f109863a.getF162260d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f109863a.getF162260d() & 4294967295L)))) & 4294967295L);
            if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                n4.g.f123559b.getClass();
                jFloatToRawIntBits = 0;
            } else {
                jFloatToRawIntBits = g2.a(jFloatToRawIntBits2, this.f109866d.a(jFloatToRawIntBits2, jFloatToRawIntBits));
            }
        }
        return g6.a.c(g6.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j8), 0, g6.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j8), 0, 10, j8);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(x xVar, f5.w wVar, int i14) {
        if (!U1()) {
            return wVar.a0(i14);
        }
        long jX1 = X1(g6.b.b(i14, 0, 13));
        return Math.max(g6.a.k(jX1), wVar.a0(i14));
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(x xVar, f5.w wVar, int i14) {
        if (!U1()) {
            return wVar.l0(i14);
        }
        long jX1 = X1(g6.b.b(0, i14, 7));
        return Math.max(g6.a.l(jX1), wVar.l0(i14));
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        v1 v1VarQ = y0Var.Q(X1(j8));
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a(v1VarQ));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(x xVar, f5.w wVar, int i14) {
        if (!U1()) {
            return wVar.e0(i14);
        }
        long jX1 = X1(g6.b.b(i14, 0, 13));
        return Math.max(g6.a.k(jX1), wVar.e0(i14));
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(x xVar, f5.w wVar, int i14) {
        if (!U1()) {
            return wVar.O(i14);
        }
        long jX1 = X1(g6.b.b(0, i14, 7));
        return Math.max(g6.a.l(jX1), wVar.O(i14));
    }

    @Override // h5.s
    public final void p(h0 h0Var) {
        long jA;
        q4.a aVar = h0Var.f81825a;
        long jMo54getIntrinsicSizeNHjbRc = this.f109863a.getF162260d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(W1(jMo54getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (aVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(V1(jMo54getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo54getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (aVar.b() & 4294967295L)))) & 4294967295L);
        if (Float.intBitsToFloat((int) (aVar.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (aVar.b() & 4294967295L)) == 0.0f) {
            n4.g.f123559b.getClass();
            jA = 0;
        } else {
            jA = g2.a(jFloatToRawIntBits, this.f109866d.a(jFloatToRawIntBits, aVar.b()));
        }
        h4.d dVar = this.f109865c;
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
        g6.m.a aVar2 = g6.m.f76012b;
        long jA2 = dVar.a(jRound, (((long) Math.round(Float.intBitsToFloat((int) (aVar.b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (aVar.b() & 4294967295L)))) & 4294967295L), h0Var.getLayoutDirection());
        g6.k.a aVar3 = g6.k.f76003b;
        float f14 = (int) (jA2 >> 32);
        float f15 = (int) (jA2 & 4294967295L);
        aVar.f142543b.f142550a.h(f14, f15);
        try {
            this.f109863a.m501drawx_KDEd0(h0Var, jA, this.f109867e, this.f109868f);
            aVar.f142543b.f142550a.h(-f14, -f15);
            h0Var.m1();
        } catch (Throwable th3) {
            aVar.f142543b.f142550a.h(-f14, -f15);
            throw th3;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f109863a + ", sizeToIntrinsics=" + this.f109864b + ", alignment=" + this.f109865c + ", alpha=" + this.f109867e + ", colorFilter=" + this.f109868f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public s(t4.d dVar, boolean z14, h4.d dVar2, f5.k kVar, float f14, e0 e0Var) {
        this.f109863a = dVar;
        this.f109864b = z14;
        this.f109865c = dVar2;
        this.f109866d = kVar;
        this.f109867e = f14;
        this.f109868f = e0Var;
    }
}
