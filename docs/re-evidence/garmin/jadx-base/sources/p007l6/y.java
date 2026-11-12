package p007l6;

import f5.g0;
import f5.v1;
import f5.y0;
import g6.c;
import g6.n;
import g6.o;
import g8.i;
import j23.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m6.d;
import o13.e;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p1.k;
import q6.h;
import t6.f;
import t6.l;
import u6.b;

/* JADX INFO: loaded from: classes.dex */
@e
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll6/y;", "Lu6/b$b;", "Ll6/r;", "Lg6/c;", "density", "<init>", "(Lg6/c;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y implements b.InterfaceC3163b, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f110510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f110511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f110512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f110513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f110514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f110515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f110516g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110517a;

        static {
            int[] iArr = new int[t6.e.b.values().length];
            try {
                iArr[t6.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t6.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t6.e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t6.e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f110517a = iArr;
        }
    }

    public y(c cVar) {
        f fVar = new f(0, 0);
        fVar.A0 = this;
        fVar.f162657y0.f168800f = this;
        this.f110510a = fVar;
        this.f110511b = new LinkedHashMap();
        this.f110512c = new LinkedHashMap();
        this.f110513d = new LinkedHashMap();
        this.f110514e = new a0(cVar);
        this.f110515f = new int[2];
        this.f110516g = new int[2];
        new ArrayList();
    }

    public static void d(t6.e.b bVar, int i14, int i15, int i16, boolean z14, boolean z15, int i17, int[] iArr) {
        int i18 = a.f110517a[bVar.ordinal()];
        if (i18 == 1) {
            iArr[0] = i14;
            iArr[1] = i14;
            return;
        }
        if (i18 == 2) {
            iArr[0] = 0;
            iArr[1] = i17;
            return;
        }
        if (i18 == 3) {
            boolean z16 = z15 || ((i16 == 1 || i16 == 2) && (i16 == 2 || i15 != 1 || z14));
            iArr[0] = z16 ? i14 : 0;
            if (!z16) {
                i14 = i17;
            }
            iArr[1] = i14;
            return;
        }
        if (i18 == 4) {
            iArr[0] = i17;
            iArr[1] = i17;
        } else {
            throw new IllegalStateException((bVar + " is not supported").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // u6.b.InterfaceC3163b
    public final void a(t6.e eVar, b.a aVar) {
        int i14;
        int i15;
        Integer numValueOf;
        int i16;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i17;
        int i18;
        Integer numValueOf3;
        int i19;
        Integer numValueOf4;
        Integer num2;
        int iIntValue2;
        boolean z14;
        boolean z15;
        char c14;
        Object obj;
        String str = eVar.f162624l;
        LinkedHashMap linkedHashMap = this.f110512c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        t6.e.b bVar = aVar.f168783a;
        int i24 = aVar.f168785c;
        int i25 = eVar.f162640t;
        int i26 = aVar.f168792j;
        boolean z16 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != eVar.m()) {
            z16 = false;
        }
        boolean zC = eVar.C();
        a0 a0Var = this.f110514e;
        d(bVar, i24, i25, i26, z16, zC, g6.a.j(a0Var.f110440l), this.f110515f);
        d(aVar.f168784b, aVar.f168786d, eVar.f162642u, aVar.f168792j, (numArr != null ? numArr[0].intValue() : 0) == eVar.s(), eVar.D(), g6.a.i(a0Var.f110440l), this.f110516g);
        int[] iArr = this.f110515f;
        int i27 = iArr[0];
        int i28 = iArr[1];
        int[] iArr2 = this.f110516g;
        long jA = g6.b.a(i27, i28, iArr2[0], iArr2[1]);
        int i29 = aVar.f168792j;
        if (i29 == 1 || i29 == 2) {
            long jC = c(eVar, jA);
            eVar.f162614g = false;
            i14 = (int) (jC >> 32);
            Integer numValueOf5 = Integer.valueOf(i14);
            i15 = eVar.f162646w;
            numValueOf = Integer.valueOf(i15);
            if (i15 <= 0) {
                numValueOf = null;
            }
            i16 = eVar.f162647x;
            numValueOf2 = Integer.valueOf(i16);
            if (i16 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) t.k(numValueOf5, numValueOf, num)).intValue();
            i17 = (int) (jC & 4294967295L);
            Integer numValueOf6 = Integer.valueOf(i17);
            i18 = eVar.f162649z;
            numValueOf3 = Integer.valueOf(i18);
            if (i18 <= 0) {
                numValueOf3 = null;
            }
            i19 = eVar.A;
            numValueOf4 = Integer.valueOf(i19);
            if (i19 > 0) {
                num2 = numValueOf4;
            } else {
                num2 = null;
            }
            iIntValue2 = ((Number) t.k(numValueOf6, numValueOf3, num2)).intValue();
            if (iIntValue != i14) {
                jA = g6.b.a(iIntValue, iIntValue, g6.a.k(jA), g6.a.i(jA));
                z14 = true;
            } else {
                z14 = false;
            }
            if (iIntValue2 != i17) {
                jA = g6.b.a(g6.a.l(jA), g6.a.j(jA), iIntValue2, iIntValue2);
                z15 = true;
            } else {
                z15 = z14;
            }
            if (z15) {
                c(eVar, jA);
                eVar.f162614g = false;
            }
        } else {
            t6.e.b bVar2 = aVar.f168783a;
            t6.e.b bVar3 = t6.e.b.MATCH_CONSTRAINT;
            if (bVar2 != bVar3 || eVar.f162640t != 0 || aVar.f168784b != bVar3 || eVar.f162642u != 0) {
                long jC2 = c(eVar, jA);
                eVar.f162614g = false;
                i14 = (int) (jC2 >> 32);
                Integer numValueOf7 = Integer.valueOf(i14);
                i15 = eVar.f162646w;
                numValueOf = Integer.valueOf(i15);
                if (i15 <= 0) {
                    numValueOf = null;
                }
                i16 = eVar.f162647x;
                numValueOf2 = Integer.valueOf(i16);
                if (i16 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) t.k(numValueOf7, numValueOf, num)).intValue();
                i17 = (int) (jC2 & 4294967295L);
                Integer numValueOf8 = Integer.valueOf(i17);
                i18 = eVar.f162649z;
                numValueOf3 = Integer.valueOf(i18);
                if (i18 <= 0) {
                    numValueOf3 = null;
                }
                i19 = eVar.A;
                numValueOf4 = Integer.valueOf(i19);
                if (i19 > 0) {
                    num2 = numValueOf4;
                } else {
                    num2 = null;
                }
                iIntValue2 = ((Number) t.k(numValueOf8, numValueOf3, num2)).intValue();
                if (iIntValue != i14) {
                    jA = g6.b.a(iIntValue, iIntValue, g6.a.k(jA), g6.a.i(jA));
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (iIntValue2 != i17) {
                    jA = g6.b.a(g6.a.l(jA), g6.a.j(jA), iIntValue2, iIntValue2);
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (z15) {
                    c(eVar, jA);
                    eVar.f162614g = false;
                }
            }
        }
        v1 v1Var = (v1) this.f110511b.get(eVar.f162621j0);
        aVar.f168787e = v1Var != null ? v1Var.f69144a : eVar.s();
        aVar.f168788f = v1Var != null ? v1Var.f69145b : eVar.m();
        int iE = (v1Var == null || !a0Var.g(eVar)) ? Integer.MIN_VALUE : v1Var.E(f5.b.f68892a);
        aVar.f168790h = iE != Integer.MIN_VALUE;
        aVar.f168789g = iE;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            c14 = 0;
            Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            c14 = 0;
            obj = obj2;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[c14] = Integer.valueOf(aVar.f168787e);
        numArr3[1] = Integer.valueOf(aVar.f168788f);
        numArr3[2] = Integer.valueOf(aVar.f168789g);
        aVar.f168791i = (aVar.f168787e == aVar.f168785c && aVar.f168788f == aVar.f168786d) ? c14 : 1;
    }

    @Override // u6.b.InterfaceC3163b
    public final void b() {
    }

    public final long c(t6.e eVar, long j8) {
        int i14;
        Object obj = eVar.f162621j0;
        int i15 = 0;
        if (!(eVar instanceof l)) {
            if (!(obj instanceof y0)) {
                return k.b(0, 0);
            }
            v1 v1VarQ = ((y0) obj).Q(j8);
            this.f110511b.put(obj, v1VarQ);
            return k.b(v1VarQ.f69144a, v1VarQ.f69145b);
        }
        if (g6.a.h(j8)) {
            i14 = 1073741824;
        } else {
            i14 = g6.a.f(j8) ? Integer.MIN_VALUE : 0;
        }
        if (g6.a.g(j8)) {
            i15 = 1073741824;
        } else if (g6.a.e(j8)) {
            i15 = Integer.MIN_VALUE;
        }
        l lVar = (l) eVar;
        lVar.a0(i14, g6.a.j(j8), i15, g6.a.i(j8));
        return k.b(lVar.F0, lVar.G0);
    }

    public final void e(v1.a aVar, List<? extends y0> list) {
        t6.e eVar;
        y0 y0Var;
        v1 v1Var;
        LinkedHashMap linkedHashMap = this.f110513d;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        int i14 = 0;
        f fVar = this.f110510a;
        if (zIsEmpty) {
            ArrayList<t6.e> arrayList = fVar.f162695w0;
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                t6.e eVar2 = arrayList.get(i15);
                Object obj = eVar2.f162621j0;
                if (obj instanceof y0) {
                    h hVar = eVar2.f162622k;
                    hVar.d();
                    linkedHashMap.put(obj, new h(hVar));
                }
            }
        }
        int size2 = list.size();
        while (true) {
            Object obj2 = null;
            if (i14 >= size2) {
                if (w.BOUNDS == null) {
                    StringBuilder sb3 = new StringBuilder("{   root: {interpolated: { left:  0,  top:  0,");
                    sb3.append("  right:   " + fVar.s() + " ,");
                    sb3.append("  bottom:  " + fVar.m() + " ,");
                    sb3.append(" } }");
                    for (t6.e eVar3 : fVar.f162695w0) {
                        Object obj3 = eVar3.f162621j0;
                        if (obj3 instanceof y0) {
                            if (eVar3.f162624l == null) {
                                y0 y0Var2 = (y0) obj3;
                                Object objB = g0.b(y0Var2);
                                if (objB == null) {
                                    objB = i.B(y0Var2);
                                }
                                eVar3.f162624l = objB != null ? objB.toString() : null;
                            }
                            h hVar2 = (h) linkedHashMap.get(obj3);
                            h hVar3 = (hVar2 == null || (eVar = hVar2.f143139a) == null) ? null : eVar.f162622k;
                            if (hVar3 != null) {
                                sb3.append(StringUtils.SPACE + eVar3.f162624l + ": {");
                                sb3.append(" interpolated : ");
                                hVar3.c(sb3);
                                sb3.append("}, ");
                            }
                        } else if (eVar3 instanceof t6.h) {
                            sb3.append(StringUtils.SPACE + eVar3.f162624l + ": {");
                            t6.h hVar4 = (t6.h) eVar3;
                            if (hVar4.A0 == 0) {
                                sb3.append(" type: 'hGuideline', ");
                            } else {
                                sb3.append(" type: 'vGuideline', ");
                            }
                            sb3.append(" interpolated: ");
                            sb3.append(" { left: " + hVar4.t() + ", top: " + hVar4.u() + ", right: " + (hVar4.s() + hVar4.t()) + ", bottom: " + (hVar4.m() + hVar4.u()) + " }");
                            sb3.append("}, ");
                        }
                    }
                    sb3.append(" }");
                    return;
                }
                return;
            }
            y0 y0Var3 = list.get(i14);
            if (linkedHashMap.containsKey(y0Var3)) {
                y0Var = y0Var3;
            } else {
                for (Object obj4 : linkedHashMap.keySet()) {
                    y0 y0Var4 = (y0) obj4;
                    if (g0.b(y0Var4) != null && s.g(g0.b(y0Var4), g0.b(y0Var3))) {
                        obj2 = obj4;
                        break;
                    }
                }
                y0Var = (y0) obj2;
                if (y0Var == null) {
                    continue;
                }
                i14++;
            }
            h hVar5 = (h) linkedHashMap.get(y0Var);
            if (hVar5 == null || (v1Var = (v1) this.f110511b.get(y0Var)) == null) {
                return;
            }
            if (linkedHashMap.containsKey(y0Var3)) {
                k.b(aVar, v1Var, hVar5);
            } else {
                g6.a.C1525a c1525a = g6.a.f75987b;
                int i16 = v1Var.f69144a;
                int i17 = v1Var.f69145b;
                c1525a.getClass();
                k.b(aVar, y0Var3.Q(g6.a.C1525a.c(i16, i17)), hVar5);
            }
            i14++;
        }
    }

    public final long f(long j8, o oVar, o oVar2, List<? extends y0> list, int i14) {
        q6.c cVarH;
        q6.c cVarH2;
        if (list.isEmpty()) {
            return n.a(g6.a.l(j8), g6.a.k(j8));
        }
        if (g6.a.h(j8)) {
            cVarH = q6.c.c(g6.a.j(j8));
        } else {
            cVarH = q6.c.h();
            int iL = g6.a.l(j8);
            if (iL >= 0) {
                cVarH.f143073a = iL;
            }
        }
        a0 a0Var = this.f110514e;
        q6.a aVar = a0Var.f143089f;
        q6.a aVar2 = a0Var.f143089f;
        aVar.f143026e0 = cVarH;
        if (g6.a.g(j8)) {
            cVarH2 = q6.c.c(g6.a.i(j8));
        } else {
            cVarH2 = q6.c.h();
            int iK = g6.a.k(j8);
            if (iK >= 0) {
                cVarH2.f143073a = iK;
            }
        }
        aVar2.f143028f0 = cVarH2;
        q6.c cVar = aVar2.f143026e0;
        f fVar = this.f110510a;
        cVar.a(fVar, 0);
        aVar2.f143028f0.a(fVar, 1);
        a0Var.f110440l = j8;
        a0Var.f143085b = !(oVar == o.Rtl);
        this.f110511b.clear();
        this.f110512c.clear();
        this.f110513d.clear();
        if (oVar2.a(list)) {
            a0Var.h();
            oVar2.b(a0Var, list);
            k.a(a0Var, list);
            a0Var.a(fVar);
        } else {
            k.a(a0Var, list);
        }
        fVar.T(g6.a.j(j8));
        fVar.O(g6.a.i(j8));
        fVar.f162656x0.c(fVar);
        fVar.K0 = i14;
        d.f116819q = fVar.d0(512);
        fVar.b0(fVar.K0, 0, 0, 0, 0, 0, 0);
        return n.a(fVar.s(), fVar.m());
    }
}
