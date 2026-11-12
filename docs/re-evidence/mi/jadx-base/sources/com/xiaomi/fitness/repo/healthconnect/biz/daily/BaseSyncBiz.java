package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import android.text.TextUtils;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.response.InsertRecordsResponse;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectExtKt;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectIdGenerator;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 2*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H&J\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u001c\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010$JQ\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2:\u0010*\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0,0-j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0,`+H\u0002¢\u0006\u0002\u0010.J\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0012\u00100\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u000101H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz;", "T", "Landroidx/health/connect/client/records/Record;", "", "<init>", "()V", "dbInstance", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "getDbInstance", "()Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "dbInstance$delegate", "Lkotlin/Lazy;", "healthConnectSyncDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "getHealthConnectSyncDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "healthConnectSyncDao$delegate", "getType", "", "getDataType", "", "isAggregateAble", "", "getTag", "syncBiz", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateHealthConnectRecordByTimeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/GeneratedHandleRecordsInfo;", "timeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "entities", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "generateSampleRecords", "syncUnAggregateAbleRecords", "unSyncRecords", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncAggregateAbleRecords", "updateRecordIdAndUpdate", "", "resp", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "timeRangesRecords", "Lkotlin/collections/ArrayList;", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "(Landroidx/health/connect/client/response/InsertRecordsResponse;Ljava/util/ArrayList;)V", "emptyRecordsInfo", "getRecordClzByType", "Lkotlin/reflect/KClass;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseSyncBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,268:1\n1863#2,2:269\n1872#2,3:271\n1872#2,3:274\n1872#2,2:279\n1863#2,2:281\n1874#2:283\n1872#2,2:284\n1863#2,2:286\n1874#2:288\n216#3,2:277\n*S KotlinDebug\n*F\n+ 1 BaseSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz\n*L\n83#1:269,2\n93#1:271,3\n155#1:274,3\n216#1:279,2\n218#1:281,2\n216#1:283\n245#1:284,2\n246#1:286,2\n245#1:288\n185#1:277,2\n*E\n"})
public abstract class BaseSyncBiz<T extends Record> {
    public static final int RECORD_MAX_LIFETIME = 604800;

    @NotNull
    private static final String TAG = "BaseSyncBiz";

    /* JADX INFO: renamed from: dbInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbInstance = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ee2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseSyncBiz.dbInstance_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: healthConnectSyncDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthConnectSyncDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fe2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseSyncBiz.healthConnectSyncDao_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz$syncAggregateAbleRecords$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz", f = "BaseSyncBiz.kt", i = {0, 0, 0, 0, 0}, l = {214}, m = "syncAggregateAbleRecords", n = {"this", "timeRanges", "timeRangeRecordsMap", "records", "allUpdateRecords"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseSyncBiz<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseSyncBiz<T> baseSyncBiz, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = baseSyncBiz;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.syncAggregateAbleRecords(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz$syncBiz$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz", f = "BaseSyncBiz.kt", i = {0, 1}, l = {60, 62}, m = "syncBiz", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C28081 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseSyncBiz<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28081(BaseSyncBiz<T> baseSyncBiz, Continuation<? super C28081> continuation) {
            super(continuation);
            this.this$0 = baseSyncBiz;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.syncBiz(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz$syncUnAggregateAbleRecords$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz", f = "BaseSyncBiz.kt", i = {0, 0}, l = {91}, m = "syncUnAggregateAbleRecords", n = {"this", "insertRecordsInfo"}, s = {"L$0", "L$1"})
    public static final class C28091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseSyncBiz<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28091(BaseSyncBiz<T> baseSyncBiz, Continuation<? super C28091> continuation) {
            super(continuation);
            this.this$0 = baseSyncBiz;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.syncUnAggregateAbleRecords(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDatabase dbInstance_delegate$lambda$0() {
        return FitnessDatabase.INSTANCE.getInstance();
    }

    private final FitnessDatabase getDbInstance() {
        return (FitnessDatabase) this.dbInstance.getValue();
    }

    private final HealthConnectSyncDao getHealthConnectSyncDao() {
        return (HealthConnectSyncDao) this.healthConnectSyncDao.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final KClass<? extends Record> getRecordClzByType() {
        Class cls;
        String type = getType();
        switch (type) {
            case "hr":
                cls = HeartRateRecord.class;
                return Reflection.getOrCreateKotlinClass(cls);
            case "spo2":
                cls = OxygenSaturationRecord.class;
                return Reflection.getOrCreateKotlinClass(cls);
            case "step":
                cls = StepsRecord.class;
                return Reflection.getOrCreateKotlinClass(cls);
            case "sleep":
                cls = SleepSessionRecord.class;
                return Reflection.getOrCreateKotlinClass(cls);
            case "calorie":
                cls = ActiveCaloriesBurnedRecord.class;
                return Reflection.getOrCreateKotlinClass(cls);
            default:
                if (type.equals("hr")) {
                    cls = HeartRateRecord.class;
                    return Reflection.getOrCreateKotlinClass(cls);
                }
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthConnectSyncDao healthConnectSyncDao_delegate$lambda$1() {
        return FitnessDatabase.INSTANCE.getInstance().healthConnectSyncDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, java.lang.Object] */
    public final Object syncAggregateAbleRecords(List<HealthConnectSyncDaoEntity> list, Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        LinkedList<TimeRange> linkedListCalcTimeRangeByUnSyncRecords;
        Map linkedHashMap;
        ArrayList arrayList;
        BaseSyncBiz<T> baseSyncBiz;
        ArrayList arrayList2;
        Ref.ObjectRef objectRef;
        LinkedHashMap linkedHashMap2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object objInsertRecords = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInsertRecords);
            HealthConnectTimeUtils healthConnectTimeUtils = HealthConnectTimeUtils.INSTANCE;
            linkedListCalcTimeRangeByUnSyncRecords = healthConnectTimeUtils.calcTimeRangeByUnSyncRecords(list);
            Logger.d(TAG, "syncAggregateAbleRecords-time-range:" + linkedListCalcTimeRangeByUnSyncRecords);
            if (linkedListCalcTimeRangeByUnSyncRecords.isEmpty()) {
                Logger.i(getTag(), "time range is empty!!");
                return Boxing.boxBoolean(true);
            }
            Pair<Long, Long> minAndMaxTimeStampWithInTimeRangeList = healthConnectTimeUtils.getMinAndMaxTimeStampWithInTimeRangeList(linkedListCalcTimeRangeByUnSyncRecords);
            List<HealthConnectSyncDaoEntity> syncedByTypeAndTimeRange = getHealthConnectSyncDao().getSyncedByTypeAndTimeRange(0, getType(), minAndMaxTimeStampWithInTimeRangeList.getFirst().longValue(), minAndMaxTimeStampWithInTimeRangeList.getSecond().longValue());
            Logger.d(TAG, getType() + " all size:" + syncedByTypeAndTimeRange.size() + " - " + minAndMaxTimeStampWithInTimeRangeList.getFirst() + " - " + minAndMaxTimeStampWithInTimeRangeList.getSecond());
            String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
            if (userId == null) {
                userId = "";
            }
            new ArrayList();
            linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? r11 = linkedListCalcTimeRangeByUnSyncRecords.get(intRef.element);
            Intrinsics.checkNotNullExpressionValue(r11, "get(...)");
            objectRef2.element = r11;
            Iterator it = syncedByTypeAndTimeRange.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = (HealthConnectSyncDaoEntity) next;
                if (healthConnectSyncDaoEntity.getTime() >= linkedListCalcTimeRangeByUnSyncRecords.get(intRef.element).getEndTimeStamp() && intRef.element < linkedListCalcTimeRangeByUnSyncRecords.size() - 1) {
                    int i6 = intRef.element + i3;
                    intRef.element = i6;
                    objectRef2.element = linkedListCalcTimeRangeByUnSyncRecords.get(i6);
                }
                List linkedList = (List) linkedHashMap.get(objectRef2.element);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    linkedHashMap.put(objectRef2.element, linkedList);
                }
                String strGenerateTimeRangeClientRecordId = (String) linkedHashMap3.get(objectRef2.element);
                if (TextUtils.isEmpty(strGenerateTimeRangeClientRecordId)) {
                    String str = userId;
                    objectRef = objectRef2;
                    strGenerateTimeRangeClientRecordId = HealthConnectIdGenerator.INSTANCE.generateTimeRangeClientRecordId(str, 0, getType(), ((TimeRange) objectRef2.element).getStartTimeStamp(), ((TimeRange) objectRef2.element).getEndTimeStamp());
                    linkedHashMap2 = linkedHashMap3;
                    linkedHashMap2.put(objectRef.element, strGenerateTimeRangeClientRecordId);
                } else {
                    objectRef = objectRef2;
                    linkedHashMap2 = linkedHashMap3;
                }
                healthConnectSyncDaoEntity.setClientRecordId(strGenerateTimeRangeClientRecordId);
                healthConnectSyncDaoEntity.setStartTime(Boxing.boxLong(((TimeRange) objectRef.element).getStartTimeStamp()));
                healthConnectSyncDaoEntity.setEndTime(Boxing.boxLong(((TimeRange) objectRef.element).getEndTimeStamp()));
                ListExtKt.add(linkedList, healthConnectSyncDaoEntity);
                it = it;
                intRef = intRef;
                linkedHashMap3 = linkedHashMap2;
                i4 = i5;
                i3 = 1;
                objectRef2 = objectRef;
                userId = userId;
            }
            arrayList = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                List<T> records = null;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                AggregateAbleRecordsInfo<T> aggregateAbleRecordsInfo = generateHealthConnectRecordByTimeRange((TimeRange) entry.getKey(), (List) entry.getValue()).getAggregateAbleRecordsInfo();
                if (aggregateAbleRecordsInfo != null) {
                    records = aggregateAbleRecordsInfo.getRecords();
                }
                Intrinsics.checkNotNull(records, "null cannot be cast to non-null type kotlin.collections.List<androidx.health.connect.client.records.Record>");
                arrayList.addAll(records);
            }
            if (arrayList.isEmpty()) {
                Logger.i(getTag(), "time range records is empty!!");
                return Boxing.boxBoolean(true);
            }
            try {
                ArrayList arrayList3 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = linkedListCalcTimeRangeByUnSyncRecords;
                    anonymousClass1.L$2 = linkedHashMap;
                    anonymousClass1.L$3 = arrayList;
                    anonymousClass1.L$4 = arrayList3;
                    anonymousClass1.label = 1;
                    objInsertRecords = orCreate$default.insertRecords(arrayList, anonymousClass1);
                    if (objInsertRecords == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseSyncBiz = this;
                    arrayList2 = arrayList3;
                } else {
                    baseSyncBiz = this;
                }
                return Boxing.boxBoolean(true);
            } catch (Exception e) {
                e = e;
                baseSyncBiz = this;
                Logger.e(baseSyncBiz.getTag(), "insert record exception: " + e.getMessage(), e);
                return Boxing.boxBoolean(false);
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList2 = (ArrayList) anonymousClass1.L$4;
        arrayList = (ArrayList) anonymousClass1.L$3;
        linkedHashMap = (Map) anonymousClass1.L$2;
        linkedListCalcTimeRangeByUnSyncRecords = (LinkedList) anonymousClass1.L$1;
        baseSyncBiz = (BaseSyncBiz) anonymousClass1.L$0;
        try {
            ResultKt.throwOnFailure(objInsertRecords);
        } catch (Exception e2) {
            e = e2;
            Logger.e(baseSyncBiz.getTag(), "insert record exception: " + e.getMessage(), e);
            return Boxing.boxBoolean(false);
        }
        InsertRecordsResponse insertRecordsResponse = (InsertRecordsResponse) objInsertRecords;
        Logger.i(baseSyncBiz.getTag(), "insert record size:" + arrayList.size() + " - " + insertRecordsResponse.getRecordIdsList().size());
        int i7 = 0;
        for (Object obj : insertRecordsResponse.getRecordIdsList()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            TimeRange timeRange = linkedListCalcTimeRangeByUnSyncRecords.get(i7);
            Intrinsics.checkNotNullExpressionValue(timeRange, "get(...)");
            TimeRange timeRange2 = timeRange;
            List<HealthConnectSyncDaoEntity> list2 = (List) linkedHashMap.get(timeRange2);
            if (list2 != null) {
                for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity2 : list2) {
                    HealthConnectExtKt.updateToSynced(healthConnectSyncDaoEntity2);
                    healthConnectSyncDaoEntity2.setRecordId(str2);
                }
            }
            List list3 = (List) linkedHashMap.get(timeRange2);
            if (list3 != null) {
                arrayList2.addAll(list3);
            }
            i7 = i8;
        }
        baseSyncBiz.getHealthConnectSyncDao().insertAll(arrayList2);
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncUnAggregateAbleRecords(List<HealthConnectSyncDaoEntity> list, Continuation<? super Boolean> continuation) {
        C28091 c28091;
        UnAggregateAbleRecordsInfo<T> unAggregateAbleRecordsInfo;
        BaseSyncBiz<T> baseSyncBiz;
        if (continuation instanceof C28091) {
            c28091 = (C28091) continuation;
            int i = c28091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28091.label = i - Integer.MIN_VALUE;
            } else {
                c28091 = new C28091(this, continuation);
            }
        } else {
            c28091 = new C28091(this, continuation);
        }
        Object objInsertRecords = c28091.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28091.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInsertRecords);
                for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity : list) {
                    healthConnectSyncDaoEntity.setClientRecordId(HealthConnectIdGenerator.INSTANCE.generateClientRecordId(healthConnectSyncDaoEntity));
                }
                unAggregateAbleRecordsInfo = generateSampleRecords(list).getUnAggregateAbleRecordsInfo();
                HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
                if (unAggregateAbleRecordsInfo != null && (!unAggregateAbleRecordsInfo.getRecords().isEmpty())) {
                    List<T> records = unAggregateAbleRecordsInfo.getRecords();
                    c28091.L$0 = this;
                    c28091.L$1 = unAggregateAbleRecordsInfo;
                    c28091.label = 1;
                    objInsertRecords = orCreate$default.insertRecords(records, c28091);
                    if (objInsertRecords == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseSyncBiz = this;
                }
                return Boxing.boxBoolean(true);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unAggregateAbleRecordsInfo = (UnAggregateAbleRecordsInfo) c28091.L$1;
            baseSyncBiz = (BaseSyncBiz) c28091.L$0;
            ResultKt.throwOnFailure(objInsertRecords);
            Logger.i(baseSyncBiz.getTag(), "insert record size:" + unAggregateAbleRecordsInfo.getRecords().size());
            int i3 = 0;
            for (Object obj : ((InsertRecordsResponse) objInsertRecords).getRecordIdsList()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                unAggregateAbleRecordsInfo.getEntities().get(i3).setRecordId((String) obj);
                HealthConnectExtKt.updateToSynced(unAggregateAbleRecordsInfo.getEntities().get(i3));
                i3 = i4;
            }
            baseSyncBiz.getHealthConnectSyncDao().insertAll(unAggregateAbleRecordsInfo.getEntities());
            return Boxing.boxBoolean(true);
        } catch (Exception e) {
            Logger.e(TAG, "syncUnAggregateAbleRecords exception:" + e.getMessage(), e);
            return Boxing.boxBoolean(false);
        }
    }

    private final void updateRecordIdAndUpdate(InsertRecordsResponse resp, ArrayList<Pair<TimeRange, List<HealthConnectSyncDaoEntity>>> timeRangesRecords) {
        if (resp.getRecordIdsList().size() != timeRangesRecords.size()) {
            Logger.i(TAG, "health connect return different size!!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : resp.getRecordIdsList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity : timeRangesRecords.get(i).getSecond()) {
                HealthConnectExtKt.updateToSynced(healthConnectSyncDaoEntity);
                healthConnectSyncDaoEntity.setRecordId(str);
                arrayList.add(healthConnectSyncDaoEntity);
            }
            i = i2;
        }
        getHealthConnectSyncDao().insertAll(arrayList);
    }

    @NotNull
    public final GeneratedHandleRecordsInfo<T> emptyRecordsInfo() {
        return new GeneratedHandleRecordsInfo<>(null, null, 3, null);
    }

    @NotNull
    public GeneratedHandleRecordsInfo<T> generateHealthConnectRecordByTimeRange(@NotNull TimeRange timeRange, @NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(entities, "entities");
        return new GeneratedHandleRecordsInfo<>(null, null);
    }

    @NotNull
    public GeneratedHandleRecordsInfo<T> generateSampleRecords(@NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        return new GeneratedHandleRecordsInfo<>(null, null);
    }

    public int getDataType() {
        return 0;
    }

    @NotNull
    public final String getTag() {
        return "BaseSyncBiz-" + getType();
    }

    @NotNull
    public abstract String getType();

    public abstract boolean isAggregateAble();

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz, com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz<T extends androidx.health.connect.client.records.Record>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Nullable
    public final Object syncBiz(@NotNull Continuation<? super Boolean> continuation) {
        C28081 c28081;
        ?? r2;
        ?? r3;
        boolean zBooleanValue;
        ?? r4;
        if (continuation instanceof C28081) {
            c28081 = (C28081) continuation;
            int i = c28081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28081.label = i - Integer.MIN_VALUE;
            } else {
                c28081 = new C28081(this, continuation);
            }
        } else {
            c28081 = new C28081(this, continuation);
        }
        Object objSyncAggregateAbleRecords = c28081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSyncAggregateAbleRecords);
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            List<HealthConnectSyncDaoEntity> unSyncedListByTimeRange = getHealthConnectSyncDao().getUnSyncedListByTimeRange(getDataType(), getType(), jCurrentTimeMillis - ((long) RECORD_MAX_LIFETIME), jCurrentTimeMillis);
            Logger.i(getTag(), "sync " + getType() + "  unSync size:" + unSyncedListByTimeRange.size());
            if (!(!unSyncedListByTimeRange.isEmpty())) {
                return Boxing.boxBoolean(true);
            }
            Logger.i("BaseSyncBiz-" + getType(), ">>>>>> begin sync");
            if (isAggregateAble()) {
                c28081.L$0 = this;
                c28081.label = 2;
                objSyncAggregateAbleRecords = syncAggregateAbleRecords(unSyncedListByTimeRange, c28081);
                if (objSyncAggregateAbleRecords == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = this;
                zBooleanValue = ((Boolean) objSyncAggregateAbleRecords).booleanValue();
                r4 = r2;
            } else {
                c28081.L$0 = this;
                c28081.label = 1;
                objSyncAggregateAbleRecords = syncUnAggregateAbleRecords(unSyncedListByTimeRange, c28081);
                if (objSyncAggregateAbleRecords == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r3 = this;
                zBooleanValue = ((Boolean) objSyncAggregateAbleRecords).booleanValue();
                r4 = r3;
            }
        } else if (i2 == 1) {
            BaseSyncBiz baseSyncBiz = (BaseSyncBiz) c28081.L$0;
            ResultKt.throwOnFailure(objSyncAggregateAbleRecords);
            r3 = baseSyncBiz;
            zBooleanValue = ((Boolean) objSyncAggregateAbleRecords).booleanValue();
            r4 = r3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BaseSyncBiz baseSyncBiz2 = (BaseSyncBiz) c28081.L$0;
            ResultKt.throwOnFailure(objSyncAggregateAbleRecords);
            r2 = baseSyncBiz2;
            zBooleanValue = ((Boolean) objSyncAggregateAbleRecords).booleanValue();
            r4 = r2;
        }
        Logger.i("BaseSyncBiz-" + r4.getType(), "<<<<<<< end sync");
        return Boxing.boxBoolean(zBooleanValue);
    }
}
