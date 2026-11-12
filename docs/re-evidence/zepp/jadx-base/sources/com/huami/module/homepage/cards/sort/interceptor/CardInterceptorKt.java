package com.huami.module.homepage.cards.sort.interceptor;

import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import com.unionpay.tsmservice.data.Constant;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", "Lcom/huami/module/homepage/cards/manager/CardType;", Constant.KEY_CARD_TYPE, "findCard", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class CardInterceptorKt {
    @Nullable
    public static final CardSequence findCard(@NotNull List<CardSequence> list, @NotNull CardType cardType) {
        Object next;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (Intrinsics.areEqual(((CardSequence) next).getCardName(), cardType.name())) {
                return (CardSequence) next;
            }
        }
        next = null;
        return (CardSequence) next;
    }
}
