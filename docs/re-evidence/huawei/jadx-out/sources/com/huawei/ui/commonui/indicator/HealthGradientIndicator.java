package com.huawei.ui.commonui.indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes16.dex */
public class HealthGradientIndicator extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GradientCircle f23556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23558c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;

    public HealthGradientIndicator(Context context) {
        super(context);
        e(context);
    }

    public HealthGradientIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public HealthGradientIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_gradient_indicator_layout, this);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.gradient_name_text);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.gradient_data_text);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.gradient_unit_text);
        this.f23556a = (GradientCircle) viewInflate.findViewById(R.id.gradient_circle);
    }

    public HealthGradientIndicator c(float f) {
        this.f23558c = f;
        return this;
    }

    public HealthGradientIndicator b(String str) {
        this.d.setText(str);
        return this;
    }

    public HealthGradientIndicator a(String str) {
        this.f.setText(str);
        return this;
    }

    public HealthGradientIndicator b(float f, String str) {
        this.f23557b = f;
        this.e.setText(str);
        return this;
    }

    public void d() {
        this.f23556a.e(this.f23557b, this.f23558c);
    }
}
