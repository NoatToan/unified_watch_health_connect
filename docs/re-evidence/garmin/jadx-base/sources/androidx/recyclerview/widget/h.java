package androidx.recyclerview.widget;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h implements z.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f10465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f10466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10467c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.f0, z> f10468d = new IdentityHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10469e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f10470f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g.a.EnumC0146a f10471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f10472h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f10473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10475c;
    }

    public h(g gVar, g.a aVar) {
        this.f10465a = gVar;
        if (aVar.f10459a) {
            this.f10466b = new m0.a();
        } else {
            this.f10466b = new m0.b();
        }
        g.a.EnumC0146a enumC0146a = aVar.f10460b;
        this.f10471g = enumC0146a;
        if (enumC0146a == g.a.EnumC0146a.NO_STABLE_IDS) {
            this.f10472h = new j0.b();
            return;
        }
        if (enumC0146a == g.a.EnumC0146a.ISOLATED_STABLE_IDS) {
            this.f10472h = new j0.a();
        } else if (enumC0146a == g.a.EnumC0146a.SHARED_STABLE_IDS) {
            this.f10472h = new j0.c();
        } else {
            vb.h.s("unknown stable id mode");
            throw null;
        }
    }

    public final boolean a(int i14, RecyclerView.h<RecyclerView.f0> hVar) {
        ArrayList arrayList = this.f10469e;
        if (i14 < 0 || i14 > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i14);
        }
        if (this.f10471g != g.a.EnumC0146a.NO_STABLE_IDS) {
            k7.h.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            hVar.hasStableIds();
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                i15 = -1;
                break;
            }
            if (((z) arrayList.get(i15)).f10702c == hVar) {
                break;
            }
            i15++;
        }
        if ((i15 == -1 ? null : (z) arrayList.get(i15)) != null) {
            return false;
        }
        z zVar = new z(hVar, this, this.f10466b, this.f10472h.a());
        arrayList.add(i14, zVar);
        Iterator it = this.f10467c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (zVar.f10704e > 0) {
            this.f10465a.notifyItemRangeInserted(c(zVar), zVar.f10704e);
        }
        b();
        return true;
    }

    public final void b() {
        RecyclerView.h.a aVar;
        Iterator it = this.f10469e.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = RecyclerView.h.a.ALLOW;
                break;
            }
            z zVar = (z) it.next();
            RecyclerView.h.a stateRestorationPolicy = zVar.f10702c.getStateRestorationPolicy();
            aVar = RecyclerView.h.a.PREVENT;
            if (stateRestorationPolicy == aVar || (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && zVar.f10704e == 0)) {
                break;
            }
        }
        g gVar = this.f10465a;
        if (aVar != gVar.getStateRestorationPolicy()) {
            gVar.r(aVar);
        }
    }

    public final int c(z zVar) {
        z zVar2;
        Iterator it = this.f10469e.iterator();
        int i14 = 0;
        while (it.hasNext() && (zVar2 = (z) it.next()) != zVar) {
            i14 += zVar2.f10704e;
        }
        return i14;
    }

    public final a d(int i14) {
        a aVar = this.f10470f;
        if (aVar.f10475c) {
            aVar = new a();
        } else {
            aVar.f10475c = true;
        }
        int i15 = i14;
        for (z zVar : this.f10469e) {
            int i16 = zVar.f10704e;
            if (i16 > i15) {
                aVar.f10473a = zVar;
                aVar.f10474b = i15;
                break;
            }
            i15 -= i16;
        }
        if (aVar.f10473a != null) {
            return aVar;
        }
        vb.h.s(am.j.h(i14, "Cannot find wrapper for "));
        return null;
    }

    public final z e(RecyclerView.f0 f0Var) {
        z zVar = this.f10468d.get(f0Var);
        if (zVar != null) {
            return zVar;
        }
        androidx.core.view.j.t("Cannot find wrapper for ", f0Var, ", seems like it is not bound by this adapter: ", this);
        return null;
    }
}
