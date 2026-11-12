package com.xiaomi.fitness.aggregation.health.dao;

import android.text.TextUtils;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.ProjectPersistKey;
import com.xiaomi.fit.fitness.persist.server.data.SleepDiaryInfo;
import com.xiaomi.fit.fitness.persist.server.data.SleepRhythm;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntity;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntityKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0002\u0010\u0011J.\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u0086@¢\u0006\u0002\u0010\u0011J.\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100!2\u0006\u0010\"\u001a\u00020\u0005J\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000bJ6\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010'JL\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u00182\b\b\u0002\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005H\u0002J.\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fJ\u000e\u00101\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0005J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u0086@¢\u0006\u0002\u00103J$\u00104\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0086@¢\u0006\u0002\u00106J\u001c\u00107\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH\u0086@¢\u0006\u0002\u0010\u0011JD\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u00109J<\u0010:\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u00182\b\b\u0002\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDaoProxy;", "", "<init>", "()V", "TAG", "", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDao;", "PROJECT_ID", "", "insertProjectDataFromServer", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRhyThmDataFromLocal", "sid", "time", "dataInfo", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepRhythm;", CloudContract.COL_ZONE_OFFSET, "", "(Ljava/lang/String;JLcom/xiaomi/fit/fitness/persist/server/data/SleepRhythm;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAllProjectData", "entityList", "Lcom/xiaomi/fitness/aggregation/health/entity/ProjectEntity;", "insertDiaryDataFromLocal", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepDiaryInfo;", "(Ljava/lang/String;JLcom/xiaomi/fit/fitness/persist/server/data/SleepDiaryInfo;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestData", "Lkotlinx/coroutines/flow/Flow;", "key", "getLatestDataBefore", "getProjectReportListSync", "startTime", "endTime", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSQLiteQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "persistKey", "limit", "reverse", "", "extraQueryStr", "getDataProjectList", "getNotUpLoadProjectList", "getDataValidByAllData", "getDeletedDataList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markDelete", "timeList", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hardDelete", "getLimitDataList", "(Ljava/lang/String;JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectDataSQLiteQuery", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProjectEntityDaoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDaoProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,256:1\n1863#2,2:257\n1557#2:289\n1628#2,3:290\n1557#2:293\n1628#2,3:294\n1863#2,2:301\n37#3:259\n36#3,3:260\n37#3:263\n36#3,3:264\n37#3:267\n36#3,3:268\n37#3:271\n36#3,3:272\n37#3:275\n36#3,3:276\n37#3:297\n36#3,3:298\n53#4:279\n55#4:283\n53#4:284\n55#4:288\n50#5:280\n55#5:282\n50#5:285\n55#5:287\n107#6:281\n107#6:286\n*S KotlinDebug\n*F\n+ 1 ProjectEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDaoProxy\n*L\n29#1:257,2\n142#1:289\n142#1:290,3\n189#1:293\n189#1:294,3\n222#1:301,2\n51#1:259\n51#1:260,3\n55#1:263\n55#1:264,3\n82#1:267\n82#1:268,3\n87#1:271\n87#1:272,3\n112#1:275\n112#1:276,3\n212#1:297\n212#1:298,3\n117#1:279\n117#1:283\n124#1:284\n124#1:288\n117#1:280\n117#1:282\n124#1:285\n124#1:287\n117#1:281\n124#1:286\n*E\n"})
public final class ProjectEntityDaoProxy {

    @NotNull
    public static final ProjectEntityDaoProxy INSTANCE = new ProjectEntityDaoProxy();
    private static final long PROJECT_ID;

