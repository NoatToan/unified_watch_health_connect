package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li3/pa;", "Lf5/z0;", "Lkotlin/Function1;", "Ln4/g;", "", "onLabelMeasured", "", "singleLine", "Li3/fh;", "labelPosition", "Ll3/x0;", "labelProgress", "Lc2/h2;", "paddingValues", "Lg6/f;", "horizontalIconPadding", "<init>", "(Le23/l;ZLi3/fh;Ll3/x0;Lc2/h2;FLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pa implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<n4.g, Unit> f89297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fh f89299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l3.x0 f89300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2.h2 f89301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f89302f;

    /* JADX WARN: Multi-variable type inference failed */
    private pa(e23.l<? super n4.g, Unit> lVar, boolean z14, fh fhVar, l3.x0 x0Var, c2.h2 h2Var, float f14) {
        this.f89297a = lVar;
        this.f89298b = z14;
        this.f89299c = fhVar;
        this.f89300d = x0Var;
        this.f89301e = h2Var;
        this.f89302f = f14;
    }

    public static final int j(int i14, pa paVar, int i15, int i16, f5.v1 v1Var, f5.v1 v1Var2) {
        if (paVar.f89298b) {
            h4.d.f81522a.getClass();
            i16 = h4.d.a.f81534l.a(v1Var2.f69145b, i15);
        }
        int i17 = i14 + i16;
        if (paVar.f89299c instanceof fh.a) {
            return i17;
        }
        return Math.max(i17, (v1Var != null ? v1Var.f69145b : 0) / 2);
    }

    public final int a(f5.x xVar, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, long j8, boolean z14, float f14) {
        int iC = r13.b.c(i18, i24, i16, i17, z14 ? 0 : gl.b.K(i19, 0, f14));
        c2.h2 h2Var = this.f89301e;
        float fS0 = xVar.s0(h2Var.getF22737b());
        if (!z14) {
            fS0 = gl.b.J(fS0, Math.max(fS0, i19 / 2.0f), f14);
        }
        float fS1 = fS0 + iC + xVar.s0(h2Var.getF22739d());
        if (!z14) {
            i19 = 0;
        }
        return g6.b.f(Math.max(i14, Math.max(i15, MathKt.c(fS1))) + i19 + i25, j8);
    }

    public final int b(f5.x xVar, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j8, float f14) {
        int i25 = i16 + i17;
        int iMax = Math.max(i18 + i25, Math.max(i24 + i25, gl.b.K(i19, 0, f14))) + i14 + i15;
        g6.o oVar = g6.o.Ltr;
        c2.h2 h2Var = this.f89301e;
        float fC = h2Var.c(oVar) + h2Var.b(oVar);
        g6.f.a aVar = g6.f.f75994b;
        return g6.b.g(Math.max(iMax, MathKt.c((i19 + xVar.s0(fC)) * f14)), j8);
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        return e(xVar, list, i14, new ho2.o(18));
    }

    public final int d(f5.x xVar, List<? extends f5.w> list, int i14, e23.p<? super f5.w, ? super Integer, Integer> pVar) {
        f5.w wVar;
        int i15;
        int iIntValue;
        f5.w wVar2;
        int iIntValue2;
        f5.w wVar3;
        f5.w wVar4;
        int iIntValue3;
        f5.w wVar5;
        int iIntValue4;
        f5.w wVar6;
        f5.w wVar7;
        pa paVar = this;
        float fInvoke = paVar.f89300d.invoke();
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                wVar = null;
                break;
            }
            wVar = list.get(i16);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar), "Leading")) {
                break;
            }
            i16++;
        }
        f5.w wVar8 = wVar;
        if (wVar8 != null) {
            i15 = l3.k.i(i14, wVar8.l0(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(wVar8, Integer.valueOf(i14)).intValue();
        } else {
            i15 = i14;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                wVar2 = null;
                break;
            }
            wVar2 = list.get(i17);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar2), "Trailing")) {
                break;
            }
            i17++;
        }
        f5.w wVar9 = wVar2;
        if (wVar9 != null) {
            i15 = l3.k.i(i15, wVar9.l0(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(wVar9, Integer.valueOf(i14)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                wVar3 = null;
                break;
            }
            wVar3 = list.get(i18);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar3), "Label")) {
                break;
            }
            i18++;
        }
        f5.w wVar10 = wVar3;
        int iIntValue5 = wVar10 != null ? pVar.invoke(wVar10, Integer.valueOf(gl.b.K(i15, i14, fInvoke))).intValue() : 0;
        int size4 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                wVar4 = null;
                break;
            }
            wVar4 = list.get(i19);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar4), "Prefix")) {
                break;
            }
            i19++;
        }
        f5.w wVar11 = wVar4;
        if (wVar11 != null) {
            iIntValue3 = pVar.invoke(wVar11, Integer.valueOf(i15)).intValue();
            i15 = l3.k.i(i15, wVar11.l0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                wVar5 = null;
                break;
            }
            wVar5 = list.get(i24);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar5), "Suffix")) {
                break;
            }
            i24++;
        }
        f5.w wVar12 = wVar5;
        if (wVar12 != null) {
            iIntValue4 = pVar.invoke(wVar12, Integer.valueOf(i15)).intValue();
            i15 = l3.k.i(i15, wVar12.l0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i25 = 0;
        while (i25 < size6) {
            f5.w wVar13 = list.get(i25);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar13), "TextField")) {
                int iIntValue6 = pVar.invoke(wVar13, Integer.valueOf(i15)).intValue();
                int size7 = list.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size7) {
                        wVar6 = null;
                        break;
                    }
                    wVar6 = list.get(i26);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar6), "Hint")) {
                        break;
                    }
                    i26++;
                }
                f5.w wVar14 = wVar6;
                int iIntValue7 = wVar14 != null ? pVar.invoke(wVar14, Integer.valueOf(i15)).intValue() : 0;
                int size8 = list.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size8) {
                        wVar7 = null;
                        break;
                    }
                    wVar7 = list.get(i27);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar7), "Supporting")) {
                        break;
                    }
                    i27++;
                }
                f5.w wVar15 = wVar7;
                return paVar.a(xVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, wVar15 != null ? pVar.invoke(wVar15, Integer.valueOf(i14)).intValue() : 0, g6.b.b(0, 0, 15), paVar.f89299c instanceof fh.a, fInvoke);
            }
            i25++;
            iIntValue4 = iIntValue4;
            iIntValue3 = iIntValue3;
            paVar = this;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    public final int e(f5.x xVar, List<? extends f5.w> list, int i14, e23.p<? super f5.w, ? super Integer, Integer> pVar) {
        f5.w wVar;
        f5.w wVar2;
        f5.w wVar3;
        f5.w wVar4;
        f5.w wVar5;
        f5.w wVar6;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            f5.w wVar7 = list.get(i15);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar7), "TextField")) {
                int iIntValue = pVar.invoke(wVar7, Integer.valueOf(i14)).intValue();
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    wVar = null;
                    if (i16 >= size2) {
                        wVar2 = null;
                        break;
                    }
                    wVar2 = list.get(i16);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar2), "Label")) {
                        break;
                    }
                    i16++;
                }
                f5.w wVar8 = wVar2;
                int iIntValue2 = wVar8 != null ? pVar.invoke(wVar8, Integer.valueOf(i14)).intValue() : 0;
                int size3 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size3) {
                        wVar3 = null;
                        break;
                    }
                    wVar3 = list.get(i17);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar3), "Trailing")) {
                        break;
                    }
                    i17++;
                }
                f5.w wVar9 = wVar3;
                int iIntValue3 = wVar9 != null ? pVar.invoke(wVar9, Integer.valueOf(i14)).intValue() : 0;
                int size4 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size4) {
                        wVar4 = null;
                        break;
                    }
                    wVar4 = list.get(i18);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar4), "Leading")) {
                        break;
                    }
                    i18++;
                }
                f5.w wVar10 = wVar4;
                int iIntValue4 = wVar10 != null ? pVar.invoke(wVar10, Integer.valueOf(i14)).intValue() : 0;
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        wVar5 = null;
                        break;
                    }
                    wVar5 = list.get(i19);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar5), "Prefix")) {
                        break;
                    }
                    i19++;
                }
                f5.w wVar11 = wVar5;
                int iIntValue5 = wVar11 != null ? pVar.invoke(wVar11, Integer.valueOf(i14)).intValue() : 0;
                int size6 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size6) {
                        wVar6 = null;
                        break;
                    }
                    wVar6 = list.get(i24);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar6), "Suffix")) {
                        break;
                    }
                    i24++;
                }
                f5.w wVar12 = wVar6;
                int iIntValue6 = wVar12 != null ? pVar.invoke(wVar12, Integer.valueOf(i14)).intValue() : 0;
                int size7 = list.size();
                for (int i25 = 0; i25 < size7; i25++) {
                    f5.w wVar13 = list.get(i25);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar13), "Hint")) {
                        wVar = wVar13;
                        break;
                    }
                }
                f5.w wVar14 = wVar;
                return b(xVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, wVar14 != null ? pVar.invoke(wVar14, Integer.valueOf(i14)).intValue() : 0, g6.b.b(0, 0, 15), this.f89300d.invoke());
            }
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [T, f5.v1] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [T, f5.v1] */
    /* JADX WARN: Type inference failed for: r2v49 */
    @Override // f5.z0
    public final f5.a1 f(final f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        f5.y0 y0Var;
        f5.y0 y0Var2;
        f5.y0 y0Var3;
        f5.y0 y0Var4;
        int i14;
        f5.v1 v1VarQ;
        boolean z14;
        f5.y0 y0Var5;
        int iE0;
        c2.h2 h2Var;
        f5.y0 y0Var6;
        int iMax;
        f5.y0 y0Var7;
        f5.v1 v1Var;
        int i15;
        f5.y0 y0Var8;
        int i16;
        f5.y0 y0Var9;
        int i17;
        long j14;
        int i18;
        f5.v1 v1Var2;
        p005kotlin.jvm.internal.r0 r0Var;
        int i19;
        int i24;
        int i25;
        int i26;
        f5.v1 v1Var3;
        long jFloatToRawIntBits;
        final float fInvoke = this.f89300d.invoke();
        c2.h2 h2Var2 = this.f89301e;
        int iF0 = b1Var.f0(h2Var2.getF22739d());
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        int size = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size) {
                y0Var = null;
                break;
            }
            y0Var = list.get(i27);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "Leading")) {
                break;
            }
            i27++;
        }
        f5.y0 y0Var10 = y0Var;
        f5.v1 v1VarQ2 = y0Var10 != null ? y0Var10.Q(jC) : null;
        int i28 = v1VarQ2 != null ? v1VarQ2.f69144a : 0;
        int iMax2 = Math.max(0, v1VarQ2 != null ? v1VarQ2.f69145b : 0);
        int size2 = list.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size2) {
                y0Var2 = null;
                break;
            }
            y0Var2 = list.get(i29);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "Trailing")) {
                break;
            }
            i29++;
        }
        f5.y0 y0Var11 = y0Var2;
        f5.v1 v1VarQ3 = y0Var11 != null ? y0Var11.Q(g6.b.j(-i28, 0, 2, jC)) : null;
        int i30 = i28 + (v1VarQ3 != null ? v1VarQ3.f69144a : 0);
        int iMax3 = Math.max(iMax2, v1VarQ3 != null ? v1VarQ3.f69145b : 0);
        int size3 = list.size();
        int i34 = 0;
        while (true) {
            if (i34 >= size3) {
                y0Var3 = null;
                break;
            }
            y0Var3 = list.get(i34);
            int i35 = size3;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var3), "Prefix")) {
                break;
            }
            i34++;
            size3 = i35;
        }
        f5.y0 y0Var12 = y0Var3;
        f5.v1 v1VarQ4 = y0Var12 != null ? y0Var12.Q(g6.b.j(-i30, 0, 2, jC)) : null;
        int i36 = i30 + (v1VarQ4 != null ? v1VarQ4.f69144a : 0);
        int iMax4 = Math.max(iMax3, v1VarQ4 != null ? v1VarQ4.f69145b : 0);
        int size4 = list.size();
        int i37 = 0;
        while (true) {
            if (i37 >= size4) {
                y0Var4 = null;
                break;
            }
            y0Var4 = list.get(i37);
            int i38 = size4;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var4), "Suffix")) {
                break;
            }
            i37++;
            size4 = i38;
        }
        f5.y0 y0Var13 = y0Var4;
        if (y0Var13 != null) {
            i14 = 0;
            v1VarQ = y0Var13.Q(g6.b.j(-i36, 0, 2, jC));
        } else {
            i14 = 0;
            v1VarQ = null;
        }
        int i39 = i36 + (v1VarQ != null ? v1VarQ.f69144a : i14);
        int iMax5 = Math.max(iMax4, v1VarQ != null ? v1VarQ.f69145b : i14);
        boolean z15 = this.f89299c instanceof fh.a;
        int size5 = list.size();
        int i44 = i14;
        while (true) {
            if (i44 >= size5) {
                z14 = z15;
                y0Var5 = null;
                break;
            }
            y0Var5 = list.get(i44);
            z14 = z15;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var5), "Label")) {
                break;
            }
            i44++;
            z15 = z14;
        }
        f5.y0 y0Var14 = y0Var5;
        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
        e23.l<n4.g, Unit> lVar = this.f89297a;
        long jFloatToRawIntBits2 = 0;
        if (z14) {
            iE0 = y0Var14 != null ? y0Var14.e0(g6.a.l(j8)) : 0;
        } else {
            int iF1 = b1Var.f0(h2Var2.c(b1Var.getF68910b())) + b1Var.f0(h2Var2.b(b1Var.getF68910b()));
            ?? Q = y0Var14 != null ? y0Var14.Q(g6.b.i(-gl.b.K(i39 + iF1, iF1, fInvoke), -iF0, jC)) : 0;
            r0Var2.f105810a = Q;
            if (Q != 0) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Q.f69144a)) << 32) | (((long) Float.floatToRawIntBits(Q.f69145b)) & 4294967295L);
                n4.g.a aVar = n4.g.f123559b;
            } else {
                n4.g.f123559b.getClass();
                jFloatToRawIntBits = 0;
            }
            lVar.invoke(n4.g.a(jFloatToRawIntBits));
            iE0 = 0;
        }
        int size6 = list.size();
        int i45 = 0;
        while (true) {
            if (i45 >= size6) {
                h2Var = h2Var2;
                y0Var6 = null;
                break;
            }
            y0Var6 = list.get(i45);
            int i46 = size6;
            h2Var = h2Var2;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var6), "Supporting")) {
                break;
            }
            i45++;
            h2Var2 = h2Var;
            size6 = i46;
        }
        f5.y0 y0Var15 = y0Var6;
        int iE1 = y0Var15 != null ? y0Var15.e0(g6.a.l(j8)) : 0;
        if (z14) {
            iMax = b1Var.f0(h2Var.getF22737b());
        } else {
            f5.v1 v1Var4 = (f5.v1) r0Var2.f105810a;
            iMax = Math.max((v1Var4 != null ? v1Var4.f69145b : 0) / 2, b1Var.f0(h2Var.getF22737b()));
        }
        long jC2 = g6.a.c(0, 0, 0, 0, 11, g6.b.i(-i39, (((-iF0) - iMax) - iE0) - iE1, j8));
        int size7 = list.size();
        int i47 = 0;
        while (i47 < size7) {
            int i48 = iMax;
            f5.y0 y0Var16 = list.get(i47);
            int i49 = iF0;
            int i54 = size7;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var16), "TextField")) {
                final f5.v1 v1VarQ5 = y0Var16.Q(jC2);
                long jC3 = g6.a.c(0, 0, 0, 0, 14, jC2);
                int size8 = list.size();
                int i55 = 0;
                while (true) {
                    if (i55 >= size8) {
                        y0Var7 = null;
                        break;
                    }
                    y0Var7 = list.get(i55);
                    int i56 = size8;
                    int i57 = i55;
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var7), "Hint")) {
                        break;
                    }
                    i55 = i57 + 1;
                    size8 = i56;
                }
                f5.y0 y0Var17 = y0Var7;
                f5.v1 v1VarQ6 = y0Var17 != null ? y0Var17.Q(jC3) : null;
                int iMax6 = Math.max(iMax5, Math.max(v1VarQ5.f69145b, v1VarQ6 != null ? v1VarQ6.f69145b : 0) + i48 + i49);
                int i58 = v1VarQ2 != null ? v1VarQ2.f69144a : 0;
                f5.v1 v1Var5 = v1VarQ3;
                int i59 = v1VarQ3 != 0 ? v1Var5.f69144a : 0;
                final f5.v1 v1Var6 = v1VarQ4;
                int i64 = v1VarQ4 != 0 ? v1Var6.f69144a : 0;
                if (v1VarQ != null) {
                    i15 = v1VarQ.f69144a;
                    v1Var = v1Var5;
                } else {
                    v1Var = v1Var5;
                    i15 = 0;
                }
                int i65 = i58;
                int i66 = v1VarQ5.f69144a;
                final f5.v1 v1Var7 = v1Var;
                f5.v1 v1Var8 = (f5.v1) r0Var2.f105810a;
                if (v1Var8 != null) {
                    f5.y0 y0Var18 = y0Var14;
                    i16 = v1Var8.f69144a;
                    y0Var8 = y0Var18;
                } else {
                    y0Var8 = y0Var14;
                    i16 = 0;
                }
                if (v1VarQ6 != null) {
                    y0Var9 = y0Var8;
                    i17 = v1VarQ6.f69144a;
                    j14 = jC;
                    i18 = 0;
                } else {
                    y0Var9 = y0Var8;
                    i17 = 0;
                    j14 = jC;
                    i18 = 0;
                }
                final int iB = b(b1Var, i65, i59, i64, i15, i66, i16, i17, j8, fInvoke);
                if (z14 != 0) {
                    v1Var2 = v1VarQ2;
                    ?? Q2 = y0Var9 != null ? y0Var9.Q(g6.a.c(0, iB, 0, iE0, 5, j14)) : 0;
                    r0Var = r0Var2;
                    r0Var.f105810a = Q2;
                    if (Q2 != 0) {
                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Q2.f69144a)) << 32) | (((long) Float.floatToRawIntBits(Q2.f69145b)) & 4294967295L);
                        n4.g.a aVar2 = n4.g.f123559b;
                    } else {
                        n4.g.f123559b.getClass();
                    }
                    lVar.invoke(n4.g.a(jFloatToRawIntBits2));
                } else {
                    v1Var2 = v1VarQ2;
                    r0Var = r0Var2;
                }
                final f5.v1 v1VarQ7 = y0Var15 != null ? y0Var15.Q(g6.a.c(0, iB, 0, 0, 9, g6.b.j(i18, -iMax6, 1, j14))) : null;
                if (v1VarQ7 != null) {
                    i19 = v1VarQ7.f69145b;
                }
                if (v1Var2 != null) {
                    i19 = i18;
                    i24 = v1Var2.f69145b;
                } else {
                    i19 = i18;
                    i24 = i18;
                }
                int i67 = v1Var7 != null ? v1Var7.f69145b : i18;
                int i68 = v1Var6 != null ? v1Var6.f69145b : i18;
                final f5.v1 v1Var9 = v1VarQ;
                int i69 = v1Var9 != null ? v1Var9.f69145b : i18;
                int i74 = v1VarQ5.f69145b;
                f5.v1 v1Var10 = (f5.v1) r0Var.f105810a;
                int i75 = v1Var10 != null ? v1Var10.f69145b : i18;
                final f5.v1 v1Var11 = v1VarQ6;
                int i76 = v1Var11 != null ? v1Var11.f69145b : 0;
                if (v1VarQ7 != null) {
                    i25 = v1VarQ7.f69145b;
                    i26 = 0;
                } else {
                    i25 = 0;
                    i26 = 0;
                }
                final int iA = a(b1Var, i24, i67, i68, i69, i74, i75, i76, i25, j8, z14, fInvoke);
                int i77 = (iA - i19) - ((z14 == 0 || (v1Var3 = (f5.v1) r0Var.f105810a) == null) ? i26 : v1Var3.f69145b);
                int size9 = list.size();
                int i78 = i26;
                while (i78 < size9) {
                    f5.y0 y0Var19 = list.get(i78);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var19), "Container")) {
                        final f5.v1 v1VarQ8 = y0Var19.Q(g6.b.a(iB != 2147483647 ? iB : i26, iB, i77 != Integer.MAX_VALUE ? i77 : i26, i77));
                        final p005kotlin.jvm.internal.r0 r0Var3 = r0Var;
                        final f5.v1 v1Var12 = v1Var2;
                        final boolean z16 = z14;
                        return f5.b1.h0(b1Var, iB, iA, new e23.l() { // from class: i3.oa
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i79;
                                int i84;
                                int i85;
                                pa paVar;
                                float f14;
                                int iA2;
                                float f15;
                                float f16;
                                float f17;
                                f5.v1.a aVar3 = (f5.v1.a) obj;
                                f5.v1 v1Var13 = (f5.v1) r0Var3.f105810a;
                                f5.b1 b1Var2 = b1Var;
                                float f75991a = b1Var2.getF75991a();
                                g6.o f68910b = b1Var2.getF68910b();
                                pa paVar2 = this.f89173a;
                                float fS0 = b1Var2.s0(paVar2.f89302f);
                                fh fhVar = paVar2.f89299c;
                                c2.h2 h2Var3 = paVar2.f89301e;
                                boolean z17 = z16;
                                int i86 = (!z17 || v1Var13 == null) ? 0 : v1Var13.f69145b;
                                aVar3.r(v1VarQ8, 0, i86, 0.0f);
                                f5.v1 v1Var14 = v1VarQ7;
                                int i87 = (iA - (v1Var14 != null ? v1Var14.f69145b : 0)) - ((!z17 || v1Var13 == null) ? 0 : v1Var13.f69145b);
                                int iC = MathKt.c(h2Var3.getF22737b() * f75991a);
                                f5.v1 v1Var15 = v1Var12;
                                if (v1Var15 != null) {
                                    h4.d.f81522a.getClass();
                                    f5.v1.a.B(aVar3, v1Var15, 0, h4.d.a.f81534l.a(v1Var15.f69145b, i87) + i86);
                                }
                                int i88 = iB;
                                f5.v1 v1Var16 = v1Var7;
                                if (v1Var13 != null) {
                                    if (z17) {
                                        f14 = f75991a;
                                        iA2 = 0;
                                    } else {
                                        f14 = f75991a;
                                        if (paVar2.f89298b) {
                                            h4.d.f81522a.getClass();
                                            iA2 = h4.d.a.f81534l.a(v1Var13.f69145b, i87);
                                        } else {
                                            iA2 = iC;
                                        }
                                    }
                                    int i89 = z17 ? 0 : -(v1Var13.f69145b / 2);
                                    float f18 = fInvoke;
                                    int iK = gl.b.K(iA2, i89, f18);
                                    if (z17) {
                                        aVar3.r(v1Var13, l3.k2.f(fhVar).a(v1Var13.f69144a, i88, f68910b), iK, 0.0f);
                                        i88 = i88;
                                    } else {
                                        float fI = c2.l.i(h2Var3, f68910b) * f14;
                                        float fH = c2.l.h(h2Var3, f68910b) * f14;
                                        if (v1Var15 == null) {
                                            f15 = 0.0f;
                                            f16 = fI;
                                        } else {
                                            f15 = 0.0f;
                                            float f19 = v1Var15.f69144a;
                                            float f22 = fI - fS0;
                                            if (f22 < 0.0f) {
                                                f22 = 0.0f;
                                            }
                                            f16 = f19 + f22;
                                        }
                                        if (v1Var16 == null) {
                                            f17 = fH;
                                        } else {
                                            float f24 = v1Var16.f69144a;
                                            float f25 = fH - fS0;
                                            if (f25 < f15) {
                                                f25 = f15;
                                            }
                                            f17 = f24 + f25;
                                        }
                                        g6.o oVar = g6.o.Ltr;
                                        aVar3.r(v1Var13, MathKt.c(gl.b.J(l3.k2.e(fhVar).a(v1Var13.f69144a, i88 - MathKt.c(f16 + f17), f68910b) + (f68910b == oVar ? f16 : f17), l3.k2.f(fhVar).a(v1Var13.f69144a, i88 - MathKt.c(fI + fH), f68910b) + (f68910b == oVar ? fI : fH), f18)), iK, f15);
                                    }
                                } else {
                                    i88 = i88;
                                    paVar2 = paVar2;
                                }
                                f5.v1 v1Var17 = v1Var6;
                                if (v1Var17 != null) {
                                    i79 = i86;
                                    i84 = iC;
                                    i85 = i87;
                                    paVar = paVar2;
                                    f5.v1.a.B(aVar3, v1Var17, v1Var15 != null ? v1Var15.f69144a : 0, pa.j(i79, paVar, i85, i84, v1Var13, v1Var17));
                                } else {
                                    i79 = i86;
                                    i84 = iC;
                                    i85 = i87;
                                    paVar = paVar2;
                                }
                                int i93 = (v1Var15 != null ? v1Var15.f69144a : 0) + (v1Var17 != null ? v1Var17.f69144a : 0);
                                f5.v1 v1Var18 = v1VarQ5;
                                f5.v1.a.B(aVar3, v1Var18, i93, pa.j(i79, paVar, i85, i84, v1Var13, v1Var18));
                                f5.v1 v1Var19 = v1Var11;
                                if (v1Var19 != null) {
                                    f5.v1.a.B(aVar3, v1Var19, i93, pa.j(i79, paVar, i85, i84, v1Var13, v1Var19));
                                }
                                f5.v1 v1Var20 = v1Var9;
                                if (v1Var20 != null) {
                                    f5.v1.a.B(aVar3, v1Var20, (i88 - (v1Var16 != null ? v1Var16.f69144a : 0)) - v1Var20.f69144a, pa.j(i79, paVar, i85, i84, v1Var13, v1Var20));
                                }
                                if (v1Var16 != null) {
                                    int i94 = i88 - v1Var16.f69144a;
                                    h4.d.f81522a.getClass();
                                    f5.v1.a.B(aVar3, v1Var16, i94, h4.d.a.f81534l.a(v1Var16.f69145b, i85) + i79);
                                }
                                if (v1Var14 != null) {
                                    f5.v1.a.B(aVar3, v1Var14, 0, i79 + i85);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i78++;
                    iA = iA;
                    r0Var = r0Var;
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
            i47++;
            y0Var14 = y0Var14;
            iF0 = i49;
            iMax = i48;
            jC2 = jC2;
            jC = jC;
            v1VarQ2 = v1VarQ2;
            size7 = i54;
            v1VarQ = v1VarQ;
            r0Var2 = r0Var2;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        return d(xVar, list, i14, new ho2.o(15));
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        return d(xVar, list, i14, new ho2.o(17));
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        return e(xVar, list, i14, new ho2.o(16));
    }

    public /* synthetic */ pa(e23.l lVar, boolean z14, fh fhVar, l3.x0 x0Var, c2.h2 h2Var, float f14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, z14, fhVar, x0Var, h2Var, f14);
    }
}
