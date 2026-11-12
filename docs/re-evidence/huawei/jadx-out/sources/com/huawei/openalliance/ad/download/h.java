package com.huawei.openalliance.ad.download;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.openalliance.ad.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.dx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.df;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.o;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f18625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DownloadTask f18626c;
    private WeakReference<c> d;
    private int h;
    private boolean e = false;
    private boolean f = false;
    private final byte[] g = new byte[0];
    private boolean i = true;

    public String toString() {
        return "DownloadWorker";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        hw.b("DownloadWorker", "[%s] running...", this);
        this.f18626c = null;
        boolean zB = false;
        while (!d()) {
            try {
                synchronized (this) {
                    while (this.f18625b.c() > 0 && !cb.e(this.f18625b.f18609a)) {
                        wait(1000L);
                    }
                }
                this.h = 0;
                this.i = true;
                DownloadTask downloadTaskB = this.f18625b.b();
                this.f18626c = downloadTaskB;
                if (downloadTaskB != null) {
                    zB = false;
                    do {
                        synchronized (this) {
                            if (zB) {
                                long jPow = (long) (Math.pow(2.0d, this.h - 1) * 500.0d);
                                hw.d("DownloadWorker", "retry, interval:" + jPow + ", count:" + this.h);
                                wait(jPow);
                            }
                        }
                        zB = b(this.f18626c);
                        if (!zB) {
                            break;
                        }
                        i = this.h;
                        this.h = i + 1;
                    } while (i < 3);
                }
                if (this.f18626c != null) {
                    a(zB);
                }
            } catch (Throwable th) {
                try {
                    hw.d("DownloadWorker", "run Throwable");
                    hw.a(5, th);
                    DownloadTask downloadTask = this.f18626c;
                    if (downloadTask != null && (downloadTask instanceof dx)) {
                        ((dx) downloadTask).j(th.getClass().getSimpleName() + "," + th.getMessage());
                    }
                    if (this.f18626c != null) {
                    }
                } catch (Throwable th2) {
                    if (this.f18626c != null) {
                        a(zB);
                    }
                    throw th2;
                }
            }
        }
    }

    public void a(DownloadTask downloadTask) {
        if (downloadTask == null || !downloadTask.equals(this.f18626c) || b()) {
            return;
        }
        b(true);
        if (hw.a()) {
            hw.a("DownloadWorker", "cancelCurrentTask, taskId:%s", downloadTask.n());
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.download.h.1
            @Override // java.lang.Runnable
            public void run() {
                df.a(h.this.c());
            }
        });
    }

    private File e(DownloadTask downloadTask) throws IOException {
        long length;
        File file = new File(downloadTask.e());
        if (file.exists()) {
            length = file.length();
        } else {
            File parentFile = file.getParentFile();
            if ((!parentFile.exists() || !parentFile.isDirectory()) && !ai.g(parentFile)) {
                hw.c("DownloadWorker", "failed to create dirs");
                throw new IOException("fail to create dirs");
            }
            if (!file.createNewFile()) {
                hw.c("DownloadWorker", "failed to create new temp file");
                throw new IOException("fail to create new temp file");
            }
            length = 0;
        }
        downloadTask.b(length);
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02de  */
    private boolean d(DownloadTask downloadTask) throws Throwable {
        c cVarA;
        long j;
        long j2;
        DownloadBlockInfo downloadBlockInfo;
        RandomAccessFile randomAccessFile;
        BufferedInputStream bufferedInputStream;
        RandomAccessFile randomAccessFile2;
        long j3;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3;
        long j4;
        long j5;
        long j6;
        DownloadBlockInfo downloadBlockInfo2;
        long j7;
        BufferedInputStream bufferedInputStream4;
        DownloadBlockInfo downloadBlockInfo3;
        DownloadBlockInfo downloadBlockInfo4;
        int iMin;
        h hVar;
        h hVar2 = this;
        BufferedInputStream bufferedInputStream5 = null;
        downloadTask.a((DownloadBlockInfo) null);
        hVar2.b(false);
        if (g.a(hVar2.f18624a, downloadTask)) {
            hw.b("DownloadWorker", "download - file already downloaded");
            if (downloadTask instanceof dx) {
                ((dx) downloadTask).e(true);
            }
            hVar2.f18625b.a(downloadTask, 100);
            hVar2.f18625b.h(downloadTask);
            return false;
        }
        File fileE = e(downloadTask);
        try {
            cVarA = hVar2.a(downloadTask, fileE);
            try {
                if (cVarA == null) {
                    hVar2.f18625b.j(downloadTask);
                    df.a((Closeable) null);
                    df.a((Closeable) null);
                    if (cVarA != null) {
                        df.a(cVarA);
                    }
                    return false;
                }
                try {
                    hVar2.a(cVarA);
                    downloadTask.a(g.b(cVarA));
                    long jG = downloadTask.g();
                    long jF = downloadTask.f();
                    long j8 = jF - jG;
                    downloadTask.c(jG);
                    if (!ai.a(j8, fileE.getParent())) {
                        downloadTask.a(DownloadTask.b.NO_SPACE);
                        hVar2.f18625b.j(downloadTask);
                        df.a((Closeable) null);
                        df.a((Closeable) null);
                        if (cVarA != null) {
                            df.a(cVarA);
                        }
                        return false;
                    }
                    if (hVar2.i && !b()) {
                        hVar2.i = false;
                        hVar2.f18625b.g(downloadTask);
                    }
                    hw.b("DownloadWorker", "download start, totalSize: %s leftSize: %s", Long.valueOf(jF), Long.valueOf(j8));
                    int iD = hVar2.f18625b.d();
                    bufferedInputStream = new BufferedInputStream(cVarA.a(), iD);
                    try {
                        try {
                            if (!a(cVarA, downloadTask)) {
                                try {
                                    hw.b("DownloadWorker", "server doesn't support continuous download, %s bytes skipped", Long.valueOf(bufferedInputStream.skip(jG)));
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedInputStream5 = bufferedInputStream;
                                    randomAccessFile2 = null;
                                    df.a((Closeable) bufferedInputStream5);
                                    df.a(randomAccessFile2);
                                    if (cVarA != null) {
                                        df.a(cVarA);
                                    }
                                    throw th;
                                }
                            }
                            randomAccessFile = new RandomAccessFile(fileE, "rwd");
                            try {
                                try {
                                    randomAccessFile.seek(jG);
                                    byte[] bArr = new byte[iD];
                                    n nVar = new n(hVar2.f18625b, iD);
                                    n.a aVarA = nVar.a();
                                    hw.b("DownloadWorker", "need control speed: " + aVarA.f18635b);
                                    long j9 = jG;
                                    long jC = as.c();
                                    try {
                                        DownloadBlockInfo downloadBlockInfo5 = new DownloadBlockInfo();
                                        try {
                                            downloadBlockInfo5.a(jC);
                                            downloadTask.a(downloadBlockInfo5);
                                            int i = 0;
                                            long j10 = 0;
                                            long j11 = 0;
                                            int i2 = 0;
                                            while (true) {
                                                try {
                                                    n.a aVar = aVarA;
                                                    int i3 = bufferedInputStream.read(bArr, 0, aVarA.f18634a);
                                                    if (i3 <= 0) {
                                                        break;
                                                    }
                                                    try {
                                                        if (b()) {
                                                            try {
                                                                hw.b("DownloadWorker", "download canceled");
                                                                break;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                        } else {
                                                            j6 = jC;
                                                            long j12 = i3;
                                                            bufferedInputStream4 = bufferedInputStream;
                                                            long j13 = j10 + j12;
                                                            try {
                                                                try {
                                                                    downloadBlockInfo5.c(j13);
                                                                    nVar.a(i3);
                                                                    randomAccessFile.write(bArr, 0, i3);
                                                                    long j14 = j9 + j12;
                                                                    if (jF > 0) {
                                                                        downloadBlockInfo4 = downloadBlockInfo5;
                                                                        try {
                                                                            try {
                                                                                iMin = Math.min(100, Math.max(0, (int) ((100 * j14) / jF)));
                                                                            } catch (IOException e) {
                                                                                e = e;
                                                                                hVar = this;
                                                                                j10 = j13;
                                                                                randomAccessFile = randomAccessFile;
                                                                                downloadBlockInfo2 = downloadBlockInfo4;
                                                                                j7 = j10;
                                                                                bufferedInputStream = bufferedInputStream4;
                                                                                j2 = j7;
                                                                                downloadBlockInfo = downloadBlockInfo2;
                                                                                j = j6;
                                                                                a(downloadTask, j, j2, downloadBlockInfo);
                                                                                throw e;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                        }
                                                                    } else {
                                                                        downloadBlockInfo4 = downloadBlockInfo5;
                                                                        iMin = i2;
                                                                    }
                                                                    try {
                                                                        downloadTask.b(j14);
                                                                        if (j14 <= jF || jF <= 0) {
                                                                            j10 = j13;
                                                                            hVar2 = this;
                                                                            try {
                                                                                try {
                                                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                    if (jF > 0 && (iMin - i >= 1 || jCurrentTimeMillis - j11 > 5000)) {
                                                                                        hVar2.f18625b.a(downloadTask, iMin);
                                                                                        i = iMin;
                                                                                        j11 = jCurrentTimeMillis;
                                                                                    }
                                                                                    i2 = iMin;
                                                                                    downloadBlockInfo5 = downloadBlockInfo4;
                                                                                    aVarA = aVar;
                                                                                    bufferedInputStream = bufferedInputStream4;
                                                                                    j9 = j14;
                                                                                    jC = j6;
                                                                                } catch (IOException e2) {
                                                                                    e = e2;
                                                                                    randomAccessFile = randomAccessFile;
                                                                                    downloadBlockInfo2 = downloadBlockInfo4;
                                                                                    j7 = j10;
                                                                                    bufferedInputStream = bufferedInputStream4;
                                                                                    j2 = j7;
                                                                                    downloadBlockInfo = downloadBlockInfo2;
                                                                                    j = j6;
                                                                                    a(downloadTask, j, j2, downloadBlockInfo);
                                                                                    throw e;
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                hw.c("DownloadWorker", "downloading, check file size failed");
                                                                                hVar = this;
                                                                                try {
                                                                                    boolean zC = hVar.c(downloadTask, fileE);
                                                                                    if (!zC) {
                                                                                        ai.e(fileE);
                                                                                        downloadTask.a(DownloadTask.b.FILE_SIZE_ERROR);
                                                                                        hVar.f18625b.j(downloadTask);
                                                                                    }
                                                                                    df.a((Closeable) bufferedInputStream4);
                                                                                    df.a(randomAccessFile);
                                                                                    if (cVarA != null) {
                                                                                        df.a(cVarA);
                                                                                    }
                                                                                    return zC;
                                                                                } catch (IOException e3) {
                                                                                    e = e3;
                                                                                    j10 = j13;
                                                                                    randomAccessFile = randomAccessFile;
                                                                                    downloadBlockInfo2 = downloadBlockInfo4;
                                                                                    j7 = j10;
                                                                                    bufferedInputStream = bufferedInputStream4;
                                                                                    j2 = j7;
                                                                                    downloadBlockInfo = downloadBlockInfo2;
                                                                                    j = j6;
                                                                                    a(downloadTask, j, j2, downloadBlockInfo);
                                                                                    throw e;
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                bufferedInputStream5 = bufferedInputStream4;
                                                                                randomAccessFile2 = randomAccessFile;
                                                                                df.a((Closeable) bufferedInputStream5);
                                                                                df.a(randomAccessFile2);
                                                                                if (cVarA != null) {
                                                                                    df.a(cVarA);
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (IOException e4) {
                                                                        e = e4;
                                                                        j10 = j13;
                                                                        randomAccessFile = randomAccessFile;
                                                                        downloadBlockInfo2 = downloadBlockInfo4;
                                                                        j7 = j10;
                                                                        bufferedInputStream = bufferedInputStream4;
                                                                        j2 = j7;
                                                                        downloadBlockInfo = downloadBlockInfo2;
                                                                        j = j6;
                                                                        a(downloadTask, j, j2, downloadBlockInfo);
                                                                        throw e;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                }
                                                            } catch (IOException e5) {
                                                                e = e5;
                                                                downloadBlockInfo4 = downloadBlockInfo5;
                                                            }
                                                        }
                                                    } catch (IOException e6) {
                                                        e = e6;
                                                        downloadBlockInfo3 = downloadBlockInfo5;
                                                        bufferedInputStream4 = bufferedInputStream;
                                                        j6 = jC;
                                                        randomAccessFile = randomAccessFile;
                                                        downloadBlockInfo2 = downloadBlockInfo3;
                                                        bufferedInputStream = bufferedInputStream4;
                                                        j7 = j10;
                                                        j2 = j7;
                                                        downloadBlockInfo = downloadBlockInfo2;
                                                        j = j6;
                                                        a(downloadTask, j, j2, downloadBlockInfo);
                                                        throw e;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        bufferedInputStream4 = bufferedInputStream;
                                                        bufferedInputStream3 = bufferedInputStream4;
                                                        randomAccessFile = randomAccessFile;
                                                        bufferedInputStream5 = bufferedInputStream3;
                                                        randomAccessFile2 = randomAccessFile;
                                                        df.a((Closeable) bufferedInputStream5);
                                                        df.a(randomAccessFile2);
                                                        if (cVarA != null) {
                                                            df.a(cVarA);
                                                        }
                                                        throw th;
                                                    }
                                                    th = th4;
                                                    bufferedInputStream = bufferedInputStream4;
                                                    bufferedInputStream5 = bufferedInputStream;
                                                    randomAccessFile2 = randomAccessFile;
                                                    df.a((Closeable) bufferedInputStream5);
                                                    df.a(randomAccessFile2);
                                                    if (cVarA != null) {
                                                        df.a(cVarA);
                                                    }
                                                    throw th;
                                                } catch (IOException e7) {
                                                    e = e7;
                                                    bufferedInputStream = bufferedInputStream;
                                                    j6 = jC;
                                                    downloadBlockInfo2 = downloadBlockInfo5;
                                                    randomAccessFile = randomAccessFile;
                                                }
                                            }
                                            downloadBlockInfo3 = downloadBlockInfo5;
                                            bufferedInputStream4 = bufferedInputStream;
                                            j6 = jC;
                                            try {
                                                try {
                                                    if (downloadTask instanceof dx) {
                                                        ((dx) downloadTask).b(Long.valueOf(System.currentTimeMillis()));
                                                    }
                                                    downloadBlockInfo2 = downloadBlockInfo3;
                                                    randomAccessFile = randomAccessFile;
                                                    bufferedInputStream = bufferedInputStream4;
                                                    try {
                                                        try {
                                                            a(downloadTask, j6, j10, downloadBlockInfo2);
                                                            try {
                                                                boolean zB = hVar2.b(downloadTask, fileE);
                                                                df.a((Closeable) bufferedInputStream);
                                                                df.a(randomAccessFile);
                                                                if (cVarA != null) {
                                                                    df.a(cVarA);
                                                                }
                                                                return zB;
                                                            } catch (IOException e8) {
                                                                e = e8;
                                                                j7 = j10;
                                                                j2 = j7;
                                                                downloadBlockInfo = downloadBlockInfo2;
                                                                j = j6;
                                                                a(downloadTask, j, j2, downloadBlockInfo);
                                                                throw e;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            randomAccessFile = randomAccessFile;
                                                            bufferedInputStream = bufferedInputStream;
                                                        }
                                                    } catch (IOException e9) {
                                                        e = e9;
                                                        downloadBlockInfo = downloadBlockInfo2;
                                                        j2 = j10;
                                                        j = j6;
                                                        a(downloadTask, j, j2, downloadBlockInfo);
                                                        throw e;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    bufferedInputStream3 = bufferedInputStream4;
                                                    randomAccessFile = randomAccessFile;
                                                    bufferedInputStream5 = bufferedInputStream3;
                                                    randomAccessFile2 = randomAccessFile;
                                                    df.a((Closeable) bufferedInputStream5);
                                                    df.a(randomAccessFile2);
                                                    if (cVarA != null) {
                                                        df.a(cVarA);
                                                    }
                                                    throw th;
                                                }
                                            } catch (IOException e10) {
                                                e = e10;
                                                randomAccessFile = randomAccessFile;
                                                downloadBlockInfo2 = downloadBlockInfo3;
                                                bufferedInputStream = bufferedInputStream4;
                                                j7 = j10;
                                                j2 = j7;
                                                downloadBlockInfo = downloadBlockInfo2;
                                                j = j6;
                                                a(downloadTask, j, j2, downloadBlockInfo);
                                                throw e;
                                            }
                                        } catch (IOException e11) {
                                            e = e11;
                                            bufferedInputStream = bufferedInputStream;
                                            j6 = jC;
                                            downloadBlockInfo2 = downloadBlockInfo5;
                                            randomAccessFile = randomAccessFile;
                                            j7 = 0;
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        j5 = jC;
                                        j4 = 0;
                                        j2 = j4;
                                        j = j5;
                                        downloadBlockInfo = null;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    j4 = 0;
                                    j5 = 0;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                bufferedInputStream3 = bufferedInputStream;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            j3 = 0;
                            bufferedInputStream2 = bufferedInputStream;
                            bufferedInputStream = bufferedInputStream2;
                            j = j3;
                            j2 = j;
                            downloadBlockInfo = null;
                            randomAccessFile = null;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        bufferedInputStream = bufferedInputStream;
                    }
                } catch (IOException e15) {
                    e = e15;
                    j3 = 0;
                    bufferedInputStream2 = null;
                } catch (Throwable th13) {
                    th = th13;
                    bufferedInputStream = null;
                }
                bufferedInputStream = bufferedInputStream2;
                j = j3;
                j2 = j;
                downloadBlockInfo = null;
                randomAccessFile = null;
                a(downloadTask, j, j2, downloadBlockInfo);
                throw e;
            } catch (IOException e16) {
                e = e16;
                downloadBlockInfo = null;
                randomAccessFile = null;
                bufferedInputStream = null;
                j = 0;
                j2 = 0;
            } catch (Throwable th14) {
                th = th14;
                randomAccessFile = null;
            }
        } catch (IOException e17) {
            e = e17;
            j = 0;
            j2 = 0;
            downloadBlockInfo = null;
            cVarA = null;
            randomAccessFile = null;
            bufferedInputStream = null;
        } catch (Throwable th15) {
            th = th15;
            bufferedInputStream5 = null;
            cVarA = null;
        }
    }

    private boolean d() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    private boolean c(DownloadTask downloadTask, File file) {
        if (downloadTask.r() || TextUtils.isEmpty(downloadTask.b()) || !cb.c(this.f18624a)) {
            return false;
        }
        downloadTask.c(true);
        downloadTask.b(0L);
        downloadTask.c(0L);
        downloadTask.f(null);
        downloadTask.c(0);
        ai.e(file);
        this.f18625b.i(downloadTask);
        return true;
    }

    private boolean c(DownloadTask downloadTask) {
        DownloadTask.b bVar;
        if (!cb.e(this.f18625b.f18609a)) {
            bVar = DownloadTask.b.NO_NETWORK;
        } else {
            if (downloadTask.o() || cb.c(this.f18625b.f18609a)) {
                return true;
            }
            bVar = DownloadTask.b.MOBILE_NETWORK;
        }
        downloadTask.a(bVar);
        this.f18625b.j(downloadTask);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c c() {
        c cVar;
        synchronized (this) {
            WeakReference<c> weakReference = this.d;
            cVar = weakReference != null ? weakReference.get() : null;
        }
        return cVar;
    }

    private boolean b(DownloadTask downloadTask, File file) {
        hw.b("DownloadWorker", "download complete");
        if (b()) {
            if (!downloadTask.q()) {
                return false;
            }
            hw.b("DownloadWorker", "onDownloadCompleted - task is cancelled");
            ai.e(file);
            downloadTask.b(0L);
            return false;
        }
        if (!downloadTask.z() || ai.a(downloadTask.c(), file)) {
            if (!ai.a(this.f18624a, file, downloadTask.d(), downloadTask.A(), "normal")) {
                this.f18625b.j(downloadTask);
                return false;
            }
            hw.b("DownloadWorker", "download success");
            this.f18625b.a(downloadTask, 100);
            this.f18625b.h(downloadTask);
            return false;
        }
        hw.c("DownloadWorker", "onDownloadCompleted, check file sha256 failed");
        boolean zC = c(downloadTask, file);
        if (!zC) {
            ai.e(file);
            downloadTask.a(DownloadTask.b.FILE_SHA256_ERROR);
            this.f18625b.j(downloadTask);
        }
        return zC;
    }

    private boolean b(DownloadTask downloadTask) {
        try {
            hw.a("DownloadWorker", "takeTask, taskId:%s, priority:%d, seqNum:%d", downloadTask.n(), Integer.valueOf(downloadTask.k()), Long.valueOf(downloadTask.m()));
            downloadTask.a((DownloadBlockInfo) null);
            if (!c(downloadTask)) {
                hw.a("DownloadWorker", "executeTask, network error, taskId:%s", downloadTask.n());
                return false;
            }
            downloadTask.a(this);
            downloadTask.a(2);
            if (d(downloadTask)) {
                d(downloadTask);
            }
            return false;
        } catch (Throwable th) {
            hw.d("DownloadWorker", "executeTask Exception, taskId:" + ds.a(downloadTask.n()));
            hw.a(5, th);
            return a();
        }
    }

    private boolean b() {
        boolean z;
        synchronized (this) {
            z = this.e;
        }
        return z;
    }

    private void b(boolean z) {
        synchronized (this) {
            this.e = z;
        }
    }

    private c b(c cVar, DownloadTask downloadTask, File file) {
        hw.b("DownloadWorker", "checkConn - try Safe Url");
        if (downloadTask.r() || TextUtils.isEmpty(downloadTask.b()) || !ai.f(file)) {
            hw.b("DownloadWorker", "checkConn - fail to switch to safe url, stop downloading");
            downloadTask.a(DownloadTask.b.FILE_SIZE_ERROR);
            if (file.length() <= 0) {
                ai.e(file);
            }
            df.a(cVar);
            return null;
        }
        hw.b("DownloadWorker", "checkConn - switch to safe url ok");
        df.a(cVar);
        downloadTask.b(0L);
        downloadTask.c(0L);
        downloadTask.c(true);
        downloadTask.f(null);
        downloadTask.c(0);
        return a(downloadTask, file);
    }

    private static boolean a(c cVar, DownloadTask downloadTask) {
        return downloadTask.g() <= 0 || cVar.b() == 206;
    }

    private boolean a() {
        if (!b()) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                hw.d("DownloadWorker", "exception occur when wait for sync cancel");
            }
        }
        return !b();
    }

    private void a(boolean z) {
        if (z) {
            try {
                this.f18625b.j(this.f18626c);
            } catch (Throwable unused) {
                hw.d("DownloadWorker", "call manager.onDownloadFail Exception");
            }
        }
        try {
            if (b() && this.f18626c.p() == DownloadTask.c.USER_CLICK) {
                this.f18626c.a(0);
            }
            this.f18626c.a((h) null);
            this.f18625b.a(this.f18626c);
            this.f18626c = null;
        } catch (Throwable unused2) {
            hw.d("DownloadWorker", "run Exception");
        }
    }

    private void a(c cVar) {
        synchronized (this) {
            this.d = new WeakReference<>(cVar);
        }
    }

    private void a(DownloadTask downloadTask, long j, long j2, DownloadBlockInfo downloadBlockInfo) {
        if (j == 0) {
            hw.c("DownloadWorker", "speed log - no start time");
            return;
        }
        long jC = as.c();
        long j3 = jC - j;
        if (j3 > 0) {
            if (!downloadTask.q()) {
                if (downloadBlockInfo == null) {
                    downloadBlockInfo = new DownloadBlockInfo();
                }
                downloadBlockInfo.a(j);
                downloadBlockInfo.b(jC);
                downloadBlockInfo.c(j2);
                downloadTask.a(downloadBlockInfo);
                downloadTask.y();
            }
            hw.b("DownloadWorker", "download complete - total time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s)", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(((SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US * j2) / j3) / 100));
            return;
        }
        hw.c("DownloadWorker", "speed log - duration <= 0");
    }

    private c a(c cVar, DownloadTask downloadTask, File file) {
        hw.b("DownloadWorker", "checkConn start");
        try {
            long jA = g.a(cVar);
            if (downloadTask.f() > 0 && jA > 0 && downloadTask.f() != jA) {
                hw.a("DownloadWorker", "task size:%d, header size:%d", Long.valueOf(downloadTask.f()), Long.valueOf(jA));
                hw.b("DownloadWorker", "checkConn - may be hijacked, switch to safe url");
                cVar = b(cVar, downloadTask, file);
            }
            hw.b("DownloadWorker", "checkConn end");
            return cVar;
        } catch (g.a e) {
            downloadTask.c(downloadTask.t() + 1);
            downloadTask.f(e.a());
            int iE = this.f18625b.e();
            hw.c("DownloadWorker", "checkConn - url is redirected [count: %d, max: %d]", Integer.valueOf(downloadTask.t()), Integer.valueOf(iE));
            if (TextUtils.isEmpty(downloadTask.s()) || downloadTask.t() > iE) {
                return b(cVar, downloadTask, file);
            }
            hw.b("DownloadWorker", "checkConn - connect with redirected url");
            df.a(cVar);
            return a(downloadTask, file);
        }
    }

    private c a(DownloadTask downloadTask, File file) throws NoSuchAlgorithmException, IOException, KeyStoreException, com.huawei.openalliance.ad.exception.d {
        String strA;
        c cVarA = null;
        try {
            if (!TextUtils.isEmpty(downloadTask.s()) && downloadTask.t() < this.f18625b.e()) {
                hw.b("DownloadWorker", "create connection with redirected url");
                strA = downloadTask.s();
            } else if (!downloadTask.r() || TextUtils.isEmpty(downloadTask.b())) {
                hw.b("DownloadWorker", "create connection with normal url");
                strA = downloadTask.a();
            } else {
                hw.b("DownloadWorker", "create connection with safe url");
                strA = downloadTask.b();
                downloadTask.f(null);
                downloadTask.c(0);
            }
            if (hw.a()) {
                hw.a("DownloadWorker", "url: %s", ds.a(strA));
            }
            cVarA = c.a(this.f18624a, strA, downloadTask.g());
            return a(cVarA, downloadTask, file);
        } catch (com.huawei.openalliance.ad.exception.d e) {
            df.a(cVarA);
            throw e;
        } catch (IOException e2) {
            downloadTask.a(DownloadTask.b.CONN_FAILED);
            df.a(cVarA);
            throw e2;
        } catch (KeyStoreException e3) {
            df.a(cVarA);
            throw e3;
        } catch (NoSuchAlgorithmException e4) {
            df.a(cVarA);
            throw e4;
        }
    }

    public h(b bVar) {
        this.f18625b = bVar;
        this.f18624a = bVar.f18609a;
    }
}
