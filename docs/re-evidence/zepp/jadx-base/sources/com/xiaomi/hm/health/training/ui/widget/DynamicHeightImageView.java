package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class DynamicHeightImageView extends AppCompatImageView {
    public double mHeightRatio;

    public DynamicHeightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHeightRatio = 0.0d;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DynamicHeightImageView);
            this.mHeightRatio = typedArrayObtainStyledAttributes.getFloat(R.styleable.DynamicHeightImageView_dhiv_heightRatio, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public double getHeightRatio() {
        return this.mHeightRatio;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mHeightRatio <= 0.001d) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) (((double) size) * this.mHeightRatio));
        }
    }

    public void setHeightRatio(double d) {
        if (d != this.mHeightRatio) {
            this.mHeightRatio = d;
            requestLayout();
        }
    }

    public DynamicHeightImageView(Context context) {
        this(context, null);
    }
}
