package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleImageRemoveUnused implements Serializable {
    private final String imageId;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleImageRemoveUnused(String str, Date date) {
        this.imageId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleImageRemoveUnused.class != obj.getClass()) {
            return false;
        }
        StyleImageRemoveUnused styleImageRemoveUnused = (StyleImageRemoveUnused) obj;
        return Objects.equals(this.imageId, styleImageRemoveUnused.imageId) && Objects.equals(this.timestamp, styleImageRemoveUnused.timestamp);
    }

    public String getImageId() {
        return this.imageId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.imageId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[imageId: ");
        com.google.protobuf.a.k(this.imageId, ", timestamp: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.timestamp));
        sb3.append("]");
        return sb3.toString();
    }
}
