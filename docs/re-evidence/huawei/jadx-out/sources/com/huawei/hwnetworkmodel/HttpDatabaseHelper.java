package com.huawei.hwnetworkmodel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nqe;

/* JADX INFO: loaded from: classes11.dex */
public class HttpDatabaseHelper extends SQLiteOpenHelper {
    public HttpDatabaseHelper(Context context) {
        super(context, "Traffic.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            LogUtil.j("HttpDatabaseHelper", "onCreate null");
        } else {
            sQLiteDatabase.execSQL("create table TrafficByDate (_id integer primary key autoincrement, received text not null , requested text not null, total text not null, date text not null);");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            LogUtil.j("HttpDatabaseHelper", "onUpgrade null");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXITS TrafficByDate");
            onCreate(sQLiteDatabase);
        }
    }

    public long d(nqe nqeVar) throws Throwable {
        SQLiteDatabase writableDatabase;
        if (nqeVar == null) {
            LogUtil.j("HttpDatabaseHelper", "insert null");
            return 0L;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("received", Long.valueOf(nqeVar.c()));
                    contentValues.put("requested", Long.valueOf(nqeVar.e()));
                    contentValues.put("date", nqeVar.a());
                    contentValues.put("total", Long.valueOf(nqeVar.b()));
                    long jInsert = writableDatabase.insert("TrafficByDate", null, contentValues);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return jInsert;
                } catch (SQLiteException unused) {
                    sQLiteDatabase = writableDatabase;
                    LogUtil.e("HttpDatabaseHelper", "insert SQLiteException");
                    if (sQLiteDatabase == null) {
                        return -1L;
                    }
                    sQLiteDatabase.close();
                    return -1L;
                } catch (Throwable th) {
                    th = th;
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                writableDatabase = null;
            }
        } catch (SQLiteException unused2) {
        }
    }

    public int e(nqe nqeVar) {
        if (nqeVar == null) {
            LogUtil.j("HttpDatabaseHelper", "update null");
            return 0;
        }
        SQLiteDatabase writableDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
            String[] strArr = {nqeVar.a()};
            ContentValues contentValues = new ContentValues();
            contentValues.put("received", Long.valueOf(nqeVar.c()));
            contentValues.put("requested", Long.valueOf(nqeVar.e()));
            contentValues.put("total", Long.valueOf(nqeVar.b()));
            contentValues.put("date", nqeVar.a());
            return writableDatabase.update("TrafficByDate", contentValues, "date = ?", strArr);
        } catch (SQLiteException unused) {
            LogUtil.e("HttpDatabaseHelper", "update SQLiteException");
        } finally {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    public nqe d(String str) throws Throwable {
        Cursor cursorQuery;
        SQLiteDatabase readableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        if (str == null) {
            LogUtil.j("HttpDatabaseHelper", "query date is null");
            return null;
        }
        try {
            try {
                readableDatabase = getReadableDatabase();
                try {
                    cursorQuery = readableDatabase.query("TrafficByDate", null, null, null, null, null, null);
                    try {
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("date"));
                                if (str.equals(string)) {
                                    nqe nqeVar = new nqe(string);
                                    nqeVar.b(cursorQuery.getLong(cursorQuery.getColumnIndex("received")));
                                    nqeVar.e(cursorQuery.getLong(cursorQuery.getColumnIndex("requested")));
                                    nqeVar.c(cursorQuery.getLong(cursorQuery.getColumnIndex("total")));
                                    cursorQuery.close();
                                    if (readableDatabase != null) {
                                        readableDatabase.close();
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return nqeVar;
                                }
                            }
                        } else {
                            LogUtil.j("HttpDatabaseHelper", "query cursor is null");
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (SQLiteException unused) {
                        LogUtil.e("HttpDatabaseHelper", "query SQLiteException");
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (SQLiteException unused2) {
                    cursorQuery = null;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = readableDatabase;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    if (sQLiteDatabase != 0) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException unused3) {
            cursorQuery = null;
            readableDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            if (sQLiteDatabase != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }
}
