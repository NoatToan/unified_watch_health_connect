package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainFeatureType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class StationFeature implements DomainFeatureType {
    private Optional<Boolean> is_meaningful_entity = Optional.a();
    private Optional<Boolean> is_blacklist_entity = Optional.a();

    public Optional<Boolean> isBlacklistEntity() {
        return this.is_blacklist_entity;
    }

    public Optional<Boolean> isMeaningfulEntity() {
        return this.is_meaningful_entity;
    }

    public StationFeature setIsBlacklistEntity(boolean z) {
        this.is_blacklist_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public StationFeature setIsMeaningfulEntity(boolean z) {
        this.is_meaningful_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }
}
