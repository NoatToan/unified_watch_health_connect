package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabLayout f8863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f8864b;
    public final boolean c;
    public final boolean d;
    public final InterfaceC0219b e;
    public RecyclerView.Adapter<?> f;
    public boolean g;
    public c h;
    public TabLayout.d i;
    public RecyclerView.i j;

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i, int i2) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i, int i2, int i3) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i, int i2) {
            b.this.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i, int i2, Object obj) {
            b.this.b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.b$b, reason: collision with other inner class name */
    public interface InterfaceC0219b {
        void a(TabLayout.g gVar, int i);
    }

    public static class c extends ViewPager2.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f8866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8867b;
        public int c;

        public c(TabLayout tabLayout) {
            this.f8866a = new WeakReference<>(tabLayout);
            a();
        }

        public void a() {
            this.c = 0;
            this.f8867b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i) {
            this.f8867b = this.c;
            this.c = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f8866a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                tabLayout.J(i, f, i3 != 2 || this.f8867b == 1, (i3 == 2 && this.f8867b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f8866a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.G(tabLayout.x(i), i2 == 0 || (i2 == 2 && this.f8867b == 0));
        }
    }

    public static class d implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager2 f8868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8869b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.f8868a = viewPager2;
            this.f8869b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g gVar) {
            this.f8868a.k(gVar.g(), this.f8869b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g gVar) {
        }
    }

    public b(TabLayout tabLayout, ViewPager2 viewPager2, InterfaceC0219b interfaceC0219b) {
        this(tabLayout, viewPager2, true, interfaceC0219b);
    }

    public void a() {
        if (this.g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.f8864b.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.g = true;
        c cVar = new c(this.f8863a);
        this.h = cVar;
        this.f8864b.h(cVar);
        d dVar = new d(this.f8864b, this.d);
        this.i = dVar;
        this.f8863a.addOnTabSelectedListener((TabLayout.d) dVar);
        if (this.c) {
            a aVar = new a();
            this.j = aVar;
            this.f.registerAdapterDataObserver(aVar);
        }
        b();
        this.f8863a.I(this.f8864b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        this.f8863a.D();
        RecyclerView.Adapter<?> adapter = this.f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.g gVarA = this.f8863a.A();
                this.e.a(gVarA, i);
                this.f8863a.f(gVarA, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f8864b.getCurrentItem(), this.f8863a.getTabCount() - 1);
                if (iMin != this.f8863a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f8863a;
                    tabLayout.F(tabLayout.x(iMin));
                }
            }
        }
    }

    public b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, InterfaceC0219b interfaceC0219b) {
        this(tabLayout, viewPager2, z, true, interfaceC0219b);
    }

    public b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, InterfaceC0219b interfaceC0219b) {
        this.f8863a = tabLayout;
        this.f8864b = viewPager2;
        this.c = z;
        this.d = z2;
        this.e = interfaceC0219b;
    }
}
