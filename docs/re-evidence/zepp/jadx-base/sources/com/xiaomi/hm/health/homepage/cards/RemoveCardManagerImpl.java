package com.xiaomi.hm.health.homepage.cards;

import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.sort.interceptor.RemoveCardManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/homepage/cards/RemoveCardManagerImpl;", "Lcom/huami/module/homepage/cards/sort/interceptor/RemoveCardManager;", "", "Lcom/huami/module/homepage/cards/manager/CardType;", "needRemoveCards", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RemoveCardManagerImpl implements RemoveCardManager {
    @Override // com.huami.module.homepage.cards.sort.interceptor.RemoveCardManager
    @NotNull
    public List<CardType> needRemoveCards() {
        return e.listOf(CardType.PHN);
    }
}
