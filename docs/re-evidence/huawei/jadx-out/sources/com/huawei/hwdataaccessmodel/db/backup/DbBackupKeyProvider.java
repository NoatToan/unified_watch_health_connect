package com.huawei.hwdataaccessmodel.db.backup;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class DbBackupKeyProvider extends SQLiteOpenHelper {
    private static volatile DbBackupKeyProvider d;
    private static final byte[] e = new byte[1];

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private DbBackupKeyProvider(Context context) {
        super(context, "HwCPBackupDatas.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static DbBackupKeyProvider d(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new DbBackupKeyProvider(context);
                }
            }
        }
        return d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("create table IF NOT EXISTS backupCp(backupKey varchar primary key ,backupValue varchar)");
        sQLiteDatabase.execSQL(String.valueOf(stringBuffer));
    }
}
