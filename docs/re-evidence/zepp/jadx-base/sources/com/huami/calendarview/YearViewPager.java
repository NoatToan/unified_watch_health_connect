package com.huami.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes6.dex */
public final class YearViewPager extends ViewPager {
    public static final /* synthetic */ boolean e = false;
    private int a;
    private boolean b;
    private c c;
    private YearRecyclerView.b d;

    public class a extends PagerAdapter {
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return YearViewPager.this.a;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            if (YearViewPager.this.b) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            YearRecyclerView yearRecyclerView = new YearRecyclerView(YearViewPager.this.getContext());
            viewGroup.addView(yearRecyclerView);
            yearRecyclerView.setup(YearViewPager.this.c);
            yearRecyclerView.setOnMonthSelectedListener(YearViewPager.this.d);
            yearRecyclerView.d(i + YearViewPager.this.c.z());
            return yearRecyclerView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }
    }

    public YearViewPager(Context context) {
        this(context, null);
    }

    private static int e(Context context, View view) {
        int height = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        view.getLocationOnScreen(iArr);
        return height - iArr[1];
    }

    public void f() {
        this.a = (this.c.u() - this.c.z()) + 1;
        if (getAdapter() != null) {
            getAdapter().notifyDataSetChanged();
        }
    }

    public void g(int i, boolean z) {
        setCurrentItem(i - this.c.z(), z);
    }

    public final void h() {
        for (int i = 0; i < getChildCount(); i++) {
            ((YearRecyclerView) getChildAt(i)).e();
        }
    }

    public final void i() {
        this.b = true;
        f();
        this.b = false;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            ((YearRecyclerView) getChildAt(i)).f();
        }
    }

    public final void k() {
        for (int i = 0; i < getChildCount(); i++) {
            YearRecyclerView yearRecyclerView = (YearRecyclerView) getChildAt(i);
            yearRecyclerView.g();
            yearRecyclerView.e();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c.v0() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(e(getContext(), this), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.v0() && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, false);
    }

    public final void setOnMonthSelectedListener(YearRecyclerView.b bVar) {
        this.d = bVar;
    }

    public void setup(c cVar) {
        this.c = cVar;
        this.a = (cVar.u() - this.c.z()) + 1;
        setAdapter(new a());
        setCurrentItem(this.c.j().getYear() - this.c.z());
    }

    public YearViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, false);
        }
    }
}
