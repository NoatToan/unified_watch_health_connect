package com.tencent.wcdb;

import com.tencent.wcdb.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public interface DatabaseErrorHandler {
    void onCorruption(SQLiteDatabase sQLiteDatabase);
}
