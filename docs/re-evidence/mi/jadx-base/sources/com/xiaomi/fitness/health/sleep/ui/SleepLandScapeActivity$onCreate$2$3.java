package com.xiaomi.fitness.health.sleep.ui;

import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.view.LineDetailChartRecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity$onCreate$2$3", f = "SleepLandScapeActivity.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
public final class SleepLandScapeActivity$onCreate$2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SleepSegmentReport $report;
    int label;
    final /* synthetic */ SleepLandScapeActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity$onCreate$2$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity$onCreate$2$3$1", f = "SleepLandScapeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SleepSegmentReport $report;
        int label;
        final /* synthetic */ SleepLandScapeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepLandScapeActivity sleepLandScapeActivity, SleepSegmentReport sleepSegmentReport, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sleepLandScapeActivity;
            this.$report = sleepSegmentReport;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$report, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LineDetailChartRecyclerView lineDetailChartRecyclerView = null;
            if (this.this$0.daySleepHrReport != null) {
                SleepLandScapeActivity sleepLandScapeActivity = this.this$0;
                long bedTime = this.$report.getBedTime();
                long wakeupTime = this.$report.getWakeupTime();
                List list = this.this$0.daySleepHrReport;
                Intrinsics.checkNotNull(list);
                sleepLandScapeActivity.updateSleepHrChartView(bedTime, wakeupTime, list);
                SleepLandScapeActivity sleepLandScapeActivity2 = this.this$0;
                LineDetailChartRecyclerView lineDetailChartRecyclerView2 = sleepLandScapeActivity2.hrLineChartRecyclerView;
                if (lineDetailChartRecyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                    lineDetailChartRecyclerView2 = null;
                }
                sleepLandScapeActivity2.startAnimation(lineDetailChartRecyclerView2, false, 0);
                LineDetailChartRecyclerView lineDetailChartRecyclerView3 = this.this$0.hrLineChartRecyclerView;
                if (lineDetailChartRecyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                    lineDetailChartRecyclerView3 = null;
                }
                ViewExtKt.setVisible(lineDetailChartRecyclerView3, true);
            } else {
                LineDetailChartRecyclerView lineDetailChartRecyclerView4 = this.this$0.hrLineChartRecyclerView;
                if (lineDetailChartRecyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hrLineChartRecyclerView");
                    lineDetailChartRecyclerView4 = null;
                }
                ViewExtKt.setVisible(lineDetailChartRecyclerView4, false);
            }
            if (this.this$0.daySleepSpo2Report != null) {
                SleepLandScapeActivity sleepLandScapeActivity3 = this.this$0;
                long bedTime2 = this.$report.getBedTime();
                long wakeupTime2 = this.$report.getWakeupTime();
                List list2 = this.this$0.daySleepSpo2Report;
                Intrinsics.checkNotNull(list2);
                sleepLandScapeActivity3.updateSleepSpo2ChartView(bedTime2, wakeupTime2, list2);
                SleepLandScapeActivity sleepLandScapeActivity4 = this.this$0;
                LineDetailChartRecyclerView lineDetailChartRecyclerView5 = sleepLandScapeActivity4.spo2LineChartRecyclerView;
                if (lineDetailChartRecyclerView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                    lineDetailChartRecyclerView5 = null;
                }
                sleepLandScapeActivity4.startAnimation(lineDetailChartRecyclerView5, false, 0);
                LineDetailChartRecyclerView lineDetailChartRecyclerView6 = this.this$0.spo2LineChartRecyclerView;
                if (lineDetailChartRecyclerView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                } else {
                    lineDetailChartRecyclerView = lineDetailChartRecyclerView6;
                }
                ViewExtKt.setVisible(lineDetailChartRecyclerView, true);
            } else {
                LineDetailChartRecyclerView lineDetailChartRecyclerView7 = this.this$0.spo2LineChartRecyclerView;
                if (lineDetailChartRecyclerView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("spo2LineChartRecyclerView");
                } else {
                    lineDetailChartRecyclerView = lineDetailChartRecyclerView7;
                }
                ViewExtKt.setVisible(lineDetailChartRecyclerView, false);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepLandScapeActivity$onCreate$2$3(SleepLandScapeActivity sleepLandScapeActivity, SleepSegmentReport sleepSegmentReport, Continuation<? super SleepLandScapeActivity$onCreate$2$3> continuation) {
        super(2, continuation);
        this.this$0 = sleepLandScapeActivity;
        this.$report = sleepSegmentReport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepLandScapeActivity$onCreate$2$3(this.this$0, this.$report, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$report, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepLandScapeActivity$onCreate$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
