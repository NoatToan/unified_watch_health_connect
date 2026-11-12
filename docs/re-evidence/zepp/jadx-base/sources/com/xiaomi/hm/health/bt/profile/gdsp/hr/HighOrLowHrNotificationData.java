package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHrNotificationData;", "Ljava/io/Serializable;", "", "component1", "", "component2", "component3", "timestamp", "threshold", "value", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", LogUtil.I, "getThreshold", "()I", "c", "getValue", "<init>", "(JII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HighOrLowHrNotificationData implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int threshold;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int value;

    public HighOrLowHrNotificationData(long j, int i, int i2) {
        this.timestamp = j;
        this.threshold = i;
        this.value = i2;
    }

    public static /* synthetic */ HighOrLowHrNotificationData copy$default(HighOrLowHrNotificationData highOrLowHrNotificationData, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = highOrLowHrNotificationData.timestamp;
        }
        if ((i3 & 2) != 0) {
            i = highOrLowHrNotificationData.threshold;
        }
        if ((i3 & 4) != 0) {
            i2 = highOrLowHrNotificationData.value;
        }
        return highOrLowHrNotificationData.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final HighOrLowHrNotificationData copy(long timestamp, int threshold, int value) {
        return new HighOrLowHrNotificationData(timestamp, threshold, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighOrLowHrNotificationData)) {
            return false;
        }
        HighOrLowHrNotificationData highOrLowHrNotificationData = (HighOrLowHrNotificationData) other;
        return this.timestamp == highOrLowHrNotificationData.timestamp && this.threshold == highOrLowHrNotificationData.threshold && this.value == highOrLowHrNotificationData.value;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((b.a(this.timestamp) * 31) + this.threshold) * 31) + this.value;
    }

    @NotNull
    public String toString() {
        return "HighOrLowHrNotificationData(timestamp=" + this.timestamp + ", threshold=" + this.threshold + ", value=" + this.value + ')';
    }
}
