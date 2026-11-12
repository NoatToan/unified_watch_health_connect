package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SourceAdded implements Serializable {
    private final String sourceId;
    private final Date timestamp;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public SourceAdded(String str, Date date) {
        this.sourceId = str;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SourceAdded.class != obj.getClass()) {
            return false;
        }
        SourceAdded sourceAdded = (SourceAdded) obj;
        return Objects.equals(this.sourceId, sourceAdded.sourceId) && Objects.equals(this.timestamp, sourceAdded.timestamp);
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
