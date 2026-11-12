package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Vec3 implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f54398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f54399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f54400z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec3(double d14, double d15, double d16) {
        this.f54398x = d14;
        this.f54399y = d15;
        this.f54400z = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec3.class != obj.getClass()) {
            return false;
        }
        Vec3 vec3 = (Vec3) obj;
        return PartialEq.compare(this.f54398x, vec3.f54398x) && PartialEq.compare(this.f54399y, vec3.f54399y) && PartialEq.compare(this.f54400z, vec3.f54400z);
    }

    public double getX() {
        return this.f54398x;
    }

    public double getY() {
        return this.f54399y;
    }

    public double getZ() {
        return this.f54400z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f54398x), Double.valueOf(this.f54399y), Double.valueOf(this.f54400z));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[x: ");
        com.google.protobuf.a.c(this.f54398x, ", y: ", sb3);
        com.google.protobuf.a.c(this.f54399y, ", z: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.f54400z)));
        sb3.append("]");
        return sb3.toString();
    }
}
