package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/m;", "Lh5/c0;", "Lh4/r$c;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22743b;

    public m(float f14, boolean z14) {
        this.f22742a = f14;
        this.f22743b = z14;
    }

    public final long U1(long j8, boolean z14) {
        int iRound;
        int i14 = g6.a.i(j8);
        if (i14 == Integer.MAX_VALUE || (iRound = Math.round(i14 * this.f22742a)) <= 0 || (z14 && !l.q(iRound, i14, j8))) {
            g6.m.f76012b.getClass();
            return 0L;
        }
        long j14 = (((long) iRound) << 32) | (((long) i14) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return j14;
    }

    public final long V1(long j8, boolean z14) {
        int iRound;
        int iJ = g6.a.j(j8);
        if (iJ == Integer.MAX_VALUE || (iRound = Math.round(iJ / this.f22742a)) <= 0 || (z14 && !l.q(iJ, iRound, j8))) {
            g6.m.f76012b.getClass();
            return 0L;
        }
        long j14 = (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return j14;
    }

    public final long W1(long j8, boolean z14) {
        int iK = g6.a.k(j8);
        int iRound = Math.round(iK * this.f22742a);
        if (iRound <= 0 || (z14 && !l.q(iRound, iK, j8))) {
            g6.m.f76012b.getClass();
            return 0L;
        }
        long j14 = (((long) iRound) << 32) | (((long) iK) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return j14;
    }

    public final long X1(long j8, boolean z14) {
        int iL = g6.a.l(j8);
        int iRound = Math.round(iL / this.f22742a);
        if (iRound <= 0 || (z14 && !l.q(iL, iRound, j8))) {
            g6.m.f76012b.getClass();
            return 0L;
        }
        long j14 = (((long) iL) << 32) | (((long) iRound) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return j14;
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return i14 != Integer.MAX_VALUE ? Math.round(i14 / this.f22742a) : wVar.a0(i14);
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return i14 != Integer.MAX_VALUE ? Math.round(i14 * this.f22742a) : wVar.l0(i14);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        long jU1;
        if (this.f22743b) {
            jU1 = U1(j8, true);
            g6.m.f76012b.getClass();
            if (g6.m.c(jU1, 0L)) {
                jU1 = V1(j8, true);
                if (g6.m.c(jU1, 0L)) {
                    jU1 = W1(j8, true);
                    if (g6.m.c(jU1, 0L)) {
                        jU1 = X1(j8, true);
                        if (g6.m.c(jU1, 0L)) {
                            jU1 = U1(j8, false);
                            if (g6.m.c(jU1, 0L)) {
                                jU1 = V1(j8, false);
                                if (g6.m.c(jU1, 0L)) {
                                    jU1 = W1(j8, false);
                                    if (g6.m.c(jU1, 0L)) {
                                        jU1 = X1(j8, false);
                                        if (g6.m.c(jU1, 0L)) {
                                            g6.m.f76012b.getClass();
                                            jU1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jU1 = V1(j8, true);
            g6.m.f76012b.getClass();
            if (g6.m.c(jU1, 0L)) {
                jU1 = U1(j8, true);
                if (g6.m.c(jU1, 0L)) {
                    jU1 = X1(j8, true);
                    if (g6.m.c(jU1, 0L)) {
                        jU1 = W1(j8, true);
                        if (g6.m.c(jU1, 0L)) {
                            jU1 = V1(j8, false);
                            if (g6.m.c(jU1, 0L)) {
                                jU1 = U1(j8, false);
                                if (g6.m.c(jU1, 0L)) {
                                    jU1 = X1(j8, false);
                                    if (g6.m.c(jU1, 0L)) {
                                        jU1 = W1(j8, false);
                                        if (g6.m.c(jU1, 0L)) {
                                            g6.m.f76012b.getClass();
                                            jU1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        g6.m.f76012b.getClass();
        if (!g6.m.c(jU1, 0L)) {
            g6.a.f75987b.getClass();
            j8 = g6.a.C1525a.c((int) (jU1 >> 32), (int) (4294967295L & jU1));
        }
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 2));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(f5.x xVar, f5.w wVar, int i14) {
        return i14 != Integer.MAX_VALUE ? Math.round(i14 / this.f22742a) : wVar.e0(i14);
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(f5.x xVar, f5.w wVar, int i14) {
        return i14 != Integer.MAX_VALUE ? Math.round(i14 * this.f22742a) : wVar.O(i14);
    }
}
