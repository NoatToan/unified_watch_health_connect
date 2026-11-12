package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileCacheBudgetInTiles implements Serializable {
    private final long size;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public TileCacheBudgetInTiles(long j8) {
        this.size = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((TileCacheBudgetInTiles) obj).size;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.size));
    }

    public String toString() {
        return "[size: " + RecordUtils.fieldToString(Long.valueOf(this.size)) + "]";
    }
}
