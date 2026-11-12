package qc;

import c53.q;
import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import lc.g0;
import lc.h0;
import lc.j0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p1.l1;
import p1.n1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqc/l;", "", "Llc/j0;", "graph", "<init>", "(Llc/j0;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f144352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1<h0> f144353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f144355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f144356e;

    public l(j0 j0Var) {
        j0Var.getClass();
        this.f144352a = j0Var;
        this.f144353b = new l1<>(0, 1, null);
    }

    public final void a(h0 h0Var) {
        j0 j0Var = this.f144352a;
        j jVar = j0Var.f111773b;
        h0Var.getClass();
        j jVar2 = h0Var.f111773b;
        int i14 = jVar2.f144346e;
        String str = jVar2.f144347f;
        if (i14 == 0 && str == null) {
            vb.h.s("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = jVar.f144347f;
        if (str2 != null && s.g(str, str2)) {
            vb.h.A("Destination ", h0Var, " cannot have the same route as graph ", j0Var);
            return;
        }
        if (i14 == jVar.f144346e) {
            vb.h.A("Destination ", h0Var, " cannot have the same id as graph ", j0Var);
            return;
        }
        l1<h0> l1Var = this.f144353b;
        h0 h0VarC = l1Var.c(i14);
        if (h0VarC == h0Var) {
            return;
        }
        if (h0Var.f111774c != null) {
            vb.h.z("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (h0VarC != null) {
            h0VarC.f111774c = null;
        }
        h0Var.f111774c = j0Var;
        l1Var.e(jVar2.f144346e, h0Var);
    }

    public final h0 b(int i14) {
        return d(i14, this.f144352a, null, false);
    }

    public final h0 c(String str, boolean z14) {
        Object next;
        j0 j0Var;
        h0 h0Var;
        str.getClass();
        l1<h0> l1Var = this.f144353b;
        l1Var.getClass();
        Iterator it = ((c53.a) q.b(new n1(l1Var))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            h0Var = (h0) next;
            if (u.q(h0Var.f111773b.f144347f, str, false)) {
                break;
            }
        } while (h0Var.f111773b.a(str) == null);
        h0 h0Var2 = (h0) next;
        if (h0Var2 != null) {
            return h0Var2;
        }
        if (!z14 || (j0Var = this.f144352a.f111774c) == null) {
            return null;
        }
        return j0Var.m(str);
    }

    public final h0 d(int i14, h0 h0Var, h0 h0Var2, boolean z14) {
        l1<h0> l1Var = this.f144353b;
        h0 h0VarC = l1Var.c(i14);
        if (h0Var2 != null) {
            if (s.g(h0VarC, h0Var2) && s.g(h0VarC.f111774c, h0Var2.f111774c)) {
                return h0VarC;
            }
            h0VarC = null;
        } else if (h0VarC != null) {
            return h0VarC;
        }
        j0 j0Var = this.f144352a;
        if (z14) {
            Iterator it = ((c53.a) q.b(new n1(l1Var))).iterator();
            do {
                if (!it.hasNext()) {
                    h0VarC = null;
                    break;
                }
                h0 h0Var3 = (h0) it.next();
                h0VarC = (!(h0Var3 instanceof j0) || h0Var3.equals(h0Var)) ? null : ((j0) h0Var3).f111791g.d(i14, j0Var, h0Var2, true);
            } while (h0VarC == null);
        }
        if (h0VarC != null) {
            return h0VarC;
        }
        j0 j0Var2 = j0Var.f111774c;
        if (j0Var2 == null || j0Var2.equals(h0Var)) {
            return null;
        }
        j0 j0Var3 = j0Var.f111774c;
        j0Var3.getClass();
        return j0Var3.f111791g.d(i14, j0Var, h0Var2, z14);
    }

    public final h0.b e(h0.b bVar, g0 g0Var, boolean z14, h0 h0Var) {
        h0.b bVarN;
        ArrayList arrayList = new ArrayList();
        j0 j0Var = this.f144352a;
        Iterator<h0> it = j0Var.iterator();
        while (true) {
            bVarN = null;
            if (!it.hasNext()) {
                break;
            }
            h0 next = it.next();
            bVarN = s.g(next, h0Var) ? null : next.h(g0Var);
            if (bVarN != null) {
                arrayList.add(bVarN);
            }
        }
        h0.b bVar2 = (h0.b) p13.h0.o0(arrayList);
        j0 j0Var2 = j0Var.f111774c;
        if (j0Var2 != null && z14 && !j0Var2.equals(h0Var)) {
            bVarN = j0Var2.n(g0Var, j0Var);
        }
        return (h0.b) p13.h0.o0(p13.u.C(new h0.b[]{bVar, bVar2, bVarN}));
    }

    public final void f(int i14) {
        j0 j0Var = this.f144352a;
        if (i14 == j0Var.f111773b.f144346e) {
            q6.f.v(" cannot use the same id as the graph ", "Start destination ", i14, j0Var);
            return;
        }
        if (this.f144356e != null) {
            g(null);
        }
        this.f144354c = i14;
        this.f144355d = null;
    }

    public final void g(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            j0 j0Var = this.f144352a;
            if (str.equals(j0Var.f111773b.f144347f)) {
                vb.h.A("Start destination ", str, " cannot use the same route as the graph ", j0Var);
                return;
            } else if (w.J(str)) {
                vb.h.s("Cannot have an empty start destination route");
                return;
            } else {
                h0.f111771f.getClass();
                iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
            }
        }
        this.f144354c = iHashCode;
        this.f144356e = str;
    }
}
