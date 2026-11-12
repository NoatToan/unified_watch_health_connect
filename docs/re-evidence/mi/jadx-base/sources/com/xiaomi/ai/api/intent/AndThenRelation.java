package com.xiaomi.ai.api.intent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AndThenRelation extends IntentsWithRelation {
    private List<IntentsWithRelation> relations;

    public AndThenRelation(List<IntentsWithRelation> list) {
        this.relations = list;
        Iterator<IntentsWithRelation> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof AndThenRelation) {
                throw new IllegalArgumentException("andthen shouldn't not be nested in andthen relation!");
            }
        }
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<IntentExecutor> executors() {
        ArrayList arrayList = new ArrayList();
        for (IntentsWithRelation intentsWithRelation : this.relations) {
            if (!intentsWithRelation.executors().isEmpty()) {
                arrayList.addAll(intentsWithRelation.executors());
            }
        }
        return arrayList;
    }

    public List<IntentsWithRelation> getRelations() {
        return this.relations;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<Intention> intents() {
        ArrayList arrayList = new ArrayList();
        Iterator<IntentsWithRelation> it = this.relations.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().intents());
        }
        return arrayList;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<SelfRelation> relationFlatten() {
        ArrayList arrayList = new ArrayList();
        Iterator<IntentsWithRelation> it = this.relations.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().relationFlatten());
        }
        return arrayList;
    }
}
