package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ImportPosition implements Serializable {
    private final String above;

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private final Integer f54387at;
    private final String below;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ImportPosition(String str, String str2, Integer num) {
        this.above = str;
        this.below = str2;
        this.f54387at = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ImportPosition.class != obj.getClass()) {
            return false;
        }
        ImportPosition importPosition = (ImportPosition) obj;
        return Objects.equals(this.above, importPosition.above) && Objects.equals(this.below, importPosition.below) && Objects.equals(this.f54387at, importPosition.f54387at);
    }

    public String getAbove() {
        return this.above;
    }

    public Integer getAt() {
        return this.f54387at;
    }

    public String getBelow() {
        return this.below;
    }

    public int hashCode() {
        return Objects.hash(this.above, this.below, this.f54387at);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[above: ");
        com.google.protobuf.a.k(this.above, ", below: ", sb3);
        com.google.protobuf.a.k(this.below, ", at: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.f54387at));
        sb3.append("]");
        return sb3.toString();
    }
}
