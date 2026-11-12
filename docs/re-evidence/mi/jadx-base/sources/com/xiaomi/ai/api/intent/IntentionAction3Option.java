package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.common.Optional;
import com.xiaomi.common.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IntentionAction3Option<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>, C extends IntentionEntity<?, ?>> extends IntentionAction1<A> {
    public IntentionAction3Option(A a2) {
        super(a2);
    }

    public abstract Pair<String, Optional<B>> __2();

    public abstract Pair<String, Optional<C>> __3();

    @Override // com.xiaomi.ai.api.intent.IntentionAction1
    public List<Pair<String, IntentionEntity<?, ?>>> entityNames() {
        List<Pair<String, IntentionEntity<?, ?>>> listEntityNames = super.entityNames();
        append(__2(), listEntityNames);
        append(__3(), listEntityNames);
        return listEntityNames;
    }
}
