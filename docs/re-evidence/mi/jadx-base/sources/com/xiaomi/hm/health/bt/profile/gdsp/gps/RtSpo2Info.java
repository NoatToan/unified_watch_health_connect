package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtSpo2Info;", "Ljava/io/Serializable;", "time", "", "spo2", "", "(JI)V", "getSpo2", "()I", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RtSpo2Info implements Serializable {
    private static final long serialVersionUID = 1;
    private final int spo2;
    private final long time;

    public RtSpo2Info(long j, int i) {
        this.time = j;
        this.spo2 = i;
    }

    public static /* synthetic */ RtSpo2Info copy$default(RtSpo2Info rtSpo2Info, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = rtSpo2Info.time;
        }
        if ((i2 & 2) != 0) {
            i = rtSpo2Info.spo2;
        }
        return rtSpo2Info.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSpo2() {
        return this.spo2;
    }

    @NotNull
    public final RtSpo2Info copy(long time, int spo2) {
        return new RtSpo2Info(time, spo2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtSpo2Info)) {
            return false;
        }
        RtSpo2Info rtSpo2Info = (RtSpo2Info) other;
        return this.time == rtSpo2Info.time && this.spo2 == rtSpo2Info.spo2;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.spo2);
    }

    @NotNull
    public String toString() {
        return "RtSpo2Info(time=" + this.time + ", spo2=" + this.spo2 + ')';
    }
}
