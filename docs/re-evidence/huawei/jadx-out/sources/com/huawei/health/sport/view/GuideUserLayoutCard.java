package com.huawei.health.sport.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class GuideUserLayoutCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f8822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f8823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f8824c;
    private HealthTextView d;
    private HealthTextView e;

    public void a() {
    }

    public void a(View view) {
    }

    public void d() {
    }

    public GuideUserLayoutCard(Context context) {
        super(context);
        c(context);
    }

    public GuideUserLayoutCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public GuideUserLayoutCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.guide_card_dialog, this);
        HealthImageView healthImageView = (HealthImageView) findViewById(R.id.exit_label);
        ((LinearLayout) findViewById(R.id.detail_layout)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.sport.view.GuideUserLayoutCard.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("DietDiaryEnergyCard", "goToDietDiaryFastRecord");
                GuideUserLayoutCard.this.d();
            }
        });
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.sport.view.GuideUserLayoutCard.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("DietDiaryEnergyCard", "customViewDialog dismiss");
                GuideUserLayoutCard.this.a();
            }
        });
        this.f8824c = (HealthTextView) findViewById(R.id.guide_title_text);
        this.e = (HealthTextView) findViewById(R.id.main_description_text);
        this.f8822a = (HealthTextView) findViewById(R.id.detail_describe_text);
        this.f8823b = (HealthImageView) findViewById(R.id.image_label);
        this.d = (HealthTextView) findViewById(R.id.guide_text);
        a(viewInflate);
    }

    private void setMainDescription(String str) {
        this.e.setText(str);
    }

    private void setTitle(String str) {
        this.f8824c.setText(str);
    }

    private void setDetailDescription(String str) {
        this.f8822a.setText(str);
    }

    private void setGuide(String str) {
        this.d.setText(str);
    }

    private void setImageView(int i) {
        this.f8823b.setBackground(ContextCompat.getDrawable(BaseApplication.b(), i));
    }
}
