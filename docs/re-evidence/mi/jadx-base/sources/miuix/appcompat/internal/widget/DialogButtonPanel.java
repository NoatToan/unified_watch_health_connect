package miuix.appcompat.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.s6g;
import defpackage.tc8;
import defpackage.vsi;
import defpackage.zy5;

/* JADX INFO: loaded from: classes3.dex */
public class DialogButtonPanel extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26554b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public float i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f26555k;

    public DialogButtonPanel(Context context) {
        this(context, null);
    }

    public final void a() {
        if (this.j) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        boolean z = (((float) this.h) * 1.0f) / ((float) Math.max(tc8.l(this.f26555k).y, 1)) >= 0.4f;
        if (viewGroup == null || !z || (viewGroup instanceof NestedScrollViewExpander) || !(viewGroup instanceof DialogParentPanel2)) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(vsi.z);
        viewGroup.removeView(this);
        if (viewGroup2 != null) {
            viewGroup2.addView(this);
            ((NestedScrollViewExpander) viewGroup2).setExpandView(null);
        }
    }

    public final void b(int i) {
        boolean zG = g((i - getPaddingStart()) - getPaddingEnd());
        int childCount = getChildCount();
        if (!zG) {
            c(childCount);
        } else {
            h((i - getPaddingStart()) - getPaddingEnd());
            d(childCount);
        }
    }

    public final void c(int i) {
        setOrientation(0);
        setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
        boolean zE = dyq.e(this);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            boolean z = childAt.getVisibility() == 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.setMinimumHeight(this.f);
            layoutParams.width = 0;
            layoutParams.height = -2;
            layoutParams.weight = 1.0f;
            layoutParams.topMargin = 0;
            if (z) {
                if (zE) {
                    layoutParams.rightMargin = i2;
                } else {
                    layoutParams.leftMargin = i2;
                }
                if (s6g.s(this.f26555k)) {
                    i(childAt, true);
                }
            } else {
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            if (z) {
                i2 = this.d;
            }
        }
        this.h = i > 0 ? this.f : 0;
    }

    public final void d(int i) {
        setOrientation(1);
        setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            View childAt = getChildAt(i4);
            boolean z = childAt.getVisibility() == 0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.setMinimumHeight(this.f);
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.weight = 0.0f;
            layoutParams.topMargin = z ? i3 : 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            if (z) {
                i3 = this.e;
            }
            if (z) {
                i2++;
            }
            if (z && s6g.s(this.f26555k)) {
                i(childAt, true);
            }
        }
        this.h = i2 > 0 ? (this.f * i2) + ((i2 - 1) * this.e) : 0;
    }

    public void e(boolean z) {
        this.j = z;
    }

    public final boolean f(TextView textView, int i) {
        return ((int) textView.getPaint().measureText(textView.getText().toString())) > (i - textView.getPaddingStart()) - textView.getPaddingEnd();
    }

    public final boolean g(int i) {
        if (this.g) {
            return true;
        }
        int childCount = getChildCount();
        int i2 = childCount;
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() == 8) {
                i2--;
            }
        }
        if (i2 < 2) {
            return false;
        }
        if (i2 >= 3) {
            return true;
        }
        int i4 = (i - this.d) / 2;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((childAt instanceof TextView) && childAt.getVisibility() == 0 && f((TextView) childAt, i4)) {
                return true;
            }
        }
        return false;
    }

    public int getButtonFullyVisibleHeight() {
        return this.h;
    }

    public final void h(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof TextView) && childAt.getVisibility() == 0) {
                TextView textView = (TextView) childAt;
                zy5.b(textView, 17.0f);
                if (f(textView, i)) {
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        View childAt2 = getChildAt(i3);
                        if (childAt2 instanceof TextView) {
                            zy5.b((TextView) childAt2, 14.0f);
                        }
                    }
                    return;
                }
            }
        }
    }

    public final void i(View view, boolean z) {
        if (!(view instanceof TextView) || Build.VERSION.SDK_INT < 28) {
            return;
        }
        ((TextView) view).setFallbackLineSpacing(z);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f26554b;
        this.f26553a = i;
        int i2 = configuration.densityDpi;
        if (i != i2) {
            this.f26554b = i2;
            float f = (i2 * 1.0f) / i;
            this.c = (int) (this.c * f);
            this.d = (int) (this.d * f);
            this.e = (int) (this.e * f);
            this.f = (int) (this.f * f);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof TextView) {
                    zy5.b((TextView) childAt, this.i);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    public void setForceVertical(boolean z) {
        if (this.g != z) {
            this.g = z;
            requestLayout();
        }
    }

    public DialogButtonPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogButtonPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 17.0f;
        this.f26555k = context;
        Resources resources = getResources();
        this.c = resources.getDimensionPixelOffset(dmi.K);
        this.d = resources.getDimensionPixelOffset(dmi.I);
        this.e = resources.getDimensionPixelOffset(dmi.J);
        this.f = resources.getDimensionPixelOffset(dmi.D);
        int i2 = resources.getConfiguration().densityDpi;
        this.f26554b = i2;
        this.f26553a = i2;
    }
}
