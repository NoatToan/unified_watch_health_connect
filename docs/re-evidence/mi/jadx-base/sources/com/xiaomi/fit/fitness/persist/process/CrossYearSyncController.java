package com.xiaomi.fit.fitness.persist.process;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoRepo;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.process.CrossYearSyncController;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.FitnessRequestParamKt;
import com.xiaomi.fit.fitness.persist.server.data.GetFitnessDataByTime;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001c\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001dJ&\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u001eJ(\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u001eJ \u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020 H\u0082@¢\u0006\u0002\u0010$J&\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001eJ(\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0002\u0010)R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController;", "Lcom/xiaomi/fit/fitness/persist/process/CloudSyncBaseRequest;", "<init>", "()V", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "pullAllSportReport", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullRecentOneYearFitnessData", "pullOneYearWeightIfNeed", "startTime", "", "endTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullRecentOneYearMedicalData", "pullAllProjectData", "pullAllFitnessDataByKey", "persistKeyList", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistKey", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullCrossYearFitnessData", "(Ljava/util/List;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeRecentOneYearRequestInterval", "Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController$TimeInterval;", "requestKey", "removeCrossYearRequestInterval", "timeInterval", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController$TimeInterval;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullPagingFullFitnessData", "", "pullOnceFullPullFitnessData", "nextKey", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "TimeInterval", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrossYearSyncController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossYearSyncController.kt\ncom/xiaomi/fit/fitness/persist/process/CrossYearSyncController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,417:1\n1863#2,2:418\n1863#2,2:420\n*S KotlinDebug\n*F\n+ 1 CrossYearSyncController.kt\ncom/xiaomi/fit/fitness/persist/process/CrossYearSyncController\n*L\n174#1:418,2\n198#1:420,2\n*E\n"})
public final class CrossYearSyncController extends CloudSyncBaseRequest {

    @NotNull
    private static final String TAG = "CrossYearSyncController";

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o45
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CrossYearSyncController.mFitnessRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CrossYearSyncController instance = new CrossYearSyncController();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController;", "TAG", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CrossYearSyncController getInstance() {
            return CrossYearSyncController.instance;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/CrossYearSyncController$TimeInterval;", "", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeInterval {
        private final long endTime;
        private final long startTime;

        public TimeInterval(long j, long j2) {
            this.startTime = j;
            this.endTime = j2;
        }

        public static /* synthetic */ TimeInterval copy$default(TimeInterval timeInterval, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeInterval.startTime;
            }
            if ((i & 2) != 0) {
                j2 = timeInterval.endTime;
            }
            return timeInterval.copy(j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        @NotNull
        public final TimeInterval copy(long startTime, long endTime) {
            return new TimeInterval(startTime, endTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInterval)) {
                return false;
            }
            TimeInterval timeInterval = (TimeInterval) other;
            return this.startTime == timeInterval.startTime && this.endTime == timeInterval.endTime;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
        }

