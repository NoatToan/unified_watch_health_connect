package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenCoordinate implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f54393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f54394y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ScreenCoordinate(double d14, double d15) {
        this.f54393x = d14;
        this.f54394y = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScreenCoordinate.class != obj.getClass()) {
            return false;
        }
        ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
        return PartialEq.compare(this.f54393x, screenCoordinate.f54393x) && PartialEq.compare(this.f54394y, screenCoordinate.f54394y);
    }

    public double getX() {
        return this.f54393x;
    }

    public double getY() {
        return this.f54394y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f54393x), Double.valueOf(this.f54394y));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[x: ");
        com.google.protobuf.a.c(this.f54393x, ", y: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.f54394y)));
        sb3.append("]");
        return sb3.toString();
    }
}
