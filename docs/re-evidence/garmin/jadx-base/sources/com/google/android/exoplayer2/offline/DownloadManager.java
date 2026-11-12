package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import j20.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    public static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z14, List<Download> list, Exception exc) {
            this.download = download;
            this.isRemove = z14;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    public interface Listener {
        default void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        }

        default void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        }

        default void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z14) {
        }

        default void onIdle(DownloadManager downloadManager) {
        }

        default void onInitialized(DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i14) {
        }

        default void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z14) {
        }
    }

    public static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;
        private Exception finalException;
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z14, int i14, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z14;
            this.minRetryCount = i14;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }

        private static int getRetryDelayMillis(int i14) {
            return Math.min((i14 - 1) * 1000, 5000);
        }

        public void cancel(boolean z14) {
            if (z14) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j8, long j14, float f14) {
            this.downloadProgress.bytesDownloaded = j14;
            this.downloadProgress.percentDownloaded = f14;
            if (j8 != this.contentLength) {
                this.contentLength = j8;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j8 >> 32), (int) j8, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j8 = -1;
                    int i14 = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (IOException e4) {
                            if (!this.isCanceled) {
                                long j14 = this.downloadProgress.bytesDownloaded;
                                if (j14 != j8) {
                                    i14 = 0;
                                    j8 = j14;
                                }
                                i14++;
                                if (i14 > this.minRetryCount) {
                                    throw e4;
                                }
                                Thread.sleep(getRetryDelayMillis(i14));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e14) {
                this.finalException = e14;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.EMPTY_LIST;
        this.listeners = new CopyOnWriteArraySet<>();
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new e(this, 1));
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        b bVar = new b(this);
        this.requirementsListener = bVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, bVar, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(0, iStart, 0).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(Message message) {
        int i14 = message.what;
        if (i14 == 0) {
            onInitialized((List) message.obj);
        } else if (i14 == 1) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i14 != 2) {
                x.h();
                return false;
            }
            onDownloadUpdate((DownloadUpdate) message.obj);
        }
        return true;
    }

    public static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i14, long j8) {
        int i15 = download.state;
        long j14 = (i15 == 5 || download.isTerminalState()) ? j8 : download.startTimeMs;
        int i16 = 7;
        if (i15 != 5 && i15 != 7) {
            i16 = i14 != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(downloadRequest), i16, j14, j8, -1L, i14, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        boolean z14 = downloadUpdate.isRemove;
        CopyOnWriteArraySet<Listener> copyOnWriteArraySet = this.listeners;
        if (z14) {
            Iterator<Listener> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                it3.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i14, int i15) {
        this.pendingMessages -= i14;
        this.activeTaskCount = i15;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i14) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i14) {
            this.notMetRequirements = i14;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(2, i14, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i14);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void setDownloadsPaused(boolean z14) {
        if (this.downloadsPaused == z14) {
            return;
        }
        this.downloadsPaused = z14;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(1, z14 ? 1 : 0, 0).sendToTarget();
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z14);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z14;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            int i14 = 0;
            while (true) {
                if (i14 >= this.downloads.size()) {
                    z14 = false;
                    break;
                }
                if (this.downloads.get(i14).state == 0) {
                    z14 = true;
                    break;
                }
                i14++;
            }
        } else {
            z14 = false;
            break;
        }
        boolean z15 = this.waitingForRequirements != z14;
        this.waitingForRequirements = z14;
        return z15;
    }

    public void addDownload(DownloadRequest downloadRequest, int i14) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i14, 0, downloadRequest).sendToTarget();
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(12);
                boolean z14 = false;
                while (true) {
                    InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (InterruptedException unused) {
                        z14 = true;
                    }
                }
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.downloads = Collections.EMPTY_LIST;
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(int i14) {
        Assertions.checkArgument(i14 > 0);
        if (this.maxParallelDownloads == i14) {
            return;
        }
        this.maxParallelDownloads = i14;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i14, 0).sendToTarget();
    }

    public void setMinRetryCount(int i14) {
        Assertions.checkArgument(i14 >= 0);
        if (this.minRetryCount == i14) {
            return;
        }
        this.minRetryCount = i14;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i14, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(String str, int i14) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(3, i14, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i14, int i15, boolean z14) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i14;
            this.minRetryCount = i15;
            this.downloadsPaused = z14;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        private void addDownload(DownloadRequest downloadRequest, int i14) {
            Download download = getDownload(downloadRequest.f53032id, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i14, jCurrentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i14 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i14, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        private static Download copyDownloadWithState(Download download, int i14, int i15) {
            return new Download(download.request, i14, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i15, 0, download.progress);
        }

        private Download getDownload(String str, boolean z14) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z14) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (IOException e4) {
                String strValueOf = String.valueOf(str);
                Log.e(DownloadManager.TAG, strValueOf.length() != 0 ? "Failed to load download: ".concat(strValueOf) : new String("Failed to load download: "), e4);
                return null;
            }
        }

        private int getDownloadIndex(String str) {
            for (int i14 = 0; i14 < this.downloads.size(); i14++) {
                if (this.downloads.get(i14).request.f53032id.equals(str)) {
                    return i14;
                }
            }
            return -1;
        }

        private void initialize(int i14) {
            this.notMetRequirements = i14;
            DownloadCursor downloads = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloads = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.downloads.add(downloads.getDownload());
                    }
                } catch (IOException e4) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e4);
                    this.downloads.clear();
                }
                Util.closeQuietly(downloads);
                this.mainHandler.obtainMessage(0, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } catch (Throwable th3) {
                Util.closeQuietly(downloads);
                throw th3;
            }
        }

        private void onContentLengthChanged(Task task, long j8) {
            Download download = (Download) Assertions.checkNotNull(getDownload(task.request.f53032id, false));
            if (j8 == download.contentLength || j8 == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j8, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(Download download, Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.f53032id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e4) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e4);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i14 = download.stopReason;
                putDownloadWithState(download, i14 == 0 ? 0 : 1, i14);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.f53032id));
                try {
                    this.downloadIndex.removeDownload(download.request.f53032id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(2, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void onTaskStopped(Task task) {
            String str = task.request.f53032id;
            this.activeTasks.remove(str);
            boolean z14 = task.isRemove;
            if (!z14) {
                int i14 = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i14;
                if (i14 == 0) {
                    removeMessages(11);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            Exception exc = task.finalException;
            if (exc != null) {
                String strValueOf = String.valueOf(task.request);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
                sb3.append("Task failed: ");
                sb3.append(strValueOf);
                sb3.append(", ");
                sb3.append(z14);
                Log.e(DownloadManager.TAG, sb3.toString(), exc);
            }
            Download download = (Download) Assertions.checkNotNull(getDownload(str, false));
            int i15 = download.state;
            if (i15 == 2) {
                Assertions.checkState(!z14);
                onDownloadTaskStopped(download, exc);
            } else if (i15 != 5 && i15 != 7) {
                x.h();
                return;
            } else {
                Assertions.checkState(z14);
                onRemoveTaskStopped(download);
            }
            syncTasks();
        }

        private Download putDownload(Download download) {
            int i14 = download.state;
            Assertions.checkState((i14 == 3 || i14 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.f53032id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, new f());
            } else {
                boolean z14 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z14) {
                    Collections.sort(this.downloads, new f());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e4) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e4);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private Download putDownloadWithState(Download download, int i14, int i15) {
            Assertions.checkState((i14 == 3 || i14 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i14, i15));
        }

        private void release() {
            Iterator<Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e4) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e4);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            int i14;
            ArrayList<Download> arrayList;
            ArrayList arrayList2 = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList2.add(downloads.getDownload());
                    } catch (Throwable th3) {
                        if (downloads != null) {
                            try {
                                downloads.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                downloads.close();
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.downloads;
                    if (i14 >= size) {
                        break;
                    }
                    arrayList.add(copyDownloadWithState((Download) arrayList2.get(i14), 5, 0));
                    i14++;
                }
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i15 = 0; i15 < this.downloads.size(); i15++) {
                ArrayList<Download> arrayList3 = this.downloads;
                arrayList3.set(i15, copyDownloadWithState(arrayList3.get(i15), 5, 0));
            }
            i14 = 0;
            Collections.sort(arrayList, new f());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e4) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e4);
            }
            ArrayList arrayList4 = new ArrayList(this.downloads);
            for (int i16 = 0; i16 < this.downloads.size(); i16++) {
                this.mainHandler.obtainMessage(2, new DownloadUpdate(this.downloads.get(i16), false, arrayList4, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download == null) {
                String strValueOf = String.valueOf(str);
                Log.e(DownloadManager.TAG, strValueOf.length() != 0 ? "Failed to remove nonexistent download: ".concat(strValueOf) : new String("Failed to remove nonexistent download: "));
            } else {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            }
        }

        private void setDownloadsPaused(boolean z14) {
            this.downloadsPaused = z14;
            syncTasks();
        }

        private void setMaxParallelDownloads(int i14) {
            this.maxParallelDownloads = i14;
            syncTasks();
        }

        private void setMinRetryCount(int i14) {
            this.minRetryCount = i14;
        }

        private void setNotMetRequirements(int i14) {
            this.notMetRequirements = i14;
            syncTasks();
        }

        private void setStopReason(String str, int i14) {
            if (str == null) {
                for (int i15 = 0; i15 < this.downloads.size(); i15++) {
                    setStopReason(this.downloads.get(i15), i14);
                }
                try {
                    this.downloadIndex.setStopReason(i14);
                } catch (IOException e4) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e4);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i14);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i14);
                    } catch (IOException e14) {
                        Log.e(DownloadManager.TAG, str.length() != 0 ? "Failed to set manual stop reason: ".concat(str) : new String("Failed to set manual stop reason: "), e14);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(Task task, Download download, int i14) {
            Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i14 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        private Task syncQueuedDownload(Task task, Download download) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
                return task;
            }
            if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            }
            Download downloadPutDownloadWithState = putDownloadWithState(download, 2, 0);
            Task task2 = new Task(downloadPutDownloadWithState.request, this.downloaderFactory.createDownloader(downloadPutDownloadWithState.request), downloadPutDownloadWithState.progress, false, this.minRetryCount, this);
            this.activeTasks.put(downloadPutDownloadWithState.request.f53032id, task2);
            int i14 = this.activeDownloadTaskCount;
            this.activeDownloadTaskCount = i14 + 1;
            if (i14 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            task2.start();
            return task2;
        }

        private void syncRemovingDownload(Task task, Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
            } else {
                Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.f53032id, task2);
                task2.start();
            }
        }

        private void syncStoppedDownload(Task task) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i14 = 0;
            for (int i15 = 0; i15 < this.downloads.size(); i15++) {
                Download download = this.downloads.get(i15);
                Task taskSyncQueuedDownload = this.activeTasks.get(download.request.f53032id);
                int i16 = download.state;
                if (i16 == 0) {
                    taskSyncQueuedDownload = syncQueuedDownload(taskSyncQueuedDownload, download);
                } else if (i16 == 1) {
                    syncStoppedDownload(taskSyncQueuedDownload);
                } else if (i16 == 2) {
                    Assertions.checkNotNull(taskSyncQueuedDownload);
                    syncDownloadingDownload(taskSyncQueuedDownload, download, i14);
                } else {
                    if (i16 != 5 && i16 != 7) {
                        x.h();
                        return;
                    }
                    syncRemovingDownload(taskSyncQueuedDownload, download);
                }
                if (taskSyncQueuedDownload != null && !taskSyncQueuedDownload.isRemove) {
                    i14++;
                }
            }
        }

        private void updateProgress() {
            for (int i14 = 0; i14 < this.downloads.size(); i14++) {
                Download download = this.downloads.get(i14);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e4) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e4);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i14 = 0;
            switch (message.what) {
                case 0:
                    initialize(message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 1:
                    setDownloadsPaused(message.arg1 != 0);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 2:
                    setNotMetRequirements(message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 3:
                    setStopReason((String) message.obj, message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 4:
                    setMaxParallelDownloads(message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 5:
                    setMinRetryCount(message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 6:
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 7:
                    removeDownload((String) message.obj);
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 8:
                    removeAllDownloads();
                    i14 = 1;
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 9:
                    onTaskStopped((Task) message.obj);
                    this.mainHandler.obtainMessage(1, i14, this.activeTasks.size()).sendToTarget();
                    break;
                case 10:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    break;
                case 11:
                    updateProgress();
                    break;
                case 12:
                    release();
                    break;
                default:
                    x.h();
                    break;
            }
        }

        private void setStopReason(Download download, int i14) {
            if (i14 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i14 != download.stopReason) {
                int i15 = download.state;
                if (i15 == 0 || i15 == 2) {
                    i15 = 1;
                }
                putDownload(new Download(download.request, i15, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i14, 0, download.progress));
            }
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory) {
        this(context, databaseProvider, cache, factory, new bv2.g(1));
    }
}
