package com.huawei.ui.main.stories.health.temperature.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseMvpChartView;
import com.huawei.ui.main.stories.health.temperature.chart.TemperatureBarChart;
import com.huawei.ui.main.stories.health.temperature.chart.TemperatureRemindListView;
import com.huawei.ui.main.stories.health.temperature.view.levelcard.MultiViewDataObserverView;
import com.huawei.ui.main.stories.health.temperature.view.levelcard.TemperatureCardView;
import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.ComponentParam;
import com.huawei.ui.main.stories.template.health.contract.DataDetailFragmentContract;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qly;
import defpackage.qnh;
import defpackage.qrk;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.uly;
import defpackage.val;
import defpackage.vbe;
import defpackage.vbl;
import defpackage.vbr;
import defpackage.vdo;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureBarChartView extends CommonBaseMvpChartView<vbe> implements BaseComponent, View.OnClickListener, MultiViewDataObserverView.OnSelectListener, OnActivityResultInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private val f28134a;
    private TemperatureRemindListView aa;
    private HealthViewPager ab;
    private Resources ac;
    private final AtomicBoolean ad;
    private ViewStub ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uly f28135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<View> f28136c;
    private ImageView d;
    private TemperatureBarChart e;
    private TemperatureCardView f;
    private Context g;
    private ImageView h;
    private HealthCalendar i;
    private List<HiHealthData> j;
    private HealthTextView k;
    private DataInfos l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private View p;
    private Fragment q;
    private HealthTextView r;
    private boolean s;
    private boolean t;
    private HealthTextView u;
    private final AtomicBoolean v;
    private boolean w;
    private HealthTextView x;
    private long y;
    private String z;

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public HwHealthLineChart getLineChart() {
        return null;
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void initComponent(List<ComponentParam> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyNumerical(String str, List<HwHealthMarkerView.d> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyRemindData(int i, List<HiHealthData> list) {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onCreate() {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onPause() {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onStop() {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void setDayAndWeek(String str, String str2, boolean z) {
    }

    public TemperatureBarChartView(Context context) {
        this(context, null);
    }

    public TemperatureBarChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemperatureBarChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.z = "TEMPERATURE_MIN_MAX";
        this.t = true;
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("TemperatureBarChartView", "initConstructor context or dataType is null");
            return;
        }
        this.g = context;
        this.ac = context.getResources();
        this.t = UnitUtil.a();
        boolean zO = Utils.o();
        this.s = zO;
        if (zO) {
            this.z = "SKIN_TEMPERATURE_MIN_MAX";
        }
        initLayout(this.g, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.mPresenter == 0) {
            return;
        }
        if (view == this.d) {
            if (this.ad.get()) {
                ((vbe) this.mPresenter).initLeftArrowClick();
            }
        } else if (view == this.h) {
            if (this.v.get()) {
                ((vbe) this.mPresenter).initRightArrowClick();
            }
        } else if (view.getId() == R.id.temperature_detail_time_date_tv) {
            ((vbe) this.mPresenter).startCalendar(this.q, this.i);
        } else {
            LogUtil.j("TemperatureBarChartView", "click view unknow");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseMvpChartView
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public vbe createPresenter() {
        return new vbe();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void setLiftAndRightImage() {
        if (LanguageUtil.ba(this.g)) {
            this.d.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_right_arrow_click_selector));
            this.h.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_left_arrow_click_selector));
        } else {
            this.d.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_left_arrow_click_selector));
            this.h.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_right_arrow_click_selector));
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void initViewPager() {
        this.f28136c = new ArrayList<>(16);
        this.f28135b = new uly(this.f28136c);
        this.ab.setIsCompatibleScrollView(true);
        this.ab.setIsScroll(false);
        this.ab.setAdapter(this.f28135b);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void initChart() {
        this.f28134a = new val(this.g.getApplicationContext(), (LineChartViewPresenter) this.mPresenter);
        if (this.e == null) {
            TemperatureBarChart temperatureBarChart = new TemperatureBarChart(this.g.getApplicationContext());
            this.e = temperatureBarChart;
            temperatureBarChart.setLayerType(1, null);
            c();
            this.f28136c.clear();
            this.f28136c.add(this.e);
            this.f28134a.addDataLayer(this.e, this.l);
            this.f28135b.notifyDataSetChanged();
            g();
            b();
        }
    }

    private void b() {
        this.e.setOnDataChangedListener(new TemperatureBarChart.OnDataChangedListener() { // from class: vbv
            @Override // com.huawei.ui.main.stories.health.temperature.chart.TemperatureBarChart.OnDataChangedListener
            public final void onDataChangedListener(float f, float f2) {
                this.f50918c.a(f, f2);
            }
        });
        this.e.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureBarChartView.1
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                LogUtil.a("TemperatureBarChartView", "startX   endX====" + i + i2);
                if (qrk.b(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
                    TemperatureBarChartView temperatureBarChartView = TemperatureBarChartView.this;
                    temperatureBarChartView.i = vdo.c(temperatureBarChartView.i, i);
                }
                TemperatureBarChartView.this.b(i, i2);
            }
        });
        this.e.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureBarChartView.4
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                LogUtil.a("TemperatureBarChartView", "timeStr====" + str);
                TemperatureBarChartView.this.o.setText(str);
                int iF = qnh.f((int) TemperatureBarChartView.this.e.fetchMarkViewMinuteValue());
                TemperatureBarChartView temperatureBarChartView = TemperatureBarChartView.this;
                temperatureBarChartView.i = vdo.c(temperatureBarChartView.i, iF);
            }
        });
    }

    public /* synthetic */ void a(float f, float f2) {
        String string;
        if (((int) f) != 0 && ((int) f2) != 0) {
            String strE = UnitUtil.e(f, 1, 1);
            String strE2 = UnitUtil.e(f2, 1, 1);
            if (this.t) {
                string = this.ac.getString(R.string.IDS_settings_health_temperature_unit, "");
            } else {
                string = this.ac.getString(R.string.IDS_temp_unit_fahrenheit, "");
            }
            this.m.setText(strE + Constants.LINK + strE2);
            this.k.setText(string);
            this.k.setVisibility(0);
            lrd.c(this.m, 1);
            return;
        }
        LogUtil.j("TemperatureBarChartView", "initViews min = ", Float.valueOf(f), " max = ", Float.valueOf(f2));
        this.m.setText("--");
        this.k.setVisibility(8);
        lrd.c(this.m, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        this.n.setText(this.e.formatRangeText(i, i2));
        j();
    }

    private void c() {
        this.e.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureBarChartView.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                TemperatureBarChartView.this.d();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                TemperatureBarChartView.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.e.canScrollOlderPager()) {
            this.d.setVisibility(0);
            this.d.setClickable(true);
            this.ad.set(true);
        } else {
            this.d.setVisibility(4);
            this.d.setClickable(false);
            this.ad.set(false);
        }
        if (this.e.canScrollNewerPager()) {
            this.h.setVisibility(0);
            this.h.setClickable(true);
            this.v.set(true);
        } else {
            this.h.setVisibility(4);
            this.h.setClickable(false);
            this.v.set(false);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void clickLeftArrow() {
        TemperatureBarChart temperatureBarChart = this.e;
        Objects.requireNonNull(temperatureBarChart);
        temperatureBarChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qly>.b(temperatureBarChart) { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureBarChartView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(temperatureBarChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void clickRightArrow() {
        TemperatureBarChart temperatureBarChart = this.e;
        Objects.requireNonNull(temperatureBarChart);
        temperatureBarChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qly>.b(temperatureBarChart) { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureBarChartView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(temperatureBarChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyMaxAndMin(int i, List<HiHealthData> list) {
        if (this.s) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
        this.j = list;
        j();
    }

    private void j() {
        ArrayList arrayList = new ArrayList(16);
        vbr.b(e(this.j), arrayList);
        vbr.a(arrayList, this.f);
    }

    private List<HiHealthData> e(List<HiHealthData> list) {
        long jF = qnh.f((int) this.e.acquireShowRangeMinimum());
        long jF2 = qnh.f((int) this.e.acquireShowRangeMaximum());
        long millis = TimeUnit.MINUTES.toMillis(jF);
        long millis2 = TimeUnit.MINUTES.toMillis(jF2);
        if (!njy.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getStartTime() >= millis && hiHealthData.getEndTime() < millis2) {
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.d("TemperatureBarChartView", "results list ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public HwHealthBarChart getBarChart() {
        return this.e;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public int getLayoutId() {
        return R.layout.temperature_chart_view;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public void initView(View view) {
        setIntervalLegendLayout(view);
        this.d = (ImageView) view.findViewById(R.id.temperature_arrow_left);
        this.h = (ImageView) view.findViewById(R.id.temperature_arrow_right);
        this.n = (HealthTextView) view.findViewById(R.id.temperature_detail_time_date_tv);
        this.o = (HealthTextView) view.findViewById(R.id.temperature_cursor_time);
        this.m = (HealthTextView) view.findViewById(R.id.temperature_cursor_value);
        if (qrs.ac()) {
            this.m.setTextSize(1, 80.0f);
        }
        this.k = (HealthTextView) view.findViewById(R.id.temperature_cursor_unit);
        this.ab = (HealthViewPager) view.findViewById(R.id.temperature_viewpager);
        this.f = (TemperatureCardView) view.findViewById(R.id.temperature_detail_level_card_view);
        TemperatureRemindListView temperatureRemindListView = (TemperatureRemindListView) view.findViewById(R.id.temperature_warning_view);
        this.aa = temperatureRemindListView;
        temperatureRemindListView.e(false);
        this.aa.setVisibility(8);
        h();
        this.d.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.f.setListener(this);
        this.f.setVisibility(8);
        setLiftAndRightImage();
        initViewPager();
        Typeface typefaceC = qrr.c();
        this.m.setTypeface(typefaceC);
        this.k.setTypeface(typefaceC);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public void initData() {
        if (this.mPresenter != 0) {
            ((vbe) this.mPresenter).initPageParams();
        }
    }

    private void i() {
        String string;
        String string2;
        String string3;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.z)) {
            this.u.setVisibility(8);
            this.x.setVisibility(8);
            this.r.setVisibility(8);
            return;
        }
        if (this.t) {
            String strE = UnitUtil.e(35.0d, 1, 1);
            String strE2 = UnitUtil.e(37.20000076293945d, 1, 1);
            string = this.ac.getString(R.string.IDS_temperature_normal_range, strE, strE2);
            string2 = this.ac.getString(R.string.IDS_temperature_less_than, strE);
            string3 = this.ac.getString(R.string.IDS_temperature_more_than, strE2);
        } else {
            String strE3 = UnitUtil.e(vbr.b(35.0f), 1, 1);
            String strE4 = UnitUtil.e(vbr.b(37.2f), 1, 1);
            string = this.ac.getString(R.string.IDS_temperature_fahrenheit_normal, strE3, strE4);
            string2 = this.ac.getString(R.string.IDS_temperature_fahrenheit_less, strE3);
            string3 = this.ac.getString(R.string.IDS_temperature_fahrenheit_more, strE4);
        }
        this.u.setText(string2);
        this.x.setText(string);
        this.r.setText(string3);
        this.u.setVisibility(0);
        this.x.setVisibility(0);
        this.r.setVisibility(0);
    }

    private void h() {
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.z) || this.s) {
            this.aa.setVisibility(8);
        } else if (vbl.a()) {
            this.aa.setVisibility(0);
        } else {
            this.aa.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.levelcard.MultiViewDataObserverView.OnSelectListener
    public void onSelect(String str, boolean z) {
        TemperatureBarChart temperatureBarChart;
        LogUtil.d("TemperatureBarChartView", "onSelect is ", str);
        this.z = str;
        i();
        h();
        if (this.f28134a == null || (temperatureBarChart = this.e) == null || temperatureBarChart.acquireScrollAdapter() == null) {
            return;
        }
        if (this.w && z) {
            this.e.clearValues();
            this.f28134a.addDataLayer(this.e, this.l);
        }
        this.w = true;
        this.e.setWillNotDraw(false);
        this.e.setShowDataType(str);
        this.f28134a.d(str);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.e.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        this.e.setMarkerViewPosition(null);
        this.e.refresh();
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public View getView(Context context) {
        return this.mView;
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void setPresenter(DataDetailFragmentContract.DetailFragmentPresenter detailFragmentPresenter) {
        initChart();
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void refreshView(boolean z) {
        if (this.f != null) {
            onSelect(this.z, false);
            this.f.a(this.z);
        }
    }

    private void a() {
        this.f28134a = null;
        this.e = null;
        this.y = System.currentTimeMillis();
        initChart();
    }

    private void setIntervalLegendLayout(View view) {
        if (qrs.y()) {
            d(view, R.id.temperature_chart_view_legend_trable, R.id.temperature_chart_view_legend_trable_inflated);
        } else {
            d(view, R.id.temperature_chart_view_legend, R.id.temperature_chart_view_legend_inflated);
        }
        View view2 = this.p;
        if (view2 != null) {
            this.u = (HealthTextView) view2.findViewById(R.id.temperature_low_legend);
            this.x = (HealthTextView) this.p.findViewById(R.id.temperature_normal_legend);
            this.r = (HealthTextView) this.p.findViewById(R.id.temperature_high_legend);
        }
    }

    private void d(View view, int i, int i2) {
        if (this.ah == null) {
            this.ah = (ViewStub) view.findViewById(i);
        }
        if (this.ah.getParent() != null) {
            this.p = this.ah.inflate();
        } else {
            this.p = view.findViewById(i2);
        }
    }

    private void g() {
        int iH;
        if (this.y <= 0) {
            LogUtil.j("TemperatureBarChartView", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        TemperatureBarChart temperatureBarChart = this.e;
        if (temperatureBarChart == null || temperatureBarChart.acquireScrollAdapter() == null) {
            LogUtil.j("TemperatureBarChartView", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        if (this.l.isDayData()) {
            iH = qnh.h(qnh.b(this.y));
        } else if (this.l.isWeekData()) {
            iH = qnh.h(qnh.o(this.y));
        } else if (this.l.isMonthData()) {
            iH = qnh.h(qnh.i(this.y));
        } else {
            LogUtil.a("TemperatureBarChartView", "setLastTimeForDataPlatform dataInfos is not day / month / year");
            return;
        }
        LogUtil.a("TemperatureBarChartView", "startTimestamp=", Integer.valueOf(iH));
        TemperatureBarChart temperatureBarChart2 = this.e;
        temperatureBarChart2.setShowRange(iH, temperatureBarChart2.acquireScrollAdapter().acquireRange());
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void setDateStamp(long j) {
        if (j == 1) {
            a();
            return;
        }
        if (this.y != j) {
            this.y = j;
            g();
        }
        if (this.y > 0) {
            onSelect(this.z, ArkUIXConstants.DELETE.equals(vbr.d()));
        }
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void setPageType(com.huawei.ui.main.stories.template.Constants.PageType pageType) {
        if (pageType == com.huawei.ui.main.stories.template.Constants.PageType.WEEK) {
            this.l = DataInfos.TemperatureWeekDetail;
        } else {
            this.l = DataInfos.TemperatureMonthDetail;
        }
    }

    private void setBiAnalyticsClickEvent(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.g.getApplicationContext(), AnalyticsValue.TEMPERATURE_SWITCH_RANGE_2060075.value(), map, 0);
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onResume() {
        h();
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onDestory() {
        vbr.c((String) null);
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onDayWeekYear(int i) {
        setBiAnalyticsClickEvent(i);
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.OnActivityResultInterface
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (serializableExtra instanceof HealthCalendar) {
            this.i = (HealthCalendar) serializableExtra;
            this.e.reflesh(((vbe) this.mPresenter).prossCalendarSelect(this.i));
        }
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.OnActivityResultInterface
    public void setFragment(Fragment fragment) {
        this.q = fragment;
    }
}
