package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.linechart.view.commonlinechart.HwHealthCommonLineChart;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.up.model.UserInfomation;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qrk;
import defpackage.uly;
import defpackage.uvi;
import defpackage.vds;
import defpackage.wka;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class RqLineChartHolderView extends LinearLayout implements RqViewInterface, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected uvi f27928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthTextView f27929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthTextView f27930c;
    protected HealthTextView d;
    protected HealthTextView e;
    protected HealthViewPager f;
    protected ImageView g;
    protected uvi h;
    protected ImageView i;
    protected uly j;
    private HealthCalendar k;
    protected ArrayList<View> l;
    protected View m;
    private Context n;
    protected uvi o;
    private StartCalendarViewListener p;
    private int q;
    private DataInfos r;
    private HwHealthCommonLineChart s;
    private long t;
    private int w;

    public interface StartCalendarViewListener {
        void onStartCalendarView();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setDateRange(String str, String str2, int i) {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setExactDateAndData(String str, int i, int i2) {
    }

    public RqLineChartHolderView(Context context) {
        this(context, null);
    }

    public RqLineChartHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RqLineChartHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = DataInfos.RunningMonthDetail;
        this.p = null;
        this.n = context;
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.n).inflate(R.layout.rq_line_chart_view, this);
        this.m = viewInflate;
        this.f = (HealthViewPager) viewInflate.findViewById(R.id.rq_viewpager);
        this.g = (ImageView) this.m.findViewById(R.id.rq_line_arrow_left);
        this.i = (ImageView) this.m.findViewById(R.id.rq_line_arrow_right);
        this.g.setOnClickListener(this);
        this.i.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) this.m.findViewById(R.id.rq_date_range);
        this.f27929b = healthTextView;
        healthTextView.setOnClickListener(this);
        this.f27930c = (HealthTextView) this.m.findViewById(R.id.rq_cursor_describe);
        this.d = (HealthTextView) this.m.findViewById(R.id.rq_cursor_value);
        this.e = (HealthTextView) this.m.findViewById(R.id.rq_cursor_time);
        setLeftAndRightImage();
        initViewPager();
    }

    public void setWidthMatchParent() {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setLeftAndRightImage() {
        if (LanguageUtil.ba(this.n)) {
            this.g.setBackground(ContextCompat.getDrawable(this.n, R.drawable.common_right_arrow_click_selector));
            this.i.setBackground(ContextCompat.getDrawable(this.n, R.drawable.common_left_arrow_click_selector));
        } else {
            this.g.setBackground(ContextCompat.getDrawable(this.n, R.drawable.common_left_arrow_click_selector));
            this.i.setBackground(ContextCompat.getDrawable(this.n, R.drawable.common_right_arrow_click_selector));
        }
    }

    public void e(String str, List<HwHealthMarkerView.d> list) {
        String strD;
        b(qnh.f((int) this.s.fetchMarkViewMinuteValue()));
        this.e.setText(str);
        String strB = "--";
        if (njy.e(list)) {
            LogUtil.j("Track_RqLineChartHolderView", "notifyView data is empty");
            strD = "--";
        } else {
            strD = this.o.d(list.get(list.size() - 1).f23737a);
        }
        if ("--".equals(strD)) {
            this.d.setText(strD);
            this.f27930c.setVisibility(8);
            return;
        }
        float fD = (float) UnitUtil.d(list.get(list.size() - 1).f23737a.getY(), 1);
        if (fD != 0.0f && this.w == 2) {
            strB = c((int) fD);
        }
        if (this.w == 1) {
            strB = wka.g(fD);
        }
        if (fD != 0.0f && this.w == 0) {
            if (getGender() == 0) {
                strB = wka.i(fD);
            } else {
                strB = wka.b(fD);
            }
        }
        if (this.q == 0) {
            this.f27930c.setVisibility(0);
        } else {
            this.f27930c.setVisibility(8);
        }
        this.f27930c.setText(strB);
        this.d.setText(strD);
    }

    private int getGender() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        return userInfo.getGender();
    }

    private String c(int i) {
        return vds.b(vds.d(i, vds.b()));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void initViewPager() {
        this.l = new ArrayList<>();
        this.j = new uly(this.l);
        this.f.setIsCompatibleScrollView(true);
        this.f.setIsScroll(false);
        this.f.setAdapter(this.j);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void initChart() {
        this.o = new uvi(this.n.getApplicationContext(), this.w, this.q);
        if (this.s == null) {
            HwHealthCommonLineChart hwHealthCommonLineChart = new HwHealthCommonLineChart(this.n);
            this.s = hwHealthCommonLineChart;
            hwHealthCommonLineChart.setLayerType(1, null);
            this.s.setMoveToLastDataStamp(true);
            b();
            this.o.addDataLayer(this.s, this.r);
            this.l.add(this.s);
            this.j.notifyDataSetChanged();
            this.s.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: uvl
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
                public final void onRangeShow(int i, int i2) {
                    this.d.a(i, i2);
                }
            });
            this.s.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: uvn
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
                public final void onTextChanged(String str, List list) {
                    this.d.e(str, list);
                }
            });
            this.s.reflesh(System.currentTimeMillis());
            if (this.w != 2) {
                this.s.acquireScrollAdapter().setBuffRang(0);
            }
        }
    }

    public /* synthetic */ void a(int i, int i2) {
        long j = i;
        if (qrk.b(TimeUnit.MINUTES.toMillis(j), TimeUnit.MINUTES.toMillis(i2))) {
            b(i);
        }
        this.t = TimeUnit.MINUTES.toMillis(j);
        this.f27929b.setText(this.s.formatRangeText(i, i2));
    }

    public long getStartTime() {
        return this.t;
    }

    private void e() {
        this.o = new uvi(this.n.getApplicationContext(), this.w, this.q);
        if (this.s == null) {
            LogUtil.a("Track_RqLineChartHolderView", "initChartByType mLineChart is null");
            this.s = new HwHealthCommonLineChart(this.n);
        }
        this.s.setMoveToLastDataStamp(true);
        this.s.setLayerType(1, null);
        this.s.clearValues();
        this.o.addDataLayer(this.s, this.r);
        this.l.add(this.s);
        this.j.notifyDataSetChanged();
        this.s.reflesh(System.currentTimeMillis());
        this.s.setWillNotDraw(false);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.s.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        this.s.resetYaxisAnimateValue();
    }

    public void e(DataInfos dataInfos, int i, int i2) {
        this.r = dataInfos;
        this.w = i;
        this.q = i2;
        initChart();
    }

    public void c(DataInfos dataInfos, int i, int i2) {
        this.r = dataInfos;
        this.w = i;
        this.q = i2;
        e();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setLeftClickEvent() {
        if (this.s.isAnimating()) {
            return;
        }
        HwHealthCommonLineChart hwHealthCommonLineChart = this.s;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView.1
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

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setRightClickEvent() {
        if (this.s.isAnimating()) {
            return;
        }
        HwHealthCommonLineChart hwHealthCommonLineChart = this.s;
        Objects.requireNonNull(hwHealthCommonLineChart);
        hwHealthCommonLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(hwHealthCommonLineChart) { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView.3
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

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.s.canScrollOlderPager()) {
            this.g.setVisibility(0);
            this.g.setClickable(true);
        } else {
            this.g.setVisibility(4);
            this.g.setClickable(false);
        }
        if (this.s.canScrollNewerPager()) {
            this.i.setVisibility(0);
            this.i.setClickable(true);
        } else {
            this.i.setVisibility(4);
            this.i.setClickable(false);
        }
    }

    protected void b() {
        this.s.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                RqLineChartHolderView.this.d();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                RqLineChartHolderView.this.d();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view == this.i) {
            setRightClickEvent();
        } else if (view == this.g) {
            setLeftClickEvent();
        } else if (view == this.f27929b) {
            a();
        }
    }

    protected void a() {
        StartCalendarViewListener startCalendarViewListener = this.p;
        if (startCalendarViewListener != null) {
            startCalendarViewListener.onStartCalendarView();
        }
    }

    public void b(long j, HealthCalendar healthCalendar) {
        this.k = healthCalendar;
        this.s.reflesh(j);
    }

    public void c(long j) {
        HwHealthCommonLineChart hwHealthCommonLineChart = this.s;
        if (hwHealthCommonLineChart != null) {
            hwHealthCommonLineChart.reflesh(j);
        }
    }

    public void b(int i) {
        LogUtil.a("Track_RqLineChartHolderView", "updateCalendar minute===", Integer.valueOf(i));
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.k == null) {
            this.k = new HealthCalendar();
        }
        this.k = this.k.transformFromCalendar(calendar);
    }

    public void setStartCalendarViewListener(StartCalendarViewListener startCalendarViewListener) {
        this.p = startCalendarViewListener;
    }

    public uvi getRqChartLineViewHolder() {
        return this.o;
    }
}
