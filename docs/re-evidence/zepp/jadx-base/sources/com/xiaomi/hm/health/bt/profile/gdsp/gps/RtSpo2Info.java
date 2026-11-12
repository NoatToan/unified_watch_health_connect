package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RtSpo2Info;", "Ljava/io/Serializable;", "", "component1", "", "component2", "time", "spo2", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getSpo2", "()I", "<init>", "(JI)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RtSpo2Info implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int spo2;

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
        return (defpackage.b.a(this.time) * 31) + this.spo2;
    }

    @NotNull
    public String toString() {
        return "RtSpo2Info(time=" + this.time + ", spo2=" + this.spo2 + ')';
    }
}
