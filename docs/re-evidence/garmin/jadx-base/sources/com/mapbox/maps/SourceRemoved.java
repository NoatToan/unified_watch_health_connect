package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SourceRemoved implements Serializable {
    private final String sourceId;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceRemoved(String str, Date date) {
        this.sourceId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceRemoved.class != obj.getClass()) {
            return false;
        }
        SourceRemoved sourceRemoved = (SourceRemoved) obj;
        return Objects.equals(this.sourceId, sourceRemoved.sourceId) && Objects.equals(this.timestamp, sourceRemoved.timestamp);
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.sourceId, this.timestamp);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[sourceId: ");
        com.google.protobuf.a.k(this.sourceId, ", timestamp: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.timestamp));
        sb3.append("]");
        return sb3.toString();
    }
}
