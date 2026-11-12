package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepSpo2DayHolder;
import com.xiaomi.fitness.health.spo2.Spo2Utils;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.er5;
import defpackage.eri;
import defpackage.hak;
import defpackage.ni4;
import defpackage.pni;
import defpackage.q02;
import defpackage.r02;
import defpackage.rtr;
import defpackage.sbo;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u00101\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepSpo2DayHolder;", "", "", "initView", "()V", "", "startTime", "endTime", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "spo2Records", "updateChart", "(JJLjava/util/List;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "report", "updateTitle", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "updateReport", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Ljava/util/List;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "view", "<init>", "(Landroid/view/View;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepSpo2DayHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSpo2DayHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepSpo2DayHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1863#2,2:203\n*S KotlinDebug\n*F\n+ 1 SleepSpo2DayHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepSpo2DayHolder\n*L\n140#1:203,2\n*E\n"})
public final class SleepSpo2DayHolder {

    @NotNull
    public static final String TAG = "SleepSpo2DayHolder";

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private q02<RecyclerBarEntry> chartAdapter;

    @Nullable
    private sbo chartItemDecoration;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private List<RecyclerBarEntry> entryList;

    @NotNull
    private final Context mContext;

    @NotNull
    private final View mRootView;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public SleepSpo2DayHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        View viewFindViewById = view.findViewById(eri.Z9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        initView();
    }

