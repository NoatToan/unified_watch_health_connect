package com.ximalaya.ting.android.sdkdownloader.http.loader;

import com.google.common.net.HttpHeaders;
import com.ximalaya.ting.android.player.MediadataCrytoUtil;
import com.ximalaya.ting.android.sdkdownloader.exception.FileLockedException;
import com.ximalaya.ting.android.sdkdownloader.exception.HttpException;
import com.ximalaya.ting.android.sdkdownloader.http.ProgressHandler;
import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;
import com.ximalaya.ting.android.sdkdownloader.util.IOUtil;
import com.ximalaya.ting.android.sdkdownloader.util.ProcessLock;
import com.ximalaya.ting.android.sdkdownloader.util.XmUtils;
import com.xmlywind.sdk.common.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes22.dex */
public class FileLoader {
    private String a;
    private String b;
    private boolean c;
    private long d;
    private int e;
    private AtomicBoolean f = new AtomicBoolean(false);
    private AtomicBoolean g = new AtomicBoolean(false);
    private int h;
    public RequestParams params;
    public ProgressHandler progressHandler;
    private static final int i = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH;
    public static int DATA_SAVE_TYPE_FREE = 0;
    public static int DATA_SAVE_TYPE_PAY = 1;

    public FileLoader() {
        int i2 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH;
        this.h = i2 < 4096 ? 4096 : i2;
    }

    private File a(File file) {
        if (this.b.equals(this.a)) {
            return file;
        }
        File file2 = new File(this.b);
        return file.renameTo(file2) ? file2 : file;
    }

    private static boolean b(UriRequest uriRequest) {
        if (uriRequest == null) {
            return false;
        }
        String responseHeader = uriRequest.getResponseHeader(HttpHeaders.ACCEPT_RANGES);
        if (responseHeader != null) {
            return responseHeader.contains(HTTP.CONTENT_RANGE_BYTES);
        }
        String responseHeader2 = uriRequest.getResponseHeader("Content-Range");
        return responseHeader2 != null && responseHeader2.contains(HTTP.CONTENT_RANGE_BYTES);
    }

    public void close() {
        this.f.set(true);
    }

