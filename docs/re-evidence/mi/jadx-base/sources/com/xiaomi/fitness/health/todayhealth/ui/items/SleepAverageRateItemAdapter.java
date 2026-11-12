package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.spo2.Spo2Utils;
import com.xiaomi.fitness.health.todayhealth.ui.items.SleepAverageRateItemAdapter;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.view.TodayHealthDataTitleView;
import defpackage.er5;
import defpackage.eri;
import defpackage.hak;
import defpackage.jui;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateModel;", "modelList", "Ljava/util/List;", "getModelList", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "ViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAverageRateItemAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int CODE_HR = 1;
    public static final int CODE_SPO2 = 2;

    @NotNull
    public static final String TAG = "SleepAverageRateItemAdapter";

    @NotNull
    private final List<SleepAverageRateModel> modelList;

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initChartBarRecyclerView", "()V", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateModel;", "model", "refreshView", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateModel;)V", "refreshChartView", "initChartSpo2BarRecyclerView", "refreshSpo2ChartView", "", "position", "bind", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateModel;I)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "sleepHrmReportList", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/TextView;", "ivTitle", "Landroid/widget/TextView;", "guideView", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepAverageRateItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAverageRateItemAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateItemAdapter$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n1863#2,2:367\n1863#2,2:369\n*S KotlinDebug\n*F\n+ 1 SleepAverageRateItemAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/SleepAverageRateItemAdapter$ViewHolder\n*L\n199#1:367,2\n308#1:369,2\n*E\n"})
    public final class ViewHolder extends RecyclerView.d0 {

        @Nullable
        private r02 barChartAttrs;

        @Nullable
        private BarChartRecyclerView barChartRecyclerView;

        @Nullable
        private q02<RecyclerBarEntry> chartAdapter;

        @Nullable
        private sbo chartItemDecoration;

        @Nullable
        private TodayHealthDataTitleView dataTitleView;

        @Nullable
        private List<RecyclerBarEntry> entryList;

        @Nullable
        private AppCompatImageView guideView;

        @Nullable
        private AppCompatImageView ivIcon;

        @Nullable
        private TextView ivTitle;

        @Nullable
        private List<TimesDataRecordInt> sleepHrmReportList;

        @Nullable
        private SleepSegmentReport sleepSegmentReport;
        final /* synthetic */ SleepAverageRateItemAdapter this$0;

        @Nullable
        private vqr xAxis;

        @Nullable
        private rtr yAxis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SleepAverageRateItemAdapter sleepAverageRateItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepAverageRateItemAdapter;
        }

        private final void initChartBarRecyclerView() {
            AppCompatImageView appCompatImageView = this.guideView;
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: aim
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ToastUtil.showToast("没有H5 链接");
                    }
                });
            }
            Application application = ApplicationExtKt.getApplication();
            BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
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
            SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
            sbo sboVar = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar);
            sboVar.setHighLightValueFormatter(sleepRateHighLightMarkValueFormatter);
            this.chartAdapter = new q02<>(application, this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, sleepRateHighLightMarkValueFormatter);
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
            barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(application, this.barChartAttrs));
            BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView5);
            barChartRecyclerView5.setNestedScrollingEnabled(false);
            BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView6);
            barChartRecyclerView6.addOnItemTouchListener(new hak(application, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.items.SleepAverageRateItemAdapter$ViewHolder$initChartBarRecyclerView$2
                @Override // defpackage.xcm, defpackage.u8h
                public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                    super.onItemSelected(barEntry, position);
                    if (barEntry == null || !barEntry.isSelected()) {
                        TodayHealthDataTitleView todayHealthDataTitleView = this.this$0.dataTitleView;
                        if (todayHealthDataTitleView != null) {
                            todayHealthDataTitleView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    TodayHealthDataTitleView todayHealthDataTitleView2 = this.this$0.dataTitleView;
                    if (todayHealthDataTitleView2 != null) {
                        todayHealthDataTitleView2.setVisibility(4);
                    }
                }
            }));
        }

        private final void initChartSpo2BarRecyclerView() {
            AppCompatImageView appCompatImageView = this.guideView;
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: bim
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ToastUtil.showToast("没有H5 链接");
                    }
                });
            }
            Application application = ApplicationExtKt.getApplication();
            BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
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
            this.chartAdapter = new q02<>(application, this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, er5Var);
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
            barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(application, this.barChartAttrs));
            BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView5);
            barChartRecyclerView5.setNestedScrollingEnabled(false);
            BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView6);
            barChartRecyclerView6.addOnItemTouchListener(new hak(application, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.items.SleepAverageRateItemAdapter$ViewHolder$initChartSpo2BarRecyclerView$2
                @Override // defpackage.xcm, defpackage.u8h
                public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                    super.onItemSelected(barEntry, position);
                    if (barEntry == null || !barEntry.isSelected()) {
                        TodayHealthDataTitleView todayHealthDataTitleView = this.this$0.dataTitleView;
                        if (todayHealthDataTitleView != null) {
                            todayHealthDataTitleView.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    TodayHealthDataTitleView todayHealthDataTitleView2 = this.this$0.dataTitleView;
                    if (todayHealthDataTitleView2 != null) {
                        todayHealthDataTitleView2.setVisibility(4);
                    }
                }
            }));
        }

        private final void refreshChartView() {
            SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
            if (sleepSegmentReport == null || this.sleepHrmReportList == null) {
                return;
            }
            Intrinsics.checkNotNull(sleepSegmentReport);
            long bedTime = sleepSegmentReport.getBedTime();
            SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport2);
            long wakeupTime = sleepSegmentReport2.getWakeupTime();
            sbo sboVar = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar);
            sboVar.d(bedTime, wakeupTime);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = bedTime;
            int i = 0;
            while (j < wakeupTime) {
                linkedHashMap.put(Long.valueOf(((long) (i * 1800)) + bedTime), new ArrayList());
                i++;
                j = ((long) (i * 1800)) + bedTime;
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
                if (barChartRecyclerView != null) {
                    barChartRecyclerView.setVisibility(8);
                    return;
                }
                return;
            }
            List<TimesDataRecordInt> list = this.sleepHrmReportList;
            Intrinsics.checkNotNull(list);
            for (TimesDataRecordInt timesDataRecordInt : list) {
                List list2 = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
                if (list2 != null) {
                    list2.addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                long j2 = ((long) (i2 * 1800)) + bedTime;
                List<Integer> arrayList2 = (List) linkedHashMap.get(Long.valueOf(j2));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
                r02 r02Var = this.barChartAttrs;
                Intrinsics.checkNotNull(r02Var);
                int i3 = r02Var.g0;
                r02 r02Var2 = this.barChartAttrs;
                Intrinsics.checkNotNull(r02Var2);
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, arrayList2, i3, r02Var2.g0), 10);
                segmentBarEntry.timestamp = j2;
                segmentBarEntry.localDate = TimeDateUtil.timestampToLocalDate(j2);
                segmentBarEntry.type = 3;
                segmentBarEntry.setY(segmentBarEntry.getMaxValue());
                arrayList.add(segmentBarEntry);
            }
            final Function2 function2 = new Function2() { // from class: yhm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(SleepAverageRateItemAdapter.ViewHolder.refreshChartView$lambda$2((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
                }
            };
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: zhm
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SleepAverageRateItemAdapter.ViewHolder.refreshChartView$lambda$3(function2, obj, obj2);
                }
            });
            List<RecyclerBarEntry> list3 = this.entryList;
            Intrinsics.checkNotNull(list3);
            list3.clear();
            List<RecyclerBarEntry> list4 = this.entryList;
            Intrinsics.checkNotNull(list4);
            list4.addAll(arrayList);
            vqr vqrVar = this.xAxis;
            Intrinsics.checkNotNull(vqrVar);
            vqrVar.f37144a = size;
            float theMaxNumber = HealthUtil.getTheMaxNumber(this.entryList);
            rtr rtrVar = this.yAxis;
            Intrinsics.checkNotNull(rtrVar);
            this.yAxis = rtrVar.l(this.yAxis, theMaxNumber);
            sbo sboVar2 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar2);
            sboVar2.setYAxis(this.yAxis);
            sbo sboVar3 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar3);
            sboVar3.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var);
            q02Var.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int refreshChartView$lambda$2(SegmentBarEntry o1, SegmentBarEntry o2) {
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            return Intrinsics.compare(o2.timestamp, o1.timestamp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int refreshChartView$lambda$3(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        private final void refreshSpo2ChartView() {
            int i;
            SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
            List<TimesDataRecordInt> spo2Records = sleepSegmentReport != null ? sleepSegmentReport.getSpo2Records() : null;
            List<TimesDataRecordInt> list = spo2Records;
            if (list == null || list.isEmpty()) {
                return;
            }
            SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport2);
            long bedTime = sleepSegmentReport2.getBedTime();
            SleepSegmentReport sleepSegmentReport3 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport3);
            long wakeupTime = sleepSegmentReport3.getWakeupTime();
            sbo sboVar = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar);
            sboVar.d(bedTime, wakeupTime);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = bedTime;
            int i2 = 0;
            while (j < wakeupTime) {
                linkedHashMap.put(Long.valueOf(((long) (i2 * 1800)) + bedTime), new ArrayList());
                i2++;
                j = ((long) (i2 * 1800)) + bedTime;
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
                if (barChartRecyclerView != null) {
                    barChartRecyclerView.setVisibility(8);
                    return;
                }
                return;
            }
            for (TimesDataRecordInt timesDataRecordInt : spo2Records) {
                List list2 = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
                if (list2 != null) {
                    list2.addAll(SpO2DataUtil.INSTANCE.convertToIntegerListAndFilterZero(timesDataRecordInt.getValueArray()));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < size; i3++) {
                long j2 = ((long) (i3 * 1800)) + bedTime;
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
            final Function2 function2 = new Function2() { // from class: whm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(SleepAverageRateItemAdapter.ViewHolder.refreshSpo2ChartView$lambda$6((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
                }
            };
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: xhm
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SleepAverageRateItemAdapter.ViewHolder.refreshSpo2ChartView$lambda$7(function2, obj, obj2);
                }
            });
            List<RecyclerBarEntry> list3 = this.entryList;
            Intrinsics.checkNotNull(list3);
            list3.clear();
            List<RecyclerBarEntry> list4 = this.entryList;
            Intrinsics.checkNotNull(list4);
            list4.addAll(arrayList);
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
            sbo sboVar2 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar2);
            sboVar2.setYAxis(this.yAxis);
            sbo sboVar3 = this.chartItemDecoration;
            Intrinsics.checkNotNull(sboVar3);
            sboVar3.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var);
            q02Var.setXAxis(this.xAxis);
            q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int refreshSpo2ChartView$lambda$6(SegmentBarEntry o1, SegmentBarEntry o2) {
            Intrinsics.checkNotNullParameter(o1, "o1");
            Intrinsics.checkNotNullParameter(o2, "o2");
            return Intrinsics.compare(o2.timestamp, o1.timestamp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int refreshSpo2ChartView$lambda$7(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        private final void refreshView(SleepAverageRateModel model) {
            Integer avgSpo2;
            Integer avgHr;
            int iIntValue = 0;
            if (model.getType() == 1) {
                SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
                if (sleepSegmentReport != null && (avgHr = sleepSegmentReport.getAvgHr()) != null) {
                    iIntValue = avgHr.intValue();
                }
            } else {
                SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
                if (sleepSegmentReport2 != null && (avgSpo2 = sleepSegmentReport2.getAvgSpo2()) != null) {
                    iIntValue = avgSpo2.intValue();
                }
            }
            if (iIntValue == 0) {
                return;
            }
            String quantityString = model.getType() == 1 ? ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_heart_rate_desc, iIntValue, Integer.valueOf(iIntValue)) : ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.z1, iIntValue, Integer.valueOf(iIntValue));
            Intrinsics.checkNotNull(quantityString);
            TodayHealthDataTitleView todayHealthDataTitleView = this.dataTitleView;
            if (todayHealthDataTitleView != null) {
                todayHealthDataTitleView.a(ApplicationExtKt.getApplication(), quantityString, String.valueOf(iIntValue), model.getRef());
            }
            AppCompatImageView appCompatImageView = this.ivIcon;
            if (appCompatImageView != null) {
                appCompatImageView.setBackground(ApplicationExtKt.getApplication().getDrawable(model.getDrawableResId()));
            }
            TextView textView = this.ivTitle;
            if (textView != null) {
                textView.setText(model.getTitleResId());
            }
        }

        public final void bind(@NotNull SleepAverageRateModel model, int position) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.dataTitleView = (TodayHealthDataTitleView) this.itemView.findViewById(eri.H2);
            this.ivIcon = (AppCompatImageView) this.itemView.findViewById(eri.X8);
            this.ivTitle = (TextView) this.itemView.findViewById(eri.bn);
            this.guideView = (AppCompatImageView) this.itemView.findViewById(eri.t5);
            this.barChartRecyclerView = (BarChartRecyclerView) this.itemView.findViewById(eri.g0);
            SleepSegmentReport sleepSegmentReport = model.getSleepSegmentReport();
            this.sleepSegmentReport = sleepSegmentReport;
            this.sleepHrmReportList = sleepSegmentReport != null ? sleepSegmentReport.getHrRecords() : null;
            refreshView(model);
            if (model.getType() == 1) {
                initChartBarRecyclerView();
                refreshChartView();
            } else {
                initChartSpo2BarRecyclerView();
                refreshSpo2ChartView();
            }
        }
    }

    public SleepAverageRateItemAdapter(@NotNull List<SleepAverageRateModel> modelList) {
        Intrinsics.checkNotNullParameter(modelList, "modelList");
        this.modelList = modelList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.modelList.size();
    }

    @NotNull
    public final List<SleepAverageRateModel> getModelList() {
        return this.modelList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder) {
            ((ViewHolder) holder).bind(this.modelList.get(position), position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.r8, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
