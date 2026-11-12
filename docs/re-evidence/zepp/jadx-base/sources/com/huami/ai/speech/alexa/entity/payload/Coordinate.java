package com.huami.ai.speech.alexa.entity.payload;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", "", "", "component1", "component2", "", "component3", "latitudeInDegrees", "longitudeInDegrees", "accuracyInMeters", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getLatitudeInDegrees", "()F", "b", "getLongitudeInDegrees", "c", LogUtil.I, "getAccuracyInMeters", "()I", "<init>", "(FFI)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Coordinate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("latitudeInDegrees")
    private final float latitudeInDegrees;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("longitudeInDegrees")
    private final float longitudeInDegrees;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("accuracyInMeters")
    private final int accuracyInMeters;

    public Coordinate(float f, float f2, int i) {
        this.latitudeInDegrees = f;
        this.longitudeInDegrees = f2;
        this.accuracyInMeters = i;
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = coordinate.latitudeInDegrees;
        }
        if ((i2 & 2) != 0) {
            f2 = coordinate.longitudeInDegrees;
        }
        if ((i2 & 4) != 0) {
            i = coordinate.accuracyInMeters;
        }
        return coordinate.copy(f, f2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLatitudeInDegrees() {
        return this.latitudeInDegrees;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLongitudeInDegrees() {
        return this.longitudeInDegrees;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    @NotNull
    public final Coordinate copy(float latitudeInDegrees, float longitudeInDegrees, int accuracyInMeters) {
        return new Coordinate(latitudeInDegrees, longitudeInDegrees, accuracyInMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.latitudeInDegrees), (Object) Float.valueOf(coordinate.latitudeInDegrees)) && Intrinsics.areEqual((Object) Float.valueOf(this.longitudeInDegrees), (Object) Float.valueOf(coordinate.longitudeInDegrees)) && this.accuracyInMeters == coordinate.accuracyInMeters;
    }

    public final int getAccuracyInMeters() {
        return this.accuracyInMeters;
    }

    public final float getLatitudeInDegrees() {
        return this.latitudeInDegrees;
    }

    public final float getLongitudeInDegrees() {
        return this.longitudeInDegrees;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.latitudeInDegrees) * 31) + Float.floatToIntBits(this.longitudeInDegrees)) * 31) + this.accuracyInMeters;
    }

    @NotNull
    public String toString() {
        return "Coordinate(latitudeInDegrees=" + this.latitudeInDegrees + ", longitudeInDegrees=" + this.longitudeInDegrees + ", accuracyInMeters=" + this.accuracyInMeters + ')';
    }
}
