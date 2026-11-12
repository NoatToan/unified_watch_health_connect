package com.xiaomi.hm.health.databases.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.xiaomi.hm.health.databases.HMDatabaseHelper;
import com.xiaomi.hm.health.databases.model.circle.CirclePostDao;
import com.xiaomi.hm.health.databases.model.circle.RecomendedUserDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudioDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionContentDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideoDao;
import com.xiaomi.hm.health.databases.model.trainning.BgMusicDao;
import com.xiaomi.hm.health.databases.model.trainning.CoachDao;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneActionDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetailDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRateDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecordDao;
import java.util.Collections;
import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

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
            HMDatabaseHelper.onUpgrade(database, i, i2);
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
        DateDataDao.createTable(database, z);
        HmPropertyDao.createTable(database, z);
        NewCaloriesDao.createTable(database, z);
        SensorDataDao.createTable(database, z);
        RunconfigDao.createTable(database, z);
        FriendDao.createTable(database, z);
        ActivetrackStepDao.createTable(database, z);
        LaunchEntityDao.createTable(database, z);
        TrackrecordDao.createTable(database, z);
        TrackhrDao.createTable(database, z);
        ActivetrackBarDao.createTable(database, z);
        LabActionDao.createTable(database, z);
        RecomendedUserDao.createTable(database, z);
        CirclePostDao.createTable(database, z);
        FwDwonSuccessInfoDao.createTable(database, z);
        ManualDataDao.createTable(database, z);
        AlarmDao.createTable(database, z);
        ActivetrackDao.createTable(database, z);
        TrackdeathbookDao.createTable(database, z);
        ActivetrackhrDao.createTable(database, z);
        ReminderDao.createTable(database, z);
        AdEntityDao.createTable(database, z);
        WeightInfosDao.createTable(database, z);
        DeviceDao.createTable(database, z);
        TrackdataDao.createTable(database, z);
        PushDao.createTable(database, z);
        MedalDao.createTable(database, z);
        DismissAdvDao.createTable(database, z);
        ShoesDataDao.createTable(database, z);
        UserInfosDao.createTable(database, z);
        CompareModelDao.createTable(database, z);
        WeightGoalsDao.createTable(database, z);
        TrackstatisticsDao.createTable(database, z);
        ShoesPartnersDao.createTable(database, z);
        FbtEteResultDao.createTable(database, z);
        TrainingDetailDao.createTable(database, z);
        CoachDao.createTable(database, z);
        TrainingCourseItemDao.createTable(database, z);
        TrainingCourseDao.createTable(database, z);
        TrainingItemDao.createTable(database, z);
        ActionVideoDao.createTable(database, z);
        ActionContentDao.createTable(database, z);
        TrainingRecordDao.createTable(database, z);
        BgMusicDao.createTable(database, z);
        HaveDoneActionDao.createTable(database, z);
        ActionAudioDao.createTable(database, z);
        TrainingHeartRateDao.createTable(database, z);
        ConfigDao.createTable(database, z);
        NormandyDataDao.createTable(database, z);
        MyShoesDao.createTable(database, z);
        FbtThaResultDao.createTable(database, z);
        ActivetrackDistanceDao.createTable(database, z);
        ActiveMiPlusShoesDao.createTable(database, z);
        AtrialFibrillationDataItemDao.createTable(database, z);
        DetailDao.createTable(database, z);
        FriendMessageDao.createTable(database, z);
        HeartRateDao.createTable(database, z);
        EarbudDateDataDao.createTable(database, z);
        EarbudMusicInfoDao.createTable(database, z);
        WatchSkinDao.createTable(database, z);
        UserScaleInfoDao.createTable(database, z);
    }

    public static void dropAllTables(Database database, boolean z) {
        DateDataDao.dropTable(database, z);
        HmPropertyDao.dropTable(database, z);
        NewCaloriesDao.dropTable(database, z);
        SensorDataDao.dropTable(database, z);
        RunconfigDao.dropTable(database, z);
        FriendDao.dropTable(database, z);
        ActivetrackStepDao.dropTable(database, z);
        LaunchEntityDao.dropTable(database, z);
        TrackrecordDao.dropTable(database, z);
        TrackhrDao.dropTable(database, z);
        ActivetrackBarDao.dropTable(database, z);
        LabActionDao.dropTable(database, z);
        RecomendedUserDao.dropTable(database, z);
        CirclePostDao.dropTable(database, z);
        FwDwonSuccessInfoDao.dropTable(database, z);
        ManualDataDao.dropTable(database, z);
        AlarmDao.dropTable(database, z);
        ActivetrackDao.dropTable(database, z);
        TrackdeathbookDao.dropTable(database, z);
        ActivetrackhrDao.dropTable(database, z);
        ReminderDao.dropTable(database, z);
        AdEntityDao.dropTable(database, z);
        WeightInfosDao.dropTable(database, z);
        DeviceDao.dropTable(database, z);
        TrackdataDao.dropTable(database, z);
        PushDao.dropTable(database, z);
        MedalDao.dropTable(database, z);
        DismissAdvDao.dropTable(database, z);
        ShoesDataDao.dropTable(database, z);
        UserInfosDao.dropTable(database, z);
        CompareModelDao.dropTable(database, z);
        WeightGoalsDao.dropTable(database, z);
        TrackstatisticsDao.dropTable(database, z);
        ShoesPartnersDao.dropTable(database, z);
        FbtEteResultDao.dropTable(database, z);
        TrainingDetailDao.dropTable(database, z);
        CoachDao.dropTable(database, z);
        TrainingCourseItemDao.dropTable(database, z);
        TrainingCourseDao.dropTable(database, z);
        TrainingItemDao.dropTable(database, z);
        ActionVideoDao.dropTable(database, z);
        ActionContentDao.dropTable(database, z);
        TrainingRecordDao.dropTable(database, z);
        BgMusicDao.dropTable(database, z);
        HaveDoneActionDao.dropTable(database, z);
        ActionAudioDao.dropTable(database, z);
        TrainingHeartRateDao.dropTable(database, z);
        ConfigDao.dropTable(database, z);
        NormandyDataDao.dropTable(database, z);
        MyShoesDao.dropTable(database, z);
        FbtThaResultDao.dropTable(database, z);
        ActivetrackDistanceDao.dropTable(database, z);
        ActiveMiPlusShoesDao.dropTable(database, z);
        AtrialFibrillationDataItemDao.dropTable(database, z);
        DetailDao.dropTable(database, z);
        FriendMessageDao.dropTable(database, z);
        HeartRateDao.dropTable(database, z);
        EarbudDateDataDao.dropTable(database, z);
        EarbudMusicInfoDao.dropTable(database, z);
        WatchSkinDao.dropTable(database, z);
        UserScaleInfoDao.dropTable(database, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> getDaoConfigMap() {
        return Collections.unmodifiableMap(this.daoConfigMap);
    }

    public DaoMaster(Database database) {
        super(database, 177);
        registerDaoClass(DateDataDao.class);
        registerDaoClass(HmPropertyDao.class);
        registerDaoClass(NewCaloriesDao.class);
        registerDaoClass(SensorDataDao.class);
        registerDaoClass(RunconfigDao.class);
        registerDaoClass(FriendDao.class);
        registerDaoClass(ActivetrackStepDao.class);
        registerDaoClass(LaunchEntityDao.class);
        registerDaoClass(TrackrecordDao.class);
        registerDaoClass(TrackhrDao.class);
        registerDaoClass(ActivetrackBarDao.class);
        registerDaoClass(LabActionDao.class);
        registerDaoClass(RecomendedUserDao.class);
        registerDaoClass(CirclePostDao.class);
        registerDaoClass(FwDwonSuccessInfoDao.class);
        registerDaoClass(ManualDataDao.class);
        registerDaoClass(AlarmDao.class);
        registerDaoClass(ActivetrackDao.class);
        registerDaoClass(TrackdeathbookDao.class);
        registerDaoClass(ActivetrackhrDao.class);
        registerDaoClass(ReminderDao.class);
        registerDaoClass(AdEntityDao.class);
        registerDaoClass(WeightInfosDao.class);
        registerDaoClass(DeviceDao.class);
        registerDaoClass(TrackdataDao.class);
        registerDaoClass(PushDao.class);
        registerDaoClass(MedalDao.class);
        registerDaoClass(DismissAdvDao.class);
        registerDaoClass(ShoesDataDao.class);
        registerDaoClass(UserInfosDao.class);
        registerDaoClass(CompareModelDao.class);
        registerDaoClass(WeightGoalsDao.class);
        registerDaoClass(TrackstatisticsDao.class);
        registerDaoClass(ShoesPartnersDao.class);
        registerDaoClass(FbtEteResultDao.class);
        registerDaoClass(TrainingDetailDao.class);
        registerDaoClass(CoachDao.class);
        registerDaoClass(TrainingCourseItemDao.class);
        registerDaoClass(TrainingCourseDao.class);
        registerDaoClass(TrainingItemDao.class);
        registerDaoClass(ActionVideoDao.class);
        registerDaoClass(ActionContentDao.class);
        registerDaoClass(TrainingRecordDao.class);
        registerDaoClass(BgMusicDao.class);
        registerDaoClass(HaveDoneActionDao.class);
        registerDaoClass(ActionAudioDao.class);
        registerDaoClass(TrainingHeartRateDao.class);
        registerDaoClass(ConfigDao.class);
        registerDaoClass(NormandyDataDao.class);
        registerDaoClass(MyShoesDao.class);
        registerDaoClass(FbtThaResultDao.class);
        registerDaoClass(ActivetrackDistanceDao.class);
        registerDaoClass(ActiveMiPlusShoesDao.class);
        registerDaoClass(AtrialFibrillationDataItemDao.class);
        registerDaoClass(DetailDao.class);
        registerDaoClass(FriendMessageDao.class);
        registerDaoClass(HeartRateDao.class);
        registerDaoClass(EarbudDateDataDao.class);
        registerDaoClass(EarbudMusicInfoDao.class);
        registerDaoClass(WatchSkinDao.class);
        registerDaoClass(UserScaleInfoDao.class);
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
