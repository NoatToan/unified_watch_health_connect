package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LayerPosition implements Serializable {
    private final String above;

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private final Integer f54388at;
    private final String below;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public LayerPosition(String str, String str2, Integer num) {
        this.above = str;
        this.below = str2;
        this.f54388at = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LayerPosition.class != obj.getClass()) {
            return false;
        }
        LayerPosition layerPosition = (LayerPosition) obj;
        return Objects.equals(this.above, layerPosition.above) && Objects.equals(this.below, layerPosition.below) && Objects.equals(this.f54388at, layerPosition.f54388at);
    }

    public String getAbove() {
        return this.above;
    }

    public Integer getAt() {
        return this.f54388at;
    }

    public String getBelow() {
        return this.below;
    }

    public int hashCode() {
        return Objects.hash(this.above, this.below, this.f54388at);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[above: ");
        com.google.protobuf.a.k(this.above, ", below: ", sb3);
        com.google.protobuf.a.k(this.below, ", at: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.f54388at));
        sb3.append("]");
        return sb3.toString();
    }
}
