package qc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.y1;
import c53.c0;
import c53.f0;
import c53.q;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l3.p1;
import l72.b1;
import lc.g0;
import lc.h0;
import lc.j0;
import lc.o0;
import lc.r0;
import lc.t;
import lc.u0;
import lc.v;
import lc.v0;
import lc.w0;
import lc.x;
import lc.y;
import lc.z;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.y0;
import p1.l1;
import p13.d0;
import p13.k0;
import p13.w;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;
import r53.s;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqc/h;", "", "Llc/y;", "navController", "Lkotlin/Function0;", "", "updateOnBackPressedCallbackEnabledCallback", "<init>", "(Llc/y;Le23/a;)V", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final /* synthetic */ int B = 0;
    public final e2 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f144314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f144315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f144316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f144317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f144318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p13.k<v> f144319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f144320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f144321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f144322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f144323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f144324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f144325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f144326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f144327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n0 f144328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z f144329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f144330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b0.b f144331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f144332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f144333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f144334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e23.l<? super v, Unit> f144335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public cq.m f144336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f144337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f144339z;

    static {
        new a(null);
    }

    public h(y yVar, e23.a<Unit> aVar) {
        yVar.getClass();
        aVar.getClass();
        this.f144314a = yVar;
        this.f144315b = aVar;
        this.f144319f = new p13.k<>();
        p13.j0 j0Var = p13.j0.f134944a;
        p2 p2VarA = q2.a(j0Var);
        this.f144320g = p2VarA;
        this.f144321h = s.d(p2VarA);
        p2 p2VarA2 = q2.a(j0Var);
        this.f144322i = p2VarA2;
        this.f144323j = s.d(p2VarA2);
        this.f144324k = new LinkedHashMap();
        this.f144325l = new LinkedHashMap();
        this.f144326m = new LinkedHashMap();
        this.f144327n = new LinkedHashMap();
        this.f144330q = new ArrayList();
        this.f144331r = b0.b.INITIALIZED;
        this.f144332s = new a0(this, 8);
        this.f144333t = new w0();
        this.f144334u = new LinkedHashMap();
        this.f144337x = new LinkedHashMap();
        this.f144339z = new ArrayList();
        this.A = g2.b(1, 0, q53.a.DROP_OLDEST, 2);
    }

    public static h0 e(int i14, h0 h0Var, h0 h0Var2, boolean z14) {
        if (h0Var.f111773b.f144346e == i14 && (h0Var2 == null || (h0Var.equals(h0Var2) && p005kotlin.jvm.internal.s.g(h0Var.f111774c, h0Var2.f111774c)))) {
            return h0Var;
        }
        j0 j0Var = h0Var instanceof j0 ? (j0) h0Var : null;
        if (j0Var == null) {
            j0Var = h0Var.f111774c;
            j0Var.getClass();
        }
        return j0Var.f111791g.d(i14, j0Var, h0Var2, z14);
    }

    public static /* synthetic */ void u(h hVar, v vVar) {
        hVar.t(vVar, false, new p13.k<>());
    }

    public final void a(h0 h0Var, Bundle bundle, v vVar, List<v> list) {
        Bundle bundle2;
        j0 j0Var;
        v vVarPrevious;
        v vVarPrevious2;
        h0 h0Var2 = vVar.f111882b;
        boolean z14 = h0Var2 instanceof lc.k;
        p13.k<v> kVar = this.f144319f;
        if (!z14) {
            while (!kVar.isEmpty() && (kVar.last().f111882b instanceof lc.k) && r(kVar.last().f111882b.f111773b.f144346e, true, false)) {
            }
        }
        p13.k<v> kVar2 = new p13.k();
        boolean z15 = h0Var instanceof j0;
        y yVar = this.f144314a;
        v vVar2 = null;
        if (z15) {
            h0 h0Var3 = h0Var2;
            while (true) {
                h0Var3.getClass();
                j0 j0Var2 = h0Var3.f111774c;
                if (j0Var2 != null) {
                    ListIterator<v> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            vVarPrevious2 = null;
                            break;
                        }
                        vVarPrevious2 = listIterator.previous();
                    } while (!p005kotlin.jvm.internal.s.g(vVarPrevious2.f111882b, j0Var2));
                    v vVarA = vVarPrevious2;
                    if (vVarA == null) {
                        bundle2 = bundle;
                        vVarA = v.a.a(v.f111880j, yVar.f111905c, j0Var2, bundle2, l(), this.f144329p);
                    } else {
                        bundle2 = bundle;
                    }
                    kVar2.addFirst(vVarA);
                    if (!kVar.isEmpty() && kVar.last().f111882b == j0Var2) {
                        u(this, kVar.last());
                    }
                } else {
                    bundle2 = bundle;
                }
                if (j0Var2 == null || j0Var2 == h0Var) {
                    break;
                } else {
                    h0Var3 = j0Var2;
                }
            }
        } else {
            bundle2 = bundle;
        }
        h0 h0Var4 = kVar2.isEmpty() ? h0Var2 : ((v) kVar2.first()).f111882b;
        while (h0Var4 != null && d(h0Var4.f111773b.f144346e, h0Var4) != h0Var4) {
            j0 j0Var3 = h0Var4.f111774c;
            if (j0Var3 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator<v> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        vVarPrevious = null;
                        break;
                    }
                    vVarPrevious = listIterator2.previous();
                } while (!p005kotlin.jvm.internal.s.g(vVarPrevious.f111882b, j0Var3));
                v vVarA2 = vVarPrevious;
                if (vVarA2 == null) {
                    j0Var = j0Var3;
                    vVarA2 = v.a.a(v.f111880j, yVar.f111905c, j0Var, j0Var3.b(bundle3), l(), this.f144329p);
                } else {
                    j0Var = j0Var3;
                }
                kVar2.addFirst(vVarA2);
            } else {
                j0Var = j0Var3;
            }
            h0Var4 = j0Var;
        }
        if (!kVar2.isEmpty()) {
            h0Var2 = ((v) kVar2.first()).f111882b;
        }
        while (!kVar.isEmpty() && (kVar.last().f111882b instanceof j0)) {
            h0 h0Var5 = kVar.last().f111882b;
            h0Var5.getClass();
            if (((j0) h0Var5).f111791g.f144353b.c(h0Var2.f111773b.f144346e) != null) {
                break;
            } else {
                u(this, kVar.last());
            }
        }
        v vVarE = kVar.e();
        if (vVarE == null) {
            vVarE = (v) kVar2.e();
        }
        if (!p005kotlin.jvm.internal.s.g(vVarE != null ? vVarE.f111882b : null, this.f144316c)) {
            ListIterator<v> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                v vVarPrevious3 = listIterator3.previous();
                h0 h0Var6 = vVarPrevious3.f111882b;
                j0 j0Var4 = this.f144316c;
                j0Var4.getClass();
                if (p005kotlin.jvm.internal.s.g(h0Var6, j0Var4)) {
                    vVar2 = vVarPrevious3;
                    break;
                }
            }
            v vVarA3 = vVar2;
            if (vVarA3 == null) {
                v.a aVar = v.f111880j;
                f fVar = yVar.f111905c;
                j0 j0Var5 = this.f144316c;
                j0Var5.getClass();
                j0 j0Var6 = this.f144316c;
                j0Var6.getClass();
                vVarA3 = v.a.a(aVar, fVar, j0Var5, j0Var6.b(bundle2), l(), this.f144329p);
            }
            kVar2.addFirst(vVarA3);
        }
        for (v vVar3 : kVar2) {
            Object obj = this.f144334u.get(this.f144333t.c(vVar3.f111882b.f111772a));
            if (obj == null) {
                e0.n(am.j.o(h0Var.f111772a, " should already be created", new StringBuilder("NavigatorBackStack for ")));
                return;
            }
            ((y.b) obj).i(vVar3);
        }
        kVar.addAll(kVar2);
        kVar.addLast(vVar);
        for (v vVar4 : p13.h0.D0(kVar2, vVar)) {
            j0 j0Var7 = vVar4.f111882b.f111774c;
            if (j0Var7 != null) {
                n(vVar4, g(j0Var7.f111773b.f144346e));
            }
        }
    }

    public final boolean b() {
        p13.k<v> kVar;
        while (true) {
            kVar = this.f144319f;
            if (kVar.isEmpty() || !(kVar.last().f111882b instanceof j0)) {
                break;
            }
            u(this, kVar.last());
        }
        v vVarH = kVar.h();
        ArrayList arrayList = this.f144339z;
        if (vVarH != null) {
            arrayList.add(vVarH);
        }
        this.f144338y++;
        z();
        int i14 = this.f144338y - 1;
        this.f144338y = i14;
        if (i14 == 0) {
            ArrayList<v> arrayListD1 = p13.h0.d1(arrayList);
            arrayList.clear();
            for (v vVar : arrayListD1) {
                Iterator it = p13.h0.b1(this.f144330q).iterator();
                while (it.hasNext()) {
                    ((y.c) it.next()).m8(this.f144314a, vVar.f111882b, vVar.f111888h.a());
                }
                this.A.d(vVar);
            }
            this.f144320g.k(null, new ArrayList(kVar));
            this.f144322i.k(null, v());
        }
        return vVarH != null;
    }

    public final boolean c(ArrayList arrayList, h0 h0Var, boolean z14, boolean z15) {
        h hVar;
        boolean z16;
        m0 m0Var = new m0();
        p13.k kVar = new p13.k();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                hVar = this;
                z16 = z15;
                break;
            }
            v0 v0Var = (v0) it.next();
            m0 m0Var2 = new m0();
            v vVarLast = this.f144319f.last();
            hVar = this;
            z16 = z15;
            cq.m mVar = new cq.m(m0Var2, m0Var, hVar, z16, kVar);
            v0Var.getClass();
            vVarLast.getClass();
            hVar.f144336w = mVar;
            v0Var.i(vVarLast, z16);
            hVar.f144336w = null;
            if (!m0Var2.f105804a) {
                break;
            }
            z15 = z16;
        }
        if (z16) {
            LinkedHashMap linkedHashMap = hVar.f144326m;
            if (!z14) {
                final int i14 = 0;
                f0.a aVar = new f0.a(c0.r(q.e(new c(2), h0Var), new e23.l(this) { // from class: qc.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f144313b;

                    {
                        this.f144313b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        int i15 = i14;
                        h hVar2 = this.f144313b;
                        h0 h0Var2 = (h0) obj;
                        switch (i15) {
                            case 0:
                                int i16 = h.B;
                                h0Var2.getClass();
                                zContainsKey = hVar2.f144326m.containsKey(Integer.valueOf(h0Var2.f111773b.f144346e));
                                break;
                            default:
                                int i17 = h.B;
                                h0Var2.getClass();
                                zContainsKey = hVar2.f144326m.containsKey(Integer.valueOf(h0Var2.f111773b.f144346e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((h0) aVar.next()).f111773b.f144346e);
                    x xVar = (x) kVar.e();
                    linkedHashMap.put(numValueOf, xVar != null ? xVar.f111895a.f144307a : null);
                }
            }
            if (!kVar.isEmpty()) {
                e eVar = ((x) kVar.first()).f111895a;
                final int i15 = 1;
                f0.a aVar2 = new f0.a(c0.r(q.e(new c(3), d(eVar.f144308b, null)), new e23.l(this) { // from class: qc.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f144313b;

                    {
                        this.f144313b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        int i16 = i15;
                        h hVar2 = this.f144313b;
                        h0 h0Var2 = (h0) obj;
                        switch (i16) {
                            case 0:
                                int i17 = h.B;
                                h0Var2.getClass();
                                zContainsKey = hVar2.f144326m.containsKey(Integer.valueOf(h0Var2.f111773b.f144346e));
                                break;
                            default:
                                int i18 = h.B;
                                h0Var2.getClass();
                                zContainsKey = hVar2.f144326m.containsKey(Integer.valueOf(h0Var2.f111773b.f144346e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }));
                while (aVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((h0) aVar2.next()).f111773b.f144346e), eVar.f144307a);
                }
                if (linkedHashMap.values().contains(eVar.f144307a)) {
                    hVar.f144327n.put(eVar.f144307a, kVar);
                }
            }
        }
        hVar.f144315b.invoke();
        return m0Var.f105804a;
    }

    public final h0 d(int i14, h0 h0Var) {
        h0 h0Var2;
        j0 j0Var = this.f144316c;
        if (j0Var == null) {
            return null;
        }
        if (j0Var.f111773b.f144346e == i14) {
            if (h0Var == null) {
                return j0Var;
            }
            if (p005kotlin.jvm.internal.s.g(j0Var, h0Var) && h0Var.f111774c == null) {
                return this.f144316c;
            }
        }
        v vVarH = this.f144319f.h();
        if (vVarH == null || (h0Var2 = vVarH.f111882b) == null) {
            h0Var2 = this.f144316c;
            h0Var2.getClass();
        }
        return e(i14, h0Var2, h0Var, false);
    }

    public final <T> String f(T t7) {
        t7.getClass();
        Class<?> cls = t7.getClass();
        t0 t0Var = s0.f105811a;
        h0 h0VarE = e(rc.l.b(gl1.y.J(t0Var.b(cls))), k(), null, true);
        if (h0VarE == null) {
            vb.h.A("Destination with route ", t0Var.b(t7.getClass()).D(), " cannot be found in navigation graph ", this.f144316c);
            return null;
        }
        Map<String, t> mapE = h0VarE.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(mapE.size()));
        Iterator<T> it = mapE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((t) entry.getValue()).f111866a);
        }
        return rc.l.e(t7, linkedHashMap);
    }

    public final v g(int i14) {
        v vVarPrevious;
        p13.k<v> kVar = this.f144319f;
        ListIterator<v> listIterator = kVar.listIterator(kVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                vVarPrevious = null;
                break;
            }
            vVarPrevious = listIterator.previous();
        } while (vVarPrevious.f111882b.f111773b.f144346e != i14);
        v vVar = vVarPrevious;
        if (vVar != null) {
            return vVar;
        }
        StringBuilder sbI = b71.i.i(i14, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbI.append(j());
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public final v h(String str) {
        v vVarPrevious;
        v vVar;
        p13.k<v> kVar = this.f144319f;
        ListIterator<v> listIterator = kVar.listIterator(kVar.getF97124f());
        do {
            if (!listIterator.hasPrevious()) {
                vVarPrevious = null;
                break;
            }
            vVarPrevious = listIterator.previous();
            vVar = vVarPrevious;
        } while (!vVar.f111882b.g(vVar.f111888h.a(), str));
        v vVar2 = vVarPrevious;
        if (vVar2 != null) {
            return vVar2;
        }
        StringBuilder sbL = hb.a.l("No destination with route ", str, " is on the NavController's back stack. The current destination is ");
        sbL.append(j());
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    public final v i() {
        return this.f144319f.h();
    }

    public final h0 j() {
        v vVarI = i();
        if (vVarI != null) {
            return vVarI.f111882b;
        }
        return null;
    }

    public final j0 k() {
        j0 j0Var = this.f144316c;
        if (j0Var != null) {
            j0Var.getClass();
            return j0Var;
        }
        vb.h.z("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final b0.b l() {
        return this.f144328o == null ? b0.b.CREATED : this.f144331r;
    }

    public final j0 m() {
        h0 h0Var;
        v vVarH = this.f144319f.h();
        if (vVarH == null || (h0Var = vVarH.f111882b) == null) {
            h0Var = this.f144316c;
            h0Var.getClass();
        }
        j0 j0Var = h0Var instanceof j0 ? (j0) h0Var : null;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = h0Var.f111774c;
        j0Var2.getClass();
        return j0Var2;
    }

    public final void n(v vVar, v vVar2) {
        this.f144324k.put(vVar, vVar2);
        LinkedHashMap linkedHashMap = this.f144325l;
        if (linkedHashMap.get(vVar2) == null) {
            linkedHashMap.put(vVar2, new qc.a(0));
        }
        Object obj = linkedHashMap.get(vVar2);
        obj.getClass();
        ((qc.a) obj).f144290a.incrementAndGet();
    }

    public final void o(String str, o0 o0Var) {
        str.getClass();
        if (this.f144316c == null) {
            o2.c.i(46, "Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this);
            return;
        }
        j0 j0VarM = m();
        h0.b bVarO = j0VarM.o(str, true, j0VarM);
        if (bVarO == null) {
            com.nimbusds.jose.shaded.gson.internal.a.v(hb.a.l("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.f144316c);
            return;
        }
        h0 h0Var = bVarO.f111777a;
        Bundle bundleB = h0Var.b(bVarO.f111778b);
        if (bundleB == null) {
            k0.f134949a.getClass();
            bundleB = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
        }
        g0.a.C2143a c2143a = g0.a.f111770a;
        h0.a aVar = h0.f111771f;
        String str2 = h0Var.f111773b.f144347f;
        aVar.getClass();
        String strConcat = str2 != null ? "android-app://androidx.navigation/".concat(str2) : "";
        r0.f111862a.getClass();
        Uri uri = Uri.parse(strConcat);
        uri.getClass();
        c2143a.getClass();
        new g0.a(null);
        g0 g0Var = new g0(uri, null, null);
        Intent intent = new Intent();
        intent.setDataAndType(g0Var.f111767a, g0Var.f111769c);
        intent.setAction(g0Var.f111768b);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        p(h0Var, bundleB, o0Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b A[LOOP:4: B:60:0x0134->B:62:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185 A[LOOP:6: B:71:0x017f->B:73:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    public final void p(h0 h0Var, Bundle bundle, o0 o0Var) {
        int i14;
        boolean z14;
        w0 w0Var;
        boolean z15;
        int iNextIndex;
        h0 h0Var2;
        p13.k<v> kVar;
        j0 j0Var;
        boolean zR;
        h0Var.getClass();
        j jVar = h0Var.f111773b;
        LinkedHashMap linkedHashMap = this.f144334u;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((y.b) it.next()).f111899d = true;
            }
        }
        m0 m0Var = new m0();
        if (o0Var != null) {
            boolean z16 = o0Var.f111808e;
            boolean z17 = o0Var.f111807d;
            String str = o0Var.f111813j;
            if (str != null) {
                zR = s(str, z17, z16);
            } else {
                k23.d<?> dVar = o0Var.f111814k;
                if (dVar != null) {
                    zR = r(rc.l.b(gl1.y.J(dVar)), z17, z16);
                } else {
                    Object obj = o0Var.f111815l;
                    if (obj != null) {
                        zR = s(f(obj), z17, z16);
                    } else {
                        int i15 = o0Var.f111806c;
                        if (i15 != -1) {
                            zR = r(i15, z17, z16);
                        } else {
                            z14 = false;
                        }
                    }
                }
            }
            z14 = zR;
        } else {
            z14 = false;
        }
        Bundle bundleB = h0Var.b(bundle);
        if (o0Var == null || !o0Var.f111805b) {
            w0Var = this.f144333t;
            if (o0Var == null && o0Var.f111804a) {
                v vVarI = i();
                p13.k<v> kVar2 = this.f144319f;
                ListIterator<v> listIterator = kVar2.listIterator(kVar2.getF97124f());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().f111882b == h0Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z15 = false;
                } else if (h0Var instanceof j0) {
                    j0.f111790h.getClass();
                    List listS = c0.s(c0.o(q.e(new b1(12), (j0) h0Var), new c(4)));
                    if (kVar2.f134948c - iNextIndex == listS.size()) {
                        List<v> listSubList = kVar2.subList(iNextIndex, kVar2.f134948c);
                        ArrayList arrayList = new ArrayList(p13.y.r(listSubList, 10));
                        Iterator<T> it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(Integer.valueOf(((v) it3.next()).f111882b.f111773b.f144346e));
                        }
                        if (arrayList.equals(listS)) {
                            kVar = new p13.k();
                            for (i14 = 1; kVar2.size() - i14 >= iNextIndex; i14 = 1) {
                                v vVar = (v) d0.F(kVar2);
                                y(vVar);
                                kVar.addFirst(new v(vVar, vVar.f111882b.b(bundle)));
                            }
                            for (v vVar2 : kVar) {
                                j0Var = vVar2.f111882b.f111774c;
                                if (j0Var != null) {
                                    n(vVar2, g(j0Var.f111773b.f144346e));
                                }
                                kVar2.addLast(vVar2);
                            }
                            for (v vVar3 : kVar) {
                                w0Var.c(vVar3.f111882b.f111772a).f(vVar3);
                            }
                            z15 = true;
                        }
                    }
                    z15 = false;
                } else if (vVarI == null || (h0Var2 = vVarI.f111882b) == null || jVar.f144346e != h0Var2.f111773b.f144346e) {
                    z15 = false;
                } else {
                    kVar = new p13.k();
                    while (kVar2.size() - i14 >= iNextIndex) {
                        v vVar4 = (v) d0.F(kVar2);
                        y(vVar4);
                        kVar.addFirst(new v(vVar4, vVar4.f111882b.b(bundle)));
                    }
                    while (r4.hasNext()) {
                        j0Var = vVar2.f111882b.f111774c;
                        if (j0Var != null) {
                            n(vVar2, g(j0Var.f111773b.f144346e));
                        }
                        kVar2.addLast(vVar2);
                    }
                    while (r0.hasNext()) {
                        w0Var.c(vVar3.f111882b.f111772a).f(vVar3);
                    }
                    z15 = true;
                }
            } else {
                z15 = false;
            }
            if (!z15) {
                v vVarA = v.a.a(v.f111880j, this.f144314a.f111905c, h0Var, bundleB, l(), this.f144329p);
                v0 v0VarC = w0Var.c(h0Var.f111772a);
                List listC = w.c(vVarA);
                this.f144335v = new mt0.e0(m0Var, this, h0Var, bundleB, 15);
                v0VarC.d(listC, o0Var);
                this.f144335v = null;
            }
        } else if (this.f144326m.containsKey(Integer.valueOf(jVar.f144346e))) {
            m0Var.f105804a = w(jVar.f144346e, o0Var, bundleB);
            z15 = false;
        } else {
            w0Var = this.f144333t;
            if (o0Var == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (!z15) {
                v vVarA2 = v.a.a(v.f111880j, this.f144314a.f111905c, h0Var, bundleB, l(), this.f144329p);
                v0 v0VarC2 = w0Var.c(h0Var.f111772a);
                List listC2 = w.c(vVarA2);
                this.f144335v = new mt0.e0(m0Var, this, h0Var, bundleB, 15);
                v0VarC2.d(listC2, o0Var);
                this.f144335v = null;
            }
        }
        this.f144315b.invoke();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            ((y.b) it4.next()).f111899d = false;
        }
        if (z14 || m0Var.f105804a || z15) {
            b();
        } else {
            z();
        }
    }

    public final boolean q(int i14, boolean z14) {
        return r(i14, z14, false) && b();
    }

    public final boolean r(int i14, boolean z14, boolean z15) {
        h0 h0Var;
        j jVar;
        p13.k<v> kVar = this.f144319f;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = p13.h0.G0(kVar).iterator();
        do {
            if (!it.hasNext()) {
                h0Var = null;
                break;
            }
            h0Var = ((v) it.next()).f111882b;
            String str = h0Var.f111772a;
            jVar = h0Var.f111773b;
            v0 v0VarC = this.f144333t.c(str);
            if (z14 || jVar.f144346e != i14) {
                arrayList.add(v0VarC);
            }
        } while (jVar.f144346e != i14);
        if (h0Var != null) {
            return c(arrayList, h0Var, z14, z15);
        }
        h0.a aVar = h0.f111771f;
        f fVar = this.f144314a.f111905c;
        aVar.getClass();
        h0.a.a(fVar, i14);
        b.f144291a.getClass();
        return false;
    }

    public final boolean s(String str, boolean z14, boolean z15) {
        v vVarPrevious;
        boolean zG;
        str.getClass();
        p13.k<v> kVar = this.f144319f;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<v> listIterator = kVar.listIterator(kVar.getF97124f());
        do {
            if (!listIterator.hasPrevious()) {
                vVarPrevious = null;
                break;
            }
            vVarPrevious = listIterator.previous();
            v vVar = vVarPrevious;
            zG = vVar.f111882b.g(vVar.f111888h.a(), str);
            if (z14 || !zG) {
                arrayList.add(this.f144333t.c(vVar.f111882b.f111772a));
            }
        } while (!zG);
        v vVar2 = vVarPrevious;
        h0 h0Var = vVar2 != null ? vVar2.f111882b : null;
        if (h0Var != null) {
            return c(arrayList, h0Var, z14, z15);
        }
        b.f144291a.getClass();
        return false;
    }

    public final void t(v vVar, boolean z14, p13.k<x> kVar) {
        z zVar;
        b2 b2Var;
        Set set;
        vVar.getClass();
        p13.k<v> kVar2 = this.f144319f;
        v vVarLast = kVar2.last();
        if (!p005kotlin.jvm.internal.s.g(vVarLast, vVar)) {
            StringBuilder sb3 = new StringBuilder("Attempted to pop ");
            sb3.append(vVar.f111882b);
            h0 h0Var = vVarLast.f111882b;
            sb3.append(", which is not the top of the back stack (");
            sb3.append(h0Var);
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new IllegalStateException(sb3.toString().toString());
        }
        d0.F(kVar2);
        y.b bVar = (y.b) this.f144334u.get(this.f144333t.c(vVarLast.f111882b.f111772a));
        boolean z15 = true;
        if ((bVar == null || (b2Var = bVar.f111901f) == null || (set = (Set) b2Var.f150540a.getValue()) == null || !set.contains(vVarLast)) && !this.f144325l.containsKey(vVarLast)) {
            z15 = false;
        }
        b0.b bVar2 = vVarLast.f111888h.f144302j.f7973d;
        b0.b bVar3 = b0.b.CREATED;
        if (bVar2.a(bVar3)) {
            if (z14) {
                vVarLast.b(bVar3);
                kVar.addFirst(new x(vVarLast));
            }
            if (z15) {
                vVarLast.b(bVar3);
            } else {
                vVarLast.b(b0.b.DESTROYED);
                y(vVarLast);
            }
        }
        if (z14 || z15 || (zVar = this.f144329p) == null) {
            return;
        }
        String str = vVarLast.f111886f;
        str.getClass();
        y1 y1Var = (y1) zVar.f111917a.remove(str);
        if (y1Var != null) {
            y1Var.a();
        }
    }

    public final ArrayList v() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f144334u.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((y.b) it.next()).f111901f.f150540a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                v vVar = (v) obj;
                if (!arrayList.contains(vVar) && !vVar.f111888h.f144303k.a(b0.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            d0.v(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (v vVar2 : this.f144319f) {
            v vVar3 = vVar2;
            if (!arrayList.contains(vVar3) && vVar3.f111888h.f144303k.a(b0.b.STARTED)) {
                arrayList3.add(vVar2);
            }
        }
        d0.v(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((v) obj2).f111882b instanceof j0)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean w(int i14, o0 o0Var, Bundle bundle) {
        h0 h0VarK;
        v vVar;
        h0 h0Var;
        Integer numValueOf = Integer.valueOf(i14);
        LinkedHashMap linkedHashMap = this.f144326m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i14));
        d0.C(linkedHashMap.values(), new o60.b(str, 9));
        p13.k<x> kVar = (p13.k) y0.c(this.f144327n).remove(str);
        f fVar = this.f144314a.f111905c;
        ArrayList arrayList = new ArrayList();
        v vVarH = this.f144319f.h();
        if (vVarH == null || (h0VarK = vVarH.f111882b) == null) {
            h0VarK = k();
        }
        if (kVar != null) {
            for (x xVar : kVar) {
                h0 h0VarE = e(xVar.f111895a.f144308b, h0VarK, null, true);
                if (h0VarE == null) {
                    h0.a aVar = h0.f111771f;
                    int i15 = xVar.f111895a.f144308b;
                    aVar.getClass();
                    u0.u("Restore State failed: destination ", h0.a.a(fVar, i15), " cannot be found from the current destination ", h0VarK);
                    return false;
                }
                arrayList.add(xVar.a(fVar, h0VarE, l(), this.f144329p));
                h0VarK = h0VarE;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<v> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((v) obj).f111882b instanceof j0)) {
                arrayList3.add(obj);
            }
        }
        for (v vVar2 : arrayList3) {
            List list = (List) p13.h0.n0(arrayList2);
            if (p005kotlin.jvm.internal.s.g((list == null || (vVar = (v) p13.h0.m0(list)) == null || (h0Var = vVar.f111882b) == null) ? null : h0Var.f111772a, vVar2.f111882b.f111772a)) {
                list.add(vVar2);
            } else {
                arrayList2.add(p13.x.m(vVar2));
            }
        }
        m0 m0Var = new m0();
        for (List list2 : arrayList2) {
            v0 v0VarC = this.f144333t.c(((v) p13.h0.b0(list2)).f111882b.f111772a);
            this.f144335v = new jv0.c(m0Var, arrayList, new p0(), this, bundle, 16);
            v0VarC.d(list2, o0Var);
            this.f144335v = null;
        }
        return m0Var.f105804a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x(j0 j0Var, Bundle bundle) {
        boolean z14;
        Intent intent;
        int[] intArray;
        j0 j0VarM;
        h0.b bVarN;
        String strA;
        h0 h0VarB;
        j0 j0Var2;
        Bundle bundle2;
        h0 h0VarB2;
        j0 j0Var3;
        j0Var.getClass();
        l lVar = j0Var.f111791g;
        p13.k<v> kVar = this.f144319f;
        if (!kVar.isEmpty() && l() == b0.b.DESTROYED) {
            vb.h.z("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (p005kotlin.jvm.internal.s.g(this.f144316c, j0Var)) {
            int iF = lVar.f144353b.f();
            for (int i14 = 0; i14 < iF; i14++) {
                h0 h0VarG = lVar.f144353b.g(i14);
                j0 j0Var4 = this.f144316c;
                j0Var4.getClass();
                int iD = j0Var4.f111791g.f144353b.d(i14);
                j0 j0Var5 = this.f144316c;
                j0Var5.getClass();
                l1<h0> l1Var = j0Var5.f111791g.f144353b;
                if (l1Var.f134764a) {
                    p1.b0.a(l1Var);
                }
                int iA = q1.a.a(l1Var.f134767d, iD, l1Var.f134765b);
                if (iA >= 0) {
                    Object[] objArr = l1Var.f134766c;
                    Object obj = objArr[iA];
                    objArr[iA] = h0VarG;
                }
            }
            for (v vVar : kVar) {
                h0.a aVar = h0.f111771f;
                h0 h0Var = vVar.f111882b;
                aVar.getClass();
                p13.y0<h0> y0VarJ = p13.e0.J(c0.s(h0.a.b(h0Var)));
                h0 h0VarB3 = this.f144316c;
                h0VarB3.getClass();
                for (h0 h0Var2 : y0VarJ) {
                    if (!p005kotlin.jvm.internal.s.g(h0Var2, this.f144316c) || !p005kotlin.jvm.internal.s.g(h0VarB3, j0Var)) {
                        if (h0VarB3 instanceof j0) {
                            h0VarB3 = ((j0) h0VarB3).f111791g.b(h0Var2.f111773b.f144346e);
                            h0VarB3.getClass();
                        }
                    }
                }
                h0VarB3.getClass();
                vVar.f111882b = h0VarB3;
            }
            return;
        }
        j0 j0Var6 = this.f144316c;
        LinkedHashMap linkedHashMap = this.f144334u;
        boolean z15 = true;
        if (j0Var6 != null) {
            for (Integer num : new ArrayList(this.f144326m.keySet())) {
                num.getClass();
                int iIntValue = num.intValue();
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((y.b) it.next()).f111899d = true;
                }
                boolean zW = w(iIntValue, gg.b.L(new c(1)), null);
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((y.b) it3.next()).f111899d = false;
                }
                if (zW) {
                    r(iIntValue, true, false);
                }
            }
            r(j0Var6.f111773b.f144346e, true, false);
        }
        this.f144316c = j0Var;
        y yVar = this.f144314a;
        h hVar = yVar.f111904b;
        f fVar = yVar.f111905c;
        Bundle bundle3 = this.f144317d;
        w0 w0Var = this.f144333t;
        if (bundle3 != null && bundle3.containsKey("android-support-nav:controller:navigatorState:names")) {
            for (String str : nd.b.j(bundle3, "android-support-nav:controller:navigatorState:names")) {
                v0 v0VarC = w0Var.c(str);
                if (bundle3.containsKey(str)) {
                    v0VarC.g(nd.b.g(bundle3, str));
                }
            }
        }
        Bundle[] bundleArr = this.f144318e;
        if (bundleArr != null) {
            int length = bundleArr.length;
            int i15 = 0;
            while (i15 < length) {
                x xVar = new x(bundleArr[i15]);
                e eVar = xVar.f111895a;
                boolean z16 = z15;
                h0 h0VarD = d(eVar.f144308b, null);
                if (h0VarD == null) {
                    h0.a aVar2 = h0.f111771f;
                    int i16 = eVar.f144308b;
                    aVar2.getClass();
                    fb1.c.y(hb.a.l("Restoring the Navigation back stack failed: destination ", h0.a.a(fVar, i16), " cannot be found from the current destination "), j());
                    return;
                }
                v vVarA = xVar.a(fVar, h0VarD, l(), this.f144329p);
                v0 v0VarC2 = w0Var.c(h0VarD.f111772a);
                Object bVar = linkedHashMap.get(v0VarC2);
                if (bVar == null) {
                    bVar = new y.b(yVar, v0VarC2);
                    linkedHashMap.put(v0VarC2, bVar);
                }
                kVar.addLast(vVarA);
                ((y.b) bVar).i(vVarA);
                j0 j0Var7 = vVarA.f111882b.f111774c;
                if (j0Var7 != null) {
                    n(vVarA, g(j0Var7.f111773b.f144346e));
                }
                i15++;
                z15 = z16;
            }
            z14 = z15;
            this.f144315b.invoke();
            this.f144318e = null;
        } else {
            z14 = true;
        }
        Collection collectionValues = p13.u0.m(w0Var.f111894a).values();
        ArrayList<v0> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((v0) obj2).f111891b) {
                arrayList.add(obj2);
            }
        }
        for (v0 v0Var : arrayList) {
            Object bVar2 = linkedHashMap.get(v0Var);
            if (bVar2 == null) {
                v0Var.getClass();
                bVar2 = new y.b(yVar, v0Var);
                linkedHashMap.put(v0Var, bVar2);
            }
            v0Var.e((y.b) bVar2);
        }
        if (this.f144316c == null || !kVar.isEmpty()) {
            b();
            return;
        }
        Activity activity = yVar.f111906d;
        if (!yVar.f111907e && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            k0.f134949a.getClass();
            Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
            Bundle bundle4 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle4 != null) {
                bundleA.putAll(bundle4);
            }
            if ((intArray == null || intArray.length == 0) && (bVarN = (j0VarM = hVar.m()).n(new g0(intent.getData(), intent.getAction(), intent.getType()), j0VarM)) != null) {
                h0 h0Var3 = bVarN.f111777a;
                int[] iArrC = h0Var3.c(null);
                Bundle bundleB = h0Var3.b(bVarN.f111778b);
                if (bundleB != null) {
                    bundleA.putAll(bundleB);
                }
                intArray = iArrC;
                parcelableArrayList = null;
            }
            if (intArray != null && intArray.length != 0) {
                hVar.getClass();
                j0 j0Var8 = hVar.f144316c;
                int length2 = intArray.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        strA = null;
                        break;
                    }
                    int i18 = intArray[i17];
                    if (i17 == 0) {
                        j0 j0Var9 = hVar.f144316c;
                        j0Var9.getClass();
                        h0VarB2 = j0Var9.f111773b.f144346e == i18 ? hVar.f144316c : null;
                    } else {
                        j0Var8.getClass();
                        h0VarB2 = j0Var8.f111791g.b(i18);
                    }
                    if (h0VarB2 == null) {
                        h0.a aVar3 = h0.f111771f;
                        f fVar2 = hVar.f144314a.f111905c;
                        aVar3.getClass();
                        strA = h0.a.a(fVar2, i18);
                        break;
                    }
                    if (i17 != intArray.length - 1 && (h0VarB2 instanceof j0)) {
                        while (true) {
                            j0Var3 = (j0) h0VarB2;
                            j0Var3.getClass();
                            l lVar2 = j0Var3.f111791g;
                            if (!(lVar2.b(lVar2.f144354c) instanceof j0)) {
                                break;
                            } else {
                                h0VarB2 = lVar2.b(lVar2.f144354c);
                            }
                        }
                        j0Var8 = j0Var3;
                    }
                    i17++;
                }
                if (strA == null) {
                    bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = intArray.length;
                    Bundle[] bundleArr2 = new Bundle[length3];
                    for (int i19 = 0; i19 < length3; i19++) {
                        k0.f134949a.getClass();
                        Bundle bundleA2 = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
                        bundleA2.putAll(bundleA);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i19)) != null) {
                            bundleA2.putAll(bundle2);
                        }
                        bundleArr2[i19] = bundleA2;
                    }
                    int flags = intent.getFlags();
                    int i24 = 268435456 & flags;
                    if (i24 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        z6.h0 h0VarE = z6.h0.e(yVar.f111903a);
                        h0VarE.b(intent);
                        h0VarE.g();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i24 != 0 ? z14 : false) {
                        if (!hVar.f144319f.isEmpty()) {
                            j0 j0Var10 = hVar.f144316c;
                            j0Var10.getClass();
                            hVar.r(j0Var10.f111773b.f144346e, z14, false);
                        }
                        int i25 = 0;
                        while (i25 < intArray.length) {
                            int i26 = intArray[i25];
                            int i27 = i25 + 1;
                            Bundle bundle5 = bundleArr2[i25];
                            h0 h0VarD2 = hVar.d(i26, null);
                            if (h0VarD2 == null) {
                                h0.f111771f.getClass();
                                fb1.c.y(hb.a.l("Deep Linking failed: destination ", h0.a.a(fVar, i26), " cannot be found from the current destination "), hVar.j());
                                return;
                            } else {
                                hVar.p(h0VarD2, bundle5, gg.b.L(new p1(11, h0VarD2, yVar)));
                                i25 = i27;
                            }
                        }
                        yVar.f111907e = true;
                        return;
                    }
                    j0 j0Var11 = hVar.f144316c;
                    int length4 = intArray.length;
                    for (int i28 = 0; i28 < length4; i28++) {
                        int i29 = intArray[i28];
                        Bundle bundle6 = bundleArr2[i28];
                        if (i28 == 0) {
                            h0VarB = hVar.f144316c;
                        } else {
                            j0Var11.getClass();
                            h0VarB = j0Var11.f111791g.b(i29);
                        }
                        if (h0VarB == null) {
                            h0.f111771f.getClass();
                            androidx.core.view.j.t("Deep Linking failed: destination ", h0.a.a(fVar, i29), " cannot be found in graph ", j0Var11);
                            return;
                        }
                        if (i28 == intArray.length - 1) {
                            o0.a aVar4 = new o0.a();
                            j0 j0Var12 = hVar.f144316c;
                            j0Var12.getClass();
                            aVar4.f111818c = j0Var12.f111773b.f144346e;
                            aVar4.f111819d = null;
                            aVar4.f111822g = true;
                            aVar4.f111823h = false;
                            aVar4.f111824i = 0;
                            aVar4.f111825j = 0;
                            hVar.p(h0VarB, bundle6, aVar4.a());
                        } else if (h0VarB instanceof j0) {
                            while (true) {
                                j0Var2 = (j0) h0VarB;
                                j0Var2.getClass();
                                l lVar3 = j0Var2.f111791g;
                                if (!(lVar3.b(lVar3.f144354c) instanceof j0)) {
                                    break;
                                } else {
                                    h0VarB = lVar3.b(lVar3.f144354c);
                                }
                            }
                            j0Var11 = j0Var2;
                        }
                    }
                    yVar.f111907e = true;
                    return;
                }
                b.a aVar5 = b.f144291a;
                intent.toString();
                aVar5.getClass();
            }
        }
        j0 j0Var13 = this.f144316c;
        j0Var13.getClass();
        p(j0Var13, bundle, null);
    }

    public final void y(v vVar) {
        vVar.getClass();
        v vVar2 = (v) this.f144324k.remove(vVar);
        if (vVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f144325l;
        qc.a aVar = (qc.a) linkedHashMap.get(vVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f144290a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            y.b bVar = (y.b) this.f144334u.get(this.f144333t.c(vVar2.f111882b.f111772a));
            if (bVar != null) {
                bVar.b(vVar2);
            }
            linkedHashMap.remove(vVar2);
        }
    }

    public final void z() {
        qc.a aVar;
        b2 b2Var;
        Set set;
        ArrayList<v> arrayListD1 = p13.h0.d1(this.f144319f);
        if (arrayListD1.isEmpty()) {
            return;
        }
        ArrayList arrayListM = p13.x.m(((v) p13.h0.m0(arrayListD1)).f111882b);
        ArrayList arrayList = new ArrayList();
        if (p13.h0.m0(arrayListM) instanceof lc.k) {
            Iterator it = p13.h0.G0(arrayListD1).iterator();
            while (it.hasNext()) {
                h0 h0Var = ((v) it.next()).f111882b;
                arrayList.add(h0Var);
                if (!(h0Var instanceof lc.k) && !(h0Var instanceof j0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (v vVar : p13.h0.G0(arrayListD1)) {
            b0.b bVar = vVar.f111888h.f144303k;
            h0 h0Var2 = vVar.f111882b;
            h0 h0Var3 = (h0) p13.h0.d0(arrayListM);
            if (h0Var3 != null && h0Var3.f111773b.f144346e == h0Var2.f111773b.f144346e) {
                b0.b bVar2 = b0.b.RESUMED;
                if (bVar != bVar2) {
                    y.b bVar3 = (y.b) this.f144334u.get(this.f144333t.c(vVar.f111882b.f111772a));
                    if (p005kotlin.jvm.internal.s.g((bVar3 == null || (b2Var = bVar3.f111901f) == null || (set = (Set) b2Var.f150540a.getValue()) == null) ? null : Boolean.valueOf(set.contains(vVar)), Boolean.TRUE) || ((aVar = (qc.a) this.f144325l.get(vVar)) != null && aVar.f144290a.get() == 0)) {
                        map.put(vVar, b0.b.STARTED);
                    } else {
                        map.put(vVar, bVar2);
                    }
                }
                h0 h0Var4 = (h0) p13.h0.d0(arrayList);
                if (h0Var4 != null && h0Var4.f111773b.f144346e == h0Var2.f111773b.f144346e) {
                    d0.D(arrayList);
                }
                d0.D(arrayListM);
                j0 j0Var = h0Var2.f111774c;
                if (j0Var != null) {
                    arrayListM.add(j0Var);
                }
            } else if (arrayList.isEmpty() || h0Var2.f111773b.f144346e != ((h0) p13.h0.b0(arrayList)).f111773b.f144346e) {
                vVar.b(b0.b.CREATED);
            } else {
                h0 h0Var5 = (h0) d0.D(arrayList);
                if (bVar == b0.b.RESUMED) {
                    vVar.b(b0.b.STARTED);
                } else {
                    b0.b bVar4 = b0.b.STARTED;
                    if (bVar != bVar4) {
                        map.put(vVar, bVar4);
                    }
                }
                j0 j0Var2 = h0Var5.f111774c;
                if (j0Var2 != null && !arrayList.contains(j0Var2)) {
                    arrayList.add(j0Var2);
                }
            }
        }
        for (v vVar2 : arrayListD1) {
            b0.b bVar5 = (b0.b) map.get(vVar2);
            if (bVar5 != null) {
                vVar2.b(bVar5);
            } else {
                vVar2.f111888h.b();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lqc/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "KEY_BACK_STACK", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
