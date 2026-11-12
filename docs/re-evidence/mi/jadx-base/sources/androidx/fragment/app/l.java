package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import defpackage.qsi;
import defpackage.s5n;
import defpackage.si3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f2430b = new ArrayList<>();
    public final ArrayList<e> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f2431a;

        public a(d dVar) {
            this.f2431a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.f2430b.contains(this.f2431a)) {
                this.f2431a.e().a(this.f2431a.f().mView);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f2433a;

        public b(d dVar) {
            this.f2433a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f2430b.remove(this.f2433a);
            l.this.c.remove(this.f2433a);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2436b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2436b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2436b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2436b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2435a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2435a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2435a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2435a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d extends e {
        public final h h;

        public d(e.c cVar, e.b bVar, h hVar, si3 si3Var) {
            super(cVar, bVar, hVar.k(), si3Var);
            this.h = hVar;
        }

        @Override // androidx.fragment.app.l.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // androidx.fragment.app.l.e
        public void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment fragmentK = this.h.k();
                    View viewRequireView = fragmentK.requireView();
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Clearing focus ");
                        sb.append(viewRequireView.findFocus());
                        sb.append(" on view ");
                        sb.append(viewRequireView);
                        sb.append(" for Fragment ");
                        sb.append(fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.h.k();
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.M0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Saved focused view ");
                    sb2.append(viewFindFocus);
                    sb2.append(" for Fragment ");
                    sb2.append(fragmentK2);
                }
            }
            View viewRequireView2 = f().requireView();
            if (viewRequireView2.getParent() == null) {
                this.h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f2437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f2438b;
        public final Fragment c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<si3> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        public class a implements si3.a {
            public a() {
            }

            @Override // si3.a
            public void onCancel() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i = c.f2435a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.M0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.M0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: Setting view ");
                    sb4.append(view);
                    sb4.append(" to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, si3 si3Var) {
            this.f2437a = cVar;
            this.f2438b = bVar;
            this.c = fragment;
            si3Var.setOnCancelListener(new a());
        }

        public final void a(Runnable runnable) {
            this.d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((si3) it.next()).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.g = true;
            Iterator<Runnable> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(si3 si3Var) {
            if (this.e.remove(si3Var) && this.e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2437a;
        }

        public final Fragment f() {
            return this.c;
        }

        public b g() {
            return this.f2438b;
        }

        public final boolean h() {
            return this.f;
        }

        public final boolean i() {
            return this.g;
        }

        public final void j(si3 si3Var) {
            l();
            this.e.add(si3Var);
        }

        public final void k(c cVar, b bVar) {
            int i = c.f2436b[bVar.ordinal()];
            if (i == 1) {
                if (this.f2437a == c.REMOVED) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.c);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.f2438b);
                        sb.append(" to ADDING.");
                    }
                    this.f2437a = c.VISIBLE;
                    this.f2438b = b.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.M0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f2437a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f2438b);
                    sb2.append(" to REMOVING.");
                }
                this.f2437a = c.REMOVED;
                this.f2438b = b.REMOVING;
                return;
            }
            if (i == 3 && this.f2437a != c.REMOVED) {
                if (FragmentManager.M0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.c);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.f2437a);
                    sb3.append(" -> ");
                    sb3.append(cVar);
                    sb3.append(". ");
                }
                this.f2437a = cVar;
            }
        }

        public void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2437a + "} {mLifecycleImpact = " + this.f2438b + "} {mFragment = " + this.c + "}";
        }
    }

    public l(ViewGroup viewGroup) {
        this.f2429a = viewGroup;
    }

    public static l n(ViewGroup viewGroup, s5n s5nVar) {
        Object tag = viewGroup.getTag(qsi.f31806b);
        if (tag instanceof l) {
            return (l) tag;
        }
        l lVarA = s5nVar.a(viewGroup);
        viewGroup.setTag(qsi.f31806b, lVarA);
        return lVarA;
    }

    public static l o(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return n(viewGroup, fragmentManager.E0());
    }

    public final void a(e.c cVar, e.b bVar, h hVar) {
        synchronized (this.f2430b) {
            try {
                si3 si3Var = new si3();
                e eVarH = h(hVar.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, hVar, si3Var);
                this.f2430b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(e.c cVar, h hVar) {
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(hVar.k());
        }
        a(cVar, e.b.ADDING, hVar);
    }

    public void c(h hVar) {
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.GONE, e.b.NONE, hVar);
    }

    public void d(h hVar) {
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, hVar);
    }

    public void e(h hVar) {
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, hVar);
    }

    public abstract void f(List<e> list, boolean z);

    public void g() {
        if (this.e) {
            return;
        }
        if (!androidx.core.view.c.T(this.f2429a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.f2430b) {
            try {
                if (!this.f2430b.isEmpty()) {
                    ArrayList<e> arrayList = new ArrayList(this.c);
                    this.c.clear();
                    for (e eVar : arrayList) {
                        if (FragmentManager.M0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f2430b);
                    this.f2430b.clear();
                    this.c.addAll(arrayList2);
                    FragmentManager.M0(2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).l();
                    }
                    f(arrayList2, this.d);
                    this.d = false;
                    FragmentManager.M0(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e h(Fragment fragment) {
        for (e eVar : this.f2430b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        for (e eVar : this.c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    public void j() {
        FragmentManager.M0(2);
        boolean zT = androidx.core.view.c.T(this.f2429a);
        synchronized (this.f2430b) {
            try {
                q();
                Iterator<e> it = this.f2430b.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
                for (e eVar : new ArrayList(this.c)) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zT ? "" : "Container " + this.f2429a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                    }
                    eVar.b();
                }
                for (e eVar2 : new ArrayList(this.f2430b)) {
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zT ? "" : "Container " + this.f2429a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.e) {
            FragmentManager.M0(2);
            this.e = false;
            g();
        }
    }

    public e.b l(h hVar) {
        e eVarH = h(hVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(hVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f2429a;
    }

    public void p() {
        synchronized (this.f2430b) {
            try {
                q();
                this.e = false;
                for (int size = this.f2430b.size() - 1; size >= 0; size--) {
                    e eVar = this.f2430b.get(size);
                    e.c cVarC = e.c.c(eVar.f().mView);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarC != cVar) {
                        this.e = eVar.f().isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        for (e eVar : this.f2430b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.b(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z) {
        this.d = z;
    }
}