    @NotNull
    private static final String TAG = "ProjectEntityDaoProxy";

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLimitDataList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy", f = "ProjectEntityDaoProxy.kt", i = {}, l = {219}, m = "getLimitDataList", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return ProjectEntityDaoProxy.this.getLimitDataList(null, 0L, 0L, 0, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getProjectReportListSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy", f = "ProjectEntityDaoProxy.kt", i = {0, 0, 0}, l = {136}, m = "getProjectReportListSync", n = {"key", "startTime", "endTime"}, s = {"L$0", "J$0", "J$1"})
    public static final class C18141 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18141(Continuation<? super C18141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProjectEntityDaoProxy.this.getProjectReportListSync(null, 0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$insertProjectDataFromServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy", f = "ProjectEntityDaoProxy.kt", i = {0, 0}, l = {51, 55}, m = "insertProjectDataFromServer", n = {"this", "deleteList"}, s = {"L$0", "L$1"})
    public static final class C18151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18151(Continuation<? super C18151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProjectEntityDaoProxy.this.insertProjectDataFromServer(null, this);
        }
    }

    static {
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging();
        PROJECT_ID = 1000L;
    }

    private ProjectEntityDaoProxy() {
    }

    private final ProjectEntityDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().sleepProjectEntityDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleSQLiteQuery getProjectDataSQLiteQuery(String key, long startTime, long endTime, int zoneOffset, int limit, boolean reverse) {
        long j = zoneOffset;
        long j2 = startTime + j;
        long j3 = endTime + j;
        StringBuilder sb = new StringBuilder("SELECT * FROM data_project WHERE ");
        if (j2 > 0 && startTime > 0) {
            sb.append("timeInZero >= " + j2 + " AND ");
        }
        if (j3 > 0 && endTime > 0) {
            sb.append("timeInZero < " + j3 + " AND ");
        }
        sb.append("key = '" + key + "' ");
        sb.append("AND isDeleted = 0 ");
        sb.append("ORDER BY timeInZero " + (reverse ? "DESC" : "ASC") + " ");
        if (limit > 0) {
            sb.append("LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new SimpleSQLiteQuery(string);
    }

    private final SimpleSQLiteQuery getSQLiteQuery(String persistKey, String sid, long startTime, long endTime, int limit, boolean reverse, String extraQueryStr) {
        StringBuilder sb = new StringBuilder("SELECT * FROM data_project WHERE");
        if (startTime > 0 && startTime > 0) {
            sb.append(" timeInZero >= " + startTime + " AND");
        }
        if (endTime > 0 && endTime > 0) {
            sb.append(" timeInZero < " + endTime + " AND");
        }
        sb.append(" isDeleted = 0");
        if (!TextUtils.isEmpty(persistKey)) {
            sb.append(" AND key = '" + persistKey + "'");
        }
        if (!TextUtils.isEmpty(sid)) {
            sb.append(" AND sid = '" + sid + "'");
        }
        if (!TextUtils.isEmpty(extraQueryStr)) {
            sb.append(" AND " + extraQueryStr);
        }
        sb.append(" ORDER BY timeInZero " + (reverse ? "DESC" : "ASC"));
        if (limit > 0) {
            sb.append(" LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new SimpleSQLiteQuery(string);
    }

    public static /* synthetic */ SimpleSQLiteQuery getSQLiteQuery$default(ProjectEntityDaoProxy projectEntityDaoProxy, String str, String str2, long j, long j2, int i, boolean z, String str3, int i2, Object obj) {
        return projectEntityDaoProxy.getSQLiteQuery(str, str2, j, j2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? null : str3);
    }

    @NotNull
    public final List<ProjectDataModel> getDataProjectList(@NotNull String key, long startTime, long endTime, @Nullable String sid) {
        Intrinsics.checkNotNullParameter(key, "key");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(startTime, endTime);
        List<ProjectEntity> listRawQueryProjectListSync = getDao().rawQueryProjectListSync(getSQLiteQuery$default(this, key, sid, pairNormalizeTime.getFirst().longValue(), pairNormalizeTime.getSecond().longValue(), 0, false, null, 112, null));
        FitnessLogUtils.i(TAG, "getDataProjectList result " + key + ";pair:" + pairNormalizeTime + ";result " + listRawQueryProjectListSync);
        List<ProjectEntity> list = listRawQueryProjectListSync;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProjectEntityKt.toProjectDataModel((ProjectEntity) it.next()));
        }
        return arrayList;
    }

    public final boolean getDataValidByAllData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getDao().queryDataValid(key) != null;
    }

    @Nullable
    public final Object getDeletedDataList(@NotNull Continuation<? super List<ProjectEntity>> continuation) {
        return getDao().queryDeletedDataList(30, continuation);
    }

    @NotNull
    public final Flow<ProjectDataModel> getLatestData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Flow<ProjectEntity> flowQueryLatestData = getDao().queryLatestData(key);
        return new Flow<ProjectDataModel>() { // from class: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ProjectEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDaoProxy\n*L\n1#1,222:1\n54#2:223\n118#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestData$$inlined$map$1$2", f = "ProjectEntityDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                        ProjectEntity projectEntity = (ProjectEntity) obj;
                        ProjectDataModel projectDataModel = projectEntity != null ? ProjectEntityKt.toProjectDataModel(projectEntity) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(projectDataModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super ProjectDataModel> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryLatestData.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final Flow<ProjectDataModel> getLatestDataBefore(@NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        final Flow<ProjectEntity> flowQueryLatestDataBefore = getDao().queryLatestDataBefore(key, TimeZoneUtil.INSTANCE.normalizeTime(time, time).getFirst().longValue());
        return new Flow<ProjectDataModel>() { // from class: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestDataBefore$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestDataBefore$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ProjectEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/ProjectEntityDaoProxy\n*L\n1#1,222:1\n54#2:223\n125#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestDataBefore$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy$getLatestDataBefore$$inlined$map$1$2", f = "ProjectEntityDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                        ProjectEntity projectEntity = (ProjectEntity) obj;
                        ProjectDataModel projectDataModel = projectEntity != null ? ProjectEntityKt.toProjectDataModel(projectEntity) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(projectDataModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super ProjectDataModel> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryLatestDataBefore.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLimitDataList(@NotNull String str, long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<ProjectDataModel>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objRawQueryProjectList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objRawQueryProjectList);
            SimpleSQLiteQuery projectDataSQLiteQuery = getProjectDataSQLiteQuery(str, j, j2, i, i2, z);
            ProjectEntityDao dao = getDao();
            anonymousClass1.label = 1;
            objRawQueryProjectList = dao.rawQueryProjectList(projectDataSQLiteQuery, anonymousClass1);
            if (objRawQueryProjectList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRawQueryProjectList);
        }
        List list = (List) objRawQueryProjectList;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProjectEntityKt.toProjectDataModel((ProjectEntity) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public final List<ProjectEntity> getNotUpLoadProjectList() {
        return getDao().queryNotUpProjectReportEntityList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object getProjectReportListSync(@NotNull String str, long j, long j2, @Nullable String str2, @NotNull Continuation<? super List<ProjectDataModel>> continuation) {
        C18141 c18141;
        String str3;
        long j3 = j;
        long j4 = j2;
        if (continuation instanceof C18141) {
            c18141 = (C18141) continuation;
            int i = c18141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18141.label = i - Integer.MIN_VALUE;
            } else {
                c18141 = new C18141(continuation);
            }
        } else {
            c18141 = new C18141(continuation);
        }
        Object obj = c18141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(j3, j4);
            SimpleSQLiteQuery sQLiteQuery$default = getSQLiteQuery$default(this, str, str2, pairNormalizeTime.getFirst().longValue(), pairNormalizeTime.getSecond().longValue(), 0, false, null, 112, null);
            ProjectEntityDao dao = getDao();
            str3 = str;
            c18141.L$0 = str3;
            c18141.J$0 = j3;
            c18141.J$1 = j4;
            c18141.label = 1;
            Object objRawQueryProjectList = dao.rawQueryProjectList(sQLiteQuery$default, c18141);
            if (objRawQueryProjectList == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objRawQueryProjectList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = c18141.J$1;
            long j6 = c18141.J$0;
            String str4 = (String) c18141.L$0;
            ResultKt.throwOnFailure(obj);
            str3 = str4;
            j3 = j6;
            j4 = j5;
        }
        List list = (List) obj;
        FitnessLogUtils.i(TAG, "getProjectReportListSync key = " + str3 + ", begin = " + j3 + ", end = " + j4 + " , size = " + list.size());
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ProjectEntityKt.toProjectDataModel((ProjectEntity) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public final Object hardDelete(@NotNull List<ProjectEntity> list, @NotNull Continuation<? super Unit> continuation) {
        ProjectEntityDao dao = getDao();
        ProjectEntity[] projectEntityArr = (ProjectEntity[]) list.toArray(new ProjectEntity[0]);
        Object objDelete = dao.delete((ProjectEntity[]) Arrays.copyOf(projectEntityArr, projectEntityArr.length), continuation);
        return objDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @Nullable
    public final Object insertDiaryDataFromLocal(@NotNull String str, long j, @NotNull SleepDiaryInfo sleepDiaryInfo, int i, @NotNull Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList();
        long jChangeTo0TimeIn0TzOneDay = FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(j, i);
        ProjectEntity projectEntity = new ProjectEntity(str, ProjectPersistKey.KEY_SLEEP_DIARY, PROJECT_ID, jChangeTo0TimeIn0TzOneDay, 0, jChangeTo0TimeIn0TzOneDay, FitnessPersistUtils.INSTANCE.toJson(sleepDiaryInfo));
        projectEntity.setDeleted(false);
        projectEntity.setUpload(false);
        arrayList.add(projectEntity);
        if (!(!arrayList.isEmpty())) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(TAG, "insertDiaryDataFromLocal, insert size(" + arrayList.size() + ")");
        ProjectEntityDao dao = getDao();
        ProjectEntity[] projectEntityArr = (ProjectEntity[]) arrayList.toArray(new ProjectEntity[0]);
        Object objInsert = dao.insert((ProjectEntity[]) Arrays.copyOf(projectEntityArr, projectEntityArr.length), continuation);
        return objInsert == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object insertProjectDataFromServer(@NotNull List<ProjectDataModel> list, @NotNull Continuation<? super Unit> continuation) {
        C18151 c18151;
        List arrayList;
        ProjectEntityDaoProxy projectEntityDaoProxy;
        if (continuation instanceof C18151) {
            c18151 = (C18151) continuation;
            int i = c18151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18151.label = i - Integer.MIN_VALUE;
            } else {
                c18151 = new C18151(continuation);
            }
        } else {
            c18151 = new C18151(continuation);
        }
        Object obj = c18151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18151.label;
        if (i2 != 0) {
            if (i2 == 1) {
                arrayList = (List) c18151.L$1;
                projectEntityDaoProxy = (ProjectEntityDaoProxy) c18151.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        for (ProjectDataModel projectDataModel : list) {
            long jChangeTo0TimeIn0TzOneDay = FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(projectDataModel.getTime(), projectDataModel.getZoneOffset());
            String sid = projectDataModel.getSid();
            String key = projectDataModel.getKey();
            long j = PROJECT_ID;
            long time = projectDataModel.getTime();
            int zoneOffset = projectDataModel.getZoneOffset();
            String value = projectDataModel.getValue();
            if (value == null) {
                value = "";
            }
            ProjectEntity projectEntity = new ProjectEntity(sid, key, j, time, zoneOffset, jChangeTo0TimeIn0TzOneDay, value);
            if (projectDataModel.isDeleted()) {
                arrayList.add(projectEntity);
            } else {
                projectEntity.setUpload(true);
                projectEntity.setDeleted(false);
                arrayList2.add(projectEntity);
            }
        }
        if (!arrayList2.isEmpty()) {
            FitnessLogUtils.i(TAG, "insertProjectDataFromServer, insert size(" + arrayList2.size() + ")");
            ProjectEntityDao dao = getDao();
            ProjectEntity[] projectEntityArr = (ProjectEntity[]) arrayList2.toArray(new ProjectEntity[0]);
            ProjectEntity[] projectEntityArr2 = (ProjectEntity[]) Arrays.copyOf(projectEntityArr, projectEntityArr.length);
            c18151.L$0 = this;
            c18151.L$1 = arrayList;
            c18151.label = 1;
            if (dao.insert(projectEntityArr2, c18151) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        projectEntityDaoProxy = this;
        if (!(!arrayList.isEmpty())) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(TAG, "insertProjectDataFromServer, delete size(" + arrayList.size() + ")");
        ProjectEntityDao dao2 = projectEntityDaoProxy.getDao();
        ProjectEntity[] projectEntityArr3 = (ProjectEntity[]) arrayList.toArray(new ProjectEntity[0]);
        ProjectEntity[] projectEntityArr4 = (ProjectEntity[]) Arrays.copyOf(projectEntityArr3, projectEntityArr3.length);
        c18151.L$0 = null;
        c18151.L$1 = null;
        c18151.label = 2;
        if (dao2.delete(projectEntityArr4, c18151) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object insertRhyThmDataFromLocal(@NotNull String str, long j, @NotNull SleepRhythm sleepRhythm, int i, @NotNull Continuation<? super Unit> continuation) {
        if (sleepRhythm.getCycleDay() < 0) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        long jChangeTo0TimeIn0TzOneDay = FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(j, i);
        ProjectEntity projectEntity = new ProjectEntity(str, ProjectPersistKey.KEY_SLEEP_RHYTHM, PROJECT_ID, jChangeTo0TimeIn0TzOneDay, 0, jChangeTo0TimeIn0TzOneDay, FitnessPersistUtils.INSTANCE.toJson(sleepRhythm));
        projectEntity.setDeleted(false);
        projectEntity.setUpload(false);
        arrayList.add(projectEntity);
        if (!(!arrayList.isEmpty())) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(TAG, "insertRhyThmDataFromLocal, insert size(" + arrayList.size() + ");entity:" + projectEntity);
        ProjectEntityDao dao = getDao();
        ProjectEntity[] projectEntityArr = (ProjectEntity[]) arrayList.toArray(new ProjectEntity[0]);
        Object objInsert = dao.insert((ProjectEntity[]) Arrays.copyOf(projectEntityArr, projectEntityArr.length), continuation);
        return objInsert == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }

    @Nullable
    public final Object markDelete(@NotNull String str, @NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) {
        Object objMarkDelete = getDao().markDelete(str, list, continuation);
        return objMarkDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMarkDelete : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateAllProjectData(@NotNull List<ProjectEntity> list, @NotNull Continuation<? super Unit> continuation) {
        ProjectEntityDao dao = getDao();
        ProjectEntity[] projectEntityArr = (ProjectEntity[]) list.toArray(new ProjectEntity[0]);
        Object objInsert = dao.insert((ProjectEntity[]) Arrays.copyOf(projectEntityArr, projectEntityArr.length), continuation);
        return objInsert == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }
}
