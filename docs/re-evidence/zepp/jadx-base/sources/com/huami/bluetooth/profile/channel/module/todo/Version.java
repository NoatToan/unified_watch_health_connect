package com.huami.bluetooth.profile.channel.module.todo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "", "", "component1", "component2", "v", "maxCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getV", "()I", "b", "getMaxCount", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Version {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int v;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int maxCount;

    public Version(int i, int i2) {
        this.v = i;
        this.maxCount = i2;
    }

    public static /* synthetic */ Version copy$default(Version version, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = version.v;
        }
        if ((i3 & 2) != 0) {
            i2 = version.maxCount;
        }
        return version.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final Version copy(int v, int maxCount) {
        return new Version(v, maxCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.v == version.v && this.maxCount == version.maxCount;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getV() {
        return this.v;
    }

    public int hashCode() {
        return (this.v * 31) + this.maxCount;
    }

    @NotNull
    public String toString() {
        return "Version(v=" + this.v + ", maxCount=" + this.maxCount + ')';
    }
}
