package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.common.Optional;
import com.xiaomi.common.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IntentionAction1<A extends IntentionEntity<?, ?>> implements IntentionAction {
    private A object;

    public IntentionAction1(A a2) {
        this.object = a2;
    }

    public Pair<String, A> __1() {
        return Pair.of("object", this.object);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionAction
    public action.ActionName actionName() {
        String simpleName = getClass().getSimpleName();
        ArrayList arrayList = new ArrayList();
        for (Pair<String, IntentionEntity<?, ?>> pair : entityNames()) {
            arrayList.add(Pair.of(pair.left, pair.right.entityName()));
        }
        return action.ActionName.newInstance(simpleName, arrayList);
    }

    public <T extends IntentionEntity<?, ?>> List<Pair<String, IntentionEntity<?, ?>>> append(Pair<String, Optional<T>> pair, List<Pair<String, IntentionEntity<?, ?>>> list) {
        if (pair.right.c()) {
            list.add(Pair.of(pair.left, pair.right.b()));
        }
        return list;
    }

    public List<Pair<String, IntentionEntity<?, ?>>> entityNames() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(__1());
        return arrayList;
    }
}
