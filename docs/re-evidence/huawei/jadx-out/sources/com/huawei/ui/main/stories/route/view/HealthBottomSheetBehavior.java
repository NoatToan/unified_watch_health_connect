package com.huawei.ui.main.stories.route.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.huawei.ui.main.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public class HealthBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f28789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f28790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28791c;
    private BottomSheetCallback d;
    private final ViewDragHelper.Callback e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private float m;
    private boolean n;
    private int o;
    private int p;
    private ViewDragHelper q;
    private WeakReference<View> r;
    private int s;
    private int t;
    private final OverScroller u;
    private WeakReference<V> w;
    private boolean y;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public HealthBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = 4;
        this.e = new ViewDragHelper.Callback() { // from class: com.huawei.ui.main.stories.route.view.HealthBottomSheetBehavior.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                if (HealthBottomSheetBehavior.this.p == 1 || HealthBottomSheetBehavior.this.n) {
                    return false;
                }
                return ((HealthBottomSheetBehavior.this.p == 3 && HealthBottomSheetBehavior.this.s == i && (view2 = (View) HealthBottomSheetBehavior.this.r.get()) != null && view2.canScrollVertically(-1)) || HealthBottomSheetBehavior.this.w == null || HealthBottomSheetBehavior.this.w.get() != view) ? false : true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                HealthBottomSheetBehavior.this.d(i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    HealthBottomSheetBehavior.this.e(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                int top;
                if (f2 != 0.0f) {
                    HealthBottomSheetBehavior.this.u.fling(view.getLeft(), view.getTop(), 0, (int) f2, 0, 0, HealthBottomSheetBehavior.this.f28790b, HealthBottomSheetBehavior.this.f28789a);
                    top = HealthBottomSheetBehavior.this.u.getFinalY();
                } else {
                    top = view.getTop();
                }
                if (HealthBottomSheetBehavior.this.q.settleCapturedViewAt(view.getLeft(), top)) {
                    HealthBottomSheetBehavior.this.e(2);
                    ViewCompat.postOnAnimation(view, new e(view, 2));
                } else {
                    HealthBottomSheetBehavior.this.e(2);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, HealthBottomSheetBehavior.this.f28790b, HealthBottomSheetBehavior.this.f ? HealthBottomSheetBehavior.this.o : HealthBottomSheetBehavior.this.f28789a);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                if (HealthBottomSheetBehavior.this.f) {
                    i = HealthBottomSheetBehavior.this.o;
                    i2 = HealthBottomSheetBehavior.this.f28790b;
                } else {
                    i = HealthBottomSheetBehavior.this.f28789a;
                    i2 = HealthBottomSheetBehavior.this.f28790b;
                }
                return i - i2;
            }
        };
        this.u = new OverScroller(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            c(typedValuePeekValue.data);
        } else {
            c(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        a(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        d(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.m = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SaveState(super.onSaveInstanceState(coordinatorLayout, v), this.p);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SaveState saveState = (SaveState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, saveState.getSuperState());
        if (saveState.state == 1 || saveState.state == 2) {
            this.p = 4;
        } else {
            this.p = saveState.state;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            ViewCompat.setFitsSystemWindows(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.o = coordinatorLayout.getHeight();
        if (this.y && this.l == 0) {
            this.l = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
        }
        this.f28790b = Math.max(0, this.o - v.getHeight());
        this.f28789a = (coordinatorLayout.getHeight() * 7) / 10;
        if (this.i == 0) {
            this.i = coordinatorLayout.getHeight() / 2;
        }
        int i2 = this.p;
        if (i2 == 3) {
            ViewCompat.offsetTopAndBottom(v, this.f28790b);
        } else if (this.f && i2 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.o);
        } else if (i2 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.i);
        } else if (i2 == 1 || i2 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        if (this.q == null) {
            this.q = ViewDragHelper.create(coordinatorLayout, this.e);
        }
        this.w = new WeakReference<>(v);
        this.r = new WeakReference<>(a(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.h = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s = -1;
        }
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f28791c = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.r;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.f28791c)) {
                this.s = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.n = true;
            }
            this.h = this.s == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.f28791c);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.n = false;
            this.s = -1;
            if (this.h) {
                this.h = false;
                return false;
            }
        }
        if (!this.h && this.q.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        View view2 = this.r.get();
        return (actionMasked != 2 || view2 == null || this.h || this.p == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f28791c) - motionEvent.getY()) <= ((float) this.q.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.p == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.q;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.s = -1;
        }
        if (actionMasked == 2 && !this.h && Math.abs(this.f28791c - motionEvent.getY()) > this.q.getTouchSlop()) {
            this.q.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.k = 0;
        this.g = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.r.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.f28790b;
            if (i3 < i4) {
                int i5 = top - i4;
                iArr[1] = i5;
                ViewCompat.offsetTopAndBottom(v, -i5);
                e(3);
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                e(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f28789a;
            if (i3 <= i6 || this.f) {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                e(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                ViewCompat.offsetTopAndBottom(v, -i7);
                e(4);
            }
        }
        d(v.getTop());
        this.k = i2;
        this.g = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (v.getTop() == this.f28790b) {
            e(3);
            return;
        }
        WeakReference<View> weakReference = this.r;
        if (weakReference != null && view == weakReference.get() && this.g) {
            if (this.q.smoothSlideViewTo(v, v.getLeft(), v.getTop() - this.k)) {
                e(2);
                ViewCompat.postOnAnimation(v, new e(v, 2));
            } else {
                e(2);
            }
            this.g = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.r.get()) {
            return this.p != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    public final void c(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (this.y) {
                return;
            } else {
                this.y = true;
            }
        } else {
            if (!this.y && this.t == i) {
                return;
            }
            this.y = false;
            this.t = Math.max(0, i);
            this.f28789a = this.o - i;
        }
        if (this.p != 4 || (weakReference = this.w) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void d(boolean z) {
        this.j = z;
    }

    void e(int i) {
        BottomSheetCallback bottomSheetCallback;
        if (this.p == i) {
            return;
        }
        this.p = i;
        V v = this.w.get();
        if (v == null || (bottomSheetCallback = this.d) == null) {
            return;
        }
        bottomSheetCallback.onStateChanged(v, i);
    }

    View a(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewA = a(viewGroup.getChildAt(i));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        BottomSheetCallback bottomSheetCallback;
        V v = this.w.get();
        if (v == null || (bottomSheetCallback = this.d) == null) {
            return;
        }
        int i2 = this.f28789a;
        if (i > i2) {
            bottomSheetCallback.onSlide(v, (i2 - i) / (this.o - i2));
        } else {
            bottomSheetCallback.onSlide(v, (i2 - i) / (i2 - this.f28790b));
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28793b;
        private final View d;

        e(View view, int i) {
            this.d = view;
            this.f28793b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HealthBottomSheetBehavior.this.q != null && HealthBottomSheetBehavior.this.q.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.d, this);
            } else {
                HealthBottomSheetBehavior.this.e(this.f28793b);
            }
        }
    }

    protected static class SaveState extends AbsSavedState {
        public static final Parcelable.Creator<SaveState> CREATOR = new Parcelable.ClassLoaderCreator<SaveState>() { // from class: com.huawei.ui.main.stories.route.view.HealthBottomSheetBehavior.SaveState.4
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SaveState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SaveState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public SaveState createFromParcel(Parcel parcel) {
                return new SaveState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SaveState[] newArray(int i) {
                return new SaveState[i];
            }
        };
        final int state;

        public SaveState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SaveState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }
}
