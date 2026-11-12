package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.content.res.Resources;
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
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepHeartRateDayHolder;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hak;
import defpackage.ni4;
import defpackage.pni;
import defpackage.q02;
import defpackage.qxi;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u00101\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepHeartRateDayHolder;", "", "", "initView", "()V", "", "startTime", "endTime", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "hrmRecords", "updateChart", "(JJLjava/util/List;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "report", "updateTitle", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "updateReport", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Ljava/util/List;", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "view", "<init>", "(Landroid/view/View;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepHeartRateDayHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHeartRateDayHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepHeartRateDayHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1863#2,2:187\n*S KotlinDebug\n*F\n+ 1 SleepHeartRateDayHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepHeartRateDayHolder\n*L\n137#1:187,2\n*E\n"})
public final class SleepHeartRateDayHolder {

    @NotNull
    public static final String TAG = "SleepHeartRateDayHolder";
    private r02 barChartAttrs;
    private BarChartRecyclerView barChartRecyclerView;
    private q02<RecyclerBarEntry> chartAdapter;
    private sbo chartItemDecoration;
    private DataTitleView dataTitleView;
    private List<RecyclerBarEntry> entryList;

    @NotNull
    private final Context mContext;

    @NotNull
    private final View mRootView;
    private vqr xAxis;
    private rtr yAxis;

    public SleepHeartRateDayHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        View viewFindViewById = view.findViewById(eri.V9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        initView();
    }

    private final void initView() {
        List<RecyclerBarEntry> list;
        BarChartRecyclerView barChartRecyclerView;
        vqr vqrVar;
        r02 r02Var;
        TextView textView = (TextView) this.mRootView.findViewById(eri.Bl);
        View viewFindViewById = this.mRootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById).setBackgroundDrawable(ni4.e(this.mContext, pni.S1));
        textView.setText(c0j.Q);
        this.dataTitleView = (DataTitleView) this.mRootView.findViewById(eri.H2);
        BarChartRecyclerView barChartRecyclerView2 = (BarChartRecyclerView) this.mRootView.findViewById(eri.Ea);
        this.barChartRecyclerView = barChartRecyclerView2;
        BarChartRecyclerView barChartRecyclerView3 = null;
        if (barChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView2 = null;
        }
        this.barChartAttrs = (r02) barChartRecyclerView2.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        r02 r02Var2 = this.barChartAttrs;
        if (r02Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var2 = null;
        }
        this.yAxis = new rtr(r02Var2);
        r02 r02Var3 = this.barChartAttrs;
        if (r02Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var3 = null;
        }
        r02 r02Var4 = this.barChartAttrs;
        if (r02Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var4 = null;
        }
        this.xAxis = new vqr(r02Var3, r02Var4.c, xqrVar);
        rtr rtrVar = this.yAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar = null;
        }
        vqr vqrVar2 = this.xAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar2 = null;
        }
        r02 r02Var5 = this.barChartAttrs;
        if (r02Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var5 = null;
        }
        this.chartItemDecoration = new sbo(rtrVar, vqrVar2, r02Var5);
        SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
        sbo sboVar = this.chartItemDecoration;
        if (sboVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartItemDecoration");
            sboVar = null;
        }
        sboVar.setHighLightValueFormatter(sleepRateHighLightMarkValueFormatter);
        Context context = this.mContext;
        List<RecyclerBarEntry> list2 = this.entryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list = null;
        } else {
            list = list2;
        }
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        if (barChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView = null;
        } else {
            barChartRecyclerView = barChartRecyclerView4;
        }
        vqr vqrVar3 = this.xAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar3;
        }
        r02 r02Var6 = this.barChartAttrs;
        if (r02Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var = null;
        } else {
            r02Var = r02Var6;
        }
        this.chartAdapter = new q02<>(context, list, barChartRecyclerView, vqrVar, r02Var, sleepRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        if (barChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView5 = null;
        }
        q02<RecyclerBarEntry> q02Var = this.chartAdapter;
        if (q02Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartAdapter");
            q02Var = null;
        }
        barChartRecyclerView5.setAdapter(q02Var);
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        if (barChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView6 = null;
        }
        sbo sboVar2 = this.chartItemDecoration;
        if (sboVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartItemDecoration");
            sboVar2 = null;
        }
        barChartRecyclerView6.addItemDecoration(sboVar2);
        BarChartRecyclerView barChartRecyclerView7 = this.barChartRecyclerView;
        if (barChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView7 = null;
        }
        Context context2 = this.mContext;
        r02 r02Var7 = this.barChartAttrs;
        if (r02Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            r02Var7 = null;
        }
        barChartRecyclerView7.setLayoutManager(new SpeedRatioLayoutManager(context2, r02Var7));
        BarChartRecyclerView barChartRecyclerView8 = this.barChartRecyclerView;
        if (barChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView8 = null;
        }
        barChartRecyclerView8.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView9 = this.barChartRecyclerView;
        if (barChartRecyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
            barChartRecyclerView9 = null;
        }
        Context context3 = this.mContext;
        BarChartRecyclerView barChartRecyclerView10 = this.barChartRecyclerView;
        if (barChartRecyclerView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barChartRecyclerView");
        } else {
            barChartRecyclerView3 = barChartRecyclerView10;
        }
        barChartRecyclerView9.addOnItemTouchListener(new hak(context3, barChartRecyclerView3, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepHeartRateDayHolder.initView.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                DataTitleView dataTitleView = null;
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView2 = SleepHeartRateDayHolder.this.dataTitleView;
                    if (dataTitleView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataTitleView");
                    } else {
                        dataTitleView = dataTitleView2;
                    }
                    dataTitleView.setVisibility(0);
                    return;
                }
                DataTitleView dataTitleView3 = SleepHeartRateDayHolder.this.dataTitleView;
                if (dataTitleView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataTitleView");
                } else {
                    dataTitleView = dataTitleView3;
                }
                dataTitleView.setVisibility(4);
            }
        }));
    }

    private final void updateChart(long startTime, long endTime, List<TimesDataRecordInt> hrmRecords) {
        q02<RecyclerBarEntry> q02Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
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
        for (TimesDataRecordInt timesDataRecordInt : hrmRecords) {
            List list = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (list != null) {
                list.addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            q02Var = null;
            r02 r02Var = null;
            if (i >= size) {
                break;
            }
            long j2 = ((long) (i * 1800)) + startTime;
            List<Integer> arrayList2 = (List) linkedHashMap.get(Long.valueOf(j2));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            r02 r02Var2 = this.barChartAttrs;
            if (r02Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
                r02Var2 = null;
            }
            int i3 = r02Var2.g0;
            r02 r02Var3 = this.barChartAttrs;
            if (r02Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barChartAttrs");
            } else {
                r02Var = r02Var3;
            }
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, arrayList2, i3, r02Var.g0), 10);
            segmentBarEntry.timestamp = j2;
            segmentBarEntry.localDate = TimeDateUtil.timestampToLocalDate(j2);
            segmentBarEntry.type = 3;
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
            i++;
        }
        final Function2 function2 = new Function2() { // from class: rmm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepHeartRateDayHolder.updateChart$lambda$1((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: smm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepHeartRateDayHolder.updateChart$lambda$2(function2, obj, obj2);
            }
        });
        List<RecyclerBarEntry> list2 = this.entryList;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list2 = null;
        }
        list2.clear();
        List<RecyclerBarEntry> list3 = this.entryList;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list3 = null;
        }
        list3.addAll(arrayList);
        vqr vqrVar = this.xAxis;
        if (vqrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar = null;
        }
        vqrVar.f37144a = size;
        List<RecyclerBarEntry> list4 = this.entryList;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("entryList");
            list4 = null;
        }
        float theMaxNumber = HealthUtil.getTheMaxNumber(list4);
        rtr rtrVar = this.yAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar = null;
        }
        rtr rtrVar2 = this.yAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar2 = null;
        }
        this.yAxis = rtrVar.l(rtrVar2, theMaxNumber);
        sbo sboVar = this.chartItemDecoration;
        if (sboVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartItemDecoration");
            sboVar = null;
        }
        rtr rtrVar3 = this.yAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("yAxis");
            rtrVar3 = null;
        }
        sboVar.setYAxis(rtrVar3);
        sbo sboVar2 = this.chartItemDecoration;
        if (sboVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartItemDecoration");
            sboVar2 = null;
        }
        vqr vqrVar2 = this.xAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar2 = null;
        }
        sboVar2.setXAxis(vqrVar2);
        q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
        if (q02Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartAdapter");
            q02Var2 = null;
        }
        vqr vqrVar3 = this.xAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xAxis");
            vqrVar3 = null;
        }
        q02Var2.setXAxis(vqrVar3);
        q02<RecyclerBarEntry> q02Var3 = this.chartAdapter;
        if (q02Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartAdapter");
        } else {
            q02Var = q02Var3;
        }
        q02Var.notifyDataSetChanged();
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
        Logger.i(TAG, "max " + report.getMaxHr() + " ,min " + report.getMinHr() + ",avg " + report.getAvgHr());
        if (report.getAvgHr() == null) {
            return;
        }
        Resources resources = this.mContext.getResources();
        int i = qxi.common_unit_heart_rate_desc;
        Integer avgHr = report.getAvgHr();
        Intrinsics.checkNotNull(avgHr);
        String quantityString = resources.getQuantityString(i, avgHr.intValue(), report.getAvgHr());
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String strValueOf = String.valueOf(report.getAvgHr());
        DataTitleView dataTitleView = this.dataTitleView;
        if (dataTitleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataTitleView");
            dataTitleView = null;
        }
        dataTitleView.a(this.mContext, quantityString, strValueOf, "");
    }

    public final void updateReport(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        List<TimesDataRecordInt> hrRecords = report.getHrRecords();
        sbo sboVar = null;
        Integer numValueOf = hrRecords != null ? Integer.valueOf(hrRecords.size()) : null;
        Logger.i(TAG, "hr records size " + numValueOf + ",records " + report.getHrRecords());
        if (!ArrayUtils.isEmpty(report.getHrRecords()) && report.getAvgHr() != null) {
            Integer avgHr = report.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            if (avgHr.intValue() > 0) {
                this.mRootView.setVisibility(0);
                this.mRootView.requestLayout();
                Logger.i(TAG, "mRootView.requestLayout() " + this.mRootView.getMeasuredHeight());
                long bedTime = report.getBedTime();
                long wakeupTime = report.getWakeupTime();
                sbo sboVar2 = this.chartItemDecoration;
                if (sboVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chartItemDecoration");
                } else {
                    sboVar = sboVar2;
                }
                sboVar.d(bedTime, wakeupTime);
                List<TimesDataRecordInt> hrRecords2 = report.getHrRecords();
                Intrinsics.checkNotNull(hrRecords2);
                updateChart(bedTime, wakeupTime, hrRecords2);
                updateTitle(report);
                return;
            }
        }
        this.mRootView.setVisibility(8);
        this.mRootView.requestLayout();
    }
}
