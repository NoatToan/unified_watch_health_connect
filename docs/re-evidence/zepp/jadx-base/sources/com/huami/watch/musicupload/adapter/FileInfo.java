package com.huami.watch.musicupload.adapter;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B'\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0012\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/watch/musicupload/adapter/FileInfo;", "", "", "toString", "encode", "other", "", "equals", "", "hashCode", "component1", "component2", "", "component3", "Lcom/huami/watch/musicupload/adapter/FileType;", "component4", "path", "name", "size", "type", "copy", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "b", "getName", "c", "J", "getSize", "()J", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/adapter/FileType;", "getType", "()Lcom/huami/watch/musicupload/adapter/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/huami/watch/musicupload/adapter/FileType;)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class FileInfo {

    @NotNull
    public static final String REMOTE_DIR = "Music/";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final FileType type;

    public FileInfo(@NotNull String str, @NotNull String str2, long j, @NotNull FileType fileType) {
        this.path = str;
        this.name = str2;
        this.size = j;
        this.type = fileType;
    }

    public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, String str, String str2, long j, FileType fileType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileInfo.path;
        }
        if ((i & 2) != 0) {
            str2 = fileInfo.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = fileInfo.size;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            fileType = fileInfo.type;
        }
        return fileInfo.copy(str, str3, j2, fileType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FileType getType() {
        return this.type;
    }

    @NotNull
    public final FileInfo copy(@NotNull String path, @NotNull String name, long size, @NotNull FileType type) {
        return new FileInfo(path, name, size, type);
    }

    @NotNull
    public final String encode() {
        return this.path + '|' + REMOTE_DIR + this.name + "|1|0";
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FileInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.watch.musicupload.adapter.FileInfo");
        FileInfo fileInfo = (FileInfo) other;
        return ((Intrinsics.areEqual(this.path, fileInfo.path) ^ true) || (Intrinsics.areEqual(this.name, fileInfo.name) ^ true) || this.size != fileInfo.size) ? false : true;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final FileType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.name.hashCode()) * 31) + b.a(this.size);
    }

    @NotNull
    public String toString() {
        return "FileInfo(path='" + this.path + "', name='" + this.name + "', size=" + this.size + ", type=" + this.type + ')';
    }
}
