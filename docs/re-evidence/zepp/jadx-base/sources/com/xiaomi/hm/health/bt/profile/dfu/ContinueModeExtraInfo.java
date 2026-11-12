package com.xiaomi.hm.health.bt.profile.dfu;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/ContinueModeExtraInfo;", "", "", "isLast", "isFirst", "", "a", LogUtil.I, "getFirmwareIndex", "()I", "firmwareIndex", "b", "getFirmwareCount", "firmwareCount", "", "c", "J", "getFirmwareTotalSize", "()J", "firmwareTotalSize", "<init>", "(IIJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ContinueModeExtraInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int firmwareIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int firmwareCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long firmwareTotalSize;

    public ContinueModeExtraInfo() {
        this(0, 0, 0L, 7, null);
    }

    public ContinueModeExtraInfo(int i, int i2, long j) {
        this.firmwareIndex = i;
        this.firmwareCount = i2;
        this.firmwareTotalSize = j;
    }

    public final int getFirmwareCount() {
        return this.firmwareCount;
    }

    public final int getFirmwareIndex() {
        return this.firmwareIndex;
    }

    public final long getFirmwareTotalSize() {
        return this.firmwareTotalSize;
    }

    public final boolean isFirst() {
        return this.firmwareIndex == 0;
    }

    public final boolean isLast() {
        return this.firmwareIndex == this.firmwareCount - 1;
    }

    public /* synthetic */ ContinueModeExtraInfo(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? -1L : j);
    }
}
