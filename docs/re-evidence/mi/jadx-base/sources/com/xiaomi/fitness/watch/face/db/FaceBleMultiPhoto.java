package com.xiaomi.fitness.watch.face.db;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J^\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u001aHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "", "multiPath", "", "multiMd5", "oriPath", "oriMd5", "fg", "Lcom/xiaomi/fitness/watch/face/db/FaceImageForeground;", "duration", "", "thumbnailPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/db/FaceImageForeground;Ljava/lang/Long;Ljava/lang/String;)V", "getMultiPath", "()Ljava/lang/String;", "getMultiMd5", "getOriPath", "getOriMd5", "getFg", "()Lcom/xiaomi/fitness/watch/face/db/FaceImageForeground;", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getThumbnailPath", "type", "", "getType", "()I", "setType", "(I)V", "isChanged", "", "isAdd", "isUpdate", "isDelete", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/db/FaceImageForeground;Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/fitness/watch/face/db/FaceBleMultiPhoto;", "equals", "other", "hashCode", "toString", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceBleMultiPhoto {
    public static final int TYPE_ADD = 11;
    public static final int TYPE_DELETE = 22;
    public static final int TYPE_EXIST = 33;
    public static final int TYPE_UPDATE = 44;

    @Nullable
    private final Long duration;

    @Nullable
    private final FaceImageForeground fg;

    @NotNull
    private final String multiMd5;

    @NotNull
    private final String multiPath;

    @Nullable
    private final String oriMd5;

    @Nullable
    private final String oriPath;

    @Nullable
    private final String thumbnailPath;
    private int type;

    public FaceBleMultiPhoto(@NotNull String multiPath, @NotNull String multiMd5, @Nullable String str, @Nullable String str2, @Nullable FaceImageForeground faceImageForeground, @Nullable Long l, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(multiPath, "multiPath");
        Intrinsics.checkNotNullParameter(multiMd5, "multiMd5");
        this.multiPath = multiPath;
        this.multiMd5 = multiMd5;
        this.oriPath = str;
        this.oriMd5 = str2;
        this.fg = faceImageForeground;
        this.duration = l;
        this.thumbnailPath = str3;
        this.type = 33;
    }

    public static /* synthetic */ FaceBleMultiPhoto copy$default(FaceBleMultiPhoto faceBleMultiPhoto, String str, String str2, String str3, String str4, FaceImageForeground faceImageForeground, Long l, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceBleMultiPhoto.multiPath;
        }
        if ((i & 2) != 0) {
            str2 = faceBleMultiPhoto.multiMd5;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = faceBleMultiPhoto.oriPath;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = faceBleMultiPhoto.oriMd5;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            faceImageForeground = faceBleMultiPhoto.fg;
        }
        FaceImageForeground faceImageForeground2 = faceImageForeground;
        if ((i & 32) != 0) {
            l = faceBleMultiPhoto.duration;
        }
        Long l2 = l;
        if ((i & 64) != 0) {
            str5 = faceBleMultiPhoto.thumbnailPath;
        }
        return faceBleMultiPhoto.copy(str, str6, str7, str8, faceImageForeground2, l2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMultiPath() {
        return this.multiPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMultiMd5() {
        return this.multiMd5;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOriPath() {
        return this.oriPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriMd5() {
        return this.oriMd5;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FaceImageForeground getFg() {
        return this.fg;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    @NotNull
    public final FaceBleMultiPhoto copy(@NotNull String multiPath, @NotNull String multiMd5, @Nullable String oriPath, @Nullable String oriMd5, @Nullable FaceImageForeground fg, @Nullable Long duration, @Nullable String thumbnailPath) {
        Intrinsics.checkNotNullParameter(multiPath, "multiPath");
        Intrinsics.checkNotNullParameter(multiMd5, "multiMd5");
        return new FaceBleMultiPhoto(multiPath, multiMd5, oriPath, oriMd5, fg, duration, thumbnailPath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceBleMultiPhoto)) {
            return false;
        }
        FaceBleMultiPhoto faceBleMultiPhoto = (FaceBleMultiPhoto) other;
        return Intrinsics.areEqual(this.multiPath, faceBleMultiPhoto.multiPath) && Intrinsics.areEqual(this.multiMd5, faceBleMultiPhoto.multiMd5) && Intrinsics.areEqual(this.oriPath, faceBleMultiPhoto.oriPath) && Intrinsics.areEqual(this.oriMd5, faceBleMultiPhoto.oriMd5) && Intrinsics.areEqual(this.fg, faceBleMultiPhoto.fg) && Intrinsics.areEqual(this.duration, faceBleMultiPhoto.duration) && Intrinsics.areEqual(this.thumbnailPath, faceBleMultiPhoto.thumbnailPath);
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final FaceImageForeground getFg() {
        return this.fg;
    }

    @NotNull
    public final String getMultiMd5() {
        return this.multiMd5;
    }

    @NotNull
    public final String getMultiPath() {
        return this.multiPath;
    }

    @Nullable
    public final String getOriMd5() {
        return this.oriMd5;
    }

    @Nullable
    public final String getOriPath() {
        return this.oriPath;
    }

    @Nullable
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.multiPath.hashCode() * 31) + this.multiMd5.hashCode()) * 31;
        String str = this.oriPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oriMd5;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FaceImageForeground faceImageForeground = this.fg;
        int iHashCode4 = (iHashCode3 + (faceImageForeground == null ? 0 : faceImageForeground.hashCode())) * 31;
        Long l = this.duration;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.thumbnailPath;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isAdd() {
        return this.type == 11;
    }

    public final boolean isChanged() {
        int i = this.type;
        return (i == 0 || i == 33) ? false : true;
    }

    public final boolean isDelete() {
        return this.type == 22;
    }

    public final boolean isUpdate() {
        return this.type == 44;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "FaceBleMultiPhoto(multiPath=" + this.multiPath + ", multiMd5=" + this.multiMd5 + ", oriPath=" + this.oriPath + ", oriMd5=" + this.oriMd5 + ", fg=" + this.fg + ", duration=" + this.duration + ", thumbnailPath=" + this.thumbnailPath + ")";
    }

    public /* synthetic */ FaceBleMultiPhoto(String str, String str2, String str3, String str4, FaceImageForeground faceImageForeground, Long l, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : faceImageForeground, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str5);
    }
}
