package com.xiaomi.hm.health.bt.profile.gdsp.pressure;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "", "", "inVaild", "repeat", "", "component1", "", "component2", "time", "value", "copy", "", "toString", "hashCode", "other", "equals", "a", "J", "getTime", "()J", "setTime", "(J)V", "b", LogUtil.I, "getValue", "()I", "setValue", "(I)V", "<init>", "(JI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMPressureData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int value;

    public HMPressureData(long j, int i) {
        this.time = j;
        this.value = i;
    }

    public static /* synthetic */ HMPressureData copy$default(HMPressureData hMPressureData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hMPressureData.time;
        }
        if ((i2 & 2) != 0) {
            i = hMPressureData.value;
        }
        return hMPressureData.copy(j, i);
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
    public final HMPressureData copy(long time, int value) {
        return new HMPressureData(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMPressureData)) {
            return false;
        }
        HMPressureData hMPressureData = (HMPressureData) other;
        return this.time == hMPressureData.time && this.value == hMPressureData.value;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (b.a(this.time) * 31) + this.value;
    }

    public final boolean inVaild() {
        int i = this.value;
        return i > 100 || i < 0;
    }

    public final boolean repeat() {
        return this.value == 254;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "HMPressureData(time=" + this.time + ", value=" + this.value + ')';
    }
}
