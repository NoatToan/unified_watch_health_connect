package com.huawei.openalliance.ad;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.StaleDataException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.app.AppCompatDelegate;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class dg extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f18384a = "dg";
    private static dg d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f18386c;
    private final Context g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f18385b = new AtomicInteger();
    private static final AtomicInteger e = new AtomicInteger(3);
    private static final byte[] f = new byte[0];

    private boolean a(int i) {
        return i >= 93;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f18385b.incrementAndGet();
        this.f18386c = sQLiteDatabase;
        a(i2, i);
        f18385b.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f18385b.incrementAndGet();
        this.f18386c = sQLiteDatabase;
        a(i2, i);
        f18385b.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        f18385b.incrementAndGet();
        this.f18386c = sQLiteDatabase;
        a(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        f18385b.decrementAndGet();
    }

    public long g(String str) {
        synchronized (this) {
            if (!h(str)) {
                hw.c(f18384a, "queryCnt fail, table name is not right");
                return 0L;
            }
            try {
                return getReadableDatabase().compileStatement("SELECT COUNT(*) FROM \"" + str + '\"').simpleQueryForLong();
            } catch (Exception unused) {
                hw.c(f18384a, "queryCnt fail");
                return 0L;
            }
        }
    }

    void f(String str) throws com.huawei.openalliance.ad.exception.a {
        if (!h(str)) {
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        try {
            this.f18386c.execSQL(" ALTER TABLE " + str + " RENAME TO _temp_" + str);
        } catch (SQLException unused) {
            hw.c(f18384a, "modifyTableName fail");
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "modify tableName: %s name failed", str.trim()));
        } catch (IllegalStateException unused2) {
            hw.c(f18384a, "modifyTableName fail");
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "modify tableName: %s name failed", str.trim()));
        }
    }

    boolean e(String str) throws com.huawei.openalliance.ad.exception.a {
        if (!h(str)) {
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                try {
                    cursorRawQuery = this.f18386c.rawQuery("select count(1) as c from sqlite_master where type ='table' and name = ?", new String[]{str.trim()});
                    boolean z = false;
                    if (cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                        z = true;
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return z;
                } catch (StaleDataException unused) {
                    throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "query tableName: %s failed", str.trim()));
                } catch (IllegalArgumentException unused2) {
                    throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "query tableName: %s failed", str.trim()));
                }
            } catch (CursorIndexOutOfBoundsException unused3) {
                throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "query tableName: %s failed", str.trim()));
            } catch (IllegalStateException unused4) {
                throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "query tableName: %s failed", str.trim()));
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    String[] d(String str) throws com.huawei.openalliance.ad.exception.a {
        if (!h(str)) {
            throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.f18386c.rawQuery(" select * from " + str + " order by _id asc LIMIT 1", null);
                cursorRawQuery.moveToNext();
                String[] columnNames = cursorRawQuery.getColumnNames();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return columnNames;
            } catch (Exception unused) {
                hw.c(f18384a, "getColumnNames error");
                throw new com.huawei.openalliance.ad.exception.a(String.format(Locale.ENGLISH, "get new tableName: %s column names failed", str.trim()));
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (f18385b.decrementAndGet() <= 0) {
                super.close();
            }
        }
    }

    public void c(String str) throws com.huawei.openalliance.ad.exception.a {
        try {
            this.f18386c.execSQL(str);
        } catch (Exception unused) {
            hw.c(f18384a, "executeSQL error");
            throw new com.huawei.openalliance.ad.exception.a("execute sql failed");
        }
    }

    void b(String str) {
        if (!h(str)) {
            hw.c(f18384a, "tableName: %s is invalid", str);
            return;
        }
        try {
            this.f18386c.execSQL(" DROP TABLE " + str);
        } catch (Exception e2) {
            hw.c(f18384a, "delete table: %s fail, exception: %s", str, e2.getClass().getSimpleName());
        }
    }

    public void a(List<dh> list) {
        synchronized (this) {
            if (list != null) {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            for (dh dhVar : list) {
                                if (a(writableDatabase, dhVar)) {
                                    writableDatabase.update(dhVar.a(), dhVar.k(), dhVar.i(), dhVar.j());
                                } else {
                                    writableDatabase.insertOrThrow(dhVar.a(), null, dhVar.k());
                                }
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase = writableDatabase;
                            try {
                                hw.a(5, f18384a, "insertOrUpdate ", th);
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e A[Catch: all -> 0x0053, PHI: r0
      0x003e: PHI (r0v3 android.database.sqlite.SQLiteDatabase) = (r0v2 android.database.sqlite.SQLiteDatabase), (r0v4 android.database.sqlite.SQLiteDatabase) binds: [B:20:0x003c, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:21:0x003e, B:26:0x0046, B:27:0x0049, B:28:0x004a, B:19:0x0034), top: B:38:0x0003, inners: #1 }] */
    public void a(String str, ContentValues contentValues, String str2, List<String> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            if (list != null) {
                if (!list.isEmpty()) {
                    try {
                        writableDatabase = getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                writableDatabase.update(str, contentValues, str2, new String[]{it.next()});
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                hw.a(5, f18384a, "update ", th);
                                if (writableDatabase != null) {
                                    writableDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (writableDatabase != null) {
                                    writableDatabase.endTransaction();
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        writableDatabase = null;
                    }
                    return;
                }
            }
            hw.a(f18384a, "nothing update, items is empty");
        }
    }

    void a(String str) {
        if (!h(str)) {
            hw.c(f18384a, "tableName: %s is invalid", str);
            return;
        }
        try {
            this.f18386c.execSQL(" DROP TABLE _temp_" + str);
        } catch (Exception e2) {
            hw.c(f18384a, "delete temp tableName: %s failed, exception: %s", str, e2.getClass().getSimpleName());
        }
    }

    public void a() {
        synchronized (this) {
            f18385b.decrementAndGet();
        }
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor cursorQuery;
        synchronized (this) {
            cursorQuery = getReadableDatabase().query(str, strArr, str2, strArr2, null, null, str3, str4);
        }
        return cursorQuery;
    }

    public Cursor a(String str, String[] strArr) {
        Cursor cursorRawQuery;
        synchronized (this) {
            cursorRawQuery = getReadableDatabase().rawQuery(str, strArr);
        }
        return cursorRawQuery;
    }

    public long a(String str, List<ContentValues> list) {
        SQLiteDatabase writableDatabase;
        long jInsert;
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        writableDatabase = getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            Iterator<ContentValues> it = list.iterator();
                            jInsert = 0;
                            while (it.hasNext()) {
                                jInsert = writableDatabase.insert(str, null, it.next());
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteDatabase = writableDatabase;
                            hw.a(3, f18384a, "batchInsert", e);
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            jInsert = -1;
                        } catch (Throwable th) {
                            th = th;
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    writableDatabase = sQLiteDatabase;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jInsert;
    }

    public long a(String str, ContentValues contentValues) {
        long jInsertOrThrow;
        synchronized (this) {
            try {
                jInsertOrThrow = getWritableDatabase().insertOrThrow(str, null, contentValues);
            } catch (Throwable th) {
                String str2 = f18384a;
                hw.c(str2, "insert " + th.getClass().getSimpleName());
                hw.a(str2, "insert %s", th.getMessage());
                jInsertOrThrow = -1;
            }
        }
        return jInsertOrThrow;
    }

    public int a(String str, String str2, String[] strArr) {
        int iDelete;
        synchronized (this) {
            try {
                iDelete = getWritableDatabase().delete(str, str2, strArr);
            } catch (Exception e2) {
                String str3 = f18384a;
                hw.c(str3, "delete " + e2.getClass().getSimpleName());
                hw.a(str3, "delete %s", e2.getMessage());
                iDelete = 0;
            }
        }
        return iDelete;
    }

    public int a(String str, String str2, List<String> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            int iDelete = 0;
            if (list != null) {
                if (!list.isEmpty()) {
                    try {
                        writableDatabase = getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                iDelete += writableDatabase.delete(str, str2, new String[]{it.next()});
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                            return iDelete;
                        } catch (Throwable th) {
                            th = th;
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        writableDatabase = null;
                    }
                }
            }
            hw.a(f18384a, "noting delete, items is empty");
            return 0;
        }
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        int iUpdate;
        synchronized (this) {
            try {
                iUpdate = getWritableDatabase().update(str, contentValues, str2, strArr);
            } catch (Throwable th) {
                String str3 = f18384a;
                hw.c(str3, "update " + th.getClass().getSimpleName());
                hw.a(str3, "update %s", th.getMessage());
                iUpdate = 0;
            }
        }
        return iUpdate;
    }

    private boolean h(String str) {
        return dj.a(str);
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, dh dhVar) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query(dhVar.a(), dhVar.b(), dhVar.c(), dhVar.d(), dhVar.e(), dhVar.f(), dhVar.g(), dhVar.h());
                if (cursorQuery != null) {
                    return cursorQuery.getCount() > 0;
                }
            } catch (Exception unused) {
                hw.d(f18384a, "query exception");
            }
            return false;
        } finally {
            com.huawei.openalliance.ad.utils.df.a(cursorQuery);
        }
    }

    private void a(int i, int i2) {
        com.huawei.openalliance.ad.analysis.c cVar;
        String str;
        int i3;
        try {
            try {
                dj djVar = new dj(this);
                this.f18386c.beginTransaction();
                if (a(i2)) {
                    djVar.a();
                } else {
                    djVar.c();
                }
                this.f18386c.setTransactionSuccessful();
                this.f18386c.endTransaction();
                cVar = new com.huawei.openalliance.ad.analysis.c(this.g);
                str = "hiad.db";
                i3 = 0;
            } catch (Throwable unused) {
                hw.c(f18384a, "initTables error");
                this.f18386c.endTransaction();
                cVar = new com.huawei.openalliance.ad.analysis.c(this.g);
                str = "hiad.db";
                i3 = 1;
            }
            cVar.a(str, i2, i, i3, "2100011");
        } catch (Throwable th) {
            this.f18386c.endTransaction();
            new com.huawei.openalliance.ad.analysis.c(this.g).a("hiad.db", i2, i, 1, "2100011");
            throw th;
        }
    }

    public static dg a(Context context) {
        dg dgVar;
        synchronized (f) {
            if (d == null) {
                d = new dg(context.getApplicationContext());
            }
            f18385b.incrementAndGet();
            dgVar = d;
        }
        return dgVar;
    }

    private dg(final Context context) {
        super(context, "hiad.db", null, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, new DatabaseErrorHandler() { // from class: com.huawei.openalliance.ad.dg.1
            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                try {
                    try {
                        if (dg.e.decrementAndGet() < 0) {
                            hw.a(dg.f18384a, "try time more three");
                            new com.huawei.openalliance.ad.analysis.c(context).a("hiad.db", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 1, "2100012");
                            return;
                        }
                        hw.a(dg.f18384a, "reset time %s", dg.e);
                        com.huawei.openalliance.ad.utils.ai.e(context.getDatabasePath("hiad.db"));
                        hw.a(dg.f18384a, "delete dababases");
                        synchronized (dg.f) {
                            dg unused = dg.d = new dg(context);
                            hw.a(dg.f18384a, "rebuilding databases");
                        }
                        new com.huawei.openalliance.ad.analysis.c(context).a("hiad.db", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 0, "2100012");
                    } catch (Exception unused2) {
                        hw.c(dg.f18384a, "upgrade databases error");
                        new com.huawei.openalliance.ad.analysis.c(context).a("hiad.db", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 1, "2100012");
                    }
                } catch (Throwable th) {
                    new com.huawei.openalliance.ad.analysis.c(context).a("hiad.db", AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 1, "2100012");
                    throw th;
                }
            }
        });
        this.f18386c = null;
        this.g = context;
    }
}
