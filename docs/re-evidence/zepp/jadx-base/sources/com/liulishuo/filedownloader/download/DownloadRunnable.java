package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.database.FileDownloadDatabase;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadRunnable implements Runnable {
    private final ConnectTask a;
    private final ProcessCallback b;
    private final String c;
    private final boolean d;
    private FetchDataTask e;
    private volatile boolean f;
    private final int g;
    public final int h;

    public static class Builder {
        private final ConnectTask.b a = new ConnectTask.b();
        private ProcessCallback b;
        private String c;
        private Boolean d;
        private Integer e;

        public DownloadRunnable a(ConnectTask connectTask) {
            return new DownloadRunnable(connectTask.a, 0, connectTask, this.b, false, "");
        }

        public DownloadRunnable build() {
            if (this.b == null || this.c == null || this.d == null || this.e == null) {
                throw new IllegalArgumentException(FileDownloadUtils.formatString("%s %s %B", this.b, this.c, this.d));
            }
            ConnectTask connectTaskA = this.a.a();
            return new DownloadRunnable(connectTaskA.a, this.e.intValue(), connectTaskA, this.b, this.d.booleanValue(), this.c);
        }

        public Builder setCallback(ProcessCallback processCallback) {
            this.b = processCallback;
            return this;
        }

        public Builder setConnectionIndex(Integer num) {
            this.e = num;
            return this;
        }

        public Builder setConnectionModel(ConnectionProfile connectionProfile) {
            this.a.b(connectionProfile);
            return this;
        }

        public Builder setEtag(String str) {
            this.a.d(str);
            return this;
        }

        public Builder setHeader(FileDownloadHeader fileDownloadHeader) {
            this.a.e(fileDownloadHeader);
            return this;
        }

        public Builder setId(int i) {
            this.a.c(i);
            return this;
        }

        public Builder setPath(String str) {
            this.c = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.a.f(str);
            return this;
        }

        public Builder setWifiRequired(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private long a() {
        FileDownloadDatabase databaseInstance = CustomComponentHolder.getImpl().getDatabaseInstance();
        if (this.h < 0) {
            FileDownloadModel fileDownloadModelFind = databaseInstance.find(this.g);
            if (fileDownloadModelFind != null) {
                return fileDownloadModelFind.getSoFar();
            }
            return 0L;
        }
        for (ConnectionModel connectionModel : databaseInstance.findConnectionModel(this.g)) {
            if (connectionModel.getIndex() == this.h) {
                return connectionModel.getCurrentOffset();
            }
        }
        return 0L;
    }

    public void discard() {
        pause();
    }

    public void pause() {
        this.f = true;
        FetchDataTask fetchDataTask = this.e;
        if (fetchDataTask != null) {
            fetchDataTask.pause();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        Exception e;
        Process.setThreadPriority(10);
        long j = this.a.getProfile().b;
        FileDownloadConnection fileDownloadConnectionC = null;
        boolean z2 = false;
        while (!this.f) {
            try {
                try {
                    fileDownloadConnectionC = this.a.c();
                    int responseCode = fileDownloadConnectionC.getResponseCode();
                    if (FileDownloadLog.NEED_LOG) {
                        FileDownloadLog.d(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.h), Integer.valueOf(this.g), this.a.getProfile(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(FileDownloadUtils.formatString("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.a.getRequestHeader(), fileDownloadConnectionC.getResponseHeaderFields(), Integer.valueOf(responseCode), Integer.valueOf(this.g), Integer.valueOf(this.h)));
                    }
                    try {
                        FetchDataTask.Builder builder = new FetchDataTask.Builder();
                        if (this.f) {
                            fileDownloadConnectionC.ending();
                            return;
                        }
                        FetchDataTask fetchDataTaskBuild = builder.setDownloadId(this.g).setConnectionIndex(this.h).setCallback(this.b).setHost(this).setWifiRequired(this.d).setConnection(fileDownloadConnectionC).setConnectionProfile(this.a.getProfile()).setPath(this.c).build();
                        this.e = fetchDataTaskBuild;
                        fetchDataTaskBuild.run();
                        if (this.f) {
                            this.e.pause();
                        }
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e2) {
                        e = e2;
                        z = true;
                        try {
                            if (!this.b.isRetry(e)) {
                                this.b.onError(e);
                                if (fileDownloadConnectionC == null) {
                                    return;
                                }
                            } else if (z && this.e == null) {
                                FileDownloadLog.w(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e);
                                this.b.onError(e);
                                if (fileDownloadConnectionC == null) {
                                    return;
                                }
                            } else {
                                if (this.e != null) {
                                    long jA = a();
                                    if (jA > 0) {
                                        this.a.g(jA);
                                    }
                                }
                                this.b.onRetry(e);
                                if (fileDownloadConnectionC != null) {
                                    fileDownloadConnectionC.ending();
                                }
                                z2 = z;
                            }
                        } catch (Throwable th) {
                            if (fileDownloadConnectionC != null) {
                                fileDownloadConnectionC.ending();
                            }
                            throw th;
                        }
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e3) {
                    e = e3;
                    z = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e4) {
                z = z2;
                e = e4;
            }
            fileDownloadConnectionC.ending();
            return;
        }
        if (fileDownloadConnectionC != null) {
            fileDownloadConnectionC.ending();
        }
    }

    private DownloadRunnable(int i, int i2, ConnectTask connectTask, ProcessCallback processCallback, boolean z, String str) {
        this.g = i;
        this.h = i2;
        this.f = false;
        this.b = processCallback;
        this.c = str;
        this.a = connectTask;
        this.d = z;
    }
}
