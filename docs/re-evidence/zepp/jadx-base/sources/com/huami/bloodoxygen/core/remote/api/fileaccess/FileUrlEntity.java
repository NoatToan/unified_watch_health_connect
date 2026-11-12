package com.huami.bloodoxygen.core.remote.api.fileaccess;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.db.entity.EcgData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/FileUrlEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "fileName", "fileType", "getURI", "objectName", "putURI", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "getFileType", "getGetURI", "getObjectName", "getPutURI", LogUtil.I, "getUpdateTime", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FileUrlEntity {

    @NotNull
    private final String fileName;

    @NotNull
    private final String fileType;

    @NotNull
    private final String getURI;

    @NotNull
    private final String objectName;

    @NotNull
    private final String putURI;
    private final int updateTime;

    public FileUrlEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        this.fileName = str;
        this.fileType = str2;
        this.getURI = str3;
        this.objectName = str4;
        this.putURI = str5;
        this.updateTime = i;
    }

    public static /* synthetic */ FileUrlEntity copy$default(FileUrlEntity fileUrlEntity, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fileUrlEntity.fileName;
        }
        if ((i2 & 2) != 0) {
            str2 = fileUrlEntity.fileType;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = fileUrlEntity.getURI;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = fileUrlEntity.objectName;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = fileUrlEntity.putURI;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = fileUrlEntity.updateTime;
        }
        return fileUrlEntity.copy(str, str6, str7, str8, str9, i);
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
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPutURI() {
        return this.putURI;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final FileUrlEntity copy(@NotNull String fileName, @NotNull String fileType, @NotNull String getURI, @NotNull String objectName, @NotNull String putURI, int updateTime) {
        return new FileUrlEntity(fileName, fileType, getURI, objectName, putURI, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUrlEntity)) {
            return false;
        }
        FileUrlEntity fileUrlEntity = (FileUrlEntity) other;
        return Intrinsics.areEqual(this.fileName, fileUrlEntity.fileName) && Intrinsics.areEqual(this.fileType, fileUrlEntity.fileType) && Intrinsics.areEqual(this.getURI, fileUrlEntity.getURI) && Intrinsics.areEqual(this.objectName, fileUrlEntity.objectName) && Intrinsics.areEqual(this.putURI, fileUrlEntity.putURI) && this.updateTime == fileUrlEntity.updateTime;
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
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    public final String getPutURI() {
        return this.putURI;
    }

    public final int getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((this.fileName.hashCode() * 31) + this.fileType.hashCode()) * 31) + this.getURI.hashCode()) * 31) + this.objectName.hashCode()) * 31) + this.putURI.hashCode()) * 31) + this.updateTime;
    }

    @NotNull
    public String toString() {
        return "FileUrlEntity(fileName=" + this.fileName + ", fileType=" + this.fileType + ", getURI=" + this.getURI + ", objectName=" + this.objectName + ", putURI=" + this.putURI + ", updateTime=" + this.updateTime + ")";
    }
}
