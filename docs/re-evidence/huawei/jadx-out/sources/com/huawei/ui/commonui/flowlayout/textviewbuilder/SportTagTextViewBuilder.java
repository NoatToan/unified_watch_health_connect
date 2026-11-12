package com.huawei.ui.commonui.flowlayout.textviewbuilder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qle;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes43.dex */
public class SportTagTextViewBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23531a;

    public SportTagTextViewBuilder(Context context) {
        this.f23531a = context == null ? BaseApplication.b() : context;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.f23531a);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(textSize());
        healthTextView.setText(qleVar.e());
        healthTextView.setTextColor(this.f23531a.getResources().getColor(R.color.textColorPrimary));
        healthTextView.setBackgroundResource(R.drawable.round_rect_gray);
        healthTextView.setTag(qleVar);
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        return (qrs.d(this.f23531a, 12.0f) * 1.0f) / qrs.j(this.f23531a);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        if (LanguageUtil.f(this.f23531a)) {
            int i = qrs.af(this.f23531a) ? 5 : 3;
            return (((this.f23531a.getResources().getDisplayMetrics().widthPixels - (this.f23531a.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalL) * (i - 1))) - (this.f23531a.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) * 2)) - (qrs.d(this.f23531a, 24.0f) * i)) / i;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((textSize() * qrs.j(this.f23531a)) + 0.5f);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        return textPaint.measureText(qleVar.e());
    }
}
