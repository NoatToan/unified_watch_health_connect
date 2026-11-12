package com.xiaomi.fitness.repo.sleep.net;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByTimeParams;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByWMParams;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.SleepAnimal;
import com.xiaomi.fit.fitness.persist.server.data.StatDataModel;
import com.xiaomi.fit.fitness.persist.server.data.StatPersistKey;
import com.xiaomi.fit.fitness.persist.server.data.TriggerStatParams;
import com.xiaomi.fit.fitness.persist.server.data.TriggerStatResponse;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010\u000eJ<\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\tJ\u001e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001eJ&\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010!J*\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001eJ\u001c\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0014H\u0002J\u001e\u0010*\u001a\u00020\t2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u000bH\u0082@¢\u0006\u0002\u0010\f¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest;", "", "<init>", "()V", "getLatestSleepAnimal", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "getLatestSleepAnimalSync", "deleteSleepAnimal", "", "list", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerComputeSleepAnimal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLimitedSleepAnimal", "startTime", "", "endTime", CloudContract.COL_ZONE_OFFSET, "", "limit", "reverse", "", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullSleepAnimalData", "pullStatData", "tag", "", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullStatDataByWM", "watermark", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullStatDataByTime", "nextKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushDeletedStatData", "convertServerToLocalAnimalReport", "data", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "curZoneOffset", "saveStatDataToDB", "dataList", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepStatDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStatDataRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n53#2:208\n55#2:212\n50#3:209\n55#3:211\n107#4:210\n1863#5,2:213\n1863#5,2:215\n1863#5,2:217\n1863#5,2:219\n*S KotlinDebug\n*F\n+ 1 SleepStatDataRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest\n*L\n30#1:208\n30#1:212\n30#1:209\n30#1:211\n30#1:210\n47#1:213,2\n84#1:215,2\n163#1:217,2\n188#1:219,2\n*E\n"})
public final class SleepStatDataRequest {

