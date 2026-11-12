package com.huawei.ui.commonui.gridview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.huawei.ui.commonui.R;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class HealthGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23534b;
    private boolean e;

    public HealthGridView(Context context) {
        super(context);
        this.f23534b = false;
        this.f23533a = 0;
        c(context, null, 0, 0);
    }

    public HealthGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23534b = false;
        this.f23533a = 0;
        c(context, attributeSet, 0, 0);
    }

    public HealthGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23534b = false;
        this.f23533a = 0;
        c(context, attributeSet, i, 0);
    }

    private void c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthGridView);
            this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthGridView_isOnlyItemSameHeight, false);
            this.f23534b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthGridView_needsExactCalculateHeight, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.f23533a;
        if (i3 > 0 && !this.e) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        if (this.f23534b) {
            this.f23534b = this.e;
            post(new Runnable() { // from class: qlk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46444b.a();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int childCount = getChildCount();
        int numColumns = getNumColumns();
        if (childCount == 0 || numColumns <= 0) {
            LogUtil.d("HealthGridView", "calculateAndSetExactHeight childCount: ", Integer.valueOf(childCount), ", numColumns: ", Integer.valueOf(numColumns));
            return;
        }
        this.f23534b = false;
        int iCeil = (int) Math.ceil(((double) getAdapter().getCount()) / ((double) numColumns));
        ArrayList<View> arrayList = new ArrayList<>();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            arrayList.add(childAt);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i) {
                i = measuredHeight;
            }
            if (i2 % numColumns == numColumns - 1 || i2 == childCount - 1) {
                this.f23533a += i;
                a(arrayList, i);
                i = 0;
            }
        }
        this.f23533a += (getVerticalSpacing() * Math.max(0, iCeil - 1)) + getPaddingTop() + getPaddingBottom();
        requestLayout();
    }

    private void a(ArrayList<View> arrayList, int i) {
        while (!arrayList.isEmpty()) {
            View viewRemove = arrayList.remove(0);
            ViewGroup.LayoutParams layoutParams = viewRemove.getLayoutParams();
            layoutParams.height = i;
            viewRemove.setLayoutParams(layoutParams);
        }
    }
}
