package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.util.MeasureUnit;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.TemperatureBarChart;
import com.huawei.health.knit.section.listener.LineChartRangeShowCallback;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.foq;
import defpackage.frt;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.qly;
import defpackage.qnh;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
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
public class SectionBarChart_01 extends BaseSection implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7746a;
    private final AtomicBoolean aa;
    private HealthTextView ab;
    private final AtomicBoolean ac;
    private String ad;
    private HealthViewPager ae;
    private String af;
    private PopupWindow ag;
    private Resources ah;
    private long ai;
    private View aj;
    private ImageView ak;
    private ViewStub al;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f7747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TemperatureBarChart f7748c;
    private foq d;
    private HwHealthBarScrollChartHolder e;
    private List<Object> f;
    private List<Object> g;
    private ImageView h;
    private ArrayList<View> i;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private LineChartRangeShowCallback m;
    private HealthCalendar n;
    private Context o;
    private DataInfos p;
    private View q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private boolean u;
    private HealthTextView v;
    private boolean w;
    private boolean x;
    private long y;
    private HealthTextView z;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public SectionBarChart_01(Context context) {
        this(context, null);
    }

    public SectionBarChart_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionBarChart_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ai = System.currentTimeMillis();
        this.ac = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.af = "TEMPERATURE_MIN_MAX";
        this.ad = "TEMPERATURE_MIN_MAX";
        this.x = true;
        c(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionBarChart_01", "onCreateView");
        f();
        return this.f7747b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionBarChart_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionBarChart_01", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionBarChart_01", "no need to bind");
            return;
        }
        Object obj = map.get("FIRST_TIME_BIND");
        boolean z = false;
        boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
        Object obj2 = map.get("START_TIME");
        if (obj2 instanceof Long) {
            Long l = (Long) obj2;
            z = this.ai != l.longValue();
            this.ai = l.longValue();
        }
        setView(map);
        if (!zBooleanValue) {
            LogUtil.a("SectionBarChart_01", "is not FirstTimeBind");
            if (this.ad != this.af) {
                h();
                this.ad = this.af;
                return;
            } else {
                b(zBooleanValue, z);
                return;
            }
        }
        m();
        if (this.e == null) {
            LogUtil.a("SectionBarChart_01", "mChartHolder is null");
            return;
        }
        DataInfos dataInfos = this.p;
        if (dataInfos == null || dataInfos == DataInfos.NoDataPlaceHolder) {
            LogUtil.a("SectionBarChart_01", "mDataInfos is invalid");
            return;
        }
        e();
        n();
        qsp.c(this.v, (Drawable) qqw.a(map, "BOTTOM_LEFT_COLOR", (Class<Object>) Drawable.class, (Object) null));
        qsp.c(this.z, (Drawable) qqw.a(map, "BOTTOM_MID_COLOR", (Class<Object>) Drawable.class, (Object) null));
        qsp.c(this.t, (Drawable) qqw.a(map, "BOTTOM_RIGHT_COLOR", (Class<Object>) Drawable.class, (Object) null));
        b(zBooleanValue, z);
    }

    private void setView(HashMap<String, Object> map) {
        String strF;
        this.p = (DataInfos) qqw.a(map, "DATA_INFO", (Class<Object>) DataInfos.class, (Object) null);
        this.ai = qqw.e((Map) map, "START_TIME", 0L);
        this.f = (List) qqw.a(map, "BOTTOM_LEGEND_TEXT", (Class<Object>) List.class, (Object) null);
        this.g = (List) qqw.a(map, "BOTTOM_LEGEND_TEXT_CONTENT_DESCRIPTION", (Class<Object>) List.class, (Object) null);
        this.e = (HwHealthBarScrollChartHolder) qqw.a(map, "HEALTH_CHART_HOLDER", (Class<Object>) HwHealthBarScrollChartHolder.class, (Object) null);
        this.m = (LineChartRangeShowCallback) qqw.a(map, "RANGE_SHOW_CALL_BACK", (Class<Object>) LineChartRangeShowCallback.class, (Object) null);
        String strF2 = "";
        this.af = (String) qqw.a(map, "SHOW_DATA_TYPE", (Class<String>) String.class, "");
        DataInfos dataInfos = this.p;
        if (dataInfos == null) {
            ReleaseLogUtil.d("SectionBarChart_01", "setView mDataInfos is null");
            return;
        }
        if (dataInfos.isDayData()) {
            strF2 = qre.f(R.string.accessibility_last_day);
            strF = qre.f(R.string.accessibility_next_day);
        } else if (this.p.isWeekData()) {
            strF2 = qre.f(R.string.accessibility_last_week);
            strF = qre.f(R.string.accessibility_next_week);
        } else if (this.p.isMonthData()) {
            strF2 = qre.f(R.string.accessibility_last_month);
            strF = qre.f(R.string.accessibility_next_month);
        } else {
            LogUtil.a("SectionBarChart_01", "setView mDataInfos is not day/week/month");
            strF = "";
        }
        if (!TextUtils.isEmpty(strF2)) {
            lrd.b(this.j, strF2);
        }
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        lrd.b(this.h, strF);
    }

    private void m() {
        if (this.p == DataInfos.TemperatureDayDetail) {
            ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    LogUtil.a("SectionBarChart_01", "notify updateChart");
                    if (SectionBarChart_01.this.f7748c != null) {
                        SectionBarChart_01.this.f7748c.setMarkerViewPosition(null);
                        SectionBarChart_01.this.f7748c.highlightValue(qnh.h((int) (lsl.a(SectionBarChart_01.this.ai, lsl.m(SectionBarChart_01.this.ai), 30) / 60000)), false);
                        ObserverManagerUtil.a("REFRESH_TEMPERATURE_CHART");
                    }
                }
            }, "REFRESH_TEMPERATURE_CHART");
        }
    }

    private void h() {
        TemperatureBarChart temperatureBarChart;
        LogUtil.a("SectionBarChart_01", "onSelect is ", this.af);
        n();
        if (this.e == null || (temperatureBarChart = this.f7748c) == null || temperatureBarChart.acquireScrollAdapter() == null) {
            return;
        }
        boolean z = this.u;
        if (z) {
            LogUtil.a("SectionBarChart_01", "mIsSelected is ", Boolean.valueOf(z));
            this.f7748c.clearValues();
            this.e.addDataLayer(this.f7748c, this.p);
        }
        this.u = true;
        this.f7748c.setWillNotDraw(false);
        LogUtil.a("SectionBarChart_01", "mBarChart.setShowDataType is ", this.af);
        this.f7748c.setShowDataType(this.af);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.f7748c.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter != null) {
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        }
        this.f7748c.setMarkerViewPosition(null);
        this.f7748c.refresh();
    }

    public void e() {
        this.i = new ArrayList<>(16);
        this.d = new foq(this.i);
        this.ae.setIsCompatibleScrollView(true);
        this.ae.setIsScroll(false);
        this.ae.setAdapter(this.d);
        if (this.f7748c == null) {
            TemperatureBarChart temperatureBarChart = new TemperatureBarChart(this.o.getApplicationContext());
            this.f7748c = temperatureBarChart;
            temperatureBarChart.setLayerType(1, null);
            d();
            this.i.clear();
            this.i.add(this.f7748c);
            this.e.addDataLayer(this.f7748c, this.p);
            this.d.notifyDataSetChanged();
            l();
            k();
            p();
            r();
            this.f7748c.acquireScrollAdapter().acquireXAxisValueFormatter().setHealthType(HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_TEMPERATURE);
        }
    }

    private void k() {
        this.f7748c.setOnDataChangedListener(new TemperatureBarChart.OnDataChangedListener() { // from class: fvm
            @Override // com.huawei.health.knit.section.chart.TemperatureBarChart.OnDataChangedListener
            public final void onDataChangedListener(frt frtVar) {
                this.f34615a.b(frtVar);
            }
        });
    }

    public /* synthetic */ void b(frt frtVar) {
        float fE = frtVar.e();
        float fH = frtVar.h();
        float fA = frtVar.a();
        float fD = frtVar.d();
        if ((fE == 0.0f || fH == 0.0f) && (fA == 0.0f || fD == 0.0f)) {
            LogUtil.j("SectionBarChart_01", "initViews MaxTemperatureValue = ", Float.valueOf(frtVar.e()), " MaxSuspectedValue = ", Float.valueOf(frtVar.a()));
            this.r.setText("--");
            this.k.setVisibility(8);
            this.ak.setVisibility(8);
            lrd.c(this.r, 2);
            return;
        }
        String strC = c(fE, fH, fA, fD, this.x);
        Pair<String, String> pairE = e(new Pair(Float.valueOf(fH), Float.valueOf(fE)), new Pair(Float.valueOf(fD), Float.valueOf(fA)), this.x, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence) pairE.first);
        a(spannableStringBuilder, (String) pairE.first, (String) pairE.second);
        if (!strC.isEmpty()) {
            this.ak.setVisibility(0);
            this.ab.setText(strC);
        } else {
            this.ak.setVisibility(8);
        }
        this.r.setText(spannableStringBuilder);
        this.k.setVisibility(8);
        lrd.c(this.r, 1);
    }

    private void a(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int i;
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        if (iIndexOf < 0 || (i = length + iIndexOf) > spannableStringBuilder.length()) {
            LogUtil.e("SectionBarChart_01", "TemperatureStorage spannableString overflow");
            return;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_14dp)), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.textColorSecondary)), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_30dp)), iIndexOf, i, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.textColorPrimary)), iIndexOf, i, 17);
        spannableStringBuilder.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, i, 17);
    }

    private static String c(float f, float f2, float f3, float f4, boolean z) {
        if (f3 == 0.0f || f4 == 0.0f) {
            return "";
        }
        return (!(f == 0.0f && f2 == 0.0f && f3 != f4) && (f <= 0.0f || f2 <= 0.0f)) ? "" : c(f3, f4, z);
    }

    public static Pair<String, String> e(Pair<Float, Float> pair, Pair<Float, Float> pair2, boolean z, boolean z2) {
        if (pair == null || pair2 == null) {
            ReleaseLogUtil.d("SectionBarChart_01", "getTemperatureRange bodyTemperaturePair ", pair, " activeAlarmTemperatureThresholdPair ", pair2);
            return new Pair<>("--", "");
        }
        float fFloatValue = ((Float) pair.first).floatValue();
        float fFloatValue2 = ((Float) pair.second).floatValue();
        float fFloatValue3 = ((Float) pair2.first).floatValue();
        float fFloatValue4 = ((Float) pair2.second).floatValue();
        if (fFloatValue2 == 0.0f && fFloatValue == 0.0f && fFloatValue4 > 0.0f && fFloatValue3 > 0.0f) {
            if (fFloatValue4 != fFloatValue3) {
                return d(fFloatValue4, fFloatValue3, z, z2);
            }
            return e(fFloatValue3, z, z2);
        }
        if (fFloatValue2 > 0.0f && fFloatValue > 0.0f && fFloatValue4 == 0.0f && fFloatValue3 == 0.0f) {
            return d(fFloatValue2, fFloatValue, z, z2);
        }
        if (fFloatValue2 > 0.0f && fFloatValue > 0.0f && fFloatValue4 > 0.0f && fFloatValue3 > 0.0f) {
            return d(Math.max(fFloatValue2, fFloatValue4), Math.min(fFloatValue, fFloatValue3), z, z2);
        }
        return new Pair<>("--", "");
    }

    private static String c(float f, float f2, boolean z) {
        String strE = UnitUtil.e(f2, 1, 1);
        String strE2 = UnitUtil.e(f, 1, 1);
        if (f2 != f) {
            if (z) {
                return BaseApplication.getContext().getString(R.string.IDS_temp_suspected_range_celsius_unit, strE, strE2);
            }
            return BaseApplication.getContext().getString(R.string.IDS_temp_suspected_range_fahrenheit_unit, strE, strE2);
        }
        if (z) {
            return BaseApplication.getContext().getString(R.string.IDS_temp_suspected_celsius_unit, strE2);
        }
        return BaseApplication.getContext().getString(R.string.IDS_temp_suspected_fahrenheit_unit, strE2);
    }

    private static Pair<String, String> e(float f, boolean z, boolean z2) {
        String string;
        String strE = UnitUtil.e(f, 1, 1);
        if (z) {
            string = BaseApplication.getContext().getString(R.string.IDS_temp_over_suspected_celsius_unit, strE);
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_temp_over_suspected_fahrenheit_unit, strE);
        }
        if (z2) {
            string = qre.a(R.string.IDS_temp_over_suspected, UnitUtil.a(Float.valueOf(f), z ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT));
        }
        return new Pair<>(string, strE);
    }

    private static Pair<String, String> d(float f, float f2, boolean z, boolean z2) {
        String string;
        String string2 = BaseApplication.getContext().getString(R.string.IDS_hw_health_coresleep_standard_range_1, UnitUtil.e(f2, 1, 1), UnitUtil.e(f, 1, 1));
        if (z) {
            string = BaseApplication.getContext().getString(R.string.IDS_temperature_celsius_unit, string2);
        } else {
            string = BaseApplication.getContext().getString(R.string.IDS_temperature_fahrenheit_unit, string2);
        }
        if (z2) {
            string = qre.a(R.string.accessibility_range, UnitUtil.a(Float.valueOf(f2), z ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT), UnitUtil.a(Float.valueOf(f), z ? MeasureUnit.CELSIUS : MeasureUnit.FAHRENHEIT));
        }
        return new Pair<>(string, string2);
    }

    private void p() {
        this.f7748c.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                long millis = TimeUnit.MINUTES.toMillis(i);
                if (lsl.c(millis, TimeUnit.MINUTES.toMillis(i2))) {
                    SectionBarChart_01.this.c(i);
                }
                SectionBarChart_01.this.e(i, i2);
                if (SectionBarChart_01.this.m != null) {
                    SectionBarChart_01.this.m.onRangeChange(SectionBarChart_01.this.getContext(), millis);
                }
            }
        });
    }

    private void r() {
        this.f7748c.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                SectionBarChart_01.this.l.setText(str);
                int iF = qnh.f((int) SectionBarChart_01.this.f7748c.fetchMarkViewMinuteValue());
                ObserverManagerUtil.e("KnitHealthData_MarkView_" + SectionBarChart_01.this.p, Long.valueOf(TimeUnit.MINUTES.toMillis(iF)));
                SectionBarChart_01.this.c(iF);
            }
        });
    }

    private void n() {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.af)) {
            this.v.setVisibility(8);
            this.z.setVisibility(8);
            this.t.setVisibility(8);
            return;
        }
        if (this.f.isEmpty()) {
            return;
        }
        if (this.x) {
            strValueOf = String.valueOf(this.f.get(0));
            strValueOf2 = String.valueOf(this.f.get(1));
            strValueOf3 = String.valueOf(this.f.get(2));
        } else {
            strValueOf = String.valueOf(this.f.get(3));
            strValueOf2 = String.valueOf(this.f.get(4));
            strValueOf3 = String.valueOf(this.f.get(5));
        }
        this.v.setText(strValueOf);
        this.z.setText(strValueOf2);
        this.t.setText(strValueOf3);
        this.v.setVisibility(0);
        this.z.setVisibility(0);
        this.t.setVisibility(0);
        if (CollectionUtils.d(this.g, 5)) {
            return;
        }
        this.v.setContentDescription(String.valueOf(this.g.get(this.x ? 0 : 3)));
        this.z.setContentDescription(String.valueOf(this.g.get(this.x ? 1 : 4)));
        this.t.setContentDescription(String.valueOf(this.g.get(this.x ? 2 : 5)));
    }

    private void f() {
        if (this.f7747b == null) {
            LogUtil.j("SectionBarChart_01", "initView mainView is null, start to inflate");
            this.f7747b = LayoutInflater.from(this.o).inflate(R.layout.section_temperature_barchart, (ViewGroup) this, false);
        }
        if (this.aj == null) {
            LogUtil.j("SectionBarChart_01", "initView mWarningTipsView is null, start to inflate");
            this.aj = LayoutInflater.from(this.o).inflate(R.layout.section_temperature_barchart_tips_popview, (ViewGroup) this, false);
        }
        this.j = (ImageView) this.f7747b.findViewById(R.id.temperature_arrow_left);
        this.h = (ImageView) this.f7747b.findViewById(R.id.temperature_arrow_right);
        this.s = (HealthTextView) this.f7747b.findViewById(R.id.temperature_detail_time_date_tv);
        this.l = (HealthTextView) this.f7747b.findViewById(R.id.temperature_cursor_time);
        this.r = (HealthTextView) this.f7747b.findViewById(R.id.temperature_cursor_value);
        this.ak = (ImageView) this.f7747b.findViewById(R.id.warning_tips_img);
        this.ab = (HealthTextView) this.aj.findViewById(R.id.section_temperature_barchart_tips);
        if (qrs.ac()) {
            this.r.setTextSize(1, 80.0f);
        }
        this.k = (HealthTextView) this.f7747b.findViewById(R.id.temperature_cursor_unit);
        this.f7746a = (HealthTextView) this.f7747b.findViewById(R.id.temperature_cursor_avg);
        this.ae = (HealthViewPager) this.f7747b.findViewById(R.id.temperature_viewpager);
        o();
        this.j.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        setLiftAndRightImage();
        Typeface typefaceC = qrr.c();
        this.r.setTypeface(typefaceC);
        this.k.setTypeface(typefaceC);
    }

    private void o() {
        if (qrs.y()) {
            a(R.id.temperature_chart_view_legend_trable, R.id.temperature_chart_view_legend_trable_inflated);
        } else {
            a(R.id.temperature_chart_view_legend, R.id.temperature_chart_view_legend_inflated);
        }
        View view = this.q;
        if (view != null) {
            this.v = (HealthTextView) view.findViewById(R.id.temperature_low_legend);
            this.z = (HealthTextView) this.q.findViewById(R.id.temperature_normal_legend);
            this.t = (HealthTextView) this.q.findViewById(R.id.temperature_high_legend);
        }
    }

    private void a(int i, int i2) {
        if (this.al == null) {
            this.al = (ViewStub) this.f7747b.findViewById(i);
        }
        if (this.al.getParent() != null) {
            this.q = this.al.inflate();
        } else {
            this.q = this.f7747b.findViewById(i2);
        }
    }

    private void c(Context context) {
        if (context == null) {
            LogUtil.j("SectionBarChart_01", "initConstructor context or dataType is null");
            return;
        }
        this.o = context;
        this.ah = context.getResources();
        this.x = UnitUtil.a();
        boolean zO = Utils.o();
        this.w = zO;
        if (zO) {
            this.af = "SKIN_TEMPERATURE_MIN_MAX";
        }
    }

    private void b(boolean z, boolean z2) {
        TemperatureBarChart temperatureBarChart = this.f7748c;
        if (temperatureBarChart == null) {
            LogUtil.j("SectionBarChart_01", "mBarChart = null");
            return;
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = temperatureBarChart.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter != null) {
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        }
        this.f7748c.setWillNotDraw(false);
        if (z) {
            this.f7748c.reflesh(this.ai);
            this.f7748c.setMarkerViewPosition(null);
        } else if (z2) {
            this.f7748c.reflesh(this.ai);
            TemperatureBarChart temperatureBarChart2 = this.f7748c;
            if (temperatureBarChart2 instanceof HwHealthBaseScrollBarLineChart) {
                temperatureBarChart2.adsorbMarkerViewToSelectedDataByDataArea();
            }
        } else {
            this.f7748c.refresh();
            TemperatureBarChart temperatureBarChart3 = this.f7748c;
            if (temperatureBarChart3 instanceof HwHealthBaseScrollBarLineChart) {
                temperatureBarChart3.adsorbMarkerViewToSelectedDataByDataArea();
            }
        }
        LogUtil.a("SectionBarChart_01", "lineChart reflesh on show range change" + this.ai);
    }

    public void setLiftAndRightImage() {
        if (LanguageUtil.ba(this.o)) {
            this.j.setBackground(ContextCompat.getDrawable(this.o, R.drawable.common_right_arrow_click_selector));
            this.h.setBackground(ContextCompat.getDrawable(this.o, R.drawable.common_left_arrow_click_selector));
        } else {
            this.j.setBackground(ContextCompat.getDrawable(this.o, R.drawable.common_left_arrow_click_selector));
            this.h.setBackground(ContextCompat.getDrawable(this.o, R.drawable.common_right_arrow_click_selector));
        }
    }

    private void d() {
        this.f7748c.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                SectionBarChart_01.this.j();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                SectionBarChart_01.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f7748c.canScrollOlderPager()) {
            this.j.setVisibility(0);
            this.j.setClickable(true);
            this.ac.set(true);
        } else {
            this.j.setVisibility(4);
            this.j.setClickable(false);
            this.ac.set(false);
        }
        if (this.f7748c.canScrollNewerPager()) {
            this.h.setVisibility(0);
            this.h.setClickable(true);
            this.aa.set(true);
        } else {
            this.h.setVisibility(4);
            this.h.setClickable(false);
            this.aa.set(false);
        }
    }

    private void l() {
        int iH;
        if (this.y <= 0) {
            LogUtil.j("SectionBarChart_01", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        TemperatureBarChart temperatureBarChart = this.f7748c;
        if (temperatureBarChart == null || temperatureBarChart.acquireScrollAdapter() == null) {
            LogUtil.j("SectionBarChart_01", "setLastTimeForDataPlatform lastTimestamp invalid");
            return;
        }
        if (this.p.isDayData()) {
            iH = qnh.h(qnh.b(this.y));
        } else if (this.p.isWeekData()) {
            iH = qnh.h(qnh.o(this.y));
        } else if (this.p.isMonthData()) {
            iH = qnh.h(qnh.i(this.y));
        } else {
            LogUtil.a("SectionBarChart_01", "setLastTimeForDataPlatform dataInfos is not day / month / year");
            return;
        }
        LogUtil.a("SectionBarChart_01", "startTimestamp=", Integer.valueOf(iH));
        TemperatureBarChart temperatureBarChart2 = this.f7748c;
        temperatureBarChart2.setShowRange(iH, temperatureBarChart2.acquireScrollAdapter().acquireRange());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.n == null) {
            this.n = new HealthCalendar();
        }
        this.n = this.n.transformFromCalendar(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        this.s.setText(this.f7748c.formatRangeText(i, i2));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        knitFragment.setOnActivityResultListener(new KnitFragment.OnActivityResultListener() { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.5
            @Override // com.huawei.health.knit.ui.KnitFragment.OnActivityResultListener
            public void onActivityResult(int i2, int i3, Intent intent) {
                if (i3 != -1 || intent == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
                if (serializableExtra instanceof HealthCalendar) {
                    SectionBarChart_01.this.n = (HealthCalendar) serializableExtra;
                    SectionBarChart_01 sectionBarChart_01 = SectionBarChart_01.this;
                    sectionBarChart_01.ai = sectionBarChart_01.n.transformCalendar().getTimeInMillis();
                    if (SectionBarChart_01.this.f7748c != null) {
                        SectionBarChart_01.this.f7748c.reflesh(SectionBarChart_01.this.ai);
                        LogUtil.a("SectionBarChart_01", "lineChart reflesh on activity result" + SectionBarChart_01.this.ai);
                        return;
                    }
                    LogUtil.j("SectionBarChart_01", "onActivityResult mBarChart = null");
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.j) {
            if (this.ac.get()) {
                c();
                return;
            }
            return;
        }
        if (view == this.h) {
            if (this.aa.get()) {
                g();
            }
        } else {
            if (view.getId() == R.id.temperature_detail_time_date_tv) {
                KnitFragment knitFragment = getKnitFragment();
                if (knitFragment != null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", this.n);
                    bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{2104, HiHealthDataType.d, DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()}, new int[]{DicDataTypeUtil.DataType.LOW_BODY_TEMPERATURE_ALARM.value(), DicDataTypeUtil.DataType.HIGH_BODY_TEMPERATURE_ALARM.value(), DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_ALARM.value()}));
                    HealthCalendarActivity.a(knitFragment, bundle);
                    return;
                }
                return;
            }
            if (view == this.ak) {
                i();
            } else {
                LogUtil.j("SectionBarChart_01", "click view unknow");
            }
        }
    }

    private void i() {
        View view = this.aj;
        if (this.ag == null) {
            PopupWindow popupWindow = new PopupWindow(view, -2, -2);
            this.ag = popupWindow;
            popupWindow.setOutsideTouchable(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: fvo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f34617b.d(view2);
                }
            });
        }
        int[] iArrB = b(this.ak, view);
        this.ag.showAtLocation(this.ak, 0, iArrB[0], iArrB[1]);
    }

    public /* synthetic */ void d(View view) {
        this.ag.dismiss();
    }

    private int[] b(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view2.measure(0, 0);
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        return new int[]{(iArr[0] - (measuredWidth / 2)) + (measuredWidth2 / 2), iArr[1] + (measuredHeight / 2)};
    }

    private void g() {
        TemperatureBarChart temperatureBarChart = this.f7748c;
        if (temperatureBarChart == null || temperatureBarChart.isAnimating()) {
            return;
        }
        a();
    }

    private void a() {
        TemperatureBarChart temperatureBarChart = this.f7748c;
        Objects.requireNonNull(temperatureBarChart);
        temperatureBarChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qly>.b(temperatureBarChart) { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.8
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

    private void c() {
        LogUtil.d("SectionBarChart_01", "Day initLeftArrowClick");
        TemperatureBarChart temperatureBarChart = this.f7748c;
        if (temperatureBarChart == null || temperatureBarChart.isAnimating()) {
            return;
        }
        b();
    }

    private void b() {
        TemperatureBarChart temperatureBarChart = this.f7748c;
        Objects.requireNonNull(temperatureBarChart);
        temperatureBarChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qly>.b(temperatureBarChart) { // from class: com.huawei.health.knit.section.view.SectionBarChart_01.9
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

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        LogUtil.a("SectionBarChart_01", "onDestroy");
        ObserverManagerUtil.a("REFRESH_TEMPERATURE_CHART");
    }
}
