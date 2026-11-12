package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Metrics implements Serializable {
    private final String name;
    private final Value value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Metrics(String str, Value value) {
        this.name = str;
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metrics.class != obj.getClass()) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        return Objects.equals(this.name, metrics.name) && Objects.equals(this.value, metrics.value);
    }

    public String getName() {
        return this.name;
    }

    public Value getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[name: ");
        com.google.protobuf.a.k(this.name, ", value: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.value));
        sb3.append("]");
        return sb3.toString();
    }
}
