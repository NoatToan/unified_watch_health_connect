package com.xiaomi.fitness.watch.face.request;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceDownloadRequestV2;", "", "did", "", "model", "id", "is_trial", "", "album_child_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getModel", "getId", "()Z", "getAlbum_child_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDownloadRequestV2 {

    @Nullable
    private final String album_child_id;

    @NotNull
    private final String did;

    @NotNull
    private final String id;
    private final boolean is_trial;

    @NotNull
    private final String model;

    public FaceDownloadRequestV2(@NotNull String did, @NotNull String model, @NotNull String id, boolean z, @Nullable String str) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        this.did = did;
        this.model = model;
        this.id = id;
        this.is_trial = z;
        this.album_child_id = str;
    }

    public static /* synthetic */ FaceDownloadRequestV2 copy$default(FaceDownloadRequestV2 faceDownloadRequestV2, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceDownloadRequestV2.did;
        }
        if ((i & 2) != 0) {
            str2 = faceDownloadRequestV2.model;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = faceDownloadRequestV2.id;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = faceDownloadRequestV2.is_trial;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = faceDownloadRequestV2.album_child_id;
        }
        return faceDownloadRequestV2.copy(str, str5, str6, z2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_trial() {
        return this.is_trial;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlbum_child_id() {
        return this.album_child_id;
    }

    @NotNull
    public final FaceDownloadRequestV2 copy(@NotNull String did, @NotNull String model, @NotNull String id, boolean is_trial, @Nullable String album_child_id) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        return new FaceDownloadRequestV2(did, model, id, is_trial, album_child_id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDownloadRequestV2)) {
            return false;
        }
        FaceDownloadRequestV2 faceDownloadRequestV2 = (FaceDownloadRequestV2) other;
        return Intrinsics.areEqual(this.did, faceDownloadRequestV2.did) && Intrinsics.areEqual(this.model, faceDownloadRequestV2.model) && Intrinsics.areEqual(this.id, faceDownloadRequestV2.id) && this.is_trial == faceDownloadRequestV2.is_trial && Intrinsics.areEqual(this.album_child_id, faceDownloadRequestV2.album_child_id);
    }

    @Nullable
    public final String getAlbum_child_id() {
        return this.album_child_id;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        int iHashCode = ((((((this.did.hashCode() * 31) + this.model.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.is_trial)) * 31;
        String str = this.album_child_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean is_trial() {
        return this.is_trial;
    }

    @NotNull
    public String toString() {
        return "FaceDownloadRequestV2(did=" + this.did + ", model=" + this.model + ", id=" + this.id + ", is_trial=" + this.is_trial + ", album_child_id=" + this.album_child_id + ")";
    }

    public /* synthetic */ FaceDownloadRequestV2(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4);
    }
}
