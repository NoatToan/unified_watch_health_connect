package com.huawei.ui.commonui.flowlayout.textviewbuilder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qle;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class SearchTagTextViewBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23528a;
    private int d;
    private float i;
    private int e = R.color.textColorPrimary;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23530c = "sans-serif-medium";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23529b = R.drawable.round_rect_gray;

    public SearchTagTextViewBuilder(Context context) {
        context = context == null ? BaseApplication.b() : context;
        this.f23528a = context;
        this.d = (context.getResources().getDisplayMetrics().widthPixels - (this.f23528a.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) * 2)) - qrs.d(this.f23528a, 24.0f);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.f23528a);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(0, textSize());
        healthTextView.setText(qleVar.e());
        healthTextView.setTextColor(this.f23528a.getResources().getColor(this.e));
        healthTextView.setBackgroundResource(this.f23529b);
        healthTextView.setMaxLines(1);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        healthTextView.setIncludeFontPadding(false);
        healthTextView.setMaxWidth(this.d);
        healthTextView.setTag(qleVar);
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        float f = this.i;
        return f <= 0.0f ? qrs.d(this.f23528a, 12.0f) : f;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSize());
        textPaint.setTypeface(Typeface.create(this.f23530c, 0));
        return Math.min(textPaint.measureText(qleVar.e()), this.d);
    }

    public SearchTagTextViewBuilder a(int i) {
        this.i = this.f23528a.getResources().getDimension(i);
        return this;
    }

    public SearchTagTextViewBuilder d(int i) {
        this.e = i;
        return this;
    }

    public SearchTagTextViewBuilder e(int i) {
        this.f23530c = this.f23528a.getResources().getString(i);
        return this;
    }

    public SearchTagTextViewBuilder c(int i) {
        this.f23529b = i;
        return this;
    }
}
