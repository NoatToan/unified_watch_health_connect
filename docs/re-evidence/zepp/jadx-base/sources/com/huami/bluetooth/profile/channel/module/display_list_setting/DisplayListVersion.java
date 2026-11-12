package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListVersion;", "", "", "component1", "component2", "version", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "getType", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayListVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public DisplayListVersion() {
        int i = 0;
        this(i, i, 3, null);
    }

    public DisplayListVersion(int i, int i2) {
        this.version = i;
        this.type = i2;
    }

    public static /* synthetic */ DisplayListVersion copy$default(DisplayListVersion displayListVersion, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = displayListVersion.version;
        }
        if ((i3 & 2) != 0) {
            i2 = displayListVersion.type;
        }
        return displayListVersion.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final DisplayListVersion copy(int version, int type) {
        return new DisplayListVersion(version, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayListVersion)) {
            return false;
        }
        DisplayListVersion displayListVersion = (DisplayListVersion) other;
        return this.version == displayListVersion.version && this.type == displayListVersion.type;
    }

    public final int getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "DisplayListVersion(version=" + this.version + ", type=" + this.type + ')';
    }

    public /* synthetic */ DisplayListVersion(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
