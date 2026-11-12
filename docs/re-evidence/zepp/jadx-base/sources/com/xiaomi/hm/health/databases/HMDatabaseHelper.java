package com.xiaomi.hm.health.databases;

import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoesDao;
import com.xiaomi.hm.health.databases.model.ActivetrackBarDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDistanceDao;
import com.xiaomi.hm.health.databases.model.ActivetrackStepDao;
import com.xiaomi.hm.health.databases.model.ActivetrackhrDao;
import com.xiaomi.hm.health.databases.model.AdEntityDao;
import com.xiaomi.hm.health.databases.model.CompareModelDao;
import com.xiaomi.hm.health.databases.model.DetailDao;
import com.xiaomi.hm.health.databases.model.DeviceDao;
import com.xiaomi.hm.health.databases.model.DismissAdvDao;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.databases.model.FbtEteResultDao;
import com.xiaomi.hm.health.databases.model.FbtThaResultDao;
import com.xiaomi.hm.health.databases.model.FriendDao;
import com.xiaomi.hm.health.databases.model.FriendMessageDao;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfoDao;
import com.xiaomi.hm.health.databases.model.HmPropertyDao;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.databases.model.LaunchEntityDao;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.databases.model.MedalDao;
import com.xiaomi.hm.health.databases.model.NewCaloriesDao;
import com.xiaomi.hm.health.databases.model.NormandyDataDao;
import com.xiaomi.hm.health.databases.model.PushDao;
import com.xiaomi.hm.health.databases.model.ReminderDao;
import com.xiaomi.hm.health.databases.model.RunconfigDao;
import com.xiaomi.hm.health.databases.model.SensorDataDao;
import com.xiaomi.hm.health.databases.model.TrackdataDao;
import com.xiaomi.hm.health.databases.model.TrackdeathbookDao;
import com.xiaomi.hm.health.databases.model.TrackhrDao;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.hm.health.databases.model.TrackstatisticsDao;
import com.xiaomi.hm.health.databases.model.UserInfosDao;
import com.xiaomi.hm.health.databases.model.UserScaleInfoDao;
import com.xiaomi.hm.health.databases.model.WatchSkinDao;
import com.xiaomi.hm.health.databases.model.WeightGoalsDao;
import com.xiaomi.hm.health.databases.model.autobuild.AtrialFibrillationDataItemDao;
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
import org.greenrobot.greendao.database.Database;

/* JADX INFO: loaded from: classes20.dex */
public class HMDatabaseHelper {
    private static final int A = 59;
    private static final int A0 = 111;
    private static final int A1 = 176;
    private static final int B = 60;
    private static final int B0 = 112;
    private static final int B1 = 177;
    private static final int C = 61;
    private static final int C0 = 113;
    private static final int D = 62;
    private static final int D0 = 114;
    private static final int E = 63;
    private static final int E0 = 115;
    private static final int F = 64;
    private static final int F0 = 116;
    private static final int G = 65;
    private static final int G0 = 117;
    private static final int H = 66;
    private static final int H0 = 118;
    private static final int I = 67;
    private static final int I0 = 119;
    private static final int J = 68;
    private static final int J0 = 120;
    private static final int K = 69;
    private static final int K0 = 121;
    private static final int L = 70;
    private static final int L0 = 122;
    private static final int M = 71;
    private static final int M0 = 123;
    private static final int N = 72;
    private static final int N0 = 124;
    private static final int O = 73;
    private static final int O0 = 125;
    private static final int P = 74;
    private static final int P0 = 126;
    private static final int Q = 75;
    private static final int Q0 = 127;
    private static final int R = 76;
    private static final int R0 = 128;
    private static final int S = 77;
    private static final int S0 = 129;
    private static final int T = 78;
    private static final int T0 = 130;
    private static final int U = 79;
    private static final int U0 = 131;
    private static final int V = 80;
    private static final int V0 = 132;
    private static final int W = 81;
    private static final int W0 = 134;
    private static final int X = 82;
    private static final int X0 = 135;
    private static final int Y = 83;
    private static final int Y0 = 136;
    private static final int Z = 84;
    private static final int Z0 = 137;
    private static final String a = "origin_db";
    private static final int a0 = 85;
    private static final int a1 = 138;
    public static final String b = "default";
    private static final int b0 = 86;
    private static final int b1 = 139;
    private static final int c = 34;
    private static final int c0 = 87;
    private static final int c1 = 140;
    private static final int d = 35;
    private static final int d0 = 88;
    private static final int d1 = 142;
    private static final int e = 36;
    private static final int e0 = 89;
    private static final int e1 = 143;
    private static final int f = 37;
    private static final int f0 = 90;
    private static final int f1 = 147;
    private static final int g = 38;
    private static final int g0 = 91;
    private static final int g1 = 149;
    private static final int h = 39;
    private static final int h0 = 92;
    private static final int h1 = 150;
    private static final int i = 40;
    private static final int i0 = 93;
    private static final int i1 = 151;
    private static final int j = 41;
    private static final int j0 = 94;
    private static final int j1 = 152;
    private static final int k = 42;
    private static final int k0 = 95;
    private static final int k1 = 153;
    private static final int l = 43;
    private static final int l0 = 96;
    private static final int l1 = 154;
    private static final int m = 44;
    private static final int m0 = 97;
    private static final int m1 = 155;
    private static final int n = 45;
    private static final int n0 = 98;
    private static final int n1 = 156;
    private static final int o = 46;
    private static final int o0 = 99;
    private static final int o1 = 157;
    private static final int p = 47;
    private static final int p0 = 100;
    private static final int p1 = 158;
    private static final int q = 48;
    private static final int q0 = 101;
    private static final int q1 = 163;
    private static final int r = 49;
    private static final int r0 = 102;
    private static final int r1 = 162;
    private static final int s = 50;
    private static final int s0 = 103;
    private static final int s1 = 165;
    private static final int t = 51;
    private static final int t0 = 104;
    private static final int t1 = 168;
    private static final int u = 53;
    private static final int u0 = 105;
    private static final int u1 = 169;
    private static final int v = 54;
    private static final int v0 = 106;
    private static final int v1 = 170;
    private static final int w = 55;
    private static final int w0 = 107;
    private static final int w1 = 171;
    private static final int x = 56;
    private static final int x0 = 108;
    private static final int x1 = 173;
    private static final int y = 57;
    private static final int y0 = 109;
    private static final int y1 = 174;
    private static final int z = 58;
    private static final int z0 = 110;
    private static final int z1 = 175;

