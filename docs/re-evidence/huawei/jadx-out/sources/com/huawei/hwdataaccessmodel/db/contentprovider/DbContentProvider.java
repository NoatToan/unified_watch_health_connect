package com.huawei.hwdataaccessmodel.db.contentprovider;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class DbContentProvider extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DbContentProvider f17246c;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    private DbContentProvider(Context context) {
        super(context, "HwCPDatas.db", null, 3, new d());
    }

    public static DbContentProvider b(Context context) {
        DbContentProvider dbContentProvider;
        synchronized (DbContentProvider.class) {
            if (f17246c == null) {
                f17246c = new DbContentProvider(context);
            }
            dbContentProvider = f17246c;
        }
        return dbContentProvider;
    }

    public SQLiteDatabase e() {
        return getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("DbContentProvider", "DbContentProvider_Version", "oldVersion = ", Integer.valueOf(i), " newVersion = ", Integer.valueOf(i2));
        while (i < i2) {
            if (i == 1 || i == 2) {
                try {
                    d(sQLiteDatabase);
                } catch (SQLException e) {
                    LogUtil.e("DbContentProvider", "DbContentProvider_onUpgrade exception", e.getMessage());
                    return;
                }
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        LogUtil.a("DbContentProvider", "DbContentProvider onDowngrade", "oldVersion = ", Integer.valueOf(i), " newVersion = ", Integer.valueOf(i2));
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        sQLiteDatabase.execSQL("ALTER TABLE module_20009_smart_msg ADD showCount int default 0");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        LogUtil.d("DbContentProvider", "DbContentProvider_createTable | create new table sql = id integer primary key autoincrement,msgType integer not null check(msgType >= 10000),msgSrc integer not null check(msgSrc > 0),msgContentType integer not null check(msgContentType > 0),msgContent text not null,showMethod text,createTime integer not null,updateTime integer,expireTime integer,status integer not null check(status > 0),huid text,showTime text,priority integer not null");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("create table IF NOT EXISTS module_20009_smart_msg(id integer primary key autoincrement,msgType integer not null check(msgType >= 10000),msgSrc integer not null check(msgSrc > 0),msgContentType integer not null check(msgContentType > 0),msgContent text not null,showMethod text,createTime integer not null,updateTime integer,expireTime integer,status integer not null check(status > 0),huid text,showTime text,priority integer not null)");
        sQLiteDatabase.execSQL(String.valueOf(stringBuffer));
    }

    public void c(String str) {
        synchronized (DbContentProvider.class) {
            SQLiteDatabase sQLiteDatabaseE = f17246c.e();
            if (sQLiteDatabaseE != null) {
                try {
                    sQLiteDatabaseE.execSQL(str);
                } catch (SQLiteException e) {
                    ReleaseLogUtil.a("R_DbContentProvider", "execSql SQLiteException, e=", ExceptionUtils.c(e));
                } catch (Exception e2) {
                    ReleaseLogUtil.a("R_DbContentProvider", "execSql Exception=", ExceptionUtils.c(e2));
                }
            }
        }
    }

    static class d implements DatabaseErrorHandler {
        private final DatabaseErrorHandler d;

        private d() {
            this.d = new DefaultDatabaseErrorHandler();
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            this.d.onCorruption(sQLiteDatabase);
            ReleaseLogUtil.e("R_DbContentProvider", "db file corruption:", sQLiteDatabase.getPath());
        }
    }
}
