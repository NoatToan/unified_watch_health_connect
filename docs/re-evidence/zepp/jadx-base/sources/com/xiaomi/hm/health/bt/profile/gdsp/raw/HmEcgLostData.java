package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmEcgLostData;", "", "", "toString", "", "component1", "component2", "timestamp", "position", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTimestamp", "()I", "b", "getPosition", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HmEcgLostData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int position;

    public HmEcgLostData(int i, int i2) {
        this.timestamp = i;
        this.position = i2;
    }

    public static /* synthetic */ HmEcgLostData copy$default(HmEcgLostData hmEcgLostData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hmEcgLostData.timestamp;
        }
        if ((i3 & 2) != 0) {
            i2 = hmEcgLostData.position;
        }
        return hmEcgLostData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final HmEcgLostData copy(int timestamp, int position) {
        return new HmEcgLostData(timestamp, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmEcgLostData)) {
            return false;
        }
        HmEcgLostData hmEcgLostData = (HmEcgLostData) other;
        return this.timestamp == hmEcgLostData.timestamp && this.position == hmEcgLostData.position;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (this.timestamp * 31) + this.position;
    }

    @NotNull
    public String toString() {
        return "HmEcgLostData:{timestamp:" + this.timestamp + ", position:" + this.position + '}';
    }
}
