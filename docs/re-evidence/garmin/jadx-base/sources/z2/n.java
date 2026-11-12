package z2;

import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Metadata;
import p006l2.h3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz2/n;", "Lz2/y;", "", "selectableId", "Lkotlin/Function0;", "Lf5/c0;", "coordinatesCallback", "Ls5/q0;", "layoutResultCallback", "<init>", "(JLe23/a;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f201695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<f5.c0> f201696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<s5.q0> f201697c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s5.q0 f201699e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f201698d = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f201700f = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public n(long j8, e23.a<? extends f5.c0> aVar, e23.a<s5.q0> aVar2) {
        this.f201695a = j8;
        this.f201696b = aVar;
        this.f201697c = aVar2;
    }

    @Override // z2.y
    public final n4.d a(int i14) {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke == null) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        int length = q0VarInvoke.f157280a.f157265a.f157138b.length();
        if (length >= 1) {
            return q0VarInvoke.b(j23.t.e(i14, 0, length - 1));
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    @Override // z2.y
    public final float b(int i14) {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke != null) {
            return h3.a(q0VarInvoke, i14);
        }
        return 0.0f;
    }

    @Override // z2.y
    public final float c(int i14) {
        s5.o oVar;
        int iD;
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke != null && (iD = (oVar = q0VarInvoke.f157281b).d(i14)) < oVar.f157257f) {
            return q0VarInvoke.g(iD);
        }
        return -1.0f;
    }

    @Override // z2.y
    public final float d(int i14) {
        s5.o oVar;
        int iD;
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke != null && (iD = (oVar = q0VarInvoke.f157281b).d(i14)) < oVar.f157257f) {
            return q0VarInvoke.h(iD);
        }
        return -1.0f;
    }

    @Override // z2.y
    public final f5.c0 e() {
        f5.c0 c0VarInvoke = this.f201696b.invoke();
        if (c0VarInvoke == null || !c0VarInvoke.isAttached()) {
            return null;
        }
        return c0VarInvoke;
    }

    @Override // z2.y
    public final long f(b0 b0Var, boolean z14) {
        b0.a aVar = b0Var.f201524b;
        b0.a aVar2 = b0Var.f201523a;
        long j8 = this.f201695a;
        if ((z14 && aVar2.f201528c != j8) || (!z14 && aVar.f201528c != j8)) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        if (e() == null) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke != null) {
            return v2.a(q0VarInvoke, j23.t.e(z14 ? aVar2.f201527b : aVar.f201527b, 0, n(q0VarInvoke)), z14, b0Var.f201525c);
        }
        n4.c.f123541b.getClass();
        return n4.c.f123543d;
    }

    @Override // z2.y
    public final int g() {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke == null) {
            return 0;
        }
        return n(q0VarInvoke);
    }

    @Override // z2.y
    public final s5.c getText() {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        return q0VarInvoke == null ? new s5.c("", null, 2, null) : q0VarInvoke.f157280a.f157265a;
    }

    @Override // z2.y
    public final float h(int i14) {
        s5.o oVar;
        int iD;
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke == null || (iD = (oVar = q0VarInvoke.f157281b).d(i14)) >= oVar.f157257f) {
            return -1.0f;
        }
        float f14 = oVar.f(iD);
        return ((oVar.b(iD) - f14) / 2) + f14;
    }

    @Override // z2.y
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getF201695a() {
        return this.f201695a;
    }

    @Override // z2.y
    public final long j(int i14) {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke == null) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        s5.o oVar = q0VarInvoke.f157281b;
        int iN = n(q0VarInvoke);
        if (iN < 1) {
            s5.w0.f157315b.getClass();
            return s5.w0.f157316c;
        }
        int iD = oVar.d(j23.t.e(i14, 0, iN - 1));
        return og.a.l(q0VarInvoke.i(iD), oVar.c(iD, true));
    }

    @Override // z2.y
    public final s5.q0 k() {
        return this.f201697c.invoke();
    }

    @Override // z2.y
    public final void l(z0 z0Var) {
        s5.q0 q0VarInvoke;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        z0 z0Var2;
        h hVarA;
        h hVar5;
        h hVar6;
        h hVarA2;
        h hVar7;
        int i14;
        int i15;
        b0.a aVar;
        b0.a aVar2;
        f5.c0 c0VarE = e();
        if (c0VarE == null || (q0VarInvoke = this.f201697c.invoke()) == null) {
            return;
        }
        f5.c0 c0Var = z0Var.f201856c;
        boolean z14 = z0Var.f201857d;
        n4.c.f123541b.getClass();
        long jB0 = c0Var.b0(c0VarE, 0L);
        long jI = n4.c.i(z0Var.f201854a, jB0);
        long j8 = z0Var.f201855b;
        long jI2 = (j8 & 9223372034707292159L) == 9205357640488583168L ? n4.c.f123543d : n4.c.i(j8, jB0);
        long j14 = q0VarInvoke.f157282c;
        n4.d dVar = new n4.d(0.0f, 0.0f, (int) (j14 >> 32), (int) (j14 & 4294967295L));
        int i16 = (int) (jI >> 32);
        if (Float.intBitsToFloat(i16) < dVar.f123547a) {
            hVar = h.BEFORE;
        } else {
            hVar = Float.intBitsToFloat(i16) > dVar.f123549c ? h.AFTER : h.ON;
        }
        int i17 = (int) (jI & 4294967295L);
        if (Float.intBitsToFloat(i17) < dVar.f123548b) {
            hVar2 = h.BEFORE;
        } else {
            hVar2 = Float.intBitsToFloat(i17) > dVar.f123550d ? h.AFTER : h.ON;
        }
        Comparator<Long> comparator = z0Var.f201859f;
        b0 b0Var = z0Var.f201858e;
        long j15 = this.f201695a;
        if (z14) {
            h hVar8 = hVar;
            hVar3 = hVar2;
            hVar4 = hVar8;
            z0Var2 = z0Var;
            hVar6 = hVar4;
            hVarA2 = o.a(hVar4, hVar3, z0Var, j15, b0Var != null ? b0Var.f201524b : null);
            hVar5 = hVarA2;
            hVarA = hVar3;
            hVar7 = hVar5;
        } else {
            h hVar9 = hVar;
            hVar3 = hVar2;
            hVar4 = hVar9;
            z0Var2 = z0Var;
            hVarA = o.a(hVar4, hVar3, z0Var2, j15, b0Var != null ? b0Var.f201523a : null);
            hVar5 = hVar4;
            hVar6 = hVarA;
            hVarA2 = hVar6;
            hVar7 = hVar3;
        }
        h hVarB = a1.b(hVar4, hVar3);
        if (hVarB == h.ON || hVarB != hVarA2) {
            int length = q0VarInvoke.f157280a.f157265a.f157138b.length();
            if (z14) {
                int iB = o.b(jI, q0VarInvoke);
                if (b0Var == null || (aVar2 = b0Var.f201524b) == null) {
                    length = iB;
                } else {
                    int iCompare = comparator.compare(Long.valueOf(aVar2.f201528c), Long.valueOf(j15));
                    if (iCompare < 0) {
                        length = 0;
                    } else if (iCompare <= 0) {
                        length = aVar2.f201527b;
                    }
                }
                i15 = length;
                i14 = iB;
            } else {
                int iB2 = o.b(jI, q0VarInvoke);
                if (b0Var == null || (aVar = b0Var.f201523a) == null) {
                    length = iB2;
                } else {
                    int iCompare2 = comparator.compare(Long.valueOf(aVar.f201528c), Long.valueOf(j15));
                    if (iCompare2 < 0) {
                        length = 0;
                    } else if (iCompare2 <= 0) {
                        length = aVar.f201527b;
                    }
                }
                i14 = length;
                i15 = iB2;
            }
            int iB3 = (jI2 & 9223372034707292159L) == 9205357640488583168 ? -1 : o.b(jI2, q0VarInvoke);
            int i18 = z0Var2.f201864k + 2;
            z0Var2.f201864k = i18;
            z zVar = new z(j15, i18, i14, i15, iB3, q0VarInvoke);
            z0Var.f201862i = z0Var.a(z0Var.f201862i, hVar6, hVarA);
            z0Var.f201863j = z0Var.a(z0Var.f201863j, hVar5, hVar7);
            p1.k0 k0Var = z0Var.f201860g;
            ArrayList arrayList = z0Var.f201861h;
            k0Var.e(arrayList.size(), j15);
            arrayList.add(zVar);
        }
    }

    @Override // z2.y
    public final b0 m() {
        s5.q0 q0VarInvoke = this.f201697c.invoke();
        if (q0VarInvoke == null) {
            return null;
        }
        int length = q0VarInvoke.f157280a.f157265a.f157138b.length();
        d6.g gVarA = q0VarInvoke.a(0);
        long j8 = this.f201695a;
        return new b0(new b0.a(gVarA, 0, j8), new b0.a(q0VarInvoke.a(Math.max(length - 1, 0)), length, j8), false);
    }

    public final int n(s5.q0 q0Var) {
        int i14;
        int iE;
        synchronized (this.f201698d) {
            try {
                if (this.f201699e != q0Var) {
                    if (q0Var.d()) {
                        s5.o oVar = q0Var.f157281b;
                        if (oVar.f157254c) {
                            iE = q0Var.f157281b.f157257f - 1;
                        } else {
                            iE = oVar.e((int) (q0Var.f157282c & 4294967295L));
                            int i15 = q0Var.f157281b.f157257f - 1;
                            if (iE > i15) {
                                iE = i15;
                            }
                            while (iE >= 0 && q0Var.f157281b.f(iE) >= ((int) (q0Var.f157282c & 4294967295L))) {
                                iE--;
                            }
                            if (iE < 0) {
                                iE = 0;
                            }
                        }
                    } else {
                        iE = q0Var.f157281b.f157257f - 1;
                    }
                    this.f201700f = q0Var.f157281b.c(iE, true);
                    this.f201699e = q0Var;
                }
                i14 = this.f201700f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i14;
    }
}
