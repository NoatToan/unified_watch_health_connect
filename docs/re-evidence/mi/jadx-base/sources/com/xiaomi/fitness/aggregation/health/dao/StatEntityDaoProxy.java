package com.xiaomi.fitness.aggregation.health.dao;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.server.data.StatDataModel;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.StatDataEntity;
import com.xiaomi.fitness.aggregation.health.entity.StatDataEntityKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0086@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0086@¢\u0006\u0002\u0010\u000fJL\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0086@¢\u0006\u0002\u0010&JD\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/StatEntityDaoProxy;", "", "<init>", "()V", "TAG", "", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/StatEntityDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/StatEntityDao;", "insertStatDataFromServer", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestData", "Lkotlinx/coroutines/flow/Flow;", "tag", "key", "getLatestDataSync", "getDeletedDataList", "Lcom/xiaomi/fitness/aggregation/health/entity/StatDataEntity;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markDelete", "timeList", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hardDelete", "entityList", "getLimitDataList", "startTime", "endTime", CloudContract.COL_ZONE_OFFSET, "", "limit", "reverse", "", "(Ljava/lang/String;Ljava/lang/String;JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatDataSQLiteQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatEntityDaoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/StatEntityDaoProxy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,110:1\n1863#2,2:111\n1863#2,2:130\n37#3:113\n36#3,3:114\n37#3:117\n36#3,3:118\n37#3:126\n36#3,3:127\n53#4:121\n55#4:125\n50#5:122\n55#5:124\n107#6:123\n*S KotlinDebug\n*F\n+ 1 StatEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/StatEntityDaoProxy\n*L\n22#1:111,2\n79#1:130,2\n40#1:113\n40#1:114,3\n44#1:117\n44#1:118,3\n68#1:126\n68#1:127,3\n49#1:121\n49#1:125\n49#1:122\n49#1:124\n49#1:123\n*E\n"})
public final class StatEntityDaoProxy {

    @NotNull
    public static final StatEntityDaoProxy INSTANCE = new StatEntityDaoProxy();

    @NotNull
    private static final String TAG = "StatEntityDaoProxy";

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$getLimitDataList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy", f = "StatEntityDaoProxy.kt", i = {}, l = {76}, m = "getLimitDataList", n = {}, s = {})
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
            return StatEntityDaoProxy.this.getLimitDataList(null, null, 0L, 0L, 0, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$insertStatDataFromServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy", f = "StatEntityDaoProxy.kt", i = {0, 0}, l = {40, 44}, m = "insertStatDataFromServer", n = {"this", "deleteList"}, s = {"L$0", "L$1"})
    public static final class C18161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18161(Continuation<? super C18161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatEntityDaoProxy.this.insertStatDataFromServer(null, this);
        }
    }

    private StatEntityDaoProxy() {
    }

