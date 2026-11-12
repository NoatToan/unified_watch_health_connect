package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class b {
    private static final String c = "ExoPlayerCacheFileMetadata";
    private static final int d = 1;
    private static final String e = "name";
    private static final String f = "length";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final String k = "name = ?";
    private static final String m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private final DatabaseProvider a;
    private String b;
    private static final String g = "last_touch_timestamp";
    private static final String[] l = {"name", "length", g};

    public b(DatabaseProvider databaseProvider) {
        this.a = databaseProvider;
    }

    @WorkerThread
    public static void a(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
        String hexString = Long.toHexString(uid);
        try {
            String strE = e(hexString);
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                VersionTable.removeVersion(writableDatabase, 2, hexString);
                b(writableDatabase, strE);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    private static void b(SQLiteDatabase writableDatabase, String tableName) {
        String strValueOf = String.valueOf(tableName);
        writableDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    private Cursor d() {
        Assertions.checkNotNull(this.b);
        return this.a.getReadableDatabase().query(this.b, l, null, null, null, null, null);
    }

    private static String e(String hexUid) {
        String strValueOf = String.valueOf(hexUid);
        return strValueOf.length() != 0 ? c.concat(strValueOf) : new String(c);
    }

    @WorkerThread
    public Map<String, a> c() throws DatabaseIOException {
        try {
            Cursor cursorD = d();
            try {
                HashMap map = new HashMap(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    map.put((String) Assertions.checkNotNull(cursorD.getString(0)), new a(cursorD.getLong(1), cursorD.getLong(2)));
                }
                cursorD.close();
                return map;
            } catch (Throwable th) {
                if (cursorD != null) {
                    try {
                        cursorD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @WorkerThread
    public void f(long uid) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(uid);
            this.b = e(hexString);
            if (VersionTable.getVersion(this.a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                    b(writableDatabase, this.b);
                    String str = this.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 108);
                    sb.append("CREATE TABLE ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(m);
                    writableDatabase.execSQL(sb.toString());
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @WorkerThread
    public void g(String name) throws DatabaseIOException {
        Assertions.checkNotNull(this.b);
        try {
            this.a.getWritableDatabase().delete(this.b, k, new String[]{name});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @WorkerThread
    public void h(Set<String> names) throws DatabaseIOException {
        Assertions.checkNotNull(this.b);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it2 = names.iterator();
                while (it2.hasNext()) {
                    writableDatabase.delete(this.b, k, new String[]{it2.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @WorkerThread
    public void i(String name, long length, long lastTouchTimestamp) throws DatabaseIOException {
        Assertions.checkNotNull(this.b);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", name);
            contentValues.put("length", Long.valueOf(length));
            contentValues.put(g, Long.valueOf(lastTouchTimestamp));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
