package com.huawei.ui.commonui.linechart.common;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.touch.HwHealthBarLineChartTouchListener;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qme;
import defpackage.qmh;
import defpackage.qmj;
import defpackage.qmk;
import defpackage.qmn;
import defpackage.qmp;
import defpackage.qnb;
import defpackage.qne;
import defpackage.qng;
import defpackage.qnh;
import defpackage.qrk;
import defpackage.xde;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthBaseScrollBarLineChart<T extends HwHealthBaseBarLineData<? extends IHwHealthBarLineDataSet<? extends HwHealthBaseEntry>>> extends HwHealthBaseBarLineChart<T> {
    private static final float DAY_ALLOWABLE_ERROR = 5.0f;
    private static final int HALF_HOUR = 30;
    private static final long MINUTE_TO_MILLIS = 60000;
    private static final String TAG = "HealthChart_HwHealthBaseScrollBarLineChart";
    protected qng mAnimatorMarkerViewChange;
    protected qng mAnimatorPagerChange;
    private boolean mCanScrollNewerPager;
    private boolean mCanScrollOlderPager;
    protected ChartShowMode mChartShowMode;
    private AnimateTimeComputer mDefaultAnimateTimeComputer;
    private AnimateValueTransfer mDefaultAnimateValueTransfer;
    private long mDefaultTimeMillis;
    private HwHealthAxisValueFormatter mHwHealthAxisValueFormatter;
    protected boolean mIsDisableDrawSelf;
    private boolean mIsMoveToLastDataStamp;
    private boolean mIsRefreshToExpectedTime;
    private HwHealthBaseScrollBarLineChart<T>.a mOnScrollPagerAnimateMgr;
    private List<OnXRangeSet> mOnXRangeSets;
    private PagerNoMoreListener mPagerNoMoreListener;
    protected float mRangeBoardMax;
    protected float mRangeBoardMin;
    protected ScrollAdapterInterface mScrollAdapter;
    private int mShowRange;
    private UnixChartType mUnixChartType;

    public interface AnimateTimeComputer {
        int computeTime(int i);
    }

    public interface AnimateValueTransfer {
        float transferValue(float f);
    }

    public enum ChartShowMode {
        NORMAL,
        SCROLL_MODE,
        SCROLL_SCALE_MODE
    }

    public interface DataRatioProvider {
        float computeRatio(int i);
    }

    public static abstract class HwHealthAxisValueFormatter implements IAxisValueFormatter {

        public enum HealthDeviceKindType {
            HDK_UNKNOWN,
            HDK_BLOOD_SUGAR,
            HDK_ACTIVE_HOUR,
            HDK_TEMPERATURE
        }

        public abstract void enableMarkerViewShowRange(boolean z);

        public abstract String getFormattedValueForMarkerView(float f, AxisBase axisBase);

        public abstract String getRangeText(double d, double d2);

        public abstract void setHealthType(HealthDeviceKindType healthDeviceKindType);
    }

    public interface OnDataFillCallback {
        void onResult();
    }

    public interface OnXRangeSet {
        void onRangeShow(int i, int i2);
    }

    public interface PagerNoMoreListener {
        void notifyNewerPager(boolean z);

        void notifyOlderPager(boolean z);
    }

    public interface ScrollAdapterInterface {
        public static final int NEW_DATA_FILLED = 1;

        int acquireDefaultStartX();

        int acquireRange();

        int acquireRange(long j);

        int acquireRangeCenterValue(int i);

        int acquireValuePresentRangeMax(int i);

        int acquireValuePresentRangeMin(int i);

        HwHealthAxisValueFormatter acquireXAxisValueFormatter();

        float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2);

        float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2);

        int getFlag();

        void injectStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar);

        void invalidateBuff();

        boolean isTotalClearInShowRange();

        void manageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar);

        void onRangeShow(int i, int i2);

        List<IChartStorageHelper> parseAssociatedStorageHelper();

        DataInfos queryDataInfos(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet);

        HwHealthChartHolder.c queryShowMode(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet);

        IChartStorageHelper queryStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet);

        boolean querySupportTouchScroll();

        void reverseInjectStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet);

        void setBuffRang(int i);

        void setDefaultTime(long j);

        void setFlag(int i);

        void unmanageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet);
    }

    public int getAnimateTime() {
        return 1200;
    }

    protected boolean isSupportScaled() {
        return false;
    }

    public HwHealthBaseScrollBarLineChart(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mChartShowMode = ChartShowMode.NORMAL;
        this.mScrollAdapter = null;
        this.mRangeBoardMin = -3.4028235E38f;
        this.mRangeBoardMax = -3.4028235E38f;
        this.mAnimatorPagerChange = new qng();
        this.mAnimatorMarkerViewChange = new qng();
        this.mIsDisableDrawSelf = true;
        this.mOnScrollPagerAnimateMgr = new a();
        this.mUnixChartType = UnixChartType.UNSET;
        this.mShowRange = 0;
        this.mCanScrollOlderPager = false;
        this.mCanScrollNewerPager = false;
        this.mOnXRangeSets = new ArrayList();
        this.mPagerNoMoreListener = null;
        this.mDefaultAnimateValueTransfer = new AnimateValueTransfer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateValueTransfer
            public float transferValue(float f2) {
                return f2;
            }
        };
        this.mDefaultAnimateTimeComputer = new AnimateTimeComputer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.8
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateTimeComputer
            public int computeTime(int i3) {
                return HwHealthBaseScrollBarLineChart.this.getAnimateTime();
            }
        };
        this.mIsMoveToLastDataStamp = false;
        this.mDefaultTimeMillis = System.currentTimeMillis();
    }

    public HwHealthBaseScrollBarLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChartShowMode = ChartShowMode.NORMAL;
        this.mScrollAdapter = null;
        this.mRangeBoardMin = -3.4028235E38f;
        this.mRangeBoardMax = -3.4028235E38f;
        this.mAnimatorPagerChange = new qng();
        this.mAnimatorMarkerViewChange = new qng();
        this.mIsDisableDrawSelf = true;
        this.mOnScrollPagerAnimateMgr = new a();
        this.mUnixChartType = UnixChartType.UNSET;
        this.mShowRange = 0;
        this.mCanScrollOlderPager = false;
        this.mCanScrollNewerPager = false;
        this.mOnXRangeSets = new ArrayList();
        this.mPagerNoMoreListener = null;
        this.mDefaultAnimateValueTransfer = new AnimateValueTransfer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateValueTransfer
            public float transferValue(float f2) {
                return f2;
            }
        };
        this.mDefaultAnimateTimeComputer = new AnimateTimeComputer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.8
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateTimeComputer
            public int computeTime(int i3) {
                return HwHealthBaseScrollBarLineChart.this.getAnimateTime();
            }
        };
        this.mIsMoveToLastDataStamp = false;
        this.mDefaultTimeMillis = System.currentTimeMillis();
    }

    public HwHealthBaseScrollBarLineChart(Context context) {
        super(context);
        this.mChartShowMode = ChartShowMode.NORMAL;
        this.mScrollAdapter = null;
        this.mRangeBoardMin = -3.4028235E38f;
        this.mRangeBoardMax = -3.4028235E38f;
        this.mAnimatorPagerChange = new qng();
        this.mAnimatorMarkerViewChange = new qng();
        this.mIsDisableDrawSelf = true;
        this.mOnScrollPagerAnimateMgr = new a();
        this.mUnixChartType = UnixChartType.UNSET;
        this.mShowRange = 0;
        this.mCanScrollOlderPager = false;
        this.mCanScrollNewerPager = false;
        this.mOnXRangeSets = new ArrayList();
        this.mPagerNoMoreListener = null;
        this.mDefaultAnimateValueTransfer = new AnimateValueTransfer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateValueTransfer
            public float transferValue(float f2) {
                return f2;
            }
        };
        this.mDefaultAnimateTimeComputer = new AnimateTimeComputer() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.8
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateTimeComputer
            public int computeTime(int i3) {
                return HwHealthBaseScrollBarLineChart.this.getAnimateTime();
            }
        };
        this.mIsMoveToLastDataStamp = false;
        this.mDefaultTimeMillis = System.currentTimeMillis();
    }

    public boolean isInPagerPosition() {
        return isInPagerPosition((int) this.mRangeBoardMin);
    }

    public boolean isInPagerPosition(int i2) {
        UnixChartType unixChartType = this.mUnixChartType;
        if (unixChartType == UnixChartType.DAY) {
            return ((float) Math.abs(i2 - getClosetDayZeroUnixTime((float) i2))) < 5.0f;
        }
        if (unixChartType == UnixChartType.WEEK) {
            return ((float) Math.abs(i2 - getClosetWeekZeroUnixTime((float) i2))) < 5.0f;
        }
        if (unixChartType == UnixChartType.MONTH) {
            return ((float) Math.abs(i2 - getClosetMonthZeroUnixTime((float) i2))) < 5.0f;
        }
        if (unixChartType == UnixChartType.YEAR) {
            return ((float) Math.abs(i2 - getClosetYearZeroUnixTime((float) i2))) < 5.0f;
        }
        return unixChartType == UnixChartType.ALL;
    }

    public void setDefaultTimeMillis(long j) {
        this.mDefaultTimeMillis = j;
    }

    public long getDefaultTimeMillis() {
        return this.mDefaultTimeMillis;
    }

    public void enableScrollMode(UnixChartType unixChartType, DynamicBorderSupportable dynamicBorderSupportable) {
        if (this.mChartShowMode == ChartShowMode.SCROLL_MODE || this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE) {
            return;
        }
        this.mChartShowMode = isSupportScaled() ? ChartShowMode.SCROLL_SCALE_MODE : ChartShowMode.SCROLL_MODE;
        this.mUnixChartType = unixChartType;
        ScrollAdapterInterface scrollAdapterInterfaceA = qnb.a(unixChartType, this, dynamicBorderSupportable);
        this.mScrollAdapter = scrollAdapterInterfaceA;
        this.mHwHealthAxisValueFormatter = scrollAdapterInterfaceA.acquireXAxisValueFormatter();
        this.mXAxis.setValueFormatter(this.mHwHealthAxisValueFormatter);
        if (this.mChartTouchListener instanceof HwHealthBarLineChartTouchListener) {
            if (isSupportScaled()) {
                ((HwHealthBarLineChartTouchListener) this.mChartTouchListener).d();
            } else {
                ((HwHealthBarLineChartTouchListener) this.mChartTouchListener).e();
            }
        }
        qmp qmpVar = new qmp(getContext(), this, this.mViewPortHandler, this.mXAxis, this.mFirstAxisTransformer);
        qmpVar.d(unixChartType);
        if (this.mXAxisRenderer instanceof HwHealthXAxisRenderer) {
            qmpVar.e(((HwHealthXAxisRenderer) this.mXAxisRenderer).b());
        }
        this.mXAxisRenderer = qmpVar;
        setShowRange(this.mScrollAdapter.acquireDefaultStartX(), this.mScrollAdapter.acquireRange());
        this.mAxisFirstParty.setAxisMaximum(2000000.0f);
    }

    public ScrollAdapterInterface acquireScrollAdapter() {
        return this.mScrollAdapter;
    }

    public boolean querySupportTouchScroll() {
        return this.mScrollAdapter.querySupportTouchScroll();
    }

    public void setShowRange(int i2, int i3) {
        this.mShowRange = i3;
        if ((this.mChartShowMode == ChartShowMode.SCROLL_MODE || this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE) && (this.mXAxisRenderer instanceof qmp)) {
            ((qmp) this.mXAxisRenderer).a(i2, i3);
        }
    }

    public void show(long j) {
        this.mViewPortHandler.getMatrixTouch().set(new Matrix());
        setShowRange(getCurrentPagerStartX(j), acquireScrollAdapter().acquireRange(j));
    }

    public static abstract class ScrollAdapter implements ScrollAdapterInterface {
        private HwHealthBaseScrollBarLineChart mChart;
        private int mFlag = 0;
        protected a mScrollBuffer = new a();

        protected abstract void fillBuffer(a aVar, List<? extends IHwHealthBarLineDataSet<? extends HwHealthBaseEntry>> list, OnDataFillCallback onDataFillCallback);

        public ScrollAdapter(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
            this.mChart = hwHealthBaseScrollBarLineChart;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public void setFlag(int i) {
            this.mFlag = i;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public int getFlag() {
            return this.mFlag;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public void setBuffRang(int i) {
            a aVar = this.mScrollBuffer;
            if (aVar != null) {
                aVar.a(i);
            }
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public void onRangeShow(int i, int i2) {
            if (this.mChart.mIsRefreshToExpectedTime) {
                HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = this.mChart;
                Objects.requireNonNull(hwHealthBaseScrollBarLineChart);
                hwHealthBaseScrollBarLineChart.animateBorderYAuto(new b(), 1);
                this.mChart.mIsRefreshToExpectedTime = false;
            }
            if (this.mScrollBuffer.a(qnh.f(i), qnh.f(i2))) {
                this.mScrollBuffer.b(qnh.f(i), qnh.f(i2));
                fillBuffer(this.mScrollBuffer, this.mChart.getData().getDataSets(), new OnDataFillCallback() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapter.4
                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnDataFillCallback
                    public void onResult() {
                        ScrollAdapter.this.mScrollBuffer.e(ScrollAdapter.this.mScrollBuffer.b(), ScrollAdapter.this.mScrollBuffer.e());
                        ScrollAdapter scrollAdapter = ScrollAdapter.this;
                        scrollAdapter.setFlag(scrollAdapter.getFlag() | 1);
                        ScrollAdapter.this.mChart.refresh();
                        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart2 = ScrollAdapter.this.mChart;
                        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart3 = ScrollAdapter.this.mChart;
                        Objects.requireNonNull(hwHealthBaseScrollBarLineChart3);
                        hwHealthBaseScrollBarLineChart2.animateBorderYAuto(new b(), 1);
                    }
                });
            }
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public boolean isTotalClearInShowRange() {
            float f = this.mChart.mRangeBoardMin;
            float f2 = this.mChart.mRangeBoardMax;
            return (f2 - f) + ((float) (this.mScrollBuffer.e - this.mScrollBuffer.f23659c)) <= ((f2 > ((float) this.mScrollBuffer.e) ? 1 : (f2 == ((float) this.mScrollBuffer.e) ? 0 : -1)) >= 0 ? f2 : (float) this.mScrollBuffer.e) - ((f > ((float) this.mScrollBuffer.f23659c) ? 1 : (f == ((float) this.mScrollBuffer.f23659c) ? 0 : -1)) <= 0 ? f : (float) this.mScrollBuffer.f23659c);
        }

        protected void notifyDataChanged() {
            this.mChart.refresh();
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
        public void invalidateBuff() {
            this.mScrollBuffer.a();
        }

        public class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f23658b = 4;
            private int f = 0;
            private int g = 0;
            private int i = 0;
            private int d = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f23659c = 0;
            private int e = 0;
            private boolean j = true;

            public a() {
            }

            public void e(boolean z) {
                this.j = z;
            }

            public void a(int i) {
                if (i >= 0) {
                    this.f23658b = i;
                }
            }

            public void b(int i, int i2) {
                this.f = i;
                this.g = i2;
                int i3 = (i2 - i) * this.f23658b;
                this.i = i - i3;
                this.d = i2 + i3;
            }

            public void e(int i, int i2) {
                this.f23659c = i;
                this.e = i2;
            }

            public int b() {
                if (this.j) {
                    return this.i;
                }
                return this.f;
            }

            public int e() {
                if (this.j) {
                    return this.d;
                }
                return this.g;
            }

            public int c() {
                return this.f;
            }

            public int d() {
                return this.g;
            }

            public boolean a(int i, int i2) {
                if (!ScrollAdapter.this.mChart.mIsDisableDrawSelf) {
                    ScrollAdapter.this.mChart.mIsDisableDrawSelf = true;
                    return true;
                }
                if (!this.j) {
                    return (this.f == i && this.g == i2) ? false : true;
                }
                if (this.f23658b == 0) {
                    return i < this.f || i2 > this.g;
                }
                int i3 = this.f;
                int i4 = this.g;
                int i5 = i4 - i3;
                return i < i3 - i5 || i2 > i4 + i5;
            }

            public void a() {
                this.d = 0;
                this.i = 0;
                this.g = 0;
                this.f = 0;
            }
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] fArr = {this.mViewPortHandler.contentLeft(), 0.0f, this.mViewPortHandler.contentRight(), 0.0f};
        this.mFirstAxisTransformer.pixelsToValue(fArr);
        float fCorrectRangeEdgeByDay = fArr[0];
        float rangeBoardMaxNew = fArr[2];
        this.mFirstAxisTransformer.pointValuesToPixel(new float[]{2.540688E7f, 0.0f});
        if (fCorrectRangeEdgeByDay > rangeBoardMaxNew) {
            rangeBoardMaxNew = fCorrectRangeEdgeByDay;
            fCorrectRangeEdgeByDay = rangeBoardMaxNew;
        }
        if (isScrollChart()) {
            fCorrectRangeEdgeByDay = correctRangeEdgeByDay((int) fCorrectRangeEdgeByDay);
            rangeBoardMaxNew = getRangeBoardMaxNew((int) fCorrectRangeEdgeByDay, correctRangeEdgeByDay((int) rangeBoardMaxNew));
        }
        if (this.mChartShowMode == ChartShowMode.SCROLL_MODE) {
            if (Math.abs(fCorrectRangeEdgeByDay - this.mRangeBoardMin) < 1.0E-6d && Math.abs(rangeBoardMaxNew - this.mRangeBoardMax) < 1.0E-6d && (this.mScrollAdapter.getFlag() & 1) != 1) {
                return;
            } else {
                this.mScrollAdapter.setFlag(this.mScrollAdapter.getFlag() & (-2));
            }
        }
        if (this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE && (!isDayRangeEqual((int) fCorrectRangeEdgeByDay, (int) rangeBoardMaxNew) || (this.mScrollAdapter.getFlag() & 1) == 1)) {
            this.mScrollAdapter.setFlag(this.mScrollAdapter.getFlag() & (-2));
        }
        this.mRangeBoardMin = fCorrectRangeEdgeByDay;
        this.mRangeBoardMax = rangeBoardMaxNew;
        notifyPager();
        onXRangeSetCallBack();
    }

    private void onXRangeSetCallBack() {
        float f2 = this.mRangeBoardMin;
        float f3 = this.mRangeBoardMax;
        if (isScrollChart()) {
            f2 = qnh.f((int) this.mRangeBoardMin);
            f3 = qnh.f((int) this.mRangeBoardMax);
        }
        for (OnXRangeSet onXRangeSet : this.mOnXRangeSets) {
            if (onXRangeSet != null) {
                onXRangeSet.onRangeShow((int) f2, (int) f3);
            }
        }
    }

    private boolean isScrollChart() {
        return this.mChartShowMode == ChartShowMode.SCROLL_MODE || this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE;
    }

    private float getRangeBoardMaxNew(int i2, float f2) {
        if (this.mUnixChartType == UnixChartType.ALL || this.mUnixChartType == UnixChartType.YEAR) {
            long millis = TimeUnit.MINUTES.toMillis(qnh.f(i2));
            if (qnh.v(millis) || (this.mUnixChartType == UnixChartType.YEAR && qnh.p(millis))) {
                return correctRangeEdgeByMonth((int) f2);
            }
        }
        return f2;
    }

    private void notifyPager() {
        if (this.mChartShowMode == ChartShowMode.SCROLL_MODE || this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE) {
            if (this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE) {
                this.mScrollAdapter.onRangeShow(getCurrentPagerStartX(), getNextPagerStartX());
            } else {
                this.mScrollAdapter.onRangeShow((int) this.mRangeBoardMin, (int) this.mRangeBoardMax);
            }
            if (this.mPagerNoMoreListener != null) {
                boolean zCanScrollNewerPagerByCompute = canScrollNewerPagerByCompute();
                boolean z = this.mCanScrollNewerPager;
                if (zCanScrollNewerPagerByCompute != z) {
                    boolean z2 = !z;
                    this.mCanScrollNewerPager = z2;
                    this.mPagerNoMoreListener.notifyNewerPager(z2);
                }
                boolean zCanScrollOlderPagerByCompute = canScrollOlderPagerByCompute();
                boolean z3 = this.mCanScrollOlderPager;
                if (zCanScrollOlderPagerByCompute != z3) {
                    boolean z4 = !z3;
                    this.mCanScrollOlderPager = z4;
                    this.mPagerNoMoreListener.notifyOlderPager(z4);
                }
            }
        }
    }

    private boolean isDayRangeEqual(int i2, int i3) {
        return qnh.e(TimeUnit.MINUTES.toMillis((long) i2)) == qnh.e(TimeUnit.MINUTES.toMillis((long) this.mRangeBoardMin)) && qnh.e(TimeUnit.MINUTES.toMillis((long) i3)) == qnh.e(TimeUnit.MINUTES.toMillis((long) this.mRangeBoardMax));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    protected void computeAxis() {
        int i2;
        int i3;
        if (this.mChartShowMode == ChartShowMode.NORMAL) {
            super.computeAxis();
            return;
        }
        float[] fArr = {this.mViewPortHandler.contentLeft(), 0.0f, this.mViewPortHandler.contentRight(), 0.0f};
        this.mFirstAxisTransformer.pixelsToValue(fArr);
        float f2 = fArr[0];
        float f3 = fArr[2];
        if (f2 <= f3) {
            i2 = (int) f2;
            i3 = (int) f3;
        } else {
            int i4 = (int) f2;
            i2 = (int) f3;
            i3 = i4;
        }
        utilComputeAxis();
        if (this.mXAxis.isEnabled()) {
            this.mXAxisRenderer.computeAxis(i2, i3, false);
        }
    }

    public ChartShowMode acquireChartShowMode() {
        return this.mChartShowMode;
    }

    public class f extends HwHealthBaseScrollBarLineChart<T>.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HwHealthAxisValueFormatter.HealthDeviceKindType f23664c;

        public f() {
            super();
            this.f23664c = HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_UNKNOWN;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.c, com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis((long) d));
            long timeInMillis = calendar.getTimeInMillis();
            if (calendar.get(5) == 1) {
                return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), timeInMillis, ARImageMetadata.CONTROL_AF_STATE);
            }
            return qrk.c(HwHealthBaseScrollBarLineChart.this.getContext(), timeInMillis, TimeUnit.MINUTES.toMillis((long) d2));
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.c, com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            int iF = qnh.f((int) f);
            if (this.f23664c == HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_BLOOD_SUGAR) {
                return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), ((long) iF) * 60000, 153);
            }
            return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), ((long) iF) * 60000, 24);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.c, com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
            this.f23664c = healthDeviceKindType;
        }
    }

    public class c extends HwHealthAxisValueFormatter {
        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void enableMarkerViewShowRange(boolean z) {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
        }

        public c() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            return a(f);
        }

        public String a(float f) {
            return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis(qnh.f((int) f)), 131080);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            return DateUtils.formatDateRange(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis((long) d), TimeUnit.MINUTES.toMillis((long) d2), 131076);
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            return a(f);
        }
    }

    public class i extends HwHealthAxisValueFormatter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23668b = true;
        private HwHealthAxisValueFormatter.HealthDeviceKindType d = HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_UNKNOWN;

        public i() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void enableMarkerViewShowRange(boolean z) {
            this.f23668b = z;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            long timeInMillis;
            long timeInMillis2;
            int i = (int) f;
            int iF = qnh.f(i);
            if (i == ((int) HwHealthBaseScrollBarLineChart.this.mRangeBoardMax)) {
                iF--;
            }
            if (!this.f23668b) {
                return e(f, axisBase);
            }
            if (this.d == HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_ACTIVE_HOUR || this.d == HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_TEMPERATURE) {
                long j = ((long) iF) * 60000;
                return DateUtils.formatDateRange(HwHealthBaseScrollBarLineChart.this.getContext(), lsl.s(j), lsl.c(j, TimeZone.getDefault(), 1), 129);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            if (calendar.get(12) < 30) {
                calendar.set(12, 0);
                long timeInMillis3 = calendar.getTimeInMillis();
                calendar.set(12, 30);
                timeInMillis = calendar.getTimeInMillis();
                timeInMillis2 = timeInMillis3;
            } else {
                calendar.set(12, 30);
                timeInMillis2 = calendar.getTimeInMillis();
                int i2 = calendar.get(5);
                calendar.set(12, 0);
                calendar.add(11, 1);
                if (calendar.get(5) != i2) {
                    calendar.add(12, -1);
                }
                timeInMillis = calendar.getTimeInMillis();
            }
            return DateUtils.formatDateRange(HwHealthBaseScrollBarLineChart.this.getContext(), timeInMillis2, timeInMillis, 129);
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            return e(f, axisBase);
        }

        private String e(float f, AxisBase axisBase) {
            int iF = qnh.f((int) f);
            String strE = e(iF, axisBase);
            if (f == ((int) HwHealthBaseScrollBarLineChart.this.mRangeBoardMax)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) iF) * 60000);
                if (calendar.get(11) == 0) {
                    String[] strArrSplit = strE.split(":");
                    String str = strArrSplit.length > 0 ? strArrSplit[0] : null;
                    LogUtil.a(HwHealthBaseScrollBarLineChart.TAG, "time: ", strE, "hourStr: ", str);
                    return strE.replaceFirst(str != null ? str.replace("[", "") : "", xde.b(24));
                }
            }
            return strE;
        }

        public String e(int i, AxisBase axisBase) {
            return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), ((long) i) * 60000, 129);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
            this.d = healthDeviceKindType;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            return qrk.e(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis((long) d));
        }
    }

    public class g extends HwHealthAxisValueFormatter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HwHealthBaseScrollBarLineChart<T>.c f23665b;
        private HwHealthAxisValueFormatter.HealthDeviceKindType e = HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_UNKNOWN;

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void enableMarkerViewShowRange(boolean z) {
        }

        public g() {
            this.f23665b = new c();
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            int iF = qnh.f((int) f);
            if (this.e == HwHealthAxisValueFormatter.HealthDeviceKindType.HDK_BLOOD_SUGAR) {
                return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), ((long) iF) * 60000, 153);
            }
            return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), ((long) iF) * 60000, 24);
        }

        public String c(float f, AxisBase axisBase, boolean z) {
            if (z) {
                return this.f23665b.getFormattedValue(f, axisBase);
            }
            int iF = qnh.f((int) f);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            if (calendar.get(7) != qne.c()) {
                return null;
            }
            return this.f23665b.getFormattedValue(iF, axisBase);
        }

        public boolean d(float f) {
            int iF = qnh.f((int) f);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            return calendar.get(7) == qne.e();
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
            this.e = healthDeviceKindType;
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            return qrk.c(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis((long) d), TimeUnit.MINUTES.toMillis((long) d2));
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            int iF = qnh.f((int) f);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            int i = calendar.get(7);
            Context context = HwHealthBaseScrollBarLineChart.this.getContext();
            if (i == 1) {
                return context.getResources().getString(R.string.IDS_sunday);
            }
            if (i == 2) {
                return context.getResources().getString(R.string.IDS_monday);
            }
            if (i == 3) {
                return context.getResources().getString(R.string.IDS_tuesday);
            }
            if (i == 4) {
                return context.getResources().getString(R.string.IDS_wednesday);
            }
            if (i == 5) {
                return context.getResources().getString(R.string.IDS_thursday);
            }
            if (i == 6) {
                return context.getResources().getString(R.string.IDS_friday);
            }
            if (i == 7) {
                return context.getResources().getString(R.string.IDS_saturday);
            }
            return "";
        }
    }

    public class h extends HwHealthAxisValueFormatter {
        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void enableMarkerViewShowRange(boolean z) {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
        }

        public h() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            return DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis(qnh.f((int) f)), ARImageMetadata.CONTROL_AF_STATE);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis((long) d));
            calendar.add(12, 1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis((long) d2));
            calendar.add(12, -1);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (qrk.a(timeInMillis, timeInMillis2)) {
                return qrk.b(HwHealthBaseScrollBarLineChart.this.getContext(), timeInMillis);
            }
            return qrk.a(HwHealthBaseScrollBarLineChart.this.getContext(), timeInMillis, timeInMillis2);
        }

        public String d(float f, XAxis xAxis, boolean z) {
            if (z) {
                return c(f);
            }
            int iF = qnh.f((int) f);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            if (calendar.get(2) != 0) {
                return null;
            }
            return c(f);
        }

        private String c(float f) {
            return new SimpleDateFormat("yyyy").format(new Date(TimeUnit.MINUTES.toMillis(qnh.f((int) f))));
        }

        public boolean b(float f) {
            int iF = qnh.f((int) f);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((long) iF) * 60000);
            return calendar.get(2) == 11;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            return new SimpleDateFormat("M").format(new Date(((long) qnh.f((int) f)) * 60000));
        }
    }

    public class d extends HwHealthAxisValueFormatter {
        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void enableMarkerViewShowRange(boolean z) {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public void setHealthType(HwHealthAxisValueFormatter.HealthDeviceKindType healthDeviceKindType) {
        }

        public d() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getFormattedValueForMarkerView(float f, AxisBase axisBase) {
            return getFormattedValue(f, axisBase);
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter
        public String getRangeText(double d, double d2) {
            return HwHealthBaseScrollBarLineChart.this.getContext().getString(R.string.IDS_hwh_motiontrack_sport_data_share_all, DateUtils.formatDateTime(HwHealthBaseScrollBarLineChart.this.getContext(), TimeUnit.MINUTES.toMillis((long) d), 36));
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            return new SimpleDateFormat("yyyy").format(new Date(((long) qnh.f((int) f)) * 60000));
        }
    }

    public float acquireShowRangeMinimum() {
        return this.mRangeBoardMin;
    }

    public float acquireShowRangeMaximum() {
        return this.mRangeBoardMax;
    }

    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f2, float f3) {
        if (this.mAxisRendererFirstParty.h()) {
            f2 = Math.max(f2, this.mAxisRendererFirstParty.a());
        }
        ScrollAdapterInterface scrollAdapterInterface = this.mScrollAdapter;
        if (scrollAdapterInterface != null) {
            return scrollAdapterInterface.computeDynamicBorderMax(hwHealthBaseBarLineDataSet, f2, f3);
        }
        return 0.0f;
    }

    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f2, float f3) {
        return this.mScrollAdapter.computeDynamicBorderMin(hwHealthBaseBarLineDataSet, f2, f3);
    }

    public void animateBorderY(HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency, float f2, float f3, boolean z, HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer, int i2, int i3) {
        this.mOnScrollPagerAnimateMgr.e(bVar);
        if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY) {
            this.mAxisRendererFirstParty.b(f2, f3, z, bVar, animateValueTransfer, i2, i3);
        } else if (hwHealthAxisDependency == HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY) {
            this.mAxisRendererSecondParty.b(f2, f3, z, bVar, animateValueTransfer, i2, i3);
        } else {
            this.mAxisRendererThirdParty.b(f2, f3, z, bVar, animateValueTransfer, i2, i3);
        }
    }

    public void animateBorderYAuto() {
        animateBorderYAuto(1);
    }

    public void animateBorderYAuto(int i2) {
        animateBorderYAuto(new b(), this.mDefaultAnimateValueTransfer, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void animateBorderYAuto(HwHealthBaseScrollBarLineChart<T>.b bVar, int i2) {
        animateBorderYAuto(bVar, this.mDefaultAnimateValueTransfer, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void animateBorderYAuto(HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer, int i2) {
        this.mOnScrollPagerAnimateMgr.e(bVar);
        animateBorderYAuto(false, bVar, animateValueTransfer, 1200, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void animateBorderYAuto(boolean z, final HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer, int i2, int i3) {
        if (bVar == null) {
            LogUtil.e(TAG, "animateBorderYAuto scrollPagerAnimateListener == null");
            return;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        final AsyncSelectorMultiRun asyncSelectorMultiRun = new AsyncSelectorMultiRun(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.6
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onFailed(int i4) {
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onSuccess() {
                bVar.c();
            }
        };
        AsyncSelectorMultiRun.c cVar = new AsyncSelectorMultiRun.c();
        asyncSelectorMultiRun.add(cVar);
        for (IHwHealthBarLineDataSet iHwHealthBarLineDataSet : getData().getDataSets()) {
            if (iHwHealthBarLineDataSet != null) {
                float fAcquireShowRangeMaxValue = iHwHealthBarLineDataSet.acquireShowRangeMaxValue(this);
                float fAcquireShowRangeMinValue = iHwHealthBarLineDataSet.acquireShowRangeMinValue(this);
                float fComputeDynamicBorderMax = iHwHealthBarLineDataSet.computeDynamicBorderMax(this, fAcquireShowRangeMaxValue, fAcquireShowRangeMinValue);
                float fComputeDynamicBorderMin = iHwHealthBarLineDataSet.computeDynamicBorderMin(this, fAcquireShowRangeMaxValue, fAcquireShowRangeMinValue);
                final AsyncSelectorMultiRun.c cVar2 = new AsyncSelectorMultiRun.c();
                asyncSelectorMultiRun.add(cVar2);
                animateBorderY(iHwHealthBarLineDataSet.getAxisDependencyExt(), fComputeDynamicBorderMax, fComputeDynamicBorderMin, z, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                        asyncSelectorMultiRun.actionEnd(cVar2);
                    }
                }, animateValueTransfer, i2, i3);
            }
        }
        asyncSelectorMultiRun.run();
        asyncSelectorMultiRun.actionEnd(cVar);
    }

    public void addOnXRangeSet(OnXRangeSet onXRangeSet) {
        this.mOnXRangeSets.add(onXRangeSet);
    }

    public float getShowDataAverage() {
        List dataSets = getData().getDataSets();
        if (njy.e(dataSets)) {
            return 0.0f;
        }
        return ((IHwHealthBarLineDataSet) dataSets.get(0)).acquireShowRangeAverageValue(this);
    }

    public float getShowDataByRatio(DataRatioProvider dataRatioProvider) {
        List dataSets = getData().getDataSets();
        if (njy.e(dataSets)) {
            return 0.0f;
        }
        return ((IHwHealthBarLineDataSet) dataSets.get(0)).acquireShowRangeRatioedValue(this, dataRatioProvider);
    }

    public String formatRangeText(int i2, int i3) {
        HwHealthAxisValueFormatter hwHealthAxisValueFormatter = this.mHwHealthAxisValueFormatter;
        if (hwHealthAxisValueFormatter != null) {
            return hwHealthAxisValueFormatter.getRangeText(i2, i3);
        }
        return "";
    }

    public void scrollOnePageOlder(AnimateValueTransfer animateValueTransfer, AnimateTimeComputer animateTimeComputer) {
        scrollOnePageOlder(new b(), animateValueTransfer, animateTimeComputer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollOnePageOlder(HwHealthBaseScrollBarLineChart<T>.b bVar) {
        scrollOnePageOlder(bVar, this.mDefaultAnimateValueTransfer, this.mDefaultAnimateTimeComputer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollOnePageOlder(HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer, AnimateTimeComputer animateTimeComputer) {
        this.mOnScrollPagerAnimateMgr.e(bVar);
        boolean z = this.mUnixChartType == UnixChartType.DAY;
        if (!(this.mXAxis instanceof qmn)) {
            LogUtil.j(TAG, "scrollOnePageOlder mXAxis not instanceof HwHealthXAxis");
            return;
        }
        if (z) {
            ((qmn) this.mXAxis).b(true);
        }
        int pagerToScrollEndPosition = getPagerToScrollEndPosition(false);
        final AsyncSelectorMultiRun asyncSelectorMultiRun = getAsyncSelectorMultiRun(z, bVar, pagerToScrollEndPosition);
        AsyncSelectorMultiRun.c cVar = new AsyncSelectorMultiRun.c();
        asyncSelectorMultiRun.add(cVar);
        processScrollPagerAnimateEnd(animateValueTransfer, animateTimeComputer, pagerToScrollEndPosition, asyncSelectorMultiRun, getData().getDataSets());
        final AsyncSelectorMultiRun.c cVar2 = new AsyncSelectorMultiRun.c();
        asyncSelectorMultiRun.add(cVar2);
        scrollPagerToUnixTimeOnlyX(pagerToScrollEndPosition, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
                asyncSelectorMultiRun.actionEnd(cVar2);
            }
        }, animateTimeComputer.computeTime(Math.abs(pagerToScrollEndPosition - ((int) this.mRangeBoardMin))), animateValueTransfer);
        asyncSelectorMultiRun.run();
        asyncSelectorMultiRun.actionEnd(cVar);
    }

    public void updateMatrixTouch() {
        this.mViewPortHandler.getMatrixTouch().set(new Matrix());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void processScrollPagerAnimateEnd(AnimateValueTransfer animateValueTransfer, AnimateTimeComputer animateTimeComputer, int i2, final AsyncSelectorMultiRun asyncSelectorMultiRun, List<? extends IHwHealthBarLineDataSet<? extends Entry>> list) {
        for (IHwHealthBarLineDataSet<? extends Entry> iHwHealthBarLineDataSet : list) {
            if (iHwHealthBarLineDataSet != null) {
                float f2 = i2;
                float fAcquireRangePagerMaxValue = iHwHealthBarLineDataSet.acquireRangePagerMaxValue(f2, this.mShowRange + i2);
                float fAcquireRangePagerMinValue = iHwHealthBarLineDataSet.acquireRangePagerMinValue(f2, this.mShowRange + i2);
                float fComputeDynamicBorderMax = iHwHealthBarLineDataSet.computeDynamicBorderMax(this, fAcquireRangePagerMaxValue, fAcquireRangePagerMinValue);
                float fComputeDynamicBorderMin = iHwHealthBarLineDataSet.computeDynamicBorderMin(this, fAcquireRangePagerMaxValue, fAcquireRangePagerMinValue);
                final AsyncSelectorMultiRun.c cVar = new AsyncSelectorMultiRun.c();
                asyncSelectorMultiRun.add(cVar);
                animateBorderY(iHwHealthBarLineDataSet.getAxisDependencyExt(), fComputeDynamicBorderMax, fComputeDynamicBorderMin, false, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                    public void c() {
                        super.c();
                        asyncSelectorMultiRun.actionEnd(cVar);
                    }
                }, animateValueTransfer, animateTimeComputer.computeTime(Math.abs(i2 - ((int) this.mRangeBoardMin))), 2);
            }
        }
    }

    private int getPagerToScrollEndPosition(boolean z) {
        if (isInPagerPosition() || isSupportScaled()) {
            if (!z) {
                return getLastPagerStartX();
            }
            return getNextPagerStartX();
        }
        if (!z) {
            return getCurrentPagerStartX();
        }
        return getNextPagerStartX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollOnePageNewer(HwHealthBaseScrollBarLineChart<T>.b bVar) {
        scrollOnePageNewer(bVar, this.mDefaultAnimateValueTransfer, this.mDefaultAnimateTimeComputer);
    }

    private AsyncSelectorMultiRun getAsyncSelectorMultiRun(final boolean z, final HwHealthBaseScrollBarLineChart<T>.b bVar, final int i2) {
        return new AsyncSelectorMultiRun(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.15
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onFailed(int i3) {
                if (z) {
                    ((qmn) HwHealthBaseScrollBarLineChart.this.mXAxis).b(false);
                    HwHealthBaseScrollBarLineChart.this.invalidateForce();
                }
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onSuccess() {
                HwHealthBaseScrollBarLineChart.this.success(bVar, z, i2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void scrollOnePageNewer(HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer, AnimateTimeComputer animateTimeComputer) {
        if (bVar == null || animateValueTransfer == null || animateTimeComputer == null) {
            LogUtil.e(TAG, "scrollOnePageNewer input is null");
            return;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        boolean z = this.mUnixChartType == UnixChartType.DAY;
        if (!(this.mXAxis instanceof qmn)) {
            LogUtil.j(TAG, "scrollOnePageNewer mXAxis not instanceof HwHealthXAxis");
            return;
        }
        if (z) {
            ((qmn) this.mXAxis).b(true);
        }
        int pagerToScrollEndPosition = getPagerToScrollEndPosition(true);
        final AsyncSelectorMultiRun asyncSelectorMultiRunAcquireAsyncSelectorMultiRun = acquireAsyncSelectorMultiRun(bVar, z, pagerToScrollEndPosition);
        AsyncSelectorMultiRun.c cVar = new AsyncSelectorMultiRun.c();
        asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.add(cVar);
        for (IHwHealthBarLineDataSet iHwHealthBarLineDataSet : getData().getDataSets()) {
            float f2 = pagerToScrollEndPosition;
            float fAcquireRangePagerMaxValue = iHwHealthBarLineDataSet.acquireRangePagerMaxValue(f2, this.mShowRange + pagerToScrollEndPosition);
            float fAcquireRangePagerMinValue = iHwHealthBarLineDataSet.acquireRangePagerMinValue(f2, this.mShowRange + pagerToScrollEndPosition);
            float fComputeDynamicBorderMax = iHwHealthBarLineDataSet.computeDynamicBorderMax(this, fAcquireRangePagerMaxValue, fAcquireRangePagerMinValue);
            float fComputeDynamicBorderMin = iHwHealthBarLineDataSet.computeDynamicBorderMin(this, fAcquireRangePagerMaxValue, fAcquireRangePagerMinValue);
            final AsyncSelectorMultiRun.c cVar2 = new AsyncSelectorMultiRun.c();
            asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.add(cVar2);
            animateBorderY(iHwHealthBarLineDataSet.getAxisDependencyExt(), fComputeDynamicBorderMax, fComputeDynamicBorderMin, false, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
                public void c() {
                    super.c();
                    asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.actionEnd(cVar2);
                }
            }, animateValueTransfer, animateTimeComputer.computeTime(Math.abs(pagerToScrollEndPosition - ((int) this.mRangeBoardMin))), 2);
        }
        final AsyncSelectorMultiRun.c cVar3 = new AsyncSelectorMultiRun.c();
        asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.add(cVar3);
        scrollPagerToUnixTimeOnlyX(pagerToScrollEndPosition, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.18
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
                asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.actionEnd(cVar3);
            }
        }, animateTimeComputer.computeTime(Math.abs(pagerToScrollEndPosition - ((int) this.mRangeBoardMin))), animateValueTransfer);
        asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.run();
        asyncSelectorMultiRunAcquireAsyncSelectorMultiRun.actionEnd(cVar);
    }

    private AsyncSelectorMultiRun acquireAsyncSelectorMultiRun(final HwHealthBaseScrollBarLineChart<T>.b bVar, final boolean z, final int i2) {
        return new AsyncSelectorMultiRun(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.3
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onFailed(int i3) {
                HwHealthBaseScrollBarLineChart.this.isFailed(z);
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onSuccess() {
                HwHealthBaseScrollBarLineChart.this.success(bVar, z, i2);
            }
        };
    }

    class a {
        private List<HwHealthBaseScrollBarLineChart<T>.b> e;

        private a() {
            this.e = new ArrayList();
        }

        public void e(HwHealthBaseScrollBarLineChart<T>.b bVar) {
            if (this.e.contains(bVar)) {
                return;
            }
            this.e.add(bVar);
        }

        public void d(HwHealthBaseScrollBarLineChart<T>.b bVar) {
            this.e.remove(bVar);
        }

        public boolean e() {
            return this.e.size() != 0;
        }
    }

    public class b {
        public b() {
        }

        public void c() {
            HwHealthBaseScrollBarLineChart.this.mOnScrollPagerAnimateMgr.d(this);
        }
    }

    public abstract class AbstractAnimateTimeComputer implements AnimateTimeComputer {
        public abstract int computeTimeByPixel(float f);

        public AbstractAnimateTimeComputer() {
        }

        @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.AnimateTimeComputer
        public int computeTime(int i) {
            float[] fArr = {0.0f, 0.0f, i, 0.0f};
            HwHealthBaseScrollBarLineChart.this.mFirstAxisTransformer.pointValuesToPixel(fArr);
            return computeTimeByPixel(Math.abs(fArr[2] - fArr[0]));
        }
    }

    public boolean isAnimating() {
        return this.mOnScrollPagerAnimateMgr.e();
    }

    public boolean canScrollOlderPager() {
        return this.mCanScrollOlderPager;
    }

    public boolean canScrollOlderPagerByCompute() {
        float fAcquireShowRangeMinimum = acquireShowRangeMinimum();
        if (Math.abs(Float.MAX_VALUE + fAcquireShowRangeMinimum) < 1.0E-6d) {
            fAcquireShowRangeMinimum = this.mXAxis.getAxisMinimum();
        }
        return fAcquireShowRangeMinimum > ((float) qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(1388505600000L)));
    }

    public boolean canScrollNewerPager() {
        return this.mCanScrollNewerPager;
    }

    public boolean canScrollNewerPagerByCompute() {
        float fAcquireShowRangeMinimum = acquireShowRangeMinimum();
        if (Math.abs(Float.MAX_VALUE + fAcquireShowRangeMinimum) < 1.0E-6d) {
            fAcquireShowRangeMinimum = this.mXAxis.getAxisMinimum();
        }
        return fAcquireShowRangeMinimum < ((float) this.mScrollAdapter.acquireDefaultStartX());
    }

    public void reCalculateDynamicBoardForManualRefLine() {
        if (((HwHealthBaseBarLineData) this.mData).getDataSets().size() < 1) {
            return;
        }
        IHwHealthBarLineDataSet iHwHealthBarLineDataSet = (IHwHealthBarLineDataSet) ((HwHealthBaseBarLineData) this.mData).getDataSets().get(0);
        this.mAxisFirstParty.setAxisMaximum(iHwHealthBarLineDataSet.computeDynamicBorderMax(this, iHwHealthBarLineDataSet.acquireShowRangeMaxValue(this), iHwHealthBarLineDataSet.acquireShowRangeMinValue(this)));
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void correctViewPosition(HwHealthBaseScrollBarLineChart<T>.b bVar) {
        if (!(this.mViewPortHandler instanceof HwHealthViewPortHandler)) {
            LogUtil.j(TAG, "correctViewPosition mViewPortHandler not instanceof HwHealthViewPortHandler");
            return;
        }
        if (((HwHealthViewPortHandler) this.mViewPortHandler).e() && this.mRangeBoardMin > this.mScrollAdapter.acquireDefaultStartX()) {
            scrollPagerToUnixTimeOnlyX(this.mScrollAdapter.acquireDefaultStartX(), bVar);
            return;
        }
        if (this.mRangeBoardMin < qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(1388505600000L))) {
            scrollPagerToUnixTimeOnlyX(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(1388505600000L)), bVar);
            return;
        }
        if (this.mUnixChartType == UnixChartType.DAY || this.mUnixChartType == UnixChartType.WEEK || this.mUnixChartType == UnixChartType.MONTH) {
            scrollPagerToUnixTimeOnlyX(getClosetDayZeroUnixTime(this.mRangeBoardMin), bVar);
        } else if (this.mUnixChartType == UnixChartType.YEAR) {
            scrollPagerToUnixTimeOnlyX(getClosetMonthZeroUnixTime(this.mRangeBoardMin), bVar);
        } else if (this.mUnixChartType == UnixChartType.ALL) {
            scrollPagerToUnixTimeOnlyX(getClosetYearZeroUnixTime(this.mRangeBoardMin), bVar);
        }
    }

    protected int getClosetDayZeroUnixTime(float f2) {
        int iF = qnh.f((int) f2);
        int iE = qnh.e(iF);
        int iN = qnh.n(iF);
        if (Math.abs(iE - iF) <= Math.abs(iN - iF)) {
            return qnh.h(iE);
        }
        return qnh.h(iN);
    }

    protected int getClosetMonthZeroUnixTime(float f2) {
        int iF = qnh.f((int) f2);
        int iO = qnh.o(iF);
        int iL = qnh.l(iF);
        if (Math.abs(iO - iF) <= Math.abs(iL - iF)) {
            return qnh.h(iO);
        }
        return qnh.h(iL);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public int getMonthDaysOfMinTime() {
        if (this.mUnixChartType != UnixChartType.MONTH) {
            return 0;
        }
        return qnh.h(TimeUnit.MINUTES.toMillis(qnh.f((int) this.mRangeBoardMin)));
    }

    protected int getClosetWeekZeroUnixTime(float f2) {
        int iF = qnh.f((int) f2);
        int iP = qnh.p(iF);
        int iK = qnh.k(iF);
        if (Math.abs(iP - iF) <= Math.abs(iK - iF)) {
            return qnh.h(iP);
        }
        return qnh.h(iK);
    }

    protected int getClosetYearZeroUnixTime(float f2) {
        int iF = qnh.f((int) f2);
        int iQ = qnh.q(iF);
        int iS = qnh.s(iF);
        if (Math.abs(iQ - iF) <= Math.abs(iS - iF)) {
            return qnh.h(iQ);
        }
        return qnh.h(iS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean blinkToUnixTime(int i2) {
        return enableChangeToUnixTimeOnlyX(i2, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.4
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
                HwHealthBaseScrollBarLineChart.this.animateBorderYAuto(2);
            }
        }, this.mDefaultAnimateValueTransfer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean blinkToUnixTime(int i2, AnimateValueTransfer animateValueTransfer) {
        return enableChangeToUnixTimeOnlyX(i2, new HwHealthBaseScrollBarLineChart<T>.b() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.5
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.b
            public void c() {
                super.c();
                HwHealthBaseScrollBarLineChart.this.animateBorderYAuto(2);
            }
        }, animateValueTransfer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void scrollPagerToUnixTimeOnlyX(int i2, HwHealthBaseScrollBarLineChart<T>.b bVar) {
        scrollPagerToUnixTimeOnlyX(i2, bVar, 300, this.mDefaultAnimateValueTransfer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean scrollPagerToUnixTimeOnlyX(int i2, HwHealthBaseScrollBarLineChart<T>.b bVar, int i3, AnimateValueTransfer animateValueTransfer) {
        if (bVar == 0 || animateValueTransfer == null) {
            LogUtil.e(TAG, "scrollPagerToUnixTimeOnlyX scrollPagerAnimateListener == null || animateValueTransfer == null");
            return false;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        float f2 = i2;
        if (Math.abs(this.mRangeBoardMin - f2) < 1.0f) {
            bVar.c();
            return false;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        float f3 = this.mRangeBoardMin;
        boolean z = this.mUnixChartType == UnixChartType.DAY;
        if (!(this.mXAxis instanceof qmn)) {
            LogUtil.j(TAG, "scrollPagerToUnixTimeOnlyX mXAxis not instanceof HwHealthXAxis");
            return false;
        }
        AsyncSelectorMultiRun selectorMultiRun = getSelectorMultiRun(bVar, z);
        AsyncSelectorMultiRun.c cVar = new AsyncSelectorMultiRun.c();
        selectorMultiRun.add(cVar);
        Matrix matrix = new Matrix();
        matrix.set(this.mViewPortHandler.getMatrixTouch());
        AsyncSelectorMultiRun.c cVar2 = new AsyncSelectorMultiRun.c();
        selectorMultiRun.add(cVar2);
        setAnimatorPagerChange(animateValueTransfer, matrix, getMonthShowRange(i2), Math.abs(f2 - f3), f2 >= this.mRangeBoardMin, i3, selectorMultiRun, cVar2);
        selectorMultiRun.run();
        selectorMultiRun.actionEnd(cVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean enableChangeToUnixTimeOnlyX(int i2, HwHealthBaseScrollBarLineChart<T>.b bVar, AnimateValueTransfer animateValueTransfer) {
        this.mOnScrollPagerAnimateMgr.e(bVar);
        return scrollPagerToUnixTimeOnlyX(i2, bVar, 0, animateValueTransfer);
    }

    private e getMonthShowRange(int i2) {
        boolean zIsInPagerPosition = isInPagerPosition(i2);
        e eVar = new e();
        if (zIsInPagerPosition && this.mUnixChartType == UnixChartType.MONTH) {
            eVar.f23662b = true;
            eVar.f23663c = qnh.c(((long) ((int) (this.mRangeBoardMax - this.mRangeBoardMin))) * 60000);
            eVar.d = qnh.h(((long) i2) * 60000);
            eVar.f23661a = eVar.f23663c * (1.0f / eVar.d);
        }
        return eVar;
    }

    private AsyncSelectorMultiRun getSelectorMultiRun(final HwHealthBaseScrollBarLineChart<T>.b bVar, final boolean z) {
        if (z) {
            ((qmn) this.mXAxis).b(true);
        }
        return new AsyncSelectorMultiRun(new Handler(Looper.getMainLooper())) { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.1
            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onFailed(int i2) {
                HwHealthBaseScrollBarLineChart.this.isFailed(z);
            }

            @Override // com.huawei.ui.commonui.linechart.utils.AsyncSelectorMultiRun
            public void onSuccess() {
                bVar.c();
                if (z) {
                    ((qmn) HwHealthBaseScrollBarLineChart.this.mXAxis).b(false);
                    HwHealthBaseScrollBarLineChart.this.invalidateForce();
                }
            }
        };
    }

    public void setPagerNoMoreListener(PagerNoMoreListener pagerNoMoreListener) {
        this.mPagerNoMoreListener = pagerNoMoreListener;
    }

    private void setAnimatorPagerChange(final AnimateValueTransfer animateValueTransfer, final Matrix matrix, final e eVar, final float f2, final boolean z, int i2, final AsyncSelectorMultiRun asyncSelectorMultiRun, final AsyncSelectorMultiRun.c cVar) {
        this.mAnimatorPagerChange.e(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fTransferValue = animateValueTransfer.transferValue(HwHealthBaseScrollBarLineChart.this.mAnimatorPagerChange.c());
                Matrix matrix2 = new Matrix();
                matrix2.set(matrix);
                if (eVar.f23662b) {
                    matrix2.postScale(((eVar.f23661a - 1.0f) * fTransferValue) + 1.0f, 1.0f, 0.0f, 0.0f);
                }
                if (!(HwHealthBaseScrollBarLineChart.this.getViewPortHandler() instanceof HwHealthViewPortHandler)) {
                    LogUtil.j(HwHealthBaseScrollBarLineChart.TAG, "getViewPortHandler() not instanceof HwHealthViewPortHandler");
                    return;
                }
                ((HwHealthViewPortHandler) HwHealthBaseScrollBarLineChart.this.getViewPortHandler()).c(matrix2);
                float[] fArr = {0.0f, 0.0f, f2, 0.0f};
                HwHealthBaseScrollBarLineChart.this.getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pointValuesToPixel(fArr);
                float fAbs = Math.abs(fArr[2] - fArr[0]);
                if ((!qmh.e(HwHealthBaseScrollBarLineChart.this.getContext()) && z) || (qmh.e(HwHealthBaseScrollBarLineChart.this.getContext()) && !z)) {
                    matrix2.postTranslate((-fAbs) * fTransferValue, 0.0f);
                } else {
                    matrix2.postTranslate(fAbs * fTransferValue, 0.0f);
                }
                ((HwHealthViewPortHandler) HwHealthBaseScrollBarLineChart.this.getViewPortHandler()).c(matrix2);
                HwHealthBaseScrollBarLineChart.this.postInvalidate();
                if (fTransferValue == 1.0f) {
                    asyncSelectorMultiRun.actionEnd(cVar);
                }
            }
        }, i2);
    }

    public int getCurrentPagerStartX() {
        if (this.mUnixChartType == UnixChartType.DAY) {
            return qnh.h(qnh.e(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.WEEK) {
            return qnh.h(qnh.p(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.MONTH) {
            return qnh.h(qnh.o(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.YEAR) {
            return qnh.h(qnh.q(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.ALL) {
            return qnh.h(qnh.a(qnh.f((int) this.mRangeBoardMin)));
        }
        LogUtil.e(TAG, "error mUnixChartType: ", this.mUnixChartType);
        return qnh.h(qnh.e(qnh.f((int) this.mRangeBoardMin)));
    }

    /* JADX INFO: renamed from: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f23635c;

        static {
            int[] iArr = new int[UnixChartType.values().length];
            f23635c = iArr;
            try {
                iArr[UnixChartType.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23635c[UnixChartType.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23635c[UnixChartType.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23635c[UnixChartType.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23635c[UnixChartType.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int getCurrentPagerStartX(long j) {
        int iB;
        int i2 = AnonymousClass10.f23635c[this.mUnixChartType.ordinal()];
        if (i2 == 1) {
            iB = qnh.b(j);
        } else if (i2 == 2) {
            iB = qnh.o(j);
        } else if (i2 == 3) {
            iB = qnh.i(j);
        } else if (i2 == 4) {
            iB = qnh.t(j);
        } else {
            LogUtil.e(TAG, "error mUnixChartType: ", this.mUnixChartType);
            iB = 0;
        }
        return qnh.h(iB);
    }

    public int getNextPagerStartX() {
        if (this.mUnixChartType == UnixChartType.DAY) {
            return qnh.h(qnh.n(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.WEEK) {
            return qnh.h(qnh.k(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.MONTH) {
            return qnh.h(qnh.l(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.YEAR) {
            return qnh.h(qnh.s(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.ALL) {
            return qnh.h(qnh.m(qnh.f((int) this.mRangeBoardMin)));
        }
        throw new RuntimeException("unsupport showMode in getNextPagerStartX");
    }

    public int getLastPagerStartX() {
        if (this.mUnixChartType == UnixChartType.DAY) {
            return qnh.h(qnh.b(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.WEEK) {
            return qnh.h(qnh.i(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.MONTH) {
            return qnh.h(qnh.g(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.YEAR) {
            return qnh.h(qnh.j(qnh.f((int) this.mRangeBoardMin)));
        }
        if (this.mUnixChartType == UnixChartType.ALL) {
            return qnh.h(qnh.c(qnh.f((int) this.mRangeBoardMin)));
        }
        throw new RuntimeException("unsupport showMode in getLastPagerStartX");
    }

    private int correctRangeEdgeByDay(int i2) {
        int iF = qnh.f(i2);
        int iE = qnh.e(iF);
        int iN = qnh.n(iF);
        int iAbs = Math.abs(iE - iF);
        int iAbs2 = Math.abs(iN - iF);
        if (iAbs <= iAbs2) {
            return ((float) iAbs) < 5.0f ? qnh.h(iE) : i2;
        }
        return ((float) iAbs2) < 5.0f ? qnh.h(iN) : i2;
    }

    private int correctRangeEdgeByMonth(int i2) {
        int iF = qnh.f(i2);
        int iO = qnh.o(iF);
        int iL = qnh.l(iF);
        int iAbs = Math.abs(iO - iF);
        int iAbs2 = Math.abs(iL - iF);
        if (iAbs <= iAbs2) {
            return (((float) iAbs) * 1.0f) / ((float) qnh.a()) < 5.0f ? qnh.h(iO) : i2;
        }
        return (((float) iAbs2) * 1.0f) / ((float) qnh.a()) < 5.0f ? qnh.h(iL) : i2;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f23661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f23662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23663c;
        int d;

        private e() {
            this.f23662b = false;
            this.f23663c = 30;
            this.d = 30;
            this.f23661a = 1.0f;
        }
    }

    public boolean isSupportFling() {
        return this.mUnixChartType != UnixChartType.ALL;
    }

    public float[] getShowMinMaxRangeByRatio() {
        List dataSets = getData().getDataSets();
        if (njy.e(dataSets) || dataSets.get(0) == null) {
            return new float[]{0.0f, 0.0f};
        }
        IHwHealthBarLineDataSet iHwHealthBarLineDataSet = (IHwHealthBarLineDataSet) dataSets.get(0);
        return new float[]{iHwHealthBarLineDataSet.acquireShowRangeMinValue(this), iHwHealthBarLineDataSet.acquireShowRangeMaxValue(this)};
    }

    public void fillBuffer(ScrollAdapter.a aVar, OnDataFillCallback onDataFillCallback) {
        if (aVar == null) {
            LogUtil.e(TAG, "buffer is null");
            return;
        }
        int iB = aVar.b();
        int iE = aVar.e();
        int iC = aVar.c();
        int iD = aVar.d();
        HwHealthBaseBarLineData hwHealthBaseBarLineData = (HwHealthBaseBarLineData) getData();
        if (hwHealthBaseBarLineData == null) {
            LogUtil.e(TAG, "data is null");
            return;
        }
        List<T> dataSets = hwHealthBaseBarLineData.getDataSets();
        if (dataSets == 0) {
            LogUtil.e(TAG, "dataSets is null");
            return;
        }
        for (T t : dataSets) {
            t.fillSetByDatabase(BaseApplication.getContext(), this, new qmk(iB, iE, iC, iD, this.mScrollAdapter.queryShowMode(t), this.mScrollAdapter.queryDataInfos(t)), onDataFillCallback, this.mScrollAdapter.queryStorage(t));
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        if (this.mChartShowMode != ChartShowMode.SCROLL_MODE) {
            return super.getLowestVisibleX();
        }
        return this.mRangeBoardMin;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        if (this.mChartShowMode != ChartShowMode.SCROLL_MODE) {
            return super.getHighestVisibleX();
        }
        return this.mRangeBoardMax;
    }

    public void adsorbMarkerViewToSelectedDataByDataArea() {
        adsorbMarkerViewToSelectedDataByDataArea(true, new b());
    }

    public void adsorbMarkerViewToSelectedDataByDataArea(boolean z) {
        adsorbMarkerViewToSelectedDataByDataArea(z, new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void adsorbMarkerViewToSelectedDataByDataArea(boolean z, HwHealthBaseScrollBarLineChart<T>.b bVar) {
        if (bVar == 0) {
            LogUtil.e(TAG, "adsorbMarkerViewToSelectedDataByDataArea scrollPagerAnimateListener == null");
            return;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            bVar.c();
            return;
        }
        float[] floats = getFloats(bVar);
        if (floats == null) {
            LogUtil.e(TAG, "adsorbMarkerViewToSelectedDataByDataArea points == null");
            return;
        }
        qme hwHealthUnixBarDataSet = getHwHealthUnixBarDataSet(bVar, floats);
        if (hwHealthUnixBarDataSet == null) {
            LogUtil.j(TAG, "adsorbMarkerViewToSelectedDataByDataArea baseData == null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Highlight(this.mMarkerViewPosition.d, 0, -1));
        Entry entryForXValue = ((HwHealthBaseBarLineData) this.mData).getEntryForXValue(this.mIndicesToHighlight[0].getX(), this);
        if (!(entryForXValue instanceof HwEntrys)) {
            throw new RuntimeException("adsorb2SelectedDataByDataArea:entry not instanceof HwEntrys");
        }
        if (arrayList.size() == 0) {
            bVar.c();
            return;
        }
        float[] fArr = {((Highlight) arrayList.get(0)).getX(), 0.0f};
        this.mFirstAxisTransformer.pointValuesToPixel(fArr);
        if (!this.mViewPortHandler.isInBoundsX(fArr[0])) {
            bVar.c();
        } else if (getSelectedBarData(hwHealthUnixBarDataSet, ((HwEntrys) entryForXValue).getEntries()) == null) {
            bVar.c();
        } else {
            scrollMarkerViewToUnixTime(z, getEndUnixTime(hwHealthUnixBarDataSet), bVar);
        }
    }

    private int getEndUnixTime(qme qmeVar) {
        int i2 = (int) this.mMarkerViewPosition.d;
        int i3 = (int) this.mRangeBoardMax;
        if (i2 >= i3) {
            i2 = i3 - 1;
        }
        int i4 = (int) this.mRangeBoardMin;
        if (i2 <= i4) {
            i2 = i4 + 1;
        }
        return qnh.h(qmeVar.acquireRangeCenterValue(qnh.f(i2)));
    }

    private qme getHwHealthUnixBarDataSet(HwHealthBaseScrollBarLineChart<T>.b bVar, float[] fArr) {
        qme qmeVar;
        HwHealthBaseBarLineData hwHealthBaseBarLineData = (HwHealthBaseBarLineData) getData();
        if (hwHealthBaseBarLineData == null) {
            LogUtil.e(TAG, "getHwHealthUnixBarDataSet data null");
            return null;
        }
        List<T> dataSets = hwHealthBaseBarLineData.getDataSets();
        if (dataSets == 0) {
            LogUtil.e(TAG, "dataSets is null");
            return null;
        }
        Iterator it = dataSets.iterator();
        while (true) {
            if (!it.hasNext()) {
                qmeVar = null;
                break;
            }
            HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = (HwHealthBaseBarLineDataSet) it.next();
            if (hwHealthBaseBarLineDataSet instanceof qme) {
                qmeVar = (qme) hwHealthBaseBarLineDataSet;
                break;
            }
        }
        if (qmeVar == null) {
            bVar.c();
            return null;
        }
        if (this.mMarkerViewPosition == MARKER_VIEW_POSITION_UNSET) {
            bVar.c();
            return null;
        }
        this.mMarkerViewPosition.d = fArr[0];
        return qmeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float[] getFloats(HwHealthBaseScrollBarLineChart<T>.b bVar) {
        float[] fArr = {this.mMarkerViewPosition.f23619b, 0.0f};
        getTransformer(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY).pixelsToValue(fArr);
        if (!HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA.equals(this.mMarkerViewSlidingMode) && !HwHealthBaseBarLineChart.MarkerViewSlidingMode.FORCE_ACCORDING_DATA.equals(this.mMarkerViewSlidingMode)) {
            return fArr;
        }
        float nearestValueForXValue = ((HwHealthBaseBarLineData) this.mData).getNearestValueForXValue(fArr[0], this, this.mMarkerViewSlidingMode);
        if (Math.abs(nearestValueForXValue - fArr[0]) < 1.0E-6d) {
            bVar.c();
            return null;
        }
        scrollMarkerViewToUnixTime(true, Math.round(nearestValueForXValue), bVar);
        return null;
    }

    private HwEntrys.HwDataEntry getSelectedBarData(qme qmeVar, List<HwEntrys.HwDataEntry> list) {
        for (HwEntrys.HwDataEntry hwDataEntry : list) {
            if (hwDataEntry != null && hwDataEntry.getDataSet() == qmeVar) {
                return hwDataEntry;
            }
        }
        return null;
    }

    protected void scrollMarkerViewToUnixTime(boolean z, int i2, final HwHealthBaseScrollBarLineChart<T>.b bVar) {
        if (bVar == null) {
            LogUtil.e(TAG, "scrollMarkerViewToUnixTime scrollPagerAnimateListener == null");
            return;
        }
        this.mOnScrollPagerAnimateMgr.e(bVar);
        float[] fArr = {i2, 0.0f};
        this.mFirstAxisTransformer.pointValuesToPixel(fArr);
        final float f2 = fArr[0];
        final float f3 = this.mMarkerViewPosition.f23619b;
        if (f3 == f2) {
            bVar.c();
        } else if (z) {
            this.mAnimatorMarkerViewChange.e(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fC = HwHealthBaseScrollBarLineChart.this.mAnimatorMarkerViewChange.c();
                    HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = HwHealthBaseScrollBarLineChart.this;
                    float f4 = f3;
                    hwHealthBaseScrollBarLineChart.highlightValuePx(f4 + ((f2 - f4) * fC), false);
                    HwHealthBaseScrollBarLineChart.this.postInvalidate();
                    if (fC == 1.0f) {
                        bVar.c();
                    }
                }
            }, (int) ((Math.abs(f3 - f2) * 1000.0f) / HeartRateThresholdConfig.HEART_RATE_LIMIT));
        } else {
            bVar.c();
            highlightValuePx(f2, false);
        }
    }

    public void focusArea(List<qmj> list) {
        if (this.mRenderer instanceof IHwHealthDataRender) {
            ((IHwHealthDataRender) this.mRenderer).focusArea(list);
        }
    }

    public void disableFocusArea() {
        if (this.mRenderer instanceof IHwHealthDataRender) {
            ((IHwHealthDataRender) this.mRenderer).disableFocusArea();
        }
    }

    @Override // android.view.View
    public void setWillNotDraw(boolean z) {
        super.setWillNotDraw(z);
        this.mIsDisableDrawSelf = z;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    protected boolean isNeedLoadingAnimation() {
        if (this.mChartShowMode == ChartShowMode.NORMAL) {
            return false;
        }
        if (this.mScrollAdapter == null) {
            return true;
        }
        return super.isNeedLoadingAnimation() && this.mScrollAdapter.isTotalClearInShowRange();
    }

    public void reflesh(long j) {
        this.mIsRefreshToExpectedTime = true;
        setShowRange(getCurrentPagerStartX(j), acquireScrollAdapter().acquireRange(j));
        updateMatrixTouch();
        refresh();
        highlightValue(acquireHighLightTimeStamp(j), false);
        invalidateForce();
    }

    public int acquireHighLightTimeStamp(long j) {
        int i2 = AnonymousClass10.f23635c[this.mUnixChartType.ordinal()];
        if (i2 == 2 || i2 == 3) {
            j = ltb.h(j);
        } else if (i2 == 4) {
            j = qnh.g(j);
        }
        return qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(j));
    }

    public boolean isMoveToLastDataStamp() {
        return this.mIsMoveToLastDataStamp;
    }

    public void setMoveToLastDataStamp(boolean z) {
        this.mIsMoveToLastDataStamp = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isFailed(boolean z) {
        if (z) {
            ((qmn) this.mXAxis).b(false);
            invalidateForce();
        }
    }

    public void resetYaxisAnimateValue() {
        this.mAxisRendererFirstParty.g();
        this.mAxisRendererSecondParty.g();
        this.mAxisRendererThirdParty.g();
    }

    protected void success(HwHealthBaseScrollBarLineChart<T>.b bVar, boolean z, int i2) {
        bVar.c();
        if (z) {
            ((qmn) this.mXAxis).b(false);
            invalidateForce();
            if (this.mChartShowMode == ChartShowMode.SCROLL_SCALE_MODE) {
                setShowRange(i2, this.mShowRange);
                this.mViewPortHandler.getMatrixTouch().set(new Matrix());
            }
        }
    }
}
