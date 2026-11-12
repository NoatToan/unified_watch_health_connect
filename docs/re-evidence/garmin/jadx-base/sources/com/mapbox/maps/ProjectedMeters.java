package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ProjectedMeters implements Serializable {
    private final double easting;
    private final double northing;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ProjectedMeters(double d14, double d15) {
        this.northing = d14;
        this.easting = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProjectedMeters.class != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        return PartialEq.compare(this.northing, projectedMeters.northing) && PartialEq.compare(this.easting, projectedMeters.easting);
    }

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.northing), Double.valueOf(this.easting));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[northing: ");
        com.google.protobuf.a.c(this.northing, ", easting: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.easting)));
        sb3.append("]");
        return sb3.toString();
    }
}
