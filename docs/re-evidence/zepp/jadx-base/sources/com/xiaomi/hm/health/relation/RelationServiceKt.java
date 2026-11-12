package com.xiaomi.hm.health.relation;

import com.huami.relatives.FriendsAndFamilyService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0013\u0010\u0003\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/huami/relatives/FriendsAndFamilyService;", "getRelationService", "()Lcom/huami/relatives/FriendsAndFamilyService;", "relationService", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class RelationServiceKt {
    @NotNull
    public static final FriendsAndFamilyService getRelationService() {
        return RelationService.INSTANCE.getFRIENDS_AND_FAMILY_SERVICE();
    }
}
