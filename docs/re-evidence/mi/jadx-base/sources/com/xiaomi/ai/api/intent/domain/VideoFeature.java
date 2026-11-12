package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainFeatureType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class VideoFeature implements DomainFeatureType {
    private Optional<Boolean> is_meaningful_entity = Optional.a();
    private Optional<Boolean> is_blacklist_entity = Optional.a();
    private Optional<Boolean> is_play_action = Optional.a();

    public Optional<Boolean> isBlacklistEntity() {
        return this.is_blacklist_entity;
    }

    public Optional<Boolean> isMeaningfulEntity() {
        return this.is_meaningful_entity;
    }

    public Optional<Boolean> isPlayAction() {
        return this.is_play_action;
    }

    public VideoFeature setIsBlacklistEntity(boolean z) {
        this.is_blacklist_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public VideoFeature setIsMeaningfulEntity(boolean z) {
        this.is_meaningful_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public VideoFeature setIsPlayAction(boolean z) {
        this.is_play_action = Optional.e(Boolean.valueOf(z));
        return this;
    }
}
