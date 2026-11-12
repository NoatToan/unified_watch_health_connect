package com.huawei.uikit.hwfloatingactionbutton.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.uikit.hwfloatingactionbutton.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xfs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes44.dex */
public class HwFloatingActionsMenu extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f29495b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29496a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29497c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private HwFloatingActionButton l;
    private int m;
    private float n;
    private int o;
    private OnFloatingActionsMenuUpdateListener p;
    private float q;
    private ColorStateList r;
    private Context s;
    private View t;
    private AnimatorSet u;
    private int v;
    private int w;
    private int x;
    private AnimatorSet y;

    public interface OnFloatingActionsMenuUpdateListener {
        void onMenuHide();

        void onMenuShow();
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AnimatorSet f29498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AnimatorSet f29499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AnimatorSet f29500c;
        private AnimatorSet e;

        a(Context context) {
            c(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(View view) {
            this.f29500c.setTarget(view);
            this.e.setTarget(view);
            HwFloatingActionsMenu.this.u.play(this.f29500c);
            HwFloatingActionsMenu.this.y.play(this.e);
        }

        private void c(Context context) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, HwFloatingActionsMenu.f29495b ? R.animator.hwfab_item_open_anim_lite : R.anim.hwfab_item_open_anim);
            Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(context, HwFloatingActionsMenu.f29495b ? R.animator.hwfab_item_label_open_anim_lite : R.anim.hwfab_item_label_open_anim);
            Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(context, HwFloatingActionsMenu.f29495b ? R.animator.hwfab_item_close_anim_lite : R.anim.hwfab_item_close_anim);
            Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(context, HwFloatingActionsMenu.f29495b ? R.animator.hwfab_item_label_close_anim_lite : R.anim.hwfab_item_label_close_anim);
            if ((animatorLoadAnimator instanceof AnimatorSet) && (animatorLoadAnimator2 instanceof AnimatorSet) && (animatorLoadAnimator3 instanceof AnimatorSet) && (animatorLoadAnimator4 instanceof AnimatorSet)) {
                this.f29499b = (AnimatorSet) animatorLoadAnimator;
                this.f29500c = (AnimatorSet) animatorLoadAnimator2;
                this.f29498a = (AnimatorSet) animatorLoadAnimator3;
                this.e = (AnimatorSet) animatorLoadAnimator4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(View view) {
            this.f29499b.setTarget(view);
            this.f29498a.setTarget(view);
            HwFloatingActionsMenu.this.u.play(this.f29499b);
            HwFloatingActionsMenu.this.y.play(this.f29498a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f29500c.setStartDelay(j);
            this.f29499b.setStartDelay(j);
            long j2 = 100 - j;
            this.e.setStartDelay(j2);
            this.f29498a.setStartDelay(j2);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwFloatingActionsMenu.this.b();
        }
    }

    class d implements Animator.AnimatorListener {
        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwFloatingActionsMenu.this.f();
        }
    }

    class e implements Animator.AnimatorListener {
        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwFloatingActionsMenu.this.d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    static {
        f29495b = k() || m();
    }

    public HwFloatingActionsMenu(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.k = true;
        for (int i = 0; i < this.j; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.l) {
                childAt.setVisibility(0);
                Object tag = childAt.getTag(R.id.hwfab_label);
                if (tag instanceof View) {
                    ((View) tag).setVisibility(0);
                }
            }
        }
    }

    private void g() {
        Context context = this.s;
        boolean z = f29495b;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, z ? R.animator.hwfab_item_label_open_anim_lite : R.anim.hwfab_item_label_open_anim);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.s, z ? R.animator.hwfab_item_label_close_anim_lite : R.anim.hwfab_item_label_close_anim);
        if ((animatorLoadAnimator instanceof AnimatorSet) && (animatorLoadAnimator2 instanceof AnimatorSet)) {
            AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
            AnimatorSet animatorSet2 = (AnimatorSet) animatorLoadAnimator2;
            this.t.setAlpha(0.0f);
            animatorSet.setTarget(this.t);
            animatorSet2.setTarget(this.t);
            this.u.play(animatorSet);
            this.y.play(animatorSet2);
        }
    }

    private int getMaxLabelWidth() {
        int measuredWidth = 0;
        for (int i = 0; i < this.j; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt != this.t && !(childAt instanceof HwTextView)) {
                if (childAt != this.l) {
                    this.d = this.f29497c - ((this.i - childAt.getMeasuredWidth()) / 2);
                }
                Object tag = childAt.getTag(R.id.hwfab_label);
                if (tag instanceof HwTextView) {
                    HwTextView hwTextView = (HwTextView) tag;
                    if (this.f == 0) {
                        if ((this.x - this.i) - this.d < hwTextView.getMeasuredWidth()) {
                            int i2 = (this.x - this.i) - this.d;
                            if (measuredWidth <= i2) {
                                measuredWidth = i2;
                            }
                            hwTextView.setMaxWidth(measuredWidth - this.f29497c);
                        } else if (measuredWidth <= hwTextView.getMeasuredWidth()) {
                            measuredWidth = hwTextView.getMeasuredWidth();
                        }
                    } else if (((this.x - this.i) / 2) - this.d < hwTextView.getMeasuredWidth()) {
                        int i3 = ((this.x - this.i) / 2) - this.d;
                        if (measuredWidth <= i3) {
                            measuredWidth = i3;
                        }
                        hwTextView.setMaxWidth(measuredWidth - this.f29497c);
                    } else if (measuredWidth <= hwTextView.getMeasuredWidth()) {
                        measuredWidth = hwTextView.getMeasuredWidth();
                    }
                }
            }
        }
        return measuredWidth;
    }

    private void h() {
        if (!this.k || this.u.isRunning()) {
            return;
        }
        this.y.start();
        OnFloatingActionsMenuUpdateListener onFloatingActionsMenuUpdateListener = this.p;
        if (onFloatingActionsMenuUpdateListener != null) {
            onFloatingActionsMenuUpdateListener.onMenuHide();
        }
    }

    private void i() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.g);
        for (int i = 0; i < this.j; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.t && (childAt instanceof HwFloatingActionButton)) {
                HwFloatingActionButton hwFloatingActionButton = (HwFloatingActionButton) childAt;
                String title = hwFloatingActionButton.getTitle();
                if (hwFloatingActionButton != this.l && hwFloatingActionButton.getTag(R.id.hwfab_label) == null) {
                    HwTextView hwTextViewE = HwTextView.e(contextThemeWrapper);
                    if (hwTextViewE == null) {
                        return;
                    }
                    if (title != null) {
                        hwTextViewE.setText(title);
                    }
                    hwTextViewE.setTextAppearance(getContext(), this.g);
                    hwTextViewE.setAutoTextInfo(9, 1, 2);
                    addView(hwTextViewE);
                    this.j++;
                    hwFloatingActionButton.setTag(R.id.hwfab_label, hwTextViewE);
                }
            }
        }
    }

    private void j() {
        for (int i = this.j - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (childAt != this.l && (childAt instanceof HwFloatingActionButton)) {
                int i2 = this.v + 50;
                this.v = i2;
                if (i2 >= 100) {
                    break;
                }
            }
        }
        int i3 = 0;
        for (int i4 = this.j - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            if (childAt2 != this.l && (childAt2 instanceof HwFloatingActionButton)) {
                a aVar = new a(this.s);
                aVar.c(childAt2);
                childAt2.setScaleX(0.0f);
                childAt2.setScaleY(0.0f);
                Object tag = childAt2.getTag(R.id.hwfab_label);
                if (tag instanceof View) {
                    View view = (View) tag;
                    view.setAlpha(0.0f);
                    aVar.d(view);
                }
                int i5 = this.v;
                if (i3 > i5) {
                    i3 = i5;
                }
                aVar.a(i3);
                i3 += 50;
            }
        }
    }

    private static boolean k() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            Boolean bool = Boolean.FALSE;
            if (declaredMethod.invoke(null, "ro.build.hw_emui_lite.enable", bool) instanceof Boolean) {
                return ((Boolean) declaredMethod.invoke(null, "ro.build.hw_emui_lite.enable", bool)).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException unused) {
            Log.e("HwFabMenu", "isEmuiLite ClassNotFoundException info");
            return false;
        } catch (IllegalAccessException unused2) {
            Log.e("HwFabMenu", "isEmuiLite IllegalAccessException info");
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("HwFabMenu", "isEmuiLite NoSuchMethodException info");
            return false;
        } catch (InvocationTargetException unused4) {
            Log.e("HwFabMenu", "isEmuiLite InvocationTargetException info");
            return false;
        }
    }

    private void l() {
        Context context = this.s;
        boolean z = f29495b;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, z ? R.animator.hwfab_open_anim_lite : R.anim.hwfab_open_anim);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.s, z ? R.animator.hwfab_close_anim_lite : R.anim.hwfab_close_anim);
        if ((animatorLoadAnimator instanceof AnimatorSet) && (animatorLoadAnimator2 instanceof AnimatorSet)) {
            AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
            AnimatorSet animatorSet2 = (AnimatorSet) animatorLoadAnimator2;
            animatorSet.setTarget(this.l);
            animatorSet2.setTarget(this.l);
            this.u.play(animatorSet);
            this.y.play(animatorSet2);
        }
    }

    private static boolean m() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            Boolean bool = Boolean.FALSE;
            if (declaredMethod.invoke(null, "ro.config.hw_nova_performance", bool) instanceof Boolean) {
                return ((Boolean) declaredMethod.invoke(null, "ro.config.hw_nova_performance", bool)).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException unused) {
            Log.e("HwFabMenu", "isNovaPerformance ClassNotFoundException info");
            return false;
        } catch (IllegalAccessException unused2) {
            Log.e("HwFabMenu", "isNovaPerformance IllegalAccessException info");
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("HwFabMenu", "isNovaPerformance NoSuchMethodException info");
            return false;
        } catch (InvocationTargetException unused4) {
            Log.e("HwFabMenu", "isNovaPerformance InvocationTargetException info");
            return false;
        }
    }

    private void n() {
        if (this.k || this.y.isRunning()) {
            return;
        }
        this.u.start();
        OnFloatingActionsMenuUpdateListener onFloatingActionsMenuUpdateListener = this.p;
        if (onFloatingActionsMenuUpdateListener != null) {
            onFloatingActionsMenuUpdateListener.onMenuShow();
        }
    }

    private int o() {
        int measuredHeight = 0;
        for (int i = 0; i < this.j; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt != this.t && !(childAt instanceof HwTextView)) {
                int measuredWidth = childAt.getMeasuredWidth() + this.e + childAt.getPaddingLeft();
                int i2 = this.i;
                if (i2 > measuredWidth) {
                    measuredWidth = i2;
                }
                this.i = measuredWidth;
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        return measuredHeight;
    }

    private void setDrawableBackground(Context context) {
        this.t = new View(context);
        addView(this.t, new ViewGroup.LayoutParams(-1, -1));
        this.t.setBackground(getResources().getDrawable(R.drawable.hwfab_background));
    }

    public void b() {
        if (this.k) {
            h();
        } else {
            n();
        }
    }

    public ColorStateList getFabBackgroundColor() {
        return this.r;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.l);
        this.j = getChildCount();
        if (this.g != 0) {
            i();
        }
        l();
        g();
        j();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.t.layout(i, i2, i5, i6);
        b(i6 - this.l.getMeasuredHeight(), this.f == 0 ? (i5 - (this.l.getMeasuredWidth() / 2)) - this.e : i5 / 2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        this.x = getResources().getDisplayMetrics().widthPixels;
        this.w = getResources().getDisplayMetrics().heightPixels;
        this.i = 0;
        c(o(), getMaxLabelWidth());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setFabBackgroundColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        this.r = colorStateList;
        this.l.setBackgroundTintList(colorStateList);
    }

    public void setOnFloatingActionsMenuUpdateListener(OnFloatingActionsMenuUpdateListener onFloatingActionsMenuUpdateListener) {
        this.p = onFloatingActionsMenuUpdateListener;
    }

    public void setmButtonMarginBottom(int i) {
        this.h = i;
    }

    public void setmButtonMarginRight(int i) {
        this.e = i;
    }

    public HwFloatingActionsMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwFloatingActionsMenuStyle);
    }

    private void c() {
        this.y.addListener(new e());
    }

    private void c(int i, int i2) {
        int i3 = this.i;
        int i4 = i2 > 0 ? i2 + this.d : 0;
        int i5 = this.h;
        int paddingTop = this.l.getPaddingTop();
        if (this.k) {
            setMeasuredDimension(this.x, this.w);
        } else {
            setMeasuredDimension(i3 + i4, i + i5 + paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        for (int i = 0; i < this.j; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.l) {
                childAt.setVisibility(8);
                Object tag = childAt.getTag(R.id.hwfab_label);
                if (tag instanceof View) {
                    ((View) tag).setVisibility(8);
                }
            }
        }
        this.k = false;
    }

    public HwFloatingActionsMenu(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        this.k = false;
        this.v = -50;
        this.u = new AnimatorSet();
        this.y = new AnimatorSet();
        b(super.getContext(), attributeSet, i);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwFloatingActionButton);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        this.s = context;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hwfab_margin_end);
        this.f29497c = dimensionPixelSize;
        this.e = getResources().getDimensionPixelSize(R.dimen.emui_dimens_max_end);
        this.h = dimensionPixelSize;
        this.f29496a = getResources().getDimensionPixelSize(R.dimen.hwfab_margin_xl);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwFloatingActionsMenu, i, R.style.Widget_Emui_HwFloatingActionsMenu);
        this.g = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwFloatingActionsMenu_hwFabLabelStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.HwFloatingActionsMenu_hwFabExpandPosition, 0);
        this.r = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.HwFloatingActionsMenu_hwFabBackgroundTint);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.HwFloatingActionsMenu_hwFabRippleColor, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwFloatingActionsMenu_hwFabIcon, 0);
        this.n = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwFloatingActionsMenu_hwFabElevation, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getDimension(R.styleable.HwFloatingActionsMenu_hwFabPressedTranslationZ, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
        setDrawableBackground(context);
    }

    private void a() {
        this.u.addListener(new d());
        c();
    }

    private void a(Context context) {
        HwFloatingActionButton hwFloatingActionButtonC = HwFloatingActionButton.c(context);
        this.l = hwFloatingActionButtonC;
        if (hwFloatingActionButtonC == null) {
            return;
        }
        hwFloatingActionButtonC.setImageResource(this.m);
        this.l.setRippleColor(this.o);
        this.l.setCompatElevation(this.n);
        this.l.setCompatPressedTranslationZ(this.q);
        this.l.setId(R.id.hwfab_expand_menu_button);
        this.l.setSize(0);
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            this.l.setBackgroundTintList(colorStateList);
        }
        this.l.setOnClickListener(new c());
        addView(this.l, super.generateDefaultLayoutParams());
        this.j++;
    }

    private void b(int i, int i2) {
        int measuredWidth = i2 - (this.l.getMeasuredWidth() / 2);
        int i3 = i - this.h;
        boolean z = getLayoutDirection() == 1;
        if (z) {
            if (this.f == 0) {
                HwFloatingActionButton hwFloatingActionButton = this.l;
                int i4 = this.e;
                hwFloatingActionButton.layout(i4, i3, hwFloatingActionButton.getMeasuredWidth() + i4, this.l.getMeasuredHeight() + i3);
            } else {
                HwFloatingActionButton hwFloatingActionButton2 = this.l;
                hwFloatingActionButton2.layout(measuredWidth, i3, hwFloatingActionButton2.getMeasuredWidth() + measuredWidth, this.l.getMeasuredHeight() + i3);
            }
        } else {
            HwFloatingActionButton hwFloatingActionButton3 = this.l;
            hwFloatingActionButton3.layout(measuredWidth, i3, hwFloatingActionButton3.getMeasuredWidth() + measuredWidth, this.l.getMeasuredHeight() + i3);
        }
        d(i2, z, i2 - ((this.i / 2) + this.d), i);
    }

    private void d(int i, boolean z, int i2, int i3) {
        int i4 = (i3 - this.f29496a) - this.h;
        for (int i5 = this.j - 1; i5 >= 0; i5--) {
            View childAt = getChildAt(i5);
            if (childAt != this.l && childAt.getVisibility() != 8 && childAt != this.t && !(childAt instanceof HwTextView)) {
                int measuredWidth = i - (childAt.getMeasuredWidth() / 2);
                int measuredHeight = i4 - childAt.getMeasuredHeight();
                if (z) {
                    childAt.layout((this.x - measuredWidth) - childAt.getMeasuredWidth(), measuredHeight, this.x - measuredWidth, childAt.getMeasuredHeight() + measuredHeight);
                } else {
                    childAt.layout(measuredWidth, measuredHeight, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + measuredHeight);
                }
                Object tag = childAt.getTag(R.id.hwfab_label);
                if (tag instanceof HwTextView) {
                    HwTextView hwTextView = (HwTextView) tag;
                    int measuredWidth2 = i2 - hwTextView.getMeasuredWidth();
                    if (measuredWidth2 <= 0) {
                        measuredWidth2 = 0;
                    }
                    int measuredHeight2 = ((childAt.getMeasuredHeight() - hwTextView.getMeasuredHeight()) / 2) + measuredHeight;
                    if (z) {
                        hwTextView.layout((this.x - measuredWidth2) - hwTextView.getMeasuredWidth(), measuredHeight2, this.x - measuredWidth2, hwTextView.getMeasuredHeight() + measuredHeight2);
                    } else {
                        hwTextView.layout(measuredWidth2, measuredHeight2, i2, hwTextView.getMeasuredHeight() + measuredHeight2);
                    }
                }
                i4 = measuredHeight - this.f29496a;
            }
        }
    }
}
