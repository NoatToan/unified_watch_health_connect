package com.xiaomi.fitness.net.download;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloadProgress;", "", "downloadedSize", "", "totalSize", HTTP.CHUNK_CODING, "", "<init>", "(JJZ)V", "(JZ)V", "getDownloadedSize", "()J", "setDownloadedSize", "(J)V", "getTotalSize", "setTotalSize", "isChunked", "()Z", "setChunked", "(Z)V", "increaseSize", MediaStoreUtil.MediaInfo.SIZE, "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadProgress {
    private long downloadedSize;
    private boolean isChunked;
    private long totalSize;

    @JvmOverloads
    public DownloadProgress(long j, long j2) {
        this(j, j2, false, 4, null);
    }

    public final long getDownloadedSize() {
        return this.downloadedSize;
    }

    public final long getTotalSize() {
        return this.totalSize;
    }

    @NotNull
    public final DownloadProgress increaseSize(long size) {
        this.downloadedSize += size;
        return this;
    }

    /* JADX INFO: renamed from: isChunked, reason: from getter */
    public final boolean getIsChunked() {
        return this.isChunked;
    }

    public final void setChunked(boolean z) {
        this.isChunked = z;
    }

    public final void setDownloadedSize(long j) {
        this.downloadedSize = j;
    }

    public final void setTotalSize(long j) {
        this.totalSize = j;
    }

    @JvmOverloads
    public DownloadProgress(long j, long j2, boolean z) {
        this.downloadedSize = j;
        this.totalSize = j2;
        this.isChunked = z;
    }

    public /* synthetic */ DownloadProgress(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? false : z);
    }

    public DownloadProgress(long j, boolean z) {
        this(0L, j, z);
    }
}
