package com.xiaomi.hm.health.traininglib.util;

import android.database.Cursor;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudioDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionContentDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideoDao;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.xiaomi.hm.health.databases.model.trainning.BgMusicDao;
import com.xiaomi.hm.health.databases.model.trainning.Coach;
import com.xiaomi.hm.health.databases.model.trainning.CoachDao;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneActionDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetailDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRateDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecordDao;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.traininglib.model.TrainingRecordStatInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingDBUtils {
    private static final String a = "TrainingDBUtils";

    public class a extends Subscriber<Void> {
        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r1) {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ TrainingDetail a;

        public b(TrainingDetail trainingDetail) {
            this.a = trainingDetail;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingDBUtils.saveTrainingDatas(this.a);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ TrainingCourse a;
        public final /* synthetic */ boolean b;

        public c(TrainingCourse trainingCourse, boolean z) {
            this.a = trainingCourse;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingCourse trainingCourse = this.a;
            if (trainingCourse == null || trainingCourse.trainingPlanId == null || trainingCourse.dayTrainingItems == null) {
                return;
            }
            TrainingDBUtils.deleteTrainedCourse();
            TrainingDBUtils.j().getTrainingCourseDao().insertOrReplaceInTx(this.a);
            TrainingDBUtils.j().getTrainingCourseItemDao().insertOrReplaceInTx(this.a.dayTrainingItems);
            for (TrainingCourseItem trainingCourseItem : this.a.dayTrainingItems) {
                if (this.b) {
                    trainingCourseItem.isFinished = Boolean.FALSE;
                }
                TrainingDBUtils.saveTrainingDatas(trainingCourseItem.trainingDetail);
            }
        }
    }

    public class d implements Func1<TrainingCourse, TrainingCourse> {
        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingCourse call(TrainingCourse trainingCourse) {
            if (trainingCourse != null) {
                trainingCourse.dayTrainingItems = TrainingDBUtils.j().getTrainingCourseItemDao().queryBuilder().build().list();
            }
            return trainingCourse;
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ List c;

        public e(long j, long j2, List list) {
            this.a = j;
            this.b = j2;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingDBUtils.clearTrainingHeartRates(this.a, this.b);
            TrainingDBUtils.insertTrainingHeartRates(this.c);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;

        public f(long j, long j2, int i) {
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingDBUtils.deleteFullTrainingRecord(this.a, this.b, this.c);
        }
    }

    public class g implements Func3<TrainingRecord, List<HaveDoneAction>, List<TrainingHeartRate>, TrainingRecord> {
        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingRecord call(TrainingRecord trainingRecord, List<HaveDoneAction> list, List<TrainingHeartRate> list2) {
            trainingRecord.actions = list;
            trainingRecord.actionNumber = Integer.valueOf((list == null || list.isEmpty()) ? trainingRecord.actionNumber.intValue() : list.size());
            trainingRecord.heartRateList = list2;
            TrainingRecordUtils.parseAverageHeartRate(trainingRecord);
            trainingRecord.filterHeartRateInPauseRange();
            return trainingRecord;
        }
    }

    public static void addIntoJoinedTraining(TrainingItem trainingItem) {
        j().getTrainingItemDao().insertOrReplaceInTx(trainingItem);
    }

    public static void addIntoTrainingCourse(TrainingCourse trainingCourse, boolean z) {
        Log.d(a, "addIntoTrainingCourse start");
        j().runInTx(new c(trainingCourse, z));
        Log.d(a, "addIntoTrainingCourse start");
    }

    public static void clearTrainingHeartRates(long j, long j2) {
        j().getTrainingHeartRateDao().queryBuilder().where(TrainingHeartRateDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingHeartRateDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void decreaseTrainingDetailFinishNumberInRaw(long j, int i) {
        DaoSession daoSessionJ = j();
        String str = TrainingDetailDao.Properties.TrainingId.columnName;
        String str2 = TrainingDetailDao.Properties.FinishNumber.columnName;
        daoSessionJ.getDatabase().execSQL("UPDATE " + daoSessionJ.getTrainingDetailDao().getTablename() + " SET " + str2 + " = " + str2 + "-1 WHERE " + str + " = " + j + " AND " + str2 + " >= " + i);
    }

    public static void decreaseTrainingRecordFinishNumberInRaw(long j, int i) {
        DaoSession daoSessionJ = j();
        String str = TrainingRecordDao.Properties.TrainingId.columnName;
        String str2 = TrainingRecordDao.Properties.FinishNumber.columnName;
        daoSessionJ.getDatabase().execSQL("UPDATE " + daoSessionJ.getTrainingRecordDao().getTablename() + " SET " + str2 + " = " + str2 + "-1 WHERE " + str + " = " + j + " AND " + str2 + " > " + i);
    }

    public static void deleteDoneActions(long j, long j2) {
        j().getHaveDoneActionDao().queryBuilder().where(HaveDoneActionDao.Properties.TrainingId.eq(Long.valueOf(j)), HaveDoneActionDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void deleteFreeTrainingDatas(long j) {
        j().getTrainingDetailDao().queryBuilder().where(TrainingDetailDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        j().getBgMusicDao().queryBuilder().where(BgMusicDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        j().getActionContentDao().queryBuilder().where(ActionContentDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        j().getActionVideoDao().queryBuilder().where(ActionVideoDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        j().getActionAudioDao().queryBuilder().where(ActionAudioDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void deleteFullTrainingRecord(long j, long j2, int i) {
        deleteTrainingRecord(j, j2);
        deleteDoneActions(j, j2);
        deleteTrainingHeartRates(j, j2);
        decreaseTrainingRecordFinishNumberInRaw(j, i);
        decreaseTrainingDetailFinishNumberInRaw(j, i);
    }

    public static void deleteFullTrainingRecordInTx(long j, long j2, int i) {
        j().runInTx(new f(j, j2, i));
    }

    public static void deleteSyncedTrainingRecordBySyncTime(Long l, int i, List<Long> list) {
        if (i <= 0) {
            return;
        }
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis());
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        TrainingRecordDao trainingRecordDao = j().getTrainingRecordDao();
        String tablename = trainingRecordDao.getTablename();
        String str = TrainingRecordDao.Properties.StartTime.columnName;
        String str2 = "DELETE FROM " + tablename + " WHERE " + str + " IN ( SELECT " + str + " FROM " + tablename + " WHERE " + str + " <= " + l + t(true) + " ORDER BY " + str + " DESC LIMIT " + i + ") AND " + TrainingRecordDao.Properties.Status.columnName + " = 1 AND " + str + " NOT IN (" + ((Object) sb) + ")";
        HMLog.d(a, "deleteSyncedTrainingRecordBySyncTime() -> sql : \n" + str2, new Object[0]);
        trainingRecordDao.getDatabase().execSQL(str2);
    }

    public static void deleteSyncedTrainingRecordByTimeRange(Long l, Long l2, List<Long> list) {
        if (l == null) {
            l = 0L;
        }
        if (l2 == null) {
            l2 = Long.MAX_VALUE;
        }
        QueryBuilder<TrainingRecord> queryBuilder = j().getTrainingRecordDao().queryBuilder();
        Property property = TrainingRecordDao.Properties.StartTime;
        queryBuilder.where(property.ge(l), property.le(l2), property.notIn(list), TrainingRecordDao.Properties.Status.eq(1)).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void deleteTrainedCourse() {
        j().getTrainingCourseDao().deleteAll();
        j().getTrainingCourseItemDao().deleteAll();
    }

    public static void deleteTrainingHeartRates(long j, long j2) {
        j().getTrainingHeartRateDao().queryBuilder().where(TrainingHeartRateDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingHeartRateDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void deleteTrainingRecord(long j, long j2) {
        j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingRecordDao.Properties.StartTime.eq(Long.valueOf(j2))).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static TrainingRecordStatInfo getRecordsStatInfo(Long l, Long l2, boolean z) throws Throwable {
        Cursor cursorRawQuery;
        Throwable th;
        if (l == null) {
            l = 0L;
        }
        if (l2 == null) {
            l2 = Long.MAX_VALUE;
        }
        Long lValueOf = Long.valueOf(l.longValue() / 1000);
        Long lValueOf2 = Long.valueOf(l2.longValue() / 1000);
        DaoSession daoSessionJ = j();
        String tablename = daoSessionJ.getTrainingRecordDao().getTablename();
        String str = TrainingRecordDao.Properties.StartTime.columnName;
        String str2 = TrainingRecordDao.Properties.Duration.columnName;
        String str3 = TrainingRecordDao.Properties.Consumption.columnName;
        String str4 = TrainingRecordDao.Properties.Status.columnName;
        String str5 = "SELECT COUNT(*), SUM(" + str2 + "), SUM(" + str3 + ") FROM " + tablename + " WHERE " + str + " > " + String.valueOf(lValueOf) + " AND " + str + " < " + String.valueOf(lValueOf2) + t(true);
        if (z) {
            str5 = str5 + " AND " + str4 + " = 0";
        }
        TrainingRecordStatInfo trainingRecordStatInfo = null;
        try {
            cursorRawQuery = daoSessionJ.getDatabase().rawQuery(str5, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        long j = cursorRawQuery.getLong(0);
                        long j2 = cursorRawQuery.getLong(1);
                        long j3 = cursorRawQuery.getLong(2);
                        cursorRawQuery.close();
                        TrainingRecordStatInfo trainingRecordStatInfo2 = new TrainingRecordStatInfo();
                        trainingRecordStatInfo2.totalCount = j;
                        trainingRecordStatInfo2.totalDuration = j2;
                        trainingRecordStatInfo2.totalConsumption = j3;
                        trainingRecordStatInfo = trainingRecordStatInfo2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return trainingRecordStatInfo;
        } catch (Throwable th3) {
            cursorRawQuery = null;
            th = th3;
        }
    }

    public static boolean hasTrainingHistoryRecord(long j, long j2) {
        return j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingRecordDao.Properties.StartTime.eq(Long.valueOf(j2))).buildCount().count() > 0;
    }

    public static boolean haveFinishDownload(long j) {
        TrainingDetail trainingDetailQueryTrainingDetail = queryTrainingDetail(j);
        if (trainingDetailQueryTrainingDetail == null || "YOGA".equals(trainingDetailQueryTrainingDetail.trainingType)) {
            return false;
        }
        return MediaFileUtils.getUnDownloadContent(trainingDetailQueryTrainingDetail).isEmpty();
    }

    private static String i(Long l) {
        return l == null ? "null" : TimeUtils.debugTime(l.longValue());
    }

    public static Observable<Void> insertNewTrainingHeartRatesInRx(long j, long j2, List<TrainingHeartRate> list) {
        return j().rxTx().run(new e(j, j2, list));
    }

    public static void insertTrainingDetail(TrainingDetail trainingDetail) {
        j().getTrainingDetailDao().insertOrReplace(trainingDetail);
    }

    public static void insertTrainingDoneActions(List<HaveDoneAction> list) {
        j().getHaveDoneActionDao().insertOrReplaceInTx(list);
    }

    public static void insertTrainingHeartRates(List<TrainingHeartRate> list) {
        j().getTrainingHeartRateDao().insertOrReplaceInTx(list);
    }

    public static void insertTrainingRecord(TrainingRecord trainingRecord) {
        j().getTrainingRecordDao().insertOrReplace(trainingRecord);
    }

    public static Observable<List<TrainingItem>> insertWebJoinedTrainingsThenLoadFromDb(@Nullable final List<TrainingItem> list) {
        return j().rxTx().run(new Runnable() { // from class: qu7
            @Override // java.lang.Runnable
            public final void run() {
                TrainingDBUtils.l(list);
            }
        }).subscribeOn(Schedulers.io()).flatMap(new Func1() { // from class: tu7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return TrainingDBUtils.o((Void) obj);
            }
        }).toSortedList(new Func2() { // from class: uu7
            @Override // rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                return Integer.valueOf(((TrainingItem) obj).compareTo((TrainingItem) obj2));
            }
        }).doOnNext(new Action1() { // from class: su7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainingDBUtils.q((List) obj);
            }
        });
    }

    public static boolean isJoinedTraining(long j) {
        TrainingItem trainingItemUnique = j().getTrainingItemDao().queryBuilder().where(TrainingItemDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).build().unique();
        return trainingItemUnique != null && trainingItemUnique.isParticipate.booleanValue();
    }

    public static boolean isTrainedCourseFinish(long j, Integer num) {
        return j().getTrainingCourseDao().queryBuilder().where(TrainingCourseDao.Properties.TrainingPlanId.eq(Long.valueOf(j)), new WhereCondition[0]).build().unique() != null && j().getTrainingCourseItemDao().queryBuilder().where(TrainingCourseItemDao.Properties.DayIndex.eq(num), TrainingCourseItemDao.Properties.IsFinished.eq(Boolean.TRUE)).buildCount().count() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DaoSession j() {
        return HMDaoManager.getInstance().getDaoSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object k(List list) {
        return String.format(Locale.CHINA, "从网络获取到的已参加训练已全部缓存到数据库，共%d个", Integer.valueOf(list.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(final List list) {
        if (list != null) {
            DaoSession daoSessionJ = j();
            String str = TrainingItemDao.Properties.IsParticipate.columnName;
            daoSessionJ.getDatabase().execSQL("UPDATE " + daoSessionJ.getTrainingItemDao().getTablename() + " SET " + str + " = 0 WHERE " + str + " = 1");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((TrainingItem) it2.next()).isParticipate = Boolean.TRUE;
            }
            j().getTrainingItemDao().insertOrReplaceInTx(list);
            Loggers.getLogger().v(a, new Supplier() { // from class: pu7
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return TrainingDBUtils.k(list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object m(TrainingItem trainingItem) {
        return "从数据库读取到已参加训练 " + trainingItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(final TrainingItem trainingItem) {
        Loggers.getLogger().v(a, new Supplier() { // from class: nu7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainingDBUtils.m(trainingItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable o(Void r2) {
        return j().getTrainingItemDao().queryBuilder().where(TrainingItemDao.Properties.IsParticipate.eq(Boolean.TRUE), new WhereCondition[0]).rx().oneByOne().doOnNext(new Action1() { // from class: ru7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainingDBUtils.n((TrainingItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object p(List list) {
        return String.format(Locale.CHINA, "从数据库读取到已参加训练共%d个", Integer.valueOf(list.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(final List list) {
        Loggers.getLogger().v(a, new Supplier() { // from class: ou7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainingDBUtils.p(list);
            }
        });
    }

    public static long queryAllTrainingHistoryRecordCount() {
        return j().getTrainingRecordDao().queryBuilder().where(s(), new WhereCondition[0]).buildCount().count();
    }

    public static long queryDoneActionCountInOneHistoryRecord(long j, long j2) {
        return j().getHaveDoneActionDao().queryBuilder().where(HaveDoneActionDao.Properties.TrainingId.eq(Long.valueOf(j)), HaveDoneActionDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).buildCount().count();
    }

    public static Observable<HaveDoneAction> queryDoneActionListInRx(long j, long j2) {
        return j().getHaveDoneActionDao().queryBuilder().where(HaveDoneActionDao.Properties.TrainingId.eq(Long.valueOf(j)), HaveDoneActionDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).rx().oneByOne();
    }

    public static TrainingItem queryJoinedTrainingItem(long j) {
        return j().getTrainingItemDao().queryBuilder().where(TrainingItemDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).build().unique();
    }

    public static TrainingRecord queryLatestTrainingHistoryRecord() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        QueryBuilder<TrainingRecord> queryBuilder = j().getTrainingRecordDao().queryBuilder();
        WhereCondition whereConditionS = s();
        Property property = TrainingRecordDao.Properties.StartTime;
        TrainingRecord trainingRecordUnique = queryBuilder.where(whereConditionS, property.le(Long.valueOf(jCurrentTimeMillis))).orderDesc(property).limit(1).unique();
        if (trainingRecordUnique != null) {
            trainingRecordUnique = queryTrainingHistoryRecordRelatedData(trainingRecordUnique).toBlocking().firstOrDefault(trainingRecordUnique);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("queryLatestTrainingHistoryRecord ,record=");
        sb.append(trainingRecordUnique != null);
        HMLog.d(a, sb.toString(), new Object[0]);
        return trainingRecordUnique;
    }

    public static TrainingRecord queryNeedRecoverTraining() {
        List<TrainingRecord> list = j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.Status.eq(-1), new WhereCondition[0]).orderDesc(TrainingRecordDao.Properties.StartTime).build().list();
        TrainingRecord trainingRecord = (list == null || list.size() <= 0) ? null : list.get(0);
        if (trainingRecord != null) {
            List<HaveDoneAction> list2 = j().getHaveDoneActionDao().queryBuilder().where(HaveDoneActionDao.Properties.TrainingId.eq(trainingRecord.getTrainingId()), HaveDoneActionDao.Properties.TrainingStartTime.eq(trainingRecord.getStartTime())).list();
            trainingRecord.setActions(list2);
            trainingRecord.setActionNumber(Integer.valueOf(list2 != null ? list2.size() : 0));
        }
        return trainingRecord;
    }

    public static long queryRecoverTrainingHrIndex(long j) {
        return j().getTrainingHeartRateDao().queryBuilder().where(TrainingHeartRateDao.Properties.TrainingStartTime.eq(Long.valueOf(j)), new WhereCondition[0]).list().size();
    }

    public static Observable<TrainingRecord> querySimpleTrainingHistoryRecordListInRx(Long l, Long l2, int i) {
        if (l == null) {
            l = 0L;
        }
        if (l2 == null) {
            l2 = Long.MAX_VALUE;
        }
        QueryBuilder<TrainingRecord> queryBuilder = j().getTrainingRecordDao().queryBuilder();
        Property property = TrainingRecordDao.Properties.StartTime;
        QueryBuilder<TrainingRecord> queryBuilderOrderDesc = queryBuilder.where(property.ge(l), property.le(l2), s()).orderDesc(property);
        if (i > 0) {
            queryBuilderOrderDesc.limit(i);
        }
        HMLog.d(a, "从本地数据库查询到的训练历史记录共" + queryBuilderOrderDesc.buildCount().count() + "条,startTime:" + i(l) + ",endTime:" + i(l2) + ",limit:" + i, new Object[0]);
        return queryBuilderOrderDesc.rx().oneByOne();
    }

    public static Observable<TrainingRecord> querySingleSimpleTrainingHistoryRecordInRx(long j, long j2) {
        return j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingRecordDao.Properties.StartTime.eq(Long.valueOf(j2))).rx().unique();
    }

    public static TrainingCourse queryTrainedCourse(TrainingCourse trainingCourse) {
        List<TrainingCourseItem> list;
        Log.i(a, "queryTrainedCourse start");
        if (trainingCourse != null && (list = trainingCourse.dayTrainingItems) != null && list.size() > 0) {
            for (TrainingCourseItem trainingCourseItem : trainingCourse.dayTrainingItems) {
                trainingCourseItem.trainingDetail = queryTrainingDetail(trainingCourseItem.trainingId.longValue());
            }
        }
        Log.i(a, "queryTrainedCourse end");
        return trainingCourse;
    }

    public static TrainingCourse queryTrainedCourseFast() {
        Log.i(a, "queryTrainedCourseFast start");
        TrainingCourse trainingCourseUnique = j().getTrainingCourseDao().queryBuilder().build().unique();
        if (trainingCourseUnique != null) {
            trainingCourseUnique.dayTrainingItems = j().getTrainingCourseItemDao().queryBuilder().build().list();
        }
        Log.i(a, "queryTrainedCourseFast end");
        return trainingCourseUnique;
    }

    public static Observable<TrainingCourse> queryTrainedCourseFastRx() {
        return j().getTrainingCourseDao().queryBuilder().rx().unique().map(new d());
    }

    public static TrainingCourseItem queryTrainingCourseItem(long j) {
        try {
            String cache = TrainingKeeper.getCache("lastTrainingCourseItemId");
            QueryBuilder<TrainingCourseItem> queryBuilderWhere = j().getTrainingCourseItemDao().queryBuilder().where(TrainingCourseItemDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]);
            if (cache != null) {
                queryBuilderWhere.where(TrainingCourseItemDao.Properties.Id.eq(Long.valueOf(Long.parseLong(cache))), new WhereCondition[0]);
            }
            List<TrainingCourseItem> list = queryBuilderWhere.build().list();
            TrainingKeeper.remove("lastTrainingCourseItemId");
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0);
        } catch (Exception e2) {
            HMLog.e(a, e2);
            return null;
        }
    }

    public static TrainingDetail queryTrainingDetail(long j) {
        Log.d(a, "queryTrainingDetail start");
        try {
            TrainingDetail trainingDetailUnique = j().getTrainingDetailDao().queryBuilder().where(TrainingDetailDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).build().unique();
            if (trainingDetailUnique != null) {
                if (trainingDetailUnique.coachId != null) {
                    trainingDetailUnique.coach = j().getCoachDao().queryBuilder().where(CoachDao.Properties.HuamiId.eq(trainingDetailUnique.coachId), new WhereCondition[0]).build().unique();
                }
                trainingDetailUnique.bgMusic = j().getBgMusicDao().queryBuilder().where(BgMusicDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).unique();
                List<ActionContent> list = j().getActionContentDao().queryBuilder().where(ActionContentDao.Properties.TrainingId.eq(Long.valueOf(j)), new WhereCondition[0]).build().list();
                trainingDetailUnique.content = list;
                for (ActionContent actionContent : list) {
                    actionContent.videos = j().getActionVideoDao().queryBuilder().where(ActionVideoDao.Properties.TrainingId.eq(Long.valueOf(j)), ActionVideoDao.Properties.Round.eq(actionContent.round), ActionVideoDao.Properties.Group.eq(actionContent.group)).build().list();
                    actionContent.audio = j().getActionAudioDao().queryBuilder().where(ActionAudioDao.Properties.TrainingId.eq(Long.valueOf(j)), ActionAudioDao.Properties.Round.eq(actionContent.round), ActionAudioDao.Properties.Group.eq(actionContent.group)).build().unique();
                }
            }
            Log.d(a, "queryTrainingDetail end");
            return trainingDetailUnique;
        } catch (Exception e2) {
            HMLog.e(a, e2);
            return null;
        }
    }

    public static Observable<TrainingHeartRate> queryTrainingHeartRateListInRx(long j, long j2) {
        return j().getTrainingHeartRateDao().queryBuilder().where(TrainingHeartRateDao.Properties.TrainingId.eq(Long.valueOf(j)), TrainingHeartRateDao.Properties.TrainingStartTime.eq(Long.valueOf(j2))).rx().oneByOne();
    }

    public static long queryTrainingHistoryRecordCountByTimeRange(long j, long j2) {
        return j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.StartTime.between(Long.valueOf(j), Long.valueOf(j2)), s()).buildCount().count();
    }

    public static List<TrainingRecord> queryTrainingHistoryRecordList(List<Long> list) {
        QueryBuilder<TrainingRecord> queryBuilder = j().getTrainingRecordDao().queryBuilder();
        Property property = TrainingRecordDao.Properties.StartTime;
        return queryBuilder.where(property.in(list), s()).orderDesc(property).list();
    }

    public static Observable<TrainingRecord> queryTrainingHistoryRecordRelatedData(TrainingRecord trainingRecord) {
        return Observable.zip(Observable.just(trainingRecord), queryDoneActionListInRx(trainingRecord.getTrainingId().longValue(), trainingRecord.getStartTime().longValue()).toList(), queryTrainingHeartRateListInRx(trainingRecord.getTrainingId().longValue(), trainingRecord.getStartTime().longValue()).toList(), new g());
    }

    public static List<TrainingItem> queryTrainingItemListFastRx() {
        return j().getTrainingItemDao().queryBuilder().where(TrainingItemDao.Properties.IsParticipate.eq(Boolean.TRUE), new WhereCondition[0]).orderDesc(TrainingItemDao.Properties.UpdateTime).list();
    }

    public static long queryUnSyncedTrainingHistoryRecordCount() {
        return j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.Status.eq(0), new WhereCondition[0]).buildCount().count();
    }

    public static Observable<TrainingRecord> queryUnSyncedTrainingHistoryRecordListInRx() {
        return j().getTrainingRecordDao().queryBuilder().where(TrainingRecordDao.Properties.Status.eq(0), new WhereCondition[0]).rx().oneByOne();
    }

    private static long r(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    private static WhereCondition s() {
        return TrainingRecordDao.Properties.Status.in(0, 1);
    }

    public static void saveTrainingDatas(TrainingDetail trainingDetail) {
        if (trainingDetail != null) {
            deleteFreeTrainingDatas(trainingDetail.trainingId.longValue());
            Coach coach = trainingDetail.coach;
            if (coach != null) {
                trainingDetail.coachId = coach.id;
                j().getCoachDao().queryBuilder().where(CoachDao.Properties.HuamiId.eq(trainingDetail.coach.huamiId), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
                j().getCoachDao().insertOrReplaceInTx(trainingDetail.coach);
            }
            BgMusic bgMusic = trainingDetail.bgMusic;
            if (bgMusic != null) {
                bgMusic.setTrainingId(trainingDetail.getTrainingId());
                j().getBgMusicDao().insertOrReplaceInTx(bgMusic);
            }
            j().getTrainingDetailDao().insertOrReplaceInTx(trainingDetail);
            List<ActionContent> list = trainingDetail.content;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (ActionContent actionContent : trainingDetail.content) {
                actionContent.trainingId = trainingDetail.trainingId;
                List<ActionVideo> list2 = actionContent.videos;
                if (list2 != null) {
                    for (ActionVideo actionVideo : list2) {
                        actionVideo.trainingId = trainingDetail.trainingId;
                        actionVideo.round = actionContent.round;
                        actionVideo.group = actionContent.group;
                    }
                    j().getActionVideoDao().insertOrReplaceInTx(actionContent.videos);
                }
                ActionAudio actionAudio = actionContent.audio;
                if (actionAudio != null) {
                    actionAudio.trainingId = trainingDetail.trainingId;
                    actionAudio.round = actionContent.round;
                    actionAudio.group = actionContent.group;
                    j().getActionAudioDao().insertOrReplaceInTx(actionContent.audio);
                }
            }
            j().getActionContentDao().insertOrReplaceInTx(trainingDetail.content);
        }
    }

    public static void saveTrainingDatasInTxAsync(TrainingDetail trainingDetail) {
        j().rxTx().run(new b(trainingDetail)).subscribe((Subscriber<? super Void>) new a());
    }

    private static String t(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? " AND " : " WHERE ");
        sb.append(TrainingRecordDao.Properties.Status.columnName);
        sb.append(" IN (");
        sb.append(0);
        sb.append(",");
        sb.append(1);
        sb.append(") ");
        return sb.toString();
    }

    public static void updateTrainingCourseItemIsFinished(long j, boolean z) {
        DaoSession daoSessionJ = j();
        String str = TrainingCourseItemDao.Properties.TrainingId.columnName;
        daoSessionJ.getDatabase().execSQL("UPDATE " + daoSessionJ.getTrainingCourseItemDao().getTablename() + " SET " + TrainingCourseItemDao.Properties.IsFinished.columnName + " = " + (z ? 1 : 0) + " WHERE " + str + " = " + j);
    }

    public static void updateTrainingRecord(TrainingRecord trainingRecord) {
        j().getTrainingRecordDao().update(trainingRecord);
    }

    public static void updateTrainingCourseItemIsFinished(TrainingCourseItem trainingCourseItem, boolean z) {
        if (trainingCourseItem != null) {
            trainingCourseItem.isFinished = Boolean.valueOf(z);
            j().getTrainingCourseItemDao().insertOrReplaceInTx(trainingCourseItem);
        }
    }
}
