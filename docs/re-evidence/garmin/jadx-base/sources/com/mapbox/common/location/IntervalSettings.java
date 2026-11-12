package com.mapbox.common.location;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class IntervalSettings implements Serializable {
    private final Long interval;
    private final Long maximumInterval;
    private final Long minimumInterval;

    public static final class Builder {
        private Long interval;
        private Long maximumInterval;
        private Long minimumInterval;

        public IntervalSettings build() {
            return new IntervalSettings(this.minimumInterval, this.maximumInterval, this.interval);
        }

        public Builder interval(Long l14) {
            this.interval = l14;
            return this;
        }

        public Builder maximumInterval(Long l14) {
            this.maximumInterval = l14;
            return this;
        }

        public Builder minimumInterval(Long l14) {
            this.minimumInterval = l14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private IntervalSettings(Long l14, Long l15, Long l16) {
        this.minimumInterval = l14;
        this.maximumInterval = l15;
        this.interval = l16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalSettings intervalSettings = (IntervalSettings) obj;
        return Objects.equals(this.minimumInterval, intervalSettings.minimumInterval) && Objects.equals(this.maximumInterval, intervalSettings.maximumInterval) && Objects.equals(this.interval, intervalSettings.interval);
    }

    public Long getInterval() {
        return this.interval;
    }

    public Long getMaximumInterval() {
        return this.maximumInterval;
    }

    public Long getMinimumInterval() {
        return this.minimumInterval;
    }

    public int hashCode() {
        return Objects.hash(this.minimumInterval, this.maximumInterval, this.interval);
    }

    public Builder toBuilder() {
        return new Builder().minimumInterval(this.minimumInterval).maximumInterval(this.maximumInterval).interval(this.interval);
    }

    public String toString() {
        return "[minimumInterval: " + RecordUtils.fieldToString(this.minimumInterval) + ", maximumInterval: " + RecordUtils.fieldToString(this.maximumInterval) + ", interval: " + RecordUtils.fieldToString(this.interval) + "]";
    }
}
