package com.liulishuo.filedownloader.download;

import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.util.FileDownloadProperties;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectionProfile {
    public static final int g = -1;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    private final boolean e;
    private final boolean f;

    public static class ConnectionProfileBuild {
        public static ConnectionProfile buildBeginToEndConnectionProfile(long j) {
            return new ConnectionProfile(0L, 0L, -1L, j);
        }

        public static ConnectionProfile buildConnectionProfile(long j, long j2, long j3, long j4) {
            return new ConnectionProfile(j, j2, j3, j4);
        }

        public static ConnectionProfile buildToEndConnectionProfile(long j, long j2, long j3) {
            return new ConnectionProfile(j, j2, -1L, j3);
        }

        public static ConnectionProfile buildTrialConnectionProfile() {
            return new ConnectionProfile();
        }

        public static ConnectionProfile buildTrialConnectionProfileNoRange() {
            return new ConnectionProfile(0L, 0L, 0L, 0L, true);
        }
    }

    public void processProfile(FileDownloadConnection fileDownloadConnection) throws ProtocolException {
        if (this.e) {
            return;
        }
        if (this.f && FileDownloadProperties.getImpl().trialConnectionHeadMethod) {
            fileDownloadConnection.setRequestMethod("HEAD");
        }
        fileDownloadConnection.addHeader("Range", this.c == -1 ? FileDownloadUtils.formatString("bytes=%d-", Long.valueOf(this.b)) : FileDownloadUtils.formatString("bytes=%d-%d", Long.valueOf(this.b), Long.valueOf(this.c)));
    }

    public String toString() {
        return FileDownloadUtils.formatString("range[%d, %d) current offset[%d]", Long.valueOf(this.a), Long.valueOf(this.c), Long.valueOf(this.b));
    }

    private ConnectionProfile() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = false;
        this.f = true;
    }

    private ConnectionProfile(long j, long j2, long j3, long j4) {
        this(j, j2, j3, j4, false);
    }

    private ConnectionProfile(long j, long j2, long j3, long j4, boolean z) {
        if ((j == 0 && j3 == 0) || !z) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = z;
            this.f = false;
            return;
        }
        throw new IllegalArgumentException();
    }
}
