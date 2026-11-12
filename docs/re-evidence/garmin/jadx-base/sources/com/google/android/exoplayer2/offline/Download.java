package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    final DownloadProgress progress;
    public final DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(DownloadRequest downloadRequest, int i14, long j8, long j14, long j15, int i15, int i16, DownloadProgress downloadProgress) {
        Assertions.checkNotNull(downloadProgress);
        boolean z14 = false;
        Assertions.checkArgument((i16 == 0) == (i14 != 4));
        if (i15 != 0) {
            if (i14 != 2 && i14 != 0) {
                z14 = true;
            }
            Assertions.checkArgument(z14);
        }
        this.request = downloadRequest;
        this.state = i14;
        this.startTimeMs = j8;
        this.updateTimeMs = j14;
        this.contentLength = j15;
        this.stopReason = i15;
        this.failureReason = i16;
        this.progress = downloadProgress;
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }

    public boolean isTerminalState() {
        int i14 = this.state;
        return i14 == 3 || i14 == 4;
    }

    public Download(DownloadRequest downloadRequest, int i14, long j8, long j14, long j15, int i15, int i16) {
        this(downloadRequest, i14, j8, j14, j15, i15, i16, new DownloadProgress());
    }
}
