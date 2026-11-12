package com.huawei.health.health.utils.vippage.dataauthority;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.inw;
import defpackage.qle;
import defpackage.qre;
import defpackage.qrs;

/* JADX INFO: loaded from: classes28.dex */
public class HealthDataTagTextViewBuilder implements ITagTextViewBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7115b;
    private static TextPaint d;
    private Context e;
    private float h;
    private Typeface j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f7114a = {-22151, -35034, -40115, -39820, -3966209, -11165212};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f7116c = {0.0f, 0.24f, 0.43f, 0.62f, 0.81f, 1.0f};

    public HealthDataTagTextViewBuilder(Context context) {
        context = context == null ? BaseApplication.b() : context;
        this.e = context;
        f7115b = (context.getResources().getDisplayMetrics().widthPixels - (this.e.getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) * 2)) - qrs.d(this.e, 24.0f);
        this.j = Typeface.createFromAsset(this.e.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
    }

    public static void d(TextView textView) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, Math.min(d.measureText(textView.getText().toString()), f7115b) + 24.0f, 0.0f, f7114a, f7116c, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    public static void a(View view) {
        view.setBackground(new inw(qre.b(com.huawei.health.servicesui.R.dimen.health_common_48dp), 1));
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public HealthTextView build(qle qleVar) {
        final HealthTextView healthTextView = new HealthTextView(this.e);
        healthTextView.setGravity(17);
        healthTextView.setTextSize(0, textSize());
        Typeface typeface = this.j;
        if (typeface != null) {
            healthTextView.setTypeface(typeface);
        }
        healthTextView.setText(qleVar.e());
        if (qleVar.k()) {
            healthTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.health.utils.vippage.dataauthority.HealthDataTagTextViewBuilder.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    HealthDataTagTextViewBuilder.d(healthTextView);
                    HealthDataTagTextViewBuilder.a(healthTextView);
                    healthTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        } else {
            healthTextView.setBackgroundResource(com.huawei.health.servicesui.R.drawable.inbox_tag_card_normal);
            healthTextView.setTextColor(ContextCompat.getColor(this.e, R.color.textColorSecondary));
        }
        healthTextView.setMaxLines(1);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
        healthTextView.setIncludeFontPadding(false);
        healthTextView.setMaxWidth(f7115b);
        healthTextView.setTag(qleVar);
        return healthTextView;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textSize() {
        float f = this.h;
        return f <= 0.0f ? qrs.d(this.e, 16.0f) : f;
    }

    @Override // com.huawei.ui.commonui.flowlayout.textviewbuilder.ITagTextViewBuilder
    public float textViewWidth(qle qleVar) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSize());
        Typeface typeface = this.j;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        d = textPaint;
        return Math.min(textPaint.measureText(qleVar.e()), f7115b) + 24.0f;
    }
}
