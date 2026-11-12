package com.xiaomi.fitness.widget.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import com.xiaomi.fitness.RTLUtil;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import defpackage.d6l;
import defpackage.e6l;
import defpackage.hm8;
import defpackage.ksi;
import defpackage.ni4;
import defpackage.r1j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseSwitchButton extends ViewGroup implements ISwitchButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f13446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f13447b;
    public View c;
    public final d6l d;
    public boolean e;
    public ISwitchButton.ScrollState f;
    public ISwitchButton.a g;
    public boolean h;
    public Drawable i;

    public BaseSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d6l d6lVar = new d6l();
        this.d = d6lVar;
        this.f = ISwitchButton.ScrollState.Idle;
        d6lVar.k(context, attributeSet);
        this.e = d6lVar.h();
        this.h = d6lVar.i();
        View view = new View(getContext());
        view.setBackgroundResource(d6lVar.b());
        addView(view, new ViewGroup.LayoutParams(-1, -1));
        this.f13446a = view;
        View view2 = new View(getContext());
        int iA = d6lVar.a();
        view2.setBackgroundResource(iA);
        Drawable drawableE = ni4.e(getContext(), iA);
        if (drawableE != null) {
            Drawable drawableMutate = drawableE.mutate();
            this.i = drawableMutate;
            drawableMutate.setAlpha(66);
        }
        addView(view2, new ViewGroup.LayoutParams(-1, -1));
        this.f13447b = view2;
        e6l e6lVar = new e6l(getContext());
        e6lVar.setBackgroundResource(d6lVar.c());
        addView(e6lVar, new ViewGroup.LayoutParams(-2, -1));
        this.c = e6lVar;
    }

    public static int c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private int getScrollDistance() {
        return this.c.getLeft() - getLeftNormal();
    }

    public static void j(ISwitchButton iSwitchButton, boolean z, ISwitchButton.a aVar) {
        iSwitchButton.setOnCheckedChangeCallback(null);
        iSwitchButton.setChecked(z);
        iSwitchButton.setOnCheckedChangeCallback(aVar);
    }

    private void setViewChecked(View view) {
        if (h(this.f13447b, view)) {
            this.f13447b = view;
        }
    }

    private void setViewNormal(View view) {
        if (h(this.f13446a, view)) {
            this.f13446a = view;
        }
    }

    private void setViewThumb(View view) {
        if (h(this.c, view)) {
            this.c = view;
        }
    }

    public abstract void a();

    public final void b() {
        if (d()) {
            if (this.h) {
                getDebugTag();
                StringBuilder sb = new StringBuilder();
                sb.append("dealViewIdle isChecked:");
                sb.append(this.e);
            }
            if (this.e) {
                k(true);
                l(false);
            } else {
                k(false);
                l(true);
            }
        }
    }

    public abstract boolean d();

    public final void e() {
        int left;
        boolean zD = d();
        if (this.h) {
            getDebugTag();
            StringBuilder sb = new StringBuilder();
            sb.append("layoutInternal isViewIdle:");
            sb.append(zD);
        }
        View view = this.f13446a;
        view.layout(0, 0, view.getMeasuredWidth(), this.f13446a.getMeasuredHeight());
        View view2 = this.f13447b;
        view2.layout(0, 0, view2.getMeasuredWidth(), this.f13447b.getMeasuredHeight());
        int iG = this.d.g();
        if (zD) {
            left = this.e ? getLeftChecked() : getLeftNormal();
        } else {
            left = this.c.getLeft();
        }
        View view3 = this.c;
        view3.layout(left, iG, view3.getMeasuredWidth() + left, this.c.getMeasuredHeight() + iG);
        float fMax = Math.max(c.N(this.f13446a), c.N(this.f13447b));
        if (c.N(this.c) <= fMax) {
            c.Q0(this.c, fMax + 1.0f);
        }
        b();
    }

    public final void f(int i) {
        if (i == 0) {
            return;
        }
        int left = this.c.getLeft();
        RTLUtil rTLUtil = RTLUtil.INSTANCE;
        int iE = hm8.e(left, rTLUtil.isRtl(getContext()) ? getLeftChecked() : getLeftNormal(), rTLUtil.isRtl(getContext()) ? getLeftNormal() : getLeftChecked(), i);
        if (iE == 0) {
            return;
        }
        c.a0(this.c, iE);
        g();
    }

    public final void g() {
        float scrollPercent = getScrollPercent();
        this.f13447b.setAlpha(scrollPercent);
        this.f13446a.setAlpha(1.0f - scrollPercent);
    }

    public final int getAvailableWidth() {
        return getLeftChecked() - getLeftNormal();
    }

    public final String getDebugTag() {
        return getClass().getSimpleName();
    }

    public final int getLeftChecked() {
        return RTLUtil.INSTANCE.isRtl(getContext()) ? this.d.e() : (getMeasuredWidth() - this.c.getMeasuredWidth()) - this.d.f();
    }

    public final int getLeftNormal() {
        return RTLUtil.INSTANCE.isRtl(getContext()) ? (getMeasuredWidth() - this.c.getMeasuredWidth()) - this.d.f() : this.d.e();
    }

    public float getScrollPercent() {
        return getScrollDistance() / getAvailableWidth();
    }

    public ISwitchButton.ScrollState getScrollState() {
        return this.f;
    }

    @Override // android.view.View, com.xiaomi.fitness.widget.button.ISwitchButton
    public Object getTag() {
        return super.getTag();
    }

    public View getViewChecked() {
        return this.f13447b;
    }

    public View getViewNormal() {
        return this.f13446a;
    }

    public View getViewThumb() {
        return this.c;
    }

    public final boolean h(View view, View view2) {
        if (view2 == null || view2 == view) {
            return false;
        }
        int iIndexOfChild = indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        removeView(view);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
        }
        addView(view2, iIndexOfChild, layoutParams);
        return true;
    }

    public boolean i(boolean z, boolean z2, boolean z3) {
        if (this.h) {
            getDebugTag();
            StringBuilder sb = new StringBuilder();
            sb.append("setChecked:");
            sb.append(this.e);
            sb.append(" -> ");
            sb.append(z);
        }
        boolean z4 = this.e != z;
        if (z4) {
            this.e = z;
            this.c.setSelected(z);
        }
        o(this.e, z2);
        if (z4) {
            if (z3 && this.g != null) {
                setContentDescription(this.e ? ResourceExtKt.getString(r1j.common_switch_open_content) : ResourceExtKt.getString(r1j.common_switch_off_content));
                this.g.onCheckedChanged(this.e, this);
            }
            sendAccessibilityEvent(32768);
        }
        return z4;
    }

    @Override // com.xiaomi.fitness.widget.button.ISwitchButton
    public boolean isChecked() {
        return this.e;
    }

    public final void k(boolean z) {
        float f = z ? 1.0f : 0.0f;
        if (this.f13447b.getAlpha() != f) {
            this.f13447b.setAlpha(f);
        }
    }

    public final void l(boolean z) {
        float f = z ? 1.0f : 0.0f;
        if (this.f13446a.getAlpha() != f) {
            this.f13446a.setAlpha(f);
        }
    }

    public abstract boolean m(int i, int i2);

    public void n(boolean z, boolean z2) {
        i(!this.e, z, z2);
    }

    public final void o(boolean z, boolean z2) {
        int left = this.c.getLeft();
        int leftChecked = z ? getLeftChecked() : getLeftNormal();
        if (this.h) {
            getDebugTag();
            StringBuilder sb = new StringBuilder();
            sb.append("updateViewByState ");
            sb.append(z);
            sb.append(":");
            sb.append(left);
            sb.append(" -> ");
            sb.append(leftChecked);
            sb.append(" anim:");
            sb.append(z2);
        }
        a();
        if (left != leftChecked) {
            if (z2) {
                m(left, leftChecked);
            } else {
                e();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(ksi.x);
        if (viewFindViewById != null) {
            removeView(viewFindViewById);
            setViewNormal(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(ksi.w);
        if (viewFindViewById2 != null) {
            removeView(viewFindViewById2);
            setViewChecked(viewFindViewById2);
        }
        View viewFindViewById3 = findViewById(ksi.y);
        if (viewFindViewById3 != null) {
            removeView(viewFindViewById3);
            setViewThumb(viewFindViewById3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.h) {
            getDebugTag();
        }
        e();
        g();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f13446a, i, i2);
        measureChild(this.f13447b, i, i2);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        measureChild(this.c, ViewGroup.getChildMeasureSpec(i, this.d.e() + this.d.f(), layoutParams.width), ViewGroup.getChildMeasureSpec(i2, this.d.g() + this.d.d(), layoutParams.height));
        setMeasuredDimension(c(Math.max(this.c.getMeasuredWidth(), Math.max(this.f13446a.getMeasuredWidth(), this.f13447b.getMeasuredWidth())), i), c(Math.max(this.c.getMeasuredHeight(), Math.max(this.f13446a.getMeasuredHeight(), this.f13447b.getMeasuredHeight())), i2));
    }

    public boolean setChecked(boolean z) {
        if (this.h) {
            getDebugTag();
            StringBuilder sb = new StringBuilder();
            sb.append("setChecked:");
            sb.append(this.e);
            sb.append(" -> ");
            sb.append(z);
        }
        boolean z2 = this.e != z;
        if (z2) {
            this.e = z;
            this.c.setSelected(z);
        }
        int i = r1j.common_switch_off_content;
        if (z) {
            i = r1j.common_switch_open_content;
        }
        setContentDescription(ResourceExtKt.getString(i));
        sendAccessibilityEvent(32768);
        o(this.e, false);
        return z2;
    }

    public void setDebug(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Drawable drawable;
        super.setEnabled(z);
        if (z || (drawable = this.i) == null) {
            this.f13447b.setBackgroundResource(this.d.a());
        } else {
            this.f13447b.setBackground(drawable);
        }
    }

    @Override // com.xiaomi.fitness.widget.button.ISwitchButton
    public void setOnCheckedChangeCallback(ISwitchButton.a aVar) {
        this.g = aVar;
    }

    public void setOnScrollStateChangeCallback(ISwitchButton.b bVar) {
    }

    public void setOnViewPositionChangeCallback(ISwitchButton.c cVar) {
    }

    public final void setScrollState(ISwitchButton.ScrollState scrollState) {
        scrollState.getClass();
        ISwitchButton.ScrollState scrollState2 = this.f;
        if (scrollState2 != scrollState) {
            this.f = scrollState;
            if (this.h) {
                getDebugTag();
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollState:");
                sb.append(scrollState2);
                sb.append(" -> ");
                sb.append(scrollState);
            }
            if (scrollState == ISwitchButton.ScrollState.Idle) {
                e();
            }
        }
    }
}
