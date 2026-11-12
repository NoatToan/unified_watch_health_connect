package com.fitness.banner.export.newbieguide.core;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fitness.banner.export.newbieguide.core.GuideLayout;
import com.fitness.banner.export.newbieguide.lifecycle.V4ListenerFragment;
import com.fitness.banner.export.newbieguide.storage.NewbieGuidePreference;
import defpackage.e63;
import defpackage.e9a;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FragmentActivity f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f7743b;
    public String c;
    public boolean d;
    public int e;
    public List<com.fitness.banner.export.newbieguide.model.a> f;
    public int g;
    public GuideLayout h;
    public FrameLayout i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7744k;
    public int l;

    /* JADX INFO: renamed from: com.fitness.banner.export.newbieguide.core.a$a, reason: collision with other inner class name */
    public class C0181a extends e9a {
        public C0181a() {
        }

        @Override // defpackage.d9a
        public void onDestroyView() {
            a.this.f();
        }
    }

    public a(e63 e63Var) {
        this.j = -1;
        FragmentActivity fragmentActivity = e63Var.f16302a;
        this.f7742a = fragmentActivity;
        this.f7743b = e63Var.f16303b;
        this.c = e63Var.c;
        this.d = e63Var.d;
        this.f = e63Var.g;
        this.e = e63Var.f;
        this.l = e63Var.h;
        View viewFindViewById = e63Var.e;
        viewFindViewById = viewFindViewById == null ? fragmentActivity.findViewById(R.id.content) : viewFindViewById;
        if (viewFindViewById instanceof FrameLayout) {
            this.i = (FrameLayout) viewFindViewById;
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f7742a);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        this.j = viewGroup.indexOfChild(viewFindViewById);
        viewGroup.removeView(viewFindViewById);
        int i = this.j;
        if (i >= 0) {
            viewGroup.addView(frameLayout, i, viewFindViewById.getLayoutParams());
        } else {
            viewGroup.addView(frameLayout, viewFindViewById.getLayoutParams());
        }
        frameLayout.addView(viewFindViewById, new ViewGroup.LayoutParams(-1, -1));
        this.i = frameLayout;
    }

    public final void c() {
        Fragment fragment = this.f7743b;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        FragmentManager childFragmentManager = this.f7743b.getChildFragmentManager();
        V4ListenerFragment v4ListenerFragment = (V4ListenerFragment) childFragmentManager.l0("listener_fragment");
        if (v4ListenerFragment == null) {
            v4ListenerFragment = new V4ListenerFragment();
            childFragmentManager.o().f(v4ListenerFragment, "listener_fragment").m();
        }
        v4ListenerFragment.s(new C0181a());
    }

    public final /* synthetic */ void d() {
        List<com.fitness.banner.export.newbieguide.model.a> list = this.f;
        if (list == null || list.size() == 0) {
            throw new IllegalStateException("there is no guide to show!! Please add at least one Page.");
        }
        this.g = 0;
        i();
        c();
    }

    public final /* synthetic */ void e(GuideLayout guideLayout) {
        j();
    }

    public void f() {
        GuideLayout guideLayout = this.h;
        if (guideLayout != null && guideLayout.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.h.getParent();
            viewGroup.removeView(this.h);
            if (!(viewGroup instanceof FrameLayout)) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                View childAt = viewGroup.getChildAt(0);
                viewGroup.removeAllViews();
                if (childAt != null) {
                    int i = this.j;
                    if (i > 0) {
                        viewGroup2.addView(childAt, i, viewGroup.getLayoutParams());
                    } else {
                        viewGroup2.addView(childAt, viewGroup.getLayoutParams());
                    }
                }
            }
            this.h = null;
        }
        this.f7744k = false;
    }

    public final void g() {
        Fragment fragment = this.f7743b;
        if (fragment != null) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            V4ListenerFragment v4ListenerFragment = (V4ListenerFragment) childFragmentManager.l0("listener_fragment");
            if (v4ListenerFragment != null) {
                childFragmentManager.o().v(v4ListenerFragment).m();
            }
        }
    }

    public void h() {
        int device_tab_show_count;
        int i = this.l;
        if (i == 0) {
            device_tab_show_count = NewbieGuidePreference.INSTANCE.getHEALTH_TAB_SHOW_COUNT();
        } else if (i == 1) {
            device_tab_show_count = NewbieGuidePreference.INSTANCE.getSPORT_TAB_SHOW_COUNT();
        } else {
            device_tab_show_count = i == 2 ? NewbieGuidePreference.INSTANCE.getDEVICE_TAB_SHOW_COUNT() : 0;
        }
        if ((this.d || device_tab_show_count < this.e) && !this.f7744k) {
            this.f7744k = true;
            this.i.post(new Runnable() { // from class: sj4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33700a.d();
                }
            });
            NewbieGuidePreference.INSTANCE.setShowCount(this.l, device_tab_show_count + 1);
        }
    }

    public final void i() {
        GuideLayout guideLayout = new GuideLayout(this.f7742a, this.f.get(this.g), this);
        guideLayout.setOnGuideLayoutDismissListener(new GuideLayout.d() { // from class: tj4
            @Override // com.fitness.banner.export.newbieguide.core.GuideLayout.d
            public final void a(GuideLayout guideLayout2) {
                this.f34757a.e(guideLayout2);
            }
        });
        this.i.addView(guideLayout, new FrameLayout.LayoutParams(-1, -1));
        this.h = guideLayout;
        this.f7744k = true;
    }

    public final void j() {
        if (this.g < this.f.size() - 1) {
            this.g++;
            i();
        } else {
            g();
            this.f7744k = false;
        }
    }
}
