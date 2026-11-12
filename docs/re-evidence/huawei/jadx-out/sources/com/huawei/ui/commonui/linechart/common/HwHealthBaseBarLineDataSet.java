package com.huawei.ui.commonui.linechart.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBaseBarDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import defpackage.qmh;
import defpackage.qmk;
import defpackage.qnh;
import defpackage.qnn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthBaseBarLineDataSet<T extends HwHealthBaseEntry> extends BarLineScatterCandleBubbleDataSet<T> implements IHwHealthBarLineDataSet<T> {
    private static final long MINUTE_TO_MILLIS = 60000;
    public static final long RING_ANIMATION_CHECK_DELAY = 500;
    private static final String STEP_DAY_DATA = "stepDayData";
    private static final String TAG = "HwHealthBaseBarLineDataSet";
    private static final String TIME_STAMP_SHOW_END = "timeStampShowEnd";
    private static final String TIME_STAMP_SHOW_START = "timeStampShowStart";
    private a mDataStatus;
    private List<T> mEntryVals;
    private float[] mForcedLabels;
    private HwHealthYAxis.HwHealthAxisDependency mHwHealthAxisDependency;
    private boolean mIsDataCalculated;
    private boolean mIsForcedLabels;
    private boolean mIsMaxForcedX;
    private boolean mIsMinForcedX;
    protected boolean mIsNeedLoad;
    private int mLabelCount;
    private float mMaxForcedValueX;
    private float mMinForcedValueX;
    private HwHealthBaseScrollBarLineChart.OnDataFillCallback mOnDataFillCallback;
    private Map<Long, IStorageModel> mOriginalVals;

    public abstract IHwHealthDatasContainer cacheDataContainer(HwHealthBaseBarLineChart hwHealthBaseBarLineChart);

    protected abstract T constructEntry(float f, IStorageModel iStorageModel);

    protected abstract void flushCachedDataContainer();

    public HwHealthBaseBarLineDataSet(List<T> list, String str) {
        super(list, str);
        this.mIsNeedLoad = false;
        this.mEntryVals = new ArrayList();
        this.mIsForcedLabels = false;
        this.mLabelCount = 0;
        this.mIsMinForcedX = false;
        this.mIsMaxForcedX = false;
        this.mDataStatus = new a();
        this.mOriginalVals = new HashMap();
        this.mIsDataCalculated = false;
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23629b;
        private boolean e;

        private a() {
            this.e = false;
            this.f23629b = 0;
        }

        public int b() {
            int i;
            synchronized (this) {
                this.e = true;
                i = this.f23629b + 1;
                this.f23629b = i;
            }
            return i;
        }

        public boolean e(int i) {
            synchronized (this) {
                if (i != this.f23629b) {
                    return false;
                }
                this.e = false;
                return true;
            }
        }

        public boolean e() {
            boolean z;
            synchronized (this) {
                z = this.e;
            }
            return z;
        }
    }

    static class e implements ResponseCallback<Map<Long, IStorageModel>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<HwHealthBaseScrollBarLineChart> f23631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private qmk f23632c;
        private WeakReference<HwHealthBaseBarLineDataSet> d;
        private WeakReference<HwHealthBaseScrollBarLineChart.OnDataFillCallback> e;

        e(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, qmk qmkVar, int i, HwHealthBaseScrollBarLineChart.OnDataFillCallback onDataFillCallback) {
            this.d = new WeakReference<>(hwHealthBaseBarLineDataSet);
            this.f23631b = new WeakReference<>(hwHealthBaseScrollBarLineChart);
            this.f23632c = qmkVar;
            this.f23630a = i;
            this.e = new WeakReference<>(onDataFillCallback);
        }

        @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResult(int i, Map<Long, IStorageModel> map) {
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = this.d.get();
            if (hwHealthBaseBarLineDataSet == null) {
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("err_code", Integer.valueOf(i));
            map2.put(HwHealthBaseBarLineDataSet.STEP_DAY_DATA, map);
            map2.put("queryId", Integer.valueOf(this.f23630a));
            AsyncSelectorSerialize asyncSelectorSerialize = hwHealthBaseBarLineDataSet.getAsyncSelectorSerialize(this.e.get());
            asyncSelectorSerialize.add(hwHealthBaseBarLineDataSet.getAction(this.f23632c.b(), this.f23632c.e(), this.f23631b.get(), asyncSelectorSerialize));
            asyncSelectorSerialize.add(hwHealthBaseBarLineDataSet.getAction(this.f23631b.get(), hwHealthBaseBarLineDataSet.acquireEntryVals(), asyncSelectorSerialize));
            asyncSelectorSerialize.run(map2);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public boolean isQuerying() {
        return this.mDataStatus.e();
    }

    public void fillSetByDatabase(Context context, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, qmk qmkVar, HwHealthBaseScrollBarLineChart.OnDataFillCallback onDataFillCallback, IChartStorageHelper iChartStorageHelper) {
        DataInfos dataInfosA = qmkVar.a();
        int iF = qmkVar.f();
        int iC = qmkVar.c();
        if (dataInfosA == DataInfos.LactateThresholdYearDetail) {
            iF = qmkVar.b();
            iC = qmkVar.e();
        }
        if (dataInfosA.isMaintenancedBySportGroup() && dataInfosA.isDayData() && !qnh.s(((long) iF) * 60000)) {
            return;
        }
        int iB = this.mDataStatus.b();
        if (hwHealthBaseScrollBarLineChart != null) {
            hwHealthBaseScrollBarLineChart.acquireRingAnimationMgr().b(500L);
        }
        HwHealthChartHolder.c cVarD = qmkVar.d();
        this.mOnDataFillCallback = onDataFillCallback;
        iChartStorageHelper.queryStepDayData(context, ((long) iF) * 60000, ((long) iC) * 60000, dataInfosA, cVarD, new e(this, hwHealthBaseScrollBarLineChart, qmkVar, iB, onDataFillCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AsyncSelectorSerialize.BaseAction getAction(final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, final List<T> list, final AsyncSelectorSerialize asyncSelectorSerialize) {
        return new AsyncSelectorSerialize.BaseAction() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet.2
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.BaseAction, com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2 = hwHealthBaseScrollBarLineChart;
                    if (hwHealthBaseScrollBarLineChart2 != null) {
                        if (hwHealthBaseScrollBarLineChart2.getGlobalPointFlag()) {
                            if (qmh.e(BaseApplication.getContext())) {
                                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart3 = hwHealthBaseScrollBarLineChart;
                                hwHealthBaseScrollBarLineChart3.highlightValuePx(hwHealthBaseScrollBarLineChart3.acquireChartAnchor().f() + Utils.convertDpToPixel(26.0f), false);
                            } else {
                                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart4 = hwHealthBaseScrollBarLineChart;
                                hwHealthBaseScrollBarLineChart4.highlightValuePx(hwHealthBaseScrollBarLineChart4.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f), false);
                            }
                        } else if (hwHealthBaseScrollBarLineChart.isMarkViewCenteredWhenEmpty()) {
                            HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart5 = hwHealthBaseScrollBarLineChart;
                            hwHealthBaseScrollBarLineChart5.highlightValuePx((hwHealthBaseScrollBarLineChart5.getViewPortHandler().contentLeft() + hwHealthBaseScrollBarLineChart.getViewPortHandler().contentRight()) / 2.0f, false);
                        } else if (hwHealthBaseScrollBarLineChart.getMarkerViewPosition() == null) {
                            hwHealthBaseScrollBarLineChart.highlightValue(hwHealthBaseScrollBarLineChart.acquireHighLightTimeStamp(System.currentTimeMillis()), false);
                        }
                        hwHealthBaseScrollBarLineChart.refresh();
                    }
                    asyncSelectorSerialize.postError();
                    return;
                }
                if (!(map.get(HwHealthBaseBarLineDataSet.STEP_DAY_DATA) instanceof Map)) {
                    LogUtil.j(HwHealthBaseBarLineDataSet.TAG, "execute arg.get(STEP_DAY_DATA) not instanceof Map");
                    return;
                }
                if (!map.containsKey(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_START) || !map.containsKey(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_END)) {
                    LogUtil.j(HwHealthBaseBarLineDataSet.TAG, "execute arg doesn't contain timeStampShowStart or timeStampShowEnd");
                    return;
                }
                HwHealthBaseBarLineDataSet.this.fillMoreData(list, (Map) map.get(HwHealthBaseBarLineDataSet.STEP_DAY_DATA), ((Integer) map.get(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_START)).intValue(), ((Integer) map.get(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_END)).intValue(), hwHealthBaseScrollBarLineChart);
                asyncSelectorSerialize.next(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AsyncSelectorSerialize.Action getAction(final int i, final int i2, final HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, final AsyncSelectorSerialize asyncSelectorSerialize) {
        return new AsyncSelectorSerialize.Action() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet.1
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public int getFailedValue() {
                return 0;
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    asyncSelectorSerialize.next(null);
                    return;
                }
                int iIntValue = ((Integer) map.get("err_code")).intValue();
                if (HwHealthBaseBarLineDataSet.this.mDataStatus.e(((Integer) map.get("queryId")).intValue())) {
                    HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2 = hwHealthBaseScrollBarLineChart;
                    if (hwHealthBaseScrollBarLineChart2 != null) {
                        hwHealthBaseScrollBarLineChart2.acquireRingAnimationMgr().d();
                    }
                    Object obj = map.get(HwHealthBaseBarLineDataSet.STEP_DAY_DATA);
                    if (iIntValue != 0 || !(obj instanceof Map)) {
                        LogUtil.j(HwHealthBaseBarLineDataSet.TAG, "queryStepDayData failed");
                        asyncSelectorSerialize.next(null);
                        return;
                    }
                    HashMap map2 = new HashMap(3);
                    map2.put(HwHealthBaseBarLineDataSet.STEP_DAY_DATA, (Map) obj);
                    map2.put(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_START, Integer.valueOf(i));
                    map2.put(HwHealthBaseBarLineDataSet.TIME_STAMP_SHOW_END, Integer.valueOf(i2));
                    asyncSelectorSerialize.next(map2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AsyncSelectorSerialize getAsyncSelectorSerialize(final HwHealthBaseScrollBarLineChart.OnDataFillCallback onDataFillCallback) {
        return new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet.5
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onFailed(int i) {
                LogUtil.d(HwHealthBaseBarLineDataSet.TAG, "process fillBuffer end onFailed");
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                LogUtil.d(HwHealthBaseBarLineDataSet.TAG, "process fillBuffer end onSuccess");
                HwHealthBaseScrollBarLineChart.OnDataFillCallback onDataFillCallback2 = onDataFillCallback;
                if (onDataFillCallback2 != null) {
                    onDataFillCallback2.onResult();
                }
            }
        };
    }

    protected void fillMoreData(List<T> list, Map<Long, IStorageModel> map, int i, int i2, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        this.mOriginalVals.clear();
        this.mOriginalVals.putAll(map);
        ArrayList arrayList = new ArrayList();
        int i3 = C.RATE_UNSET_INT;
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            if (entry != null) {
                long jLongValue = entry.getKey().longValue();
                IStorageModel value = entry.getValue();
                int iAcquireRangeCenterValue = (int) (jLongValue / 60000);
                boolean z = this instanceof HwHealthBaseBarDataSet;
                if (z) {
                    iAcquireRangeCenterValue = ((HwHealthBaseBarDataSet) this).acquireRangeCenterValue(iAcquireRangeCenterValue);
                }
                arrayList.add(constructEntry(qnh.h(iAcquireRangeCenterValue), value));
                if (!z || qnn.d(value) != 0.0f || qnn.b(value) != 0.0f) {
                    if (iAcquireRangeCenterValue > i3 && iAcquireRangeCenterValue >= i && iAcquireRangeCenterValue <= i2) {
                        i3 = iAcquireRangeCenterValue;
                    }
                }
            }
        }
        Collections.sort(arrayList);
        list.clear();
        list.addAll(arrayList);
        this.mIsNeedLoad = true;
        moveMarkerViewPos(hwHealthBaseScrollBarLineChart, i3);
    }

    private void moveMarkerViewPos(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i) {
        if (hwHealthBaseScrollBarLineChart != null) {
            if (hwHealthBaseScrollBarLineChart.getGlobalPointFlag()) {
                if (qmh.e(BaseApplication.getContext())) {
                    hwHealthBaseScrollBarLineChart.highlightValuePx(hwHealthBaseScrollBarLineChart.acquireChartAnchor().f() + Utils.convertDpToPixel(26.0f), false);
                } else {
                    hwHealthBaseScrollBarLineChart.highlightValuePx(hwHealthBaseScrollBarLineChart.acquireChartAnchor().g() - Utils.convertDpToPixel(26.0f), false);
                }
            } else if (hwHealthBaseScrollBarLineChart.getMarkerViewPosition() != null) {
                hwHealthBaseScrollBarLineChart.highlightValue(hwHealthBaseScrollBarLineChart.getMarkerViewPosition().d, false);
            } else if (i != -2147483647 && (!hwHealthBaseScrollBarLineChart.containsMarkViewShow() || hwHealthBaseScrollBarLineChart.isMoveToLastDataStamp())) {
                hwHealthBaseScrollBarLineChart.highlightValue(qnh.h(i), false);
            } else if (i == -2147483647 && !hwHealthBaseScrollBarLineChart.containsMarkViewShow()) {
                hwHealthBaseScrollBarLineChart.highlightValuePx((hwHealthBaseScrollBarLineChart.getViewPortHandler().contentLeft() + hwHealthBaseScrollBarLineChart.getViewPortHandler().contentRight()) / 2.0f, false);
            }
            hwHealthBaseScrollBarLineChart.refresh();
            flushCachedDataContainer();
        }
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public Map<Long, IStorageModel> acquireOriginalVals() {
        return this.mOriginalVals;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public List<T> acquireEntryVals() {
        return this.mEntryVals;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeMaxValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireShowRangeValue(hwHealthBaseScrollBarLineChart, -3.4028235E38f, true);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeMinValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireShowRangeValue(hwHealthBaseScrollBarLineChart, Float.MAX_VALUE, false);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireOlderPagerMaxValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireOlderPagerValue(-3.4028235E38f, hwHealthBaseScrollBarLineChart, true);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireOlderPagerMinValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireOlderPagerValue(Float.MAX_VALUE, hwHealthBaseScrollBarLineChart, false);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireNewerPagerMaxValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireNewerPagerValue(hwHealthBaseScrollBarLineChart, -3.4028235E38f);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireRangePagerMaxValue(float f, float f2) {
        float y = -3.4028235E38f;
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= f && t.getX() <= f2 && t.getY() > y) {
                y = t.getY();
            }
        }
        return y;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireRangePagerMinValue(float f, float f2) {
        float y = Float.MAX_VALUE;
        for (T t : this.mEntryVals) {
            if (t != null && t.getX() >= f && t.getX() <= f2 && t.getY() < y) {
                y = t.getY();
            }
        }
        return y;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireNewerPagerMinValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        return acquireNewerPagerValue(hwHealthBaseScrollBarLineChart, Float.MAX_VALUE);
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float computeDynamicBorderMax(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f, float f2) {
        if (hwHealthBaseScrollBarLineChart != null) {
            return hwHealthBaseScrollBarLineChart.computeDynamicBorderMax(this, f, f2);
        }
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float computeDynamicBorderMin(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f, float f2) {
        if (hwHealthBaseScrollBarLineChart != null) {
            return hwHealthBaseScrollBarLineChart.computeDynamicBorderMin(this, f, f2);
        }
        return 0.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeAverageValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return 0.0f;
        }
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        int i = 0;
        float y = 0.0f;
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                y += t.getY();
                i++;
            }
        }
        if (i == 0) {
            return 0.0f;
        }
        return y / i;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float acquireShowRangeRatioedValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, HwHealthBaseScrollBarLineChart.DataRatioProvider dataRatioProvider) {
        float y = 0.0f;
        if (hwHealthBaseScrollBarLineChart != null && dataRatioProvider != null) {
            float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
            float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
            for (T t : this.mEntries) {
                if (t != null && t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                    y += t.getY() * dataRatioProvider.computeRatio((int) t.getX());
                }
            }
        }
        return y;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public boolean isDataCalculated() {
        return this.mIsDataCalculated;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void makeDataCalculated(boolean z) {
        this.mIsDataCalculated = z;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float calculateLogicByShowRange(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, LogicalUnit logicalUnit) {
        if (hwHealthBaseScrollBarLineChart == null || logicalUnit == null) {
            return 0.0f;
        }
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        ArrayList arrayList = new ArrayList();
        for (T t : acquireEntryVals()) {
            if (t != null) {
                if (fAcquireShowRangeMaximum - fAcquireShowRangeMinimum < 1440.0f) {
                    Date date = new Date((((long) fAcquireShowRangeMinimum) * 60000) + 1388505600000L);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    int i = calendar.get(1);
                    int i2 = calendar.get(2);
                    int i3 = calendar.get(5);
                    Date date2 = new Date((((long) t.getX()) * 60000) + 1388505600000L);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date2);
                    int i4 = calendar2.get(1);
                    int i5 = calendar2.get(2);
                    int i6 = calendar2.get(5);
                    if (i == i4 && i2 == i5 && i3 == i6) {
                        arrayList.add(t);
                    }
                } else if (t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                    arrayList.add(t);
                }
            }
        }
        return logicalUnit.calculate(arrayList);
    }

    public float acquireOlderPagerValue(float f, HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, boolean z) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return f;
        }
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        float f2 = fAcquireShowRangeMaximum - fAcquireShowRangeMinimum;
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= fAcquireShowRangeMinimum - f2 && t.getX() <= fAcquireShowRangeMaximum - f2) {
                if (z) {
                    if (t.getY() > f) {
                        f = t.getY();
                    }
                } else if (t.getY() < f) {
                    f = t.getY();
                }
            }
        }
        return f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public int getLabelCount() {
        return this.mLabelCount;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void setLabelCount(int i, boolean z) {
        this.mLabelCount = i;
        this.mIsForcedLabels = z;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void setForcedLabels(float[] fArr) {
        if (fArr != null) {
            this.mForcedLabels = (float[]) fArr.clone();
        }
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float[] getForcedLabels() {
        float[] fArr = this.mForcedLabels;
        if (fArr != null) {
            return (float[]) fArr.clone();
        }
        return null;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public boolean isForcedLabelsCount() {
        return this.mIsForcedLabels;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public HwHealthYAxis.HwHealthAxisDependency getAxisDependencyExt() {
        return this.mHwHealthAxisDependency;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void setAxisDependency(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency) {
        this.mHwHealthAxisDependency = hwHealthAxisDependency;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void setXMaxForcedValue(float f) {
        this.mIsMaxForcedX = true;
        this.mMaxForcedValueX = f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float getXMaxForcedValue() {
        return this.mMaxForcedValueX;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public void setXMinForcedValue(float f) {
        this.mIsMinForcedX = true;
        this.mMinForcedValueX = f;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public float getXMinForcedValue() {
        return this.mMinForcedValueX;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public boolean isXMaxForced() {
        return this.mIsMaxForcedX;
    }

    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet
    public boolean isXMinForced() {
        return this.mIsMinForcedX;
    }

    public float acquireShowRangeValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f, boolean z) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return f;
        }
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                if (z) {
                    if (t.getY() > f) {
                        f = t.getY();
                    }
                } else if (t.getY() < f) {
                    f = t.getY();
                }
            }
        }
        return f;
    }

    public float acquireNewerPagerValue(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, float f) {
        if (hwHealthBaseScrollBarLineChart == null) {
            return f;
        }
        float fAcquireShowRangeMinimum = hwHealthBaseScrollBarLineChart.acquireShowRangeMinimum();
        float fAcquireShowRangeMaximum = hwHealthBaseScrollBarLineChart.acquireShowRangeMaximum();
        float f2 = fAcquireShowRangeMaximum - fAcquireShowRangeMinimum;
        for (T t : this.mEntries) {
            if (t != null && t.getX() >= fAcquireShowRangeMinimum + f2 && t.getX() <= fAcquireShowRangeMaximum + f2 && t.getY() > f) {
                f = t.getY();
            }
        }
        return f;
    }
}
