package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Vec2 implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f54396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f54397y;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Vec2(double d14, double d15) {
        this.f54396x = d14;
        this.f54397y = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Vec2.class != obj.getClass()) {
            return false;
        }
        Vec2 vec2 = (Vec2) obj;
        return PartialEq.compare(this.f54396x, vec2.f54396x) && PartialEq.compare(this.f54397y, vec2.f54397y);
    }

    public double getX() {
        return this.f54396x;
    }

    public double getY() {
        return this.f54397y;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.f54396x), Double.valueOf(this.f54397y));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[x: ");
        com.google.protobuf.a.c(this.f54396x, ", y: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.f54397y)));
        sb3.append("]");
        return sb3.toString();
    }
}
