package com.liulishuo.filedownloader.download;

import android.os.SystemClock;
import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.stream.FileDownloadOutputStream;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
public class FetchDataTask {
    public static final int q = 4096;
    private final ProcessCallback a;
    private final int b;
    private final int c;
    private final DownloadRunnable d;
    private final FileDownloadConnection e;
    private final boolean f;
    private final long g;
    private final long h;
    private final long i;
    private final String j;
    public long k;
    private FileDownloadOutputStream l;
    private volatile boolean m;
    private final FileDownloadDatabase n;
    private volatile long o;
    private volatile long p;

    public static class Builder {
        public DownloadRunnable a;
        public FileDownloadConnection b;
        public ConnectionProfile c;
        public ProcessCallback d;
        public String e;
        public Boolean f;
        public Integer g;
        public Integer h;

        public FetchDataTask build() throws IllegalArgumentException {
            FileDownloadConnection fileDownloadConnection;
            ConnectionProfile connectionProfile;
            Integer num;
            if (this.f == null || (fileDownloadConnection = this.b) == null || (connectionProfile = this.c) == null || this.d == null || this.e == null || (num = this.h) == null || this.g == null) {
                throw new IllegalArgumentException();
            }
            return new FetchDataTask(fileDownloadConnection, connectionProfile, this.a, num.intValue(), this.g.intValue(), this.f.booleanValue(), this.d, this.e);
        }

        public Builder setCallback(ProcessCallback processCallback) {
            this.d = processCallback;
            return this;
        }

        public Builder setConnection(FileDownloadConnection fileDownloadConnection) {
            this.b = fileDownloadConnection;
            return this;
        }

        public Builder setConnectionIndex(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        public Builder setConnectionProfile(ConnectionProfile connectionProfile) {
            this.c = connectionProfile;
            return this;
        }

        public Builder setDownloadId(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public Builder setHost(DownloadRunnable downloadRunnable) {
            this.a = downloadRunnable;
            return this;
        }

        public Builder setPath(String str) {
            this.e = str;
            return this;
        }

        public Builder setWifiRequired(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    private void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (FileDownloadUtils.isNeedSync(this.k - this.o, jElapsedRealtime - this.p)) {
            b();
            this.o = this.k;
            this.p = jElapsedRealtime;
        }
    }

    private void b() {
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            this.l.flushAndSync();
            z = true;
        } catch (IOException e) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e);
            }
            z = false;
        }
        if (z) {
            int i = this.c;
            if (i >= 0) {
                this.n.updateConnectionModel(this.b, i, this.k);
            } else {
                this.a.syncProgressFromCache();
            }
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.k), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    public void pause() {
        this.m = true;
    }

