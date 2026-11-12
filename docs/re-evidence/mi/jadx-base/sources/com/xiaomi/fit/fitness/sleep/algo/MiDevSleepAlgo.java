package com.xiaomi.fit.fitness.sleep.algo;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo;
import com.xiaomi.fit.fitness.sleep.algo.evaluation.SleepEvaluation;
import com.xiaomi.fit.fitness.sleep.algo.stage.MiSleepAlgorithmNative;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepRateArray;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStageSummary;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/sleep/algo/MiDevSleepAlgo;", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiSleepAlgorithmNative$a;", "", "sleepData", "", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepStageSummary;", "parseSleep", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "summaryList", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepRateArray;", "rateArray", "", "onParseResult", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepRateArray;)V", "", "dayTime", "Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$SleepSummary;", "list", "preList", "Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$Comment;", "getSleepDailyComment", "(JLjava/util/List;Ljava/util/List;)Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$Comment;", "Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$DailySleep;", "dailySleepList", "Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$WeeklyComment;", "getSleepWeeklyComment", "(Ljava/util/List;)Lcom/xiaomi/fit/fitness/sleep/algo/evaluation/SleepEvaluation$WeeklyComment;", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiSleepAlgorithmNative;", "sleepAlgo$delegate", "Lkotlin/Lazy;", "getSleepAlgo", "()Lcom/xiaomi/fit/fitness/sleep/algo/stage/MiSleepAlgorithmNative;", "sleepAlgo", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "sleepSummaryList", "Ljava/util/List;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<init>", "()V", "Companion", "fitness-sleep-algo_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiDevSleepAlgo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiDevSleepAlgo.kt\ncom/xiaomi/fit/fitness/sleep/algo/MiDevSleepAlgo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class MiDevSleepAlgo implements MiSleepAlgorithmNative.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MiDevSleepAlgo instance = new MiDevSleepAlgo();

    @Nullable
    private CountDownLatch latch;
    private List<? extends SleepStageSummary> sleepSummaryList;

    /* JADX INFO: renamed from: sleepAlgo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepAlgo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tuf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiDevSleepAlgo.sleepAlgo_delegate$lambda$0();
        }
    });

    @NotNull
    private final ExecutorCoroutineDispatcher dispatcher = ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, "parseSleep");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/sleep/algo/MiDevSleepAlgo$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/sleep/algo/MiDevSleepAlgo;", "getInstance", "()Lcom/xiaomi/fit/fitness/sleep/algo/MiDevSleepAlgo;", "fitness-sleep-algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiDevSleepAlgo getInstance() {
            return MiDevSleepAlgo.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo$parseSleep$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepStageSummary;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo$parseSleep$2", f = "MiDevSleepAlgo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SleepStageSummary>>, Object> {
        final /* synthetic */ byte[] $sleepData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byte[] bArr, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sleepData = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MiDevSleepAlgo.this.new AnonymousClass2(this.$sleepData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessLogUtils.i("MiSleepAlgorithmNative", "parseSleep");
            MiDevSleepAlgo.this.latch = new CountDownLatch(1);
            MiDevSleepAlgo.this.getSleepAlgo().d(AppUtil.getApp(), this.$sleepData, MiDevSleepAlgo.this);
            try {
                CountDownLatch countDownLatch = MiDevSleepAlgo.this.latch;
                Intrinsics.checkNotNull(countDownLatch);
                countDownLatch.await(1L, TimeUnit.MINUTES);
            } catch (Exception e) {
                FitnessLogUtils.INSTANCE.w("MiSleepAlgorithmNative", "CountDownLatch ", e);
            }
            List list = MiDevSleepAlgo.this.sleepSummaryList;
            if (list != null) {
                return list;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sleepSummaryList");
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SleepStageSummary>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private MiDevSleepAlgo() {
        System.loadLibrary("jni_xiaomi_sleep_algorithm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiSleepAlgorithmNative getSleepAlgo() {
        return (MiSleepAlgorithmNative) this.sleepAlgo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiSleepAlgorithmNative sleepAlgo_delegate$lambda$0() {
        return new MiSleepAlgorithmNative();
    }

    @NotNull
    public final SleepEvaluation.Comment getSleepDailyComment(long dayTime, @NotNull List<? extends SleepEvaluation.SleepSummary> list, @NotNull List<? extends SleepEvaluation.SleepSummary> preList) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(preList, "preList");
        SleepEvaluation.Comment sleepDailyComment = SleepEvaluation.getSleepDailyComment(Long.valueOf(dayTime), list, preList);
        Intrinsics.checkNotNullExpressionValue(sleepDailyComment, "getSleepDailyComment(...)");
        return sleepDailyComment;
    }

    @NotNull
    public final SleepEvaluation.WeeklyComment getSleepWeeklyComment(@NotNull List<? extends SleepEvaluation.DailySleep> dailySleepList) {
        Intrinsics.checkNotNullParameter(dailySleepList, "dailySleepList");
        SleepEvaluation.WeeklyComment sleepWeeklyComment = SleepEvaluation.getSleepWeeklyComment(dailySleepList);
        Intrinsics.checkNotNullExpressionValue(sleepWeeklyComment, "getSleepWeeklyComment(...)");
        return sleepWeeklyComment;
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.MiSleepAlgorithmNative.a
    public void onParseResult(@Nullable List<? extends SleepStageSummary> summaryList, @Nullable SleepRateArray rateArray) {
        getSleepAlgo().b();
        if (summaryList == null) {
            summaryList = new ArrayList<>();
        }
        this.sleepSummaryList = summaryList;
        if (!summaryList.isEmpty()) {
            List<? extends SleepStageSummary> list = this.sleepSummaryList;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepSummaryList");
                list = null;
            }
            list.get(0).breathRateArray = rateArray;
        }
        CountDownLatch countDownLatch = this.latch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Nullable
    public final Object parseSleep(@NotNull byte[] bArr, @NotNull Continuation<? super List<? extends SleepStageSummary>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(bArr, null), continuation);
    }
}
