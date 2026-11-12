package com.huami.watch.transport.httpsupport.transporter.blt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BltORMM extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "orm";
    private static final String a = "orm.db";
    private static final int b = 1;
    public static final String c = "_id";
    public static final String d = "identifier";
    private static volatile BltORMM e = null;
    public static final String f = "state";
    public static final String g = "stamp";

    public static class ORM {
        public static int STATE_OUT;
        public String identity;
        public Long stamp;
        public int state;
    }

    private BltORMM(Context context) {
        super(context, a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private boolean a(ORM orm) {
        Cursor cursorQuery = getWritableDatabase().query(TABLE_NAME, null, "identifier = ?", new String[]{orm.identity}, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        boolean z = cursorQuery.getCount() > 0;
        cursorQuery.close();
        return z;
    }

    private boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        synchronized (this) {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + str + "'", null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.close();
                    return true;
                }
                cursorRawQuery.close();
            }
            return false;
        }
    }

    private boolean c(ORM orm) {
        return getWritableDatabase().delete(TABLE_NAME, "identifier = ?", new String[]{orm.identity}) > 0;
    }

    public static BltORMM getInstance(Context context) {
        BltORMM bltORMM;
        synchronized (BltORMM.class) {
            try {
                if (e == null) {
                    synchronized (DataCacher.class) {
                        try {
                            if (e == null) {
                                e = new BltORMM(context);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bltORMM = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bltORMM;
    }

    public boolean mark(DataItem dataItem) {
        if (dataItem.hasFlag(8192)) {
            return false;
        }
        ORM orm = new ORM();
        orm.identity = dataItem.getIdentifier();
        orm.stamp = Long.valueOf(SystemClock.elapsedRealtime());
        orm.state = ORM.STATE_OUT;
        return saveSingle(orm);
    }

    public boolean markDown(DataItem dataItem) {
        if (dataItem.hasFlag(8192)) {
            return false;
        }
        ORM orm = new ORM();
        orm.identity = dataItem.getIdentifier();
        return c(orm);
    }

    public boolean markLook(DataItem dataItem) {
        if (dataItem.hasFlag(8192)) {
            return true;
        }
        ORM orm = new ORM();
        orm.identity = dataItem.getIdentifier();
        return a(orm);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (b(sQLiteDatabase, TABLE_NAME)) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE orm(_id LONG PRIMARY KEY,identifier text,state INTEGER, stamp LONG)");
        sQLiteDatabase.setVersion(1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public boolean release(DataItem dataItem) {
        dataItem.getIdentifier();
        ORM orm = new ORM();
        orm.stamp = Long.valueOf(SystemClock.elapsedRealtime());
        orm.identity = dataItem.getIdentifier();
        return c(orm);
    }

    public boolean save(List<ORM> list) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Iterator<ORM> it2 = list.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it2.hasNext()) {
                        writableDatabase.setTransactionSuccessful();
                        return z;
                    }
                    ORM next = it2.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("identifier", next.identity);
                    contentValues.put("state", Integer.valueOf(next.state));
                    contentValues.put(g, next.stamp);
                    z = writableDatabase.update(TABLE_NAME, contentValues, "identifier=?", new String[]{String.valueOf(next.identity)}) > 0;
                    if (!z) {
                        if (writableDatabase.insertOrThrow(TABLE_NAME, null, contentValues) >= 0) {
                            z = true;
                        }
                    }
                }
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public boolean saveSingle(ORM orm) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(orm);
        return save(arrayList);
    }
}
