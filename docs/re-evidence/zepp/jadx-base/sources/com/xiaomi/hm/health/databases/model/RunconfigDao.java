package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.android.zxing.Intents;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class RunconfigDao extends AbstractDao<Runconfig, Long> {
    public static final String TABLENAME = "RUNCONFIG";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Type = new Property(1, Integer.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property AutoPauseEnable = new Property(2, Boolean.class, "autoPauseEnable", false, "AUTO_PAUSE_ENABLE");
        public static final Property VoicePlayEnable = new Property(3, Boolean.class, "voicePlayEnable", false, "VOICE_PLAY_ENABLE");
        public static final Property MeasureHREnable = new Property(4, Boolean.class, "measureHREnable", false, "MEASURE_HRENABLE");
        public static final Property RemindHREnable = new Property(5, Boolean.class, "remindHREnable", false, "REMIND_HRENABLE");
        public static final Property RemindHeartRate = new Property(6, Integer.class, "remindHeartRate", false, "REMIND_HEART_RATE");
        public static final Property RemindPaceEnable = new Property(7, Boolean.class, "remindPaceEnable", false, "REMIND_PACE_ENABLE");
        public static final Property RemindPace = new Property(8, Integer.class, "remindPace", false, "REMIND_PACE");
        public static final Property Synced = new Property(9, Integer.class, "synced", false, "SYNCED");
        public static final Property LockScreenDisplay = new Property(10, Boolean.class, "lockScreenDisplay", false, "LOCK_SCREEN_DISPLAY");
        public static final Property IndoorModelArray = new Property(11, String.class, "indoorModelArray", false, "INDOOR_MODEL_ARRAY");
        public static final Property StepLengthArray = new Property(12, String.class, "stepLengthArray", false, "STEP_LENGTH_ARRAY");
        public static final Property KeepScreenOn = new Property(13, Boolean.class, "keepScreenOn", false, "KEEP_SCREEN_ON");
        public static final Property ChooseMap = new Property(14, Integer.class, "chooseMap", false, "CHOOSE_MAP");
        public static final Property ChooseDevices = new Property(15, String.class, "chooseDevices", false, "CHOOSE_DEVICES");
        public static final Property DevicesCount = new Property(16, Integer.class, "devicesCount", false, "DEVICES_COUNT");
        public static final Property DataItems = new Property(17, String.class, "dataItems", false, "DATA_ITEMS");
        public static final Property AutoPausePace = new Property(18, Integer.class, "autoPausePace", false, "AUTO_PAUSE_PACE");
        public static final Property BeatEnable = new Property(19, Boolean.class, "beatEnable", false, "BEAT_ENABLE");
        public static final Property BeatValue = new Property(20, Integer.class, "beatValue", false, "BEAT_VALUE");
    }

    public RunconfigDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"RUNCONFIG\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TYPE\" INTEGER,\"AUTO_PAUSE_ENABLE\" INTEGER,\"VOICE_PLAY_ENABLE\" INTEGER,\"MEASURE_HRENABLE\" INTEGER,\"REMIND_HRENABLE\" INTEGER,\"REMIND_HEART_RATE\" INTEGER,\"REMIND_PACE_ENABLE\" INTEGER,\"REMIND_PACE\" INTEGER,\"SYNCED\" INTEGER,\"LOCK_SCREEN_DISPLAY\" INTEGER,\"INDOOR_MODEL_ARRAY\" TEXT,\"STEP_LENGTH_ARRAY\" TEXT,\"KEEP_SCREEN_ON\" INTEGER,\"CHOOSE_MAP\" INTEGER,\"CHOOSE_DEVICES\" TEXT,\"DEVICES_COUNT\" INTEGER,\"DATA_ITEMS\" TEXT,\"AUTO_PAUSE_PACE\" INTEGER,\"BEAT_ENABLE\" INTEGER,\"BEAT_VALUE\" INTEGER,UNIQUE (TYPE) ON CONFLICT REPLACE);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"RUNCONFIG\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public RunconfigDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(Runconfig runconfig) {
        if (runconfig != null) {
            return runconfig.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(Runconfig runconfig) {
        return runconfig.getId() != null;
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
    public final Long updateKeyAfterInsert(Runconfig runconfig, long j) {
        runconfig.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, Runconfig runconfig) {
        databaseStatement.clearBindings();
        Long id = runconfig.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Integer type = runconfig.getType();
        if (type != null) {
            databaseStatement.bindLong(2, type.intValue());
        }
        Boolean autoPauseEnable = runconfig.getAutoPauseEnable();
        if (autoPauseEnable != null) {
            databaseStatement.bindLong(3, autoPauseEnable.booleanValue() ? 1L : 0L);
        }
        Boolean voicePlayEnable = runconfig.getVoicePlayEnable();
        if (voicePlayEnable != null) {
            databaseStatement.bindLong(4, voicePlayEnable.booleanValue() ? 1L : 0L);
        }
        Boolean measureHREnable = runconfig.getMeasureHREnable();
        if (measureHREnable != null) {
            databaseStatement.bindLong(5, measureHREnable.booleanValue() ? 1L : 0L);
        }
        Boolean remindHREnable = runconfig.getRemindHREnable();
        if (remindHREnable != null) {
            databaseStatement.bindLong(6, remindHREnable.booleanValue() ? 1L : 0L);
        }
        Integer remindHeartRate = runconfig.getRemindHeartRate();
        if (remindHeartRate != null) {
            databaseStatement.bindLong(7, remindHeartRate.intValue());
        }
        Boolean remindPaceEnable = runconfig.getRemindPaceEnable();
        if (remindPaceEnable != null) {
            databaseStatement.bindLong(8, remindPaceEnable.booleanValue() ? 1L : 0L);
        }
        Integer remindPace = runconfig.getRemindPace();
        if (remindPace != null) {
            databaseStatement.bindLong(9, remindPace.intValue());
        }
        Integer synced = runconfig.getSynced();
        if (synced != null) {
            databaseStatement.bindLong(10, synced.intValue());
        }
        Boolean lockScreenDisplay = runconfig.getLockScreenDisplay();
        if (lockScreenDisplay != null) {
            databaseStatement.bindLong(11, lockScreenDisplay.booleanValue() ? 1L : 0L);
        }
        String indoorModelArray = runconfig.getIndoorModelArray();
        if (indoorModelArray != null) {
            databaseStatement.bindString(12, indoorModelArray);
        }
        String stepLengthArray = runconfig.getStepLengthArray();
        if (stepLengthArray != null) {
            databaseStatement.bindString(13, stepLengthArray);
        }
        Boolean keepScreenOn = runconfig.getKeepScreenOn();
        if (keepScreenOn != null) {
            databaseStatement.bindLong(14, keepScreenOn.booleanValue() ? 1L : 0L);
        }
        Integer chooseMap = runconfig.getChooseMap();
        if (chooseMap != null) {
            databaseStatement.bindLong(15, chooseMap.intValue());
        }
        String chooseDevices = runconfig.getChooseDevices();
        if (chooseDevices != null) {
            databaseStatement.bindString(16, chooseDevices);
        }
        Integer devicesCount = runconfig.getDevicesCount();
        if (devicesCount != null) {
            databaseStatement.bindLong(17, devicesCount.intValue());
        }
        String dataItems = runconfig.getDataItems();
        if (dataItems != null) {
            databaseStatement.bindString(18, dataItems);
        }
        Integer autoPausePace = runconfig.getAutoPausePace();
        if (autoPausePace != null) {
            databaseStatement.bindLong(19, autoPausePace.intValue());
        }
        Boolean beatEnable = runconfig.getBeatEnable();
        if (beatEnable != null) {
            databaseStatement.bindLong(20, beatEnable.booleanValue() ? 1L : 0L);
        }
        Integer beatValue = runconfig.getBeatValue();
        if (beatValue != null) {
            databaseStatement.bindLong(21, beatValue.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Runconfig readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Integer numValueOf = cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3));
        int i4 = i + 2;
        if (cursor.isNull(i4)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i4) != 0);
        }
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        int i7 = i + 5;
        if (cursor.isNull(i7)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i7) != 0);
        }
        int i8 = i + 6;
        Integer numValueOf2 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i + 8;
        Integer numValueOf3 = cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10));
        int i11 = i + 9;
        Integer numValueOf4 = cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11));
        int i12 = i + 10;
        if (cursor.isNull(i12)) {
            boolValueOf6 = null;
        } else {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i + 11;
        String string = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string2 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        if (cursor.isNull(i15)) {
            boolValueOf7 = null;
        } else {
            boolValueOf7 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        int i16 = i + 14;
        Integer numValueOf5 = cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16));
        int i17 = i + 15;
        String string3 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 16;
        Integer numValueOf6 = cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18));
        int i19 = i + 17;
        String string4 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 18;
        Integer numValueOf7 = cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20));
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf8 = null;
        } else {
            boolValueOf8 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        int i22 = i + 20;
        return new Runconfig(lValueOf, numValueOf, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, numValueOf2, boolValueOf5, numValueOf3, numValueOf4, boolValueOf6, string, string2, boolValueOf7, numValueOf5, string3, numValueOf6, string4, numValueOf7, boolValueOf8, cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, Runconfig runconfig, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        int i2 = i + 0;
        runconfig.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        runconfig.setType(cursor.isNull(i3) ? null : Integer.valueOf(cursor.getInt(i3)));
        int i4 = i + 2;
        if (cursor.isNull(i4)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i4) != 0);
        }
        runconfig.setAutoPauseEnable(boolValueOf);
        int i5 = i + 3;
        if (cursor.isNull(i5)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i5) != 0);
        }
        runconfig.setVoicePlayEnable(boolValueOf2);
        int i6 = i + 4;
        if (cursor.isNull(i6)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i6) != 0);
        }
        runconfig.setMeasureHREnable(boolValueOf3);
        int i7 = i + 5;
        if (cursor.isNull(i7)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i7) != 0);
        }
        runconfig.setRemindHREnable(boolValueOf4);
        int i8 = i + 6;
        runconfig.setRemindHeartRate(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        runconfig.setRemindPaceEnable(boolValueOf5);
        int i10 = i + 8;
        runconfig.setRemindPace(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        runconfig.setSynced(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        if (cursor.isNull(i12)) {
            boolValueOf6 = null;
        } else {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        runconfig.setLockScreenDisplay(boolValueOf6);
        int i13 = i + 11;
        runconfig.setIndoorModelArray(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        runconfig.setStepLengthArray(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        if (cursor.isNull(i15)) {
            boolValueOf7 = null;
        } else {
            boolValueOf7 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        runconfig.setKeepScreenOn(boolValueOf7);
        int i16 = i + 14;
        runconfig.setChooseMap(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i + 15;
        runconfig.setChooseDevices(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 16;
        runconfig.setDevicesCount(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i + 17;
        runconfig.setDataItems(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 18;
        runconfig.setAutoPausePace(cursor.isNull(i20) ? null : Integer.valueOf(cursor.getInt(i20)));
        int i21 = i + 19;
        if (cursor.isNull(i21)) {
            boolValueOf8 = null;
        } else {
            boolValueOf8 = Boolean.valueOf(cursor.getShort(i21) != 0);
        }
        runconfig.setBeatEnable(boolValueOf8);
        int i22 = i + 20;
        runconfig.setBeatValue(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, Runconfig runconfig) {
        sQLiteStatement.clearBindings();
        Long id = runconfig.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Integer type = runconfig.getType();
        if (type != null) {
            sQLiteStatement.bindLong(2, type.intValue());
        }
        Boolean autoPauseEnable = runconfig.getAutoPauseEnable();
        if (autoPauseEnable != null) {
            sQLiteStatement.bindLong(3, autoPauseEnable.booleanValue() ? 1L : 0L);
        }
        Boolean voicePlayEnable = runconfig.getVoicePlayEnable();
        if (voicePlayEnable != null) {
            sQLiteStatement.bindLong(4, voicePlayEnable.booleanValue() ? 1L : 0L);
        }
        Boolean measureHREnable = runconfig.getMeasureHREnable();
        if (measureHREnable != null) {
            sQLiteStatement.bindLong(5, measureHREnable.booleanValue() ? 1L : 0L);
        }
        Boolean remindHREnable = runconfig.getRemindHREnable();
        if (remindHREnable != null) {
            sQLiteStatement.bindLong(6, remindHREnable.booleanValue() ? 1L : 0L);
        }
        Integer remindHeartRate = runconfig.getRemindHeartRate();
        if (remindHeartRate != null) {
            sQLiteStatement.bindLong(7, remindHeartRate.intValue());
        }
        Boolean remindPaceEnable = runconfig.getRemindPaceEnable();
        if (remindPaceEnable != null) {
            sQLiteStatement.bindLong(8, remindPaceEnable.booleanValue() ? 1L : 0L);
        }
        Integer remindPace = runconfig.getRemindPace();
        if (remindPace != null) {
            sQLiteStatement.bindLong(9, remindPace.intValue());
        }
        Integer synced = runconfig.getSynced();
        if (synced != null) {
            sQLiteStatement.bindLong(10, synced.intValue());
        }
        Boolean lockScreenDisplay = runconfig.getLockScreenDisplay();
        if (lockScreenDisplay != null) {
            sQLiteStatement.bindLong(11, lockScreenDisplay.booleanValue() ? 1L : 0L);
        }
        String indoorModelArray = runconfig.getIndoorModelArray();
        if (indoorModelArray != null) {
            sQLiteStatement.bindString(12, indoorModelArray);
        }
        String stepLengthArray = runconfig.getStepLengthArray();
        if (stepLengthArray != null) {
            sQLiteStatement.bindString(13, stepLengthArray);
        }
        Boolean keepScreenOn = runconfig.getKeepScreenOn();
        if (keepScreenOn != null) {
            sQLiteStatement.bindLong(14, keepScreenOn.booleanValue() ? 1L : 0L);
        }
        Integer chooseMap = runconfig.getChooseMap();
        if (chooseMap != null) {
            sQLiteStatement.bindLong(15, chooseMap.intValue());
        }
        String chooseDevices = runconfig.getChooseDevices();
        if (chooseDevices != null) {
            sQLiteStatement.bindString(16, chooseDevices);
        }
        Integer devicesCount = runconfig.getDevicesCount();
        if (devicesCount != null) {
            sQLiteStatement.bindLong(17, devicesCount.intValue());
        }
        String dataItems = runconfig.getDataItems();
        if (dataItems != null) {
            sQLiteStatement.bindString(18, dataItems);
        }
        Integer autoPausePace = runconfig.getAutoPausePace();
        if (autoPausePace != null) {
            sQLiteStatement.bindLong(19, autoPausePace.intValue());
        }
        Boolean beatEnable = runconfig.getBeatEnable();
        if (beatEnable != null) {
            sQLiteStatement.bindLong(20, beatEnable.booleanValue() ? 1L : 0L);
        }
        Integer beatValue = runconfig.getBeatValue();
        if (beatValue != null) {
            sQLiteStatement.bindLong(21, beatValue.intValue());
        }
    }
}
