package com.huami.moving.datacenter;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportRecord;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportFunctionUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes11.dex */
public class SportRecordDbClient implements ISportRecordDbCallback {
    private static final String a = "SportRecordDbClient";
    private static final String b = "TrackId";
    private static volatile SportRecordDbClient c;

    public class a extends TypeToken<List<SportRecord>> {
        public a() {
        }
    }

    private SportRecordDbClient() {
    }

    public static SportRecordDbClient getInstance() {
        if (c == null) {
            synchronized (SportRecordDbClient.class) {
                if (c == null) {
                    c = new SportRecordDbClient();
                }
            }
        }
        return c;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void deleteSportRecords(DataCondition dataCondition) {
        if (dataCondition.getTrackId() <= -1) {
            if (SportFunctionUtil.isKoreaNoGps) {
                return;
            }
            HMDaoManager.getInstance().getTrackrecordDao().deleteAll();
        } else {
            QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
            if (dataCondition.getTrackId() > -1) {
                queryBuilder.where(TrackrecordDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
            }
            if (dataCondition.getSource() > -1) {
                queryBuilder.where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(dataCondition.getSource())), new WhereCondition[0]);
            }
            queryBuilder.buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public List<SportRecord> getSportRecords(DataCondition dataCondition) {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(TrackrecordDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getSource() > -1) {
            queryBuilder.where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(dataCondition.getSource())), new WhereCondition[0]);
        }
        if (dataCondition.getSyncState() != SyncedState.STATE_NONE.getValue()) {
            queryBuilder.where(TrackrecordDao.Properties.State.eq(Integer.valueOf(dataCondition.getSyncState())), new WhereCondition[0]);
        }
        if (dataCondition.getSportTypes() != null && dataCondition.getSportTypes().length > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i : dataCondition.getSportTypes()) {
                arrayList.add(Integer.valueOf(i));
            }
            queryBuilder.where(TrackrecordDao.Properties.Type.in(arrayList), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderDesc(TrackrecordDao.Properties.Trackid);
        } else if (b.equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(TrackrecordDao.Properties.Trackid);
            } else {
                queryBuilder.orderDesc(TrackrecordDao.Properties.Trackid);
            }
        }
        List<Trackrecord> list = queryBuilder.list();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Trackrecord> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(TrackRecordManager.getInstance().parseOriginalJsonData2Trackrecord(it2.next()));
        }
        try {
            return (List) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(arrayList2), new a().getType());
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void insertOrReplaceSportRecord(SportRecord sportRecord) {
        try {
            HMLog.d(a, "insertOrReplace id==" + HMDaoManager.getInstance().getTrackrecordDao().insertOrReplace((Trackrecord) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(sportRecord), Trackrecord.class)), new Object[0]);
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void updateSportRecord(SportRecord sportRecord) {
        try {
            Trackrecord trackrecord = (Trackrecord) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(sportRecord), Trackrecord.class);
            if (trackrecord.getId() == null || trackrecord.getId().longValue() <= 0) {
                throw new IllegalArgumentException("updateSportRecord no primary ID!!");
            }
            HMDaoManager.getInstance().getTrackrecordDao().update(trackrecord);
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }
}
