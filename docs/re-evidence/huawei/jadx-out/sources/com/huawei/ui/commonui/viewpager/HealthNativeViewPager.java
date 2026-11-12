package com.huawei.ui.commonui.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthNativeViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24033c;
    private boolean d;
    private boolean e;
    private ViewPager.OnPageChangeListener f;
    private boolean g;
    private int j;

    public HealthNativeViewPager(Context context) {
        super(context);
        this.f24033c = 0;
        this.e = false;
        this.f24031a = false;
        this.g = true;
    }

    public HealthNativeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24033c = 0;
        this.e = false;
        this.f24031a = false;
        this.g = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthNativeViewPager);
            this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthNativeViewPager_isAutoMaxHeight, false);
            this.j = typedArrayObtainStyledAttributes.getInteger(R.styleable.HealthNativeViewPager_slideDuration, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        d(context, this.j);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        if (this.f24031a) {
            super.onMeasure(i, c(i, i2));
            return;
        }
        PagerAdapter adapter = getAdapter();
        if (this.d && (adapter instanceof FragmentStatePagerAdapter)) {
            FragmentStatePagerAdapter fragmentStatePagerAdapter = (FragmentStatePagerAdapter) adapter;
            int count = getAdapter().getCount();
            int i5 = this.f24032b;
            if (count > i5) {
                View view = fragmentStatePagerAdapter.getItem(i5).getView();
                if (view == null) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f24033c, 1073741824));
                    return;
                } else {
                    view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    this.f24033c = view.getMeasuredHeight();
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(this.f24033c, 1073741824);
        } else {
            setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        }
        super.onMeasure(i, i2);
    }

    private int c(int i, int i2) {
        int currentItem = getCurrentItem();
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return i2;
        }
        Object objInstantiateItem = adapter.instantiateItem((ViewGroup) this, currentItem);
        int measuredHeight = 0;
        if (objInstantiateItem instanceof View) {
            View view = (View) objInstantiateItem;
            view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = view.getMeasuredHeight();
            adapter.destroyItem((ViewGroup) this, currentItem, objInstantiateItem);
        }
        return View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
    }

    public void setSlideDuration(int i) {
        this.j = i;
    }

    public void setIsAutoMaxHeight(boolean z) {
        this.e = z;
    }

    public void setInitItem(int i) {
        ReflectionUtils.c(this, "mCurItem", Integer.valueOf(i));
    }

    public void setIsAutoCurrentItemHeight(boolean z) {
        this.f24031a = z;
    }

    public void setIsScroll(boolean z) {
        this.g = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.a("R_HealthNativeViewPager", "onInterceptTouchEvent:", ExceptionUtils.c(e));
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (action >= motionEvent.getPointerCount()) {
            ReleaseLogUtil.e("R_HealthNativeViewPager", "pointerIndex out of range: ", Integer.valueOf(action), " (pointerCount: ", Integer.valueOf(motionEvent.getPointerCount()), Constants.RIGHT_BRACKET_ONLY);
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setIsAutoAdjustItemHeight(boolean z) {
        this.d = z;
        if (this.f == null) {
            this.f = new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.commonui.viewpager.HealthNativeViewPager.4
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    HealthNativeViewPager.this.e(i);
                }
            };
        }
        removeOnPageChangeListener(this.f);
        addOnPageChangeListener(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.f24032b = i;
        if (getAdapter() == null) {
            LogUtil.d("HealthNativeViewPager", "adapter is null in resetHeight");
        } else {
            if (i >= getAdapter().getCount() || !(getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            layoutParams.height = this.f24033c;
            setLayoutParams(layoutParams);
        }
    }

    private void d(Context context, int i) {
        if (context == null || i <= 0) {
            return;
        }
        b bVar = new b(context);
        bVar.e(i);
        ReflectionUtils.c(this, "mScroller", bVar);
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class b extends Scroller {
        private int e;

        private b(Context context) {
            super(context);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            startScroll(i, i2, i3, i4, this.e);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i) {
            this.e = i;
        }
    }
}
