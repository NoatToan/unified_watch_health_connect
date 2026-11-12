package com.huawei.ui.main.stories.fitness.views.base.chart;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.MarkDateTrigger;
import com.huawei.ui.commonui.chartanimation.TweenAnimatiionMgr;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.util.chart.StepModuleBarChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import defpackage.qmj;
import defpackage.qnh;
import defpackage.qnn;
import health.compact.a.ReleaseLogUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ObserveredClassifiedView extends LinearLayout implements ClassifiedViewList.ClassifiedView, HighlightedEntryParser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String JUMP_DATA_LAYER_ID = "dataLayerid";
    public static final String JUMP_DATA_TYPE = "chartDataType";
    public static final String JUMP_TIME_ID = "timeid";
    private static final String TAG = "Health_ObserveredClassifiedView";
    private String dataLayerId;
    private IChartLayerHolder mChartLayerHolder;
    private DataLayerType mDataLayerType;
    private HighlightedEntryParser mHighlightedEntryParser;
    private View.OnClickListener mHorizontalJumpListener;
    private JumpTableChart mJumpTableChart;
    private LinearLayout mJumpTableChartContainer;
    private LinearLayout mObserverContainer;
    private IOnDataShowListener mOnDataShowListener;
    private ScrollChartObserverView mScrollChartObserverView;
    private IScrollChartOuterObserver mScrollChartOuterObserver;
    private DataInfos mStepDataType;
    private TweenAnimatiionMgr mTweenAnimatiionMgr;

    protected abstract JumpTableChart constructJumpTableChart();

    public abstract String convertFloat2TextShow(float f);

    protected boolean isHorizontal() {
        return false;
    }

    public void setHighlightedEntryParser(HighlightedEntryParser highlightedEntryParser) {
        this.mHighlightedEntryParser = highlightedEntryParser;
    }

    public void setDataLayerType(DataLayerType dataLayerType) {
        this.mDataLayerType = dataLayerType;
    }

    public DataLayerType getDataLayerType() {
        return this.mDataLayerType;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null) {
            return "--";
        }
        HighlightedEntryParser highlightedEntryParser = this.mHighlightedEntryParser;
        if (highlightedEntryParser == null) {
            if (!(hwHealthBaseEntry instanceof HwHealthBarEntry)) {
                if (hwHealthBaseEntry.getY() == 0.0f) {
                    return "--";
                }
                return convertFloat2TextShow(hwHealthBaseEntry.getY());
            }
            float fD = qnn.d(((HwHealthBarEntry) hwHealthBaseEntry).acquireModel());
            if (fD == 0.0f) {
                return "--";
            }
            return convertFloat2TextShow(fD);
        }
        return highlightedEntryParser.parse(hwHealthBaseEntry);
    }

    public ObserveredClassifiedView(Context context) {
        super(context);
        this.mHighlightedEntryParser = null;
        this.mTweenAnimatiionMgr = null;
        this.dataLayerId = "default";
        this.mDataLayerType = DataLayerType.DURATION;
        this.mOnDataShowListener = null;
        initView();
    }

    public ObserveredClassifiedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHighlightedEntryParser = null;
        this.mTweenAnimatiionMgr = null;
        this.dataLayerId = "default";
        this.mDataLayerType = DataLayerType.DURATION;
        this.mOnDataShowListener = null;
        initView();
    }

    public ObserveredClassifiedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHighlightedEntryParser = null;
        this.mTweenAnimatiionMgr = null;
        this.dataLayerId = "default";
        this.mDataLayerType = DataLayerType.DURATION;
        this.mOnDataShowListener = null;
        initView();
    }

    public ObserveredClassifiedView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHighlightedEntryParser = null;
        this.mTweenAnimatiionMgr = null;
        this.dataLayerId = "default";
        this.mDataLayerType = DataLayerType.DURATION;
        this.mOnDataShowListener = null;
        initView();
    }

    public void setObserverContainerBackgroundColor(int i) {
        LinearLayout linearLayout = this.mObserverContainer;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundColor(i);
    }

    private void initView() {
        if (isHorizontal()) {
            inflate(getContext(), R.layout.horizontal_classified_view, this);
        } else {
            inflate(getContext(), R.layout.classified_view, this);
        }
        this.mJumpTableChartContainer = (LinearLayout) findViewById(R.id.jump_table_chart_container);
        JumpTableChart jumpTableChartConstructJumpTableChart = constructJumpTableChart();
        this.mJumpTableChart = jumpTableChartConstructJumpTableChart;
        this.mJumpTableChartContainer.addView(jumpTableChartConstructJumpTableChart, -1, -1);
        this.mJumpTableChart.setHost(this);
        this.mObserverContainer = (LinearLayout) findViewById(R.id.jump_table_chart_eye);
        final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        hwHealthBaseScrollBarLineChartAquireChart.addOnXRangeSet(new HwHealthBaseScrollBarLineChart.OnXRangeSet() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnXRangeSet
            public void onRangeShow(int i, int i2) {
                if (ObserveredClassifiedView.this.mScrollChartObserverView != null) {
                    ObserveredClassifiedView.this.mScrollChartObserverView.onRangeShow(hwHealthBaseScrollBarLineChartAquireChart, i, i2);
                }
                if (ObserveredClassifiedView.this.mScrollChartOuterObserver != null) {
                    ObserveredClassifiedView.this.mScrollChartOuterObserver.onRangeShow(hwHealthBaseScrollBarLineChartAquireChart, i, i2);
                }
                if (ObserveredClassifiedView.this.mOnDataShowListener != null) {
                    ObserveredClassifiedView.this.mOnDataShowListener.onDataShowChanged(ObserveredClassifiedView.this.getStepDataType(), i, i2, ObserveredClassifiedView.this.mJumpTableChart.aquireChart());
                }
            }
        });
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public void loadTweenAnimatiionMgr(TweenAnimatiionMgr tweenAnimatiionMgr) {
        this.mTweenAnimatiionMgr = tweenAnimatiionMgr;
        tweenAnimatiionMgr.b(TweenAnimatiionMgr.UserLevelView.query(getStepDataType()), this.mJumpTableChart.aquireChart());
        this.mJumpTableChart.setDataTextViewOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ObserveredClassifiedView.this.getStepDataType().isYearData()) {
                    if (ObserveredClassifiedView.this.mTweenAnimatiionMgr.b(TweenAnimatiionMgr.UserLevelView.CHART_MONTH)) {
                        ObserveredClassifiedView.this.mTweenAnimatiionMgr.a(TweenAnimatiionMgr.UserLevelView.CHART_MONTH);
                    }
                } else if (ObserveredClassifiedView.this.getStepDataType().isAllData()) {
                    if (ObserveredClassifiedView.this.mTweenAnimatiionMgr.b(TweenAnimatiionMgr.UserLevelView.CHART_YEAR)) {
                        ObserveredClassifiedView.this.mTweenAnimatiionMgr.a(TweenAnimatiionMgr.UserLevelView.CHART_YEAR);
                    }
                } else if (ObserveredClassifiedView.this.mTweenAnimatiionMgr.b(TweenAnimatiionMgr.UserLevelView.CHART_DAY)) {
                    ObserveredClassifiedView.this.mTweenAnimatiionMgr.a(TweenAnimatiionMgr.UserLevelView.CHART_DAY);
                }
            }
        });
    }

    public void onSelected() {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        hwHealthBaseScrollBarLineChartAquireChart.acquireScrollAdapter().setFlag(hwHealthBaseScrollBarLineChartAquireChart.acquireScrollAdapter().getFlag() | 1);
        hwHealthBaseScrollBarLineChartAquireChart.refresh();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public void init(IChartLayerHolder iChartLayerHolder) {
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(getStepDataType());
        cVar.e(acquireDataLayerIndex());
        addDataLayer(iChartLayerHolder, cVar);
        setDefaultTimeMillis(iChartLayerHolder);
        ScrollChartObserverView scrollChartObserverView = this.mScrollChartObserverView;
        if (scrollChartObserverView != null) {
            scrollChartObserverView.initChartLinkage();
        }
        IScrollChartOuterObserver iScrollChartOuterObserver = this.mScrollChartOuterObserver;
        if (iScrollChartOuterObserver != null) {
            iScrollChartOuterObserver.initChartLinkage();
        }
        if (isSupportHorizontalJump()) {
            this.mJumpTableChart.setHorizontalOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ObserveredClassifiedView.this.mHorizontalJumpListener != null) {
                        ObserveredClassifiedView.this.mHorizontalJumpListener.onClick(view);
                    }
                }
            });
            this.mJumpTableChart.openHorizontalJump();
        }
    }

    private void setDefaultTimeMillis(IChartLayerHolder iChartLayerHolder) {
        long jA;
        JumpTableChart jumpTableChart = this.mJumpTableChart;
        if (jumpTableChart == null) {
            ReleaseLogUtil.d(TAG, "setDefaultTimeMillis mJumpTableChart is null");
            return;
        }
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = jumpTableChart.aquireChart();
        if (hwHealthBaseScrollBarLineChartAquireChart == null) {
            ReleaseLogUtil.d(TAG, "setDefaultTimeMillis chart is null");
            return;
        }
        if (iChartLayerHolder instanceof StepModuleBarChartHolder) {
            jA = ((StepModuleBarChartHolder) iChartLayerHolder).a();
            LogUtil.a(TAG, "setDefaultTimeMillis defaultTimeMillis ", Long.valueOf(jA));
        } else {
            jA = 0;
        }
        if (jA <= 0) {
            return;
        }
        hwHealthBaseScrollBarLineChartAquireChart.setDefaultTimeMillis(jA);
        hwHealthBaseScrollBarLineChartAquireChart.reflesh(jA);
    }

    public void setHorizontalJumpListener(View.OnClickListener onClickListener) {
        this.mHorizontalJumpListener = onClickListener;
    }

    public HwHealthBaseScrollBarLineChart getChart() {
        JumpTableChart jumpTableChart = this.mJumpTableChart;
        if (jumpTableChart != null) {
            return jumpTableChart.aquireChart();
        }
        return null;
    }

    public void setJumpTableChartTimeId(int i) {
        JumpTableChart jumpTableChart = this.mJumpTableChart;
        if (jumpTableChart != null) {
            jumpTableChart.aquireChart().setShowRange(qnh.h(qnh.e(i)), this.mJumpTableChart.aquireChart().acquireScrollAdapter().acquireRange());
            if (i != ((int) TimeUnit.MILLISECONDS.toMinutes(qnh.e(System.currentTimeMillis())))) {
                this.mJumpTableChart.aquireChart().highlightDefValue(-1, false);
            }
        }
    }

    public void setJumpTableChartLastTimeId(int i) {
        JumpTableChart jumpTableChart = this.mJumpTableChart;
        if (jumpTableChart != null) {
            jumpTableChart.aquireChart().setShowRange(qnh.h(i), this.mJumpTableChart.aquireChart().acquireScrollAdapter().acquireRange());
        }
    }

    public void setMarkerTimeShowFlag(boolean z) {
        JumpTableChart jumpTableChart = this.mJumpTableChart;
        if (jumpTableChart != null) {
            jumpTableChart.setMarkerTimeShowFlag(z);
        }
    }

    public boolean isSupportHorizontalJump() {
        return (this.mStepDataType == null || isHorizontal() || !this.mStepDataType.isSupportHorzontal()) ? false : true;
    }

    public HwHealthBaseBarLineDataSet addDataLayer(IChartLayerHolder iChartLayerHolder, HwHealthChartHolder.c cVar) {
        this.mChartLayerHolder = iChartLayerHolder;
        return iChartLayerHolder.addDataLayer(this.mJumpTableChart.aquireChart(), cVar);
    }

    public HwHealthBaseBarLineDataSet addDataLayer(HwHealthChartHolder.c cVar) {
        return this.mChartLayerHolder.addDataLayer(this.mJumpTableChart.aquireChart(), cVar);
    }

    public void addDataLayer(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthChartHolder.c cVar) {
        this.mChartLayerHolder.addDataLayer(this.mJumpTableChart.aquireChart(), hwHealthBaseBarLineDataSet, cVar);
    }

    public void removeDataLayer(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        this.mChartLayerHolder.rmDataLayer(this.mJumpTableChart.aquireChart(), hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public DataInfos getStepDataType() {
        return this.mStepDataType;
    }

    public void setStepDatatype(DataInfos dataInfos) {
        this.mStepDataType = dataInfos;
        this.mJumpTableChart.customByDataType(dataInfos);
    }

    public void initCalendarView(Activity activity, HealthCalendar healthCalendar) {
        this.mJumpTableChart.initCalendarView(activity, healthCalendar);
    }

    public void initCalendarView(Activity activity, HealthCalendar healthCalendar, MarkDateTrigger markDateTrigger, boolean z) {
        this.mJumpTableChart.initCalendarView(activity, healthCalendar, markDateTrigger, z);
    }

    public void initLandscapeCalendarView(Activity activity, HealthCalendar healthCalendar) {
        this.mJumpTableChart.initLandscapeCalendarView(activity, healthCalendar);
    }

    public void initLandscapeCalendarView(Activity activity, HealthCalendar healthCalendar, MarkDateTrigger markDateTrigger, boolean z) {
        this.mJumpTableChart.initLandscapeCalendarView(activity, healthCalendar, markDateTrigger, z);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public String acquireDataLayerIndex() {
        return this.dataLayerId;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public void selectDataLayerId(String str) {
        this.dataLayerId = str;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public void setOnDataShowListener(IOnDataShowListener iOnDataShowListener) {
        this.mOnDataShowListener = iOnDataShowListener;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.ClassifiedView
    public void enableObserverView(ScrollChartObserverView scrollChartObserverView) {
        this.mScrollChartObserverView = scrollChartObserverView;
        this.mObserverContainer.setVisibility(0);
        this.mObserverContainer.removeAllViews();
        this.mObserverContainer.addView(scrollChartObserverView, -1, -2);
    }

    public void enableObserverView(IScrollChartOuterObserver iScrollChartOuterObserver) {
        this.mScrollChartOuterObserver = iScrollChartOuterObserver;
    }

    public ScrollChartObserverView acquireScrollChartObserverView() {
        return this.mScrollChartObserverView;
    }

    public void manageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        if (hwHealthBaseScrollBarLineChartAquireChart == null) {
            throw new RuntimeException("manageDataSetAsProxy chart null");
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = hwHealthBaseScrollBarLineChartAquireChart.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter == null) {
            throw new RuntimeException("manageDataSetAsProxy scrollAdapter null");
        }
        scrollAdapterInterfaceAcquireScrollAdapter.manageDataSetAsProxy(hwHealthBaseBarLineDataSet, iChartStorageHelper, dataInfos, cVar);
    }

    public void unManageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        if (hwHealthBaseScrollBarLineChartAquireChart == null) {
            throw new RuntimeException("unManageDataSetAsProxy chart null");
        }
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = hwHealthBaseScrollBarLineChartAquireChart.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter == null) {
            throw new RuntimeException("unManageDataSetAsProxy scrollAdapter null");
        }
        scrollAdapterInterfaceAcquireScrollAdapter.unmanageDataSetAsProxy(hwHealthBaseBarLineDataSet);
    }

    public HwHealthBaseBarLineDataSet fakeDataLayer(HwHealthChartHolder.c cVar) {
        return this.mChartLayerHolder.fakeDataLayer(cVar);
    }

    public IChartLayerHolder acquireChartLayerHolder() {
        return this.mChartLayerHolder;
    }

    public Bitmap drawChart() {
        return this.mJumpTableChart.drawChart();
    }

    public String acquireTimeRangeText() {
        return this.mJumpTableChart.acquireTimeRangeText();
    }

    public void enableManualReferenceLine(int i, int i2, boolean z) {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        hwHealthBaseScrollBarLineChartAquireChart.enableManualReferenceLine(i, i2, z);
        hwHealthBaseScrollBarLineChartAquireChart.reCalculateDynamicBoardForManualRefLine();
    }

    public void enableManualReferenceLine(int i, Paint paint, boolean z) {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        hwHealthBaseScrollBarLineChartAquireChart.enableManualReferenceLine(i, paint, z);
        hwHealthBaseScrollBarLineChartAquireChart.reCalculateDynamicBoardForManualRefLine();
    }

    public void disableManualReferenceLine() {
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChartAquireChart = this.mJumpTableChart.aquireChart();
        hwHealthBaseScrollBarLineChartAquireChart.disableManualReferenceLine();
        hwHealthBaseScrollBarLineChartAquireChart.reCalculateDynamicBoardForManualRefLine();
    }

    public void processCalendarSelect(HealthCalendar healthCalendar) {
        this.mJumpTableChart.onProcessCalendarSelect(healthCalendar);
    }

    public boolean isChartInNatureViewPosition() {
        return this.mJumpTableChart.aquireChart().isInPagerPosition();
    }

    public void focusArea(List<qmj> list) {
        this.mJumpTableChart.aquireChart().focusArea(list);
    }

    public void disableFocusArea() {
        this.mJumpTableChart.aquireChart().disableFocusArea();
    }

    public void openJumpableFeature(TweenAnimatiionMgr tweenAnimatiionMgr) {
        this.mJumpTableChart.aquireChart();
    }
}
