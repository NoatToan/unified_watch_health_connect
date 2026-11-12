package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.chart.BloodOxygenLineChart;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpFragment;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.chart.BloodOxygenHorizontalLineChart;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity.HorizontalBloodOxygenDayActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import defpackage.ezo;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.qto;
import defpackage.tvz;
import defpackage.twf;
import defpackage.vdo;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenHorizontalFragment extends CommonBaseMvpFragment<BloodOxygenDayDetailFragmentView, tvz> implements BloodOxygenDayDetailFragmentView, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HorizontalBloodOxygenDayActivity f26601a;
    private long aa;
    private CustomTitleBar ab;
    private HealthTextView ac;
    private HealthTextView ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f26603c;
    private HealthTextView d;
    private LinearLayout e;
    private List<Integer> f = null;
    private ArrayList<View> g;
    private HealthViewPager h;
    private BloodOxygenHorizontalLineChart i;
    private qto<View> j;
    private ImageView k;
    private ImageView l;
    private twf m;
    private Context n;
    private HealthCalendar o;
    private boolean p;
    private RelativeLayout q;
    private LinearLayout r;
    private RelativeLayout s;
    private boolean t;
    private HealthTextView u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        return i == 18;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setBloodOxygenData(List<HiHealthData> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setBloodOxygenLatest(String str, long j) {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setBloodOxygenMaxAndMin(String str, String str2) {
    }

    public BloodOxygenHorizontalFragment() {
        c(this.n, AnalyticsValue.BLOOD_OXYGEN_PAGE_CLICK.value(), "3");
        i();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseFragment
    public int getLayoutId() {
        return R.layout.horizontal_fragment_blood_oxygen_day_detail;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseFragment
    public void initView(View view) {
        if (getActivity() instanceof HorizontalBloodOxygenDayActivity) {
            this.f26601a = (HorizontalBloodOxygenDayActivity) getActivity();
        }
        HorizontalBloodOxygenDayActivity horizontalBloodOxygenDayActivity = this.f26601a;
        if (horizontalBloodOxygenDayActivity == null) {
            LogUtil.e("BloodOxygenHorizontalFragment", "mActivity is null");
            return;
        }
        Intent intent = horizontalBloodOxygenDayActivity.getIntent();
        if (intent == null) {
            LogUtil.j("BloodOxygenHorizontalFragment", "the mActivity intent is null,pls check");
            this.f26601a.finish();
            return;
        }
        this.aa = intent.getLongExtra(ObserveredClassifiedView.JUMP_TIME_ID, System.currentTimeMillis());
        this.f26602b = intent.getIntExtra("altitude_icon_status", 0);
        this.n = getActivity();
        this.l = (ImageView) view.findViewById(R.id.image_up_arrow_left);
        this.k = (ImageView) view.findViewById(R.id.image_up_arrow_right);
        this.z = (HealthTextView) view.findViewById(R.id.cursortime);
        this.ad = (HealthTextView) view.findViewById(R.id.cursorValue);
        this.w = (HealthTextView) view.findViewById(R.id.cursor_step);
        this.ac = (HealthTextView) view.findViewById(R.id.fitness_detail_time_date_tv);
        this.f26603c = (ImageView) view.findViewById(R.id.altitude_switch_btn);
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", BloodOxygenHorizontalFragment.this.o);
                bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(47204, new int[]{2107}));
                bundle.putBoolean("isSetGrayUnmarkedDate", true);
                HealthCalendarActivity.c(BloodOxygenHorizontalFragment.this, bundle);
            }
        });
        this.p = true;
        this.h = (HealthViewPager) view.findViewById(R.id.bloodoxygen_day_detail_viewpager);
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.fitness_detail_titlebar);
        this.ab = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_hw_health_blood_oxygen));
        this.y = (HealthTextView) view.findViewById(R.id.blood_oxygen_measure_range_1);
        this.u = (HealthTextView) view.findViewById(R.id.blood_oxygen_measure_range_2);
        this.x = (HealthTextView) view.findViewById(R.id.blood_oxygen_measure_range_3);
        this.v = (HealthTextView) view.findViewById(R.id.blood_oxygen_measure_range_4);
        this.e = (LinearLayout) view.findViewById(R.id.blood_oxygen_altitude_legend);
        this.d = (HealthTextView) view.findViewById(R.id.blood_oxygen_measure_range_4);
        this.r = (LinearLayout) view.findViewById(R.id.interval_legend);
        this.q = (RelativeLayout) view.findViewById(R.id.data_bar_layout);
        this.s = (RelativeLayout) view.findViewById(R.id.data_detail_layout);
        this.l.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.d.setText(R.string.IDS_hw_health_blood_oxygen_elevation);
        b();
        setLiftAndRightImage();
        initViewPager();
        initChart();
        if (qrs.i() >= 1.5f) {
            this.ac.setTextSize(1, 21.0f);
            this.z.setTextSize(1, 21.0f);
            this.ad.setTextSize(1, 57.0f);
            this.w.setTextSize(1, 21.0f);
            this.y.setTextSize(1, 18.0f);
            this.u.setTextSize(1, 18.0f);
            this.x.setTextSize(1, 18.0f);
            this.v.setTextSize(1, 18.0f);
        }
    }

    private void b() {
        ImageView imageView = this.f26603c;
        if (imageView == null) {
            return;
        }
        int i = this.f26602b;
        if (i != 0) {
            if (i == 1) {
                imageView.setVisibility(8);
                this.e.setVisibility(8);
                this.w.setVisibility(8);
            }
        } else if ("true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS"))) {
            this.t = true;
            this.f26603c.setVisibility(0);
            this.f26603c.setImageResource(R.drawable.ic_exerciserecords_altitudw_frequency);
            this.e.setVisibility(0);
            this.w.setVisibility(0);
            a(false);
        } else {
            this.t = false;
            this.f26603c.setVisibility(0);
            this.f26603c.setImageResource(R.drawable.ic_exerciserecords_altitudw_crush);
            this.e.setVisibility(8);
            this.w.setVisibility(8);
            a(true);
        }
        this.f26603c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BloodOxygenHorizontalFragment.this.t) {
                    BloodOxygenHorizontalFragment.this.e();
                } else {
                    BloodOxygenHorizontalFragment.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c(this.n, AnalyticsValue.BLOOD_OXYGEN_PAGE_CLICK.value(), "1");
        e("true");
        this.t = true;
        this.f26603c.setImageResource(R.drawable.ic_exerciserecords_altitudw_frequency);
        this.e.setVisibility(0);
        this.w.setVisibility(0);
        e(true);
        ObserverManagerUtil.e("BLOOD_AND_ALTITUDE_DATA", true);
        a(false);
    }

    private void e(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS", str, new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c(this.n, AnalyticsValue.BLOOD_OXYGEN_PAGE_CLICK.value(), "2");
        e("false");
        this.t = false;
        this.f26603c.setImageResource(R.drawable.ic_exerciserecords_altitudw_crush);
        this.e.setVisibility(8);
        this.w.setVisibility(8);
        e(false);
        ObserverManagerUtil.e("BLOOD_AND_ALTITUDE_DATA", false);
        a(true);
    }

    private void a(boolean z) {
        int i;
        if (z) {
            i = R.string.accessibility_show_elevation;
        } else {
            i = R.string.accessibility_hide_elevation;
        }
        lrd.b(this.f26603c, qre.f(i));
    }

    private void e(boolean z) {
        if (z) {
            this.i.setNewRenderer(DataInfos.BloodOxygenAltitudeDayHorizontal, this.n);
        } else {
            this.i.setNewRenderer(DataInfos.BloodOxygenDayHorizontal, this.n);
        }
        this.i.setWillNotDraw(false);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.i.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
        this.i.setMarkerViewPosition(null);
        this.i.refresh();
        this.i.zoomToCenter(0.01f, 0.01f);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseFragment
    public void initData() {
        ((tvz) this.mPresenter).initPageParams();
        ((tvz) this.mPresenter).initBloodOxygenInterval();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpFragment
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public tvz createPresenter() {
        return new tvz();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.l) {
            HealthCalendar healthCalendar = this.o;
            healthCalendar.setDay(healthCalendar.getDay() - 1);
            g();
        } else {
            if (view == this.k) {
                HealthCalendar healthCalendar2 = this.o;
                healthCalendar2.setDay(healthCalendar2.getDay() + 1);
                g();
                return;
            }
            LogUtil.j("BloodOxygenHorizontalFragment", "click view unknow");
        }
    }

    private void g() {
        this.i.reflesh(this.o.transformCalendar().getTimeInMillis());
        long timeInMillis = this.o.transformCalendar().getTimeInMillis();
        setDayAndWeek(qrk.e(getContext(), timeInMillis), ezo.m(timeInMillis), ltb.ac(new Date(timeInMillis)), timeInMillis);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setLiftAndRightImage() {
        if (LanguageUtil.ba(getContext())) {
            this.l.setBackgroundResource(R.mipmap.ic_health_chart_arrow_right);
            this.k.setBackgroundResource(R.mipmap.ic_health_chart_arrow_left);
        } else {
            this.l.setBackgroundResource(R.mipmap.ic_health_chart_arrow_left);
            this.k.setBackgroundResource(R.mipmap.ic_health_chart_arrow_right);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void initViewPager() {
        this.g = new ArrayList<>(16);
        this.j = new qto<>(this.g);
        this.h.setIsCompatibleScrollView(true);
        this.h.setIsScroll(false);
        this.h.setAdapter(this.j);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void initChart() {
        this.m = new twf(this.n.getApplicationContext(), DataInfos.BloodOxygenDayHorizontal, (BloodOxygenDayDetailFragmentPresenter) this.mPresenter);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "BLOOD_OXYGEN_CURVE_STATUS");
        if (this.i == null || !this.p) {
            this.p = false;
            this.i = new BloodOxygenHorizontalLineChart(this.n, DataInfos.BloodOxygenDayHorizontal);
            if ("true".equals(strE)) {
                BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart = new BloodOxygenHorizontalLineChart(this.n.getApplicationContext(), DataInfos.BloodOxygenAltitudeDayHorizontal);
                this.i = bloodOxygenHorizontalLineChart;
                bloodOxygenHorizontalLineChart.setNewRenderer(DataInfos.BloodOxygenAltitudeDayHorizontal, this.n);
            } else {
                BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart2 = new BloodOxygenHorizontalLineChart(this.n.getApplicationContext(), DataInfos.BloodOxygenDayHorizontal);
                this.i = bloodOxygenHorizontalLineChart2;
                bloodOxygenHorizontalLineChart2.setNewRenderer(DataInfos.BloodOxygenDayHorizontal, this.n);
            }
        }
        this.i.setLayerType(1, null);
        c();
        this.g.add(this.i);
        this.m.addDataLayer(this.i, DataInfos.BloodOxygenDayHorizontal);
        if (this.aa > 0 && this.i.acquireScrollAdapter() != null) {
            this.p = false;
            int iH = qnh.h(qnh.b(this.aa));
            BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart3 = this.i;
            bloodOxygenHorizontalLineChart3.setShowRange(iH, bloodOxygenHorizontalLineChart3.acquireScrollAdapter().acquireRange());
            this.o = vdo.c(this.o, iH);
        }
        this.j.notifyDataSetChanged();
        this.i.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: twd
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public final void onRangeShow(int i, int i2) {
                this.f49727c.e(i, i2);
            }
        });
        this.i.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: twc
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list) {
                this.e.d(str, list);
            }
        });
    }

    public /* synthetic */ void e(int i, int i2) {
        if (this.i.isAnimating()) {
            return;
        }
        ((tvz) this.mPresenter).notifyData(i, i2);
    }

    public /* synthetic */ void d(String str, List list) {
        ((tvz) this.mPresenter).notifySourceAndTime(str, list);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void leftArrowClick() {
        BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart = this.i;
        Objects.requireNonNull(bloodOxygenHorizontalLineChart);
        bloodOxygenHorizontalLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(bloodOxygenHorizontalLineChart) { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(bloodOxygenHorizontalLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void rightArrowClick() {
        BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart = this.i;
        Objects.requireNonNull(bloodOxygenHorizontalLineChart);
        bloodOxygenHorizontalLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(bloodOxygenHorizontalLineChart) { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(bloodOxygenHorizontalLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setDayAndWeek(String str, String str2, boolean z, long j) {
        this.aa = j;
        if (LanguageUtil.az(this.n) || LanguageUtil.p(this.n) || LanguageUtil.d(this.n)) {
            this.ac.setText(str2);
        } else {
            this.ac.setText(str);
        }
        this.o = vdo.c(this.o, qnh.f((int) this.i.fetchMarkViewMinuteValue()));
        if (z) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
        }
        this.l.setVisibility(0);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void notifyNumerical(String str, String str2, String str3) {
        SpannableString spannableString;
        if ("--".equals(str2) || "0".equals(str2)) {
            spannableString = new SpannableString("--");
        } else {
            String strE = UnitUtil.e(CommonUtil.n(BaseApplication.getActivity(), str2), 2, 0);
            if (qrs.i() >= 1.5f) {
                spannableString = new SpannableString(strE);
            } else {
                spannableString = UnitUtil.b(BaseApplication.getContext(), "[\\d]", strE, R.style.health_text_chart_emphasize, R.style.health_text_chart_emphasize_small);
            }
        }
        if ("".equals(str3)) {
            str3 = "";
        }
        this.ad.setText(spannableString);
        this.z.setText(str);
        this.w.setText(str3);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public void setBloodOxygenInterval(List<String> list) {
        this.y.setText(String.format(Locale.ENGLISH, this.n.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than), list.get(0)));
        this.u.setText(String.format(Locale.ENGLISH, this.n.getString(R.string.IDS_press_auto_monitor_relax_range), list.get(1), list.get(2)));
        lrd.d(this.u, String.format(Locale.ENGLISH, this.n.getString(com.huawei.health.servicesui.R.string.IDS_base_line_percent), list.get(4), list.get(2)), false);
        this.x.setText(String.format(Locale.ENGLISH, this.n.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than), list.get(3)));
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public BloodOxygenLineChart getBloodOxygenLineChart() {
        return this.i;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView
    public twf getBloodOxygenLineChartHolder() {
        return this.m;
    }

    private void c() {
        this.i.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenHorizontalFragment.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        BloodOxygenHorizontalLineChart bloodOxygenHorizontalLineChart = this.i;
        if (bloodOxygenHorizontalLineChart != null) {
            bloodOxygenHorizontalLineChart.setWillNotDraw(false);
            HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.i.acquireScrollAdapter();
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
            this.i.setMarkerViewPosition(null);
            this.i.refresh();
            return;
        }
        LogUtil.a("BloodOxygenHorizontalFragment", "refreshUi mBloodOxygenineChart is null");
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        initViewPager();
        initChart();
    }

    private void i() {
        LogUtil.a("BloodOxygenHorizontalFragment", "enter subscribeBloodOxygenData");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(18);
        HiHealthNativeApi.a(this.n).subscribeHiHealthData(arrayList, new a("BloodOxygenHorizontalFragment", this));
    }

    private void f() {
        String str = "BloodOxygenHorizontalFragment";
        LogUtil.a("BloodOxygenHorizontalFragment", "unSubscribeBloodOxygenData");
        if (njy.b(this.f)) {
            HiHealthNativeApi.a(this.n).unSubscribeHiHealthData(this.f, new c(str, "unSubscribeBloodOxygenData, isSuccess :"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Integer> list) {
        LogUtil.a("BloodOxygenHorizontalFragment", "subscribeBloodOxygenData, onResult");
        if (njy.b(list)) {
            LogUtil.a("BloodOxygenHorizontalFragment", "registerBloodOxygenListener success");
            this.f = list;
        }
    }

    public static class a implements HiSubscribeListener {
        private String d;
        private WeakReference<BloodOxygenHorizontalFragment> e;

        private a(String str, BloodOxygenHorizontalFragment bloodOxygenHorizontalFragment) {
            this.d = str;
            this.e = new WeakReference<>(bloodOxygenHorizontalFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            BloodOxygenHorizontalFragment bloodOxygenHorizontalFragment;
            WeakReference<BloodOxygenHorizontalFragment> weakReference = this.e;
            if (weakReference == null || (bloodOxygenHorizontalFragment = weakReference.get()) == null) {
                return;
            }
            bloodOxygenHorizontalFragment.d(list);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            final BloodOxygenHorizontalFragment bloodOxygenHorizontalFragment;
            if (hiHealthData != null) {
                LogUtil.a(this.d, "onChange, type = ", Integer.valueOf(i), ", newValue = ", hiHealthData.toString());
            } else {
                LogUtil.a(this.d, "onChange, type = ", Integer.valueOf(i));
            }
            WeakReference<BloodOxygenHorizontalFragment> weakReference = this.e;
            if (weakReference == null || (bloodOxygenHorizontalFragment = weakReference.get()) == null || !bloodOxygenHorizontalFragment.b(i)) {
                return;
            }
            Objects.requireNonNull(bloodOxygenHorizontalFragment);
            HandlerExecutor.c(new Runnable() { // from class: twb
                @Override // java.lang.Runnable
                public final void run() {
                    bloodOxygenHorizontalFragment.h();
                }
            });
        }
    }

    static class c implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26606c;
        private String e;

        private c(String str, String str2) {
            this.e = str;
            this.f26606c = str2;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a(this.e, this.f26606c, Boolean.valueOf(z));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (serializableExtra instanceof HealthCalendar) {
            HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
            this.o = healthCalendar;
            this.i.reflesh(healthCalendar.transformCalendar().getTimeInMillis());
        }
    }

    private void c(Context context, String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(context, str, map, 0);
        LogUtil.a("BloodOxygenHorizontalFragment", "BICollect", str + Marker.ANY_NON_NULL_MARKER + map.get("type"));
    }
}
