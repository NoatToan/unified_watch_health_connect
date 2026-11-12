package p43;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f135919e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f135920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f135921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f135922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o43.e.k f135923d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t23.d1 f135924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f135925b;

        public b(t23.d1 d1Var, d0 d0Var) {
            d1Var.getClass();
            d0Var.getClass();
            this.f135924a = d1Var;
            this.f135925b = d0Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f135924a.equals(this.f135924a) && bVar.f135925b.equals(this.f135925b);
        }

        public final int hashCode() {
            int iHashCode = this.f135924a.hashCode();
            return this.f135925b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f135924a + ", typeAttr=" + this.f135925b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public s1(c0 c0Var, p1 p1Var) {
        c0Var.getClass();
        p1Var.getClass();
        this.f135920a = c0Var;
        this.f135921b = p1Var;
        o43.e eVar = new o43.e("Type parameter upper bound erasure results");
        this.f135922c = o13.m.b(new q1(this));
        this.f135923d = eVar.e(new r1(this));
    }

    public final f2 a(d0 d0Var) {
        f2 f2VarY;
        v0 v0VarA = d0Var.a();
        return (v0VarA == null || (f2VarY = o72.t.Y(v0VarA)) == null) ? (r43.i) this.f135922c.getValue() : f2VarY;
    }

    public final n0 b(t23.d1 d1Var, d0 d0Var) {
        d1Var.getClass();
        d0Var.getClass();
        Object objInvoke = this.f135923d.invoke(new b(d1Var, d0Var));
        objInvoke.getClass();
        return (n0) objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[PHI: r18
      0x00a7: PHI (r18v7 p43.t1) = (r18v6 p43.t1), (r18v8 p43.t1) binds: [B:34:0x00ca, B:23:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x020b  */
    public final q13.g c(a2 a2Var, List list, d0 d0Var) {
        Iterator it;
        v0 v0Var;
        n0 type;
        f2 f2VarD;
        n0 n0Var;
        n0 type2;
        t1 t1Var;
        t1 c1Var;
        n0 type3;
        q13.g gVar = new q13.g();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            n0 n0Var2 = (n0) it3.next();
            t23.h hVarT = n0Var2.F0().t();
            boolean z14 = hVarT instanceof t23.e;
            p1 p1Var = this.f135921b;
            if (z14) {
                Set<t23.d1> setC = d0Var.c();
                boolean z15 = p1Var.f135901a;
                f135919e.getClass();
                f2 f2VarI0 = n0Var2.I0();
                if (f2VarI0 instanceof f0) {
                    f0 f0Var = (f0) f2VarI0;
                    v0 v0VarD = f0Var.f135829b;
                    if (v0VarD.F0().getParameters().isEmpty() || v0VarD.F0().t() == null) {
                        it = it3;
                    } else {
                        List<t23.d1> parameters = v0VarD.F0().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
                        for (t23.d1 d1Var : parameters) {
                            Iterator it4 = it3;
                            t1 t1Var2 = (t1) p13.h0.e0(d1Var.getIndex(), n0Var2.D0());
                            if (!z15 || t1Var2 == null || (type3 = t1Var2.getType()) == null) {
                                t1Var = t1Var2;
                            } else {
                                t1Var = t1Var2;
                                if (!d2.c(type3, u43.a.f168627a)) {
                                    c1Var = t1Var;
                                }
                                arrayList.add(c1Var);
                                it3 = it4;
                            }
                            boolean z16 = setC != null && setC.contains(d1Var);
                            if (t1Var != null && !z16) {
                                w1 w1VarG = a2Var.g();
                                n0 type4 = t1Var.getType();
                                type4.getClass();
                                if (w1VarG.d(type4) != null) {
                                    c1Var = t1Var;
                                }
                                arrayList.add(c1Var);
                                it3 = it4;
                            }
                            c1Var = new c1(d1Var);
                            arrayList.add(c1Var);
                            it3 = it4;
                        }
                        it = it3;
                        v0VarD = y1.d(v0VarD, arrayList, null, 2);
                    }
                    v0 v0VarD2 = f0Var.f135830c;
                    if (!v0VarD2.F0().getParameters().isEmpty() && v0VarD2.F0().t() != null) {
                        List<t23.d1> parameters2 = v0VarD2.F0().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(p13.y.r(parameters2, 10));
                        for (t23.d1 d1Var2 : parameters2) {
                            t1 c1Var2 = (t1) p13.h0.e0(d1Var2.getIndex(), n0Var2.D0());
                            if (!z15 || c1Var2 == null || (type2 = c1Var2.getType()) == null) {
                                n0Var = n0Var2;
                            } else {
                                n0Var = n0Var2;
                                if (!d2.c(type2, u43.a.f168627a)) {
                                }
                                arrayList2.add(c1Var2);
                                n0Var2 = n0Var;
                            }
                            boolean z17 = setC != null && setC.contains(d1Var2);
                            if (c1Var2 == null || z17) {
                                c1Var2 = new c1(d1Var2);
                            } else {
                                w1 w1VarG2 = a2Var.g();
                                n0 type5 = c1Var2.getType();
                                type5.getClass();
                                if (w1VarG2.d(type5) == null) {
                                    c1Var2 = new c1(d1Var2);
                                }
                            }
                            arrayList2.add(c1Var2);
                            n0Var2 = n0Var;
                        }
                        v0VarD2 = y1.d(v0VarD2, arrayList2, null, 2);
                    }
                    f2VarD = q0.b(v0VarD, v0VarD2);
                } else {
                    it = it3;
                    if (!(f2VarI0 instanceof v0)) {
                        lc.u0.r();
                        return null;
                    }
                    v0Var = (v0) f2VarI0;
                    if (!v0Var.F0().getParameters().isEmpty() && v0Var.F0().t() != null) {
                        f2VarD = v0Var;
                        f2VarD = v0Var;
                        List<t23.d1> parameters3 = v0Var.F0().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(p13.y.r(parameters3, 10));
                        for (t23.d1 d1Var3 : parameters3) {
                            t1 c1Var3 = (t1) p13.h0.e0(d1Var3.getIndex(), n0Var2.D0());
                            if (!z15 || c1Var3 == null || (type = c1Var3.getType()) == null || d2.c(type, u43.a.f168627a)) {
                                boolean z18 = setC != null && setC.contains(d1Var3);
                                if (c1Var3 == null || z18) {
                                    c1Var3 = new c1(d1Var3);
                                } else {
                                    w1 w1VarG3 = a2Var.g();
                                    n0 type6 = c1Var3.getType();
                                    type6.getClass();
                                    if (w1VarG3.d(type6) == null) {
                                        c1Var3 = new c1(d1Var3);
                                    }
                                }
                            }
                            arrayList3.add(c1Var3);
                        }
                        f2VarD = y1.d(v0Var, arrayList3, null, 2);
                    }
                }
                f2VarD = v0Var;
                f2VarD = v0Var;
                f2VarD = v0Var;
                gVar.add(a2Var.h(g2.OUT_VARIANCE, og.a.P(f2VarD, f2VarI0)));
            } else {
                it = it3;
                if (hVarT instanceof t23.d1) {
                    Set<t23.d1> setC2 = d0Var.c();
                    if (setC2 == null || !setC2.contains(hVarT)) {
                        List<n0> upperBounds = ((t23.d1) hVarT).getUpperBounds();
                        upperBounds.getClass();
                        gVar.addAll(c(a2Var, upperBounds, d0Var));
                    } else {
                        gVar.add(a(d0Var));
                    }
                }
            }
            if (!p1Var.f135902b) {
                break;
            }
            it3 = it;
        }
        return p13.a1.a(gVar);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ s1(c0 c0Var, p1 p1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c0Var, (i14 & 2) != 0 ? new p1(false, false) : p1Var);
    }
}
