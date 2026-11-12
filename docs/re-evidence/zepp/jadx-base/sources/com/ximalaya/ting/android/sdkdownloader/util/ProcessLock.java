package com.ximalaya.ting.android.sdkdownloader.util;

import android.text.TextUtils;
import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class ProcessLock implements Closeable {
    private static final String f = "process_lock";
    private static final DoubleKeyValueMap<String, Integer, ProcessLock> g = new DoubleKeyValueMap<>();
    private static final DecimalFormat h;
    private final String a;
    private final FileLock b;
    private final File c;
    private final Closeable d;
    private final boolean e;

    static {
        IOUtil.deleteFileOrDir(XmDownloadManager.getInstance().app().getDir(f, 0));
        h = new DecimalFormat("0.##################");
    }

    private ProcessLock(String str, File file, FileLock fileLock, Closeable closeable, boolean z) {
        this.a = str;
        this.b = fileLock;
        this.c = file;
        this.d = closeable;
        this.e = z;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        double d = 0.0d;
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length(); i++) {
            d = ((d * 255.0d) + ((double) bytes[i])) * 0.005d;
        }
        return h.format(d);
    }

    private static boolean b(FileLock fileLock) {
        return fileLock != null && fileLock.isValid();
    }

    private static void c(String str, FileLock fileLock, File file, Closeable closeable) {
        FileChannel fileChannelChannel;
        DoubleKeyValueMap<String, Integer, ProcessLock> doubleKeyValueMap = g;
        synchronized (doubleKeyValueMap) {
            if (fileLock != null) {
                try {
                    doubleKeyValueMap.remove(str, Integer.valueOf(fileLock.hashCode()));
                    ConcurrentHashMap<Integer, ProcessLock> concurrentHashMap = doubleKeyValueMap.get(str);
                    if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                        IOUtil.deleteFileOrDir(file);
                    }
                    if (fileLock.channel().isOpen()) {
                        fileLock.release();
                    }
                    fileChannelChannel = fileLock.channel();
                } catch (Throwable unused) {
                    fileChannelChannel = fileLock.channel();
                }
                IOUtil.closeQuietly(fileChannelChannel);
                IOUtil.closeQuietly(closeable);
            } else {
                IOUtil.closeQuietly(closeable);
            }
            throw th;
        }
    }

    private static ProcessLock d(String str, String str2, boolean z) {
        Closeable closeable;
        FileChannel channel;
        DoubleKeyValueMap<String, Integer, ProcessLock> doubleKeyValueMap = g;
        synchronized (doubleKeyValueMap) {
            ConcurrentHashMap<Integer, ProcessLock> concurrentHashMap = doubleKeyValueMap.get(str);
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                Iterator<Map.Entry<Integer, ProcessLock>> it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    ProcessLock value = it2.next().getValue();
                    if (value == null) {
                        it2.remove();
                    } else if (!value.isValid()) {
                        it2.remove();
                    } else {
                        if (z) {
                            return null;
                        }
                        if (value.e) {
                            return null;
                        }
                    }
                }
            }
            try {
                File file = new File(XmDownloadManager.getInstance().app().getDir(f, 0), str2);
                if (file.exists() || file.createNewFile()) {
                    if (z) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                        channel = fileOutputStream.getChannel();
                        closeable = fileOutputStream;
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        channel = fileInputStream.getChannel();
                        closeable = fileInputStream;
                    }
                    try {
                        if (channel == null) {
                            throw new IOException("can not get file channel:" + file.getAbsolutePath());
                        }
                        FileLock fileLockTryLock = channel.tryLock(0L, Long.MAX_VALUE, !z);
                        if (b(fileLockTryLock)) {
                            ProcessLock processLock = new ProcessLock(str, file, fileLockTryLock, closeable, z);
                            g.put(str, Integer.valueOf(fileLockTryLock.hashCode()), processLock);
                            return processLock;
                        }
                        c(str, fileLockTryLock, file, closeable);
                    } catch (Throwable unused) {
                        IOUtil.closeQuietly(closeable);
                        IOUtil.closeQuietly(channel);
                    }
                }
            } catch (Throwable unused2) {
                closeable = null;
                channel = null;
            }
            return null;
        }
    }

    public static ProcessLock tryLock(String str, boolean z) {
        return d(str, a(str), z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        release();
    }

    public void finalize() throws Throwable {
        super.finalize();
        release();
    }

    public boolean isValid() {
        return b(this.b);
    }

    public void release() {
        c(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return this.a + ": " + this.c.getName();
    }

    public static ProcessLock tryLock(String str, boolean z, long j) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        String strA = a(str);
        ProcessLock processLockD = null;
        while (System.currentTimeMillis() < jCurrentTimeMillis && (processLockD = d(str, strA, z)) == null) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
        return processLockD;
    }
}
