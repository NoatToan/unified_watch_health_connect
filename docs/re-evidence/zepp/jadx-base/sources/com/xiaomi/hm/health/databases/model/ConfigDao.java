package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.account.api.HMAccountWebAPI;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ConfigDao extends AbstractDao<Config, Long> {
    public static final String TABLENAME = "CONFIG";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property AlarmNotifyEnabled = new Property(1, Boolean.class, "alarmNotifyEnabled", false, "ALARM_NOTIFY_ENABLED");
        public static final Property DayReportNoti = new Property(2, String.class, "dayReportNoti", false, "DAY_REPORT_NOTI");
        public static final Property DisconnectedReminder = new Property(3, Integer.class, "disconnectedReminder", false, "DISCONNECTED_REMINDER");
        public static final Property EnableConnectedBtAdv = new Property(4, Boolean.class, "enableConnectedBtAdv", false, "ENABLE_CONNECTED_BT_ADV");
        public static final Property GoalStepsCount = new Property(5, Integer.class, "goalStepsCount", false, "GOAL_STEPS_COUNT");
        public static final Property LightColor = new Property(6, String.class, "lightColor", false, "LIGHT_COLOR");
        public static final Property InComingCallNotifyTime = new Property(7, Integer.class, "inComingCallNotifyTime", false, "IN_COMING_CALL_NOTIFY_TIME");
        public static final Property MOpenSleepNotify = new Property(8, Boolean.class, "mOpenSleepNotify", false, "M_OPEN_SLEEP_NOTIFY");
        public static final Property SmsNotifyEnabled = new Property(9, Boolean.class, "smsNotifyEnabled", false, "SMS_NOTIFY_ENABLED");
        public static final Property IncallNotifyEnabled = new Property(10, Boolean.class, "incallNotifyEnabled", false, "INCALL_NOTIFY_ENABLED");
        public static final Property Unit = new Property(11, Integer.class, "unit", false, "UNIT");
        public static final Property Vibrate = new Property(12, Boolean.class, "vibrate", false, "VIBRATE");
        public static final Property WearHand = new Property(13, String.class, "wearHand", false, "WEAR_HAND");
        public static final Property WeightMergeResult = new Property(14, Boolean.class, "weightMergeResult", false, "WEIGHT_MERGE_RESULT");
        public static final Property WeightUnit = new Property(15, Integer.class, "weightUnit", false, "WEIGHT_UNIT");
        public static final Property SmsContactNotifyEnabled = new Property(16, Boolean.class, "smsContactNotifyEnabled", false, "SMS_CONTACT_NOTIFY_ENABLED");
        public static final Property IncallContactNotifyEnabled = new Property(17, Boolean.class, "incallContactNotifyEnabled", false, "INCALL_CONTACT_NOTIFY_ENABLED");
        public static final Property SleepAssist = new Property(18, Boolean.class, "sleepAssist", false, "SLEEP_ASSIST");
        public static final Property HasHeartRate = new Property(19, Boolean.class, "hasHeartRate", false, "HAS_HEART_RATE");
        public static final Property ScreenLock = new Property(20, Integer.class, "screenLock", false, "SCREEN_LOCK");
        public static final Property ProDisplay = new Property(21, Byte.class, "proDisplay", false, "PRO_DISPLAY");
        public static final Property SedentaryRemind = new Property(22, String.class, "sedentaryRemind", false, "SEDENTARY_REMIND");
        public static final Property EmailNotifyEnabled = new Property(23, Boolean.class, "emailNotifyEnabled", false, "EMAIL_NOTIFY_ENABLED");
        public static final Property LiftWristBrightView = new Property(24, Boolean.class, "liftWristBrightView", false, "LIFT_WRIST_BRIGHT_VIEW");
        public static final Property GoalRemind = new Property(25, Boolean.class, "goalRemind", false, "GOAL_REMIND");
        public static final Property AvoidDisturdMode = new Property(26, Boolean.class, "avoidDisturdMode", false, "AVOID_DISTURD_MODE");
        public static final Property IosappNotifySettings = new Property(27, String.class, "iosappNotifySettings", false, "IOSAPP_NOTIFY_SETTINGS");
        public static final Property AndroidappNotifySettings = new Property(28, String.class, "androidappNotifySettings", false, "ANDROIDAPP_NOTIFY_SETTINGS");
        public static final Property QuietMode = new Property(29, String.class, "quietMode", false, "QUIET_MODE");
        public static final Property UnlockScreenType = new Property(30, Integer.class, "unlockScreenType", false, "UNLOCK_SCREEN_TYPE");
        public static final Property TimePanelType = new Property(31, Integer.class, "timePanelType", false, "TIME_PANEL_TYPE");
        public static final Property TimePanelLang = new Property(32, Integer.class, "timePanelLang", false, "TIME_PANEL_LANG");
        public static final Property AntiLost = new Property(33, Boolean.class, "antiLost", false, "ANTI_LOST");
        public static final Property IsNotificationOn = new Property(34, Boolean.class, "isNotificationOn", false, "IS_NOTIFICATION_ON");
        public static final Property CheckNotification = new Property(35, Boolean.class, "checkNotification", false, "CHECK_NOTIFICATION");
        public static final Property FlipWrist = new Property(36, Boolean.class, "flipWrist", false, "FLIP_WRIST");
        public static final Property IncallNameDisplayEnabled = new Property(37, Boolean.class, "incallNameDisplayEnabled", false, "INCALL_NAME_DISPLAY_ENABLED");
        public static final Property SmsNameDisplayEnabled = new Property(38, Boolean.class, "smsNameDisplayEnabled", false, "SMS_NAME_DISPLAY_ENABLED");
        public static final Property ShoePlaceMode = new Property(39, String.class, "shoePlaceMode", false, "SHOE_PLACE_MODE");
        public static final Property WeightBfsUnit = new Property(40, Integer.class, "weightBfsUnit", false, "WEIGHT_BFS_UNIT");
        public static final Property WholeHeartRate = new Property(41, Boolean.class, "wholeHeartRate", false, "WHOLE_HEART_RATE");
        public static final Property DialSetting = new Property(42, Integer.class, "dialSetting", false, "DIAL_SETTING");
        public static final Property LongPressSettings = new Property(43, Integer.class, "longPressSettings", false, "LONG_PRESS_SETTINGS");
        public static final Property HrDetectType = new Property(44, Integer.class, "hrDetectType", false, "HR_DETECT_TYPE");
        public static final Property WeatherSetting = new Property(45, String.class, HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, false, "WEATHER_SETTING");
        public static final Property WatchApps = new Property(46, String.class, "watchApps", false, "WATCH_APPS");
        public static final Property LiftWristTime = new Property(47, String.class, "liftWristTime", false, "LIFT_WRIST_TIME");
        public static final Property HrDetectFreq = new Property(48, Integer.class, "hrDetectFreq", false, "HR_DETECT_FREQ");
        public static final Property DisconnectRemind = new Property(49, String.class, "disconnectRemind", false, "DISCONNECT_REMIND");
        public static final Property PhoneNotifyDelayEnable = new Property(50, Boolean.class, "phoneNotifyDelayEnable", false, "PHONE_NOTIFY_DELAY_ENABLE");
    }

    public ConfigDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"CONFIG\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"ALARM_NOTIFY_ENABLED\" INTEGER,\"DAY_REPORT_NOTI\" TEXT,\"DISCONNECTED_REMINDER\" INTEGER,\"ENABLE_CONNECTED_BT_ADV\" INTEGER,\"GOAL_STEPS_COUNT\" INTEGER,\"LIGHT_COLOR\" TEXT,\"IN_COMING_CALL_NOTIFY_TIME\" INTEGER,\"M_OPEN_SLEEP_NOTIFY\" INTEGER,\"SMS_NOTIFY_ENABLED\" INTEGER,\"INCALL_NOTIFY_ENABLED\" INTEGER,\"UNIT\" INTEGER,\"VIBRATE\" INTEGER,\"WEAR_HAND\" TEXT,\"WEIGHT_MERGE_RESULT\" INTEGER,\"WEIGHT_UNIT\" INTEGER,\"SMS_CONTACT_NOTIFY_ENABLED\" INTEGER,\"INCALL_CONTACT_NOTIFY_ENABLED\" INTEGER,\"SLEEP_ASSIST\" INTEGER,\"HAS_HEART_RATE\" INTEGER,\"SCREEN_LOCK\" INTEGER,\"PRO_DISPLAY\" INTEGER,\"SEDENTARY_REMIND\" TEXT,\"EMAIL_NOTIFY_ENABLED\" INTEGER,\"LIFT_WRIST_BRIGHT_VIEW\" INTEGER,\"GOAL_REMIND\" INTEGER,\"AVOID_DISTURD_MODE\" INTEGER,\"IOSAPP_NOTIFY_SETTINGS\" TEXT,\"ANDROIDAPP_NOTIFY_SETTINGS\" TEXT,\"QUIET_MODE\" TEXT,\"UNLOCK_SCREEN_TYPE\" INTEGER,\"TIME_PANEL_TYPE\" INTEGER,\"TIME_PANEL_LANG\" INTEGER,\"ANTI_LOST\" INTEGER,\"IS_NOTIFICATION_ON\" INTEGER,\"CHECK_NOTIFICATION\" INTEGER,\"FLIP_WRIST\" INTEGER,\"INCALL_NAME_DISPLAY_ENABLED\" INTEGER,\"SMS_NAME_DISPLAY_ENABLED\" INTEGER,\"SHOE_PLACE_MODE\" TEXT,\"WEIGHT_BFS_UNIT\" INTEGER,\"WHOLE_HEART_RATE\" INTEGER,\"DIAL_SETTING\" INTEGER,\"LONG_PRESS_SETTINGS\" INTEGER,\"HR_DETECT_TYPE\" INTEGER,\"WEATHER_SETTING\" TEXT,\"WATCH_APPS\" TEXT,\"LIFT_WRIST_TIME\" TEXT,\"HR_DETECT_FREQ\" INTEGER,\"DISCONNECT_REMIND\" TEXT,\"PHONE_NOTIFY_DELAY_ENABLE\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"CONFIG\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ConfigDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Config config) {
        if (config != null) {
            return config.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Config config) {
        return config.getId() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(Config config, long j) {
        config.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Config config) {
        databaseStatement.clearBindings();
        Long id = config.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Boolean alarmNotifyEnabled = config.getAlarmNotifyEnabled();
        if (alarmNotifyEnabled != null) {
            databaseStatement.bindLong(2, alarmNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        String dayReportNoti = config.getDayReportNoti();
        if (dayReportNoti != null) {
            databaseStatement.bindString(3, dayReportNoti);
        }
        Integer disconnectedReminder = config.getDisconnectedReminder();
        if (disconnectedReminder != null) {
            databaseStatement.bindLong(4, disconnectedReminder.intValue());
        }
        Boolean enableConnectedBtAdv = config.getEnableConnectedBtAdv();
        if (enableConnectedBtAdv != null) {
            databaseStatement.bindLong(5, enableConnectedBtAdv.booleanValue() ? 1L : 0L);
        }
        Integer goalStepsCount = config.getGoalStepsCount();
        if (goalStepsCount != null) {
            databaseStatement.bindLong(6, goalStepsCount.intValue());
        }
        String lightColor = config.getLightColor();
        if (lightColor != null) {
            databaseStatement.bindString(7, lightColor);
        }
        Integer inComingCallNotifyTime = config.getInComingCallNotifyTime();
        if (inComingCallNotifyTime != null) {
            databaseStatement.bindLong(8, inComingCallNotifyTime.intValue());
        }
        Boolean mOpenSleepNotify = config.getMOpenSleepNotify();
        if (mOpenSleepNotify != null) {
            databaseStatement.bindLong(9, mOpenSleepNotify.booleanValue() ? 1L : 0L);
        }
        Boolean smsNotifyEnabled = config.getSmsNotifyEnabled();
        if (smsNotifyEnabled != null) {
            databaseStatement.bindLong(10, smsNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean incallNotifyEnabled = config.getIncallNotifyEnabled();
        if (incallNotifyEnabled != null) {
            databaseStatement.bindLong(11, incallNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Integer unit = config.getUnit();
        if (unit != null) {
            databaseStatement.bindLong(12, unit.intValue());
        }
        Boolean vibrate = config.getVibrate();
        if (vibrate != null) {
            databaseStatement.bindLong(13, vibrate.booleanValue() ? 1L : 0L);
        }
        String wearHand = config.getWearHand();
        if (wearHand != null) {
            databaseStatement.bindString(14, wearHand);
        }
        Boolean weightMergeResult = config.getWeightMergeResult();
        if (weightMergeResult != null) {
            databaseStatement.bindLong(15, weightMergeResult.booleanValue() ? 1L : 0L);
        }
        Integer weightUnit = config.getWeightUnit();
        if (weightUnit != null) {
            databaseStatement.bindLong(16, weightUnit.intValue());
        }
        Boolean smsContactNotifyEnabled = config.getSmsContactNotifyEnabled();
        if (smsContactNotifyEnabled != null) {
            databaseStatement.bindLong(17, smsContactNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean incallContactNotifyEnabled = config.getIncallContactNotifyEnabled();
        if (incallContactNotifyEnabled != null) {
            databaseStatement.bindLong(18, incallContactNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean sleepAssist = config.getSleepAssist();
        if (sleepAssist != null) {
            databaseStatement.bindLong(19, sleepAssist.booleanValue() ? 1L : 0L);
        }
        Boolean hasHeartRate = config.getHasHeartRate();
        if (hasHeartRate != null) {
            databaseStatement.bindLong(20, hasHeartRate.booleanValue() ? 1L : 0L);
        }
        Integer screenLock = config.getScreenLock();
        if (screenLock != null) {
            databaseStatement.bindLong(21, screenLock.intValue());
        }
        Byte proDisplay = config.getProDisplay();
        if (proDisplay != null) {
            databaseStatement.bindLong(22, proDisplay.byteValue());
        }
        String sedentaryRemind = config.getSedentaryRemind();
        if (sedentaryRemind != null) {
            databaseStatement.bindString(23, sedentaryRemind);
        }
        Boolean emailNotifyEnabled = config.getEmailNotifyEnabled();
        if (emailNotifyEnabled != null) {
            databaseStatement.bindLong(24, emailNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean liftWristBrightView = config.getLiftWristBrightView();
        if (liftWristBrightView != null) {
            databaseStatement.bindLong(25, liftWristBrightView.booleanValue() ? 1L : 0L);
        }
        Boolean goalRemind = config.getGoalRemind();
        if (goalRemind != null) {
            databaseStatement.bindLong(26, goalRemind.booleanValue() ? 1L : 0L);
        }
        Boolean avoidDisturdMode = config.getAvoidDisturdMode();
        if (avoidDisturdMode != null) {
            databaseStatement.bindLong(27, avoidDisturdMode.booleanValue() ? 1L : 0L);
        }
        String iosappNotifySettings = config.getIosappNotifySettings();
        if (iosappNotifySettings != null) {
            databaseStatement.bindString(28, iosappNotifySettings);
        }
        String androidappNotifySettings = config.getAndroidappNotifySettings();
        if (androidappNotifySettings != null) {
            databaseStatement.bindString(29, androidappNotifySettings);
        }
        String quietMode = config.getQuietMode();
        if (quietMode != null) {
            databaseStatement.bindString(30, quietMode);
        }
        Integer unlockScreenType = config.getUnlockScreenType();
        if (unlockScreenType != null) {
            databaseStatement.bindLong(31, unlockScreenType.intValue());
        }
        Integer timePanelType = config.getTimePanelType();
        if (timePanelType != null) {
            databaseStatement.bindLong(32, timePanelType.intValue());
        }
        Integer timePanelLang = config.getTimePanelLang();
        if (timePanelLang != null) {
            databaseStatement.bindLong(33, timePanelLang.intValue());
        }
        Boolean antiLost = config.getAntiLost();
        if (antiLost != null) {
            databaseStatement.bindLong(34, antiLost.booleanValue() ? 1L : 0L);
        }
        Boolean isNotificationOn = config.getIsNotificationOn();
        if (isNotificationOn != null) {
            databaseStatement.bindLong(35, isNotificationOn.booleanValue() ? 1L : 0L);
        }
        Boolean checkNotification = config.getCheckNotification();
        if (checkNotification != null) {
            databaseStatement.bindLong(36, checkNotification.booleanValue() ? 1L : 0L);
        }
        Boolean flipWrist = config.getFlipWrist();
        if (flipWrist != null) {
            databaseStatement.bindLong(37, flipWrist.booleanValue() ? 1L : 0L);
        }
        Boolean incallNameDisplayEnabled = config.getIncallNameDisplayEnabled();
        if (incallNameDisplayEnabled != null) {
            databaseStatement.bindLong(38, incallNameDisplayEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean smsNameDisplayEnabled = config.getSmsNameDisplayEnabled();
        if (smsNameDisplayEnabled != null) {
            databaseStatement.bindLong(39, smsNameDisplayEnabled.booleanValue() ? 1L : 0L);
        }
        String shoePlaceMode = config.getShoePlaceMode();
        if (shoePlaceMode != null) {
            databaseStatement.bindString(40, shoePlaceMode);
        }
        Integer weightBfsUnit = config.getWeightBfsUnit();
        if (weightBfsUnit != null) {
            databaseStatement.bindLong(41, weightBfsUnit.intValue());
        }
        Boolean wholeHeartRate = config.getWholeHeartRate();
        if (wholeHeartRate != null) {
            databaseStatement.bindLong(42, wholeHeartRate.booleanValue() ? 1L : 0L);
        }
        Integer dialSetting = config.getDialSetting();
        if (dialSetting != null) {
            databaseStatement.bindLong(43, dialSetting.intValue());
        }
        Integer longPressSettings = config.getLongPressSettings();
        if (longPressSettings != null) {
            databaseStatement.bindLong(44, longPressSettings.intValue());
        }
        Integer hrDetectType = config.getHrDetectType();
        if (hrDetectType != null) {
            databaseStatement.bindLong(45, hrDetectType.intValue());
        }
        String weatherSetting = config.getWeatherSetting();
        if (weatherSetting != null) {
            databaseStatement.bindString(46, weatherSetting);
        }
        String watchApps = config.getWatchApps();
        if (watchApps != null) {
            databaseStatement.bindString(47, watchApps);
        }
        String liftWristTime = config.getLiftWristTime();
        if (liftWristTime != null) {
            databaseStatement.bindString(48, liftWristTime);
        }
        Integer hrDetectFreq = config.getHrDetectFreq();
        if (hrDetectFreq != null) {
            databaseStatement.bindLong(49, hrDetectFreq.intValue());
        }
        String disconnectRemind = config.getDisconnectRemind();
        if (disconnectRemind != null) {
            databaseStatement.bindString(50, disconnectRemind);
        }
        Boolean phoneNotifyDelayEnable = config.getPhoneNotifyDelayEnable();
        if (phoneNotifyDelayEnable != null) {
            databaseStatement.bindLong(51, phoneNotifyDelayEnable.booleanValue() ? 1L : 0L);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Config readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        Boolean boolValueOf9;
        Boolean boolValueOf10;
        Boolean boolValueOf11;
        Boolean boolValueOf12;
        Boolean boolValueOf13;
        Boolean boolValueOf14;
        Boolean boolValueOf15;
        Boolean boolValueOf16;
        Boolean boolValueOf17;
        Boolean boolValueOf18;
        Boolean boolValueOf19;
        Boolean boolValueOf20;
        Boolean boolValueOf21;
        Boolean boolValueOf22;
        Boolean boolValueOf23;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        if (cursor.isNull(i3)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i3) != 0);
        }
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        int i7 = i + 5;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        String string2 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        Integer numValueOf3 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 8;
        if (cursor.isNull(i10)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        int i11 = i + 9;
        if (cursor.isNull(i11)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        int i12 = i + 10;
        if (cursor.isNull(i12)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i + 11;
        Integer numValueOf4 = cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13));
        int i14 = i + 12;
        if (cursor.isNull(i14)) {
            boolValueOf6 = null;
        } else {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        int i15 = i + 13;
        String string3 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        if (cursor.isNull(i16)) {
            boolValueOf7 = null;
        } else {
            boolValueOf7 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i + 15;
        Integer numValueOf5 = cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17));
        int i18 = i + 16;
        if (cursor.isNull(i18)) {
            boolValueOf8 = null;
        } else {
            boolValueOf8 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        int i19 = i + 17;
        if (cursor.isNull(i19)) {
            boolValueOf9 = null;
        } else {
            boolValueOf9 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        int i20 = i + 18;
        if (cursor.isNull(i20)) {
            boolValueOf10 = null;
        } else {
            boolValueOf10 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf11 = null;
        } else {
            boolValueOf11 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i + 20;
        Integer numValueOf6 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i + 21;
        Byte bValueOf = cursor.isNull(i23) ? null : Byte.valueOf((byte) cursor.getShort(i23));
        int i24 = i + 22;
        String string4 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 23;
        if (cursor.isNull(i25)) {
            boolValueOf12 = null;
        } else {
            boolValueOf12 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        int i26 = i + 24;
        if (cursor.isNull(i26)) {
            boolValueOf13 = null;
        } else {
            boolValueOf13 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        int i27 = i + 25;
        if (cursor.isNull(i27)) {
            boolValueOf14 = null;
        } else {
            boolValueOf14 = Boolean.valueOf(cursor.getShort(i27) != 0);
        }
        int i28 = i + 26;
        if (cursor.isNull(i28)) {
            boolValueOf15 = null;
        } else {
            boolValueOf15 = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        int i29 = i + 27;
        String string5 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i + 28;
        String string6 = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i + 29;
        String string7 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 30;
        Integer numValueOf7 = cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32));
        int i33 = i + 31;
        Integer numValueOf8 = cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33));
        int i34 = i + 32;
        Integer numValueOf9 = cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34));
        int i35 = i + 33;
        if (cursor.isNull(i35)) {
            boolValueOf16 = null;
        } else {
            boolValueOf16 = Boolean.valueOf(cursor.getShort(i35) != 0);
        }
        int i36 = i + 34;
        if (cursor.isNull(i36)) {
            boolValueOf17 = null;
        } else {
            boolValueOf17 = Boolean.valueOf(cursor.getShort(i36) != 0);
        }
        int i37 = i + 35;
        if (cursor.isNull(i37)) {
            boolValueOf18 = null;
        } else {
            boolValueOf18 = Boolean.valueOf(cursor.getShort(i37) != 0);
        }
        int i38 = i + 36;
        if (cursor.isNull(i38)) {
            boolValueOf19 = null;
        } else {
            boolValueOf19 = Boolean.valueOf(cursor.getShort(i38) != 0);
        }
        int i39 = i + 37;
        if (cursor.isNull(i39)) {
            boolValueOf20 = null;
        } else {
            boolValueOf20 = Boolean.valueOf(cursor.getShort(i39) != 0);
        }
        int i40 = i + 38;
        if (cursor.isNull(i40)) {
            boolValueOf21 = null;
        } else {
            boolValueOf21 = Boolean.valueOf(cursor.getShort(i40) != 0);
        }
        int i41 = i + 39;
        String string8 = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = i + 40;
        Integer numValueOf10 = cursor.isNull(i42) ? null : Integer.valueOf(cursor.getInt(i42));
        int i43 = i + 41;
        if (cursor.isNull(i43)) {
            boolValueOf22 = null;
        } else {
            boolValueOf22 = Boolean.valueOf(cursor.getShort(i43) != 0);
        }
        int i44 = i + 42;
        Integer numValueOf11 = cursor.isNull(i44) ? null : Integer.valueOf(cursor.getInt(i44));
        int i45 = i + 43;
        Integer numValueOf12 = cursor.isNull(i45) ? null : Integer.valueOf(cursor.getInt(i45));
        int i46 = i + 44;
        Integer numValueOf13 = cursor.isNull(i46) ? null : Integer.valueOf(cursor.getInt(i46));
        int i47 = i + 45;
        String string9 = cursor.isNull(i47) ? null : cursor.getString(i47);
        int i48 = i + 46;
        String string10 = cursor.isNull(i48) ? null : cursor.getString(i48);
        int i49 = i + 47;
        String string11 = cursor.isNull(i49) ? null : cursor.getString(i49);
        int i50 = i + 48;
        Integer numValueOf14 = cursor.isNull(i50) ? null : Integer.valueOf(cursor.getInt(i50));
        int i51 = i + 49;
        String string12 = cursor.isNull(i51) ? null : cursor.getString(i51);
        int i52 = i + 50;
        if (cursor.isNull(i52)) {
            boolValueOf23 = null;
        } else {
            boolValueOf23 = Boolean.valueOf(cursor.getShort(i52) != 0);
        }
        return new Config(lValueOf, boolValueOf, string, numValueOf, boolValueOf2, numValueOf2, string2, numValueOf3, boolValueOf3, boolValueOf4, boolValueOf5, numValueOf4, boolValueOf6, string3, boolValueOf7, numValueOf5, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, numValueOf6, bValueOf, string4, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, string5, string6, string7, numValueOf7, numValueOf8, numValueOf9, boolValueOf16, boolValueOf17, boolValueOf18, boolValueOf19, boolValueOf20, boolValueOf21, string8, numValueOf10, boolValueOf22, numValueOf11, numValueOf12, numValueOf13, string9, string10, string11, numValueOf14, string12, boolValueOf23);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Config config, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        Boolean boolValueOf9;
        Boolean boolValueOf10;
        Boolean boolValueOf11;
        Boolean boolValueOf12;
        Boolean boolValueOf13;
        Boolean boolValueOf14;
        Boolean boolValueOf15;
        Boolean boolValueOf16;
        Boolean boolValueOf17;
        Boolean boolValueOf18;
        Boolean boolValueOf19;
        Boolean boolValueOf20;
        Boolean boolValueOf21;
        Boolean boolValueOf22;
        int i2 = i + 0;
        Boolean boolValueOf23 = null;
        config.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        if (cursor.isNull(i3)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i3) != 0);
        }
        config.setAlarmNotifyEnabled(boolValueOf);
        int i4 = i + 2;
        config.setDayReportNoti(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        config.setDisconnectedReminder(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        config.setEnableConnectedBtAdv(boolValueOf2);
        int i7 = i + 5;
        config.setGoalStepsCount(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        config.setLightColor(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        config.setInComingCallNotifyTime(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        if (cursor.isNull(i10)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i10) != 0);
        }
        config.setMOpenSleepNotify(boolValueOf3);
        int i11 = i + 9;
        if (cursor.isNull(i11)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i11) != 0);
        }
        config.setSmsNotifyEnabled(boolValueOf4);
        int i12 = i + 10;
        if (cursor.isNull(i12)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        config.setIncallNotifyEnabled(boolValueOf5);
        int i13 = i + 11;
        config.setUnit(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i + 12;
        if (cursor.isNull(i14)) {
            boolValueOf6 = null;
        } else {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        config.setVibrate(boolValueOf6);
        int i15 = i + 13;
        config.setWearHand(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i + 14;
        if (cursor.isNull(i16)) {
            boolValueOf7 = null;
        } else {
            boolValueOf7 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        config.setWeightMergeResult(boolValueOf7);
        int i17 = i + 15;
        config.setWeightUnit(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i + 16;
        if (cursor.isNull(i18)) {
            boolValueOf8 = null;
        } else {
            boolValueOf8 = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        config.setSmsContactNotifyEnabled(boolValueOf8);
        int i19 = i + 17;
        if (cursor.isNull(i19)) {
            boolValueOf9 = null;
        } else {
            boolValueOf9 = Boolean.valueOf(cursor.getShort(i19) != 0);
        }
        config.setIncallContactNotifyEnabled(boolValueOf9);
        int i20 = i + 18;
        if (cursor.isNull(i20)) {
            boolValueOf10 = null;
        } else {
            boolValueOf10 = Boolean.valueOf(cursor.getShort(i20) != 0);
        }
        config.setSleepAssist(boolValueOf10);
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf11 = null;
        } else {
            boolValueOf11 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        config.setHasHeartRate(boolValueOf11);
        int i22 = i + 20;
        config.setScreenLock(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i + 21;
        config.setProDisplay(cursor.isNull(i23) ? null : Byte.valueOf((byte) cursor.getShort(i23)));
        int i24 = i + 22;
        config.setSedentaryRemind(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i + 23;
        if (cursor.isNull(i25)) {
            boolValueOf12 = null;
        } else {
            boolValueOf12 = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        config.setEmailNotifyEnabled(boolValueOf12);
        int i26 = i + 24;
        if (cursor.isNull(i26)) {
            boolValueOf13 = null;
        } else {
            boolValueOf13 = Boolean.valueOf(cursor.getShort(i26) != 0);
        }
        config.setLiftWristBrightView(boolValueOf13);
        int i27 = i + 25;
        if (cursor.isNull(i27)) {
            boolValueOf14 = null;
        } else {
            boolValueOf14 = Boolean.valueOf(cursor.getShort(i27) != 0);
        }
        config.setGoalRemind(boolValueOf14);
        int i28 = i + 26;
        if (cursor.isNull(i28)) {
            boolValueOf15 = null;
        } else {
            boolValueOf15 = Boolean.valueOf(cursor.getShort(i28) != 0);
        }
        config.setAvoidDisturdMode(boolValueOf15);
        int i29 = i + 27;
        config.setIosappNotifySettings(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i + 28;
        config.setAndroidappNotifySettings(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i + 29;
        config.setQuietMode(cursor.isNull(i31) ? null : cursor.getString(i31));
        int i32 = i + 30;
        config.setUnlockScreenType(cursor.isNull(i32) ? null : Integer.valueOf(cursor.getInt(i32)));
        int i33 = i + 31;
        config.setTimePanelType(cursor.isNull(i33) ? null : Integer.valueOf(cursor.getInt(i33)));
        int i34 = i + 32;
        config.setTimePanelLang(cursor.isNull(i34) ? null : Integer.valueOf(cursor.getInt(i34)));
        int i35 = i + 33;
        if (cursor.isNull(i35)) {
            boolValueOf16 = null;
        } else {
            boolValueOf16 = Boolean.valueOf(cursor.getShort(i35) != 0);
        }
        config.setAntiLost(boolValueOf16);
        int i36 = i + 34;
        if (cursor.isNull(i36)) {
            boolValueOf17 = null;
        } else {
            boolValueOf17 = Boolean.valueOf(cursor.getShort(i36) != 0);
        }
        config.setIsNotificationOn(boolValueOf17);
        int i37 = i + 35;
        if (cursor.isNull(i37)) {
            boolValueOf18 = null;
        } else {
            boolValueOf18 = Boolean.valueOf(cursor.getShort(i37) != 0);
        }
        config.setCheckNotification(boolValueOf18);
        int i38 = i + 36;
        if (cursor.isNull(i38)) {
            boolValueOf19 = null;
        } else {
            boolValueOf19 = Boolean.valueOf(cursor.getShort(i38) != 0);
        }
        config.setFlipWrist(boolValueOf19);
        int i39 = i + 37;
        if (cursor.isNull(i39)) {
            boolValueOf20 = null;
        } else {
            boolValueOf20 = Boolean.valueOf(cursor.getShort(i39) != 0);
        }
        config.setIncallNameDisplayEnabled(boolValueOf20);
        int i40 = i + 38;
        if (cursor.isNull(i40)) {
            boolValueOf21 = null;
        } else {
            boolValueOf21 = Boolean.valueOf(cursor.getShort(i40) != 0);
        }
        config.setSmsNameDisplayEnabled(boolValueOf21);
        int i41 = i + 39;
        config.setShoePlaceMode(cursor.isNull(i41) ? null : cursor.getString(i41));
        int i42 = i + 40;
        config.setWeightBfsUnit(cursor.isNull(i42) ? null : Integer.valueOf(cursor.getInt(i42)));
        int i43 = i + 41;
        if (cursor.isNull(i43)) {
            boolValueOf22 = null;
        } else {
            boolValueOf22 = Boolean.valueOf(cursor.getShort(i43) != 0);
        }
        config.setWholeHeartRate(boolValueOf22);
        int i44 = i + 42;
        config.setDialSetting(cursor.isNull(i44) ? null : Integer.valueOf(cursor.getInt(i44)));
        int i45 = i + 43;
        config.setLongPressSettings(cursor.isNull(i45) ? null : Integer.valueOf(cursor.getInt(i45)));
        int i46 = i + 44;
        config.setHrDetectType(cursor.isNull(i46) ? null : Integer.valueOf(cursor.getInt(i46)));
        int i47 = i + 45;
        config.setWeatherSetting(cursor.isNull(i47) ? null : cursor.getString(i47));
        int i48 = i + 46;
        config.setWatchApps(cursor.isNull(i48) ? null : cursor.getString(i48));
        int i49 = i + 47;
        config.setLiftWristTime(cursor.isNull(i49) ? null : cursor.getString(i49));
        int i50 = i + 48;
        config.setHrDetectFreq(cursor.isNull(i50) ? null : Integer.valueOf(cursor.getInt(i50)));
        int i51 = i + 49;
        config.setDisconnectRemind(cursor.isNull(i51) ? null : cursor.getString(i51));
        int i52 = i + 50;
        if (!cursor.isNull(i52)) {
            boolValueOf23 = Boolean.valueOf(cursor.getShort(i52) != 0);
        }
        config.setPhoneNotifyDelayEnable(boolValueOf23);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Config config) {
        sQLiteStatement.clearBindings();
        Long id = config.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Boolean alarmNotifyEnabled = config.getAlarmNotifyEnabled();
        if (alarmNotifyEnabled != null) {
            sQLiteStatement.bindLong(2, alarmNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        String dayReportNoti = config.getDayReportNoti();
        if (dayReportNoti != null) {
            sQLiteStatement.bindString(3, dayReportNoti);
        }
        Integer disconnectedReminder = config.getDisconnectedReminder();
        if (disconnectedReminder != null) {
            sQLiteStatement.bindLong(4, disconnectedReminder.intValue());
        }
        Boolean enableConnectedBtAdv = config.getEnableConnectedBtAdv();
        if (enableConnectedBtAdv != null) {
            sQLiteStatement.bindLong(5, enableConnectedBtAdv.booleanValue() ? 1L : 0L);
        }
        Integer goalStepsCount = config.getGoalStepsCount();
        if (goalStepsCount != null) {
            sQLiteStatement.bindLong(6, goalStepsCount.intValue());
        }
        String lightColor = config.getLightColor();
        if (lightColor != null) {
            sQLiteStatement.bindString(7, lightColor);
        }
        Integer inComingCallNotifyTime = config.getInComingCallNotifyTime();
        if (inComingCallNotifyTime != null) {
            sQLiteStatement.bindLong(8, inComingCallNotifyTime.intValue());
        }
        Boolean mOpenSleepNotify = config.getMOpenSleepNotify();
        if (mOpenSleepNotify != null) {
            sQLiteStatement.bindLong(9, mOpenSleepNotify.booleanValue() ? 1L : 0L);
        }
        Boolean smsNotifyEnabled = config.getSmsNotifyEnabled();
        if (smsNotifyEnabled != null) {
            sQLiteStatement.bindLong(10, smsNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean incallNotifyEnabled = config.getIncallNotifyEnabled();
        if (incallNotifyEnabled != null) {
            sQLiteStatement.bindLong(11, incallNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Integer unit = config.getUnit();
        if (unit != null) {
            sQLiteStatement.bindLong(12, unit.intValue());
        }
        Boolean vibrate = config.getVibrate();
        if (vibrate != null) {
            sQLiteStatement.bindLong(13, vibrate.booleanValue() ? 1L : 0L);
        }
        String wearHand = config.getWearHand();
        if (wearHand != null) {
            sQLiteStatement.bindString(14, wearHand);
        }
        Boolean weightMergeResult = config.getWeightMergeResult();
        if (weightMergeResult != null) {
            sQLiteStatement.bindLong(15, weightMergeResult.booleanValue() ? 1L : 0L);
        }
        Integer weightUnit = config.getWeightUnit();
        if (weightUnit != null) {
            sQLiteStatement.bindLong(16, weightUnit.intValue());
        }
        Boolean smsContactNotifyEnabled = config.getSmsContactNotifyEnabled();
        if (smsContactNotifyEnabled != null) {
            sQLiteStatement.bindLong(17, smsContactNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean incallContactNotifyEnabled = config.getIncallContactNotifyEnabled();
        if (incallContactNotifyEnabled != null) {
            sQLiteStatement.bindLong(18, incallContactNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean sleepAssist = config.getSleepAssist();
        if (sleepAssist != null) {
            sQLiteStatement.bindLong(19, sleepAssist.booleanValue() ? 1L : 0L);
        }
        Boolean hasHeartRate = config.getHasHeartRate();
        if (hasHeartRate != null) {
            sQLiteStatement.bindLong(20, hasHeartRate.booleanValue() ? 1L : 0L);
        }
        Integer screenLock = config.getScreenLock();
        if (screenLock != null) {
            sQLiteStatement.bindLong(21, screenLock.intValue());
        }
        Byte proDisplay = config.getProDisplay();
        if (proDisplay != null) {
            sQLiteStatement.bindLong(22, proDisplay.byteValue());
        }
        String sedentaryRemind = config.getSedentaryRemind();
        if (sedentaryRemind != null) {
            sQLiteStatement.bindString(23, sedentaryRemind);
        }
        Boolean emailNotifyEnabled = config.getEmailNotifyEnabled();
        if (emailNotifyEnabled != null) {
            sQLiteStatement.bindLong(24, emailNotifyEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean liftWristBrightView = config.getLiftWristBrightView();
        if (liftWristBrightView != null) {
            sQLiteStatement.bindLong(25, liftWristBrightView.booleanValue() ? 1L : 0L);
        }
        Boolean goalRemind = config.getGoalRemind();
        if (goalRemind != null) {
            sQLiteStatement.bindLong(26, goalRemind.booleanValue() ? 1L : 0L);
        }
        Boolean avoidDisturdMode = config.getAvoidDisturdMode();
        if (avoidDisturdMode != null) {
            sQLiteStatement.bindLong(27, avoidDisturdMode.booleanValue() ? 1L : 0L);
        }
        String iosappNotifySettings = config.getIosappNotifySettings();
        if (iosappNotifySettings != null) {
            sQLiteStatement.bindString(28, iosappNotifySettings);
        }
        String androidappNotifySettings = config.getAndroidappNotifySettings();
        if (androidappNotifySettings != null) {
            sQLiteStatement.bindString(29, androidappNotifySettings);
        }
        String quietMode = config.getQuietMode();
        if (quietMode != null) {
            sQLiteStatement.bindString(30, quietMode);
        }
        Integer unlockScreenType = config.getUnlockScreenType();
        if (unlockScreenType != null) {
            sQLiteStatement.bindLong(31, unlockScreenType.intValue());
        }
        Integer timePanelType = config.getTimePanelType();
        if (timePanelType != null) {
            sQLiteStatement.bindLong(32, timePanelType.intValue());
        }
        Integer timePanelLang = config.getTimePanelLang();
        if (timePanelLang != null) {
            sQLiteStatement.bindLong(33, timePanelLang.intValue());
        }
        Boolean antiLost = config.getAntiLost();
        if (antiLost != null) {
            sQLiteStatement.bindLong(34, antiLost.booleanValue() ? 1L : 0L);
        }
        Boolean isNotificationOn = config.getIsNotificationOn();
        if (isNotificationOn != null) {
            sQLiteStatement.bindLong(35, isNotificationOn.booleanValue() ? 1L : 0L);
        }
        Boolean checkNotification = config.getCheckNotification();
        if (checkNotification != null) {
            sQLiteStatement.bindLong(36, checkNotification.booleanValue() ? 1L : 0L);
        }
        Boolean flipWrist = config.getFlipWrist();
        if (flipWrist != null) {
            sQLiteStatement.bindLong(37, flipWrist.booleanValue() ? 1L : 0L);
        }
        Boolean incallNameDisplayEnabled = config.getIncallNameDisplayEnabled();
        if (incallNameDisplayEnabled != null) {
            sQLiteStatement.bindLong(38, incallNameDisplayEnabled.booleanValue() ? 1L : 0L);
        }
        Boolean smsNameDisplayEnabled = config.getSmsNameDisplayEnabled();
        if (smsNameDisplayEnabled != null) {
            sQLiteStatement.bindLong(39, smsNameDisplayEnabled.booleanValue() ? 1L : 0L);
        }
        String shoePlaceMode = config.getShoePlaceMode();
        if (shoePlaceMode != null) {
            sQLiteStatement.bindString(40, shoePlaceMode);
        }
        Integer weightBfsUnit = config.getWeightBfsUnit();
        if (weightBfsUnit != null) {
            sQLiteStatement.bindLong(41, weightBfsUnit.intValue());
        }
        Boolean wholeHeartRate = config.getWholeHeartRate();
        if (wholeHeartRate != null) {
            sQLiteStatement.bindLong(42, wholeHeartRate.booleanValue() ? 1L : 0L);
        }
        Integer dialSetting = config.getDialSetting();
        if (dialSetting != null) {
            sQLiteStatement.bindLong(43, dialSetting.intValue());
        }
        Integer longPressSettings = config.getLongPressSettings();
        if (longPressSettings != null) {
            sQLiteStatement.bindLong(44, longPressSettings.intValue());
        }
        Integer hrDetectType = config.getHrDetectType();
        if (hrDetectType != null) {
            sQLiteStatement.bindLong(45, hrDetectType.intValue());
        }
        String weatherSetting = config.getWeatherSetting();
        if (weatherSetting != null) {
            sQLiteStatement.bindString(46, weatherSetting);
        }
        String watchApps = config.getWatchApps();
        if (watchApps != null) {
            sQLiteStatement.bindString(47, watchApps);
        }
        String liftWristTime = config.getLiftWristTime();
        if (liftWristTime != null) {
            sQLiteStatement.bindString(48, liftWristTime);
        }
        Integer hrDetectFreq = config.getHrDetectFreq();
        if (hrDetectFreq != null) {
            sQLiteStatement.bindLong(49, hrDetectFreq.intValue());
        }
        String disconnectRemind = config.getDisconnectRemind();
        if (disconnectRemind != null) {
            sQLiteStatement.bindString(50, disconnectRemind);
        }
        Boolean phoneNotifyDelayEnable = config.getPhoneNotifyDelayEnable();
        if (phoneNotifyDelayEnable != null) {
            sQLiteStatement.bindLong(51, phoneNotifyDelayEnable.booleanValue() ? 1L : 0L);
        }
    }
}