    public void closeAndRemove() {
        this.g.set(true);
        IOUtil.deleteFileOrDirByPath(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    public File load(InputStream inputStream) throws Throwable {
        Throwable th;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        ProgressHandler progressHandler = this.progressHandler;
        if (progressHandler != null && !progressHandler.updateProgress(0L, 0L, false)) {
            throw new Callback.CancelledException("download stopped!");
        }
        Closeable closeable2 = null;
        try {
            File file = new File(this.a);
            if (file.isDirectory()) {
                IOUtil.deleteFileOrDir(file);
            }
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile.exists() || parentFile.mkdirs()) {
                    file.createNewFile();
                }
            }
            long length = file.length();
            long j = 0;
            if (this.c && length > 0) {
                try {
                    int i2 = i;
                    long j2 = length - ((long) i2);
                    if (j2 <= 0) {
                        IOUtil.deleteFileOrDir(file);
                        throw new RuntimeException("need retry");
                    }
                    fileInputStream = new FileInputStream(file);
                    try {
                        if (!Arrays.equals(IOUtil.readBytes(inputStream, 0L, i2), IOUtil.readBytes(fileInputStream, j2, i2))) {
                            IOUtil.closeQuietly(fileInputStream);
                            IOUtil.deleteFileOrDir(file);
                            throw new RuntimeException("need retry");
                        }
                        this.d -= (long) i2;
                        IOUtil.closeQuietly(fileInputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtil.closeQuietly(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            }
            if (this.c) {
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
                length = 0;
            }
            long j3 = this.d + length;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    ProgressHandler progressHandler2 = this.progressHandler;
                    if (progressHandler2 != null && !progressHandler2.updateProgress(j3, length, true)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    byte[] bArr = new byte[MediadataCrytoUtil.ENCRYPT_DATA_LENGTH];
                    byte[] bArr2 = new byte[this.h];
                    while (true) {
                        int i3 = bufferedInputStream.read(bArr2);
                        if (i3 == -1) {
                            bufferedOutputStream.flush();
                            ProgressHandler progressHandler3 = this.progressHandler;
                            if (progressHandler3 != null) {
                                progressHandler3.updateProgress(j3, length, true);
                            }
                            IOUtil.closeQuietly(bufferedInputStream);
                            IOUtil.closeQuietly(bufferedOutputStream);
                            return a(file);
                        }
                        if (this.f.get()) {
                            bufferedOutputStream.flush();
                            throw new Callback.CancelledException("download stopped!");
                        }
                        if (this.g.get()) {
                            bufferedOutputStream.flush();
                            throw new Callback.RemovedException("download removed!");
                        }
                        if (!file.getParentFile().exists()) {
                            file.getParentFile().mkdirs();
                            throw new IOException("parent be deleted!");
                        }
                        if (length != j && length >= MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) {
                            bufferedOutputStream.write(bArr2, 0, i3);
                        } else if (this.e != DATA_SAVE_TYPE_PAY) {
                            bufferedOutputStream.write(bArr2, 0, i3);
                        } else if (length == j && i3 > MediadataCrytoUtil.ENCRYPT_DATA_LENGTH) {
                            bufferedOutputStream.write(MediadataCrytoUtil.getInstance().encryptData(Arrays.copyOf(bArr2, MediadataCrytoUtil.ENCRYPT_DATA_LENGTH)), 0, MediadataCrytoUtil.ENCRYPT_DATA_LENGTH);
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, MediadataCrytoUtil.ENCRYPT_DATA_LENGTH, i3);
                            bufferedOutputStream.write(bArrCopyOfRange, 0, bArrCopyOfRange.length);
                        } else if (length >= j) {
                            int i4 = (int) length;
                            int i5 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH - i4;
                            if (i5 > i3) {
                                System.arraycopy(bArr2, 0, bArr, i4, i3);
                            } else {
                                System.arraycopy(bArr2, 0, bArr, i4, i5);
                            }
                            long j4 = ((long) i3) + length;
                            int i6 = MediadataCrytoUtil.ENCRYPT_DATA_LENGTH;
                            if (j4 > i6) {
                                bufferedOutputStream.write(MediadataCrytoUtil.getInstance().encryptData(bArr), 0, MediadataCrytoUtil.ENCRYPT_DATA_LENGTH);
                                if (i5 < i3) {
                                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i5, i3);
                                    bufferedOutputStream.write(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
                                }
                            } else if (j4 == i6) {
                                bufferedOutputStream.write(MediadataCrytoUtil.getInstance().encryptData(bArr), 0, i3);
                            }
                        }
                        length += (long) i3;
                        ProgressHandler progressHandler4 = this.progressHandler;
                        if (progressHandler4 != null && !progressHandler4.updateProgress(j3, length, false)) {
                            bufferedOutputStream.flush();
                            if (this.g.get()) {
                                throw new Callback.RemovedException("download removed");
                            }
                            throw new Callback.CancelledException("download stopped!");
                        }
                        j = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable2 = bufferedOutputStream;
                    th = th;
                    closeable = closeable2;
                    closeable2 = bufferedInputStream;
                    IOUtil.closeQuietly(closeable2);
                    IOUtil.closeQuietly(closeable);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            closeable = null;
        }
    }

    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            this.params = requestParams;
            this.c = requestParams.isAutoResume();
            this.e = requestParams.getDataSaveType();
        }
    }

    public void setProgressHandler(ProgressHandler progressHandler) {
        this.progressHandler = progressHandler;
    }

    public File load(UriRequest uriRequest) throws Throwable {
        this.f.set(false);
        try {
            try {
                String saveFilePath = this.params.getSaveFilePath();
                this.b = saveFilePath;
                this.a = XmUtils.tempPathByDownloadSavePath(saveFilePath);
                ProgressHandler progressHandler = this.progressHandler;
                if (progressHandler != null && !progressHandler.updateProgress(0L, 0L, false)) {
                    throw new Callback.CancelledException("download stopped!");
                }
                ProcessLock processLockTryLock = ProcessLock.tryLock(this.b + "_lock", true);
                if (processLockTryLock != null && processLockTryLock.isValid()) {
                    this.params = uriRequest.getParams();
                    long j = 0;
                    if (this.c) {
                        File file = new File(this.a);
                        long length = file.length();
                        int i2 = i;
                        if (length <= i2 * 2) {
                            IOUtil.deleteFileOrDir(file);
                        } else {
                            j = length - ((long) i2);
                        }
                    }
                    this.params.setHeader("RANGE", Constants.RANGE_PARAMS + j + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    ProgressHandler progressHandler2 = this.progressHandler;
                    if (progressHandler2 != null && !progressHandler2.updateProgress(0L, 0L, false)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    uriRequest.sendRequest();
                    this.d = uriRequest.getContentLength();
                    if (this.c) {
                        this.c = b(uriRequest);
                    }
                    ProgressHandler progressHandler3 = this.progressHandler;
                    if (progressHandler3 != null && !progressHandler3.updateProgress(0L, 0L, false)) {
                        throw new Callback.CancelledException("download stopped!");
                    }
                    File fileLoad = load(uriRequest.getInputStream());
                    IOUtil.closeQuietly(uriRequest);
                    IOUtil.closeQuietly(processLockTryLock);
                    return fileLoad;
                }
                throw new FileLockedException("download exists: " + this.b);
            } catch (HttpException e) {
                throw e;
            }
        } catch (Throwable th) {
            IOUtil.closeQuietly(uriRequest);
            IOUtil.closeQuietly((Closeable) null);
            throw th;
        }
    }
}
