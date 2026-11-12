package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b93 {
    public static final String[] c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final op5 f3937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3938b;

    public b93(op5 op5Var) {
        this.f3937a = op5Var;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        String strValueOf = String.valueOf(str);
        sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    public static String d(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? "ExoPlayerCacheFileMetadata".concat(strValueOf) : new String("ExoPlayerCacheFileMetadata");
    }

    public Map<String, a93> b() throws DatabaseIOException {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put(cursorC.getString(0), new a93(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final Cursor c() {
        rk1.e(this.f3938b);
        return this.f3937a.getReadableDatabase().query(this.f3938b, c, null, null, null, null, null);
    }

    public void e(long j) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j);
            this.f3938b = d(hexString);
            if (hpq.b(this.f3937a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f3937a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    hpq.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f3938b);
                    String str = this.f3938b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 108);
                    sb.append("CREATE TABLE ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append("(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.execSQL(sb.toString());
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void f(String str) throws DatabaseIOException {
        rk1.e(this.f3938b);
        try {
            this.f3937a.getWritableDatabase().delete(this.f3938b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void g(Set<String> set) throws DatabaseIOException {
        rk1.e(this.f3938b);
        try {
            SQLiteDatabase writableDatabase = this.f3937a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f3938b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void h(String str, long j, long j2) throws DatabaseIOException {
        rk1.e(this.f3938b);
        try {
            SQLiteDatabase writableDatabase = this.f3937a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f3938b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
