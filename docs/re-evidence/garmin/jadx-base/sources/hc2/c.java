package hc2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import ch.qos.logback.classic.Logger;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;

/* JADX INFO: loaded from: classes11.dex */
public class c extends Observable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f83287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f83288d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f83290b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC1639a f83291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f83292b;

        /* JADX INFO: renamed from: hc2.c$a$a, reason: collision with other inner class name */
        public enum EnumC1639a {
            NEW_SWING_DATA,
            NEW_CLUB_LIST,
            NEW_ACTIVE_CLUB,
            NEW_BATTERY_STATUS
        }

        public a(EnumC1639a enumC1639a, Object obj) {
            this.f83291a = enumC1639a;
            this.f83292b = obj;
        }
    }

    public interface b extends BaseColumns {

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final String[] f83298a0 = {"_id", "created", "time_stamp", "club_swing_file", "wrist_swing_file", "club_name", "club_type_name", "club_id"};
    }

    /* JADX INFO: renamed from: hc2.c$c, reason: collision with other inner class name */
    public static class C1640c extends SQLiteOpenHelper {
        public C1640c(Context context) {
            super(context, "gcm_swings.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("create table if not exists swings (_id integer primary key autoincrement, created integer, time_stamp integer, club_swing_file text, wrist_swing_file text, club_name text, club_type_name text, club_id integer);");
                sQLiteDatabase.setTransactionSuccessful();
                c.f83288d.warn("Created database [gcm_swings.db], version [1].");
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) {
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        int i14 = gt2.c.f79010a;
        f83288d = gt2.b.f79005a.i(simpleName);
    }

    public c(Context context) {
        this.f83290b = null;
        c cVar = f83287c;
        Logger logger = f83288d;
        if (cVar == null) {
            f83287c = this;
            logger.debug("GolfSwingSensorDatabaseOperator initialized successfully.");
        } else {
            logger.error("Already initialized! Why are you calling me again? You should be calling getInstance() instead!");
        }
        this.f83289a = context;
        this.f83290b = new C1640c(context).getWritableDatabase();
    }

    public static void b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static synchronized c c() {
        c cVar = f83287c;
        if (cVar != null) {
            return cVar;
        }
        f83288d.error("Not yet initialized! This class should have been initialized by calling init() on app startup.");
        return null;
    }

    public static hc2.b e(Cursor cursor) {
        hc2.b bVar = new hc2.b();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("time_stamp");
        long j8 = 0;
        try {
            if (!cursor.isNull(columnIndexOrThrow)) {
                j8 = cursor.getLong(columnIndexOrThrow);
            }
        } catch (Exception e4) {
            f83288d.error(e4.getMessage(), (Throwable) e4);
        }
        bVar.f83281a = j8;
        bVar.f83282b = cursor.getString(cursor.getColumnIndexOrThrow("club_swing_file"));
        bVar.f83283c = cursor.getString(cursor.getColumnIndexOrThrow("wrist_swing_file"));
        bVar.f83284d = cursor.getString(cursor.getColumnIndexOrThrow("club_name"));
        bVar.f83285e = cursor.getString(cursor.getColumnIndexOrThrow("club_type_name"));
        bVar.f83286f = cursor.getLong(cursor.getColumnIndexOrThrow("club_id"));
        return bVar;
    }

    public final void a() {
        Cursor cursorQuery;
        Logger logger = f83288d;
        logger.debug("Clearing cache.");
        Cursor cursor = null;
        try {
            cursorQuery = this.f83290b.query("swings", b.f83298a0, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                File file = new File(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("club_swing_file")));
                                if (file.exists()) {
                                    file.delete();
                                }
                            } while (cursorQuery.moveToNext());
                        }
                    } catch (Exception e4) {
                        e = e4;
                        logger.error("Error while clearing cache: ", (Throwable) e);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    b(cursor);
                    throw th;
                }
            }
        } catch (Exception e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            b(cursor);
            throw th;
        }
        b(cursorQuery);
        this.f83290b.delete("swings", null, null);
    }

    public final hc2.b d(long j8) {
        Throwable th3;
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = this.f83290b.query("swings", b.f83298a0, "time_stamp >= ? AND time_stamp <= ?", new String[]{String.valueOf(j8 - 2), String.valueOf(j8 + 2)}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        hc2.b bVarE = e(cursorQuery);
                        cursorQuery.close();
                        return bVarE;
                    }
                } catch (Exception unused) {
                    b(cursorQuery);
                    return null;
                } catch (Throwable th4) {
                    th3 = th4;
                    cursor = cursorQuery;
                    b(cursor);
                    throw th3;
                }
            }
            b(cursorQuery);
            return null;
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th5) {
            th3 = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0238  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:107:0x024f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0127 A[PHI: r12
      0x0127: PHI (r12v13 android.database.Cursor) = (r12v7 android.database.Cursor), (r12v14 android.database.Cursor), (r12v14 android.database.Cursor) binds: [B:48:0x0131, B:27:0x00c3, B:29:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202 A[Catch: all -> 0x01fe, SQLException -> 0x0200, TryCatch #5 {SQLException -> 0x0200, blocks: (B:87:0x01fa, B:93:0x0219, B:92:0x0202), top: B:119:0x01f7, outer: #6 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0202, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v20 */
    public final void f(hc2.b bVar) throws Throwable {
        ?? r14;
        Cursor cursorQuery;
        hc2.b bVar2;
        Logger logger;
        hc2.b bVarD;
        ContentValues contentValues;
        String str;
        String str2;
        String str3;
        String str4;
        SQLiteDatabase sQLiteDatabase;
        Logger logger2;
        String str5;
        String str6;
        String str7;
        hc2.b bVar3 = bVar;
        if (bVar3 == null) {
            return;
        }
        if (bVar3.f83282b == null && bVar3.f83283c == null) {
            return;
        }
        Logger logger3 = f83288d;
        logger3.debug("Saving swing data to database");
        logger3.debug("=============================");
        logger3.debug("UTC: " + System.currentTimeMillis());
        logger3.debug("Timestamp: " + bVar3.f83281a);
        String str8 = bVar3.f83282b;
        if (str8 == null) {
            str8 = "NONE";
        }
        logger3.debug("Sensor File: ".concat(str8));
        String str9 = bVar3.f83283c;
        if (str9 == null) {
            str9 = "NONE";
        }
        logger3.debug("Remote File: ".concat(str9));
        String str10 = bVar3.f83284d;
        if (str10 == null) {
            str10 = "NONE";
        }
        logger3.debug("Club Name: ".concat(str10));
        String str11 = bVar3.f83285e;
        if (str11 == null) {
            str11 = "NONE";
        }
        logger3.debug("Club Type Name: ".concat(str11));
        StringBuilder sb3 = new StringBuilder("Club Id: ");
        long j8 = bVar3.f83286f;
        long j14 = 0;
        Object objValueOf = j8 != 0 ? Long.valueOf(j8) : "NONE";
        sb3.append(objValueOf);
        logger3.debug(sb3.toString());
        logger3.debug("=============================");
        try {
            try {
                cursorQuery = this.f83290b.query("swings", b.f83298a0, null, null, null, null, "time_stamp DESC");
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            bVar2 = new hc2.b();
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("time_stamp");
                            try {
                                if (!cursorQuery.isNull(columnIndexOrThrow)) {
                                    j14 = cursorQuery.getLong(columnIndexOrThrow);
                                }
                            } catch (Exception e4) {
                                logger3.error(e4.getMessage(), (Throwable) e4);
                            }
                            bVar2.f83281a = j14;
                            bVar2.f83282b = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("club_swing_file"));
                            bVar2.f83283c = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("wrist_swing_file"));
                            bVar2.f83284d = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("club_name"));
                            bVar2.f83285e = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("club_type_name"));
                            bVar2.f83286f = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("club_id"));
                            cursorQuery.close();
                        } else {
                            b(cursorQuery);
                            bVar2 = null;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        logger3.error("Error while getting last swing: ", (Throwable) e);
                    }
                } else {
                    b(cursorQuery);
                    bVar2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r14 = objValueOf;
                b(r14);
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            r14 = 0;
            b(r14);
            throw th;
        }
        try {
            try {
                if (bVar2 != null) {
                    long j15 = bVar2.f83281a;
                    long j16 = bVar3.f83281a;
                    Calendar calendar = Calendar.getInstance();
                    Calendar calendar2 = Calendar.getInstance();
                    logger = logger3;
                    calendar.setTime(new Date((j15 + 631065600) * 1000));
                    calendar2.setTime(new Date((j16 + 631065600) * 1000));
                    if (calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                        a();
                        bVarD = null;
                    }
                    if (bVarD != null) {
                        if (bVarD.f83282b == null) {
                            bVarD.f83282b = bVar3.f83282b;
                            bVarD.f83281a = bVar3.f83281a;
                        }
                        str6 = bVarD.f83283c;
                        str7 = bVar3.f83283c;
                        if (str6 == null) {
                            bVarD.f83283c = str7;
                        } else if (str7 == null) {
                            bVar3.f83283c = str6;
                        }
                    }
                    contentValues = new ContentValues();
                    if (bVarD == null) {
                        contentValues.put("created", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("time_stamp", Long.valueOf(bVar3.f83281a));
                    }
                    str = bVar3.f83282b;
                    if (str != null) {
                        contentValues.put("club_swing_file", str);
                        contentValues.put("time_stamp", Long.valueOf(bVar3.f83281a));
                    }
                    str2 = bVar3.f83283c;
                    if (str2 != null) {
                        contentValues.put("wrist_swing_file", str2);
                    }
                    str3 = bVar3.f83284d;
                    if (str3 != null) {
                        contentValues.put("club_name", str3);
                    }
                    str4 = bVar3.f83285e;
                    if (str4 != null) {
                        contentValues.put("club_type_name", str4);
                    }
                    contentValues.put("club_id", Long.valueOf(bVar3.f83286f));
                    sQLiteDatabase = this.f83290b;
                    sQLiteDatabase.beginTransaction();
                    if (bVarD == null) {
                        sQLiteDatabase.insert("swings", null, contentValues);
                    } else {
                        sQLiteDatabase.update("swings", contentValues, "time_stamp = ?", new String[]{"" + bVarD.f83281a});
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    logger2 = logger;
                    if ((bVarD != null || bVarD.f83282b == null) && bVar3.f83282b == null) {
                        return;
                    }
                    if (bVarD != null) {
                        str5 = "existing";
                    } else {
                        str5 = "new";
                    }
                    logger2.debug("======> Notifying observers of new swing data.  Sending ".concat(str5));
                    setChanged();
                    a.EnumC1639a enumC1639a = a.EnumC1639a.NEW_SWING_DATA;
                    if (bVarD != null) {
                        bVar3 = bVarD;
                    }
                    notifyObservers(new a(enumC1639a, bVar3));
                    clearChanged();
                    return;
                }
                logger = logger3;
                if (bVarD == null) {
                    sQLiteDatabase.insert("swings", null, contentValues);
                } else {
                    sQLiteDatabase.update("swings", contentValues, "time_stamp = ?", new String[]{"" + bVarD.f83281a});
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                logger2 = logger;
            } catch (SQLException e16) {
                logger2 = logger;
                logger2.error("SQLException", (Throwable) e16);
                sQLiteDatabase.endTransaction();
            }
            if (bVarD != null) {
                return;
            } else {
                return;
            }
            if (bVarD != null) {
                str5 = "existing";
            } else {
                str5 = "new";
            }
            logger2.debug("======> Notifying observers of new swing data.  Sending ".concat(str5));
            setChanged();
            a.EnumC1639a enumC1639a2 = a.EnumC1639a.NEW_SWING_DATA;
            if (bVarD != null) {
                bVar3 = bVarD;
            }
            notifyObservers(new a(enumC1639a2, bVar3));
            clearChanged();
            return;
        } catch (Throwable th5) {
            sQLiteDatabase.endTransaction();
            throw th5;
        }
        bVarD = d(bVar3.f83281a);
        if (bVarD != null) {
            if (bVarD.f83282b == null) {
                bVarD.f83282b = bVar3.f83282b;
                bVarD.f83281a = bVar3.f83281a;
            }
            str6 = bVarD.f83283c;
            str7 = bVar3.f83283c;
            if (str6 == null) {
                bVarD.f83283c = str7;
            } else if (str7 == null) {
                bVar3.f83283c = str6;
            }
        }
        contentValues = new ContentValues();
        if (bVarD == null) {
            contentValues.put("created", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("time_stamp", Long.valueOf(bVar3.f83281a));
        }
        str = bVar3.f83282b;
        if (str != null) {
            contentValues.put("club_swing_file", str);
            contentValues.put("time_stamp", Long.valueOf(bVar3.f83281a));
        }
        str2 = bVar3.f83283c;
        if (str2 != null) {
            contentValues.put("wrist_swing_file", str2);
        }
        str3 = bVar3.f83284d;
        if (str3 != null) {
            contentValues.put("club_name", str3);
        }
        str4 = bVar3.f83285e;
        if (str4 != null) {
            contentValues.put("club_type_name", str4);
        }
        contentValues.put("club_id", Long.valueOf(bVar3.f83286f));
        sQLiteDatabase = this.f83290b;
        sQLiteDatabase.beginTransaction();
    }
}
