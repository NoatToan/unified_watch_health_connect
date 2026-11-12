package com.huami.watch.musicupload.adapter;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J)\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006!"}, d2 = {"Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "", "", "toString", "", "component1", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "component2", "component3", "type", "fileInfo", "progress", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "setType", "(I)V", "b", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "getFileInfo", "()Lcom/huami/watch/musicupload/adapter/FileInfo;", "c", "getProgress", "setProgress", "<init>", "(ILcom/huami/watch/musicupload/adapter/FileInfo;I)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class UploadItemInfo {
    public static final int TYPE_UPLOADING = 0;
    public static final int TYPE_UPLOADING_TITLE = 2;
    public static final int TYPE_UPLOAD_FAILED = 1;
    public static final int TYPE_UPLOAD_FAILED_TITLE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final FileInfo fileInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int progress;

    public UploadItemInfo(int i, @Nullable FileInfo fileInfo, int i2) {
        this.type = i;
        this.fileInfo = fileInfo;
        this.progress = i2;
    }

    public static /* synthetic */ UploadItemInfo copy$default(UploadItemInfo uploadItemInfo, int i, FileInfo fileInfo, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = uploadItemInfo.type;
        }
        if ((i3 & 2) != 0) {
            fileInfo = uploadItemInfo.fileInfo;
        }
        if ((i3 & 4) != 0) {
            i2 = uploadItemInfo.progress;
        }
        return uploadItemInfo.copy(i, fileInfo, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FileInfo getFileInfo() {
        return this.fileInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final UploadItemInfo copy(int type, @Nullable FileInfo fileInfo, int progress) {
        return new UploadItemInfo(type, fileInfo, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadItemInfo)) {
            return false;
        }
        UploadItemInfo uploadItemInfo = (UploadItemInfo) other;
        return this.type == uploadItemInfo.type && Intrinsics.areEqual(this.fileInfo, uploadItemInfo.fileInfo) && this.progress == uploadItemInfo.progress;
    }

    @Nullable
    public final FileInfo getFileInfo() {
        return this.fileInfo;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.type * 31;
        FileInfo fileInfo = this.fileInfo;
        return ((i + (fileInfo != null ? fileInfo.hashCode() : 0)) * 31) + this.progress;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "UploadItemInfo(type=" + this.type + ", fileInfo=" + this.fileInfo + ", progress=" + this.progress + ')';
    }
}
