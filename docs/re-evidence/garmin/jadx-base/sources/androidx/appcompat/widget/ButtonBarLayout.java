package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4950c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4950c = -1;
        int[] iArr = h.a.f80431k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.s0.q(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f4948a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4948a);
        }
    }

    private void setStacked(boolean z14) {
        if (this.f4949b != z14) {
            if (!z14 || this.f4948a) {
                this.f4949b = z14;
                setOrientation(z14 ? 1 : 0);
                setGravity(z14 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z14 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        int iMakeMeasureSpec;
        boolean z14;
        int i16;
        int size = View.MeasureSpec.getSize(i14);
        int paddingBottom = 0;
        if (this.f4948a) {
            if (size > this.f4950c && this.f4949b) {
                setStacked(false);
            }
            this.f4950c = size;
        }
        if (this.f4949b || View.MeasureSpec.getMode(i14) != 1073741824) {
            iMakeMeasureSpec = i14;
            z14 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z14 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i15);
        if (this.f4948a && !this.f4949b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z14 = true;
        }
        if (z14) {
            super.onMeasure(i14, i15);
        }
        int childCount = getChildCount();
        int i17 = 0;
        while (true) {
            i16 = -1;
            if (i17 >= childCount) {
                i17 = -1;
                break;
            } else if (getChildAt(i17).getVisibility() == 0) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0) {
            View childAt = getChildAt(i17);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4949b) {
                int childCount2 = getChildCount();
                for (int i18 = i17 + 1; i18 < childCount2; i18++) {
                    if (getChildAt(i18).getVisibility() == 0) {
                        i16 = i18;
                        break;
                    }
                }
                paddingBottom = i16 >= 0 ? getChildAt(i16).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i15 == 0) {
                super.onMeasure(i14, i15);
            }
        }
    }

    public void setAllowStacking(boolean z14) {
        if (this.f4948a != z14) {
            this.f4948a = z14;
            if (!z14 && this.f4949b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
