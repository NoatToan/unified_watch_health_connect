package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SelfRelation extends IntentsWithRelation {
    private Optional<Slot<IntentExecutor>> executor;
    private Intention intent;

    public SelfRelation(Intention intention) {
        this.executor = Optional.a();
        this.intent = intention;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<IntentExecutor> executors() {
        return !this.executor.c() ? new ArrayList(0) : this.executor.b().getValues();
    }

    public Optional<Slot<IntentExecutor>> getExecutor() {
        return this.executor;
    }

    public Intention getIntent() {
        return this.intent;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<Intention> intents() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.intent);
        return arrayList;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<SelfRelation> relationFlatten() {
        return Arrays.asList(this);
    }

    public void setExecutor(Optional<Slot<IntentExecutor>> optional) {
        this.executor = optional;
    }

    public SelfRelation(Intention intention, Optional<Slot<IntentExecutor>> optional) {
        Optional.a();
        this.intent = intention;
        this.executor = optional;
    }
}
