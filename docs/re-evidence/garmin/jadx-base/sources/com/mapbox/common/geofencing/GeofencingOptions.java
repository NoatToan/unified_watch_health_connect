package com.mapbox.common.geofencing;

import com.mapbox.annotation.MapboxExperimental;
import d53.n;
import java.io.Serializable;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingOptions;", "Ljava/io/Serializable;", "maximumMonitoredFeatures", "", "(I)V", "getMaximumMonitoredFeatures", "()I", "equals", "", "other", "", "hashCode", "toBuilder", "Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "toString", "", "Builder", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeofencingOptions implements Serializable {
    private final int maximumMonitoredFeatures;

    private GeofencingOptions(int i14) {
        this.maximumMonitoredFeatures = i14;
    }

    public boolean equals(Object other) {
        return (other instanceof GeofencingOptions) && this.maximumMonitoredFeatures == ((GeofencingOptions) other).maximumMonitoredFeatures;
    }

    public final int getMaximumMonitoredFeatures() {
        return this.maximumMonitoredFeatures;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maximumMonitoredFeatures));
    }

    @MapboxExperimental
    public final Builder toBuilder() {
        return new Builder().setMaximumMonitoredFeatures(this.maximumMonitoredFeatures);
    }

    public String toString() {
        return n.c("\n        GeofencingOptions(\n            maximumMonitoredFeatures=" + this.maximumMonitoredFeatures + "\n        )\n    ");
    }

    @MapboxExperimental
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "", "()V", "<set-?>", "", "maximumMonitoredFeatures", "getMaximumMonitoredFeatures", "()Ljava/lang/Integer;", "setMaximumMonitoredFeatures", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Integer maximumMonitoredFeatures = 100000;

        @MapboxExperimental
        public final GeofencingOptions build() {
            Integer num = this.maximumMonitoredFeatures;
            if (num != null) {
                num.getClass();
                return new GeofencingOptions(num.intValue(), null);
            }
            h.s("Could not build an instance of GeofencingOptions through GeofencingOptions.Builder because maximumMonitoredFeatures was null.");
            return null;
        }

        public final Integer getMaximumMonitoredFeatures() {
            return this.maximumMonitoredFeatures;
        }

        public final Builder setMaximumMonitoredFeatures(int maximumMonitoredFeatures) {
            this.maximumMonitoredFeatures = Integer.valueOf(maximumMonitoredFeatures);
            return this;
        }

        public final /* synthetic */ void setMaximumMonitoredFeatures(Integer num) {
            this.maximumMonitoredFeatures = num;
        }
    }

    public /* synthetic */ GeofencingOptions(int i14, j jVar) {
        this(i14);
    }
}
