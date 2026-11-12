package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.utils.TimeUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureSingle;", "", "", "toString", "", "component1", "", "component2", "component3", "timeMillis", "algEnvTempe", "algBodyTempe", "copy", "", "hashCode", "other", "", "equals", "a", "J", "getTimeMillis", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getAlgEnvTempe", "()S", "c", "getAlgBodyTempe", "<init>", "(JSS)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureSingle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final short algEnvTempe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final short algBodyTempe;

    public TemperatureSingle(long j, short s, short s2) {
        this.timeMillis = j;
        this.algEnvTempe = s;
        this.algBodyTempe = s2;
    }

    public static /* synthetic */ TemperatureSingle copy$default(TemperatureSingle temperatureSingle, long j, short s, short s2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperatureSingle.timeMillis;
        }
        if ((i & 2) != 0) {
            s = temperatureSingle.algEnvTempe;
        }
        if ((i & 4) != 0) {
            s2 = temperatureSingle.algBodyTempe;
        }
        return temperatureSingle.copy(j, s, s2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getAlgEnvTempe() {
        return this.algEnvTempe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getAlgBodyTempe() {
        return this.algBodyTempe;
    }

    @NotNull
    public final TemperatureSingle copy(long timeMillis, short algEnvTempe, short algBodyTempe) {
        return new TemperatureSingle(timeMillis, algEnvTempe, algBodyTempe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureSingle)) {
            return false;
        }
        TemperatureSingle temperatureSingle = (TemperatureSingle) other;
        return this.timeMillis == temperatureSingle.timeMillis && this.algEnvTempe == temperatureSingle.algEnvTempe && this.algBodyTempe == temperatureSingle.algBodyTempe;
    }

    public final short getAlgBodyTempe() {
        return this.algBodyTempe;
    }

    public final short getAlgEnvTempe() {
        return this.algEnvTempe;
    }

    public final long getTimeMillis() {
        return this.timeMillis;
    }

    public int hashCode() {
        return (((b.a(this.timeMillis) * 31) + this.algEnvTempe) * 31) + this.algBodyTempe;
    }

    @NotNull
    public String toString() {
        return "Time: " + this.timeMillis + ", " + ((Object) TimeUtil.formatDateTime(this.timeMillis)) + ", AlgEnvTempe: " + ((int) this.algEnvTempe) + ", AlgBodyTempe: " + ((int) this.algBodyTempe);
    }
}
