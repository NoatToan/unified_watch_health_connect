package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.BloodOxygenLineChart;
import com.huawei.health.knit.section.chart.InteractorLineChartHolder;
import com.huawei.health.knit.section.listener.FullScreenCallback;
import com.huawei.health.knit.section.listener.OnXRangeSetCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import defpackage.fqj;
import defpackage.fqu;
import defpackage.fua;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qnt;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class SectionBloodOxygenBarChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7754a;
    private HealthTextView aa;
    private HealthTextView ab;
    private ImageView ac;
    private LinearLayout ad;
    private HealthTextView ae;
    private HealthTextView af;
    private LinearLayout ag;
    private LinearLayout ah;
    private int ai;
    private ArrayList<View> al;
    private boolean am;
    private List<Integer> an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7756c;
    private LinearLayout d;
    private ViewTreeObserver.OnGlobalLayoutListener e;
    private HealthTextView f;
    private ImageView g;
    private boolean h;
    private List<Integer> i;
    private LinearLayout j;
    private InteractorLineChartHolder k;
    private BloodOxygenLineChart l;
    private qto<View> m;
    private HealthTextView n;
    private List<String> o;
    private HealthTextView p;
    private HealthTextView q;
    private Context r;
    private HealthTextView s;
    private HealthTextView t;
    private ImageView u;
    private ImageView v;
    private HealthViewPager w;
    private View x;
    private ImageView y;
    private HwProgressBar z;

    public SectionBloodOxygenBarChart(Context context) {
        this(context, null);
        this.r = context;
    }

    public SectionBloodOxygenBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionBloodOxygenBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.an = new ArrayList();
        this.ai = Integer.MIN_VALUE;
        this.h = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.r = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_bar_chart, (ViewGroup) this, false);
        setIntervalLegendLayout(viewInflate);
        this.ai = Integer.MIN_VALUE;
        this.v = (ImageView) viewInflate.findViewById(R.id.image_up_arrow_left);
        this.ad = (LinearLayout) viewInflate.findViewById(R.id.loading_layout);
        this.z = (HwProgressBar) viewInflate.findViewById(R.id.loading_iv);
        this.u = (ImageView) viewInflate.findViewById(R.id.image_up_arrow_right);
        this.q = (HealthTextView) viewInflate.findViewById(R.id.detail_time_date);
        this.s = (HealthTextView) viewInflate.findViewById(R.id.cursor_time);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.cursor_value);
        this.t = (HealthTextView) viewInflate.findViewById(R.id.cursor_step);
        this.y = (ImageView) viewInflate.findViewById(R.id.horizontal_jump_btn);
        this.w = (HealthViewPager) viewInflate.findViewById(R.id.detail_view_pager);
        this.n = (HealthTextView) viewInflate.findViewById(R.id.cursor_blood_oxygen_text);
        this.g = (ImageView) viewInflate.findViewById(R.id.altitude_switch_btn);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.first_ll);
        i();
        c();
        a();
        d();
        f();
        g();
        h();
        if ((LanguageUtil.bi(this.r) || LanguageUtil.ab(this.r) || LanguageUtil.g(this.r) || LanguageUtil.p(this.r) || LanguageUtil.bk(this.r) || LanguageUtil.c(this.r)) && (this.n.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
            layoutParams.setMarginStart(this.r.getResources().getDimensionPixelSize(R.dimen.hw_show_size_12_dp));
            this.n.setLayoutParams(layoutParams);
        }
        if (qrs.v()) {
            this.n.setTextSize(1, 24.0f);
            this.p.setTextSize(1, 24.0f);
            this.t.setTextSize(1, 24.0f);
        }
        return viewInflate;
    }

    private void h() {
        lrd.b(this.v, qre.f(R.string.accessibility_last_day));
        lrd.b(this.u, qre.f(R.string.accessibility_next_day));
    }

    private void i() {
        if (this.e == null) {
            this.e = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    int left;
                    if (SectionBloodOxygenBarChart.this.ac == null) {
                        return;
                    }
                    if (LanguageUtil.ba(SectionBloodOxygenBarChart.this.r)) {
                        left = (((LinearLayout) SectionBloodOxygenBarChart.this.ac.getParent()).getWidth() - SectionBloodOxygenBarChart.this.ac.getRight()) - (SectionBloodOxygenBarChart.this.ac.getWidth() / 3);
                    } else {
                        left = SectionBloodOxygenBarChart.this.ac.getLeft();
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) SectionBloodOxygenBarChart.this.ag.getLayoutParams();
                    if (left != layoutParams.getMarginStart()) {
                        layoutParams.setMarginStart(left);
                        SectionBloodOxygenBarChart.this.ag.setLayoutParams(layoutParams);
                    }
                }
            };
            this.x.getViewTreeObserver().addOnGlobalLayoutListener(this.e);
            ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.2
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (njy.c(objArr, 0)) {
                        Object obj = objArr[0];
                        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                            SectionBloodOxygenBarChart.this.x.getViewTreeObserver().removeOnGlobalLayoutListener(SectionBloodOxygenBarChart.this.e);
                        }
                    }
                }
            }, "REMOVE_GLOBAL_LAYOUT");
            ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.1
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (njy.c(objArr, 0) && (objArr[0] instanceof Boolean)) {
                        SectionBloodOxygenBarChart.this.u.setVisibility(((Boolean) objArr[0]).booleanValue() ? 8 : 0);
                    }
                }
            }, "BLOOD_OXYGEN_ARROW_VISIBLE");
        }
    }

    private void b() {
        if (this.am) {
            if (!(this.l.getRenderer() instanceof fqj)) {
                this.l.setNewRenderer(DataInfos.BloodOxygenAltitudeDayDetail, this.r);
            }
        } else if (!(this.l.getRenderer() instanceof fqu)) {
            this.l.setNewRenderer(DataInfos.BloodOxygenDayDetail, this.r);
        }
        j();
    }

    private void j() {
        this.l.setWillNotDraw(false);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.l.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        this.l.setMarkerViewPosition(null);
        this.l.refresh();
    }

    private void setIntervalLegendLayout(View view) {
        if (qrs.u()) {
            a(view, R.id.interval_legend_viewstub_treble, R.id.interval_legend_viewstub_treble_inflated);
        } else {
            a(view, R.id.interval_legend_viewstub, R.id.interval_legend_viewstub_inflated);
        }
        View view2 = this.x;
        if (view2 != null) {
            this.aa = (HealthTextView) view2.findViewById(R.id.blood_oxygen_measure_range_1);
            this.af = (HealthTextView) this.x.findViewById(R.id.blood_oxygen_measure_range_2);
            this.ae = (HealthTextView) this.x.findViewById(R.id.blood_oxygen_measure_range_3);
            this.ab = (HealthTextView) this.x.findViewById(R.id.blood_oxygen_measure_range_4);
            this.f = (HealthTextView) this.x.findViewById(R.id.blood_oxygen_measure_range_5);
            this.j = (LinearLayout) this.x.findViewById(R.id.legend_layout_5);
            this.ag = (LinearLayout) this.x.findViewById(R.id.legend_layout_abnormal);
            this.ah = (LinearLayout) this.x.findViewById(R.id.extra_line_legend_layout);
            this.ac = (ImageView) this.x.findViewById(R.id.range_1_image);
        }
    }

    private void d() {
        this.o = new ArrayList(16);
        String strE = UnitUtil.e(70.0d, 2, 0);
        String strE2 = UnitUtil.e(70.0d, 1, 0);
        String strE3 = UnitUtil.e(89.0d, 2, 0);
        String strE4 = UnitUtil.e(90.0d, 2, 0);
        String strE5 = UnitUtil.e(70.0d, 2, 0);
        this.o.add(strE);
        this.o.add(strE2);
        this.o.add(strE3);
        this.o.add(strE4);
        this.o.add(strE5);
        setBloodOxygenInterval(this.o);
    }

    private void setBloodOxygenInterval(List<String> list) {
        this.aa.setText(String.format(Locale.ENGLISH, this.r.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than), list.get(0)));
        this.af.setText(String.format(Locale.ENGLISH, this.r.getString(R.string.IDS_press_auto_monitor_relax_range), list.get(1), list.get(2)));
        lrd.d(this.af, String.format(Locale.ENGLISH, this.r.getString(R.string.IDS_base_line_percent), list.get(4), list.get(2)), false);
        this.ae.setText(String.format(Locale.ENGLISH, this.r.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than), list.get(3)));
        if (fua.e()) {
            this.ab.setText(this.r.getString(R.string.IDS_hw_health_have_lower_spo2_high_risk));
        } else {
            this.ab.setText(this.r.getString(R.string.IDS_hw_health_blood_oxygen_have_lower_value));
        }
    }

    private void a(View view, int i, int i2) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub.getParent() != null) {
            this.x = viewStub.inflate();
        } else {
            this.x = view.findViewById(i2);
        }
    }

    private void c() {
        this.al = new ArrayList<>(16);
    }

    private void a() {
        this.z.setLayerType(1, null);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS");
        if (strE.equals("true")) {
            this.l = new BloodOxygenLineChart(this.r.getApplicationContext(), DataInfos.BloodOxygenAltitudeDayDetail);
        } else {
            this.l = new BloodOxygenLineChart(this.r.getApplicationContext(), DataInfos.BloodOxygenDayDetail);
        }
        if (strE.equals("true")) {
            this.l.setNewRenderer(DataInfos.BloodOxygenAltitudeDayDetail, this.r);
        } else {
            this.l.setNewRenderer(DataInfos.BloodOxygenDayDetail, this.r);
        }
        this.l.setLayerType(1, null);
        e();
        this.al.add(0, this.l);
        this.m = new qto<>(this.al);
        this.w.setIsCompatibleScrollView(true);
        this.w.setIsScroll(false);
        this.w.setAdapter(this.m);
    }

    private void e() {
        this.l.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
            }
        });
    }

    private void f() {
        if (LanguageUtil.ba(this.r)) {
            this.v.setBackground(ContextCompat.getDrawable(this.r, R.drawable.common_right_arrow_click_selector));
            this.u.setBackground(ContextCompat.getDrawable(this.r, R.drawable.common_left_arrow_click_selector));
        } else {
            this.v.setBackground(ContextCompat.getDrawable(this.r, R.drawable.common_left_arrow_click_selector));
            this.u.setBackground(ContextCompat.getDrawable(this.r, R.drawable.common_right_arrow_click_selector));
        }
    }

    private void g() {
        this.v.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionBloodOxygenBarChart.this.l.isAnimating()) {
                    return;
                }
                BloodOxygenLineChart bloodOxygenLineChart = SectionBloodOxygenBarChart.this.l;
                BloodOxygenLineChart bloodOxygenLineChart2 = SectionBloodOxygenBarChart.this.l;
                Objects.requireNonNull(bloodOxygenLineChart2);
                bloodOxygenLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(bloodOxygenLineChart2) { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.3.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        Objects.requireNonNull(bloodOxygenLineChart2);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                    }
                });
            }
        });
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionBloodOxygenBarChart.this.l.isAnimating()) {
                    return;
                }
                if (SectionBloodOxygenBarChart.this.l.getCurrentPagerStartX() == SectionBloodOxygenBarChart.this.l.getCurrentPagerStartX(lsl.r(System.currentTimeMillis()) - 1)) {
                    SectionBloodOxygenBarChart.this.u.setVisibility(8);
                }
                BloodOxygenLineChart bloodOxygenLineChart = SectionBloodOxygenBarChart.this.l;
                BloodOxygenLineChart bloodOxygenLineChart2 = SectionBloodOxygenBarChart.this.l;
                Objects.requireNonNull(bloodOxygenLineChart2);
                bloodOxygenLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(bloodOxygenLineChart2) { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.10.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                        Objects.requireNonNull(bloodOxygenLineChart2);
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                    }
                });
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionBloodOxygenLineChart";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map.get("ALTITUDE_IMAGE_LIST") instanceof List) {
            this.i = (List) map.get("ALTITUDE_IMAGE_LIST");
        }
        if ((map.get("BAR_COMMON_CHART_HOLDER") instanceof InteractorLineChartHolder) && this.k == null) {
            InteractorLineChartHolder interactorLineChartHolder = (InteractorLineChartHolder) map.get("BAR_COMMON_CHART_HOLDER");
            this.k = interactorLineChartHolder;
            interactorLineChartHolder.addDataLayer(this.l, DataInfos.BloodOxygenDayDetail);
            this.l.acquireScrollAdapter().acquireXAxisValueFormatter().enableMarkerViewShowRange(true);
            this.m.notifyDataSetChanged();
            if (map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK") instanceof OnXRangeSetCallback) {
                final OnXRangeSetCallback onXRangeSetCallback = (OnXRangeSetCallback) map.get("BAR_COMMON_MARK_CHANGE_CALL_BACK");
                this.l.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: fvp
                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                    public final void onRangeShow(int i, int i2) {
                        this.d.e(onXRangeSetCallback, i, i2);
                    }
                });
            }
            if (map.get("BAR_COMMON_MARK_TEXT_CALL_BACK") instanceof HwHealthMarkerView.OnMarkViewTextNotify) {
                final HwHealthMarkerView.OnMarkViewTextNotify onMarkViewTextNotify = (HwHealthMarkerView.OnMarkViewTextNotify) map.get("BAR_COMMON_MARK_TEXT_CALL_BACK");
                this.l.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: fvl
                    @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                    public final void onTextChanged(String str, List list) {
                        onMarkViewTextNotify.onTextChanged(str, list);
                    }
                });
            }
        }
        if ((map.get("BAR_COMMON_START_TIME") instanceof Integer) && ((Integer) map.get("BAR_COMMON_START_TIME")).intValue() != 0) {
            this.l.setShowRange(((Integer) map.get("BAR_COMMON_START_TIME")).intValue(), this.l.acquireScrollAdapter().acquireRange());
            this.l.refresh();
        }
        if (map.get("BAR_COMMON_REFLESH_TIME") instanceof Long) {
            this.l.reflesh(((Long) map.get("BAR_COMMON_REFLESH_TIME")).longValue());
        }
        qsp.b(this.q, qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""));
        qsp.b(this.s, qqw.d((Map) map, "BAR_CHART_PERIOD_STRING", ""));
        if (map.get("BAR_CHART_VALUE") instanceof SpannableString) {
            this.p.setText((SpannableString) map.get("BAR_CHART_VALUE"));
        }
        if (map.get("BAR_CHART_VALUE_STEP") instanceof String) {
            qsp.b(this.t, qqw.d((Map) map, "BAR_CHART_VALUE_STEP", ""));
        }
        b(map);
    }

    public /* synthetic */ void e(OnXRangeSetCallback onXRangeSetCallback, int i, int i2) {
        onXRangeSetCallback.onRangeShow(i, i2, this.l.fetchMarkViewMinuteValue());
    }

    private void b(HashMap<String, Object> map) {
        boolean z;
        qsp.b(this.f, qqw.d((Map) map, "BAR_CHART_LEGEND_TEXT", ""));
        qsp.b(this.n, qqw.d((Map) map, "BAR_CHART_CUSOR_NAME_TEXT", ""));
        qsp.e((View) this.y, qqw.c(map, "FULL_SCREEN_IMAGE", 0));
        if (map.get("VISIVILITY_LIST") instanceof List) {
            e(map);
        }
        if (map.get("ALTITUDE_SWITCH_LIST") instanceof List) {
            a(map);
        }
        if (map.get("BAR_CHART_CLICK_EVENT") instanceof OnClickSectionListener) {
            setClickListenerEvent(map.get("BAR_CHART_CLICK_EVENT"));
        }
        if ((map.get("BAR_CHART_REFRESH_CHART_ONLY") instanceof Boolean) && ((Boolean) map.get("BAR_CHART_REFRESH_CHART_ONLY")).booleanValue()) {
            b();
            z = true;
        } else {
            z = false;
        }
        if ((map.get("BAR_CHART_REFRESH") instanceof Boolean) && !z && ((Boolean) map.get("BAR_CHART_REFRESH")).booleanValue()) {
            j();
        }
        if (map.get("FULL_SCREEN_CALLBACK") instanceof FullScreenCallback) {
            final FullScreenCallback fullScreenCallback = (FullScreenCallback) map.get("FULL_SCREEN_CALLBACK");
            this.y.setOnClickListener(new View.OnClickListener() { // from class: fvr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34620a.c(fullScreenCallback, view);
                }
            });
        }
        if (this.t.getVisibility() == 8 && String.valueOf((SpannableString) map.get("BAR_CHART_VALUE")).equals("--")) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
    }

    public /* synthetic */ void c(FullScreenCallback fullScreenCallback, View view) {
        fullScreenCallback.click(this.l.queryMarkerViewTimeRangeMin());
    }

    private void a(HashMap<String, Object> map) {
        int i;
        List list = (List) map.get("ALTITUDE_SWITCH_LIST");
        if (list.size() < 4 || this.g == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
        this.am = ((Boolean) list.get(1)).booleanValue();
        this.f7755b = ((Boolean) list.get(2)).booleanValue();
        this.f7754a = ((Boolean) list.get(3)).booleanValue();
        if (!zBooleanValue) {
            this.g.setVisibility(8);
            return;
        }
        if (!njy.e(this.i, 1)) {
            this.g.setVisibility(0);
            if (this.am) {
                this.g.setImageResource(this.i.get(1).intValue());
                i = R.string.accessibility_hide_elevation;
            } else {
                this.g.setImageResource(this.i.get(0).intValue());
                i = R.string.accessibility_show_elevation;
            }
            lrd.b(this.g, qre.f(i));
            return;
        }
        LogUtil.a("SectionBloodOxygenLineChart", "wrong mAltitudeImageList!");
    }

    private void e(HashMap<String, Object> map) {
        int left;
        this.f7756c = false;
        List list = (List) map.get("VISIVILITY_LIST");
        if (list.size() == 2) {
            boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
            boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
            if (zBooleanValue) {
                this.t.setVisibility(0);
            } else {
                this.t.setVisibility(8);
            }
            if (zBooleanValue2) {
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
        } else {
            LogUtil.a("SectionBloodOxygenLineChart", "wrong boolean list!");
        }
        if (this.ac == null) {
            return;
        }
        if (LanguageUtil.ba(this.r)) {
            left = (((LinearLayout) this.ac.getParent()).getWidth() - this.ac.getRight()) - (this.ac.getWidth() / 3);
        } else {
            left = this.ac.getLeft();
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ag.getLayoutParams();
        if (left != layoutParams.getMarginStart()) {
            layoutParams.setMarginStart(left);
            this.ag.setLayoutParams(layoutParams);
        }
    }

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            HealthTextView healthTextView = this.q;
            if (healthTextView != null) {
                healthTextView.setOnClickListener(new View.OnClickListener() { // from class: fvn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        onClickSectionListener.onClick("BAR_CHART_CALENDAR_CLICK_EVENT");
                    }
                });
            }
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionBloodOxygenBarChart.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        onClickSectionListener.onClick("ALTITUDE_SWITCH_CLICK_EVENT");
                    }
                });
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        super.clear();
        ObserverManagerUtil.a("REMOVE_GLOBAL_LAYOUT");
        ObserverManagerUtil.a("BLOOD_OXYGEN_ARROW_VISIBLE");
    }
}
