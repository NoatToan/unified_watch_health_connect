package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "SQLiteQuery";
    private final CancellationSignal mCancellationSignal;

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            cursorWindow.acquireReference();
            try {
                try {
                    int iExecuteForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
                    cursorWindow.releaseReference();
                    releaseReference();
                    return iExecuteForCursorWindow;
                } catch (SQLiteDatabaseCorruptException e) {
                    onCorruption(e);
                    throw e;
                } catch (SQLiteException e2) {
                    Logger.e(TAG, "exception: " + e2.getMessage() + "; query: " + getSql());
                    throw e2;
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
