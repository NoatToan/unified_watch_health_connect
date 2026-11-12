package com.xiaomi.fit.fitness.persist.dailyreport;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudRedDot;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessData;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTimeParam;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByWaterMark;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.CloudParamsKt;
import com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u001a\u0010\u001d\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0082@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/dailyreport/CloudRedDotHelper;", "", "<init>", "()V", "TAG", "", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "mCloudGson", "Lcom/google/gson/Gson;", "getMCloudGson", "()Lcom/google/gson/Gson;", "mCloudGson$delegate", "pullCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "pushCount", "pullRedDotData", "", "pushRedDotUpCloud", "convertRedDot", "", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "list", "Lcom/xiaomi/fitness/aggregation/health/entity/RedDotEntity;", "pullRequestFinish", "pullRecentDaysRedDotData", "nextKey", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullRedDotDataByWM", "watermark", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRedDot", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudRedDotHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudRedDotHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudRedDotHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1863#2,2:171\n*S KotlinDebug\n*F\n+ 1 CloudRedDotHelper.kt\ncom/xiaomi/fit/fitness/persist/dailyreport/CloudRedDotHelper\n*L\n158#1:171,2\n*E\n"})
public final class CloudRedDotHelper {

    @NotNull
    private static final String TAG = "CloudRedDotHelper";

