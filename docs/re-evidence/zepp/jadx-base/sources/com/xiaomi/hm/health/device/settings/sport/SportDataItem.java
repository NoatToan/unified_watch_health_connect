package com.xiaomi.hm.health.device.settings.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/SportDataItem;", "", "", "hidden", "open", "", "toString", "", "component1", "component2", "component3", "type", "status", "name", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "b", "getStatus", "setStatus", "(I)V", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "isSupportHidden", "()Z", "isOpen", "<init>", "(IILjava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportDataItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String name;

    public SportDataItem(int i, int i2, @NotNull String str) {
        this.type = i;
        this.status = i2;
        this.name = str;
    }

    public static /* synthetic */ SportDataItem copy$default(SportDataItem sportDataItem, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sportDataItem.type;
        }
        if ((i3 & 2) != 0) {
            i2 = sportDataItem.status;
        }
        if ((i3 & 4) != 0) {
            str = sportDataItem.name;
        }
        return sportDataItem.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final SportDataItem copy(int type, int status, @NotNull String name) {
        return new SportDataItem(type, status, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDataItem)) {
            return false;
        }
        SportDataItem sportDataItem = (SportDataItem) other;
        return this.type == sportDataItem.type && this.status == sportDataItem.status && Intrinsics.areEqual(this.name, sportDataItem.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type * 31) + this.status) * 31) + this.name.hashCode();
    }

    public final void hidden() {
        this.status = 1;
    }

    public final boolean isOpen() {
        int i = this.status;
        return i == 2 || i == 3;
    }

    public final boolean isSupportHidden() {
        return this.status != 3;
    }

    public final void open() {
        this.status = 2;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "type:" + this.type + ",status:" + this.status + ",name:" + this.name;
    }
}
