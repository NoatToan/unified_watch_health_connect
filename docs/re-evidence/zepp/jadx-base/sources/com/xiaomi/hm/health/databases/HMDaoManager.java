package com.xiaomi.hm.health.databases;

import android.content.Context;
import com.xiaomi.hm.health.databases.invalidation.InvalidationTracker;
import com.xiaomi.hm.health.databases.invalidation.NotifierDatabase;
import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoesDao;
import com.xiaomi.hm.health.databases.model.ActivetrackBarDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDistanceDao;
import com.xiaomi.hm.health.databases.model.ActivetrackStepDao;
import com.xiaomi.hm.health.databases.model.ActivetrackhrDao;
import com.xiaomi.hm.health.databases.model.AdEntityDao;
import com.xiaomi.hm.health.databases.model.AlarmDao;
import com.xiaomi.hm.health.databases.model.CompareModelDao;
import com.xiaomi.hm.health.databases.model.DaoMaster;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.databases.model.DetailDao;
import com.xiaomi.hm.health.databases.model.DeviceDao;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.databases.model.FbtEteResultDao;
import com.xiaomi.hm.health.databases.model.FbtThaResultDao;
import com.xiaomi.hm.health.databases.model.FriendDao;
import com.xiaomi.hm.health.databases.model.FriendMessageDao;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfoDao;
import com.xiaomi.hm.health.databases.model.HeartRateDao;
import com.xiaomi.hm.health.databases.model.HmPropertyDao;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.databases.model.LaunchEntityDao;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.databases.model.MedalDao;
import com.xiaomi.hm.health.databases.model.PushDao;
import com.xiaomi.hm.health.databases.model.ReminderDao;
import com.xiaomi.hm.health.databases.model.RunconfigDao;
import com.xiaomi.hm.health.databases.model.ShoesDataDao;
import com.xiaomi.hm.health.databases.model.TrackdataDao;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.hm.health.databases.model.UserInfosDao;
import com.xiaomi.hm.health.databases.model.UserScaleInfoDao;
import com.xiaomi.hm.health.databases.model.WatchSkinDao;
import com.xiaomi.hm.health.databases.model.WeightGoalsDao;
import com.xiaomi.hm.health.databases.model.WeightInfosDao;
import com.xiaomi.hm.health.databases.model.trainning.BgMusicDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRateDao;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class HMDaoManager {
    private static HMDaoManager c;
    private static Context d;
    private DaoSession a;
    private InvalidationTracker b;

    private HMDaoManager(Context context, String str) {
        NotifierDatabase notifierDatabase = new NotifierDatabase(new DaoMaster.DevOpenHelper(context, HMDatabaseHelper.parseOldDbName(str), null).getWritableDb());
        DaoMaster daoMaster = new DaoMaster(notifierDatabase);
        notifierDatabase.createInvalidationTracker(a(daoMaster));
        notifierDatabase.getInvalidationTracker().internalInit();
        this.b = notifierDatabase.getInvalidationTracker();
        this.a = daoMaster.newSession();
    }

    private String[] a(DaoMaster daoMaster) {
        ArrayList arrayList = new ArrayList();
        Iterator<DaoConfig> it2 = daoMaster.getDaoConfigMap().values().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().tablename);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static HMDaoManager getInstance() {
        Context context;
        if (c == null && (context = d) != null) {
            c = new HMDaoManager(context, "default");
        }
        return c;
    }

    public static void init(Context context, String str) {
        d = context;
        c = new HMDaoManager(context, str);
    }

    public void clearDataBasesTables(String str) {
        Database writableDb = new DaoMaster.DevOpenHelper(d, HMDatabaseHelper.parseNewMD5DbName(str), null).getWritableDb();
        DaoMaster.dropAllTables(writableDb, true);
        DaoMaster.createAllTables(writableDb, true);
    }

    public void closeDataBases(String str) {
        new DaoMaster.DevOpenHelper(d, HMDatabaseHelper.parseNewMD5DbName(str), null).getWritableDb().close();
    }

    public ActiveMiPlusShoesDao getActiveMiPlusShoesDao() {
        return this.a.getActiveMiPlusShoesDao();
    }

    public ActivetrackBarDao getActivetrackBarDao() {
        return this.a.getActivetrackBarDao();
    }

    public ActivetrackDao getActivetrackDao() {
        return this.a.getActivetrackDao();
    }

    public ActivetrackDistanceDao getActivetrackDistanceDao() {
        return this.a.getActivetrackDistanceDao();
    }

    public ActivetrackStepDao getActivetrackStepDao() {
        return this.a.getActivetrackStepDao();
    }

    public ActivetrackhrDao getActivetrackhrDao() {
        return this.a.getActivetrackhrDao();
    }

    public AdEntityDao getAdEntityDao() {
        return this.a.getAdEntityDao();
    }

    public AlarmDao getAlarmDao() {
        return this.a.getAlarmDao();
    }

    public BgMusicDao getBgMusicDao() {
        return this.a.getBgMusicDao();
    }

    public CompareModelDao getCompareModelDao() {
        return this.a.getCompareModelDao();
    }

    public DaoSession getDaoSession() {
        return this.a;
    }

    public DateDataDao getDateDataDao() {
        return this.a.getDateDataDao();
    }

    public DetailDao getDetailDao() {
        return this.a.getDetailDao();
    }

    public DeviceDao getDeviceDao() {
        return this.a.getDeviceDao();
    }

    public EarbudDateDataDao getEarbudDateDataDao() {
        return this.a.getEarbudDateDataDao();
    }

    public EarbudMusicInfoDao getEarbudMusicInfoDao() {
        return this.a.getEarbudMusicInfoDao();
    }

    public FbtEteResultDao getFbtEteResultDao() {
        return this.a.getFbtEteResultDao();
    }

    public FbtThaResultDao getFbtThaResultDao() {
        return this.a.getFbtThaResultDao();
    }

    public FriendDao getFriendDao() {
        return this.a.getFriendDao();
    }

    public FriendMessageDao getFriendMessageDao() {
        return this.a.getFriendMessageDao();
    }

    public FwDwonSuccessInfoDao getFwDwonSuccessInfoDao() {
        return this.a.getFwDwonSuccessInfoDao();
    }

    public HeartRateDao getHeartRateDao() {
        return this.a.getHeartRateDao();
    }

    @Deprecated
    public HmPropertyDao getHmPropertyDao() {
        return this.a.getHmPropertyDao();
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.b;
    }

    public LabActionDao getLabActionDao() {
        return this.a.getLabActionDao();
    }

    public LaunchEntityDao getLaunchEntityDao() {
        return this.a.getLaunchEntityDao();
    }

    public ManualDataDao getManualDataDao() {
        return this.a.getManualDataDao();
    }

    public MedalDao getMedalDao() {
        return this.a.getMedalDao();
    }

    public PushDao getPushDao() {
        return this.a.getPushDao();
    }

    public ReminderDao getReminderDao() {
        return this.a.getReminderDao();
    }

    public RunconfigDao getRunconfigDao() {
        return this.a.getRunconfigDao();
    }

    public ShoesDataDao getShoesDataDao() {
        return this.a.getShoesDataDao();
    }

    public TrackdataDao getTrackdataDao() {
        return this.a.getTrackdataDao();
    }

    public TrackrecordDao getTrackrecordDao() {
        return this.a.getTrackrecordDao();
    }

    public TrainingHeartRateDao getTrainingHeartRateDao() {
        return this.a.getTrainingHeartRateDao();
    }

    public UserInfosDao getUserInfosDao() {
        return this.a.getUserInfosDao();
    }

    public UserScaleInfoDao getUserScaleInfoDao() {
        return this.a.getUserScaleInfoDao();
    }

    public WatchSkinDao getWatchSlinDao() {
        return this.a.getWatchSkinDao();
    }

    public WeightGoalsDao getWeightGoalsDao() {
        return this.a.getWeightGoalsDao();
    }

    public WeightInfosDao getWeightInfosDao() {
        return this.a.getWeightInfosDao();
    }
}
