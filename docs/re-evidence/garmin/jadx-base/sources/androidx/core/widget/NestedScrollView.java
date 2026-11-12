package androidx.core.widget;

import am.j;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.f;
import androidx.core.view.f0;
import androidx.core.view.g;
import androidx.core.view.l0;
import androidx.core.view.m0;
import androidx.core.view.s0;
import androidx.core.view.t;
import androidx.core.view.t0;
import androidx.core.view.v;
import androidx.core.view.x;
import androidx.core.view.y;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements x, t {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a I = new a();
    public static final int[] P = {R.attr.fillViewport};
    public final y A;
    public final v B;
    public float C;
    public d D;
    public final f E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f6601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f6602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f6603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f6604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f6608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f6610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6615r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6616t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f6617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f6618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f6621z;

    public static class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view2;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view2;
            fVar.n(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            fVar.s(true);
            if (nestedScrollView.getScrollY() > 0) {
                fVar.b(l7.f.a.f110572k);
                fVar.b(l7.f.a.f110576o);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                fVar.b(l7.f.a.f110571j);
                fVar.b(l7.f.a.f110578q);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006c  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089  */
        @Override // androidx.core.view.a
        public final boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
            int iMin;
            if (super.performAccessibilityAction(view2, i14, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view2;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i14 == 4096) {
                    iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.p(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                } else if (i14 == 8192 || i14 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.p(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                } else if (i14 == 16908346) {
                    iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.p(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class b {
        private b() {
        }

        public static void a(NestedScrollView nestedScrollView, float f14) {
            try {
                nestedScrollView.setFrameContentVelocity(f14);
            } catch (LinkageError unused) {
            }
        }
    }

    public class c implements g {
        public c() {
        }
    }

    public interface d {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f6600c = new Rect();
        this.f6606i = true;
        this.f6607j = false;
        this.f6608k = null;
        this.f6609l = false;
        this.f6612o = true;
        this.f6616t = -1;
        this.f6617v = new int[2];
        this.f6618w = new int[2];
        this.E = new f(getContext(), new c());
        int i15 = Build.VERSION.SDK_INT;
        this.f6602e = i15 >= 31 ? p7.c.a.a(context, attributeSet) : new EdgeEffect(context);
        this.f6603f = i15 >= 31 ? p7.c.a.a(context, attributeSet) : new EdgeEffect(context);
        this.f6598a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6601d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6613p = viewConfiguration.getScaledTouchSlop();
        this.f6614q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6615r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P, i14, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.A = new y(this);
        this.B = new v(this);
        setNestedScrollingEnabled(true);
        s0.r(this, I);
    }

    public static boolean g(View view2, NestedScrollView nestedScrollView) {
        if (view2 == nestedScrollView) {
            return true;
        }
        Object parent = view2.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, nestedScrollView);
    }

    private f0 getScrollFeedbackProvider() {
        if (this.f6604g == null) {
            this.f6604g = f0.a(this);
        }
        return this.f6604g;
    }

    public final boolean a(int i14) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view2 = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view2, i14);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !h(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i14 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i14 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i14 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            n(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f6600c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            n(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i14);
        }
        if (view2 != null && view2.isFocused() && !h(view2, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2) {
        if (getChildCount() <= 0) {
            super.addView(view2);
        } else {
            h.z("ScrollView can host only one direct child");
        }
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i15 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i14 - verticalFadingEdgeLength : i14;
        int i16 = rect.bottom;
        if (i16 > i15 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i15, (childAt.getBottom() + layoutParams.bottomMargin) - i14);
        }
        if (rect.top >= scrollY || i16 >= i15) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i15 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(int i14, int i15, int[] iArr, int[] iArr2, int i16) {
        return this.B.c(i14, i15, iArr, null, i16);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i14;
        int scrollRange;
        int i15;
        int overScrollMode;
        if (this.f6601d.isFinished()) {
            return;
        }
        this.f6601d.computeScrollOffset();
        int currY = this.f6601d.getCurrY();
        int i16 = currY - this.f6620y;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f6602e;
        EdgeEffect edgeEffect2 = this.f6603f;
        if (i16 <= 0 || p7.c.a(edgeEffect) == 0.0f) {
            if (i16 < 0 && p7.c.a(edgeEffect2) != 0.0f) {
                float f14 = height;
                iRound = Math.round(p7.c.b(edgeEffect2, (i16 * 4.0f) / f14, 0.5f) * (f14 / 4.0f));
                if (iRound != i16) {
                    edgeEffect2.finish();
                }
            }
            this.f6620y = currY;
            iArr = this.f6618w;
            iArr[1] = 0;
            c(0, i16, iArr, null, 1);
            i14 = i16 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f6601d.getCurrVelocity()));
            }
            if (i14 != 0) {
                int scrollY = getScrollY();
                k(i14, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i17 = i14 - scrollY2;
                iArr[1] = 0;
                i15 = 1;
                this.B.d(0, scrollY2, 0, i17, this.f6617v, 1, iArr);
                i14 = i17 - iArr[1];
            } else {
                i15 = 1;
            }
            if (i14 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i15 && scrollRange > 0)) {
                    if (i14 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f6601d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f6601d.getCurrVelocity());
                    }
                }
                this.f6601d.abortAnimation();
                stopNestedScroll(i15);
            }
            if (this.f6601d.isFinished()) {
                stopNestedScroll(i15);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(p7.c.b(edgeEffect, ((-i16) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i16) {
            edgeEffect.finish();
        }
        i16 -= iRound;
        this.f6620y = currY;
        iArr = this.f6618w;
        iArr[1] = 0;
        c(0, i16, iArr, null, 1);
        i14 = i16 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(this, Math.abs(this.f6601d.getCurrVelocity()));
        }
        if (i14 != 0) {
            int scrollY3 = getScrollY();
            k(i14, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i18 = i14 - scrollY4;
            iArr[1] = 0;
            i15 = 1;
            this.B.d(0, scrollY4, 0, i18, this.f6617v, 1, iArr);
            i14 = i18 - iArr[1];
        } else {
            i15 = 1;
        }
        if (i14 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i14 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f6601d.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f6601d.getCurrVelocity());
                }
            } else if (i14 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f6601d.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f6601d.getCurrVelocity());
            }
            this.f6601d.abortAnimation();
            stopNestedScroll(i15);
        }
        if (this.f6601d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            stopNestedScroll(i15);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
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
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean d(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f6600c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? f(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? f(130) : a(130);
                    }
                    if (keyCode == 62) {
                        l(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return f(33);
                    }
                    if (keyCode == 93) {
                        return f(130);
                    }
                    if (keyCode == 122) {
                        l(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        l(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f14, float f15, boolean z14) {
        return this.B.a(f14, f15, z14);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f14, float f15) {
        return this.B.b(f14, f15);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i14, int i15, int[] iArr, int[] iArr2) {
        return this.B.c(i14, i15, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i14, int i15, int i16, int i17, int[] iArr) {
        return this.B.d(i14, i15, i16, i17, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f6602e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f6603f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public void e(int i14) {
        if (getChildCount() > 0) {
            this.f6601d.fling(getScrollX(), getScrollY(), 0, i14, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.B.h(2, 1);
            this.f6620y = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.f6601d.getCurrVelocity()));
            }
        }
    }

    public final boolean f(int i14) {
        int childCount;
        boolean z14 = i14 == 130;
        int height = getHeight();
        Rect rect = this.f6600c;
        rect.top = 0;
        rect.bottom = height;
        if (z14 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i14, rect.top, rect.bottom);
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
        y yVar = this.A;
        return yVar.f6588b | yVar.f6587a;
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

    public float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                h.z("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.C;
    }

    public final boolean h(View view2, int i14, int i15) {
        Rect rect = this.f6600c;
        view2.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view2, rect);
        return rect.bottom + i14 >= getScrollY() && rect.top - i14 <= getScrollY() + i15;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.B.f(0);
    }

    public final void i(int i14, int i15, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i14);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.d(0, scrollY2, 0, i14 - scrollY2, null, i15, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.B.f6582d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6616t) {
            int i14 = actionIndex == 0 ? 1 : 0;
            this.f6605h = (int) motionEvent.getY(i14);
            this.f6616t = motionEvent.getPointerId(i14);
            VelocityTracker velocityTracker = this.f6610m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i14, int i15, int i16, int i17) {
        int i18;
        boolean z14;
        int i19;
        boolean z15;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i24 = i16 + i14;
        if (i15 <= 0 && i15 >= 0) {
            i18 = i15;
            z14 = false;
        } else {
            i18 = 0;
            z14 = true;
        }
        if (i24 <= i17) {
            if (i24 < 0) {
                i19 = 0;
            } else {
                i19 = i24;
                z15 = false;
            }
            if (z15 && !this.B.f(1)) {
                this.f6601d.springBack(i18, i19, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i18, i19);
            return !z14 || z15;
        }
        i19 = i17;
        z15 = true;
        if (z15) {
            this.f6601d.springBack(i18, i19, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i18, i19);
        if (z14) {
        }
    }

    public final void l(int i14) {
        boolean z14 = i14 == 130;
        int height = getHeight();
        Rect rect = this.f6600c;
        if (z14) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i15 = rect.top;
        int i16 = height + i15;
        rect.bottom = i16;
        m(i14, i15, i16);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean m(int i14, int i15, int i16) {
        boolean z14;
        int height = getHeight();
        int scrollY = getScrollY();
        int i17 = height + scrollY;
        boolean z15 = i14 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z16 = false;
        for (int i18 = 0; i18 < size; i18++) {
            View view3 = focusables.get(i18);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i15 < bottom && top < i16) {
                boolean z17 = i15 < top && bottom < i16;
                if (view2 == null) {
                    view2 = view3;
                    z16 = z17;
                } else {
                    boolean z18 = (z15 && top < view2.getTop()) || (!z15 && bottom > view2.getBottom());
                    if (z16) {
                        if (z17 && z18) {
                            view2 = view3;
                        }
                    } else if (z17) {
                        view2 = view3;
                        z16 = true;
                    } else if (z18) {
                        view2 = view3;
                    }
                }
            }
        }
        View view4 = view2 == null ? this : view2;
        if (i15 < scrollY || i16 > i17) {
            n(z15 ? i15 - scrollY : i16 - i17, -1, null, 0, 1, true);
            z14 = true;
        } else {
            z14 = false;
        }
        if (view4 != findFocus()) {
            view4.requestFocus(i14);
        }
        return z14;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view2, int i14, int i15) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        view2.measure(ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view2, int i14, int i15, int i16, int i17) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        view2.measure(ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i15, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int n(int i14, int i15, MotionEvent motionEvent, int i16, int i17, boolean z14) {
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        VelocityTracker velocityTracker;
        v vVar = this.B;
        if (i17 == 1) {
            vVar.h(2, i17);
        }
        boolean zC = this.B.c(0, i14, this.f6618w, this.f6617v, i17);
        int[] iArr = this.f6617v;
        int[] iArr2 = this.f6618w;
        if (zC) {
            i18 = i14 - iArr2[1];
            i19 = iArr[1];
        } else {
            i18 = i14;
            i19 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z17 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z14;
        boolean z18 = k(i18, 0, scrollY, scrollRange) && !vVar.f(i17);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f6444a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i15, scrollY2);
        }
        iArr2[1] = 0;
        this.B.d(0, scrollY2, 0, i18 - scrollY2, this.f6617v, i17, iArr2);
        int i24 = i19 + iArr[1];
        int i25 = i18 - iArr2[1];
        int i26 = scrollY + i25;
        EdgeEffect edgeEffect = this.f6603f;
        EdgeEffect edgeEffect2 = this.f6602e;
        if (i26 >= 0) {
            if (i26 > scrollRange && z17) {
                p7.c.b(edgeEffect, i25 / getHeight(), 1.0f - (i16 / getWidth()));
                if (motionEvent != null) {
                    z15 = false;
                    getScrollFeedbackProvider().f6444a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i15, false);
                } else {
                    z15 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z16 = z15;
            } else {
                z16 = z18;
            }
            if (z16 && i17 == 0 && (velocityTracker = this.f6610m) != null) {
                velocityTracker.clear();
            }
            if (i17 == 1) {
                stopNestedScroll(i17);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i24;
        }
        if (z17) {
            p7.c.b(edgeEffect2, (-i25) / getHeight(), i16 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f6444a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i15, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z15 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z16 = z15;
        } else {
            postInvalidateOnAnimation();
            z16 = z15;
        }
        if (z16) {
            velocityTracker.clear();
        }
        if (i17 == 1) {
            stopNestedScroll(i17);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i24;
    }

    public final boolean o(EdgeEffect edgeEffect, int i14) {
        if (i14 > 0) {
            return true;
        }
        float fA = p7.c.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i14) * 0.35f;
        float f14 = this.f6598a * 0.015f;
        double dLog = Math.log(fAbs / f14);
        double d14 = F;
        return ((float) (Math.exp((d14 / (d14 - 1.0d)) * dLog) * ((double) f14))) < fA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6607j = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02af  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f14;
        int i14;
        int width;
        int i15;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z14;
        float yVelocity;
        float f15;
        long j8;
        float f16;
        int i16;
        float fSqrt;
        int i17;
        float f17;
        if (motionEvent.getAction() != 8 || this.f6609l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i14 = 9;
            f14 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f14 = axisValue2;
            i14 = 26;
        } else {
            f14 = 0.0f;
            i14 = 0;
            width = 0;
        }
        if (f14 == 0.0f) {
            return false;
        }
        n(-((int) (getVerticalScrollFactorCompat() * f14)), i14, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i14 != 0) {
            f fVar = this.E;
            g gVar = fVar.f6435b;
            int[] iArr = fVar.f6443j;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i18 = 1;
            if (fVar.f6441h == source && fVar.f6442i == deviceId && fVar.f6440g == i14) {
                z14 = false;
                i15 = 0;
            } else {
                f.b bVar = fVar.f6436c;
                Context context = fVar.f6434a;
                ((j) bVar).getClass();
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i15 = 0;
                int source2 = motionEvent.getSource();
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    scaledMinimumFlingVelocity = t0.b(viewConfiguration, deviceId2, i14, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i14, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i14 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i19 >= 34) {
                    scaledMaximumFlingVelocity = t0.a(viewConfiguration, deviceId3, i14, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i14, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i14 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                fVar.f6441h = source;
                fVar.f6442i = deviceId;
                fVar.f6440g = i14;
                z14 = true;
            }
            int i24 = iArr[i15];
            VelocityTracker velocityTracker = fVar.f6438e;
            if (i24 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                fVar.f6438e = null;
                return true;
            }
            if (velocityTracker == null) {
                fVar.f6438e = VelocityTracker.obtain();
            }
            f.a aVar = fVar.f6437d;
            VelocityTracker velocityTracker2 = fVar.f6438e;
            ((j) aVar).getClass();
            Map<VelocityTracker, m0> map = l0.f6471a;
            velocityTracker2.addMovement(motionEvent);
            int i25 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map<VelocityTracker, m0> map2 = l0.f6471a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new m0());
                }
                m0 m0Var = map2.get(velocityTracker2);
                long[] jArr = m0Var.f6503b;
                long eventTime = motionEvent.getEventTime();
                if (m0Var.f6505d != 0 && eventTime - jArr[m0Var.f6506e] > 40) {
                    m0Var.f6505d = i15;
                    m0Var.f6504c = 0.0f;
                }
                int i26 = (m0Var.f6506e + 1) % 20;
                m0Var.f6506e = i26;
                int i27 = m0Var.f6505d;
                if (i27 != 20) {
                    m0Var.f6505d = i27 + 1;
                }
                m0Var.f6502a[i26] = motionEvent.getAxisValue(26);
                jArr[m0Var.f6506e] = eventTime;
            }
            float f18 = Float.MAX_VALUE;
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            m0 m0Var2 = l0.f6471a.get(velocityTracker2);
            if (m0Var2 != null) {
                float[] fArr = m0Var2.f6502a;
                long[] jArr2 = m0Var2.f6503b;
                int i28 = m0Var2.f6505d;
                if (i28 < 2) {
                    f16 = Float.MAX_VALUE;
                } else {
                    int i29 = m0Var2.f6506e;
                    int i30 = ((i29 + 20) - (i28 - 1)) % 20;
                    long j14 = jArr2[i29];
                    while (true) {
                        j8 = jArr2[i30];
                        long j15 = j14 - j8;
                        f16 = f18;
                        i16 = m0Var2.f6505d;
                        if (j15 <= 100) {
                            break;
                        }
                        m0Var2.f6505d = i16 - 1;
                        i30 = (i30 + 1) % 20;
                        f18 = f16;
                    }
                    if (i16 >= 2) {
                        if (i16 == 2) {
                            int i34 = (i30 + 1) % 20;
                            long j16 = jArr2[i34];
                            if (j8 != j16) {
                                fVar = fVar;
                                i17 = 1000;
                                fSqrt = fArr[i34] / (j16 - j8);
                            }
                        } else {
                            float f19 = 0.0f;
                            int i35 = 0;
                            int i36 = 0;
                            while (true) {
                                if (i35 >= m0Var2.f6505d - 1) {
                                    break;
                                }
                                int i37 = i35 + i30;
                                long j17 = jArr2[i37 % 20];
                                int i38 = (i37 + 1) % i25;
                                if (jArr2[i38] != j17) {
                                    i36++;
                                    float fSqrt2 = (f19 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f19) * 2.0f));
                                    float f22 = fArr[i38] / (jArr2[i38] - j17);
                                    float fAbs = (Math.abs(f22) * (f22 - fSqrt2)) + f19;
                                    if (i36 == i18) {
                                        fAbs *= 0.5f;
                                    }
                                    f19 = fAbs;
                                }
                                i35++;
                                fVar = fVar;
                                i25 = 20;
                                i18 = 1;
                            }
                            fVar = fVar;
                            fSqrt = ((float) Math.sqrt(Math.abs(f19) * 2.0f)) * (f19 < 0.0f ? -1.0f : 1.0f);
                            i17 = 1000;
                        }
                        f17 = fSqrt * i17;
                        m0Var2.f6504c = f17;
                        if (f17 < (-Math.abs(f16))) {
                            m0Var2.f6504c = -Math.abs(f16);
                        } else if (m0Var2.f6504c > Math.abs(f16)) {
                            m0Var2.f6504c = Math.abs(f16);
                        }
                    }
                }
                i17 = 1000;
                fSqrt = 0.0f;
                f17 = fSqrt * i17;
                m0Var2.f6504c = f17;
                if (f17 < (-Math.abs(f16))) {
                    m0Var2.f6504c = -Math.abs(f16);
                } else if (m0Var2.f6504c > Math.abs(f16)) {
                    m0Var2.f6504c = Math.abs(f16);
                }
            } else {
                fVar = fVar;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = l0.a.a(velocityTracker2, i14);
            } else if (i14 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i14 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                m0 m0Var3 = l0.f6471a.get(velocityTracker2);
                yVelocity = (m0Var3 == null || i14 != 26) ? 0.0f : m0Var3.f6504c;
            }
            c cVar = (c) gVar;
            NestedScrollView nestedScrollView = NestedScrollView.this;
            NestedScrollView nestedScrollView2 = NestedScrollView.this;
            float f24 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f24);
            f fVar2 = fVar;
            if (z14 || (fSignum != Math.signum(fVar2.f6439f) && fSignum != 0.0f)) {
                nestedScrollView2.f6601d.abortAnimation();
            }
            if (Math.abs(f24) >= iArr[0]) {
                int i39 = iArr[1];
                float fMax = Math.max(-i39, Math.min(f24, i39));
                if (fMax == 0.0f) {
                    f15 = 0.0f;
                } else {
                    nestedScrollView2.f6601d.abortAnimation();
                    nestedScrollView2.e((int) fMax);
                    f15 = fMax;
                }
                fVar2.f6439f = f15;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z14 = true;
        if (action == 2 && this.f6609l) {
            return true;
        }
        int i14 = action & 255;
        if (i14 == 0) {
            int y14 = (int) motionEvent.getY();
            int x14 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y14 < childAt.getTop() - scrollY || y14 >= childAt.getBottom() - scrollY || x14 < childAt.getLeft() || x14 >= childAt.getRight()) {
                    if (!q(motionEvent) && this.f6601d.isFinished()) {
                        z14 = false;
                    }
                    this.f6609l = z14;
                    velocityTracker = this.f6610m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f6610m = null;
                    }
                } else {
                    this.f6605h = y14;
                    this.f6616t = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f6610m;
                    if (velocityTracker3 == null) {
                        this.f6610m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f6610m.addMovement(motionEvent);
                    this.f6601d.computeScrollOffset();
                    if (!q(motionEvent) && this.f6601d.isFinished()) {
                        z14 = false;
                    }
                    this.f6609l = z14;
                    this.B.h(2, 0);
                }
            } else {
                if (!q(motionEvent)) {
                    z14 = false;
                }
                this.f6609l = z14;
                velocityTracker = this.f6610m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f6610m = null;
                }
            }
        } else if (i14 == 1) {
            this.f6609l = false;
            this.f6616t = -1;
            velocityTracker2 = this.f6610m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6610m = null;
            }
            if (this.f6601d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i14 == 2) {
            int i15 = this.f6616t;
            if (i15 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i15)) != -1) {
                int y15 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y15 - this.f6605h) > this.f6613p && (2 & getNestedScrollAxes()) == 0) {
                    this.f6609l = true;
                    this.f6605h = y15;
                    if (this.f6610m == null) {
                        this.f6610m = VelocityTracker.obtain();
                    }
                    this.f6610m.addMovement(motionEvent);
                    this.f6619x = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i14 == 3) {
            this.f6609l = false;
            this.f6616t = -1;
            velocityTracker2 = this.f6610m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f6610m = null;
            }
            if (this.f6601d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i14 == 6) {
            j(motionEvent);
        }
        return this.f6609l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int measuredHeight;
        super.onLayout(z14, i14, i15, i16, i17);
        int i18 = 0;
        this.f6606i = false;
        View view2 = this.f6608k;
        if (view2 != null && g(view2, this)) {
            View view3 = this.f6608k;
            Rect rect = this.f6600c;
            view3.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view3, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.f6608k = null;
        if (!this.f6607j) {
            if (this.f6621z != null) {
                scrollTo(getScrollX(), this.f6621z.f6623a);
                this.f6621z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i17 - i15) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i18 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i18 != scrollY) {
                scrollTo(getScrollX(), i18);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6607j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        if (this.f6611n && View.MeasureSpec.getMode(i15) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i14, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        if (z14) {
            return false;
        }
        dispatchNestedFling(0.0f, f15, true);
        e((int) f15);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view2, float f14, float f15) {
        return this.B.b(f14, f15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr) {
        c(i14, i15, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17) {
        i(i17, 0, null);
    }

    @Override // androidx.core.view.w
    public final void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        y yVar = this.A;
        if (i15 == 1) {
            yVar.f6588b = i14;
        } else {
            yVar.f6587a = i14;
        }
        this.B.h(2, i15);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i14, int i15, boolean z14, boolean z15) {
        super.scrollTo(i14, i15);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i14, Rect rect) {
        if (i14 == 2) {
            i14 = 130;
        } else if (i14 == 1) {
            i14 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i14) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i14);
        if (viewFindNextFocus != null && h(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i14, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f6621z = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f6623a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i14, int i15, int i16, int i17) {
        super.onScrollChanged(i14, i15, i16, i17);
        d dVar = this.D;
        if (dVar != null) {
            dVar.getClass();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !h(viewFindFocus, 0, i17)) {
            return;
        }
        Rect rect = this.f6600c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.f6612o) {
                p(0, iB, 250, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // androidx.core.view.w
    public final boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        return (i14 & 2) != 0;
    }

    @Override // androidx.core.view.w
    public final void onStopNestedScroll(View view2, int i14) {
        y yVar = this.A;
        if (i14 == 1) {
            yVar.f6588b = 0;
        } else {
            yVar.f6587a = 0;
        }
        stopNestedScroll(i14);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fB;
        int iRound;
        int i14;
        ViewParent parent2;
        int i15;
        if (this.f6610m == null) {
            this.f6610m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6619x = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f14 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f6619x);
        v vVar = this.B;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f6602e;
            EdgeEffect edgeEffect2 = this.f6603f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f6610m;
                velocityTracker.computeCurrentVelocity(1000, this.f6615r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6616t);
                if (Math.abs(yVelocity) >= this.f6614q) {
                    if (p7.c.a(edgeEffect) != 0.0f) {
                        if (o(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (p7.c.a(edgeEffect2) != 0.0f) {
                        int i16 = -yVelocity;
                        if (o(edgeEffect2, i16)) {
                            edgeEffect2.onAbsorb(i16);
                        } else {
                            e(i16);
                        }
                    } else {
                        int i17 = -yVelocity;
                        float f15 = i17;
                        if (!vVar.b(0.0f, f15)) {
                            dispatchNestedFling(0.0f, f15, true);
                            e(i17);
                        }
                    }
                } else if (this.f6601d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f6616t = -1;
                this.f6609l = false;
                VelocityTracker velocityTracker2 = this.f6610m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f6610m = null;
                }
                stopNestedScroll(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6616t);
                if (iFindPointerIndex != -1) {
                    int y14 = (int) motionEvent.getY(iFindPointerIndex);
                    int i18 = this.f6605h - y14;
                    float x14 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i18 / getHeight();
                    if (p7.c.a(edgeEffect) != 0.0f) {
                        fB = -p7.c.b(edgeEffect, -height, x14);
                        if (p7.c.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (p7.c.a(edgeEffect2) != 0.0f) {
                        fB = p7.c.b(edgeEffect2, height, 1.0f - x14);
                        if (p7.c.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f14 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i14 = i18 - iRound;
                        if (!this.f6609l && Math.abs(i14) > this.f6613p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f6609l = true;
                            i15 = this.f6613p;
                            if (i14 > 0) {
                                i14 -= i15;
                            } else {
                                i14 += i15;
                            }
                        }
                        if (this.f6609l) {
                            int iN = n(i14, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f6605h = y14 - iN;
                            this.f6619x += iN;
                        }
                    }
                    f14 = fB;
                    iRound = Math.round(f14 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i14 = i18 - iRound;
                    if (!this.f6609l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f6609l = true;
                        i15 = this.f6613p;
                        if (i14 > 0) {
                            i14 -= i15;
                        } else {
                            i14 += i15;
                        }
                    }
                    if (this.f6609l) {
                        int iN2 = n(i14, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f6605h = y14 - iN2;
                        this.f6619x += iN2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f6609l && getChildCount() > 0) {
                    if (this.f6601d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f6616t = -1;
                this.f6609l = false;
                VelocityTracker velocityTracker3 = this.f6610m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f6610m = null;
                }
                stopNestedScroll(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f6605h = (int) motionEvent.getY(actionIndex);
                this.f6616t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f6605h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6616t));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6609l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6601d.isFinished()) {
                this.f6601d.abortAnimation();
                stopNestedScroll(1);
            }
            int y15 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f6605h = y15;
            this.f6616t = pointerId;
            vVar.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f6610m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i14, int i15, int i16, boolean z14) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f6599b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i15 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f6601d.startScroll(getScrollX(), scrollY, 0, iMax, i16);
            if (z14) {
                this.B.h(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.f6620y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f6601d.isFinished()) {
                this.f6601d.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i14, i15);
        }
        this.f6599b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(MotionEvent motionEvent) {
        boolean z14;
        EdgeEffect edgeEffect = this.f6602e;
        if (p7.c.a(edgeEffect) != 0.0f) {
            p7.c.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z14 = true;
        } else {
            z14 = false;
        }
        EdgeEffect edgeEffect2 = this.f6603f;
        if (p7.c.a(edgeEffect2) == 0.0f) {
            return z14;
        }
        p7.c.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view2, View view3) {
        if (this.f6606i) {
            this.f6608k = view3;
        } else {
            Rect rect = this.f6600c;
            view3.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view3, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view2, view3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z14) {
        rect.offset(view2.getLeft() - view2.getScrollX(), view2.getTop() - view2.getScrollY());
        int iB = b(rect);
        boolean z15 = iB != 0;
        if (z15) {
            if (z14) {
                scrollBy(0, iB);
                return z15;
            }
            p(0, iB, 250, false);
        }
        return z15;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z14) {
        VelocityTracker velocityTracker;
        if (z14 && (velocityTracker = this.f6610m) != null) {
            velocityTracker.recycle();
            this.f6610m = null;
        }
        super.requestDisallowInterceptTouchEvent(z14);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f6606i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i14, int i15) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i14 < 0) {
                i14 = 0;
            } else if (width + i14 > width2) {
                i14 = width2 - width;
            }
            if (height >= height2 || i15 < 0) {
                i15 = 0;
            } else if (height + i15 > height2) {
                i15 = height2 - height;
            }
            if (i14 == getScrollX() && i15 == getScrollY()) {
                return;
            }
            super.scrollTo(i14, i15);
        }
    }

    public void setFillViewport(boolean z14) {
        if (z14 != this.f6611n) {
            this.f6611n = z14;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z14) {
        this.B.g(z14);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.D = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z14) {
        this.f6612o = z14;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i14) {
        return this.B.h(i14, 0);
    }

    @Override // androidx.core.view.t
    public final void stopNestedScroll(int i14) {
        this.B.i(i14);
    }

    @Override // androidx.core.view.w
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
        i(i17, i18, null);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.x
    public final void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        i(i17, i18, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view2, View view3, int i14) {
        return onStartNestedScroll(view2, view3, i14, 0);
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6623a;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i14) {
                return new e[i14];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f6623a = parcel.readInt();
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" scrollPosition=");
            return j.q(sb3, this.f6623a, StringSubstitutor.DEFAULT_VAR_END);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f6623a);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // androidx.core.view.w
    public final void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
        c(i14, i15, iArr, null, i16);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view2) {
        onStopNestedScroll(view2, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14) {
        if (getChildCount() <= 0) {
            super.addView(view2, i14);
        } else {
            h.z("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view2, View view3, int i14) {
        onNestedScrollAccepted(view2, view3, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view2, layoutParams);
        } else {
            h.z("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view2, i14, layoutParams);
        } else {
            h.z("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
