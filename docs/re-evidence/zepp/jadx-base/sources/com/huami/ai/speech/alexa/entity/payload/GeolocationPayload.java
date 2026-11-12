package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/GeolocationPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "component2", "Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", "component3", "Lcom/huami/ai/speech/alexa/entity/payload/LocationServices;", "component4", "Lcom/huami/ai/speech/alexa/entity/payload/Speed;", "component5", "timestamp", "altitude", "coordinate", "locationServices", "speed", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTimestamp", "()Ljava/lang/String;", "b", "Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "getAltitude", "()Lcom/huami/ai/speech/alexa/entity/payload/Altitude;", "c", "Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", "getCoordinate", "()Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/alexa/entity/payload/LocationServices;", "getLocationServices", "()Lcom/huami/ai/speech/alexa/entity/payload/LocationServices;", "e", "Lcom/huami/ai/speech/alexa/entity/payload/Speed;", "getSpeed", "()Lcom/huami/ai/speech/alexa/entity/payload/Speed;", "<init>", "(Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Altitude;Lcom/huami/ai/speech/alexa/entity/payload/Coordinate;Lcom/huami/ai/speech/alexa/entity/payload/LocationServices;Lcom/huami/ai/speech/alexa/entity/payload/Speed;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GeolocationPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("timestamp")
    @NotNull
    private final String timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("altitude")
    @NotNull
    private final Altitude altitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("coordinate")
    @NotNull
    private final Coordinate coordinate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("locationServices")
    @NotNull
    private final LocationServices locationServices;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("speed")
    @NotNull
    private final Speed speed;

    public GeolocationPayload(@NotNull String str, @NotNull Altitude altitude, @NotNull Coordinate coordinate, @NotNull LocationServices locationServices, @NotNull Speed speed) {
        this.timestamp = str;
        this.altitude = altitude;
        this.coordinate = coordinate;
        this.locationServices = locationServices;
        this.speed = speed;
    }

    public static /* synthetic */ GeolocationPayload copy$default(GeolocationPayload geolocationPayload, String str, Altitude altitude, Coordinate coordinate, LocationServices locationServices, Speed speed, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geolocationPayload.timestamp;
        }
        if ((i & 2) != 0) {
            altitude = geolocationPayload.altitude;
        }
        Altitude altitude2 = altitude;
        if ((i & 4) != 0) {
            coordinate = geolocationPayload.coordinate;
        }
        Coordinate coordinate2 = coordinate;
        if ((i & 8) != 0) {
            locationServices = geolocationPayload.locationServices;
        }
        LocationServices locationServices2 = locationServices;
        if ((i & 16) != 0) {
            speed = geolocationPayload.speed;
        }
        return geolocationPayload.copy(str, altitude2, coordinate2, locationServices2, speed);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Altitude getAltitude() {
        return this.altitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocationServices getLocationServices() {
        return this.locationServices;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Speed getSpeed() {
        return this.speed;
    }

    @NotNull
    public final GeolocationPayload copy(@NotNull String timestamp, @NotNull Altitude altitude, @NotNull Coordinate coordinate, @NotNull LocationServices locationServices, @NotNull Speed speed) {
        return new GeolocationPayload(timestamp, altitude, coordinate, locationServices, speed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeolocationPayload)) {
            return false;
        }
        GeolocationPayload geolocationPayload = (GeolocationPayload) other;
        return Intrinsics.areEqual(this.timestamp, geolocationPayload.timestamp) && Intrinsics.areEqual(this.altitude, geolocationPayload.altitude) && Intrinsics.areEqual(this.coordinate, geolocationPayload.coordinate) && Intrinsics.areEqual(this.locationServices, geolocationPayload.locationServices) && Intrinsics.areEqual(this.speed, geolocationPayload.speed);
    }

    @NotNull
    public final Altitude getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final Coordinate getCoordinate() {
        return this.coordinate;
    }

    @NotNull
    public final LocationServices getLocationServices() {
        return this.locationServices;
    }

    @NotNull
    public final Speed getSpeed() {
        return this.speed;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((this.timestamp.hashCode() * 31) + this.altitude.hashCode()) * 31) + this.coordinate.hashCode()) * 31) + this.locationServices.hashCode()) * 31) + this.speed.hashCode();
    }

    @NotNull
    public String toString() {
        return "GeolocationPayload(timestamp=" + this.timestamp + ", altitude=" + this.altitude + ", coordinate=" + this.coordinate + ", locationServices=" + this.locationServices + ", speed=" + this.speed + ')';
    }
}
