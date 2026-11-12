package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class PoiLocation implements DomainType {
    private Optional<SignLocation> sign_location = Optional.a();
    private Optional<Nearby> nearby = Optional.a();

    public Optional<Nearby> getNearby() {
        return this.nearby;
    }

    public Optional<SignLocation> getSignLocation() {
        return this.sign_location;
    }

    public PoiLocation setNearby(Nearby nearby) {
        this.nearby = Optional.e(nearby);
        return this;
    }

    public PoiLocation setSignLocation(SignLocation signLocation) {
        this.sign_location = Optional.e(signLocation);
        return this;
    }
}
