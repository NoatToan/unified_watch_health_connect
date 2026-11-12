package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qrk;
import defpackage.uvi;
import defpackage.wka;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class RqLineHorizontalChartHolderView extends RqLineChartHolderView {
    private long aa;
    private int ab;
    private boolean ac;
    private RqHorizontalLineChart ad;
    private int af;
    private HealthTextView ag;
    private HealthTextView ai;
    private HealthCalendar k;
    private Context n;
    private DataInfos p;
    private HealthTextView q;
    private HealthTextView r;
    private HwHealthLineDataSet s;
    private HwHealthLineDataSet t;
    private boolean u;
    private HealthTextView v;
    private boolean w;
    private boolean x;
    private HealthTextView y;
    private int z;

    public RqLineHorizontalChartHolderView(Context context) {
        this(context, null);
    }

    public RqLineHorizontalChartHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RqLineHorizontalChartHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = DataInfos.RunningWeekDetail;
        this.z = 0;
        this.n = context;
        d();
    }

    private void d() {
        if (this.m == null) {
            LogUtil.e("Track_RqLineChartHolderView", "initHorizontalView mView is null.");
            return;
        }
        this.ai = (HealthTextView) this.m.findViewById(R.id.horizontal_state_text);
        this.ag = (HealthTextView) this.m.findViewById(R.id.rq_state_value);
        this.y = (HealthTextView) this.m.findViewById(R.id.horizontal_fitness_text);
        this.v = (HealthTextView) this.m.findViewById(R.id.rq_fitness_value);
        this.q = (HealthTextView) this.m.findViewById(R.id.horizontal_fatigue_text);
        this.r = (HealthTextView) this.m.findViewById(R.id.rq_fatigue_value);
        if (this.d != null) {
            this.d.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView
    public void e(String str, List<HwHealthMarkerView.d> list) {
        String strE;
        String strA;
        b(qnh.f((int) this.ad.fetchMarkViewMinuteValue()));
        this.e.setText(str);
        String str2 = "--";
        if (njy.e(list)) {
            LogUtil.j("Track_RqLineChartHolderView", "notifyView data is empty");
            strA = "--";
            strE = strA;
        } else {
            String strD = this.o.d(list.get(0).f23737a);
            strE = this.ac ? e(list) : "--";
            str2 = strD;
            strA = this.u ? a(list) : "--";
        }
        b(list, str2, strE, strA);
    }

    private void b(List<HwHealthMarkerView.d> list, String str, String str2, String str3) {
        String strG = "--";
        if ("--".equals(str)) {
            this.d.setText(str);
            this.f27930c.setVisibility(8);
            this.ag.setText(str);
            this.v.setText(str2);
            this.r.setText(str3);
            return;
        }
        if (list.size() > 0 && list.get(this.z).f23737a != null) {
            strG = wka.g(list.get(this.z).f23737a.getY());
        }
        this.f27930c.setVisibility(0);
        this.f27930c.setText(strG);
        this.ag.setText(str);
        this.v.setText(str2);
        this.r.setText(str3);
    }

    private String a(List<HwHealthMarkerView.d> list) {
        int i = 1;
        if (list.size() == 2) {
            this.w = true;
            this.x = false;
        }
        if (this.w && list.size() == 3) {
            i = 2;
        }
        return this.f27928a.d(list.get(list.size() - i).f23737a);
    }

    private String e(List<HwHealthMarkerView.d> list) {
        int i = 1;
        if (list.size() == 2) {
            this.x = true;
            this.w = false;
        }
        if (this.x && list.size() == 3) {
            i = 2;
        }
        return this.h.d(list.get(list.size() - i).f23737a);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView, com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void initChart() {
        this.o = new uvi(this.n.getApplicationContext(), this.af, this.ab);
        if (this.ab == 0) {
            this.o.d(true);
            this.ai.setVisibility(0);
            this.ag.setVisibility(0);
            this.f27930c.setVisibility(0);
        }
        if (this.ab == 1) {
            this.o.b(true);
            this.y.setVisibility(0);
            this.v.setVisibility(0);
            this.f27930c.setVisibility(8);
        }
        if (this.ab == 2) {
            this.o.a(true);
            this.q.setVisibility(0);
            this.r.setVisibility(0);
            this.f27930c.setVisibility(8);
        }
        if (this.ad == null) {
            this.ad = new RqHorizontalLineChart(this.n);
        }
        this.ad.setMoveToLastDataStamp(true);
        this.ad.setLayerType(1, null);
        b();
        this.o.addDataLayer(this.ad, this.p);
        this.l.clear();
        this.l.add(this.ad);
        this.ad.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: uvo
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public final void onRangeShow(int i, int i2) {
                this.f50612a.d(i, i2);
            }
        });
        this.j.notifyDataSetChanged();
        this.ad.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: uvs
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public final void onTextChanged(String str, List list) {
                this.e.e(str, list);
            }
        });
        setJumpToChartTime(this.aa);
        this.ad.acquireScrollAdapter().setBuffRang(0);
    }

    public /* synthetic */ void d(int i, int i2) {
        if (qrk.b(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
            b(i);
        }
        this.f27929b.setText(this.ad.formatRangeText(i, i2));
    }

    public void setJumpToChartTime(long j) {
        this.ad.setShowRange(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(j)), this.ad.acquireScrollAdapter().acquireRange());
        this.ad.highlightValue(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(j)), false);
    }

    public void b(DataInfos dataInfos, int i, int i2, long j) {
        this.p = dataInfos;
        this.af = i;
        this.ab = i2;
        this.aa = j;
        initChart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(boolean z) {
        this.ac = z;
        this.y.setVisibility(z ? 0 : 8);
        this.v.setVisibility(z ? 0 : 8);
        setFitnessLeftMargin(this.ac);
        if (this.ac) {
            this.h = new uvi(this.n.getApplicationContext(), this.af, 1);
            this.h.b(true);
            this.t = (HwHealthLineDataSet) this.h.addDataLayer(this.ad, this.p);
        } else {
            this.h.rmDataLayer(this.ad, this.t);
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.ad.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        this.ad.animateBorderYAuto();
        this.ad.refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(boolean z) {
        this.u = z;
        this.q.setVisibility(z ? 0 : 8);
        this.r.setVisibility(z ? 0 : 8);
        setFatigueLeftMargin(z);
        if (this.u) {
            this.f27928a = new uvi(this.n.getApplicationContext(), this.af, 2);
            this.f27928a.a(true);
            this.s = (HwHealthLineDataSet) this.f27928a.addDataLayer(this.ad, this.p);
        } else {
            this.f27928a.rmDataLayer(this.ad, this.s);
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = this.ad.acquireScrollAdapter();
        scrollAdapterInterfaceAcquireScrollAdapter.setFlag(1 | scrollAdapterInterfaceAcquireScrollAdapter.getFlag());
        this.ad.animateBorderYAuto();
        this.ad.refresh();
    }

    public void setFitnessLeftMargin(boolean z) {
        if (this.y.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
            if (z) {
                layoutParams.setMarginStart((int) this.n.getResources().getDimension(R.dimen.health_gradient_name_text_width));
            } else {
                layoutParams.setMarginStart((int) this.n.getResources().getDimension(R.dimen.dialog_btn_width_0dp));
            }
            this.y.setLayoutParams(layoutParams);
        }
    }

    public void setFatigueLeftMargin(boolean z) {
        if (this.q.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q.getLayoutParams();
            if (z) {
                layoutParams.setMarginStart((int) this.n.getResources().getDimension(R.dimen.health_gradient_name_text_width));
            } else {
                layoutParams.setMarginStart((int) this.n.getResources().getDimension(R.dimen.dialog_btn_width_0dp));
            }
            this.q.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView, com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setLeftClickEvent() {
        RqHorizontalLineChart rqHorizontalLineChart = this.ad;
        Objects.requireNonNull(rqHorizontalLineChart);
        rqHorizontalLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(rqHorizontalLineChart) { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineHorizontalChartHolderView.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(rqHorizontalLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView, com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setRightClickEvent() {
        RqHorizontalLineChart rqHorizontalLineChart = this.ad;
        Objects.requireNonNull(rqHorizontalLineChart);
        rqHorizontalLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(rqHorizontalLineChart) { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineHorizontalChartHolderView.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(rqHorizontalLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.ad.canScrollOlderPager()) {
            this.g.setVisibility(0);
            this.g.setClickable(true);
        } else {
            this.g.setVisibility(4);
            this.g.setClickable(false);
        }
        if (this.ad.canScrollNewerPager()) {
            this.i.setVisibility(0);
            this.i.setClickable(true);
        } else {
            this.i.setVisibility(4);
            this.i.setClickable(false);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView
    protected void b() {
        this.ad.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineHorizontalChartHolderView.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                RqLineHorizontalChartHolderView.this.e();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                RqLineHorizontalChartHolderView.this.e();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView
    public void b(long j, HealthCalendar healthCalendar) {
        this.k = healthCalendar;
        this.ad.reflesh(j);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineChartHolderView
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
}
