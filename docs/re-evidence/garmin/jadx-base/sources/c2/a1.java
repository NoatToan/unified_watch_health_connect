package c2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc2/a1;", "Lf5/e1;", "Lc2/z0;", "", "isHorizontal", "Lc2/j$e;", "horizontalArrangement", "Lc2/j$l;", "verticalArrangement", "Lg6/f;", "mainAxisSpacing", "Lc2/f0;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Lc2/w0;", "overflow", "<init>", "(ZLc2/j$e;Lc2/j$l;FLc2/f0;FIILc2/w0;Lkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a1 implements f5.e1, z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j.e f22581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.l f22582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f22584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f22585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w0 f22588i;

    private a1(boolean z14, j.e eVar, j.l lVar, float f14, f0 f0Var, float f15, int i14, int i15, w0 w0Var) {
        this.f22580a = z14;
        this.f22581b = eVar;
        this.f22582c = lVar;
        this.f22583d = f14;
        this.f22584e = f0Var;
        this.f22585f = f15;
        this.f22586g = i14;
        this.f22587h = i15;
        this.f22588i = w0Var;
    }

    @Override // f5.e1
    public final int c(f5.x xVar, List<? extends List<? extends f5.w>> list, int i14) {
        List list2 = (List) p13.h0.e0(1, list);
        f5.w wVar = list2 != null ? (f5.w) p13.h0.d0(list2) : null;
        List list3 = (List) p13.h0.e0(2, list);
        f5.w wVar2 = list3 != null ? (f5.w) p13.h0.d0(list3) : null;
        this.f22588i.b(wVar, wVar2, this.f22580a, g6.b.b(0, i14, 7));
        boolean z14 = this.f22580a;
        float f14 = this.f22585f;
        float f15 = this.f22583d;
        if (z14) {
            List<? extends f5.w> list4 = (List) p13.h0.d0(list);
            if (list4 == null) {
                list4 = p13.j0.f134944a;
            }
            return p(list4, i14, xVar.f0(f15), xVar.f0(f14), this.f22586g, this.f22587h, this.f22588i);
        }
        List<? extends f5.w> list5 = (List) p13.h0.d0(list);
        if (list5 == null) {
            list5 = p13.j0.f134944a;
        }
        return n(list5, i14, xVar.f0(f15), xVar.f0(f14), this.f22586g, this.f22587h, this.f22588i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f22580a == a1Var.f22580a && p005kotlin.jvm.internal.s.g(this.f22581b, a1Var.f22581b) && p005kotlin.jvm.internal.s.g(this.f22582c, a1Var.f22582c) && g6.f.c(this.f22583d, a1Var.f22583d) && p005kotlin.jvm.internal.s.g(this.f22584e, a1Var.f22584e) && g6.f.c(this.f22585f, a1Var.f22585f) && this.f22586g == a1Var.f22586g && this.f22587h == a1Var.f22587h && p005kotlin.jvm.internal.s.g(this.f22588i, a1Var.f22588i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, q3.c] */
    /* JADX WARN: Type inference failed for: r13v18, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r3v10, types: [c2.x0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r8v12, types: [f5.v1[]] */
    /* JADX WARN: Type inference failed for: r9v25, types: [c2.e0] */
    /* JADX WARN: Type inference failed for: r9v28 */
    @Override // f5.e1
    public final f5.a1 f(f5.b1 b1Var, List<? extends List<? extends f5.y0>> list, long j8) {
        f5.y0 y0VarA;
        o0.b bVar;
        o0.a aVarA;
        int i14;
        int i15;
        int i16;
        int f68912b;
        int f68911a;
        int i17;
        f5.y0 y0VarA2;
        f5.y0 y0Var;
        p1.k kVarA;
        o0.b bVar2;
        p1.h0 h0Var;
        p1.j0 j0Var;
        p1.h0 h0Var2;
        int i18;
        int i19;
        p1.j0 j0Var2;
        int i24;
        int i25;
        p0 p0Var;
        final a1 a1Var = this;
        f5.b1 b1Var2 = b1Var;
        final int i26 = 0;
        if (a1Var.f22587h != 0 && a1Var.f22586g != 0 && !((ArrayList) list).isEmpty()) {
            int i27 = g6.a.i(j8);
            final w0 w0Var = a1Var.f22588i;
            if (i27 != 0 || w0Var.f22907a == u0.a.Visible) {
                List list2 = (List) p13.h0.b0(list);
                if (list2.isEmpty()) {
                    return f5.b1.h0(b1Var2, 0, 0, new bt1.s(27));
                }
                final int i28 = 1;
                List list3 = (List) p13.h0.e0(1, list);
                f5.y0 y0Var2 = list3 != null ? (f5.y0) p13.h0.d0(list3) : null;
                List list4 = (List) p13.h0.e0(2, list);
                f5.y0 y0Var3 = list4 != null ? (f5.y0) p13.h0.d0(list4) : null;
                list2.size();
                w0Var.getClass();
                boolean z14 = a1Var.f22580a;
                u1 u1Var = z14 ? u1.Horizontal : u1.Vertical;
                long jC = d2.c(d2.b(10, d2.a(j8, u1Var)), u1Var);
                if (y0Var2 != null) {
                    t0.c(y0Var2, a1Var, jC, new e23.l() { // from class: c2.v0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int iB;
                            int iA;
                            int iB2;
                            int iA2;
                            f5.v1 v1Var = (f5.v1) obj;
                            switch (i26) {
                                case 0:
                                    if (v1Var != null) {
                                        a1 a1Var2 = a1Var;
                                        iB = a1Var2.b(v1Var);
                                        iA = a1Var2.a(v1Var);
                                    } else {
                                        iB = 0;
                                        iA = 0;
                                    }
                                    p1.k kVarA2 = p1.k.a(p1.k.b(iB, iA));
                                    w0 w0Var2 = w0Var;
                                    w0Var2.f22914h = kVarA2;
                                    w0Var2.f22911e = v1Var;
                                    break;
                                default:
                                    if (v1Var != null) {
                                        a1 a1Var3 = a1Var;
                                        iB2 = a1Var3.b(v1Var);
                                        iA2 = a1Var3.a(v1Var);
                                    } else {
                                        iB2 = 0;
                                        iA2 = 0;
                                    }
                                    p1.k kVarA3 = p1.k.a(p1.k.b(iB2, iA2));
                                    w0 w0Var3 = w0Var;
                                    w0Var3.f22915i = kVarA3;
                                    w0Var3.f22913g = v1Var;
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    w0Var.f22910d = y0Var2;
                }
                if (y0Var3 != null) {
                    t0.c(y0Var3, a1Var, jC, new e23.l() { // from class: c2.v0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int iB;
                            int iA;
                            int iB2;
                            int iA2;
                            f5.v1 v1Var = (f5.v1) obj;
                            switch (i28) {
                                case 0:
                                    if (v1Var != null) {
                                        a1 a1Var2 = a1Var;
                                        iB = a1Var2.b(v1Var);
                                        iA = a1Var2.a(v1Var);
                                    } else {
                                        iB = 0;
                                        iA = 0;
                                    }
                                    p1.k kVarA2 = p1.k.a(p1.k.b(iB, iA));
                                    w0 w0Var2 = w0Var;
                                    w0Var2.f22914h = kVarA2;
                                    w0Var2.f22911e = v1Var;
                                    break;
                                default:
                                    if (v1Var != null) {
                                        a1 a1Var3 = a1Var;
                                        iB2 = a1Var3.b(v1Var);
                                        iA2 = a1Var3.a(v1Var);
                                    } else {
                                        iB2 = 0;
                                        iA2 = 0;
                                    }
                                    p1.k kVarA3 = p1.k.a(p1.k.b(iB2, iA2));
                                    w0 w0Var3 = w0Var;
                                    w0Var3.f22915i = kVarA3;
                                    w0Var3.f22913g = v1Var;
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    w0Var.f22912f = y0Var3;
                }
                Iterator it = list2.iterator();
                long jA = d2.a(j8, z14 ? u1.Horizontal : u1.Vertical);
                int i29 = t0.f22879a;
                Object cVar = new q3.c(new f5.a1[16], 0);
                int iJ = g6.a.j(jA);
                int iL = g6.a.l(jA);
                int i30 = g6.a.i(jA);
                p1.i0 i0VarA = p1.o.a();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(b1Var2.s0(a1Var.f22583d));
                int iCeil2 = (int) Math.ceil(b1Var2.s0(a1Var.f22585f));
                ArrayList arrayList2 = arrayList;
                long jA2 = g6.b.a(0, iJ, 0, i30);
                long jC2 = d2.c(d2.b(14, jA2), z14 ? u1.Horizontal : u1.Vertical);
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                x0 x0Var = it instanceof e0 ? new x0(0, 0, b1Var2.c1(iJ), b1Var2.c1(i30), null) : null;
                if (it.hasNext()) {
                    try {
                        try {
                            if (it instanceof e0) {
                                e0 e0Var = (e0) it;
                                x0Var.getClass();
                                x0 x0Var2 = x0Var;
                                y0VarA = e0Var.a(x0Var2);
                                cVar = x0Var2;
                            } else {
                                cVar = x0Var;
                                y0VarA = (f5.y0) it.next();
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            y0VarA = null;
                        }
                    } catch (IndexOutOfBoundsException unused2) {
                        cVar = cVar;
                        cVar = x0Var;
                    }
                } else {
                    cVar = cVar;
                    y0VarA = null;
                    cVar = x0Var;
                }
                p1.k kVarA2 = y0VarA != null ? p1.k.a(t0.c(y0VarA, a1Var, jC2, new s0(r0Var, 0))) : null;
                Integer numValueOf = kVarA2 != null ? Integer.valueOf((int) (kVarA2.f134757a >> 32)) : null;
                p1.k kVar = kVarA2;
                Integer numValueOf2 = kVarA2 != null ? Integer.valueOf((int) (kVarA2.f134757a & 4294967295L)) : null;
                p1.h0 h0Var3 = new p1.h0(0, 1, null);
                f5.y0 y0Var4 = y0VarA;
                p1.h0 h0Var4 = new p1.h0(0, 1, null);
                int[] iArr = p1.q.f134798a;
                p1.j0 j0Var3 = new p1.j0(0, 1, null);
                int i34 = a1Var.f22586g;
                w0 w0Var2 = a1Var.f22588i;
                o0 o0Var = new o0(i34, w0Var2, jA, a1Var.f22587h, iCeil, iCeil2, null);
                int i35 = i34;
                o0.b bVarB = o0Var.b(it.hasNext(), 0, p1.k.b(iJ, i30), kVar, 0, 0, 0, false, false);
                if (bVarB.f22802b) {
                    bVar = bVarB;
                    aVarA = o0Var.a(bVar, kVar != null, -1, 0, iJ, 0);
                } else {
                    bVar = bVarB;
                    aVarA = null;
                }
                int i36 = iJ;
                Integer num = numValueOf2;
                o0.a aVarA2 = aVarA;
                int i37 = i36;
                p1.h0 h0Var5 = h0Var3;
                p1.j0 j0Var4 = j0Var3;
                p1.h0 h0Var6 = h0Var4;
                int i38 = i30;
                o0.b bVar3 = bVar;
                f5.y0 y0Var5 = y0Var4;
                int i39 = 0;
                int i44 = 0;
                int i45 = 0;
                boolean z15 = false;
                int i46 = 0;
                int i47 = 0;
                int i48 = iL;
                int i49 = iCeil;
                int i54 = 0;
                ?? r14 = cVar;
                while (!bVar3.f22802b && y0Var5 != null) {
                    numValueOf.getClass();
                    int iIntValue = numValueOf.intValue();
                    num.getClass();
                    int iIntValue2 = num.intValue();
                    int i55 = i36;
                    int i56 = i44 + iIntValue;
                    int iMax = Math.max(i54, iIntValue2);
                    int i57 = i37 - iIntValue;
                    int i58 = i39 + 1;
                    w0Var2.getClass();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(y0Var5);
                    i0VarA.i(i39, r0Var.f105810a);
                    Object f81969t = y0Var5.getA();
                    p2 p2Var = f81969t instanceof p2 ? (p2) f81969t : null;
                    if (((p2Var == null || (p0Var = p2Var.f22814d) == null) ? null : Float.valueOf(p0Var.f22809a)) != null) {
                        z15 = true;
                    }
                    int i59 = i58 - i45;
                    boolean z16 = i59 < i35;
                    if (r14 != 0) {
                        if (z16) {
                            int i64 = i57 - i49;
                            i17 = i59;
                            i24 = i64 < 0 ? 0 : i64;
                        } else {
                            i17 = i59;
                            i24 = i55;
                        }
                        b1Var2.c1(i24);
                        if (z16) {
                            i25 = i38;
                        } else {
                            i25 = (i38 - iMax) - iCeil2;
                            if (i25 < 0) {
                                i25 = 0;
                            }
                        }
                        b1Var2.c1(i25);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        i17 = i59;
                    }
                    if (it.hasNext()) {
                        try {
                            if (it instanceof e0) {
                                r14.getClass();
                                y0VarA2 = ((e0) it).a(r14);
                            } else {
                                y0VarA2 = (f5.y0) it.next();
                            }
                        } catch (IndexOutOfBoundsException unused3) {
                            y0VarA2 = null;
                        }
                        y0Var = y0VarA2;
                    } else {
                        y0Var = null;
                    }
                    r0Var.f105810a = null;
                    p1.k kVarA3 = y0Var != null ? p1.k.a(t0.c(y0Var, a1Var, jC2, new s0(r0Var, 1))) : null;
                    Iterator it3 = it;
                    ?? r15 = r14;
                    Integer numValueOf3 = kVarA3 != null ? Integer.valueOf(((int) (kVarA3.f134757a >> 32)) + i49) : null;
                    int i65 = i35;
                    f5.y0 y0Var6 = y0Var;
                    Integer numValueOf4 = kVarA3 != null ? Integer.valueOf((int) (kVarA3.f134757a & 4294967295L)) : null;
                    boolean zHasNext = it3.hasNext();
                    int i66 = i46;
                    long jB = p1.k.b(i57, i38);
                    if (kVarA3 == null) {
                        kVarA = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue3 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        kVarA = p1.k.a(p1.k.b(iIntValue3, numValueOf4.intValue()));
                    }
                    o0.b bVarB2 = o0Var.b(zHasNext, i17, jB, kVarA, i66, i47, iMax, false, false);
                    p1.k kVar2 = kVarA3;
                    int i67 = iMax;
                    if (bVarB2.f22801a) {
                        int iMin = Math.min(Math.max(i48, i56), i55);
                        int i68 = i47 + i67;
                        bVar2 = bVarB2;
                        aVarA2 = o0Var.a(bVar2, kVar2 != null, i66, i68, i57, i17);
                        h0Var2 = h0Var6;
                        h0Var2.d(i67);
                        if (z15) {
                            j0Var2 = j0Var4;
                            j0Var2.f134794b[j0Var2.d(i66)] = i66;
                        } else {
                            j0Var2 = j0Var4;
                        }
                        int i69 = (i30 - i68) - iCeil2;
                        p1.h0 h0Var7 = h0Var5;
                        h0Var7.d(i58);
                        i19 = i58;
                        int i74 = i49;
                        numValueOf3 = numValueOf3 != null ? b71.i.e(i74, numValueOf3) : null;
                        i46 = i66 + 1;
                        i49 = i74;
                        i18 = i55;
                        j0Var = j0Var2;
                        i38 = i69;
                        i45 = i19;
                        i47 = i68 + iCeil2;
                        z15 = false;
                        i48 = iMin;
                        i37 = i18;
                        h0Var = h0Var7;
                        i56 = 0;
                        i67 = 0;
                    } else {
                        bVar2 = bVarB2;
                        h0Var = h0Var5;
                        j0Var = j0Var4;
                        h0Var2 = h0Var6;
                        i18 = i55;
                        i19 = i58;
                        i37 = i57;
                        i46 = i66;
                    }
                    numValueOf = numValueOf3;
                    o0.a aVar = aVarA2;
                    Integer num2 = numValueOf4;
                    i35 = i65;
                    r14 = r15;
                    i39 = i19;
                    num = num2;
                    h0Var5 = h0Var;
                    aVarA2 = aVar;
                    h0Var6 = h0Var2;
                    i44 = i56;
                    i36 = i18;
                    bVar3 = bVar2;
                    b1Var2 = b1Var;
                    it = it3;
                    j0Var4 = j0Var;
                    arrayList2 = arrayList3;
                    i54 = i67;
                    y0Var5 = y0Var6;
                    a1Var = this;
                }
                ArrayList arrayList4 = arrayList2;
                p1.h0 h0Var8 = h0Var5;
                p1.j0 j0Var5 = j0Var4;
                p1.h0 h0Var9 = h0Var6;
                if (aVarA2 != null) {
                    o0.a aVar2 = aVarA2;
                    long j14 = aVar2.f22799c;
                    arrayList4.add(aVar2.f22797a);
                    i0VarA.i(arrayList4.size() - 1, aVar2.f22798b);
                    int i75 = h0Var8.f134763b - 1;
                    if (aVar2.f22800d) {
                        h0Var9.g(i75, Math.max(h0Var9.a(i75), (int) (j14 & 4294967295L)));
                        h0Var8.g(i75, h0Var8.b() + 1);
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        h0Var9.d((int) (j14 & 4294967295L));
                        h0Var8.d(h0Var8.b() + 1);
                    }
                }
                int size = arrayList4.size();
                ArrayList arrayList5 = arrayList4;
                ?? r16 = new f5.v1[size];
                for (int i76 = 0; i76 < size; i76++) {
                    r16[i76] = i0VarA.b(i76);
                }
                int i77 = h0Var8.f134763b;
                int[] iArr2 = new int[i77];
                int[] iArr3 = new int[i77];
                int[] iArr4 = h0Var8.f134762a;
                int i78 = i48;
                int i79 = 0;
                int i84 = 0;
                int i85 = 0;
                ?? r34 = cVar;
                while (i84 < i77) {
                    int i86 = iArr4[i84];
                    int iA = h0Var9.a(i84);
                    if (!j0Var5.a(i84)) {
                        iA = g6.a.i(jA2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : g6.a.i(jA2) - i85;
                    }
                    ArrayList arrayList6 = arrayList5;
                    p1.j0 j0Var6 = j0Var5;
                    p1.h0 h0Var10 = h0Var9;
                    int[] iArr5 = iArr2;
                    int i87 = i77;
                    ?? r17 = r34;
                    int i88 = i49;
                    f5.a1 a1VarR = l.r(this, i78, g6.a.k(jA2), g6.a.j(jA2), iA, i88, b1Var, arrayList6, r16, i79, i86, iArr5, i84);
                    int i89 = i78;
                    if (z14) {
                        f68912b = a1VarR.getF81748b();
                        f68911a = a1VarR.getF81749c();
                    } else {
                        f68912b = a1VarR.getF81749c();
                        f68911a = a1VarR.getF81748b();
                    }
                    iArr3[i84] = f68911a;
                    i85 += f68911a;
                    int iMax2 = Math.max(i89, f68912b);
                    r17.b(a1VarR);
                    i84++;
                    i78 = iMax2;
                    arrayList5 = arrayList6;
                    i79 = i86;
                    iArr2 = iArr5;
                    r34 = r17;
                    i77 = i87;
                    i49 = i88;
                    j0Var5 = j0Var6;
                    h0Var9 = h0Var10;
                }
                int i93 = i78;
                int[] iArr6 = iArr2;
                ?? r18 = r34;
                if (r18.f142358c == 0) {
                    i15 = 0;
                    i14 = 0;
                } else {
                    i14 = i93;
                    i15 = i85;
                }
                if (z14) {
                    j.l lVar = this.f22582c;
                    int iB = b71.i.b(r18.f142358c, 1, b1Var.f0(lVar.getF22711d()), i15);
                    int iK = g6.a.k(jA);
                    i16 = g6.a.i(jA);
                    if (iB < iK) {
                        iB = iK;
                    }
                    if (iB <= i16) {
                        i16 = iB;
                    }
                    lVar.c(b1Var, i16, iArr3, iArr6);
                } else {
                    j.e eVar = this.f22581b;
                    int iB2 = b71.i.b(r18.f142358c, 1, b1Var.f0(eVar.getF22711d()), i15);
                    int iK2 = g6.a.k(jA);
                    int i94 = g6.a.i(jA);
                    if (iB2 < iK2) {
                        iB2 = iK2;
                    }
                    if (iB2 <= i94) {
                        i94 = iB2;
                    }
                    int i95 = i94;
                    eVar.b(b1Var, i95, iArr3, b1Var.getF68910b(), iArr6);
                    i16 = i95;
                }
                int iL2 = g6.a.l(jA);
                int iJ2 = g6.a.j(jA);
                if (i14 < iL2) {
                    i14 = iL2;
                }
                if (i14 <= iJ2) {
                    iJ2 = i14;
                }
                if (z14) {
                    int i96 = i16;
                    i16 = iJ2;
                    iJ2 = i96;
                }
                return f5.b1.h0(b1Var, i16, iJ2, new b41.a(r18, 11));
            }
        }
        return f5.b1.h0(b1Var2, 0, 0, new bt1.s(26));
    }

    @Override // f5.e1
    public final int g(f5.x xVar, List<? extends List<? extends f5.w>> list, int i14) {
        List list2 = (List) p13.h0.e0(1, list);
        f5.w wVar = list2 != null ? (f5.w) p13.h0.d0(list2) : null;
        List list3 = (List) p13.h0.e0(2, list);
        f5.w wVar2 = list3 != null ? (f5.w) p13.h0.d0(list3) : null;
        this.f22588i.b(wVar, wVar2, this.f22580a, g6.b.b(i14, 0, 13));
        boolean z14 = this.f22580a;
        float f14 = this.f22585f;
        float f15 = this.f22583d;
        if (z14) {
            List<? extends f5.w> list4 = (List) p13.h0.d0(list);
            if (list4 == null) {
                list4 = p13.j0.f134944a;
            }
            return n(list4, i14, xVar.f0(f15), xVar.f0(f14), this.f22586g, this.f22587h, this.f22588i);
        }
        List<? extends f5.w> list5 = (List) p13.h0.d0(list);
        if (list5 == null) {
            list5 = p13.j0.f134944a;
        }
        return p(list5, i14, xVar.f0(f15), xVar.f0(f14), this.f22586g, this.f22587h, this.f22588i);
    }

    @Override // f5.e1
    public final int h(f5.x xVar, List<? extends List<? extends f5.w>> list, int i14) {
        List list2 = (List) p13.h0.e0(1, list);
        f5.w wVar = list2 != null ? (f5.w) p13.h0.d0(list2) : null;
        List list3 = (List) p13.h0.e0(2, list);
        f5.w wVar2 = list3 != null ? (f5.w) p13.h0.d0(list3) : null;
        this.f22588i.b(wVar, wVar2, this.f22580a, g6.b.b(i14, 0, 13));
        boolean z14 = this.f22580a;
        float f14 = this.f22583d;
        if (z14) {
            List<? extends f5.w> list4 = (List) p13.h0.d0(list);
            if (list4 == null) {
                list4 = p13.j0.f134944a;
            }
            return n(list4, i14, xVar.f0(f14), xVar.f0(this.f22585f), this.f22586g, this.f22587h, this.f22588i);
        }
        List list5 = (List) p13.h0.d0(list);
        if (list5 == null) {
            list5 = p13.j0.f134944a;
        }
        return o(i14, xVar.f0(f14), list5);
    }

    public final int hashCode() {
        int iHashCode = (this.f22582c.hashCode() + ((this.f22581b.hashCode() + (Boolean.hashCode(this.f22580a) * 31)) * 31)) * 31;
        g6.f.a aVar = g6.f.f75994b;
        return this.f22588i.hashCode() + r1.q2.d(this.f22587h, r1.q2.d(this.f22586g, q6.f.d(this.f22585f, (this.f22584e.hashCode() + q6.f.d(this.f22583d, iHashCode, 31)) * 31, 31), 31), 31);
    }

    @Override // f5.e1
    public final int i(f5.x xVar, List<? extends List<? extends f5.w>> list, int i14) {
        List list2 = (List) p13.h0.e0(1, list);
        f5.w wVar = list2 != null ? (f5.w) p13.h0.d0(list2) : null;
        List list3 = (List) p13.h0.e0(2, list);
        f5.w wVar2 = list3 != null ? (f5.w) p13.h0.d0(list3) : null;
        this.f22588i.b(wVar, wVar2, this.f22580a, g6.b.b(0, i14, 7));
        boolean z14 = this.f22580a;
        float f14 = this.f22583d;
        if (z14) {
            List list4 = (List) p13.h0.d0(list);
            if (list4 == null) {
                list4 = p13.j0.f134944a;
            }
            return o(i14, xVar.f0(f14), list4);
        }
        List<? extends f5.w> list5 = (List) p13.h0.d0(list);
        if (list5 == null) {
            list5 = p13.j0.f134944a;
        }
        return n(list5, i14, xVar.f0(f14), xVar.f0(this.f22585f), this.f22586g, this.f22587h, this.f22588i);
    }

    @Override // c2.z0
    /* JADX INFO: renamed from: isHorizontal, reason: from getter */
    public final boolean getF22580a() {
        return this.f22580a;
    }

    @Override // c2.z0
    /* JADX INFO: renamed from: k, reason: from getter */
    public final j.l getF22582c() {
        return this.f22582c;
    }

    @Override // c2.z0
    /* JADX INFO: renamed from: l, reason: from getter */
    public final j.e getF22581b() {
        return this.f22581b;
    }

    @Override // c2.z0
    /* JADX INFO: renamed from: m, reason: from getter */
    public final f0 getF22584e() {
        return this.f22584e;
    }

    public final int n(List<? extends f5.w> list, int i14, int i15, int i16, int i17, int i18, w0 w0Var) {
        int iE0;
        int iO;
        long jB;
        int iE1;
        int iO2;
        if (list.isEmpty()) {
            jB = p1.k.b(0, 0);
        } else {
            o0 o0Var = new o0(i17, w0Var, g6.b.a(0, i14, 0, Integer.MAX_VALUE), i18, i15, i16, null);
            f5.w wVar = (f5.w) p13.h0.e0(0, list);
            boolean z14 = this.f22580a;
            if (wVar != null) {
                iE0 = z14 ? wVar.e0(i14) : wVar.O(i14);
            } else {
                iE0 = 0;
            }
            if (wVar != null) {
                iO = z14 ? wVar.O(iE0) : wVar.e0(iE0);
            } else {
                iO = 0;
            }
            int i19 = 0;
            if (o0Var.b(list.size() > 1, 0, p1.k.b(i14, Integer.MAX_VALUE), wVar == null ? null : p1.k.a(p1.k.b(iO, iE0)), 0, 0, 0, false, false).f22802b) {
                p1.k kVarA = w0Var.a(0, 0, wVar != null);
                jB = p1.k.b(kVarA != null ? (int) (kVarA.f134757a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i24 = i14;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i25 < size) {
                    int i30 = i24 - iO;
                    int i34 = i25 + 1;
                    int iMax = Math.max(i29, iE0);
                    f5.w wVar2 = (f5.w) p13.h0.e0(i34, list);
                    if (wVar2 != null) {
                        iE1 = z14 ? wVar2.e0(i14) : wVar2.O(i14);
                    } else {
                        iE1 = 0;
                    }
                    if (wVar2 != null) {
                        iO2 = (z14 ? wVar2.O(iE1) : wVar2.e0(iE1)) + i15;
                    } else {
                        iO2 = 0;
                    }
                    int i35 = i34 - i27;
                    int i36 = i28;
                    int i37 = iE1;
                    int i38 = iO2;
                    o0.b bVarB = o0Var.b(i25 + 2 < list.size(), i35, p1.k.b(i30, Integer.MAX_VALUE), wVar2 == null ? null : p1.k.a(p1.k.b(iO2, iE1)), i36, i19, iMax, false, false);
                    if (bVarB.f22801a) {
                        int i39 = iMax + i16 + i19;
                        o0.a aVarA = o0Var.a(bVarB, wVar2 != null, i36, i39, i30, i35);
                        int i44 = i38 - i15;
                        i28 = i36 + 1;
                        if (bVarB.f22802b) {
                            if (aVarA != null) {
                                long j8 = aVarA.f22799c;
                                if (!aVarA.f22800d) {
                                    i39 += ((int) (j8 & 4294967295L)) + i16;
                                }
                            }
                            i19 = i39;
                            i26 = i34;
                            break;
                        }
                        i29 = 0;
                        i19 = i39;
                        iO = i44;
                        i27 = i34;
                        i24 = i14;
                    } else {
                        i24 = i30;
                        i28 = i36;
                        i29 = iMax;
                        iO = i38;
                    }
                    i25 = i34;
                    i26 = i25;
                    iE0 = i37;
                }
                jB = p1.k.b(i19 - i16, i26);
            }
        }
        return (int) (jB >> 32);
    }

    public final int o(int i14, int i15, List list) {
        int size = list.size();
        int i16 = 0;
        int iMax = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < size) {
            f5.w wVar = (f5.w) list.get(i16);
            int iL0 = (this.f22580a ? wVar.l0(i14) : wVar.a0(i14)) + i15;
            int i19 = i16 + 1;
            if (i19 - i17 == this.f22586g || i19 == list.size()) {
                iMax = Math.max(iMax, (i18 + iL0) - i15);
                i18 = 0;
                i17 = i16;
            } else {
                i18 += iL0;
            }
            i16 = i19;
        }
        return iMax;
    }

    public final int p(List<? extends f5.w> list, int i14, int i15, int i16, int i17, int i18, w0 w0Var) {
        int i19;
        int i24;
        long jB;
        u0.a aVar;
        i17 = i17;
        i18 = i18;
        int i25 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i26 = 0; i26 < size3; i26++) {
            f5.w wVar = list.get(i26);
            boolean z14 = this.f22580a;
            int iO = z14 ? wVar.O(i14) : wVar.e0(i14);
            iArr[i26] = iO;
            iArr2[i26] = z14 ? wVar.e0(iO) : wVar.O(iO);
        }
        int i27 = (i18 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i17 * i18;
        boolean z15 = true;
        int iMin = Math.min(i27 - (((i27 >= list.size() || !((aVar = w0Var.f22907a) == u0.a.ExpandIndicator || aVar == u0.a.ExpandOrCollapseIndicator)) && (i27 < list.size() || i18 < w0Var.f22908b || w0Var.f22907a != u0.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int i28 = 0;
        for (int i29 = 0; i29 < size; i29++) {
            i28 += iArr[i29];
        }
        int size4 = ((list.size() - 1) * i15) + i28;
        if (size2 == 0) {
            c22.t.g();
            return 0;
        }
        int i30 = iArr2[0];
        int i34 = size2 - 1;
        if (1 <= i34) {
            int i35 = 1;
            while (true) {
                int i36 = iArr2[i35];
                if (i30 < i36) {
                    i30 = i36;
                }
                if (i35 == i34) {
                    break;
                }
                i35++;
            }
        }
        if (size == 0) {
            c22.t.g();
            return 0;
        }
        int i37 = iArr[i25];
        int i38 = size - 1;
        if (1 <= i38) {
            int i39 = 1;
            while (true) {
                int i44 = iArr[i39];
                if (i37 < i44) {
                    i37 = i44;
                }
                if (i39 == i38) {
                    break;
                }
                i39++;
            }
        }
        int i45 = i37;
        int i46 = size4;
        while (i45 <= i46 && i30 != i14) {
            int i47 = (i45 + i46) / 2;
            int i48 = t0.f22879a;
            if (list.isEmpty()) {
                int i49 = i25;
                jB = p1.k.b(i49, i49);
                i19 = iMin;
                i24 = i45;
                iArr = iArr;
                iArr2 = iArr2;
                size4 = i47;
                z15 = z15;
            } else {
                int i54 = i25;
                i19 = iMin;
                i24 = i45;
                iArr = iArr;
                iArr2 = iArr2;
                z15 = true;
                size4 = i47;
                o0 o0Var = new o0(i17, w0Var, g6.b.a(i54, i47, i54, Integer.MAX_VALUE), i18, i15, i16, null);
                f5.w wVar2 = (f5.w) p13.h0.e0(i54, list);
                int i55 = wVar2 != null ? iArr2[i54] : i54;
                int i56 = wVar2 != null ? iArr[i54] : 0;
                int i57 = 0;
                int i58 = 0;
                if (o0Var.b(list.size() > 1, 0, p1.k.b(size4, Integer.MAX_VALUE), wVar2 == null ? null : p1.k.a(p1.k.b(i56, i55)), 0, 0, 0, false, false).f22802b) {
                    p1.k kVarA = w0Var.a(0, 0, wVar2 != null);
                    jB = p1.k.b(kVarA != null ? (int) (kVarA.f134757a & 4294967295L) : 0, 0);
                } else {
                    int size5 = list.size();
                    int i59 = i55;
                    int i64 = 0;
                    int i65 = 0;
                    int i66 = 0;
                    int i67 = 0;
                    int i68 = i56;
                    int i69 = size4;
                    while (i65 < size5) {
                        i69 -= i68;
                        i67 = i65 + 1;
                        int iMax = Math.max(i64, i59);
                        f5.w wVar3 = (f5.w) p13.h0.e0(i67, list);
                        i59 = wVar3 != null ? iArr2[i67] : 0;
                        int i74 = wVar3 != null ? iArr[i67] + i15 : 0;
                        int i75 = i67 - i66;
                        o0.b bVarB = o0Var.b(i65 + 2 < list.size(), i75, p1.k.b(i69, Integer.MAX_VALUE), wVar3 == null ? null : p1.k.a(p1.k.b(i74, i59)), i57, i58, iMax, false, false);
                        if (bVarB.f22801a) {
                            int i76 = iMax + i16 + i58;
                            int i77 = i57;
                            o0.a aVarA = o0Var.a(bVarB, wVar3 != null, i77, i76, i69, i75);
                            int i78 = i74 - i15;
                            i57 = i77 + 1;
                            if (bVarB.f22802b) {
                                if (aVarA != null) {
                                    long j8 = aVarA.f22799c;
                                    if (!aVarA.f22800d) {
                                        i76 = ((int) (j8 & 4294967295L)) + i16 + i76;
                                    }
                                }
                                i58 = i76;
                                break;
                            }
                            i66 = i67;
                            i69 = size4;
                            i68 = i78;
                            i58 = i76;
                            i64 = 0;
                        } else {
                            i68 = i74;
                            i64 = iMax;
                        }
                        i65 = i67;
                    }
                    jB = p1.k.b(i58 - i16, i67);
                }
            }
            i30 = (int) (jB >> 32);
            int i79 = (int) (jB & 4294967295L);
            iMin = i19;
            if (i30 > i14 || i79 < iMin) {
                int i84 = size4 + 1;
                if (i84 > i46) {
                    return i84;
                }
                i25 = 0;
                i45 = i84;
            } else {
                if (i30 >= i14) {
                    return size4;
                }
                i46 = size4 - 1;
                i45 = i24;
                i25 = 0;
            }
        }
        return size4;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FlowMeasurePolicy(isHorizontal=");
        sb3.append(this.f22580a);
        sb3.append(", horizontalArrangement=");
        sb3.append(this.f22581b);
        sb3.append(", verticalArrangement=");
        sb3.append(this.f22582c);
        sb3.append(", mainAxisSpacing=");
        tn.k.l(this.f22583d, ", crossAxisAlignment=", sb3);
        sb3.append(this.f22584e);
        sb3.append(", crossAxisArrangementSpacing=");
        tn.k.l(this.f22585f, ", maxItemsInMainAxis=", sb3);
        sb3.append(this.f22586g);
        sb3.append(", maxLines=");
        sb3.append(this.f22587h);
        sb3.append(", overflow=");
        sb3.append(this.f22588i);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ a1(boolean z14, j.e eVar, j.l lVar, float f14, f0 f0Var, float f15, int i14, int i15, w0 w0Var, p005kotlin.jvm.internal.j jVar) {
        this(z14, eVar, lVar, f14, f0Var, f15, i14, i15, w0Var);
    }
}
