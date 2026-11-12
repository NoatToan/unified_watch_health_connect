package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceOperationListRequest;", "", "operation_type", "", "operation_id", "", "key_word", "model", "firmware_version", "page", MediaStoreUtil.MediaInfo.SIZE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getOperation_type", "()I", "getOperation_id", "()Ljava/lang/String;", "getKey_word", "getModel", "getFirmware_version", "getPage", "getSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceOperationListRequest {

    @Nullable
    private final String firmware_version;

    @Nullable
    private final String key_word;

    @NotNull
    private final String model;

    @NotNull
    private final String operation_id;
    private final int operation_type;
    private final int page;
    private final int size;

    public FaceOperationListRequest(int i, @NotNull String operation_id, @Nullable String str, @NotNull String model, @Nullable String str2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(operation_id, "operation_id");
        Intrinsics.checkNotNullParameter(model, "model");
        this.operation_type = i;
        this.operation_id = operation_id;
        this.key_word = str;
        this.model = model;
        this.firmware_version = str2;
        this.page = i2;
        this.size = i3;
    }

    public static /* synthetic */ FaceOperationListRequest copy$default(FaceOperationListRequest faceOperationListRequest, int i, String str, String str2, String str3, String str4, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = faceOperationListRequest.operation_type;
        }
        if ((i4 & 2) != 0) {
            str = faceOperationListRequest.operation_id;
        }
        String str5 = str;
        if ((i4 & 4) != 0) {
            str2 = faceOperationListRequest.key_word;
        }
        String str6 = str2;
        if ((i4 & 8) != 0) {
            str3 = faceOperationListRequest.model;
        }
        String str7 = str3;
        if ((i4 & 16) != 0) {
            str4 = faceOperationListRequest.firmware_version;
        }
        String str8 = str4;
        if ((i4 & 32) != 0) {
            i2 = faceOperationListRequest.page;
        }
        int i5 = i2;
        if ((i4 & 64) != 0) {
            i3 = faceOperationListRequest.size;
        }
        return faceOperationListRequest.copy(i, str5, str6, str7, str8, i5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOperation_type() {
        return this.operation_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperation_id() {
        return this.operation_id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey_word() {
        return this.key_word;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final FaceOperationListRequest copy(int operation_type, @NotNull String operation_id, @Nullable String key_word, @NotNull String model, @Nullable String firmware_version, int page, int size) {
        Intrinsics.checkNotNullParameter(operation_id, "operation_id");
        Intrinsics.checkNotNullParameter(model, "model");
        return new FaceOperationListRequest(operation_type, operation_id, key_word, model, firmware_version, page, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceOperationListRequest)) {
            return false;
        }
        FaceOperationListRequest faceOperationListRequest = (FaceOperationListRequest) other;
        return this.operation_type == faceOperationListRequest.operation_type && Intrinsics.areEqual(this.operation_id, faceOperationListRequest.operation_id) && Intrinsics.areEqual(this.key_word, faceOperationListRequest.key_word) && Intrinsics.areEqual(this.model, faceOperationListRequest.model) && Intrinsics.areEqual(this.firmware_version, faceOperationListRequest.firmware_version) && this.page == faceOperationListRequest.page && this.size == faceOperationListRequest.size;
    }

    @Nullable
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @Nullable
    public final String getKey_word() {
        return this.key_word;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOperation_id() {
        return this.operation_id;
    }

    public final int getOperation_type() {
        return this.operation_type;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.operation_type) * 31) + this.operation_id.hashCode()) * 31;
        String str = this.key_word;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.model.hashCode()) * 31;
        String str2 = this.firmware_version;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "FaceOperationListRequest(operation_type=" + this.operation_type + ", operation_id=" + this.operation_id + ", key_word=" + this.key_word + ", model=" + this.model + ", firmware_version=" + this.firmware_version + ", page=" + this.page + ", size=" + this.size + ")";
    }

    public /* synthetic */ FaceOperationListRequest(int i, String str, String str2, String str3, String str4, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, i2, (i4 & 64) != 0 ? 50 : i3);
    }
}
