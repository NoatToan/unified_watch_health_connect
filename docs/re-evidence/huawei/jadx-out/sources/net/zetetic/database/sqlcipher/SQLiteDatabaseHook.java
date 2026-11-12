package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes3.dex */
public interface SQLiteDatabaseHook {
    void postKey(SQLiteConnection sQLiteConnection);

    void preKey(SQLiteConnection sQLiteConnection);
}
