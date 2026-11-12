package com.xiaomi.hm.health.datautil;

import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes20.dex */
public class HMBraceletDateDataUtil {
    public static EarbudDateData getEarbudSpecifyDayData(String date) {
        return HMDaoManager.getInstance().getDaoSession().getEarbudDateDataDao().queryBuilder().where(EarbudDateDataDao.Properties.Date.eq(date), new WhereCondition[0]).build().forCurrentThread().unique();
    }

    public static List<DateData> getRegionData(String startTime, String endTime) {
        return HMDaoManager.getInstance().getDaoSession().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.between(startTime, endTime), new WhereCondition[0]).list();
    }

    public static DateData getSpecifyDayData(String date) {
        return HMDaoManager.getInstance().getDaoSession().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.eq(date), new WhereCondition[0]).build().forCurrentThread().unique();
    }
}
