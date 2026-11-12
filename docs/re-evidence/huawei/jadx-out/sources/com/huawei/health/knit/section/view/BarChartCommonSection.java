package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.CoreSleepBarChartView;
import com.huawei.health.knit.section.listener.BarChartRangeShowCallback;
import com.huawei.health.knit.section.listener.ChartMarkChangeCallback;
import com.huawei.health.knit.section.listener.ChartMarkTextCallback;
import com.huawei.health.knit.section.listener.ClickChartDataCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.ftu;
import defpackage.idy;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qly;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qsp;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class BarChartCommonSection extends BaseSection {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected DataInfos f7560a;
    private AtomicBoolean aa;
    private boolean ab;
    private HealthViewPager ac;
    private AtomicBoolean ad;
    private LinearLayout ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private LinearLayout aj;
    private HealthTextView ak;
    private LinearLayout al;
    private Observer am;
    private Observer an;
    private float ao;
    private OnClickSectionListener ap;
    private OnClickSectionListener aq;
    private ClickChartDataCallback ar;
    private OnClickSectionListener as;
    private String at;
    private HealthTextView au;
    private qto<View> av;
    private LinearLayout aw;
    private LinearLayout ax;
    private LinearLayout ay;
    private HwHealthBarScrollChartHolder az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7561b;
    private SleepTotalData ba;
    private HealthTextView bb;
    private HealthTextView bc;
    private LinearLayout bd;
    private long be;
    private long bf;
    private LinearLayout bg;
    private HealthTextView bh;
    private int bi;
    private HealthTextView bj;
    private LinearLayout bk;
    private int bl;
    private LinearLayout bm;
    private View bp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7562c;
    private HealthTextView d;
    private boolean f;
    private ImageView g;
    private ImageView h;
    private boolean i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private ViewTreeObserver.OnGlobalLayoutListener o;
    private CoreSleepBarChartView p;
    private ImageView q;
    private ImageView r;
    private BarChartRangeShowCallback s;
    private HealthTextView t;
    private Context u;
    private ChartMarkChangeCallback v;
    private HealthCalendar w;
    private HealthTextView x;
    private ChartMarkTextCallback y;
    private ImageView z;

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c(this.f7561b);
        c(this.aj);
        c(this.aw);
        c(this.bg);
        c(this.al);
        c(this.bd);
        c(this.bk);
    }

    private void c(LinearLayout linearLayout) {
        linearLayout.setGravity(17);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginEnd(0);
        linearLayout.setLayoutParams(layoutParams);
    }

    private void setTagText(int i) {
        if (i == 5) {
            qsp.b(this.ai, qre.f(R.string.IDS_hw_aasm_label_sleep_deepsleep));
            qsp.b(this.ak, qre.f(R.string.IDS_hw_aasm_label_sleep_shallowsleep));
            qsp.b(this.ag, qre.f(R.string.IDS_hw_aasm_label_sleep_rem));
        } else {
            qsp.b(this.ai, qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep));
            qsp.b(this.ak, qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep));
            qsp.b(this.ag, qre.f(R.string.IDS_fitness_core_sleep_rem_sleep));
        }
    }

    public BarChartCommonSection(Context context) {
        super(context);
        this.ba = new SleepTotalData();
        this.ad = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.at = "0";
        this.bf = System.currentTimeMillis();
        this.f = true;
        this.i = true;
        this.be = 0L;
        this.bl = 0;
        this.bi = Integer.MAX_VALUE;
        this.ab = true;
        this.an = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 7)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                int i = 0;
                if ((objArr[0] instanceof Boolean) && (objArr[1] instanceof Boolean) && (objArr[2] instanceof Boolean) && (objArr[3] instanceof Boolean) && (objArr[4] instanceof Boolean) && (objArr[5] instanceof Boolean) && (objArr[6] instanceof DataInfos) && (objArr[7] instanceof Integer)) {
                    synchronized (BarChartCommonSection.e) {
                        if (((DataInfos) objArr[6]) == BarChartCommonSection.this.f7560a) {
                            BarChartCommonSection.this.g();
                            qsp.c((View) BarChartCommonSection.this.f7561b, ((Boolean) objArr[0]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aj, ((Boolean) objArr[1]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aw, ((Boolean) objArr[2]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bg, ((Boolean) objArr[3]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.al, ((Boolean) objArr[4]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bd, ((Boolean) objArr[5]).booleanValue() ? 0 : 8);
                            LinearLayout linearLayout = BarChartCommonSection.this.bk;
                            if (!((Boolean) objArr[5]).booleanValue()) {
                                i = 8;
                            }
                            qsp.c((View) linearLayout, i);
                        }
                    }
                }
            }
        };
        this.am = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 0)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                if (objArr[0] instanceof Float) {
                    Object obj = objArr[1];
                    if ((obj instanceof DataInfos) && ((DataInfos) obj) == BarChartCommonSection.this.f7560a) {
                        BarChartCommonSection.this.ao = ((Float) objArr[0]).floatValue();
                        if (BarChartCommonSection.this.z == null || BarChartCommonSection.this.ao != 0.0f) {
                            return;
                        }
                        BarChartCommonSection.this.z.setVisibility(8);
                    }
                }
            }
        };
    }

    public BarChartCommonSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ba = new SleepTotalData();
        this.ad = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.at = "0";
        this.bf = System.currentTimeMillis();
        this.f = true;
        this.i = true;
        this.be = 0L;
        this.bl = 0;
        this.bi = Integer.MAX_VALUE;
        this.ab = true;
        this.an = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 7)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                int i = 0;
                if ((objArr[0] instanceof Boolean) && (objArr[1] instanceof Boolean) && (objArr[2] instanceof Boolean) && (objArr[3] instanceof Boolean) && (objArr[4] instanceof Boolean) && (objArr[5] instanceof Boolean) && (objArr[6] instanceof DataInfos) && (objArr[7] instanceof Integer)) {
                    synchronized (BarChartCommonSection.e) {
                        if (((DataInfos) objArr[6]) == BarChartCommonSection.this.f7560a) {
                            BarChartCommonSection.this.g();
                            qsp.c((View) BarChartCommonSection.this.f7561b, ((Boolean) objArr[0]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aj, ((Boolean) objArr[1]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aw, ((Boolean) objArr[2]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bg, ((Boolean) objArr[3]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.al, ((Boolean) objArr[4]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bd, ((Boolean) objArr[5]).booleanValue() ? 0 : 8);
                            LinearLayout linearLayout = BarChartCommonSection.this.bk;
                            if (!((Boolean) objArr[5]).booleanValue()) {
                                i = 8;
                            }
                            qsp.c((View) linearLayout, i);
                        }
                    }
                }
            }
        };
        this.am = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 0)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                if (objArr[0] instanceof Float) {
                    Object obj = objArr[1];
                    if ((obj instanceof DataInfos) && ((DataInfos) obj) == BarChartCommonSection.this.f7560a) {
                        BarChartCommonSection.this.ao = ((Float) objArr[0]).floatValue();
                        if (BarChartCommonSection.this.z == null || BarChartCommonSection.this.ao != 0.0f) {
                            return;
                        }
                        BarChartCommonSection.this.z.setVisibility(8);
                    }
                }
            }
        };
    }

    public BarChartCommonSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ba = new SleepTotalData();
        this.ad = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.at = "0";
        this.bf = System.currentTimeMillis();
        this.f = true;
        this.i = true;
        this.be = 0L;
        this.bl = 0;
        this.bi = Integer.MAX_VALUE;
        this.ab = true;
        this.an = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 7)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                int i2 = 0;
                if ((objArr[0] instanceof Boolean) && (objArr[1] instanceof Boolean) && (objArr[2] instanceof Boolean) && (objArr[3] instanceof Boolean) && (objArr[4] instanceof Boolean) && (objArr[5] instanceof Boolean) && (objArr[6] instanceof DataInfos) && (objArr[7] instanceof Integer)) {
                    synchronized (BarChartCommonSection.e) {
                        if (((DataInfos) objArr[6]) == BarChartCommonSection.this.f7560a) {
                            BarChartCommonSection.this.g();
                            qsp.c((View) BarChartCommonSection.this.f7561b, ((Boolean) objArr[0]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aj, ((Boolean) objArr[1]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.aw, ((Boolean) objArr[2]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bg, ((Boolean) objArr[3]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.al, ((Boolean) objArr[4]).booleanValue() ? 0 : 8);
                            qsp.c((View) BarChartCommonSection.this.bd, ((Boolean) objArr[5]).booleanValue() ? 0 : 8);
                            LinearLayout linearLayout = BarChartCommonSection.this.bk;
                            if (!((Boolean) objArr[5]).booleanValue()) {
                                i2 = 8;
                            }
                            qsp.c((View) linearLayout, i2);
                        }
                    }
                }
            }
        };
        this.am = new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.4
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (!njy.c(objArr, 0)) {
                    LogUtil.a("BarChartCommonSection", "null args!");
                    return;
                }
                if (objArr[0] instanceof Float) {
                    Object obj = objArr[1];
                    if ((obj instanceof DataInfos) && ((DataInfos) obj) == BarChartCommonSection.this.f7560a) {
                        BarChartCommonSection.this.ao = ((Float) objArr[0]).floatValue();
                        if (BarChartCommonSection.this.z == null || BarChartCommonSection.this.ao != 0.0f) {
                            return;
                        }
                        BarChartCommonSection.this.z.setVisibility(8);
                    }
                }
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.u = context;
        c();
        return this.bp;
    }

    private void c() {
        int iD;
        if (this.bp == null) {
            LogUtil.e("BarChartCommonSection", "initView mainView is null, start to inflate");
            iD = ftu.c().d();
            View viewE = ftu.c().e();
            this.bp = viewE;
            if (viewE == null) {
                this.bp = LayoutInflater.from(this.u).inflate(R.layout.section_common_bar_layout, (ViewGroup) this, false);
                iD = -1;
            }
        } else {
            iD = -1;
        }
        this.ae = (LinearLayout) this.bp.findViewById(R.id.left_arrow_iv);
        this.ay = (LinearLayout) this.bp.findViewById(R.id.right_arrow_iv);
        this.q = (ImageView) qsp.a(this.bp, R.id.fitness_detail_up_arrow_left);
        this.r = (ImageView) qsp.a(this.bp, R.id.fitness_detail_up_arrow_right);
        this.x = (HealthTextView) qsp.a(this.bp, R.id.fitness_detail_time_date_tv);
        this.bb = (HealthTextView) this.bp.findViewById(R.id.core_sleep_bar_chart_date_time);
        this.bc = (HealthTextView) this.bp.findViewById(R.id.common_sleep_sleep_time);
        this.t = (HealthTextView) this.bp.findViewById(R.id.common_sleep_bed_time);
        this.f7562c = (HealthTextView) this.bp.findViewById(R.id.day_time_duration_type);
        this.d = (HealthTextView) this.bp.findViewById(R.id.day_time_duration_type_2);
        this.ai = (HealthTextView) this.bp.findViewById(R.id.deep_sleep_tv);
        this.ak = (HealthTextView) this.bp.findViewById(R.id.light_sleep_tv);
        this.ag = (HealthTextView) this.bp.findViewById(R.id.rem_sleep_tv);
        this.af = (HealthTextView) this.bp.findViewById(R.id.wake_sleep_tv);
        this.ah = (HealthTextView) this.bp.findViewById(R.id.true_sleep_noon_tv);
        this.ai.setSplittable(false);
        this.ak.setSplittable(false);
        this.ag.setSplittable(false);
        this.af.setSplittable(false);
        this.ah.setSplittable(false);
        this.ax = (LinearLayout) this.bp.findViewById(R.id.sleep_color_block);
        this.aj = (LinearLayout) this.bp.findViewById(R.id.light_sleep_ll);
        this.aw = (LinearLayout) this.bp.findViewById(R.id.core_sleep_layout_rem_sleep);
        this.bg = (LinearLayout) this.bp.findViewById(R.id.wake_sleep_ll);
        this.al = (LinearLayout) this.bp.findViewById(R.id.core_sleep_layout_noon_sleep);
        this.g = (ImageView) this.bp.findViewById(R.id.legend_one_image);
        this.m = (ImageView) this.bp.findViewById(R.id.legend_two_image);
        this.l = (ImageView) this.bp.findViewById(R.id.legend_three_image);
        this.h = (ImageView) this.bp.findViewById(R.id.legend_four_image);
        this.j = (ImageView) this.bp.findViewById(R.id.legend_five_image);
        this.z = (ImageView) this.bp.findViewById(R.id.hw_health_fitness_data_origin_icon);
        this.bd = (LinearLayout) this.bp.findViewById(R.id.manual_bed_ll);
        this.k = (ImageView) this.bp.findViewById(R.id.legend_six_image);
        this.bh = (HealthTextView) this.bp.findViewById(R.id.manual_bed_tv);
        this.bk = (LinearLayout) this.bp.findViewById(R.id.manual_sleep_ll);
        this.f7561b = (LinearLayout) this.bp.findViewById(R.id.lengend_deep_ll);
        this.n = (ImageView) this.bp.findViewById(R.id.legend_seven_image);
        this.bj = (HealthTextView) this.bp.findViewById(R.id.manual_sleep_tv);
        this.bm = (LinearLayout) this.bp.findViewById(R.id.time_period_ll_2);
        this.au = (HealthTextView) this.bp.findViewById(R.id.processDialog_title_text);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        if (iD != -1) {
            c(iD);
        } else {
            b();
        }
        a();
        i();
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.section.view.BarChartCommonSection$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7567a;

        static {
            int[] iArr = new int[DataInfos.values().length];
            f7567a = iArr;
            try {
                iArr[DataInfos.CoreSleepWeekDetail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7567a[DataInfos.CoreSleepMonthDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7567a[DataInfos.CoreSleepYearDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void j() {
        int i = AnonymousClass6.f7567a[this.f7560a.ordinal()];
        if (i == 1) {
            lrd.b(this.q, qre.f(R.string.accessibility_last_week));
            lrd.b(this.r, qre.f(R.string.accessibility_next_week));
        } else if (i == 2) {
            lrd.b(this.q, qre.f(R.string.accessibility_last_month));
            lrd.b(this.r, qre.f(R.string.accessibility_next_month));
        } else if (i == 3) {
            lrd.b(this.q, qre.f(R.string.accessibility_last_year));
            lrd.b(this.r, qre.f(R.string.accessibility_next_year));
        } else {
            ReleaseLogUtil.d("BarChartCommonSection", "datainfos is null");
        }
    }

    private void i() {
        ObserverManagerUtil.d(this.an, "SLEEP_BASE_BAR_DREAM_VISIBILITY");
        ObserverManagerUtil.d(this.am, "SLEEP_AVERAGE_ICON_OFFSET");
    }

    private void b() {
        ArrayList arrayList = new ArrayList(3);
        CoreSleepBarChartView coreSleepBarChartView = new CoreSleepBarChartView(this.u);
        this.p = coreSleepBarChartView;
        coreSleepBarChartView.setLayerType(1, null);
        arrayList.add(0, this.p);
        this.ac = (HealthViewPager) qsp.a(this.bp, R.id.calorie_day_detail_viewpager);
        qto<View> qtoVar = new qto<>(arrayList);
        this.av = qtoVar;
        this.ac.setAdapter(qtoVar);
        this.ac.setIsScroll(false);
        this.i = false;
    }

    private void c(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("BarChartCommonSection", "initChart start: ", Long.valueOf(jCurrentTimeMillis));
        CoreSleepBarChartView coreSleepBarChartViewC = ftu.c().c(i);
        this.p = coreSleepBarChartViewC;
        if (coreSleepBarChartViewC == null) {
            ReleaseLogUtil.a("BarChartCommonSection", "error chart is null");
            return;
        }
        HealthViewPager healthViewPager = (HealthViewPager) qsp.a(this.bp, R.id.calorie_day_detail_viewpager);
        this.ac = healthViewPager;
        if (healthViewPager.getAdapter() instanceof qto) {
            this.av = (qto) this.ac.getAdapter();
            this.i = false;
            LogUtil.a("BarChartCommonSection", "init chart end: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return;
        }
        ReleaseLogUtil.a("BarChartCommonSection", "error PagerAdapter is unknown type");
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "BarChartCommonSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("BarChartCommonSection", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("BarChartCommonSection", "no need to bind");
            return;
        }
        Object obj = map.get("BAR_COMMON_START_TIME");
        if (obj instanceof Long) {
            this.bf = ((Long) obj).longValue();
        }
        LogUtil.e("BarChartCommonSection", "start to set mChartHolder");
        this.az = (HwHealthBarScrollChartHolder) qqw.a(map, "BAR_COMMON_CHART_HOLDER", (Class<Object>) HwHealthBarScrollChartHolder.class, (Object) null);
        LogUtil.e("BarChartCommonSection", "start to set mDefaultStartTime");
        this.bf = ((Long) qqw.a(map, "BAR_COMMON_START_TIME", (Class<long>) Long.class, 0L)).longValue();
        this.s = (BarChartRangeShowCallback) qqw.a(map, "BAR_COMMON_RANGE_SHOW_CALL_BACK", (Class<Object>) BarChartRangeShowCallback.class, (Object) null);
        this.v = (ChartMarkChangeCallback) qqw.a(map, "BAR_COMMON_MARK_CHANGE_CALL_BACK", (Class<Object>) ChartMarkChangeCallback.class, (Object) null);
        this.f7560a = (DataInfos) qqw.a(map, "BAR_COMMON_DATA_INFO", (Class<Object>) DataInfos.class, (Object) null);
        LogUtil.e("BarChartCommonSection", "start to set ChartMarkTextCallback");
        this.y = (ChartMarkTextCallback) qqw.a(map, "BAR_COMMON_MARK_TEXT_CALL_BACK", (Class<Object>) ChartMarkTextCallback.class, (Object) null);
        long jLongValue = ((Long) qqw.a(map, "BAR_COMMON_REFLESH_TIME", (Class<long>) Long.class, 0L)).longValue();
        if (this.be != jLongValue) {
            LogUtil.e("BarChartCommonSection", "start to set BAR_COMMON_REFLESH_TIME" + jLongValue);
            this.p.reflesh(jLongValue);
            this.be = jLongValue;
        }
        LogUtil.e("BarChartCommonSection", "start to set BAR_COMMON_CALENDER_EVENT");
        setSectionText(map);
        setTextSrcOrVisibility(map);
        setTagText(qqw.c(map, "SLEEP_CORE_VERSION", 0));
        setBarChartStatus(qqw.c(map, "BAR_COMMON_JUMP_TO_MONTH_TIME", 0));
        e();
        j();
    }

    private void e() {
        if (this.f) {
            h();
            if (this.s == null || this.v == null || this.y == null || this.ar == null || this.ap == null || this.aq == null) {
                return;
            }
            k();
            this.f = false;
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        HashMap map = new HashMap(16);
        map.put("type", "1");
        idy.b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), map);
        if (view.getId() == R.id.fitness_detail_time_date_tv) {
            this.as.onClick("BAR_CHART_CALENDAR_CLICK_EVENT");
        } else if (view.getId() == R.id.hw_health_fitness_data_origin_icon) {
            this.as.onClick("BAR_COMMON_HELP_ICON_LISTENER");
        }
    }

    private void h() {
        this.az.addDataLayer(this.p, this.f7560a);
        if (this.p.acquireScrollAdapter() != null) {
            this.p.reflesh(this.bf);
        }
        this.p.setMarkerViewPosition(null);
    }

    private void k() {
        LogUtil.e("BarChartCommonSection", "setBarChartListeners");
        this.p.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                LogUtil.e("BarChartCommonSection", "addOnXRangeSet", Integer.valueOf(i), "  ", Integer.valueOf(i2));
                if (lsl.c(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
                    BarChartCommonSection.this.a(i);
                }
                BarChartCommonSection.this.b(i, i2);
                BarChartCommonSection.this.s.onRangeChange(i, i2);
                BarChartCommonSection.this.x.setText(BarChartCommonSection.this.p.formatRangeText(i, i2));
            }
        });
        this.p.setOnBarChartViewDataChangedListener(new CoreSleepBarChartView.OnBarChartViewDataChangedListener() { // from class: ftx
            @Override // com.huawei.health.knit.section.chart.CoreSleepBarChartView.OnBarChartViewDataChangedListener
            public final void onBarChartViewDataChangedListener(float f, float f2) {
                this.f34576c.e(f, f2);
            }
        });
        l();
        m();
        this.p.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                BarChartCommonSection.this.f();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                BarChartCommonSection.this.f();
            }
        });
    }

    public /* synthetic */ void e(float f, float f2) {
        LogUtil.e("BarChartCommonSection", "setOnBarChartViewDataChangedListener time", Float.valueOf(f));
        this.v.onMarkChange(f, f2);
    }

    private void setBarChartStatus(int i) {
        CoreSleepBarChartView coreSleepBarChartView = this.p;
        if (coreSleepBarChartView == null || i == 0 || i == this.bl || coreSleepBarChartView.getData() == null) {
            return;
        }
        LogUtil.e("BarChartCommonSection", "start to BAR_COMMON_JUMP_TO_MONTH_TIME" + i);
        LogUtil.e("debugt", "BAR_COMMON_JUMP_TO_MONTH_TIME mDataInfos is " + this.f7560a);
        this.p.blinkToUnixTime(i);
        this.p.highlightDefValue(-1, false);
        this.bl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CoreSleepBarChartView coreSleepBarChartView = this.p;
        if (coreSleepBarChartView == null) {
            health.compact.a.util.LogUtil.d("BarChartCommonSection", "refreshBtnImage chart is null");
            return;
        }
        if (coreSleepBarChartView.canScrollOlderPager()) {
            this.ae.setVisibility(0);
            this.ae.setClickable(true);
            this.ad.set(true);
        } else {
            this.ae.setVisibility(4);
            this.ae.setClickable(false);
            this.ad.set(false);
        }
        if (this.p.canScrollNewerPager()) {
            this.ay.setVisibility(0);
            this.ay.setClickable(true);
            this.aa.set(true);
        } else {
            this.ay.setVisibility(4);
            this.ay.setClickable(false);
            this.aa.set(false);
        }
    }

    private void a() {
        if (LanguageUtil.ba(this.u)) {
            this.q.setImageResource(R.drawable.ic_right_grey_arrow);
            this.r.setImageResource(R.drawable.ic_left_grey_arrow);
        } else {
            this.q.setImageResource(R.drawable.ic_left_grey_arrow);
            this.r.setImageResource(R.drawable.ic_right_grey_arrow);
        }
        this.ae.setVisibility(0);
        this.ay.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.w == null) {
            this.w = new HealthCalendar();
        }
        this.w = this.w.transformFromCalendar(calendar);
    }

    public void b(int i, int i2) {
        CoreSleepBarChartView coreSleepBarChartView = this.p;
        if (coreSleepBarChartView == null) {
            return;
        }
        String rangeText = coreSleepBarChartView.formatRangeText(i, i2);
        long j = ((long) i) * 60000;
        a(rangeText, DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_WEEK), lsl.aa(j));
    }

    private void a(String str, String str2, boolean z) {
        if (z) {
            this.r.setVisibility(4);
        } else {
            this.r.setVisibility(0);
        }
    }

    private void setSectionText(HashMap<String, Object> map) {
        this.as = (OnClickSectionListener) qqw.a(map, "BAR_COMMON_CALENDER_EVENT", (Class<Object>) OnClickSectionListener.class, (Object) null);
        if (((SpannableString) qqw.a(map, "BAR_BED_TIME_VALUE_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString(""))).equals(new SpannableString("")) || this.f7560a == DataInfos.CoreSleepYearDetail) {
            qsp.c((View) this.bm, 8);
            qsp.c((View) this.f7562c, 8);
            qsp.c((View) this.d, 8);
            SpannableString spannableString = (SpannableString) qqw.a(map, "BAR_TIME_VALUE_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString(""));
            qsp.b(this.bc, spannableString);
            lrd.c(this.bc, String.valueOf(spannableString).contains("--") ? 2 : 1);
        } else {
            qsp.c((View) this.bm, 0);
            qsp.c((View) this.f7562c, 0);
            qsp.c((View) this.d, 0);
            SpannableString spannableString2 = (SpannableString) qqw.a(map, "BAR_BED_TIME_VALUE_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString(""));
            qsp.b(this.bc, spannableString2);
            lrd.c(this.bc, String.valueOf(spannableString2).contains("--") ? 2 : 1);
            SpannableString spannableString3 = (SpannableString) qqw.a(map, "BAR_TIME_VALUE_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString(""));
            qsp.b(this.t, spannableString3);
            lrd.c(this.t, String.valueOf(spannableString3).contains("--") ? 2 : 1);
            qsp.b(this.f7562c, this.u.getString(R.string.IDS_manual_sleep_bed_time));
            qsp.b(this.d, this.u.getString(R.string.IDS_manual_sleep_sleep_time));
        }
        qsp.b(this.af, qqw.d((Map) map, "BAR_COMMON_LEGEND_TEXT_FOUR", this.u.getString(R.string.IDS_details_sleep_sleep_latency)));
        qsp.b(this.ah, qqw.d((Map) map, "BAR_COMMON_LEGEND_TEXT_FIVE", this.u.getString(R.string.IDS_fitness_core_sleep_noontime_sleep)));
        qsp.b(this.bh, qqw.d((Map) map, "BAR_COMMON_LEGEND_TEXT_SIX", this.u.getString(R.string.IDS_manual_sleep_bed)));
        qsp.b(this.bj, qqw.d((Map) map, "BAR_COMMON_LEGEND_TEXT_SEVEN", this.u.getString(R.string.IDS_manual_sleep_sleep)));
    }

    private void setTextSrcOrVisibility(HashMap<String, Object> map) {
        qsp.e(this.g, qqw.c(map, "BAR_COMMON_LEGEND_ONE", 0));
        qsp.e(this.m, qqw.c(map, "BAR_COMMON_LEGEND_TWO", 0));
        qsp.e(this.l, qqw.c(map, "BAR_COMMON_LEGEND_THREE", 0));
        qsp.e(this.h, qqw.c(map, "BAR_COMMON_LEGEND_FOUR", 0));
        qsp.e(this.j, qqw.c(map, "BAR_COMMON_LEGEND_FIVE", 0));
        qsp.e(this.k, qqw.c(map, "BAR_COMMON_LEGEND_SIX", 0));
        qsp.e(this.n, qqw.c(map, "BAR_COMMON_LEGEND_SEVEN", 0));
        qsp.c(this.z, qqw.c(map, "BAR_CHART_HELP_ICON", (Drawable) null));
        qsp.c((View) this.z, qqw.c(map, "BAR_CHART_HELP_ICON_VISIBILITY", 8));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.z.getLayoutParams();
        layoutParams.topMargin = ((int) this.ao) - this.z.getHeight();
        this.z.setLayoutParams(layoutParams);
        this.ar = (ClickChartDataCallback) qqw.a(map, "BAR_CHART_MID_DATA_CLICK_EVENT", (Class<Object>) ClickChartDataCallback.class, (Object) null);
        int iC = qqw.c(map, "BAR_COMMON_PROCESS_TEXT_VISIBILITY", 4);
        if (this.au != null && this.bi != iC) {
            LogUtil.e("BarChartCommonSection", "start to BAR_COMMON_PROCESS_TEXT_VISIBILITY");
            this.au.setVisibility(iC);
            this.bi = iC;
        }
        this.ap = (OnClickSectionListener) qqw.a(map, "BAR_COMMON_LEFT_ARROW_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.aq = (OnClickSectionListener) qqw.a(map, "BAR_COMMON_RIGHT_ARROW_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        boolean zA = qqw.a(map, "BAR_COMMON_BOTTOM_LINE", false);
        if (this.p != null) {
            LogUtil.e("BarChartCommonSection", "start to BAR_COMMON_BOTTOM_LINE");
            this.p.d(zA);
        }
    }

    private void l() {
        this.p.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.1
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                LogUtil.e("BarChartCommonSection", "setOnMarkViewTextNotify", str);
                BarChartCommonSection.this.y.onMarkTextChange(str, list, (int) BarChartCommonSection.this.p.fetchMarkViewMinuteValue());
                if (BarChartCommonSection.this.f7560a == DataInfos.CoreSleepYearDetail) {
                    str = String.format(BarChartCommonSection.this.u.getString(R.string.IDS_year_sleep_daily_average), str);
                }
                BarChartCommonSection.this.bb.setText(str);
                BarChartCommonSection.this.p.queryMarkerViewTimeMills();
                BarChartCommonSection.this.bc.setTextColor(BarChartCommonSection.this.u.getResources().getColor(R.color.textColorPrimary));
                BarChartCommonSection.this.t.setTextColor(BarChartCommonSection.this.u.getResources().getColor(R.color.textColorPrimary));
            }
        });
    }

    private void m() {
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BarChartCommonSection.this.ad.get()) {
                    BarChartCommonSection.this.ap.onClick("BAR_COMMON_LEFT_ARROW_LISTENER");
                    CoreSleepBarChartView coreSleepBarChartView = BarChartCommonSection.this.p;
                    CoreSleepBarChartView coreSleepBarChartView2 = BarChartCommonSection.this.p;
                    Objects.requireNonNull(coreSleepBarChartView2);
                    coreSleepBarChartView.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qly>.b(coreSleepBarChartView2) { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.8.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(coreSleepBarChartView2);
                        }

                        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                        public void c() {
                            super.c();
                        }
                    });
                }
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BarChartCommonSection.this.aa.get()) {
                    BarChartCommonSection.this.aq.onClick("BAR_COMMON_RIGHT_ARROW_LISTENER");
                    CoreSleepBarChartView coreSleepBarChartView = BarChartCommonSection.this.p;
                    CoreSleepBarChartView coreSleepBarChartView2 = BarChartCommonSection.this.p;
                    Objects.requireNonNull(coreSleepBarChartView2);
                    coreSleepBarChartView.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qly>.b(coreSleepBarChartView2) { // from class: com.huawei.health.knit.section.view.BarChartCommonSection.9.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                            Objects.requireNonNull(coreSleepBarChartView2);
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
    public void clear() {
        LogUtil.a("BarChartCommonSection", CervicalMucusRecord.Appearance.CLEAR);
        super.clear();
        ObserverManagerUtil.a(this.an, "SLEEP_BASE_BAR_DREAM_VISIBILITY");
        ObserverManagerUtil.a(this.am, "SLEEP_AVERAGE_ICON_OFFSET");
        LinearLayout linearLayout = this.ax;
        if (linearLayout != null) {
            linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.o);
        }
    }
}
