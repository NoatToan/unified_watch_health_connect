package com.mapbox.common.location;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Location implements Serializable {
    private Double altitude;
    private Double bearing;
    private Double bearingAccuracy;
    private final Value extra;
    private Long floor;
    private Double horizontalAccuracy;
    private final double latitude;
    private final double longitude;
    private Long monotonicTimestamp;
    private String source;
    private Double speed;
    private Double speedAccuracy;
    private final long timestamp;
    private Double verticalAccuracy;

    public static final class Builder {
        private Double altitude;
        private Double bearing;
        private Double bearingAccuracy;
        private Value extra;
        private Long floor;
        private Double horizontalAccuracy;
        private double latitude;
        private double longitude;
        private Long monotonicTimestamp;
        private String source;
        private Double speed;
        private Double speedAccuracy;
        private long timestamp;
        private Double verticalAccuracy;

        public Builder altitude(Double d14) {
            this.altitude = d14;
            return this;
        }

        public Builder bearing(Double d14) {
            this.bearing = d14;
            return this;
        }

        public Builder bearingAccuracy(Double d14) {
            this.bearingAccuracy = d14;
            return this;
        }

        public Location build() {
            return new Location(this.latitude, this.longitude, this.timestamp, this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
        }

        public Builder extra(Value value) {
            this.extra = value;
            return this;
        }

        public Builder floor(Long l14) {
            this.floor = l14;
            return this;
        }

        public Builder horizontalAccuracy(Double d14) {
            this.horizontalAccuracy = d14;
            return this;
        }

        public Builder latitude(double d14) {
            this.latitude = d14;
            return this;
        }

        public Builder longitude(double d14) {
            this.longitude = d14;
            return this;
        }

        public Builder monotonicTimestamp(Long l14) {
            this.monotonicTimestamp = l14;
            return this;
        }

        public Builder source(String str) {
            this.source = str;
            return this;
        }

        public Builder speed(Double d14) {
            this.speed = d14;
            return this;
        }

        public Builder speedAccuracy(Double d14) {
            this.speedAccuracy = d14;
            return this;
        }

        public Builder timestamp(long j8) {
            this.timestamp = j8;
            return this;
        }

        public Builder verticalAccuracy(Double d14) {
            this.verticalAccuracy = d14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private Location(double d14, double d15, long j8, Long l14, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Long l15, String str, Value value) {
        this.latitude = d14;
        this.longitude = d15;
        this.timestamp = j8;
        this.monotonicTimestamp = l14;
        this.altitude = d16;
        this.horizontalAccuracy = d17;
        this.verticalAccuracy = d18;
        this.speed = d19;
        this.speedAccuracy = d24;
        this.bearing = d25;
        this.bearingAccuracy = d26;
        this.floor = l15;
        this.source = str;
        this.extra = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location location = (Location) obj;
        return PartialEq.compare(this.latitude, location.latitude) && PartialEq.compare(this.longitude, location.longitude) && this.timestamp == location.timestamp && Objects.equals(this.monotonicTimestamp, location.monotonicTimestamp) && Objects.equals(this.altitude, location.altitude) && Objects.equals(this.horizontalAccuracy, location.horizontalAccuracy) && Objects.equals(this.verticalAccuracy, location.verticalAccuracy) && Objects.equals(this.speed, location.speed) && Objects.equals(this.speedAccuracy, location.speedAccuracy) && Objects.equals(this.bearing, location.bearing) && Objects.equals(this.bearingAccuracy, location.bearingAccuracy) && Objects.equals(this.floor, location.floor) && Objects.equals(this.source, location.source) && Objects.equals(this.extra, location.extra);
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Double getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public Value getExtra() {
        return this.extra;
    }

    public Long getFloor() {
        return this.floor;
    }

    public Double getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public Long getMonotonicTimestamp() {
        return this.monotonicTimestamp;
    }

    public String getSource() {
        return this.source;
    }

    public Double getSpeed() {
        return this.speed;
    }

    public Double getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Double getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude), Long.valueOf(this.timestamp), this.monotonicTimestamp, this.altitude, this.horizontalAccuracy, this.verticalAccuracy, this.speed, this.speedAccuracy, this.bearing, this.bearingAccuracy, this.floor, this.source, this.extra);
    }

    public void setAltitude(Double d14) {
        this.altitude = d14;
    }

    public void setBearing(Double d14) {
        this.bearing = d14;
    }

    public void setBearingAccuracy(Double d14) {
        this.bearingAccuracy = d14;
    }

    public void setFloor(Long l14) {
        this.floor = l14;
    }

    public void setHorizontalAccuracy(Double d14) {
        this.horizontalAccuracy = d14;
    }

    public void setMonotonicTimestamp(Long l14) {
        this.monotonicTimestamp = l14;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSpeed(Double d14) {
        this.speed = d14;
    }

    public void setSpeedAccuracy(Double d14) {
        this.speedAccuracy = d14;
    }

    public void setVerticalAccuracy(Double d14) {
        this.verticalAccuracy = d14;
    }

    public Builder toBuilder() {
        return new Builder().latitude(this.latitude).longitude(this.longitude).timestamp(this.timestamp).monotonicTimestamp(this.monotonicTimestamp).altitude(this.altitude).horizontalAccuracy(this.horizontalAccuracy).verticalAccuracy(this.verticalAccuracy).speed(this.speed).speedAccuracy(this.speedAccuracy).bearing(this.bearing).bearingAccuracy(this.bearingAccuracy).floor(this.floor).source(this.source).extra(this.extra);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[latitude: ");
        com.google.protobuf.a.c(this.latitude, ", longitude: ", sb3);
        com.google.protobuf.a.c(this.longitude, ", timestamp: ", sb3);
        com.google.protobuf.a.h(this.timestamp, ", monotonicTimestamp: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.monotonicTimestamp));
        sb3.append(", altitude: ");
        sb3.append(RecordUtils.fieldToString(this.altitude));
        sb3.append(", horizontalAccuracy: ");
        sb3.append(RecordUtils.fieldToString(this.horizontalAccuracy));
        sb3.append(", verticalAccuracy: ");
        sb3.append(RecordUtils.fieldToString(this.verticalAccuracy));
        sb3.append(", speed: ");
        sb3.append(RecordUtils.fieldToString(this.speed));
        sb3.append(", speedAccuracy: ");
        sb3.append(RecordUtils.fieldToString(this.speedAccuracy));
        sb3.append(", bearing: ");
        sb3.append(RecordUtils.fieldToString(this.bearing));
        sb3.append(", bearingAccuracy: ");
        sb3.append(RecordUtils.fieldToString(this.bearingAccuracy));
        sb3.append(", floor: ");
        sb3.append(RecordUtils.fieldToString(this.floor));
        sb3.append(", source: ");
        com.google.protobuf.a.k(this.source, ", extra: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.extra));
        sb3.append("]");
        return sb3.toString();
    }
}
