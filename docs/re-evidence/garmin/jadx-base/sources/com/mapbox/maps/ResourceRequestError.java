package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ResourceRequestError implements Serializable {
    private final String message;
    private final RequestErrorType reason;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResourceRequestError(RequestErrorType requestErrorType, String str) {
        this.reason = requestErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequestError.class != obj.getClass()) {
            return false;
        }
        ResourceRequestError resourceRequestError = (ResourceRequestError) obj;
        return Objects.equals(this.reason, resourceRequestError.reason) && Objects.equals(this.message, resourceRequestError.message);
    }

    public String getMessage() {
        return this.message;
    }

    public RequestErrorType getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Objects.hash(this.reason, this.message);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[reason: ");
        sb3.append(RecordUtils.fieldToString(this.reason));
        sb3.append(", message: ");
        return com.google.protobuf.a.a(this.message, "]", sb3);
    }
}
