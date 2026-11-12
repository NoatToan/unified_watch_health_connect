package miuix.appcompat.internal.view.menu.action;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import defpackage.b43;
import defpackage.q56;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.internal.view.menu.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionMenuView extends LinearLayout implements d.c, i, b43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26510b;
    public ActionMenuPresenter c;
    public a d;
    public boolean e;

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f26511a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.f26511a = layoutParams.f26511a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f26511a = false;
        }
    }

    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Animator f26512a;

        public a() {
        }

        public void a(float f) {
            for (int i = 0; i < ActionMenuView.this.getChildCount(); i++) {
                ActionMenuView.this.getChildAt(i).setTranslationY(f);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f26512a = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f26512a = animator;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    @Override // miuix.appcompat.internal.view.menu.d.c
    public boolean a(f fVar, int i) {
        return this.f26509a.I(fVar, i);
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public boolean b(int i) {
        View childAt = getChildAt(i);
        childAt.clearAnimation();
        removeView(childAt);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public void c(d dVar) {
        this.f26509a = dVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    @Override // miuix.appcompat.internal.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void f() {
    }

    public float g(float f, boolean z, boolean z2) {
        int i;
        if (z && z2) {
            return 1.0f;
        }
        if (z) {
            i = (int) ((1.0f - f) * 10.0f);
        } else {
            if (!z2) {
                return 1.0f;
            }
            i = (int) (f * 10.0f);
        }
        return i / 10.0f;
    }

    public abstract int getCollapsedHeight();

    public ActionMenuPresenter getPresenter() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public float h(float f, boolean z, boolean z2) {
        float collapsedHeight = getCollapsedHeight();
        if (z && z2) {
            f = ((double) f) < 0.5d ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (z2) {
            f = 1.0f - f;
        }
        return f * collapsedHeight;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : generateDefaultLayoutParams();
    }

    public LayoutParams l(View view) {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f26511a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public boolean m() {
        return false;
    }

    public void n(int i, float f, boolean z, boolean z2) {
        if (q56.a()) {
            setAlpha(g(f, z, z2));
        }
        float fH = h(f, z, z2);
        if (!z || !z2 || getTranslationY() != 0.0f) {
            setTranslationY(fH);
        }
        this.d.a(fH);
    }

    public void o() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.c;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.O(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void p() {
    }

    public void q(boolean z) {
        this.e = z;
        if (z) {
            f();
        } else {
            p();
        }
    }

    public abstract /* synthetic */ void setEnableBlur(boolean z);

    public void setOverflowReserved(boolean z) {
        this.f26510b = z;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.c = actionMenuPresenter;
    }

    public abstract /* synthetic */ void setSupportBlur(boolean z);

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        setBaselineAligned(false);
        this.d = new a();
        setLayoutAnimation(null);
    }
}
