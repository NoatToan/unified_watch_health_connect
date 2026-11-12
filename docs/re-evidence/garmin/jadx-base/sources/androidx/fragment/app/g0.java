package androidx.fragment.app;

import android.os.Bundle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f7234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<a> f7235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f7245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f7247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f7248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f7249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f7251s;

    public g0(q qVar, ClassLoader classLoader, g0 g0Var) {
        this(qVar, classLoader);
        Iterator<a> it = g0Var.f7235c.iterator();
        while (it.hasNext()) {
            this.f7235c.add(new a(it.next()));
        }
        this.f7236d = g0Var.f7236d;
        this.f7237e = g0Var.f7237e;
        this.f7238f = g0Var.f7238f;
        this.f7239g = g0Var.f7239g;
        this.f7240h = g0Var.f7240h;
        this.f7241i = g0Var.f7241i;
        this.f7242j = g0Var.f7242j;
        this.f7243k = g0Var.f7243k;
        this.f7246n = g0Var.f7246n;
        this.f7247o = g0Var.f7247o;
        this.f7244l = g0Var.f7244l;
        this.f7245m = g0Var.f7245m;
        if (g0Var.f7248p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f7248p = arrayList;
            arrayList.addAll(g0Var.f7248p);
        }
        if (g0Var.f7249q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f7249q = arrayList2;
            arrayList2.addAll(g0Var.f7249q);
        }
        this.f7250r = g0Var.f7250r;
    }

    public final void b(FragmentContainerView fragmentContainerView, Fragment fragment, String str) {
        fragment.mContainer = fragmentContainerView;
        fragment.mInDynamicContainer = true;
        j(fragmentContainerView.getId(), fragment, str, 1);
    }

    public final void c(a aVar) {
        this.f7235c.add(aVar);
        aVar.f7255d = this.f7236d;
        aVar.f7256e = this.f7237e;
        aVar.f7257f = this.f7238f;
        aVar.f7258g = this.f7239g;
    }

    public final void d(String str) {
        if (!this.f7242j) {
            vb.h.z("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.f7241i = true;
            this.f7243k = str;
        }
    }

    public abstract int e();

    public abstract void f();

    public final Fragment g(Bundle bundle, Class cls) {
        q qVar = this.f7233a;
        if (qVar == null) {
            vb.h.z("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
            return null;
        }
        ClassLoader classLoader = this.f7234b;
        if (classLoader == null) {
            vb.h.z("The FragmentManager must be attached to itshost to create a Fragment");
            return null;
        }
        Fragment fragmentInstantiate = qVar.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    public void h(Fragment fragment) {
        c(new a(6, fragment));
    }

    public final void i() {
        if (this.f7241i) {
            vb.h.z("This transaction is already being added to the back stack");
        } else {
            this.f7242j = false;
        }
    }

    public void j(int i14, Fragment fragment, String str, int i15) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            f8.a.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            wr.g.x("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb3 = new StringBuilder("Can't change tag of fragment ");
                sb3.append(fragment);
                sb3.append(": was ");
                vb.h.z(v.e0.h(sb3, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i14 != 0) {
            if (i14 == -1) {
                androidx.core.view.j.p(fragment, " with tag ", str, " to container view with no id", "Can't add fragment ");
                return;
            }
            int i16 = fragment.mFragmentId;
            if (i16 != 0 && i16 != i14) {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                int i17 = fragment.mFragmentId;
                sb4.append(": was ");
                sb4.append(i17);
                sb4.append(" now ");
                sb4.append(i14);
                throw new IllegalStateException(sb4.toString());
            }
            fragment.mFragmentId = i14;
            fragment.mContainerId = i14;
        }
        c(new a(i15, fragment));
    }

    public void k(Fragment fragment) {
        c(new a(3, fragment));
    }

    public final void l(int i14, Fragment fragment, String str) {
        if (i14 != 0) {
            j(i14, fragment, str, 2);
        } else {
            vb.h.s("Must use non-zero containerViewId");
        }
    }

    public final void m(int i14, Class cls, Bundle bundle) {
        l(i14, g(bundle, cls), null);
    }

    public final void n(Runnable runnable, boolean z14) {
        if (!z14) {
            i();
        }
        if (this.f7251s == null) {
            this.f7251s = new ArrayList<>();
        }
        this.f7251s.add(runnable);
    }

    public final void o(int i14, int i15, int i16, int i17) {
        this.f7236d = i14;
        this.f7237e = i15;
        this.f7238f = i16;
        this.f7239g = i17;
    }

    public void p(Fragment fragment, androidx.lifecycle.b0.b bVar) {
        c(new a(10, fragment, bVar));
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f7253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.lifecycle.b0.b f7259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.lifecycle.b0.b f7260i;

        public a(a aVar) {
            this.f7252a = aVar.f7252a;
            this.f7253b = aVar.f7253b;
            this.f7254c = aVar.f7254c;
            this.f7255d = aVar.f7255d;
            this.f7256e = aVar.f7256e;
            this.f7257f = aVar.f7257f;
            this.f7258g = aVar.f7258g;
            this.f7259h = aVar.f7259h;
            this.f7260i = aVar.f7260i;
        }

        public a(int i14, Fragment fragment) {
            this.f7252a = i14;
            this.f7253b = fragment;
            this.f7254c = false;
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
            this.f7259h = bVar;
            this.f7260i = bVar;
        }

        public a(int i14, Fragment fragment, boolean z14) {
            this.f7252a = i14;
            this.f7253b = fragment;
            this.f7254c = z14;
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.RESUMED;
            this.f7259h = bVar;
            this.f7260i = bVar;
        }

        public a(int i14, Fragment fragment, androidx.lifecycle.b0.b bVar) {
            this.f7252a = i14;
            this.f7253b = fragment;
            this.f7254c = false;
            this.f7259h = fragment.mMaxState;
            this.f7260i = bVar;
        }

        public a() {
        }
    }

    public g0(q qVar, ClassLoader classLoader) {
        this.f7235c = new ArrayList<>();
        this.f7242j = true;
        this.f7250r = false;
        this.f7233a = qVar;
        this.f7234b = classLoader;
    }

    @Deprecated
    public g0() {
        this.f7235c = new ArrayList<>();
        this.f7242j = true;
        this.f7250r = false;
        this.f7233a = null;
        this.f7234b = null;
    }
}
