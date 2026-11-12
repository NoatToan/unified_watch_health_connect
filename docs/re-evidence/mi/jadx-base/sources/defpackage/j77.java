package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j77 extends eih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentManager f22481b;
    public ArrayList<a> c = new ArrayList<>();
    public k d = null;
    public Fragment e = null;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f22482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Class<? extends Fragment> f22483b;
        public Fragment c = null;
        public Bundle d;
        public ActionBar.c e;
        public boolean f;

        public a(String str, Class<? extends Fragment> cls, Bundle bundle, ActionBar.c cVar, boolean z) {
            this.f22482a = str;
            this.f22483b = cls;
            this.d = bundle;
            this.e = cVar;
            this.f = z;
        }
    }

    public j77(Context context, FragmentManager fragmentManager) {
        this.f22480a = context;
        this.f22481b = fragmentManager;
    }

    public int a(String str, int i, Class<? extends Fragment> cls, Bundle bundle, ActionBar.c cVar, boolean z) {
        a aVar = new a(str, cls, bundle, cVar, z);
        if (!h()) {
            this.c.add(i, aVar);
        } else if (i >= this.c.size()) {
            this.c.add(0, aVar);
        } else {
            this.c.add(q(i) + 1, aVar);
        }
        notifyDataSetChanged();
        return i;
    }

    public int b(String str, Class<? extends Fragment> cls, Bundle bundle, ActionBar.c cVar, boolean z) {
        if (h()) {
            this.c.add(0, new a(str, cls, bundle, cVar, z));
        } else {
            this.c.add(new a(str, cls, bundle, cVar, z));
        }
        notifyDataSetChanged();
        return this.c.size() - 1;
    }

    public int c(String str) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i).f22482a.equals(str)) {
                return q(i);
            }
        }
        return -1;
    }

    public Fragment d(int i, boolean z) {
        return e(i, z, true);
    }

    @Override // defpackage.eih
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.d == null) {
            this.d = this.f22481b.o();
        }
        this.d.q((Fragment) obj);
    }

    public Fragment e(int i, boolean z, boolean z2) {
        Class<? extends Fragment> cls;
        if (this.c.isEmpty() || i < 0 || i > this.c.size() - 1) {
            return null;
        }
        ArrayList<a> arrayList = this.c;
        if (z2) {
            i = q(i);
        }
        a aVar = arrayList.get(i);
        if (aVar.c == null) {
            Fragment fragmentL0 = this.f22481b.l0(aVar.f22482a);
            aVar.c = fragmentL0;
            if (fragmentL0 == null && z && (cls = aVar.f22483b) != null) {
                aVar.c = Fragment.instantiate(this.f22480a, cls.getName(), aVar.d);
                aVar.f22483b = null;
                aVar.d = null;
            }
        }
        return aVar.c;
    }

    public ActionBar.c f(int i) {
        return this.c.get(i).e;
    }

    @Override // defpackage.eih
    public void finishUpdate(ViewGroup viewGroup) {
        k kVar = this.d;
        if (kVar != null) {
            kVar.m();
            this.d = null;
            this.f22481b.g0();
        }
    }

    public boolean g(int i) {
        if (i < 0 || i >= this.c.size()) {
            return false;
        }
        return this.c.get(i).f;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.c.size();
    }

    @Override // defpackage.eih
    public int getItemPosition(Object obj) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (obj == this.c.get(i).c) {
                return i;
            }
        }
        return -2;
    }

    public boolean h() {
        return this.f22480a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public void i() {
        j();
        this.c.clear();
        this.e = null;
        notifyDataSetChanged();
    }

    @Override // defpackage.eih
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.f22481b.o();
        }
        Fragment fragmentE = e(i, true, false);
        if (fragmentE.getFragmentManager() != null) {
            this.d.k(fragmentE);
        } else {
            this.d.c(viewGroup.getId(), fragmentE, this.c.get(i).f22482a);
        }
        if (fragmentE != this.e) {
            fragmentE.setMenuVisibility(false);
            fragmentE.setUserVisibleHint(false);
        }
        return fragmentE;
    }

    @Override // defpackage.eih
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public final void j() {
        k kVarO = this.f22481b.o();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            kVarO.v(d(i, false));
        }
        kVarO.m();
        this.f22481b.g0();
    }

    public int k(ActionBar.c cVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.c.get(i);
            if (aVar.e == cVar) {
                n(aVar.c);
                this.c.remove(i);
                if (this.e == aVar.c) {
                    this.e = null;
                }
                notifyDataSetChanged();
                return q(i);
            }
        }
        return -1;
    }

    public int l(Fragment fragment) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (e(i, false, false) == fragment) {
                n(fragment);
                this.c.remove(i);
                if (this.e == fragment) {
                    this.e = null;
                }
                notifyDataSetChanged();
                return q(i);
            }
        }
        return -1;
    }

    public void m(int i) {
        n(d(i, false));
        this.c.remove(q(i));
        notifyDataSetChanged();
    }

    public final void n(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.getFragmentManager()) == null) {
            return;
        }
        k kVarO = fragmentManager.o();
        kVarO.v(fragment);
        kVarO.m();
        fragmentManager.g0();
    }

    public void o(String str, int i, Class<? extends Fragment> cls, Bundle bundle, ActionBar.c cVar, boolean z) {
        n(d(i, false));
        this.c.remove(q(i));
        a aVar = new a(str, cls, bundle, cVar, z);
        if (!h()) {
            this.c.add(i, aVar);
        } else if (i >= this.c.size()) {
            this.c.add(0, aVar);
        } else {
            this.c.add(q(i) + 1, aVar);
        }
        notifyDataSetChanged();
    }

    public void p(int i, boolean z) {
        a aVar = this.c.get(q(i));
        if (aVar.f != z) {
            aVar.f = z;
            notifyDataSetChanged();
        }
    }

    public int q(int i) {
        if (!h()) {
            return i;
        }
        int size = this.c.size() - 1;
        if (size > i) {
            return size - i;
        }
        return 0;
    }

    @Override // defpackage.eih
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.e = fragment;
        }
    }

    @Override // defpackage.eih
    public void startUpdate(ViewGroup viewGroup) {
    }
}
