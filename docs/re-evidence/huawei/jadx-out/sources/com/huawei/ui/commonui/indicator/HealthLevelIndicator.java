package com.huawei.ui.commonui.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qlj;
import defpackage.qrr;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthLevelIndicator extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f23559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IndicatorCircle f23560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f23561c;
    private HealthTextView d;
    private boolean e;
    private HealthTextView g;
    private HealthTextView h;

    public HealthLevelIndicator(Context context) {
        super(context);
        this.e = true;
        b();
    }

    public HealthLevelIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        e(context, attributeSet);
        b();
    }

    public HealthLevelIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        e(context, attributeSet);
        b();
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthLevelIndicator);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthLevelIndicator_isInitIndicator, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.health_level_indicator_layout, this);
        IndicatorCircle indicatorCircle = (IndicatorCircle) viewInflate.findViewById(R.id.health_indicator_circle);
        this.f23560b = indicatorCircle;
        indicatorCircle.b(this, this.e);
        this.f23559a = (HealthTextView) viewInflate.findViewById(R.id.level_name_text);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.level_name_text_three);
        if (qrs.v()) {
            this.f23559a.setVisibility(8);
            this.d.setVisibility(0);
            c(this.d, 20.0f);
        } else {
            this.d.setVisibility(8);
            this.f23559a.setVisibility(0);
        }
        this.f23561c = (LinearLayout) viewInflate.findViewById(R.id.health_indicator_level_layout);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.level_value_text);
        this.h = healthTextView;
        c(healthTextView, 70.0f);
        this.h.setTypeface(qrr.c());
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.level_unit_text);
        this.g = healthTextView2;
        c(healthTextView2, 13.0f);
    }

    public void setAllLevelsData(List<qlj> list) {
        setAllLevelsData(list, null);
    }

    public void setAllLevelsData(List<qlj> list, int[] iArr) {
        if (list != null && iArr != null && list.size() != iArr.length) {
            throw new IllegalArgumentException("levelSize dose not equal to ratioDeltaSize! Please make sure deltaAngles and data have same size when calling setAllLevelsData()");
        }
        try {
            this.f23560b.setData(list, iArr);
        } catch (CloneNotSupportedException e) {
            Log.e("HealthLevelIndicator", "CloneNotSupportedException happened: " + e.getMessage() + ", cause : " + e.getCause());
        }
    }

    public void setLevel(float f, String str) {
        this.f23560b.setLevel(f);
        this.h.setText(str);
    }

    public void setLevel(float f, SpannableString spannableString) {
        this.f23560b.setLevel(f);
        this.h.setText(spannableString);
    }

    void e(String str, int i) {
        this.f23559a.setText(str);
        this.f23559a.setTextColor(i);
        this.d.setText(str);
        this.d.setTextColor(i);
    }

    public void setLevelUnit(String str) {
        this.g.setText(str);
    }

    public void setLevelUnit(SpannableString spannableString) {
        this.g.setText(spannableString);
    }

    private void c(HealthTextView healthTextView, float f) {
        if (qrs.v()) {
            healthTextView.setTextSize(1, f);
        }
    }

    public void c(int i) {
        if (this.f23561c.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23561c.getLayoutParams();
            layoutParams.topMargin = i;
            this.f23561c.setLayoutParams(layoutParams);
        }
    }
}
