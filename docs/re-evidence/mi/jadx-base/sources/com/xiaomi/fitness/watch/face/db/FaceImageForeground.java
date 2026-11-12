package com.xiaomi.fitness.watch.face.db;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceImageForeground;", "", "md5", "", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMd5", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceImageForeground {

    @NotNull
    private final String md5;

    @NotNull
    private final String path;

    public FaceImageForeground(@NotNull String md5, @NotNull String path) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(path, "path");
        this.md5 = md5;
        this.path = path;
    }

    public static /* synthetic */ FaceImageForeground copy$default(FaceImageForeground faceImageForeground, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceImageForeground.md5;
        }
        if ((i & 2) != 0) {
            str2 = faceImageForeground.path;
        }
        return faceImageForeground.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final FaceImageForeground copy(@NotNull String md5, @NotNull String path) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(path, "path");
        return new FaceImageForeground(md5, path);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceImageForeground)) {
            return false;
        }
        FaceImageForeground faceImageForeground = (FaceImageForeground) other;
        return Intrinsics.areEqual(this.md5, faceImageForeground.md5) && Intrinsics.areEqual(this.path, faceImageForeground.path);
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.md5.hashCode() * 31) + this.path.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceImageForeground(md5=" + this.md5 + ", path=" + this.path + ")";
    }
}
