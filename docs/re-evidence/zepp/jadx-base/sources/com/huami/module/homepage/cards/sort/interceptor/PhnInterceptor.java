package com.huami.module.homepage.cards.sort.interceptor;

import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/module/homepage/cards/sort/interceptor/PhnInterceptor;", "Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "handleInterceptor", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class PhnInterceptor extends CardInterceptor {
    @Override // com.huami.module.homepage.cards.sort.interceptor.CardInterceptor
    @NotNull
    public List<CardSequence> handleInterceptor(@NotNull List<CardSequence> cards) {
        Object next;
        List<CardSequence> listHandleInterceptor;
        CardSequence cardSequenceFindCard;
        List<CardSequence> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) cards);
        Iterator<T> it2 = cards.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((CardSequence) next).getCardName(), CardType.PHN.name()));
        if (((CardSequence) next) == null && (cardSequenceFindCard = CardInterceptorKt.findCard(cards, CardType.SPORT_RECORD)) != null) {
            if (cardSequenceFindCard.getShowCard()) {
                mutableList.add(cards.indexOf(cardSequenceFindCard) + 1, new CardSequence(CardType.PHN.name(), true));
            } else {
                mutableList.add(new CardSequence(CardType.PHN.name(), true));
            }
        }
        CardInterceptor interceptor = getInterceptor();
        return (interceptor == null || (listHandleInterceptor = interceptor.handleInterceptor(mutableList)) == null) ? mutableList : listHandleInterceptor;
    }
}
