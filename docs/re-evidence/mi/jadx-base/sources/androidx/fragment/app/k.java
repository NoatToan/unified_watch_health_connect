package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import defpackage.dla;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f2424b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2425k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public ArrayList<Runnable> s;
    public ArrayList<a> c = new ArrayList<>();
    public boolean j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2426r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f2428b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public Lifecycle.State h;
        public Lifecycle.State i;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f2427a = i;
            this.f2428b = fragment;
            this.c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.h = state;
            this.i = state;
        }

        public a(int i, Fragment fragment, boolean z) {
            this.f2427a = i;
            this.f2428b = fragment;
            this.c = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.h = state;
            this.i = state;
        }

        public a(int i, Fragment fragment, Lifecycle.State state) {
            this.f2427a = i;
            this.f2428b = fragment;
            this.c = false;
            this.h = fragment.mMaxState;
            this.i = state;
        }
    }

    public k(d dVar, ClassLoader classLoader) {
        this.f2423a = dVar;
        this.f2424b = classLoader;
    }

    public k A(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this;
    }

    public k B(Fragment fragment, Lifecycle.State state) {
        h(new a(10, fragment, state));
        return this;
    }

    public k C(Fragment fragment) {
        h(new a(8, fragment));
        return this;
    }

    public k D(boolean z) {
        this.f2426r = z;
        return this;
    }

    public k E(int i) {
        this.h = i;
        return this;
    }

    public k F(Fragment fragment) {
        h(new a(5, fragment));
        return this;
    }

    public k b(int i, Fragment fragment) {
        s(i, fragment, null, 1);
        return this;
    }

    public k c(int i, Fragment fragment, String str) {
        s(i, fragment, str, 1);
        return this;
    }

    public final k d(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return c(i, p(cls, bundle), str);
    }

    public k e(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public k f(Fragment fragment, String str) {
        s(0, fragment, str, 1);
        return this;
    }

    public final k g(Class<? extends Fragment> cls, Bundle bundle, String str) {
        return f(p(cls, bundle), str);
    }

    public void h(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public k i(View view, String str) {
        if (dla.f()) {
            String strJ = androidx.core.view.c.J(view);
            if (strJ == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.p == null) {
                this.p = new ArrayList<>();
                this.q = new ArrayList<>();
            } else {
                if (this.q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.p.contains(strJ)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strJ + "' has already been added to the transaction.");
                }
            }
            this.p.add(strJ);
            this.q.add(str);
        }
        return this;
    }

    public k j(String str) {
        if (!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.f2425k = str;
        return this;
    }

    public k k(Fragment fragment) {
        h(new a(7, fragment));
        return this;
    }

    public abstract int l();

    public abstract int m();

    public abstract void n();

    public abstract void o();

    public final Fragment p(Class<? extends Fragment> cls, Bundle bundle) {
        d dVar = this.f2423a;
        if (dVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f2424b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentA = dVar.a(classLoader, cls.getName());
        if (bundle != null) {
            fragmentA.setArguments(bundle);
        }
        return fragmentA;
    }

    public k q(Fragment fragment) {
        h(new a(6, fragment));
        return this;
    }

    public k r() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    public void s(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        h(new a(i2, fragment));
    }

    public k t(Fragment fragment) {
        h(new a(4, fragment));
        return this;
    }

    public abstract boolean u();

    public k v(Fragment fragment) {
        h(new a(3, fragment));
        return this;
    }

    public k w(int i, Fragment fragment) {
        return x(i, fragment, null);
    }

    public k x(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        s(i, fragment, str, 2);
        return this;
    }

    public final k y(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return x(i, p(cls, bundle), str);
    }

    public k z(Runnable runnable) {
        r();
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(runnable);
        return this;
    }
}
