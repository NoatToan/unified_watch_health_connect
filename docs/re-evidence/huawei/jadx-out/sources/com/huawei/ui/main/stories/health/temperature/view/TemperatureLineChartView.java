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
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseMvpChartView;
import com.huawei.ui.main.stories.health.temperature.chart.TemperatureRemindListView;
import com.huawei.ui.main.stories.health.temperature.view.levelcard.MultiViewDataObserverView;
import com.huawei.ui.main.stories.health.temperature.view.levelcard.TemperatureCardView;
import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.ComponentParam;
import com.huawei.ui.main.stories.template.Constants;
import com.huawei.ui.main.stories.template.health.contract.DataDetailFragmentContract;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qrk;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.uly;
import defpackage.vas;
import defpackage.vbh;
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
public class TemperatureLineChartView extends CommonBaseMvpChartView<vbh> implements BaseComponent, MultiViewDataObserverView.OnSelectListener, View.OnClickListener, OnActivityResultInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28141a;
    private String aa;
    private TemperatureRemindListView ab;
    private final AtomicBoolean ac;
    private HealthTextView ad;
    private ViewStub ah;
    private HealthViewPager ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f28142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f28143c;
    private HealthCalendar d;
    private TemperatureCardView e;
    private HealthTextView f;
    private Context g;
    private HealthTextView h;
    private HealthTextView i;
    private DataInfos j;
    private Fragment k;
    private HealthTextView l;
    private HealthTextView m;
    private View n;
    private boolean o;
    private boolean p;
    private long q;
    private HwHealthCommonLineChart r;
    private boolean s;
    private boolean t;
    private uly u;
    private HealthTextView v;
    private final AtomicBoolean w;
    private ArrayList<View> x;
    private vas y;
    private Resources z;

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public HwHealthBarChart getBarChart() {
        return null;
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void initComponent(List<ComponentParam> list) {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onCreate() {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onPause() {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onResume() {
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onStop() {
    }

    public TemperatureLineChartView(Context context) {
        this(context, null);
    }

    public TemperatureLineChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemperatureLineChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ac = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.aa = "TEMPERATURE_MIN_MAX";
        this.p = true;
        this.o = false;
        d(context);
    }

    private void d(Context context) {
        if (context == null) {
            LogUtil.j("TemperatureLineChartView", "initConstructor context or dataType is null");
            return;
        }
        this.g = context;
        this.z = context.getResources();
        this.p = UnitUtil.a();
        boolean zO = Utils.o();
        this.s = zO;
        if (zO) {
            this.aa = "SKIN_TEMPERATURE_MIN_MAX";
        }
        initLayout(this.g, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.mPresenter == 0) {
            return;
        }
        if (view == this.f28143c) {
            if (this.ac.get()) {
                ((vbh) this.mPresenter).initLeftArrowClick();
            }
        } else if (view == this.f28142b) {
            if (this.w.get()) {
                ((vbh) this.mPresenter).initRightArrowClick();
            }
        } else if (view.getId() == R.id.temperature_detail_time_date_tv) {
            ((vbh) this.mPresenter).startCalendar(this.k, this.d);
        } else {
            LogUtil.j("TemperatureLineChartView", "click view unknow");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseMvpChartView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public vbh createPresenter() {
        return new vbh();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void setLiftAndRightImage() {
        if (LanguageUtil.ba(this.g)) {
            this.f28143c.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_right_arrow_click_selector));
            this.f28142b.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_left_arrow_click_selector));
        } else {
            this.f28143c.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_left_arrow_click_selector));
            this.f28142b.setBackground(ContextCompat.getDrawable(this.g, R.drawable.common_right_arrow_click_selector));
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void initViewPager() {
        this.x = new ArrayList<>(16);
        this.u = new uly(this.x);
        this.ai.setIsCompatibleScrollView(true);
        this.ai.setIsScroll(false);
        this.ai.setAdapter(this.u);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void initChart() {
        this.y = new vas(this.g.getApplicationContext(), (LineChartViewPresenter) this.mPresenter);
        if (this.r == null) {
            HwHealthCommonLineChart hwHealthCommonLineChart = new HwHealthCommonLineChart(this.g.getApplicationContext());
            this.r = hwHealthCommonLineChart;
            hwHealthCommonLineChart.setLayerType(1, null);
            e();
            this.x.add(0, this.r);
            this.y.addDataLayer(this.r, DataInfos.TemperatureDayDetail);
            this.u.notifyDataSetChanged();
            this.r.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureLineChartView.1
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                public void onRangeShow(int i, int i2) {
                    if (qrk.b(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
                        TemperatureLineChartView temperatureLineChartView = TemperatureLineChartView.this;
                        temperatureLineChartView.d = vdo.c(temperatureLineChartView.d, i);
                    }
                    ((vbh) TemperatureLineChartView.this.mPresenter).notifyData(i, i2);
                }
            });
            this.r.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureLineChartView.4
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                    String strA = vbr.a(vbr.a(str));
                    int iF = qnh.f((int) TemperatureLineChartView.this.r.fetchMarkViewMinuteValue());
                    TemperatureLineChartView temperatureLineChartView = TemperatureLineChartView.this;
                    temperatureLineChartView.d = vdo.c(temperatureLineChartView.d, iF);
                    ((vbh) TemperatureLineChartView.this.mPresenter).notifyCursorDataAndTime(strA, list);
                }
            });
        }
    }

    private void e() {
        this.r.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureLineChartView.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                TemperatureLineChartView.this.d();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                TemperatureLineChartView.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.r.canScrollOlderPager()) {
            this.f28143c.setVisibility(0);
            this.f28143c.setClickable(true);
            this.ac.set(true);
        } else {
            this.f28143c.setVisibility(4);
            this.f28143c.setClickable(false);
            this.ac.set(false);
        }
        if (this.r.canScrollNewerPager()) {
            this.f28142b.setVisibility(0);
            this.f28142b.setClickable(true);
            this.w.set(true);
        } else {
            this.f28142b.setVisibility(4);
            this.f28142b.setClickable(false);
            this.w.set(false);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void clickLeftArrow() {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.r;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureLineChartView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(hwHealthCommonLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void clickRightArrow() {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.r;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.ui.main.stories.health.temperature.view.TemperatureLineChartView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(hwHealthCommonLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void setDayAndWeek(String str, String str2, boolean z) {
        this.m.setText(str);
        if (z) {
            this.f28142b.setVisibility(8);
        } else {
            this.f28142b.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyNumerical(String str, List<HwHealthMarkerView.d> list) {
        HealthTextView healthTextView = this.h;
        if (healthTextView != null) {
            healthTextView.setText(str);
        } else {
            LogUtil.j("TemperatureLineChartView", "notifyNumerical, mCursorTime is null");
        }
        e(list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyMaxAndMin(int i, List<HiHealthData> list) {
        if (this.s) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            vbr.a(list, this.e);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public void notifyRemindData(int i, List<HiHealthData> list) {
        boolean zB = njy.b(list);
        this.o = zB;
        if (!zB || this.s || "SKIN_TEMPERATURE_MIN_MAX".equals(this.aa)) {
            this.ab.setVisibility(8);
        } else {
            this.ab.b(list, this.q);
            this.ab.setVisibility(0);
        }
    }

    private void e(List<HwHealthMarkerView.d> list) {
        String str;
        String string;
        if (njy.e(list)) {
            LogUtil.j("TemperatureLineChartView", "notifyView datas is empty");
            str = "--";
        } else {
            str = this.y.parse(list.get(list.size() - 1).f23737a);
        }
        if ("--".equals(str)) {
            this.f.setText(str);
            this.f28141a.setVisibility(8);
            this.i.setVisibility(8);
            lrd.c(this.f, 2);
            return;
        }
        if (this.p) {
            string = this.z.getString(R.string.IDS_settings_health_temperature_unit, "");
        } else {
            string = this.z.getString(R.string.IDS_temp_unit_fahrenheit, "");
        }
        DataInfos dataInfos = this.j;
        if (dataInfos != null && dataInfos.isDayData()) {
            this.f.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline5));
        }
        this.f.setText(str);
        this.i.setText(string);
        this.f28141a.setVisibility(0);
        this.i.setVisibility(0);
        lrd.c(this.f, 1);
        Typeface typefaceC = qrr.c();
        this.f.setTypeface(typefaceC);
        this.i.setTypeface(typefaceC);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface
    public HwHealthLineChart getLineChart() {
        return this.r;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public int getLayoutId() {
        return R.layout.temperature_chart_view;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public void initView(View view) {
        setIntervalLegendLayout(view);
        this.f28143c = (ImageView) view.findViewById(R.id.temperature_arrow_left);
        this.f28142b = (ImageView) view.findViewById(R.id.temperature_arrow_right);
        this.m = (HealthTextView) view.findViewById(R.id.temperature_detail_time_date_tv);
        this.h = (HealthTextView) view.findViewById(R.id.temperature_cursor_time);
        this.f = (HealthTextView) view.findViewById(R.id.temperature_cursor_value);
        this.i = (HealthTextView) view.findViewById(R.id.temperature_cursor_unit);
        this.f28141a = (HealthTextView) view.findViewById(R.id.temperature_cursor_avg);
        this.ai = (HealthViewPager) view.findViewById(R.id.temperature_viewpager);
        this.e = (TemperatureCardView) view.findViewById(R.id.temperature_detail_level_card_view);
        TemperatureRemindListView temperatureRemindListView = (TemperatureRemindListView) view.findViewById(R.id.temperature_warning_view);
        this.ab = temperatureRemindListView;
        temperatureRemindListView.setVisibility(8);
        this.ab.e(true);
        this.f28143c.setOnClickListener(this);
        this.f28142b.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.e.setListener(this);
        this.e.setVisibility(8);
        setLiftAndRightImage();
        initViewPager();
    }

    private void h() {
        String string;
        String string2;
        String string3;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.aa)) {
            this.v.setVisibility(8);
            this.ad.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        if (this.p) {
            String strE = UnitUtil.e(35.0d, 1, 1);
            String strE2 = UnitUtil.e(37.20000076293945d, 1, 1);
            string = this.z.getString(R.string.IDS_temperature_normal_range, strE, strE2);
            string2 = this.z.getString(R.string.IDS_temperature_less_than, strE);
            string3 = this.z.getString(R.string.IDS_temperature_more_than, strE2);
        } else {
            String strE3 = UnitUtil.e(vbr.b(35.0f), 1, 1);
            String strE4 = UnitUtil.e(vbr.b(37.2f), 1, 1);
            string = this.z.getString(R.string.IDS_temperature_fahrenheit_normal, strE3, strE4);
            string2 = this.z.getString(R.string.IDS_temperature_fahrenheit_less, strE3);
            string3 = this.z.getString(R.string.IDS_temperature_fahrenheit_more, strE4);
        }
        this.v.setText(string2);
        this.ad.setText(string);
        this.l.setText(string3);
        this.v.setVisibility(0);
        this.ad.setVisibility(0);
        this.l.setVisibility(0);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.base.CommonBaseChartView
    public void initData() {
        if (this.mPresenter != 0) {
            ((vbh) this.mPresenter).initPageParams();
        }
    }

    private void setIntervalLegendLayout(View view) {
        if (qrs.y()) {
            b(view, R.id.temperature_chart_view_legend_trable, R.id.temperature_chart_view_legend_trable_inflated);
        } else {
            b(view, R.id.temperature_chart_view_legend, R.id.temperature_chart_view_legend_inflated);
        }
        View view2 = this.n;
        if (view2 != null) {
            this.v = (HealthTextView) view2.findViewById(R.id.temperature_low_legend);
            this.ad = (HealthTextView) this.n.findViewById(R.id.temperature_normal_legend);
            this.l = (HealthTextView) this.n.findViewById(R.id.temperature_high_legend);
        }
    }

    private void b(View view, int i, int i2) {
        if (this.ah == null) {
            this.ah = (ViewStub) view.findViewById(i);
        }
        if (this.ah.getParent() != null) {
            this.n = this.ah.inflate();
        } else {
            this.n = view.findViewById(i2);
        }
    }

    private void g() {
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.aa)) {
            this.ab.setVisibility(8);
        } else if (this.o) {
            this.ab.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.levelcard.MultiViewDataObserverView.OnSelectListener
    public void onSelect(String str, boolean z) {
        HwHealthCommonLineChart hwHealthCommonLineChart;
        LogUtil.d("TemperatureLineChartView", "onSelect is ", str);
        if (str.equals("TEMPERATURE_MIN_MAX")) {
            e(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 0);
        } else if (str.equals("SKIN_TEMPERATURE_MIN_MAX")) {
            e(AnalyticsValue.TEMPERATURE_SWITCH_TYPE_2060076.value(), 1);
        } else {
            LogUtil.d("TemperatureLineChartView", "onSelect unKnow");
        }
        this.aa = str;
        h();
        g();
        if (this.y == null || (hwHealthCommonLineChart = this.r) == null || hwHealthCommonLineChart.acquireScrollAdapter() == null) {
            return;
        }
        this.y.b(str);
        if (this.t && z) {
            this.r.clearValues();
            this.y.addDataLayer(this.r, DataInfos.TemperatureDayDetail);
        }
        this.t = true;
        this.r.setWillNotDraw(false);
        this.y.e(str);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.r.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        this.r.setMarkerViewPosition(null);
        this.r.resetYaxisAnimateValue();
        this.r.refresh();
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
        if (this.e != null) {
            onSelect(this.aa, false);
            this.e.a(this.aa);
        }
    }

    private void c() {
        this.y = null;
        this.r = null;
        this.q = System.currentTimeMillis();
        initChart();
        e((List<HwHealthMarkerView.d>) null);
    }

    private void b() {
        if (this.q <= 0) {
            LogUtil.j("TemperatureLineChartView", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        HwHealthCommonLineChart hwHealthCommonLineChart = this.r;
        if (hwHealthCommonLineChart == null || hwHealthCommonLineChart.acquireScrollAdapter() == null) {
            LogUtil.j("TemperatureLineChartView", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        if (this.j.isDayData()) {
            int iH = qnh.h(qnh.b(this.q));
            LogUtil.a("TemperatureLineChartView", "startTimestamp=", Integer.valueOf(iH));
            HwHealthCommonLineChart hwHealthCommonLineChart2 = this.r;
            hwHealthCommonLineChart2.setShowRange(iH, hwHealthCommonLineChart2.acquireScrollAdapter().acquireRange());
            return;
        }
        LogUtil.a("TemperatureLineChartView", "setLastTimeForDataPlatform dataInfos is not day / month / year");
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void setDateStamp(long j) {
        if (j == 1) {
            c();
            return;
        }
        if (this.q != j) {
            this.q = j;
            b();
        }
        if (this.q > 0) {
            onSelect(this.aa, ArkUIXConstants.DELETE.equals(vbr.d()));
        }
        LogUtil.d("TemperatureLineChartView", "setDateStamp is ", Long.valueOf(j), ", mShowDataType ", this.aa);
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void setPageType(Constants.PageType pageType) {
        if (pageType == Constants.PageType.DAY) {
            this.j = DataInfos.TemperatureDayDetail;
        }
    }

    private void e(String str, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.g.getApplicationContext(), str, map, 0);
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onDestory() {
        vbr.c((String) null);
    }

    @Override // com.huawei.ui.main.stories.template.BaseComponent
    public void onDayWeekYear(int i) {
        e(AnalyticsValue.TEMPERATURE_SWITCH_RANGE_2060075.value(), i);
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.OnActivityResultInterface
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (serializableExtra instanceof HealthCalendar) {
            this.d = (HealthCalendar) serializableExtra;
            this.r.reflesh(((vbh) this.mPresenter).prossCalendarSelect(this.d));
        }
    }

    @Override // com.huawei.ui.main.stories.health.temperature.view.OnActivityResultInterface
    public void setFragment(Fragment fragment) {
        this.k = fragment;
    }
}
