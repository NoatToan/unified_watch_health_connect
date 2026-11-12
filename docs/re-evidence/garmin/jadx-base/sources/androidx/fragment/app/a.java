package androidx.fragment.app;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g0 implements v.k, v.q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f7126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7129w;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(a aVar) {
        q qVarP = aVar.f7126t.P();
        r<?> rVar = aVar.f7126t.f7393x;
        super(qVarP, rVar != null ? rVar.f7358b.getClassLoader() : null, aVar);
        this.f7128v = -1;
        this.f7129w = false;
        this.f7126t = aVar.f7126t;
        this.f7127u = aVar.f7127u;
        this.f7128v = aVar.f7128v;
        this.f7129w = aVar.f7129w;
    }

    @Override // androidx.fragment.app.v.q
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (v.R(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7241i) {
            return true;
        }
        this.f7126t.f7373d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.g0
    public final int e() {
        return s(false, true);
    }

    @Override // androidx.fragment.app.g0
    public final void f() {
        i();
        this.f7126t.B(this, true);
    }

    @Override // androidx.fragment.app.v.k
    public final String getName() {
        return this.f7243k;
    }

    @Override // androidx.fragment.app.g0
    public final void h(Fragment fragment) {
        v vVar = fragment.mFragmentManager;
        if (vVar == null || vVar == this.f7126t) {
            super.h(fragment);
        } else {
            androidx.core.view.j.n(fragment, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    @Override // androidx.fragment.app.g0
    public final void j(int i14, Fragment fragment, String str, int i15) {
        super.j(i14, fragment, str, i15);
        fragment.mFragmentManager = this.f7126t;
    }

    @Override // androidx.fragment.app.g0
    public final void k(Fragment fragment) {
        v vVar = fragment.mFragmentManager;
        if (vVar == null || vVar == this.f7126t) {
            super.k(fragment);
        } else {
            androidx.core.view.j.n(fragment, "Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    @Override // androidx.fragment.app.g0
    public final void p(Fragment fragment, androidx.lifecycle.b0.b bVar) {
        v vVar = fragment.mFragmentManager;
        v vVar2 = this.f7126t;
        if (vVar != vVar2) {
            com.google.firebase.messaging.l.j(vVar2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (bVar == androidx.lifecycle.b0.b.INITIALIZED && fragment.mState > -1) {
            org.apache.commons.lang3.e.l("Cannot set maximum Lifecycle to ", bVar, " after the Fragment has been created");
        } else if (bVar != androidx.lifecycle.b0.b.DESTROYED) {
            super.p(fragment, bVar);
        } else {
            org.apache.commons.lang3.e.l("Cannot set maximum Lifecycle to ", bVar, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final void q(int i14) {
        if (this.f7241i) {
            if (v.R(2)) {
                toString();
            }
            ArrayList<g0.a> arrayList = this.f7235c;
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                g0.a aVar = arrayList.get(i15);
                Fragment fragment = aVar.f7253b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i14;
                    if (v.R(2)) {
                        Objects.toString(aVar.f7253b);
                        int i16 = aVar.f7253b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void r() {
        ArrayList<g0.a> arrayList = this.f7235c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            g0.a aVar = arrayList.get(size);
            if (aVar.f7254c) {
                if (aVar.f7252a == 8) {
                    aVar.f7254c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i14 = aVar.f7253b.mContainerId;
                    aVar.f7252a = 2;
                    aVar.f7254c = false;
                    for (int i15 = size - 1; i15 >= 0; i15--) {
                        g0.a aVar2 = arrayList.get(i15);
                        if (aVar2.f7254c && aVar2.f7253b.mContainerId == i14) {
                            arrayList.remove(i15);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int s(boolean z14, boolean z15) {
        if (this.f7127u) {
            vb.h.z("commit already called");
            return 0;
        }
        if (v.R(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new o0("FragmentManager"));
            u("  ", printWriter, true);
            printWriter.close();
        }
        this.f7127u = true;
        boolean z16 = this.f7241i;
        v vVar = this.f7126t;
        if (z16) {
            this.f7128v = vVar.f7380k.getAndIncrement();
        } else {
            this.f7128v = -1;
        }
        if (z15) {
            vVar.y(this, z14);
        }
        return this.f7128v;
    }

    public final void t() {
        i();
        this.f7126t.B(this, false);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(128);
        sb3.append("BackStackEntry{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7128v >= 0) {
            sb3.append(" #");
            sb3.append(this.f7128v);
        }
        if (this.f7243k != null) {
            sb3.append(StringUtils.SPACE);
            sb3.append(this.f7243k);
        }
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb3.toString();
    }

    public final void u(String str, PrintWriter printWriter, boolean z14) {
        String str2;
        if (z14) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7243k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7128v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7127u);
            if (this.f7240h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7240h));
            }
            if (this.f7236d != 0 || this.f7237e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7236d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7237e));
            }
            if (this.f7238f != 0 || this.f7239g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7238f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7239g));
            }
            if (this.f7244l != 0 || this.f7245m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7244l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7245m);
            }
            if (this.f7246n != 0 || this.f7247o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7246n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7247o);
            }
        }
        ArrayList<g0.a> arrayList = this.f7235c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            g0.a aVar = arrayList.get(i14);
            switch (aVar.f7252a) {
                case 0:
                    str2 = ActionConst.NULL;
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
                    str2 = "cmd=" + aVar.f7252a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i14);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtils.SPACE);
            printWriter.println(aVar.f7253b);
            if (z14) {
                if (aVar.f7255d != 0 || aVar.f7256e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7255d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7256e));
                }
                if (aVar.f7257f != 0 || aVar.f7258g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7257f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7258g));
                }
            }
        }
    }

    public final void v(Fragment fragment) {
        v vVar = fragment.mFragmentManager;
        if (vVar == null || vVar == this.f7126t) {
            c(new g0.a(4, fragment));
        } else {
            androidx.core.view.j.n(fragment, "Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void w(Fragment fragment) {
        v vVar = fragment.mFragmentManager;
        if (vVar == null || vVar == this.f7126t) {
            c(new g0.a(8, fragment));
        } else {
            androidx.core.view.j.n(fragment, "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void x(Fragment fragment) {
        v vVar = fragment.mFragmentManager;
        if (vVar == null || vVar == this.f7126t) {
            c(new g0.a(5, fragment));
        } else {
            androidx.core.view.j.n(fragment, "Cannot show Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(v vVar) {
        q qVarP = vVar.P();
        r<?> rVar = vVar.f7393x;
        super(qVarP, rVar != null ? rVar.f7358b.getClassLoader() : null);
        this.f7128v = -1;
        this.f7129w = false;
        this.f7126t = vVar;
    }
}
