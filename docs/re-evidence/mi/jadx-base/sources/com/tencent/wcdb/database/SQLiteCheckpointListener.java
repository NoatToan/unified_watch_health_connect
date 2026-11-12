package com.tencent.wcdb.database;

/* JADX INFO: loaded from: classes6.dex */
public interface SQLiteCheckpointListener {
    void onAttach(SQLiteDatabase sQLiteDatabase);

    void onDetach(SQLiteDatabase sQLiteDatabase);

    void onWALCommit(SQLiteDatabase sQLiteDatabase, String str, int i);
}
