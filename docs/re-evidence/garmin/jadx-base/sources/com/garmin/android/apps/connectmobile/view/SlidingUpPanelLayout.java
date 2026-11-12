package com.garmin.android.apps.connectmobile.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.i2;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public class SlidingUpPanelLayout extends ViewGroup {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f47518y = {R.attr.gravity};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f47524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f47525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f47526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f47527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f47528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f47533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f47534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f47535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f47536r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f47537t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.customview.widget.c f47538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f47540x;

    public interface c {
        void onPanelAnchored(View view2);

        void onPanelCollapsed(View view2);

        void onPanelExpanded(View view2);
    }

    public enum e {
        EXPANDED,
        COLLAPSED,
        ANCHORED
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet, int i14) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i14);
        this.f47519a = -1;
        this.f47520b = -1;
        int i15 = 0;
        this.f47523e = false;
        this.f47527i = e.COLLAPSED;
        this.f47536r = 0.0f;
        this.f47539w = true;
        this.f47540x = new Rect();
        if (isInEditMode()) {
            this.f47533o = 0;
            this.f47538v = null;
            return;
        }
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f47518y)) != null) {
            int i16 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i16 != 48 && i16 != 80) {
                h.s("gravity must be set to either top or bottom");
                throw null;
            }
            this.f47521c = i16 == 80;
            typedArrayObtainStyledAttributes.recycle();
        }
        float f14 = context.getResources().getDisplayMetrics().density;
        if (this.f47519a == -1) {
            this.f47519a = (int) ((f14 * 0.0f) + 0.5f);
        }
        this.f47520b = (int) (0.0f * f14);
        setWillNotDraw(false);
        androidx.customview.widget.c cVarI = androidx.customview.widget.c.i(this, 0.5f, new a(this, i15));
        this.f47538v = cVarI;
        cVarI.f6643n = f14 * 400.0f;
        this.f47522d = true;
        this.f47531m = true;
        this.f47533o = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static void b(SlidingUpPanelLayout slidingUpPanelLayout, int i14) {
        int slidingTop = slidingUpPanelLayout.getSlidingTop();
        slidingUpPanelLayout.f47528j = (slidingUpPanelLayout.f47521c ? i14 - slidingTop : slidingTop - i14) / slidingUpPanelLayout.f47529k;
        if (slidingUpPanelLayout.f47520b > 0) {
            slidingUpPanelLayout.f47526h.setTranslationY(slidingUpPanelLayout.getCurrentParalaxOffset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSlidingTop() {
        int measuredHeight;
        int paddingBottom;
        if (this.f47525g == null) {
            measuredHeight = getMeasuredHeight();
            paddingBottom = getPaddingBottom();
        } else {
            if (!this.f47521c) {
                return getPaddingTop();
            }
            measuredHeight = getMeasuredHeight() - getPaddingBottom();
            paddingBottom = this.f47525g.getMeasuredHeight();
        }
        return measuredHeight - paddingBottom;
    }

    public final void c() {
        if ((getChildCount() < 2 || getChildAt(1).getVisibility() != 0) && getChildCount() >= 2) {
            getChildAt(1).setVisibility(0);
            requestLayout();
        }
        if (this.f47539w) {
            return;
        }
        e(0.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (isInEditMode()) {
            return;
        }
        androidx.customview.widget.c cVar = this.f47538v;
        if (cVar.h()) {
            if (!this.f47522d) {
                cVar.a();
            } else {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d(int i14, int i15) {
        int i16;
        View view2 = this.f47524f;
        if (view2 == null) {
            view2 = this.f47525g;
        }
        if (view2 == null) {
            return false;
        }
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i17 = iArr2[0] + i14;
        int i18 = iArr2[1] + i15;
        int i19 = iArr[0];
        return i17 >= i19 && i17 < view2.getWidth() + i19 && i18 >= (i16 = iArr[1]) && i18 < view2.getHeight() + i16;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view2, long j8) {
        b bVar = (b) view2.getLayoutParams();
        int iSave = canvas.save();
        if (this.f47522d && !bVar.f47543a && this.f47525g != null && !this.f47523e) {
            Rect rect = this.f47540x;
            canvas.getClipBounds(rect);
            if (this.f47521c) {
                rect.bottom = Math.min(rect.bottom, this.f47525g.getTop());
            } else {
                rect.top = Math.max(rect.top, this.f47525g.getBottom());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view2, j8);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final boolean e(float f14) {
        if (this.f47522d) {
            float slidingTop = getSlidingTop();
            float f15 = f14 * this.f47529k;
            int i14 = this.f47521c ? (int) (f15 + slidingTop) : (int) (slidingTop - f15);
            View view2 = this.f47525g;
            if (this.f47538v.u(view2, view2.getLeft(), i14)) {
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int left;
        int right;
        int top;
        int bottom;
        Drawable background;
        if (getChildCount() == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        View view2 = this.f47525g;
        int i14 = 0;
        if (view2 == null || (background = view2.getBackground()) == null || background.getOpacity() != -1) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = this.f47525g.getLeft();
            right = this.f47525g.getRight();
            top = this.f47525g.getTop();
            bottom = this.f47525g.getBottom();
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(paddingLeft, childAt.getLeft());
        int iMax2 = Math.max(paddingTop, childAt.getTop());
        int iMin = Math.min(width, childAt.getRight());
        int iMin2 = Math.min(height, childAt.getBottom());
        if (iMax >= left && iMax2 >= top && iMin <= right && iMin2 <= bottom) {
            i14 = 4;
        }
        childAt.setVisibility(i14);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public int getCurrentParalaxOffset() {
        int i14 = (int) ((1.0f - this.f47528j) * this.f47520b);
        return this.f47521c ? -i14 : i14;
    }

    public int getPanelHeight() {
        return this.f47519a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47539w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47539w = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z14 = this.f47522d;
        androidx.customview.widget.c cVar = this.f47538v;
        if (!z14 || !this.f47531m || (this.f47530l && actionMasked != 0)) {
            cVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            cVar.b();
            return false;
        }
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f47530l = false;
            this.f47534p = x14;
            this.f47535q = y14;
            d((int) x14, (int) y14);
        } else if (actionMasked == 2) {
            float fAbs = Math.abs(x14 - this.f47534p);
            float fAbs2 = Math.abs(y14 - this.f47535q);
            int i14 = cVar.f6631b;
            if (this.f47532n) {
                float f14 = this.f47533o;
                if (fAbs > f14 && fAbs2 < f14) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                if (fAbs2 > f14) {
                    d((int) x14, (int) y14);
                }
            }
            if ((fAbs2 > i14 && fAbs > fAbs2) || !d((int) x14, (int) y14)) {
                cVar.b();
                this.f47530l = true;
                return false;
            }
        }
        return cVar.t(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int i18;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int slidingTop = getSlidingTop();
        int childCount = getChildCount();
        if (this.f47539w) {
            int iOrdinal = this.f47527i.ordinal();
            if (iOrdinal == 0) {
                this.f47528j = this.f47522d ? 0.0f : 1.0f;
            } else if (iOrdinal != 2) {
                this.f47528j = 1.0f;
            } else {
                this.f47528j = this.f47522d ? this.f47536r : 1.0f;
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                boolean z15 = bVar.f47543a;
                if (z15) {
                    this.f47529k = measuredHeight - this.f47519a;
                }
                if (this.f47521c) {
                    i18 = z15 ? ((int) (this.f47529k * this.f47528j)) + slidingTop : paddingTop;
                } else {
                    int i24 = z15 ? slidingTop - ((int) (this.f47529k * this.f47528j)) : paddingTop;
                    i18 = (z15 || this.f47523e) ? i24 : this.f47519a + i24;
                }
                childAt.layout(paddingLeft, i18, childAt.getMeasuredWidth() + paddingLeft, measuredHeight + i18);
            }
        }
        if (this.f47539w) {
            f();
        }
        this.f47539w = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        if (mode != 1073741824) {
            h.z("Width must have an exact value or MATCH_PARENT");
            return;
        }
        if (mode2 != 1073741824) {
            h.z("Height must have an exact value or MATCH_PARENT");
            return;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i17 = this.f47519a;
        int childCount = getChildCount();
        int i18 = 8;
        int i19 = 0;
        if (childCount > 2) {
            i2.i("SlidingUpPanelLayout", "onMeasure: More than two child views are not supported.");
        } else if (getChildAt(1).getVisibility() == 8) {
            i17 = 0;
        }
        this.f47525g = null;
        this.f47522d = false;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            b bVar = (b) childAt.getLayoutParams();
            if (childAt.getVisibility() == i18) {
                bVar.getClass();
            } else {
                if (i19 == 1) {
                    bVar.f47543a = true;
                    this.f47525g = childAt;
                    this.f47522d = true;
                    i16 = paddingTop;
                } else {
                    i16 = !this.f47523e ? paddingTop - i17 : paddingTop;
                    this.f47526h = childAt;
                }
                int i24 = ((ViewGroup.MarginLayoutParams) bVar).width;
                if (i24 == -2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                } else {
                    iMakeMeasureSpec = i24 == -1 ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                }
                int i25 = ((ViewGroup.MarginLayoutParams) bVar).height;
                if (i25 == -2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                } else {
                    iMakeMeasureSpec2 = i25 == -1 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            i19++;
            i18 = 8;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f47527i = dVar.f47544a;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f47544a = this.f47527i;
        return dVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        if (i15 != i17) {
            this.f47539w = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f47522d || !this.f47531m) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.customview.widget.c cVar = this.f47538v;
        cVar.m(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            this.f47534p = x14;
            this.f47535q = y14;
            return true;
        }
        if (action == 1) {
            float x15 = motionEvent.getX();
            float y15 = motionEvent.getY();
            float f14 = y15 - this.f47535q;
            int i14 = cVar.f6631b;
            if (f14 * f14 < i14 * i14 && d((int) x15, (int) y15)) {
                return false;
            }
        }
        return true;
    }

    public void setAnchorPoint(float f14) {
        if (f14 <= 0.0f || f14 >= 1.0f) {
            return;
        }
        this.f47536r = f14;
    }

    public void setDragView(View view2) {
        this.f47524f = view2;
    }

    public void setEnableDragViewTouchEvents(boolean z14) {
        this.f47532n = z14;
    }

    public void setOverlayed(boolean z14) {
        this.f47523e = z14;
    }

    public void setPanelHeight(int i14) {
        this.f47519a = i14;
        requestLayout();
    }

    public void setPanelSlideListener(c cVar) {
        this.f47537t = cVar;
    }

    public void setSlidingEnabled(boolean z14) {
        this.f47531m = z14;
    }

    public class a extends androidx.customview.widget.c.AbstractC0092c {
        private a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int clampViewPositionVertical(View view2, int i14, int i15) {
            int slidingTop;
            int i16;
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            if (slidingUpPanelLayout.f47521c) {
                slidingTop = slidingUpPanelLayout.getSlidingTop();
                i16 = slidingUpPanelLayout.f47529k + slidingTop;
            } else {
                int paddingTop = slidingUpPanelLayout.getPaddingTop();
                slidingTop = paddingTop - slidingUpPanelLayout.f47529k;
                i16 = paddingTop;
            }
            return Math.min(Math.max(i14, slidingTop), i16);
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final int getViewVerticalDragRange(View view2) {
            return SlidingUpPanelLayout.this.f47529k;
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewCaptured(View view2, int i14) {
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            int childCount = slidingUpPanelLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = slidingUpPanelLayout.getChildAt(i15);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewDragStateChanged(int i14) {
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            float f14 = slidingUpPanelLayout.f47536r;
            float f15 = slidingUpPanelLayout.f47529k;
            int i15 = (int) (f14 * f15);
            if (slidingUpPanelLayout.f47538v.f6630a == 0) {
                float f16 = slidingUpPanelLayout.f47528j;
                if (f16 == 0.0f) {
                    e eVar = slidingUpPanelLayout.f47527i;
                    e eVar2 = e.EXPANDED;
                    if (eVar != eVar2) {
                        slidingUpPanelLayout.f();
                        View view2 = slidingUpPanelLayout.f47525g;
                        c cVar = slidingUpPanelLayout.f47537t;
                        if (cVar != null) {
                            cVar.onPanelExpanded(view2);
                        }
                        slidingUpPanelLayout.sendAccessibilityEvent(32);
                        slidingUpPanelLayout.f47527i = eVar2;
                        return;
                    }
                    return;
                }
                float f17 = i15 / f15;
                e eVar3 = slidingUpPanelLayout.f47527i;
                if (f16 != f17) {
                    e eVar4 = e.COLLAPSED;
                    if (eVar3 != eVar4) {
                        View view3 = slidingUpPanelLayout.f47525g;
                        c cVar2 = slidingUpPanelLayout.f47537t;
                        if (cVar2 != null) {
                            cVar2.onPanelCollapsed(view3);
                        }
                        slidingUpPanelLayout.sendAccessibilityEvent(32);
                        slidingUpPanelLayout.f47527i = eVar4;
                        return;
                    }
                    return;
                }
                e eVar5 = e.ANCHORED;
                if (eVar3 != eVar5) {
                    slidingUpPanelLayout.f();
                    View view4 = slidingUpPanelLayout.f47525g;
                    c cVar3 = slidingUpPanelLayout.f47537t;
                    if (cVar3 != null) {
                        cVar3.onPanelAnchored(view4);
                    }
                    slidingUpPanelLayout.sendAccessibilityEvent(32);
                    slidingUpPanelLayout.f47527i = eVar5;
                }
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            SlidingUpPanelLayout.b(slidingUpPanelLayout, i15);
            slidingUpPanelLayout.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final void onViewReleased(View view2, float f14, float f15) {
            int i14;
            float f16;
            SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
            int slidingTop = slidingUpPanelLayout.f47521c ? slidingUpPanelLayout.getSlidingTop() : slidingUpPanelLayout.getSlidingTop() - slidingUpPanelLayout.f47529k;
            float f17 = slidingUpPanelLayout.f47536r;
            if (f17 != 0.0f) {
                if (slidingUpPanelLayout.f47521c) {
                    int i15 = slidingUpPanelLayout.f47529k;
                    f16 = ((int) (i15 * f17)) / i15;
                } else {
                    int i16 = slidingUpPanelLayout.f47519a;
                    int i17 = slidingUpPanelLayout.f47529k;
                    f16 = (i16 - (i16 - ((int) (i17 * f17)))) / i17;
                }
                if (f15 > 0.0f || (f15 == 0.0f && slidingUpPanelLayout.f47528j >= (f16 + 1.0f) / 2.0f)) {
                    i14 = slidingUpPanelLayout.f47529k;
                    slidingTop += i14;
                } else if (f15 == 0.0f) {
                    float f18 = slidingUpPanelLayout.f47528j;
                    if (f18 < (1.0f + f16) / 2.0f && f18 >= f16 / 2.0f) {
                        slidingTop = (int) ((slidingUpPanelLayout.f47529k * f17) + slidingTop);
                    }
                }
            } else if (f15 > 0.0f || (f15 == 0.0f && slidingUpPanelLayout.f47528j > 0.5f)) {
                i14 = slidingUpPanelLayout.f47529k;
                slidingTop += i14;
            }
            slidingUpPanelLayout.f47538v.s(view2.getLeft(), slidingTop);
            slidingUpPanelLayout.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0092c
        public final boolean tryCaptureView(View view2, int i14) {
            return !SlidingUpPanelLayout.this.f47530l && ((b) view2.getLayoutParams()).f47543a;
        }

        public /* synthetic */ a(SlidingUpPanelLayout slidingUpPanelLayout, int i14) {
            this();
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f47542b = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f47543a;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context.obtainStyledAttributes(attributeSet, f47542b).recycle();
        }

        public b(int i14, int i15) {
            super(i14, i15);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
        }

        public b() {
            super(-1, -1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f47544a;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel, 0);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        private d(Parcel parcel) {
            super(parcel);
            try {
                this.f47544a = (e) Enum.valueOf(e.class, parcel.readString());
            } catch (IllegalArgumentException unused) {
                this.f47544a = e.COLLAPSED;
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeString(this.f47544a.toString());
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public /* synthetic */ d(Parcel parcel, int i14) {
            this(parcel);
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingUpPanelLayout(Context context) {
        this(context, null);
    }
}
