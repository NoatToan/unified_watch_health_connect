package com.airoha.location;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class SimpleLocation {
    double altitude;
    double latitude;
    double longitude;
    long timestamp;

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "SimpleLocation{timestamp=" + this.timestamp + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + AbstractJsonLexerKt.END_OBJ;
    }
}
