package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.data.valueformatter.DayStressHighLightMarkValueFormatter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.stress.StressFragment;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.StressDataUtil;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.view.TodayHealthDataTitleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.hak;
import defpackage.onq;
import defpackage.pah;
import defpackage.r02;
import defpackage.s02;
import defpackage.tjo;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u0001:\u0001PB\u001f\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bN\u0010OJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n \u001c*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/StressHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "latestStressItem", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "report", "", "onSummaryVisible", "(Lcom/xiaomi/fit/fitness/export/data/item/StressItem;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)V", "initBarChart", "()V", "dailyReport", "refreshBarChart", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)V", "bindData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/widget/LinearLayout;", "summaryCard", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/TodayHealthDataTitleView;", "Landroid/widget/ImageView;", "understandView", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "mBarChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getMBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setMBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Ltjo;", "mBarChartAdapter", "Ltjo;", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "mBarEntries", "Ljava/util/List;", "Ls02;", "mItemDecoration", "Ls02;", "Lvnq;", "mYAxis", "Lvnq;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "Lr02;", "mBarChartAttrs", "Lr02;", "getMBarChartAttrs", "()Lr02;", "setMBarChartAttrs", "(Lr02;)V", "preItem", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "Lhak;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "oldItemGestureListener", "Lhak;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStressHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/StressHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1863#2,2:220\n*S KotlinDebug\n*F\n+ 1 StressHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/StressHolder\n*L\n144#1:220,2\n*E\n"})
public final class StressHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "StressHolder";
    private final Context context;

    @NotNull
    private final TodayHealthDataTitleView dataTitleView;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private tjo mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private BarChartRecyclerView mBarChartRecyclerView;

    @Nullable
    private List<SegmentBarEntry> mBarEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private vnq<?> mYAxis;

    @Nullable
    private hak<RecyclerBarEntry> oldItemGestureListener;

    @Nullable
    private StressItem preItem;

    @NotNull
    private final LinearLayout summaryCard;
    private final ImageView understandView;

    @Nullable
    private onq valueFormatter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder$bindData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder$bindData$2", f = "StressHolder.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder$bindData$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nStressHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/StressHolder$bindData$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,219:1\n81#2:220\n*S KotlinDebug\n*F\n+ 1 StressHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/StressHolder$bindData$2$1\n*L\n110#1:220\n*E\n"})
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ StressHolder this$0;

            public AnonymousClass1(StressHolder stressHolder) {
                this.this$0 = stressHolder;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void emit$lambda$1(StressHolder this$0, StressItem stressItem, DailyStressReport dailyStressReport) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onSummaryVisible(stressItem, dailyStressReport);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((DailyStressReport) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(final DailyStressReport dailyStressReport, Continuation<? super Unit> continuation) {
                final StressItem latestStressRecord = dailyStressReport != null ? dailyStressReport.getLatestStressRecord() : null;
                if (latestStressRecord == null) {
                    ExtUtilKt.gone(this.this$0.summaryCard);
                    ExtUtilKt.visible(this.this$0.emptyView);
                    return Unit.INSTANCE;
                }
                StressItem stressItem = this.this$0.preItem;
                if (stressItem != null && stressItem.getTime() == latestStressRecord.getTime()) {
                    return Unit.INSTANCE;
                }
                this.this$0.preItem = latestStressRecord;
                ExtUtilKt.visible(this.this$0.summaryCard);
                ExtUtilKt.gone(this.this$0.emptyView);
                Logger.d(StressHolder.TAG, "dailyReportList.first() latestStressItem=" + latestStressRecord);
                final BarChartRecyclerView mBarChartRecyclerView = this.this$0.getMBarChartRecyclerView();
                if (mBarChartRecyclerView != null) {
                    final StressHolder stressHolder = this.this$0;
                    pah.a(mBarChartRecyclerView, new Runnable() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder$bindData$2$1$emit$$inlined$doOnPreDraw$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            stressHolder.onSummaryVisible(latestStressRecord, dailyStressReport);
                        }
                    });
                }
                BarChartRecyclerView mBarChartRecyclerView2 = this.this$0.getMBarChartRecyclerView();
                if (mBarChartRecyclerView2 != null) {
                    final StressHolder stressHolder2 = this.this$0;
                    Boxing.boxBoolean(mBarChartRecyclerView2.post(new Runnable() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            StressHolder.AnonymousClass2.AnonymousClass1.emit$lambda$1(stressHolder2, latestStressRecord, dailyStressReport);
                        }
                    }));
                }
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StressHolder.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stressData$default = HealthCheckViewModel.getStressData$default(StressHolder.this.healthCheckViewModel, null, 1, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StressHolder.this);
                this.label = 1;
                if (stressData$default.collect(anonymousClass1, this) == coroutine_suspended) {
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
    public StressHolder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        View viewFindViewById = this.itemView.findViewById(eri.Jh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.summaryCard = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(eri.E4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.emptyView = (LinearLayout) viewFindViewById2;
        this.context = view.getContext();
        View viewFindViewById3 = this.itemView.findViewById(eri.H2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.dataTitleView = (TodayHealthDataTitleView) viewFindViewById3;
        this.understandView = (ImageView) this.itemView.findViewById(eri.y3);
        this.mBarChartRecyclerView = (BarChartRecyclerView) this.itemView.findViewById(eri.g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(StressHolder this$0, WearableDeviceModel deviceModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        Bundle bundle = new Bundle();
        bundle.putString("origin", "today_health");
        bundle.putSerializable("local_date", this$0.healthCheckViewModel.getLocalSelectDay().getValue());
        if (!TextUtils.isEmpty(deviceModel.getDid())) {
            bundle.putString("did", deviceModel.getDid());
        }
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        UtilsKt.gotoPage$default(context, StressFragment.class, bundle, false, 8, null);
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        if (barChartRecyclerView != null) {
            this.mBarChartAttrs = (r02) barChartRecyclerView.mAttrs;
            BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(context, 0);
            this.mBarEntries = new ArrayList();
            SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(this.context, this.mBarChartAttrs);
            this.mYAxis = vnq.o(this.mBarChartAttrs, 100.0f);
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            vqr vqrVar = new vqr(r02Var, r02Var.c, this.valueFormatter);
            this.mXAxis = vqrVar;
            this.mItemDecoration = new s02(this.mYAxis, vqrVar, this.mBarChartAttrs);
            DayStressHighLightMarkValueFormatter dayStressHighLightMarkValueFormatter = new DayStressHighLightMarkValueFormatter(this.context);
            s02 s02Var = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setHighLightValueFormatter(dayStressHighLightMarkValueFormatter);
            s02 s02Var2 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var2);
            barChartRecyclerView.addItemDecoration(s02Var2);
            tjo tjoVar = new tjo(this.context, this.mBarEntries, barChartRecyclerView, this.mXAxis, this.mBarChartAttrs, dayStressHighLightMarkValueFormatter);
            this.mBarChartAdapter = tjoVar;
            barChartRecyclerView.setAdapter(tjoVar);
            barChartRecyclerView.setLayoutManager(speedRatioLayoutManager);
            barChartRecyclerView.setNestedScrollingEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSummaryVisible(StressItem latestStressItem, DailyStressReport report) {
        int stress = latestStressItem.getStress();
        StressDataUtil.INSTANCE.getStressStageIndexByValue(stress);
        String string = ApplicationExtKt.getApplication().getString(c0j.common_time_join_str, String.valueOf(stress), StressDataUtil.getStressTypeNameAsValue(stress));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.dataTitleView.b(this.context, string, String.valueOf(stress), ResourceExtKt.getString(c0j.V), StressDataUtil.getStressTypeIfAbnormal(stress));
        this.itemView.setContentDescription(ResourceExtKt.getString(c0j.Z4) + ", " + string + ", " + ResourceExtKt.getString(c0j.V));
        initBarChart();
        refreshBarChart(report);
        List<SegmentItem> abnormalStressRecords = report.getAbnormalStressRecords();
        if (abnormalStressRecords != null) {
            Iterator<T> it = abnormalStressRecords.iterator();
            while (it.hasNext()) {
                Logger.d(TAG, "abnormalStressRecords it=" + ((SegmentItem) it.next()));
            }
        }
        hak<RecyclerBarEntry> hakVar = new hak<>(this.context, this.mBarChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder$onSummaryVisible$itemGestureListener$1
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
        BarChartRecyclerView barChartRecyclerView = this.mBarChartRecyclerView;
        if (barChartRecyclerView != null) {
            hak<RecyclerBarEntry> hakVar2 = this.oldItemGestureListener;
            if (hakVar2 != null && !Intrinsics.areEqual(hakVar2, hakVar)) {
                barChartRecyclerView.removeOnItemTouchListener(hakVar2);
            }
            barChartRecyclerView.addOnItemTouchListener(hakVar);
            this.oldItemGestureListener = hakVar;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void refreshBarChart(DailyStressReport dailyReport) {
        List<SegmentBarEntry> list = this.mBarEntries;
        if (list != null) {
            list.clear();
        }
        StressDataUtil stressDataUtil = StressDataUtil.INSTANCE;
        r02 r02Var = this.mBarChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        List<SegmentBarEntry> barChartEntries = stressDataUtil.getBarChartEntries(dailyReport, r02Var, 0, LocalDate.now());
        List<SegmentBarEntry> list2 = this.mBarEntries;
        if (list2 != null) {
            list2.clear();
        }
        List<SegmentBarEntry> list3 = this.mBarEntries;
        if (list3 != null) {
            list3.addAll(barChartEntries);
        }
        tjo tjoVar = this.mBarChartAdapter;
        if (tjoVar != null) {
            tjoVar.notifyDataSetChanged();
        }
    }

    public final void bindData() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        this.understandView.setOnClickListener(new View.OnClickListener() { // from class: eko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StressHolder.bindData$lambda$0(this.f16745a, wearableDeviceModel, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass2(null), 3, null);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Nullable
    public final r02 getMBarChartAttrs() {
        return this.mBarChartAttrs;
    }

    @Nullable
    public final BarChartRecyclerView getMBarChartRecyclerView() {
        return this.mBarChartRecyclerView;
    }

    public final void setMBarChartAttrs(@Nullable r02 r02Var) {
        this.mBarChartAttrs = r02Var;
    }

    public final void setMBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.mBarChartRecyclerView = barChartRecyclerView;
    }
}
