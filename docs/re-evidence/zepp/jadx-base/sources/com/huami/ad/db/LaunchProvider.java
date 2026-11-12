package com.huami.ad.db;

import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.LaunchEntity;
import com.xiaomi.hm.health.databases.model.LaunchEntityDao;
import java.util.List;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchProvider {
    private static final String a = "LaunchProvider";
    private static LaunchProvider b;

    public static LaunchProvider getInstance() {
        if (b == null) {
            synchronized (AdProvider.class) {
                b = new LaunchProvider();
            }
        }
        return b;
    }

    public void deleteAll(List<LaunchEntity> list) {
        HMDaoManager.getInstance().getLaunchEntityDao().deleteInTx(list);
    }

    public void deleteEntity(LaunchEntity launchEntity) {
        HMDaoManager.getInstance().getLaunchEntityDao().delete(launchEntity);
    }

    public List<LaunchEntity> getValidityEntity() {
        QueryBuilder<LaunchEntity> queryBuilder = HMDaoManager.getInstance().getLaunchEntityDao().queryBuilder();
        WhereCondition whereConditionIsNotNull = LaunchEntityDao.Properties.ImageUrl.isNotNull();
        Property property = LaunchEntityDao.Properties.StartTime;
        Property property2 = LaunchEntityDao.Properties.EndTime;
        return queryBuilder.where(whereConditionIsNotNull, property.lt(property2), property.lt(Long.valueOf(System.currentTimeMillis() / 1000)), property2.gt(Long.valueOf(System.currentTimeMillis() / 1000))).list();
    }

    public boolean has(Long l) {
        List<LaunchEntity> list = HMDaoManager.getInstance().getLaunchEntityDao().queryBuilder().where(LaunchEntityDao.Properties.Id.eq(l), new WhereCondition[0]).list();
        return list != null && list.size() > 0;
    }

    public void insertOrReplace(LaunchEntity launchEntity) {
        HMDaoManager.getInstance().getLaunchEntityDao().insertOrReplace(launchEntity);
    }

    public void deleteAll() {
        HMDaoManager.getInstance().getLaunchEntityDao().deleteAll();
    }

    public void insertOrReplace(List<LaunchEntity> list) {
        HMDaoManager.getInstance().getLaunchEntityDao().insertOrReplaceInTx(list);
    }
}
