package com.huami.nfc.bus.entities;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "", "", "component1", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStatus", "()I", "<init>", "(I)V", "Companion", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OpenFeeStateEntity {
    public static final int BETWEEN_30_90 = 2;
    public static final int FREE = 0;
    public static final int LESS_30 = 1;
    public static final int MORE_90 = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    public OpenFeeStateEntity(int i) {
        this.status = i;
    }

    public static /* synthetic */ OpenFeeStateEntity copy$default(OpenFeeStateEntity openFeeStateEntity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = openFeeStateEntity.status;
        }
        return openFeeStateEntity.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final OpenFeeStateEntity copy(int status) {
        return new OpenFeeStateEntity(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenFeeStateEntity) && this.status == ((OpenFeeStateEntity) other).status;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status;
    }

    @NotNull
    public String toString() {
        return "OpenFeeStateEntity(status=" + this.status + ')';
    }
}
