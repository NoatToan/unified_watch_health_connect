package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainFeatureType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class MapFeature implements DomainFeatureType {
    private Optional<Boolean> is_meaningful_entity = Optional.a();
    private Optional<Boolean> is_blacklist_entity = Optional.a();
    private Optional<Boolean> is_keyword_match = Optional.a();
    private Optional<Boolean> is_llm_response = Optional.a();
    private Optional<Boolean> is_oneshot = Optional.a();

    public Optional<Boolean> isBlacklistEntity() {
        return this.is_blacklist_entity;
    }

    public Optional<Boolean> isKeywordMatch() {
        return this.is_keyword_match;
    }

    public Optional<Boolean> isLlmResponse() {
        return this.is_llm_response;
    }

    public Optional<Boolean> isMeaningfulEntity() {
        return this.is_meaningful_entity;
    }

    public Optional<Boolean> isOneshot() {
        return this.is_oneshot;
    }

    public MapFeature setIsBlacklistEntity(boolean z) {
        this.is_blacklist_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MapFeature setIsKeywordMatch(boolean z) {
        this.is_keyword_match = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MapFeature setIsLlmResponse(boolean z) {
        this.is_llm_response = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MapFeature setIsMeaningfulEntity(boolean z) {
        this.is_meaningful_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MapFeature setIsOneshot(boolean z) {
        this.is_oneshot = Optional.e(Boolean.valueOf(z));
        return this;
    }
}
