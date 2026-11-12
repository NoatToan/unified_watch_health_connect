package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHrNotificationData;", "Ljava/io/Serializable;", "", "component1", "", "component2", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HighOrLowHr;", "component3", "timestamp", TSMAuthContants.PARAM_THRESHOLD, "highOrLowHr", "copy", "", "toString", "hashCode", "", "other", "", "equals", "J", "getTimestamp", "()J", "I", "getThreshold", "()I", "Ljava/util/List;", "getHighOrLowHr", "()Ljava/util/List;", "<init>", "(JILjava/util/List;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HighOrLowHrNotificationData implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<HighOrLowHr> highOrLowHr;
    private final int threshold;
    private final long timestamp;

    public HighOrLowHrNotificationData(long j, int i, @NotNull List<HighOrLowHr> highOrLowHr) {
        Intrinsics.checkNotNullParameter(highOrLowHr, "highOrLowHr");
        this.timestamp = j;
        this.threshold = i;
        this.highOrLowHr = highOrLowHr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighOrLowHrNotificationData copy$default(HighOrLowHrNotificationData highOrLowHrNotificationData, long j, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = highOrLowHrNotificationData.timestamp;
        }
        if ((i2 & 2) != 0) {
            i = highOrLowHrNotificationData.threshold;
        }
        if ((i2 & 4) != 0) {
            list = highOrLowHrNotificationData.highOrLowHr;
        }
        return highOrLowHrNotificationData.copy(j, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final List<HighOrLowHr> component3() {
        return this.highOrLowHr;
    }

    @NotNull
    public final HighOrLowHrNotificationData copy(long timestamp, int threshold, @NotNull List<HighOrLowHr> highOrLowHr) {
        Intrinsics.checkNotNullParameter(highOrLowHr, "highOrLowHr");
        return new HighOrLowHrNotificationData(timestamp, threshold, highOrLowHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighOrLowHrNotificationData)) {
            return false;
        }
        HighOrLowHrNotificationData highOrLowHrNotificationData = (HighOrLowHrNotificationData) other;
        return this.timestamp == highOrLowHrNotificationData.timestamp && this.threshold == highOrLowHrNotificationData.threshold && Intrinsics.areEqual(this.highOrLowHr, highOrLowHrNotificationData.highOrLowHr);
    }

    @NotNull
    public final List<HighOrLowHr> getHighOrLowHr() {
        return this.highOrLowHr;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.threshold)) * 31) + this.highOrLowHr.hashCode();
    }

    @NotNull
    public String toString() {
        return "HighOrLowHrNotificationData(timestamp=" + this.timestamp + ", threshold=" + this.threshold + ", highOrLowHr=" + this.highOrLowHr + ')';
    }
}
