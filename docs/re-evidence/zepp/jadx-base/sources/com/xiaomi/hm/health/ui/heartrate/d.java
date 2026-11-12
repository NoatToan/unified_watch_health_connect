package com.xiaomi.hm.health.ui.heartrate;

import androidx.p008lifecycle.LiveData;
import com.app.restheartrate.service.api.RestHeartApi;
import com.app.restheartrate.service.entity.RestHeartRate;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.HeartRateDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes22.dex */
class d {

    public class a implements Runnable {
        public final /* synthetic */ Collection a;
        public final /* synthetic */ Long b;

        public a(final Collection val$syncedHrList, final Long val$latestHrMeasureTime) {
            this.a = val$syncedHrList;
            this.b = val$latestHrMeasureTime;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.size() > 1) {
                Iterator it2 = this.a.iterator();
                long jLongValue = 0;
                long jLongValue2 = Long.MAX_VALUE;
                while (it2.hasNext()) {
                    Long time = ((HeartRate) it2.next()).getTime();
                    if (time.longValue() > jLongValue) {
                        jLongValue = time.longValue();
                    }
                    if (time.longValue() < jLongValue2) {
                        jLongValue2 = time.longValue();
                    }
                }
                Long l = this.b;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                if (jLongValue2 != Long.MAX_VALUE && jLongValue != 0) {
                    d.e(jLongValue2, jLongValue);
                }
            }
            d.h(this.a);
        }
    }

    public static void d(Iterable<HeartRate> iterable) {
        HMDaoManager.getInstance().getHeartRateDao().deleteInTx(iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(long earliestTime, long latestTime) {
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]).where(HeartRateDao.Properties.State.eq(1), new WhereCondition[0]);
        Property property = HeartRateDao.Properties.Time;
        queryBuilderWhere.where(property.ge(Long.valueOf(earliestTime)), new WhereCondition[0]).where(property.le(Long.valueOf(latestTime)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static void f(final Collection<HeartRate> syncedHrList, final Long latestHrMeasureTime) {
        HMDaoManager.getInstance().getDaoSession().runInTx(new a(syncedHrList, latestHrMeasureTime));
    }

    public static void g(HeartRate heartRate) {
        HMDaoManager.getInstance().getHeartRateDao().insertOrReplace(heartRate);
    }

    public static void h(Iterable<HeartRate> iterable) {
        HMDaoManager.getInstance().getHeartRateDao().insertOrReplaceInTx(iterable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMSummery i(DateData dateData) {
        HMSummery hMSummery = new HMSummery();
        HMSummery.parseDBSummery(hMSummery, dateData.getSummary());
        hMSummery.date = dateData.getDate();
        return hMSummery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] j(SimpleDateFormat simpleDateFormat) {
        return v(simpleDateFormat.format(new Date()));
    }

    public static HeartRate k() {
        return HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.State.eq(1), new WhereCondition[0]).where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]).orderAsc(HeartRateDao.Properties.Time).limit(1).build().unique();
    }

    public static List<HeartRate> l(List<Long> keys) {
        return HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.Time.in(keys), new WhereCondition[0]).list();
    }

    public static List<HeartRate> m(long queryEndTime, int limit) {
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.State.notEq(2), new WhereCondition[0]).where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]);
        Property property = HeartRateDao.Properties.Time;
        return queryBuilderWhere.where(property.le(Long.valueOf(queryEndTime)), new WhereCondition[0]).orderDesc(property).limit(limit).list();
    }

    public static List<HeartRate> n(String day) {
        SportDay sportDayFromString = SportDay.fromString(day);
        SportDay nextDay = sportDayFromString.getNextDay();
        QueryBuilder<HeartRate> queryBuilder = HMDaoManager.getInstance().getHeartRateDao().queryBuilder();
        Property property = HeartRateDao.Properties.Time;
        return queryBuilder.where(property.ge(Long.valueOf(sportDayFromString.getTimestamp() / 1000)), property.lt(Long.valueOf(nextDay.getTimestamp() / 1000)), HeartRateDao.Properties.State.notEq(2), HeartRateDao.Properties.Type.eq(2)).orderDesc(property).list();
    }

    public static List<HeartRate> o(long from, long to) {
        QueryBuilder<HeartRate> queryBuilder = HMDaoManager.getInstance().getHeartRateDao().queryBuilder();
        Property property = HeartRateDao.Properties.Time;
        return queryBuilder.where(property.ge(Long.valueOf(from)), property.le(Long.valueOf(to)), HeartRateDao.Properties.State.notEq(2), HeartRateDao.Properties.Type.eq(2)).orderDesc(property).list();
    }

    public static HeartRate p() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        QueryBuilder<HeartRate> queryBuilderWhere = HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.State.notEq(2), new WhereCondition[0]).where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]);
        Property property = HeartRateDao.Properties.Time;
        return queryBuilderWhere.where(property.le(Long.valueOf(jCurrentTimeMillis)), new WhereCondition[0]).orderDesc(property).limit(1).build().unique();
    }

    public static LiveData<HeartRate> q() {
        return LiveDataSupportKt.queryByLiveData(new String[]{"HEART_RATE"}, new Function0() { // from class: com.xiaomi.hm.health.ui.heartrate.b
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return d.p();
            }
        });
    }

    public static Observable<List<HeartRate>> r() {
        return HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]).where(HeartRateDao.Properties.State.eq(2), new WhereCondition[0]).rx().list();
    }

    public static Observable<List<HeartRate>> s() {
        return HMDaoManager.getInstance().getHeartRateDao().queryBuilder().where(HeartRateDao.Properties.Type.eq(2), new WhereCondition[0]).where(HeartRateDao.Properties.State.eq(0), new WhereCondition[0]).rx().list();
    }

    public static int t(String day) {
        RestHeartRate heartRateByDate = ((RestHeartApi) KoinJavaComponent.get(RestHeartApi.class)).getHeartRateByDate(day);
        HMLog.i("HRDBUtils", "查询本地设备同步的静息心率 day=" + day + ",data=" + heartRateByDate, new Object[0]);
        if (heartRateByDate != null && heartRateByDate.getValue() > 0) {
            return heartRateByDate.getValue();
        }
        DateData dateDataUnique = HMDaoManager.getInstance().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Summary.isNotNull(), DateDataDao.Properties.Date.eq(day)).unique();
        if (dateDataUnique == null) {
            return 0;
        }
        HMSummery hMSummery = new HMSummery();
        HMSummery.parseDBSummery(hMSummery, dateDataUnique.getSummary());
        Sleep sleep = hMSummery.sleep;
        return sleep != null ? sleep.rhr : hMSummery.rhrDeprecated;
    }

    public static Observable<HMSummery> u(String startDateInMonth, String lastDateInMonth) {
        QueryBuilder<DateData> queryBuilder = HMDaoManager.getInstance().getDateDataDao().queryBuilder();
        WhereCondition whereConditionIsNotNull = DateDataDao.Properties.Summary.isNotNull();
        Property property = DateDataDao.Properties.Date;
        return queryBuilder.where(whereConditionIsNotNull, property.ge(startDateInMonth), property.le(lastDateInMonth)).orderAsc(property).rx().oneByOne().map(new Func1() { // from class: com.xiaomi.hm.health.ui.heartrate.c
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return d.i((DateData) obj);
            }
        });
    }

    public static byte[] v(String day) {
        DateData dateDataUnique = HMDaoManager.getInstance().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Data.isNotNull(), DateDataDao.Properties.Data_hr.isNotNull(), DateDataDao.Properties.Date.eq(day)).unique();
        if (dateDataUnique != null) {
            return dateDataUnique.getData_hr();
        }
        return null;
    }

    public static Map<String, byte[]> w(String fromDay, String endDay) {
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
        return map;
    }

    public static LiveData<byte[]> x() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        return LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA"}, new Function0() { // from class: com.xiaomi.hm.health.ui.heartrate.a
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return d.j(simpleDateFormat);
            }
        });
    }

    public static void y(HeartRate heartRate) {
        HMDaoManager.getInstance().getHeartRateDao().update(heartRate);
    }

    public static void z(Iterable<HeartRate> iterable) {
        HMDaoManager.getInstance().getHeartRateDao().updateInTx(iterable);
    }
}
