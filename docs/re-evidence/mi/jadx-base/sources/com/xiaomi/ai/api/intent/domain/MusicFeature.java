package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainFeatureType;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class MusicFeature implements DomainFeatureType {
    private Optional<Double> intent_score = Optional.a();
    private Optional<Double> whole_sim = Optional.a();
    private Optional<Double> rank = Optional.a();
    private Optional<Boolean> is_meaningful_entity = Optional.a();
    private Optional<Boolean> is_blacklist_entity = Optional.a();
    private Optional<Double> unuseful_info_rate = Optional.a();
    private Optional<Boolean> field_matched = Optional.a();

    public Optional<Double> getIntentScore() {
        return this.intent_score;
    }

    public Optional<Double> getRank() {
        return this.rank;
    }

    public Optional<Double> getUnusefulInfoRate() {
        return this.unuseful_info_rate;
    }

    public Optional<Double> getWholeSim() {
        return this.whole_sim;
    }

    public Optional<Boolean> isBlacklistEntity() {
        return this.is_blacklist_entity;
    }

    public Optional<Boolean> isFieldMatched() {
        return this.field_matched;
    }

    public Optional<Boolean> isMeaningfulEntity() {
        return this.is_meaningful_entity;
    }

    public MusicFeature setFieldMatched(boolean z) {
        this.field_matched = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MusicFeature setIntentScore(double d) {
        this.intent_score = Optional.e(Double.valueOf(d));
        return this;
    }

    public MusicFeature setIsBlacklistEntity(boolean z) {
        this.is_blacklist_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MusicFeature setIsMeaningfulEntity(boolean z) {
        this.is_meaningful_entity = Optional.e(Boolean.valueOf(z));
        return this;
    }

    public MusicFeature setRank(double d) {
        this.rank = Optional.e(Double.valueOf(d));
        return this;
    }

    public MusicFeature setUnusefulInfoRate(double d) {
        this.unuseful_info_rate = Optional.e(Double.valueOf(d));
        return this;
    }

    public MusicFeature setWholeSim(double d) {
        this.whole_sim = Optional.e(Double.valueOf(d));
        return this;
    }
}
