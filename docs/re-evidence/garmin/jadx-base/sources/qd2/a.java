package qd2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f144482c = LoggerFactory.getLogger("GCMCacheManager");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f144483d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f144484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd2.b f144485b;

    /* JADX INFO: renamed from: qd2.a$a, reason: collision with other inner class name */
    public enum EnumC2721a {
        ACTIVITY_DETAILS,
        ACTIVITY_POLYLINE,
        ACTIVITY_CHARTS,
        ACTIVITY_LAPS,
        ACTIVITY_SEGMENTS,
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVITY_WEATHER,
        ACTIVITY_DEVICE,
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVITY_GEAR,
        ACTIVITY_CONNECT_IQ_DISPLAY_INFO
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        CHARTS_COLOR_CODES_GROUND_CONTACT_TIME,
        /* JADX INFO: Fake field, exist only in values array */
        CHARTS_COLOR_CODES_RUNNING_CADENCE,
        ACTIVITY_LIST,
        /* JADX INFO: Fake field, exist only in values array */
        COURSES_LIST,
        /* JADX INFO: Fake field, exist only in values array */
        PERSONAL_RECORDS,
        /* JADX INFO: Fake field, exist only in values array */
        WORKOUTS_LIST,
        /* JADX INFO: Fake field, exist only in values array */
        STEP_SUMMARY_TODAY,
        /* JADX INFO: Fake field, exist only in values array */
        STEP_GOAL_TODAY,
        /* JADX INFO: Fake field, exist only in values array */
        GOLF_USER_HISTORY,
        /* JADX INFO: Fake field, exist only in values array */
        GOLF_SCORECARD,
        /* JADX INFO: Fake field, exist only in values array */
        GOLF_COURSES,
        /* JADX INFO: Fake field, exist only in values array */
        LAST_SYNC_TIME,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECTIONS_NEWS_FEED,
        /* JADX INFO: Fake field, exist only in values array */
        MY_CONNECTIONS,
        ALL_DEVICES,
        MY_SEGMENTS,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        CONNECTION_GROUPS_LIST,
        GOLF_SWING_LIST,
        CLUB_TYPE_LIST,
        CLUB_LIST,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        INTELLIGENT_ROLES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_INTENSITY_MINUTES,
        /* JADX INFO: Fake field, exist only in values array */
        BADGES,
        SOCIAL_PROFILE,
        USER_SETTINGS,
        /* JADX INFO: Fake field, exist only in values array */
        STRENGTH_TRAINING_SNAPSHOT,
        /* JADX INFO: Fake field, exist only in values array */
        USER_PROFILE_BADGES,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_HEART_RATE,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_RESPIRATION,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_BODY_BATTERY,
        /* JADX INFO: Fake field, exist only in values array */
        REAL_TIME_TRAINING_READINESS
    }

    private a(Context context) {
        Logger logger = f144482c;
        logger.debug("constructor **** BEGIN");
        qd2.b bVar = new qd2.b(context);
        this.f144485b = bVar;
        logger.debug("constructor: created GCMSQLiteOpenHelper");
        this.f144484a = bVar.getWritableDatabase();
        logger.debug("constructor: mDatabase variable set by using GCMSQLiteOpenHelper to get writable database");
        logger.debug("constructor **** END");
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static synchronized a b() {
        a aVar = f144483d;
        if (aVar != null) {
            return aVar;
        }
        f144482c.error("Not yet initialized! This class should have been initialized by calling init() on app startup.");
        return null;
    }

    public static void e(Context context) {
        Logger logger = f144482c;
        logger.debug("init **** BEGIN");
        if (f144483d == null) {
            ConnectDatabase.init(context);
            f144483d = new a(context.getApplicationContext());
            logger.debug("init: GCMCacheManager initialized successfully.");
        } else {
            logger.error("init: Already initialized! Why are you calling me again? You should be calling getInstance() instead!");
        }
        logger.debug("init **** END");
    }

    public final String c(b bVar) {
        String[] strArrD;
        if (bVar != null && (strArrD = d(bVar)) != null && strArrD.length == 2 && Long.parseLong(strArrD[0]) <= Long.MAX_VALUE) {
            return strArrD[1];
        }
        return null;
    }

    public final String[] d(b bVar) throws Throwable {
        Throwable th3;
        String[] strArr;
        Logger logger = f144482c;
        Cursor cursor = null;
        string = null;
        String string = null;
        strArr = null;
        String[] strArr2 = null;
        cursor = null;
        if (bVar == null) {
            return null;
        }
        try {
            try {
                Cursor cursorQuery = this.f144484a.query("json", new String[]{"saved_timestamp", "cached_val"}, "concept_name=?", new String[]{bVar.name()}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                strArr = new String[2];
                                try {
                                    int columnIndex = cursorQuery.getColumnIndex("saved_timestamp");
                                    long j8 = 0;
                                    if (columnIndex != -1) {
                                        try {
                                            if (!cursorQuery.isNull(columnIndex)) {
                                                j8 = cursorQuery.getLong(columnIndex);
                                            }
                                        } catch (Exception e4) {
                                            logger.error(e4.getMessage(), (Throwable) e4);
                                        }
                                    }
                                    strArr[0] = ((System.currentTimeMillis() - j8) / 60000) + "";
                                    int columnIndex2 = cursorQuery.getColumnIndex("cached_val");
                                    if (columnIndex2 != -1 && !cursorQuery.isNull(columnIndex2)) {
                                        string = cursorQuery.getString(columnIndex2);
                                    }
                                    strArr[1] = string;
                                    strArr2 = strArr;
                                } catch (SQLException e14) {
                                    e = e14;
                                    cursor = cursorQuery;
                                    logger.error("getJSON(" + bVar.name() + ")", (Throwable) e);
                                    a(cursor);
                                    return strArr;
                                }
                            }
                        } catch (Throwable th4) {
                            th3 = th4;
                            cursor = cursorQuery;
                            a(cursor);
                            throw th3;
                        }
                    } catch (SQLException e15) {
                        e = e15;
                        strArr = null;
                    }
                }
                a(cursorQuery);
                return strArr2;
            } catch (SQLException e16) {
                e = e16;
                strArr = null;
            }
        } catch (Throwable th5) {
            th3 = th5;
        }
    }

    public final void f() {
        SQLiteDatabase sQLiteDatabase = this.f144484a;
        sQLiteDatabase.execSQL("drop table if exists json");
        sQLiteDatabase.execSQL("drop table if exists json_steps");
        sQLiteDatabase.execSQL("drop table if exists json_myfitnesspal_calories");
        sQLiteDatabase.execSQL("drop table if exists json_activities");
        sQLiteDatabase.execSQL("drop table if exists json_courses");
        this.f144485b.onCreate(sQLiteDatabase);
    }

    public final void g(b bVar, String str) {
        Logger logger = f144482c;
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f144484a;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("json", "concept_name=?", new String[]{bVar.name()});
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("concept_name", bVar.name());
            contentValues.put("cached_val", str.trim());
            sQLiteDatabase.insert("json", null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
            logger.debug("JSON for concept name [" + bVar.name() + "] saved successfully.");
        } catch (SQLException e4) {
            logger.error("setJSON(" + bVar.name() + ")", (Throwable) e4);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final int h(EnumC2721a enumC2721a, long j8) {
        if (enumC2721a == null) {
            return 0;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("saved_timestamp", (Long) 41835600000L);
        int iUpdate = this.f144484a.update("json_activities", contentValues, "data_type=? AND concept_id=?", new String[]{enumC2721a.name(), Long.toString(j8)});
        if (iUpdate > 0) {
            f144482c.debug("JSON for activity data type [" + enumC2721a.name() + "], activityId [" + j8 + "] set to stale.");
        }
        return iUpdate;
    }

    public final void i(b bVar) {
        Logger logger = f144482c;
        if (bVar == null) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("saved_timestamp", (Long) 41835600000L);
            if (this.f144484a.update("json", contentValues, "concept_name=?", new String[]{bVar.name()}) > 0) {
                logger.debug("JSON for concept[" + bVar.name() + "] set to stale.");
            }
        } catch (SQLException e4) {
            logger.error("setJSONConceptAsStale(" + bVar.name() + ")", (Throwable) e4);
        }
    }
}
