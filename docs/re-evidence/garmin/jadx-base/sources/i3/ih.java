package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li3/ih;", "Lf5/z0;", "", "singleLine", "Li3/fh;", "labelPosition", "Ll3/x0;", "labelProgress", "Lc2/h2;", "paddingValues", "Lg6/f;", "minimizedLabelHalfHeight", "<init>", "(ZLi3/fh;Ll3/x0;Lc2/h2;FLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ih implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f88460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3.x0 f88461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.h2 f88462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f88463e;

    private ih(boolean z14, fh fhVar, l3.x0 x0Var, c2.h2 h2Var, float f14) {
        this.f88459a = z14;
        this.f88460b = fhVar;
        this.f88461c = x0Var;
        this.f88462d = h2Var;
        this.f88463e = f14;
    }

    public static int d(List list, int i14, e23.p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj7 = list.get(i15);
            if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj7), "TextField")) {
                int iIntValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i14))).intValue();
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    obj = null;
                    if (i16 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i16);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj2), "Label")) {
                        break;
                    }
                    i16++;
                }
                f5.w wVar = (f5.w) obj2;
                int iIntValue2 = wVar != null ? ((Number) pVar.invoke(wVar, Integer.valueOf(i14))).intValue() : 0;
                int size3 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i17);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj3), "Trailing")) {
                        break;
                    }
                    i17++;
                }
                f5.w wVar2 = (f5.w) obj3;
                int iIntValue3 = wVar2 != null ? ((Number) pVar.invoke(wVar2, Integer.valueOf(i14))).intValue() : 0;
                int size4 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i18);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj4), "Prefix")) {
                        break;
                    }
                    i18++;
                }
                f5.w wVar3 = (f5.w) obj4;
                int iIntValue4 = wVar3 != null ? ((Number) pVar.invoke(wVar3, Integer.valueOf(i14))).intValue() : 0;
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i19);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj5), "Suffix")) {
                        break;
                    }
                    i19++;
                }
                f5.w wVar4 = (f5.w) obj5;
                int iIntValue5 = wVar4 != null ? ((Number) pVar.invoke(wVar4, Integer.valueOf(i14))).intValue() : 0;
                int size6 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i24);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj6), "Leading")) {
                        break;
                    }
                    i24++;
                }
                f5.w wVar5 = (f5.w) obj6;
                int iIntValue6 = wVar5 != null ? ((Number) pVar.invoke(wVar5, Integer.valueOf(i14))).intValue() : 0;
                int size7 = list.size();
                for (int i25 = 0; i25 < size7; i25++) {
                    Object obj8 = list.get(i25);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g((f5.w) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                f5.w wVar6 = (f5.w) obj;
                int i26 = iIntValue4 + iIntValue5;
                return g6.b.g(Math.max(iIntValue + i26, Math.max((wVar6 != null ? ((Number) pVar.invoke(wVar6, Integer.valueOf(i14))).intValue() : 0) + i26, iIntValue2)) + iIntValue6 + iIntValue3, g6.b.b(0, 0, 15));
            }
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    public static final int e(ih ihVar, int i14, int i15, f5.v1 v1Var) {
        if (!ihVar.f88459a) {
            return i15;
        }
        h4.d.f81522a.getClass();
        return h4.d.a.f81534l.a(v1Var.f69145b, i14);
    }

    public final int a(f5.x xVar, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, long j8, boolean z14, float f14) {
        int iMax;
        c2.h2 h2Var = this.f88462d;
        float f22739d = h2Var.getF22739d() + h2Var.getF22737b();
        g6.f.a aVar = g6.f.f75994b;
        int iF0 = xVar.f0(f22739d);
        int iC = r13.b.c(i14, i24, i18, i19, z14 ? 0 : gl.b.K(i15, 0, f14));
        if (i15 <= 0 || z14) {
            iMax = 0;
        } else {
            int iF1 = xVar.f0(this.f88463e * 2);
            n3.i0.f122961a.getClass();
            iMax = Math.max(iF1, gl.b.K(0, i15, n3.i0.f122962b.a(f14)));
        }
        int i26 = iF0 + iMax + iC;
        if (!z14) {
            i15 = 0;
        }
        return g6.b.f(Math.max(i16, Math.max(i17, i26)) + i15 + i25, j8);
    }

    public final int b(f5.x xVar, List<? extends f5.w> list, int i14, e23.p<? super f5.w, ? super Integer, Integer> pVar) {
        f5.w wVar;
        int i15;
        int i16;
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
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                wVar = null;
                break;
            }
            wVar = list.get(i17);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar), "Leading")) {
                break;
            }
            i17++;
        }
        f5.w wVar8 = wVar;
        if (wVar8 != null) {
            i15 = i14;
            i16 = l3.k.i(i15, wVar8.l0(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(wVar8, Integer.valueOf(i15)).intValue();
        } else {
            i15 = i14;
            i16 = i15;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                wVar2 = null;
                break;
            }
            wVar2 = list.get(i18);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar2), "Trailing")) {
                break;
            }
            i18++;
        }
        f5.w wVar9 = wVar2;
        if (wVar9 != null) {
            i16 = l3.k.i(i16, wVar9.l0(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(wVar9, Integer.valueOf(i15)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                wVar3 = null;
                break;
            }
            wVar3 = list.get(i19);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar3), "Label")) {
                break;
            }
            i19++;
        }
        f5.w wVar10 = wVar3;
        int iIntValue5 = wVar10 != null ? pVar.invoke(wVar10, Integer.valueOf(i16)).intValue() : 0;
        int size4 = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size4) {
                wVar4 = null;
                break;
            }
            wVar4 = list.get(i24);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar4), "Prefix")) {
                break;
            }
            i24++;
        }
        f5.w wVar11 = wVar4;
        if (wVar11 != null) {
            iIntValue3 = pVar.invoke(wVar11, Integer.valueOf(i16)).intValue();
            i16 = l3.k.i(i16, wVar11.l0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size5) {
                wVar5 = null;
                break;
            }
            wVar5 = list.get(i25);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar5), "Suffix")) {
                break;
            }
            i25++;
        }
        f5.w wVar12 = wVar5;
        if (wVar12 != null) {
            iIntValue4 = pVar.invoke(wVar12, Integer.valueOf(i16)).intValue();
            i16 = l3.k.i(i16, wVar12.l0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i26 = 0;
        while (i26 < size6) {
            f5.w wVar13 = list.get(i26);
            if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar13), "TextField")) {
                int iIntValue6 = pVar.invoke(wVar13, Integer.valueOf(i16)).intValue();
                int size7 = list.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size7) {
                        wVar6 = null;
                        break;
                    }
                    wVar6 = list.get(i27);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar6), "Hint")) {
                        break;
                    }
                    i27++;
                }
                f5.w wVar14 = wVar6;
                int iIntValue7 = wVar14 != null ? pVar.invoke(wVar14, Integer.valueOf(i16)).intValue() : 0;
                int size8 = list.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size8) {
                        wVar7 = null;
                        break;
                    }
                    wVar7 = list.get(i28);
                    if (p005kotlin.jvm.internal.s.g(l3.k.g(wVar7), "Supporting")) {
                        break;
                    }
                    i28++;
                }
                f5.w wVar15 = wVar7;
                int iIntValue8 = wVar15 != null ? pVar.invoke(wVar15, Integer.valueOf(i15)).intValue() : 0;
                int i29 = iIntValue7;
                return a(xVar, iIntValue6, iIntValue5, iIntValue, iIntValue2, iIntValue3, iIntValue4, i29, iIntValue8, g6.b.b(0, 0, 15), this.f88460b instanceof fh.a, this.f88461c.invoke());
            }
            i26++;
            iIntValue4 = iIntValue4;
            iIntValue = iIntValue;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        return d(list, i14, new ho2.o(22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.z0
    public final f5.a1 f(final f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        f5.y0 y0Var;
        f5.y0 y0Var2;
        f5.y0 y0Var3;
        f5.y0 y0Var4;
        int i14;
        f5.y0 y0Var5;
        int iE0;
        int i15;
        f5.y0 y0Var6;
        f5.y0 y0Var7;
        long j14;
        int i16;
        int i17;
        f5.v1 v1Var;
        float fInvoke = this.f88461c.invoke();
        c2.h2 h2Var = this.f88462d;
        final int iF0 = b1Var.f0(h2Var.getF22737b());
        int iF1 = b1Var.f0(h2Var.getF22739d());
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        int size = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                y0Var = null;
                break;
            }
            y0Var = list.get(i18);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "Leading")) {
                break;
            }
            i18++;
        }
        f5.y0 y0Var8 = y0Var;
        f5.v1 v1VarQ = y0Var8 != null ? y0Var8.Q(jC) : null;
        int i19 = v1VarQ != null ? v1VarQ.f69144a : 0;
        int iMax = Math.max(0, v1VarQ != null ? v1VarQ.f69145b : 0);
        int size2 = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size2) {
                y0Var2 = null;
                break;
            }
            y0Var2 = list.get(i24);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "Trailing")) {
                break;
            }
            i24++;
        }
        f5.y0 y0Var9 = y0Var2;
        f5.v1 v1VarQ2 = y0Var9 != null ? y0Var9.Q(g6.b.j(-i19, 0, 2, jC)) : null;
        int i25 = i19 + (v1VarQ2 != null ? v1VarQ2.f69144a : 0);
        int iMax2 = Math.max(iMax, v1VarQ2 != null ? v1VarQ2.f69145b : 0);
        int size3 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size3) {
                y0Var3 = null;
                break;
            }
            y0Var3 = list.get(i26);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var3), "Prefix")) {
                break;
            }
            i26++;
        }
        f5.y0 y0Var10 = y0Var3;
        f5.v1 v1VarQ3 = y0Var10 != null ? y0Var10.Q(g6.b.j(-i25, 0, 2, jC)) : null;
        int i27 = i25 + (v1VarQ3 != null ? v1VarQ3.f69144a : 0);
        int iMax3 = Math.max(iMax2, v1VarQ3 != null ? v1VarQ3.f69145b : 0);
        int size4 = list.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size4) {
                y0Var4 = null;
                break;
            }
            y0Var4 = list.get(i28);
            int i29 = size4;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var4), "Suffix")) {
                break;
            }
            i28++;
            size4 = i29;
        }
        f5.y0 y0Var11 = y0Var4;
        f5.v1 v1VarQ4 = y0Var11 != null ? y0Var11.Q(g6.b.j(-i27, 0, 2, jC)) : null;
        int i30 = i27 + (v1VarQ4 != null ? v1VarQ4.f69144a : 0);
        int iMax4 = Math.max(iMax3, v1VarQ4 != null ? v1VarQ4.f69145b : 0);
        final boolean z14 = this.f88460b instanceof fh.a;
        int size5 = list.size();
        int i34 = 0;
        while (true) {
            if (i34 >= size5) {
                i14 = iMax4;
                y0Var5 = null;
                break;
            }
            y0Var5 = list.get(i34);
            i14 = iMax4;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var5), "Label")) {
                break;
            }
            i34++;
            iMax4 = i14;
        }
        f5.y0 y0Var12 = y0Var5;
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        if (z14) {
            iE0 = y0Var12 != null ? y0Var12.e0(g6.a.l(j8)) : 0;
        } else {
            r0Var.f105810a = y0Var12 != null ? y0Var12.Q(g6.b.i(-i30, -iF1, jC)) : 0;
            iE0 = 0;
        }
        int size6 = list.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size6) {
                i15 = iF1;
                y0Var6 = null;
                break;
            }
            y0Var6 = list.get(i35);
            i15 = iF1;
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var6), "Supporting")) {
                break;
            }
            i35++;
            iF1 = i15;
        }
        f5.y0 y0Var13 = y0Var6;
        int iE1 = y0Var13 != null ? y0Var13.e0(g6.a.l(j8)) : 0;
        f5.v1 v1Var2 = (f5.v1) r0Var.f105810a;
        int i36 = (v1Var2 != null ? v1Var2.f69145b : 0) + iE0 + iF0;
        float f14 = fInvoke;
        int i37 = i14;
        p005kotlin.jvm.internal.r0 r0Var2 = r0Var;
        final f5.v1 v1Var3 = v1VarQ2;
        f5.v1 v1Var4 = v1VarQ4;
        long j15 = jC;
        long jI = g6.b.i(-i30, ((-i36) - i15) - iE1, g6.a.c(0, 0, 0, 0, 11, j8));
        int size7 = list.size();
        int i38 = 0;
        while (i38 < size7) {
            f5.y0 y0Var14 = list.get(i38);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var14), "TextField")) {
                final f5.v1 v1VarQ5 = y0Var14.Q(jI);
                long jC2 = g6.a.c(0, 0, 0, 0, 14, jI);
                int size8 = list.size();
                int i39 = 0;
                while (true) {
                    if (i39 >= size8) {
                        y0Var7 = null;
                        break;
                    }
                    y0Var7 = list.get(i39);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var7), "Hint")) {
                        break;
                    }
                    i39++;
                }
                f5.y0 y0Var15 = y0Var7;
                f5.v1 v1VarQ6 = y0Var15 != null ? y0Var15.Q(jC2) : null;
                int iMax5 = Math.max(i37, Math.max(v1VarQ5.f69145b, v1VarQ6 != null ? v1VarQ6.f69145b : 0) + i36 + i15);
                int i44 = v1VarQ != 0 ? v1VarQ.f69144a : 0;
                int i45 = v1Var3 != null ? v1Var3.f69144a : 0;
                int i46 = v1VarQ3 != null ? v1VarQ3.f69144a : 0;
                int i47 = v1Var4 != null ? v1Var4.f69144a : 0;
                int i48 = v1VarQ5.f69144a;
                f5.v1 v1Var5 = (f5.v1) r0Var2.f105810a;
                int i49 = i46 + i47;
                final int iG = g6.b.g(Math.max(i48 + i49, Math.max((v1VarQ6 != null ? v1VarQ6.f69144a : 0) + i49, v1Var5 != null ? v1Var5.f69144a : 0)) + i44 + i45, j8);
                if (z14) {
                    long j16 = j15;
                    j14 = j16;
                    r0Var2.f105810a = y0Var12 != null ? y0Var12.Q(g6.a.c(0, iG, 0, iE0, 5, j16)) : 0;
                } else {
                    j14 = j15;
                }
                final f5.v1 v1VarQ7 = y0Var13 != null ? y0Var13.Q(g6.a.c(0, iG, 0, 0, 9, g6.b.j(0, -iMax5, 1, j14))) : null;
                int i54 = v1VarQ7 != null ? v1VarQ7.f69145b : 0;
                int i55 = v1VarQ5.f69145b;
                f5.v1 v1Var6 = (f5.v1) r0Var2.f105810a;
                int i56 = v1Var6 != null ? v1Var6.f69145b : 0;
                int i57 = v1VarQ != 0 ? v1VarQ.f69145b : 0;
                int i58 = v1Var3 != null ? v1Var3.f69145b : 0;
                int i59 = v1VarQ3 != null ? v1VarQ3.f69145b : 0;
                int i64 = v1Var4 != null ? v1Var4.f69145b : 0;
                int i65 = v1VarQ6 != null ? v1VarQ6.f69145b : 0;
                if (v1VarQ7 != null) {
                    i16 = v1VarQ7.f69145b;
                    i17 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                final int iA = a(b1Var, i55, i56, i57, i58, i59, i64, i65, i16, j8, r27, f14);
                final int i66 = (iA - i54) - ((!z14 || (v1Var = (f5.v1) r0Var2.f105810a) == null) ? i17 : v1Var.f69145b);
                int size9 = list.size();
                int i67 = i17;
                while (i67 < size9) {
                    f5.y0 y0Var16 = list.get(i67);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var16), "Container")) {
                        final f5.v1 v1VarQ8 = y0Var16.Q(g6.b.a(iG != Integer.MAX_VALUE ? iG : i17, iG, i66 != Integer.MAX_VALUE ? i66 : i17, i66));
                        final p005kotlin.jvm.internal.r0 r0Var3 = r0Var2;
                        final f5.v1 v1Var7 = v1VarQ3;
                        final float f15 = f14;
                        final f5.v1 v1Var8 = v1Var4;
                        final f5.v1 v1Var9 = v1VarQ6;
                        final f5.v1 v1Var10 = v1VarQ;
                        return f5.b1.h0(b1Var, iG, iA, new e23.l() { // from class: i3.hh
                            /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                int i68;
                                int iF2;
                                int i69;
                                int i74;
                                int i75;
                                f5.v1.a aVar = (f5.v1.a) obj;
                                p005kotlin.jvm.internal.r0 r0Var4 = r0Var3;
                                T t7 = r0Var4.f105810a;
                                ih ihVar = this;
                                f5.b1 b1Var2 = b1Var;
                                int i76 = iG;
                                int i77 = iA;
                                f5.v1 v1Var11 = v1VarQ5;
                                f5.v1 v1Var12 = v1Var9;
                                f5.v1 v1Var13 = v1Var10;
                                f5.v1 v1Var14 = v1Var3;
                                f5.v1 v1Var15 = v1Var7;
                                f5.v1 v1Var16 = v1Var8;
                                f5.v1 v1Var17 = v1VarQ8;
                                f5.v1 v1Var18 = v1VarQ7;
                                if (t7 != 0) {
                                    boolean z15 = z14;
                                    int i78 = iF0;
                                    if (z15) {
                                        i68 = i78;
                                        iF2 = 0;
                                    } else {
                                        i68 = i78;
                                        if (ihVar.f88459a) {
                                            h4.d.f81522a.getClass();
                                            iF2 = h4.d.a.f81534l.a(((f5.v1) r0Var4.f105810a).f69145b, i66);
                                        } else {
                                            iF2 = b1Var2.f0(ihVar.f88463e) + i68;
                                        }
                                    }
                                    int i79 = z15 ? 0 : i68;
                                    f5.v1 v1Var19 = (f5.v1) r0Var4.f105810a;
                                    int i84 = i68 + (z15 ? 0 : v1Var19.f69145b);
                                    g6.o f68910b = b1Var2.getF68910b();
                                    fh fhVar = ihVar.f88460b;
                                    int i85 = z15 ? v1Var19.f69145b : 0;
                                    aVar.r(v1Var17, 0, i85, 0.0f);
                                    int i86 = (i77 - (v1Var18 != null ? v1Var18.f69145b : 0)) - (z15 ? v1Var19.f69145b : 0);
                                    if (v1Var13 != null) {
                                        h4.d.f81522a.getClass();
                                        i69 = i85;
                                        f5.v1.a.B(aVar, v1Var13, 0, h4.d.a.f81534l.a(v1Var13.f69145b, i86) + i69);
                                    } else {
                                        i69 = i85;
                                    }
                                    float f16 = f15;
                                    int iK = gl.b.K(iF2, i79, f16);
                                    if (z15) {
                                        aVar.r(v1Var19, l3.k2.f(fhVar).a(v1Var19.f69144a, i76, f68910b), iK, 0.0f);
                                        i75 = i76;
                                    } else {
                                        if (f68910b == g6.o.Ltr) {
                                            if (v1Var13 != null) {
                                                i74 = v1Var13.f69144a;
                                            } else {
                                                i74 = 0;
                                            }
                                        } else if (v1Var14 != null) {
                                            i74 = v1Var14.f69144a;
                                        } else {
                                            i74 = 0;
                                        }
                                        i75 = i76;
                                        aVar.r(v1Var19, gl.b.K(l3.k2.e(fhVar).a(v1Var19.f69144a, (i75 - (v1Var13 != null ? v1Var13.f69144a : 0)) - (v1Var14 != null ? v1Var14.f69144a : 0), f68910b) + i74, l3.k2.f(fhVar).a(v1Var19.f69144a, (i75 - (v1Var13 != null ? v1Var13.f69144a : 0)) - (v1Var14 != null ? v1Var14.f69144a : 0), f68910b) + i74, f16), iK, 0.0f);
                                    }
                                    if (v1Var15 != null) {
                                        f5.v1.a.B(aVar, v1Var15, v1Var13 != null ? v1Var13.f69144a : 0, i69 + i84);
                                    }
                                    int i87 = (v1Var13 != null ? v1Var13.f69144a : 0) + (v1Var15 != null ? v1Var15.f69144a : 0);
                                    int i88 = i69 + i84;
                                    f5.v1.a.B(aVar, v1Var11, i87, i88);
                                    if (v1Var12 != null) {
                                        f5.v1.a.B(aVar, v1Var12, i87, i88);
                                    }
                                    if (v1Var16 != 0) {
                                        f5.v1.a.B(aVar, v1Var16, (i75 - (v1Var14 != null ? v1Var14.f69144a : 0)) - v1Var16.f69144a, i88);
                                    }
                                    if (v1Var14 != null) {
                                        int i89 = i75 - v1Var14.f69144a;
                                        h4.d.f81522a.getClass();
                                        f5.v1.a.B(aVar, v1Var14, i89, h4.d.a.f81534l.a(v1Var14.f69145b, i86) + i69);
                                    }
                                    if (v1Var18 != null) {
                                        f5.v1.a.B(aVar, v1Var18, 0, i69 + i86);
                                    }
                                } else {
                                    float f75991a = b1Var2.getF75991a();
                                    g6.k.f76003b.getClass();
                                    f5.v1.a.y(aVar, v1Var17, 0L);
                                    int i93 = i77 - (v1Var18 != null ? v1Var18.f69145b : 0);
                                    int iC = MathKt.c(ihVar.f88462d.getF22737b() * f75991a);
                                    if (v1Var13 != null) {
                                        h4.d.f81522a.getClass();
                                        f5.v1.a.B(aVar, v1Var13, 0, h4.d.a.f81534l.a(v1Var13.f69145b, i93));
                                    }
                                    if (v1Var15 != null) {
                                        f5.v1.a.B(aVar, v1Var15, v1Var13 != null ? v1Var13.f69144a : 0, ih.e(ihVar, i93, iC, v1Var15));
                                    }
                                    int i94 = (v1Var13 != null ? v1Var13.f69144a : 0) + (v1Var15 != null ? v1Var15.f69144a : 0);
                                    f5.v1.a.B(aVar, v1Var11, i94, ih.e(ihVar, i93, iC, v1Var11));
                                    if (v1Var12 != null) {
                                        f5.v1.a.B(aVar, v1Var12, i94, ih.e(ihVar, i93, iC, v1Var12));
                                    }
                                    if (v1Var16 != null) {
                                        f5.v1.a.B(aVar, v1Var16, (i76 - (v1Var14 != null ? v1Var14.f69144a : 0)) - v1Var16.f69144a, ih.e(ihVar, i93, iC, v1Var16));
                                    }
                                    if (v1Var14 != null) {
                                        int i95 = i76 - v1Var14.f69144a;
                                        h4.d.f81522a.getClass();
                                        f5.v1.a.B(aVar, v1Var14, i95, h4.d.a.f81534l.a(v1Var14.f69145b, i93));
                                    }
                                    if (v1Var18 != null) {
                                        f5.v1.a.B(aVar, v1Var18, 0, i93);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i67++;
                    f14 = f14;
                    v1VarQ7 = v1VarQ7;
                    v1VarQ = v1VarQ;
                    v1VarQ3 = v1VarQ3;
                    r0Var2 = r0Var2;
                    i66 = i66;
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
            i38++;
            v1VarQ3 = v1VarQ3;
            r0Var2 = r0Var2;
            v1Var4 = v1Var4;
            jI = jI;
            j15 = j15;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        return b(xVar, list, i14, new ho2.o(24));
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        return b(xVar, list, i14, new ho2.o(25));
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        return d(list, i14, new ho2.o(23));
    }

    public /* synthetic */ ih(boolean z14, fh fhVar, l3.x0 x0Var, c2.h2 h2Var, float f14, p005kotlin.jvm.internal.j jVar) {
        this(z14, fhVar, x0Var, h2Var, f14);
    }
}
