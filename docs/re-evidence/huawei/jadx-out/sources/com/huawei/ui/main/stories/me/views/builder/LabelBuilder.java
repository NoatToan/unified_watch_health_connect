package com.huawei.ui.main.stories.me.views.builder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.inz;
import defpackage.qle;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class LabelBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LabelListener f28544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28545c;
    private Context e;

    public interface LabelListener {
        void onItemClick(inz inzVar, int i);
    }

    public LabelBuilder(Context context, int i, LabelListener labelListener) {
        this.e = context;
        this.f28543a = i;
        this.f28544b = labelListener;
        this.f28545c = context.getResources().getDisplayMetrics().widthPixels - this.e.getResources().getDimensionPixelSize(R.dimen.health_common_56dp);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        HealthTextView healthTextView = new HealthTextView(this.e);
        healthTextView.setTextSize(textSize());
        healthTextView.setMaxLines(1);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        healthTextView.setMaxWidth(this.f28545c);
        healthTextView.setText(qleVar.e());
        healthTextView.setTextColor(ContextCompat.getColor(healthTextView.getContext(), R.color.textColorPrimary));
        healthTextView.setBackgroundResource(R.drawable.round_rect_gray);
        healthTextView.setTag(qleVar);
        healthTextView.setIncludeFontPadding(false);
        Resources resources = healthTextView.getResources();
        healthTextView.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.health_common_4dp));
        int i = this.f28543a;
        if (i != 0) {
            Drawable drawable = ContextCompat.getDrawable(this.e, i);
            if (drawable == null) {
                LogUtil.d("LabelBuilder", "drawable == null");
                return healthTextView;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.common_margin_16dp);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.health_common_2dp);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.health_common_20dp);
            if (LanguageUtil.ba(this.e)) {
                healthTextView.setGravity(8388627);
                healthTextView.setPadding(dimensionPixelSize3, 0, dimensionPixelSize2, 0);
                healthTextView.setCompoundDrawables(drawable, null, null, null);
            } else {
                healthTextView.setGravity(8388629);
                healthTextView.setCompoundDrawables(null, null, drawable, null);
                healthTextView.setPadding(dimensionPixelSize2, 0, dimensionPixelSize3, 0);
            }
        } else {
            healthTextView.setGravity(17);
        }
        if (this.f28544b == null || !(qleVar instanceof inz)) {
            return healthTextView;
        }
        final inz inzVar = (inz) qleVar;
        healthTextView.setText(inzVar.a());
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: vwl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(inzVar, view);
            }
        });
        return healthTextView;
    }

    public /* synthetic */ void c(inz inzVar, View view) {
        if (qrs.c(500)) {
            return;
        }
        int iC = inzVar.c();
        LabelListener labelListener = this.f28544b;
        if (labelListener == null) {
            return;
        }
        if (iC == 1) {
            labelListener.onItemClick(inzVar, 0);
        } else {
            labelListener.onItemClick(inzVar, 1);
        }
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        return (qrs.d(this.e, 14.0f) * 1.0f) / qrs.j(this.e);
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((textSize() * qrs.j(this.e)) + 0.5f);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        return Math.min(textPaint.measureText(qleVar.e()), this.f28545c) + this.e.getResources().getDimensionPixelSize(R.dimen.health_common_42dp);
    }
}
