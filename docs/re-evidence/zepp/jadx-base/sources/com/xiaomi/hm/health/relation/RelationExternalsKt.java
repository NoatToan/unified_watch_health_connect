package com.xiaomi.hm.health.relation;

import com.huami.account.service.AccountService;
import com.huami.relatives.FriendsAndFamilyInject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0013\u0010\u0003\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/huami/relatives/FriendsAndFamilyInject;", "getFriendsAndFamilyInjectDelegate", "()Lcom/huami/relatives/FriendsAndFamilyInject;", "friendsAndFamilyInjectDelegate", "Lcom/huami/account/service/AccountService;", "getAccountService", "()Lcom/huami/account/service/AccountService;", "accountService", "relatives_release"}, k = 2, mv = {1, 5, 1})
public final class RelationExternalsKt {
    @NotNull
    public static final AccountService getAccountService() {
        return RelationExternalContainer.INSTANCE.getACCOUNT_SERVICE();
    }

    @NotNull
    public static final FriendsAndFamilyInject getFriendsAndFamilyInjectDelegate() {
        return RelationExternalContainer.INSTANCE.getFRIENDS_AND_FAMILY_INJECT();
    }
}
