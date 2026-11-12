package com.xiaomi.hm.health.traininglib.media;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.xiaomi.hm.health.traininglib.model.DownloadInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public class MediaDownloaderManager {
    private static final String k = "MediaDownloaderManager";
    private Context a;
    private long b;
    private int c;
    private long d;
    private long e;
    private int f;
    private int g;
    private AsyncHttpClient h;
    private ExecutorService i;
    private DownloadListener j;

    public interface DownloadListener {
        void downloadFinish(int i);

        void downloadProgress(long j, long j2, long j3);
    }

    public class a implements MediaDownloadTask.DownloadTaskListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloadTask.DownloadTaskListener
        public void downloadProgress(DownloadInfo downloadInfo, long j) {
            MediaDownloaderManager.this.e += j;
            if (MediaDownloaderManager.this.j != null) {
                HMLog.d(MediaDownloaderManager.k, "totalSize:" + MediaDownloaderManager.this.d + "  downloadSize:" + MediaDownloaderManager.this.e, new Object[0]);
                MediaDownloaderManager.this.j.downloadProgress(MediaDownloaderManager.this.b, MediaDownloaderManager.this.d, MediaDownloaderManager.this.e);
            }
        }

        @Override // com.xiaomi.hm.health.traininglib.media.MediaDownloadTask.DownloadTaskListener
        public void downloadResult(DownloadInfo downloadInfo, int i) {
            MediaDownloaderManager.this.f++;
            if (MediaDownloaderManager.this.j != null) {
                if (i == 2 || i == -1 || i == 3) {
                    MediaDownloaderManager.this.g++;
                    HMLog.i(MediaDownloaderManager.k, "Training resources download failed. " + downloadInfo, new Object[0]);
                }
                if (MediaDownloaderManager.this.f == MediaDownloaderManager.this.c) {
                    MediaDownloaderManager.this.j.downloadFinish(MediaDownloaderManager.this.g);
                }
            }
        }
    }

    public static class b implements ThreadFactory {
        private static final AtomicInteger d = new AtomicInteger(1);
        private final ThreadGroup a;
        private final AtomicInteger b = new AtomicInteger(1);
        private final String c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.c = "MediaDownload-" + d.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(this.a, runnable, this.c + this.b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public MediaDownloaderManager(Context context) {
        this.a = context;
    }

    private synchronized void k(DownloadInfo downloadInfo) {
        this.c++;
        MediaDownloadTask mediaDownloadTask = new MediaDownloadTask(downloadInfo);
        mediaDownloadTask.g(new a());
        this.d += mediaDownloadTask.h(this.h, this.a);
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.j = downloadListener;
    }

    public void shutdownDownloader() {
        ExecutorService executorService = this.i;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.i.shutdownNow();
        HMLog.i(k, "点击取消文件下载: ", new Object[0]);
    }

    public boolean startDownload(long j, Set<DownloadInfo> set) {
        this.c = 0;
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        this.h = asyncHttpClient;
        asyncHttpClient.setMaxConnections(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
        this.i = threadPoolExecutor;
        this.h.setThreadPool(threadPoolExecutor);
        this.b = j;
        if (set != null && !set.isEmpty()) {
            Iterator<DownloadInfo> it2 = set.iterator();
            while (it2.hasNext()) {
                k(it2.next());
            }
        }
        return (set == null || set.isEmpty()) ? false : true;
    }
}
