package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.common.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IntentionAction2<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction1<A> {
    public IntentionAction2(A a2) {
        super(a2);
    }

    public abstract Pair<String, B> __2();

    @Override // com.xiaomi.ai.api.intent.IntentionAction1
    public List<Pair<String, IntentionEntity<?, ?>>> entityNames() {
        List<Pair<String, IntentionEntity<?, ?>>> listEntityNames = super.entityNames();
        listEntityNames.add(__2());
        return listEntityNames;
    }
}
