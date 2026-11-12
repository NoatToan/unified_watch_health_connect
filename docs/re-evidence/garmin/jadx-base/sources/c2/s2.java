package c2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/s2;", "Lf5/z0;", "Lc2/o2;", "Lc2/j$e;", "horizontalArrangement", "Lh4/d$c;", "verticalAlignment", "<init>", "(Lc2/j$e;Lh4/d$c;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class s2 implements f5.z0, o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j.e f22871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.d.c f22872b;

    public s2(j.e eVar, h4.d.c cVar) {
        this.f22871a = eVar;
        this.f22872b = cVar;
    }

    @Override // c2.o2
    public final int a(f5.v1 v1Var) {
        return v1Var.f69145b;
    }

    @Override // c2.o2
    public final int b(f5.v1 v1Var) {
        return v1Var.f69144a;
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        p1 p1Var = p1.f22810a;
        int iF0 = xVar.f0(this.f22871a.getF22711d());
        p1Var.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f14 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            f5.w wVar = list.get(i16);
            float fN = l.n(l.m(wVar));
            int iO = wVar.O(i14);
            if (fN == 0.0f) {
                i15 += iO;
            } else if (fN > 0.0f) {
                f14 += fN;
                iMax = Math.max(iMax, Math.round(iO / fN));
            }
        }
        return ((list.size() - 1) * iF0) + Math.round(iMax * f14) + i15;
    }

    @Override // c2.o2
    public final long d(int i14, int i15, int i16, int i17, boolean z14) {
        s2 s2Var = q2.f22847a;
        if (!z14) {
            return g6.b.a(i14, i16, i15, i17);
        }
        g6.a.f75987b.getClass();
        return g6.a.C1525a.b(i14, i16, i15, i17);
    }

    @Override // c2.o2
    public final f5.a1 e(f5.v1[] v1VarArr, f5.b1 b1Var, int i14, int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int i19) {
        return f5.b1.h0(b1Var, i15, i16, new r2(v1VarArr, this, i16, i14, iArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return p005kotlin.jvm.internal.s.g(this.f22871a, s2Var.f22871a) && p005kotlin.jvm.internal.s.g(this.f22872b, s2Var.f22872b);
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        return l.r(this, g6.a.l(j8), g6.a.k(j8), g6.a.j(j8), g6.a.i(j8), b1Var.f0(this.f22871a.getF22711d()), b1Var, list, new f5.v1[list.size()], 0, list.size(), null, 0);
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        p1 p1Var = p1.f22810a;
        int iF0 = xVar.f0(this.f22871a.getF22711d());
        p1Var.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iF0, i14);
        int size = list.size();
        int iMax = 0;
        float f14 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            f5.w wVar = list.get(i15);
            float fN = l.n(l.m(wVar));
            if (fN == 0.0f) {
                int iMin2 = Math.min(wVar.l0(Integer.MAX_VALUE), i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i14 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, wVar.e0(iMin2));
            } else if (fN > 0.0f) {
                f14 += fN;
            }
        }
        int iRound = f14 == 0.0f ? 0 : i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i14 - iMin, 0) / f14);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f5.w wVar2 = list.get(i16);
            float fN2 = l.n(l.m(wVar2));
            if (fN2 > 0.0f) {
                iMax = Math.max(iMax, wVar2.e0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fN2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        p1 p1Var = p1.f22810a;
        int iF0 = xVar.f0(this.f22871a.getF22711d());
        p1Var.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iF0, i14);
        int size = list.size();
        int iMax = 0;
        float f14 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            f5.w wVar = list.get(i15);
            float fN = l.n(l.m(wVar));
            if (fN == 0.0f) {
                int iMin2 = Math.min(wVar.l0(Integer.MAX_VALUE), i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i14 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, wVar.a0(iMin2));
            } else if (fN > 0.0f) {
                f14 += fN;
            }
        }
        int iRound = f14 == 0.0f ? 0 : i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i14 - iMin, 0) / f14);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            f5.w wVar2 = list.get(i16);
            float fN2 = l.n(l.m(wVar2));
            if (fN2 > 0.0f) {
                iMax = Math.max(iMax, wVar2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fN2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f22872b.hashCode() + (this.f22871a.hashCode() * 31);
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        p1 p1Var = p1.f22810a;
        int iF0 = xVar.f0(this.f22871a.getF22711d());
        p1Var.getClass();
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f14 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            f5.w wVar = list.get(i16);
            float fN = l.n(l.m(wVar));
            int iL0 = wVar.l0(i14);
            if (fN == 0.0f) {
                i15 += iL0;
            } else if (fN > 0.0f) {
                f14 += fN;
                iMax = Math.max(iMax, Math.round(iL0 / fN));
            }
        }
        return ((list.size() - 1) * iF0) + Math.round(iMax * f14) + i15;
    }

    @Override // c2.o2
    public final void j(int i14, int[] iArr, int[] iArr2, f5.b1 b1Var) {
        this.f22871a.b(b1Var, i14, iArr, b1Var.getF68910b(), iArr2);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f22871a + ", verticalAlignment=" + this.f22872b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
