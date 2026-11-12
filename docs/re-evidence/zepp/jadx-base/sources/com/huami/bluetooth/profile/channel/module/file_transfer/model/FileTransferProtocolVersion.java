package com.huami.bluetooth.profile.channel.module.file_transfer.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/FileTransferProtocolVersion;", "", "", "component1", "component2", "versionCode", "chunkSize", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getVersionCode", "()I", "b", "getChunkSize", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FileTransferProtocolVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int versionCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int chunkSize;

    public FileTransferProtocolVersion(int i, int i2) {
        this.versionCode = i;
        this.chunkSize = i2;
    }

    public static /* synthetic */ FileTransferProtocolVersion copy$default(FileTransferProtocolVersion fileTransferProtocolVersion, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fileTransferProtocolVersion.versionCode;
        }
        if ((i3 & 2) != 0) {
            i2 = fileTransferProtocolVersion.chunkSize;
        }
        return fileTransferProtocolVersion.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChunkSize() {
        return this.chunkSize;
    }

    @NotNull
    public final FileTransferProtocolVersion copy(int versionCode, int chunkSize) {
        return new FileTransferProtocolVersion(versionCode, chunkSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileTransferProtocolVersion)) {
            return false;
        }
        FileTransferProtocolVersion fileTransferProtocolVersion = (FileTransferProtocolVersion) other;
        return this.versionCode == fileTransferProtocolVersion.versionCode && this.chunkSize == fileTransferProtocolVersion.chunkSize;
    }

    public final int getChunkSize() {
        return this.chunkSize;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return (this.versionCode * 31) + this.chunkSize;
    }

    @NotNull
    public String toString() {
        return "FileTransferProtocolVersion(versionCode=" + this.versionCode + ", chunkSize=" + this.chunkSize + ')';
    }
}
