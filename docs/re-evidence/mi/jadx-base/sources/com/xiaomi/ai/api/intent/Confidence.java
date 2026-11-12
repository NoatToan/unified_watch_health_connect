package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class Confidence {
    private Optional<Double> effective_ratio;
    private Optional<Double> entity_degree;
    private Optional<Boolean> exact_entity;
    private Optional<Boolean> hit_key_slots;
    private Optional<Boolean> hit_white;
    private Optional<Boolean> strong;

    public Confidence() {
        this.strong = Optional.a();
        this.hit_key_slots = Optional.a();
        this.exact_entity = Optional.a();
        this.entity_degree = Optional.a();
        this.hit_white = Optional.a();
        this.effective_ratio = Optional.a();
    }

    public Optional<Double> getEffective_ratio() {
        return this.effective_ratio;
    }

    public Optional<Double> getEntity_degree() {
        return this.entity_degree;
    }

    public Optional<Boolean> getExact_entity() {
        return this.exact_entity;
    }

    public Optional<Boolean> getHit_key_slots() {
        return this.hit_key_slots;
    }

    public Optional<Boolean> getHit_white() {
        return this.hit_white;
    }

    public Optional<Boolean> getStrong() {
        return this.strong;
    }

    public void setEffective_ratio(Optional<Double> optional) {
        this.effective_ratio = optional;
    }

    public void setEntity_degree(Optional<Double> optional) {
        this.entity_degree = optional;
    }

    public void setExact_entity(Optional<Boolean> optional) {
        this.exact_entity = optional;
    }

    public void setHit_key_slots(Optional<Boolean> optional) {
        this.hit_key_slots = optional;
    }

    public void setHit_white(Optional<Boolean> optional) {
        this.hit_white = optional;
    }

    public void setStrong(Optional<Boolean> optional) {
        this.strong = optional;
    }

    public Confidence(Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Double> optional4, Optional<Boolean> optional5, Optional<Double> optional6) {
        this.strong = Optional.a();
        this.hit_key_slots = Optional.a();
        this.exact_entity = Optional.a();
        this.entity_degree = Optional.a();
        this.hit_white = Optional.a();
        Optional.a();
        this.strong = optional;
        this.hit_key_slots = optional2;
        this.exact_entity = optional3;
        this.entity_degree = optional4;
        this.hit_white = optional5;
        this.effective_ratio = optional6;
    }
}
