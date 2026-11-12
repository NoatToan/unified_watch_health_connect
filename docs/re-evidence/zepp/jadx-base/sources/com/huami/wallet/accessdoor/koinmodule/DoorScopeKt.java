package com.huami.wallet.accessdoor.koinmodule;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "doorScope", "", "stopDoorScope", "access-door_release"}, k = 2, mv = {1, 5, 1})
public final class DoorScopeKt {
    @NotNull
    public static final Scope doorScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, DoorScopeNames.OPEN_CARD_SCOPE, QualifierKt.named(DoorScopeNames.OPEN_CARD_SCOPE), null, 4, null);
    }

    public static final void stopDoorScope() {
        doorScope(GlobalContext.INSTANCE.get()).close();
    }
}
