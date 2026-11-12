package com.huami.watch.dataflow.chart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.huami.watch.dataflow.chart.base.BarChart;
import com.huami.watch.dataflow.chart.base.BaseChartView;
import com.huami.watch.dataflow.chart.base.ChartScroller;
import com.huami.watch.dataflow.chart.base.ColorRenderer;
import com.huami.watch.dataflow.chart.base.Renderer;
import com.huami.watch.dataflow.chart.data.ChartDataLoader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DynamicDetailChartView extends BaseChartView<DynamicDetailChart> {
    private static final String w = "Chart.DynamicDetailChartView";
    private static final long x = 300;
    private static final long y = 20;
    private final Vibrator b;
    private Renderer c;
    private Renderer d;
    private Renderer e;
    private Renderer f;
    private Renderer g;
    private Renderer h;
    private Renderer i;
    private Renderer j;
    private int k;
    private ArrayList<Integer> l;
    private int m;
    private DynamicDetailChartLoadCallback n;
    private boolean o;
    private float p;
    private float q;
    private Runnable r;
    private boolean s;
    private int t;
    private boolean u;
    private ChartScroller.ScrollingListener v;

    public static class CalorieDetailItem {
        public int cal;
        public int index;
    }

    public static class DynamicDetailChartData extends ChartDataLoader.ItemData {
        public List<CalorieDetailItem> calData;
        public List<FullDayHRDetailItem> heartRateData;
        public List<LineDetailItem> lineChartData;
        public List<SleepDetailItem> sleepData;
        public List<SportDetailItem> sportData;
        public List<StepDetailItem> stepData;
        public List<TargetDetailItem> targetData;
        public String date = "";
        public String prevDate = "";
    }

    public interface DynamicDetailChartLoadCallback extends ChartDataLoader.LoadCallback {
        void onTouchEnd();

        void onTouchItem(int i, BarChart.BarItem barItem, int i2, float f, float f2);

        void onTouchNothing(float f, float f2);
    }

    public static class FullDayHRDetailItem {
        public int heartRate;
        public int index;
        public int mode;
    }

    public static class LineDetailItem {
        public int index;
        public int value;
    }

    public static class SleepDetailItem {
        public static final int MODE_SLEEP_ACTIVE = 1;
        public static final int MODE_SLEEP_DEEP = 3;
        public static final int MODE_SLEEP_SHALLOW = 2;
        public static final int MODE_SLEEP_USER = 4;
        public int index;
        public int length;
        public int mode;
    }

    public static class SleepDetailItemComparator implements Comparator<SleepDetailItem> {
        @Override // java.util.Comparator
        public int compare(SleepDetailItem sleepDetailItem, SleepDetailItem sleepDetailItem2) {
            return sleepDetailItem.index - sleepDetailItem2.index;
        }
    }

    public static class SportDetailItem {
        public int index;
        public int time;
        public float value;
    }

    public static class StepDetailItem {
        public int index;
        public int step;
    }

    public static class TargetDetailItem {
        public int index;
        public int taget;
        public int value;
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            if (DynamicDetailChartView.this.mChart == null || !((DynamicDetailChart) DynamicDetailChartView.this.mChart).isDataAllZeroFlag()) {
                DynamicDetailChartView.this.s = true;
                DynamicDetailChartView dynamicDetailChartView = DynamicDetailChartView.this;
                if (!dynamicDetailChartView.onTouch(dynamicDetailChartView.p, DynamicDetailChartView.this.q)) {
                    DynamicDetailChartView.this.n.onTouchNothing(DynamicDetailChartView.this.p, DynamicDetailChartView.this.q);
                }
                DynamicDetailChartView.this.b.vibrate(20L);
                if (DynamicDetailChartView.this.getParent() != null) {
                    DynamicDetailChartView.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        }
    }

    public class b implements ChartDataLoader.LoadCallback {
        public b() {
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return DynamicDetailChartView.this.n.hasData(i);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i, boolean z) {
            return DynamicDetailChartView.this.n.loadData(i, z);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
            if (itemData == null) {
                return;
            }
            DynamicDetailChartData dynamicDetailChartData = (DynamicDetailChartData) itemData;
            DynamicDetailChartView.this.l.remove(Integer.valueOf(itemData.index));
            if (DynamicDetailChartView.this.l.isEmpty()) {
                onToItem(DynamicDetailChartView.this.k);
                DynamicDetailChartView.this.p(dynamicDetailChartData);
                DynamicDetailChartView.this.notifyChanged();
                DynamicDetailChartView.this.n.onDataLoaded(itemData, false);
            }
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            DynamicDetailChartView.this.n.onToItem(i);
        }
    }

    public class c implements ChartDataLoader.LoadCallback {
        public c() {
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public boolean hasData(int i) {
            return DynamicDetailChartView.this.n.hasData(i);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public ChartDataLoader.ItemData loadData(int i, boolean z) {
            return DynamicDetailChartView.this.loadDynamicData(i);
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onDataLoaded(ChartDataLoader.ItemData itemData, boolean z) {
        }

        @Override // com.huami.watch.dataflow.chart.data.ChartDataLoader.LoadCallback
        public void onToItem(int i) {
            DynamicDetailChartView.this.n.onToItem(i);
        }
    }

    public class d implements ChartScroller.ScrollingListener {
        public d() {
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onFinish() {
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onJustify() {
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public boolean onScrollX(int i) {
            return false;
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        @SuppressLint({"NewApi"})
        public boolean onScrollY(int i) {
            int scroll = (int) ((DynamicDetailChart) DynamicDetailChartView.this.mChart).getScroll();
            int edgeLength = (int) ((DynamicDetailChart) DynamicDetailChartView.this.mChart).getEdgeLength();
            if ((scroll == 0 && i > 0) || (scroll == edgeLength && i < 0)) {
                return false;
            }
            ((DynamicDetailChart) DynamicDetailChartView.this.mChart).scroll(i);
            DynamicDetailChartView.this.postInvalidateOnAnimation();
            return true;
        }

        @Override // com.huami.watch.dataflow.chart.base.ChartScroller.ScrollingListener
        public void onStart() {
        }
    }

    public DynamicDetailChartView(Context context) {
        this(context, null);
    }

    private void o(List<CalorieDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList<DynamicDetailChart.DynamicDetailBarItem> arrayList = new ArrayList<>();
        for (CalorieDetailItem calorieDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.index = calorieDetailItem.index;
            dynamicDetailBarItem.scope = 1;
            dynamicDetailBarItem.value = calorieDetailItem.cal;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addCalorieData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(DynamicDetailChartData dynamicDetailChartData) {
        ((DynamicDetailChart) this.mChart).setDataAllZeroFlag(dynamicDetailChartData.isAllZeroData);
        int i = this.m;
        if (i == 1) {
            bindStepData(dynamicDetailChartData.stepData);
            return;
        }
        if (i == 16) {
            bindSleepData(dynamicDetailChartData.sleepData);
            return;
        }
        if (i == 256) {
            bindLineChartData(dynamicDetailChartData.lineChartData);
            return;
        }
        if (i == 4096) {
            bindHRData(dynamicDetailChartData.heartRateData);
            return;
        }
        if (i == 65536) {
            bindSportData(dynamicDetailChartData.sportData);
        } else if (i == 1048576) {
            o(dynamicDetailChartData.calData);
        } else {
            if (i != 2097152) {
                return;
            }
            q(dynamicDetailChartData.targetData);
        }
    }

    private void q(List<TargetDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList<DynamicDetailChart.DynamicDetailBarItem> arrayList = new ArrayList<>();
        for (TargetDetailItem targetDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.index = targetDetailItem.index;
            dynamicDetailBarItem.scope = 1;
            dynamicDetailBarItem.value = targetDetailItem.value;
            dynamicDetailBarItem.target = targetDetailItem.taget;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addTargetData(arrayList);
    }

    private int r(int i, int i2, List<BarChart.BarItem> list) {
        int i3 = -1;
        if (i == -1) {
            return i2;
        }
        int size = list.size();
        if (i <= i2) {
            while (i <= i2) {
                if (i >= 0 && i < size && list.get(i).value > 0) {
                    i3 = i;
                }
                i++;
            }
        } else {
            while (i >= i2) {
                if (i >= 0 && i < size && list.get(i).value > 0) {
                    i3 = i;
                }
                i--;
            }
        }
        return i3;
    }

    private void s() {
        if (this.m != 16) {
            return;
        }
        this.c = new ColorRenderer(-9545497);
        this.d = new ColorRenderer(-8876545);
        this.e = new ColorRenderer(-16787);
        this.f = new ColorRenderer(-3550721);
        this.g = new ColorRenderer(-4805645);
        this.h = new ColorRenderer(-4536833);
        this.i = new ColorRenderer(-16682);
        this.j = new ColorRenderer(-16682);
    }

    private boolean t() {
        int i = this.m;
        return i == 16 || i == 4096 || i == 1 || i == 65536 || i == 1048576;
    }

    public void bindHRData(List<FullDayHRDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FullDayHRDetailItem fullDayHRDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.index = fullDayHRDetailItem.index;
            dynamicDetailBarItem.value = fullDayHRDetailItem.heartRate;
            dynamicDetailBarItem.mode = fullDayHRDetailItem.mode;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addHRData(arrayList);
    }

    public void bindLineChartData(List<LineDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (LineDetailItem lineDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.value = lineDetailItem.value;
            dynamicDetailBarItem.index = lineDetailItem.index;
            dynamicDetailBarItem.scope = 1;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addLineChartData(arrayList);
    }

    public void bindSleepData(List<SleepDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepDetailItem sleepDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.index = sleepDetailItem.index;
            dynamicDetailBarItem.scope = sleepDetailItem.length;
            int i = sleepDetailItem.mode;
            dynamicDetailBarItem.value = i;
            if (i == 1) {
                dynamicDetailBarItem.setRenderer(this.e);
            } else if (i == 2) {
                dynamicDetailBarItem.setRenderer(this.d);
            } else if (i == 3) {
                dynamicDetailBarItem.setRenderer(this.c);
            } else if (i == 4) {
                dynamicDetailBarItem.setRenderer(this.f);
            }
            arrayList.add(dynamicDetailBarItem);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((DynamicDetailChart) this.mChart).getSleepChart().getItems());
        arrayList2.addAll(arrayList);
        ((DynamicDetailChart) this.mChart).fillSleepData(arrayList2);
    }

    public void bindSportData(List<SportDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SportDetailItem sportDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.index = sportDetailItem.index;
            dynamicDetailBarItem.scope = sportDetailItem.time;
            dynamicDetailBarItem.sportValue = sportDetailItem.value;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addSportData(arrayList);
    }

    public void bindStepData(List<StepDetailItem> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StepDetailItem stepDetailItem : list) {
            DynamicDetailChart.DynamicDetailBarItem dynamicDetailBarItem = new DynamicDetailChart.DynamicDetailBarItem(getContext());
            dynamicDetailBarItem.value = stepDetailItem.step;
            dynamicDetailBarItem.index = stepDetailItem.index;
            dynamicDetailBarItem.scope = 1;
            arrayList.add(dynamicDetailBarItem);
        }
        ((DynamicDetailChart) this.mChart).addStepData(arrayList);
    }

    public void changeMode(int i) {
        this.m = i;
        ((DynamicDetailChart) this.mChart).setMode(i);
        ((DynamicDetailChart) this.mChart).initChart(getContext());
        RectF rect = ((DynamicDetailChart) this.mChart).getRect();
        if (rect != null) {
            ((DynamicDetailChart) this.mChart).onRectChanged(rect);
        }
    }

    public void clearData() {
        this.l.clear();
        this.mLoader.clearData();
        int i = this.m;
        if (i == 1) {
            ((DynamicDetailChart) this.mChart).clearStepData();
            return;
        }
        if (i == 16) {
            ((DynamicDetailChart) this.mChart).clearSleepData();
            return;
        }
        if (i == 256) {
            ((DynamicDetailChart) this.mChart).clearLineChartData();
            return;
        }
        if (i == 4096) {
            ((DynamicDetailChart) this.mChart).clearHRData();
            return;
        }
        if (i == 65536) {
            ((DynamicDetailChart) this.mChart).clearSportData();
        } else if (i == 1048576) {
            ((DynamicDetailChart) this.mChart).clearCalorieData();
        } else {
            if (i != 2097152) {
                return;
            }
            ((DynamicDetailChart) this.mChart).clearTargetData();
        }
    }

    public DynamicDetailChart.SportChartAttr getSecondSportChartAttr() {
        return ((DynamicDetailChart) this.mChart).getSecondSportChartAttr();
    }

    public DynamicDetailChart.SportChartAttr getSportChartAttr() {
        return ((DynamicDetailChart) this.mChart).getSportChartAttr();
    }

    public void initMode(int i, int i2) {
        this.m = i;
        if (t() && !this.u) {
            this.r = new a();
        }
        DynamicDetailChart dynamicDetailChart = new DynamicDetailChart(getContext(), this.m, i2);
        this.mChart = dynamicDetailChart;
        dynamicDetailChart.setIsPreview(this.u);
        ((DynamicDetailChart) this.mChart).initChart(getContext());
        ((DynamicDetailChart) this.mChart).setContainer(this);
        s();
    }

    public void initSportChart(DynamicDetailChart.SportChartAttr sportChartAttr) {
        initMode(65536, 1);
        DynamicDetailChart dynamicDetailChart = new DynamicDetailChart(getContext(), sportChartAttr);
        this.mChart = dynamicDetailChart;
        dynamicDetailChart.setContainer(this);
    }

    public ChartDataLoader.ItemData loadDynamicData(int i) {
        return loadDynamicData(i, null);
    }

    public void notifyChanged() {
        ((DynamicDetailChart) this.mChart).notifyChanged();
    }

    public boolean onTouch(float f, float f2) {
        BarChart.BarItem barItem;
        BarChart.BarItem secondChartItem;
        BarChart.BarItem barItem2;
        BarChart.BarItem barItem3;
        T t = this.mChart;
        boolean z = false;
        if (t != 0 && ((DynamicDetailChart) t).isDataAllZeroFlag()) {
            return false;
        }
        int i = this.m;
        if (i == 16) {
            for (BarChart.BarItem barItem4 : ((DynamicDetailChart) this.mChart).getSleepChart().getItems()) {
                int i2 = barItem4.value;
                if (i2 == 1) {
                    barItem4.setRenderer(this.e);
                } else if (i2 == 2) {
                    barItem4.setRenderer(this.d);
                } else if (i2 == 3) {
                    barItem4.setRenderer(this.c);
                } else if (i2 == 4) {
                    barItem4.setRenderer(this.f);
                }
                RectF rect = barItem4.getRect();
                if (f >= rect.left && f <= rect.right) {
                    int i3 = barItem4.value;
                    if (i3 == 1) {
                        barItem4.setRenderer(this.i);
                    } else if (i3 == 2) {
                        barItem4.setRenderer(this.h);
                    } else if (i3 == 3) {
                        barItem4.setRenderer(this.g);
                    } else if (i3 == 4) {
                        barItem4.setRenderer(this.j);
                    }
                    this.n.onTouchItem(barItem4.index, barItem4, barItem4.index + ((int) (((f - rect.left) / rect.width()) * barItem4.scope)), f, f2);
                    z = true;
                }
            }
            refresh();
        } else if (i == 1) {
            List<BarChart.BarItem> items = ((DynamicDetailChart) this.mChart).getStepChart().getItems();
            int iR = r(this.t, ((DynamicDetailChart.DynamicStepBarChart) ((DynamicDetailChart) this.mChart).getStepChart()).calcIndex(f), items);
            this.t = iR;
            ((DynamicDetailChart) this.mChart).setSelectedIndex(iR);
            int i4 = this.t;
            if (i4 >= 0 && i4 < items.size() && (barItem3 = items.get(this.t)) != null && barItem3.value > 0) {
                DynamicDetailChartLoadCallback dynamicDetailChartLoadCallback = this.n;
                int i5 = barItem3.index;
                dynamicDetailChartLoadCallback.onTouchItem(i5, barItem3, i5, f, f2);
                z = true;
            }
            refresh();
        } else if (i == 4096) {
            List<BarChart.BarItem> items2 = ((DynamicDetailChart) this.mChart).getHRChart().getItems();
            int iR2 = r(this.t, ((DynamicDetailChart.DynamicHRBarChart) ((DynamicDetailChart) this.mChart).getHRChart()).calcIndex(f), items2);
            this.t = iR2;
            ((DynamicDetailChart) this.mChart).setSelectedIndex(iR2);
            int i6 = this.t;
            if (i6 >= 0 && i6 < items2.size() && (barItem2 = items2.get(this.t)) != null && barItem2.value > 0) {
                DynamicDetailChartLoadCallback dynamicDetailChartLoadCallback2 = this.n;
                int i7 = barItem2.index;
                dynamicDetailChartLoadCallback2.onTouchItem(i7, barItem2, i7, f, f2);
                z = true;
            }
            refresh();
        } else if (i == 65536) {
            DynamicDetailChart.DynamicSportBarChart dynamicSportBarChart = (DynamicDetailChart.DynamicSportBarChart) ((DynamicDetailChart) this.mChart).getSportChart();
            List<BarChart.BarItem> items3 = dynamicSportBarChart.getItems();
            int iCalcIndex = dynamicSportBarChart.calcIndex(f);
            int iCalcSecondChartIndex = dynamicSportBarChart.calcSecondChartIndex(f);
            ((DynamicDetailChart) this.mChart).setSelectedIndex(iCalcIndex);
            dynamicSportBarChart.setSecondChartSelectedIndex(iCalcSecondChartIndex);
            if (iCalcIndex >= 0 && iCalcIndex < items3.size()) {
                BarChart.BarItem barItem5 = items3.get(iCalcIndex);
                if (barItem5 != null) {
                    DynamicDetailChartLoadCallback dynamicDetailChartLoadCallback3 = this.n;
                    int i8 = barItem5.index;
                    dynamicDetailChartLoadCallback3.onTouchItem(i8, barItem5, i8, f, dynamicSportBarChart.getSecondChartValue(iCalcSecondChartIndex));
                    z = true;
                }
            } else if (iCalcSecondChartIndex >= 0 && (secondChartItem = dynamicSportBarChart.getSecondChartItem(iCalcSecondChartIndex)) != null) {
                this.n.onTouchItem(-1, null, secondChartItem.scope, f, secondChartItem.sportValue);
                z = true;
            }
            refresh();
        } else if (i == 1048576) {
            List<BarChart.BarItem> items4 = ((DynamicDetailChart) this.mChart).getCalChart().getItems();
            int iR3 = r(this.t, ((DynamicDetailChart.DynamicCalorieBarChart) ((DynamicDetailChart) this.mChart).getCalChart()).calcIndex(f), items4);
            this.t = iR3;
            ((DynamicDetailChart) this.mChart).setSelectedIndex(iR3);
            int i9 = this.t;
            if (i9 >= 0 && i9 < items4.size() && (barItem = items4.get(this.t)) != null && barItem.value > 0) {
                DynamicDetailChartLoadCallback dynamicDetailChartLoadCallback4 = this.n;
                int i10 = barItem.index;
                dynamicDetailChartLoadCallback4.onTouchItem(i10, barItem, i10, f, f2);
                z = true;
            }
            refresh();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.u || !this.mScrollable) {
            return false;
        }
        if (this.o && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (t()) {
                    removeCallbacks(this.r);
                    this.s = false;
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                this.t = -1;
                onTouch(-1.0f, -1.0f);
                this.n.onTouchEnd();
            } else if (action != 2) {
                if (action == 3) {
                    if (t()) {
                        removeCallbacks(this.r);
                        this.s = false;
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    this.t = -1;
                    onTouch(-1.0f, -1.0f);
                    this.n.onTouchEnd();
                }
            } else if (t()) {
                if (this.s && !onTouch(x2, y2)) {
                    this.n.onTouchNothing(x2, y2);
                }
            } else if (!onTouch(x2, y2)) {
                this.n.onTouchNothing(x2, y2);
            }
        } else if (t()) {
            this.p = x2;
            this.q = y2;
            postDelayed(this.r, 300L);
        } else if (t()) {
            if (this.s) {
                this.n.onTouchNothing(x2, y2);
            }
        } else if (!onTouch(x2, y2)) {
            this.n.onTouchNothing(x2, y2);
        }
        return true;
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public void refresh() {
        if (animRefresh().isStarted()) {
            return;
        }
        super.refresh();
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public void setDataLoader(ChartDataLoader chartDataLoader) {
        this.mLoader = chartDataLoader;
        this.n = (DynamicDetailChartLoadCallback) chartDataLoader.getLoadCallback();
        this.mLoader.setLoadCallback(new b());
        ((DynamicDetailChart) this.mChart).setLoadCallback(new c());
    }

    public void setDisallowParentInterceptTouchEvent(boolean z) {
        this.o = z;
    }

    public void setHREmptyText(String str) {
        ((DynamicDetailChart) this.mChart).setHREmptyText(str);
    }

    public void setIsPreview(boolean z) {
        this.u = z;
    }

    public void setLineChartAttr(DynamicDetailChart.LineChartAttr lineChartAttr) {
        ((DynamicDetailChart) this.mChart).setLineChartAttr(lineChartAttr);
    }

    public void setOffset(int i) {
        ((DynamicDetailChart) this.mChart).setOffset(i);
    }

    public void setSecondSportChartAttr(DynamicDetailChart.SportChartAttr sportChartAttr) {
        ((DynamicDetailChart) this.mChart).setSecondSportChartAttr(sportChartAttr);
    }

    public void setSecondSportChartData(List<DynamicDetailChart.DynamicDetailBarItem> list) {
        ((DynamicDetailChart) this.mChart).setSecondSportChartData(list);
    }

    public void setSleepChartAttr(DynamicDetailChart.SleepChartAttr sleepChartAttr) {
        ((DynamicDetailChart) this.mChart).setSleepChartAttr(sleepChartAttr);
    }

    public void setSleepEmptyText(String str) {
        ((DynamicDetailChart) this.mChart).setSleepEmptyText(str);
    }

    public void setStartEndTimeIndex(int i, int i2) {
        ((DynamicDetailChart) this.mChart).setStartEndTimeIndex(i, i2);
    }

    public void setStepEmptyText(String str) {
        ((DynamicDetailChart) this.mChart).setStepEmptyText(str);
    }

    public void setTargetChartAttr(DynamicDetailChart.TargetChartAttr targetChartAttr) {
        ((DynamicDetailChart) this.mChart).setTargetChartAttr(targetChartAttr);
    }

    public DynamicDetailChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChartDataLoader.ItemData loadDynamicData(int i, int... iArr) {
        this.k = i;
        ChartDataLoader.ItemData itemData = this.mLoader.getItemData(i);
        if (itemData == null && this.mLoader.hasItemData(i)) {
            this.l.add(Integer.valueOf(i));
        }
        if (iArr != null) {
            for (int i2 : iArr) {
                if (this.mLoader.getItemData(i2) == null && this.mLoader.hasItemData(i2)) {
                    this.l.add(Integer.valueOf(i2));
                }
            }
        }
        Iterator<Integer> it2 = this.l.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            this.mLoader.putItemData(iIntValue, new DynamicDetailChartData());
            this.mLoader.loadItemData(iIntValue, false);
        }
        return itemData;
    }

    public DynamicDetailChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = true;
        this.s = false;
        this.t = -1;
        this.u = false;
        this.v = new d();
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        this.l = new ArrayList<>();
        this.b = (Vibrator) context.getSystemService("vibrator");
    }

    @Override // com.huami.watch.dataflow.chart.base.BaseChartView
    public void refresh(boolean z) {
        super.refresh(z);
    }
}
