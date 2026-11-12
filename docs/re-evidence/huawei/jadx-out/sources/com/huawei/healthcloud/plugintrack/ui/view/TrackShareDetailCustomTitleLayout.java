package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrackShareDetailCustomTitleLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11347c;
    private View d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView h;
    private HealthTextView i;

    public TrackShareDetailCustomTitleLayout(Context context) {
        super(context);
        this.e = null;
        this.f11345a = null;
        this.f = null;
        this.h = null;
        this.i = null;
        a(context);
    }

    public TrackShareDetailCustomTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = null;
        this.f11345a = null;
        this.f = null;
        this.h = null;
        this.i = null;
        a(context);
    }

    private void a(Context context) {
        if (context == null) {
            return;
        }
        this.f11347c = context;
        View.inflate(context, R.layout.track_share_detail_title_custom_view, this);
        this.e = (HealthTextView) findViewById(R.id.track_share_detail_title_chief_data);
        this.f11345a = (HealthTextView) findViewById(R.id.track_share_detail_title_chief_unit);
        this.i = (HealthTextView) findViewById(R.id.track_share_detail_title_start_time);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.track_share_detail_title_username);
        this.f = healthTextView;
        healthTextView.setAutoTextInfo(14, 1, 1);
        this.f.setSingleLine(false);
        this.f.setMaxLines(2);
        if (LanguageUtil.g(context)) {
            HealthTextView healthTextView2 = this.e;
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * 0.75f);
            HealthTextView healthTextView3 = this.f11345a;
            healthTextView3.setTextSize(0, healthTextView3.getTextSize() * 0.75f);
            HealthTextView healthTextView4 = this.i;
            healthTextView4.setTextSize(0, healthTextView4.getTextSize() * 0.75f);
        }
        if (LanguageUtil.c(context) && (this.f11345a.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11345a.getLayoutParams();
            layoutParams.gravity = 17;
            this.f11345a.setLayoutParams(layoutParams);
        }
        this.d = findViewById(R.id.track_share_title_sport);
        this.f11346b = findViewById(R.id.track_share_title_right);
        this.h = (HealthTextView) findViewById(R.id.total_score);
        c();
    }

    private void c() {
        this.e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.TrackShareDetailCustomTitleLayout.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                TrackShareDetailCustomTitleLayout.this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int height = (TrackShareDetailCustomTitleLayout.this.e.getHeight() - TrackShareDetailCustomTitleLayout.this.e.getBaseline()) - (TrackShareDetailCustomTitleLayout.this.i.getHeight() - TrackShareDetailCustomTitleLayout.this.i.getBaseline());
                int height2 = TrackShareDetailCustomTitleLayout.this.d.getHeight() + qrs.d(TrackShareDetailCustomTitleLayout.this.f11347c, 13.8f);
                int height3 = TrackShareDetailCustomTitleLayout.this.f11346b.getHeight() + qrs.d(TrackShareDetailCustomTitleLayout.this.f11347c, 28.0f) + height;
                if (height2 <= height3) {
                    height2 = height3;
                }
                if (TrackShareDetailCustomTitleLayout.this.d.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TrackShareDetailCustomTitleLayout.this.d.getLayoutParams();
                    layoutParams.setMargins(0, height2 - TrackShareDetailCustomTitleLayout.this.d.getHeight(), 0, 0);
                    TrackShareDetailCustomTitleLayout.this.d.setLayoutParams(layoutParams);
                }
                if (TrackShareDetailCustomTitleLayout.this.f11346b.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) TrackShareDetailCustomTitleLayout.this.f11346b.getLayoutParams();
                    layoutParams2.setMargins(0, (height2 - TrackShareDetailCustomTitleLayout.this.f11346b.getHeight()) - height, 0, height);
                    TrackShareDetailCustomTitleLayout.this.f11346b.setLayoutParams(layoutParams2);
                }
            }
        });
    }

    public void e() {
        this.h.setVisibility(0);
        if (LanguageUtil.g(this.f11347c)) {
            this.h.setTextSize(0, this.f11347c.getResources().getDimension(R.dimen.hw_show_font_size_9));
        }
    }

    public void setSportStartTime(String str) {
        this.i.setText(str);
    }

    public void setTextChiefData(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setTextSportType(String str) {
        this.f.setText(str);
    }

    public void setTextChiefUnit(String str) {
        if (str == null || str.length() == 0) {
            this.f11345a.setVisibility(8);
        } else {
            this.f11345a.setText(str);
        }
    }

    public void setTextColor(int i) {
        this.e.setTextColor(i);
        this.f.setTextColor(i);
        this.i.setAlpha(1.0f);
        this.f.setAlpha(1.0f);
        this.h.setAlpha(1.0f);
    }
}
