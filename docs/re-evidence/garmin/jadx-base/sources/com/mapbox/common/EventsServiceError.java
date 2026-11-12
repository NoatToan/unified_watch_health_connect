package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class EventsServiceError implements Serializable {
    private final EventsServiceErrorCode code;
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public EventsServiceError(EventsServiceErrorCode eventsServiceErrorCode, String str) {
        this.code = eventsServiceErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventsServiceError eventsServiceError = (EventsServiceError) obj;
        return Objects.equals(this.code, eventsServiceError.code) && Objects.equals(this.message, eventsServiceError.message);
    }

    public EventsServiceErrorCode getCode() {
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
