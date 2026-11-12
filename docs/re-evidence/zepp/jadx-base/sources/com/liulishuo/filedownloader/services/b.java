package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import com.liulishuo.filedownloader.util.FileDownloadExecutors;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes18.dex */
class b {
    private ThreadPoolExecutor b;
    private int d;
    private SparseArray<DownloadLaunchRunnable> a = new SparseArray<>();
    private final String c = "Network";
    private int e = 0;

    public b(int i) {
        this.b = FileDownloadExecutors.newDefaultThreadPool(i, "Network");
        this.d = i;
    }

    private synchronized void d() {
        SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.a.keyAt(i);
            DownloadLaunchRunnable downloadLaunchRunnable = this.a.get(iKeyAt);
            if (downloadLaunchRunnable != null && downloadLaunchRunnable.isAlive()) {
                sparseArray.put(iKeyAt, downloadLaunchRunnable);
            }
        }
        this.a = sparseArray;
    }

    public void a(int i) {
        d();
        synchronized (this) {
            DownloadLaunchRunnable downloadLaunchRunnable = this.a.get(i);
            if (downloadLaunchRunnable != null) {
                downloadLaunchRunnable.pause();
                boolean zRemove = this.b.remove(downloadLaunchRunnable);
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.d(this, "successful cancel %d %B", Integer.valueOf(i), Boolean.valueOf(zRemove));
                }
            }
            this.a.remove(i);
        }
    }

    public synchronized int b() {
        d();
        return this.a.size();
    }

    public void c(DownloadLaunchRunnable downloadLaunchRunnable) {
        downloadLaunchRunnable.pending();
        synchronized (this) {
            this.a.put(downloadLaunchRunnable.getId(), downloadLaunchRunnable);
        }
        this.b.execute(downloadLaunchRunnable);
        int i = this.e;
        if (i < 600) {
            this.e = i + 1;
        } else {
            d();
            this.e = 0;
        }
    }

    public int e(String str, int i) {
        if (str == null) {
            return 0;
        }
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            DownloadLaunchRunnable downloadLaunchRunnableValueAt = this.a.valueAt(i2);
            if (downloadLaunchRunnableValueAt != null && downloadLaunchRunnableValueAt.isAlive() && downloadLaunchRunnableValueAt.getId() != i && str.equals(downloadLaunchRunnableValueAt.getTempFilePath())) {
                return downloadLaunchRunnableValueAt.getId();
            }
        }
        return 0;
    }

    public synchronized List<Integer> f() {
        ArrayList arrayList;
        d();
        arrayList = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.a;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i)).getId()));
        }
        return arrayList;
    }

    public boolean g(int i) {
        DownloadLaunchRunnable downloadLaunchRunnable = this.a.get(i);
        return downloadLaunchRunnable != null && downloadLaunchRunnable.isAlive();
    }

    public synchronized boolean h(int i) {
        if (b() > 0) {
            FileDownloadLog.w(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int validNetworkThreadCount = FileDownloadProperties.getValidNetworkThreadCount(i);
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.d), Integer.valueOf(validNetworkThreadCount));
        }
        List<Runnable> listShutdownNow = this.b.shutdownNow();
        this.b = FileDownloadExecutors.newDefaultThreadPool(validNetworkThreadCount, "Network");
        if (listShutdownNow.size() > 0) {
            FileDownloadLog.w(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(listShutdownNow.size()));
        }
        this.d = validNetworkThreadCount;
        return true;
    }
}
