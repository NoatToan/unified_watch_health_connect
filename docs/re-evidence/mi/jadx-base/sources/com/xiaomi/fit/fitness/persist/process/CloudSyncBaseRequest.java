package com.xiaomi.fit.fitness.persist.process;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByWM;
import com.xiaomi.fit.fitness.persist.server.data.GetFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeParams;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetSportReportByTime;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessData;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.LatestSportReport;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByWM;
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0084@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0084@¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0084@¢\u0006\u0002\u0010\u0014J2\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0084@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002JH\u0010!\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0084@¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0084@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u001d2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001fH\u0002J>\u0010+\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0084@¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\u001d2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u0010/R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u00060"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/CloudSyncBaseRequest;", "", "<init>", "()V", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "pullAndSaveSportReportByWM", "", "watermark", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullAndSaveFitnessDataByWM", "isMedicalData", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullAndSaveLatestSportReport", "time", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullAndSaveSportReportByTime", "requestAction", "", "startTime", "endTime", "nextKey", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSportReportToDB", "", "sportList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "pullAndSaveFitnessDataByTime", "persistKey", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullAndSaveLatestFitnessData", "requestList", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessDataModel;", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFitnessDataToDB", "dataList", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "pullProjectDataByTime", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveProjectDataToDB", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCloudSyncBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudSyncBaseRequest.kt\ncom/xiaomi/fit/fitness/persist/process/CloudSyncBaseRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n1863#2,2:213\n*S KotlinDebug\n*F\n+ 1 CloudSyncBaseRequest.kt\ncom/xiaomi/fit/fitness/persist/process/CloudSyncBaseRequest\n*L\n146#1:213,2\n*E\n"})
public class CloudSyncBaseRequest {

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w24
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CloudSyncBaseRequest.mFitnessRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveFitnessDataByTime$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3}, l = {112, 114, 120, 127}, m = "pullAndSaveFitnessDataByTime", n = {"this", "requestAction", "persistKey", "startTime", "endTime", "isMedicalData", "this", "requestAction", "persistKey", "startTime", "endTime", "isMedicalData", "this", "requestAction", "persistKey", "dataResult", "startTime", "endTime", "isMedicalData", "hasData"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "Z$0", "L$0", "L$1", "L$2", "J$0", "J$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "Z$0", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
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
            return CloudSyncBaseRequest.this.pullAndSaveFitnessDataByTime(null, null, 0L, 0L, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveFitnessDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4}, l = {39, 40, 43, 44, 52}, m = "pullAndSaveFitnessDataByWM", n = {"this", "isMedicalData", "this", "result", "isMedicalData", "this", "isMedicalData", "this", "result", "isMedicalData", "hasData"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "I$0"})
    public static final class C16111 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16111(Continuation<? super C16111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullAndSaveFitnessDataByWM(0L, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveLatestFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 0, 1, 1, 2}, l = {140, 142, 147}, m = "pullAndSaveLatestFitnessData", n = {"this", "requestList", "this", "requestList", "dataResult"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class C16121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16121(Continuation<? super C16121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullAndSaveLatestFitnessData(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveLatestSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0}, l = {61}, m = "pullAndSaveLatestSportReport", n = {"this"}, s = {"L$0"})
    public static final class C16131 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16131(Continuation<? super C16131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullAndSaveLatestSportReport(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveSportReportByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2}, l = {79, 81, 88}, m = "pullAndSaveSportReportByTime", n = {"this", "requestAction", "startTime", "endTime", "this", "requestAction", "sportResult", "startTime", "endTime", "hasData"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0"})
    public static final class C16141 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C16141(Continuation<? super C16141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullAndSaveSportReportByTime(null, 0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullAndSaveSportReportByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 1, 1, 2}, l = {21, 23, 27}, m = "pullAndSaveSportReportByWM", n = {"this", "this", "sportResult", "hasData"}, s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class C16151 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16151(Continuation<? super C16151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullAndSaveSportReportByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest$pullProjectDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.CloudSyncBaseRequest", f = "CloudSyncBaseRequest.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3}, l = {168, 169, 171, 177}, m = "pullProjectDataByTime", n = {"this", "requestAction", "persistKey", "startTime", "endTime", "this", "requestAction", "persistKey", "dataResult", "startTime", "endTime", "this", "requestAction", "persistKey", "dataResult", "startTime", "endTime", "hasData"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "I$0"})
    public static final class C16161 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C16161(Continuation<? super C16161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CloudSyncBaseRequest.this.pullProjectDataByTime(null, null, 0L, 0L, null, this);
        }
    }

    private final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) this.mFitnessRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    public static /* synthetic */ Object pullAndSaveFitnessDataByTime$default(CloudSyncBaseRequest cloudSyncBaseRequest, String str, String str2, long j, long j2, String str3, boolean z, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            return cloudSyncBaseRequest.pullAndSaveFitnessDataByTime(str, str2, j, j2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullAndSaveFitnessDataByTime");
    }

    public static /* synthetic */ Object pullAndSaveFitnessDataByWM$default(CloudSyncBaseRequest cloudSyncBaseRequest, long j, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullAndSaveFitnessDataByWM");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(j, z, continuation);
    }

    public static /* synthetic */ Object pullAndSaveLatestFitnessData$default(CloudSyncBaseRequest cloudSyncBaseRequest, List list, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullAndSaveLatestFitnessData");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return cloudSyncBaseRequest.pullAndSaveLatestFitnessData(list, z, continuation);
    }

    public static /* synthetic */ Object pullAndSaveLatestSportReport$default(CloudSyncBaseRequest cloudSyncBaseRequest, Long l, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullAndSaveLatestSportReport");
        }
        if ((i & 1) != 0) {
            l = null;
        }
        return cloudSyncBaseRequest.pullAndSaveLatestSportReport(l, continuation);
    }

    public static /* synthetic */ Object pullAndSaveSportReportByTime$default(CloudSyncBaseRequest cloudSyncBaseRequest, String str, long j, long j2, String str2, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            return cloudSyncBaseRequest.pullAndSaveSportReportByTime(str, j, j2, (i & 8) != 0 ? null : str2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullAndSaveSportReportByTime");
    }

    public static /* synthetic */ Object pullProjectDataByTime$default(CloudSyncBaseRequest cloudSyncBaseRequest, String str, String str2, long j, long j2, String str3, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            return cloudSyncBaseRequest.pullProjectDataByTime(str, str2, j, j2, (i & 16) != 0 ? null : str3, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullProjectDataByTime");
    }

    private final void saveFitnessDataToDB(List<FitnessDataModel> dataList) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (dataList.isEmpty()) {
            return;
        }
        DailyRecordDaoUtils.INSTANCE.recordServerDailyDataToDB(dataList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveProjectDataToDB(List<ProjectDataModel> list, Continuation<? super Unit> continuation) {
        List<ProjectDataModel> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objInsertProjectDataFromServer = ProjectEntityDaoProxy.INSTANCE.insertProjectDataFromServer(list, continuation);
        return objInsertProjectDataFromServer == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertProjectDataFromServer : Unit.INSTANCE;
    }

    private final void saveSportReportToDB(List<SportReportModel> sportList) {
        if (sportList.isEmpty()) {
            return;
        }
        SportReportDaoUtils.INSTANCE.recordServerSportReportToDB(sportList);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0152  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Nullable
    public final Object pullAndSaveFitnessDataByTime(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable String str3, boolean z, @NotNull Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AnonymousClass1 anonymousClass1;
        Object obj;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        Object obj2;
        String str4;
        long j3;
        Object obj3;
        FitnessDataResultByTime fitnessDataResultByTime;
        long j4;
        String str5;
        long j5;
        FitnessDataResultByTime fitnessDataResultByTime2;
        boolean z2;
        CloudSyncBaseRequest cloudSyncBaseRequest2;
        String str6;
        ServerRequestDaoUtils serverRequestDaoUtils;
        String nextKey;
        long j6;
        String str7;
        String str8;
        CloudSyncBaseRequest cloudSyncBaseRequest3;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj4;
        int i;
        String str9 = str2;
        long j7 = j;
        boolean z6 = z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objPullAndSaveFitnessDataByTime = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPullAndSaveFitnessDataByTime);
            GetFitnessDataByTime getFitnessDataByTime = new GetFitnessDataByTime(str2, j7 <= 0 ? null : Boxing.boxLong(j), j2 <= 0 ? null : Boxing.boxLong(j2), Boxing.boxBoolean(true), str3);
            if (z6) {
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = str;
                anonymousClass2.L$2 = str9;
                anonymousClass2.J$0 = j7;
                anonymousClass2.J$1 = j2;
                anonymousClass2.Z$0 = z6;
                anonymousClass2.label = 1;
                Object medicalDataByTime = mFitnessRequest.getMedicalDataByTime(getFitnessDataByTime, anonymousClass2);
                obj = coroutine_suspended;
                if (medicalDataByTime == obj) {
                    return obj;
                }
                cloudSyncBaseRequest = this;
                obj3 = medicalDataByTime;
                str4 = str;
                j3 = j2;
                fitnessDataResultByTime = (FitnessDataResultByTime) obj3;
                j4 = j3;
                str5 = str9;
                j5 = j7;
                fitnessDataResultByTime2 = fitnessDataResultByTime;
                z2 = z6;
                cloudSyncBaseRequest2 = cloudSyncBaseRequest;
                cloudSyncBaseRequest2.saveFitnessDataToDB(fitnessDataResultByTime2.getDataList());
                if (str4 != null) {
                    if (str5 == null) {
                        if (z2) {
                            str6 = "medical_data";
                        } else {
                            str6 = "fitness_data";
                        }
                    } else if (z2) {
                        str6 = "medical_data";
                    } else {
                        str6 = "fitness_data";
                    }
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    nextKey = fitnessDataResultByTime2.getNextKey();
                    anonymousClass2.L$0 = cloudSyncBaseRequest2;
                    anonymousClass2.L$1 = str4;
                    anonymousClass2.L$2 = str5;
                    anonymousClass2.L$3 = fitnessDataResultByTime2;
                    anonymousClass2.J$0 = j5;
                    anonymousClass2.J$1 = j4;
                    anonymousClass2.Z$0 = z2;
                    anonymousClass2.label = 3;
                    if (serverRequestDaoUtils.insertFitnessTimePullRequest(str4, str6, j5, j4, nextKey, anonymousClass2) == obj) {
                        return obj;
                    }
                }
                j6 = j4;
                str7 = str5;
                str8 = str4;
                cloudSyncBaseRequest3 = cloudSyncBaseRequest2;
                z3 = z2;
                z4 = true;
                z5 = !fitnessDataResultByTime2.getDataList().isEmpty();
                if (fitnessDataResultByTime2.getHasMore()) {
                    String nextKey2 = fitnessDataResultByTime2.getNextKey();
                    anonymousClass2.L$0 = null;
                    anonymousClass2.L$1 = null;
                    anonymousClass2.L$2 = null;
                    anonymousClass2.L$3 = null;
                    anonymousClass2.I$0 = z5 ? 1 : 0;
                    anonymousClass2.label = 4;
                    obj4 = obj;
                    objPullAndSaveFitnessDataByTime = cloudSyncBaseRequest3.pullAndSaveFitnessDataByTime(str8, str7, j5, j6, nextKey2, z3, anonymousClass2);
                    if (objPullAndSaveFitnessDataByTime == obj4) {
                        return obj4;
                    }
                    i = z5 ? 1 : 0;
                }
                return Boxing.boxBoolean(z5);
            }
            obj = coroutine_suspended;
            FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = str;
            anonymousClass2.L$2 = str9;
            anonymousClass2.J$0 = j7;
            anonymousClass2.J$1 = j2;
            anonymousClass2.Z$0 = z6;
            anonymousClass2.label = 2;
            Object fitnessDataByTime = mFitnessRequest2.getFitnessDataByTime(getFitnessDataByTime, anonymousClass2);
            if (fitnessDataByTime == obj) {
                return obj;
            }
            cloudSyncBaseRequest = this;
            obj2 = fitnessDataByTime;
            str4 = str;
            j3 = j2;
            fitnessDataResultByTime = (FitnessDataResultByTime) obj2;
            j4 = j3;
            str5 = str9;
            j5 = j7;
            fitnessDataResultByTime2 = fitnessDataResultByTime;
            z2 = z6;
            cloudSyncBaseRequest2 = cloudSyncBaseRequest;
            cloudSyncBaseRequest2.saveFitnessDataToDB(fitnessDataResultByTime2.getDataList());
            if (str4 != null) {
                if (str5 == null) {
                    if (z2) {
                        str6 = "medical_data";
                    } else {
                        str6 = "fitness_data";
                    }
                } else if (z2) {
                    str6 = "medical_data";
                } else {
                    str6 = "fitness_data";
                }
                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                nextKey = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = cloudSyncBaseRequest2;
                anonymousClass2.L$1 = str4;
                anonymousClass2.L$2 = str5;
                anonymousClass2.L$3 = fitnessDataResultByTime2;
                anonymousClass2.J$0 = j5;
                anonymousClass2.J$1 = j4;
                anonymousClass2.Z$0 = z2;
                anonymousClass2.label = 3;
                if (serverRequestDaoUtils.insertFitnessTimePullRequest(str4, str6, j5, j4, nextKey, anonymousClass2) == obj) {
                    return obj;
                }
            }
            j6 = j4;
            str7 = str5;
            str8 = str4;
            cloudSyncBaseRequest3 = cloudSyncBaseRequest2;
            z3 = z2;
            z4 = true;
            z5 = !fitnessDataResultByTime2.getDataList().isEmpty();
            if (fitnessDataResultByTime2.getHasMore()) {
                String nextKey3 = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.I$0 = z5 ? 1 : 0;
                anonymousClass2.label = 4;
                obj4 = obj;
                objPullAndSaveFitnessDataByTime = cloudSyncBaseRequest3.pullAndSaveFitnessDataByTime(str8, str7, j5, j6, nextKey3, z3, anonymousClass2);
                if (objPullAndSaveFitnessDataByTime == obj4) {
                    return obj4;
                }
                i = z5 ? 1 : 0;
            }
            return Boxing.boxBoolean(z5);
        }
        if (i3 == 1) {
            boolean z7 = anonymousClass2.Z$0;
            long j8 = anonymousClass2.J$1;
            long j9 = anonymousClass2.J$0;
            String str10 = (String) anonymousClass2.L$2;
            str4 = (String) anonymousClass2.L$1;
            CloudSyncBaseRequest cloudSyncBaseRequest4 = (CloudSyncBaseRequest) anonymousClass2.L$0;
            ResultKt.throwOnFailure(objPullAndSaveFitnessDataByTime);
            obj = coroutine_suspended;
            cloudSyncBaseRequest = cloudSyncBaseRequest4;
            z6 = z7;
            obj3 = objPullAndSaveFitnessDataByTime;
            j3 = j8;
            j7 = j9;
            str9 = str10;
            fitnessDataResultByTime = (FitnessDataResultByTime) obj3;
            j4 = j3;
            str5 = str9;
            j5 = j7;
            fitnessDataResultByTime2 = fitnessDataResultByTime;
            z2 = z6;
            cloudSyncBaseRequest2 = cloudSyncBaseRequest;
            cloudSyncBaseRequest2.saveFitnessDataToDB(fitnessDataResultByTime2.getDataList());
            if (str4 != null) {
                if (str5 == null) {
                    if (z2) {
                        str6 = "medical_data";
                    } else {
                        str6 = "fitness_data";
                    }
                } else if (z2) {
                    str6 = "medical_data";
                } else {
                    str6 = "fitness_data";
                }
                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                nextKey = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = cloudSyncBaseRequest2;
                anonymousClass2.L$1 = str4;
                anonymousClass2.L$2 = str5;
                anonymousClass2.L$3 = fitnessDataResultByTime2;
                anonymousClass2.J$0 = j5;
                anonymousClass2.J$1 = j4;
                anonymousClass2.Z$0 = z2;
                anonymousClass2.label = 3;
                if (serverRequestDaoUtils.insertFitnessTimePullRequest(str4, str6, j5, j4, nextKey, anonymousClass2) == obj) {
                    return obj;
                }
            }
            j6 = j4;
            str7 = str5;
            str8 = str4;
            cloudSyncBaseRequest3 = cloudSyncBaseRequest2;
            z3 = z2;
            z4 = true;
            z5 = !fitnessDataResultByTime2.getDataList().isEmpty();
            if (fitnessDataResultByTime2.getHasMore()) {
                String nextKey4 = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.I$0 = z5 ? 1 : 0;
                anonymousClass2.label = 4;
                obj4 = obj;
                objPullAndSaveFitnessDataByTime = cloudSyncBaseRequest3.pullAndSaveFitnessDataByTime(str8, str7, j5, j6, nextKey4, z3, anonymousClass2);
                if (objPullAndSaveFitnessDataByTime == obj4) {
                    return obj4;
                }
                i = z5 ? 1 : 0;
            }
            return Boxing.boxBoolean(z5);
        }
        if (i3 == 2) {
            boolean z8 = anonymousClass2.Z$0;
            long j10 = anonymousClass2.J$1;
            long j11 = anonymousClass2.J$0;
            String str11 = (String) anonymousClass2.L$2;
            str4 = (String) anonymousClass2.L$1;
            CloudSyncBaseRequest cloudSyncBaseRequest5 = (CloudSyncBaseRequest) anonymousClass2.L$0;
            ResultKt.throwOnFailure(objPullAndSaveFitnessDataByTime);
            obj = coroutine_suspended;
            cloudSyncBaseRequest = cloudSyncBaseRequest5;
            z6 = z8;
            obj2 = objPullAndSaveFitnessDataByTime;
            j3 = j10;
            j7 = j11;
            str9 = str11;
            fitnessDataResultByTime = (FitnessDataResultByTime) obj2;
            j4 = j3;
            str5 = str9;
            j5 = j7;
            fitnessDataResultByTime2 = fitnessDataResultByTime;
            z2 = z6;
            cloudSyncBaseRequest2 = cloudSyncBaseRequest;
            cloudSyncBaseRequest2.saveFitnessDataToDB(fitnessDataResultByTime2.getDataList());
            if (str4 != null) {
                if (str5 == null && !StringsKt__StringsKt.isBlank(str5)) {
                    str6 = str5;
                } else if (z2) {
                    str6 = "medical_data";
                } else {
                    str6 = "fitness_data";
                }
                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                nextKey = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = cloudSyncBaseRequest2;
                anonymousClass2.L$1 = str4;
                anonymousClass2.L$2 = str5;
                anonymousClass2.L$3 = fitnessDataResultByTime2;
                anonymousClass2.J$0 = j5;
                anonymousClass2.J$1 = j4;
                anonymousClass2.Z$0 = z2;
                anonymousClass2.label = 3;
                if (serverRequestDaoUtils.insertFitnessTimePullRequest(str4, str6, j5, j4, nextKey, anonymousClass2) == obj) {
                    return obj;
                }
            }
            j6 = j4;
            str7 = str5;
            str8 = str4;
            cloudSyncBaseRequest3 = cloudSyncBaseRequest2;
            z3 = z2;
            z4 = true;
            z5 = !fitnessDataResultByTime2.getDataList().isEmpty();
            if (fitnessDataResultByTime2.getHasMore()) {
                String nextKey5 = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.I$0 = z5 ? 1 : 0;
                anonymousClass2.label = 4;
                obj4 = obj;
                objPullAndSaveFitnessDataByTime = cloudSyncBaseRequest3.pullAndSaveFitnessDataByTime(str8, str7, j5, j6, nextKey5, z3, anonymousClass2);
                if (objPullAndSaveFitnessDataByTime == obj4) {
                    return obj4;
                }
                i = z5 ? 1 : 0;
            }
            return Boxing.boxBoolean(z5);
        }
        if (i3 == 3) {
            z2 = anonymousClass2.Z$0;
            j4 = anonymousClass2.J$1;
            j5 = anonymousClass2.J$0;
            fitnessDataResultByTime2 = (FitnessDataResultByTime) anonymousClass2.L$3;
            str5 = (String) anonymousClass2.L$2;
            str4 = (String) anonymousClass2.L$1;
            cloudSyncBaseRequest2 = (CloudSyncBaseRequest) anonymousClass2.L$0;
            ResultKt.throwOnFailure(objPullAndSaveFitnessDataByTime);
            obj = coroutine_suspended;
            j6 = j4;
            str7 = str5;
            str8 = str4;
            cloudSyncBaseRequest3 = cloudSyncBaseRequest2;
            z3 = z2;
            z4 = true;
            z5 = !fitnessDataResultByTime2.getDataList().isEmpty();
            if (fitnessDataResultByTime2.getHasMore() && !TextUtils.isEmpty(fitnessDataResultByTime2.getNextKey())) {
                String nextKey6 = fitnessDataResultByTime2.getNextKey();
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.I$0 = z5 ? 1 : 0;
                anonymousClass2.label = 4;
                obj4 = obj;
                objPullAndSaveFitnessDataByTime = cloudSyncBaseRequest3.pullAndSaveFitnessDataByTime(str8, str7, j5, j6, nextKey6, z3, anonymousClass2);
                if (objPullAndSaveFitnessDataByTime == obj4) {
                    return obj4;
                }
                i = z5 ? 1 : 0;
            }
            return Boxing.boxBoolean(z5);
        }
        if (i3 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = anonymousClass2.I$0;
        ResultKt.throwOnFailure(objPullAndSaveFitnessDataByTime);
        z4 = true;
        z5 = (i != 0 || ((Boolean) objPullAndSaveFitnessDataByTime).booleanValue()) ? z4 : false;
        return Boxing.boxBoolean(z5);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pullAndSaveFitnessDataByWM(long j, boolean z, @NotNull Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16111 c16111;
        boolean z2;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        FitnessDataResultByWM fitnessDataResultByWM;
        ServerRequestDaoUtils serverRequestDaoUtils;
        long waterMark;
        boolean z3;
        Object objPullAndSaveFitnessDataByWM;
        int i;
        ServerRequestDaoUtils serverRequestDaoUtils2;
        long waterMark2;
        if (continuation instanceof C16111) {
            c16111 = (C16111) continuation;
            int i2 = c16111.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16111.label = i2 - Integer.MIN_VALUE;
            } else {
                c16111 = new C16111(continuation);
            }
        } else {
            c16111 = new C16111(continuation);
        }
        Object fitnessDataByWM = c16111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16111.label;
        boolean z4 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(fitnessDataByWM);
            if (z) {
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                c16111.L$0 = this;
                c16111.Z$0 = z;
                c16111.label = 1;
                fitnessDataByWM = mFitnessRequest.getMedicalDataByWM(j, c16111);
                if (fitnessDataByWM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                cloudSyncBaseRequest = this;
                fitnessDataResultByWM = (FitnessDataResultByWM) fitnessDataByWM;
                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                waterMark = fitnessDataResultByWM.getWaterMark();
                c16111.L$0 = cloudSyncBaseRequest;
                c16111.L$1 = fitnessDataResultByWM;
                c16111.Z$0 = z2;
                c16111.label = 2;
                if (serverRequestDaoUtils.updateMedicalMaxWatermark(waterMark, c16111) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudSyncBaseRequest.saveFitnessDataToDB(fitnessDataResultByWM.getDataList());
                z3 = !fitnessDataResultByWM.getDataList().isEmpty();
                if (fitnessDataResultByWM.getHasMore()) {
                    long waterMark3 = fitnessDataResultByWM.getWaterMark();
                    c16111.L$0 = null;
                    c16111.L$1 = null;
                    c16111.I$0 = z3 ? 1 : 0;
                    c16111.label = 5;
                    objPullAndSaveFitnessDataByWM = cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(waterMark3, z2, c16111);
                    if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fitnessDataByWM = objPullAndSaveFitnessDataByWM;
                    i = z3 ? 1 : 0;
                }
                return Boxing.boxBoolean(z3);
            }
            FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
            c16111.L$0 = this;
            c16111.Z$0 = z;
            c16111.label = 3;
            fitnessDataByWM = mFitnessRequest2.getFitnessDataByWM(j, c16111);
            if (fitnessDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            z2 = z;
            cloudSyncBaseRequest = this;
            fitnessDataResultByWM = (FitnessDataResultByWM) fitnessDataByWM;
            serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
            waterMark2 = fitnessDataResultByWM.getWaterMark();
            c16111.L$0 = cloudSyncBaseRequest;
            c16111.L$1 = fitnessDataResultByWM;
            c16111.Z$0 = z2;
            c16111.label = 4;
            if (serverRequestDaoUtils2.updateFitnessMaxWatermark(waterMark2, c16111) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudSyncBaseRequest.saveFitnessDataToDB(fitnessDataResultByWM.getDataList());
            z3 = !fitnessDataResultByWM.getDataList().isEmpty();
            if (fitnessDataResultByWM.getHasMore()) {
                long waterMark4 = fitnessDataResultByWM.getWaterMark();
                c16111.L$0 = null;
                c16111.L$1 = null;
                c16111.I$0 = z3 ? 1 : 0;
                c16111.label = 5;
                objPullAndSaveFitnessDataByWM = cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(waterMark4, z2, c16111);
                if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessDataByWM = objPullAndSaveFitnessDataByWM;
                i = z3 ? 1 : 0;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i3 == 1) {
            boolean z5 = c16111.Z$0;
            CloudSyncBaseRequest cloudSyncBaseRequest2 = (CloudSyncBaseRequest) c16111.L$0;
            ResultKt.throwOnFailure(fitnessDataByWM);
            cloudSyncBaseRequest = cloudSyncBaseRequest2;
            z2 = z5;
            fitnessDataResultByWM = (FitnessDataResultByWM) fitnessDataByWM;
            serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            waterMark = fitnessDataResultByWM.getWaterMark();
            c16111.L$0 = cloudSyncBaseRequest;
            c16111.L$1 = fitnessDataResultByWM;
            c16111.Z$0 = z2;
            c16111.label = 2;
            if (serverRequestDaoUtils.updateMedicalMaxWatermark(waterMark, c16111) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudSyncBaseRequest.saveFitnessDataToDB(fitnessDataResultByWM.getDataList());
            z3 = !fitnessDataResultByWM.getDataList().isEmpty();
            if (fitnessDataResultByWM.getHasMore()) {
                long waterMark5 = fitnessDataResultByWM.getWaterMark();
                c16111.L$0 = null;
                c16111.L$1 = null;
                c16111.I$0 = z3 ? 1 : 0;
                c16111.label = 5;
                objPullAndSaveFitnessDataByWM = cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(waterMark5, z2, c16111);
                if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessDataByWM = objPullAndSaveFitnessDataByWM;
                i = z3 ? 1 : 0;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i3 != 2) {
            if (i3 == 3) {
                boolean z6 = c16111.Z$0;
                CloudSyncBaseRequest cloudSyncBaseRequest3 = (CloudSyncBaseRequest) c16111.L$0;
                ResultKt.throwOnFailure(fitnessDataByWM);
                cloudSyncBaseRequest = cloudSyncBaseRequest3;
                z2 = z6;
                fitnessDataResultByWM = (FitnessDataResultByWM) fitnessDataByWM;
                serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
                waterMark2 = fitnessDataResultByWM.getWaterMark();
                c16111.L$0 = cloudSyncBaseRequest;
                c16111.L$1 = fitnessDataResultByWM;
                c16111.Z$0 = z2;
                c16111.label = 4;
                if (serverRequestDaoUtils2.updateFitnessMaxWatermark(waterMark2, c16111) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudSyncBaseRequest.saveFitnessDataToDB(fitnessDataResultByWM.getDataList());
                z3 = !fitnessDataResultByWM.getDataList().isEmpty();
                if (fitnessDataResultByWM.getHasMore()) {
                    long waterMark6 = fitnessDataResultByWM.getWaterMark();
                    c16111.L$0 = null;
                    c16111.L$1 = null;
                    c16111.I$0 = z3 ? 1 : 0;
                    c16111.label = 5;
                    objPullAndSaveFitnessDataByWM = cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(waterMark6, z2, c16111);
                    if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fitnessDataByWM = objPullAndSaveFitnessDataByWM;
                    i = z3 ? 1 : 0;
                }
                return Boxing.boxBoolean(z3);
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c16111.I$0;
                ResultKt.throwOnFailure(fitnessDataByWM);
            }
        }
        z2 = c16111.Z$0;
        fitnessDataResultByWM = (FitnessDataResultByWM) c16111.L$1;
        cloudSyncBaseRequest = (CloudSyncBaseRequest) c16111.L$0;
        ResultKt.throwOnFailure(fitnessDataByWM);
        cloudSyncBaseRequest.saveFitnessDataToDB(fitnessDataResultByWM.getDataList());
        z3 = !fitnessDataResultByWM.getDataList().isEmpty();
        if (fitnessDataResultByWM.getHasMore()) {
            long waterMark7 = fitnessDataResultByWM.getWaterMark();
            c16111.L$0 = null;
            c16111.L$1 = null;
            c16111.I$0 = z3 ? 1 : 0;
            c16111.label = 5;
            objPullAndSaveFitnessDataByWM = cloudSyncBaseRequest.pullAndSaveFitnessDataByWM(waterMark7, z2, c16111);
            if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessDataByWM = objPullAndSaveFitnessDataByWM;
            i = z3 ? 1 : 0;
        }
        return Boxing.boxBoolean(z3);
        boolean zBooleanValue = ((Boolean) fitnessDataByWM).booleanValue();
        if (i == 0 && !zBooleanValue) {
            z4 = false;
        }
        z3 = z4;
        return Boxing.boxBoolean(z3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pullAndSaveLatestFitnessData(@NotNull List<LatestFitnessDataModel> list, boolean z, @NotNull Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16121 c16121;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        LatestFitnessData latestFitnessData;
        Iterator it;
        LatestFitnessData latestFitnessData2;
        if (continuation instanceof C16121) {
            c16121 = (C16121) continuation;
            int i = c16121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16121.label = i - Integer.MIN_VALUE;
            } else {
                c16121 = new C16121(continuation);
            }
        } else {
            c16121 = new C16121(continuation);
        }
        Object latestFitnessData3 = c16121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestFitnessData3);
            if (z) {
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                c16121.L$0 = this;
                c16121.L$1 = list;
                c16121.label = 1;
                latestFitnessData3 = mFitnessRequest.getLatestMedicalData(list, c16121);
                if (latestFitnessData3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudSyncBaseRequest = this;
                latestFitnessData = (LatestFitnessData) latestFitnessData3;
                cloudSyncBaseRequest.saveFitnessDataToDB(latestFitnessData.getDataList());
                it = list.iterator();
                latestFitnessData2 = latestFitnessData;
            } else {
                FitnessDataRequest mFitnessRequest2 = getMFitnessRequest();
                c16121.L$0 = this;
                c16121.L$1 = list;
                c16121.label = 2;
                latestFitnessData3 = mFitnessRequest2.getLatestFitnessData(list, c16121);
                if (latestFitnessData3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cloudSyncBaseRequest = this;
                latestFitnessData = (LatestFitnessData) latestFitnessData3;
                cloudSyncBaseRequest.saveFitnessDataToDB(latestFitnessData.getDataList());
                it = list.iterator();
                latestFitnessData2 = latestFitnessData;
            }
        } else if (i2 == 1) {
            list = (List) c16121.L$1;
            cloudSyncBaseRequest = (CloudSyncBaseRequest) c16121.L$0;
            ResultKt.throwOnFailure(latestFitnessData3);
            latestFitnessData = (LatestFitnessData) latestFitnessData3;
            cloudSyncBaseRequest.saveFitnessDataToDB(latestFitnessData.getDataList());
            it = list.iterator();
            latestFitnessData2 = latestFitnessData;
        } else if (i2 == 2) {
            list = (List) c16121.L$1;
            cloudSyncBaseRequest = (CloudSyncBaseRequest) c16121.L$0;
            ResultKt.throwOnFailure(latestFitnessData3);
            latestFitnessData = (LatestFitnessData) latestFitnessData3;
            cloudSyncBaseRequest.saveFitnessDataToDB(latestFitnessData.getDataList());
            it = list.iterator();
            latestFitnessData2 = latestFitnessData;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c16121.L$1;
            latestFitnessData2 = (LatestFitnessData) c16121.L$0;
            ResultKt.throwOnFailure(latestFitnessData3);
        }
        while (it.hasNext()) {
            LatestFitnessDataModel latestFitnessDataModel = (LatestFitnessDataModel) it.next();
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            String key = latestFitnessDataModel.getKey();
            c16121.L$0 = latestFitnessData2;
            c16121.L$1 = it;
            c16121.label = 3;
            if (serverRequestDaoUtils.insertLatestPullRequest(key, c16121) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(!latestFitnessData2.getDataList().isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pullAndSaveLatestSportReport(@Nullable Long l, @NotNull Continuation<? super Boolean> continuation) {
        C16131 c16131;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        if (continuation instanceof C16131) {
            c16131 = (C16131) continuation;
            int i = c16131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16131.label = i - Integer.MIN_VALUE;
            } else {
                c16131 = new C16131(continuation);
            }
        } else {
            c16131 = new C16131(continuation);
        }
        Object latestSportReport = c16131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestSportReport);
            FitnessDataRequest mFitnessRequest = getMFitnessRequest();
            c16131.L$0 = this;
            c16131.label = 1;
            latestSportReport = mFitnessRequest.getLatestSportReport(l, c16131);
            if (latestSportReport == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudSyncBaseRequest = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cloudSyncBaseRequest = (CloudSyncBaseRequest) c16131.L$0;
            ResultKt.throwOnFailure(latestSportReport);
        }
        LatestSportReport latestSportReport2 = (LatestSportReport) latestSportReport;
        if (latestSportReport2.getSportReport() == null) {
            return Boxing.boxBoolean(false);
        }
        List<SportReportModel> listSingletonList = Collections.singletonList(latestSportReport2.getSportReport());
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        cloudSyncBaseRequest.saveSportReportToDB(listSingletonList);
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object pullAndSaveSportReportByTime(@NotNull String str, long j, long j2, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation) {
        C16141 c16141;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        String str3;
        long j3;
        long j4;
        String str4;
        CloudSyncBaseRequest cloudSyncBaseRequest2;
        SportReportResultByTime sportReportResultByTime;
        long j5;
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (continuation instanceof C16141) {
            c16141 = (C16141) continuation;
            int i3 = c16141.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c16141.label = i3 - Integer.MIN_VALUE;
            } else {
                c16141 = new C16141(continuation);
            }
        } else {
            c16141 = new C16141(continuation);
        }
        Object sportReportsByTime = c16141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c16141.label;
        boolean z3 = true;
        if (i4 != 0) {
            if (i4 == 1) {
                long j6 = c16141.J$1;
                j4 = c16141.J$0;
                String str5 = (String) c16141.L$1;
                CloudSyncBaseRequest cloudSyncBaseRequest3 = (CloudSyncBaseRequest) c16141.L$0;
                ResultKt.throwOnFailure(sportReportsByTime);
                str3 = str5;
                cloudSyncBaseRequest = cloudSyncBaseRequest3;
                j3 = j6;
            } else {
                if (i4 == 2) {
                    long j7 = c16141.J$1;
                    j4 = c16141.J$0;
                    sportReportResultByTime = (SportReportResultByTime) c16141.L$2;
                    str4 = (String) c16141.L$1;
                    cloudSyncBaseRequest2 = (CloudSyncBaseRequest) c16141.L$0;
                    ResultKt.throwOnFailure(sportReportsByTime);
                    j5 = j7;
                    i = !sportReportResultByTime.getSportList().isEmpty();
                    z = i;
                    if (sportReportResultByTime.getHasMore() && !TextUtils.isEmpty(sportReportResultByTime.getNextKey())) {
                        String nextKey = sportReportResultByTime.getNextKey();
                        c16141.L$0 = r11;
                        c16141.L$1 = r11;
                        c16141.L$2 = 0;
                        c16141.I$0 = i;
                        c16141.label = 3;
                        sportReportsByTime = cloudSyncBaseRequest2.pullAndSaveSportReportByTime(str4, j4, j5, nextKey, c16141);
                        if (sportReportsByTime == coroutine_suspended) {
                            z = i;
                            i2 = i;
                            return coroutine_suspended;
                        }
                    }
                    z = i;
                    return Boxing.boxBoolean(z);
                }
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = c16141.I$0;
                ResultKt.throwOnFailure(sportReportsByTime);
                z3 = true;
                i2 = i5;
            }
            z = i;
            i2 = i;
            boolean zBooleanValue = ((Boolean) sportReportsByTime).booleanValue();
            if (i2 == 0 || zBooleanValue) {
                z2 = z3;
            } else {
                z2 = false;
            }
            z = z2;
            z = i;
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(sportReportsByTime);
        GetSportReportByTime getSportReportByTime = new GetSportReportByTime(j <= 0 ? null : Boxing.boxLong(j), j2 <= 0 ? null : Boxing.boxLong(j2), str2);
        FitnessDataRequest mFitnessRequest = getMFitnessRequest();
        c16141.L$0 = this;
        c16141.L$1 = str;
        c16141.J$0 = j;
        c16141.J$1 = j2;
        c16141.label = 1;
        sportReportsByTime = mFitnessRequest.getSportReportsByTime(getSportReportByTime, c16141);
        if (sportReportsByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudSyncBaseRequest = this;
        str3 = str;
        j3 = j2;
        j4 = j;
        SportReportResultByTime sportReportResultByTime2 = (SportReportResultByTime) sportReportsByTime;
        cloudSyncBaseRequest.saveSportReportToDB(sportReportResultByTime2.getSportList());
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        String nextKey2 = sportReportResultByTime2.getNextKey();
        c16141.L$0 = cloudSyncBaseRequest;
        c16141.L$1 = str3;
        c16141.L$2 = sportReportResultByTime2;
        c16141.J$0 = j4;
        c16141.J$1 = j3;
        c16141.label = 2;
        long j8 = j3;
        if (serverRequestDaoUtils.insertSportTimePullRequest(str3, j4, j8, nextKey2, c16141) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str4 = str3;
        cloudSyncBaseRequest2 = cloudSyncBaseRequest;
        sportReportResultByTime = sportReportResultByTime2;
        j5 = j8;
        i = !sportReportResultByTime.getSportList().isEmpty();
        z = i;
        if (sportReportResultByTime.getHasMore()) {
            String nextKey3 = sportReportResultByTime.getNextKey();
            c16141.L$0 = r11;
            c16141.L$1 = r11;
            c16141.L$2 = 0;
            c16141.I$0 = i;
            c16141.label = 3;
            sportReportsByTime = cloudSyncBaseRequest2.pullAndSaveSportReportByTime(str4, j4, j5, nextKey3, c16141);
            if (sportReportsByTime == coroutine_suspended) {
                z = i;
                i2 = i;
                return coroutine_suspended;
            }
            z = i;
            i2 = i;
            boolean zBooleanValue2 = ((Boolean) sportReportsByTime).booleanValue();
            if (i2 == 0) {
                z2 = z3;
            } else {
                z2 = z3;
            }
            z = z2;
        }
        z = i;
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pullAndSaveSportReportByWM(long j, @NotNull Continuation<? super Boolean> continuation) {
        C16151 c16151;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        SportReportResultByWM sportReportResultByWM;
        boolean z;
        Object objPullAndSaveSportReportByWM;
        int i;
        if (continuation instanceof C16151) {
            c16151 = (C16151) continuation;
            int i2 = c16151.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16151.label = i2 - Integer.MIN_VALUE;
            } else {
                c16151 = new C16151(continuation);
            }
        } else {
            c16151 = new C16151(continuation);
        }
        Object sportReportsByWM = c16151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16151.label;
        boolean z2 = true;
        if (i3 != 0) {
            if (i3 == 1) {
                CloudSyncBaseRequest cloudSyncBaseRequest2 = (CloudSyncBaseRequest) c16151.L$0;
                ResultKt.throwOnFailure(sportReportsByWM);
                cloudSyncBaseRequest = cloudSyncBaseRequest2;
            } else {
                if (i3 == 2) {
                    sportReportResultByWM = (SportReportResultByWM) c16151.L$1;
                    cloudSyncBaseRequest = (CloudSyncBaseRequest) c16151.L$0;
                    ResultKt.throwOnFailure(sportReportsByWM);
                    z = !sportReportResultByWM.getSportList().isEmpty();
                    if (sportReportResultByWM.getHasMore()) {
                        long waterMark = sportReportResultByWM.getWaterMark();
                        c16151.L$0 = null;
                        c16151.L$1 = null;
                        c16151.I$0 = z ? 1 : 0;
                        c16151.label = 3;
                        objPullAndSaveSportReportByWM = cloudSyncBaseRequest.pullAndSaveSportReportByWM(waterMark, c16151);
                        if (objPullAndSaveSportReportByWM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sportReportsByWM = objPullAndSaveSportReportByWM;
                        i = z ? 1 : 0;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c16151.I$0;
                ResultKt.throwOnFailure(sportReportsByWM);
            }
            boolean zBooleanValue = ((Boolean) sportReportsByWM).booleanValue();
            if (i == 0 && !zBooleanValue) {
                z2 = false;
            }
            z = z2;
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(sportReportsByWM);
        FitnessDataRequest mFitnessRequest = getMFitnessRequest();
        c16151.L$0 = this;
        c16151.label = 1;
        sportReportsByWM = mFitnessRequest.getSportReportsByWM(j, c16151);
        if (sportReportsByWM == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudSyncBaseRequest = this;
        sportReportResultByWM = (SportReportResultByWM) sportReportsByWM;
        cloudSyncBaseRequest.saveSportReportToDB(sportReportResultByWM.getSportList());
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        long waterMark2 = sportReportResultByWM.getWaterMark();
        c16151.L$0 = cloudSyncBaseRequest;
        c16151.L$1 = sportReportResultByWM;
        c16151.label = 2;
        if (serverRequestDaoUtils.updateSportMaxWatermark(waterMark2, c16151) == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = !sportReportResultByWM.getSportList().isEmpty();
        if (sportReportResultByWM.getHasMore()) {
            long waterMark3 = sportReportResultByWM.getWaterMark();
            c16151.L$0 = null;
            c16151.L$1 = null;
            c16151.I$0 = z ? 1 : 0;
            c16151.label = 3;
            objPullAndSaveSportReportByWM = cloudSyncBaseRequest.pullAndSaveSportReportByWM(waterMark3, c16151);
            if (objPullAndSaveSportReportByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportReportsByWM = objPullAndSaveSportReportByWM;
            i = z ? 1 : 0;
            boolean zBooleanValue2 = ((Boolean) sportReportsByWM).booleanValue();
            if (i == 0) {
                z2 = false;
            }
            z = z2;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x0142  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    @Nullable
    public final Object pullProjectDataByTime(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable String str3, @NotNull Continuation<? super Boolean> continuation) {
        C16161 c16161;
        String str4;
        String str5;
        CloudSyncBaseRequest cloudSyncBaseRequest;
        String str6;
        GetProjectByTimeResponse getProjectByTimeResponse;
        long j3;
        long j4;
        String str7;
        String str8;
        CloudSyncBaseRequest cloudSyncBaseRequest2;
        ServerRequestDaoUtils serverRequestDaoUtils;
        String nextKey;
        String str9;
        List<ProjectDataModel> dataList;
        boolean z;
        Object objPullProjectDataByTime;
        boolean z2;
        ?? r5;
        long j5 = j;
        long j6 = j2;
        if (continuation instanceof C16161) {
            c16161 = (C16161) continuation;
            int i = c16161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16161.label = i - Integer.MIN_VALUE;
            } else {
                c16161 = new C16161(continuation);
            }
        } else {
            c16161 = new C16161(continuation);
        }
        C16161 c16162 = c16161;
        Object projectDataByTime = c16162.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16162.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j7 = c16162.J$1;
                long j8 = c16162.J$0;
                str5 = (String) c16162.L$2;
                str4 = (String) c16162.L$1;
                cloudSyncBaseRequest = (CloudSyncBaseRequest) c16162.L$0;
                ResultKt.throwOnFailure(projectDataByTime);
                j5 = j8;
                j6 = j7;
            } else {
                if (i2 == 2) {
                    j3 = c16162.J$1;
                    j4 = c16162.J$0;
                    getProjectByTimeResponse = (GetProjectByTimeResponse) c16162.L$3;
                    str6 = (String) c16162.L$2;
                    str4 = (String) c16162.L$1;
                    cloudSyncBaseRequest = (CloudSyncBaseRequest) c16162.L$0;
                    ResultKt.throwOnFailure(projectDataByTime);
                    if (str4 != null) {
                        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                        nextKey = getProjectByTimeResponse.getNextKey();
                        c16162.L$0 = cloudSyncBaseRequest;
                        c16162.L$1 = str4;
                        c16162.L$2 = str6;
                        c16162.L$3 = getProjectByTimeResponse;
                        c16162.J$0 = j4;
                        c16162.J$1 = j3;
                        c16162.label = 3;
                        if (serverRequestDaoUtils.insertProjectTimePullRequest(str4, j4, j3, nextKey, c16162) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str7 = str6;
                        str9 = str4;
                        cloudSyncBaseRequest2 = cloudSyncBaseRequest;
                        str8 = str9;
                    } else {
                        str7 = str6;
                        str8 = str4;
                        cloudSyncBaseRequest2 = cloudSyncBaseRequest;
                    }
                    dataList = getProjectByTimeResponse.getDataList();
                    if (dataList == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    z2 = z;
                    if (getProjectByTimeResponse.getHasMore()) {
                        String nextKey2 = getProjectByTimeResponse.getNextKey();
                        c16162.L$0 = null;
                        c16162.L$1 = null;
                        c16162.L$2 = null;
                        c16162.L$3 = null;
                        c16162.I$0 = z ? 1 : 0;
                        c16162.label = 4;
                        objPullProjectDataByTime = cloudSyncBaseRequest2.pullProjectDataByTime(str8, str7, j4, j3, nextKey2, c16162);
                        if (objPullProjectDataByTime == coroutine_suspended) {
                            z2 = z;
                            r5 = z;
                            return coroutine_suspended;
                        }
                    }
                    z2 = z;
                    return Boxing.boxBoolean(z2);
                }
                if (i2 == 3) {
                    j3 = c16162.J$1;
                    j4 = c16162.J$0;
                    getProjectByTimeResponse = (GetProjectByTimeResponse) c16162.L$3;
                    str7 = (String) c16162.L$2;
                    str9 = (String) c16162.L$1;
                    cloudSyncBaseRequest2 = (CloudSyncBaseRequest) c16162.L$0;
                    ResultKt.throwOnFailure(projectDataByTime);
                    str8 = str9;
                    dataList = getProjectByTimeResponse.getDataList();
                    if (dataList == null && (!dataList.isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z;
                    if (getProjectByTimeResponse.getHasMore() && !TextUtils.isEmpty(getProjectByTimeResponse.getNextKey())) {
                        String nextKey3 = getProjectByTimeResponse.getNextKey();
                        c16162.L$0 = null;
                        c16162.L$1 = null;
                        c16162.L$2 = null;
                        c16162.L$3 = null;
                        c16162.I$0 = z ? 1 : 0;
                        c16162.label = 4;
                        objPullProjectDataByTime = cloudSyncBaseRequest2.pullProjectDataByTime(str8, str7, j4, j3, nextKey3, c16162);
                        if (objPullProjectDataByTime == coroutine_suspended) {
                            z2 = z;
                            r5 = z;
                            return coroutine_suspended;
                        }
                    }
                    z2 = z;
                    return Boxing.boxBoolean(z2);
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = c16162.I$0;
                ResultKt.throwOnFailure(projectDataByTime);
                objPullProjectDataByTime = projectDataByTime;
                r5 = i3;
            }
            z2 = z;
            r5 = z;
            z2 = r5 == 0 || ((Boolean) objPullProjectDataByTime).booleanValue();
            z2 = z;
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(projectDataByTime);
        GetProjectByTimeParams getProjectByTimeParams = new GetProjectByTimeParams(str2, str3, j5 <= 0 ? null : Boxing.boxLong(j), j6 <= 0 ? null : Boxing.boxLong(j2), 0, true, 16, null);
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c16162.L$0 = this;
        str4 = str;
        c16162.L$1 = str4;
        c16162.L$2 = str2;
        c16162.J$0 = j5;
        c16162.J$1 = j6;
        c16162.label = 1;
        projectDataByTime = companion.getProjectDataByTime(getProjectByTimeParams, c16162);
        if (projectDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        str5 = str2;
        cloudSyncBaseRequest = this;
        GetProjectByTimeResponse getProjectByTimeResponse2 = (GetProjectByTimeResponse) projectDataByTime;
        List<ProjectDataModel> dataList2 = getProjectByTimeResponse2.getDataList();
        c16162.L$0 = cloudSyncBaseRequest;
        c16162.L$1 = str4;
        c16162.L$2 = str5;
        c16162.L$3 = getProjectByTimeResponse2;
        c16162.J$0 = j5;
        c16162.J$1 = j6;
        c16162.label = 2;
        if (cloudSyncBaseRequest.saveProjectDataToDB(dataList2, c16162) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str6 = str5;
        getProjectByTimeResponse = getProjectByTimeResponse2;
        long j9 = j5;
        j3 = j6;
        j4 = j9;
        if (str4 != null) {
            serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            nextKey = getProjectByTimeResponse.getNextKey();
            c16162.L$0 = cloudSyncBaseRequest;
            c16162.L$1 = str4;
            c16162.L$2 = str6;
            c16162.L$3 = getProjectByTimeResponse;
            c16162.J$0 = j4;
            c16162.J$1 = j3;
            c16162.label = 3;
            if (serverRequestDaoUtils.insertProjectTimePullRequest(str4, j4, j3, nextKey, c16162) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str7 = str6;
            str9 = str4;
            cloudSyncBaseRequest2 = cloudSyncBaseRequest;
            str8 = str9;
        } else {
            str7 = str6;
            str8 = str4;
            cloudSyncBaseRequest2 = cloudSyncBaseRequest;
        }
        dataList = getProjectByTimeResponse.getDataList();
        if (dataList == null) {
            z = false;
        } else {
            z = false;
        }
        z2 = z;
        if (getProjectByTimeResponse.getHasMore()) {
            String nextKey4 = getProjectByTimeResponse.getNextKey();
            c16162.L$0 = null;
            c16162.L$1 = null;
            c16162.L$2 = null;
            c16162.L$3 = null;
            c16162.I$0 = z ? 1 : 0;
            c16162.label = 4;
            objPullProjectDataByTime = cloudSyncBaseRequest2.pullProjectDataByTime(str8, str7, j4, j3, nextKey4, c16162);
            if (objPullProjectDataByTime == coroutine_suspended) {
                z2 = z;
                r5 = z;
                return coroutine_suspended;
            }
            z2 = z;
            r5 = z;
            z2 = r5 == 0 || ((Boolean) objPullProjectDataByTime).booleanValue();
        }
        z2 = z;
        return Boxing.boxBoolean(z2);
    }
}
