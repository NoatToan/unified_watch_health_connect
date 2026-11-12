package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: loaded from: classes6.dex */
public final class SQLiteGlobal {
    private static final String TAG = "WCDB.SQLiteGlobal";
    public static final String defaultJournalMode = "PERSIST";
    public static final int defaultPageSize;
    public static final String defaultSyncMode = "FULL";
    public static final int journalSizeLimit = 524288;
    public static final int walAutoCheckpoint = 100;
    public static final int walConnectionPoolSize = 4;
    public static final String walSyncMode = "FULL";

    static {
        int blockSize;
        if (!WCDBInitializationProbe.libLoaded) {
            System.loadLibrary("wcdb");
        }
        try {
            blockSize = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
        } catch (RuntimeException unused) {
            blockSize = 4096;
        }
        defaultPageSize = blockSize;
        nativeSetDefaultPageSize(blockSize);
    }

    private SQLiteGlobal() {
    }

    public static void loadLib() {
    }

    private static native int nativeReleaseMemory();

    private static native void nativeSetDefaultPageSize(int i);

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}
