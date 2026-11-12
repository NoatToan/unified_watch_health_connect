package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.valueformater.DaySleepHighLightFormatter;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder;
import com.xiaomi.fitness.health.todayhealth.ui.items.SleepAverageRateItemAdapter;
import com.xiaomi.fitness.health.todayhealth.ui.items.SleepAverageRateModel;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gjm;
import defpackage.hak;
import defpackage.ili;
import defpackage.oim;
import defpackage.pah;
import defpackage.pni;
import defpackage.qim;
import defpackage.qxi;
import defpackage.tim;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u001f\u0012\u0006\u00108\u001a\u00020%\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010.\u001a\n -*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/LongSleepHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initSleepChart", "()V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "report", "updateChartTitle", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "bindData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "mChartEntries", "Ljava/util/List;", "Loim;", "mSleepChartAdapter", "Loim;", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "mChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "Ltim;", "sleepChartItemDecoration", "Ltim;", "Landroid/widget/TextView;", "tvTimeRange", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationTextView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "Landroid/view/View;", "mDataTitleView", "Landroid/view/View;", "tvOrigin", "Landroid/widget/LinearLayout;", "longSleepContainer", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "understandView", "Landroid/widget/ImageView;", "Landroidx/recyclerview/widget/RecyclerView;", "sleepRateRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "preSegment", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "view", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LongSleepHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "LongSleepHolder";

    @NotNull
    private final Context context;

    @NotNull
    private DurationTextView durationTextView;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final LinearLayout longSleepContainer;

    @NotNull
    private List<SleepItemEntry> mChartEntries;

    @Nullable
    private SleepChartRecyclerView mChartRecyclerView;

    @NotNull
    private View mDataTitleView;

    @Nullable
    private oim mSleepChartAdapter;

    @Nullable
    private SleepSegmentReport preSegment;

    @Nullable
    private tim sleepChartItemDecoration;

    @NotNull
    private RecyclerView sleepRateRecycler;

    @NotNull
    private TextView tvOrigin;

    @NotNull
    private TextView tvTimeRange;
    private final ImageView understandView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder$bindData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder$bindData$1", f = "LongSleepHolder.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LongSleepHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow sleepData$default = HealthCheckViewModel.getSleepData$default(LongSleepHolder.this.healthCheckViewModel, null, 1, null);
                final LongSleepHolder longSleepHolder = LongSleepHolder.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder.bindData.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepSegmentReport) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final SleepSegmentReport sleepSegmentReport, Continuation<? super Unit> continuation) {
                        if (sleepSegmentReport == null) {
                            ViewExtKt.gone(longSleepHolder.longSleepContainer);
                            return Unit.INSTANCE;
                        }
                        SleepSegmentReport sleepSegmentReport2 = longSleepHolder.preSegment;
                        if (sleepSegmentReport2 != null && sleepSegmentReport2.getTimestamp() == sleepSegmentReport.getTimestamp()) {
                            return Unit.INSTANCE;
                        }
                        longSleepHolder.preSegment = sleepSegmentReport;
                        ViewExtKt.visible(longSleepHolder.longSleepContainer);
                        Logger.d(LongSleepHolder.TAG, "dailyReportList.first() segment=" + sleepSegmentReport);
                        if (sleepSegmentReport.hasStageData()) {
                            longSleepHolder.initSleepChart();
                            final SleepChartRecyclerView sleepChartRecyclerView = longSleepHolder.mChartRecyclerView;
                            if (sleepChartRecyclerView != null) {
                                final LongSleepHolder longSleepHolder2 = longSleepHolder;
                                pah.a(sleepChartRecyclerView, new Runnable() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder$bindData$1$1$emit$$inlined$doOnPreDraw$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (sleepSegmentReport.hasStageData()) {
                                            ViewExtKt.gone(longSleepHolder2.tvTimeRange);
                                            int stageCount = sleepSegmentReport.getStageCount();
                                            SleepChartRecyclerView sleepChartRecyclerView2 = longSleepHolder2.mChartRecyclerView;
                                            ViewGroup.LayoutParams layoutParams = sleepChartRecyclerView2 != null ? sleepChartRecyclerView2.getLayoutParams() : null;
                                            int dp = ExtUtilsKt.getDp(153);
                                            int dimension = ExtUtilsKt.getDimension(ili.h);
                                            tim timVar = longSleepHolder2.sleepChartItemDecoration;
                                            if (timVar != null) {
                                                timVar.c(Float.valueOf(((4 - stageCount) * dimension) / stageCount));
                                            }
                                            if (layoutParams != null) {
                                                layoutParams.height = (dimension * 4) + dp;
                                            }
                                            SleepChartRecyclerView sleepChartRecyclerView3 = longSleepHolder2.mChartRecyclerView;
                                            if (sleepChartRecyclerView3 != null) {
                                                sleepChartRecyclerView3.setLayoutParams(layoutParams);
                                            }
                                            tim timVar2 = longSleepHolder2.sleepChartItemDecoration;
                                            if (timVar2 != null) {
                                                timVar2.updateStageSize(stageCount);
                                            }
                                            longSleepHolder2.mChartEntries.clear();
                                            List list = longSleepHolder2.mChartEntries;
                                            List<SleepItemEntry> listB = gjm.b(sleepSegmentReport, Boolean.FALSE);
                                            Intrinsics.checkNotNullExpressionValue(listB, "createDaySleepChartEntry(...)");
                                            list.addAll(listB);
                                            Context context = longSleepHolder2.context;
                                            SleepChartRecyclerView sleepChartRecyclerView4 = longSleepHolder2.mChartRecyclerView;
                                            final LongSleepHolder longSleepHolder3 = longSleepHolder2;
                                            hak hakVar = new hak(context, sleepChartRecyclerView4, new xcm() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder$bindData$1$1$1$itemGestureListener$1
                                                @Override // defpackage.xcm, defpackage.u8h
                                                public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                                                    if (barEntry == null || !barEntry.isSelected()) {
                                                        longSleepHolder3.mDataTitleView.setVisibility(0);
                                                    } else {
                                                        longSleepHolder3.mDataTitleView.setVisibility(4);
                                                    }
                                                }
                                            });
                                            SleepChartRecyclerView sleepChartRecyclerView5 = longSleepHolder2.mChartRecyclerView;
                                            Intrinsics.checkNotNull(sleepChartRecyclerView5);
                                            sleepChartRecyclerView5.addOnItemTouchListener(hakVar);
                                            oim oimVar = longSleepHolder2.mSleepChartAdapter;
                                            Intrinsics.checkNotNull(oimVar);
                                            oimVar.setEntries(longSleepHolder2.mChartEntries);
                                        } else {
                                            SleepChartRecyclerView sleepChartRecyclerView6 = longSleepHolder2.mChartRecyclerView;
                                            if (sleepChartRecyclerView6 != null) {
                                                ViewExtKt.gone(sleepChartRecyclerView6);
                                            }
                                            ViewExtKt.visible(longSleepHolder2.tvTimeRange);
                                        }
                                        longSleepHolder2.updateChartTitle(sleepSegmentReport);
                                    }
                                });
                            }
                        } else {
                            longSleepHolder.updateChartTitle(sleepSegmentReport);
                            SleepChartRecyclerView sleepChartRecyclerView2 = longSleepHolder.mChartRecyclerView;
                            if (sleepChartRecyclerView2 != null) {
                                ViewExtKt.gone(sleepChartRecyclerView2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sleepData$default.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongSleepHolder(@NotNull final View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        this.mChartEntries = new ArrayList();
        View viewFindViewById = this.itemView.findViewById(eri.long_sleep_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.longSleepContainer = (LinearLayout) viewFindViewById;
        ImageView imageView = (ImageView) this.itemView.findViewById(eri.y3);
        this.understandView = imageView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        this.mChartRecyclerView = (SleepChartRecyclerView) this.itemView.findViewById(eri.y1);
        this.tvTimeRange = (TextView) this.itemView.findViewById(eri.Wm);
        this.mDataTitleView = this.itemView.findViewById(eri.x3);
        this.durationTextView = (DurationTextView) this.itemView.findViewById(eri.p4);
        this.tvOrigin = (TextView) this.itemView.findViewById(eri.Vl);
        this.sleepRateRecycler = (RecyclerView) this.itemView.findViewById(eri.hg);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: cse
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LongSleepHolder._init_$lambda$0(this.f14673a, view, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(LongSleepHolder this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Bundle bundle = new Bundle();
        bundle.putString("origin", "today_health");
        bundle.putSerializable("local_date", this$0.healthCheckViewModel.getLocalSelectDay().getValue());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UtilsKt.gotoPage$default(context, SleepFragment.class, bundle, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initSleepChart() {
        SleepChartRecyclerView sleepChartRecyclerView = this.mChartRecyclerView;
        if (sleepChartRecyclerView != null) {
            ViewExtKt.visible(sleepChartRecyclerView);
        }
        this.mSleepChartAdapter = new oim(this.itemView.getContext(), this.mChartEntries, this.mChartRecyclerView);
        Context context = this.itemView.getContext();
        SleepChartRecyclerView sleepChartRecyclerView2 = this.mChartRecyclerView;
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, sleepChartRecyclerView2 != null ? (qim) sleepChartRecyclerView2.mAttrs : null);
        SleepChartRecyclerView sleepChartRecyclerView3 = this.mChartRecyclerView;
        if (sleepChartRecyclerView3 != null) {
            sleepChartRecyclerView3.setAdapter(this.mSleepChartAdapter);
        }
        SleepChartRecyclerView sleepChartRecyclerView4 = this.mChartRecyclerView;
        this.sleepChartItemDecoration = new tim(sleepChartRecyclerView4 != null ? (qim) sleepChartRecyclerView4.mAttrs : null);
        SleepChartRecyclerView sleepChartRecyclerView5 = this.mChartRecyclerView;
        if (sleepChartRecyclerView5 != null) {
            sleepChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        }
        tim timVar = this.sleepChartItemDecoration;
        Intrinsics.checkNotNull(timVar);
        timVar.setHighLightValueFormatter(new DaySleepHighLightFormatter(0));
        SleepChartRecyclerView sleepChartRecyclerView6 = this.mChartRecyclerView;
        if (sleepChartRecyclerView6 != null) {
            tim timVar2 = this.sleepChartItemDecoration;
            Intrinsics.checkNotNull(timVar2);
            sleepChartRecyclerView6.addItemDecoration(timVar2);
        }
        oim oimVar = this.mSleepChartAdapter;
        Intrinsics.checkNotNull(oimVar);
        oimVar.setEntries(this.mChartEntries);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateChartTitle(SleepSegmentReport report) {
        List<TimesDataRecordInt> spo2Records;
        List<TimesDataRecordInt> hrRecords;
        this.durationTextView.setDuration(TimeUnit.MINUTES.toMillis(report.getSleepDuration()));
        String sid = report.getSid();
        if (sid != null && sid.length() != 0) {
            if (Intrinsics.areEqual(sid, "xiaomiwear_app_manually")) {
                ResourceExtKt.getString(c0j.D);
            } else {
                DeviceInfo<? extends Device> deviceInfoInAll = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceInfoInAll(sid);
                if (deviceInfoInAll != null) {
                    deviceInfoInAll.getName();
                }
            }
        }
        this.tvOrigin.setText(ResourceExtKt.getString(c0j.T));
        TextView textView = this.tvTimeRange;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(SleepExtKt.getSleepTimeRangeStr(context, report.getBedTime(), report.getWakeupTime()));
        View viewFindViewById = this.mDataTitleView.findViewById(eri.A1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = this.mDataTitleView.findViewById(eri.C1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = this.mDataTitleView.findViewById(eri.B1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = this.mDataTitleView.findViewById(eri.D1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        if (report.getDeepDuration() > 0) {
            ViewExtKt.visible(viewFindViewById);
        }
        if (report.getLightDuration() > 0) {
            ViewExtKt.visible(viewFindViewById2);
        }
        if (report.getRemDuration() != null) {
            Integer remDuration = report.getRemDuration();
            Intrinsics.checkNotNull(remDuration);
            if (remDuration.intValue() > 0) {
                ViewExtKt.visible(viewFindViewById3);
            }
        }
        if (report.getWakeDuration() != null) {
            Integer wakeDuration = report.getWakeDuration();
            Intrinsics.checkNotNull(wakeDuration);
            if (wakeDuration.intValue() > 0) {
                ViewExtKt.visible(viewFindViewById4);
            }
        }
        ArrayList arrayList = new ArrayList();
        Integer avgHr = report.getAvgHr();
        if (avgHr != null && avgHr.intValue() > 0 && (hrRecords = report.getHrRecords()) != null && !hrRecords.isEmpty()) {
            Resources resources = ApplicationExtKt.getApplication().getResources();
            int i = qxi.common_unit_heart_rate_desc;
            Integer avgHr2 = report.getAvgHr();
            Intrinsics.checkNotNull(avgHr2);
            String quantityString = resources.getQuantityString(i, avgHr2.intValue(), report.getAvgHr());
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            int i2 = c0j.Ad;
            int i3 = pni.m1;
            String string = ApplicationExtKt.getApplication().getString(c0j.Gd);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new SleepAverageRateModel(1, i2, i3, quantityString, string, report));
        }
        Integer avgSpo2 = report.getAvgSpo2();
        if (avgSpo2 != null && avgSpo2.intValue() > 0 && (spo2Records = report.getSpo2Records()) != null && !spo2Records.isEmpty()) {
            Resources resources2 = ApplicationExtKt.getApplication().getResources();
            int i4 = qxi.z1;
            Integer avgSpo3 = report.getAvgSpo2();
            Intrinsics.checkNotNull(avgSpo3);
            String quantityString2 = resources2.getQuantityString(i4, avgSpo3.intValue(), report.getAvgSpo2());
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            int i5 = c0j.zd;
            int i6 = pni.n1;
            String string2 = ApplicationExtKt.getApplication().getString(c0j.Sd);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new SleepAverageRateModel(2, i5, i6, quantityString2, string2, report));
        }
        if (!(!arrayList.isEmpty())) {
            ViewExtKt.gone(this.sleepRateRecycler);
            return;
        }
        SleepAverageRateItemAdapter sleepAverageRateItemAdapter = new SleepAverageRateItemAdapter(arrayList);
        this.sleepRateRecycler.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        this.sleepRateRecycler.setAdapter(sleepAverageRateItemAdapter);
        ViewExtKt.visible(this.sleepRateRecycler);
        RecyclerView.Adapter adapter = this.sleepRateRecycler.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void bindData() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }
}