    private final StatEntityDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().statEntityDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleSQLiteQuery getStatDataSQLiteQuery(String tag, String key, long startTime, long endTime, int zoneOffset, int limit, boolean reverse) {
        long j = zoneOffset;
        long j2 = startTime + j;
        long j3 = endTime + j;
        StringBuilder sb = new StringBuilder("SELECT * FROM stat_data WHERE ");
        if (j2 > 0 && startTime > 0) {
            sb.append("timeInZero >= " + j2 + " AND ");
        }
        if (j3 > 0 && endTime > 0) {
            sb.append("timeInZero < " + j3 + " AND ");
        }
        sb.append("tag = '" + tag + "' ");
        sb.append("AND key = '" + key + "' ");
        sb.append("AND isDeleted = 0 ");
        sb.append("ORDER BY timeInZero " + (reverse ? "DESC" : "ASC") + " ");
        if (limit > 0) {
            sb.append("LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new SimpleSQLiteQuery(string);
    }

    @Nullable
    public final Object getDeletedDataList(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<StatDataEntity>> continuation) {
        return getDao().queryDeletedDataList(str, str2, 50, continuation);
    }

    @NotNull
    public final Flow<StatDataModel> getLatestData(@NotNull String tag, @NotNull String key) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        final Flow<StatDataEntity> flowQueryLatestData = getDao().queryLatestData(tag, key);
        return new Flow<StatDataModel>() { // from class: com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$getLatestData$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$getLatestData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StatEntityDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/StatEntityDaoProxy\n*L\n1#1,222:1\n54#2:223\n50#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$getLatestData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.StatEntityDaoProxy$getLatestData$$inlined$map$1$2", f = "StatEntityDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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
                        StatDataEntity statDataEntity = (StatDataEntity) obj;
                        StatDataModel statDataModel = statDataEntity != null ? StatDataEntityKt.toStatDataModel(statDataEntity) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(statDataModel, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super StatDataModel> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryLatestData.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public final StatDataModel getLatestDataSync(@NotNull String tag, @NotNull String key) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        StatDataEntity statDataEntityQueryLatestDataSync = getDao().queryLatestDataSync(tag, key);
        if (statDataEntityQueryLatestDataSync != null) {
            return StatDataEntityKt.toStatDataModel(statDataEntityQueryLatestDataSync);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLimitDataList(@NotNull String str, @NotNull String str2, long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<StatDataModel>> continuation) {
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
        Object objRawQueryStatList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objRawQueryStatList);
            SimpleSQLiteQuery statDataSQLiteQuery = getStatDataSQLiteQuery(str, str2, j, j2, i, i2, z);
            StatEntityDao dao = getDao();
            anonymousClass1.label = 1;
            objRawQueryStatList = dao.rawQueryStatList(statDataSQLiteQuery, anonymousClass1);
            if (objRawQueryStatList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRawQueryStatList);
        }
        List list = (List) objRawQueryStatList;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(StatDataEntityKt.toStatDataModel((StatDataEntity) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public final Object hardDelete(@NotNull List<StatDataEntity> list, @NotNull Continuation<? super Unit> continuation) {
        StatEntityDao dao = getDao();
        StatDataEntity[] statDataEntityArr = (StatDataEntity[]) list.toArray(new StatDataEntity[0]);
        Object objDelete = dao.delete((StatDataEntity[]) Arrays.copyOf(statDataEntityArr, statDataEntityArr.length), continuation);
        return objDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object insertStatDataFromServer(@NotNull List<StatDataModel> list, @NotNull Continuation<? super Unit> continuation) {
        C18161 c18161;
        List arrayList;
        StatEntityDaoProxy statEntityDaoProxy;
        if (continuation instanceof C18161) {
            c18161 = (C18161) continuation;
            int i = c18161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18161.label = i - Integer.MIN_VALUE;
            } else {
                c18161 = new C18161(continuation);
            }
        } else {
            c18161 = new C18161(continuation);
        }
        Object obj = c18161.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c18161.label;
        if (i2 != 0) {
            if (i2 == 1) {
                arrayList = (List) c18161.L$1;
                statEntityDaoProxy = (StatEntityDaoProxy) c18161.L$0;
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
        for (StatDataModel statDataModel : list) {
            StatDataEntity statDataEntity = new StatDataEntity(statDataModel.getTag(), statDataModel.getKey(), statDataModel.getTime(), statDataModel.getZoneOffset(), FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(statDataModel.getTime(), statDataModel.getZoneOffset()), statDataModel.getValue(), statDataModel.getUpdateTime());
            if (statDataModel.isDeleted()) {
                arrayList.add(statDataEntity);
            } else {
                statDataEntity.setUpload(true);
                statDataEntity.setDeleted(false);
                arrayList2.add(statDataEntity);
            }
        }
        if (!arrayList2.isEmpty()) {
            FitnessLogUtils.i(TAG, "insertStatDataFromServer, insert size(" + arrayList2.size() + ")");
            StatEntityDao dao = getDao();
            StatDataEntity[] statDataEntityArr = (StatDataEntity[]) arrayList2.toArray(new StatDataEntity[0]);
            StatDataEntity[] statDataEntityArr2 = (StatDataEntity[]) Arrays.copyOf(statDataEntityArr, statDataEntityArr.length);
            c18161.L$0 = this;
            c18161.L$1 = arrayList;
            c18161.label = 1;
            if (dao.insert(statDataEntityArr2, c18161) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        statEntityDaoProxy = this;
        if (!(!arrayList.isEmpty())) {
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(TAG, "insertStatDataFromServer, delete size(" + arrayList.size() + ")");
        StatEntityDao dao2 = statEntityDaoProxy.getDao();
        StatDataEntity[] statDataEntityArr3 = (StatDataEntity[]) arrayList.toArray(new StatDataEntity[0]);
        StatDataEntity[] statDataEntityArr4 = (StatDataEntity[]) Arrays.copyOf(statDataEntityArr3, statDataEntityArr3.length);
        c18161.L$0 = null;
        c18161.L$1 = null;
        c18161.label = 2;
        if (dao2.delete(statDataEntityArr4, c18161) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object markDelete(@NotNull String str, @NotNull String str2, @NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) {
        Object objMarkDelete = getDao().markDelete(str, str2, list, continuation);
        return objMarkDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMarkDelete : Unit.INSTANCE;
    }
}
