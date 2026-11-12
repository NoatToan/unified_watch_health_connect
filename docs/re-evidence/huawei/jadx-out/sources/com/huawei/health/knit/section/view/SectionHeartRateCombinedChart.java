package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.api.CombineChartRangeShowCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fok;
import defpackage.fpv;
import defpackage.njy;
import defpackage.qmj;
import defpackage.qnn;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionHeartRateCombinedChart<ChartT extends HwHealthBaseScrollBarLineChart> extends BaseSectionLineChart<ChartT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f7801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<qmj> f7802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ChartT f7803c;
    private List<ChartT> d;
    private ChartT e;
    private ChartT g;
    private ChartT h;
    private List<qmj> i;

    public SectionHeartRateCombinedChart(Context context) {
        this(context, null);
    }

    public SectionHeartRateCombinedChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionHeartRateCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new ArrayList(16);
        this.f7802b = new ArrayList(16);
        this.d = new ArrayList();
        this.f7801a = new Observer() { // from class: com.huawei.health.knit.section.view.SectionHeartRateCombinedChart.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                Object obj;
                LogUtil.a("SectionHeartRateCombinedChart", "refresh chart notify");
                if (!SectionHeartRateCombinedChart.this.getObserverLabel().equals(str) || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                    return;
                }
                SectionHeartRateCombinedChart.this.mCardIndex = ((Integer) obj).intValue();
                fpv fpvVar = new fpv();
                fpvVar.c(SectionHeartRateCombinedChart.this.mCardIndex);
                SectionHeartRateCombinedChart.this.mCombineChartRangeShowCallback.onRangeChange(fpvVar);
                SectionHeartRateCombinedChart sectionHeartRateCombinedChart = SectionHeartRateCombinedChart.this;
                sectionHeartRateCombinedChart.mCurrentChart = (ChartT) sectionHeartRateCombinedChart.acquireCurrentChart(sectionHeartRateCombinedChart.mCardIndex);
                if (DataInfos.HeartRateDayDetail == SectionHeartRateCombinedChart.this.mDataInfos) {
                    SectionHeartRateCombinedChart sectionHeartRateCombinedChart2 = SectionHeartRateCombinedChart.this;
                    sectionHeartRateCombinedChart2.e(sectionHeartRateCombinedChart2.mCardIndex);
                } else if (DataInfos.HeartRateWeekDetail == SectionHeartRateCombinedChart.this.mDataInfos) {
                    SectionHeartRateCombinedChart sectionHeartRateCombinedChart3 = SectionHeartRateCombinedChart.this;
                    sectionHeartRateCombinedChart3.d(sectionHeartRateCombinedChart3.mCardIndex);
                } else if (DataInfos.HeartRateMonthDetail == SectionHeartRateCombinedChart.this.mDataInfos || DataInfos.HeartRateYearDetail == SectionHeartRateCombinedChart.this.mDataInfos) {
                    SectionHeartRateCombinedChart sectionHeartRateCombinedChart4 = SectionHeartRateCombinedChart.this;
                    sectionHeartRateCombinedChart4.a(sectionHeartRateCombinedChart4.mCardIndex);
                } else {
                    LogUtil.a("SectionHeartRateCombinedChart", "mDataInfos is invalid");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 0) {
            this.f7803c.disableManualReferenceLine();
            attachChartToViewPager(this.f7803c);
            return;
        }
        if (i == 1) {
            Paint paint = new Paint();
            paint.setStrokeWidth(qrs.d(BaseApplication.getContext(), 2.0f));
            paint.setColor(Color.argb(255, 252, 49, 89));
            paint.setStyle(Paint.Style.STROKE);
            this.e.enableManualReferenceLine(0, paint, true);
            this.e.reCalculateDynamicBoardForManualRefLine();
            attachChartToViewPager(this.e);
            return;
        }
        if (i == 2) {
            this.h.disableManualReferenceLine();
            this.h.focusArea(this.i);
            attachChartToViewPager(this.h);
        } else {
            if (i == 3) {
                this.g.disableManualReferenceLine();
                this.g.focusArea(this.f7802b);
                attachChartToViewPager(this.g);
                return;
            }
            LogUtil.a("SectionHeartRateCombinedChart", "cardIndex is invalid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == 0) {
            attachChartToViewPager(this.f7803c);
            return;
        }
        if (i == 1) {
            ChartT chartt = this.e;
            if (chartt instanceof HwHealthCombinedChart) {
                ((HwHealthCombinedChart) chartt).c();
            }
            attachChartToViewPager(this.e);
            return;
        }
        if (i == 2) {
            ChartT chartt2 = this.h;
            if (chartt2 instanceof HwHealthCombinedChart) {
                ((HwHealthCombinedChart) chartt2).d();
                ((HwHealthCombinedChart) this.h).e();
            }
            attachChartToViewPager(this.h);
            return;
        }
        if (i == 3) {
            ChartT chartt3 = this.g;
            if (chartt3 instanceof HwHealthCombinedChart) {
                ((HwHealthCombinedChart) chartt3).d();
                ((HwHealthCombinedChart) this.g).e();
            }
            attachChartToViewPager(this.g);
            return;
        }
        LogUtil.a("SectionHeartRateCombinedChart", "cardIndex is invalid");
    }

    private void c(ChartT chartt, int i) {
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(this.mDataInfos);
        cVar.e(c(i));
        this.mChartHolder.addDataLayer(chartt, cVar);
        if (chartt != null) {
            chartt.setWillNotDraw(false);
            HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = chartt.acquireScrollAdapter();
            scrollAdapterInterfaceAcquireScrollAdapter.setFlag(scrollAdapterInterfaceAcquireScrollAdapter.getFlag() | 1);
            chartt.resetYaxisAnimateValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            attachChartToViewPager(this.f7803c);
            return;
        }
        if (i == 1) {
            ChartT chartt = this.e;
            if (chartt instanceof HwHealthCombinedChart) {
                ((HwHealthCombinedChart) chartt).c();
            }
            attachChartToViewPager(this.e);
            return;
        }
        if (i == 2) {
            ChartT chartt2 = this.h;
            if (chartt2 instanceof HwHealthCombinedChart) {
                chartt2.focusArea(this.i);
                ((HwHealthCombinedChart) this.h).d();
                ((HwHealthCombinedChart) this.h).e();
            }
            attachChartToViewPager(this.h);
            return;
        }
        if (i == 3) {
            ChartT chartt3 = this.g;
            if (chartt3 instanceof HwHealthCombinedChart) {
                chartt3.focusArea(this.f7802b);
                ((HwHealthCombinedChart) this.g).d();
                ((HwHealthCombinedChart) this.g).e();
            }
            attachChartToViewPager(this.g);
            return;
        }
        LogUtil.a("SectionHeartRateCombinedChart", "cardIndex is invalid");
    }

    protected String getObserverLabel() {
        return fok.b(this.mDataInfos);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected ChartT acquireCurrentChart(int i) {
        LogUtil.a("SectionHeartRateCombinedChart", "acquireCurrentChart");
        if (njy.c(this.d, i)) {
            return this.d.get(i);
        }
        return null;
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    public void bindExtraParamsToView(HashMap<String, Object> map) {
        qsp.e(this.mHorizontalBtn, qqw.c(map, "HORIZONTAL_BTN", R.drawable.ic_public_chart_fullscreen));
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        if (this.mDataInfos != null && this.mDataInfos == DataInfos.HeartRateDayDetail) {
            qsp.c((View) this.mHorizontalBtn, 0);
            this.mHorizontalBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionHeartRateCombinedChart.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (onClickSectionListenerC != null) {
                        ObserverManagerUtil.e("SECTION_CHART", SectionHeartRateCombinedChart.this.acquireCurrentChart(0));
                        onClickSectionListenerC.onClick("HORIZONTAL_BTN");
                    }
                }
            });
        }
        ObserverManagerUtil.d(this.f7801a, getObserverLabel());
        List<ChartT> list = (List) qqw.a(map, "SECTION_CHART", (Class<Object>) List.class, (Object) null);
        this.d = list;
        c(list);
        initChart(acquireCurrentChart(1), 1);
        c(acquireCurrentChart(1), 1);
        initChart(acquireCurrentChart(2), 2);
        c(acquireCurrentChart(2), 2);
        initChart(acquireCurrentChart(3), 3);
        c(acquireCurrentChart(3), 3);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void addDataLayer(IChartLayerHolder iChartLayerHolder, ChartT chartt, int i) {
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(this.mDataInfos);
        cVar.e(c(i));
        iChartLayerHolder.addDataLayer(chartt, cVar);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    public void onCardRangeShow(ChartT chartt, CombineChartRangeShowCallback combineChartRangeShowCallback, long j) {
        float f;
        float f2;
        int i = 0;
        Object obj = chartt.getData().getDataSets().get(0);
        int i2 = 2;
        int i3 = 1;
        if (obj instanceof HwHealthLineDataSet) {
            List<T> listAcquireEntryVals = ((HwHealthLineDataSet) obj).acquireEntryVals();
            float fAcquireShowRangeMinimum = chartt.acquireShowRangeMinimum();
            float fAcquireShowRangeMaximum = chartt.acquireShowRangeMaximum();
            ArrayList arrayList = new ArrayList();
            for (T t : listAcquireEntryVals) {
                if (t != null) {
                    if (fAcquireShowRangeMaximum - fAcquireShowRangeMinimum < 1440.0f) {
                        Date date = new Date((((long) fAcquireShowRangeMinimum) * 60000) + 1388505600000L);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        int i4 = calendar.get(i3);
                        int i5 = calendar.get(i2);
                        int i6 = calendar.get(5);
                        Date date2 = new Date((((long) t.getX()) * 60000) + 1388505600000L);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date2);
                        int i7 = calendar2.get(1);
                        int i8 = calendar2.get(2);
                        int i9 = calendar2.get(5);
                        if (i4 == i7 && i5 == i8 && i6 == i9) {
                            arrayList.add(t);
                        }
                    } else if (t.getX() >= fAcquireShowRangeMinimum && t.getX() <= fAcquireShowRangeMaximum) {
                        arrayList.add(t);
                    }
                    i = 0;
                    i2 = 2;
                    i3 = 1;
                }
            }
        }
        int i10 = i;
        float[] showMinMaxRangeByRatio = new float[i10];
        if (this.mDataInfos == DataInfos.HeartRateDayDetail) {
            showMinMaxRangeByRatio = chartt.getShowMinMaxRangeByRatio();
        }
        if (showMinMaxRangeByRatio == null || showMinMaxRangeByRatio.length != 2) {
            f = Float.MIN_VALUE;
            f2 = Float.MAX_VALUE;
        } else {
            f2 = showMinMaxRangeByRatio[i10];
            f = showMinMaxRangeByRatio[1];
        }
        LogUtil.a("SectionHeartRateCombinedChart", "Min: " + f2 + ", Max: " + f);
        String str = (f >= f2 && f2 > 0.0f) ? UnitUtil.e(f2, 1, 0) + Constants.LINK + UnitUtil.e(f, 1, 0) : "--";
        if (combineChartRangeShowCallback != null) {
            fpv fpvVar = new fpv();
            fpvVar.c(this.mCardIndex);
            fpvVar.a(str);
            combineChartRangeShowCallback.onRangeChange(fpvVar);
        }
    }

    private void c(List<ChartT> list) {
        this.f7803c = njy.c(list, 0) ? list.get(0) : null;
        this.e = njy.c(list, 1) ? list.get(1) : null;
        this.h = njy.c(list, 2) ? list.get(2) : null;
        this.g = njy.c(list, 3) ? list.get(3) : null;
    }

    private String c(int i) {
        if (i == 0) {
            return HwHealthChartHolder.LAYER_ID_NORMAL_HR;
        }
        if (i == 1) {
            return HwHealthChartHolder.LAYER_ID_REST_HR;
        }
        if (i == 2) {
            return HwHealthChartHolder.LAYER_ID_WARNING_HR;
        }
        if (i == 3) {
            return HwHealthChartHolder.LAYER_ID_BRADYCARDIA;
        }
        LogUtil.c("SectionHeartRateCombinedChart", "layer id is wrong");
        throw new IllegalArgumentException("layer id is wrong");
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionHeartRateCombinedChart";
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected String parseEntry(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null) {
            return "--";
        }
        if (!(hwHealthBaseEntry instanceof HwHealthBarEntry)) {
            if (hwHealthBaseEntry.getY() == 0.0f) {
                return "--";
            }
            return a(hwHealthBaseEntry.getY());
        }
        HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) hwHealthBaseEntry;
        float fB = qnn.b(hwHealthBarEntry.acquireModel());
        float fD = qnn.d(hwHealthBarEntry.acquireModel());
        if (fB == 0.0f || fD == 0.0f) {
            return "--";
        }
        return e(fB, fD);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected void updateDateAndTime(String str, List<HwHealthMarkerView.d> list) {
        notifyCursorDateAndTime(str, list);
    }

    @Override // com.huawei.health.knit.section.view.BaseSectionLineChart
    protected DataInfos getJudgeDataInfos() {
        return DataInfos.HeartRateDayDetail;
    }

    public String e(float f, float f2) {
        return ((int) f) + Constants.LINK + ((int) f2);
    }

    public String a(float f) {
        return String.valueOf((int) f);
    }
}
