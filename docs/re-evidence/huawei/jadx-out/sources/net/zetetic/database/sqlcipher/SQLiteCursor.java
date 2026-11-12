package net.zetetic.database.sqlcipher;

import java.util.HashMap;
import java.util.Map;
import net.zetetic.database.AbstractWindowedCursor;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    private static boolean CURSOR_WINDOW_NEEDS_RECREATED = false;
    private static final int DEFAULT_CURSOR_WINDOW_SIZE = -1;
    static final int NO_COUNT = -1;
    public static int PREFERRED_CURSOR_WINDOW_SIZE = -1;
    static final String TAG = "SQLiteCursor";
    private Map<String, Integer> mColumnNameMap;
    private final String[] mColumns;
    private int mCount;
    private int mCursorWindowCapacity;
    private final SQLiteCursorDriver mDriver;
    private final String mEditTable;
    private final SQLiteQuery mQuery;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mCount = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        this.mColumns = sQLiteQuery.getColumnNames();
    }

    public SQLiteDatabase getDatabase() {
        return this.mQuery.getDatabase();
    }

    @Override // net.zetetic.database.AbstractCursor
    public boolean onMove(int i, int i2) {
        if (this.mWindow != null && i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public static void setCursorWindowSize(int i) {
        CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE = i;
        CURSOR_WINDOW_NEEDS_RECREATED = true;
    }

    public static void resetCursorWindowSize() {
        CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE = 16384;
        CURSOR_WINDOW_NEEDS_RECREATED = true;
    }

    private void awc_clearOrCreateWindow(String str) {
        int i = CursorWindow.PREFERRED_CURSOR_WINDOW_SIZE;
        if (CURSOR_WINDOW_NEEDS_RECREATED) {
            awc_closeWindow();
            CURSOR_WINDOW_NEEDS_RECREATED = false;
        }
        CursorWindow window = getWindow();
        if (window == null) {
            setWindow(new CursorWindow(str, i));
        } else {
            window.clear();
        }
    }

    private void awc_closeWindow() {
        setWindow(null);
    }

    private void fillWindow(int i) {
        awc_clearOrCreateWindow(getDatabase().getPath());
        try {
            if (this.mCount == -1) {
                this.mCount = this.mQuery.fillWindow(this.mWindow, DatabaseUtils.cursorPickFillWindowStartPosition(i, 0), i, true);
                this.mCursorWindowCapacity = this.mWindow.getNumRows();
                if (Logger.isLoggable(TAG, 3)) {
                    Logger.d(TAG, "received count(*) from native_fill_window: " + this.mCount);
                    return;
                }
                return;
            }
            this.mQuery.fillWindow(this.mWindow, DatabaseUtils.cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity), i, false);
        } catch (RuntimeException e) {
            awc_closeWindow();
            throw e;
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.e(TAG, "requesting column name with table name -- " + str, new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.mQuery.close();
            this.mDriver.cursorClosed();
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.mQuery.getDatabase().isOpen()) {
                return false;
            }
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mCount = -1;
            this.mDriver.cursorRequeried(this);
            try {
                return super.requery();
            } catch (IllegalStateException e) {
                Logger.w(TAG, "requery() failed " + e.getMessage(), e);
                return false;
            }
        }
    }

    @Override // net.zetetic.database.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.mCount = -1;
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.zetetic.database.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
