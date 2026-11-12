package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Vec4 implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final double f54401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f54402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f54403y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f54404z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec4(double d14, double d15, double d16, double d17) {
        this.f54402x = d14;
        this.f54403y = d15;
        this.f54404z = d16;
        this.f54401w = d17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec4.class != obj.getClass()) {
            return false;
        }
        Vec4 vec4 = (Vec4) obj;
        return PartialEq.compare(this.f54402x, vec4.f54402x) && PartialEq.compare(this.f54403y, vec4.f54403y) && PartialEq.compare(this.f54404z, vec4.f54404z) && PartialEq.compare(this.f54401w, vec4.f54401w);
    }

    public double getW() {
        return this.f54401w;
    }

    public double getX() {
        return this.f54402x;
    }

    public double getY() {
        return this.f54403y;
    }

    public double getZ() {
        return this.f54404z;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f54402x), Double.valueOf(this.f54403y), Double.valueOf(this.f54404z), Double.valueOf(this.f54401w));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[x: ");
        com.google.protobuf.a.c(this.f54402x, ", y: ", sb3);
        com.google.protobuf.a.c(this.f54403y, ", z: ", sb3);
        com.google.protobuf.a.c(this.f54404z, ", w: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.f54401w)));
        sb3.append("]");
        return sb3.toString();
    }
}
