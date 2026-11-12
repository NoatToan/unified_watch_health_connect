package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.c;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.k47;
import defpackage.l8f;
import defpackage.m8f;
import defpackage.n8f;
import defpackage.pii;
import defpackage.sip;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialToolbar extends Toolbar {
    public static final int W = k3j.M;
    public static final ImageView.ScaleType[] a0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer R;
    public boolean S;
    public boolean T;
    public ImageView.ScaleType U;
    public Boolean V;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public final Pair<Integer, Integer> S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void T(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            l8f l8fVar = new l8f();
            l8fVar.b0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            l8fVar.Q(context);
            l8fVar.a0(c.v(this));
            c.v0(this, l8fVar);
        }
    }

    public final void U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public final void V() {
        if (this.S || this.T) {
            TextView textViewE = sip.e(this);
            TextView textViewC = sip.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair<Integer, Integer> pairS = S(textViewE, textViewC);
            if (this.S && textViewE != null) {
                U(textViewE, pairS);
            }
            if (!this.T || textViewC == null) {
                return;
            }
            U(textViewC, pairS);
        }
    }

    public final Drawable W(Drawable drawable) {
        if (drawable == null || this.R == null) {
            return drawable;
        }
        Drawable drawableR = k47.r(drawable.mutate());
        k47.n(drawableR, this.R.intValue());
        return drawableR;
    }

    public final void X() {
        ImageView imageViewB = sip.b(this);
        if (imageViewB != null) {
            Boolean bool = this.V;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.U;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.U;
    }

    public Integer getNavigationIconTint() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8f.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        V();
        X();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        m8f.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.V;
        if (bool == null || bool.booleanValue() != z) {
            this.V = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.U != scaleType) {
            this.U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.T != z) {
            this.T = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.S != z) {
            this.S = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.h0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = W;
        super(n8f.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.x5, i, i2, new int[0]);
        if (typedArrayH.hasValue(b4j.A5)) {
            setNavigationIconTint(typedArrayH.getColor(b4j.A5, -1));
        }
        this.S = typedArrayH.getBoolean(b4j.C5, false);
        this.T = typedArrayH.getBoolean(b4j.B5, false);
        int i3 = typedArrayH.getInt(b4j.z5, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = a0;
            if (i3 < scaleTypeArr.length) {
                this.U = scaleTypeArr[i3];
            }
        }
        if (typedArrayH.hasValue(b4j.y5)) {
            this.V = Boolean.valueOf(typedArrayH.getBoolean(b4j.y5, false));
        }
        typedArrayH.recycle();
        T(context2);
    }
}
