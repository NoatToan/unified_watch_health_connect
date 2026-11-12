package com.mapbox.common;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class PersistentStorageData implements Serializable {
    private final String key;
    private final Date timestamp;
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageData(String str, Date date, DataRef dataRef) {
        this.key = str;
        this.timestamp = date;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageData persistentStorageData = (PersistentStorageData) obj;
        return Objects.equals(this.key, persistentStorageData.key) && Objects.equals(this.timestamp, persistentStorageData.timestamp) && Objects.equals(this.value, persistentStorageData.value);
    }

    public String getKey() {
        return this.key;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.timestamp, this.value);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[key: ");
        com.google.protobuf.a.k(this.key, ", timestamp: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.timestamp));
        sb3.append(", value: ");
        sb3.append(RecordUtils.fieldToString(this.value));
        sb3.append("]");
        return sb3.toString();
    }
}
