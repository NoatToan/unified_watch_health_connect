package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/LowOsaValue;", "Ljava/io/Serializable;", "", "component1", "", "component2", "time", "value", "copy", "", "toString", "hashCode", "", "other", "", "equals", "J", "getTime", "()J", "I", "getValue", "()I", "<init>", "(JI)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LowOsaValue implements Serializable {
    private static final long serialVersionUID = 1;
    private final long time;
    private final int value;

    public LowOsaValue(long j, int i) {
        this.time = j;
        this.value = i;
    }

    public static /* synthetic */ LowOsaValue copy$default(LowOsaValue lowOsaValue, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = lowOsaValue.time;
        }
        if ((i2 & 2) != 0) {
            i = lowOsaValue.value;
        }
        return lowOsaValue.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final LowOsaValue copy(long time, int value) {
        return new LowOsaValue(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LowOsaValue)) {
            return false;
        }
        LowOsaValue lowOsaValue = (LowOsaValue) other;
        return this.time == lowOsaValue.time && this.value == lowOsaValue.value;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "LowOsaValue(time=" + this.time + ", value=" + this.value + ')';
    }
}
