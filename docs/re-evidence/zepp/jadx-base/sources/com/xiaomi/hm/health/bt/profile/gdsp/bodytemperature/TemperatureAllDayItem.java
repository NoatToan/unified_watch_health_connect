package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/TemperatureAllDayItem;", "", "", "component1", "component2", "component3", "component4", "envTempe", "bodyTempe", "algEnvTempe", "algBodyTempe", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getEnvTempe", "()S", "b", "getBodyTempe", "c", "getAlgEnvTempe", GoogleApiAvailabilityLight.a, "getAlgBodyTempe", "<init>", "(SSSS)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureAllDayItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final short envTempe;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final short bodyTempe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final short algEnvTempe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final short algBodyTempe;

    public TemperatureAllDayItem(short s, short s2, short s3, short s4) {
        this.envTempe = s;
        this.bodyTempe = s2;
        this.algEnvTempe = s3;
        this.algBodyTempe = s4;
    }

    public static /* synthetic */ TemperatureAllDayItem copy$default(TemperatureAllDayItem temperatureAllDayItem, short s, short s2, short s3, short s4, int i, Object obj) {
        if ((i & 1) != 0) {
            s = temperatureAllDayItem.envTempe;
        }
        if ((i & 2) != 0) {
            s2 = temperatureAllDayItem.bodyTempe;
        }
        if ((i & 4) != 0) {
            s3 = temperatureAllDayItem.algEnvTempe;
        }
        if ((i & 8) != 0) {
            s4 = temperatureAllDayItem.algBodyTempe;
        }
        return temperatureAllDayItem.copy(s, s2, s3, s4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getEnvTempe() {
        return this.envTempe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getBodyTempe() {
        return this.bodyTempe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getAlgEnvTempe() {
        return this.algEnvTempe;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getAlgBodyTempe() {
        return this.algBodyTempe;
    }

    @NotNull
    public final TemperatureAllDayItem copy(short envTempe, short bodyTempe, short algEnvTempe, short algBodyTempe) {
        return new TemperatureAllDayItem(envTempe, bodyTempe, algEnvTempe, algBodyTempe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureAllDayItem)) {
            return false;
        }
        TemperatureAllDayItem temperatureAllDayItem = (TemperatureAllDayItem) other;
        return this.envTempe == temperatureAllDayItem.envTempe && this.bodyTempe == temperatureAllDayItem.bodyTempe && this.algEnvTempe == temperatureAllDayItem.algEnvTempe && this.algBodyTempe == temperatureAllDayItem.algBodyTempe;
    }

    public final short getAlgBodyTempe() {
        return this.algBodyTempe;
    }

    public final short getAlgEnvTempe() {
        return this.algEnvTempe;
    }

    public final short getBodyTempe() {
        return this.bodyTempe;
    }

    public final short getEnvTempe() {
        return this.envTempe;
    }

    public int hashCode() {
        return (((((this.envTempe * 31) + this.bodyTempe) * 31) + this.algEnvTempe) * 31) + this.algBodyTempe;
    }

    @NotNull
    public String toString() {
        return "TemperatureAllDayItem(envTempe=" + ((int) this.envTempe) + ", bodyTempe=" + ((int) this.bodyTempe) + ", algEnvTempe=" + ((int) this.algEnvTempe) + ", algBodyTempe=" + ((int) this.algBodyTempe) + ')';
    }
}
