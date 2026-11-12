package com.huami.heartrate.repository.db;

import androidx.p008lifecycle.FlowLiveDataConversions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.repository.db.ZeppDBDataSource;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J!\u0010\u0016\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J!\u0010\u0019\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J+\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020'H\u0016J \u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J&\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00100'2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J,\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0'2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016J&\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/huami/heartrate/repository/db/ZeppDBDataSource;", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "c", "", "fromSecond", "toSecond", GoogleApiAvailabilityLight.a, "", "fromDay", "endDay", "", "", "e", "from", "to", "", "b", Constant.KEY_HR_VALUE, "", "insertHeartRate", "heartRateList", "insertHeartRateList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHeartRate", "updateHeartRateList", "deleteHeartRateList", "queryHeartRateListByDayRange", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "end", "", "limit", "queryHeartRateListByLimit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEarliestSyncedHeartRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "earliestTime", "latestTime", "deleteSyncedHeartRate", "Lkotlinx/coroutines/flow/Flow;", "observeLatestHeartRate", "observeHeartRateLiveDataList", "Ljava/util/Date;", "dayFrom", "dayEnd", "observeWholeDayHeartRate", "queryWholeDayHeartRate", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class ZeppDBDataSource implements IDataBaseDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends HeartRateEntity>> {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(0);
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends HeartRateEntity> invoke() {
            return ZeppDBDataSource.this.b(ExtensionUtilsKt.millsToSecond(this.b), ExtensionUtilsKt.millsToSecond(this.c));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HeartRateEntity> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeartRateEntity invoke() {
            return ZeppDBDataSource.this.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HeartRateEntity> {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2) {
            super(0);
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeartRateEntity invoke() {
            return ZeppDBDataSource.this.d(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n"}, d2 = {"", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Map<String, ? extends byte[]>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Map<String, ? extends byte[]> invoke() {
            return HandleDataKt.handleMaxHeartRate(ZeppDBDataSource.this.e(this.b, this.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HeartRateEntity> b(long from, long to) {
        QueryBuilder<HeartRate> queryBuilder = HMDaoManager.getInstance().getHeartRateDao().queryBuilder();
        Property property = com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time;
        List<HeartRate> list = queryBuilder.where(property.ge(Long.valueOf(from)), property.le(Long.valueOf(to)), com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.notEq(2), com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(2)).orderDesc(property).list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ZeppDBDataSourceKt.convertHeartRateEntity((HeartRate) it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateEntity c() {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.notEq(2), new WhereCondition[0]).where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]);
        Property property = com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time;
        HeartRate heartRateUnique = queryBuilderWhere.where(property.le(Long.valueOf(jCurrentTimeMillis)), new WhereCondition[0]).orderDesc(property).limit(1).build().unique();
        if (heartRateUnique == null) {
            return null;
        }
        return ZeppDBDataSourceKt.convertHeartRateEntity(heartRateUnique);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateEntity d(long fromSecond, long toSecond) {
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.notEq(2), new WhereCondition[0]).where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]);
        Property property = com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time;
        HeartRate heartRateUnique = queryBuilderWhere.where(property.le(Long.valueOf(toSecond)), new WhereCondition[0]).where(property.ge(Long.valueOf(fromSecond)), new WhereCondition[0]).orderDesc(property).limit(1).build().unique();
        if (heartRateUnique == null) {
            return null;
        }
        return ZeppDBDataSourceKt.convertHeartRateEntity(heartRateUnique);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, byte[]> e(String fromDay, String endDay) {
        QueryBuilder<DateData> queryBuilder = HMDaoManager.getInstance().getDateDataDao().queryBuilder();
        WhereCondition whereConditionIsNotNull = DateDataDao.Properties.Data.isNotNull();
        Property property = DateDataDao.Properties.Date;
        List<DateData> list = queryBuilder.where(whereConditionIsNotNull, DateDataDao.Properties.Data_hr.isNotNull(), property.ge(fromDay), property.le(endDay)).orderDesc(property).list();
        if (list == null) {
            return null;
        }
        HashMap map = new HashMap(list.size());
        for (DateData dateData : list) {
            map.put(dateData.getDate(), dateData.getData_hr());
        }
        return q.toSortedMap(map, new Comparator() { // from class: e19
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ZeppDBDataSource.f((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(String str, String str2) {
        return str2.compareTo(str);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void deleteHeartRateList(@NotNull List<HeartRateEntity> heartRateList) {
        com.xiaomi.hm.health.databases.model.HeartRateDao heartRateDao = HMDaoManager.getInstance().getHeartRateDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(heartRateList, 10));
        Iterator<T> it2 = heartRateList.iterator();
        while (it2.hasNext()) {
            arrayList.add(ZeppDBDataSourceKt.convertHeartRate((HeartRateEntity) it2.next()));
        }
        heartRateDao.deleteInTx(arrayList);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object deleteSyncedHeartRate(long j, long j2, @NotNull Continuation<? super Unit> continuation) {
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(Boxing.boxInt(2)), new WhereCondition[0]).where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.eq(Boxing.boxInt(1)), new WhereCondition[0]);
        Property property = com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time;
        queryBuilderWhere.where(property.ge(Boxing.boxLong(j)), new WhereCondition[0]).where(property.le(Boxing.boxLong(j2)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        return Unit.INSTANCE;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void insertHeartRate(@NotNull HeartRateEntity heartRate) {
        HMDaoManager.getInstance().getHeartRateDao().insertOrReplace(ZeppDBDataSourceKt.convertHeartRate(heartRate));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object insertHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        com.xiaomi.hm.health.databases.model.HeartRateDao heartRateDao = HMDaoManager.getInstance().getHeartRateDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ZeppDBDataSourceKt.convertHeartRate((HeartRateEntity) it2.next()));
        }
        heartRateDao.insertOrReplaceInTx(arrayList);
        return Unit.INSTANCE;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<List<HeartRateEntity>> observeHeartRateLiveDataList(long from, long to) {
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"HEART_RATE"}, new a(from, to)));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate() {
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"HEART_RATE"}, new b()));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<Map<String, byte[]>> observeWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayFrom);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(dayEnd);
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA"}, new d(new SportDay(calendar).toString(), new SportDay(calendar2).toString())));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryEarliestSyncedHeartRate(@NotNull Continuation<? super HeartRateEntity> continuation) {
        HeartRate heartRateUnique = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.eq(Boxing.boxInt(1)), new WhereCondition[0]).where(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(Boxing.boxInt(2)), new WhereCondition[0]).orderAsc(com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time).limit(1).build().unique();
        if (heartRateUnique == null) {
            return null;
        }
        return ZeppDBDataSourceKt.convertHeartRateEntity(heartRateUnique);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByDayRange(long j, long j2, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        return b(j, j2);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByLimit(long j, int i, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        QueryBuilder<HeartRate> queryBuilder = HMDaoManager.getInstance().getHeartRateDao().queryBuilder();
        Property property = com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Time;
        List<HeartRate> list = queryBuilder.where(property.le(Boxing.boxLong(j)), com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.State.notEq(Boxing.boxInt(2)), com.xiaomi.hm.health.databases.model.HeartRateDao.Properties.Type.eq(Boxing.boxInt(2))).orderDesc(property).limit(i).list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ZeppDBDataSourceKt.convertHeartRateEntity((HeartRate) it2.next()));
        }
        return arrayList;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Map<String, byte[]> queryWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayFrom);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(dayEnd);
        return HandleDataKt.handleMaxHeartRate(e(new SportDay(calendar).toString(), new SportDay(calendar2).toString()));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void updateHeartRate(@NotNull HeartRateEntity heartRate) {
        HMDaoManager.getInstance().getHeartRateDao().update(ZeppDBDataSourceKt.convertHeartRate(heartRate));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object updateHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        com.xiaomi.hm.health.databases.model.HeartRateDao heartRateDao = HMDaoManager.getInstance().getHeartRateDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ZeppDBDataSourceKt.convertHeartRate((HeartRateEntity) it2.next()));
        }
        heartRateDao.updateInTx(arrayList);
        return Unit.INSTANCE;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate(long fromSecond, long toSecond) {
        return FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"HEART_RATE"}, new c(fromSecond, toSecond)));
    }
}
