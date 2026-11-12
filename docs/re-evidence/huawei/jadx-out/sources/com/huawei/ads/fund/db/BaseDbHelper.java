package com.huawei.ads.fund.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.ayo;
import defpackage.ayt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDbHelper extends SQLiteOpenHelper {
    public static final AtomicInteger OPEN_COUNTER = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f4779a;

    protected abstract BaseDbUpdateHelper getDbUpdateHelper();

    protected abstract String getTag();

    protected boolean needKeepData() {
        return false;
    }

    public void update(String str, ContentValues contentValues, String str2, List<String> list) {
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
                        } catch (Throwable th) {
                            th = th;
                            try {
                                HiAdLog.printSafeExceptionMessage(5, getTag(), "update ", th);
                                if (writableDatabase != null) {
                                }
                                return;
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
                    writableDatabase.endTransaction();
                    return;
                }
            }
            getTag();
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        int iUpdate;
        synchronized (this) {
            try {
                iUpdate = getWritableDatabase().update(str, contentValues, str2, strArr);
            } catch (Throwable th) {
                HiAdLog.w(getTag(), "update %s", th.getClass().getSimpleName());
                getTag();
                th.getMessage();
                iUpdate = 0;
            }
        }
        return iUpdate;
    }

    public Cursor rawQuery(String str, String[] strArr) {
        Cursor cursorRawQuery;
        synchronized (this) {
            cursorRawQuery = getReadableDatabase().rawQuery(str, strArr);
        }
        return cursorRawQuery;
    }

    public long queryCount(String str) {
        synchronized (this) {
            if (!a(str)) {
                return 0L;
            }
            try {
                return getReadableDatabase().compileStatement("SELECT COUNT(*) FROM \"" + str + '\"').simpleQueryForLong();
            } catch (Exception e) {
                HiAdLog.printSafeStackTrace(3, e);
                return 0L;
            }
        }
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor cursorQuery;
        synchronized (this) {
            cursorQuery = getReadableDatabase().query(str, strArr, str2, strArr2, null, null, str3, str4);
        }
        return cursorQuery;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AtomicInteger atomicInteger = OPEN_COUNTER;
        atomicInteger.incrementAndGet();
        this.f4779a = sQLiteDatabase;
        a(needKeepData());
        atomicInteger.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AtomicInteger atomicInteger = OPEN_COUNTER;
        atomicInteger.incrementAndGet();
        this.f4779a = sQLiteDatabase;
        a(needKeepData());
        atomicInteger.decrementAndGet();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicInteger atomicInteger = OPEN_COUNTER;
        atomicInteger.incrementAndGet();
        this.f4779a = sQLiteDatabase;
        a(false);
        atomicInteger.decrementAndGet();
    }

    public void insertOrUpdate(List<ayt> list) {
        synchronized (this) {
            if (list != null) {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        try {
                            writableDatabase.beginTransaction();
                            for (ayt aytVar : list) {
                                if (writableDatabase.update(aytVar.a(), aytVar.c(), aytVar.h(), aytVar.b()) <= 0) {
                                    writableDatabase.insertOrThrow(aytVar.a(), null, aytVar.c());
                                }
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase = writableDatabase;
                            try {
                                HiAdLog.printSafeExceptionMessage(5, getTag(), "insertOrUpdate ", th);
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

    public void insert(List<ayt> list) {
        synchronized (this) {
            if (ListUtil.isEmpty(list)) {
                return;
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    for (ayt aytVar : list) {
                        writableDatabase.insertOrThrow(aytVar.a(), null, aytVar.c());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        getTag();
                        th.getMessage();
                        HiAdLog.w(getTag(), "insert ex " + th.getClass().getSimpleName());
                        HiAdLog.printSafeStackTrace(3, th);
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

    public long insert(String str, ContentValues contentValues) {
        long jInsertOrThrow;
        synchronized (this) {
            try {
                jInsertOrThrow = getWritableDatabase().insertOrThrow(str, null, contentValues);
            } catch (Throwable th) {
                getTag();
                th.getMessage();
                HiAdLog.w(getTag(), "insert ex " + th.getClass().getSimpleName());
                HiAdLog.printSafeStackTrace(3, th);
                jInsertOrThrow = -1;
            }
        }
        return jInsertOrThrow;
    }

    void f(String str) throws ayo {
        if (!a(str)) {
            throw new ayo(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        try {
            this.f4779a.execSQL(" ALTER TABLE " + str + " RENAME TO _temp_" + str);
        } catch (Throwable unused) {
            HiAdLog.w(getTag(), "modifyTableName fail");
            throw new ayo(String.format(Locale.ENGLISH, "modify tableName: %s name failed", str.trim()));
        }
    }

    public void executeSql(String str, Object[] objArr) {
        synchronized (this) {
            try {
                getWritableDatabase().execSQL(str, objArr);
            } catch (Throwable th) {
                HiAdLog.w(getTag(), "update %s", th.getClass().getSimpleName());
            }
        }
    }

    public void executeSQL(String str) throws ayo {
        try {
            this.f4779a.execSQL(str);
        } catch (Exception unused) {
            HiAdLog.w(getTag(), "executeSQL error");
            throw new ayo("execute sql failed");
        }
    }

    boolean e(String str) throws ayo {
        Cursor cursorRawQuery;
        if (!a(str)) {
            throw new ayo(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        try {
            cursorRawQuery = this.f4779a.rawQuery("select count(1) as c from sqlite_master where type ='table' and name = ?", new String[]{str.trim()});
            try {
                boolean z = false;
                if (cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                    z = true;
                }
                cursorRawQuery.close();
                return z;
            } catch (Throwable unused) {
                try {
                    throw new ayo(String.format(Locale.ENGLISH, "query tableName: %s failed", str.trim()));
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
    }

    public void delete(String str, String str2, List<String> list) {
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
                                writableDatabase.delete(str, str2, new String[]{it.next()});
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            return;
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
            getTag();
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        int iDelete;
        synchronized (this) {
            iDelete = 0;
            try {
                iDelete = getWritableDatabase().delete(str, str2, strArr);
                getTag();
                Arrays.toString(strArr);
            } catch (Throwable th) {
                HiAdLog.w(getTag(), "delete " + th.getClass().getSimpleName());
            }
        }
        return iDelete;
    }

    String[] d(String str) throws ayo {
        if (!a(str)) {
            throw new ayo(String.format(Locale.ENGLISH, "tableName: %s is invalid", str.trim()));
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = this.f4779a.rawQuery(" select * from " + str + " order by _id asc LIMIT 1", null);
                cursorRawQuery.moveToNext();
                String[] columnNames = cursorRawQuery.getColumnNames();
                cursorRawQuery.close();
                return columnNames;
            } catch (Exception unused) {
                HiAdLog.w(getTag(), "getColumnNames error");
                throw new ayo(String.format(Locale.ENGLISH, "get new tableName: %s column names failed", str.trim()));
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
            if (OPEN_COUNTER.decrementAndGet() <= 0) {
                super.close();
            }
        }
    }

    public void clearExpiredData() {
        getDbUpdateHelper().a();
    }

    void c(String str) {
        if (!a(str)) {
            HiAdLog.w(getTag(), "tableName: %s is invalid", str);
            return;
        }
        try {
            this.f4779a.execSQL(" DROP TABLE _temp_" + str);
        } catch (Exception e) {
            HiAdLog.w(getTag(), "delete temp tableName: %s failed, exception: %s", str, e.getClass().getSimpleName());
        }
    }

    public void batchExecute(String str, List<String[]> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            if (TextUtils.isEmpty(str) || ListUtil.isEmpty(list)) {
                getTag();
                return;
            }
            try {
                writableDatabase = getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement(str);
                    Iterator<String[]> it = list.iterator();
                    while (it.hasNext()) {
                        sQLiteStatementCompileStatement.bindAllArgsAsStrings(it.next());
                        sQLiteStatementCompileStatement.execute();
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Throwable th) {
                    th = th;
                    try {
                        getTag();
                        th.getMessage();
                        HiAdLog.w(getTag(), "execute ex " + th.getClass().getSimpleName());
                        HiAdLog.printSafeStackTrace(3, th);
                        if (writableDatabase != null) {
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
            writableDatabase.endTransaction();
        }
    }

    void b(String str) {
        if (!a(str)) {
            HiAdLog.w(getTag(), "tableName: %s is invalid", str);
            return;
        }
        try {
            this.f4779a.execSQL(" DROP TABLE " + str);
        } catch (Exception e) {
            HiAdLog.w(getTag(), "delete table: %s fail, exception: %s", str, e.getClass().getSimpleName());
        }
    }

    public void a() {
        synchronized (this) {
            close();
        }
    }

    private boolean a(String str) {
        return getDbUpdateHelper().b(str);
    }

    private void a(boolean z) {
        try {
            try {
                BaseDbUpdateHelper dbUpdateHelper = getDbUpdateHelper();
                this.f4779a.beginTransaction();
                if (z) {
                    dbUpdateHelper.c();
                } else {
                    dbUpdateHelper.b();
                }
                dbUpdateHelper.createTriggers();
                this.f4779a.setTransactionSuccessful();
            } catch (ayo unused) {
                HiAdLog.w(getTag(), "initTables error");
            }
        } finally {
            this.f4779a.endTransaction();
        }
    }

    public BaseDbHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f4779a = null;
    }
}
