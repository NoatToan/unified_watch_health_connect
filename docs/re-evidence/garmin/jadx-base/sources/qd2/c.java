package qd2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p1.z;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f144506a = LoggerFactory.getLogger("connectdb.GCMUpgradeMgr");

    public static boolean A(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo67...");
            if (f("devices", "startStopWorkoutCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN startStopWorkoutCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo67", (Throwable) e4);
            return false;
        }
    }

    public static boolean B(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo68...");
            if (f("devices", "fallDetectionCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN fallDetectionCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo68", (Throwable) e4);
            return false;
        }
    }

    public static boolean C(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo69...");
            if (f("devices", "directActivationCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN directActivationCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo69", (Throwable) e4);
            return false;
        }
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z14 = false;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select distinct tbl_name from sqlite_master where tbl_name = '" + str + "'", null);
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    z14 = true;
                }
                return z14;
            } catch (Exception e4) {
                f144506a.error("getTableColumns [" + str + "]", (Throwable) e4);
                return false;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        ArrayList arrayListE = e(sQLiteDatabase);
        if (arrayListE == null) {
            throw new SQLException("Null table columns for [devices].");
        }
        arrayListE.removeAll(Arrays.asList(strArr));
        String strJoin = TextUtils.join(",", arrayListE);
        sQLiteDatabase.execSQL("ALTER TABLE devices RENAME TO devices_old;");
        sQLiteDatabase.execSQL("create table if not exists devices (_id integer primary key autoincrement, unit_id integer, application_key text, product_nbr text, mac_address text, product_display_name text, bt_friendly_name text, connection_type text, last_connected_timestamp integer, software_version text, is_software_update_available integer default 0, min_app_version_code_supported integer default 99999, image_url text, video_url text, categories text, is_segment_capable integer default 0, garmin_device_xml blob, garmin_device_xml_id text, is_connected integer default 0, sku text, capabilities integer default 0, gble_ediv blob, gble_rand blob, gble_ltk blob, is_vivohub_configurable integer default 0, sport_capabilities integer default 0, is_primary_user integer default 1, display_name text, training_video_url text, active_ind integer, part_nbr text, fitpay_user_id text, nfc_se_id text, multi_link_support integer default 0, gcj02_course_capable integer default 0, activity_course_capable integer default 0, nfc_capable integer default 0, solarPanelUtilizationCapable integer default 0, lowHrAlertCapable integer default 0, abnormalHeartRateAlertCapable integer default 0, gcmSettingsFileName text, sku_image_url text, sku_image_defaultWatchFace_url text, sku_image_defaultWatchFaceBlank_url text, sku_image_sideProfile_url text, sku_image_tutorial_url text, sku_image_option1_url text, sku_image_option2_url text, sku_image_option3_url text, spectatorMessagingCapable integer default 0, trainingStatusPauseCapable integer default 0, trainingStatusCapable integer default 0, measurementUnitSettingCapable integer default 0, powerCurveCapable integer default 0, secondaryWorkoutStepTargetCapable integer default 0,assistancePlusCapable integer default 0,emergencyCallingCapable integer default 0,solarChargeCapable integer default 0,diveAppSyncCapable integer default 0,dayOfWeekSleepWindowCapable integer default 0,primaryApp integer default 0,incompatibleApps text,applyBackupCapable integer default 0,hillScoreAndEnduranceScoreCapable integer default 0,bodyBatteryTrueUpCapable integer default 0,rechargeableSensorCapable integer default 0,startActivityCapable integer default 0,pendingActivityCapable integer default 0,fixedLocationCapable integer default 0,screenlessDeviceCapable integer default 0,startStopWorkoutCapable integer default 0,fallDetectionCapable integer default 0,directActivationCapable integer default 0,lastUploadToServerTimestamp bigint default 0);");
        sQLiteDatabase.execSQL(e0.g("INSERT INTO devices(", strJoin, ") SELECT ", strJoin, " FROM devices_old;"));
        sQLiteDatabase.execSQL("DROP TABLE devices_old;");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static z<Long> c(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        zVar = null;
        zVar = null;
        zVar = null;
        z<Long> zVar = null;
        try {
            cursorQuery = sQLiteDatabase.query(true, "devices", new String[]{"unit_id", "capabilities"}, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            z<Long> zVar2 = new z<>(cursorQuery.getCount());
                            if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                zVar2.f(cursorQuery.getLong(0), Long.valueOf(cursorQuery.getLong(1)));
                            }
                            while (!cursorQuery.isLast()) {
                                cursorQuery.moveToNext();
                                if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                    zVar2.f(cursorQuery.getLong(0), Long.valueOf(cursorQuery.getLong(1)));
                                }
                            }
                            zVar = zVar2;
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f144506a.error("getAllConnectivityCapabilities", (Throwable) e);
                        if (cursorQuery != null) {
                        }
                        if (zVar != null) {
                            return zVar;
                        }
                        return new z<>(0);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (zVar != null) {
            return zVar;
        }
        return new z<>(0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static z<Long> d(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        zVar = null;
        zVar = null;
        zVar = null;
        z<Long> zVar = null;
        try {
            cursorQuery = sQLiteDatabase.query(true, "devices", new String[]{"unit_id", "sport_capabilities"}, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            z<Long> zVar2 = new z<>(cursorQuery.getCount());
                            if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                zVar2.f(cursorQuery.getLong(0), Long.valueOf(cursorQuery.getLong(1)));
                            }
                            while (!cursorQuery.isLast()) {
                                cursorQuery.moveToNext();
                                if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                    zVar2.f(cursorQuery.getLong(0), Long.valueOf(cursorQuery.getLong(1)));
                                }
                            }
                            zVar = zVar2;
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f144506a.error("getAllSportCapabilities", (Throwable) e);
                        if (cursorQuery != null) {
                        }
                        if (zVar != null) {
                            return zVar;
                        }
                        return new z<>(0);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (zVar != null) {
            return zVar;
        }
        return new z<>(0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static ArrayList e(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorRawQuery;
        ArrayList arrayList = new ArrayList();
        ?? r14 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("pragma table_info(devices);", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            arrayList.add(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name")));
                        } catch (Exception e4) {
                            e = e4;
                            f144506a.error("getTableColumns [devices]", (Throwable) e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            return null;
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                r14 = sQLiteDatabase;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            cursorRawQuery = null;
        } catch (Throwable th4) {
            th = th4;
            if (r14 != 0) {
                r14.close();
            }
            throw th;
        }
    }

    public static boolean f(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            boolean z14 = cursorRawQuery.getColumnIndex(str2) != -1;
            cursorRawQuery.close();
            return z14;
        } catch (Throwable th3) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th3;
        }
    }

    public static void g(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListE = e(sQLiteDatabase);
        if (arrayListE == null) {
            throw new SQLException("Null table columns for [devices].");
        }
        String strJoin = TextUtils.join(",", arrayListE);
        for (String str : arrayListE) {
            if (str.equals("deviceSettingsFileName")) {
                arrayListE.set(arrayListE.indexOf(str), "gcmSettingsFileName");
            }
        }
        String strJoin2 = TextUtils.join(",", arrayListE);
        sQLiteDatabase.execSQL("ALTER TABLE devices RENAME TO devices_old;");
        sQLiteDatabase.execSQL("create table if not exists devices (_id integer primary key autoincrement, unit_id integer, application_key text, product_nbr text, mac_address text, product_display_name text, bt_friendly_name text, connection_type text, last_connected_timestamp integer, software_version text, is_software_update_available integer default 0, min_app_version_code_supported integer default 99999, image_url text, video_url text, categories text, is_segment_capable integer default 0, garmin_device_xml blob, garmin_device_xml_id text, is_connected integer default 0, sku text, capabilities integer default 0, gble_ediv blob, gble_rand blob, gble_ltk blob, is_vivohub_configurable integer default 0, sport_capabilities integer default 0, is_primary_user integer default 1, display_name text, training_video_url text, active_ind integer, part_nbr text, fitpay_user_id text, nfc_se_id text, multi_link_support integer default 0, gcj02_course_capable integer default 0, activity_course_capable integer default 0, nfc_capable integer default 0, solarPanelUtilizationCapable integer default 0, lowHrAlertCapable integer default 0, abnormalHeartRateAlertCapable integer default 0, gcmSettingsFileName text, sku_image_url text, sku_image_defaultWatchFace_url text, sku_image_defaultWatchFaceBlank_url text, sku_image_sideProfile_url text, sku_image_tutorial_url text, sku_image_option1_url text, sku_image_option2_url text, sku_image_option3_url text, spectatorMessagingCapable integer default 0, trainingStatusPauseCapable integer default 0, trainingStatusCapable integer default 0, measurementUnitSettingCapable integer default 0, powerCurveCapable integer default 0, secondaryWorkoutStepTargetCapable integer default 0,assistancePlusCapable integer default 0,emergencyCallingCapable integer default 0,solarChargeCapable integer default 0,diveAppSyncCapable integer default 0,dayOfWeekSleepWindowCapable integer default 0,primaryApp integer default 0,incompatibleApps text,applyBackupCapable integer default 0,hillScoreAndEnduranceScoreCapable integer default 0,bodyBatteryTrueUpCapable integer default 0,rechargeableSensorCapable integer default 0,startActivityCapable integer default 0,pendingActivityCapable integer default 0,fixedLocationCapable integer default 0,screenlessDeviceCapable integer default 0,startStopWorkoutCapable integer default 0,fallDetectionCapable integer default 0,directActivationCapable integer default 0,lastUploadToServerTimestamp bigint default 0);");
        sQLiteDatabase.execSQL(e0.g("INSERT INTO devices(", strJoin2, ") SELECT ", strJoin, " FROM devices_old;"));
        sQLiteDatabase.execSQL("DROP TABLE devices_old;");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static void h(long j8, String str, long j14, SQLiteDatabase sQLiteDatabase) throws Throwable {
        Throwable th3;
        SQLException sQLException;
        long j15;
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("unit_id", Long.valueOf(j8));
        contentValues.put("capability_group", str);
        contentValues.put("capability_mask", Long.valueOf(j14));
        String strValueOf = String.valueOf(j8);
        String[] strArr = {strValueOf, str};
        ?? r14 = 0;
        try {
            try {
                Cursor cursorQuery = sQLiteDatabase.query("device_capabilities", null, "unit_id=? AND capability_group=?", strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            j15 = cursorQuery.getLong(0);
                        } else {
                            j15 = -1;
                        }
                    } catch (SQLException e4) {
                        sQLException = e4;
                        f144506a.error(".capabilitiesRecordExists(" + j8 + ")", (Throwable) sQLException);
                        throw sQLException;
                    }
                } else {
                    j15 = -1;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (j15 == -1) {
                    sQLiteDatabase.insert("device_capabilities", null, contentValues);
                } else {
                    sQLiteDatabase.update("device_capabilities", contentValues, "_id=?", new String[]{String.valueOf(j15)});
                }
            } catch (Throwable th4) {
                th3 = th4;
                r14 = strValueOf;
                if (r14 != 0) {
                    throw th3;
                }
                r14.close();
                throw th3;
            }
        } catch (SQLException e14) {
            sQLException = e14;
        } catch (Throwable th5) {
            th3 = th5;
            if (r14 != 0) {
                throw th3;
            }
            r14.close();
            throw th3;
        }
    }

    public static boolean i(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo48...");
            if (f("golf_course_image_data", "map_type", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE golf_course_image_data ADD COLUMN map_type integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo48", (Throwable) e4);
            return false;
        }
    }

    public static boolean j(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo50...");
            if (f("devices", "emergencyCallingCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN emergencyCallingCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo50", (Throwable) e4);
            return false;
        }
    }

    public static boolean k(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo51...");
            if (f("devices", "solarChargeCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN solarChargeCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo51", (Throwable) e4);
            return false;
        }
    }

    public static boolean l(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo52...");
            if (f("devices", "garmin_device_xml_id", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN garmin_device_xml_id text");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo52", (Throwable) e4);
            return false;
        }
    }

    public static boolean m(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo53...");
            if (f("devices", "diveAppSyncCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN diveAppSyncCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo53", (Throwable) e4);
            return false;
        }
    }

    public static boolean n(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo54...");
            if (f("devices", "lastUploadToServerTimestamp", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN lastUploadToServerTimestamp bigint default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("Error in upgradeTo54", (Throwable) e4);
            return false;
        }
    }

    public static boolean o(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo55...");
            if (f("devices", "sku_image_url", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN sku_image_url text");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo55", (Throwable) e4);
            return false;
        }
    }

    public static boolean p(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo56...");
            if (f("devices", "dayOfWeekSleepWindowCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN dayOfWeekSleepWindowCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo56", (Throwable) e4);
            return false;
        }
    }

    public static boolean q(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo57...");
            if (f("devices", "primaryApp", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN primaryApp integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo57", (Throwable) e4);
            return false;
        }
    }

    public static boolean r(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo58...");
            if (f("devices", "applyBackupCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN applyBackupCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo58", (Throwable) e4);
            return false;
        }
    }

    public static boolean s(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo59...");
            if (f("devices", "hillScoreAndEnduranceScoreCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN hillScoreAndEnduranceScoreCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo59", (Throwable) e4);
            return false;
        }
    }

    public static boolean t(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo60...");
            if (f("devices", "incompatibleApps", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN incompatibleApps text");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo60", (Throwable) e4);
            return false;
        }
    }

    public static boolean u(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo61...");
            if (f("devices", "bodyBatteryTrueUpCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN bodyBatteryTrueUpCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo61", (Throwable) e4);
            return false;
        }
    }

    public static boolean v(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo62...");
            if (f("devices", "rechargeableSensorCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN rechargeableSensorCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo62", (Throwable) e4);
            return false;
        }
    }

    public static boolean w(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo63...");
            if (f("devices", "startActivityCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN startActivityCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo63", (Throwable) e4);
            return false;
        }
    }

    public static boolean x(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo64...");
            if (f("devices", "pendingActivityCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN pendingActivityCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo64", (Throwable) e4);
            return false;
        }
    }

    public static boolean y(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo65...");
            if (f("devices", "fixedLocationCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN fixedLocationCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo65", (Throwable) e4);
            return false;
        }
    }

    public static boolean z(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144506a;
        try {
            logger.warn("Executing upgradeTo66...");
            if (f("devices", "screenlessDeviceCapable", sQLiteDatabase)) {
                return true;
            }
            sQLiteDatabase.execSQL("ALTER TABLE devices ADD COLUMN screenlessDeviceCapable integer default 0");
            return true;
        } catch (SQLException e4) {
            logger.error("upgradeTo66", (Throwable) e4);
            return false;
        }
    }
}
