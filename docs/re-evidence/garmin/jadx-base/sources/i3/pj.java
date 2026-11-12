package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li3/pj;", "Lf5/z0;", "Ll3/x0;", "scrolledOffset", "Lc2/j$l;", "titleVerticalArrangement", "Lh4/d$b;", "titleHorizontalAlignment", "", "titleBottomPadding", "Lg6/f;", "height", "<init>", "(Ll3/x0;Lc2/j$l;Lh4/d$b;IFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class pj implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.x0 f89348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2.j.l f89349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4.d.b f89350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f89352e;

    private pj(l3.x0 x0Var, c2.j.l lVar, h4.d.b bVar, int i14, float f14) {
        this.f89348a = x0Var;
        this.f89349b = lVar;
        this.f89350c = bVar;
        this.f89351d = i14;
        this.f89352e = f14;
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        int size = list.size();
        int iO = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iO += list.get(i15).O(i14);
        }
        return iO;
    }

    @Override // f5.z0
    public final f5.a1 f(final f5.b1 b1Var, List<? extends f5.y0> list, final long j8) {
        int iJ;
        int size = list.size();
        final int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            f5.y0 y0Var = list.get(i15);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "navigationIcon")) {
                final f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, 0, 0, 0, 14, j8));
                int size2 = list.size();
                int i16 = 0;
                while (i16 < size2) {
                    f5.y0 y0Var2 = list.get(i16);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "actionIcons")) {
                        final f5.v1 v1VarQ2 = y0Var2.Q(g6.a.c(0, 0, 0, 0, 14, j8));
                        if (g6.a.j(j8) == Integer.MAX_VALUE) {
                            iJ = g6.a.j(j8);
                        } else {
                            iJ = (g6.a.j(j8) - v1VarQ.f69144a) - v1VarQ2.f69144a;
                            if (iJ < 0) {
                                iJ = 0;
                            }
                        }
                        int i17 = iJ;
                        int size3 = list.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            f5.y0 y0Var3 = list.get(i18);
                            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var3), "title")) {
                                final f5.v1 v1VarQ3 = y0Var3.Q(g6.a.c(0, i17, 0, 0, 12, j8));
                                f5.p pVar = f5.b.f68893b;
                                final int iE = v1VarQ3.E(pVar) != Integer.MIN_VALUE ? v1VarQ3.E(pVar) : 0;
                                float fInvoke = this.f89348a.invoke();
                                int iC = Float.isNaN(fInvoke) ? 0 : MathKt.c(fInvoke);
                                final int iMax = Math.max(b1Var.f0(this.f89352e), v1VarQ3.f69145b);
                                if (g6.a.i(j8) == Integer.MAX_VALUE) {
                                    i14 = iMax;
                                } else {
                                    int i19 = iC + iMax;
                                    if (i19 >= 0) {
                                        i14 = i19;
                                    }
                                }
                                return f5.b1.h0(b1Var, g6.a.j(j8), i14, new e23.l() { // from class: i3.oj
                                    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x0065  */
                                    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
                                    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0076  */
                                    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
                                    @Override // e23.l
                                    public final Object invoke(Object obj) {
                                        int iJ2;
                                        c2.j.l lVar;
                                        int i24;
                                        int i25;
                                        int i26;
                                        int i27;
                                        int i28;
                                        f5.v1.a aVar = (f5.v1.a) obj;
                                        f5.v1 v1Var = v1VarQ;
                                        int i29 = v1Var.f69145b;
                                        int i30 = i14;
                                        int iMax2 = 0;
                                        f5.v1.a.B(aVar, v1Var, 0, (i30 - i29) / 2);
                                        int iMax3 = Math.max(b1Var.f0(y.f90380e), v1Var.f69144a);
                                        f5.v1 v1Var2 = v1VarQ2;
                                        int i34 = v1Var2.f69144a;
                                        pj pjVar = this;
                                        h4.d.b bVar = pjVar.f89350c;
                                        f5.v1 v1Var3 = v1VarQ3;
                                        int i35 = v1Var3.f69144a;
                                        long j14 = j8;
                                        int iA = bVar.a(i35, g6.a.j(j14), g6.o.Ltr);
                                        if (iA >= iMax3) {
                                            if (v1Var3.f69144a + iA > g6.a.j(j14) - i34) {
                                                iJ2 = (g6.a.j(j14) - i34) - (v1Var3.f69144a + iA);
                                            }
                                            lVar = pjVar.f89349b;
                                            c2.j.f22691a.getClass();
                                            if (p005kotlin.jvm.internal.s.g(lVar, c2.j.f22696f)) {
                                                iMax2 = (i30 - v1Var3.f69145b) / 2;
                                            } else if (p005kotlin.jvm.internal.s.g(lVar, c2.j.f22695e)) {
                                                i24 = pjVar.f89351d;
                                                i25 = v1Var3.f69145b;
                                                if (i24 == 0) {
                                                    iMax2 = i30 - i25;
                                                } else {
                                                    i26 = i24 - (i25 - iE);
                                                    i27 = i26 + i25;
                                                    i28 = iMax;
                                                    if (i27 > i28) {
                                                        i26 -= i27 - i28;
                                                    }
                                                    iMax2 = (i30 - i25) - Math.max(0, i26);
                                                }
                                            }
                                            f5.v1.a.B(aVar, v1Var3, iA, iMax2);
                                            f5.v1.a.B(aVar, v1Var2, g6.a.j(j14) - v1Var2.f69144a, (i30 - v1Var2.f69145b) / 2);
                                            return Unit.INSTANCE;
                                        }
                                        iJ2 = iMax3 - iA;
                                        iA += iJ2;
                                        lVar = pjVar.f89349b;
                                        c2.j.f22691a.getClass();
                                        if (p005kotlin.jvm.internal.s.g(lVar, c2.j.f22696f)) {
                                            iMax2 = (i30 - v1Var3.f69145b) / 2;
                                        } else if (p005kotlin.jvm.internal.s.g(lVar, c2.j.f22695e)) {
                                            i24 = pjVar.f89351d;
                                            i25 = v1Var3.f69145b;
                                            if (i24 == 0) {
                                                iMax2 = i30 - i25;
                                            } else {
                                                i26 = i24 - (i25 - iE);
                                                i27 = i26 + i25;
                                                i28 = iMax;
                                                if (i27 > i28) {
                                                    i26 -= i27 - i28;
                                                }
                                                iMax2 = (i30 - i25) - Math.max(0, i26);
                                            }
                                        }
                                        f5.v1.a.B(aVar, v1Var3, iA, iMax2);
                                        f5.v1.a.B(aVar, v1Var2, g6.a.j(j14) - v1Var2.f69144a, (i30 - v1Var2.f69145b) / 2);
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            i18++;
                            this = this;
                        }
                        throw hb.a.m("Collection contains no element matching the predicate.");
                    }
                    i16++;
                    this = this;
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        Integer num;
        int iF0 = xVar.f0(this.f89352e);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).e0(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).e0(i14));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i15 == size) {
                        break;
                    }
                    i15++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iF0, num != null ? num.intValue() : 0);
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        Integer num;
        int iF0 = xVar.f0(this.f89352e);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).a0(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).a0(i14));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i15 == size) {
                        break;
                    }
                    i15++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iF0, num != null ? num.intValue() : 0);
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        int size = list.size();
        int iL0 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iL0 += list.get(i15).l0(i14);
        }
        return iL0;
    }

    public /* synthetic */ pj(l3.x0 x0Var, c2.j.l lVar, h4.d.b bVar, int i14, float f14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, lVar, bVar, i14, f14);
    }
}
