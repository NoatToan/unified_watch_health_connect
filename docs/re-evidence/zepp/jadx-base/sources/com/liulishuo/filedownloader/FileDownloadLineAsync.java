package com.liulishuo.filedownloader;

import android.app.Notification;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadLineAsync {

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Notification b;

        public a(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileDownloader.getImpl().startForeground(this.a, this.b);
        }
    }

    public boolean startForeground(int i, Notification notification) {
        if (FileDownloader.getImpl().isServiceConnected()) {
            FileDownloader.getImpl().startForeground(i, notification);
            return true;
        }
        FileDownloader.getImpl().bindService(new a(i, notification));
        return false;
    }
}
