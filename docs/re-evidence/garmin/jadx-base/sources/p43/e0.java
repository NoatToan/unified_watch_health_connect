package p43;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135822a;

        static {
            int[] iArr = new int[t43.t.values().length];
            try {
                iArr[t43.t.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f135822a = iArr;
        }
    }

    public static final t43.n a(b2 b2Var, t43.h hVar) {
        t43.h hVarP;
        t43.n nVarR = b2Var.R(b2Var.G(hVar));
        if (nVarR != null) {
            return nVarR;
        }
        if (b2Var.d(hVar) && (hVarP = b2Var.p((t43.l) p13.h0.I0(b2Var.l0(hVar)))) != null) {
            return a(b2Var, hVarP);
        }
        return null;
    }

    public static final t43.h b(b2 b2Var, t43.h hVar, HashSet<t43.m> hashSet) {
        t43.h hVarN0;
        t43.h hVarB;
        t43.m mVarG = b2Var.G(hVar);
        if (hashSet.add(mVarG)) {
            t43.n nVarR = b2Var.R(mVarG);
            int i14 = 0;
            if (nVarR == null) {
                if (b2Var.z(mVarG)) {
                    List<t43.n> listF0 = b2Var.f0(b2Var.G(hVar));
                    List<t43.l> listL0 = b2Var.l0(hVar);
                    ArrayList arrayList = new ArrayList(p13.y.r(listL0, 10));
                    for (Object obj : listL0) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        t43.h hVarP = b2Var.p((t43.l) obj);
                        if (hVarP == null) {
                            hVarP = b2Var.g0(listF0.get(i14));
                        }
                        arrayList.add(hVarP);
                        i14 = i15;
                    }
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listF0, 10));
                    Iterator<T> it = listF0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b2Var.v((t43.n) it.next()));
                    }
                    a2 a2VarR0 = b2Var.r0(p13.u0.l(p13.h0.k1(arrayList2, arrayList)));
                    v0 v0VarH0 = b2Var.h0(hVar);
                    if (v0VarH0 == null) {
                        hVarN0 = null;
                    } else {
                        t43.n nVarA = a(b2Var, v0VarH0);
                        hVarN0 = nVarA == null ? b2Var.n0(a2VarR0, v0VarH0) : c(b2Var, v0VarH0, b2Var.n0(a2VarR0, b2Var.g0(nVarA)));
                    }
                    if (hVarN0 != null && (hVarB = b(b2Var, hVarN0, hashSet)) != null) {
                        if (!b2Var.T(hVar)) {
                            return hVarB;
                        }
                        if (!b2Var.T(hVarB) && (!(hVarB instanceof t43.j) || !b2Var.t((t43.j) hVarB))) {
                            return b2Var.v0(hVarB);
                        }
                    }
                }
                return hVar;
            }
            t43.h hVarG0 = b2Var.g0(nVarR);
            t43.h hVarB2 = b(b2Var, hVarG0, hashSet);
            if (hVarB2 != null) {
                if (b2Var.z(b2Var.G(hVarG0)) || ((hVarG0 instanceof t43.j) && b2Var.t((t43.j) hVarG0))) {
                    i14 = 1;
                }
                if ((hVarB2 instanceof t43.j) && b2Var.t((t43.j) hVarB2) && b2Var.T(hVar) && i14 != 0) {
                    return b2Var.v0(hVarG0);
                }
                return (b2Var.T(hVarB2) || !b2Var.r(hVar)) ? hVarB2 : b2Var.v0(hVarB2);
            }
        }
        return null;
    }

    public static final t43.h c(b2 b2Var, t43.h hVar, t43.h hVar2) {
        if (b2Var.R(b2Var.G(hVar)) != null) {
            return b2Var.T(hVar) ? b2Var.v0(hVar2) : hVar2;
        }
        t43.l lVar = (t43.l) p13.h0.I0(b2Var.l0(hVar));
        if (a.f135822a[b2Var.n(lVar).ordinal()] == 1) {
            b2Var.B();
            throw null;
        }
        t43.h hVarP = b2Var.p(lVar);
        hVarP.getClass();
        v0 v0VarX0 = b2Var.x0(c(b2Var, hVarP, hVar2));
        return b2Var.T(hVar) ? b2Var.v0(v0VarX0) : v0VarX0;
    }
}
