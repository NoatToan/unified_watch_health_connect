package com.xiaomi.fitness.watch.face.request;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceDetailRequestV2;", "", "model", "", "id", "firmware_version", "ids", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getModel", "()Ljava/lang/String;", "getId", "getFirmware_version", "getIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDetailRequestV2 {

    @NotNull
    private final String firmware_version;

    @NotNull
    private final String id;

    @NotNull
    private final List<String> ids;

    @NotNull
    private final String model;

    public FaceDetailRequestV2(@NotNull String model, @NotNull String id, @NotNull String firmware_version, @NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(firmware_version, "firmware_version");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.model = model;
        this.id = id;
        this.firmware_version = firmware_version;
        this.ids = ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceDetailRequestV2 copy$default(FaceDetailRequestV2 faceDetailRequestV2, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceDetailRequestV2.model;
        }
        if ((i & 2) != 0) {
            str2 = faceDetailRequestV2.id;
        }
        if ((i & 4) != 0) {
            str3 = faceDetailRequestV2.firmware_version;
        }
        if ((i & 8) != 0) {
            list = faceDetailRequestV2.ids;
        }
        return faceDetailRequestV2.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @NotNull
    public final List<String> component4() {
        return this.ids;
    }

    @NotNull
    public final FaceDetailRequestV2 copy(@NotNull String model, @NotNull String id, @NotNull String firmware_version, @NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(firmware_version, "firmware_version");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new FaceDetailRequestV2(model, id, firmware_version, ids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDetailRequestV2)) {
            return false;
        }
        FaceDetailRequestV2 faceDetailRequestV2 = (FaceDetailRequestV2) other;
        return Intrinsics.areEqual(this.model, faceDetailRequestV2.model) && Intrinsics.areEqual(this.id, faceDetailRequestV2.id) && Intrinsics.areEqual(this.firmware_version, faceDetailRequestV2.firmware_version) && Intrinsics.areEqual(this.ids, faceDetailRequestV2.ids);
    }

    @NotNull
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getIds() {
        return this.ids;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (((((this.model.hashCode() * 31) + this.id.hashCode()) * 31) + this.firmware_version.hashCode()) * 31) + this.ids.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceDetailRequestV2(model=" + this.model + ", id=" + this.id + ", firmware_version=" + this.firmware_version + ", ids=" + this.ids + ")";
    }
}