    @NotNull
    public static final CloudRedDotHelper INSTANCE = new CloudRedDotHelper();

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudRedDotHelper.mFitnessRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mCloudGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mCloudGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudRedDotHelper.mCloudGson_delegate$lambda$1();
        }
    });

    @NotNull
    private static AtomicInteger pullCount = new AtomicInteger();

    @NotNull
    private static AtomicInteger pushCount = new AtomicInteger();

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pullRecentDaysRedDotData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper", f = "CloudRedDotHelper.kt", i = {0, 1, 1, 1}, l = {125, 128, 134}, m = "pullRecentDaysRedDotData", n = {"this", "this", "result", "nextKey"}, s = {"L$0", "L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRedDotHelper.this.pullRecentDaysRedDotData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pullRedDotData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pullRedDotData$1", f = "CloudRedDotHelper.kt", i = {6}, l = {45, 48, 50, 51, 53, 55, 57}, m = "invokeSuspend", n = {"entity"}, s = {"L$0"})
    public static final class C16011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C16011(Continuation<? super C16011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16011(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0059  */
        /* JADX WARN: Code duplicated, block: B:19:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x009b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x009c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00b7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Long l;
            CloudRedDotHelper cloudRedDotHelper;
            long jLongValue;
            long jLongValue2;
            ServerRequestDaoUtils serverRequestDaoUtils;
            CloudRedDotHelper cloudRedDotHelper2;
            ServerRequestEntity serverRequestEntity;
            CloudRedDotHelper cloudRedDotHelper3;
            String nextKey;
            ServerRequestEntity serverRequestEntity2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 1;
                    obj = serverRequestDaoUtils2.getRedDotMaxWatermark(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    l = (Long) obj;
                    FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData localWatermark=" + l);
                    if (l == null) {
                        FitnessDataRequest mFitnessRequest = CloudRedDotHelper.INSTANCE.getMFitnessRequest();
                        this.label = 2;
                        obj = mFitnessRequest.getRedPointMaxWM(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue2 = ((Number) obj).longValue();
                        FitnessLogUtils.i(CloudRedDotHelper.TAG, "pullRedDotData updateRainbowMaxWatermark=" + jLongValue2);
                        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                        this.label = 3;
                        if (serverRequestDaoUtils.updateRedDotMaxWatermark(jLongValue2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cloudRedDotHelper2 = CloudRedDotHelper.INSTANCE;
                        this.label = 4;
                        if (CloudRedDotHelper.pullRecentDaysRedDotData$default(cloudRedDotHelper2, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        cloudRedDotHelper = CloudRedDotHelper.INSTANCE;
                        jLongValue = l.longValue();
                        this.label = 5;
                        if (cloudRedDotHelper.pullRedDotDataByWM(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    ServerRequestDaoUtils serverRequestDaoUtils3 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 6;
                    obj = serverRequestDaoUtils3.getRedDotPullRequest(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null && !TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    l = (Long) obj;
                    FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData localWatermark=" + l);
                    if (l == null) {
                        FitnessDataRequest mFitnessRequest2 = CloudRedDotHelper.INSTANCE.getMFitnessRequest();
                        this.label = 2;
                        obj = mFitnessRequest2.getRedPointMaxWM(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jLongValue2 = ((Number) obj).longValue();
                        FitnessLogUtils.i(CloudRedDotHelper.TAG, "pullRedDotData updateRainbowMaxWatermark=" + jLongValue2);
                        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                        this.label = 3;
                        if (serverRequestDaoUtils.updateRedDotMaxWatermark(jLongValue2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cloudRedDotHelper2 = CloudRedDotHelper.INSTANCE;
                        this.label = 4;
                        if (CloudRedDotHelper.pullRecentDaysRedDotData$default(cloudRedDotHelper2, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        cloudRedDotHelper = CloudRedDotHelper.INSTANCE;
                        jLongValue = l.longValue();
                        this.label = 5;
                        if (cloudRedDotHelper.pullRedDotDataByWM(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    ServerRequestDaoUtils serverRequestDaoUtils4 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 6;
                    obj = serverRequestDaoUtils4.getRedDotPullRequest(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    jLongValue2 = ((Number) obj).longValue();
                    FitnessLogUtils.i(CloudRedDotHelper.TAG, "pullRedDotData updateRainbowMaxWatermark=" + jLongValue2);
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    this.label = 3;
                    if (serverRequestDaoUtils.updateRedDotMaxWatermark(jLongValue2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cloudRedDotHelper2 = CloudRedDotHelper.INSTANCE;
                    this.label = 4;
                    if (CloudRedDotHelper.pullRecentDaysRedDotData$default(cloudRedDotHelper2, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ServerRequestDaoUtils serverRequestDaoUtils5 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 6;
                    obj = serverRequestDaoUtils5.getRedDotPullRequest(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    cloudRedDotHelper2 = CloudRedDotHelper.INSTANCE;
                    this.label = 4;
                    if (CloudRedDotHelper.pullRecentDaysRedDotData$default(cloudRedDotHelper2, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ServerRequestDaoUtils serverRequestDaoUtils6 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 6;
                    obj = serverRequestDaoUtils6.getRedDotPullRequest(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 4:
                case 5:
                    ResultKt.throwOnFailure(obj);
                    ServerRequestDaoUtils serverRequestDaoUtils7 = ServerRequestDaoUtils.INSTANCE;
                    this.label = 6;
                    obj = serverRequestDaoUtils7.getRedDotPullRequest(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    serverRequestEntity = (ServerRequestEntity) obj;
                    if (serverRequestEntity != null) {
                        cloudRedDotHelper3 = CloudRedDotHelper.INSTANCE;
                        nextKey = serverRequestEntity.getNextKey();
                        this.L$0 = serverRequestEntity;
                        this.label = 7;
                        if (cloudRedDotHelper3.pullRecentDaysRedDotData(nextKey, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        serverRequestEntity2 = serverRequestEntity;
                        FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    }
                    return Unit.INSTANCE;
                case 7:
                    serverRequestEntity2 = (ServerRequestEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    FitnessLogUtils.d(CloudRedDotHelper.TAG, "pullRedDotData entity.nextKey=" + serverRequestEntity2 + ".nextKey");
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pullRedDotDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper", f = "CloudRedDotHelper.kt", i = {0, 1, 1}, l = {141, 142, 149}, m = "pullRedDotDataByWM", n = {"this", "this", "result"}, s = {"L$0", "L$0", "L$1"})
    public static final class C16021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16021(Continuation<? super C16021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudRedDotHelper.this.pullRedDotDataByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pushRedDotUpCloud$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper$pushRedDotUpCloud$1", f = "CloudRedDotHelper.kt", i = {0, 0}, l = {84}, m = "invokeSuspend", n = {"requestList", "hasData"}, s = {"L$0", "I$0"})
    public static final class C16031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        public C16031(Continuation<? super C16031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16031(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:12:0x004b A[LOOP:0: B:9:0x0021->B:12:0x004b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:15:0x0064  */
        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Code duplicated, block: B:19:0x0077 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:28:0x0058 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:21:0x007b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0067
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                int r1 = r7.I$0
                java.lang.Object r3 = r7.L$0
                java.util.List r3 = (java.util.List) r3
                kotlin.ResultKt.throwOnFailure(r8)
                goto L7b
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r2
            L21:
                if (r1 == 0) goto L8c
                com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy r8 = com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy.INSTANCE
                r3 = 20
                java.util.List r8 = r8.getNotUpCloudList(r3)
                int r3 = r8.size()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "pushRedDotUpCloud dataList.size="
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                java.lang.String r4 = "CloudRedDotHelper"
                com.xiaomi.fit.data.common.log.FitnessLogUtils.i(r4, r3)
                boolean r3 = r8.isEmpty()
                if (r3 == 0) goto L58
                java.util.concurrent.atomic.AtomicInteger r8 = com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.access$getPushCount$p()
                int r8 = r8.getAndDecrement()
                kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
                r1 = 0
                goto L21
            L58:
                com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper r3 = com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.INSTANCE
                java.util.List r8 = com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.access$convertRedDot(r3, r8)
                boolean r4 = r8.isEmpty()
                if (r4 == 0) goto L67
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L67:
                com.xiaomi.fit.fitness.persist.server.FitnessDataRequest r3 = com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.access$getMFitnessRequest(r3)
                r7.L$0 = r8
                r7.I$0 = r1
                r7.label = r2
                java.lang.Object r3 = r3.upAggregatedData(r8, r7)
                if (r3 != r0) goto L78
                return r0
            L78:
                r6 = r3
                r3 = r8
                r8 = r6
            L7b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L88
                com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper r8 = com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.INSTANCE
                com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.access$updateRedDot(r8, r3)
            L88:
                com.xiaomi.fit.fitness.persist.dailyreport.utils.DataCloudUtilKt.requestTimeInterval()
                goto L21
            L8c:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper.C16031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CloudRedDotHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AggregateFitnessData> convertRedDot(List<RedDotEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (RedDotEntity redDotEntity : list) {
            String cloudRequestKey = CloudKey.INSTANCE.getCloudRequestKey(redDotEntity.getDataType());
            if (!TextUtils.isEmpty(cloudRequestKey)) {
                long timeInZero = redDotEntity.getTimeInZero();
                if (DataCloudUtilKt.isInvalidTime(Long.valueOf(timeInZero))) {
                    String json = getMCloudGson().toJson(new CloudRedDot(!redDotEntity.getIsDeleted()));
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    arrayList.add(new AggregateFitnessData(CloudParamsKt.TAG_DAILY_MARK, cloudRequestKey, timeInZero, json, 0, null, null, 96, null));
                }
            }
        }
        return arrayList;
    }

    private final Gson getMCloudGson() {
        return (Gson) mCloudGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessDataRequest getMFitnessRequest() {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullRecentDaysRedDotData(String str, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        CloudRedDotHelper cloudRedDotHelper;
        AggregateFitnessDataByTime aggregateFitnessDataByTime;
        CloudRedDotHelper cloudRedDotHelper2;
        String str2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object aggregatedDataByTime = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                cloudRedDotHelper = (CloudRedDotHelper) anonymousClass1.L$0;
                ResultKt.throwOnFailure(aggregatedDataByTime);
            } else if (i2 == 2) {
                str2 = (String) anonymousClass1.L$2;
                aggregateFitnessDataByTime = (AggregateFitnessDataByTime) anonymousClass1.L$1;
                cloudRedDotHelper2 = (CloudRedDotHelper) anonymousClass1.L$0;
                ResultKt.throwOnFailure(aggregatedDataByTime);
                FitnessLogUtils.d(TAG, "pullRecentDaysRedDotData hasMore=" + aggregateFitnessDataByTime.getHasMore() + "**nextKey=" + str2);
                if (aggregateFitnessDataByTime.getHasMore() || TextUtils.isEmpty(str2)) {
                    cloudRedDotHelper2.pullRequestFinish();
                    return Unit.INSTANCE;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 3;
                if (cloudRedDotHelper2.pullRecentDaysRedDotData(str2, anonymousClass1) == coroutine_suspended) {
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
        AggregateFitnessDataByTimeParam aggregateFitnessDataByTimeParam = new AggregateFitnessDataByTimeParam(CloudParamsKt.TAG_DAILY_MARK, str);
        FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        aggregatedDataByTime = mFitnessRequest2.getAggregatedDataByTime(aggregateFitnessDataByTimeParam, anonymousClass1);
        if (aggregatedDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRedDotHelper = this;
        aggregateFitnessDataByTime = (AggregateFitnessDataByTime) aggregatedDataByTime;
        String nextKey = aggregateFitnessDataByTime.getNextKey();
        cloudRedDotHelper.updateRedDot(aggregateFitnessDataByTime.getList());
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        anonymousClass1.L$0 = cloudRedDotHelper;
        anonymousClass1.L$1 = aggregateFitnessDataByTime;
        anonymousClass1.L$2 = nextKey;
        anonymousClass1.label = 2;
        if (serverRequestDaoUtils.updateRedDotPullRequest(nextKey, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRedDotHelper2 = cloudRedDotHelper;
        str2 = nextKey;
        FitnessLogUtils.d(TAG, "pullRecentDaysRedDotData hasMore=" + aggregateFitnessDataByTime.getHasMore() + "**nextKey=" + str2);
        if (aggregateFitnessDataByTime.getHasMore()) {
        }
        cloudRedDotHelper2.pullRequestFinish();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object pullRecentDaysRedDotData$default(CloudRedDotHelper cloudRedDotHelper, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cloudRedDotHelper.pullRecentDaysRedDotData(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullRedDotData$lambda$2(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        Unit unit = Unit.INSTANCE;
        FitnessLogUtils.d(TAG, "pullRedDotData exception=" + unit);
        pullCount.getAndDecrement();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullRedDotDataByWM(long j, Continuation<? super Unit> continuation) {
        C16021 c16021;
        CloudRedDotHelper cloudRedDotHelper;
        AggregateFitnessDataByWaterMark aggregateFitnessDataByWaterMark;
        long waterMark;
        if (continuation instanceof C16021) {
            c16021 = (C16021) continuation;
            int i = c16021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16021.label = i - Integer.MIN_VALUE;
            } else {
                c16021 = new C16021(continuation);
            }
        } else {
            c16021 = new C16021(continuation);
        }
        Object aggregatedDataByWM$default = c16021.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16021.label;
        if (i2 != 0) {
            if (i2 == 1) {
                CloudRedDotHelper cloudRedDotHelper2 = (CloudRedDotHelper) c16021.L$0;
                ResultKt.throwOnFailure(aggregatedDataByWM$default);
                cloudRedDotHelper = cloudRedDotHelper2;
            } else if (i2 == 2) {
                aggregateFitnessDataByWaterMark = (AggregateFitnessDataByWaterMark) c16021.L$1;
                cloudRedDotHelper = (CloudRedDotHelper) c16021.L$0;
                ResultKt.throwOnFailure(aggregatedDataByWM$default);
                cloudRedDotHelper.updateRedDot(aggregateFitnessDataByWaterMark.getList());
                FitnessLogUtils.d(TAG, "pullRedDotDataByWM hasMore=" + aggregateFitnessDataByWaterMark.getHasMore() + "**waterMark=" + aggregateFitnessDataByWaterMark.getWaterMark());
                if (aggregateFitnessDataByWaterMark.getHasMore()) {
                    cloudRedDotHelper.pullRequestFinish();
                    return Unit.INSTANCE;
                }
                waterMark = aggregateFitnessDataByWaterMark.getWaterMark();
                c16021.L$0 = null;
                c16021.L$1 = null;
                c16021.label = 3;
                if (cloudRedDotHelper.pullRedDotDataByWM(waterMark, c16021) == coroutine_suspended) {
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
        c16021.L$0 = this;
        c16021.label = 1;
        aggregatedDataByWM$default = FitnessDataRequest.getAggregatedDataByWM$default(mFitnessRequest2, CloudParamsKt.TAG_DAILY_MARK, j, 0, c16021, 4, null);
        if (aggregatedDataByWM$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRedDotHelper = this;
        aggregateFitnessDataByWaterMark = (AggregateFitnessDataByWaterMark) aggregatedDataByWM$default;
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        long waterMark2 = aggregateFitnessDataByWaterMark.getWaterMark();
        c16021.L$0 = cloudRedDotHelper;
        c16021.L$1 = aggregateFitnessDataByWaterMark;
        c16021.label = 2;
        if (serverRequestDaoUtils.updateRedDotMaxWatermark(waterMark2, c16021) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudRedDotHelper.updateRedDot(aggregateFitnessDataByWaterMark.getList());
        FitnessLogUtils.d(TAG, "pullRedDotDataByWM hasMore=" + aggregateFitnessDataByWaterMark.getHasMore() + "**waterMark=" + aggregateFitnessDataByWaterMark.getWaterMark());
        if (aggregateFitnessDataByWaterMark.getHasMore()) {
            cloudRedDotHelper.pullRequestFinish();
            return Unit.INSTANCE;
        }
        waterMark = aggregateFitnessDataByWaterMark.getWaterMark();
        c16021.L$0 = null;
        c16021.L$1 = null;
        c16021.label = 3;
        if (cloudRedDotHelper.pullRedDotDataByWM(waterMark, c16021) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final void pullRequestFinish() {
        pullCount.getAndDecrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushRedDotUpCloud$lambda$3(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        Unit unit = Unit.INSTANCE;
        FitnessLogUtils.d(TAG, "pushRedDotUpCloud exception=" + unit);
        pushCount.getAndDecrement();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRedDot(List<AggregateFitnessData> list) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AggregateFitnessData aggregateFitnessData : list) {
            String sid = aggregateFitnessData.getSid();
            if (sid == null) {
                sid = "default";
            }
            RedDotEntity redDotEntity = new RedDotEntity(sid, CloudKey.INSTANCE.getHomeDataType(aggregateFitnessData.getKey()), jCurrentTimeMillis, aggregateFitnessData.getTime());
            redDotEntity.setUpload(true);
            redDotEntity.setDeleted(true ^ ((CloudRedDot) INSTANCE.getMCloudGson().fromJson(aggregateFitnessData.getValue(), CloudRedDot.class)).getHasData());
            arrayList.add(redDotEntity);
        }
        RedDotDaoProxy.INSTANCE.updateAfterCloud(arrayList);
    }

    public final void pullRedDotData() {
        if (!DataCloudUtilKt.isEnable()) {
            FitnessLogUtils.i(TAG, "pullRedDotData abort dueto cloud sync switch close");
        } else {
            if (pullCount.get() > 0) {
                return;
            }
            pullCount.getAndIncrement();
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new C16011(null)).m503catch(new Function2() { // from class: v24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CloudRedDotHelper.pullRedDotData$lambda$2((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }

    public final void pushRedDotUpCloud() {
        if (!DataCloudUtilKt.isEnable()) {
            FitnessLogUtils.i(TAG, "pushRedDotUpCloud abort dueto cloud sync switch close");
        } else {
            if (pushCount.get() > 0) {
                return;
            }
            pushCount.getAndIncrement();
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new C16031(null)).m503catch(new Function2() { // from class: u24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CloudRedDotHelper.pushRedDotUpCloud$lambda$3((AndroidScope) obj, (Throwable) obj2);
                }
            });
        }
    }
}
