package com.xiaomi.hm.health.bt.profile.gdsp.highlowhr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.Constant;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B7\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001c¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmHighLowHrData;", "", "", "isHighHr", "isLowHr", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "version", "timestamp", "afResult", "duration", Constant.PAI_KEY_MAX_HR, "minHr", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "J", "getTimestamp", "()J", "c", "getAfResult", GoogleApiAvailabilityLight.a, "getDuration", "e", "getMaxHr", "f", "getMinHr", "<init>", "(IJIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HmHighLowHrData {
    public static final int HIGH_HR_RESULT = 100;
    public static final int LOW_HR_RESULT = 101;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int afResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int maxHr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int minHr;

    public HmHighLowHrData(int i, long j, int i2, int i3, int i4, int i5) {
        this.version = i;
        this.timestamp = j;
        this.afResult = i2;
        this.duration = i3;
        this.maxHr = i4;
        this.minHr = i5;
    }

    public static /* synthetic */ HmHighLowHrData copy$default(HmHighLowHrData hmHighLowHrData, int i, long j, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = hmHighLowHrData.version;
        }
        if ((i6 & 2) != 0) {
            j = hmHighLowHrData.timestamp;
        }
        long j2 = j;
        if ((i6 & 4) != 0) {
            i2 = hmHighLowHrData.afResult;
        }
        int i7 = i2;
        if ((i6 & 8) != 0) {
            i3 = hmHighLowHrData.duration;
        }
        int i8 = i3;
        if ((i6 & 16) != 0) {
            i4 = hmHighLowHrData.maxHr;
        }
        int i9 = i4;
        if ((i6 & 32) != 0) {
            i5 = hmHighLowHrData.minHr;
        }
        return hmHighLowHrData.copy(i, j2, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAfResult() {
        return this.afResult;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinHr() {
        return this.minHr;
    }

    @NotNull
    public final HmHighLowHrData copy(int version, long timestamp, int afResult, int duration, int maxHr, int minHr) {
        return new HmHighLowHrData(version, timestamp, afResult, duration, maxHr, minHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmHighLowHrData)) {
            return false;
        }
        HmHighLowHrData hmHighLowHrData = (HmHighLowHrData) other;
        return this.version == hmHighLowHrData.version && this.timestamp == hmHighLowHrData.timestamp && this.afResult == hmHighLowHrData.afResult && this.duration == hmHighLowHrData.duration && this.maxHr == hmHighLowHrData.maxHr && this.minHr == hmHighLowHrData.minHr;
    }

    public final int getAfResult() {
        return this.afResult;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMinHr() {
        return this.minHr;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((this.version * 31) + b.a(this.timestamp)) * 31) + this.afResult) * 31) + this.duration) * 31) + this.maxHr) * 31) + this.minHr;
    }

    public final boolean isHighHr() {
        return this.afResult == 100;
    }

    public final boolean isLowHr() {
        return this.afResult == 101;
    }

    @NotNull
    public String toString() {
        return "HmHighLowHrData(version=" + this.version + ", timestamp=" + this.timestamp + ", afResult=" + this.afResult + ", duration=" + this.duration + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ')';
    }
}
