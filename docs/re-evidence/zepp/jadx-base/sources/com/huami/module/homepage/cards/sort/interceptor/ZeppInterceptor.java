package com.huami.module.homepage.cards.sort.interceptor;

import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.manager.CardTypeKt;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/module/homepage/cards/sort/interceptor/ZeppInterceptor;", "Lcom/huami/module/homepage/cards/sort/interceptor/CardInterceptor;", "", "Lcom/huami/module/homepage/cards/manager/CardType;", "a", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "handleInterceptor", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ZeppInterceptor extends CardInterceptor {
    private final List<CardType> a() {
        List<CardType> listNeedRemoveCards;
        List<CardType> listPlus;
        List<CardType> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CardType[]{CardType.STRESS, CardType.SPO2, CardType.BALANCE, CardType.SLEEP_AID, CardType.EDIT_CARD});
        RemoveCardManager removeCardManager = (RemoveCardManager) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(RemoveCardManager.class), null, null);
        if (removeCardManager == null || (listNeedRemoveCards = removeCardManager.needRemoveCards()) == null) {
            return listListOf;
        }
        List<CardType> list = true ^ listNeedRemoveCards.isEmpty() ? listNeedRemoveCards : null;
        return (list == null || (listPlus = CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) list)) == null) ? listListOf : listPlus;
    }

    @Override // com.huami.module.homepage.cards.sort.interceptor.CardInterceptor
    @NotNull
    public List<CardSequence> handleInterceptor(@NotNull List<CardSequence> cards) {
        List<CardSequence> listHandleInterceptor;
        Object next;
        List<CardSequence> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) cards);
        for (CardType cardType : a()) {
            Iterator<T> it2 = mutableList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((CardSequence) next).getCardName(), cardType.name()));
            CardSequence cardSequence = (CardSequence) next;
            if (cardSequence != null) {
                mutableList.remove(cardSequence);
            }
        }
        List mutableList2 = ArraysKt___ArraysKt.toMutableList(CardType.values());
        mutableList2.removeAll(a());
        mutableList2.remove(CardType.HEALTH_LABEL);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = cards.iterator();
        while (it3.hasNext()) {
            CardType cardType2 = CardTypeKt.cardType(((CardSequence) it3.next()).getCardName());
            if (cardType2 != null) {
                arrayList.add(cardType2);
            }
        }
        mutableList2.removeAll(arrayList);
        Iterator it4 = mutableList2.iterator();
        while (it4.hasNext()) {
            mutableList.add(new CardSequence(((CardType) it4.next()).name(), false));
        }
        CardInterceptor interceptor = getInterceptor();
        return (interceptor == null || (listHandleInterceptor = interceptor.handleInterceptor(mutableList)) == null) ? mutableList : listHandleInterceptor;
    }
}
