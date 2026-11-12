package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class LocationError implements Serializable {
    private final LocationErrorCode code;
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LocationError(LocationErrorCode locationErrorCode, String str) {
        this.code = locationErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationError locationError = (LocationError) obj;
        return Objects.equals(this.code, locationError.code) && Objects.equals(this.message, locationError.message);
    }

    public LocationErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[code: ");
        sb3.append(RecordUtils.fieldToString(this.code));
        sb3.append(", message: ");
        return com.google.protobuf.a.a(this.message, "]", sb3);
    }
}
