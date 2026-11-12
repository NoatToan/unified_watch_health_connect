package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.event.DownloadEventPoolImpl;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadEventPool extends DownloadEventPoolImpl {

    public static class b {
        private static final FileDownloadEventPool a = new FileDownloadEventPool();

        private b() {
        }
    }

    public static FileDownloadEventPool getImpl() {
        return b.a;
    }

    private FileDownloadEventPool() {
    }
}
