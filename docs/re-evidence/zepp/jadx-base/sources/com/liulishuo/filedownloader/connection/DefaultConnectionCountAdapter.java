package com.liulishuo.filedownloader.connection;

import com.liulishuo.filedownloader.util.FileDownloadHelper;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultConnectionCountAdapter implements FileDownloadHelper.ConnectionCountAdapter {
    private static final long a = 1048576;
    private static final long b = 5242880;
    private static final long c = 52428800;
    private static final long d = 104857600;

    @Override // com.liulishuo.filedownloader.util.FileDownloadHelper.ConnectionCountAdapter
    public int determineConnectionCount(int i, String str, String str2, long j) {
        if (j < 1048576) {
            return 1;
        }
        if (j < 5242880) {
            return 2;
        }
        if (j < c) {
            return 3;
        }
        return j < d ? 4 : 5;
    }
}
