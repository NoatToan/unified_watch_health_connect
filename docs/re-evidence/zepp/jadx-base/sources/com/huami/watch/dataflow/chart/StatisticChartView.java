package com.huami.watch.dataflow.chart;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.huami.watch.dataflow.chart.base.BarChart;
import com.huami.watch.dataflow.chart.base.BaseChartView;
import com.huami.watch.dataflow.chart.base.ChartScroller;
import com.huami.watch.dataflow.chart.base.ColorRenderer;
import com.huami.watch.dataflow.chart.base.Renderer;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class StatisticChartView extends BaseChartView<StatisticChart> {
    public static final int LAYOUT_BOTTOM_TO_TOP = 2;
    public static final int LAYOUT_LEFT_TO_RIGHT = 1;
    public static final int LAYOUT_RIGHT_TO_LEFT = 0;
    public static final int LAYOUT_TOP_TO_BOTTOM = 3;
    private static final String y = "StatisticChartView";
    private Renderer b;
    private Renderer c;
    private Renderer d;
    private Renderer e;
    private Renderer f;
    private List<StatisticChart.StatisticBarItem> g;
    private List<StatisticChart.StatisticBarItem> h;
    private List<StatisticChart.StatisticBarItem> i;
    private List<StatisticChart.StatisticHRItem> j;
    private List<StatisticChart.StatisticBarItem> k;
    private List<StatisticChart.DateItem> l;
    private int m;
    private ArrayList<Integer> n;
    private ChartDataLoader.LoadCallback o;
    private boolean p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private ChartScroller.ScrollingListener x;

    public static class StatisticChartData extends ChartDataLoader.ItemData {
        public int activeValue;
        public String date;
        public float energyValue;
        public int hrValue;
        public int hrvValue;
        public int secondHRValue;
        public int sleepDeepValue;
        public int sleepValue;
        public int stepShoesValue;
        public int stepValue;
    }

    public interface StatisticChartLoadCallback extends ChartDataLoader.LoadCallback {
        void onOverScrolled();
    }

    public class a implements ChartDataLoader.LoadCallback {
        public a() {
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return StatisticChartView.this.o.hasData(i);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i, boolean z) {
            ChartDataLoader.ItemData itemData = StatisticChartView.this.mLoader.getItemData(i);
            return itemData == null ? StatisticChartView.this.o.loadData(i, z) : itemData;
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
            if (itemData == null) {
                return;
            }
            if (!StatisticChartView.this.z(itemData.index)) {
                StatisticChartView.this.x((StatisticChartData) itemData);
            }
            StatisticChartView.this.n.remove(Integer.valueOf(itemData.index));
            if (StatisticChartView.this.n.isEmpty()) {
                if (StatisticChartView.this.p) {
                    onToItem(StatisticChartView.this.m);
                }
                ((StatisticChart) StatisticChartView.this.mChart).notifyChanged();
                if (z) {
                    StatisticChartView.this.postInvalidateOnAnimation();
                }
                StatisticChartView.this.o.onDataLoaded(itemData, false);
            }
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            StatisticChartView.this.o.onToItem(i);
        }
    }

    public class b implements StatisticChartLoadCallback {
        public b() {
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return StatisticChartView.this.o.hasData(i);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i, boolean z) {
            StatisticChartView.this.loadStatisticData(i, z);
            StatisticChartView.this.p = false;
            return null;
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
        }

        @Override // com.huami.watch.dataflow.chart.StatisticChartView.StatisticChartLoadCallback
        public void onOverScrolled() {
            StatisticChartView.this.mScroller.forceFinishScrolling();
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            StatisticChartView.this.o.onToItem(i);
        }
    }

    public class c implements ChartScroller.ScrollingListener {
        public c() {
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onFinish() {
            Log.i(StatisticChartView.y, "Scroll OnFinish!!");
            StatisticChartView.this.mLoader.onToItem(((StatisticChart) StatisticChartView.this.mChart).itemOffset());
            if (StatisticChartView.this.mIsScrollingPerformed) {
                StatisticChartView.this.mIsScrollingPerformed = false;
            }
            StatisticChartView.this.mScrollingOffset = 0;
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onJustify() {
            Log.i(StatisticChartView.y, "Scroll OnJustify!!");
            if (Math.abs(StatisticChartView.this.mScrollingOffset) > 1) {
                int iJustified = ((StatisticChart) StatisticChartView.this.mChart).justified();
                if (StatisticChartView.this.v == 1) {
                    iJustified = -iJustified;
                }
                StatisticChartView.this.mScroller.scrollX(iJustified);
            }
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        @SuppressLint({"NewApi"})
        public boolean onScrollX(int i) {
            if (StatisticChartView.this.v == 1) {
                i = -i;
            }
            ((StatisticChart) StatisticChartView.this.mChart).scroll(i);
            StatisticChartView.this.postInvalidateOnAnimation();
            StatisticChartView.f(StatisticChartView.this, i);
            return true;
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public boolean onScrollY(int i) {
            return true;
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onStart() {
            Log.i(StatisticChartView.y, "Scroll OnStart!!");
            StatisticChartView.this.mIsScrollingPerformed = true;
        }
    }

    public StatisticChartView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int f(StatisticChartView statisticChartView, int i) {
        int i2 = statisticChartView.mScrollingOffset + i;
        statisticChartView.mScrollingOffset = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(StatisticChartData statisticChartData) {
        int i = this.u;
        if (i == 256) {
            StatisticChart.StatisticHRItem statisticHRItem = new StatisticChart.StatisticHRItem(getContext());
            statisticHRItem.value = statisticChartData.hrValue;
            statisticHRItem.secondValue = statisticChartData.secondHRValue;
            statisticHRItem.index = statisticChartData.index;
            statisticHRItem.setRenderer(this.e);
            statisticHRItem.setParent(this.mChart);
            this.j.add(statisticHRItem);
        } else if (i == 1) {
            StatisticChart.StatisticBarItem statisticBarItem = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem.value = statisticChartData.stepValue;
            statisticBarItem.value1 = statisticChartData.stepShoesValue;
            statisticBarItem.index = statisticChartData.index;
            statisticBarItem.setRenderer(this.b);
            statisticBarItem.setParent(this.mChart);
            this.g.add(statisticBarItem);
        } else if (i == 1048576) {
            StatisticChart.StatisticBarItem statisticBarItem2 = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem2.value = (int) statisticChartData.energyValue;
            statisticBarItem2.index = statisticChartData.index;
            statisticBarItem2.setRenderer(this.c);
            statisticBarItem2.setParent(this.mChart);
            this.h.add(statisticBarItem2);
        } else if (i == 268435456) {
            StatisticChart.StatisticBarItem statisticBarItem3 = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem3.value = statisticChartData.hrvValue;
            statisticBarItem3.index = statisticChartData.index;
            statisticBarItem3.setRenderer(this.f);
            statisticBarItem3.setParent(this.mChart);
            this.k.add(statisticBarItem3);
        } else {
            StatisticChart.StatisticBarItem statisticBarItem4 = new StatisticChart.StatisticBarItem(getContext());
            statisticBarItem4.value = statisticChartData.sleepValue;
            statisticBarItem4.value1 = statisticChartData.sleepDeepValue;
            statisticBarItem4.index = statisticChartData.index;
            statisticBarItem4.setRenderer(this.d);
            statisticBarItem4.setParent(this.mChart);
            this.i.add(statisticBarItem4);
        }
        StatisticChart.DateItem dateItem = new StatisticChart.DateItem();
        dateItem.a = statisticChartData.index;
        dateItem.b = statisticChartData.date;
        this.l.add(dateItem);
        y();
    }

    private void y() {
        int i = this.u;
        if (i == 256) {
            Collections.sort(this.j);
            ((StatisticChart) this.mChart).fillHRtData(this.j);
        } else if (i == 1) {
            ((StatisticChart) this.mChart).fillStepData(this.g);
        } else if (i == 1048576) {
            ((StatisticChart) this.mChart).fillCalData(this.h);
        } else if (i == 268435456) {
            ((StatisticChart) this.mChart).fillEcgData(this.k);
        } else {
            ((StatisticChart) this.mChart).fillSleepData(this.i);
        }
        ((StatisticChart) this.mChart).fillDates(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(int i) {
        List list;
        int i2 = this.u;
        if (i2 == 1) {
            list = this.g;
        } else if (i2 == 16) {
            list = this.i;
        } else if (i2 == 256) {
            list = this.j;
        } else if (i2 != 1048576) {
            list = i2 != 268435456 ? null : this.k;
        } else {
            list = this.h;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((BarChart.BarItem) it2.next()).index == i) {
                return true;
            }
        }
        return false;
    }

    public Animator animRefresh(long j, float f, float f2) {
        this.q = f;
        this.r = -1.0f;
        this.s = f2;
        this.t = -1.0f;
        return super.animRefresh(j);
    }

    public Animator animRefreshTo(long j, float f, float f2) {
        this.q = -1.0f;
        this.r = f;
        this.s = -1.0f;
        this.t = f2;
        return super.animRefresh(j);
    }

    public void clearData() {
        List<StatisticChart.StatisticBarItem> list = this.i;
        if (list != null) {
            list.clear();
        }
        List<StatisticChart.StatisticBarItem> list2 = this.g;
        if (list2 != null) {
            list2.clear();
        }
        List<StatisticChart.StatisticHRItem> list3 = this.j;
        if (list3 != null) {
            list3.clear();
        }
        List<StatisticChart.StatisticBarItem> list4 = this.h;
        if (list4 != null) {
            list4.clear();
        }
        List<StatisticChart.StatisticBarItem> list5 = this.k;
        if (list5 != null) {
            list5.clear();
        }
        this.l.clear();
        y();
        this.mLoader.clearData();
        this.n.clear();
        ((StatisticChart) this.mChart).clearData();
        ((StatisticChart) this.mChart).notifyChanged();
    }

    public BarChart.BarItem getBarItem(int i, int i2) {
        List<BarChart.BarItem> list;
        if (i == 1) {
            list = this.g;
        } else if (i == 16) {
            list = this.i;
        } else if (i == 256) {
            list = this.j;
        } else if (i != 1048576) {
            list = i != 268435456 ? null : this.k;
        } else {
            list = this.h;
        }
        for (BarChart.BarItem barItem : list) {
            if (barItem.index == i2) {
                return barItem;
            }
        }
        return null;
    }

    public float getBarItemWidth() {
        return ((StatisticChart) this.mChart).getBarItemWidth();
    }

    public void loadStatisticData(int i, boolean z) {
        int i2;
        this.m = i;
        this.p = true;
        int barItemCount = ((((StatisticChart) this.mChart).getBarItemCount() + 1) / 2) - 1;
        int barItemCount2 = ((StatisticChart) this.mChart).getBarItemCount();
        if (this.u == 256) {
            i2 = -3;
            barItemCount2 += 2;
        } else {
            i2 = -1;
        }
        while (i2 <= barItemCount2) {
            int i3 = (i - i2) + barItemCount;
            if (!this.n.contains(Integer.valueOf(i3)) && this.o.hasData(i3)) {
                this.n.add(Integer.valueOf(i3));
            }
            i2++;
        }
        if (this.n.size() > 0) {
            Iterator<Integer> it2 = this.n.iterator();
            while (it2.hasNext()) {
                this.mLoader.loadItemData(it2.next().intValue(), z);
            }
        }
    }

    public void offsetTo(int i) {
        ((StatisticChart) this.mChart).offsetTo(-i);
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView, android.view.View
    public void onDraw(Canvas canvas) {
        T t = this.mChart;
        if (t != 0) {
            ((StatisticChart) t).draw(canvas, this.mAnimFactor, this.q, this.r, this.s, this.t, this.mNotDrawBars);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollable) {
            return false;
        }
        if (getParent() != null && !this.w) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && !this.mIsScrollingPerformed) {
            this.mScroller.scrollX(((StatisticChart) this.mChart).offsetScrolled(motionEvent.getX()));
        }
        return this.mScroller.onTouchEvent(motionEvent);
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public void refresh() {
        this.q = -1.0f;
        this.r = -1.0f;
        this.s = -1.0f;
        this.t = -1.0f;
        super.refresh();
    }

    public void resetAnim() {
        this.q = -1.0f;
        this.r = -1.0f;
        this.s = -1.0f;
        this.t = -1.0f;
    }

    public void scrollTo(int i) {
        int i2 = -((int) (((StatisticChart) this.mChart).getBarItemWidth() * i));
        if (this.v == 1) {
            i2 = -i2;
        }
        this.mScroller.scrollX(i2);
    }

    public void scrollToNext() {
        int i = -((int) ((StatisticChart) this.mChart).getBarItemWidth());
        if (this.v == 1) {
            i = -i;
        }
        this.mScroller.scrollX(i);
    }

    public void scrollToPrev() {
        int barItemWidth = (int) ((StatisticChart) this.mChart).getBarItemWidth();
        if (this.v == 1) {
            barItemWidth = -barItemWidth;
        }
        this.mScroller.scrollX(barItemWidth);
    }

    public void setCalGoal(int i, boolean z) {
        ((StatisticChart) this.mChart).setCalorieGoal(i, z);
    }

    public void setChartAttr(StatisticChart.StatisticChartAttr statisticChartAttr) {
        this.u = statisticChartAttr.mode;
        this.mChart = new StatisticChart(getContext(), statisticChartAttr);
        int i = this.u;
        if (i == 1) {
            this.b = new ColorRenderer(0);
            this.g = new ArrayList();
            return;
        }
        if (i == 16) {
            this.d = new ColorRenderer(0);
            this.i = new ArrayList();
            return;
        }
        if (i == 256) {
            this.e = new ColorRenderer(0);
            this.j = new ArrayList();
        } else if (i == 1048576) {
            this.c = new ColorRenderer(0);
            this.h = new ArrayList();
        } else {
            if (i != 268435456) {
                return;
            }
            this.f = new ColorRenderer(0);
            this.k = new ArrayList();
        }
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public void setDataLoader(ChartDataLoader chartDataLoader) {
        this.o = chartDataLoader.getLoadCallback();
        this.mLoader = chartDataLoader;
        chartDataLoader.setLoadCallback(new a());
        ((StatisticChart) this.mChart).setLoadCallback(new b());
    }

    public void setHRBase(int i) {
        ((StatisticChart) this.mChart).setHRBase(i);
    }

    public void setHRGoal(int i) {
        ((StatisticChart) this.mChart).setHRGoal(i);
    }

    public void setInterceptable(boolean z) {
        this.w = z;
    }

    public void setLayoutType(int i) {
        this.v = i;
        ((StatisticChart) this.mChart).setLayoutType(i);
    }

    public void setShowGoalLine(boolean z) {
        ((StatisticChart) this.mChart).setShowGoalLine(z);
    }

    public void setStepGoal(int i, boolean z) {
        ((StatisticChart) this.mChart).setStepGoal(i, z);
    }

    public void updateBarItemCount(int i) {
        ((StatisticChart) this.mChart).updateBarItemCount(i);
    }

    public StatisticChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatisticChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = false;
        this.x = new c();
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        this.l = new ArrayList();
        this.mScroller = new ChartScroller(getContext(), this.x);
        this.n = new ArrayList<>();
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public Animator animRefresh() {
        this.q = -1.0f;
        this.r = -1.0f;
        this.s = -1.0f;
        this.t = -1.0f;
        return super.animRefresh();
    }

    public Animator animRefreshTo(float f, float f2) {
        this.q = -1.0f;
        this.r = f;
        this.s = -1.0f;
        this.t = f2;
        return super.animRefresh();
    }
}
