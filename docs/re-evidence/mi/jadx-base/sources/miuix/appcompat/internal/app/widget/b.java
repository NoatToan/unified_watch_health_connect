package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.OriginalViewPager;
import defpackage.ewq;
import defpackage.j77;
import defpackage.q56;
import defpackage.vsi;
import defpackage.wc0;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.springback.view.SpringBackLayout;
import miuix.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionBarImpl f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f26475b;
    public SpringBackLayout c;
    public View d;
    public j77 e;
    public ArrayList<wc0.a> f;
    public ActionBar.d g = new a();
    public c h;
    public ObjectAnimator i;

    public class a implements ActionBar.d {
        public a() {
        }

        @Override // androidx.appcompat.app.ActionBar.d
        public void a(ActionBar.c cVar, k kVar) {
            int count = b.this.e.getCount();
            for (int i = 0; i < count; i++) {
                if (b.this.e.f(i) == cVar) {
                    b.this.f26475b.J(i, cVar instanceof ActionBarImpl.h ? ((ActionBarImpl.h) cVar).h : true);
                    return;
                }
            }
        }

        @Override // androidx.appcompat.app.ActionBar.d
        public void b(ActionBar.c cVar, k kVar) {
        }

        @Override // androidx.appcompat.app.ActionBar.d
        public void c(ActionBar.c cVar, k kVar) {
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.b$b, reason: collision with other inner class name */
    public class C1028b implements OriginalViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f26477a = new d(null);

        public C1028b() {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.i
        public void onPageScrollStateChanged(int i) {
            if (b.this.f != null) {
                Iterator it = b.this.f.iterator();
                while (it.hasNext()) {
                    ((wc0.a) it.next()).onPageScrollStateChanged(i);
                }
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.i
        public void onPageScrolled(int i, float f, int i2) {
            this.f26477a.d(i, f);
            if (this.f26477a.c || b.this.f == null) {
                return;
            }
            boolean zG = b.this.e.g(this.f26477a.e);
            boolean zG2 = b.this.e.g(this.f26477a.f);
            if (b.this.e.h()) {
                i = b.this.e.q(i);
                if (!this.f26477a.d) {
                    i--;
                    f = 1.0f - f;
                }
            }
            Iterator it = b.this.f.iterator();
            while (it.hasNext()) {
                ((wc0.a) it.next()).onPageScrolled(i, f, zG, zG2);
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.i
        public void onPageSelected(int i) {
            int iQ = b.this.e.q(i);
            b.this.f26474a.setSelectedNavigationItem(iQ);
            b.this.e.setPrimaryItem((ViewGroup) b.this.f26475b, i, (Object) b.this.e.e(i, false, false));
            if (b.this.f != null) {
                Iterator it = b.this.f.iterator();
                while (it.hasNext()) {
                    ((wc0.a) it.next()).onPageSelected(iQ);
                }
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26480b;

        public c() {
        }

        public void a(int i, boolean z) {
            this.f26479a = i;
            this.f26480b = z;
        }
    }

    public b(ActionBarImpl actionBarImpl, FragmentManager fragmentManager, Lifecycle lifecycle, boolean z) {
        this.f26474a = actionBarImpl;
        ActionBarOverlayLayout actionBarOverlayLayout = actionBarImpl.getActionBarOverlayLayout();
        Context context = actionBarOverlayLayout.getContext();
        View viewFindViewById = actionBarOverlayLayout.findViewById(vsi.s0);
        if (viewFindViewById instanceof ViewPager) {
            this.f26475b = (ViewPager) viewFindViewById;
        } else {
            ViewPager viewPager = new ViewPager(context);
            this.f26475b = viewPager;
            viewPager.setId(vsi.s0);
            SpringBackLayout springBackLayout = new SpringBackLayout(context);
            this.c = springBackLayout;
            springBackLayout.setScrollOrientation(5);
            springBackLayout.addView(this.f26475b, new OriginalViewPager.LayoutParams());
            springBackLayout.setTarget(this.f26475b);
            springBackLayout.setSpringBackEnable(this.f26475b.O());
            ((ViewGroup) actionBarOverlayLayout.findViewById(R.id.content)).addView(springBackLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        j77 j77Var = new j77(context, fragmentManager);
        this.e = j77Var;
        this.f26475b.setAdapter(j77Var);
        this.f26475b.addOnPageChangeListener(new C1028b());
        if (z && q56.a()) {
            g(new ewq(this.f26475b, this.e));
        }
    }

    public int e(String str, ActionBar.c cVar, int i, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        ((ActionBarImpl.h) cVar).k(this.g);
        this.f26474a.internalAddTab(cVar, i);
        int iA = this.e.a(str, i, cls, bundle, cVar, z);
        if (this.e.h()) {
            this.f26475b.setCurrentItem(this.e.getCount() - 1);
        }
        return iA;
    }

    public int f(String str, ActionBar.c cVar, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        ((ActionBarImpl.h) cVar).k(this.g);
        this.f26474a.internalAddTab(cVar);
        int iB = this.e.b(str, cls, bundle, cVar, z);
        if (this.e.h()) {
            this.f26475b.setCurrentItem(this.e.getCount() - 1);
        }
        return iB;
    }

    public void g(wc0.a aVar) {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.f.add(aVar);
    }

    public Fragment h(int i) {
        return this.e.d(i, true);
    }

    public int i() {
        return this.e.getCount();
    }

    public int j() {
        return this.f26475b.getOffscreenPageLimit();
    }

    public void k() {
        this.f26474a.internalRemoveAllTabs();
        this.e.i();
    }

    public void l(Fragment fragment) {
        int iL = this.e.l(fragment);
        if (iL >= 0) {
            this.f26474a.internalRemoveTabAt(iL);
        }
    }

    public void m(int i) {
        this.e.m(i);
        this.f26474a.internalRemoveTabAt(i);
    }

    public void n(ActionBar.c cVar) {
        this.f26474a.internalRemoveTab(cVar);
        this.e.k(cVar);
    }

    public void o(String str) {
        int iC = this.e.c(str);
        if (iC >= 0) {
            m(iC);
        }
    }

    public void p(wc0.a aVar) {
        ArrayList<wc0.a> arrayList = this.f;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    public void q(String str, int i, Class<? extends Fragment> cls, Bundle bundle, boolean z) {
        this.f26474a.updateTab(i);
        this.e.o(str, i, cls, bundle, this.f26474a.getTabAt(i), z);
    }

    public void r(int i, boolean z) {
        this.e.p(i, z);
        if (i == this.f26475b.getCurrentItem()) {
            if (this.h == null) {
                c cVar = new c();
                this.h = cVar;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cVar, "Value", 0.0f, 1.0f);
                this.i = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(q56.a() ? this.f26475b.getContext().getResources().getInteger(R.integer.config_shortAnimTime) : 0L);
            }
            this.h.a(i, z);
            this.i.start();
        }
    }

    public void s(View view) {
        View view2 = this.d;
        if (view2 != null) {
            this.f26475b.removeView(view2);
        }
        if (view != null) {
            this.d = view;
            OriginalViewPager.LayoutParams layoutParams = new OriginalViewPager.LayoutParams();
            layoutParams.f3101a = true;
            this.f26475b.addView(this.d, -1, layoutParams);
        }
    }

    public void t(boolean z) {
        this.f26475b.setDraggable(z);
        SpringBackLayout springBackLayout = this.c;
        if (springBackLayout != null) {
            springBackLayout.setSpringBackEnable(z);
        }
    }

    public void u(int i) {
        this.f26475b.setOffscreenPageLimit(i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f26482b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;

        public d() {
            this.f26481a = -1;
        }

        public final void a(int i, float f) {
            this.c = false;
            boolean z = f > this.f26482b;
            this.e = z ? i : i + 1;
            if (z) {
                i++;
            }
            this.f = i;
        }

        public final void b() {
            this.e = this.f;
            this.f26481a = -1;
            this.f26482b = 0.0f;
            this.d = true;
        }

        public final void c(int i, float f) {
            this.f26481a = i;
            this.f26482b = f;
            this.c = true;
            this.d = false;
        }

        public void d(int i, float f) {
            if (f < 1.0E-4f) {
                b();
            } else if (this.f26481a != i) {
                c(i, f);
            } else if (this.c) {
                a(i, f);
            }
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
