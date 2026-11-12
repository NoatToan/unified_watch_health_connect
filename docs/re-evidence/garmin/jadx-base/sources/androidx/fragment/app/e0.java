package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class e0 extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f7216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f7218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<Fragment.m> f7219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<Fragment> f7220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Fragment f7221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7222g;

    public e0(v vVar, int i14) {
        this.f7218c = null;
        this.f7219d = new ArrayList<>();
        this.f7220e = new ArrayList<>();
        this.f7221f = null;
        this.f7216a = vVar;
        this.f7217b = i14;
    }

    @Override // fe.a
    public void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        ArrayList<Fragment.m> arrayList;
        Fragment fragment = (Fragment) obj;
        a aVar = this.f7218c;
        v vVar = this.f7216a;
        if (aVar == null) {
            this.f7218c = androidx.core.view.j.b(vVar, vVar);
        }
        while (true) {
            arrayList = this.f7219d;
            if (arrayList.size() > i14) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i14, fragment.isAdded() ? vVar.j0(fragment) : null);
        this.f7220e.set(i14, null);
        this.f7218c.k(fragment);
        if (fragment.equals(this.f7221f)) {
            this.f7221f = null;
        }
    }

    @Override // fe.a
    public final void finishUpdate(ViewGroup viewGroup) {
        a aVar = this.f7218c;
        if (aVar != null) {
            if (!this.f7222g) {
                try {
                    this.f7222g = true;
                    aVar.f();
                    this.f7222g = false;
                } catch (Throwable th3) {
                    this.f7222g = false;
                    throw th3;
                }
            }
            this.f7218c = null;
        }
    }

    public abstract Fragment getItem(int i14);

    @Override // fe.a
    public Object instantiateItem(ViewGroup viewGroup, int i14) {
        Fragment.m mVar;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.f7220e;
        if (arrayList.size() > i14 && (fragment = arrayList.get(i14)) != null) {
            return fragment;
        }
        if (this.f7218c == null) {
            v vVar = this.f7216a;
            this.f7218c = androidx.core.view.j.b(vVar, vVar);
        }
        Fragment item = getItem(i14);
        ArrayList<Fragment.m> arrayList2 = this.f7219d;
        if (arrayList2.size() > i14 && (mVar = arrayList2.get(i14)) != null) {
            item.setInitialSavedState(mVar);
        }
        while (arrayList.size() <= i14) {
            arrayList.add(null);
        }
        item.setMenuVisibility(false);
        int i15 = this.f7217b;
        if (i15 == 0) {
            item.setUserVisibleHint(false);
        }
        arrayList.set(i14, item);
        this.f7218c.j(viewGroup.getId(), item, null, 1);
        if (i15 == 1) {
            this.f7218c.p(item, androidx.lifecycle.b0.b.STARTED);
        }
        return item;
    }

    @Override // fe.a
    public boolean isViewFromObject(View view2, Object obj) {
        return ((Fragment) obj).getView() == view2;
    }

    @Override // fe.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<Fragment.m> arrayList = this.f7219d;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.f7220e;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i14 = Integer.parseInt(str.substring(1));
                    Fragment fragmentN = this.f7216a.N(bundle, str);
                    if (fragmentN != null) {
                        while (arrayList2.size() <= i14) {
                            arrayList2.add(null);
                        }
                        fragmentN.setMenuVisibility(false);
                        arrayList2.set(i14, fragmentN);
                    }
                }
            }
        }
    }

    @Override // fe.a
    public Parcelable saveState() {
        Bundle bundle;
        ArrayList<Fragment.m> arrayList = this.f7219d;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[arrayList.size()];
            arrayList.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        int i14 = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.f7220e;
            if (i14 >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = arrayList2.get(i14);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f7216a.e0(bundle, am.j.h(i14, "f"), fragment);
            }
            i14++;
        }
    }

    @Override // fe.a
    public void setPrimaryItem(ViewGroup viewGroup, int i14, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f7221f;
        if (fragment != fragment2) {
            v vVar = this.f7216a;
            int i15 = this.f7217b;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i15 == 1) {
                    if (this.f7218c == null) {
                        this.f7218c = androidx.core.view.j.b(vVar, vVar);
                    }
                    this.f7218c.p(this.f7221f, androidx.lifecycle.b0.b.STARTED);
                } else {
                    this.f7221f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i15 == 1) {
                if (this.f7218c == null) {
                    this.f7218c = androidx.core.view.j.b(vVar, vVar);
                }
                this.f7218c.p(fragment, androidx.lifecycle.b0.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f7221f = fragment;
        }
    }

    @Override // fe.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        kg.f.o("ViewPager with adapter ", this, " requires a view id");
    }

    @Deprecated
    public e0(v vVar) {
        this(vVar, 0);
    }
}
