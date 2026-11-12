package com.xiaomi.hm.health.databases.model.autobuild;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes20.dex */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 177;

    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onUpgrade(Database database, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            DaoMaster.dropAllTables(database, true);
            onCreate(database);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String str) {
            super(context, str, 177);
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onCreate(Database database) {
            Log.i("greenDAO", "Creating tables for schema version 177");
            DaoMaster.createAllTables(database, false);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 177);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new StandardDatabase(sQLiteDatabase));
    }

    public static void createAllTables(Database database, boolean z) {
        ActiveMiPlusShoesDao.createTable(database, z);
        ActivetrackDao.createTable(database, z);
        ActivetrackBarDao.createTable(database, z);
        ActivetrackDistanceDao.createTable(database, z);
        ActivetrackStepDao.createTable(database, z);
        ActivetrackhrDao.createTable(database, z);
        AdEntityDao.createTable(database, z);
        AlarmDao.createTable(database, z);
        AtrialFibrillationDataItemDao.createTable(database, z);
        CompareModelDao.createTable(database, z);
        ConfigDao.createTable(database, z);
        DateDataDao.createTable(database, z);
        DetailDao.createTable(database, z);
        DeviceDao.createTable(database, z);
        DismissAdvDao.createTable(database, z);
        EarbudDateDataDao.createTable(database, z);
        EarbudMusicInfoDao.createTable(database, z);
        FbtEteResultDao.createTable(database, z);
        FbtThaResultDao.createTable(database, z);
        FriendDao.createTable(database, z);
        FriendMessageDao.createTable(database, z);
        FwDwonSuccessInfoDao.createTable(database, z);
        HeartRateDao.createTable(database, z);
        HmPropertyDao.createTable(database, z);
        LaunchEntityDao.createTable(database, z);
        ManualDataDao.createTable(database, z);
        MedalDao.createTable(database, z);
        MyShoesDao.createTable(database, z);
        NewCaloriesDao.createTable(database, z);
        NormandyDataDao.createTable(database, z);
        PushDao.createTable(database, z);
        ReminderDao.createTable(database, z);
        RunconfigDao.createTable(database, z);
        SensorDataDao.createTable(database, z);
        ShoesDataDao.createTable(database, z);
        ShoesPartnersDao.createTable(database, z);
        TrackdataDao.createTable(database, z);
        TrackdeathbookDao.createTable(database, z);
        TrackhrDao.createTable(database, z);
        TrackrecordDao.createTable(database, z);
        TrackstatisticsDao.createTable(database, z);
        UserInfosDao.createTable(database, z);
        UserScaleInfoDao.createTable(database, z);
        WatchSkinDao.createTable(database, z);
        WeightGoalsDao.createTable(database, z);
        WeightInfosDao.createTable(database, z);
        CirclePostDao.createTable(database, z);
        RecomendedUserDao.createTable(database, z);
        ActionAudioDao.createTable(database, z);
        ActionContentDao.createTable(database, z);
        ActionVideoDao.createTable(database, z);
        BgMusicDao.createTable(database, z);
        CoachDao.createTable(database, z);
        HaveDoneActionDao.createTable(database, z);
        TrainingCourseDao.createTable(database, z);
        TrainingCourseItemDao.createTable(database, z);
        TrainingDetailDao.createTable(database, z);
        TrainingHeartRateDao.createTable(database, z);
        TrainingItemDao.createTable(database, z);
        TrainingRecordDao.createTable(database, z);
    }

    public static void dropAllTables(Database database, boolean z) {
        ActiveMiPlusShoesDao.dropTable(database, z);
        ActivetrackDao.dropTable(database, z);
        ActivetrackBarDao.dropTable(database, z);
        ActivetrackDistanceDao.dropTable(database, z);
        ActivetrackStepDao.dropTable(database, z);
        ActivetrackhrDao.dropTable(database, z);
        AdEntityDao.dropTable(database, z);
        AlarmDao.dropTable(database, z);
        AtrialFibrillationDataItemDao.dropTable(database, z);
        CompareModelDao.dropTable(database, z);
        ConfigDao.dropTable(database, z);
        DateDataDao.dropTable(database, z);
        DetailDao.dropTable(database, z);
        DeviceDao.dropTable(database, z);
        DismissAdvDao.dropTable(database, z);
        EarbudDateDataDao.dropTable(database, z);
        EarbudMusicInfoDao.dropTable(database, z);
        FbtEteResultDao.dropTable(database, z);
        FbtThaResultDao.dropTable(database, z);
        FriendDao.dropTable(database, z);
        FriendMessageDao.dropTable(database, z);
        FwDwonSuccessInfoDao.dropTable(database, z);
        HeartRateDao.dropTable(database, z);
        HmPropertyDao.dropTable(database, z);
        LaunchEntityDao.dropTable(database, z);
        ManualDataDao.dropTable(database, z);
        MedalDao.dropTable(database, z);
        MyShoesDao.dropTable(database, z);
        NewCaloriesDao.dropTable(database, z);
        NormandyDataDao.dropTable(database, z);
        PushDao.dropTable(database, z);
        ReminderDao.dropTable(database, z);
        RunconfigDao.dropTable(database, z);
        SensorDataDao.dropTable(database, z);
        ShoesDataDao.dropTable(database, z);
        ShoesPartnersDao.dropTable(database, z);
        TrackdataDao.dropTable(database, z);
        TrackdeathbookDao.dropTable(database, z);
        TrackhrDao.dropTable(database, z);
        TrackrecordDao.dropTable(database, z);
        TrackstatisticsDao.dropTable(database, z);
        UserInfosDao.dropTable(database, z);
        UserScaleInfoDao.dropTable(database, z);
        WatchSkinDao.dropTable(database, z);
        WeightGoalsDao.dropTable(database, z);
        WeightInfosDao.dropTable(database, z);
        CirclePostDao.dropTable(database, z);
        RecomendedUserDao.dropTable(database, z);
        ActionAudioDao.dropTable(database, z);
        ActionContentDao.dropTable(database, z);
        ActionVideoDao.dropTable(database, z);
        BgMusicDao.dropTable(database, z);
        CoachDao.dropTable(database, z);
        HaveDoneActionDao.dropTable(database, z);
        TrainingCourseDao.dropTable(database, z);
        TrainingCourseItemDao.dropTable(database, z);
        TrainingDetailDao.dropTable(database, z);
        TrainingHeartRateDao.dropTable(database, z);
        TrainingItemDao.dropTable(database, z);
        TrainingRecordDao.dropTable(database, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public DaoMaster(Database database) {
        super(database, 177);
        registerDaoClass(ActiveMiPlusShoesDao.class);
        registerDaoClass(ActivetrackDao.class);
        registerDaoClass(ActivetrackBarDao.class);
        registerDaoClass(ActivetrackDistanceDao.class);
        registerDaoClass(ActivetrackStepDao.class);
        registerDaoClass(ActivetrackhrDao.class);
        registerDaoClass(AdEntityDao.class);
        registerDaoClass(AlarmDao.class);
        registerDaoClass(AtrialFibrillationDataItemDao.class);
        registerDaoClass(CompareModelDao.class);
        registerDaoClass(ConfigDao.class);
        registerDaoClass(DateDataDao.class);
        registerDaoClass(DetailDao.class);
        registerDaoClass(DeviceDao.class);
        registerDaoClass(DismissAdvDao.class);
        registerDaoClass(EarbudDateDataDao.class);
        registerDaoClass(EarbudMusicInfoDao.class);
        registerDaoClass(FbtEteResultDao.class);
        registerDaoClass(FbtThaResultDao.class);
        registerDaoClass(FriendDao.class);
        registerDaoClass(FriendMessageDao.class);
        registerDaoClass(FwDwonSuccessInfoDao.class);
        registerDaoClass(HeartRateDao.class);
        registerDaoClass(HmPropertyDao.class);
        registerDaoClass(LaunchEntityDao.class);
        registerDaoClass(ManualDataDao.class);
        registerDaoClass(MedalDao.class);
        registerDaoClass(MyShoesDao.class);
        registerDaoClass(NewCaloriesDao.class);
        registerDaoClass(NormandyDataDao.class);
        registerDaoClass(PushDao.class);
        registerDaoClass(ReminderDao.class);
        registerDaoClass(RunconfigDao.class);
        registerDaoClass(SensorDataDao.class);
        registerDaoClass(ShoesDataDao.class);
        registerDaoClass(ShoesPartnersDao.class);
        registerDaoClass(TrackdataDao.class);
        registerDaoClass(TrackdeathbookDao.class);
        registerDaoClass(TrackhrDao.class);
        registerDaoClass(TrackrecordDao.class);
        registerDaoClass(TrackstatisticsDao.class);
        registerDaoClass(UserInfosDao.class);
        registerDaoClass(UserScaleInfoDao.class);
        registerDaoClass(WatchSkinDao.class);
        registerDaoClass(WeightGoalsDao.class);
        registerDaoClass(WeightInfosDao.class);
        registerDaoClass(CirclePostDao.class);
        registerDaoClass(RecomendedUserDao.class);
        registerDaoClass(ActionAudioDao.class);
        registerDaoClass(ActionContentDao.class);
        registerDaoClass(ActionVideoDao.class);
        registerDaoClass(BgMusicDao.class);
        registerDaoClass(CoachDao.class);
        registerDaoClass(HaveDoneActionDao.class);
        registerDaoClass(TrainingCourseDao.class);
        registerDaoClass(TrainingCourseItemDao.class);
        registerDaoClass(TrainingDetailDao.class);
        registerDaoClass(TrainingHeartRateDao.class);
        registerDaoClass(TrainingItemDao.class);
        registerDaoClass(TrainingRecordDao.class);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public DaoSession newSession() {
        return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        return new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }
}
