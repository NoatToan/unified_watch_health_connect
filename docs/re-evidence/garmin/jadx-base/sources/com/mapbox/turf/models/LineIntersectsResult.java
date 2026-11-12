package com.mapbox.turf.models;

import hb.a;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class LineIntersectsResult {
    private final Double horizontalIntersection;
    private final boolean onLine1;
    private final boolean onLine2;
    private final Double verticalIntersection;

    private LineIntersectsResult(Double d14, Double d15, boolean z14, boolean z15) {
        this.horizontalIntersection = d14;
        this.verticalIntersection = d15;
        this.onLine1 = z14;
        this.onLine2 = z15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LineIntersectsResult) {
            LineIntersectsResult lineIntersectsResult = (LineIntersectsResult) obj;
            Double d14 = this.horizontalIntersection;
            if (d14 != null ? d14.equals(lineIntersectsResult.horizontalIntersection()) : lineIntersectsResult.horizontalIntersection() == null) {
                Double d15 = this.verticalIntersection;
                if (d15 != null ? d15.equals(lineIntersectsResult.verticalIntersection()) : lineIntersectsResult.verticalIntersection() == null) {
                    if (this.onLine1 == lineIntersectsResult.onLine1() && this.onLine2 == lineIntersectsResult.onLine2()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Double d14 = this.horizontalIntersection;
        int iHashCode = ((d14 == null ? 0 : d14.hashCode()) ^ 1000003) * 1000003;
        Double d15 = this.verticalIntersection;
        return ((((iHashCode ^ (d15 != null ? d15.hashCode() : 0)) * 1000003) ^ (this.onLine1 ? 1231 : 1237)) * 1000003) ^ (this.onLine2 ? 1231 : 1237);
    }

    public Double horizontalIntersection() {
        return this.horizontalIntersection;
    }

    public boolean onLine1() {
        return this.onLine1;
    }

    public boolean onLine2() {
        return this.onLine2;
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LineIntersectsResult{horizontalIntersection=");
        sb3.append(this.horizontalIntersection);
        sb3.append(", verticalIntersection=");
        sb3.append(this.verticalIntersection);
        sb3.append(", onLine1=");
        sb3.append(this.onLine1);
        sb3.append(", onLine2=");
        return a.k(sb3, this.onLine2, StringSubstitutor.DEFAULT_VAR_END);
    }

    public Double verticalIntersection() {
        return this.verticalIntersection;
    }

    public static class Builder {
        private Double horizontalIntersection;
        private Boolean onLine1;
        private Boolean onLine2;
        private Double verticalIntersection;

        private Builder(LineIntersectsResult lineIntersectsResult) {
            Boolean bool = Boolean.FALSE;
            this.onLine1 = bool;
            this.onLine2 = bool;
            this.horizontalIntersection = lineIntersectsResult.horizontalIntersection();
            this.verticalIntersection = lineIntersectsResult.verticalIntersection();
            this.onLine1 = Boolean.valueOf(lineIntersectsResult.onLine1());
            this.onLine2 = Boolean.valueOf(lineIntersectsResult.onLine2());
        }

        public LineIntersectsResult build() {
            String strConcat = this.onLine1 == null ? " onLine1" : "";
            if (this.onLine2 == null) {
                strConcat = strConcat.concat(" onLine2");
            }
            if (strConcat.isEmpty()) {
                return new LineIntersectsResult(this.horizontalIntersection, this.verticalIntersection, this.onLine1.booleanValue(), this.onLine2.booleanValue());
            }
            h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public Builder horizontalIntersection(Double d14) {
            this.horizontalIntersection = d14;
            return this;
        }

        public Builder onLine1(boolean z14) {
            this.onLine1 = Boolean.valueOf(z14);
            return this;
        }

        public Builder onLine2(boolean z14) {
            this.onLine2 = Boolean.valueOf(z14);
            return this;
        }

        public Builder verticalIntersection(Double d14) {
            this.verticalIntersection = d14;
            return this;
        }

        public Builder() {
            Boolean bool = Boolean.FALSE;
            this.onLine1 = bool;
            this.onLine2 = bool;
        }
    }
}
