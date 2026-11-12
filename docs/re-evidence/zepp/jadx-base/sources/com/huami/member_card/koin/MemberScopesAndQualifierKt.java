package com.huami.member_card.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "getMemberScope", "member_card_release"}, k = 2, mv = {1, 5, 1})
public final class MemberScopesAndQualifierKt {
    @NotNull
    public static final synchronized Scope getMemberScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, DeviceQualifier.MEMBERSHIP_CARD_QUALIFIER, QualifierKt.named(DeviceQualifier.MEMBERSHIP_CARD_QUALIFIER), null, 4, null);
    }
}
