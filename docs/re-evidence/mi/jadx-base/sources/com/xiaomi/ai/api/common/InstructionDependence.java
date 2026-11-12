package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class InstructionDependence {
    private String id;
    private Optional<String> predicate;

    public InstructionDependence() {
    }

    public InstructionDependence(String str, Optional<String> optional) {
        this.id = str;
        this.predicate = optional;
    }

    public String getId() {
        return this.id;
    }

    public Optional<String> getPredicate() {
        Optional<String> optional = this.predicate;
        return Optional.e((optional == null || !optional.c()) ? null : this.predicate.b());
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPredicate(String str) {
        this.predicate = Optional.e(str);
    }
}
