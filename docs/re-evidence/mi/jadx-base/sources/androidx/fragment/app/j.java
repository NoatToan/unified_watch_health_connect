package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f2421a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, h> f2422b = new HashMap<>();
    public final HashMap<String, FragmentState> c = new HashMap<>();
    public g d;

    public void A(g gVar) {
        this.d = gVar;
    }

    public FragmentState B(String str, FragmentState fragmentState) {
        return fragmentState != null ? this.c.put(str, fragmentState) : this.c.remove(str);
    }

    public void a(Fragment fragment) {
        if (this.f2421a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2421a) {
            this.f2421a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f2422b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f2422b.get(str) != null;
    }

    public void d(int i) {
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                hVar.u(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2422b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h hVar : this.f2422b.values()) {
                printWriter.print(str);
                if (hVar != null) {
                    Fragment fragmentK = hVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        int size = this.f2421a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.f2421a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        h hVar = this.f2422b.get(str);
        if (hVar != null) {
            return hVar.k();
        }
        return null;
    }

    public Fragment g(int i) {
        for (int size = this.f2421a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2421a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                Fragment fragmentK = hVar.k();
                if (fragmentK.mFragmentId == i) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2421a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2421a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                Fragment fragmentK = hVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (h hVar : this.f2422b.values()) {
            if (hVar != null && (fragmentFindFragmentByWho = hVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2421a.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f2421a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2421a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2421a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<h> k() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                arrayList.add(hVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ArrayList<FragmentState> m() {
        return new ArrayList<>(this.c.values());
    }

    public h n(String str) {
        return this.f2422b.get(str);
    }

    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f2421a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2421a) {
            arrayList = new ArrayList(this.f2421a);
        }
        return arrayList;
    }

    public g p() {
        return this.d;
    }

    public FragmentState q(String str) {
        return this.c.get(str);
    }

    public void r(h hVar) {
        Fragment fragmentK = hVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f2422b.put(fragmentK.mWho, hVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.d.a(fragmentK);
            } else {
                this.d.k(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(fragmentK);
        }
    }

    public void s(h hVar) {
        Fragment fragmentK = hVar.k();
        if (fragmentK.mRetainInstance) {
            this.d.k(fragmentK);
        }
        if (this.f2422b.put(fragmentK.mWho, null) != null && FragmentManager.M0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(fragmentK);
        }
    }

    public void t() {
        Iterator<Fragment> it = this.f2421a.iterator();
        while (it.hasNext()) {
            h hVar = this.f2422b.get(it.next().mWho);
            if (hVar != null) {
                hVar.m();
            }
        }
        for (h hVar2 : this.f2422b.values()) {
            if (hVar2 != null) {
                hVar2.m();
                Fragment fragmentK = hVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.c.containsKey(fragmentK.mWho)) {
                        hVar2.s();
                    }
                    s(hVar2);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f2421a) {
            this.f2421a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void v() {
        this.f2422b.clear();
    }

    public void w(List<String> list) {
        this.f2421a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.M0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    public void x(ArrayList<FragmentState> arrayList) {
        this.c.clear();
        for (FragmentState fragmentState : arrayList) {
            this.c.put(fragmentState.f2366b, fragmentState);
        }
    }

    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f2422b.size());
        for (h hVar : this.f2422b.values()) {
            if (hVar != null) {
                Fragment fragmentK = hVar.k();
                hVar.s();
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.M0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(fragmentK);
                    sb.append(": ");
                    sb.append(fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> z() {
        synchronized (this.f2421a) {
            try {
                if (this.f2421a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f2421a.size());
                for (Fragment fragment : this.f2421a) {
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.M0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(fragment.mWho);
                        sb.append("): ");
                        sb.append(fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
