package miuix.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ScrollingView;
import androidx.core.view.c;
import defpackage.ajg;
import defpackage.alb;
import defpackage.bjg;
import defpackage.e08;
import defpackage.ejg;
import defpackage.gjg;
import defpackage.hjg;
import defpackage.m80;
import defpackage.mfh;
import defpackage.o80;
import defpackage.qc1;
import defpackage.yig;
import defpackage.zkb;
import java.util.ArrayList;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements gjg, bjg, ScrollingView, yig {
    public static final a C = new a();
    public static final int[] D = {R.attr.fillViewport};
    public boolean A;
    public zkb B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26621b;
    public final Rect c;
    public mfh d;
    public EdgeEffect e;
    public EdgeEffect f;
    public int g;
    public boolean h;
    public boolean i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26622k;
    public VelocityTracker l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26623r;
    public final int[] s;
    public final int[] t;
    public int u;
    public int v;
    public SavedState w;
    public final hjg x;
    public final ejg y;
    public float z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26624a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f26624a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26624a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f26624a = parcel.readInt();
        }
    }

    public static class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            o80.a(accessibilityEvent, nestedScrollView.getScrollX());
            o80.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            m80Var.i0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            m80Var.F0(true);
            if (nestedScrollView.getScrollY() > 0) {
                m80Var.b(m80.a.f25864r);
                m80Var.b(m80.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                m80Var.b(m80.a.q);
                m80Var.b(m80.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.H(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.H(0, iMin, true);
            return true;
        }
    }

    public interface b {
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public static int d(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private zkb getHapticFeedbackCompat() {
        if (this.B == null) {
            this.B = new zkb(getContext());
        }
        return this.B;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    private void i() {
        this.f26622k = false;
        A();
        J(0);
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f.onRelease();
        }
    }

    public static boolean u(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && u((View) parent, view2);
    }

    private void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f26623r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i);
            this.f26623r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void A() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void B(boolean z) {
        if (z) {
            I(2, 1);
        } else {
            J(1);
        }
        this.v = getScrollY();
        qc1.a(this);
    }

    public final boolean C(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewL = l(z2, i2, i3);
        if (viewL == null) {
            viewL = this;
        }
        if (i2 < scrollY || i3 > i4) {
            h(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewL != findFocus()) {
            viewL.requestFocus(i);
        }
        return z;
    }

    public final void D(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int iE = e(this.c);
        if (iE != 0) {
            scrollBy(0, iE);
        }
    }

    public final boolean E(Rect rect, boolean z) {
        int iE = e(rect);
        boolean z2 = iE != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iE);
            } else {
                F(0, iE);
            }
        }
        return z2;
    }

    public final void F(int i, int i2) {
        G(i, i2, false);
    }

    public final void G(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f26621b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.v(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
            B(z);
        } else {
            if (!this.d.p()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.f26621b = AnimationUtils.currentAnimationTimeMillis();
    }

    public void H(int i, int i2, boolean z) {
        G(i - getScrollX(), i2 - getScrollY(), z);
    }

    public boolean I(int i, int i2) {
        return this.y.q(i, i2);
    }

    public void J(int i) {
        this.y.s(i);
    }

    public final void a() {
        this.d.a();
        J(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean b(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !v(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            h(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.c);
            h(e(this.c));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !t(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.d.p()) {
            return;
        }
        this.d.b();
        int iJ = this.d.j();
        int i = iJ - this.v;
        this.v = iJ;
        this.t[1] = 0;
        View viewFindViewById = getRootView().findViewById(R.id.content);
        for (ViewParent parent = getParent(); parent != null && ((!(parent instanceof ajg) || !((ajg) parent).a(this.d.g(), this.d.h())) && (!(parent instanceof ViewGroup) || parent != viewFindViewById)); parent = parent.getParent()) {
        }
        f(0, i, this.t, null, 1);
        int i2 = i - this.t[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            y(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr = this.t;
            iArr[1] = 0;
            g(0, scrollY2, 0, i3, this.s, 1, iArr);
            i2 = i3 - this.t[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                j();
                if (i2 < 0) {
                    if (this.e.isFinished()) {
                        this.e.onAbsorb((int) this.d.f());
                    }
                } else if (this.f.isFinished()) {
                    this.f.onAbsorb((int) this.d.f());
                }
            }
            a();
        }
        if (!this.d.p()) {
            qc1.a(this);
            return;
        }
        J(1);
        if (this.A) {
            return;
        }
        if (HapticCompat.c("2.0")) {
            getHapticFeedbackCompat().c(201);
        } else {
            HapticCompat.performHapticFeedback(this, alb.q);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.y.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.y.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return f(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft();
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    qc1.a(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f.setSize(width2, height2);
            if (this.f.draw(canvas)) {
                qc1.a(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.y.d(i, i2, iArr, iArr2, i3);
    }

    public void g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.y.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final void h(int i) {
        if (i != 0) {
            if (this.n) {
                F(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return o(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.y.m();
    }

    public final void j() {
        if (getOverScrollMode() == 2) {
            this.e = null;
            this.f = null;
        } else if (this.e == null) {
            Context context = getContext();
            this.e = new EdgeEffect(context);
            this.f = new EdgeEffect(context);
        }
    }

    public boolean k(KeyEvent keyEvent) {
        this.c.setEmpty();
        if (!c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : n(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : n(130);
        }
        if (keyCode != 62) {
            return false;
        }
        z(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    public final View l(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void m(int i) {
        if (getChildCount() > 0) {
            this.A = !canScrollVertically(i > 0 ? 1 : -1);
            this.d.d(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            B(true);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.c;
        return C(i, rect3.top, rect3.bottom);
    }

    public boolean o(int i) {
        return this.y.l(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    @Override // defpackage.yig
    public void onContentInsetChanged(Rect rect) {
        setClipToPadding(false);
        setPadding(getPaddingLeft(), Math.max(rect.top, this.f26620a), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26620a = getPaddingTop();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f26622k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f26622k) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            if (p((int) motionEvent.getX(), y)) {
                this.g = y;
                this.f26623r = motionEvent.getPointerId(0);
                q();
                this.l.addMovement(motionEvent);
                this.d.b();
                this.f26622k = !this.d.p();
                I(2, 0);
            } else {
                this.f26622k = false;
                A();
            }
        } else if (i == 1) {
            this.f26622k = false;
            this.f26623r = -1;
            A();
            if (this.d.u(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                qc1.a(this);
            }
            J(0);
        } else if (i == 2) {
            int i2 = this.f26623r;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(i2);
                    sb.append(" in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.g) > this.o && (2 & getNestedScrollAxes()) == 0) {
                        this.f26622k = true;
                        this.g = y2;
                        s();
                        this.l.addMovement(motionEvent);
                        this.u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f26622k = false;
            this.f26623r = -1;
            A();
            if (this.d.u(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                qc1.a(this);
            }
            J(0);
        } else if (i == 6) {
            x(motionEvent);
        }
        return this.f26622k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.h = false;
        View view = this.j;
        if (view != null && u(view, this)) {
            D(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.f26624a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iD = d(scrollY, paddingTop, measuredHeight);
            if (iD != scrollY) {
                scrollTo(getScrollX(), iD);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // defpackage.fjg
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        f(i, i2, iArr, null, i3);
    }

    @Override // defpackage.gjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        w(i4, i5, iArr);
    }

    @Override // defpackage.fjg
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.x.c(view, view2, i, i2);
        I(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || t(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f26624a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !u(viewFindFocus, this) || !v(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.c);
        h(e(this.c));
    }

    @Override // defpackage.fjg
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // defpackage.fjg
    public void onStopNestedScroll(View view, int i) {
        this.x.e(view, i);
        J(i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        s();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f26623r);
                if (Math.abs(yVelocity) >= this.p) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m(i);
                    }
                } else if (this.d.u(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    qc1.a(this);
                }
                this.f26623r = -1;
                i();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f26623r);
                if (iFindPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f26623r);
                    sb.append(" in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.g - y;
                    if (!this.f26622k && Math.abs(i2) > this.o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f26622k = true;
                        i2 = i2 > 0 ? i2 - this.o : i2 + this.o;
                    }
                    int i3 = i2;
                    if (this.f26622k) {
                        if (f(0, i3, this.t, this.s, 0)) {
                            i3 -= this.t[1];
                            this.u += this.s[1];
                        }
                        int i4 = i3;
                        this.g = y - this.s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (y(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !o(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.t;
                        iArr[1] = 0;
                        g(0, scrollY2, 0, i4 - scrollY2, this.s, 0, iArr);
                        int i5 = this.g;
                        int i6 = this.s[1];
                        this.g = i5 - i6;
                        this.u += i6;
                        if (z) {
                            int i7 = i4 - this.t[1];
                            j();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                e08.c(this.e, i7 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f.isFinished()) {
                                    this.f.onRelease();
                                }
                            } else if (i8 > scrollRange) {
                                e08.c(this.f, i7 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.e.isFinished()) {
                                    this.e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f.isFinished())) {
                                qc1.a(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f26622k && getChildCount() > 0 && this.d.u(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    qc1.a(this);
                }
                this.f26623r = -1;
                i();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent.getY(actionIndex);
                this.f26623r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                x(motionEvent);
                this.g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f26623r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.d.p();
            this.f26622k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.p()) {
                a();
            }
            this.g = (int) motionEvent.getY();
            this.f26623r = motionEvent.getPointerId(0);
            I(2, 0);
        }
        VelocityTracker velocityTracker2 = this.l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public final void q() {
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            this.l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void r() {
        this.d = new mfh(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.j = view2;
        } else {
            D(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return E(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            A();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final void s() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iD = d(i, width, width2);
            int iD2 = d(i2, height, height2);
            if (iD == getScrollX() && iD2 == getScrollY()) {
                return;
            }
            super.scrollTo(iD, iD2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.y.n(z);
    }

    public void setOnScrollChangeListener(b bVar) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return I(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        J(0);
    }

    public final boolean t(View view) {
        return !v(view, 0, getHeight());
    }

    public final boolean v(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    public final void w(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public boolean y(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !o(1)) {
            this.d.u(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    public boolean z(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.c.top = getScrollY() - height;
            Rect rect2 = this.c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return C(i, i2, i3);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // defpackage.fjg
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        w(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.f26622k = false;
        this.n = true;
        this.f26623r = -1;
        this.s = new int[2];
        this.t = new int[2];
        r();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.x = new hjg(this);
        this.y = new ejg(this);
        setNestedScrollingEnabled(true);
        c.r0(this, C);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        w(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