    public void run() throws Throwable {
        Throwable th;
        FileDownloadOutputStream fileDownloadOutputStreamCreateOutputStream;
        if (this.m) {
            return;
        }
        long jFindContentLength = FileDownloadUtils.findContentLength(this.c, this.e);
        if (jFindContentLength == -1) {
            jFindContentLength = FileDownloadUtils.findContentLengthFromContentRange(this.e);
        }
        if (jFindContentLength == 0) {
            throw new FileDownloadGiveUpRetryException(FileDownloadUtils.formatString("there isn't any content need to download on %d-%d with the content-length is 0", Integer.valueOf(this.b), Integer.valueOf(this.c)));
        }
        long j = this.i;
        if (j > 0 && jFindContentLength != j) {
            throw new FileDownloadGiveUpRetryException(FileDownloadUtils.formatString("require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem.", this.h == -1 ? FileDownloadUtils.formatString("range[%d-)", Long.valueOf(this.k)) : FileDownloadUtils.formatString("range[%d-%d)", Long.valueOf(this.k), Long.valueOf(this.h)), Long.valueOf(this.i), Long.valueOf(jFindContentLength), Integer.valueOf(this.b), Integer.valueOf(this.c)));
        }
        long j2 = this.k;
        InputStream inputStream = null;
        try {
            boolean zIsSupportSeek = CustomComponentHolder.getImpl().isSupportSeek();
            if (this.d != null && !zIsSupportSeek) {
                throw new IllegalAccessException("can't using multi-download when the output stream can't support seek");
            }
            fileDownloadOutputStreamCreateOutputStream = FileDownloadUtils.createOutputStream(this.j);
            try {
                this.l = fileDownloadOutputStreamCreateOutputStream;
                if (zIsSupportSeek) {
                    fileDownloadOutputStreamCreateOutputStream.seek(this.k);
                }
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.d(this, "start fetch(%d): range [%d, %d), seek to[%d]", Integer.valueOf(this.c), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.k));
                }
                inputStream = this.e.getInputStream();
                byte[] bArr = new byte[4096];
                if (this.m) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fileDownloadOutputStreamCreateOutputStream != null) {
                        try {
                            b();
                        } catch (Throwable th2) {
                            try {
                                fileDownloadOutputStreamCreateOutputStream.close();
                                throw th2;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw th2;
                            }
                        }
                    }
                    if (fileDownloadOutputStreamCreateOutputStream != null) {
                        try {
                            fileDownloadOutputStreamCreateOutputStream.close();
                            return;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        if (fileDownloadOutputStreamCreateOutputStream != null) {
                            try {
                                b();
                            } catch (Throwable th3) {
                                try {
                                    fileDownloadOutputStreamCreateOutputStream.close();
                                    throw th3;
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                    throw th3;
                                }
                            }
                        }
                        if (fileDownloadOutputStreamCreateOutputStream != null) {
                            try {
                                fileDownloadOutputStreamCreateOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        long j3 = this.k - j2;
                        if (jFindContentLength != -1 && jFindContentLength != j3) {
                            throw new FileDownloadGiveUpRetryException(FileDownloadUtils.formatString("fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset[%d]", Long.valueOf(j3), Long.valueOf(jFindContentLength), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.k), Long.valueOf(j2)));
                        }
                        this.a.onCompleted(this.d, this.g, this.h);
                        return;
                    }
                    fileDownloadOutputStreamCreateOutputStream.write(bArr, 0, i);
                    long j4 = j2;
                    long j5 = i;
                    this.k += j5;
                    this.a.onProgress(j5);
                    a();
                    if (this.m) {
                        try {
                            inputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        try {
                            b();
                            try {
                                return;
                            } catch (IOException e8) {
                                return;
                            }
                        } finally {
                            try {
                                fileDownloadOutputStreamCreateOutputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (this.f && FileDownloadUtils.isNetworkNotOnWifiType()) {
                        throw new FileDownloadNetworkPolicyException();
                    }
                    j2 = j4;
                }
            } catch (Throwable th4) {
                th = th4;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                if (fileDownloadOutputStreamCreateOutputStream != null) {
                    try {
                        b();
                    } catch (Throwable th5) {
                        try {
                            fileDownloadOutputStreamCreateOutputStream.close();
                            throw th5;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            throw th5;
                        }
                    }
                }
                if (fileDownloadOutputStreamCreateOutputStream == null) {
                    throw th;
                }
                try {
                    fileDownloadOutputStreamCreateOutputStream.close();
                    throw th;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            fileDownloadOutputStreamCreateOutputStream = null;
        }
    }

    private FetchDataTask(FileDownloadConnection fileDownloadConnection, ConnectionProfile connectionProfile, DownloadRunnable downloadRunnable, int i, int i2, boolean z, ProcessCallback processCallback, String str) {
        this.o = 0L;
        this.p = 0L;
        this.a = processCallback;
        this.j = str;
        this.e = fileDownloadConnection;
        this.f = z;
        this.d = downloadRunnable;
        this.c = i2;
        this.b = i;
        this.n = CustomComponentHolder.getImpl().getDatabaseInstance();
        this.g = connectionProfile.a;
        this.h = connectionProfile.c;
        this.k = connectionProfile.b;
        this.i = connectionProfile.d;
    }
}