    public static void onUpgrade(Database database, int i2, int i3) {
        if (i3 >= 34 && i2 < 34) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'SCREEN_LOCK' INTEGER");
        }
        if (i3 >= 35 && i2 < 35) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'PRO_DISPLAY' BYTE");
        }
        if (i3 >= 36 && i2 < 36) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'SEDENTARY_REMIND' TEXT");
        }
        if (i3 >= 37 && i2 < 37) {
            database.execSQL("ALTER TABLE 'DEVICE' ADD 'MIGRATE_DEVICE' INTEGER");
        }
        if (i3 >= 38 && i2 < 38) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'EMAIL_NOTIFY_ENABLED' BOOLEAN");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'LIFT_WRIST_BRIGHT_VIEW' BOOLEAN");
            database.execSQL("ALTER TABLE 'ALARM' ADD 'VISIBLE' BOOLEAN");
        }
        if (i3 >= 39 && i2 < 39) {
            database.execSQL("ALTER TABLE 'DEVICE' ADD 'DEVICE_SYNC_DATA_TIME_HR' LONG");
            database.execSQL("ALTER TABLE 'DEVICE' ADD 'TIME_ZONE_SYNC_HR' INTEGER");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'GOAL_REMIND' BOOLEAN");
        }
        if (i3 >= 40 && i2 < 40) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'AVOID_DISTURD_MODE' BOOLEAN");
        }
        if (i3 >= 41 && i2 < 41) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'IOSAPP_NOTIFY_SETTINGS' TEXT");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'ANDROIDAPP_NOTIFY_SETTINGS' TEXT");
        }
        if (i3 >= 42 && i2 < 42) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'QUIET_MODE' TEXT");
        }
        if (i3 >= 43 && i2 < 43) {
            database.execSQL("ALTER TABLE 'DATE_DATA' ADD 'USER_SUMMARY' TEXT");
        }
        if (i3 >= 44 && i2 < 44) {
            ManualDataDao.createTable(database, true);
        }
        if (i3 >= 45 && i2 < 45) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'UNLOCK_SCREEN_TYPE' INTEGER");
        }
        if (i3 >= 46 && i2 < 46) {
            DismissAdvDao.createTable(database, true);
        }
        if (i3 >= 47 && i2 < 47) {
            ActivetrackDao.createTable(database, true);
            ActivetrackhrDao.createTable(database, true);
            RunconfigDao.createTable(database, true);
            TrackdataDao.createTable(database, true);
            TrackdeathbookDao.createTable(database, true);
            TrackhrDao.createTable(database, true);
            TrackrecordDao.createTable(database, true);
            TrackstatisticsDao.createTable(database, true);
        }
        if (i3 >= 48 && i2 < 48) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'TIME_PANEL_TYPE' INTEGER");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'TIME_PANEL_LANG' INTEGER");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'ANTI_LOST' BOOLEAN");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'IS_NOTIFICATION_ON' BOOLEAN");
            NormandyDataDao.createTable(database, true);
        }
        if (i3 >= 49 && i2 < 49) {
            ActivetrackStepDao.createTable(database, true);
            ActivetrackBarDao.createTable(database, true);
            ActivetrackDistanceDao.createTable(database, true);
        }
        if (i3 >= 50 && i2 < 50) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'CHECK_NOTIFICATION' BOOLEAN");
        }
        if (i3 >= 51 && i2 < 51) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'FLIP_WRIST' BOOLEAN");
            b.d().b(database, ManualDataDao.class);
            ManualDataDao.dropTable(database, true);
            ManualDataDao.createTable(database, false);
            b.d().g(database, ManualDataDao.class);
        }
        if (i3 >= 53 && i2 < 53) {
            try {
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'LOCK_SCREEN_DISPLAY' BOOLEAN");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (i3 >= 54 && i2 < 54) {
            database.execSQL("ALTER TABLE 'DEVICE' ADD 'STATUS' INTEGER");
        }
        if (i3 >= 55 && i2 < 55) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'INCALL_NAME_DISPLAY_ENABLED' BOOLEAN");
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'SMS_NAME_DISPLAY_ENABLED' BOOLEAN");
        }
        if (i3 >= 56 && i2 < 56) {
            FwDwonSuccessInfoDao.createTable(database, true);
        }
        if (i3 >= 57 && i2 < 57) {
            try {
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'INDOOR_MODEL_ARRAY' TEXT");
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'STEP_LENGTH_ARRAY' TEXT");
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (i3 >= 58 && i2 < 58) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DISASCEND' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'MAX_CADENCE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'AVG_CADENCE' INTEGER");
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        if (i3 >= 59 && i2 < 59) {
            try {
                database.execSQL("ALTER TABLE 'ACTIVETRACK_STEP' ADD 'STEP_FREQ' REAL");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (i3 >= 60 && i2 < 60) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'SHOE_PLACE_MODE' TEXT");
        }
        if (i3 >= 61 && i2 < 61) {
            SensorDataDao.createTable(database, true);
            LabActionDao.createTable(database, true);
        }
        if (i3 >= 62 && i2 < 62) {
            try {
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'SOURCE' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'IMPEDANCE' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'BMI' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'HEIGHT' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'BODY_FAT' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'MUSCLE' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'BODY_SHAPE_TYPE' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'MOISTURE' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'BASAL_METABOLISM' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'VISCERAL_FAT' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'BONE_MASS' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'SCORE' INTEGER");
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'WEIGHT_BFS_UNIT' INTEGER");
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        if (i3 >= 63 && i2 < 63) {
            try {
                database.execSQL("ALTER TABLE 'SENSOR_DATA' ADD 'RESOLUTION' TEXT");
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        if (i3 >= 64 && i2 < 64) {
            try {
                ActiveMiPlusShoesDao.createTable(database, true);
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'KEEP_SCREEN_ON' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'LANDING_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'FLIGHT_RATIO' INTEGER");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (i3 >= 65 && i2 < 65) {
            try {
                ActiveMiPlusShoesDao.createTable(database, true);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_DESCEND' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_ASCEND_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_DESCEND_TIME' INTEGER");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (i3 >= 66 && i2 < 66) {
            try {
                DetailDao.createTable(database, true);
                FriendDao.createTable(database, true);
                FriendMessageDao.createTable(database, true);
                PushDao.createTable(database, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (i3 >= 67 && i2 < 67) {
            try {
                b.d().b(database, DeviceDao.class);
                DeviceDao.dropTable(database, true);
                DeviceDao.createTable(database, false);
                b.d().g(database, DeviceDao.class);
                b.d().b(database, LabActionDao.class);
                LabActionDao.dropTable(database, true);
                LabActionDao.createTable(database, false);
                b.d().g(database, LabActionDao.class);
                b.d().b(database, UserInfosDao.class);
                UserInfosDao.dropTable(database, true);
                UserInfosDao.createTable(database, false);
                b.d().g(database, UserInfosDao.class);
                b.d().b(database, WeightGoalsDao.class);
                WeightGoalsDao.dropTable(database, true);
                WeightGoalsDao.createTable(database, false);
                b.d().g(database, WeightGoalsDao.class);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        if (i3 >= 68 && i2 < 68) {
            try {
                database.execSQL("ALTER TABLE 'ALARM' ADD 'IS_SMART_WAKEUP' INTEGER");
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        if (i3 >= 69 && i2 < 69) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_DESCEND' INTEGER");
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_ASCEND_TIME' INTEGER");
            } catch (Exception e15) {
                e15.printStackTrace();
            }
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CLIMB_DIS_DESCEND_TIME' INTEGER");
            } catch (Exception e16) {
                e16.printStackTrace();
            }
        }
        if (i3 >= 70 && i2 < 70) {
            try {
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'WHOLE_HEART_RATE' BOOLEAN");
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'DIAL_SETTING' INTEGER");
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'LONG_PRESS_SETTINGS' INTEGER");
            } catch (Exception e17) {
                e17.printStackTrace();
            }
        }
        if (i3 >= 71 && i2 < 71) {
            try {
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'HR_DETECT_TYPE' INTEGER");
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'WEATHER_SETTING' TEXT");
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'WATCH_APPS' TEXT");
            } catch (Exception e18) {
                e18.printStackTrace();
            }
        }
        if (i3 >= 72 && i2 < 72) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'GPS_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'GPS_SYNC_TIMEZONE' INTEGER");
            } catch (Exception e19) {
                e19.printStackTrace();
            }
        }
        if (i3 >= 73 && i2 < 73) {
            try {
                CompareModelDao.createTable(database, true);
            } catch (Exception e20) {
                e20.printStackTrace();
            }
        }
        if (i3 >= 74 && i2 < 74) {
            try {
                TrainingRecordDao.createTable(database, true);
                TrainingItemDao.createTable(database, true);
                TrainingHeartRateDao.createTable(database, true);
                TrainingDetailDao.createTable(database, true);
                TrainingCourseDao.createTable(database, true);
                TrainingCourseItemDao.createTable(database, true);
                HaveDoneActionDao.createTable(database, true);
                CoachDao.createTable(database, true);
                ActionVideoDao.createTable(database, true);
                ActionContentDao.createTable(database, true);
                ActionAudioDao.createTable(database, true);
            } catch (Exception e21) {
                e21.printStackTrace();
            }
        }
        if (i3 >= 75 && i2 < 75) {
            try {
                AdEntityDao.createTable(database, true);
            } catch (Exception e22) {
                e22.printStackTrace();
            }
        }
        if (i3 >= 76 && i2 < 76) {
            try {
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'LIFT_WRIST_TIME' TEXT");
            } catch (Exception e23) {
                e23.printStackTrace();
            }
        }
        if (i3 >= 77 && i2 < 77) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'PRODUCT_VERSION' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'Resource' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'RESOURCE_VERSION_CODE' INTEGER");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'RESOURCE_PATH' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'RESOURCE_NAME' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'GPS' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'GPS_VERSION_CODE' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'GPS_PATH' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'GPS_NAME' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'FONT' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'FONT_VERSION_CODE' INTEGER");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'FONT_PATH' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'FONT_NAME' TEXT");
            } catch (Exception e24) {
                e24.printStackTrace();
            }
        }
        if (i3 >= 78 && i2 < 78) {
            try {
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'HR_DETECT_FREQ' INTEGER");
            } catch (Exception e25) {
                e25.printStackTrace();
            }
        }
        if (i3 >= 79 && i2 < 79) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'JSBRIDGE_AUTH' INTEGER");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'SUPPORT_TYPE' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'END_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'BADGE' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'DISPLAY_COUNT' INTEGER");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'CREATE_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'CATEGORY' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'IS_VALIDITY' INTEGER");
            } catch (Exception e26) {
                e26.printStackTrace();
            }
        }
        if (i3 >= 80 && i2 < 80) {
            try {
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'DOWNLOADED' INTEGER");
            } catch (Exception e27) {
                e27.printStackTrace();
            }
        }
        if (i3 >= 81 && i2 < 81) {
            try {
                LaunchEntityDao.createTable(database, true);
            } catch (Exception e28) {
                e28.printStackTrace();
            }
        }
        if (i3 >= 82 && i2 < 82) {
            database.execSQL("ALTER TABLE 'CONFIG' ADD 'DISCONNECT_REMIND' TEXT");
        }
        if (i3 >= 83 && i2 < 83) {
            try {
                MedalDao.createTable(database, true);
            } catch (Exception e29) {
                e29.printStackTrace();
            }
        }
        if (i3 >= 84 && i2 < 84) {
            try {
                ReminderDao.createTable(database, true);
            } catch (Exception e30) {
                e30.printStackTrace();
            }
        }
        if (i3 >= 85 && i2 < 85) {
            try {
                database.execSQL("ALTER TABLE 'REMINDER' ADD 'STATUS' INTEGER");
            } catch (Exception e31) {
                e31.printStackTrace();
            }
        }
        if (i3 >= 86 && i2 < 86) {
            try {
                b.d().b(database, ReminderDao.class);
                ReminderDao.dropTable(database, true);
                ReminderDao.createTable(database, false);
                b.d().g(database, ReminderDao.class);
            } catch (Exception e32) {
                e32.printStackTrace();
            }
        }
        if (i3 >= 87 && i2 < 87) {
            try {
                database.execSQL("ALTER TABLE 'ALARM' ADD 'INDEX' INTEGER");
                database.execSQL("UPDATE ALARM SET 'INDEX' = _id");
            } catch (Exception e33) {
                e33.printStackTrace();
            }
        }
        if (i3 >= 88 && i2 < 88) {
            ReminderDao.dropTable(database, true);
            ReminderDao.createTable(database, false);
        }
        if (i3 >= 89 && i2 < 89) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'FORCE_UPGRADE' INTEGER");
            } catch (Exception e34) {
                e34.printStackTrace();
            }
        }
        if (i3 >= 90 && i2 < 90) {
            try {
                database.execSQL("ALTER TABLE 'CONFIG' ADD 'PHONE_NOTIFY_DELAY_ENABLE' INTEGER");
            } catch (Exception e35) {
                e35.printStackTrace();
            }
        }
        if (i3 >= 91 && i2 < 91) {
            try {
                database.execSQL("ALTER TABLE 'ALARM' ADD 'IS_SMART' INTEGER");
            } catch (Exception e36) {
                e36.printStackTrace();
            }
        }
        if (i3 >= 92 && i2 < 92) {
            try {
                HmPropertyDao.createTable(database, true);
            } catch (Exception e37) {
                e37.printStackTrace();
            }
        }
        if (i3 >= 93 && i2 < 93) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ACTIVE_STATUS' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'DISPLAY_NAME' TEXT");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PRODUCT_ID' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PRODUCT_VERSION' INTEGER");
            } catch (Exception e38) {
                e38.printStackTrace();
            }
        }
        if (i3 >= 94 && i2 < 94) {
            try {
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'CHOOSE_MAP' INTEGER");
            } catch (Exception e39) {
                e39.printStackTrace();
            }
        }
        if (i3 >= 95 && i2 < 95) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'BRAND_TYPE' INTEGER");
            } catch (Exception e40) {
                e40.printStackTrace();
            }
        }
        if (i3 >= 96 && i2 < 96) {
            try {
                BgMusicDao.createTable(database, false);
            } catch (Exception e41) {
                e41.printStackTrace();
            }
        }
        if (i3 >= 97 && i2 < 97) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'PARENT_TRACK_ID' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'CHILD_LIST_DATA' TEXT");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'MAX_HR' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'MIN_HR' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'UNIT' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'TE_VALUE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_SWOLF' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_STROKES' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_TURNS' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_AVG_STROKE_SPEED' REAL");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_MAX_STROKE_SPEED' REAL");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_DISTANCE_PER_STROKE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_POOL_LENGTH' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'SWIM_STYLE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'CORRECT_ALTITUDE' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'STROKE_SPEED' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'CADENCE' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'DAILY_PERFORMANCE' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'LAP' TEXT");
            } catch (Exception e42) {
                e42.printStackTrace();
            }
        }
        if (i3 >= 98 && i2 < 98) {
            try {
                database.execSQL("ALTER TABLE 'LAUNCH_ENTITY' ADD 'BG_VIDEO_URL' TEXT");
            } catch (Exception e43) {
                e43.printStackTrace();
            }
        }
        if (i3 >= 99 && i2 < 99) {
            try {
                database.execSQL("ALTER TABLE 'TRAINING_ITEM' ADD 'TRAINING_TYPE' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_DETAIL' ADD 'TRAINING_TYPE' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_DETAIL' ADD 'YOGA_URL' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_DETAIL' ADD 'VIDEO_SIZE' INTEGER");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'TRAINING_TYPE' TEXT");
            } catch (Exception e44) {
                e44.printStackTrace();
            }
        }
        if (i3 >= 100 && i2 < 100) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' RENAME TO 'TRACKRECORD_TEMP'");
                TrackrecordDao.createTable(database, true);
                b.d().a(database, TrackrecordDao.class);
            } catch (Exception e45) {
                e45.printStackTrace();
            }
        }
        if (i3 >= 101 && i2 < 101) {
            try {
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'BULKSPEED' TEXT");
            } catch (Exception e46) {
                e46.printStackTrace();
            }
        }
        if (i3 >= 102 && i2 < 102) {
            try {
                database.execSQL("ALTER TABLE 'ACTIVETRACK' ADD 'SPEED' REAL");
            } catch (Exception e47) {
                e47.printStackTrace();
            }
        }
        if (i3 >= 103 && i2 < 103) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'BG_IMG_URL' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'COLOR_STR' TEXT");
            } catch (Exception e48) {
                e48.printStackTrace();
            }
        }
        if (i3 >= 104 && i2 < 104) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'INDOOR_RUN_CALIBRATED' INTEGER");
            } catch (Exception e49) {
                e49.printStackTrace();
            }
        }
        if (i3 >= 105 && i2 < 105) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'JUMP_STR' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'FG_LOGO_URL' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'BG_BODY_URL' TEXT");
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'FG_BANNER_URL' TEXT");
            } catch (Exception e50) {
                e50.printStackTrace();
            }
        }
        if (i3 >= 106 && i2 < 106) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'HOME_COLOR' TEXT");
            } catch (Exception e51) {
                e51.printStackTrace();
            }
        }
        if (i3 >= 107 && i2 < 107) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'ASSETS' TEXT");
            } catch (Exception e52) {
                e52.printStackTrace();
            }
        }
        if (i3 >= 108 && i2 < 108) {
            try {
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'OFMT' REAL");
            } catch (Exception e53) {
                e53.printStackTrace();
            }
        }
        if (i3 >= 109 && i2 < 109) {
            try {
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'MA' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'PMR' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'SBW' REAL");
            } catch (Exception e54) {
                e54.printStackTrace();
            }
        }
        if (i3 >= 110 && i2 < 110) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'AD_MONITOR' TEXT");
                database.execSQL("ALTER TABLE 'LAUNCH_ENTITY' ADD 'EXTENSIONS' TEXT");
            } catch (Exception e55) {
                e55.printStackTrace();
            }
        }
        if (i3 >= 111 && i2 < 111) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'CHANGE_LOG' TEXT");
            } catch (Exception e56) {
                e56.printStackTrace();
            }
        }
        if (i3 >= 112 && i2 < 112) {
            try {
                database.execSQL("ALTER TABLE 'TRAINING_ITEM' ADD 'ACTION_AMOUNT' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'FINISHED_VIDEOS' TEXT");
            } catch (Exception e57) {
                e57.printStackTrace();
            }
        }
        if (i3 >= 113 && i2 < 113) {
            try {
                NewCaloriesDao.createTable(database, true);
            } catch (Exception e58) {
                e58.printStackTrace();
            }
        }
        if (i3 >= 114 && i2 < 114) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'HARDWARE_VERSION' TEXT");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PAI_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PAI_SYNC_TIME_ZONE' INTEGER");
            } catch (Exception e59) {
                e59.printStackTrace();
            }
        }
        if (i3 >= 115 && i2 < 115) {
            try {
                FbtEteResultDao.createTable(database, false);
                FbtThaResultDao.createTable(database, false);
            } catch (Exception e60) {
                e60.printStackTrace();
            }
        }
        if (i3 >= 116 && i2 < 116) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'LEFT_LANDING_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'LEFT_FLIGHT_RATIO' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'RIGHT_LANDING_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'RIGHT_FLIGHT_RATIO' INTEGER");
                database.execSQL("ALTER TABLE 'ACTIVE_MI_PLUS_SHOES' ADD 'LEFT_RIGHT' INTEGER");
            } catch (Exception e61) {
                e61.printStackTrace();
            }
        }
        if (i3 >= 117 && i2 < 117) {
            try {
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'CHOOSE_DEVICES' TEXT");
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'DEVICES_COUNT' INTEGER");
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'DATA_ITEMS' TEXT");
            } catch (Exception e62) {
                e62.printStackTrace();
            }
        }
        if (i3 >= 118 && i2 < 118) {
            try {
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'AUTO_PAUSE_PACE' INTEGER");
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'BEAT_ENABLE' INTEGER");
                database.execSQL("ALTER TABLE 'RUNCONFIG' ADD 'BEAT_VALUE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'ADD_INFO' TEXT");
            } catch (Exception e63) {
                e63.printStackTrace();
            }
        }
        if (i3 >= 119 && i2 < 119) {
            try {
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'COACH_SEGMENT' TEXT");
            } catch (Exception e64) {
                e64.printStackTrace();
            }
        }
        if (i3 >= 120 && i2 < 120) {
            try {
                RecomendedUserDao.createTable(database, false);
                CirclePostDao.createTable(database, false);
            } catch (Exception e65) {
                e65.printStackTrace();
            }
        }
        if (i3 >= 121 && i2 < 121) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'CLASSIFY_NAME' TEXT");
            } catch (Exception e66) {
                e66.printStackTrace();
            }
        }
        if (i3 >= 122 && i2 < 122) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'START_TIME' INTEGER");
            } catch (Exception e67) {
                e67.printStackTrace();
            }
        }
        if (i3 >= 123 && i2 < 123) {
            try {
                database.execSQL("ALTER TABLE 'TRAINING_DETAIL' RENAME TO 'TRAINING_DETAIL_20190305'");
                TrainingDetailDao.createTable(database, false);
                String[] strArr = {TrainingDetailDao.Properties.TrainingId.columnName, TrainingDetailDao.Properties.Name.columnName, TrainingDetailDao.Properties.Consumption.columnName, TrainingDetailDao.Properties.ParticipantNumber.columnName, TrainingDetailDao.Properties.Instrument.columnName, TrainingDetailDao.Properties.SuitableGender.columnName, TrainingDetailDao.Properties.Function.columnName, TrainingDetailDao.Properties.Location.columnName, TrainingDetailDao.Properties.Time.columnName, TrainingDetailDao.Properties.UpdateTime.columnName, TrainingDetailDao.Properties.DetailsPageIllustrated.columnName, TrainingDetailDao.Properties.ListPageIllustrated.columnName, TrainingDetailDao.Properties.Introduction.columnName, TrainingDetailDao.Properties.DifficultyDegree.columnName, TrainingDetailDao.Properties.CoachGender.columnName, TrainingDetailDao.Properties.Status.columnName, TrainingDetailDao.Properties.FinishNumber.columnName, TrainingDetailDao.Properties.CoachId.columnName, TrainingDetailDao.Properties.TrainingType.columnName, TrainingDetailDao.Properties.YogaUrl.columnName, TrainingDetailDao.Properties.VideoSize.columnName};
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < 21; i4++) {
                    sb.append(strArr[i4]);
                    sb.append(',');
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                String string = sb.toString();
                database.execSQL("INSERT INTO TRAINING_DETAIL (" + string + ") SELECT " + string + " FROM TRAINING_DETAIL_20190305");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TABLE IF EXISTS ");
                sb2.append("TRAINING_DETAIL_20190305");
                database.execSQL(sb2.toString());
            } catch (Exception e68) {
                e68.printStackTrace();
            }
        }
        if (i3 >= 124 && i2 < 124) {
            try {
                database.execSQL("ALTER TABLE 'CIRCLE_POST' ADD 'IMAGE_WIDTH' INTEGER");
                database.execSQL("ALTER TABLE 'CIRCLE_POST' ADD 'IMAGE_HEIGHT' INTEGER");
            } catch (Exception e69) {
                e69.printStackTrace();
            }
        }
        if (i3 >= 125 && i2 < 125) {
            try {
                database.execSQL("ALTER TABLE 'AD_ENTITY' ADD 'CLOSE_TIME' INTEGER");
            } catch (Exception e70) {
                e70.printStackTrace();
            }
        }
        if (i3 >= 126 && i2 < 126) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ADDITIONAL_INFO' TEXT");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'LAST_BINDING_PLATFORM' TEXT");
            } catch (Exception e71) {
                e71.printStackTrace();
            }
        }
        if (i3 >= 127 && i2 < 127) {
            try {
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'ORIGINAL_JSON_DATA' TEXT");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'TOUCH_STROKES' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'WEATHER_INFO' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'BULK_ROPE_SKIPPING_FREQ' TEXT");
            } catch (Exception e72) {
                e72.printStackTrace();
            }
        }
        if (i3 >= 128 && i2 < 128) {
            try {
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'LOCATION' TEXT");
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'USER_INTRODUCTION' TEXT");
                database.execSQL("ALTER TABLE 'CIRCLE_POST' ADD 'NEXT' TEXT");
            } catch (Exception e73) {
                e73.printStackTrace();
            }
        }
        if (i3 >= 129 && i2 < 129) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'BASE_RESOURCE' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'BASE_RESOURCE_VERSION_CODE' INTEGER");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'BASE_RESOURCE_PATH' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'BASE_RESOURCE_NAME' TEXT");
            } catch (Exception e74) {
                e74.printStackTrace();
            }
        }
        if (i3 >= 130 && i2 < 130) {
            try {
                database.execSQL("ALTER TABLE 'FRIEND' ADD 'TZ' INTEGER");
            } catch (Exception e75) {
                e75.printStackTrace();
            }
        }
        if (i3 >= 131 && i2 < 131) {
            try {
                database.execSQL("ALTER TABLE 'DATE_DATA' ADD 'STAGE_STEPS_SUMMARY' TEXT");
            } catch (Exception e76) {
                e76.printStackTrace();
            }
        }
        if (i3 >= 132 && i2 < 132) {
            try {
                database.execSQL("ALTER TABLE 'DETAIL' ADD 'TZ' INTEGER");
            } catch (Exception e77) {
                e77.printStackTrace();
            }
        }
        if (i3 >= 134 && i2 < 134) {
            try {
                AtrialFibrillationDataItemDao.createTable(database, false);
            } catch (Exception e78) {
                e78.printStackTrace();
            }
        }
        if (i3 >= 135 && i2 < 135) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'AF_RESULT_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'RR_INTERVAL_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PPG_SYNC_TIME' INTEGER");
            } catch (Exception e79) {
                e79.printStackTrace();
            }
        }
        if (i3 >= 136 && i2 < 136) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'AF_RESULT_SYNC_TIME_ZONE' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'RR_INTERVAL_SYNC_TIME_ZONE' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'PPG_SYNC_TIME_ZONE' INTEGER");
            } catch (Exception e80) {
                e80.printStackTrace();
            }
        }
        if (i3 >= 137 && i2 < 137) {
            try {
                database.execSQL("ALTER TABLE 'ATRIAL_FIBRILLATION_DATA_ITEM' ADD 'SYNC' INTEGER");
            } catch (Exception e81) {
                e81.printStackTrace();
            }
        }
        if (i3 >= 138 && i2 < 138) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ACC_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ACC_SYNC_TIME_ZONE' INTEGER");
            } catch (Exception e82) {
                e82.printStackTrace();
            }
        }
        if (i3 >= 139 && i2 < 139) {
            try {
                EarbudDateDataDao.createTable(database, false);
            } catch (Exception e83) {
                e83.printStackTrace();
            }
        }
        if (i3 >= 140 && i2 < 140) {
            try {
                EarbudMusicInfoDao.createTable(database, false);
            } catch (Exception e84) {
                e84.printStackTrace();
            }
        }
        if (i3 >= 142 && i2 < 142) {
            try {
                WatchSkinDao.createTable(database, false);
            } catch (Exception e85) {
                e85.printStackTrace();
            }
        }
        if (i3 >= 143 && i2 < 143) {
            try {
                database.execSQL("ALTER TABLE 'FRIEND' ADD 'DISTANCE' INTEGER");
                database.execSQL("ALTER TABLE 'FRIEND' ADD 'CALORIE' INTEGER");
                database.execSQL("ALTER TABLE 'TRACKRECORD' ADD 'FRIEND_ID' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'FRIEND_ID' TEXT");
            } catch (Exception e86) {
                e86.printStackTrace();
            }
        }
        if (i3 >= 147 && i2 < 147) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'P_SPO2_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'OSA_SPO2_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'OSA_EVENT_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ODI_SYNC_TIME' INTEGER");
            } catch (Exception e87) {
                e87.printStackTrace();
            }
        }
        if (i3 >= 149 && i2 < 149) {
            try {
                database.execSQL("ALTER TABLE TRACKRECORD RENAME TO NEW_TRACKRECORD ");
                database.execSQL("ALTER TABLE TRACKDATA RENAME TO NEW_TRACKDATA ");
                TrackrecordDao.createTable(database, true);
                TrackdataDao.createTable(database, true);
                database.execSQL("INSERT INTO TRACKRECORD  SELECT * FROM NEW_TRACKRECORD");
                database.execSQL("INSERT INTO TRACKDATA  SELECT * FROM NEW_TRACKDATA");
                database.execSQL("DROP TABLE IF EXISTS NEW_TRACKRECORD");
                database.execSQL("DROP TABLE IF EXISTS NEW_TRACKDATA");
            } catch (Exception e88) {
                e88.printStackTrace();
            }
        }
        if (i3 >= 150 && i2 < 150) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'BUILD_TIME' INTEGER");
            } catch (Exception e89) {
                e89.printStackTrace();
            }
        }
        if (i3 >= 151 && i2 < 151) {
            try {
                database.execSQL("ALTER TABLE 'FRIEND' ADD 'BIRTH_DAY' TEXT");
            } catch (Exception e90) {
                e90.printStackTrace();
            }
        }
        if (i3 >= 152 && i2 < 152) {
            try {
                database.execSQL("ALTER TABLE 'LAUNCH_ENTITY' ADD 'MODE' INTEGER");
            } catch (Exception e91) {
                e91.printStackTrace();
            }
        }
        if (i3 >= 153 && i2 < 153) {
            try {
                database.execSQL("ALTER TABLE 'ACTION_VIDEO' ADD 'ACTION_NUMBER' INTEGER");
            } catch (Exception e92) {
                e92.printStackTrace();
            }
        }
        if (i3 >= 154 && i2 < 154) {
            try {
                database.execSQL("ALTER TABLE 'ATRIAL_FIBRILLATION_DATA_ITEM' ADD 'DEVICE_ID' TEXT");
                database.execSQL("ALTER TABLE 'ATRIAL_FIBRILLATION_DATA_ITEM' ADD 'DEVICE_SN' TEXT");
                database.execSQL("ALTER TABLE 'ATRIAL_FIBRILLATION_DATA_ITEM' ADD 'DEVICE_SOURCE' INTEGER");
                database.execSQL("ALTER TABLE 'ATRIAL_FIBRILLATION_DATA_ITEM' ADD 'DEVICE_VERSION' TEXT");
            } catch (Exception e93) {
                e93.printStackTrace();
            }
        }
        if (i3 >= 155 && i2 < 155) {
            try {
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'AVATAR_ID_OF_SCALE' INTEGER");
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'MEASURE_MODE' INTEGER");
            } catch (Exception e94) {
                e94.printStackTrace();
            }
        }
        if (i3 >= 156 && i2 < 156) {
            try {
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'HEART_RATE' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'PRESSURE' INTEGER");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'SKELETAL_MUSCLE' REAL");
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'SUBCUTANEOUS_FAT' REAL");
            } catch (Exception e95) {
                e95.printStackTrace();
            }
        }
        if (i3 >= 157 && i2 < 157) {
            try {
                database.execSQL("ALTER TABLE 'ACTION_VIDEO' ADD 'ACTION_NUMBER' INTEGER");
            } catch (Exception e96) {
                e96.printStackTrace();
            }
        }
        if (i3 >= 158 && i2 < 158) {
            try {
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ECG_SYNC_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'DEVICE' ADD 'ECG_SYNC_TIME_ZONE' INTEGER");
            } catch (Exception e97) {
                e97.printStackTrace();
            }
        }
        if (i3 >= 162 && i2 < 162) {
            try {
                database.execSQL("ALTER TABLE 'DETAIL' ADD 'DT' INTEGER");
                database.execSQL("ALTER TABLE 'DETAIL' ADD 'TOTAL_SLEEP_TIME' INTEGER");
            } catch (Exception e98) {
                e98.printStackTrace();
            }
        }
        if (i3 >= 163 && i2 < 163) {
            try {
                UserScaleInfoDao.createTable(database, true);
            } catch (Exception e99) {
                e99.printStackTrace();
            }
        }
        if (i3 >= 165 && i2 < 165) {
            try {
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'BULKSPO2' TEXT");
            } catch (Exception e100) {
                e100.printStackTrace();
            }
        }
        if (i3 >= 168 && i2 < 168) {
            try {
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'EXTERNAL_RESOURCE' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'EXTERNAL_RESOURCE_VERSION_CODE' INTEGER");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'EXTERNAL_RESOURCE_PATH' TEXT");
                database.execSQL("ALTER TABLE 'FW_DWON_SUCCESS_INFO' ADD 'EXTERNAL_RESOURCE_NAME' TEXT");
            } catch (Exception e101) {
                e101.printStackTrace();
            }
        }
        if (i3 >= 169 && i2 < 169) {
            try {
                database.execSQL("ALTER TABLE 'WEIGHT_INFOS' ADD 'ENCRYPT_IMPEDANCE' INTEGER");
            } catch (Exception e102) {
                e102.printStackTrace();
            }
        }
        if (i3 >= 170 && i2 < 170) {
            try {
                database.execSQL("ALTER TABLE 'ACTION_VIDEO' ADD 'USUAL_ERROR' TEXT");
                database.execSQL("ALTER TABLE 'ACTION_VIDEO' ADD 'BREATH_GIST' TEXT");
                database.execSQL("ALTER TABLE 'ACTION_VIDEO' ADD 'CONSUMPTION' INTEGER");
            } catch (Exception e103) {
                e103.printStackTrace();
            }
        }
        if (i3 >= 171 && i2 < 171) {
            try {
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'ACTION_ID' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'ACTION_NAME' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'THUMBNAIL' TEXT");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'TRAINING_START_TIME' INTEGER");
                database.execSQL("ALTER TABLE 'TRAINING_RECORD' ADD 'TRAINING_END_TIME' INTEGER");
            } catch (Exception e104) {
                e104.printStackTrace();
            }
        }
        if (i3 >= 173 && i2 < 173) {
            try {
                database.execSQL("ALTER TABLE 'USER_INFOS' ADD 'DEFAULT_FIELDS' TEXT");
            } catch (Exception e105) {
                e105.printStackTrace();
            }
        }
        if (i3 >= 174 && i2 < 174) {
            try {
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'BULKPRESSURE' TEXT");
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'BULKTEMPERATURE' TEXT");
            } catch (Exception e106) {
                e106.printStackTrace();
            }
        }
        if (i3 >= 175 && i2 < 175) {
            try {
                database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'TIME_DELTA_ALTITUDE' TEXT");
            } catch (Exception e107) {
                e107.printStackTrace();
            }
        }
        if (i3 < 176 || i2 >= 176) {
            return;
        }
        try {
            database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'GOLF_BEAT' TEXT");
            database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'GOLF_ANGLE' TEXT");
            database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'GOLF_UP_TIME' TEXT");
            database.execSQL("ALTER TABLE 'TRACKDATA' ADD 'GOLF_DOWN_TIME' TEXT");
        } catch (Exception e108) {
            e108.printStackTrace();
        }
    }

    public static String parseNewMD5DbName(String str) {
        return "origin_db_" + a.d(str);
    }

    public static String parseOldDbName(String str) {
        return "origin_db_" + str;
    }
}