        @NotNull
        public String toString() {
            return "TimeInterval(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllFitnessDataByKey$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 0}, l = {199}, m = "pullAllFitnessDataByKey", n = {"this", "hasData", "requestOnline"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return CrossYearSyncController.this.pullAllFitnessDataByKey((List<String>) null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllFitnessDataByKey$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 1, 2, 2, 2, 3}, l = {212, 220, 240, 255}, m = "pullAllFitnessDataByKey", n = {"this", "persistKey", "persistKey", "this", "persistKey", "endTime", "persistKey"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "J$0", "L$0"})
    public static final class AnonymousClass3 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullAllFitnessDataByKey((String) null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllProjectData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 1, 1, 1, 1}, l = {167, 175}, m = "pullAllProjectData", n = {"this", "this", "fullPullEntity", "hasData", "it"}, s = {"L$0", "L$0", "L$1", "L$2", "L$4"})
    public static final class C16171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C16171(Continuation<? super C16171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullAllProjectData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 2, 3, 3, 4}, l = {30, 35, 52, 55, 64}, m = "pullAllSportReport", n = {"this", "this", "this", "oneYearEntity", "hasRecentOneYearSport"}, s = {"L$0", "L$0", "L$0", "L$1", "I$0"})
    public static final class C16181 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16181(Continuation<? super C16181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullAllSportReport(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullCrossYearFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 0, 0, 0}, l = {267}, m = "pullCrossYearFitnessData", n = {"this", "startTime", "endTime", "hasNewData", "requestOnline"}, s = {"L$0", "J$0", "J$1", "I$0", "I$1"})
    public static final class C16191 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16191(Continuation<? super C16191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullCrossYearFitnessData((List<String>) null, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullCrossYearFitnessData$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {281, 287, 293, 303}, m = "pullCrossYearFitnessData", n = {"this", "persistKey", "startTime", "endTime", "this", "persistKey", "startTime", "endTime", "this", "persistKey", "startTime", "endTime"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullCrossYearFitnessData((String) null, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullOnceFullPullFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 1}, l = {410, 412}, m = "pullOnceFullPullFitnessData", n = {"persistKey", "endTime", "dataResult"}, s = {"L$0", "J$0", "L$0"})
    public static final class C16201 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16201(Continuation<? super C16201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullOnceFullPullFitnessData(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullOneYearWeightIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 0}, l = {122, 132}, m = "pullOneYearWeightIfNeed", n = {"this", "startTime", "endTime"}, s = {"L$0", "J$0", "J$1"})
    public static final class C16211 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16211(Continuation<? super C16211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullOneYearWeightIfNeed(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullPagingFullFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {380, 382, 385, 390, 398, 402}, m = "pullPagingFullFitnessData", n = {"this", "persistKey", "startTime", "this", "persistKey", "startTime", "this", "persistKey", "startTime", "this", "persistKey", "oneYearStartTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class C16221 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16221(Continuation<? super C16221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullPagingFullFitnessData(null, 0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullRecentOneYearFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 3, 3, 3}, l = {73, 78, 87, 108, 112}, m = "pullRecentOneYearFitnessData", n = {"this", "this", "startTime", "endTime"}, s = {"L$0", "L$0", "J$0", "J$1"})
    public static final class C16231 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16231(Continuation<? super C16231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullRecentOneYearFitnessData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullRecentOneYearMedicalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0}, l = {144, 149}, m = "pullRecentOneYearMedicalData", n = {"this"}, s = {"L$0"})
    public static final class C16241 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16241(Continuation<? super C16241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.pullRecentOneYearMedicalData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$removeCrossYearRequestInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0}, l = {345}, m = "removeCrossYearRequestInterval", n = {"pullStartTime", "pullEndTime"}, s = {"J$0", "J$1"})
    public static final class C16251 extends ContinuationImpl {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public C16251(Continuation<? super C16251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.removeCrossYearRequestInterval(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$removeRecentOneYearRequestInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CrossYearSyncController", f = "CrossYearSyncController.kt", i = {0, 0}, l = {322}, m = "removeRecentOneYearRequestInterval", n = {"startTime", "endTime"}, s = {"J$0", "J$1"})
    public static final class C16261 extends ContinuationImpl {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public C16261(Continuation<? super C16261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrossYearSyncController.this.removeRecentOneYearRequestInterval(null, 0L, 0L, this);
        }
    }

    private CrossYearSyncController() {
    }

    private final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) this.mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object pullOnceFullPullFitnessData(String str, long j, String str2, Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16201 c16201;
        long j2;
        String str3;
        FitnessDataResultByTime fitnessDataResultByTime;
        if (continuation instanceof C16201) {
            c16201 = (C16201) continuation;
            int i = c16201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16201.label = i - Integer.MIN_VALUE;
            } else {
                c16201 = new C16201(continuation);
            }
        } else {
            c16201 = new C16201(continuation);
        }
        C16201 c16202 = c16201;
        Object fitnessDataByTime = c16202.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16202.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j3 = c16202.J$0;
                String str4 = (String) c16202.L$0;
                ResultKt.throwOnFailure(fitnessDataByTime);
                j2 = j3;
                str3 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fitnessDataResultByTime = (FitnessDataResultByTime) c16202.L$0;
                ResultKt.throwOnFailure(fitnessDataByTime);
            }
            return Boxing.boxBoolean(fitnessDataResultByTime.getDataList().isEmpty());
        }
        ResultKt.throwOnFailure(fitnessDataByTime);
        FitnessLogUtils.i(TAG, "pullOnceFullPullFitnessData: endTime = " + j + ", nextKey= " + str2);
        GetFitnessDataByTime getFitnessDataByTime = new GetFitnessDataByTime(str, null, Boxing.boxLong(j), Boxing.boxBoolean(true), str2);
        FitnessDataRequest mFitnessRequest = getMFitnessRequest();
        c16202.L$0 = str;
        c16202.J$0 = j;
        c16202.label = 1;
        fitnessDataByTime = mFitnessRequest.getFitnessDataByTime(getFitnessDataByTime, c16202);
        if (fitnessDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = j;
        str3 = str;
        fitnessDataResultByTime = (FitnessDataResultByTime) fitnessDataByTime;
        DailyRecordDaoUtils.INSTANCE.recordServerDailyDataToDB(fitnessDataResultByTime.getDataList());
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        String nextKey = fitnessDataResultByTime.getNextKey();
        c16202.L$0 = fitnessDataResultByTime;
        c16202.label = 2;
        if (serverRequestDaoUtils.insertFitnessTimePullRequest("cross_year_pull", str3, 0L, j2, nextKey, c16202) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(fitnessDataResultByTime.getDataList().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object pullOneYearWeightIfNeed(long j, long j2, Continuation<? super SyncRequestResult> continuation) {
        C16211 c16211;
        CrossYearSyncController crossYearSyncController;
        long j3;
        long j4;
        if (continuation instanceof C16211) {
            c16211 = (C16211) continuation;
            int i = c16211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16211.label = i - Integer.MIN_VALUE;
            } else {
                c16211 = new C16211(continuation);
            }
        } else {
            c16211 = new C16211(continuation);
        }
        C16211 c16212 = c16211;
        Object recentOneYearPullRequest = c16212.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16212.label;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                j3 = c16212.J$1;
                j4 = c16212.J$0;
                crossYearSyncController = (CrossYearSyncController) c16212.L$0;
                ResultKt.throwOnFailure(recentOneYearPullRequest);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(recentOneYearPullRequest);
            }
            return new SyncRequestResult(true, ((Boolean) recentOneYearPullRequest).booleanValue(), false, null, null, false, 60, null);
        }
        ResultKt.throwOnFailure(recentOneYearPullRequest);
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c16212.L$0 = this;
        c16212.J$0 = j;
        c16212.J$1 = j2;
        c16212.label = 1;
        recentOneYearPullRequest = serverRequestDaoUtils.getRecentOneYearPullRequest("weight", c16212);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        crossYearSyncController = this;
        j3 = j2;
        j4 = j;
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        if (serverRequestEntity != null && serverRequestEntity.getStartTime() > 0 && TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
            z = false;
        }
        FitnessLogUtils.i(TAG, "pullOneYearWeight: startTime = " + j4 + ", endTime = " + j3 + ", need = " + z);
        if (!z) {
            return new SyncRequestResult();
        }
        String nextKey = serverRequestEntity != null ? serverRequestEntity.getNextKey() : null;
        c16212.L$0 = null;
        c16212.label = 2;
        recentOneYearPullRequest = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController, "recent_one_year_pull", "weight", j4, 0L, nextKey, false, c16212, 32, null);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new SyncRequestResult(true, ((Boolean) recentOneYearPullRequest).booleanValue(), false, null, null, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object removeCrossYearRequestInterval(String str, TimeInterval timeInterval, Continuation<? super TimeInterval> continuation) {
        C16251 c16251;
        long endTime;
        long startTime;
        if (continuation instanceof C16251) {
            c16251 = (C16251) continuation;
            int i = c16251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16251.label = i - Integer.MIN_VALUE;
            } else {
                c16251 = new C16251(continuation);
            }
        } else {
            c16251 = new C16251(continuation);
        }
        Object obj = c16251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long startTime2 = timeInterval.getStartTime();
            long endTime2 = timeInterval.getEndTime();
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16251.J$0 = startTime2;
            c16251.J$1 = endTime2;
            c16251.label = 1;
            Object crossYearPullRequest = serverRequestDaoUtils.getCrossYearPullRequest(str, c16251);
            if (crossYearPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            endTime = startTime2;
            obj = crossYearPullRequest;
            startTime = endTime2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            startTime = c16251.J$1;
            endTime = c16251.J$0;
            ResultKt.throwOnFailure(obj);
        }
        for (ServerRequestEntity serverRequestEntity : (List) obj) {
            if (TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                if (endTime >= serverRequestEntity.getStartTime() && startTime <= serverRequestEntity.getEndTime()) {
                    return null;
                }
                if (endTime >= serverRequestEntity.getStartTime() || startTime <= serverRequestEntity.getEndTime()) {
                    if (startTime >= serverRequestEntity.getStartTime() && endTime <= serverRequestEntity.getEndTime()) {
                        if (endTime < serverRequestEntity.getStartTime()) {
                            startTime = serverRequestEntity.getStartTime();
                        }
                        if (startTime > serverRequestEntity.getEndTime()) {
                            endTime = serverRequestEntity.getEndTime();
                        }
                    }
                }
            }
        }
        if (endTime == startTime) {
            return null;
        }
        return new TimeInterval(endTime, startTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object removeRecentOneYearRequestInterval(String str, long j, long j2, Continuation<? super TimeInterval> continuation) {
        C16261 c16261;
        if (continuation instanceof C16261) {
            c16261 = (C16261) continuation;
            int i = c16261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16261.label = i - Integer.MIN_VALUE;
            } else {
                c16261 = new C16261(continuation);
            }
        } else {
            c16261 = new C16261(continuation);
        }
        Object recentOneYearPullRequest = c16261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recentOneYearPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16261.J$0 = j;
            c16261.J$1 = j2;
            c16261.label = 1;
            recentOneYearPullRequest = serverRequestDaoUtils.getRecentOneYearPullRequest(str, c16261);
            if (recentOneYearPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c16261.J$1;
            j = c16261.J$0;
            ResultKt.throwOnFailure(recentOneYearPullRequest);
        }
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        long startTime = serverRequestEntity != null ? serverRequestEntity.getStartTime() : 0L;
        if (j > startTime) {
            return null;
        }
        if (j2 > startTime) {
            j2 = startTime;
        }
        return new TimeInterval(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:20:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0097
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pullAllFitnessDataByKey(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.xiaomi.fit.fitness.persist.process.SyncRequestResult> r23) {
        /*
            r21 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.xiaomi.fit.fitness.persist.process.CrossYearSyncController.AnonymousClass1
            if (r1 == 0) goto L17
            r1 = r0
            com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllFitnessDataByKey$1 r1 = (com.xiaomi.fit.fitness.persist.process.CrossYearSyncController.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r2 = r21
            goto L1e
        L17:
            com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllFitnessDataByKey$1 r1 = new com.xiaomi.fit.fitness.persist.process.CrossYearSyncController$pullAllFitnessDataByKey$1
            r2 = r21
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            java.lang.Object r4 = r1.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r1.L$2
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            java.lang.Object r7 = r1.L$1
            kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
            java.lang.Object r8 = r1.L$0
            com.xiaomi.fit.fitness.persist.process.CrossYearSyncController r8 = (com.xiaomi.fit.fitness.persist.process.CrossYearSyncController) r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L80
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r4 = new kotlin.jvm.internal.Ref$BooleanRef
            r4.<init>()
            r6 = r22
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r0
            r8 = r2
            r20 = r6
            r6 = r4
            r4 = r20
        L63:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.L$0 = r8
            r1.L$1 = r7
            r1.L$2 = r6
            r1.L$3 = r4
            r1.label = r5
            java.lang.Object r0 = r8.pullAllFitnessDataByKey(r0, r1)
            if (r0 != r3) goto L80
            return r3
        L80:
            com.xiaomi.fit.fitness.persist.process.SyncRequestResult r0 = (com.xiaomi.fit.fitness.persist.process.SyncRequestResult) r0
            boolean r9 = r7.element
            r10 = 0
            if (r9 != 0) goto L90
            boolean r9 = r0.getHasNewData()
            if (r9 == 0) goto L8e
            goto L90
        L8e:
            r9 = r10
            goto L91
        L90:
            r9 = r5
        L91:
            r7.element = r9
            boolean r9 = r6.element
            if (r9 != 0) goto L9d
            boolean r0 = r0.isRequestOnline()
            if (r0 == 0) goto L9e
        L9d:
            r10 = r5
        L9e:
            r6.element = r10
            goto L63
        La1:
            com.xiaomi.fit.fitness.persist.process.SyncRequestResult r0 = new com.xiaomi.fit.fitness.persist.process.SyncRequestResult
            boolean r13 = r7.element
            boolean r14 = r6.element
            r18 = 56
            r19 = 0
            r12 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController.pullAllFitnessDataByKey(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:13:0x004a, B:52:0x0127, B:36:0x00d3, B:38:0x00d9, B:40:0x00e6, B:43:0x00ef, B:46:0x00f7, B:48:0x0100, B:53:0x0155, B:35:0x00c3), top: B:57:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:13:0x004a, B:52:0x0127, B:36:0x00d3, B:38:0x00d9, B:40:0x00e6, B:43:0x00ef, B:46:0x00f7, B:48:0x0100, B:53:0x0155, B:35:0x00c3), top: B:57:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:13:0x004a, B:52:0x0127, B:36:0x00d3, B:38:0x00d9, B:40:0x00e6, B:43:0x00ef, B:46:0x00f7, B:48:0x0100, B:53:0x0155, B:35:0x00c3), top: B:57:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:13:0x004a, B:52:0x0127, B:36:0x00d3, B:38:0x00d9, B:40:0x00e6, B:43:0x00ef, B:46:0x00f7, B:48:0x0100, B:53:0x0155, B:35:0x00c3), top: B:57:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0121 -> B:52:0x0127). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pullAllProjectData(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.xiaomi.fit.fitness.persist.process.SyncRequestResult> r26) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController.pullAllProjectData(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Nullable
    public final Object pullAllSportReport(@NotNull Continuation<? super SyncRequestResult> continuation) {
        C16181 c16181;
        CrossYearSyncController crossYearSyncController;
        Object recentOneYearPullRequest;
        CrossYearSyncController crossYearSyncController2;
        ServerRequestEntity serverRequestEntity;
        ?? BooleanValue;
        ServerRequestEntity serverRequestEntity2;
        CrossYearSyncController crossYearSyncController3;
        ServerRequestEntity serverRequestEntity3;
        Object objPullAndSaveSportReportByTime;
        CrossYearSyncController crossYearSyncController4;
        long endTime;
        ?? r14;
        Object objPullAndSaveSportReportByTime2;
        boolean zBooleanValue;
        boolean z;
        if (continuation instanceof C16181) {
            c16181 = (C16181) continuation;
            int i = c16181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16181.label = i - Integer.MIN_VALUE;
            } else {
                c16181 = new C16181(continuation);
            }
        } else {
            c16181 = new C16181(continuation);
        }
        Object fullPullRequest = c16181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16181.label;
        boolean z2 = true;
        String str = TAG;
        if (i2 == 0) {
            ResultKt.throwOnFailure(fullPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16181.L$0 = this;
            c16181.label = 1;
            fullPullRequest = serverRequestDaoUtils.getFullPullRequest("sport_report", c16181);
            if (fullPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            crossYearSyncController = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(fullPullRequest);
                    boolean zBooleanValue2 = ((Boolean) fullPullRequest).booleanValue();
                    FitnessLogUtils.i(TAG, "pullAllSportReport: continue last request done(hasSport = " + zBooleanValue2 + ")");
                    return new SyncRequestResult(true, zBooleanValue2, false, null, null, false, 60, null);
                }
                if (i2 == 3) {
                    crossYearSyncController = (CrossYearSyncController) c16181.L$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    recentOneYearPullRequest = fullPullRequest;
                    crossYearSyncController2 = crossYearSyncController;
                    serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
                    if (serverRequestEntity != null || TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                        z2 = true;
                        BooleanValue = 0;
                        serverRequestEntity2 = serverRequestEntity;
                        crossYearSyncController3 = crossYearSyncController2;
                    } else {
                        long startTime = serverRequestEntity.getStartTime();
                        long endTime2 = serverRequestEntity.getEndTime();
                        String nextKey = serverRequestEntity.getNextKey();
                        c16181.L$0 = crossYearSyncController2;
                        c16181.L$1 = serverRequestEntity;
                        c16181.label = 4;
                        serverRequestEntity3 = serverRequestEntity;
                        objPullAndSaveSportReportByTime = crossYearSyncController2.pullAndSaveSportReportByTime("recent_one_year_pull", startTime, endTime2, nextKey, c16181);
                        if (objPullAndSaveSportReportByTime == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        crossYearSyncController4 = crossYearSyncController2;
                        BooleanValue = ((Boolean) objPullAndSaveSportReportByTime).booleanValue();
                        crossYearSyncController3 = crossYearSyncController4;
                        serverRequestEntity2 = serverRequestEntity3;
                    }
                    if (serverRequestEntity2 != null) {
                        endTime = serverRequestEntity2.getEndTime();
                    } else {
                        endTime = 0;
                    }
                    long j = endTime;
                    FitnessLogUtils.i(str, "start pullAllSportReport, endTime = " + j);
                    c16181.L$0 = null;
                    c16181.L$1 = null;
                    c16181.I$0 = BooleanValue;
                    c16181.label = 5;
                    r14 = BooleanValue;
                    objPullAndSaveSportReportByTime2 = crossYearSyncController3.pullAndSaveSportReportByTime("full_pull", 0L, j, null, c16181);
                    if (objPullAndSaveSportReportByTime2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 4) {
                    ServerRequestEntity serverRequestEntity4 = (ServerRequestEntity) c16181.L$1;
                    crossYearSyncController4 = (CrossYearSyncController) c16181.L$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    serverRequestEntity3 = serverRequestEntity4;
                    objPullAndSaveSportReportByTime = fullPullRequest;
                    str = TAG;
                    BooleanValue = ((Boolean) objPullAndSaveSportReportByTime).booleanValue();
                    crossYearSyncController3 = crossYearSyncController4;
                    serverRequestEntity2 = serverRequestEntity3;
                    if (serverRequestEntity2 != null) {
                        endTime = serverRequestEntity2.getEndTime();
                    } else {
                        endTime = 0;
                    }
                    long j2 = endTime;
                    FitnessLogUtils.i(str, "start pullAllSportReport, endTime = " + j2);
                    c16181.L$0 = null;
                    c16181.L$1 = null;
                    c16181.I$0 = BooleanValue;
                    c16181.label = 5;
                    r14 = BooleanValue;
                    objPullAndSaveSportReportByTime2 = crossYearSyncController3.pullAndSaveSportReportByTime("full_pull", 0L, j2, null, c16181);
                    if (objPullAndSaveSportReportByTime2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = c16181.I$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    r14 = i3;
                    z2 = true;
                    objPullAndSaveSportReportByTime2 = fullPullRequest;
                    str = TAG;
                }
                zBooleanValue = ((Boolean) objPullAndSaveSportReportByTime2).booleanValue();
                FitnessLogUtils.i(str, "pullAllSportReport: done(hasSport = " + zBooleanValue + ")");
                if (zBooleanValue && r14 == 0) {
                    z = false;
                } else {
                    z = z2;
                }
                return new SyncRequestResult(true, z, false, null, null, false, 60, null);
            }
            crossYearSyncController = (CrossYearSyncController) c16181.L$0;
            ResultKt.throwOnFailure(fullPullRequest);
        }
        ServerRequestEntity serverRequestEntity5 = (ServerRequestEntity) fullPullRequest;
        if (serverRequestEntity5 != null) {
            if (TextUtils.isEmpty(serverRequestEntity5.getNextKey())) {
                FitnessLogUtils.i(TAG, "pullAllSportReport: has request done and abort this");
                return new SyncRequestResult();
            }
            FitnessLogUtils.i(TAG, "pullAllSportReport: continue last request");
            long startTime2 = serverRequestEntity5.getStartTime();
            long endTime3 = serverRequestEntity5.getEndTime();
            String nextKey2 = serverRequestEntity5.getNextKey();
            c16181.L$0 = null;
            c16181.label = 2;
            fullPullRequest = crossYearSyncController.pullAndSaveSportReportByTime("full_pull", startTime2, endTime3, nextKey2, c16181);
            if (fullPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue3 = ((Boolean) fullPullRequest).booleanValue();
            FitnessLogUtils.i(TAG, "pullAllSportReport: continue last request done(hasSport = " + zBooleanValue3 + ")");
            return new SyncRequestResult(true, zBooleanValue3, false, null, null, false, 60, null);
        }
        ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
        c16181.L$0 = crossYearSyncController;
        c16181.label = 3;
        recentOneYearPullRequest = serverRequestDaoUtils2.getRecentOneYearPullRequest("sport_report", c16181);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        crossYearSyncController2 = crossYearSyncController;
        serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        if (serverRequestEntity != null) {
        }
        z2 = true;
        BooleanValue = 0;
        serverRequestEntity2 = serverRequestEntity;
        crossYearSyncController3 = crossYearSyncController2;
        if (serverRequestEntity2 != null) {
            endTime = serverRequestEntity2.getEndTime();
        } else {
            endTime = 0;
        }
        long j3 = endTime;
        FitnessLogUtils.i(str, "start pullAllSportReport, endTime = " + j3);
        c16181.L$0 = null;
        c16181.L$1 = null;
        c16181.I$0 = BooleanValue;
        c16181.label = 5;
        r14 = BooleanValue;
        objPullAndSaveSportReportByTime2 = crossYearSyncController3.pullAndSaveSportReportByTime("full_pull", 0L, j3, null, c16181);
        if (objPullAndSaveSportReportByTime2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = ((Boolean) objPullAndSaveSportReportByTime2).booleanValue();
        FitnessLogUtils.i(str, "pullAllSportReport: done(hasSport = " + zBooleanValue + ")");
        if (zBooleanValue) {
            z = z2;
        } else {
            z = z2;
        }
        return new SyncRequestResult(true, z, false, null, null, false, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:21:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object pullCrossYearFitnessData(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r27, long r28, long r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.xiaomi.fit.fitness.persist.process.SyncRequestResult> r32) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.process.CrossYearSyncController.pullCrossYearFitnessData(java.util.List, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x015a A[PHI: r2
      0x015a: PHI (r2v28 java.lang.Object) = (r2v20 java.lang.Object), (r2v1 java.lang.Object) binds: [B:58:0x0157, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object pullPagingFullFitnessData(@NotNull String str, long j, long j2, @NotNull Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16221 c16221;
        long j3;
        CrossYearSyncController crossYearSyncController;
        ServerRequestEntity serverRequestEntity;
        long startTime;
        long j4;
        String str2 = str;
        if (continuation instanceof C16221) {
            c16221 = (C16221) continuation;
            int i = c16221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16221.label = i - Integer.MIN_VALUE;
            } else {
                c16221 = new C16221(continuation);
            }
        } else {
            c16221 = new C16221(continuation);
        }
        Object fullPullRequest = c16221.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c16221.label) {
            case 0:
                ResultKt.throwOnFailure(fullPullRequest);
                ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = this;
                c16221.L$1 = str2;
                j3 = j;
                c16221.J$0 = j3;
                c16221.label = 1;
                fullPullRequest = serverRequestDaoUtils.getFullPullRequest(str2, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                crossYearSyncController = this;
                if (((ServerRequestEntity) fullPullRequest) != null) {
                    c16221.L$0 = crossYearSyncController;
                    c16221.L$1 = str2;
                    c16221.J$0 = j3;
                    c16221.label = 2;
                    if (crossYearSyncController.pullAllFitnessDataByKey(str2, c16221) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = j3;
                c16221.label = 3;
                fullPullRequest = serverRequestDaoUtils2.getRecentOneYearPullRequest("fitness_data", c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) fullPullRequest;
                if (serverRequestEntity != null) {
                    startTime = serverRequestEntity.getStartTime();
                } else {
                    startTime = 0;
                }
                if (j3 >= startTime) {
                    return Boxing.boxBoolean(false);
                }
                ServerRequestDaoUtils serverRequestDaoUtils3 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = startTime;
                c16221.label = 4;
                fullPullRequest = serverRequestDaoUtils3.getCrossYearPullRequest(str2, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = startTime;
                for (ServerRequestEntity serverRequestEntity2 : (List) fullPullRequest) {
                    if (serverRequestEntity2.getStartTime() > 0 && serverRequestEntity2.getEndTime() == j4) {
                        if (TextUtils.isEmpty(serverRequestEntity2.getNextKey())) {
                            FitnessLogUtils.i(TAG, str2 + ": no more data from server");
                            return Boxing.boxBoolean(false);
                        }
                        String nextKey = serverRequestEntity2.getNextKey();
                        c16221.L$0 = null;
                        c16221.L$1 = null;
                        c16221.label = 5;
                        fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, nextKey, c16221);
                        return fullPullRequest == coroutine_suspended ? coroutine_suspended : fullPullRequest;
                    }
                }
                c16221.L$0 = null;
                c16221.L$1 = null;
                c16221.label = 6;
                fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, null, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return fullPullRequest;
            case 1:
                j3 = c16221.J$0;
                str2 = (String) c16221.L$1;
                crossYearSyncController = (CrossYearSyncController) c16221.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                if (((ServerRequestEntity) fullPullRequest) != null) {
                    c16221.L$0 = crossYearSyncController;
                    c16221.L$1 = str2;
                    c16221.J$0 = j3;
                    c16221.label = 2;
                    if (crossYearSyncController.pullAllFitnessDataByKey(str2, c16221) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ServerRequestDaoUtils serverRequestDaoUtils4 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = j3;
                c16221.label = 3;
                fullPullRequest = serverRequestDaoUtils4.getRecentOneYearPullRequest("fitness_data", c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) fullPullRequest;
                if (serverRequestEntity != null) {
                    startTime = serverRequestEntity.getStartTime();
                } else {
                    startTime = 0;
                }
                if (j3 >= startTime) {
                    return Boxing.boxBoolean(false);
                }
                ServerRequestDaoUtils serverRequestDaoUtils5 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = startTime;
                c16221.label = 4;
                fullPullRequest = serverRequestDaoUtils5.getCrossYearPullRequest(str2, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = startTime;
                while (r2.hasNext()) {
                    if (serverRequestEntity2.getStartTime() > 0) {
                    }
                }
                c16221.L$0 = null;
                c16221.L$1 = null;
                c16221.label = 6;
                fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, null, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return fullPullRequest;
            case 2:
                j3 = c16221.J$0;
                str2 = (String) c16221.L$1;
                crossYearSyncController = (CrossYearSyncController) c16221.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                ServerRequestDaoUtils serverRequestDaoUtils6 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = j3;
                c16221.label = 3;
                fullPullRequest = serverRequestDaoUtils6.getRecentOneYearPullRequest("fitness_data", c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestEntity = (ServerRequestEntity) fullPullRequest;
                if (serverRequestEntity != null) {
                    startTime = serverRequestEntity.getStartTime();
                } else {
                    startTime = 0;
                }
                if (j3 >= startTime) {
                    return Boxing.boxBoolean(false);
                }
                ServerRequestDaoUtils serverRequestDaoUtils7 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = startTime;
                c16221.label = 4;
                fullPullRequest = serverRequestDaoUtils7.getCrossYearPullRequest(str2, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = startTime;
                while (r2.hasNext()) {
                    if (serverRequestEntity2.getStartTime() > 0) {
                    }
                }
                c16221.L$0 = null;
                c16221.L$1 = null;
                c16221.label = 6;
                fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, null, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return fullPullRequest;
            case 3:
                j3 = c16221.J$0;
                str2 = (String) c16221.L$1;
                crossYearSyncController = (CrossYearSyncController) c16221.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                serverRequestEntity = (ServerRequestEntity) fullPullRequest;
                if (serverRequestEntity != null) {
                    startTime = serverRequestEntity.getStartTime();
                } else {
                    startTime = 0;
                }
                if (j3 >= startTime) {
                    return Boxing.boxBoolean(false);
                }
                ServerRequestDaoUtils serverRequestDaoUtils8 = ServerRequestDaoUtils.INSTANCE;
                c16221.L$0 = crossYearSyncController;
                c16221.L$1 = str2;
                c16221.J$0 = startTime;
                c16221.label = 4;
                fullPullRequest = serverRequestDaoUtils8.getCrossYearPullRequest(str2, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j4 = startTime;
                while (r2.hasNext()) {
                    if (serverRequestEntity2.getStartTime() > 0) {
                    }
                }
                c16221.L$0 = null;
                c16221.L$1 = null;
                c16221.label = 6;
                fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, null, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return fullPullRequest;
            case 4:
                j4 = c16221.J$0;
                str2 = (String) c16221.L$1;
                crossYearSyncController = (CrossYearSyncController) c16221.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                while (r2.hasNext()) {
                    if (serverRequestEntity2.getStartTime() > 0) {
                    }
                }
                c16221.L$0 = null;
                c16221.L$1 = null;
                c16221.label = 6;
                fullPullRequest = crossYearSyncController.pullOnceFullPullFitnessData(str2, j4, null, c16221);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return fullPullRequest;
            case 5:
                ResultKt.throwOnFailure(fullPullRequest);
            case 6:
                ResultKt.throwOnFailure(fullPullRequest);
                return fullPullRequest;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public final Object pullRecentOneYearFitnessData(@NotNull Continuation<? super SyncRequestResult> continuation) {
        C16231 c16231;
        CrossYearSyncController crossYearSyncController;
        String str;
        long j;
        long j2;
        CrossYearSyncController crossYearSyncController2;
        Object objPullAndSaveFitnessDataByTime$default;
        Object objPullAndSaveFitnessDataByTime$default2;
        if (continuation instanceof C16231) {
            c16231 = (C16231) continuation;
            int i = c16231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16231.label = i - Integer.MIN_VALUE;
            } else {
                c16231 = new C16231(continuation);
            }
        } else {
            c16231 = new C16231(continuation);
        }
        C16231 c16232 = c16231;
        Object recentOneYearPullRequest = c16232.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16232.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recentOneYearPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16232.L$0 = this;
            c16232.label = 1;
            recentOneYearPullRequest = serverRequestDaoUtils.getRecentOneYearPullRequest("fitness_data", c16232);
            if (recentOneYearPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            crossYearSyncController = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(recentOneYearPullRequest);
                    SyncRequestResult syncRequestResult = (SyncRequestResult) recentOneYearPullRequest;
                    FitnessLogUtils.i(TAG, "pullRecentOneYearFitnessData: has requested, requestWeight = " + syncRequestResult);
                    return syncRequestResult;
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(recentOneYearPullRequest);
                    objPullAndSaveFitnessDataByTime$default = recentOneYearPullRequest;
                    boolean zBooleanValue = ((Boolean) objPullAndSaveFitnessDataByTime$default).booleanValue();
                    FitnessLogUtils.i(TAG, "pullRecentOneYearFitnessData: continue last request done(hasData = " + zBooleanValue + ")");
                    return new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
                }
                if (i2 == 4) {
                    long j3 = c16232.J$1;
                    long j4 = c16232.J$0;
                    CrossYearSyncController crossYearSyncController3 = (CrossYearSyncController) c16232.L$0;
                    ResultKt.throwOnFailure(recentOneYearPullRequest);
                    j = j3;
                    crossYearSyncController2 = crossYearSyncController3;
                    str = TAG;
                    j2 = j4;
                    c16232.L$0 = null;
                    c16232.label = 5;
                    objPullAndSaveFitnessDataByTime$default2 = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController2, "recent_one_year_pull", null, j2, j, null, false, c16232, 48, null);
                    if (objPullAndSaveFitnessDataByTime$default2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(recentOneYearPullRequest);
                    objPullAndSaveFitnessDataByTime$default2 = recentOneYearPullRequest;
                    str = TAG;
                }
                boolean zBooleanValue2 = ((Boolean) objPullAndSaveFitnessDataByTime$default2).booleanValue();
                FitnessLogUtils.i(str, "pullRecentOneYearFitnessData: done(hasData = " + zBooleanValue2 + ")");
                return new SyncRequestResult(true, zBooleanValue2, false, null, null, false, 60, null);
            }
            CrossYearSyncController crossYearSyncController4 = (CrossYearSyncController) c16232.L$0;
            ResultKt.throwOnFailure(recentOneYearPullRequest);
            crossYearSyncController = crossYearSyncController4;
        }
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        if (serverRequestEntity != null) {
            if (serverRequestEntity.getStartTime() > 0 && TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                long startTime = serverRequestEntity.getStartTime();
                long endTime = serverRequestEntity.getEndTime();
                c16232.L$0 = null;
                c16232.label = 2;
                recentOneYearPullRequest = crossYearSyncController.pullOneYearWeightIfNeed(startTime, endTime, c16232);
                if (recentOneYearPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SyncRequestResult syncRequestResult2 = (SyncRequestResult) recentOneYearPullRequest;
                FitnessLogUtils.i(TAG, "pullRecentOneYearFitnessData: has requested, requestWeight = " + syncRequestResult2);
                return syncRequestResult2;
            }
            if (!TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
                FitnessLogUtils.i(TAG, "pullRecentOneYearFitnessData: continue last request");
                long startTime2 = serverRequestEntity.getStartTime();
                long endTime2 = serverRequestEntity.getEndTime();
                String nextKey = serverRequestEntity.getNextKey();
                c16232.L$0 = null;
                c16232.label = 3;
                objPullAndSaveFitnessDataByTime$default = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController, "recent_one_year_pull", null, startTime2, endTime2, nextKey, false, c16232, 32, null);
                if (objPullAndSaveFitnessDataByTime$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                boolean zBooleanValue3 = ((Boolean) objPullAndSaveFitnessDataByTime$default).booleanValue();
                FitnessLogUtils.i(TAG, "pullRecentOneYearFitnessData: continue last request done(hasData = " + zBooleanValue3 + ")");
                return new SyncRequestResult(true, zBooleanValue3, false, null, null, false, 60, null);
            }
        }
        str = TAG;
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec() - TimeUnit.DAYS.toSeconds(365L);
        FitnessLogUtils.i(str, "pullRecentOneYearFitnessData: startTime = " + todayZeroTimeInSec + ", endTime = 0");
        ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
        c16232.L$0 = crossYearSyncController;
        c16232.J$0 = todayZeroTimeInSec;
        c16232.J$1 = 0L;
        c16232.label = 4;
        CrossYearSyncController crossYearSyncController5 = crossYearSyncController;
        if (serverRequestDaoUtils2.insertFitnessTimePullRequest("recent_one_year_pull", "weight", todayZeroTimeInSec, 0L, null, c16232) == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = 0;
        j2 = todayZeroTimeInSec;
        crossYearSyncController2 = crossYearSyncController5;
        c16232.L$0 = null;
        c16232.label = 5;
        objPullAndSaveFitnessDataByTime$default2 = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController2, "recent_one_year_pull", null, j2, j, null, false, c16232, 48, null);
        if (objPullAndSaveFitnessDataByTime$default2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue4 = ((Boolean) objPullAndSaveFitnessDataByTime$default2).booleanValue();
        FitnessLogUtils.i(str, "pullRecentOneYearFitnessData: done(hasData = " + zBooleanValue4 + ")");
        return new SyncRequestResult(true, zBooleanValue4, false, null, null, false, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object pullRecentOneYearMedicalData(@NotNull Continuation<? super SyncRequestResult> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16241 c16241;
        CrossYearSyncController crossYearSyncController;
        if (continuation instanceof C16241) {
            c16241 = (C16241) continuation;
            int i = c16241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16241.label = i - Integer.MIN_VALUE;
            } else {
                c16241 = new C16241(continuation);
            }
        } else {
            c16241 = new C16241(continuation);
        }
        C16241 c16242 = c16241;
        Object recentOneYearPullRequest = c16242.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16242.label;
        if (i2 != 0) {
            if (i2 == 1) {
                crossYearSyncController = (CrossYearSyncController) c16242.L$0;
                ResultKt.throwOnFailure(recentOneYearPullRequest);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(recentOneYearPullRequest);
            }
            boolean zBooleanValue = ((Boolean) recentOneYearPullRequest).booleanValue();
            FitnessLogUtils.i(TAG, "pullRecentOneYearMedicalData: done(hasData = " + zBooleanValue + ")");
            return new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
        }
        ResultKt.throwOnFailure(recentOneYearPullRequest);
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c16242.L$0 = this;
        c16242.label = 1;
        recentOneYearPullRequest = serverRequestDaoUtils.getRecentOneYearPullRequest("medical_data", c16242);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        crossYearSyncController = this;
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        if (serverRequestEntity != null && TextUtils.isEmpty(serverRequestEntity.getNextKey())) {
            FitnessLogUtils.i(TAG, "pullRecentOneYearMedicalData: has done");
            return new SyncRequestResult(true, false, false, null, null, false, 60, null);
        }
        FitnessLogUtils.i(TAG, "pullRecentOneYearMedicalData: (" + (serverRequestEntity == null) + ")");
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec() - TimeUnit.DAYS.toSeconds(365L);
        if (serverRequestEntity != null) {
            todayZeroTimeInSec = serverRequestEntity.getStartTime();
        }
        long j = todayZeroTimeInSec;
        long endTime = serverRequestEntity != null ? serverRequestEntity.getEndTime() : 0L;
        String nextKey = serverRequestEntity != null ? serverRequestEntity.getNextKey() : null;
        c16242.L$0 = null;
        c16242.label = 2;
        recentOneYearPullRequest = crossYearSyncController.pullAndSaveFitnessDataByTime("recent_one_year_pull", null, j, endTime, nextKey, true, c16242);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue2 = ((Boolean) recentOneYearPullRequest).booleanValue();
        FitnessLogUtils.i(TAG, "pullRecentOneYearMedicalData: done(hasData = " + zBooleanValue2 + ")");
        return new SyncRequestResult(true, zBooleanValue2, false, null, null, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x010c, please report this as an issue */
    public final Object pullCrossYearFitnessData(String str, long j, long j2, Continuation<? super SyncRequestResult> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AnonymousClass2 anonymousClass2;
        CrossYearSyncController crossYearSyncController;
        long j3;
        long j4;
        CrossYearSyncController crossYearSyncController2;
        long j5;
        long j6;
        TimeInterval timeInterval;
        long j7;
        CrossYearSyncController crossYearSyncController3;
        long j8;
        TimeInterval timeInterval2;
        String str2 = str;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        AnonymousClass2 anonymousClass3 = anonymousClass2;
        Object fullPullRequest = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(fullPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            anonymousClass3.L$0 = this;
            anonymousClass3.L$1 = str2;
            anonymousClass3.J$0 = j;
            anonymousClass3.J$1 = j2;
            anonymousClass3.label = 1;
            fullPullRequest = serverRequestDaoUtils.getFullPullRequest(str2, anonymousClass3);
            if (fullPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            crossYearSyncController = this;
            j3 = j2;
            j4 = j;
        } else {
            if (i2 == 1) {
                j3 = anonymousClass3.J$1;
                j4 = anonymousClass3.J$0;
                str2 = (String) anonymousClass3.L$1;
                CrossYearSyncController crossYearSyncController4 = (CrossYearSyncController) anonymousClass3.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                crossYearSyncController = crossYearSyncController4;
            } else if (i2 == 2) {
                j5 = anonymousClass3.J$1;
                j6 = anonymousClass3.J$0;
                str2 = (String) anonymousClass3.L$1;
                crossYearSyncController2 = (CrossYearSyncController) anonymousClass3.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                timeInterval = (TimeInterval) fullPullRequest;
                if (timeInterval == null) {
                    FitnessLogUtils.i(TAG, "recent one year request, abort");
                    return new SyncRequestResult();
                }
                anonymousClass3.L$0 = crossYearSyncController2;
                anonymousClass3.L$1 = str2;
                anonymousClass3.J$0 = j6;
                anonymousClass3.J$1 = j5;
                anonymousClass3.label = 3;
                fullPullRequest = crossYearSyncController2.removeCrossYearRequestInterval(str2, timeInterval, anonymousClass3);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j7 = j5;
                crossYearSyncController3 = crossYearSyncController2;
                j8 = j6;
                timeInterval2 = (TimeInterval) fullPullRequest;
                if (timeInterval2 == null) {
                    FitnessLogUtils.i(TAG, "cross year request has requested, abort");
                    return new SyncRequestResult();
                }
                FitnessLogUtils.i(TAG, "pullCrossYearFitnessData,key = " + str2 + ", startTime = " + timeInterval2.getStartTime() + ", endTime = " + timeInterval2.getEndTime());
                long one_day_time_in_sec = j8 - FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC();
                long one_day_time_in_sec2 = FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC() + j7;
                boolean zContains = ArraysKt___ArraysKt.contains(DailyRecordDaoRepo.INSTANCE.getMedicalDataKeys(), str2);
                anonymousClass3.L$0 = null;
                anonymousClass3.L$1 = null;
                anonymousClass3.label = 4;
                fullPullRequest = crossYearSyncController3.pullAndSaveFitnessDataByTime("cross_year_pull", str2, one_day_time_in_sec, one_day_time_in_sec2, null, zContains, anonymousClass3);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                j5 = anonymousClass3.J$1;
                j6 = anonymousClass3.J$0;
                str2 = (String) anonymousClass3.L$1;
                crossYearSyncController2 = (CrossYearSyncController) anonymousClass3.L$0;
                ResultKt.throwOnFailure(fullPullRequest);
                j7 = j5;
                crossYearSyncController3 = crossYearSyncController2;
                j8 = j6;
                timeInterval2 = (TimeInterval) fullPullRequest;
                if (timeInterval2 == null) {
                    FitnessLogUtils.i(TAG, "cross year request has requested, abort");
                    return new SyncRequestResult();
                }
                FitnessLogUtils.i(TAG, "pullCrossYearFitnessData,key = " + str2 + ", startTime = " + timeInterval2.getStartTime() + ", endTime = " + timeInterval2.getEndTime());
                long one_day_time_in_sec3 = j8 - FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC();
                long one_day_time_in_sec4 = FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC() + j7;
                boolean zContains2 = ArraysKt___ArraysKt.contains(DailyRecordDaoRepo.INSTANCE.getMedicalDataKeys(), str2);
                anonymousClass3.L$0 = null;
                anonymousClass3.L$1 = null;
                anonymousClass3.label = 4;
                fullPullRequest = crossYearSyncController3.pullAndSaveFitnessDataByTime("cross_year_pull", str2, one_day_time_in_sec3, one_day_time_in_sec4, null, zContains2, anonymousClass3);
                if (fullPullRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(fullPullRequest);
            }
            return new SyncRequestResult(true, ((Boolean) fullPullRequest).booleanValue(), false, null, null, false, 60, null);
        }
        if (((ServerRequestEntity) fullPullRequest) != null) {
            FitnessLogUtils.i(TAG, "has full requested " + str2);
            return new SyncRequestResult();
        }
        anonymousClass3.L$0 = crossYearSyncController;
        anonymousClass3.L$1 = str2;
        anonymousClass3.J$0 = j4;
        anonymousClass3.J$1 = j3;
        anonymousClass3.label = 2;
        long j9 = j3;
        long j10 = j4;
        fullPullRequest = crossYearSyncController.removeRecentOneYearRequestInterval("fitness_data", j4, j9, anonymousClass3);
        if (fullPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        crossYearSyncController2 = crossYearSyncController;
        j5 = j9;
        j6 = j10;
        timeInterval = (TimeInterval) fullPullRequest;
        if (timeInterval == null) {
            FitnessLogUtils.i(TAG, "recent one year request, abort");
            return new SyncRequestResult();
        }
        anonymousClass3.L$0 = crossYearSyncController2;
        anonymousClass3.L$1 = str2;
        anonymousClass3.J$0 = j6;
        anonymousClass3.J$1 = j5;
        anonymousClass3.label = 3;
        fullPullRequest = crossYearSyncController2.removeCrossYearRequestInterval(str2, timeInterval, anonymousClass3);
        if (fullPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        j7 = j5;
        crossYearSyncController3 = crossYearSyncController2;
        j8 = j6;
        timeInterval2 = (TimeInterval) fullPullRequest;
        if (timeInterval2 == null) {
            FitnessLogUtils.i(TAG, "cross year request has requested, abort");
            return new SyncRequestResult();
        }
        FitnessLogUtils.i(TAG, "pullCrossYearFitnessData,key = " + str2 + ", startTime = " + timeInterval2.getStartTime() + ", endTime = " + timeInterval2.getEndTime());
        long one_day_time_in_sec5 = j8 - FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC();
        long one_day_time_in_sec6 = FitnessRequestParamKt.getONE_DAY_TIME_IN_SEC() + j7;
        boolean zContains3 = ArraysKt___ArraysKt.contains(DailyRecordDaoRepo.INSTANCE.getMedicalDataKeys(), str2);
        anonymousClass3.L$0 = null;
        anonymousClass3.L$1 = null;
        anonymousClass3.label = 4;
        fullPullRequest = crossYearSyncController3.pullAndSaveFitnessDataByTime("cross_year_pull", str2, one_day_time_in_sec5, one_day_time_in_sec6, null, zContains3, anonymousClass3);
        if (fullPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new SyncRequestResult(true, ((Boolean) fullPullRequest).booleanValue(), false, null, null, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0154  */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x015e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x017b, please report this as an issue */
    public final Object pullAllFitnessDataByKey(String str, Continuation<? super SyncRequestResult> continuation) {
        AnonymousClass3 anonymousClass3;
        CrossYearSyncController crossYearSyncController;
        Object recentOneYearPullRequest;
        long j;
        Object objPullAndSaveFitnessDataByTime$default;
        ServerRequestEntity serverRequestEntity;
        long startTime;
        String str2;
        Object objPullAndSaveFitnessDataByTime$default2;
        Object obj;
        String str3;
        String str4 = str;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        AnonymousClass3 anonymousClass4 = anonymousClass3;
        Object fullPullRequest = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass4.label;
        String str5 = ")";
        if (i2 == 0) {
            ResultKt.throwOnFailure(fullPullRequest);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            anonymousClass4.L$0 = this;
            anonymousClass4.L$1 = str4;
            anonymousClass4.label = 1;
            fullPullRequest = serverRequestDaoUtils.getFullPullRequest(str4, anonymousClass4);
            if (fullPullRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
            crossYearSyncController = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str4 = (String) anonymousClass4.L$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    objPullAndSaveFitnessDataByTime$default = fullPullRequest;
                    boolean zBooleanValue = ((Boolean) objPullAndSaveFitnessDataByTime$default).booleanValue();
                    FitnessLogUtils.i(TAG, "pullAllFitnessDataByKey(" + str4 + "): continue last request done(hasData = " + zBooleanValue + ")");
                    return new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
                }
                if (i2 == 3) {
                    long j2 = anonymousClass4.J$0;
                    str4 = (String) anonymousClass4.L$1;
                    crossYearSyncController = (CrossYearSyncController) anonymousClass4.L$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    j = j2;
                    recentOneYearPullRequest = fullPullRequest;
                    serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
                    if (serverRequestEntity != null) {
                        startTime = serverRequestEntity.getStartTime();
                    } else {
                        startTime = j;
                    }
                    if (startTime <= 0) {
                        FitnessLogUtils.i(r12, "pullAllFitnessDataByKey(" + str4 + "): should after one year pull");
                        return new SyncRequestResult();
                    }
                    FitnessLogUtils.i(r12, "start pullAllFitnessDataByKey(" + str4 + "), endTime = " + startTime);
                    anonymousClass4.L$0 = str4;
                    anonymousClass4.L$1 = null;
                    anonymousClass4.label = 4;
                    str2 = str4;
                    objPullAndSaveFitnessDataByTime$default2 = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController, "full_pull", str4, 0L, startTime, null, false, anonymousClass4, 48, null);
                    if (objPullAndSaveFitnessDataByTime$default2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objPullAndSaveFitnessDataByTime$default2;
                    str3 = str2;
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = (String) anonymousClass4.L$0;
                    ResultKt.throwOnFailure(fullPullRequest);
                    obj = fullPullRequest;
                    str5 = ")";
                    str3 = str6;
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                FitnessLogUtils.i(TAG, "pullFullFitnessData(" + str3 + "): done(hasData = " + zBooleanValue2 + str5);
                return new SyncRequestResult(true, zBooleanValue2, false, null, null, false, 60, null);
            }
            str4 = (String) anonymousClass4.L$1;
            crossYearSyncController = (CrossYearSyncController) anonymousClass4.L$0;
            ResultKt.throwOnFailure(fullPullRequest);
        }
        ServerRequestEntity serverRequestEntity2 = (ServerRequestEntity) fullPullRequest;
        if (serverRequestEntity2 != null) {
            if (!TextUtils.isEmpty(serverRequestEntity2.getNextKey())) {
                FitnessLogUtils.i(TAG, "pullAllFitnessDataByKey(" + str4 + "): continue last request");
                long startTime2 = serverRequestEntity2.getStartTime();
                long endTime = serverRequestEntity2.getEndTime();
                String nextKey = serverRequestEntity2.getNextKey();
                anonymousClass4.L$0 = str4;
                anonymousClass4.L$1 = null;
                anonymousClass4.label = 2;
                objPullAndSaveFitnessDataByTime$default = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController, "full_pull", str4, startTime2, endTime, nextKey, false, anonymousClass4, 32, null);
                if (objPullAndSaveFitnessDataByTime$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                boolean zBooleanValue3 = ((Boolean) objPullAndSaveFitnessDataByTime$default).booleanValue();
                FitnessLogUtils.i(TAG, "pullAllFitnessDataByKey(" + str4 + "): continue last request done(hasData = " + zBooleanValue3 + ")");
                return new SyncRequestResult(true, zBooleanValue3, false, null, null, false, 60, null);
            }
            FitnessLogUtils.i(TAG, "pullAllFitnessDataByKey(" + str4 + "): has request done and abort this");
            return new SyncRequestResult();
        }
        ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
        anonymousClass4.L$0 = crossYearSyncController;
        anonymousClass4.L$1 = str4;
        anonymousClass4.J$0 = 0L;
        anonymousClass4.label = 3;
        recentOneYearPullRequest = serverRequestDaoUtils2.getRecentOneYearPullRequest("fitness_data", anonymousClass4);
        if (recentOneYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        j = 0;
        serverRequestEntity = (ServerRequestEntity) recentOneYearPullRequest;
        if (serverRequestEntity != null) {
            startTime = serverRequestEntity.getStartTime();
        } else {
            startTime = j;
        }
        if (startTime <= 0) {
            FitnessLogUtils.i(r12, "pullAllFitnessDataByKey(" + str4 + "): should after one year pull");
            return new SyncRequestResult();
        }
        FitnessLogUtils.i(r12, "start pullAllFitnessDataByKey(" + str4 + "), endTime = " + startTime);
        anonymousClass4.L$0 = str4;
        anonymousClass4.L$1 = null;
        anonymousClass4.label = 4;
        str2 = str4;
        objPullAndSaveFitnessDataByTime$default2 = CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(crossYearSyncController, "full_pull", str4, 0L, startTime, null, false, anonymousClass4, 48, null);
        if (objPullAndSaveFitnessDataByTime$default2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objPullAndSaveFitnessDataByTime$default2;
        str3 = str2;
        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
        FitnessLogUtils.i(TAG, "pullFullFitnessData(" + str3 + "): done(hasData = " + zBooleanValue4 + str5);
        return new SyncRequestResult(true, zBooleanValue4, false, null, null, false, 60, null);
    }
}
