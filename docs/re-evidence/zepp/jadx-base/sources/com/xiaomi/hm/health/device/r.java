package com.xiaomi.hm.health.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0010\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/r;", "", "", "a", LogUtil.I, "()I", "code", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "c", "J", "()J", "timestamp", "<init>", "(ILcom/xiaomi/hm/health/bt/device/HMDeviceSource;J)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
final class r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long timestamp;

    public r(int i, @NotNull HMDeviceSource hMDeviceSource, long j) {
        this.code = i;
        this.source = hMDeviceSource;
        this.timestamp = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HMDeviceSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }
}
