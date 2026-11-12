package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthRange implements Serializable {
    private final float max;
    private final float min;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DepthRange(float f14, float f15) {
        this.min = f14;
        this.max = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DepthRange.class != obj.getClass()) {
            return false;
        }
        DepthRange depthRange = (DepthRange) obj;
        return PartialEq.compare(this.min, depthRange.min) && PartialEq.compare(this.max, depthRange.max);
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.min), Float.valueOf(this.max));
    }

    public String toString() {
        return "[min: " + RecordUtils.fieldToString(Float.valueOf(this.min)) + ", max: " + RecordUtils.fieldToString(Float.valueOf(this.max)) + "]";
    }
}
