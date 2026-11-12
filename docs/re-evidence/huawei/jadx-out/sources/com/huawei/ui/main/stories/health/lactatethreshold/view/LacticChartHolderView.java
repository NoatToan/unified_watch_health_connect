package com.huawei.ui.main.stories.health.lactatethreshold.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.health.knit.section.chart.LacticLineChart;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface;
import com.huawei.ui.main.stories.health.lactatethreshold.chart.LacticChartHoriHolder;
import defpackage.fsx;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qnt;
import defpackage.qpe;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class LacticChartHolderView extends LinearLayout implements RqViewInterface, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInfos f27995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27997c;
    private HealthCalendar d;
    private HealthTextView e;
    private LacticChartHoriHolder f;
    private LacticLineChart g;
    private qto h;
    private LacticChartHoriHolder i;
    private ImageView j;
    private LinearLayout k;
    private StartCalendarViewListener l;
    private LinearLayout m;
    private ImageView n;
    private HealthViewPager o;
    private long p;
    private HealthTextView r;
    private HealthTextView s;
    private ArrayList<View> t;

    public interface StartCalendarViewListener {
        void onStartCalendarView();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setDateRange(String str, String str2, int i) {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setExactDateAndData(String str, int i, int i2) {
    }

    public LacticChartHolderView(Context context) {
        this(context, null);
    }

    public LacticChartHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LacticChartHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27995a = DataInfos.NoDataPlaceHolder;
        this.l = null;
        this.f27996b = context;
        a();
    }

    private void a() {
        if (qrs.i() > 1.0f) {
            LayoutInflater.from(this.f27996b).inflate(R.layout.lactic_line_chart_view_largefont, this);
        } else {
            LayoutInflater.from(this.f27996b).inflate(R.layout.lactic_line_chart_view, this);
        }
        this.o = (HealthViewPager) findViewById(R.id.viewpager);
        this.j = (ImageView) findViewById(R.id.chart_arrow_left);
        this.n = (ImageView) findViewById(R.id.chart_arrow_right);
        this.j.setOnClickListener(this);
        this.n.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.rq_date_range);
        this.e = healthTextView;
        healthTextView.setOnClickListener(this);
        this.f27997c = (HealthTextView) findViewById(R.id.rq_cursor_time);
        this.m = (LinearLayout) findViewById(R.id.third_layer_1);
        this.k = (LinearLayout) findViewById(R.id.third_layer_2);
        this.r = (HealthTextView) this.m.findViewById(R.id.third_layer_value);
        this.s = (HealthTextView) this.k.findViewById(R.id.third_layer_value);
        setLeftAndRightImage();
        initViewPager();
        if (qrs.v()) {
            float dimension = getResources().getDimension(R.dimen.health_common_40dp);
            this.r.setTextSize(0, dimension);
            this.s.setTextSize(0, dimension);
            this.e.setTextSize(0, getResources().getDimension(R.dimen.health_common_32dp));
            this.f27997c.setTextSize(0, getResources().getDimension(R.dimen.health_common_28dp));
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setLeftAndRightImage() {
        if (LanguageUtil.ba(this.f27996b)) {
            this.j.setImageResource(R.mipmap.ic_health_chart_arrow_right);
            this.n.setImageResource(R.mipmap.ic_health_chart_arrow_left);
        } else {
            this.j.setImageResource(R.mipmap.ic_health_chart_arrow_left);
            this.n.setImageResource(R.mipmap.ic_health_chart_arrow_right);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void initViewPager() {
        this.t = new ArrayList<>();
        this.h = new qto(this.t);
        this.o.setIsCompatibleScrollView(true);
        this.o.setIsScroll(false);
        this.o.setAdapter(this.h);
        if (qrs.v()) {
            setPagerHeight(getResources().getDimensionPixelSize(R.dimen.health_common_244dp));
        }
    }

    private void setPagerHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        layoutParams.height = i;
        this.o.setLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (qrs.i() <= 1.0f || qrs.v()) {
            return;
        }
        int[] iArr = new int[2];
        this.o.getLocationOnScreen(iArr);
        int iM = qrs.m() - iArr[1];
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.health_common_244dp);
        if (iM <= dimensionPixelSize) {
            iM = dimensionPixelSize;
        }
        setPagerHeight(iM);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void initChart() {
        LacticLineChart lacticLineChart = new LacticLineChart(this.f27996b);
        this.g = lacticLineChart;
        this.t.add(lacticLineChart);
        this.h.notifyDataSetChanged();
        this.g.setLayerType(1, null);
        this.g.acquireLayout().i(getResources().getDimensionPixelSize(R.dimen.health_common_36dp));
        this.g.setMarkViewCenteredWhenEmpty(false);
        d();
        d(this.m, false);
        d(this.k, true);
        LacticChartHoriHolder lacticChartHoriHolder = new LacticChartHoriHolder(this.f27996b.getApplicationContext(), "lthrPace");
        this.i = lacticChartHoriHolder;
        lacticChartHoriHolder.addDataLayer(this.g, this.f27995a);
        LacticChartHoriHolder lacticChartHoriHolder2 = new LacticChartHoriHolder(this.f27996b.getApplicationContext(), "lthrHr");
        this.f = lacticChartHoriHolder2;
        lacticChartHoriHolder2.d(true);
        this.f.addDataLayer(this.g, this.f27995a);
        this.g.reflesh(this.p);
    }

    private void d(ViewGroup viewGroup, boolean z) {
        Drawable drawableA;
        HealthTextView healthTextView = (HealthTextView) viewGroup.findViewById(R.id.third_layer_label);
        HealthTextView healthTextView2 = (HealthTextView) viewGroup.findViewById(R.id.third_layer_unit);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_dot_8);
        if (z) {
            healthTextView.setText(getResources().getString(R.string.IDS_hw_show_main_home_page_sport_pace));
            healthTextView2.setText(getContext().getString(R.string.IDS_pace_unit));
            drawableA = a(drawable, R.color.pace_chart_date_color);
        } else {
            healthTextView.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_heart_bmp));
            healthTextView2.setText(getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
            drawableA = a(drawable, R.color.heart_rate_chart_date_color);
        }
        healthTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
        if (qrs.v()) {
            float dimension = getResources().getDimension(R.dimen.health_common_24dp);
            healthTextView.setTextSize(0, dimension);
            healthTextView2.setTextSize(0, dimension);
        }
    }

    private Drawable a(Drawable drawable, int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(getContext(), i));
        return drawableWrap;
    }

    private void d() {
        this.g.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: uwt
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public final void onRangeShow(int i, int i2) {
                this.f50672c.b(i, i2);
            }
        });
        this.g.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                String strB;
                String strB2;
                LacticChartHolderView.this.e(qnh.f((int) LacticChartHolderView.this.g.fetchMarkViewMinuteValue()));
                LacticChartHolderView.this.f27997c.setText(str);
                if (njy.e(list)) {
                    return;
                }
                if (list.size() > 1) {
                    strB = LacticChartHolderView.this.b(list.get(1).f23737a, false);
                    strB2 = LacticChartHolderView.this.b(list.get(0).f23737a, true);
                } else {
                    strB = "--";
                    strB2 = "--";
                }
                LacticChartHolderView.this.r.setText(strB);
                LacticChartHolderView.this.s.setText(strB2);
            }
        });
        this.g.setPagerNoMoreListener(new HwHealthBaseScrollBarLineChart.PagerNoMoreListener() { // from class: com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyNewerPager(boolean z) {
                LacticChartHolderView.this.b();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.PagerNoMoreListener
            public void notifyOlderPager(boolean z) {
                LacticChartHolderView.this.b();
            }
        });
    }

    public /* synthetic */ void b(int i, int i2) {
        if (qrk.b(TimeUnit.MINUTES.toMillis(i), TimeUnit.MINUTES.toMillis(i2))) {
            e(i);
        }
        this.e.setText(this.g.formatRangeText(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(HwHealthBaseEntry hwHealthBaseEntry, boolean z) {
        if (hwHealthBaseEntry == null || !(hwHealthBaseEntry.getData() instanceof fsx)) {
            return "--";
        }
        int y = (int) hwHealthBaseEntry.getY();
        if (z) {
            return qpe.c(y);
        }
        return UnitUtil.e(y, 1, 0);
    }

    public void b(DataInfos dataInfos, long j) {
        this.f27995a = dataInfos;
        this.p = j;
        initChart();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setLeftClickEvent() {
        LacticLineChart lacticLineChart = this.g;
        Objects.requireNonNull(lacticLineChart);
        lacticLineChart.scrollOnePageOlder(new HwHealthBaseScrollBarLineChart<qnt>.b(lacticLineChart) { // from class: com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(lacticLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    @Override // com.huawei.ui.main.stories.health.fragment.rqpackage.RqViewInterface
    public void setRightClickEvent() {
        LacticLineChart lacticLineChart = this.g;
        Objects.requireNonNull(lacticLineChart);
        lacticLineChart.scrollOnePageNewer(new HwHealthBaseScrollBarLineChart<qnt>.b(lacticLineChart) { // from class: com.huawei.ui.main.stories.health.lactatethreshold.view.LacticChartHolderView.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                Objects.requireNonNull(lacticLineChart);
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.j.setVisibility(this.g.canScrollOlderPager() ? 0 : 8);
        this.n.setVisibility(this.g.canScrollNewerPager() ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view == this.n) {
            setRightClickEvent();
        } else if (view == this.j) {
            setLeftClickEvent();
        } else if (view == this.e) {
            c();
        }
    }

    protected void c() {
        StartCalendarViewListener startCalendarViewListener = this.l;
        if (startCalendarViewListener != null) {
            startCalendarViewListener.onStartCalendarView();
        }
    }

    public void b(long j, HealthCalendar healthCalendar) {
        this.d = healthCalendar;
        this.g.reflesh(j);
    }

    public void e(int i) {
        long millis = TimeUnit.MINUTES.toMillis(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        if (this.d == null) {
            this.d = new HealthCalendar();
        }
        this.d = this.d.transformFromCalendar(calendar);
    }

    public void setStartCalendarViewListener(StartCalendarViewListener startCalendarViewListener) {
        this.l = startCalendarViewListener;
    }
}
