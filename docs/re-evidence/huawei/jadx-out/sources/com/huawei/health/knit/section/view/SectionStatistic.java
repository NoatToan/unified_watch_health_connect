package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionStatistic extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRingChart f7946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7948c;
    private Context d;
    private HealthTextView e;
    private LinearLayout f;
    private HealthTextView g;
    private View h;
    private LinearLayout i;
    private HealthTextView j;

    public SectionStatistic(Context context) {
        this(context, null);
        this.d = context;
    }

    public SectionStatistic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionStatistic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7947b = 0;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        LogUtil.a("SectionStatistic", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_statistic_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.f = linearLayout;
        linearLayout.post(new Runnable() { // from class: fwg
            @Override // java.lang.Runnable
            public final void run() {
                this.f34634b.c(context);
            }
        });
        this.i = (LinearLayout) viewInflate.findViewById(R.id.stress_trend_average);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.currentAverageStressValue);
        this.h = viewInflate.findViewById(R.id.verticalLine);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.pressureTrendRange);
        d(context);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.pressureAdvice);
        this.f7948c = viewInflate.findViewById(R.id.pieChartLayout);
        this.f7946a = (HealthRingChart) viewInflate.findViewById(R.id.pieChartView);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(context, new qjm(false, true));
        healthRingChartAdapter.c(new HealthRingChartAdapter.DataFormatter() { // from class: fwf
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return UnitUtil.e(qjpVar.e(), 2, 0);
            }
        });
        this.f7946a.setAdapter(healthRingChartAdapter);
        return viewInflate;
    }

    public /* synthetic */ void c(Context context) {
        this.f.setMinimumWidth(qrs.i(context));
    }

    private void d(Context context) {
        if (qrs.v()) {
            LogUtil.a("SectionStatistic", "modifyLargeFontScale is large scale");
            this.i.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = b(context, 0.25f);
            this.h.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            layoutParams2.weight = 0.0f;
            this.e.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.height = -2;
            layoutParams3.weight = 0.0f;
            this.j.setLayoutParams(layoutParams3);
        }
    }

    private int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        qsp.b(this.e, (CharSequence) qqw.a(map, "STATISTIC_AVERAGE", (Class<Object>) SpannableStringBuilder.class, (Object) null));
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) qqw.a(map, "STATISTIC_MAX_MIN", (Class<Object>) SpannableStringBuilder.class, (Object) null);
        if (spannableStringBuilder != null) {
            this.h.setVisibility(0);
            this.j.setVisibility(0);
            this.j.setText(spannableStringBuilder);
        }
        List listA = qqw.a((Map) map, "PIE_CHART_DESC", String.class, (List) null);
        if (LanguageUtil.o(this.d) && listA.size() == 2) {
            this.f7946a.setDesc((String) listA.get(0), (String) listA.get(1));
        }
        this.f7946a.c(qqw.a((Map) map, "PIE_CHART_ITEM", qjp.class, (List) null));
        qsp.b(this.g, (CharSequence) qqw.a(map, "ADVICE", (Class<Object>) String.class, (Object) null));
        this.f7947b = qqw.c(map, "ADVICE_HAVE_DATA", 0);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionStatistic";
    }

    public void setPieChartLayoutVisibility(int i) {
        View view = this.f7948c;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void setPressureAdviceTvVisibility(int i) {
        HealthTextView healthTextView = this.g;
        if (healthTextView != null && this.f7947b == 0) {
            healthTextView.setVisibility(8);
        } else if (healthTextView != null) {
            healthTextView.setVisibility(i);
        }
    }
}
