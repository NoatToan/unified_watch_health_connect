package com.liulishuo.filedownloader;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadMonitor {
    private static IMonitor a;

    public interface IMonitor {
        void onRequestStart(int i, boolean z, FileDownloadListener fileDownloadListener);

        void onRequestStart(BaseDownloadTask baseDownloadTask);

        void onTaskBegin(BaseDownloadTask baseDownloadTask);

        void onTaskOver(BaseDownloadTask baseDownloadTask);

        void onTaskStarted(BaseDownloadTask baseDownloadTask);
    }

    public static IMonitor getMonitor() {
        return a;
    }

    public static boolean isValid() {
        return getMonitor() != null;
    }

    public static void releaseGlobalMonitor() {
        a = null;
    }

    public static void setGlobalMonitor(IMonitor iMonitor) {
        a = iMonitor;
    }
}
