package com.huawei.health.knit.section.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.HwHealthPressureBarChart;
import com.huawei.health.knit.section.listener.BarChartRangeShowCallback;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.foo;
import defpackage.ftw;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qjy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
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
public class SectionLineChart extends BaseSection implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinearLayout f7809a;
    private RelativeLayout ac;
    private HealthViewPager ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthTextView f7810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected DataInfos f7811c;
    protected Context d;
    protected ImageView e;
    protected ImageView f;
    protected HealthTextView g;
    protected HealthTextView h;
    protected List<Object> i;
    protected HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    protected HealthTextView m;
    protected List<Object> n;
    protected View o;
    private BarChartRangeShowCallback p;
    private HealthCalendar q;
    private HealthTextView r;
    private HealthTextView s;
    private HwHealthLineScrollChartHolder t;
    private final AtomicBoolean u;
    private foo v;
    private HwHealthPressureBarChart w;
    private final AtomicBoolean x;
    private ArrayList<View> y;
    private long z;

    public SectionLineChart(Context context) {
        this(context, null);
    }

    public SectionLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = 0L;
        this.x = new AtomicBoolean(false);
        this.u = new AtomicBoolean(false);
        b(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_SectionLineChart", "onCreateView");
        h();
        return this.o;
    }

    private void h() {
        if (this.o == null) {
            LogUtil.j("Section_SectionLineChart", "initView mainView is null, start to inflate");
            this.o = LayoutInflater.from(this.d).inflate(R.layout.section1_linechart_02_layout, (ViewGroup) this, false);
        }
        LinearLayout linearLayout = (LinearLayout) this.o.findViewById(R.id.section_line_ll);
        this.f7809a = linearLayout;
        linearLayout.setMinimumWidth(qrs.i(this.d));
        this.e = (ImageView) this.o.findViewById(R.id.left_arrow);
        this.f = (ImageView) this.o.findViewById(R.id.right_arrow);
        this.f7810b = (HealthTextView) this.o.findViewById(R.id.first_layer_date);
        this.g = (HealthTextView) this.o.findViewById(R.id.second_layer_date_time);
        this.h = (HealthTextView) this.o.findViewById(R.id.third_layer_cursor_text);
        this.m = (HealthTextView) this.o.findViewById(R.id.third_layer_cursor_value);
        this.j = (HealthTextView) this.o.findViewById(R.id.third_layer_cursor_state);
        this.ad = (HealthViewPager) this.o.findViewById(R.id.section_view_pager);
        this.l = (HealthTextView) this.o.findViewById(R.id.legend_one_text);
        this.r = (HealthTextView) this.o.findViewById(R.id.legend_two_text);
        this.s = (HealthTextView) this.o.findViewById(R.id.legend_three_text);
        this.k = (HealthTextView) this.o.findViewById(R.id.legend_four_text);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.f7810b.setOnClickListener(this);
        if (LanguageUtil.ba(this.d)) {
            this.e.setImageResource(R.drawable.common_right_arrow_click_selector);
            this.f.setImageResource(R.drawable.common_left_arrow_click_selector);
        } else {
            this.e.setImageResource(R.drawable.common_left_arrow_click_selector);
            this.f.setImageResource(R.drawable.common_right_arrow_click_selector);
        }
        getKnitFragment().setRecyclerViewDescendantFocusability(ARImageMetadata.HOT_PIXEL_MODE);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        HwHealthPressureBarChart hwHealthPressureBarChart;
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_SectionLineChart", "no need to bind");
            return;
        }
        boolean zA = qqw.a(map, "FIRST_TIME_BIND", false);
        this.z = qqw.e((Map) map, "START_TIME", 0L);
        e(qqw.d((Map) map, "TOAST_TEXT", ""));
        if (!zA) {
            long j = this.z;
            if (j != 0 && (hwHealthPressureBarChart = this.w) != null) {
                hwHealthPressureBarChart.reflesh(j);
            }
            g();
            return;
        }
        this.f7811c = (DataInfos) qqw.a(map, "DATA_INFO", (Class<Object>) DataInfos.class, (Object) null);
        this.n = (List) qqw.a(map, "CURSOR_UP_AVERAGE_TEXT", (Class<Object>) List.class, (Object) null);
        this.i = (List) qqw.a(map, "CURSOR_UP_AVERAGE_STATUS", (Class<Object>) List.class, (Object) null);
        this.l.setText((CharSequence) qqw.a(map, "LEGEND_ONE_TEXT", (Class<String>) String.class, ""));
        this.r.setText((CharSequence) qqw.a(map, "LEGEND_TWO_TEXT", (Class<String>) String.class, ""));
        this.s.setText((CharSequence) qqw.a(map, "LEGEND_THREE_TEXT", (Class<String>) String.class, ""));
        this.k.setText((CharSequence) qqw.a(map, "LEGEND_FOUR_TEXT", (Class<String>) String.class, ""));
        HwHealthLineScrollChartHolder hwHealthLineScrollChartHolder = (HwHealthLineScrollChartHolder) qqw.a(map, "HEALTH_CHART_HOLDER", (Class<Object>) HwHealthLineScrollChartHolder.class, (Object) null);
        if (hwHealthLineScrollChartHolder != null) {
            this.t = hwHealthLineScrollChartHolder;
        }
        this.p = (BarChartRangeShowCallback) qqw.a(map, "RANGE_SHOW_CALL_BACK", (Class<Object>) BarChartRangeShowCallback.class, (Object) null);
        if (this.t == null) {
            LogUtil.a("Section_SectionLineChart", "mChartHolder is null");
            return;
        }
        DataInfos dataInfos = this.f7811c;
        if (dataInfos == null || dataInfos == DataInfos.NoDataPlaceHolder) {
            LogUtil.a("Section_SectionLineChart", "mDataInfos is invalid");
            return;
        }
        b();
        n();
        g();
        m();
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.section.view.SectionLineChart$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7816b;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f7816b = iArr;
            try {
                iArr[DataInfos.PressureDayDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7816b[DataInfos.PressureWeekDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7816b[DataInfos.PressureMonthDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7816b[DataInfos.PressureYearDetail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void m() {
        int i = AnonymousClass7.f7816b[this.f7811c.ordinal()];
        if (i == 1) {
            lrd.b(this.e, qre.f(R.string.accessibility_last_day));
            lrd.b(this.f, qre.f(R.string.accessibility_next_day));
            return;
        }
        if (i == 2) {
            lrd.b(this.e, qre.f(R.string.accessibility_last_week));
            lrd.b(this.f, qre.f(R.string.accessibility_next_week));
        } else if (i == 3) {
            lrd.b(this.e, qre.f(R.string.accessibility_last_month));
            lrd.b(this.f, qre.f(R.string.accessibility_next_month));
        } else if (i == 4) {
            lrd.b(this.e, qre.f(R.string.accessibility_last_year));
            lrd.b(this.f, qre.f(R.string.accessibility_next_year));
        } else {
            ReleaseLogUtil.e("Section_SectionLineChart", "DataInfos is unknown");
        }
    }

    private void n() {
        if (this.z <= 0 || this.w.acquireScrollAdapter() == null) {
            return;
        }
        int iC = c(this.z);
        int iH = qnh.h(iC);
        c(iC);
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        hwHealthPressureBarChart.setShowRange(iH, hwHealthPressureBarChart.acquireScrollAdapter().acquireRange());
    }

    private int c(long j) {
        int i = AnonymousClass7.f7816b[this.f7811c.ordinal()];
        if (i == 1) {
            return qnh.b(j);
        }
        if (i == 2) {
            return qnh.o(j);
        }
        if (i == 3) {
            return qnh.i(j);
        }
        if (i != 4) {
            return 0;
        }
        return qnh.t(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        if (hwHealthPressureBarChart == null) {
            LogUtil.e("Section_SectionLineChart", "mLineChart null");
            return;
        }
        hwHealthPressureBarChart.setWillNotDraw(false);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.w.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        this.w.setMarkerViewPosition(null);
        this.w.refresh();
    }

    private void b() {
        this.y = new ArrayList<>(16);
        foo fooVar = new foo(this.y, this.d);
        this.v = fooVar;
        this.ad.setAdapter(fooVar);
        this.ad.setIsCompatibleScrollView(true);
        this.ad.setIsScroll(false);
        if (this.w == null) {
            HwHealthPressureBarChart hwHealthPressureBarChart = new HwHealthPressureBarChart(this.d.getApplicationContext(), this.f7811c);
            this.w = hwHealthPressureBarChart;
            hwHealthPressureBarChart.setLayerType(1, null);
            e();
            this.t.addDataLayer(this.w, this.f7811c);
            this.y.add(0, this.w);
            this.v.notifyDataSetChanged();
            this.w.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.health.knit.section.view.SectionLineChart.4
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                public void onRangeShow(int i, int i2) {
                    if (lsl.c(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
                        SectionLineChart.this.c(i);
                    }
                    SectionLineChart.this.b(i, i2);
                    if (SectionLineChart.this.p != null) {
                        SectionLineChart.this.p.onRangeChange(i, i2);
                    }
                }
            });
            this.w.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.health.knit.section.view.SectionLineChart.5
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                    int iF = qnh.f((int) SectionLineChart.this.w.fetchMarkViewMinuteValue());
                    ObserverManagerUtil.e("KnitHealthData_MarkView_" + SectionLineChart.this.f7811c, Long.valueOf(TimeUnit.MINUTES.toMillis(iF)));
                    SectionLineChart.this.c(iF);
                    SectionLineChart.this.d(str, list);
                }
            });
            this.w.setSection(this);
        }
        i();
    }

    private void i() {
        List<Object> list = this.n;
        if (list != null && list.size() > 1 && (this.n.get(1) instanceof String)) {
            this.h.setText(String.valueOf(this.n.get(1)));
        }
        this.h.setVisibility(0);
        this.m.setText("--");
    }

    public void b(int i, int i2) {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        if (hwHealthPressureBarChart == null) {
            return;
        }
        String rangeText = hwHealthPressureBarChart.formatRangeText(i, i2);
        long j = ((long) i) * 60000;
        e(rangeText, DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_WEEK), lsl.aa(j));
    }

    public void d(String str, List<HwHealthMarkerView.d> list) {
        if (njy.b(list)) {
            b(str, list);
        } else {
            b("--", list);
        }
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("Section_SectionLineChart", "initConstructor context or dataType is null");
        } else {
            this.d = context;
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        knitFragment.setOnActivityResultListener(new KnitFragment.OnActivityResultListener() { // from class: com.huawei.health.knit.section.view.SectionLineChart.1
            @Override // com.huawei.health.knit.ui.KnitFragment.OnActivityResultListener
            public void onActivityResult(int i2, int i3, Intent intent) {
                if (i3 != -1 || intent == null) {
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
                if (serializableExtra instanceof HealthCalendar) {
                    SectionLineChart.this.q = (HealthCalendar) serializableExtra;
                    SectionLineChart sectionLineChart = SectionLineChart.this;
                    sectionLineChart.z = sectionLineChart.q.transformCalendar().getTimeInMillis();
                    SectionLineChart.this.w.reflesh(SectionLineChart.this.z);
                    SectionLineChart.this.g();
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.e) {
            if (this.x.get()) {
                a();
                return;
            }
            return;
        }
        if (view == this.f) {
            if (this.u.get()) {
                j();
            }
        } else {
            if (view.getId() == R.id.first_layer_date) {
                KnitFragment knitFragment = getKnitFragment();
                if (knitFragment != null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("calendar", this.q);
                    bundle.putBoolean("isSetGrayUnmarkedDate", true);
                    bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{44301, 44307}));
                    HealthCalendarActivity.a(knitFragment, bundle);
                    return;
                }
                return;
            }
            LogUtil.j("Section_SectionLineChart", "click view unknow");
        }
    }

    private void a() {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        if (hwHealthPressureBarChart == null || hwHealthPressureBarChart.isAnimating()) {
            return;
        }
        d();
    }

    private void j() {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        if (hwHealthPressureBarChart == null || hwHealthPressureBarChart.isAnimating()) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.q == null) {
            this.q = new HealthCalendar();
        }
        this.q = this.q.transformFromCalendar(calendar);
    }

    private void e() {
        this.w.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.SectionLineChart.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                SectionLineChart.this.f();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                SectionLineChart.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.w.canScrollOlderPager()) {
            this.e.setVisibility(0);
            this.e.setClickable(true);
            this.x.set(true);
        } else {
            this.e.setVisibility(4);
            this.e.setClickable(false);
            this.x.set(false);
        }
        if (this.w.canScrollNewerPager()) {
            this.f.setVisibility(0);
            this.f.setClickable(true);
            this.u.set(true);
        } else {
            this.f.setVisibility(4);
            this.f.setClickable(false);
            this.u.set(false);
        }
    }

    private void d() {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        Objects.requireNonNull(hwHealthPressureBarChart);
        hwHealthPressureBarChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthPressureBarChart) { // from class: com.huawei.health.knit.section.view.SectionLineChart.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(hwHealthPressureBarChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    private void c() {
        HwHealthPressureBarChart hwHealthPressureBarChart = this.w;
        Objects.requireNonNull(hwHealthPressureBarChart);
        hwHealthPressureBarChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthPressureBarChart) { // from class: com.huawei.health.knit.section.view.SectionLineChart.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(hwHealthPressureBarChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    private void e(String str, String str2, boolean z) {
        this.f7810b.setText(str);
    }

    private void b(String str, List<HwHealthMarkerView.d> list) {
        HealthTextView healthTextView = this.g;
        if (healthTextView != null) {
            healthTextView.setText(str);
        } else {
            LogUtil.j("Section_SectionLineChart", "notifyNumerical, mDateOrTime is null");
        }
        d(list);
    }

    private void d(List<HwHealthMarkerView.d> list) {
        String strB;
        if (njy.e(list)) {
            LogUtil.j("Section_SectionLineChart", "notifyView datas is empty");
            strB = "--";
        } else {
            strB = b(list.get(list.size() - 1).f23737a);
        }
        this.m.setText(strB);
        if ("--".equals(strB)) {
            this.h.setVisibility(4);
            this.j.setVisibility(4);
            return;
        }
        List<Object> list2 = this.n;
        if (list2 != null && list2.size() > 1) {
            String thirdLayerText = getThirdLayerText();
            String strA = a(list.get(list.size() - 1).f23737a);
            this.h.setText(thirdLayerText);
            this.j.setText(strA);
        }
        this.h.setVisibility(0);
        this.j.setVisibility(0);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_SectionLineChart";
    }

    public String b(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    public String a(HwHealthBaseEntry hwHealthBaseEntry) {
        return ftw.c((hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) ? 0 : (int) hwHealthBaseEntry.getY(), this.i);
    }

    public String getThirdLayerText() {
        if (this.f7811c == DataInfos.PressureWeekDetail || this.f7811c == DataInfos.PressureMonthDetail) {
            return String.valueOf(this.n.get(0));
        }
        if (this.f7811c == DataInfos.PressureYearDetail) {
            return String.valueOf(this.n.get(1));
        }
        return "";
    }

    private void e(String str) {
        if (str.isEmpty()) {
            return;
        }
        ViewStub viewStub = (ViewStub) this.o.findViewById(R.id.auto_test_view_stub);
        if (viewStub != null) {
            View viewInflate = viewStub.inflate();
            if (viewInflate instanceof RelativeLayout) {
                this.ac = (RelativeLayout) viewInflate;
            }
        }
        qjy.d(this.d, new IBaseResponseCallback() { // from class: fvv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f34624c.c(i, obj);
            }
        }, this.ac, str, new String[]{"pressure_auto_detector_agree_no_again_tip", "pressure_auto_detector_dialog_time", "pressure_auto_detector_count", "pressure_auto_detetor_is_show"});
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity");
            intent.putExtra("pressure_is_have_datas", true);
            intent.putExtra("from_card", true);
            try {
                this.d.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.j("Section_SectionLineChart", "ActivityNotFoundException", e.getMessage());
            }
        }
    }
}
