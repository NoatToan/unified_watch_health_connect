package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MercatorCoordinate implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f54389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f54390y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MercatorCoordinate(double d14, double d15) {
        this.f54389x = d14;
        this.f54390y = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MercatorCoordinate.class != obj.getClass()) {
            return false;
        }
        MercatorCoordinate mercatorCoordinate = (MercatorCoordinate) obj;
        return PartialEq.compare(this.f54389x, mercatorCoordinate.f54389x) && PartialEq.compare(this.f54390y, mercatorCoordinate.f54390y);
    }

    public double getX() {
        return this.f54389x;
    }

    public double getY() {
        return this.f54390y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f54389x), Double.valueOf(this.f54390y));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[x: ");
        com.google.protobuf.a.c(this.f54389x, ", y: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.f54390y)));
        sb3.append("]");
        return sb3.toString();
    }
}
