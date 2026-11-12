package com.huawei.ui.commonui.chart;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTrendBarChart extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTrendBar f23364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f23366c;
    private HealthTrendBar d;
    private HealthTextView e;
    private e g;
    private HealthTextView i;
    private HealthTextView j;

    public HealthTrendBarChart(Context context) {
        super(context);
        this.f23366c = new e();
        this.g = new e();
        a();
    }

    public HealthTrendBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23366c = new e();
        this.g = new e();
        a();
    }

    public HealthTrendBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23366c = new e();
        this.g = new e();
        a();
    }

    private void a() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.health_trend_bar_chart_layout, this);
        this.d = (HealthTrendBar) viewInflate.findViewById(R.id.primary_bar);
        this.f23364a = (HealthTrendBar) viewInflate.findViewById(R.id.secondary_bar);
        this.f23365b = (HealthTextView) viewInflate.findViewById(R.id.primary_bar_inner_text);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.primary_bar_outer_text);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.secondary_bar_inner_text);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.secondary_bar_outer_text);
        post(new Runnable() { // from class: com.huawei.ui.commonui.chart.HealthTrendBarChart.4
            @Override // java.lang.Runnable
            public void run() {
                if (HealthTrendBarChart.this.f23366c == null && HealthTrendBarChart.this.g == null) {
                    return;
                }
                HealthTrendBarChart.this.d();
            }
        });
    }

    public void setValues(e eVar, e eVar2) {
        this.f23366c = eVar;
        this.g = eVar2;
        if (getWidth() > 0) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iMin;
        int iMax;
        boolean z = false;
        if (this.f23366c.a() && this.g.a()) {
            this.d.setLength(0, false);
            this.f23364a.setLength(0, false);
        } else {
            int i = this.f23366c.f23370c;
            int i2 = this.f23366c.f23369b;
            int i3 = this.g.f23370c;
            int i4 = this.g.f23369b;
            if (i != i3) {
                iMin = Math.min(i, i3);
                iMax = Math.max(i, i3);
                if (i > i3) {
                    z = true;
                }
            } else {
                int iMin2 = Math.min(i2, i4);
                int iMax2 = Math.max(i2, i4);
                if (i2 > i4) {
                    iMin = iMin2;
                    iMax = iMax2;
                    z = true;
                } else {
                    iMin = iMin2;
                    iMax = iMax2;
                }
            }
            float f = iMax != 0 ? iMin / iMax : 0.0f;
            int width = getWidth();
            if (!z) {
                width = (int) (width * f);
            }
            int width2 = !z ? getWidth() : (int) (getWidth() * f);
            this.d.setLength(width, true);
            this.f23364a.setLength(width2, true);
        }
        c();
    }

    private void c() {
        SpannableString spannableStringD = d(this.f23366c.f23368a);
        if (this.f23366c.e() > 0) {
            this.f23365b.setVisibility(0);
            this.e.setVisibility(8);
            this.f23365b.setText(spannableStringD);
        } else {
            this.f23365b.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setText(spannableStringD);
        }
        if (LanguageUtil.c(BaseApplication.b())) {
            this.f23365b.setLayoutDirection(1);
        }
        SpannableString spannableStringD2 = d(this.g.f23368a);
        if (this.g.e() > 0) {
            this.j.setVisibility(0);
            this.i.setVisibility(8);
            this.j.setText(spannableStringD2);
        } else {
            this.j.setVisibility(8);
            this.i.setVisibility(0);
            this.i.setText(spannableStringD2);
        }
    }

    private SpannableString d(String str) {
        if ("--/-- --".equals(str)) {
            return new SpannableString("--");
        }
        SpannableString spannableString = new SpannableString(str);
        if (str.contains("/")) {
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), str.indexOf("/"), str.length(), 33);
        }
        return spannableString;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23370c;

        public e() {
        }

        public e(int i, int i2, String str) {
            this.f23370c = i;
            this.f23369b = i2;
            this.f23368a = str;
        }

        public e(int i, String str) {
            this(i, 0, str);
        }

        public boolean a() {
            return this.f23370c <= 0 && this.f23369b <= 0;
        }

        public int e() {
            return this.f23370c;
        }
    }
}
