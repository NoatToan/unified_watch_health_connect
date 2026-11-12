package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleDataItem;", "", "Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "component1", "", "component2", "type", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "getType", "()Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "b", LogUtil.I, "getStatus", "()I", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/DisplayType;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScaleDataItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DisplayType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int status;

    public ScaleDataItem(@NotNull DisplayType displayType, int i) {
        this.type = displayType;
        this.status = i;
    }

    public static /* synthetic */ ScaleDataItem copy$default(ScaleDataItem scaleDataItem, DisplayType displayType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            displayType = scaleDataItem.type;
        }
        if ((i2 & 2) != 0) {
            i = scaleDataItem.status;
        }
        return scaleDataItem.copy(displayType, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DisplayType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final ScaleDataItem copy(@NotNull DisplayType type, int status) {
        return new ScaleDataItem(type, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleDataItem)) {
            return false;
        }
        ScaleDataItem scaleDataItem = (ScaleDataItem) other;
        return this.type == scaleDataItem.type && this.status == scaleDataItem.status;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final DisplayType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.status;
    }

    @NotNull
    public String toString() {
        return "ScaleDataItem(type=" + this.type + ", status=" + this.status + ')';
    }
}
