package com.xiaomi.hm.health.relation.chart;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.relation.chart.base.BarChart;
import com.xiaomi.hm.health.relation.chart.base.BaseChartView;
import com.xiaomi.hm.health.relation.chart.base.ChartScroller;
import com.xiaomi.hm.health.relation.chart.base.ColorRenderer;
import com.xiaomi.hm.health.relation.chart.base.Renderer;
import com.xiaomi.hm.health.relation.chart.data.ChartDataLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class StatisticChartView extends BaseChartView<StatisticChart> {
    public static final int LAYOUT_LEFT_TO_RIGHT = 1;
    private static final String v = "Chart.StatisticChartView";
    private Renderer b;
    private Renderer c;
    private List<StatisticChart.StatisticBarItem> d;
    private List<StatisticChart.StatisticBarItem> e;
    private List<StatisticChart.StatisticWeightItem> f;
    private List<StatisticChart.DateItem> g;
    private int h;
    private ArrayList<Integer> i;
    private ChartDataLoader.LoadCallback j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int p;
    private int q;
    private boolean r;
    private float s;
    private Context t;
    private ChartScroller.ScrollingListener u;

    public static class StatisticChartData extends ChartDataLoader.ItemData {
        public String date;
        public int sleepDeepValue;
        public int sleepValue;
        public int stepShoesValue;
        public int stepValue;
        public float weightValue;
    }

    public interface StatisticChartLoadCallback extends ChartDataLoader.LoadCallback {
        void onOverScrolled();
    }

    public class a implements ChartDataLoader.LoadCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return StatisticChartView.this.j.hasData(i);
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i) {
            ChartDataLoader.ItemData itemData = StatisticChartView.this.mLoader.getItemData(i);
            return itemData == null ? StatisticChartView.this.j.loadData(i) : itemData;
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData) {
            if (itemData == null) {
                return;
            }
            if (!StatisticChartView.this.z(itemData.index)) {
                StatisticChartView.this.x((StatisticChartData) itemData);
            }
            StatisticChartView.this.i.remove(Integer.valueOf(itemData.index));
            if (StatisticChartView.this.i.isEmpty()) {
                if (StatisticChartView.this.k) {
                    onToItem(StatisticChartView.this.h);
                }
                ((StatisticChart) StatisticChartView.this.mChart).notifyChanged();
                StatisticChartView.this.j.onDataLoaded(itemData);
            }
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            StatisticChartView.this.j.onToItem(i);
        }
    }

    public class b implements StatisticChartLoadCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return StatisticChartView.this.j.hasData(i);
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i) {
            StatisticChartView.this.loadStatisticData(i);
            StatisticChartView.this.k = false;
            return null;
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData) {
        }

        @Override // com.xiaomi.hm.health.relation.chart.StatisticChartView.StatisticChartLoadCallback
        public void onOverScrolled() {
            StatisticChartView.this.mScroller.forceFinishScrolling();
        }

        @Override // com.xiaomi.hm.health.relation.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            StatisticChartView.this.j.onToItem(i);
        }
    }

    public class c implements ChartScroller.ScrollingListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.ChartScroller.ScrollingListener
        public void onFinish() {
            HMLog.i(StatisticChartView.v, "Scroll OnFinish!!", new Object[0]);
            StatisticChartView.this.mLoader.onToItem(((StatisticChart) StatisticChartView.this.mChart).itemOffset());
            if (StatisticChartView.this.mIsScrollingPerformed) {
                StatisticChartView.this.mIsScrollingPerformed = false;
            }
            StatisticChartView.this.mScrollingOffset = 0;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.ChartScroller.ScrollingListener
        public void onJustify() {
            HMLog.i(StatisticChartView.v, "Scroll OnJustify!!", new Object[0]);
            if (Math.abs(StatisticChartView.this.mScrollingOffset) > 1) {
                int iJustified = ((StatisticChart) StatisticChartView.this.mChart).justified();
                if (StatisticChartView.this.q == 1) {
                    iJustified = -iJustified;
                }
                StatisticChartView.this.mScroller.scrollX(iJustified);
            }
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.ChartScroller.ScrollingListener
        @SuppressLint({"NewApi"})
        public boolean onScrollX(int i) {
            if (StatisticChartView.this.q == 1) {
                i = -i;
            }
            ((StatisticChart) StatisticChartView.this.mChart).scroll(i);
            StatisticChartView.this.postInvalidateOnAnimation();
            StatisticChartView.s(StatisticChartView.this, i);
            return true;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.ChartScroller.ScrollingListener
        public boolean onScrollY(int i) {
            return true;
        }

        @Override // com.xiaomi.hm.health.relation.chart.base.ChartScroller.ScrollingListener
        public void onStart() {
            HMLog.i(StatisticChartView.v, "Scroll OnStart!!", new Object[0]);
            StatisticChartView.this.mIsScrollingPerformed = true;
        }
    }

    public StatisticChartView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int s(StatisticChartView statisticChartView, int i) {
        int i2 = statisticChartView.mScrollingOffset + i;
        statisticChartView.mScrollingOffset = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(StatisticChartData statisticChartData) {
        if (this.p == 256) {
            StatisticChart.StatisticWeightItem statisticWeightItem = new StatisticChart.StatisticWeightItem(getContext());
            statisticWeightItem.value = (int) (statisticChartData.weightValue * 10.0f);
            statisticWeightItem.index = statisticChartData.index;
            statisticWeightItem.setRenderer(this.b);
            statisticWeightItem.setParent(this.mChart);
            this.f.add(statisticWeightItem);
        } else {
            StatisticChart.StatisticBarItem statisticBarItem = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem.value = statisticChartData.stepValue;
            statisticBarItem.value1 = statisticChartData.stepShoesValue;
            statisticBarItem.index = statisticChartData.index;
            statisticBarItem.setRenderer(this.b);
            statisticBarItem.setParent(this.mChart);
            this.d.add(statisticBarItem);
            StatisticChart.StatisticBarItem statisticBarItem2 = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem2.value = statisticChartData.sleepValue;
            statisticBarItem2.value1 = statisticChartData.sleepDeepValue;
            statisticBarItem2.index = statisticChartData.index;
            statisticBarItem2.setRenderer(this.c);
            statisticBarItem2.setParent(this.mChart);
            this.e.add(statisticBarItem2);
        }
        StatisticChart.DateItem dateItem = new StatisticChart.DateItem();
        dateItem.a = statisticChartData.index;
        dateItem.b = statisticChartData.date;
        this.g.add(dateItem);
        y();
    }

    private void y() {
        if (this.p == 256) {
            Collections.sort(this.f);
            ((StatisticChart) this.mChart).fillWeightData(this.f);
        } else {
            ((StatisticChart) this.mChart).fillStepData(this.d);
            ((StatisticChart) this.mChart).fillSleepData(this.e);
        }
        ((StatisticChart) this.mChart).fillDates(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(int i) {
        List list;
        int i2 = this.p;
        if (i2 == 1) {
            list = this.d;
        } else if (i2 != 16) {
            list = i2 != 256 ? null : this.f;
        } else {
            list = this.e;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((BarChart.BarItem) it2.next()).index == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChartView
    public Animator animRefresh() {
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        this.o = -1.0f;
        return super.animRefresh();
    }

    public void getActivity(Context context) {
        this.t = context;
    }

    public void loadStatisticData(int i) {
        int i2;
        this.h = i;
        this.k = true;
        int barItemCount = ((((StatisticChart) this.mChart).getBarItemCount() + 1) / 2) - 1;
        int barItemCount2 = ((StatisticChart) this.mChart).getBarItemCount();
        if (this.p == 256) {
            i2 = -3;
            barItemCount2 += 2;
        } else {
            i2 = -1;
        }
        while (i2 <= barItemCount2) {
            int i3 = (i - i2) + barItemCount;
            if (!this.i.contains(Integer.valueOf(i3)) && this.j.hasData(i3)) {
                this.i.add(Integer.valueOf(i3));
            }
            i2++;
        }
        if (this.i.size() > 0) {
            Iterator<Integer> it2 = this.i.iterator();
            while (it2.hasNext()) {
                this.mLoader.loadItemData(it2.next().intValue());
            }
        }
    }

    public void offsetTo(int i) {
        ((StatisticChart) this.mChart).offsetTo(-i);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChartView, android.view.View
    public void onDraw(Canvas canvas) {
        ((StatisticChart) this.mChart).draw(canvas, this.mAnimFactor, this.l, this.m, this.n, this.o, this.mNotDrawBars);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollable) {
            return false;
        }
        if (getParent() != null && !this.r) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = motionEvent.getX();
        } else if (action == 1) {
            if (Math.abs(this.s - motionEvent.getX()) > 5.0f) {
                if (this.p == 16) {
                    Analytics.event(this.t, "DetailSleep", StatEvent.EventParams.MOTION);
                } else {
                    Analytics.event(this.t, "DetailActivity", StatEvent.EventParams.MOTION);
                }
            } else if (this.p == 16) {
                Analytics.event(this.t, "DetailSleep", StatEvent.EventParams.CLICK);
            } else {
                Analytics.event(this.t, "DetailActivity", StatEvent.EventParams.CLICK);
            }
            if (!this.mIsScrollingPerformed) {
                this.mScroller.scrollX(((StatisticChart) this.mChart).offsetScrolled(motionEvent.getX()));
            }
        }
        return this.mScroller.onTouchEvent(motionEvent);
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChartView
    public void refresh() {
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        this.o = -1.0f;
        super.refresh();
    }

    @Override // com.xiaomi.hm.health.relation.chart.base.BaseChartView
    public void setDataLoader(ChartDataLoader chartDataLoader) {
        this.j = chartDataLoader.getLoadCallback();
        this.mLoader = chartDataLoader;
        chartDataLoader.setLoadCallback(new a());
        ((StatisticChart) this.mChart).setLoadCallback(new b());
    }

    public void setInterceptable(boolean z) {
        this.r = z;
    }

    public void setMode(int i) {
        this.p = i;
        ((StatisticChart) this.mChart).setMode(i);
    }

    public void setStepGoal(int i) {
        ((StatisticChart) this.mChart).setStepGoal(i);
    }

    public void updateBarItemCount(int i) {
        ((StatisticChart) this.mChart).updateBarItemCount(i);
    }

    public StatisticChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatisticChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = false;
        this.s = 0.0f;
        this.u = new c();
        this.b = new ColorRenderer(0);
        this.c = new ColorRenderer(0);
        this.mChart = new StatisticChart(context);
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.mScroller = new ChartScroller(getContext(), this.u);
        this.i = new ArrayList<>();
    }
}
