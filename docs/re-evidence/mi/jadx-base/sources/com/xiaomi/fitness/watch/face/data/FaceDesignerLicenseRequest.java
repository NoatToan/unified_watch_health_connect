package com.xiaomi.fitness.watch.face.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseRequest;", "", "wf_hash", "", "wf_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWf_hash", "()Ljava/lang/String;", "getWf_id", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDesignerLicenseRequest {

    @NotNull
    private final String wf_hash;

    @NotNull
    private final String wf_id;

    public FaceDesignerLicenseRequest(@NotNull String wf_hash, @NotNull String wf_id) {
        Intrinsics.checkNotNullParameter(wf_hash, "wf_hash");
        Intrinsics.checkNotNullParameter(wf_id, "wf_id");
        this.wf_hash = wf_hash;
        this.wf_id = wf_id;
    }

    public static /* synthetic */ FaceDesignerLicenseRequest copy$default(FaceDesignerLicenseRequest faceDesignerLicenseRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceDesignerLicenseRequest.wf_hash;
        }
        if ((i & 2) != 0) {
            str2 = faceDesignerLicenseRequest.wf_id;
        }
        return faceDesignerLicenseRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWf_hash() {
        return this.wf_hash;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWf_id() {
        return this.wf_id;
    }

    @NotNull
    public final FaceDesignerLicenseRequest copy(@NotNull String wf_hash, @NotNull String wf_id) {
        Intrinsics.checkNotNullParameter(wf_hash, "wf_hash");
        Intrinsics.checkNotNullParameter(wf_id, "wf_id");
        return new FaceDesignerLicenseRequest(wf_hash, wf_id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDesignerLicenseRequest)) {
            return false;
        }
        FaceDesignerLicenseRequest faceDesignerLicenseRequest = (FaceDesignerLicenseRequest) other;
        return Intrinsics.areEqual(this.wf_hash, faceDesignerLicenseRequest.wf_hash) && Intrinsics.areEqual(this.wf_id, faceDesignerLicenseRequest.wf_id);
    }

    @NotNull
    public final String getWf_hash() {
        return this.wf_hash;
    }

    @NotNull
    public final String getWf_id() {
        return this.wf_id;
    }

    public int hashCode() {
        return (this.wf_hash.hashCode() * 31) + this.wf_id.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceDesignerLicenseRequest(wf_hash=" + this.wf_hash + ", wf_id=" + this.wf_id + ")";
    }
}
