package com.huami.device.core.agps.comm;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/device/core/agps/comm/FileDto;", "", "", "component1", "", "component2", "Ljava/io/File;", "component3", "value", "fileName", "file", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getValue", "()I", "b", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "c", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "<init>", "(ILjava/lang/String;Ljava/io/File;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fileName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final File file;

    public FileDto(int i, @NotNull String str, @Nullable File file) {
        this.value = i;
        this.fileName = str;
        this.file = file;
    }

    public static /* synthetic */ FileDto copy$default(FileDto fileDto, int i, String str, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fileDto.value;
        }
        if ((i2 & 2) != 0) {
            str = fileDto.fileName;
        }
        if ((i2 & 4) != 0) {
            file = fileDto.file;
        }
        return fileDto.copy(i, str, file);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final FileDto copy(int value, @NotNull String fileName, @Nullable File file) {
        return new FileDto(value, fileName, file);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDto)) {
            return false;
        }
        FileDto fileDto = (FileDto) other;
        return this.value == fileDto.value && Intrinsics.areEqual(this.fileName, fileDto.fileName) && Intrinsics.areEqual(this.file, fileDto.file);
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.value * 31;
        String str = this.fileName;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        File file = this.file;
        return iHashCode + (file != null ? file.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FileDto(value=" + this.value + ", fileName=" + this.fileName + ", file=" + this.file + ")";
    }

    public /* synthetic */ FileDto(int i, String str, File file, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : file);
    }
}
