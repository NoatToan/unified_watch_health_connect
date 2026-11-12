package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DurationStatistics implements Serializable {
    private final double maxMillis;
    private final double medianMillis;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DurationStatistics(double d14, double d15) {
        this.maxMillis = d14;
        this.medianMillis = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DurationStatistics.class != obj.getClass()) {
            return false;
        }
        DurationStatistics durationStatistics = (DurationStatistics) obj;
        return PartialEq.compare(this.maxMillis, durationStatistics.maxMillis) && PartialEq.compare(this.medianMillis, durationStatistics.medianMillis);
    }

    public double getMaxMillis() {
        return this.maxMillis;
    }

    public double getMedianMillis() {
        return this.medianMillis;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.maxMillis), Double.valueOf(this.medianMillis));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[maxMillis: ");
        com.google.protobuf.a.c(this.maxMillis, ", medianMillis: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.medianMillis)));
        sb3.append("]");
        return sb3.toString();
    }
}
