package com.huawei.ui.commonui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes43.dex */
public class HealthRatioImageView extends AppCompatImageView {
    private float e;

    public HealthRatioImageView(Context context) {
        super(context);
    }

    public HealthRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public HealthRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthRatioImageView);
        this.e = typedArrayObtainStyledAttributes.getFloat(R.styleable.HealthRatioImageView_widthHeightRatio, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public float getWidthHeightRatio() {
        return this.e;
    }

    public void setWidthHeightRatio(float f) {
        this.e = f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e <= 0.0f) {
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) (size / this.e));
    }
}
