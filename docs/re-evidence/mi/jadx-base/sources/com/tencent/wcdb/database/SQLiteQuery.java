package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "WCDB.SQLiteQuery";
    private final CancellationSignal mCancellationSignal;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, objArr, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    public int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            try {
                try {
                    int iExecuteForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
                    cursorWindow.releaseReference();
                    releaseReference();
                    return iExecuteForCursorWindow;
                } catch (SQLiteException e) {
                    Log.e(TAG, "exception: " + e.getMessage() + "; query: " + getSql());
                    checkCorruption(e);
                    throw e;
                }
            } catch (Throwable th) {
                cursorWindow.releaseReference();
                throw th;
            }
        } catch (Throwable th2) {
            releaseReference();
            throw th2;
        }
    }

    public String toString() {
        return "SQLiteQuery: " + getSql();
    }
}