    private final void initView() {
        TextView textView = (TextView) this.mRootView.findViewById(eri.Bl);
        View viewFindViewById = this.mRootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById).setBackgroundDrawable(ni4.e(this.mContext, pni.i2));
        textView.setText(c0j.Rd);
        this.dataTitleView = (DataTitleView) this.mRootView.findViewById(eri.H2);
        BarChartRecyclerView barChartRecyclerView = (BarChartRecyclerView) this.mRootView.findViewById(eri.g0);
        this.barChartRecyclerView = barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        this.yAxis = new rtr(this.barChartAttrs);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, xqrVar);
        this.xAxis = vqrVar;
        this.chartItemDecoration = new sbo(this.yAxis, vqrVar, this.barChartAttrs);
        er5 er5Var = new er5(0, true);
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.setHighLightValueFormatter(er5Var);
        this.chartAdapter = new q02<>(this.mContext, this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, er5Var);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setAdapter(this.chartAdapter);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        sbo sboVar2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar2);
        barChartRecyclerView3.addItemDecoration(sboVar2);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(this.mContext, this.barChartAttrs));
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(new hak(this.mContext, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepSpo2DayHolder.initView.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = SleepSpo2DayHolder.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView);
                    dataTitleView.setVisibility(0);
                } else {
                    DataTitleView dataTitleView2 = SleepSpo2DayHolder.this.dataTitleView;
                    Intrinsics.checkNotNull(dataTitleView2);
                    dataTitleView2.setVisibility(4);
                }
            }
        }));
    }

    private final void updateChart(long startTime, long endTime, List<TimesDataRecordInt> spo2Records) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = startTime;
        int i2 = 0;
        while (j < endTime) {
            linkedHashMap.put(Long.valueOf(((long) (i2 * 1800)) + startTime), new ArrayList());
            i2++;
            j = ((long) (i2 * 1800)) + startTime;
        }
        int size = linkedHashMap.size();
        Logger.i(TAG, "displayNumbers:" + size);
        if (size == 0) {
            this.mRootView.setVisibility(8);
            return;
        }
        for (TimesDataRecordInt timesDataRecordInt : spo2Records) {
            List list = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (list != null) {
                list.addAll(SpO2DataUtil.INSTANCE.convertToIntegerListAndFilterZero(timesDataRecordInt.getValueArray()));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            long j2 = ((long) (i3 * 1800)) + startTime;
            List<Integer> arrayList2 = (List) linkedHashMap.get(Long.valueOf(j2));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            r02 r02Var = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            int i4 = r02Var.g0;
            r02 r02Var2 = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(1, arrayList2, i4, r02Var2.g0), 1);
            segmentBarEntry.timestamp = j2;
            segmentBarEntry.localDate = TimeDateUtil.timestampToLocalDate(j2);
            segmentBarEntry.type = 3;
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
        }
        final Function2 function2 = new Function2() { // from class: izm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepSpo2DayHolder.updateChart$lambda$1((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: jzm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepSpo2DayHolder.updateChart$lambda$2(function2, obj, obj2);
            }
        });
        List<RecyclerBarEntry> list2 = this.entryList;
        Intrinsics.checkNotNull(list2);
        list2.clear();
        List<RecyclerBarEntry> list3 = this.entryList;
        Intrinsics.checkNotNull(list3);
        list3.addAll(arrayList);
        vqr vqrVar = this.xAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        int theSpoMinNumber = Spo2Utils.INSTANCE.getTheSpoMinNumber(arrayList);
        float f = 85.0f;
        if (theSpoMinNumber <= 0 || theSpoMinNumber >= 85.0f) {
            i = 5;
        } else {
            f = (theSpoMinNumber / 10) * 10;
            i = 10;
        }
        r02 r02Var3 = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var3);
        r02Var3.E = 100.0f;
        r02 r02Var4 = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var4);
        r02Var4.F = f;
        rtr rtrVar = this.yAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(100.0f);
        rtr rtrVar2 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setAxisMinimum(f);
        rtr rtrVar3 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.d(3, i);
        rtr rtrVar4 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar4);
        rtrVar4.f = 3;
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.setYAxis(this.yAxis);
        sbo sboVar2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar2);
        sboVar2.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var2);
        q02Var2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateChart$lambda$1(SegmentBarEntry o1, SegmentBarEntry o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return Intrinsics.compare(o2.timestamp, o1.timestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateChart$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void updateTitle(SleepSegmentReport report) {
        StringBuilder sb;
        Logger.i(TAG, "max: " + report.getMaxSpo2() + ",min: " + report.getMinSpo2() + " ,avg " + report.getAvgSpo2());
        if (report.getAvgSpo2() == null) {
            return;
        }
        String strValueOf = String.valueOf(report.getAvgSpo2());
        DataTitleView dataTitleView = this.dataTitleView;
        Intrinsics.checkNotNull(dataTitleView);
        Context context = this.mContext;
        if (LocaleUtil.INSTANCE.isTR()) {
            sb = new StringBuilder();
            sb.append("%");
            sb.append(strValueOf);
        } else {
            sb = new StringBuilder();
            sb.append(strValueOf);
            sb.append(" %");
        }
        dataTitleView.a(context, sb.toString(), strValueOf, "");
    }

    public final void updateReport(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        List<TimesDataRecordInt> spo2Records = report.getSpo2Records();
        Integer numValueOf = spo2Records != null ? Integer.valueOf(spo2Records.size()) : null;
        Logger.i(TAG, "spo2 records size " + numValueOf + ",records " + report.getSpo2Records());
        if (!ArrayUtils.isEmpty(report.getSpo2Records()) && report.getAvgSpo2() != null) {
            Integer avgSpo2 = report.getAvgSpo2();
            Intrinsics.checkNotNull(avgSpo2);
            if (avgSpo2.intValue() > 0) {
                this.mRootView.setVisibility(0);
                this.mRootView.requestLayout();
                long bedTime = report.getBedTime();
                long wakeupTime = report.getWakeupTime();
                sbo sboVar = this.chartItemDecoration;
                Intrinsics.checkNotNull(sboVar);
                sboVar.d(bedTime, wakeupTime);
                List<TimesDataRecordInt> spo2Records2 = report.getSpo2Records();
                Intrinsics.checkNotNull(spo2Records2);
                updateChart(bedTime, wakeupTime, spo2Records2);
                updateTitle(report);
                return;
            }
        }
        this.mRootView.setVisibility(8);
        this.mRootView.requestLayout();
    }
}
