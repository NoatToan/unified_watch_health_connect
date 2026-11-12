package com.huawei.health.sport.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import defpackage.qqp;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessCardView extends HealthCardView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthColumnSystem f8819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8821c;
    private int d;
    private Context e;
    private Pair<Integer, Integer> f;
    private float j;

    public FitnessCardView(Context context) {
        this(context, null);
    }

    public FitnessCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FitnessCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = BaseActivity.getSafeRegionWidth();
        this.e = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SugFitnessCardView);
        this.j = typedArrayObtainStyledAttributes.getFloat(R.styleable.SugFitnessCardView_float_width_weight, 21.0f);
        this.f8821c = typedArrayObtainStyledAttributes.getFloat(R.styleable.SugFitnessCardView_float_height_weight, 9.0f);
        this.f8820b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SugFitnessCardView_limit_ratio_width, false);
        this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.SugFitnessCardView_max_column_number, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b(Context context) {
        HealthColumnSystem healthColumnSystem = this.f8819a;
        if (healthColumnSystem == null) {
            this.f8819a = new HealthColumnSystem(this.e, 1);
        } else {
            healthColumnSystem.b(context);
        }
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int dimension;
        b(this.e);
        int iJ = this.f8819a.j() / 4;
        int i3 = this.d;
        if (i3 > 0) {
            iJ = Math.min(i3, iJ);
        }
        if (iJ == 0) {
            iJ = 1;
        }
        if (iJ > 1) {
            dimension = (int) ((((this.e.getResources().getDisplayMetrics().widthPixels - this.e.getResources().getDimension(R.dimen.defaultPaddingStart)) - this.e.getResources().getDimension(R.dimen.defaultPaddingEnd)) - ((iJ - 1) * qqp.b(this.e))) / iJ);
        } else {
            dimension = (int) ((((this.e.getResources().getDisplayMetrics().widthPixels - this.e.getResources().getDimension(R.dimen.defaultPaddingStart)) - this.e.getResources().getDimension(R.dimen.defaultPaddingEnd)) - ((Integer) this.f.first).intValue()) - ((Integer) this.f.second).intValue());
        }
        int i4 = (int) ((dimension * 9.0f) / 21.0f);
        if (this.f8820b) {
            dimension = (int) ((this.j * i4) / this.f8821c);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dimension, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public void setWidthWeight(float f) {
        this.j = f;
    }

    public void setHeightWeight(float f) {
        this.f8821c = f;
    }

    public void setIsRatioWidth(boolean z) {
        this.f8820b = z;
    }
}
