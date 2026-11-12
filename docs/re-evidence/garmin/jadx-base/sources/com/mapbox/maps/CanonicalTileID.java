package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CanonicalTileID implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f54383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f54384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final byte f54385z;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CanonicalTileID(byte b14, int i14, int i15) {
        this.f54385z = b14;
        this.f54383x = i14;
        this.f54384y = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CanonicalTileID.class != obj.getClass()) {
            return false;
        }
        CanonicalTileID canonicalTileID = (CanonicalTileID) obj;
        return this.f54385z == canonicalTileID.f54385z && this.f54383x == canonicalTileID.f54383x && this.f54384y == canonicalTileID.f54384y;
    }

    public int getX() {
        return this.f54383x;
    }

    public int getY() {
        return this.f54384y;
    }

    public byte getZ() {
        return this.f54385z;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.f54385z), Integer.valueOf(this.f54383x), Integer.valueOf(this.f54384y));
    }

    public String toString() {
        return "[z: " + RecordUtils.fieldToString(Byte.valueOf(this.f54385z)) + ", x: " + RecordUtils.fieldToString(Integer.valueOf(this.f54383x)) + ", y: " + RecordUtils.fieldToString(Integer.valueOf(this.f54384y)) + "]";
    }
}
