package com.huawei.ui.commonui.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MotionEventCompat;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthViewPager extends HwViewPager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f24035c;
    private Context d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private float o;
    private int p;
    private float q;
    private OnViewPagerTouchEvent r;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnPageChangeListener extends HwViewPager.OnPageChangeListener {
    }

    public interface OnViewPagerTouchEvent {
        void onTouchDown(MotionEvent motionEvent);

        void onTouchUp(MotionEvent motionEvent);

        void setIsViewTouch(Boolean bool);
    }

    public interface PageTransformer extends HwViewPager.PageTransformer {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    public HealthViewPager(Context context) {
        super(context);
        this.f = true;
        this.m = true;
        this.k = true;
        this.l = false;
        this.h = false;
        this.g = false;
        this.i = false;
        this.f24035c = 0.0f;
        this.e = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.n = 0.0f;
        this.p = 0;
        this.j = 0;
        this.d = context;
    }

    public HealthViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        this.m = true;
        this.k = true;
        this.l = false;
        this.h = false;
        this.g = false;
        this.i = false;
        this.f24035c = 0.0f;
        this.e = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.n = 0.0f;
        this.p = 0;
        this.j = 0;
        this.d = context;
    }

    public void setIsScroll(boolean z) {
        this.f = z;
    }

    public void setIsScrollToLeft(boolean z) {
        this.m = z;
    }

    public void setIsScrollToRight(boolean z) {
        this.k = z;
    }

    public void setIsCompatibleScrollView(boolean z) {
        this.l = z;
    }

    public void setIsAutoHeight(boolean z) {
        this.h = z;
    }

    public void setIsAutoCurrentItemHeight(boolean z) {
        this.g = z;
    }

    public void setIsAutoWidthAndHeight(boolean z) {
        this.i = z;
    }

    public void setScrollHeightArea(int i) {
        this.j = qrs.d(this.d, i);
    }

    public void setOnViewPagerTouchEventListener(OnViewPagerTouchEvent onViewPagerTouchEvent) {
        this.r = onViewPagerTouchEvent;
    }

    public void setYScrollMoveThreshold(int i) {
        this.p = i;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight = 0;
        if (this.h) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > i3) {
                    i3 = measuredHeight2;
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        if (this.g) {
            int currentItem = getCurrentItem();
            HwPagerAdapter adapter = getAdapter();
            if (adapter == null) {
                return;
            }
            Object objInstantiateItem = adapter.instantiateItem(this, currentItem);
            if (objInstantiateItem instanceof View) {
                View view = (View) objInstantiateItem;
                view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = view.getMeasuredHeight();
                adapter.destroyItem(this, currentItem, objInstantiateItem);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            return;
        }
        if (this.i) {
            int iMax = 0;
            int iMax2 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt2 = getChildAt(i5);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt2.getMeasuredHeight());
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824));
            return;
        }
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        super.onMeasure(i, i2);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && this.f && motionEvent.getY() > this.j) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (action >= motionEvent.getPointerCount()) {
            ReleaseLogUtil.e("R_HealthViewPager", "pointerIndex out of range: ", Integer.valueOf(action), " (pointerCount: ", Integer.valueOf(motionEvent.getPointerCount()), Constants.RIGHT_BRACKET_ONLY);
            return false;
        }
        d(motionEvent);
        if (this.l) {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f24035c = motionEvent.getY();
                this.e = motionEvent.getX();
            } else if (action2 == 2) {
                this.o = motionEvent.getX();
                this.q = motionEvent.getY();
                if ((Math.abs(this.o - this.e) >= Math.abs(this.q - this.f24035c) && qrs.d(this.d, 180.0f) >= this.q) || qrs.d(this.d, 180.0f) < this.q || qrs.d(this.d, this.p) > Math.abs(this.o - this.e)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        if (!this.m && b(motionEvent)) {
            return true;
        }
        if (this.k || !e(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    private boolean b(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = motionEvent.getX();
        } else if (action == 2) {
            float x = motionEvent.getX() - this.n;
            boolean zBa = LanguageUtil.ba(getContext());
            if (!zBa && x < 0.0f) {
                return true;
            }
            if (zBa && x > 0.0f) {
                return true;
            }
        }
        return false;
    }

    private boolean e(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.n = motionEvent.getX();
        } else if (action == 2) {
            float x = motionEvent.getX() - this.n;
            boolean zBa = LanguageUtil.ba(getContext());
            if (!zBa && x > 0.0f) {
                return true;
            }
            if (zBa && x < 0.0f) {
                return true;
            }
        }
        return false;
    }

    private void d(MotionEvent motionEvent) {
        if (this.r == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.r.onTouchDown(motionEvent);
            return;
        }
        if (action == 1) {
            this.r.onTouchUp(motionEvent);
            return;
        }
        if (action != 2) {
            return;
        }
        this.o = motionEvent.getX();
        this.q = motionEvent.getY();
        if ((Math.abs(this.o - this.e) >= Math.abs(this.q - this.f24035c) && qrs.d(this.d, 180.0f) >= this.q) || qrs.d(this.d, 180.0f) < this.q || qrs.d(this.d, this.p) > Math.abs(this.o - this.e)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }
}
