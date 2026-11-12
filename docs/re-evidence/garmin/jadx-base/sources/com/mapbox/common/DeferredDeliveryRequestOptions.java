package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredDeliveryRequestOptions implements Serializable {
    private final long ttl;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DeferredDeliveryRequestOptions() {
        this.ttl = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ttl == ((DeferredDeliveryRequestOptions) obj).ttl;
    }

    public long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.ttl));
    }

    public String toString() {
        return "[ttl: " + RecordUtils.fieldToString(Long.valueOf(this.ttl)) + "]";
    }

    public DeferredDeliveryRequestOptions(long j8) {
        this.ttl = j8;
    }
}
