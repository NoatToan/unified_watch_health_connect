package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleObjectInfo implements Serializable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f54395id;
    private final String type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleObjectInfo(String str, String str2) {
        this.f54395id = str;
        this.type = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleObjectInfo.class != obj.getClass()) {
            return false;
        }
        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) obj;
        return Objects.equals(this.f54395id, styleObjectInfo.f54395id) && Objects.equals(this.type, styleObjectInfo.type);
    }

    public String getId() {
        return this.f54395id;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.f54395id, this.type);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[id: ");
        com.google.protobuf.a.k(this.f54395id, ", type: ", sb3);
        return com.google.protobuf.a.a(this.type, "]", sb3);
    }
}
