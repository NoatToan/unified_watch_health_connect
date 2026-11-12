package com.xiaomi.fitness.watch.face.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceTabAllRequest;", "", "model", "", "firmware_version", "limit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getModel", "()Ljava/lang/String;", "getFirmware_version", "getLimit", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceTabAllRequest {

    @Nullable
    private final String firmware_version;
    private final int limit;

    @NotNull
    private final String model;

    public FaceTabAllRequest(@NotNull String model, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
        this.firmware_version = str;
        this.limit = i;
    }

    public static /* synthetic */ FaceTabAllRequest copy$default(FaceTabAllRequest faceTabAllRequest, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = faceTabAllRequest.model;
        }
        if ((i2 & 2) != 0) {
            str2 = faceTabAllRequest.firmware_version;
        }
        if ((i2 & 4) != 0) {
            i = faceTabAllRequest.limit;
        }
        return faceTabAllRequest.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final FaceTabAllRequest copy(@NotNull String model, @Nullable String firmware_version, int limit) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new FaceTabAllRequest(model, firmware_version, limit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceTabAllRequest)) {
            return false;
        }
        FaceTabAllRequest faceTabAllRequest = (FaceTabAllRequest) other;
        return Intrinsics.areEqual(this.model, faceTabAllRequest.model) && Intrinsics.areEqual(this.firmware_version, faceTabAllRequest.firmware_version) && this.limit == faceTabAllRequest.limit;
    }

    @Nullable
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        int iHashCode = this.model.hashCode() * 31;
        String str = this.firmware_version;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.limit);
    }

    @NotNull
    public String toString() {
        return "FaceTabAllRequest(model=" + this.model + ", firmware_version=" + this.firmware_version + ", limit=" + this.limit + ")";
    }
}
