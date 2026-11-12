package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageStretches implements Serializable {
    private final float first;
    private final float second;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImageStretches(float f14, float f15) {
        this.first = f14;
        this.second = f15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageStretches.class != obj.getClass()) {
            return false;
        }
        ImageStretches imageStretches = (ImageStretches) obj;
        return PartialEq.compare(this.first, imageStretches.first) && PartialEq.compare(this.second, imageStretches.second);
    }

    public float getFirst() {
        return this.first;
    }

    public float getSecond() {
        return this.second;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.first), Float.valueOf(this.second));
    }

    public String toString() {
        return "[first: " + RecordUtils.fieldToString(Float.valueOf(this.first)) + ", second: " + RecordUtils.fieldToString(Float.valueOf(this.second)) + "]";
    }
}
