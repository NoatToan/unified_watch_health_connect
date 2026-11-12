package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.foq;
import defpackage.fqt;
import defpackage.ftw;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qqw;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class SectionLineChart_01 extends BaseSection implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7818a;
    private String aa;
    private HealthTextView ab;
    private String ac;
    private Resources ad;
    private ViewStub ae;
    private long af;
    private HealthViewPager ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f7819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7820c;
    private ImageView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthCalendar g;
    private Context h;
    private LineChartRangeShowCallback i;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private DataInfos o;
    private boolean p;
    private boolean q;
    private boolean r;
    private View s;
    private HwHealthCommonLineChart t;
    private ArrayList<View> u;
    private HealthTextView v;
    private HwHealthLineScrollChartHolder w;
    private final AtomicBoolean x;
    private foq y;
    private final AtomicBoolean z;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public SectionLineChart_01(Context context) {
        this(context, null);
    }

    public SectionLineChart_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionLineChart_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.af = System.currentTimeMillis();
        this.z = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.ac = "TEMPERATURE_MIN_MAX";
        this.aa = "TEMPERATURE_MIN_MAX";
        this.q = true;
        c(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionLineChart_01", "onCreateView");
        h();
        return this.f7819b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionLineChart_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionLineChart_01", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionLineChart_01", "no need to bind");
            return;
        }
        Object obj = map.get("FIRST_TIME_BIND");
        boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
        Object obj2 = map.get("START_TIME");
        if (obj2 instanceof Long) {
            this.af = ((Long) obj2).longValue();
        }
        this.o = (DataInfos) qqw.a(map, "DATA_INFO", (Class<Object>) DataInfos.class, (Object) null);
        this.af = qqw.e((Map) map, "START_TIME", 0L);
        qsp.b(this.e, (CharSequence) qqw.a(map, "CURSOR_UP_AVERAGE_TEXT", (Class<String>) String.class, ""));
        this.f7820c = (List) qqw.a(map, "BOTTOM_LEGEND_TEXT", (Class<Object>) List.class, (Object) null);
        this.f7818a = (List) qqw.a(map, "BOTTOM_LEGEND_TEXT_CONTENT_DESCRIPTION", (Class<Object>) List.class, (Object) null);
        this.w = (HwHealthLineScrollChartHolder) qqw.a(map, "HEALTH_CHART_HOLDER", (Class<Object>) HwHealthLineScrollChartHolder.class, (Object) null);
        this.i = (LineChartRangeShowCallback) qqw.a(map, "RANGE_SHOW_CALL_BACK", (Class<Object>) LineChartRangeShowCallback.class, (Object) null);
        this.ac = (String) qqw.a(map, "SHOW_DATA_TYPE", (Class<String>) String.class, "");
        qsp.c(this.v, (Drawable) qqw.a(map, "BOTTOM_LEFT_COLOR", (Class<Object>) Drawable.class, (Object) null));
        qsp.c(this.ab, (Drawable) qqw.a(map, "BOTTOM_MID_COLOR", (Class<Object>) Drawable.class, (Object) null));
        qsp.c(this.n, (Drawable) qqw.a(map, "BOTTOM_RIGHT_COLOR", (Class<Object>) Drawable.class, (Object) null));
        DataInfos dataInfos = this.o;
        if (dataInfos == null || dataInfos == DataInfos.NoDataPlaceHolder) {
            LogUtil.a("SectionLineChart_01", "mDataInfos is invalid");
        } else {
            d(zBooleanValue);
        }
    }

    private void d(boolean z) {
        if (!z) {
            LogUtil.a("SectionLineChart_01", "is not FirstTimeBind");
            if (this.aa != this.ac) {
                f();
                this.aa = this.ac;
                return;
            } else {
                g();
                return;
            }
        }
        if (this.w == null) {
            LogUtil.a("SectionLineChart_01", "mChartHolder is null");
            return;
        }
        b();
        k();
        g();
    }

    private void f() {
        HwHealthCommonLineChart hwHealthCommonLineChart;
        LogUtil.d("SectionLineChart_01", "onSelect is ", this.ac);
        k();
        if (this.w == null || (hwHealthCommonLineChart = this.t) == null || hwHealthCommonLineChart.acquireScrollAdapter() == null) {
            return;
        }
        if (this.p) {
            this.t.clearValues();
            this.w.addDataLayer(this.t, DataInfos.TemperatureDayDetail);
        }
        this.p = true;
        this.t.setWillNotDraw(false);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.t.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        this.t.setMarkerViewPosition(null);
        this.t.resetYaxisAnimateValue();
        this.t.refresh();
    }

    private void c(Context context) {
        if (context == null) {
            LogUtil.j("SectionLineChart_01", "initConstructor context or dataType is null");
            return;
        }
        Context contextB = BaseApplication.b();
        this.h = contextB;
        this.ad = contextB.getResources();
        this.q = UnitUtil.a();
        boolean zO = Utils.o();
        this.r = zO;
        if (zO) {
            this.ac = "SKIN_TEMPERATURE_MIN_MAX";
        }
    }

    private void h() {
        if (this.f7819b == null) {
            LogUtil.j("SectionLineChart_01", "initView mainView is null, start to inflate");
            this.f7819b = LayoutInflater.from(this.h).inflate(R.layout.section_temperature_barchart, (ViewGroup) this, false);
        }
        this.d = (ImageView) this.f7819b.findViewById(R.id.temperature_arrow_left);
        this.j = (ImageView) this.f7819b.findViewById(R.id.temperature_arrow_right);
        this.l = (HealthTextView) this.f7819b.findViewById(R.id.temperature_detail_time_date_tv);
        this.f = (HealthTextView) this.f7819b.findViewById(R.id.temperature_cursor_time);
        this.k = (HealthTextView) this.f7819b.findViewById(R.id.temperature_cursor_value);
        this.m = (HealthTextView) this.f7819b.findViewById(R.id.temperature_cursor_unit);
        this.e = (HealthTextView) this.f7819b.findViewById(R.id.temperature_cursor_avg);
        this.ah = (HealthViewPager) this.f7819b.findViewById(R.id.temperature_viewpager);
        l();
        this.d.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.l.setOnClickListener(this);
        Typeface typefaceC = qrr.c();
        this.k.setTypeface(typefaceC);
        this.m.setTypeface(typefaceC);
        setLiftAndRightImage();
    }

    private void l() {
        if (qrs.y()) {
            d(R.id.temperature_chart_view_legend_trable, R.id.temperature_chart_view_legend_trable_inflated);
        } else {
            d(R.id.temperature_chart_view_legend, R.id.temperature_chart_view_legend_inflated);
        }
        View view = this.s;
        if (view != null) {
            this.v = (HealthTextView) view.findViewById(R.id.temperature_low_legend);
            this.ab = (HealthTextView) this.s.findViewById(R.id.temperature_normal_legend);
            this.n = (HealthTextView) this.s.findViewById(R.id.temperature_high_legend);
        }
    }

    private void d(int i, int i2) {
        if (this.ae == null) {
            this.ae = (ViewStub) this.f7819b.findViewById(i);
        }
        if (this.ae.getParent() != null) {
            this.s = this.ae.inflate();
        } else {
            this.s = this.f7819b.findViewById(i2);
        }
    }

    public void setLiftAndRightImage() {
        if (LanguageUtil.ba(this.h)) {
            this.d.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_right_arrow_click_selector));
            this.j.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_left_arrow_click_selector));
        } else {
            this.d.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_left_arrow_click_selector));
            this.j.setBackground(ContextCompat.getDrawable(this.h, R.drawable.common_right_arrow_click_selector));
        }
    }

    private void g() {
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.t.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter == null) {
            LogUtil.e("SectionLineChart_01", "refreshShowRange scrollAdapter is null.");
            return;
        }
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        this.t.setWillNotDraw(false);
        this.t.setMarkerViewPosition(null);
        this.t.resetYaxisAnimateValue();
        this.t.reflesh(this.af);
        LogUtil.a("SectionLineChart_01", "lineChart reflesh on show range change " + this.af);
    }

    private void b() {
        this.u = new ArrayList<>(16);
        this.y = new foq(this.u);
        this.ah.setIsCompatibleScrollView(true);
        this.ah.setIsScroll(false);
        this.ah.setAdapter(this.y);
        if (this.t == null) {
            LogUtil.a("SectionLineChart_01", "mLineChart == null");
            HwHealthCommonLineChart hwHealthCommonLineChart = new HwHealthCommonLineChart(this.h.getApplicationContext());
            this.t = hwHealthCommonLineChart;
            hwHealthCommonLineChart.setMoveToLastDataStamp(true);
            this.t.setLayerType(1, null);
            c();
            this.u.clear();
            this.u.add(0, this.t);
            this.w.addDataLayer(this.t, this.o);
            this.y.notifyDataSetChanged();
            this.t.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.2
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                public void onRangeShow(int i, int i2) {
                    long millis = TimeUnit.MINUTES.toMillis(i);
                    if (lsl.c(millis, TimeUnit.MINUTES.toMillis(i2))) {
                        SectionLineChart_01.this.b(i);
                    }
                    SectionLineChart_01.this.a(i, i2);
                    if (SectionLineChart_01.this.i != null) {
                        SectionLineChart_01.this.i.onRangeChange(SectionLineChart_01.this.getContext(), millis);
                    }
                }
            });
            this.t.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.1
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                    int iF = qnh.f((int) SectionLineChart_01.this.t.fetchMarkViewMinuteValue());
                    ObserverManagerUtil.e("KnitHealthData_MarkView_" + SectionLineChart_01.this.o, Long.valueOf(TimeUnit.MINUTES.toMillis(iF)));
                    SectionLineChart_01.this.b(iF);
                    SectionLineChart_01.this.d(str, list);
                }
            });
        }
    }

    private void c() {
        this.t.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                SectionLineChart_01.this.i();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                SectionLineChart_01.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.t.canScrollOlderPager()) {
            this.d.setVisibility(0);
            this.d.setClickable(true);
            this.z.set(true);
        } else {
            this.d.setVisibility(4);
            this.d.setClickable(false);
            this.z.set(false);
        }
        if (this.t.canScrollNewerPager()) {
            this.j.setVisibility(0);
            this.j.setClickable(true);
            this.x.set(true);
        } else {
            this.j.setVisibility(4);
            this.j.setClickable(false);
            this.x.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.g == null) {
            this.g = new HealthCalendar();
        }
        this.g = this.g.transformFromCalendar(calendar);
    }

    public void a(int i, int i2) {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.t;
        if (hwHealthCommonLineChart == null) {
            return;
        }
        String rangeText = hwHealthCommonLineChart.formatRangeText(i, i2);
        long j = ((long) i) * 60000;
        setDayAndWeek(rangeText, DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_WEEK), lsl.aa(j));
    }

    public void setDayAndWeek(String str, String str2, boolean z) {
        this.l.setText(str);
        if (this.o != DataInfos.TemperatureDayDetail) {
            return;
        }
        if (z) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
    }

    public void e(String str, List<HwHealthMarkerView.d> list) {
        if (njy.b(list)) {
            a(str, list);
        } else {
            a("--", (List<HwHealthMarkerView.d>) null);
        }
    }

    protected void d(String str, List<HwHealthMarkerView.d> list) {
        String strC = ftw.c(ftw.e(str));
        if (this.o == DataInfos.TemperatureDayDetail) {
            e(strC, list);
        } else {
            e(str, list);
        }
    }

    public void a(String str, List<HwHealthMarkerView.d> list) {
        HealthTextView healthTextView = this.f;
        if (healthTextView != null) {
            healthTextView.setText(str);
        } else {
            LogUtil.j("SectionLineChart_01", "notifyNumerical, mCursorTime is null");
        }
        e(list, str);
    }

    private void e(List<HwHealthMarkerView.d> list, String str) {
        String strC;
        String string;
        View view;
        if (njy.e(list)) {
            LogUtil.j("SectionLineChart_01", "notifyView datas is empty");
            strC = "--";
        } else {
            strC = c(list.get(list.size() - 1).f23737a);
        }
        LogUtil.a("SectionLineChart_01", "notifyView data is ", strC);
        if ("--".equals(strC)) {
            this.k.setText(strC);
            this.e.setVisibility(8);
            this.m.setVisibility(8);
            lrd.c(this.k, 2);
            return;
        }
        if (this.q) {
            string = this.ad.getString(R.string.IDS_settings_health_temperature_unit, "");
        } else {
            string = this.ad.getString(R.string.IDS_temp_unit_fahrenheit, "");
        }
        DataInfos dataInfos = this.o;
        if (dataInfos != null && dataInfos.isDayData()) {
            this.k.setTextSize(0, getResources().getDimension(R.dimen.textSizeHeadline5));
        }
        this.k.setText(strC);
        this.m.setText(string);
        lrd.c(this.k, 1);
        if (b(str)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
        this.m.setVisibility(0);
        if (!qrs.t() || (view = this.f7819b) == null) {
            return;
        }
        view.requestLayout();
        invalidate();
    }

    private boolean b(String str) {
        HwHealthBaseBarLineData hwHealthBaseBarLineData = (HwHealthBaseBarLineData) this.t.getData();
        if (hwHealthBaseBarLineData == null) {
            LogUtil.e("SectionLineChart_01", "getHwHealthUnixBarDataSet data null");
            return true;
        }
        List<T> dataSets = hwHealthBaseBarLineData.getDataSets();
        if (dataSets == 0) {
            LogUtil.e("SectionLineChart_01", "dataSets is null");
            return true;
        }
        for (T t : dataSets) {
            if (t != null) {
                for (Map.Entry<Long, IStorageModel> entry : t.acquireOriginalVals().entrySet()) {
                    if (entry != null && c(entry.getKey().longValue(), str)) {
                        IStorageModel value = entry.getValue();
                        if ((value instanceof fqt) && ((fqt) value).d() > 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean c(long j, String str) {
        String strC = ftw.c(j);
        return strC != null && strC.equals(str);
    }

    private void k() {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.ac)) {
            this.v.setVisibility(8);
            this.ab.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        if (this.f7820c.isEmpty()) {
            return;
        }
        if (this.q) {
            strValueOf = String.valueOf(this.f7820c.get(0));
            strValueOf2 = String.valueOf(this.f7820c.get(1));
            strValueOf3 = String.valueOf(this.f7820c.get(2));
        } else {
            strValueOf = String.valueOf(this.f7820c.get(3));
            strValueOf2 = String.valueOf(this.f7820c.get(4));
            strValueOf3 = String.valueOf(this.f7820c.get(5));
        }
        this.v.setText(strValueOf);
        this.ab.setText(strValueOf2);
        this.n.setText(strValueOf3);
        this.v.setVisibility(0);
        this.ab.setVisibility(0);
        this.n.setVisibility(0);
        if (LanguageUtil.bd(this.h)) {
            HealthTextView healthTextView = this.v;
            healthTextView.setTextSize(0, healthTextView.getTextSize() * 0.7f);
            HealthTextView healthTextView2 = this.ab;
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * 0.7f);
            HealthTextView healthTextView3 = this.n;
            healthTextView3.setTextSize(0, healthTextView3.getTextSize() * 0.7f);
        }
        if (njy.e(this.f7818a, 5)) {
            return;
        }
        this.v.setContentDescription(String.valueOf(this.f7818a.get(this.q ? 0 : 3)));
        this.ab.setContentDescription(String.valueOf(this.f7818a.get(this.q ? 1 : 4)));
        this.n.setContentDescription(String.valueOf(this.f7818a.get(this.q ? 2 : 5)));
    }

    public String c(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 1);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        knitFragment.setOnActivityResultListener(new KnitFragment.OnActivityResultListener() { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.3
            @Override // com.huawei.health.knit.ui.KnitFragment.OnActivityResultListener
            public void onActivityResult(int i2, int i3, Intent intent) {
                if (i3 != -1 || intent == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
                if (serializableExtra instanceof HealthCalendar) {
                    SectionLineChart_01.this.g = (HealthCalendar) serializableExtra;
                    SectionLineChart_01 sectionLineChart_01 = SectionLineChart_01.this;
                    sectionLineChart_01.af = sectionLineChart_01.g.transformCalendar().getTimeInMillis();
                    if (SectionLineChart_01.this.t != null) {
                        SectionLineChart_01.this.t.reflesh(SectionLineChart_01.this.af);
                        LogUtil.a("SectionLineChart_01", "lineChart reflesh on activity result " + SectionLineChart_01.this.af);
                    }
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.d) {
            if (this.z.get()) {
                d();
                return;
            }
            return;
        }
        if (view == this.j) {
            if (this.x.get()) {
                j();
            }
        } else {
            if (view.getId() == R.id.temperature_detail_time_date_tv) {
                KnitFragment knitFragment = getKnitFragment();
                if (knitFragment != null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", this.g);
                    bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{2104, HiHealthDataType.d, DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()}, new int[]{DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM.value(), DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value()}));
                    HealthCalendarActivity.a(knitFragment, bundle);
                    return;
                }
                return;
            }
            LogUtil.j("SectionLineChart_01", "click view unknow");
        }
    }

    private void d() {
        LogUtil.d("SectionLineChart_01", "Day initLeftArrowClick");
        HwHealthCommonLineChart hwHealthCommonLineChart = this.t;
        if (hwHealthCommonLineChart == null || hwHealthCommonLineChart.isAnimating()) {
            return;
        }
        a();
    }

    private void j() {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.t;
        if (hwHealthCommonLineChart == null || hwHealthCommonLineChart.isAnimating()) {
            return;
        }
        e();
    }

    private void a() {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.t;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.4
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

    private void e() {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.t;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.health.knit.section.view.SectionLineChart_01.6
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
}
