package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import defpackage.cqi;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1612b;
    public int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5j.P0);
        c.p0(this, context, z5j.P0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f1611a = typedArrayObtainStyledAttributes.getBoolean(z5j.Q0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1611a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f1612b != z) {
            if (!z || this.f1611a) {
                this.f1612b = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(cqi.L);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f1612b;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iA;
        int paddingTop;
        int iA2;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f1611a) {
            if (size > this.c && b()) {
                setStacked(false);
            }
            this.c = size;
        }
        if (b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (!this.f1611a || b() || (getMeasuredWidthAndState() & (-16777216)) != 16777216) {
            if (z) {
            }
            iA = a(0);
            if (iA >= 0) {
                View childAt = getChildAt(iA);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (b()) {
                    iA2 = a(iA + 1);
                    if (iA2 >= 0) {
                        paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                    }
                    paddingBottom = paddingTop;
                } else {
                    paddingBottom = paddingTop + getPaddingBottom();
                }
            }
            if (c.B(this) != paddingBottom) {
                setMinimumHeight(paddingBottom);
                if (i2 == 0) {
                    super.onMeasure(i, i2);
                }
            }
        }
        setStacked(true);
        super.onMeasure(i, i2);
        iA = a(0);
        if (iA >= 0) {
            View childAt2 = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            paddingTop = getPaddingTop() + childAt2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (b()) {
                iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (c.B(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1611a != z) {
            this.f1611a = z;
            if (!z && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
