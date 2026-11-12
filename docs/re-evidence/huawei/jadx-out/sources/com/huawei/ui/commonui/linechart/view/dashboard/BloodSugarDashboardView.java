package com.huawei.ui.commonui.linechart.view.dashboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BloodSugarDashboardView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23744c;
    private List<DashboardRingView.a> d;
    private HealthTextView e;
    private float f;
    private float g;
    private LinearLayout h;
    private DashboardRingView i;
    private HealthTextView j;

    public BloodSugarDashboardView(Context context) {
        this(context, null);
    }

    public BloodSugarDashboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarDashboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 33.0f;
        this.g = 1.0f;
        this.f23742a = 1.0f;
        d(context);
    }

    public void setCurrentValue(float f) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        HealthTextView healthTextView = this.f23743b;
        if (healthTextView != null) {
            healthTextView.setText(decimalFormat.format(f));
        }
        this.f23742a = f;
    }

    public void setCurrentValueText(String str) {
        HealthTextView healthTextView = this.f23743b;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void setCurrentValueTextUnit(String str) {
        if (this.f23743b != null) {
            this.e.setText(str);
        }
    }

    public void setStatusText(String str, int i) {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_unit);
        if (this.j != null) {
            if (qrs.v()) {
                this.j.setTextSize(1, 28.0f);
                healthTextView.setTextSize(1, 24.0f);
            } else {
                this.j.setTextSize(1, 14.0f);
                healthTextView.setTextSize(1, 12.0f);
            }
            this.j.setText(str);
            this.j.setTextColor(i);
        }
    }

    public void setRingAreas(float f, float f2, List<DashboardRingView.a> list) {
        if (f > f2) {
            Log.e("BloodSugarDashboardView", "the minValue and maxValue is invalid");
            return;
        }
        this.g = f;
        this.f = f2;
        this.d = list;
    }

    public void b() {
        DashboardRingView dashboardRingView = this.i;
        if (dashboardRingView == null) {
            LogUtil.j("BloodSugarDashboardView", "the mRingView is null, return;");
            return;
        }
        dashboardRingView.setMinValue(this.g);
        this.i.setMaxValue(this.f);
        this.i.setRingArcAreaList(this.d);
        this.i.setCurrentValue(this.f23742a);
        this.i.b();
    }

    private void d(Context context) {
        this.f23744c = context;
        inflate(context, R.layout.layout_blood_sugar_dashbord, this);
        this.f23743b = (HealthTextView) findViewById(R.id.tv_current_value);
        this.e = (HealthTextView) findViewById(R.id.tv_unit);
        this.h = (LinearLayout) findViewById(R.id.current_value_container);
        this.j = (HealthTextView) findViewById(R.id.tv_status);
        DashboardRingView dashboardRingView = (DashboardRingView) findViewById(R.id.dashboard_ring_view);
        this.i = dashboardRingView;
        dashboardRingView.setMinValue(1.0f);
        this.i.setMaxValue(33.0f);
        this.f23743b.setTypeface(Typeface.createFromAsset(BaseApplication.b().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!LanguageUtil.l(this.f23744c) || this.j.getMeasureWidth() > this.i.getRadius()) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int measuredHeight = this.j.getMeasuredHeight() / 2;
            Context context = this.f23744c;
            int iA = qqp.a(context, context.getResources().getDimensionPixelSize(R.dimen.textParagraphMarginXS));
            setMeasuredDimension(size, size2 + iA + measuredHeight);
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, measuredHeight + iA, 0, 0);
                this.j.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = this.h.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.setMargins(0, -iA, 0, 0);
                this.h.setLayoutParams(layoutParams4);
            }
        }
    }
}
