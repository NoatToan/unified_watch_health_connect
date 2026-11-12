package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.chart.BloodOxygenBarChartView;
import com.huawei.health.knit.section.listener.OnDataChangedListener;
import com.huawei.health.knit.section.listener.OnMarkViewTextNotify;
import com.huawei.health.knit.section.listener.OnXRangeTextCallback;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.lrd;
import defpackage.qly;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class SectionBloodOxygenBaseBarChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBarScrollChartHolder f7762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7764c;
    private BloodOxygenBarChartView d;
    private LinearLayout e;
    private List<String> f;
    private qto<View> g;
    private Context h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private LinearLayout l;
    private HealthViewPager m;
    private HealthTextView n;
    private LinearLayout o;
    private ImageView p;
    private HealthTextView q;
    private ImageView r;
    private View s;
    private HealthTextView t;
    private ArrayList<View> u;
    private HealthTextView v;
    private final AtomicBoolean w;
    private final AtomicBoolean y;

    public SectionBloodOxygenBaseBarChart(Context context) {
        this(context, null);
    }

    public SectionBloodOxygenBaseBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionBloodOxygenBaseBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.f7764c = 0;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.h = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_bar_chart, (ViewGroup) this, false);
        setIntervalLegendLayout(viewInflate);
        this.r = (ImageView) viewInflate.findViewById(R.id.image_up_arrow_left);
        this.p = (ImageView) viewInflate.findViewById(R.id.image_up_arrow_right);
        this.n = (HealthTextView) viewInflate.findViewById(R.id.detail_time_date);
        this.i = (HealthTextView) viewInflate.findViewById(R.id.cursor_time);
        this.k = (HealthTextView) viewInflate.findViewById(R.id.cursor_value);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.cursor_step);
        this.o = (LinearLayout) viewInflate.findViewById(R.id.horizontal_jump);
        this.m = (HealthViewPager) viewInflate.findViewById(R.id.detail_view_pager);
        this.o.setVisibility(8);
        e();
        c();
        a();
        g();
        j();
        return viewInflate;
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DataInfos.values().length];
            e = iArr;
            try {
                iArr[DataInfos.BloodOxygenWeekDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[DataInfos.BloodOxygenMonthDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[DataInfos.BloodOxygenYearDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void setAccessibilityArrowDescription(DataInfos dataInfos) {
        int i = AnonymousClass5.e[dataInfos.ordinal()];
        if (i == 1) {
            lrd.b(this.r, qre.f(R.string.accessibility_last_week));
            lrd.b(this.p, qre.f(R.string.accessibility_next_week));
        } else if (i == 2) {
            lrd.b(this.r, qre.f(R.string.accessibility_last_month));
            lrd.b(this.p, qre.f(R.string.accessibility_next_month));
        } else if (i == 3) {
            lrd.b(this.r, qre.f(R.string.accessibility_last_year));
            lrd.b(this.p, qre.f(R.string.accessibility_next_year));
        } else {
            ReleaseLogUtil.d("SectionBloodOxygenBaseBarChart", "unknown type chart");
        }
    }

    private void setIntervalLegendLayout(View view) {
        if (qrs.u()) {
            e(view, R.id.interval_legend_viewstub_treble, R.id.interval_legend_viewstub_treble_inflated);
        } else {
            e(view, R.id.interval_legend_viewstub, R.id.interval_legend_viewstub_inflated);
        }
        View view2 = this.s;
        if (view2 != null) {
            this.q = (HealthTextView) view2.findViewById(R.id.blood_oxygen_measure_range_1);
            this.t = (HealthTextView) this.s.findViewById(R.id.blood_oxygen_measure_range_2);
            this.v = (HealthTextView) this.s.findViewById(R.id.blood_oxygen_measure_range_3);
            this.f7763b = (LinearLayout) this.s.findViewById(R.id.legend_layout_5);
            this.e = (LinearLayout) this.s.findViewById(R.id.legend_layout_abnormal);
            LinearLayout linearLayout = (LinearLayout) this.s.findViewById(R.id.extra_line_legend_layout);
            this.l = linearLayout;
            linearLayout.setVisibility(8);
            this.f7763b.setVisibility(8);
            this.e.setVisibility(8);
        }
    }

    private void a() {
        this.f = new ArrayList(16);
        String strE = UnitUtil.e(70.0d, 2, 0);
        String strE2 = UnitUtil.e(70.0d, 1, 0);
        String strE3 = UnitUtil.e(89.0d, 2, 0);
        String strE4 = UnitUtil.e(90.0d, 2, 0);
        String strE5 = UnitUtil.e(70.0d, 2, 0);
        this.f.add(strE);
        this.f.add(strE2);
        this.f.add(strE3);
        this.f.add(strE4);
        this.f.add(strE5);
        setBloodOxygenInterval(this.f);
    }

    private void setBloodOxygenInterval(List<String> list) {
        this.q.setText(String.format(Locale.ENGLISH, this.h.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than), list.get(0)));
        this.t.setText(String.format(Locale.ENGLISH, this.h.getString(R.string.IDS_press_auto_monitor_relax_range), list.get(1), list.get(2)));
        lrd.d(this.t, String.format(Locale.ENGLISH, this.h.getString(R.string.IDS_base_line_percent), list.get(4), list.get(2)), false);
        this.v.setText(String.format(Locale.ENGLISH, this.h.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than), list.get(3)));
    }

    private void e(View view, int i, int i2) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub.getParent() != null) {
            this.s = viewStub.inflate();
        } else {
            this.s = view.findViewById(i2);
        }
    }

    private void e() {
        this.u = new ArrayList<>(16);
    }

    private void c() {
        if (this.d == null) {
            BloodOxygenBarChartView bloodOxygenBarChartView = new BloodOxygenBarChartView(this.h.getApplicationContext());
            this.d = bloodOxygenBarChartView;
            bloodOxygenBarChartView.setLayerType(1, null);
            d();
            this.u.add(0, this.d);
            this.g = new qto<>(this.u);
            this.m.setIsCompatibleScrollView(true);
            this.m.setIsScroll(false);
            this.m.setAdapter(this.g);
        }
    }

    private void d() {
        this.d.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart.1
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                SectionBloodOxygenBaseBarChart.this.b();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                SectionBloodOxygenBaseBarChart.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.d.canScrollOlderPager()) {
            this.r.setVisibility(0);
            this.r.setClickable(true);
            this.y.set(true);
        } else {
            this.r.setVisibility(4);
            this.r.setClickable(false);
            this.y.set(false);
        }
        if (this.d.canScrollNewerPager()) {
            this.p.setVisibility(0);
            this.p.setClickable(true);
            this.w.set(true);
        } else {
            this.p.setVisibility(4);
            this.p.setClickable(false);
            this.w.set(false);
        }
    }

    private void g() {
        if (LanguageUtil.ba(this.h)) {
            this.r.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_right_arrow_click_selector));
            this.p.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_left_arrow_click_selector));
        } else {
            this.r.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_left_arrow_click_selector));
            this.p.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_right_arrow_click_selector));
        }
        this.p.setVisibility(0);
        this.y.set(true);
        this.r.setClickable(true);
        this.p.setVisibility(4);
        this.w.set(false);
        this.p.setClickable(false);
    }

    private void j() {
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionBloodOxygenBaseBarChart.this.y.get() && !SectionBloodOxygenBaseBarChart.this.d.isAnimating()) {
                    SectionBloodOxygenBaseBarChart.this.f7764c = 2;
                    BloodOxygenBarChartView bloodOxygenBarChartView = SectionBloodOxygenBaseBarChart.this.d;
                    BloodOxygenBarChartView bloodOxygenBarChartView2 = SectionBloodOxygenBaseBarChart.this.d;
                    Objects.requireNonNull(bloodOxygenBarChartView2);
                    bloodOxygenBarChartView.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qly>.b(bloodOxygenBarChartView2) { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart.4.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(bloodOxygenBarChartView2);
                        }

                        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                        public void c() {
                            super.c();
                        }
                    });
                }
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionBloodOxygenBaseBarChart.this.w.get() && !SectionBloodOxygenBaseBarChart.this.d.isAnimating()) {
                    SectionBloodOxygenBaseBarChart.this.f7764c = 2;
                    BloodOxygenBarChartView bloodOxygenBarChartView = SectionBloodOxygenBaseBarChart.this.d;
                    BloodOxygenBarChartView bloodOxygenBarChartView2 = SectionBloodOxygenBaseBarChart.this.d;
                    Objects.requireNonNull(bloodOxygenBarChartView2);
                    bloodOxygenBarChartView.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qly>.b(bloodOxygenBarChartView2) { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBaseBarChart.3.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(bloodOxygenBarChartView2);
                        }

                        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                        public void c() {
                            super.c();
                        }
                    });
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionBloodOxygenBaseBarChart";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if ((map.get("BAR_COMMON_CHART_HOLDER") instanceof HwHealthBarScrollChartHolder) && this.f7762a == null && (map.get("BAR_DATA_INFOS") instanceof DataInfos)) {
            HwHealthBarScrollChartHolder hwHealthBarScrollChartHolder = (HwHealthBarScrollChartHolder) map.get("BAR_COMMON_CHART_HOLDER");
            this.f7762a = hwHealthBarScrollChartHolder;
            hwHealthBarScrollChartHolder.addDataLayer(this.d, (DataInfos) map.get("BAR_DATA_INFOS"));
            this.g.notifyDataSetChanged();
            if (map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK") instanceof OnXRangeTextCallback) {
                final OnXRangeTextCallback onXRangeTextCallback = (OnXRangeTextCallback) map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK");
                this.d.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: fvs
                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                    public final void onRangeShow(int i, int i2) {
                        this.f34621a.e(onXRangeTextCallback, i, i2);
                    }
                });
            }
            if (map.get("BAR_COMMON_RANGE_SHOW_CALL_BACK") instanceof OnDataChangedListener) {
                final OnDataChangedListener onDataChangedListener = (OnDataChangedListener) map.get("BAR_COMMON_RANGE_SHOW_CALL_BACK");
                this.d.setOnDataChangedListener(new BloodOxygenBarChartView.OnDataChangedListener() { // from class: fvt
                    @Override // com.huawei.health.knit.section.chart.BloodOxygenBarChartView.OnDataChangedListener
                    public final void onDataChangedListener(float f, float f2) {
                        onDataChangedListener.onDataChangedListener(f, f2);
                    }
                });
            }
            if (map.get("BAR_COMMON_MARK_TEXT_CALL_BACK") instanceof OnMarkViewTextNotify) {
                final OnMarkViewTextNotify onMarkViewTextNotify = (OnMarkViewTextNotify) map.get("BAR_COMMON_MARK_TEXT_CALL_BACK");
                this.d.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: fvu
                    @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                    public final void onTextChanged(String str, List list) {
                        this.f34623c.e(onMarkViewTextNotify, str, list);
                    }
                });
            }
            setAccessibilityArrowDescription((DataInfos) map.get("BAR_DATA_INFOS"));
        }
        if ((map.get("BAR_COMMON_START_TIME") instanceof Integer) && this.f7764c == 0) {
            this.d.setShowRange(((Integer) map.get("BAR_COMMON_START_TIME")).intValue(), this.d.acquireScrollAdapter().acquireRange());
            this.d.refresh();
        }
        if (map.get("BAR_COMMON_REFLESH_TIME") instanceof Long) {
            this.d.reflesh(((Long) map.get("BAR_COMMON_REFLESH_TIME")).longValue());
        }
        qsp.b(this.n, qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""));
        qsp.b(this.i, qqw.d((Map) map, "BAR_CHART_PERIOD_STRING", ""));
        if (map.get("BAR_CHART_VALUE") instanceof String) {
            this.k.setText((String) map.get("BAR_CHART_VALUE"));
        }
        this.j.setVisibility(8);
        if ((map.get("BAR_CHART_CLICK_EVENT") instanceof OnClickSectionListener) && this.f7764c == 0) {
            setClickListenerEvent(map.get("BAR_CHART_CLICK_EVENT"));
        }
        this.f7764c--;
    }

    public /* synthetic */ void e(OnXRangeTextCallback onXRangeTextCallback, int i, int i2) {
        onXRangeTextCallback.onRangeShow(i, i2, this.d.formatRangeText(i, i2));
    }

    public /* synthetic */ void e(OnMarkViewTextNotify onMarkViewTextNotify, String str, List list) {
        onMarkViewTextNotify.onTextChanged(str, list, this.d.fetchMarkViewMinuteValue());
    }

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            HealthTextView healthTextView = this.n;
            if (healthTextView != null) {
                healthTextView.setOnClickListener(new View.OnClickListener() { // from class: fvq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        onClickSectionListener.onClick("BAR_CHART_CALENDAR_CLICK_EVENT");
                    }
                });
            }
        }
    }
}
