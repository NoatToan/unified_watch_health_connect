package com.xiaomi.fit.fitness.persist.dailyreport;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.api.PullRainbowDataApi;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessData;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTimeParam;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByWaterMark;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.CloudParamsKt;
import com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fitness.aggregation.health.dao.RainbowDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.DailyGoalReportEntity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020*0'H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/CloudRainbowHelper;", "", "<init>", "()V", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "mCloudGson", "Lcom/google/gson/Gson;", "getMCloudGson", "()Lcom/google/gson/Gson;", "mCloudGson$delegate", "mPullComplete", "Lcom/xiaomi/fit/fitness/persist/dailyreport/api/PullRainbowDataApi;", "pullCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "pushCount", "setStatusListener", "", "result", "notifyStatus", "", "pullAndPushRainbowData", "pullRainbowData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushRainBowToCloud", "pullRecentDaysRainbowData", "nextKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullRainbowDataByWM", "watermark", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRainBow", "list", "", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "convertRainbowToServer", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudRainbowHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudRainbowHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudRainbowHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n37#2:192\n36#2,3:193\n1863#3,2:196\n*S KotlinDebug\n*F\n+ 1 CloudRainbowHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudRainbowHelper\n*L\n170#1:192\n170#1:193,3\n175#1:196,2\n*E\n"})
public final class CloudRainbowHelper {

    @Nullable
    private static PullRainbowDataApi mPullComplete;

