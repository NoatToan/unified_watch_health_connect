package com.mapbox.maps;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Image implements Serializable {
    private final DataRef data;
    private final int height;
    private final int width;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Image(int i14, int i15, DataRef dataRef) {
        this.width = i14;
        this.height = i15;
        this.data = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Image.class != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        return this.width == image.width && this.height == image.height && Objects.equals(this.data, image.data);
    }

    public DataRef getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.width), Integer.valueOf(this.height), this.data);
    }

    public String toString() {
        return "[width: " + RecordUtils.fieldToString(Integer.valueOf(this.width)) + ", height: " + RecordUtils.fieldToString(Integer.valueOf(this.height)) + ", data: " + RecordUtils.fieldToString(this.data) + "]";
    }
}
