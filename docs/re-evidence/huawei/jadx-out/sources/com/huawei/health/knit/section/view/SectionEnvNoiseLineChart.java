package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.trackview.SleepLineChartHolder;
import defpackage.fre;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionEnvNoiseLineChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LineChart f7788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7789c;
    private HealthTextView d;
    private List<Integer> e;
    private String f;
    private SleepLineChartHolder g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private LinearLayout k;
    private HealthTextView l;
    private ImageView m;
    private HealthTextView n;
    private View o;

    private int d(int i) {
        if (i <= 20) {
            return 0;
        }
        if (i <= 27) {
            return 1;
        }
        if (i <= 35) {
            return 2;
        }
        if (i <= 40) {
            return 3;
        }
        if (i <= 50) {
            return 4;
        }
        if (i <= 60) {
            return 5;
        }
        return i <= 74 ? 6 : 7;
    }

    public SectionEnvNoiseLineChart(Context context) {
        this(context, null);
    }

    public SectionEnvNoiseLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionEnvNoiseLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList();
        this.g = null;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionEnvNoiseLineChart", "onCreateView");
        this.f7787a = context;
        this.g = new SleepLineChartHolder(context);
        e();
        return this.o;
    }

    private void e() {
        if (this.o == null) {
            LogUtil.j("SectionEnvNoiseLineChart", "initView mainView is null, start to inflate");
            this.o = LayoutInflater.from(this.f7787a).inflate(R.layout.section_envnoise_linechart, (ViewGroup) this, false);
        }
        this.k = (LinearLayout) this.o.findViewById(R.id.section_envnoise);
        this.f7788b = (LineChart) this.o.findViewById(R.id.envnoise_linechart);
        if (LanguageUtil.ba(this.f7787a)) {
            this.f7788b.setRotationY(180.0f);
            LineChart lineChart = this.f7788b;
            lineChart.setRendererLeftYAxis(new fre(lineChart.getViewPortHandler(), this.f7788b.getAxisLeft(), this.f7788b.getTransformer(YAxis.AxisDependency.LEFT), true));
        }
        this.f7788b.setNoDataText(this.f7787a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_device_wifi_no_record));
        this.l = (HealthTextView) this.o.findViewById(R.id.env_noise_title);
        this.n = (HealthTextView) this.o.findViewById(R.id.unit_db);
        this.f7789c = (ImageView) this.o.findViewById(R.id.moon);
        this.m = (ImageView) this.o.findViewById(R.id.sun);
        if (qrs.x(this.f7787a)) {
            this.f7789c.setColorFilter(this.f7787a.getResources().getColor(R.color.common_white_95alpha));
            this.m.setColorFilter(this.f7787a.getResources().getColor(R.color.common_white_95alpha));
        }
        this.j = (HealthTextView) this.o.findViewById(R.id.sleep_start_time);
        this.i = (HealthTextView) this.o.findViewById(R.id.sleep_end_time);
        this.h = (HealthTextView) this.o.findViewById(R.id.region_definition);
        this.d = (HealthTextView) this.o.findViewById(R.id.env_noise_description);
        if (LanguageUtil.af(this.f7787a)) {
            this.d.setBreakStrategy(2);
            this.d.setHyphenationFrequency(2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionEnvNoiseLineChart", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionEnvNoiseLineChart", "no need to bind");
            return;
        }
        long jE = qqw.e((Map) map, "SLEEP_START_TIME", 0L);
        LogUtil.a("SectionEnvNoiseLineChart", "start to set sleepStartTime");
        qsp.b(this.j, b(jE));
        LogUtil.a("SectionEnvNoiseLineChart", "start to set sleepEndTime");
        qsp.b(this.i, b(qqw.e((Map) map, "SLEEP_END_TIME", 0L)));
        qsp.b(this.l, qqw.d((Map) map, "ENV_NOISE_TITLE", ""));
        qsp.b(this.n, qqw.d((Map) map, "ENV_NOISE_UNIT", ""));
        qsp.b(this.h, qqw.d((Map) map, "ENV_NOISE_REGION_DEFINITION", ""));
        LogUtil.a("SectionEnvNoiseLineChart", "start to set envNoiseDescription");
        int iC = qqw.c(map, "ENVIRONMENTAL_NOISE_AVERAGEDB", 20);
        String strE = UnitUtil.e(iC, 1, 0);
        this.f = getResources().getStringArray(R.array.IDS_envnoise_description)[d(iC)];
        qsp.b(this.d, String.format(Locale.ENGLISH, this.f, strE));
        LogUtil.a("SectionEnvNoiseLineChart", "start to set envNoiseDataList");
        String strD = qqw.d((Map) map, "ENVIRONMENTAL_NOISE_DATA_LIST", "");
        if (TextUtils.isEmpty(strD)) {
            this.k.setVisibility(8);
            return;
        }
        this.k.setVisibility(0);
        this.e.clear();
        d(strD);
        this.g.c(this.e);
        a();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionEnvNoiseLineChart";
    }

    private String b(long j) {
        return DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE);
    }

    private void d(String str) {
        if (str == null || str.length() < 3) {
            LogUtil.e("SectionEnvNoiseLineChart", "environmental noise data is empty!");
            return;
        }
        for (String str2 : str.substring(1, str.length() - 1).split(",")) {
            try {
                this.e.add(Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException e) {
                LogUtil.e("SectionEnvNoiseLineChart", "mEnvNoiseDataList add exception", e.getMessage());
            }
        }
        LogUtil.a("SectionEnvNoiseLineChart", Integer.valueOf(this.e.size()));
    }

    private void a() {
        this.g.e(this.f7788b, new SleepLineChartHolder.d().c(!qqs.e(this.f7787a)));
    }

    public void setRootLayoutVisibility(int i) {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }
}
