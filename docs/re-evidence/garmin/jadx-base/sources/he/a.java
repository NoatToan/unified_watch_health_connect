package he;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.t;
import androidx.fragment.app.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.firebase.messaging.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p1.z;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends RecyclerView.h<h> implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f83448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f83449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z<Fragment> f83450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z<Fragment.m> f83451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z<Integer> f83452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f83453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f83454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83456i;

    /* JADX INFO: renamed from: he.a$a, reason: collision with other inner class name */
    public class C1644a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f83457a;

        public C1644a(h hVar) {
            this.f83457a = hVar;
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, b0.a aVar) {
            a aVar2 = a.this;
            if (aVar2.f83449b.V()) {
                return;
            }
            n0Var.getF158017a().d(this);
            h hVar = this.f83457a;
            if (((FrameLayout) hVar.itemView).isAttachedToWindow()) {
                aVar2.A(hVar);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CopyOnWriteArrayList f83459a = new CopyOnWriteArrayList();

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f83459a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.f83466a);
            }
            return arrayList;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public he.e f83460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f83461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f83462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewPager2 f83463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f83464e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            l.n(parent, "Expected ViewPager2 instance. Got: ");
            return null;
        }

        public final void b(boolean z14) {
            int currentItem;
            Fragment fragmentB;
            a aVar = a.this;
            v vVar = aVar.f83449b;
            c cVar = aVar.f83454g;
            z<Fragment> zVar = aVar.f83450c;
            if (vVar.V() || this.f83463d.getScrollState() != 0 || zVar.d() || aVar.getItemCount() == 0 || (currentItem = this.f83463d.getCurrentItem()) >= aVar.getItemCount()) {
                return;
            }
            long itemId = aVar.getItemId(currentItem);
            if ((itemId != this.f83464e || z14) && (fragmentB = zVar.b(itemId)) != null && fragmentB.isAdded()) {
                this.f83464e = itemId;
                v vVar2 = aVar.f83449b;
                androidx.fragment.app.a aVarB = j.b(vVar2, vVar2);
                ArrayList<List> arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i14 = 0; i14 < zVar.h(); i14++) {
                    long jE = zVar.e(i14);
                    Fragment fragmentI = zVar.i(i14);
                    if (fragmentI.isAdded()) {
                        if (jE != this.f83464e) {
                            aVarB.p(fragmentI, b0.b.STARTED);
                            arrayList.add(cVar.a());
                        } else {
                            fragment = fragmentI;
                        }
                        fragmentI.setMenuVisibility(jE == this.f83464e);
                    }
                }
                if (fragment != null) {
                    aVarB.p(fragment, b0.b.RESUMED);
                    arrayList.add(cVar.a());
                }
                if (aVarB.f7235c.isEmpty()) {
                    return;
                }
                aVarB.t();
                Collections.reverse(arrayList);
                for (List list : arrayList) {
                    cVar.getClass();
                    c.b(list);
                }
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1645a f83466a = new C1645a();

        /* JADX INFO: renamed from: he.a$e$a, reason: collision with other inner class name */
        public class C1645a implements b {
        }

        public interface b {
        }
    }

    public a(v vVar, b0 b0Var) {
        this.f83450c = new z<>();
        this.f83451d = new z<>();
        this.f83452e = new z<>();
        this.f83454g = new c();
        this.f83455h = false;
        this.f83456i = false;
        this.f83449b = vVar;
        this.f83448a = b0Var;
        super.setHasStableIds(true);
    }

    public static void r(View view2, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            vb.h.z("Design assumption violated.");
            return;
        }
        if (view2.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view2.getParent() != null) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        frameLayout.addView(view2);
    }

    public final void A(h hVar) {
        Fragment fragmentB = this.f83450c.b(hVar.getItemId());
        if (fragmentB == null) {
            vb.h.z("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) hVar.itemView;
        View view2 = fragmentB.getView();
        if (!fragmentB.isAdded() && view2 != null) {
            vb.h.z("Design assumption violated.");
            return;
        }
        boolean zIsAdded = fragmentB.isAdded();
        v vVar = this.f83449b;
        if (zIsAdded && view2 == null) {
            he.b bVar = new he.b(this, fragmentB, frameLayout);
            t tVar = vVar.f7385p;
            tVar.getClass();
            tVar.f7365b.add(new t.a(bVar, false));
            return;
        }
        if (fragmentB.isAdded() && view2.getParent() != null) {
            if (view2.getParent() != frameLayout) {
                r(view2, frameLayout);
                return;
            }
            return;
        }
        if (fragmentB.isAdded()) {
            r(view2, frameLayout);
            return;
        }
        if (vVar.V()) {
            if (vVar.L) {
                return;
            }
            this.f83448a.a(new C1644a(hVar));
            return;
        }
        he.b bVar2 = new he.b(this, fragmentB, frameLayout);
        t tVar2 = vVar.f7385p;
        tVar2.getClass();
        tVar2.f7365b.add(new t.a(bVar2, false));
        c cVar = this.f83454g;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.f83459a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.f83466a);
        }
        try {
            fragmentB.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.j(0, fragmentB, "f" + hVar.getItemId(), 1);
            aVar.p(fragmentB, b0.b.STARTED);
            aVar.t();
            this.f83453f.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public final void B(long j8) {
        ViewParent parent;
        z<Fragment> zVar = this.f83450c;
        Fragment fragmentB = zVar.b(j8);
        if (fragmentB == null) {
            return;
        }
        if (fragmentB.getView() != null && (parent = fragmentB.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zT = t(j8);
        z<Fragment.m> zVar2 = this.f83451d;
        if (!zT) {
            zVar2.g(j8);
        }
        if (!fragmentB.isAdded()) {
            zVar.g(j8);
            return;
        }
        v vVar = this.f83449b;
        if (vVar.V()) {
            this.f83456i = true;
            return;
        }
        boolean zIsAdded = fragmentB.isAdded();
        c cVar = this.f83454g;
        if (zIsAdded && t(j8)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.f83459a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.f83466a);
            }
            Fragment.m mVarJ0 = vVar.j0(fragmentB);
            c.b(arrayList);
            zVar2.f(j8, mVarJ0);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = cVar.f83459a.iterator();
        while (it3.hasNext()) {
            ((e) it3.next()).getClass();
            arrayList2.add(e.f83466a);
        }
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.k(fragmentB);
            aVar.t();
            zVar.g(j8);
        } finally {
            c.b(arrayList2);
        }
    }

    @Override // he.i
    public final Bundle a() {
        z<Fragment> zVar = this.f83450c;
        int iH = zVar.h();
        z<Fragment.m> zVar2 = this.f83451d;
        Bundle bundle = new Bundle(zVar2.h() + iH);
        for (int i14 = 0; i14 < zVar.h(); i14++) {
            long jE = zVar.e(i14);
            Fragment fragmentB = zVar.b(jE);
            if (fragmentB != null && fragmentB.isAdded()) {
                this.f83449b.e0(bundle, org.apache.commons.lang3.e.e(jE, "f#"), fragmentB);
            }
        }
        for (int i15 = 0; i15 < zVar2.h(); i15++) {
            long jE2 = zVar2.e(i15);
            if (t(jE2)) {
                bundle.putParcelable(org.apache.commons.lang3.e.e(jE2, "s#"), zVar2.b(jE2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i14) {
        return i14;
    }

    @Override // he.i
    public final void k(Parcelable parcelable) {
        z<Fragment.m> zVar = this.f83451d;
        if (zVar.d()) {
            z<Fragment> zVar2 = this.f83450c;
            if (zVar2.d()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        zVar2.f(Long.parseLong(str.substring(2)), this.f83449b.N(bundle, str));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            vb.h.s("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j8 = Long.parseLong(str.substring(2));
                        Fragment.m mVar = (Fragment.m) bundle.getParcelable(str);
                        if (t(j8)) {
                            zVar.f(j8, mVar);
                        }
                    }
                }
                if (zVar2.d()) {
                    return;
                }
                this.f83456i = true;
                this.f83455h = true;
                x();
                Handler handler = new Handler(Looper.getMainLooper());
                he.c cVar = new he.c(this);
                this.f83448a.a(new he.d(this, handler, cVar));
                handler.postDelayed(cVar, AbstractComponentTracker.LINGERING_TIMEOUT);
                return;
            }
        }
        vb.h.z("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        k7.h.a(this.f83453f == null);
        d dVar = new d();
        this.f83453f = dVar;
        dVar.f83463d = d.a(recyclerView);
        he.e eVar = new he.e(dVar);
        dVar.f83460a = eVar;
        dVar.f83463d.f11339c.f11374a.add(eVar);
        f fVar = new f(dVar);
        dVar.f83461b = fVar;
        a aVar = a.this;
        aVar.registerAdapterDataObserver(fVar);
        g gVar = new g(dVar);
        dVar.f83462c = gVar;
        aVar.f83448a.a(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        h hVar = (h) f0Var;
        long itemId = hVar.getItemId();
        int id3 = ((FrameLayout) hVar.itemView).getId();
        Long lZ = z(id3);
        z<Integer> zVar = this.f83452e;
        if (lZ != null && lZ.longValue() != itemId) {
            B(lZ.longValue());
            zVar.g(lZ.longValue());
        }
        zVar.f(itemId, Integer.valueOf(id3));
        long itemId2 = getItemId(i14);
        z<Fragment> zVar2 = this.f83450c;
        if (zVar2.c(itemId2) < 0) {
            Fragment fragmentU = u(i14);
            fragmentU.setInitialSavedState(this.f83451d.b(itemId2));
            zVar2.f(itemId2, fragmentU);
        }
        if (((FrameLayout) hVar.itemView).isAttachedToWindow()) {
            A(hVar);
        }
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        return h.d(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        d dVar = this.f83453f;
        dVar.getClass();
        ViewPager2 viewPager2A = d.a(recyclerView);
        viewPager2A.f11339c.f11374a.remove(dVar.f83460a);
        a aVar = a.this;
        aVar.unregisterAdapterDataObserver(dVar.f83461b);
        aVar.f83448a.d(dVar.f83462c);
        dVar.f83463d = null;
        this.f83453f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        A((h) f0Var);
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        Long lZ = z(((FrameLayout) ((h) f0Var).itemView).getId());
        if (lZ != null) {
            B(lZ.longValue());
            this.f83452e.g(lZ.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z14) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean t(long j8) {
        return j8 >= 0 && j8 < ((long) getItemCount());
    }

    public abstract Fragment u(int i14);

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        z<Fragment> zVar;
        z<Integer> zVar2;
        Fragment fragmentB;
        View view2;
        if (!this.f83456i || this.f83449b.V()) {
            return;
        }
        p1.b bVar = new p1.b();
        int i14 = 0;
        while (true) {
            zVar = this.f83450c;
            int iH = zVar.h();
            zVar2 = this.f83452e;
            if (i14 >= iH) {
                break;
            }
            long jE = zVar.e(i14);
            if (!t(jE)) {
                bVar.add(Long.valueOf(jE));
                zVar2.g(jE);
            }
            i14++;
        }
        if (!this.f83455h) {
            this.f83456i = false;
            for (int i15 = 0; i15 < zVar.h(); i15++) {
                long jE2 = zVar.e(i15);
                if (zVar2.c(jE2) < 0 && ((fragmentB = zVar.b(jE2)) == null || (view2 = fragmentB.getView()) == null || view2.getParent() == null)) {
                    bVar.add(Long.valueOf(jE2));
                }
            }
        }
        p1.b.a aVar = new p1.b.a();
        while (aVar.hasNext()) {
            B(((Long) aVar.next()).longValue());
        }
    }

    public final Long z(int i14) {
        Long lValueOf = null;
        int i15 = 0;
        while (true) {
            z<Integer> zVar = this.f83452e;
            if (i15 >= zVar.h()) {
                return lValueOf;
            }
            if (zVar.i(i15).intValue() == i14) {
                if (lValueOf != null) {
                    vb.h.z("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(zVar.e(i15));
            }
            i15++;
        }
    }

    public static abstract class b extends RecyclerView.j {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i14, int i15, int i16) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i14, int i15) {
            onChanged();
        }

        public /* synthetic */ b(C1644a c1644a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15, Object obj) {
            onChanged();
        }
    }

    public a(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getF158017a());
    }

    public a(m mVar) {
        this(mVar.getSupportFragmentManager(), mVar.getF158017a());
    }
}
