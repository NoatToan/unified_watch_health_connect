package com.xmlywind.sdk.common.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public class c extends SQLiteOpenHelper {
    private static String a = "CREATE TABLE ads ( endcard_md5 text  ,video_md5 text  ,ad blob  ,ad_source_channel text  ,ad_type integer  ,create_time integer  ,crid text  ,load_id text  ,adTrackersMap blob  ,adslot_id text  ,camp_id text  ,request_id text , primary key ( crid ,adslot_id) ); \n";
    private static String b = "CREATE TRIGGER trigger_insert after insert on ads begin insert or replace into file_reference (crid,adslot_id,video_md5,endcard_md5) values(new.crid,new.adslot_id,new.video_md5,new.endcard_md5) ; end; \n";
    private static String c = "CREATE TRIGGER trigger_delete after delete on ads begin delete from file_reference where crid = old.crid  and adslot_id == old.adslot_id; end;\n";
    private static String d = "CREATE TABLE file_reference ( endcard_md5 blob  ,video_md5 blob  ,crid text  ,adslot_id text  , primary key ( crid ,adslot_id ) );\n";
    private static String e = "CREATE TABLE point ( point_id integer  primary key  ,item text   );\n";
    private static String f = "CREATE TABLE tracks ( id integer primary key AUTOINCREMENT ,retryNum integer   ,source text   ,event text   ,request_id text   ,url text   ,timestamp integer   );\n";
    private static c g;
    private static SQLiteDatabase h;

    public interface a {
        void onFailed(Throwable th);

        void onSuccess();
    }

    private c(Context context) {
        super(context, "xmlywind.db", (SQLiteDatabase.CursorFactory) null, 8);
        getWritableDatabase().enableWriteAheadLogging();
    }

    public static c a() {
        return g;
    }

    public static void a(Context context) {
        if (g == null) {
            synchronized (c.class) {
                try {
                    if (g == null) {
                        g = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS file_reference");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS point");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tracks");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS trigger_insert");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS trigger_delete");
        com.xmlywind.sdk.common.utils.d.f();
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0014, B:8:0x0026, B:21:0x0059, B:9:0x002a, B:11:0x002e, B:12:0x0034, B:14:0x0038, B:15:0x0042, B:17:0x0046, B:18:0x0050, B:20:0x0054, B:22:0x005c), top: B:53:0x0005 }] */
    public void a(SQLiteDatabase sQLiteDatabase, b.C1071b c1071b, a aVar) {
        sQLiteDatabase.beginTransaction();
        boolean z = false;
        try {
            SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(c1071b.b);
            for (int i = 1; i <= c1071b.d.size(); i++) {
                Object obj = c1071b.c.get((String) c1071b.d.get(i - 1));
                if (obj == null) {
                    sQLiteStatementCompileStatement.bindNull(i);
                } else if (obj instanceof String) {
                    sQLiteStatementCompileStatement.bindString(i, (String) obj);
                } else if (obj instanceof Double) {
                    sQLiteStatementCompileStatement.bindDouble(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Number) {
                    sQLiteStatementCompileStatement.bindLong(i, ((Number) obj).longValue());
                } else if (obj instanceof byte[]) {
                    sQLiteStatementCompileStatement.bindBlob(i, (byte[]) obj);
                } else {
                    sQLiteStatementCompileStatement.bindNull(i);
                }
            }
            sQLiteStatementCompileStatement.execute();
            sQLiteDatabase.setTransactionSuccessful();
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
                if (aVar != null) {
                    aVar.onFailed(th);
                }
            }
            z = true;
        } catch (Throwable th2) {
            try {
                SigmobLog.e(th2.getMessage());
                if (aVar != null) {
                    aVar.onFailed(th2);
                }
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th3) {
                    SigmobLog.e(th3.getMessage());
                    if (aVar != null) {
                        aVar.onFailed(th3);
                    }
                }
            } finally {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th4) {
                    SigmobLog.e(th4.getMessage());
                    if (aVar != null) {
                        aVar.onFailed(th4);
                    }
                }
            }
        }
        if (!z || aVar == null) {
            return;
        }
        aVar.onSuccess();
    }

    public void a(SQLiteDatabase sQLiteDatabase, String str, a aVar) {
        sQLiteDatabase.beginTransaction();
        boolean z = false;
        try {
            sQLiteDatabase.execSQL(str, new Object[0]);
            sQLiteDatabase.setTransactionSuccessful();
            z = true;
        } catch (Throwable th) {
            try {
                SigmobLog.e(th.getMessage());
                if (aVar != null) {
                    aVar.onFailed(th);
                }
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        }
        sQLiteDatabase.endTransaction();
        if (!z || aVar == null) {
            return;
        }
        aVar.onSuccess();
    }

    public void b() {
        a(getWritableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(a);
        sQLiteDatabase.execSQL(b);
        sQLiteDatabase.execSQL(c);
        sQLiteDatabase.execSQL(d);
        sQLiteDatabase.execSQL(e);
        sQLiteDatabase.execSQL(f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w(c.class.getName(), "Downgrading database from version " + i + " to " + i2 + ", which will destroy all old data");
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w(c.class.getName(), "Upgrading database from version " + i + " to " + i2 + ", which will destroy all old data");
        a(sQLiteDatabase);
    }
}
