package com.huawei.ui.commonui.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qjp;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRingChart extends LinearLayout implements HealthRingChartAdapter.DataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthChart f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23353c;
    private HealthRingChartAdapter d;
    private HealthTextView e;
    private final List<HealthRingChartAdapter.e> f;
    private LinearLayout h;

    public HealthRingChart(Context context) {
        super(context);
        this.f = new ArrayList();
        this.f23352b = context;
        a();
    }

    public HealthRingChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList();
        this.f23352b = context;
        a();
    }

    private void a() {
        View viewInflate = LayoutInflater.from(this.f23352b).inflate(R.layout.health_ring_chart_layout, this);
        this.f23351a = (HealthChart) viewInflate.findViewById(R.id.ring_chart);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.ring_chart_items_container);
        this.f23353c = (HealthTextView) viewInflate.findViewById(R.id.ring_chart_desc);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.ring_chart_desc_oneline);
        if (qrs.v()) {
            this.f23351a.getLayoutParams().height = (int) this.f23352b.getResources().getDimension(R.dimen.health_common_120dp);
            this.f23351a.getLayoutParams().width = (int) this.f23352b.getResources().getDimension(R.dimen.health_common_120dp);
            this.f23353c.setTextSize(1, 16.0f);
            setThreeTextFont(this.e);
        }
    }

    private void setThreeTextFont(HealthTextView healthTextView) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.health_common_24dp);
        healthTextView.setAutoTextSize(0, dimensionPixelSize);
        healthTextView.setAutoTextInfo(dimensionPixelSize, 1, 0);
    }

    public void setAdapter(HealthRingChartAdapter healthRingChartAdapter) {
        this.d = healthRingChartAdapter;
        healthRingChartAdapter.b(this);
        c();
    }

    public HealthRingChartAdapter getAdapter() {
        return this.d;
    }

    public void c(List<qjp> list) {
        HealthRingChartAdapter healthRingChartAdapter = this.d;
        if (healthRingChartAdapter == null) {
            LogUtil.e("HealthRingChart", "updateData failed, cause adapter not set!");
        } else {
            healthRingChartAdapter.e(list);
        }
    }

    public void a(List<Integer> list) {
        HealthRingChartAdapter healthRingChartAdapter = this.d;
        if (healthRingChartAdapter == null) {
            LogUtil.e("HealthRingChart", "updateValues failed, cause adapter not set!");
        } else {
            healthRingChartAdapter.b(list);
        }
    }

    public void setDesc(String str) {
        this.e.setVisibility(8);
        this.f23353c.setVisibility(0);
        if (str.length() >= 4) {
            int length = str.length();
            int i = length / 2;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(str.charAt(i2));
                if (i2 == i - 1) {
                    sb.append(System.lineSeparator());
                }
            }
            this.f23353c.setText(sb);
            return;
        }
        this.f23353c.setText(str);
    }

    public void b(String str) {
        this.f23353c.setVisibility(8);
        this.e.setVisibility(0);
        this.e.setText(str);
    }

    public void setDesc(String str, String str2) {
        this.e.setVisibility(8);
        this.f23353c.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(System.lineSeparator());
        sb.append(str2);
        this.f23353c.setText(sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        float f = 2.1474836E9f;
        float f2 = 2.1474836E9f;
        float f3 = 2.1474836E9f;
        for (int i = 0; i < this.f.size(); i++) {
            HealthRingChartAdapter.e eVar = this.f.get(i);
            float textSize = eVar.f23359b.getTextSize();
            if (textSize < f3) {
                f3 = textSize;
            }
            float textSize2 = eVar.d.getTextSize();
            if (textSize2 < f2) {
                f2 = textSize2;
            }
            float textSize3 = eVar.f23358a.getTextSize();
            if (textSize3 < f) {
                f = textSize3;
            }
        }
        d(f, f3, f2);
    }

    private void d(float f, float f2, float f3) {
        for (HealthRingChartAdapter.e eVar : this.f) {
            if (eVar != null) {
                if (eVar.f23358a != null) {
                    eVar.f23358a.setAutoTextSize(0, f);
                }
                if (eVar.f23359b != null) {
                    eVar.f23359b.setAutoTextSize(0, f2);
                }
                if (eVar.d != null) {
                    eVar.d.setAutoTextSize(0, f3);
                }
            }
        }
    }

    private void c() {
        if (this.h == null) {
            LogUtil.e("HealthRingChart", "ring chart items container not found, refresh data failed!");
            return;
        }
        HealthRingChartAdapter healthRingChartAdapter = this.d;
        if (healthRingChartAdapter == null) {
            LogUtil.e("HealthRingChart", "ring chart adapter not found, refresh data failed!");
            return;
        }
        int iD = healthRingChartAdapter.d();
        int childCount = this.h.getChildCount();
        for (int i = 0; i < iD; i++) {
            if (i >= childCount) {
                this.f.add(this.d.e(this.h));
            }
            this.d.e(this.f.get(i), i);
        }
        if (childCount > iD) {
            this.h.removeViews(iD, childCount - iD);
            this.f.subList(iD, childCount).clear();
        }
        if (this.f23351a != null) {
            int[] iArrB = this.d.b();
            this.f23351a.setChartData(iArrB != null ? a(iArrB) : 0, iArrB, this.d.a(), this.d.c());
        }
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.chart.HealthRingChart.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!HealthRingChart.this.d.e()) {
                    HealthRingChart.this.d();
                }
                HealthRingChart.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private static int a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataListener
    public void onDataUpdate() {
        c();
    }
}
