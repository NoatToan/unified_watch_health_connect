package com.huawei.ui.main.stories.health.bloodpressure;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qle;
import defpackage.qrs;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureTagTextViewBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27818b = "sans-serif-medium";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f27819c;
    private int d;
    private Context e;

    public BloodPressureTagTextViewBuilder(Context context) {
        context = context == null ? BaseApplication.b() : context;
        this.e = context;
        this.d = (context.getResources().getDisplayMetrics().widthPixels - (this.e.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) * 2)) - qrs.d(this.e, 24.0f);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.e);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(0, textSize());
        healthTextView.setText(qleVar.e());
        if (qleVar.k()) {
            healthTextView.setBackgroundResource(com.huawei.ui.main.R.drawable.blood_measure_card_select);
            healthTextView.setTextColor(ContextCompat.getColor(this.e, R.color.textColorPrimaryInverse));
        } else {
            healthTextView.setBackgroundResource(com.huawei.ui.main.R.drawable.blood_measure_card_normal);
            healthTextView.setTextColor(ContextCompat.getColor(this.e, R.color.textColorSecondary));
        }
        healthTextView.setMaxLines(1);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        healthTextView.setIncludeFontPadding(false);
        healthTextView.setMaxWidth(this.d);
        healthTextView.setTag(qleVar);
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        float f = this.f27819c;
        return f <= 0.0f ? qrs.d(this.e, 12.0f) : f;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSize());
        textPaint.setTypeface(Typeface.create(this.f27818b, 0));
        return Math.min(textPaint.measureText(qleVar.e()), this.d);
    }
}
