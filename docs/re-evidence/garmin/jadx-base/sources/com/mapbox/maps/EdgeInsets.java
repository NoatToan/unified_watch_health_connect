package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class EdgeInsets implements Serializable {
    private final double bottom;
    private final double left;
    private final double right;
    private final double top;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EdgeInsets(double d14, double d15, double d16, double d17) {
        this.top = d14;
        this.left = d15;
        this.bottom = d16;
        this.right = d17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EdgeInsets.class != obj.getClass()) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return PartialEq.compare(this.top, edgeInsets.top) && PartialEq.compare(this.left, edgeInsets.left) && PartialEq.compare(this.bottom, edgeInsets.bottom) && PartialEq.compare(this.right, edgeInsets.right);
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.top), Double.valueOf(this.left), Double.valueOf(this.bottom), Double.valueOf(this.right));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[top: ");
        com.google.protobuf.a.c(this.top, ", left: ", sb3);
        com.google.protobuf.a.c(this.left, ", bottom: ", sb3);
        com.google.protobuf.a.c(this.bottom, ", right: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.right)));
        sb3.append("]");
        return sb3.toString();
    }
}
