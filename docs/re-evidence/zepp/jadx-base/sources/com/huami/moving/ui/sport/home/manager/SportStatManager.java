package com.huami.moving.ui.sport.home.manager;

import android.database.Cursor;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.moving.webapi.GetSportStatAPI;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SportStatManager {
    private static volatile SportStatManager a;

    private SportStatManager() {
    }

    public static SportStatManager getInstance() {
        if (a == null) {
            synchronized (SportStatManager.class) {
                if (a == null) {
                    a = new SportStatManager();
                }
            }
        }
        return a;
    }

    public GetSportStatAPI.StatDataEntity getRecordsStatInfo(Long l, Long l2, boolean z) {
        if (l == null) {
            l = 0L;
        }
        if (l2 == null) {
            l2 = Long.MAX_VALUE;
        }
        Long lValueOf = Long.valueOf(l.longValue() / 1000);
        Long lValueOf2 = Long.valueOf(l2.longValue() / 1000);
        DaoSession daoSession = HMDaoManager.getInstance().getDaoSession();
        String tablename = daoSession.getTrackrecordDao().getTablename();
        String str = TrackrecordDao.Properties.Trackid.columnName;
        String str2 = TrackrecordDao.Properties.Costtime.columnName;
        String str3 = TrackrecordDao.Properties.Distance.columnName;
        String str4 = TrackrecordDao.Properties.State.columnName;
        String str5 = TrackrecordDao.Properties.Type.columnName;
        String str6 = "SELECT COUNT(*), SUM(" + str2 + "), SUM(" + str3 + "), SUM(" + TrackrecordDao.Properties.Cal.columnName + "), " + str5 + " FROM " + tablename + " WHERE " + str + " > " + lValueOf + " AND " + str + " < " + lValueOf2 + " AND " + str5 + " IN (" + SportRecordQueryConstrainUtils.sportTypesToInSql() + ")";
        if (z) {
            str6 = str6 + " AND " + str4 + " = " + SyncedState.STATE_UNSYNCED.getValue();
        }
        String str7 = str6 + " GROUP BY " + str5;
        GetSportStatAPI.StatDataEntity statDataEntity = new GetSportStatAPI.StatDataEntity();
        statDataEntity.subStatList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = daoSession.getDatabase().rawQuery(str7, null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    int i = cursorRawQuery.getInt(0);
                    int i2 = cursorRawQuery.getInt(1);
                    float f = cursorRawQuery.getFloat(2);
                    float f2 = cursorRawQuery.getFloat(3);
                    int i3 = cursorRawQuery.getInt(4);
                    GetSportStatAPI.StatDataEntity statDataEntity2 = new GetSportStatAPI.StatDataEntity();
                    statDataEntity2.count = i;
                    statDataEntity2.costTime = i2;
                    statDataEntity2.distance = f;
                    statDataEntity2.calorie = f2;
                    statDataEntity2.sportType = i3;
                    statDataEntity.subStatList.add(statDataEntity2);
                    statDataEntity.count += i;
                    statDataEntity.costTime += i2;
                    statDataEntity.distance += f;
                    statDataEntity.calorie += f2;
                }
            }
            return statDataEntity;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }
}
