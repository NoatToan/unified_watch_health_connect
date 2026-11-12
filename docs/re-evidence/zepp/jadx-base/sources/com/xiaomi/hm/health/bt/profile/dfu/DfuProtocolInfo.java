package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/DfuProtocolInfo;", "", "", "toString", "", "useFirmwareTypeForBackgroundUpgrade", "", "a", LogUtil.I, "getCode", "()I", "code", "b", "getVersion", "version", "c", "getMaxChunkSize", "maxChunkSize", GoogleApiAvailabilityLight.a, "backGroundUpgrade", "<init>", "(IIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DfuProtocolInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int maxChunkSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int backGroundUpgrade;

    public DfuProtocolInfo(int i, int i2, int i3, int i4) {
        this.code = i;
        this.version = i2;
        this.maxChunkSize = i3;
        this.backGroundUpgrade = i4;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getMaxChunkSize() {
        return this.maxChunkSize;
    }

    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public String toString() {
        return "DfuProtocolInfo(code=" + this.code + ", version=" + this.version + ", maxChunkSize=" + this.maxChunkSize + ", backGroundUpgrade=" + this.backGroundUpgrade + ", desc=" + MyDfuError.INSTANCE.fromValue(this.code).getMessage() + ')';
    }

    public final boolean useFirmwareTypeForBackgroundUpgrade() {
        return this.backGroundUpgrade == 1;
    }

    public /* synthetic */ DfuProtocolInfo(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
