package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ki4;
import defpackage.kwi;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] A;
    public static final int[] z;
    public final AccessibilityManager x;
    public boolean y;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i = pii.U;
        z = new int[]{i};
        A = new int[]{i, pii.W};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, ki4 ki4Var) {
        super(context, viewGroup, view, ki4Var);
        this.x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static ViewGroup b0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean e0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar f0(View view, CharSequence charSequence, int i) {
        return g0(null, view, charSequence, i);
    }

    public static Snackbar g0(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroupB0 = b0(view);
        if (viewGroupB0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupB0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(e0(context) ? kwi.D : kwi.d, viewGroupB0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupB0, snackbarContentLayout, snackbarContentLayout);
        snackbar.h0(charSequence);
        snackbar.P(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void T() {
        super.T();
    }

    public final SnackbarContentLayout c0() {
        return (SnackbarContentLayout) this.c.getChildAt(0);
    }

    public final TextView d0() {
        return c0().getMessageView();
    }

    public Snackbar h0(CharSequence charSequence) {
        d0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void s() {
        super.s();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int w() {
        int iW = super.w();
        if (iW == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.x.getRecommendedTimeoutMillis(iW, (this.y ? 4 : 0) | 3);
        }
        if (this.y && this.x.isTouchExplorationEnabled()) {
            return -2;
        }
        return iW;
    }
}
