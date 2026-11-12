package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;

/* JADX INFO: loaded from: classes31.dex */
public class FinessCardView extends HealthCardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f10190c;
    private Context d;
    private float e;

    public FinessCardView(Context context) {
        this(context, null);
    }

    public FinessCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FinessCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SugFitnessCardView);
        this.e = typedArrayObtainStyledAttributes.getFloat(R.styleable.SugFitnessCardView_float_width_weight, 21.0f);
        this.f10188a = typedArrayObtainStyledAttributes.getFloat(R.styleable.SugFitnessCardView_float_height_weight, 9.0f);
        this.f10189b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SugFitnessCardView_limit_ratio_width, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void e(Context context) {
        HealthColumnSystem healthColumnSystem = this.f10190c;
        if (healthColumnSystem == null) {
            this.f10190c = new HealthColumnSystem(this.d, 1);
        } else {
            healthColumnSystem.b(context);
        }
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        e(this.d);
        int iA = ((int) this.f10190c.a(4)) + (((this.f10190c.c() * 2) - (this.d.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart) * 2)) / (this.f10190c.j() / 4));
        int i3 = (int) ((iA * 9.0f) / 21.0f);
        LogUtil.j("FinessCardView", "onMeasure : ", "itemDeviceWidth : ", Integer.valueOf(iA), " height : ", Integer.valueOf(i3));
        if (this.f10189b) {
            iA = (int) ((this.e * i3) / this.f10188a);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iA, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
}
