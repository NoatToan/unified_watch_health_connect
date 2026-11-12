package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class LocationProviderRequest implements Serializable {
    private final AccuracyLevel accuracy;
    private final Float displacement;
    private final IntervalSettings interval;

    public static final class Builder {
        private AccuracyLevel accuracy;
        private Float displacement;
        private IntervalSettings interval;

        public Builder accuracy(AccuracyLevel accuracyLevel) {
            this.accuracy = accuracyLevel;
            return this;
        }

        public LocationProviderRequest build() {
            return new LocationProviderRequest(this.accuracy, this.displacement, this.interval);
        }

        public Builder displacement(Float f14) {
            this.displacement = f14;
            return this;
        }

        public Builder interval(IntervalSettings intervalSettings) {
            this.interval = intervalSettings;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private LocationProviderRequest(AccuracyLevel accuracyLevel, Float f14, IntervalSettings intervalSettings) {
        this.accuracy = accuracyLevel;
        this.displacement = f14;
        this.interval = intervalSettings;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationProviderRequest locationProviderRequest = (LocationProviderRequest) obj;
        return Objects.equals(this.accuracy, locationProviderRequest.accuracy) && Objects.equals(this.displacement, locationProviderRequest.displacement) && Objects.equals(this.interval, locationProviderRequest.interval);
    }

    public AccuracyLevel getAccuracy() {
        return this.accuracy;
    }

    public Float getDisplacement() {
        return this.displacement;
    }

    public IntervalSettings getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return Objects.hash(this.accuracy, this.displacement, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().accuracy(this.accuracy).displacement(this.displacement).interval(this.interval);
    }

    public String toString() {
        return "[accuracy: " + RecordUtils.fieldToString(this.accuracy) + ", displacement: " + RecordUtils.fieldToString(this.displacement) + ", interval: " + RecordUtils.fieldToString(this.interval) + "]";
    }
}
