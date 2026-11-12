package com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb;

import com.huawei.hwlogsmodel.LogUtil;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RunOnTransaction {
    private static final String TAG = "RunOnTransaction";
    private SQLiteDatabase mDatabase;

    public abstract void run();

    public RunOnTransaction(SQLiteDatabase sQLiteDatabase) {
        this.mDatabase = sQLiteDatabase;
    }

    public void start() {
        if (this.mDatabase == null) {
            LogUtil.j(TAG, "mDatabase is null.");
        } else {
            transaction();
        }
    }

    private void transaction() {
        this.mDatabase.beginTransaction();
        try {
            run();
            this.mDatabase.setTransactionSuccessful();
        } finally {
            this.mDatabase.endTransaction();
        }
    }
}
