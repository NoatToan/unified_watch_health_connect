package com.huawei.ui.commonui.flowlayout.textviewbuilder;

import android.content.Context;
import android.graphics.Typeface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qle;
import defpackage.qrs;

/* JADX INFO: loaded from: classes43.dex */
public class OOBETagTextViewBuilder implements ITagTextViewBuilder {
    private Context d;

    public OOBETagTextViewBuilder(Context context) {
        this.d = context == null ? BaseApplication.b() : context;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.d);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(textSize());
        healthTextView.setText(qleVar.e());
        healthTextView.setTextColor(this.d.getResources().getColor(R.color.textColorPrimary));
        healthTextView.setBackgroundResource(R.drawable.oobe_round_rect_gray);
        healthTextView.setTypeface(Typeface.create(this.d.getResources().getString(R.string.textFontFamilyRegular), 0));
        healthTextView.setTag(qleVar);
        healthTextView.setMinWidth(this.d.getResources().getDimensionPixelSize(R.dimen.cs_image_width));
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        return this.d.getResources().getDimensionPixelSize(R.dimen.textSizeBody2) / qrs.j(this.d);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        return this.d.getResources().getDimensionPixelSize(R.dimen.cs_image_width);
    }
}
