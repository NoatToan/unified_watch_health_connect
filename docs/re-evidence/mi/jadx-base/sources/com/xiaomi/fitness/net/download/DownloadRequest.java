package com.xiaomi.fitness.net.download;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/net/download/DownloadRequest;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "fileName", "getFileName", "setFileName", "filePath", "getFilePath", "setFilePath", "mSaveFile", "Ljava/io/File;", "mShadowFile", "mTmpFile", "tag", "file", "getFile", "()Ljava/io/File;", "shadow", "getShadow", "tmp", "getTmp", "dir", "getDir", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DownloadRequest {

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;

    @Nullable
    private File mSaveFile;

    @Nullable
    private File mShadowFile;

    @Nullable
    private File mTmpFile;

    @Nullable
    private String url;

    @NotNull
    public final File getDir() {
        return new File(this.filePath);
    }

    @NotNull
    public final File getFile() {
        if (this.mSaveFile == null) {
            this.mSaveFile = new File(this.filePath, this.fileName);
        }
        File file = this.mSaveFile;
        Intrinsics.checkNotNull(file);
        return file;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final File getShadow() {
        if (this.mShadowFile == null) {
            this.mShadowFile = new File(this.filePath, this.fileName + ".download");
        }
        File file = this.mShadowFile;
        Intrinsics.checkNotNull(file);
        return file;
    }

    @NotNull
    public final File getTmp() {
        if (this.mTmpFile == null) {
            this.mTmpFile = new File(this.filePath, this.fileName + ".tmp");
        }
        File file = this.mTmpFile;
        Intrinsics.checkNotNull(file);
        return file;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Nullable
    public final String tag() {
        return this.url;
    }
}
