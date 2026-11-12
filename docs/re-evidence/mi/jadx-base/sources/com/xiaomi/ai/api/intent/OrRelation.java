package com.xiaomi.ai.api.intent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OrRelation extends IntentsWithRelation {
    private List<SelfRelation> selfRelations;

    public OrRelation(List<SelfRelation> list) {
        this.selfRelations = list;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<IntentExecutor> executors() {
        ArrayList arrayList = new ArrayList(0);
        for (SelfRelation selfRelation : this.selfRelations) {
            if (!selfRelation.executors().isEmpty()) {
                arrayList.addAll(selfRelation.executors());
            }
        }
        return arrayList;
    }

    public List<SelfRelation> getSelfRelations() {
        return this.selfRelations;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<Intention> intents() {
        ArrayList arrayList = new ArrayList();
        Iterator<SelfRelation> it = this.selfRelations.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().intents());
        }
        return arrayList;
    }

    @Override // com.xiaomi.ai.api.intent.IntentsWithRelation
    public List<SelfRelation> relationFlatten() {
        return this.selfRelations;
    }
}
