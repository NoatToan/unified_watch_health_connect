package net.zetetic.database.sqlcipher;

/* JADX INFO: loaded from: classes3.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}
