package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qle;
import defpackage.qrs;

/* JADX INFO: loaded from: classes7.dex */
public class ProductPromoTagTextViewBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7228c;

    public ProductPromoTagTextViewBuilder(Context context) {
        this.f7228c = context == null ? BaseApplication.b() : context;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.f7228c);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(textSize());
        healthTextView.setText(qleVar.e());
        healthTextView.setTextColor(this.f7228c.getResources().getColor(R.color.search_product_price_color));
        healthTextView.setBackgroundResource(R.drawable.round_rect_promo_label);
        healthTextView.setIncludeFontPadding(false);
        healthTextView.setPadding(0, 0, 0, 0);
        healthTextView.setMaxLines(1);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        healthTextView.setTag(qleVar);
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        return (qrs.d(this.f7228c, 9.0f) * 1.0f) / qrs.j(this.f7228c);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((textSize() * qrs.j(this.f7228c)) + 0.5f);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        return textPaint.measureText(qleVar.e());
    }
}
