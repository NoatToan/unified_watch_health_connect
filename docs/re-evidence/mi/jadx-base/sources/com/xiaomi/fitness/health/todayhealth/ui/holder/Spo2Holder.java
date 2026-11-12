package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.chart.barchart.SpO2BarChartAdapter;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.spo2.Spo2Fragment;
import com.xiaomi.fitness.health.spo2.Spo2Utils;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder;
import com.xiaomi.fitness.util.SpO2DataUtil;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.view.TodayHealthDataTitleView;
import defpackage.c0j;
import defpackage.er5;
import defpackage.eri;
import defpackage.hak;
import defpackage.onq;
import defpackage.pah;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.sf2;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u001f\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bK\u0010LJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/Spo2Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "report", "", "onSummaryVisible", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)V", "initBarChart", "()V", "refreshBarChart", "bindData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "Landroid/widget/LinearLayout;", "summaryCard", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/ImageView;", "understandView", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "chartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lr02;", "mBarChartAttrs", "Lr02;", "Ls02;", "mItemDecoration", "Ls02;", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lsf2;", "mBarChartAdapter", "Lcom/xiaomi/fitness/chart/barchart/SpO2BarChartAdapter;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "", "displayNumber", "I", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "preRecord", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "Lhak;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "oldItemGestureListener", "Lhak;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Spo2Holder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "Spo2Holder";

    @NotNull
    private BarChartRecyclerView chartRecyclerView;
    private final Context context;

    @NotNull
    private final TodayHealthDataTitleView dataTitleView;
    private int displayNumber;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private SpO2BarChartAdapter<sf2> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private List<SegmentBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private hak<RecyclerBarEntry> oldItemGestureListener;

    @Nullable
    private Spo2Item preRecord;

    @NotNull
    private final LinearLayout summaryCard;
    private final ImageView understandView;

    @Nullable
    private onq valueFormatter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder$bindData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder$bindData$2", f = "Spo2Holder.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder$bindData$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSpo2Holder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2Holder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/Spo2Holder$bindData$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,205:1\n81#2:206\n*S KotlinDebug\n*F\n+ 1 Spo2Holder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/Spo2Holder$bindData$2$1\n*L\n99#1:206\n*E\n"})
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Spo2Holder this$0;

            public AnonymousClass1(Spo2Holder spo2Holder) {
                this.this$0 = spo2Holder;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void emit$lambda$1(Spo2Holder this$0, DailySpo2Report dailySpo2Report) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onSummaryVisible(dailySpo2Report);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((DailySpo2Report) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(final DailySpo2Report dailySpo2Report, Continuation<? super Unit> continuation) {
                Spo2Item latestSpoRecord = dailySpo2Report != null ? dailySpo2Report.getLatestSpoRecord() : null;
                if (latestSpoRecord == null) {
                    ViewExtKt.gone(this.this$0.summaryCard);
                    ViewExtKt.visible(this.this$0.emptyView);
                    return Unit.INSTANCE;
                }
                Spo2Item spo2Item = this.this$0.preRecord;
                if (spo2Item != null && latestSpoRecord.getTime() == spo2Item.getTime()) {
                    return Unit.INSTANCE;
                }
                this.this$0.preRecord = latestSpoRecord;
                ViewExtKt.visible(this.this$0.summaryCard);
                ViewExtKt.gone(this.this$0.emptyView);
                final BarChartRecyclerView chartRecyclerView = this.this$0.getChartRecyclerView();
                final Spo2Holder spo2Holder = this.this$0;
                pah.a(chartRecyclerView, new Runnable() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder$bindData$2$1$emit$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        spo2Holder.onSummaryVisible(dailySpo2Report);
                    }
                });
                BarChartRecyclerView chartRecyclerView2 = this.this$0.getChartRecyclerView();
                final Spo2Holder spo2Holder2 = this.this$0;
                chartRecyclerView2.post(new Runnable() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Spo2Holder.AnonymousClass2.AnonymousClass1.emit$lambda$1(spo2Holder2, dailySpo2Report);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Spo2Holder.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow spo2Data$default = HealthCheckViewModel.getSpo2Data$default(Spo2Holder.this.healthCheckViewModel, null, 1, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(Spo2Holder.this);
                this.label = 1;
                if (spo2Data$default.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2Holder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        View viewFindViewById = this.itemView.findViewById(eri.H2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.dataTitleView = (TodayHealthDataTitleView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(eri.Jh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.summaryCard = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(eri.E4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.emptyView = (LinearLayout) viewFindViewById3;
        this.context = view.getContext();
        this.understandView = (ImageView) this.itemView.findViewById(eri.y3);
        View viewFindViewById4 = this.itemView.findViewById(eri.pd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.chartRecyclerView = (BarChartRecyclerView) viewFindViewById4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(Spo2Holder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("origin", "today_health");
        bundle.putSerializable("local_date", this$0.healthCheckViewModel.getLocalSelectDay().getValue());
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        UtilsKt.gotoPage$default(context, Spo2Fragment.class, bundle, false, 8, null);
    }

    private final void initBarChart() {
        r02 r02Var = (r02) this.chartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(context, 0);
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.mBarChartAttrs);
        this.mYAxis = new vnq(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.displayNumber, this.valueFormatter);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(this.valueFormatter);
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        er5 er5Var = new er5(0, true);
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(er5Var);
        BarChartRecyclerView barChartRecyclerView = this.chartRecyclerView;
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView.addItemDecoration(s02Var2);
        Context context2 = this.context;
        List<SegmentBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.chart.entrys.SegmentBarEntry>");
        SpO2BarChartAdapter<sf2> spO2BarChartAdapter = new SpO2BarChartAdapter<>(context2, (ArrayList) list, this.chartRecyclerView, this.mXAxis, this.mBarChartAttrs, er5Var);
        this.mBarChartAdapter = spO2BarChartAdapter;
        this.chartRecyclerView.setAdapter(spO2BarChartAdapter);
        this.chartRecyclerView.setLayoutManager(speedRatioLayoutManager);
        this.chartRecyclerView.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSummaryVisible(DailySpo2Report report) {
        Spo2Item latestSpoRecord = report.getLatestSpoRecord();
        if (latestSpoRecord != null && latestSpoRecord.getSpo2() > 0) {
            String string = ApplicationExtKt.getApplication().getString(c0j.U);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.z1, latestSpoRecord.getSpo2(), Integer.valueOf(latestSpoRecord.getSpo2()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.dataTitleView.a(ApplicationExtKt.getApplication(), quantityString, String.valueOf(latestSpoRecord.getSpo2()), string);
            this.itemView.setContentDescription(ResourceExtKt.getString(c0j.r7) + ", " + quantityString + ", " + string);
        }
        initBarChart();
        refreshBarChart(report);
        hak<RecyclerBarEntry> hakVar = new hak<>(this.context, this.chartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder$onSummaryVisible$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    this.this$0.dataTitleView.setVisibility(0);
                } else {
                    this.this$0.dataTitleView.setVisibility(4);
                }
            }
        });
        hak<RecyclerBarEntry> hakVar2 = this.oldItemGestureListener;
        if (hakVar2 != null && !Intrinsics.areEqual(hakVar2, hakVar)) {
            this.chartRecyclerView.removeOnItemTouchListener(hakVar2);
        }
        this.chartRecyclerView.addOnItemTouchListener(hakVar);
        this.oldItemGestureListener = hakVar;
    }

    private final void refreshBarChart(DailySpo2Report report) {
        int i;
        SpO2DataUtil spO2DataUtil = SpO2DataUtil.INSTANCE;
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<SegmentBarEntry> listFillDaySegmentBarEntries = spO2DataUtil.fillDaySegmentBarEntries(report, r02Var);
        List<SegmentBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<SegmentBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listFillDaySegmentBarEntries);
        int theSpoMinNumber = Spo2Utils.INSTANCE.getTheSpoMinNumber(this.mEntries);
        Logger.i(TAG, "refreshYAxis MinNumber:" + theSpoMinNumber);
        float f = 85.0f;
        if (theSpoMinNumber < 0 || theSpoMinNumber >= 85.0f) {
            i = 5;
        } else {
            f = (theSpoMinNumber / 10) * 10;
            i = 10;
        }
        r02 r02Var2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var2);
        r02Var2.E = 100.0f;
        r02 r02Var3 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var3);
        r02Var3.F = f;
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(100.0f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setAxisMinimum(f);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.d(3, i);
        rtr rtrVar4 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar4);
        rtrVar4.f = 3;
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setYAxis(this.mYAxis);
        SpO2BarChartAdapter<sf2> spO2BarChartAdapter = this.mBarChartAdapter;
        Intrinsics.checkNotNull(spO2BarChartAdapter);
        spO2BarChartAdapter.setYAxis(this.mYAxis);
        SpO2BarChartAdapter<sf2> spO2BarChartAdapter2 = this.mBarChartAdapter;
        Intrinsics.checkNotNull(spO2BarChartAdapter2);
        spO2BarChartAdapter2.notifyDataSetChanged();
    }

    public final void bindData() {
        this.understandView.setOnClickListener(new View.OnClickListener() { // from class: e8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Spo2Holder.bindData$lambda$0(this.f16389a, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass2(null), 3, null);
    }

    @NotNull
    public final BarChartRecyclerView getChartRecyclerView() {
        return this.chartRecyclerView;
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setChartRecyclerView(@NotNull BarChartRecyclerView barChartRecyclerView) {
        Intrinsics.checkNotNullParameter(barChartRecyclerView, "<set-?>");
        this.chartRecyclerView = barChartRecyclerView;
    }
}
