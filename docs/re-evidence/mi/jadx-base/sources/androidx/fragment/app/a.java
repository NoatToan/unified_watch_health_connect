package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import defpackage.kpe;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements FragmentManager.j, FragmentManager.o {
    public final FragmentManager t;
    public boolean u;
    public int v;
    public boolean w;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.x0(), fragmentManager.z0() != null ? fragmentManager.z0().f().getClassLoader() : null);
        this.v = -1;
        this.w = false;
        this.t = fragmentManager;
    }

    @Override // androidx.fragment.app.k
    public k B(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.B(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.k
    public k C(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.t) {
            return super.C(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.k
    public k F(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.F(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void G(int i) {
        if (this.i) {
            if (FragmentManager.M0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                k.a aVar = this.c.get(i2);
                Fragment fragment = aVar.f2428b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f2428b);
                        sb2.append(" to ");
                        sb2.append(aVar.f2428b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int H(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new kpe("FragmentManager"));
            I("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.l();
        } else {
            this.v = -1;
        }
        this.t.a0(this, z);
        return this.v;
    }

    public void I(String str, PrintWriter printWriter) {
        J(str, printWriter, true);
    }

    public void J(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2425k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            k.a aVar = this.c.get(i);
            switch (aVar.f2427a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2427a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2428b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public void K() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            k.a aVar = this.c.get(i);
            Fragment fragment = aVar.f2428b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.h);
                fragment.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.f2427a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, false);
                    this.t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2427a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.q1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.J0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, false);
                    this.t.F1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, false);
                    this.t.n(fragment);
                    break;
                case 8:
                    this.t.D1(fragment);
                    break;
                case 9:
                    this.t.D1(null);
                    break;
                case 10:
                    this.t.C1(fragment, aVar.i);
                    break;
            }
        }
    }

    public void L() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            k.a aVar = this.c.get(size);
            Fragment fragment = aVar.f2428b;
            if (fragment != null) {
                fragment.mBeingSaved = this.w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.v1(this.h));
                fragment.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.f2427a) {
                case 1:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, true);
                    this.t.q1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2427a);
                case 3:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.F1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, true);
                    this.t.J0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.n(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.z1(fragment, true);
                    this.t.y(fragment);
                    break;
                case 8:
                    this.t.D1(null);
                    break;
                case 9:
                    this.t.D1(fragment);
                    break;
                case 10:
                    this.t.C1(fragment, aVar.h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    public Fragment M(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            k.a aVar = this.c.get(i);
            int i2 = aVar.f2427a;
            if (i2 == 1) {
                arrayList.add(aVar.f2428b);
            } else if (i2 == 2) {
                Fragment fragment3 = aVar.f2428b;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.c.add(i, new k.a(9, fragment4, true));
                                i++;
                                fragment2 = null;
                            }
                            k.a aVar2 = new k.a(3, fragment4, true);
                            aVar2.d = aVar.d;
                            aVar2.f = aVar.f;
                            aVar2.e = aVar.e;
                            aVar2.g = aVar.g;
                            this.c.add(i, aVar2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.c.remove(i);
                    i--;
                } else {
                    aVar.f2427a = 1;
                    aVar.c = true;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(aVar.f2428b);
                Fragment fragment5 = aVar.f2428b;
                if (fragment5 == fragment2) {
                    this.c.add(i, new k.a(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(aVar.f2428b);
            } else if (i2 == 8) {
                this.c.add(i, new k.a(9, fragment2, true));
                aVar.c = true;
                i++;
                fragment2 = aVar.f2428b;
            }
            i++;
        }
        return fragment2;
    }

    public void N() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public Fragment O(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            k.a aVar = this.c.get(size);
            int i = aVar.f2427a;
            if (i == 1) {
                arrayList.remove(aVar.f2428b);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(aVar.f2428b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f2428b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f2428b;
                        break;
                    case 10:
                        aVar.i = aVar.h;
                        break;
                }
            } else {
                arrayList.add(aVar.f2428b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public int getId() {
        return this.v;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public String getName() {
        return this.f2425k;
    }

    @Override // androidx.fragment.app.k
    public int l() {
        return H(false);
    }

    @Override // androidx.fragment.app.k
    public int m() {
        return H(true);
    }

    @Override // androidx.fragment.app.k
    public void n() {
        r();
        this.t.d0(this, false);
    }

    @Override // androidx.fragment.app.k
    public void o() {
        r();
        this.t.d0(this, true);
    }

    @Override // androidx.fragment.app.k
    public k q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.k
    public void s(int i, Fragment fragment, String str, int i2) {
        super.s(i, fragment, str, i2);
        fragment.mFragmentManager = this.t;
    }

    @Override // androidx.fragment.app.k
    public k t(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.t(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.f2425k != null) {
            sb.append(" ");
            sb.append(this.f2425k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.k
    public boolean u() {
        return this.c.isEmpty();
    }

    @Override // androidx.fragment.app.k
    public k v(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
