package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceDescription implements Serializable {
    private final TileDataDomain domain;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceDescription(TileDataDomain tileDataDomain, String str) {
        this.domain = tileDataDomain;
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDescription resourceDescription = (ResourceDescription) obj;
        return Objects.equals(this.domain, resourceDescription.domain) && Objects.equals(this.url, resourceDescription.url);
    }

    public TileDataDomain getDomain() {
        return this.domain;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.domain, this.url);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[domain: ");
        sb3.append(RecordUtils.fieldToString(this.domain));
        sb3.append(", url: ");
        return com.google.protobuf.a.a(this.url, "]", sb3);
    }
}
