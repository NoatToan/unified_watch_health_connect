package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderedQueryOptions implements Serializable {
    private final Value filter;
    private final List<String> layerIds;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RenderedQueryOptions(List<String> list, Value value) {
        this.layerIds = list;
        this.filter = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderedQueryOptions.class != obj.getClass()) {
            return false;
        }
        RenderedQueryOptions renderedQueryOptions = (RenderedQueryOptions) obj;
        return Objects.equals(this.layerIds, renderedQueryOptions.layerIds) && Objects.equals(this.filter, renderedQueryOptions.filter);
    }

    public Value getFilter() {
        return this.filter;
    }

    public List<String> getLayerIds() {
        return this.layerIds;
    }

    public int hashCode() {
        return Objects.hash(this.layerIds, this.filter);
    }

    public String toString() {
        return "[layerIds: " + RecordUtils.fieldToString(this.layerIds) + ", filter: " + RecordUtils.fieldToString(this.filter) + "]";
    }
}