    @NotNull
    public static final CloudRainbowHelper INSTANCE = new CloudRainbowHelper();

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudRainbowHelper.mFitnessRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mCloudGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mCloudGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudRainbowHelper.mCloudGson_delegate$lambda$1();
        }
    });

    @NotNull
    private static AtomicInteger pullCount = new AtomicInteger();

    @NotNull
    private static AtomicInteger pushCount = new AtomicInteger();

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pullAndPushRainbowData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pullAndPushRainbowData$1", f = "CloudRainbowHelper.kt", i = {}, l = {69, 70}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CloudRainbowHelper cloudRainbowHelper = CloudRainbowHelper.INSTANCE;
            this.label = 1;
            if (cloudRainbowHelper.pullRainbowData(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            CloudRainbowHelper cloudRainbowHelper2 = CloudRainbowHelper.INSTANCE;
            this.label = 2;
            if (cloudRainbowHelper2.pushRainBowToCloud(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pullRainbowData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper", f = "CloudRainbowHelper.kt", i = {0, 1, 2, 2, 3, 4, 5}, l = {81, 84, 85, 87, 89, 91, 94}, m = "pullRainbowData", n = {"this", "this", "this", "waterMark", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "J$0", "L$0", "L$0", "L$0"})
    public static final class C15971 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C15971(Continuation<? super C15971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRainbowHelper.this.pullRainbowData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pullRainbowDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper", f = "CloudRainbowHelper.kt", i = {0, 1, 1, 1}, l = {139, 141, 148}, m = "pullRainbowDataByWM", n = {"this", "this", "result", "waterMark"}, s = {"L$0", "L$0", "L$1", "J$0"})
    public static final class C15981 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15981(Continuation<? super C15981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRainbowHelper.this.pullRainbowDataByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pullRecentDaysRainbowData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper", f = "CloudRainbowHelper.kt", i = {0, 1, 1, 1}, l = {123, 126, 132}, m = "pullRecentDaysRainbowData", n = {"this", "this", "result", "nextKey"}, s = {"L$0", "L$0", "L$1", "L$2"})
    public static final class C15991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C15991(Continuation<? super C15991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRainbowHelper.this.pullRecentDaysRainbowData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper$pushRainBowToCloud$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper", f = "CloudRainbowHelper.kt", i = {0, 0, 0}, l = {111}, m = "pushRainBowToCloud", n = {"this", "requestList", "hasData"}, s = {"L$0", "L$1", "I$0"})
    public static final class C16001 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16001(Continuation<? super C16001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRainbowHelper.this.pushRainBowToCloud(this);
        }
    }

    private CloudRainbowHelper() {
    }

    private final List<AggregateFitnessData> convertRainbowToServer(List<DailyGoalReport> list) {
        ArrayList arrayList = new ArrayList();
        for (DailyGoalReport dailyGoalReport : list) {
            Long timeInZero = dailyGoalReport.getTimeInZero();
            if (DataCloudUtilKt.isInvalidTime(timeInZero)) {
                HomeDataType homeDataType = HomeDataType.RAINBOW;
                String requestTag = DataCloudUtilKt.getRequestTag(homeDataType);
                long jLongValue = timeInZero != null ? timeInZero.longValue() : 0L;
                String cloudRequestKey = CloudKey.INSTANCE.getCloudRequestKey(homeDataType);
                String json = INSTANCE.getMCloudGson().toJson(dailyGoalReport);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                arrayList.add(new AggregateFitnessData(requestTag, cloudRequestKey, jLongValue, json, 0, null, null, 96, null));
            }
        }
        return arrayList;
    }

    private final Gson getMCloudGson() {
        return (Gson) mCloudGson.getValue();
    }

    private final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mCloudGson_delegate$lambda$1() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    private final void notifyStatus(boolean result) {
        PullRainbowDataApi pullRainbowDataApi = mPullComplete;
        if (pullRainbowDataApi != null) {
            pullRainbowDataApi.isComplete(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullAndPushRainbowData$lambda$2(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        Unit unit = Unit.INSTANCE;
        FitnessLogUtils.d("CloudRainbowHelper", "pullAndPushRainbowData exception=" + unit);
        INSTANCE.notifyStatus(false);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullAndPushRainbowData$lambda$3(AndroidScope androidScope, Throwable th) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$finally");
        pullCount.getAndDecrement();
        FitnessLogUtils.d("CloudRainbowHelper", "pullAndPushRainbowData finally pullcount=" + pullCount.get());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullRainbowData(Continuation<? super Unit> continuation) {
        C15971 c15971;
        CloudRainbowHelper cloudRainbowHelper;
        Long l;
        long jLongValue;
        long jLongValue2;
        ServerRequestDaoUtils serverRequestDaoUtils;
        ServerRequestEntity serverRequestEntity;
        if (continuation instanceof C15971) {
            c15971 = (C15971) continuation;
            int i = c15971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15971.label = i - Integer.MIN_VALUE;
            } else {
                c15971 = new C15971(continuation);
            }
        } else {
            c15971 = new C15971(continuation);
        }
        Object rainbowMaxWatermark = c15971.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c15971.label) {
            case 0:
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = this;
                c15971.label = 1;
                rainbowMaxWatermark = serverRequestDaoUtils2.getRainbowMaxWatermark(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudRainbowHelper = this;
                l = (Long) rainbowMaxWatermark;
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData localWatermark=" + l);
                if (l == null) {
                    FitnessDataRequest mFitnessRequest2 = cloudRainbowHelper.getMFitnessRequest();
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 2;
                    rainbowMaxWatermark = mFitnessRequest2.getRainbowMaxWM(c15971);
                    if (rainbowMaxWatermark == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jLongValue2 = ((Number) rainbowMaxWatermark).longValue();
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.J$0 = jLongValue2;
                    c15971.label = 3;
                    if (serverRequestDaoUtils.updateRainbowMaxWatermark(jLongValue2, c15971) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData updateRainbowMaxWatermark=" + jLongValue2);
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 4;
                    if (pullRecentDaysRainbowData$default(cloudRainbowHelper, null, c15971, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    jLongValue = l.longValue();
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 5;
                    if (cloudRainbowHelper.pullRainbowDataByWM(jLongValue, c15971) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ServerRequestDaoUtils serverRequestDaoUtils3 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 6;
                rainbowMaxWatermark = serverRequestDaoUtils3.getRainbowPullRequest(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null || TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                    return Unit.INSTANCE;
                }
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData entity.nextKey=" + serverRequestEntity.getNextKey());
                String nextKey = serverRequestEntity.getNextKey();
                c15971.L$0 = null;
                c15971.label = 7;
                if (cloudRainbowHelper.pullRecentDaysRainbowData(nextKey, c15971) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                cloudRainbowHelper = (CloudRainbowHelper) c15971.L$0;
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                l = (Long) rainbowMaxWatermark;
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData localWatermark=" + l);
                if (l == null) {
                    FitnessDataRequest mFitnessRequest3 = cloudRainbowHelper.getMFitnessRequest();
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 2;
                    rainbowMaxWatermark = mFitnessRequest3.getRainbowMaxWM(c15971);
                    if (rainbowMaxWatermark == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jLongValue2 = ((Number) rainbowMaxWatermark).longValue();
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.J$0 = jLongValue2;
                    c15971.label = 3;
                    if (serverRequestDaoUtils.updateRainbowMaxWatermark(jLongValue2, c15971) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData updateRainbowMaxWatermark=" + jLongValue2);
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 4;
                    if (pullRecentDaysRainbowData$default(cloudRainbowHelper, null, c15971, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    jLongValue = l.longValue();
                    c15971.L$0 = cloudRainbowHelper;
                    c15971.label = 5;
                    if (cloudRainbowHelper.pullRainbowDataByWM(jLongValue, c15971) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ServerRequestDaoUtils serverRequestDaoUtils4 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 6;
                rainbowMaxWatermark = serverRequestDaoUtils4.getRainbowPullRequest(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                cloudRainbowHelper = (CloudRainbowHelper) c15971.L$0;
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                jLongValue2 = ((Number) rainbowMaxWatermark).longValue();
                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.J$0 = jLongValue2;
                c15971.label = 3;
                if (serverRequestDaoUtils.updateRainbowMaxWatermark(jLongValue2, c15971) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData updateRainbowMaxWatermark=" + jLongValue2);
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 4;
                if (pullRecentDaysRainbowData$default(cloudRainbowHelper, null, c15971, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ServerRequestDaoUtils serverRequestDaoUtils5 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 6;
                rainbowMaxWatermark = serverRequestDaoUtils5.getRainbowPullRequest(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 3:
                jLongValue2 = c15971.J$0;
                cloudRainbowHelper = (CloudRainbowHelper) c15971.L$0;
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowData updateRainbowMaxWatermark=" + jLongValue2);
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 4;
                if (pullRecentDaysRainbowData$default(cloudRainbowHelper, null, c15971, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ServerRequestDaoUtils serverRequestDaoUtils6 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 6;
                rainbowMaxWatermark = serverRequestDaoUtils6.getRainbowPullRequest(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                cloudRainbowHelper = (CloudRainbowHelper) c15971.L$0;
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                ServerRequestDaoUtils serverRequestDaoUtils7 = ServerRequestDaoUtils.INSTANCE;
                c15971.L$0 = cloudRainbowHelper;
                c15971.label = 6;
                rainbowMaxWatermark = serverRequestDaoUtils7.getRainbowPullRequest(c15971);
                if (rainbowMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 6:
                cloudRainbowHelper = (CloudRainbowHelper) c15971.L$0;
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                serverRequestEntity = (ServerRequestEntity) rainbowMaxWatermark;
                if (serverRequestEntity != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(rainbowMaxWatermark);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object pullRainbowDataByWM(long j, Continuation<? super Unit> continuation) {
        C15981 c15981;
        CloudRainbowHelper cloudRainbowHelper;
        AggregateFitnessDataByWaterMark aggregateFitnessDataByWaterMark;
        long waterMark;
        if (continuation instanceof C15981) {
            c15981 = (C15981) continuation;
            int i = c15981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15981.label = i - Integer.MIN_VALUE;
            } else {
                c15981 = new C15981(continuation);
            }
        } else {
            c15981 = new C15981(continuation);
        }
        Object aggregatedDataByWM$default = c15981.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15981.label;
        if (i2 != 0) {
            if (i2 == 1) {
                CloudRainbowHelper cloudRainbowHelper2 = (CloudRainbowHelper) c15981.L$0;
                ResultKt.throwOnFailure(aggregatedDataByWM$default);
                cloudRainbowHelper = cloudRainbowHelper2;
            } else if (i2 == 2) {
                waterMark = c15981.J$0;
                aggregateFitnessDataByWaterMark = (AggregateFitnessDataByWaterMark) c15981.L$1;
                cloudRainbowHelper = (CloudRainbowHelper) c15981.L$0;
                ResultKt.throwOnFailure(aggregatedDataByWM$default);
                cloudRainbowHelper.updateRainBow(aggregateFitnessDataByWaterMark.getList());
                FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowDataByWM hasMore=" + aggregateFitnessDataByWaterMark.getHasMore() + "**waterMark=" + waterMark);
                if (aggregateFitnessDataByWaterMark.getHasMore()) {
                    cloudRainbowHelper.notifyStatus(true);
                    return Unit.INSTANCE;
                }
                c15981.L$0 = null;
                c15981.L$1 = null;
                c15981.label = 3;
                if (cloudRainbowHelper.pullRainbowDataByWM(waterMark, c15981) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(aggregatedDataByWM$default);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(aggregatedDataByWM$default);
        FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
        c15981.L$0 = this;
        c15981.label = 1;
        aggregatedDataByWM$default = FitnessDataRequest.getAggregatedDataByWM$default(mFitnessRequest2, CloudParamsKt.TAG_DAILY_MARK, j, 0, c15981, 4, null);
        if (aggregatedDataByWM$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRainbowHelper = this;
        aggregateFitnessDataByWaterMark = (AggregateFitnessDataByWaterMark) aggregatedDataByWM$default;
        waterMark = aggregateFitnessDataByWaterMark.getWaterMark();
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c15981.L$0 = cloudRainbowHelper;
        c15981.L$1 = aggregateFitnessDataByWaterMark;
        c15981.J$0 = waterMark;
        c15981.label = 2;
        if (serverRequestDaoUtils.updateRainbowMaxWatermark(waterMark, c15981) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRainbowHelper.updateRainBow(aggregateFitnessDataByWaterMark.getList());
        FitnessLogUtils.d("CloudRainbowHelper", "pullRainbowDataByWM hasMore=" + aggregateFitnessDataByWaterMark.getHasMore() + "**waterMark=" + waterMark);
        if (aggregateFitnessDataByWaterMark.getHasMore()) {
            cloudRainbowHelper.notifyStatus(true);
            return Unit.INSTANCE;
        }
        c15981.L$0 = null;
        c15981.L$1 = null;
        c15981.label = 3;
        if (cloudRainbowHelper.pullRainbowDataByWM(waterMark, c15981) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullRecentDaysRainbowData(String str, Continuation<? super Unit> continuation) {
        C15991 c15991;
        CloudRainbowHelper cloudRainbowHelper;
        AggregateFitnessDataByTime aggregateFitnessDataByTime;
        CloudRainbowHelper cloudRainbowHelper2;
        String str2;
        if (continuation instanceof C15991) {
            c15991 = (C15991) continuation;
            int i = c15991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15991.label = i - Integer.MIN_VALUE;
            } else {
                c15991 = new C15991(continuation);
            }
        } else {
            c15991 = new C15991(continuation);
        }
        Object aggregatedDataByTime = c15991.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15991.label;
        if (i2 != 0) {
            if (i2 == 1) {
                cloudRainbowHelper = (CloudRainbowHelper) c15991.L$0;
                ResultKt.throwOnFailure(aggregatedDataByTime);
            } else if (i2 == 2) {
                str2 = (String) c15991.L$2;
                aggregateFitnessDataByTime = (AggregateFitnessDataByTime) c15991.L$1;
                cloudRainbowHelper2 = (CloudRainbowHelper) c15991.L$0;
                ResultKt.throwOnFailure(aggregatedDataByTime);
                FitnessLogUtils.d("CloudRainbowHelper", "pullRecentDaysRainbowData hasMore=" + aggregateFitnessDataByTime.getHasMore() + "**nextKey=" + str2);
                if (aggregateFitnessDataByTime.getHasMore() || TextUtils.isEmpty(str2)) {
                    cloudRainbowHelper2.notifyStatus(true);
                    return Unit.INSTANCE;
                }
                c15991.L$0 = null;
                c15991.L$1 = null;
                c15991.L$2 = null;
                c15991.label = 3;
                if (cloudRainbowHelper2.pullRecentDaysRainbowData(str2, c15991) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(aggregatedDataByTime);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(aggregatedDataByTime);
        AggregateFitnessDataByTimeParam aggregateFitnessDataByTimeParam = new AggregateFitnessDataByTimeParam(CloudParamsKt.TAG_DAILY_FITNESS, str);
        FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
        c15991.L$0 = this;
        c15991.label = 1;
        aggregatedDataByTime = mFitnessRequest2.getAggregatedDataByTime(aggregateFitnessDataByTimeParam, c15991);
        if (aggregatedDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRainbowHelper = this;
        aggregateFitnessDataByTime = (AggregateFitnessDataByTime) aggregatedDataByTime;
        String nextKey = aggregateFitnessDataByTime.getNextKey();
        cloudRainbowHelper.updateRainBow(aggregateFitnessDataByTime.getList());
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c15991.L$0 = cloudRainbowHelper;
        c15991.L$1 = aggregateFitnessDataByTime;
        c15991.L$2 = nextKey;
        c15991.label = 2;
        if (serverRequestDaoUtils.updateRainBowPullRequest(nextKey, c15991) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRainbowHelper2 = cloudRainbowHelper;
        str2 = nextKey;
        FitnessLogUtils.d("CloudRainbowHelper", "pullRecentDaysRainbowData hasMore=" + aggregateFitnessDataByTime.getHasMore() + "**nextKey=" + str2);
        if (aggregateFitnessDataByTime.getHasMore()) {
        }
        cloudRainbowHelper2.notifyStatus(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object pullRecentDaysRainbowData$default(CloudRainbowHelper cloudRainbowHelper, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cloudRainbowHelper.pullRecentDaysRainbowData(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a A[LOOP:0: B:15:0x0042->B:18:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a3 -> B:29:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object pushRainBowToCloud(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper.pushRainBowToCloud(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void updateRainBow(List<AggregateFitnessData> list) {
        ArrayList arrayList = new ArrayList();
        for (AggregateFitnessData aggregateFitnessData : list) {
            try {
                DailyGoalReport dailyGoalReport = (DailyGoalReport) getMCloudGson().fromJson(aggregateFitnessData.getValue(), DailyGoalReport.class);
                if (dailyGoalReport.validate()) {
                    RainbowDaoProxy rainbowDaoProxy = RainbowDaoProxy.INSTANCE;
                    Intrinsics.checkNotNull(dailyGoalReport);
                    boolean zUpdateRainbowFromCloud = rainbowDaoProxy.updateRainbowFromCloud(dailyGoalReport);
                    String json = getMCloudGson().toJson(dailyGoalReport, DailyGoalReport.class);
                    long time = aggregateFitnessData.getTime();
                    Intrinsics.checkNotNull(json);
                    DailyGoalReportEntity dailyGoalReportEntity = new DailyGoalReportEntity(time, json);
                    dailyGoalReportEntity.setUpload(!zUpdateRainbowFromCloud);
                    arrayList.add(dailyGoalReportEntity);
                }
            } catch (Exception e) {
                FitnessLogUtils.e("CloudRainbowHelper", "updateRainBow error", e);
            }
        }
        RainbowDaoProxy rainbowDaoProxy2 = RainbowDaoProxy.INSTANCE;
        DailyGoalReportEntity[] dailyGoalReportEntityArr = (DailyGoalReportEntity[]) arrayList.toArray(new DailyGoalReportEntity[0]);
        rainbowDaoProxy2.insertRainbows((DailyGoalReportEntity[]) Arrays.copyOf(dailyGoalReportEntityArr, dailyGoalReportEntityArr.length));
    }

    public final void pullAndPushRainbowData() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt == null || !RegionExtKt.isRegionSelected(regionExtKt)) {
            FitnessLogUtils.i("CloudRainbowHelper", "pullAndPushRainbowData: region not selected");
            return;
        }
        if (!DataCloudUtilKt.isEnable()) {
            FitnessLogUtils.i("CloudRainbowHelper", "pullAndPushRainbowData abort due to cloud sync switch close");
            notifyStatus(true);
        } else {
            if (pullCount.get() > 0) {
                return;
            }
            pullCount.getAndIncrement();
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new AnonymousClass1(null)).m503catch(new Function2() { // from class: q24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CloudRainbowHelper.pullAndPushRainbowData$lambda$2((AndroidScope) obj, (Throwable) obj2);
                }
            }).m505finally(new Function2() { // from class: r24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CloudRainbowHelper.pullAndPushRainbowData$lambda$3((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    public final void setStatusListener(@NotNull PullRainbowDataApi result) {
        Intrinsics.checkNotNullParameter(result, "result");
        mPullComplete = result;
    }
}
