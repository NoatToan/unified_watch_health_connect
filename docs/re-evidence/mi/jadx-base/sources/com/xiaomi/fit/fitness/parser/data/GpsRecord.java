package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006."}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "", SportConstants.KEY_TIMESTAMP, "", "longitude", "", "latitude", "<init>", "(JFF)V", "getTimeStamp", "()J", "getLongitude", "()F", "getLatitude", "speed", "getSpeed", "()Ljava/lang/Float;", "setSpeed", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "accuracy", "getAccuracy", "setAccuracy", "altitude", "getAltitude", "setAltitude", FitnessGpsKey.hdop, "getHdop", "setHdop", FitnessGpsKey.gpsSource, "", "getGpsSource", "()Ljava/lang/Integer;", "setGpsSource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GpsRecord {

    @Nullable
    private Float accuracy;

    @Nullable
    private Float altitude;

    @Nullable
    private Integer gpsSource;

    @Nullable
    private Float hdop;
    private final float latitude;
    private final float longitude;

    @Nullable
    private Float speed;
    private final long timeStamp;

    public GpsRecord(long j, float f, float f2) {
        this.timeStamp = j;
        this.longitude = f;
        this.latitude = f2;
    }

    public static /* synthetic */ GpsRecord copy$default(GpsRecord gpsRecord, long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gpsRecord.timeStamp;
        }
        if ((i & 2) != 0) {
            f = gpsRecord.longitude;
        }
        if ((i & 4) != 0) {
            f2 = gpsRecord.latitude;
        }
        return gpsRecord.copy(j, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final GpsRecord copy(long timeStamp, float longitude, float latitude) {
        return new GpsRecord(timeStamp, longitude, latitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsRecord)) {
            return false;
        }
        GpsRecord gpsRecord = (GpsRecord) other;
        return this.timeStamp == gpsRecord.timeStamp && Float.compare(this.longitude, gpsRecord.longitude) == 0 && Float.compare(this.latitude, gpsRecord.latitude) == 0;
    }

    @Nullable
    public final Float getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Float getAltitude() {
        return this.altitude;
    }

    @Nullable
    public final Integer getGpsSource() {
        return this.gpsSource;
    }

    @Nullable
    public final Float getHdop() {
        return this.hdop;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Float getSpeed() {
        return this.speed;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timeStamp) * 31) + Float.hashCode(this.longitude)) * 31) + Float.hashCode(this.latitude);
    }

    public final void setAccuracy(@Nullable Float f) {
        this.accuracy = f;
    }

    public final void setAltitude(@Nullable Float f) {
        this.altitude = f;
    }

    public final void setGpsSource(@Nullable Integer num) {
        this.gpsSource = num;
    }

    public final void setHdop(@Nullable Float f) {
        this.hdop = f;
    }

    public final void setSpeed(@Nullable Float f) {
        this.speed = f;
    }

    @NotNull
    public String toString() {
        return "timeStamp = " + this.timeStamp + ", longitude = " + this.longitude + ", latitude = " + this.latitude + ", speed = " + this.speed + ", accuracy = " + this.accuracy + ", gpsSource = " + this.gpsSource + ",altitude = " + this.altitude + ",hdop = " + this.hdop;
    }
}
