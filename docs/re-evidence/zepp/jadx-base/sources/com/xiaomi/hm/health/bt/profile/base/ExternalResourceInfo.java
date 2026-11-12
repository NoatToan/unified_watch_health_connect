package com.xiaomi.hm.health.bt.profile.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/ExternalResourceInfo;", "", "", "toString", "", "component1", "component2", "version", "flag", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getVersion", "()I", "setVersion", "(I)V", "b", "getFlag", "setFlag", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExternalResourceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int flag;

    public ExternalResourceInfo(int i, int i2) {
        this.version = i;
        this.flag = i2;
    }

    public static /* synthetic */ ExternalResourceInfo copy$default(ExternalResourceInfo externalResourceInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = externalResourceInfo.version;
        }
        if ((i3 & 2) != 0) {
            i2 = externalResourceInfo.flag;
        }
        return externalResourceInfo.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final ExternalResourceInfo copy(int version, int flag) {
        return new ExternalResourceInfo(version, flag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalResourceInfo)) {
            return false;
        }
        ExternalResourceInfo externalResourceInfo = (ExternalResourceInfo) other;
        return this.version == externalResourceInfo.version && this.flag == externalResourceInfo.flag;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + this.flag;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.version);
        sb.append(',');
        sb.append(this.flag);
        return sb.toString();
    }
}
