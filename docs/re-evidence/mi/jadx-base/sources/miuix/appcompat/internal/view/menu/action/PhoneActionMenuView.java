package miuix.appcompat.internal.view.menu.action;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.g55;
import defpackage.p56;
import defpackage.q56;
import defpackage.s6g;
import defpackage.zhi;
import java.lang.reflect.Method;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.ExpandedMenuBlurView;

/* JADX INFO: loaded from: classes3.dex */
public class PhoneActionMenuView extends ActionMenuView {
    public static final int[] A = {R.attr.background, zhi.B, zhi.R};
    public Context f;
    public View g;
    public View h;
    public ExpandedMenuBlurView i;
    public c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f26519k;
    public Drawable l;
    public Drawable m;
    public int n;
    public int o;
    public Rect p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26520r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final int y;
    public int z;

    public enum b {
        Collapsed,
        Expanding,
        Expanded,
        Collapsing
    }

    public class c implements Animator.AnimatorListener, View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AnimatorSet f26523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnimatorSet f26524b;
        public ActionBarOverlayLayout c;

        public c() {
        }

        public void a(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.c = actionBarOverlayLayout;
            if (this.f26523a == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", 1.0f, 0.0f), actionBarOverlayLayout.u(this).b());
                animatorSet.setDuration(PhoneActionMenuView.this.getResources().getInteger(R.integer.config_shortAnimTime));
                animatorSet.setInterpolator(new g55());
                animatorSet.addListener(this);
                this.f26523a = animatorSet;
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", 0.0f, 1.0f), actionBarOverlayLayout.u(null).a());
                animatorSet2.setDuration(PhoneActionMenuView.this.getResources().getInteger(R.integer.config_shortAnimTime));
                animatorSet2.setInterpolator(new g55());
                animatorSet2.addListener(this);
                this.f26524b = animatorSet2;
                if (q56.a()) {
                    return;
                }
                this.f26523a.setDuration(0L);
                this.f26524b.setDuration(0L);
            }
        }

        public void b(ActionBarOverlayLayout actionBarOverlayLayout) {
            a(actionBarOverlayLayout);
            this.f26524b.cancel();
            this.f26523a.cancel();
            this.f26524b.start();
        }

