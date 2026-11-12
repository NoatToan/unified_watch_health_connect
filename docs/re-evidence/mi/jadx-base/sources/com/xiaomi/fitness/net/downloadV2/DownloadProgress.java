package com.xiaomi.fitness.net.downloadV2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadProgress;", "", "totalLength", "", "downloadedLength", "curFileCount", "", "totalFileCount", "<init>", "(JJII)V", "getTotalLength", "()J", "getDownloadedLength", "getCurFileCount", "()I", "getTotalFileCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DownloadProgress {
    private final int curFileCount;
    private final long downloadedLength;
    private final int totalFileCount;
    private final long totalLength;

    public DownloadProgress() {
        this(0L, 0L, 0, 0, 15, null);
    }

    public static /* synthetic */ DownloadProgress copy$default(DownloadProgress downloadProgress, long j, long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = downloadProgress.totalLength;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = downloadProgress.downloadedLength;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            i = downloadProgress.curFileCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = downloadProgress.totalFileCount;
        }
        return downloadProgress.copy(j3, j4, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalLength() {
        return this.totalLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDownloadedLength() {
        return this.downloadedLength;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurFileCount() {
        return this.curFileCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalFileCount() {
        return this.totalFileCount;
    }

    @NotNull
    public final DownloadProgress copy(long totalLength, long downloadedLength, int curFileCount, int totalFileCount) {
        return new DownloadProgress(totalLength, downloadedLength, curFileCount, totalFileCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadProgress)) {
            return false;
        }
        DownloadProgress downloadProgress = (DownloadProgress) other;
        return this.totalLength == downloadProgress.totalLength && this.downloadedLength == downloadProgress.downloadedLength && this.curFileCount == downloadProgress.curFileCount && this.totalFileCount == downloadProgress.totalFileCount;
    }

    public final int getCurFileCount() {
        return this.curFileCount;
    }

    public final long getDownloadedLength() {
        return this.downloadedLength;
    }

    public final int getTotalFileCount() {
        return this.totalFileCount;
    }

    public final long getTotalLength() {
        return this.totalLength;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.totalLength) * 31) + Long.hashCode(this.downloadedLength)) * 31) + Integer.hashCode(this.curFileCount)) * 31) + Integer.hashCode(this.totalFileCount);
    }

    @NotNull
    public String toString() {
        return "DownloadProgress(totalLength=" + this.totalLength + ", downloadedLength=" + this.downloadedLength + ", curFileCount=" + this.curFileCount + ", totalFileCount=" + this.totalFileCount + ")";
    }

    public DownloadProgress(long j, long j2, int i, int i2) {
        this.totalLength = j;
        this.downloadedLength = j2;
        this.curFileCount = i;
        this.totalFileCount = i2;
    }

    public /* synthetic */ DownloadProgress(long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) == 0 ? j2 : -1L, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2);
    }
}
