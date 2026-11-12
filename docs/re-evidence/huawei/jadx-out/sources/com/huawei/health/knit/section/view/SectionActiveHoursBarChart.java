package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.chart.HwHealthDetailBarChart;
import com.huawei.health.knit.section.listener.ChartStatisticChangeCallback;
import com.huawei.health.knit.section.listener.OnMarkViewTextNotify;
import com.huawei.health.knit.section.listener.OnXRangeTextCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.fts;
import defpackage.qly;
import defpackage.qmf;
import defpackage.qmg;
import defpackage.qnn;
import defpackage.qqw;
import defpackage.qsp;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveHoursBarChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthDetailBarChart f7709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f7710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthViewPager f7711c;
    private HwHealthBarScrollChartHolder d;
    private int e;
    private ImageView f;
    private ArrayList<View> g;
    private ImageView h;
    private ChartStatisticChangeCallback i;
    private qto<View> j;
    private final AtomicBoolean k;
    private Context l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HwHealthBaseScrollBarLineChart.OnXRangeSet q;
    private final AtomicBoolean r;

    public SectionActiveHoursBarChart(Context context) {
        this(context, null);
        this.l = context;
    }

    public SectionActiveHoursBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionActiveHoursBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        this.r = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SCUI_SectionActiveHoursBarChart", "onCreateView");
        this.l = context;
        if (this.f7710b == null) {
            this.f7710b = LayoutInflater.from(context).inflate(R.layout.section_active_hours_barchart, (ViewGroup) this, false);
        }
        this.h = (ImageView) this.f7710b.findViewById(R.id.active_hours_arrow_left);
        this.f = (ImageView) this.f7710b.findViewById(R.id.active_hours_arrow_right);
        this.m = (HealthTextView) this.f7710b.findViewById(R.id.tv_active_hours_date);
        this.o = (HealthTextView) this.f7710b.findViewById(R.id.tv_active_hours_time);
        this.n = (HealthTextView) this.f7710b.findViewById(R.id.tv_active_hours_completed);
        this.f7711c = (HealthViewPager) this.f7710b.findViewById(R.id.active_hours_viewpager);
        e();
        d();
        f();
        j();
        return this.f7710b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SCUI_SectionActiveHoursBarChart";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SCUI_SectionActiveHoursBarChart", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SCUI_SectionActiveHoursBarChart", "no need to bind");
            return;
        }
        if ((map.get("BAR_COMMON_CHART_HOLDER") instanceof HwHealthBarScrollChartHolder) && this.d == null && (map.get("BAR_DATA_INFOS") instanceof DataInfos)) {
            this.d = (HwHealthBarScrollChartHolder) map.get("BAR_COMMON_CHART_HOLDER");
            this.d.addDataLayer(this.f7709a, (DataInfos) map.get("BAR_DATA_INFOS"));
            this.j.notifyDataSetChanged();
            if (map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK") instanceof OnXRangeTextCallback) {
                final OnXRangeTextCallback onXRangeTextCallback = (OnXRangeTextCallback) map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK");
                HwHealthBaseScrollBarLineChart.OnXRangeSet onXRangeSet = new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: fvd
                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                    public final void onRangeShow(int i, int i2) {
                        this.f34607c.e(onXRangeTextCallback, i, i2);
                    }
                };
                this.q = onXRangeSet;
                this.f7709a.addOnXRangeSet(onXRangeSet);
            }
            if (map.get("BAR_COMMON_MARK_TEXT_CALL_BACK") instanceof OnMarkViewTextNotify) {
                final OnMarkViewTextNotify onMarkViewTextNotify = (OnMarkViewTextNotify) map.get("BAR_COMMON_MARK_TEXT_CALL_BACK");
                this.f7709a.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: fve
                    @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                    public final void onTextChanged(String str, List list) {
                        this.f34608b.d(onMarkViewTextNotify, str, list);
                    }
                });
                this.f7709a.acquireScrollAdapter().acquireXAxisValueFormatter().setHealthType(HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_ACTIVE_HOUR);
            }
            if (map.get("BAR_OBSERVER_LABEL_CUMULATIVE_AVERAGE") instanceof ChartStatisticChangeCallback) {
                this.i = (ChartStatisticChangeCallback) qqw.a(map, "BAR_OBSERVER_LABEL_CUMULATIVE_AVERAGE", (Class<Object>) ChartStatisticChangeCallback.class, (Object) null);
                g();
            }
        }
        Object obj = map.get("BAR_COMMON_START_TIME");
        if ((obj instanceof Integer) && this.e == 0) {
            this.f7709a.setShowRange(((Integer) obj).intValue(), this.f7709a.acquireScrollAdapter().acquireRange());
            this.f7709a.refresh();
        }
        Object obj2 = map.get("BAR_COMMON_REFLESH_TIME");
        if (obj2 instanceof Long) {
            HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.f7709a.acquireScrollAdapter();
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
            this.f7709a.setWillNotDraw(false);
            this.f7709a.setMarkerViewPosition(null);
            this.f7709a.reflesh(((Long) obj2).longValue());
        }
        setText(map);
        this.e--;
    }

    public /* synthetic */ void e(OnXRangeTextCallback onXRangeTextCallback, int i, int i2) {
        onXRangeTextCallback.onRangeShow(i, i2, this.f7709a.formatRangeText(i, i2));
    }

    public /* synthetic */ void d(OnMarkViewTextNotify onMarkViewTextNotify, String str, List list) {
        onMarkViewTextNotify.onTextChanged(str, list, this.f7709a.fetchMarkViewMinuteValue());
    }

    private void g() {
        if (this.q != null) {
            HwHealthBaseScrollBarLineChart.OnXRangeSet onXRangeSet = new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: fvc
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                public final void onRangeShow(int i, int i2) {
                    this.f34606a.b(i, i2);
                }
            };
            this.q = onXRangeSet;
            this.f7709a.addOnXRangeSet(onXRangeSet);
        }
    }

    public /* synthetic */ void b(int i, int i2) {
        ChartStatisticChangeCallback chartStatisticChangeCallback = this.i;
        if (chartStatisticChangeCallback != null) {
            chartStatisticChangeCallback.onStatisticChange((int) c(), Math.round(a()));
        }
    }

    private void setText(HashMap<String, Object> map) {
        qsp.b(this.m, qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""));
        qsp.b(this.o, qqw.d((Map) map, "BAR_CHART_PERIOD_STRING", ""));
        qsp.b(this.n, (CharSequence) qqw.a(map, "BAR_CHART_LEGEND_ONE_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString("")));
        if (map.get("BAR_CHART_CLICK_EVENT") instanceof OnClickSectionListener) {
            setClickListenerEvent(map.get("BAR_CHART_CLICK_EVENT"));
        }
    }

    private void e() {
        this.g = new ArrayList<>(16);
    }

    private void d() {
        if (this.f7709a == null) {
            HwHealthDetailBarChart hwHealthDetailBarChart = new HwHealthDetailBarChart(this.l.getApplicationContext());
            this.f7709a = hwHealthDetailBarChart;
            hwHealthDetailBarChart.setLayerType(1, null);
            b();
            this.g.add(0, this.f7709a);
            this.j = new qto<>(this.g);
            this.f7711c.setIsCompatibleScrollView(true);
            this.f7711c.setIsScroll(false);
            this.f7711c.setAdapter(this.j);
        }
    }

    private void b() {
        this.f7709a.setPagerNoMoreListener(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f7709a.canScrollOlderPager()) {
            this.h.setVisibility(0);
            this.h.setClickable(true);
            this.r.set(true);
        } else {
            this.h.setVisibility(4);
            this.h.setClickable(false);
            this.r.set(false);
        }
        if (this.f7709a.canScrollNewerPager()) {
            this.f.setVisibility(0);
            this.f.setClickable(true);
            this.k.set(true);
        } else {
            this.f.setVisibility(4);
            this.f.setClickable(false);
            this.k.set(false);
        }
    }

    private void f() {
        if (LanguageUtil.ba(this.l)) {
            this.h.setBackground(ContextCompat.getDrawable(this.l, R.drawable.common_right_arrow_click_selector));
            this.f.setBackground(ContextCompat.getDrawable(this.l, R.drawable.common_left_arrow_click_selector));
        } else {
            this.h.setBackground(ContextCompat.getDrawable(this.l, R.drawable.common_left_arrow_click_selector));
            this.f.setBackground(ContextCompat.getDrawable(this.l, R.drawable.common_right_arrow_click_selector));
        }
    }

    private void j() {
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionActiveHoursBarChart.this.r.get()) {
                    fts.e(2, "activity");
                    if (SectionActiveHoursBarChart.this.f7709a.isAnimating()) {
                        return;
                    }
                    SectionActiveHoursBarChart.this.e = 1;
                    HwHealthDetailBarChart hwHealthDetailBarChart = SectionActiveHoursBarChart.this.f7709a;
                    HwHealthDetailBarChart hwHealthDetailBarChart2 = SectionActiveHoursBarChart.this.f7709a;
                    Objects.requireNonNull(hwHealthDetailBarChart2);
                    hwHealthDetailBarChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qly>.b(hwHealthDetailBarChart2) { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(hwHealthDetailBarChart2);
                        }

                        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                        public void c() {
                            super.c();
                        }
                    });
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionActiveHoursBarChart.this.k.get()) {
                    fts.e(1, "activity");
                    if (SectionActiveHoursBarChart.this.f7709a.isAnimating()) {
                        return;
                    }
                    SectionActiveHoursBarChart.this.e = 1;
                    HwHealthDetailBarChart hwHealthDetailBarChart = SectionActiveHoursBarChart.this.f7709a;
                    HwHealthDetailBarChart hwHealthDetailBarChart2 = SectionActiveHoursBarChart.this.f7709a;
                    Objects.requireNonNull(hwHealthDetailBarChart2);
                    hwHealthDetailBarChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qly>.b(hwHealthDetailBarChart2) { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.3.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(hwHealthDetailBarChart2);
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

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            HealthTextView healthTextView = this.m;
            if (healthTextView != null) {
                healthTextView.setOnClickListener(new View.OnClickListener() { // from class: fvf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        onClickSectionListener.onClick("BAR_CHART_CALENDAR_CLICK_EVENT");
                    }
                });
            }
        }
    }

    private float c() {
        HwHealthBarDataSet hwHealthBarDataSet = this.f7709a.getBarData().getDataSets().get(0) instanceof HwHealthBarDataSet ? (HwHealthBarDataSet) this.f7709a.getBarData().getDataSets().get(0) : null;
        if (hwHealthBarDataSet == null) {
            throw new RuntimeException("calculateSum not find dataSet! logic error!!!");
        }
        return hwHealthBarDataSet.calculateLogicByShowRange(this.f7709a, new LogicalUnit() { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.1
            @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
            public float calculate(List<? extends HwHealthBaseEntry> list) {
                float fE = 0.0f;
                if (list == null || list.size() == 0) {
                    return 0.0f;
                }
                HwHealthBaseEntry hwHealthBaseEntry = list.get(0);
                if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
                    if (hwHealthBarEntry.acquireModel() instanceof qmf) {
                        if (!(((qmf) hwHealthBarEntry.acquireModel()) instanceof qmg)) {
                            for (HwHealthBaseEntry hwHealthBaseEntry2 : list) {
                                if (hwHealthBaseEntry2 != null) {
                                    fE += SectionActiveHoursBarChart.this.a(((HwHealthBarEntry) hwHealthBaseEntry2).acquireModel());
                                }
                            }
                            return fE;
                        }
                        for (HwHealthBaseEntry hwHealthBaseEntry3 : list) {
                            if (hwHealthBaseEntry3 != null) {
                                fE += ((qmg) ((HwHealthBarEntry) hwHealthBaseEntry3).acquireModel()).e();
                            }
                        }
                        return fE;
                    }
                }
                throw new RuntimeException("calculateSum not instanceof HwHealthBarEntry! logic error!!!");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(IStorageModel iStorageModel) {
        float fD = qnn.d(iStorageModel);
        if (Math.abs(fD - 3.999f) > 1.0E-6f) {
            return fD;
        }
        return 0.0f;
    }

    private float a() {
        HwHealthBarDataSet hwHealthBarDataSet = this.f7709a.getBarData().getDataSets().get(0) instanceof HwHealthBarDataSet ? (HwHealthBarDataSet) this.f7709a.getBarData().getDataSets().get(0) : null;
        if (hwHealthBarDataSet == null) {
            throw new RuntimeException("mAvgCalculator can't find dataSet");
        }
        return hwHealthBarDataSet.calculateLogicByShowRange(this.f7709a, new LogicalUnit() { // from class: com.huawei.health.knit.section.view.SectionActiveHoursBarChart.5
            @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
            public float calculate(List<? extends HwHealthBaseEntry> list) {
                if (list == null || list.size() == 0) {
                    return 0.0f;
                }
                HwHealthBaseEntry hwHealthBaseEntry = list.get(0);
                if (hwHealthBaseEntry instanceof HwHealthBarEntry) {
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
                    if (hwHealthBarEntry.acquireModel() instanceof qmf) {
                        return SectionActiveHoursBarChart.this.a(list, (qmf) hwHealthBarEntry.acquireModel());
                    }
                }
                throw new RuntimeException("mAvgCalculator not instanceof HwHealthBarEntry! logic error!!!");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(List<? extends HwHealthBaseEntry> list, qmf qmfVar) {
        float fE;
        int iD = 0;
        if (!(qmfVar instanceof qmg)) {
            fE = 0.0f;
            for (HwHealthBaseEntry hwHealthBaseEntry : list) {
                if (hwHealthBaseEntry != null) {
                    fE += qnn.d(((HwHealthBarEntry) hwHealthBaseEntry).acquireModel());
                    iD++;
                }
            }
            if (iD == 0) {
                LogUtil.j("SCUI_SectionActiveHoursBarChart", "Division by zero attempted!");
                return 0.0f;
            }
        } else {
            fE = 0.0f;
            for (HwHealthBaseEntry hwHealthBaseEntry2 : list) {
                if (hwHealthBaseEntry2 instanceof HwHealthBarEntry) {
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry2;
                    if (hwHealthBarEntry.acquireModel() instanceof qmg) {
                        qmg qmgVar = (qmg) hwHealthBarEntry.acquireModel();
                        fE += qmgVar.e();
                        iD += qmgVar.d();
                    }
                }
            }
            if (iD == 0) {
                LogUtil.j("SCUI_SectionActiveHoursBarChart", "Division by zero attempted!");
                return 0.0f;
            }
        }
        return fE / iD;
    }

    static class d implements HwHealthBaseScrollBarLineChart.PagerNoMoreListener {
        private final WeakReference<SectionActiveHoursBarChart> e;

        d(SectionActiveHoursBarChart sectionActiveHoursBarChart) {
            this.e = new WeakReference<>(sectionActiveHoursBarChart);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
        public void notifyNewerPager(boolean z) {
            SectionActiveHoursBarChart sectionActiveHoursBarChart = this.e.get();
            if (sectionActiveHoursBarChart != null) {
                sectionActiveHoursBarChart.h();
            }
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
        public void notifyOlderPager(boolean z) {
            SectionActiveHoursBarChart sectionActiveHoursBarChart = this.e.get();
            if (sectionActiveHoursBarChart != null) {
                sectionActiveHoursBarChart.h();
            }
        }
    }
}
