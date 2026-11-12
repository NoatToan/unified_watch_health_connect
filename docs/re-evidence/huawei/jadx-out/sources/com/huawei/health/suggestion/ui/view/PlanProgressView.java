package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.ped;
import defpackage.pei;
import defpackage.qrs;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class PlanProgressView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Float f10194a = Float.valueOf(24.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthProgressBar f10195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10196c;
    private float d;
    private HealthTextView e;
    private HealthTextView f;
    private int h;
    private int j;

    public PlanProgressView(Context context) {
        this(context, null);
    }

    public PlanProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        View.inflate(context, R.layout.sug_plan_progress, this);
        this.f10195b = (HealthProgressBar) findViewById(R.id.sug_plan_progress);
        this.f = (HealthTextView) findViewById(R.id.sug_txt_plan_progress);
        this.e = (HealthTextView) findViewById(R.id.sug_txt_plan_total);
        this.h = com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal;
        LogUtil.d("Suggestion_PlanProgressView", "mProgressBar:", String.valueOf(this.f10195b), ",mTxtProgress:", String.valueOf(this.f), ",mTxtMax:", String.valueOf(this.e));
        if (qrs.ac()) {
            HealthTextView healthTextView = this.e;
            Float f = f10194a;
            healthTextView.setTextSize(1, f.floatValue());
            this.f.setTextSize(1, f.floatValue());
        }
    }

    private void c() {
        if (this.j == 0) {
            String strF = ped.f(this.f10196c);
            String strF2 = ped.f(this.d);
            this.e.setText(gzx.d(getUnitResId(), (int) this.f10196c, strF));
            this.f.setText(strF2);
        } else {
            String strF3 = ped.f(this.f10196c);
            String strF4 = ped.f(this.d);
            this.e.setText(pei.c(getContext(), getUnitResId(), strF3));
            this.f.setText(strF4);
        }
        this.f10195b.setMax((int) this.f10196c);
        this.f10195b.setProgress((int) this.d);
    }

    public void setMax(float f) {
        this.f10196c = (float) a(f);
        c();
    }

    public float getMax() {
        return this.f10196c;
    }

    public void setProgress(float f) {
        this.d = (float) a(f);
        c();
    }

    public int getUnitResId() {
        if (this.j == 0) {
            this.h = gzw.a();
        } else {
            this.h = com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal;
        }
        return this.h;
    }

    private double a(double d) {
        return (UnitUtil.f() && this.j == 0) ? UnitUtil.e(d, 3) : d;
    }

    public void setType(int i) {
        this.j = i;
        c();
    }
}
