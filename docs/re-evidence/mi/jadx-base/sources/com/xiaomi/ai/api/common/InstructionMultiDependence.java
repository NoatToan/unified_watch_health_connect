package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class InstructionMultiDependence {
    private Optional<String> condition;
    private List<String> ids;
    private Optional<String> predicate;

    public InstructionMultiDependence(List<String> list, Optional<String> optional, Optional<String> optional2) {
        this.ids = list;
        this.predicate = optional;
        this.condition = optional2;
    }

    public Optional<String> getCondition() {
        return this.condition;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public Optional<String> getPredicate() {
        return this.predicate;
    }

    public void setCondition(Optional<String> optional) {
        this.condition = optional;
    }

    public void setIds(List<String> list) {
        this.ids = list;
    }

    public void setPredicate(Optional<String> optional) {
        this.predicate = optional;
    }

    public InstructionMultiDependence() {
    }
}
