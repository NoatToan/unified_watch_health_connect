package com.xiaomi.fitness.watch.face.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRequest;", "", "model", "", "firmware_version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "getFirmware_version", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceEntranceRequest {

    @NotNull
    private final String firmware_version;

    @NotNull
    private final String model;

    public FaceEntranceRequest(@NotNull String model, @NotNull String firmware_version) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmware_version, "firmware_version");
        this.model = model;
        this.firmware_version = firmware_version;
    }

    public static /* synthetic */ FaceEntranceRequest copy$default(FaceEntranceRequest faceEntranceRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceEntranceRequest.model;
        }
        if ((i & 2) != 0) {
            str2 = faceEntranceRequest.firmware_version;
        }
        return faceEntranceRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @NotNull
    public final FaceEntranceRequest copy(@NotNull String model, @NotNull String firmware_version) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmware_version, "firmware_version");
        return new FaceEntranceRequest(model, firmware_version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceEntranceRequest)) {
            return false;
        }
        FaceEntranceRequest faceEntranceRequest = (FaceEntranceRequest) other;
        return Intrinsics.areEqual(this.model, faceEntranceRequest.model) && Intrinsics.areEqual(this.firmware_version, faceEntranceRequest.firmware_version);
    }

    @NotNull
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.firmware_version.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceEntranceRequest(model=" + this.model + ", firmware_version=" + this.firmware_version + ")";
    }
}
