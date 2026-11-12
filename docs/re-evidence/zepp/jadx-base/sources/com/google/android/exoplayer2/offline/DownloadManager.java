package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import defpackage.jy0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadManager {
    private static final int A = 7;
    private static final int B = 8;
    private static final int C = 9;
    private static final int D = 10;
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int E = 11;
    private static final int F = 12;
    private static final String G = "DownloadManager";
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 6;
    private final Context a;
    private final WritableDownloadIndex b;
    private final Handler c;
    private final c d;
    private final RequirementsWatcher.Listener e;
    private final CopyOnWriteArraySet<Listener> f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private List<Download> o;
    private RequirementsWatcher p;

    public interface Listener {
        void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception finalException);

        void onDownloadRemoved(DownloadManager downloadManager, Download download);

        void onDownloadsPausedChanged(DownloadManager downloadManager, boolean downloadsPaused);

        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int notMetRequirements);

        void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean waitingForRequirements);
    }

    public static final class b {
        public final Download a;
        public final boolean b;
        public final List<Download> c;

        @Nullable
        public final Exception d;

        public b(Download download, boolean isRemove, List<Download> downloads, @Nullable Exception finalException) {
            this.a = download;
            this.b = isRemove;
            this.c = downloads;
            this.d = finalException;
        }
    }

    public static final class c extends Handler {
        private static final int m = 5000;
        public boolean a;
        private final HandlerThread b;
        private final WritableDownloadIndex c;
        private final DownloaderFactory d;
        private final Handler e;
        private final ArrayList<Download> f;
        private final HashMap<String, d> g;
        private int h;
        private boolean i;
        private int j;
        private int k;
        private int l;

        public c(HandlerThread thread, WritableDownloadIndex downloadIndex, DownloaderFactory downloaderFactory, Handler mainHandler, int maxParallelDownloads, int minRetryCount, boolean downloadsPaused) {
            super(thread.getLooper());
            this.b = thread;
            this.c = downloadIndex;
            this.d = downloaderFactory;
            this.e = mainHandler;
            this.j = maxParallelDownloads;
            this.k = minRetryCount;
            this.i = downloadsPaused;
            this.f = new ArrayList<>();
            this.g = new HashMap<>();
        }

        private void A(@Nullable d activeTask) {
            if (activeTask != null) {
                Assertions.checkState(!activeTask.d);
                activeTask.e(false);
            }
        }

        private void B() {
            int i = 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                Download download = this.f.get(i2);
                d dVarY = this.g.get(download.request.id);
                int i3 = download.state;
                if (i3 == 0) {
                    dVarY = y(dVarY, download);
                } else if (i3 == 1) {
                    A(dVarY);
                } else if (i3 == 2) {
                    Assertions.checkNotNull(dVarY);
                    x(dVarY, download, i);
                } else {
                    if (i3 != 5 && i3 != 7) {
                        throw new IllegalStateException();
                    }
                    z(dVarY, download);
                }
                if (dVarY != null && !dVarY.d) {
                    i++;
                }
            }
        }

        private void C() {
            for (int i = 0; i < this.f.size(); i++) {
                Download download = this.f.get(i);
                if (download.state == 2) {
                    try {
                        this.c.putDownload(download);
                    } catch (IOException e) {
                        Log.e(DownloadManager.G, "Failed to update index.", e);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        private void b(DownloadRequest request, int stopReason) {
            Download downloadF = f(request.id, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (downloadF != null) {
                m(DownloadManager.d(downloadF, request, stopReason, jCurrentTimeMillis));
            } else {
                m(new Download(request, stopReason != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, stopReason, 0));
            }
            B();
        }

        private boolean c() {
            return !this.i && this.h == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int d(Download first, Download second) {
            return Util.compareLong(first.startTimeMs, second.startTimeMs);
        }

        private static Download e(Download download, int state, int stopReason) {
            return new Download(download.request, state, download.startTimeMs, System.currentTimeMillis(), download.contentLength, stopReason, 0, download.a);
        }

        @Nullable
        private Download f(String id, boolean loadFromIndex) {
            int iG = g(id);
            if (iG != -1) {
                return this.f.get(iG);
            }
            if (!loadFromIndex) {
                return null;
            }
            try {
                return this.c.getDownload(id);
            } catch (IOException e) {
                String strValueOf = String.valueOf(id);
                Log.e(DownloadManager.G, strValueOf.length() != 0 ? "Failed to load download: ".concat(strValueOf) : new String("Failed to load download: "), e);
                return null;
            }
        }

        private int g(String id) {
            for (int i = 0; i < this.f.size(); i++) {
                if (this.f.get(i).request.id.equals(id)) {
                    return i;
                }
            }
            return -1;
        }

        private void h(int notMetRequirements) {
            this.h = notMetRequirements;
            DownloadCursor downloads = null;
            try {
                try {
                    this.c.setDownloadingStatesToQueued();
                    downloads = this.c.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.f.add(downloads.getDownload());
                    }
                } catch (IOException e) {
                    Log.e(DownloadManager.G, "Failed to load index.", e);
                    this.f.clear();
                }
                Util.closeQuietly(downloads);
                this.e.obtainMessage(0, new ArrayList(this.f)).sendToTarget();
                B();
            } catch (Throwable th) {
                Util.closeQuietly(downloads);
                throw th;
            }
        }

        private void i(d task, long contentLength) {
            Download download = (Download) Assertions.checkNotNull(f(task.a.id, false));
            if (contentLength == download.contentLength || contentLength == -1) {
                return;
            }
            m(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), contentLength, download.stopReason, download.failureReason, download.a));
        }

        private void j(Download download, @Nullable Exception finalException) {
            Download download2 = new Download(download.request, finalException == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, finalException == null ? 0 : 1, download.a);
            this.f.remove(g(download2.request.id));
            try {
                this.c.putDownload(download2);
            } catch (IOException e) {
                Log.e(DownloadManager.G, "Failed to update index.", e);
            }
            this.e.obtainMessage(2, new b(download2, false, new ArrayList(this.f), finalException)).sendToTarget();
        }

        private void k(Download download) {
            if (download.state == 7) {
                int i = download.stopReason;
                n(download, i == 0 ? 0 : 1, i);
                B();
            } else {
                this.f.remove(g(download.request.id));
                try {
                    this.c.removeDownload(download.request.id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.G, "Failed to remove from database");
                }
                this.e.obtainMessage(2, new b(download, true, new ArrayList(this.f), null)).sendToTarget();
            }
        }

        private void l(d task) {
            String str = task.a.id;
            this.g.remove(str);
            boolean z = task.d;
            if (!z) {
                int i = this.l - 1;
                this.l = i;
                if (i == 0) {
                    removeMessages(11);
                }
            }
            if (task.g) {
                B();
                return;
            }
            Exception exc = task.h;
            if (exc != null) {
                String strValueOf = String.valueOf(task.a);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("Task failed: ");
                sb.append(strValueOf);
                sb.append(", ");
                sb.append(z);
                Log.e(DownloadManager.G, sb.toString(), exc);
            }
            Download download = (Download) Assertions.checkNotNull(f(str, false));
            int i2 = download.state;
            if (i2 == 2) {
                Assertions.checkState(!z);
                j(download, exc);
            } else {
                if (i2 != 5 && i2 != 7) {
                    throw new IllegalStateException();
                }
                Assertions.checkState(z);
                k(download);
            }
            B();
        }

        private Download m(Download download) {
            int i = download.state;
            Assertions.checkState((i == 3 || i == 4) ? false : true);
            int iG = g(download.request.id);
            if (iG == -1) {
                this.f.add(download);
                Collections.sort(this.f, com.google.android.exoplayer2.offline.c.a);
            } else {
                boolean z = download.startTimeMs != this.f.get(iG).startTimeMs;
                this.f.set(iG, download);
                if (z) {
                    Collections.sort(this.f, com.google.android.exoplayer2.offline.c.a);
                }
            }
            try {
                this.c.putDownload(download);
            } catch (IOException e) {
                Log.e(DownloadManager.G, "Failed to update index.", e);
            }
            this.e.obtainMessage(2, new b(download, false, new ArrayList(this.f), null)).sendToTarget();
            return download;
        }

        private Download n(Download download, int state, int stopReason) {
            Assertions.checkState((state == 3 || state == 4) ? false : true);
            return m(e(download, state, stopReason));
        }

        private void o() {
            Iterator<d> it2 = this.g.values().iterator();
            while (it2.hasNext()) {
                it2.next().e(true);
            }
            try {
                this.c.setDownloadingStatesToQueued();
            } catch (IOException e) {
                Log.e(DownloadManager.G, "Failed to update index.", e);
            }
            this.f.clear();
            this.b.quit();
            synchronized (this) {
                this.a = true;
                notifyAll();
            }
        }

        private void p() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.c.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } catch (Throwable th) {
                        if (downloads != null) {
                            try {
                                downloads.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.G, "Failed to load downloads.");
            }
            for (int i = 0; i < this.f.size(); i++) {
                ArrayList<Download> arrayList2 = this.f;
                arrayList2.set(i, e(arrayList2.get(i), 5, 0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f.add(e((Download) arrayList.get(i2), 5, 0));
            }
            Collections.sort(this.f, com.google.android.exoplayer2.offline.c.a);
            try {
                this.c.setStatesToRemoving();
            } catch (IOException e) {
                Log.e(DownloadManager.G, "Failed to update index.", e);
            }
            ArrayList arrayList3 = new ArrayList(this.f);
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                this.e.obtainMessage(2, new b(this.f.get(i3), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        private void q(String id) {
            Download downloadF = f(id, true);
            if (downloadF == null) {
                String strValueOf = String.valueOf(id);
                Log.e(DownloadManager.G, strValueOf.length() != 0 ? "Failed to remove nonexistent download: ".concat(strValueOf) : new String("Failed to remove nonexistent download: "));
            } else {
                n(downloadF, 5, 0);
                B();
            }
        }

        private void r(boolean downloadsPaused) {
            this.i = downloadsPaused;
            B();
        }

        private void s(int maxParallelDownloads) {
            this.j = maxParallelDownloads;
            B();
        }

        private void t(int minRetryCount) {
            this.k = minRetryCount;
        }

        private void u(int notMetRequirements) {
            this.h = notMetRequirements;
            B();
        }

        private void v(Download download, int stopReason) {
            if (stopReason == 0) {
                if (download.state == 1) {
                    n(download, 0, 0);
                }
            } else if (stopReason != download.stopReason) {
                int i = download.state;
                if (i == 0 || i == 2) {
                    i = 1;
                }
                m(new Download(download.request, i, download.startTimeMs, System.currentTimeMillis(), download.contentLength, stopReason, 0, download.a));
            }
        }

        private void w(@Nullable String id, int stopReason) {
            if (id == null) {
                for (int i = 0; i < this.f.size(); i++) {
                    v(this.f.get(i), stopReason);
                }
                try {
                    this.c.setStopReason(stopReason);
                } catch (IOException e) {
                    Log.e(DownloadManager.G, "Failed to set manual stop reason", e);
                }
            } else {
                Download downloadF = f(id, false);
                if (downloadF != null) {
                    v(downloadF, stopReason);
                } else {
                    try {
                        this.c.setStopReason(id, stopReason);
                    } catch (IOException e2) {
                        Log.e(DownloadManager.G, id.length() != 0 ? "Failed to set manual stop reason: ".concat(id) : new String("Failed to set manual stop reason: "), e2);
                    }
                }
            }
            B();
        }

        private void x(d activeTask, Download download, int accumulatingDownloadTaskCount) {
            Assertions.checkState(!activeTask.d);
            if (!c() || accumulatingDownloadTaskCount >= this.j) {
                n(download, 0, 0);
                activeTask.e(false);
            }
        }

        @Nullable
        @CheckResult
        private d y(@Nullable d activeTask, Download download) {
            if (activeTask != null) {
                Assertions.checkState(!activeTask.d);
                activeTask.e(false);
                return activeTask;
            }
            if (!c() || this.l >= this.j) {
                return null;
            }
            Download downloadN = n(download, 2, 0);
            d dVar = new d(downloadN.request, this.d.createDownloader(downloadN.request), downloadN.a, false, this.k, this);
            this.g.put(downloadN.request.id, dVar);
            int i = this.l;
            this.l = i + 1;
            if (i == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            dVar.start();
            return dVar;
        }

        private void z(@Nullable d activeTask, Download download) {
            if (activeTask != null) {
                if (activeTask.d) {
                    return;
                }
                activeTask.e(false);
            } else {
                d dVar = new d(download.request, this.d.createDownloader(download.request), download.a, true, this.k, this);
                this.g.put(download.request.id, dVar);
                dVar.start();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = 0;
            switch (message.what) {
                case 0:
                    h(message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 1:
                    r(message.arg1 != 0);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 2:
                    u(message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 3:
                    w((String) message.obj, message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 4:
                    s(message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 5:
                    t(message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 6:
                    b((DownloadRequest) message.obj, message.arg1);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 7:
                    q((String) message.obj);
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 8:
                    p();
                    i = 1;
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 9:
                    l((d) message.obj);
                    this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
                    return;
                case 10:
                    i((d) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public static class d extends Thread implements Downloader.ProgressListener {
        private final DownloadRequest a;
        private final Downloader b;
        private final DownloadProgress c;
        private final boolean d;
        private final int e;

        @Nullable
        private volatile c f;
        private volatile boolean g;

        @Nullable
        private Exception h;
        private long i;

        private static int f(int errorCount) {
            return Math.min((errorCount - 1) * 1000, 5000);
        }

        public void e(boolean released) {
            if (released) {
                this.f = null;
            }
            if (this.g) {
                return;
            }
            this.g = true;
            this.b.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long contentLength, long bytesDownloaded, float percentDownloaded) {
            this.c.bytesDownloaded = bytesDownloaded;
            this.c.percentDownloaded = percentDownloaded;
            if (contentLength != this.i) {
                this.i = contentLength;
                c cVar = this.f;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (contentLength >> 32), (int) contentLength, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.d) {
                    this.b.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.g) {
                        try {
                            this.b.download(this);
                            break;
                        } catch (IOException e) {
                            if (!this.g) {
                                long j2 = this.c.bytesDownloaded;
                                if (j2 != j) {
                                    j = j2;
                                    i = 0;
                                }
                                i++;
                                if (i > this.e) {
                                    throw e;
                                }
                                Thread.sleep(f(i));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.h = e2;
            }
            c cVar = this.f;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private d(DownloadRequest request, Downloader downloader, DownloadProgress downloadProgress, boolean isRemove, int minRetryCount, c internalHandler) {
            this.a = request;
            this.b = downloader;
            this.c = downloadProgress;
            this.d = isRemove;
            this.e = minRetryCount;
            this.f = internalHandler;
            this.i = -1L;
        }
    }

    @Deprecated
    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory upstreamFactory) {
        this(context, databaseProvider, cache, upstreamFactory, jy0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Message message) {
        int i = message.what;
        if (i == 0) {
            g((List) message.obj);
        } else if (i == 1) {
            h(message.arg1, message.arg2);
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            f((b) message.obj);
        }
        return true;
    }

    public static Download d(Download download, DownloadRequest request, int stopReason, long nowMs) {
        int i;
        int i2 = download.state;
        long j = (i2 == 5 || download.isTerminalState()) ? nowMs : download.startTimeMs;
        if (i2 == 5 || i2 == 7) {
            i = 7;
        } else {
            i = stopReason != 0 ? 1 : 0;
        }
        return new Download(download.request.copyWithMergedRequest(request), i, j, nowMs, -1L, stopReason, 0);
    }

    private void e() {
        Iterator<Listener> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().onWaitingForRequirementsChanged(this, this.n);
        }
    }

    private void f(b update) {
        this.o = Collections.unmodifiableList(update.c);
        Download download = update.a;
        boolean zK = k();
        if (update.b) {
            Iterator<Listener> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it3 = this.f.iterator();
            while (it3.hasNext()) {
                it3.next().onDownloadChanged(this, download, update.d);
            }
        }
        if (zK) {
            e();
        }
    }

    private void g(List<Download> downloads) {
        this.i = true;
        this.o = Collections.unmodifiableList(downloads);
        boolean zK = k();
        Iterator<Listener> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().onInitialized(this);
        }
        if (zK) {
            e();
        }
    }

    private void h(int processedMessageCount, int activeTaskCount) {
        this.g -= processedMessageCount;
        this.h = activeTaskCount;
        if (isIdle()) {
            Iterator<Listener> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(RequirementsWatcher requirementsWatcher, int notMetRequirements) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.m != notMetRequirements) {
            this.m = notMetRequirements;
            this.g++;
            this.d.obtainMessage(2, notMetRequirements, 0).sendToTarget();
        }
        boolean zK = k();
        Iterator<Listener> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().onRequirementsStateChanged(this, requirements, notMetRequirements);
        }
        if (zK) {
            e();
        }
    }

    private void j(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        this.g++;
        this.d.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
        boolean zK = k();
        Iterator<Listener> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().onDownloadsPausedChanged(this, z2);
        }
        if (zK) {
            e();
        }
    }

    private boolean k() {
        boolean z2;
        if (!this.j && this.m != 0) {
            int i = 0;
            while (true) {
                if (i >= this.o.size()) {
                    z2 = false;
                    break;
                }
                if (this.o.get(i).state == 0) {
                    z2 = true;
                    break;
                }
                i++;
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = this.n != z2;
        this.n = z2;
        return z3;
    }

    public void addDownload(DownloadRequest request) {
        addDownload(request, 0);
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.f.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.c.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.o;
    }

    public DownloadIndex getDownloadIndex() {
        return this.b;
    }

    public boolean getDownloadsPaused() {
        return this.j;
    }

    public int getMaxParallelDownloads() {
        return this.k;
    }

    public int getMinRetryCount() {
        return this.l;
    }

    public int getNotMetRequirements() {
        return this.m;
    }

    public Requirements getRequirements() {
        return this.p.getRequirements();
    }

    public boolean isIdle() {
        return this.h == 0 && this.g == 0;
    }

    public boolean isInitialized() {
        return this.i;
    }

    public boolean isWaitingForRequirements() {
        return this.n;
    }

    public void pauseDownloads() {
        j(true);
    }

    public void release() {
        synchronized (this.d) {
            c cVar = this.d;
            if (cVar.a) {
                return;
            }
            cVar.sendEmptyMessage(12);
            boolean z2 = false;
            while (true) {
                c cVar2 = this.d;
                if (cVar2.a) {
                    break;
                }
                try {
                    cVar2.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            this.c.removeCallbacksAndMessages(null);
            this.o = Collections.emptyList();
            this.g = 0;
            this.h = 0;
            this.i = false;
            this.m = 0;
            this.n = false;
        }
    }

    public void removeAllDownloads() {
        this.g++;
        this.d.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String id) {
        this.g++;
        this.d.obtainMessage(7, id).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.f.remove(listener);
    }

    public void resumeDownloads() {
        j(false);
    }

    public void setMaxParallelDownloads(int maxParallelDownloads) {
        Assertions.checkArgument(maxParallelDownloads > 0);
        if (this.k == maxParallelDownloads) {
            return;
        }
        this.k = maxParallelDownloads;
        this.g++;
        this.d.obtainMessage(4, maxParallelDownloads, 0).sendToTarget();
    }

    public void setMinRetryCount(int minRetryCount) {
        Assertions.checkArgument(minRetryCount >= 0);
        if (this.l == minRetryCount) {
            return;
        }
        this.l = minRetryCount;
        this.g++;
        this.d.obtainMessage(5, minRetryCount, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.p.getRequirements())) {
            return;
        }
        this.p.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.a, this.e, requirements);
        this.p = requirementsWatcher;
        i(this.p, requirementsWatcher.start());
    }

    public void setStopReason(@Nullable String id, int stopReason) {
        this.g++;
        this.d.obtainMessage(3, stopReason, 0, id).sendToTarget();
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory upstreamFactory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(upstreamFactory), executor));
    }

    public void addDownload(DownloadRequest request, int stopReason) {
        this.g++;
        this.d.obtainMessage(6, stopReason, 0, request).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex downloadIndex, DownloaderFactory downloaderFactory) {
        this.a = context.getApplicationContext();
        this.b = downloadIndex;
        this.k = 3;
        this.l = 5;
        this.j = true;
        this.o = Collections.emptyList();
        this.f = new CopyOnWriteArraySet<>();
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: vc1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.c(message);
            }
        });
        this.c = handlerCreateHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, downloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.k, this.l, this.j);
        this.d = cVar;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: wc1
            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
                this.a.i(requirementsWatcher, i);
            }
        };
        this.e = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.p = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.m = iStart;
        this.g = 1;
        cVar.obtainMessage(0, iStart, 0).sendToTarget();
    }
}