    @NotNull
    private static final String TAG = "SleepStatDataRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SleepStatDataRequest instance = new SleepStatDataRequest();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest;", "getInstance", "()Lcom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepStatDataRequest getInstance() {
            return SleepStatDataRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$deleteSleepAnimal$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0}, l = {50}, m = "deleteSleepAnimal", n = {"deleteList"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return SleepStatDataRequest.this.deleteSleepAnimal(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$getLimitedSleepAnimal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0}, l = {77}, m = "getLimitedSleepAnimal", n = {"this", CloudContract.COL_ZONE_OFFSET}, s = {"L$0", "I$0"})
    public static final class C28531 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28531(Continuation<? super C28531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.getLimitedSleepAnimal(0L, 0L, 0, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pullSleepAnimalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pullSleepAnimalData$1", f = "SleepStatDataRequest.kt", i = {}, l = {96, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class C28541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C28541(Continuation<? super C28541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepStatDataRequest.this.new C28541(continuation);
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
            SleepStatDataRequest sleepStatDataRequest = SleepStatDataRequest.this;
            this.label = 1;
            if (sleepStatDataRequest.pullStatData(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            SleepStatDataRequest sleepStatDataRequest2 = SleepStatDataRequest.this;
            this.label = 2;
            if (sleepStatDataRequest2.pushDeletedStatData(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pullStatData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 4}, l = {111, 113, 114, 116, 118}, m = "pullStatData", n = {"this", "tag", "key", "this", "tag", "key", "tag", "key", "maxWM", "tag", "key"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "J$0", "L$0", "L$1"})
    public static final class C28551 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C28551(Continuation<? super C28551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.pullStatData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pullStatDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {142, 143, 144, 148}, m = "pullStatDataByTime", n = {"this", "tag", "key", "this", "tag", "key", "dataResult", "this", "tag", "key", "dataResult", "hasData"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C28561 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C28561(Continuation<? super C28561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.pullStatDataByTime(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pullStatDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {125, 126, 127, 131}, m = "pullStatDataByWM", n = {"this", "tag", "key", "this", "tag", "key", "dataResult", "this", "tag", "key", "dataResult", "hasData"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C28571 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C28571(Continuation<? super C28571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.pullStatDataByWM(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$pushDeletedStatData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0, 1, 1, 1, 1, 2, 2}, l = {157, 166, 169}, m = "pushDeletedStatData", n = {"tag", "key", "tag", "key", "deleteList", "keyList", "tag", "key"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class C28581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C28581(Continuation<? super C28581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.pushDeletedStatData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$triggerComputeSleepAnimal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest", f = "SleepStatDataRequest.kt", i = {0, 0}, l = {61}, m = "triggerComputeSleepAnimal", n = {"this", CloudContract.COL_ZONE_OFFSET}, s = {"L$0", "I$0"})
    public static final class C28591 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28591(Continuation<? super C28591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepStatDataRequest.this.triggerComputeSleepAnimal(this);
        }
    }

    private SleepStatDataRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepAnimalReport convertServerToLocalAnimalReport(StatDataModel data, int curZoneOffset) {
        List<Long> sampleDates;
        SleepAnimal sleepAnimal = (SleepAnimal) FitnessPersistUtils.INSTANCE.fromJson(data != null ? data.getValue() : null, SleepAnimal.class);
        if (sleepAnimal == null || !((sampleDates = sleepAnimal.getSampleDates()) == null || (!sampleDates.isEmpty()))) {
            FitnessLogUtils.w(TAG, "triggerComputeSleepAnimal: empty animal(" + (data != null ? data.getValue() : null) + ")");
            return null;
        }
        Integer numValueOf = data != null ? Integer.valueOf(data.getZoneOffset()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue() - curZoneOffset;
        ArrayList arrayList = new ArrayList();
        long j = iIntValue;
        SleepAnimalReport sleepAnimalReport = new SleepAnimalReport(data.getTime() + j, arrayList);
        List<Long> sampleDates2 = sleepAnimal.getSampleDates();
        Intrinsics.checkNotNull(sampleDates2);
        Iterator<T> it = sampleDates2.iterator();
        long j2 = Long.MAX_VALUE;
        long j3 = 0;
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue() + j;
            arrayList.add(Long.valueOf(jLongValue));
            if (jLongValue < j2) {
                j2 = jLongValue;
            }
            if (jLongValue > j3) {
                j3 = jLongValue;
            }
        }
        int type = sleepAnimal.getType();
        if (1 <= type && type < 7) {
            sleepAnimalReport.setAnimal(new AnimalInfo(sleepAnimal.getType(), j2, j3, sleepAnimal.getStatTime() + j));
        }
        sleepAnimalReport.setDbTime(Long.valueOf(data.getTime()));
        return sleepAnimalReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullSleepAnimalData$lambda$3(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.e(TAG, "pullSleepAnimalData", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object pullStatData(String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        C28551 c28551;
        SleepStatDataRequest sleepStatDataRequest;
        String str3;
        String str4;
        String str5;
        String str6;
        long jLongValue;
        Object objPullStatDataByTime$default;
        String str7;
        String str8;
        long j;
        ServerRequestDaoUtils serverRequestDaoUtils;
        String str9 = str;
        String str10 = str2;
        if (continuation instanceof C28551) {
            c28551 = (C28551) continuation;
            int i = c28551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28551.label = i - Integer.MIN_VALUE;
            } else {
                c28551 = new C28551(continuation);
            }
        } else {
            c28551 = new C28551(continuation);
        }
        Object statDataMaxWatermark = c28551.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(statDataMaxWatermark);
            CloudSyncCheckResult cloudSyncCheckResultCheckServerRequestEnable = FitnessPersistUtils.INSTANCE.checkServerRequestEnable();
            if (cloudSyncCheckResultCheckServerRequestEnable != CloudSyncCheckResult.SUCCESS) {
                FitnessLogUtils.i(TAG, "pullStatData: limit (" + cloudSyncCheckResultCheckServerRequestEnable + "), abort this request");
                return Unit.INSTANCE;
            }
            ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
            c28551.L$0 = this;
            c28551.L$1 = str9;
            c28551.L$2 = str10;
            c28551.label = 1;
            statDataMaxWatermark = serverRequestDaoUtils2.getStatDataMaxWatermark(str9, str10, c28551);
            if (statDataMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepStatDataRequest = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str6 = (String) c28551.L$2;
                    str5 = (String) c28551.L$1;
                    sleepStatDataRequest = (SleepStatDataRequest) c28551.L$0;
                    ResultKt.throwOnFailure(statDataMaxWatermark);
                    jLongValue = ((Number) statDataMaxWatermark).longValue();
                    c28551.L$0 = str5;
                    c28551.L$1 = str6;
                    c28551.L$2 = null;
                    c28551.J$0 = jLongValue;
                    c28551.label = 3;
                    objPullStatDataByTime$default = pullStatDataByTime$default(sleepStatDataRequest, str5, str6, null, c28551, 4, null);
                    if (objPullStatDataByTime$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str7 = str6;
                    str8 = str5;
                    j = jLongValue;
                    FitnessLogUtils.i(TAG, "pullStatDataByTime:(" + str8 + "-" + str7 + "),hasData(" + ((Boolean) objPullStatDataByTime$default).booleanValue() + ")-" + j);
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c28551.L$0 = r11;
                    c28551.L$1 = 0;
                    c28551.label = 4;
                    if (serverRequestDaoUtils.updateStatMaxWatermark(str8, str7, j, c28551) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 3) {
                    long j2 = c28551.J$0;
                    String str11 = (String) c28551.L$1;
                    str8 = (String) c28551.L$0;
                    ResultKt.throwOnFailure(statDataMaxWatermark);
                    j = j2;
                    str7 = str11;
                    objPullStatDataByTime$default = statDataMaxWatermark;
                    FitnessLogUtils.i(TAG, "pullStatDataByTime:(" + str8 + "-" + str7 + "),hasData(" + ((Boolean) objPullStatDataByTime$default).booleanValue() + ")-" + j);
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c28551.L$0 = r11;
                    c28551.L$1 = 0;
                    c28551.label = 4;
                    if (serverRequestDaoUtils.updateStatMaxWatermark(str8, str7, j, c28551) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = (String) c28551.L$1;
                        str3 = (String) c28551.L$0;
                        ResultKt.throwOnFailure(statDataMaxWatermark);
                        FitnessLogUtils.i(TAG, "pullStatDataByWM:(" + str3 + "-" + str4 + "), hasData(" + ((Boolean) statDataMaxWatermark).booleanValue() + ")");
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(statDataMaxWatermark);
                }
                return Unit.INSTANCE;
            }
            String str12 = (String) c28551.L$2;
            String str13 = (String) c28551.L$1;
            sleepStatDataRequest = (SleepStatDataRequest) c28551.L$0;
            ResultKt.throwOnFailure(statDataMaxWatermark);
            str10 = str12;
            str9 = str13;
        }
        Long l = (Long) statDataMaxWatermark;
        if (l != null) {
            long jLongValue2 = l.longValue();
            c28551.L$0 = str9;
            c28551.L$1 = str10;
            c28551.L$2 = null;
            c28551.label = 5;
            statDataMaxWatermark = sleepStatDataRequest.pullStatDataByWM(str9, str10, jLongValue2, c28551);
            if (statDataMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str14 = str10;
            str3 = str9;
            str4 = str14;
            FitnessLogUtils.i(TAG, "pullStatDataByWM:(" + str3 + "-" + str4 + "), hasData(" + ((Boolean) statDataMaxWatermark).booleanValue() + ")");
            return Unit.INSTANCE;
        }
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c28551.L$0 = sleepStatDataRequest;
        c28551.L$1 = str9;
        c28551.L$2 = str10;
        c28551.label = 2;
        statDataMaxWatermark = companion.getStatMaxWaterMark(str9, str10, c28551);
        if (statDataMaxWatermark == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str15 = str10;
        str5 = str9;
        str6 = str15;
        jLongValue = ((Number) statDataMaxWatermark).longValue();
        c28551.L$0 = str5;
        c28551.L$1 = str6;
        c28551.L$2 = null;
        c28551.J$0 = jLongValue;
        c28551.label = 3;
        objPullStatDataByTime$default = pullStatDataByTime$default(sleepStatDataRequest, str5, str6, null, c28551, 4, null);
        if (objPullStatDataByTime$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        str7 = str6;
        str8 = str5;
        j = jLongValue;
        FitnessLogUtils.i(TAG, "pullStatDataByTime:(" + str8 + "-" + str7 + "),hasData(" + ((Boolean) objPullStatDataByTime$default).booleanValue() + ")-" + j);
        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c28551.L$0 = r11;
        c28551.L$1 = 0;
        c28551.label = 4;
        if (serverRequestDaoUtils.updateStatMaxWatermark(str8, str7, j, c28551) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullStatDataByTime(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        C28561 c28561;
        String str4;
        String str5;
        SleepStatDataRequest sleepStatDataRequest;
        String str6;
        SleepStatDataRequest sleepStatDataRequest2;
        GetStatByTimeResponse getStatByTimeResponse;
        ServerRequestDaoUtils serverRequestDaoUtils;
        String nextKey;
        String str7;
        List<StatDataModel> dataList;
        boolean z;
        Object objPullStatDataByTime;
        int i;
        if (continuation instanceof C28561) {
            c28561 = (C28561) continuation;
            int i2 = c28561.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28561.label = i2 - Integer.MIN_VALUE;
            } else {
                c28561 = new C28561(continuation);
            }
        } else {
            c28561 = new C28561(continuation);
        }
        Object statDataByTime = c28561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28561.label;
        if (i3 != 0) {
            if (i3 == 1) {
                String str8 = (String) c28561.L$2;
                str4 = (String) c28561.L$1;
                SleepStatDataRequest sleepStatDataRequest3 = (SleepStatDataRequest) c28561.L$0;
                ResultKt.throwOnFailure(statDataByTime);
                str5 = str8;
                sleepStatDataRequest = sleepStatDataRequest3;
            } else {
                if (i3 == 2) {
                    getStatByTimeResponse = (GetStatByTimeResponse) c28561.L$3;
                    String str9 = (String) c28561.L$2;
                    String str10 = (String) c28561.L$1;
                    SleepStatDataRequest sleepStatDataRequest4 = (SleepStatDataRequest) c28561.L$0;
                    ResultKt.throwOnFailure(statDataByTime);
                    str5 = str9;
                    str6 = str10;
                    sleepStatDataRequest2 = sleepStatDataRequest4;
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    nextKey = getStatByTimeResponse.getNextKey();
                    c28561.L$0 = sleepStatDataRequest2;
                    c28561.L$1 = str6;
                    c28561.L$2 = str5;
                    c28561.L$3 = getStatByTimeResponse;
                    c28561.label = 3;
                    if (serverRequestDaoUtils.updateStatDataTimeRequest(str6, str5, nextKey, c28561) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str7 = str5;
                    dataList = getStatByTimeResponse.getDataList();
                    if (dataList == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (getStatByTimeResponse.getHasMore()) {
                        String nextKey2 = getStatByTimeResponse.getNextKey();
                        c28561.L$0 = null;
                        c28561.L$1 = null;
                        c28561.L$2 = null;
                        c28561.L$3 = null;
                        c28561.I$0 = z ? 1 : 0;
                        c28561.label = 4;
                        objPullStatDataByTime = sleepStatDataRequest2.pullStatDataByTime(str6, str7, nextKey2, c28561);
                        if (objPullStatDataByTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        statDataByTime = objPullStatDataByTime;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 == 3) {
                    getStatByTimeResponse = (GetStatByTimeResponse) c28561.L$3;
                    str7 = (String) c28561.L$2;
                    str6 = (String) c28561.L$1;
                    sleepStatDataRequest2 = (SleepStatDataRequest) c28561.L$0;
                    ResultKt.throwOnFailure(statDataByTime);
                    dataList = getStatByTimeResponse.getDataList();
                    if (dataList == null && (!dataList.isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (getStatByTimeResponse.getHasMore()) {
                        String nextKey3 = getStatByTimeResponse.getNextKey();
                        c28561.L$0 = null;
                        c28561.L$1 = null;
                        c28561.L$2 = null;
                        c28561.L$3 = null;
                        c28561.I$0 = z ? 1 : 0;
                        c28561.label = 4;
                        objPullStatDataByTime = sleepStatDataRequest2.pullStatDataByTime(str6, str7, nextKey3, c28561);
                        if (objPullStatDataByTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        statDataByTime = objPullStatDataByTime;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c28561.I$0;
                ResultKt.throwOnFailure(statDataByTime);
            }
            z = i == 0 || ((Boolean) statDataByTime).booleanValue();
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(statDataByTime);
        GetStatByTimeParams getStatByTimeParams = new GetStatByTimeParams(str, str2, str3, null, null, 0, false, 120, null);
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c28561.L$0 = this;
        str4 = str;
        c28561.L$1 = str4;
        str5 = str2;
        c28561.L$2 = str5;
        c28561.label = 1;
        statDataByTime = companion.getStatDataByTime(getStatByTimeParams, c28561);
        if (statDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepStatDataRequest = this;
        GetStatByTimeResponse getStatByTimeResponse2 = (GetStatByTimeResponse) statDataByTime;
        List<StatDataModel> dataList2 = getStatByTimeResponse2.getDataList();
        c28561.L$0 = sleepStatDataRequest;
        c28561.L$1 = str4;
        c28561.L$2 = str5;
        c28561.L$3 = getStatByTimeResponse2;
        c28561.label = 2;
        if (sleepStatDataRequest.saveStatDataToDB(dataList2, c28561) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str6 = str4;
        sleepStatDataRequest2 = sleepStatDataRequest;
        getStatByTimeResponse = getStatByTimeResponse2;
        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        nextKey = getStatByTimeResponse.getNextKey();
        c28561.L$0 = sleepStatDataRequest2;
        c28561.L$1 = str6;
        c28561.L$2 = str5;
        c28561.L$3 = getStatByTimeResponse;
        c28561.label = 3;
        if (serverRequestDaoUtils.updateStatDataTimeRequest(str6, str5, nextKey, c28561) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str7 = str5;
        dataList = getStatByTimeResponse.getDataList();
        if (dataList == null) {
            z = false;
        } else {
            z = false;
        }
        if (getStatByTimeResponse.getHasMore()) {
            String nextKey4 = getStatByTimeResponse.getNextKey();
            c28561.L$0 = null;
            c28561.L$1 = null;
            c28561.L$2 = null;
            c28561.L$3 = null;
            c28561.I$0 = z ? 1 : 0;
            c28561.label = 4;
            objPullStatDataByTime = sleepStatDataRequest2.pullStatDataByTime(str6, str7, nextKey4, c28561);
            if (objPullStatDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = z ? 1 : 0;
            statDataByTime = objPullStatDataByTime;
            z = i == 0 || ((Boolean) statDataByTime).booleanValue();
        }
        return Boxing.boxBoolean(z);
    }

    public static /* synthetic */ Object pullStatDataByTime$default(SleepStatDataRequest sleepStatDataRequest, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return sleepStatDataRequest.pullStatDataByTime(str, str2, str3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullStatDataByWM(String str, String str2, long j, Continuation<? super Boolean> continuation) {
        C28571 c28571;
        String str3;
        String str4;
        SleepStatDataRequest sleepStatDataRequest;
        GetStatByWMResponse getStatByWMResponse;
        String str5;
        String str6;
        SleepStatDataRequest sleepStatDataRequest2;
        ServerRequestDaoUtils serverRequestDaoUtils;
        long waterMark;
        GetStatByWMResponse getStatByWMResponse2;
        String str7;
        String str8;
        List<StatDataModel> dataList;
        boolean z;
        Object objPullStatDataByWM;
        int i;
        if (continuation instanceof C28571) {
            c28571 = (C28571) continuation;
            int i2 = c28571.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28571.label = i2 - Integer.MIN_VALUE;
            } else {
                c28571 = new C28571(continuation);
            }
        } else {
            c28571 = new C28571(continuation);
        }
        Object statDataByWM = c28571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28571.label;
        if (i3 != 0) {
            if (i3 == 1) {
                str4 = (String) c28571.L$2;
                str3 = (String) c28571.L$1;
                sleepStatDataRequest = (SleepStatDataRequest) c28571.L$0;
                ResultKt.throwOnFailure(statDataByWM);
            } else {
                if (i3 == 2) {
                    GetStatByWMResponse getStatByWMResponse3 = (GetStatByWMResponse) c28571.L$3;
                    String str9 = (String) c28571.L$2;
                    str3 = (String) c28571.L$1;
                    sleepStatDataRequest = (SleepStatDataRequest) c28571.L$0;
                    ResultKt.throwOnFailure(statDataByWM);
                    getStatByWMResponse = getStatByWMResponse3;
                    str5 = str9;
                    str6 = str3;
                    sleepStatDataRequest2 = sleepStatDataRequest;
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    waterMark = getStatByWMResponse.getWaterMark();
                    c28571.L$0 = sleepStatDataRequest2;
                    c28571.L$1 = str6;
                    c28571.L$2 = str5;
                    c28571.L$3 = getStatByWMResponse;
                    c28571.label = 3;
                    if (serverRequestDaoUtils.updateStatMaxWatermark(str6, str5, waterMark, c28571) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getStatByWMResponse2 = getStatByWMResponse;
                    str7 = str5;
                    str8 = str6;
                    dataList = getStatByWMResponse2.getDataList();
                    if (dataList == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (getStatByWMResponse2.getHasMore()) {
                        long waterMark2 = getStatByWMResponse2.getWaterMark();
                        c28571.L$0 = null;
                        c28571.L$1 = null;
                        c28571.L$2 = null;
                        c28571.L$3 = null;
                        c28571.I$0 = z ? 1 : 0;
                        c28571.label = 4;
                        objPullStatDataByWM = sleepStatDataRequest2.pullStatDataByWM(str8, str7, waterMark2, c28571);
                        if (objPullStatDataByWM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        statDataByWM = objPullStatDataByWM;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 == 3) {
                    getStatByWMResponse2 = (GetStatByWMResponse) c28571.L$3;
                    String str10 = (String) c28571.L$2;
                    String str11 = (String) c28571.L$1;
                    SleepStatDataRequest sleepStatDataRequest3 = (SleepStatDataRequest) c28571.L$0;
                    ResultKt.throwOnFailure(statDataByWM);
                    sleepStatDataRequest2 = sleepStatDataRequest3;
                    str7 = str10;
                    str8 = str11;
                    dataList = getStatByWMResponse2.getDataList();
                    if (dataList == null && (!dataList.isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (getStatByWMResponse2.getHasMore()) {
                        long waterMark3 = getStatByWMResponse2.getWaterMark();
                        c28571.L$0 = null;
                        c28571.L$1 = null;
                        c28571.L$2 = null;
                        c28571.L$3 = null;
                        c28571.I$0 = z ? 1 : 0;
                        c28571.label = 4;
                        objPullStatDataByWM = sleepStatDataRequest2.pullStatDataByWM(str8, str7, waterMark3, c28571);
                        if (objPullStatDataByWM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = z ? 1 : 0;
                        statDataByWM = objPullStatDataByWM;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c28571.I$0;
                ResultKt.throwOnFailure(statDataByWM);
            }
            z = i == 0 || ((Boolean) statDataByWM).booleanValue();
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(statDataByWM);
        GetStatByWMParams getStatByWMParams = new GetStatByWMParams(str, str2, Boxing.boxLong(j), 0, 8, null);
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c28571.L$0 = this;
        str3 = str;
        c28571.L$1 = str3;
        c28571.L$2 = str2;
        c28571.label = 1;
        statDataByWM = companion.getStatDataByWM(getStatByWMParams, c28571);
        if (statDataByWM == coroutine_suspended) {
            return coroutine_suspended;
        }
        str4 = str2;
        sleepStatDataRequest = this;
        getStatByWMResponse = (GetStatByWMResponse) statDataByWM;
        List<StatDataModel> dataList2 = getStatByWMResponse.getDataList();
        c28571.L$0 = sleepStatDataRequest;
        c28571.L$1 = str3;
        c28571.L$2 = str4;
        c28571.L$3 = getStatByWMResponse;
        c28571.label = 2;
        if (sleepStatDataRequest.saveStatDataToDB(dataList2, c28571) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str5 = str4;
        str6 = str3;
        sleepStatDataRequest2 = sleepStatDataRequest;
        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        waterMark = getStatByWMResponse.getWaterMark();
        c28571.L$0 = sleepStatDataRequest2;
        c28571.L$1 = str6;
        c28571.L$2 = str5;
        c28571.L$3 = getStatByWMResponse;
        c28571.label = 3;
        if (serverRequestDaoUtils.updateStatMaxWatermark(str6, str5, waterMark, c28571) == coroutine_suspended) {
            return coroutine_suspended;
        }
        getStatByWMResponse2 = getStatByWMResponse;
        str7 = str5;
        str8 = str6;
        dataList = getStatByWMResponse2.getDataList();
        if (dataList == null) {
            z = false;
        } else {
            z = false;
        }
        if (getStatByWMResponse2.getHasMore()) {
            long waterMark4 = getStatByWMResponse2.getWaterMark();
            c28571.L$0 = null;
            c28571.L$1 = null;
            c28571.L$2 = null;
            c28571.L$3 = null;
            c28571.I$0 = z ? 1 : 0;
            c28571.label = 4;
            objPullStatDataByWM = sleepStatDataRequest2.pullStatDataByWM(str8, str7, waterMark4, c28571);
            if (objPullStatDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = z ? 1 : 0;
            statDataByWM = objPullStatDataByWM;
            z = i == 0 || ((Boolean) statDataByWM).booleanValue();
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        r4 = r11;
        r0 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pushDeletedStatData(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest.pushDeletedStatData(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveStatDataToDB(List<StatDataModel> list, Continuation<? super Unit> continuation) {
        List<StatDataModel> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objInsertStatDataFromServer = StatEntityDaoProxy.INSTANCE.insertStatDataFromServer(list, continuation);
        return objInsertStatDataFromServer == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertStatDataFromServer : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteSleepAnimal(@NotNull List<SleepAnimalReport> list, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        List list2;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (SleepAnimalReport sleepAnimalReport : list) {
                if (sleepAnimalReport.getDbTime() != null) {
                    Long dbTime = sleepAnimalReport.getDbTime();
                    Intrinsics.checkNotNull(dbTime);
                    arrayList.add(dbTime);
                }
            }
            StatEntityDaoProxy statEntityDaoProxy = StatEntityDaoProxy.INSTANCE;
            anonymousClass1.L$0 = arrayList;
            anonymousClass1.label = 1;
            if (statEntityDaoProxy.markDelete(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL, arrayList, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        FitnessLogUtils.i(TAG, "deleteSleepAnimal, delete size(" + list2.size() + ")");
        return Unit.INSTANCE;
    }

    @NotNull
    public final LiveData<SleepAnimalReport> getLatestSleepAnimal() {
        final Flow<StatDataModel> latestData = StatEntityDaoProxy.INSTANCE.getLatestData(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL);
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flowOn(new Flow<SleepAnimalReport>() { // from class: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$getLatestSleepAnimal$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$getLatestSleepAnimal$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepStatDataRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/SleepStatDataRequest\n*L\n1#1,222:1\n54#2:223\n31#3,3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SleepStatDataRequest this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$getLatestSleepAnimal$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest$getLatestSleepAnimal$$inlined$map$1$2", f = "SleepStatDataRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SleepStatDataRequest sleepStatDataRequest) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = sleepStatDataRequest;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    SleepAnimalReport sleepAnimalReportConvertServerToLocalAnimalReport;
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        StatDataModel statDataModel = (StatDataModel) obj;
                        if (statDataModel == null) {
                            sleepAnimalReportConvertServerToLocalAnimalReport = null;
                        } else {
                            sleepAnimalReportConvertServerToLocalAnimalReport = this.this$0.convertServerToLocalAnimalReport(statDataModel, FitnessDateUtils.getCurrentTZOffsetInSec());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sleepAnimalReportConvertServerToLocalAnimalReport, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SleepAnimalReport> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = latestData.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO()), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Nullable
    public final SleepAnimalReport getLatestSleepAnimalSync() {
        StatDataModel latestDataSync = StatEntityDaoProxy.INSTANCE.getLatestDataSync(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL);
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        if (latestDataSync != null) {
            return convertServerToLocalAnimalReport(latestDataSync, currentTZOffsetInSec);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object getLimitedSleepAnimal(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<SleepAnimalReport>> continuation) {
        C28531 c28531;
        int i3;
        Object limitDataList;
        SleepStatDataRequest sleepStatDataRequest;
        if (continuation instanceof C28531) {
            c28531 = (C28531) continuation;
            int i4 = c28531.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c28531.label = i4 - Integer.MIN_VALUE;
            } else {
                c28531 = new C28531(continuation);
            }
        } else {
            c28531 = new C28531(continuation);
        }
        C28531 c28532 = c28531;
        Object obj = c28532.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c28532.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            StatEntityDaoProxy statEntityDaoProxy = StatEntityDaoProxy.INSTANCE;
            c28532.L$0 = this;
            i3 = i;
            c28532.I$0 = i3;
            c28532.label = 1;
            limitDataList = statEntityDaoProxy.getLimitDataList(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL, j, j2, i, i2, z, c28532);
            if (limitDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepStatDataRequest = this;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = c28532.I$0;
            SleepStatDataRequest sleepStatDataRequest2 = (SleepStatDataRequest) c28532.L$0;
            ResultKt.throwOnFailure(obj);
            limitDataList = obj;
            i3 = i6;
            sleepStatDataRequest = sleepStatDataRequest2;
        }
        List list = (List) limitDataList;
        FitnessLogUtils.i(TAG, "getLimitedSleepAnimal: model size(" + list.size() + ")");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepAnimalReport sleepAnimalReportConvertServerToLocalAnimalReport = sleepStatDataRequest.convertServerToLocalAnimalReport((StatDataModel) it.next(), i3);
            if (sleepAnimalReportConvertServerToLocalAnimalReport != null) {
                arrayList.add(sleepAnimalReportConvertServerToLocalAnimalReport);
            }
        }
        return arrayList;
    }

    public final void pullSleepAnimalData() {
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new C28541(null)).m503catch(new Function2() { // from class: zzm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepStatDataRequest.pullSleepAnimalData$lambda$3((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object triggerComputeSleepAnimal(@NotNull Continuation<? super SleepAnimalReport> continuation) {
        C28591 c28591;
        int i;
        SleepStatDataRequest sleepStatDataRequest;
        if (continuation instanceof C28591) {
            c28591 = (C28591) continuation;
            int i2 = c28591.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28591.label = i2 - Integer.MIN_VALUE;
            } else {
                c28591 = new C28591(continuation);
            }
        } else {
            c28591 = new C28591(continuation);
        }
        Object obj = c28591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28591.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                TriggerStatParams triggerStatParams = new TriggerStatParams(StatPersistKey.TAG_SLEEP, StatPersistKey.KEY_SLEEP_ANIMAL, currentTZOffsetInSec);
                FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
                c28591.L$0 = this;
                c28591.I$0 = currentTZOffsetInSec;
                c28591.label = 1;
                Object objTriggerStat = companion.triggerStat(triggerStatParams, c28591);
                if (objTriggerStat == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = currentTZOffsetInSec;
                obj = objTriggerStat;
                sleepStatDataRequest = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c28591.I$0;
                sleepStatDataRequest = (SleepStatDataRequest) c28591.L$0;
                ResultKt.throwOnFailure(obj);
            }
            SleepAnimalReport sleepAnimalReportConvertServerToLocalAnimalReport = sleepStatDataRequest.convertServerToLocalAnimalReport(((TriggerStatResponse) obj).getData(), i);
            if ((sleepAnimalReportConvertServerToLocalAnimalReport != null ? sleepAnimalReportConvertServerToLocalAnimalReport.getAnimal() : null) != null) {
                FitnessLogUtils.i(TAG, "triggerComputeSleepAnimal: valid animal");
                sleepStatDataRequest.pullSleepAnimalData();
            }
            return sleepAnimalReportConvertServerToLocalAnimalReport;
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "triggerComputeSleepAnimal", e);
            return null;
        }
    }
}
