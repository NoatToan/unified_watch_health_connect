package com.huawei.ui.homehealth.device.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.util.NestScrollHelper;

/* JADX INFO: loaded from: classes17.dex */
public class NestedDeviceScrollView extends ScrollView implements NestedScrollingParent3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NestedScrollingParentHelper f25348c;
    private ScrollViewListener d;
    private final GestureDetector e;

    public interface ScrollViewListener {
        void onScrollChanged(ScrollView scrollView, int i, int i2, int i3, int i4);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public NestedDeviceScrollView(Context context) {
        this(context, null);
    }

    public NestedDeviceScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedDeviceScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25346a = false;
        this.f25347b = false;
        this.e = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: com.huawei.ui.homehealth.device.view.NestedDeviceScrollView.5
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                LogUtil.d("NestedDeviceScrollView", "GestureDetector onFling：", Float.valueOf(f2));
                if (!NestedDeviceScrollView.this.f25347b) {
                    return false;
                }
                NestedDeviceScrollView.this.d((int) (-f2));
                return false;
            }
        });
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        NestedWebView nestedWebViewD = d(this);
        if (nestedWebViewD != null) {
            nestedWebViewD.c();
        }
        super.stopNestedScroll();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1) {
            this.f25346a = false;
        } else if (action == 2) {
            this.f25346a = true;
        } else if (action == 3) {
            this.f25346a = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ScrollViewListener scrollViewListener = this.d;
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, i, i2, i3, i4);
        }
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.d = scrollViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        NestScrollHelper nestScrollHelper = new NestScrollHelper(getContext());
        double dC = nestScrollHelper.c(i);
        final NestedWebView nestedWebViewD = d(this);
        if (nestedWebViewD != null) {
            double height = (getHeight() - nestedWebViewD.getHeight()) - getScrollY();
            if (dC <= height || i <= 0) {
                return;
            }
            double dA = nestScrollHelper.a(i);
            final double dC2 = nestScrollHelper.c(dC - height);
            postDelayed(new Runnable() { // from class: rvk
                @Override // java.lang.Runnable
                public final void run() {
                    nestedWebViewD.a((int) Math.abs(dC2));
                }
            }, (int) (dA - nestScrollHelper.a(dC2)));
        }
    }

    private NestedWebView d(ViewGroup viewGroup) {
        NestedWebView nestedWebViewD;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof NestedWebView) {
                return (NestedWebView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (nestedWebViewD = d((ViewGroup) childAt)) != null) {
                return nestedWebViewD;
            }
        }
        return null;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.e;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public NestedScrollingParentHelper getParentHelper() {
        if (this.f25348c == null) {
            this.f25348c = new NestedScrollingParentHelper(this);
        }
        return this.f25348c;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i2 > 0) {
            c(i2, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(i4, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        c(i4, null);
    }

    private void c(int i, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY();
        if (iArr != null) {
            iArr[1] = iArr[1] + (scrollY2 - scrollY);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        fling((int) f2);
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        getParentHelper().onNestedScrollAccepted(view, view2, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        getParentHelper().onNestedScrollAccepted(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        getParentHelper().onStopNestedScroll(view, i);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        getParentHelper().onStopNestedScroll(view);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        if (this.f25346a) {
            return super.getNestedScrollAxes();
        }
        return getParentHelper().getNestedScrollAxes();
    }

    public void setHasNest(boolean z) {
        this.f25347b = z;
    }
}
