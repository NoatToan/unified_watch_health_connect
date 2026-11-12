package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class Nearby implements DomainType {
    private Optional<SignLocation> sign_location = Optional.a();
    private Optional<Double> distance = Optional.a();
    private Optional<Boolean> nearest = Optional.a();
    private Optional<Boolean> is_next = Optional.a();
    private Optional<Integer> ordinal = Optional.a();
    private Optional<NearbyType> nearby_type = Optional.a();

    public Optional<Double> getDistance() {
        return this.distance;
    }

    public Optional<NearbyType> getNearbyType() {
        return this.nearby_type;
    }

    public Optional<Integer> getOrdinal() {
        return this.ordinal;
    }

    public Optional<SignLocation> getSignLocation() {
        return this.sign_location;
    }

    public Optional<Boolean> isNearest() {
        return this.nearest;
    }

    public Optional<Boolean> isNext() {
        return this.is_next;
    }

    public Nearby setDistance(double d) {
        this.distance = Optional.e(Double.valueOf(d));
        return this;
    }

    public Nearby setIsNext(boolean z) {
        this.is_next = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public Nearby setNearbyType(NearbyType nearbyType) {
        this.nearby_type = Optional.e(nearbyType);
        return this;
    }

    public Nearby setNearest(boolean z) {
        this.nearest = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public Nearby setOrdinal(int i) {
        this.ordinal = Optional.e(Integer.valueOf(i));
        return this;
    }

    public Nearby setSignLocation(SignLocation signLocation) {
        this.sign_location = Optional.e(signLocation);
        return this;
    }
}
