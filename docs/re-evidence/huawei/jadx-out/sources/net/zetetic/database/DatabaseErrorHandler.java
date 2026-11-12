package net.zetetic.database;

import android.database.sqlite.SQLiteException;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public interface DatabaseErrorHandler {
    void onCorruption(SQLiteDatabase sQLiteDatabase, SQLiteException sQLiteException);
}
