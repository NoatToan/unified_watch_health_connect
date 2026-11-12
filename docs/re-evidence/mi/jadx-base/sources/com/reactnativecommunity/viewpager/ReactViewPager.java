package com.reactnativecommunity.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.aih;
import defpackage.cm8;
import defpackage.eih;
import defpackage.pd8;
import defpackage.phg;
import defpackage.whh;
import defpackage.yhh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ReactViewPager extends ViewPager {
    public final pd8 j0;
    public boolean k0;
    public boolean l0;
    public final Runnable m0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactViewPager reactViewPager = ReactViewPager.this;
            reactViewPager.measure(View.MeasureSpec.makeMeasureSpec(reactViewPager.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactViewPager.this.getHeight(), 1073741824));
            ReactViewPager reactViewPager2 = ReactViewPager.this;
            reactViewPager2.layout(reactViewPager2.getLeft(), ReactViewPager.this.getTop(), ReactViewPager.this.getRight(), ReactViewPager.this.getBottom());
        }
    }

    public class c implements ViewPager.i {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i) {
            String str;
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported pageScrollState");
                }
                str = "settling";
            }
            ReactViewPager.this.j0.dispatchEvent(new yhh(ReactViewPager.this.getId(), str));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i, float f, int i2) {
            ReactViewPager.this.j0.dispatchEvent(new whh(ReactViewPager.this.getId(), i, f));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i) {
            if (ReactViewPager.this.k0) {
                return;
            }
            ReactViewPager.this.j0.dispatchEvent(new aih(ReactViewPager.this.getId(), i));
        }

        public /* synthetic */ c(ReactViewPager reactViewPager, a aVar) {
            this();
        }
    }

    public ReactViewPager(ReactContext reactContext) {
        super(reactContext);
        this.l0 = true;
        this.m0 = new a();
        this.j0 = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.k0 = false;
        a aVar = null;
        setOnPageChangeListener(new c(this, aVar));
        setAdapter(new b(this, aVar));
    }

    public void V(View view, int i) {
        getAdapter().a(view, i);
    }

    public View W(int i) {
        return getAdapter().b(i);
    }

    public void X(int i) {
        getAdapter().c(i);
    }

    public void Y(int i, boolean z) {
        this.k0 = true;
        L(i, z);
        this.j0.dispatchEvent(new aih(getId(), i));
        this.k0 = false;
    }

    public int getViewCountInAdapter() {
        return getAdapter().getCount();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.m0);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.l0) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                phg.a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            cm8.D("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l0) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            cm8.D("ReactNative", "Error handling touch event.", e);
            return false;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.l0 = z;
    }

    public void setViews(List<View> list) {
        getAdapter().d(list);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public b getAdapter() {
        return (b) super.getAdapter();
    }

    public class b extends eih {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<View> f10537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10538b;

        public b() {
            this.f10537a = new ArrayList();
            this.f10538b = false;
        }

        public void a(View view, int i) {
            this.f10537a.add(i, view);
            notifyDataSetChanged();
        }

        public View b(int i) {
            return this.f10537a.get(i);
        }

        public void c(int i) {
            this.f10537a.remove(i);
            notifyDataSetChanged();
        }

        public void d(List<View> list) {
            this.f10537a.clear();
            this.f10537a.addAll(list);
            notifyDataSetChanged();
            this.f10538b = false;
        }

        @Override // defpackage.eih
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // defpackage.eih
        public int getCount() {
            return this.f10537a.size();
        }

        @Override // defpackage.eih
        public int getItemPosition(Object obj) {
            if (this.f10538b || !this.f10537a.contains(obj)) {
                return -2;
            }
            return this.f10537a.indexOf(obj);
        }

        @Override // defpackage.eih
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = this.f10537a.get(i);
            viewGroup.addView(view, 0, ReactViewPager.this.generateDefaultLayoutParams());
            ReactViewPager reactViewPager = ReactViewPager.this;
            reactViewPager.post(reactViewPager.m0);
            return view;
        }

        @Override // defpackage.eih
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ b(ReactViewPager reactViewPager, a aVar) {
            this();
        }
    }
}
