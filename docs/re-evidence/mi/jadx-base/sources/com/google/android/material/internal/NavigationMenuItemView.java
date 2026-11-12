package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.c;
import defpackage.fpi;
import defpackage.iqi;
import defpackage.jrk;
import defpackage.k47;
import defpackage.kwi;
import defpackage.m80;
import defpackage.pmi;
import defpackage.qii;
import defpackage.s8p;
import defpackage.tip;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    public static final int[] q = {R.attr.state_checked};
    public int g;
    public boolean h;
    public boolean i;
    public final CheckedTextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f8742k;
    public g l;
    public ColorStateList m;
    public boolean n;
    public Drawable o;
    public final androidx.core.view.a p;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.g0(NavigationMenuItemView.this.i);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f8742k == null) {
                this.f8742k = (FrameLayout) ((ViewStub) findViewById(iqi.f)).inflate();
            }
            this.f8742k.removeAllViews();
            this.f8742k.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void e(g gVar, int i) {
        this.l = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            c.v0(this, h());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        tip.a(this, gVar.getTooltipText());
        g();
    }

    public final void g() {
        if (j()) {
            this.j.setVisibility(8);
            FrameLayout frameLayout = this.f8742k;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f8742k.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.j.setVisibility(0);
        FrameLayout frameLayout2 = this.f8742k;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f8742k.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public g getItemData() {
        return this.l;
    }

    public final StateListDrawable h() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(qii.x, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(q, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void i() {
        FrameLayout frameLayout = this.f8742k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.j.setCompoundDrawables(null, null, null, null);
    }

    public final boolean j() {
        return this.l.getTitle() == null && this.l.getIcon() == null && this.l.getActionView() != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.l;
        if (gVar != null && gVar.isCheckable() && this.l.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.i != z) {
            this.i = z;
            this.p.sendAccessibilityEvent(this.j, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.j.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.n) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = k47.r(drawable).mutate();
                k47.o(drawable, this.m);
            }
            int i = this.g;
            drawable.setBounds(0, 0, i, i);
        } else if (this.h) {
            if (this.o == null) {
                Drawable drawableF = jrk.f(getResources(), fpi.h, getContext().getTheme());
                this.o = drawableF;
                if (drawableF != null) {
                    int i2 = this.g;
                    drawableF.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.o;
        }
        s8p.j(this.j, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.j.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.g = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        this.n = colorStateList != null;
        g gVar = this.l;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.j.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.h = z;
    }

    public void setTextAppearance(int i) {
        s8p.o(this.j, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.j.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.p = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(kwi.l, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(pmi.f30544k));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(iqi.g);
        this.j = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        c.r0(checkedTextView, aVar);
    }
}
