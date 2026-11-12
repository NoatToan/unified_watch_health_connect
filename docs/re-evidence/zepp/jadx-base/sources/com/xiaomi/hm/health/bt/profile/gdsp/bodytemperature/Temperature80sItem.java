package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "timeMillis", "envTempe", "bodyTempe", "algEnvTempe", "algBodyTempe", "wearState", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimeMillis", "()J", "b", ExifInterface.LATITUDE_SOUTH, "getEnvTempe", "()S", "c", "getBodyTempe", GoogleApiAvailabilityLight.a, "getAlgEnvTempe", "e", "getAlgBodyTempe", "f", LogUtil.I, "getWearState", "()I", "<init>", "(JSSSSI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Temperature80sItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final short envTempe;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final short bodyTempe;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final short algEnvTempe;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final short algBodyTempe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int wearState;

    public Temperature80sItem(long j, short s, short s2, short s3, short s4, int i) {
        this.timeMillis = j;
        this.envTempe = s;
        this.bodyTempe = s2;
        this.algEnvTempe = s3;
        this.algBodyTempe = s4;
        this.wearState = i;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getEnvTempe() {
        return this.envTempe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getBodyTempe() {
        return this.bodyTempe;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getAlgEnvTempe() {
        return this.algEnvTempe;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final short getAlgBodyTempe() {
        return this.algBodyTempe;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWearState() {
        return this.wearState;
    }

    @NotNull
    public final Temperature80sItem copy(long timeMillis, short envTempe, short bodyTempe, short algEnvTempe, short algBodyTempe, int wearState) {
        return new Temperature80sItem(timeMillis, envTempe, bodyTempe, algEnvTempe, algBodyTempe, wearState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Temperature80sItem)) {
            return false;
        }
        Temperature80sItem temperature80sItem = (Temperature80sItem) other;
        return this.timeMillis == temperature80sItem.timeMillis && this.envTempe == temperature80sItem.envTempe && this.bodyTempe == temperature80sItem.bodyTempe && this.algEnvTempe == temperature80sItem.algEnvTempe && this.algBodyTempe == temperature80sItem.algBodyTempe && this.wearState == temperature80sItem.wearState;
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

    public final long getTimeMillis() {
        return this.timeMillis;
    }

    public final int getWearState() {
        return this.wearState;
    }

    public int hashCode() {
        return (((((((((b.a(this.timeMillis) * 31) + this.envTempe) * 31) + this.bodyTempe) * 31) + this.algEnvTempe) * 31) + this.algBodyTempe) * 31) + this.wearState;
    }

    @NotNull
    public String toString() {
        return "Temperature80sItem(timeMillis=" + this.timeMillis + ", envTempe=" + ((int) this.envTempe) + ", bodyTempe=" + ((int) this.bodyTempe) + ", algEnvTempe=" + ((int) this.algEnvTempe) + ", algBodyTempe=" + ((int) this.algBodyTempe) + ", wearState=" + this.wearState + ')';
    }
}
