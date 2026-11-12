package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class AccountsSync<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Duration>> delay = Optional.a();

    public static AccountsSync read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AccountsSync accountsSync = new AccountsSync();
        if (zsdVar.z("delay")) {
            accountsSync.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
        }
        return accountsSync;
    }

    public static zsd write(AccountsSync accountsSync) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (accountsSync.delay.c()) {
            c4hVarCreateObjectNode.f0("delay", IntentUtils.writeSlot(accountsSync.delay.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Miai.Duration>> getDelay() {
        return this.delay;
    }

    public AccountsSync setDelay(Slot<Miai.Duration> slot) {
        this.delay = Optional.e(slot);
        return this;
    }
}
