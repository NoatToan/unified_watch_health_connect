package v0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.s;
import b0.i1;
import b0.w0;
import j0.u;
import j0.v;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import r0.m;
import r0.o;

/* JADX INFO: loaded from: classes.dex */
public class h implements i1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<i1> f174176a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3 f174180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f174181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f174182g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f174184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f174185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f174186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f174187l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f174177b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f174178c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f174179d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f174183h = new a(this);

    public static class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<h> f174188a;

        public a(h hVar) {
            this.f174188a = new WeakReference<>(hVar);
        }

        @Override // androidx.camera.core.impl.s
        public final void b(int i14, c0 c0Var) {
            h hVar = this.f174188a.get();
            if (hVar != null) {
                Iterator<i1> it = hVar.f174176a.iterator();
                while (it.hasNext()) {
                    l2 l2Var = it.next().f13977p;
                    Iterator<s> it3 = l2Var.f5608g.f5817e.iterator();
                    while (it3.hasNext()) {
                        it3.next().b(i14, new i(l2Var.f5608g.f5819g, c0Var));
                    }
                }
            }
        }
    }

    public h(l0 l0Var, l0 l0Var2, Set<i1> set, c3 c3Var, d.a aVar) {
        this.f174181f = l0Var;
        this.f174182g = l0Var2;
        this.f174180e = c3Var;
        this.f174176a = set;
        HashMap map = new HashMap();
        for (i1 i1Var : set) {
            map.put(i1Var, i1Var.p(l0Var.c(), null, i1Var.f(true, c3Var)));
        }
        this.f174185j = map;
        HashSet hashSet = new HashSet(map.values());
        this.f174184i = hashSet;
        this.f174186k = new b(l0Var, hashSet);
        if (this.f174182g != null) {
            this.f174187l = new b(this.f174182g, hashSet);
        }
        for (i1 i1Var2 : set) {
            this.f174179d.put(i1Var2, Boolean.FALSE);
            this.f174178c.put(i1Var2, new g(l0Var, this, aVar));
        }
    }

    public static void r(o oVar, DeferrableSurface deferrableSurface, l2 l2Var) {
        oVar.e();
        try {
            u.a();
            oVar.b();
            o.a aVar = oVar.f148754l;
            Objects.requireNonNull(aVar);
            aVar.f(deferrableSurface, new m(aVar, 0));
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            l2.d dVar = l2Var.f5607f;
            if (dVar != null) {
                dVar.a(l2Var, l2.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static DeferrableSurface s(i1 i1Var) {
        List<DeferrableSurface> listB = i1Var instanceof b0.l0 ? i1Var.f13977p.b() : Collections.unmodifiableList(i1Var.f13977p.f5608g.f5813a);
        k7.h.f(listB.size() <= 1, null);
        if (listB.size() == 1) {
            return listB.get(0);
        }
        return null;
    }

    @Override // b0.i1.c
    public final void d(i1 i1Var) {
        u.a();
        if (v(i1Var)) {
            return;
        }
        this.f174179d.put(i1Var, Boolean.TRUE);
        DeferrableSurface deferrableSurfaceS = s(i1Var);
        if (deferrableSurfaceS != null) {
            r(u(i1Var), deferrableSurfaceS, i1Var.f13977p);
        }
    }

    @Override // b0.i1.c
    public final void k(i1 i1Var) {
        DeferrableSurface deferrableSurfaceS;
        u.a();
        o oVarU = u(i1Var);
        if (v(i1Var) && (deferrableSurfaceS = s(i1Var)) != null) {
            r(oVarU, deferrableSurfaceS, i1Var.f13977p);
        }
    }

    @Override // b0.i1.c
    public final void l(i1 i1Var) {
        u.a();
        if (v(i1Var)) {
            o oVarU = u(i1Var);
            DeferrableSurface deferrableSurfaceS = s(i1Var);
            if (deferrableSurfaceS != null) {
                r(oVarU, deferrableSurfaceS, i1Var.f13977p);
                return;
            }
            u.a();
            oVarU.b();
            oVarU.f148754l.a();
        }
    }

    @Override // b0.i1.c
    public final void m(i1 i1Var) {
        u.a();
        if (v(i1Var)) {
            this.f174179d.put(i1Var, Boolean.FALSE);
            o oVarU = u(i1Var);
            u.a();
            oVarU.b();
            oVarU.f148754l.a();
        }
    }

    public final t0.b q(i1 i1Var, b bVar, l0 l0Var, o oVar, int i14, boolean z14, boolean z15) {
        int i15;
        int iR = l0Var.b().r(i14);
        boolean zF = v.f(oVar.f148744b);
        b3<?> b3Var = (b3) this.f174185j.get(i1Var);
        Objects.requireNonNull(b3Var);
        v0.a aVarB = bVar.b(b3Var, oVar.f148746d, v.b(oVar.f148744b), z14);
        Rect rect = aVarB.f174142a;
        Size size = aVarB.f174143b;
        int iL = v.l((oVar.f148751i + l0Var.b().r(((n1) i1Var.f13969h).D(0))) - iR);
        boolean zO = z15 ? false : i1Var.o(l0Var) ^ zF;
        if (i1Var instanceof w0) {
            i15 = 1;
        } else {
            i15 = i1Var instanceof b0.l0 ? 4 : 2;
        }
        return new t0.b(UUID.randomUUID(), i15, i1Var instanceof b0.l0 ? 256 : 34, rect, v.i(size, iL), iL, zO, false);
    }

    public final HashMap t(o oVar, boolean z14) {
        HashMap map = new HashMap();
        for (i1 i1Var : this.f174176a) {
            b3<?> b3Var = (b3) this.f174185j.get(i1Var);
            Objects.requireNonNull(b3Var);
            Size size = this.f174186k.b(b3Var, oVar.f148746d, v.b(oVar.f148744b), z14).f174144c;
            map.put(i1Var, size);
            Objects.toString(size);
            Objects.toString(i1Var);
        }
        return map;
    }

    public final o u(i1 i1Var) {
        o oVar = (o) this.f174177b.get(i1Var);
        Objects.requireNonNull(oVar);
        return oVar;
    }

    public final boolean v(i1 i1Var) {
        Boolean bool = (Boolean) this.f174179d.get(i1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void w(HashMap map, HashMap map2) {
        HashMap map3 = this.f174177b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            i1 i1Var = (i1) entry.getKey();
            o oVar = (o) entry.getValue();
            i1Var.C(oVar.f148746d);
            i1Var.A(oVar.f148744b);
            q.b bVarI = oVar.f148749g.i();
            Size size = (Size) map2.get(i1Var);
            if (size != null) {
                bVarI.f5706b = size;
            }
            i1Var.f13970i = i1Var.y(bVarI.a(), null);
            i1Var.r();
        }
    }
}
