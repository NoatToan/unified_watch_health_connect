package com.huami.chart.cache;

import android.graphics.RectF;
import com.huami.chart.cache.HMDataCacheCenter;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.chart.util.ReportChartError;
import com.huami.tools.log.HMLog;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class HMDataCacheCenter {
    private static final String i = "HMDataCacheCenter";
    private static ExecutorService j = Executors.newCachedThreadPool();
    private ConcurrentHashMap<BaseIndex, RectF> a = new ConcurrentHashMap<>();
    private volatile float b = Float.NaN;
    private volatile float c = Float.NaN;
    private volatile float d = Float.NaN;
    private volatile float e = Float.NaN;
    private ICalculator f;
    private ICalculator g;
    private HMChart h;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int count = HMDataCacheCenter.this.h.getChartDataManager().getChartDataList().getCount() - 1; count >= 0; count--) {
                ChartData dataByDataIndex = HMDataCacheCenter.this.h.getChartDataManager().getDataByDataIndex(count);
                if (dataByDataIndex != null) {
                    HMDataCacheCenter.this.a.put(dataByDataIndex.getBaseIndex(), HMDataCacheCenter.this.m(dataByDataIndex));
                }
            }
        }
    }

    public HMDataCacheCenter(HMChart hMChart) {
        this.h = hMChart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF m(ChartData chartData) {
        return new RectF(this.f.getMappedValueByRaw(chartData.getBaseIndex().getStart()), this.g.getMappedValueByRaw(chartData.getSumValue()), this.f.getMappedValueByRaw(chartData.getBaseIndex().getEnd()), this.g.getMappedValueByRaw(0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n() {
        return "miValue " + this.h.getChartDataManager().getChartDataList().getMinValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o() {
        return "maxValue " + this.h.getChartDataManager().getChartDataList().getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String p() {
        return "start: " + this.h.getDrawAreaManager().getMarginBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String q() {
        return "end: " + (this.h.getDrawAreaManager().getHeight() - this.h.getDrawAreaManager().getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String r() {
        return "getFirstDataIndexPositionX " + this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s() {
        return "maxDataIndexPositionX " + this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t() {
        return "maxIndexPositionX " + this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u() {
        return "minIndexPositionX  " + this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v(StringBuilder sb) {
        return "fix catch exception..., error msg:" + ((Object) sb);
    }

    private void w(float f, float f2, Exception exc) {
        final StringBuilder sb = new StringBuilder();
        sb.append("error happened in activity : ");
        sb.append(this.h.getContext().getClass().getName());
        sb.append("; error message : ");
        sb.append(exc.getMessage());
        sb.append("; rawValueByMapped : " + f2);
        sb.append("; posX : " + f);
        ICalculator iCalculator = this.f;
        if (iCalculator == null || !(iCalculator instanceof Calculator)) {
            sb.append("; xCal : " + this.f);
        } else {
            Calculator calculator = (Calculator) iCalculator;
            sb.append("; mappedStart : " + calculator.mappedStart);
            sb.append("; mappedEnd : " + calculator.mappedEnd);
            sb.append("; start : " + calculator.start);
            sb.append("; end : " + calculator.end);
        }
        HMLog.error(i, new Function0() { // from class: wr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDataCacheCenter.v(sb);
            }
        });
        ReportChartError.manualReportError(new Exception(sb.toString(), exc));
    }

    public int binarySearchDataIndexByPosition(int i2, int i3, float f) {
        if (i3 - i2 <= 1) {
            ChartData dataByDataIndex = this.h.getChartDataManager().getDataByDataIndex(i2);
            if (dataByDataIndex == null) {
                return -1;
            }
            float realPositionByPosIndex = getRealPositionByPosIndex(dataByDataIndex.getStart());
            float realPositionByPosIndex2 = getRealPositionByPosIndex(dataByDataIndex.getEnd());
            if (f < realPositionByPosIndex - this.h.getDrawAreaManager().getHalfDataWidth() || f >= realPositionByPosIndex2 + this.h.getDrawAreaManager().getHalfDataWidth()) {
                return -1;
            }
            return i2;
        }
        int i4 = (i2 + i3) / 2;
        ChartData dataByDataIndex2 = this.h.getChartDataManager().getDataByDataIndex(i4);
        if (dataByDataIndex2 == null) {
            return -1;
        }
        float realPositionByPosIndex3 = getRealPositionByPosIndex(dataByDataIndex2.getStart());
        float realPositionByPosIndex4 = getRealPositionByPosIndex(dataByDataIndex2.getEnd());
        float halfDataWidth = this.h.getDrawAreaManager().getHalfDataWidth();
        float f2 = realPositionByPosIndex3 - halfDataWidth;
        if (f >= f2 && f < realPositionByPosIndex4 + halfDataWidth) {
            return i4;
        }
        if (f >= realPositionByPosIndex4 + halfDataWidth) {
            return binarySearchDataIndexByPosition(i4, i3, f);
        }
        if (f < f2) {
            return binarySearchDataIndexByPosition(i2, i4, f);
        }
        return -1;
    }

    public int binarySearchMultiDataIndexByPosition(int i2, int i3, float f, ChartDataList chartDataList) {
        if (i3 - i2 <= 1) {
            ChartData dataByDataIndex = chartDataList.getDataByDataIndex(i2);
            if (dataByDataIndex == null) {
                return -1;
            }
            float realPositionByPosIndex = getRealPositionByPosIndex(dataByDataIndex.getStart());
            float realPositionByPosIndex2 = getRealPositionByPosIndex(dataByDataIndex.getEnd());
            if (f < realPositionByPosIndex - this.h.getDrawAreaManager().getHalfDataWidth() || f >= realPositionByPosIndex2 + this.h.getDrawAreaManager().getHalfDataWidth()) {
                return -1;
            }
            return i2;
        }
        int i4 = (i2 + i3) / 2;
        ChartData dataByDataIndex2 = chartDataList.getDataByDataIndex(i4);
        if (dataByDataIndex2 == null) {
            return -1;
        }
        float realPositionByPosIndex3 = getRealPositionByPosIndex(dataByDataIndex2.getStart());
        float realPositionByPosIndex4 = getRealPositionByPosIndex(dataByDataIndex2.getEnd());
        float halfDataWidth = this.h.getDrawAreaManager().getHalfDataWidth();
        float f2 = realPositionByPosIndex3 - halfDataWidth;
        if (f >= f2 && f < realPositionByPosIndex4 + halfDataWidth) {
            return i4;
        }
        if (f >= realPositionByPosIndex4 + halfDataWidth) {
            return binarySearchMultiDataIndexByPosition(i4, i3, f, chartDataList);
        }
        if (f < f2) {
            return binarySearchMultiDataIndexByPosition(i2, i4, f, chartDataList);
        }
        return -1;
    }

    public int binarySearchPositionIndexByPosition(int i2, int i3, float f) {
        if (i3 - i2 <= 1) {
            return i2;
        }
        int i4 = (i2 + i3) / 2;
        float positionByPosIndex = getPositionByPosIndex(i4);
        if (f > positionByPosIndex) {
            return binarySearchPositionIndexByPosition(i4, i3, f);
        }
        return f == positionByPosIndex ? i4 : binarySearchPositionIndexByPosition(i2, i4, f);
    }

    public void calculate() {
        int shownCount = this.h.getChartDataManager().getChartDataList().getShownCount();
        if (shownCount == 0) {
            shownCount = (this.h.getChartDataManager().getChartDataList().getEnd() - this.h.getChartDataManager().getChartDataList().getStart()) + 1;
        }
        Builder mappedEnd = new Builder().setStart(this.h.getChartDataManager().getChartDataList().getStart()).setEnd((this.h.getChartDataManager().getChartDataList().getStart() + shownCount) - 1).setMappedStart(this.h.getDrawAreaManager().getLeft()).setMappedEnd(this.h.getDrawAreaManager().getRight());
        Builder mappedEnd2 = new Builder().setStart(this.h.getChartDataManager().getChartDataList().getMinValue()).setEnd(this.h.getChartDataManager().getChartDataList().getMaxValue()).setMappedStart(this.h.getDrawAreaManager().getMarginBottom()).setMappedEnd(this.h.getDrawAreaManager().getHeight() - this.h.getDrawAreaManager().getTop());
        String str = i;
        HMLog.verbose(str, new Function0() { // from class: vr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.n();
            }
        });
        HMLog.verbose(str, new Function0() { // from class: tr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.o();
            }
        });
        HMLog.verbose(str, new Function0() { // from class: ur2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.p();
            }
        });
        HMLog.verbose(str, new Function0() { // from class: pr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.q();
            }
        });
        if (ChartUtil.isRtl(this.h)) {
            this.f = new RTLLinearCalculator(mappedEnd);
        } else {
            this.f = new LinearCalculator(mappedEnd);
        }
        this.g = new LinearCalculator(mappedEnd2);
        this.b = this.f.getMappedValueByRaw(this.h.getChartDataManager().getChartDataList().getStart());
        this.c = this.f.getMappedValueByRaw(this.h.getChartDataManager().getChartDataList().getEnd());
        if (this.h.getChartDataManager().getChartDataList().getCount() > 0) {
            this.d = this.f.getMappedValueByRaw(this.h.getChartDataManager().getChartDataList().getLastData().getEnd());
            this.e = this.f.getMappedValueByRaw(this.h.getChartDataManager().getChartDataList().getFirstData().getStart());
        }
        j.execute(new a());
    }

    public void clear() {
    }

    public RectF getCacheRectByDataIndex(int i2) {
        ChartData dataByDataIndex = this.h.getChartDataManager().getDataByDataIndex(i2);
        RectF rectF = this.a.get(dataByDataIndex.getBaseIndex());
        return rectF == null ? m(dataByDataIndex) : rectF;
    }

    public float getFirstDataIndexPositionX() {
        HMLog.verbose(i, new Function0() { // from class: sr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.r();
            }
        });
        return this.e;
    }

    public Index getIndexByPosition(float f, float f2) {
        int iIntValue;
        Index index = new Index();
        try {
            iIntValue = new BigDecimal(this.f.getRawValueByMapped(f)).setScale(0, 4).intValue();
        } catch (Exception e) {
            w(f, 0.0f, e);
            iIntValue = 0;
        }
        index.setPosiIndex(new BaseIndex(iIntValue));
        if (ChartUtil.isRtl(this.h)) {
            f = (((Calculator) this.f).getMappedEnd() + ((Calculator) this.f).getMappedStart()) - f;
        }
        index.setDataIndex(binarySearchDataIndexByPosition(0, this.h.getChartDataManager().getChartDataList().getCount(), f));
        return index;
    }

    public float getLastDataIndexPositionX() {
        HMLog.verbose(i, new Function0() { // from class: qr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.s();
            }
        });
        return this.d;
    }

    public float getMaxIndexPositionX() {
        HMLog.verbose(i, new Function0() { // from class: rr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.t();
            }
        });
        return this.c;
    }

    public float getMinIndexPositionX() {
        HMLog.verbose(i, new Function0() { // from class: or2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.u();
            }
        });
        return this.b;
    }

    public Index getMultiIndexByPosition(float f, float f2, ChartDataList chartDataList) {
        int iIntValue;
        Index index = new Index();
        try {
            iIntValue = new BigDecimal(this.f.getRawValueByMapped(f)).setScale(0, 4).intValue();
        } catch (Exception e) {
            w(f, 0.0f, e);
            iIntValue = 0;
        }
        index.setPosiIndex(new BaseIndex(iIntValue));
        if (ChartUtil.isRtl(this.h)) {
            f = (((Calculator) this.f).getMappedEnd() + ((Calculator) this.f).getMappedStart()) - f;
        }
        index.setDataIndex(binarySearchMultiDataIndexByPosition(0, chartDataList.getCount(), f, chartDataList));
        return index;
    }

    public float getPositionByPosIndex(int i2) {
        return this.f.getMappedValueByRaw(i2);
    }

    public float getPositionByValue(float f) {
        return this.g.getMappedValueByRaw(f);
    }

    public float getRealPositionByPosIndex(int i2) {
        return ChartUtil.isRtl(this.h) ? this.f.getRealMappedValueByRaw(i2) : getPositionByPosIndex(i2);
    }

    public float getScaleX() {
        return this.f.getScale();
    }

    public float getScaleY() {
        return this.g.getScale();
    }
}
