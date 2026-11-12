package com.huami.bloodoxygen.core.remote.api.fileaccess;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileInfoEntity;", "", "", "component1", "component2", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/OsaData;", "component3", "fileName", "fileType", "osaData", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "getFileType", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/OsaData;", "getOsaData", "()Lcom/huami/bloodoxygen/core/remote/api/fileaccess/OsaData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/bloodoxygen/core/remote/api/fileaccess/OsaData;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FileInfoEntity {

    @NotNull
    private final String fileName;

    @NotNull
    private final String fileType;

    @NotNull
    private final OsaData osaData;

    public FileInfoEntity(@NotNull String str, @NotNull String str2, @NotNull OsaData osaData) {
        this.fileName = str;
        this.fileType = str2;
        this.osaData = osaData;
    }

    public static /* synthetic */ FileInfoEntity copy$default(FileInfoEntity fileInfoEntity, String str, String str2, OsaData osaData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileInfoEntity.fileName;
        }
        if ((i & 2) != 0) {
            str2 = fileInfoEntity.fileType;
        }
        if ((i & 4) != 0) {
            osaData = fileInfoEntity.osaData;
        }
        return fileInfoEntity.copy(str, str2, osaData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OsaData getOsaData() {
        return this.osaData;
    }

    @NotNull
    public final FileInfoEntity copy(@NotNull String fileName, @NotNull String fileType, @NotNull OsaData osaData) {
        return new FileInfoEntity(fileName, fileType, osaData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileInfoEntity)) {
            return false;
        }
        FileInfoEntity fileInfoEntity = (FileInfoEntity) other;
        return Intrinsics.areEqual(this.fileName, fileInfoEntity.fileName) && Intrinsics.areEqual(this.fileType, fileInfoEntity.fileType) && Intrinsics.areEqual(this.osaData, fileInfoEntity.osaData);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final OsaData getOsaData() {
        return this.osaData;
    }

    public int hashCode() {
        return (((this.fileName.hashCode() * 31) + this.fileType.hashCode()) * 31) + this.osaData.hashCode();
    }

    @NotNull
    public String toString() {
        return "FileInfoEntity(fileName=" + this.fileName + ", fileType=" + this.fileType + ", osaData=" + this.osaData + ")";
    }
}