        public void c() {
            try {
                Method declaredMethod = Class.forName("android.animation.AnimatorSet").getDeclaredMethod("reverse", new Class[0]);
                if (this.f26523a.isRunning()) {
                    declaredMethod.invoke(this.f26523a, new Object[0]);
                }
                if (this.f26524b.isRunning()) {
                    declaredMethod.invoke(this.f26524b, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }

        public final void d(boolean z) {
            if (z) {
                this.c.getContentView().setImportantForAccessibility(0);
            } else {
                this.c.getContentView().setImportantForAccessibility(4);
            }
        }

        public void e(ActionBarOverlayLayout actionBarOverlayLayout) {
            a(actionBarOverlayLayout);
            this.f26524b.cancel();
            this.f26523a.cancel();
            this.f26523a.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PhoneActionMenuView.this.f26519k == b.Expanding || PhoneActionMenuView.this.f26519k == b.Expanded) {
                PhoneActionMenuView.this.setValue(0.0f);
                d(false);
            } else if (PhoneActionMenuView.this.f26519k == b.Collapsing || PhoneActionMenuView.this.f26519k == b.Collapsed) {
                PhoneActionMenuView.this.setValue(1.0f);
                d(true);
            }
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PhoneActionMenuView.this.g != null) {
                if (PhoneActionMenuView.this.g.getTranslationY() == 0.0f) {
                    PhoneActionMenuView.this.f26519k = b.Expanded;
                    d(false);
                } else if (PhoneActionMenuView.this.g.getTranslationY() == PhoneActionMenuView.this.getMeasuredHeight()) {
                    PhoneActionMenuView.this.f26519k = b.Collapsed;
                    d(true);
                    PhoneActionMenuView.this.h.setBackground(PhoneActionMenuView.this.m);
                }
            }
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PhoneActionMenuView.this.f26519k == b.Expanded) {
                PhoneActionMenuView.this.getPresenter().U(true);
            }
        }
    }

    public PhoneActionMenuView(Context context) {
        this(context, null);
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        if (indexOfChild(this.g) != -1) {
            childCount--;
        }
        return indexOfChild(this.h) != -1 ? childCount - 1 : childCount;
    }

    private c getOverflowMenuViewAnimator() {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    private boolean y(View view) {
        return view == this.g || view == this.h;
    }

    public boolean A(ActionBarOverlayLayout actionBarOverlayLayout) {
        b bVar = this.f26519k;
        b bVar2 = b.Expanding;
        if (bVar == bVar2 || bVar == b.Expanded || this.g == null) {
            return false;
        }
        this.h.setBackground(this.l);
        c overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (bVar == b.Collapsed) {
            this.f26519k = bVar2;
            overflowMenuViewAnimator.e(actionBarOverlayLayout);
        } else if (bVar == b.Collapsing) {
            overflowMenuViewAnimator.c();
        }
        postInvalidateOnAnimation();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        return true;
    }

    public final void B(Context context) {
        this.f26520r = context.getResources().getDimensionPixelSize(dmi.y);
        this.s = context.getResources().getDimensionPixelSize(dmi.t);
        if (this.y != 1) {
            this.t = context.getResources().getDimensionPixelSize(dmi.x);
            this.u = context.getResources().getDimensionPixelSize(dmi.w);
            this.v = context.getResources().getDimensionPixelSize(dmi.v);
            this.w = context.getResources().getDimensionPixelSize(dmi.u);
        }
    }

    public final void C(Context context, int i) {
        int i2 = this.y;
        if (i2 == 3) {
            this.x = this.t;
            return;
        }
        if (i2 != 2) {
            this.x = this.s;
            return;
        }
        int i3 = (int) ((i * 1.0f) / context.getResources().getDisplayMetrics().density);
        if (i3 >= 700 && i3 < 740) {
            this.x = this.u;
            return;
        }
        if (i3 >= 740 && i3 < 1000) {
            this.x = this.v;
        } else if (i3 >= 1000) {
            this.x = this.w;
        } else {
            this.x = this.t;
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.i
    public boolean b(int i) {
        ActionMenuView.LayoutParams layoutParams;
        View childAt = getChildAt(i);
        return !y(childAt) && ((layoutParams = (ActionMenuView.LayoutParams) childAt.getLayoutParams()) == null || !layoutParams.f26511a) && super.b(i);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.i
    public boolean d() {
        return getChildAt(0) == this.h || getChildAt(1) == this.h;
    }

    @Override // defpackage.b43
    public void e(boolean z) {
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild = indexOfChild(this.g);
        int iIndexOfChild2 = indexOfChild(this.h);
        if (i2 == 0) {
            if (iIndexOfChild != -1) {
                return iIndexOfChild;
            }
            if (iIndexOfChild2 != -1) {
                return iIndexOfChild2;
            }
        } else if (i2 == 1 && iIndexOfChild != -1 && iIndexOfChild2 != -1) {
            return iIndexOfChild2;
        }
        int i3 = 0;
        while (i3 < i) {
            if (i3 != iIndexOfChild && i3 != iIndexOfChild2) {
                int i4 = i3 < iIndexOfChild ? i3 + 1 : i3;
                if (i3 < iIndexOfChild2) {
                    i4++;
                }
                if (i4 == i2) {
                    return i3;
                }
            }
            i3++;
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        int i = this.o;
        if (i == 0) {
            return 0;
        }
        return (i + this.p.top) - this.q;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void n(int i, float f, boolean z, boolean z2) {
        if (q56.a()) {
            setAlpha(g(f, z, z2));
        }
        float fH = h(f, z, z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!y(childAt)) {
                childAt.setTranslationY(fH);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        B(this.f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        View view = this.g;
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            dyq.h(this, this.g, 0, 0, i6, measuredHeight);
            i5 = measuredHeight - this.p.top;
        } else {
            i5 = 0;
        }
        dyq.h(this, this.h, 0, i5, i6, i7);
        int childCount = getChildCount();
        int measuredWidth = (i6 - this.n) >> 1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!y(childAt)) {
                dyq.h(this, childAt, measuredWidth, i5, measuredWidth + childAt.getMeasuredWidth(), i7);
                measuredWidth += childAt.getMeasuredWidth() + this.x;
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.z = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.o = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        this.f26520r = Math.min(size / this.z, this.f26520r);
        C(getContext(), size);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f26520r, Integer.MIN_VALUE);
        int iMin = 0;
        int measuredHeight = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!y(childAt)) {
                measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                iMin += Math.min(childAt.getMeasuredWidth(), this.f26520r);
                measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight());
            }
        }
        int i4 = this.x;
        int i5 = this.z;
        if ((i4 * (i5 - 1)) + iMin > size) {
            this.x = 0;
        }
        int i6 = iMin + (this.x * (i5 - 1));
        this.n = i6;
        this.o = measuredHeight;
        View view = this.g;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = s6g.k(this.f);
            marginLayoutParams.bottomMargin = this.o;
            measureChildWithMargins(this.g, i, 0, i2, 0);
            Math.max(i6, this.g.getMeasuredWidth());
            measuredHeight += this.g.getMeasuredHeight();
            b bVar = this.f26519k;
            if (bVar == b.Expanded) {
                this.g.setTranslationY(0.0f);
            } else if (bVar == b.Collapsed) {
                this.g.setTranslationY(measuredHeight);
            }
        }
        if (this.g == null) {
            measuredHeight += this.p.top;
        }
        this.h.setBackground(this.f26519k == b.Collapsed ? this.m : this.l);
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        View view = this.g;
        return y > (view == null ? 0.0f : view.getTranslationY()) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (this.m != drawable) {
            this.m = drawable;
            w();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setEnableBlur(boolean z) {
    }

    public void setOverflowMenuView(View view) {
        ExpandedMenuBlurView expandedMenuBlurView = this.i;
        if (((expandedMenuBlurView == null || expandedMenuBlurView.getChildCount() <= 1) ? null : this.i.getChildAt(1)) != view) {
            View view2 = this.g;
            if (view2 != null) {
                if (view2.getAnimation() != null) {
                    this.g.clearAnimation();
                }
                ExpandedMenuBlurView expandedMenuBlurView2 = this.i;
                if (expandedMenuBlurView2 != null) {
                    expandedMenuBlurView2.removeAllViews();
                    removeView(this.i);
                    this.i = null;
                }
            }
            if (view != null) {
                if (this.i == null) {
                    this.i = new ExpandedMenuBlurView(this.f);
                }
                this.i.addView(view);
                addView(this.i);
            }
            this.g = this.i;
            w();
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setSupportBlur(boolean z) {
    }

    public void setValue(float f) {
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setTranslationY(f * getMeasuredHeight());
    }

    public final void w() {
        if (this.p == null) {
            this.p = new Rect();
        }
        Drawable drawable = this.g == null ? this.m : this.l;
        if (drawable == null) {
            this.p.setEmpty();
        } else {
            drawable.getPadding(this.p);
        }
    }

    public boolean x(ActionBarOverlayLayout actionBarOverlayLayout) {
        b bVar = this.f26519k;
        b bVar2 = b.Collapsing;
        if (bVar == bVar2 || bVar == b.Collapsed) {
            return false;
        }
        c overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (bVar == b.Expanded) {
            this.f26519k = bVar2;
            overflowMenuViewAnimator.b(actionBarOverlayLayout);
            return true;
        }
        if (bVar != b.Expanding) {
            return true;
        }
        overflowMenuViewAnimator.c();
        return true;
    }

    public boolean z() {
        b bVar = this.f26519k;
        return bVar == b.Expanding || bVar == b.Expanded;
    }

    public PhoneActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26519k = b.Collapsed;
        this.f26520r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.z = 0;
        super.setBackground(null);
        this.f = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A);
        this.m = typedArrayObtainStyledAttributes.getDrawable(0);
        this.l = typedArrayObtainStyledAttributes.getDrawable(1);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        w();
        View view = new View(context);
        this.h = view;
        addView(view);
        setChildrenDrawingOrderEnabled(true);
        this.y = p56.a(context);
        B(context);
    }
}
