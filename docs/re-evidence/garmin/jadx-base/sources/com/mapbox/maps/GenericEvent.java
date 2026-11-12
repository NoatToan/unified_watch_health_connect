package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class GenericEvent implements Serializable {
    private final Value data;
    private final String name;
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public GenericEvent(String str, Value value, EventTimeInterval eventTimeInterval) {
        this.name = str;
        this.data = value;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GenericEvent.class != obj.getClass()) {
            return false;
        }
        GenericEvent genericEvent = (GenericEvent) obj;
        return Objects.equals(this.name, genericEvent.name) && Objects.equals(this.data, genericEvent.data) && Objects.equals(this.timeInterval, genericEvent.timeInterval);
    }

    public Value getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.data, this.timeInterval);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[name: ");
        com.google.protobuf.a.k(this.name, ", data: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.data));
        sb3.append(", timeInterval: ");
        sb3.append(RecordUtils.fieldToString(this.timeInterval));
        sb3.append("]");
        return sb3.toString();
    }
}
