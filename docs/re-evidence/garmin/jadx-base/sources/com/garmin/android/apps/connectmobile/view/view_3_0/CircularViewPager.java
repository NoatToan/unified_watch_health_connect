package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.view.GCMCustomViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class CircularViewPager extends GCMCustomViewPager {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public b f47725h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public fe.a f47726i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f47727j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f47728k1;

    public class a implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager.j f47729a;

        public a(ViewPager.j jVar) {
            this.f47729a = jVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
            this.f47729a.onPageScrollStateChanged(i14);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            this.f47729a.onPageScrolled(i14 % CircularViewPager.this.f47725h1.f47731a.getCount(), f14, i15);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            this.f47729a.onPageSelected(i14 % CircularViewPager.this.f47725h1.f47731a.getCount());
        }
    }

    public class b extends fe.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fe.a f47731a;

        public b(CircularViewPager circularViewPager, fe.a aVar) {
            this.f47731a = aVar;
        }

        @Override // fe.a
        public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
            fe.a aVar = this.f47731a;
            aVar.destroyItem(viewGroup, i14 % aVar.getCount(), obj);
        }

        @Override // fe.a
        public final void finishUpdate(ViewGroup viewGroup) {
            this.f47731a.finishUpdate(viewGroup);
        }

        @Override // fe.a
        public final int getCount() {
            return this.f47731a.getCount() == 0 ? 0 : Integer.MAX_VALUE;
        }

        @Override // fe.a
        public final int getItemPosition(Object obj) {
            return this.f47731a.getItemPosition(obj);
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            fe.a aVar = this.f47731a;
            return aVar.getPageTitle(i14 % aVar.getCount());
        }

        @Override // fe.a
        public final float getPageWidth(int i14) {
            return this.f47731a.getPageWidth(i14);
        }

        @Override // fe.a
        public final Object instantiateItem(ViewGroup viewGroup, int i14) {
            fe.a aVar = this.f47731a;
            return aVar.instantiateItem(viewGroup, i14 % aVar.getCount());
        }

        @Override // fe.a
        public final boolean isViewFromObject(View view2, Object obj) {
            return this.f47731a.isViewFromObject(view2, obj);
        }

        @Override // fe.a
        public final void notifyDataSetChanged() {
            this.f47731a.notifyDataSetChanged();
        }

        @Override // fe.a
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f47731a.registerDataSetObserver(dataSetObserver);
        }

        @Override // fe.a
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f47731a.restoreState(parcelable, classLoader);
        }

        @Override // fe.a
        public final Parcelable saveState() {
            return this.f47731a.saveState();
        }

        @Override // fe.a
        public final void setPrimaryItem(ViewGroup viewGroup, int i14, Object obj) {
            this.f47731a.setPrimaryItem(viewGroup, i14, obj);
        }

        @Override // fe.a
        public final void startUpdate(ViewGroup viewGroup) {
            this.f47731a.startUpdate(viewGroup);
        }

        @Override // fe.a
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f47731a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public CircularViewPager(Context context) {
        super(context);
        this.f47728k1 = 3;
    }

    private int getOffsetAmount() {
        if (this.f47725h1.getCount() == 0) {
            return 0;
        }
        return this.f47725h1.f47731a.getCount() * 100;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void C(int i14, boolean z14) {
        if (this.f47727j1 <= this.f47728k1) {
            super.C(i14, z14);
        } else if (this.f47725h1.getCount() == 0) {
            super.C(i14, z14);
        } else {
            super.C((i14 % this.f47725h1.getCount()) + getOffsetAmount(), z14);
        }
    }

    public final void G() {
        super.C(super.getCurrentItem() + 1, false);
    }

    public final void H() {
        super.C(super.getCurrentItem() - 1, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void c(ViewPager.j jVar) {
        if (this.f47727j1 > this.f47728k1) {
            super.c(new a(jVar));
        } else {
            super.c(jVar);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public fe.a getAdapter() {
        return this.f47726i1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        if (this.f47727j1 > this.f47728k1 && this.f47725h1.getCount() != 0) {
            return super.getCurrentItem() % this.f47725h1.f47731a.getCount();
        }
        return super.getCurrentItem();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(fe.a aVar) {
        this.f47726i1 = aVar;
        int count = aVar.getCount();
        this.f47727j1 = count;
        if (count <= this.f47728k1) {
            super.setAdapter(aVar);
            return;
        }
        b bVar = new b(this, aVar);
        this.f47725h1 = bVar;
        super.setAdapter(bVar);
        setCurrentItem(0);
    }

    public void setCircularPageCountLimit(int i14) {
        this.f47728k1 = i14;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i14) {
        C(i14, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.j jVar) {
        c(jVar);
    }

    public CircularViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47728k1 = 3;
    }
}
