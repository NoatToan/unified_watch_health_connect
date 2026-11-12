package com.huami.ai.speech.alexa.entity.payload;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "", "", "component1", "", "component2", "altitudeInMeters", "accuracyInMeters", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getAltitudeInMeters", "()F", "b", LogUtil.I, "getAccuracyInMeters", "()I", "<init>", "(FI)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Altitude {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("altitudeInMeters")
    private final float altitudeInMeters;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("accuracyInMeters")
    private final int accuracyInMeters;

    public Altitude(float f, int i) {
        this.altitudeInMeters = f;
        this.accuracyInMeters = i;
    }

    public static /* synthetic */ Altitude copy$default(Altitude altitude, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = altitude.altitudeInMeters;
        }
        if ((i2 & 2) != 0) {
            i = altitude.accuracyInMeters;
        }
        return altitude.copy(f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    @NotNull
    public final Altitude copy(float altitudeInMeters, int accuracyInMeters) {
        return new Altitude(altitudeInMeters, accuracyInMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Altitude)) {
            return false;
        }
        Altitude altitude = (Altitude) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.altitudeInMeters), (Object) Float.valueOf(altitude.altitudeInMeters)) && this.accuracyInMeters == altitude.accuracyInMeters;
    }

    public final int getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    public final float getAltitudeInMeters() {
        return this.altitudeInMeters;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.altitudeInMeters) * 31) + this.accuracyInMeters;
    }

    @NotNull
    public String toString() {
        return "Altitude(altitudeInMeters=" + this.altitudeInMeters + ", accuracyInMeters=" + this.accuracyInMeters + ')';
    }
}
