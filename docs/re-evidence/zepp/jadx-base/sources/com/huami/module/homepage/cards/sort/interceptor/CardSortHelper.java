package com.huami.module.homepage.cards.sort.interceptor;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.module.homepage.cards.manager.CardType;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import com.huami.module.homepage.utils.HomeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000f"}, d2 = {"Lcom/huami/module/homepage/cards/sort/interceptor/CardSortHelper;", "", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", "cloudCards", "b", "a", "Lcom/huami/module/homepage/cards/manager/CardType;", GoogleApiAvailabilityLight.a, "c", "getDefaultCards", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "handleCardSort", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CardSortHelper {

    @NotNull
    public static final CardSortHelper INSTANCE = new CardSortHelper();

    private CardSortHelper() {
    }

    private final List<CardSequence> a(List<CardSequence> cloudCards) {
        HealthLabelInterceptor healthLabelInterceptor = new HealthLabelInterceptor();
        StarSkyInterceptor starSkyInterceptor = new StarSkyInterceptor();
        PhnInterceptor phnInterceptor = new PhnInterceptor();
        ZeppInterceptor zeppInterceptor = new ZeppInterceptor();
        healthLabelInterceptor.setInterceptor$homePage_release(starSkyInterceptor);
        starSkyInterceptor.setInterceptor$homePage_release(phnInterceptor);
        phnInterceptor.setInterceptor$homePage_release(zeppInterceptor);
        return healthLabelInterceptor.handleInterceptor(cloudCards);
    }

    private final List<CardSequence> b(List<CardSequence> cloudCards) {
        ConditionInterceptor conditionInterceptor = new ConditionInterceptor();
        conditionInterceptor.setInterceptor$homePage_release(new ZeppLifeInterceptor());
        return conditionInterceptor.handleInterceptor(cloudCards);
    }

    private final List<CardType> c() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new CardType[]{CardType.STEP, CardType.SLEEP, CardType.HEART_RATE, CardType.PAI, CardType.WEIGHT, CardType.SPORT_RECORD});
    }

    private final List<CardType> d() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new CardType[]{CardType.PAI, CardType.SLEEP, CardType.STAR_SKY, CardType.HEART_RATE, CardType.PRESS_SPO2, CardType.WEIGHT, CardType.SPORT_RECORD});
    }

    @NotNull
    public final List<CardSequence> getDefaultCards() {
        List<CardType> listC = HomeUtils.isMifitApp() ? c() : d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        Iterator<T> it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CardSequence(((CardType) it2.next()).name(), true));
        }
        return handleCardSort(arrayList);
    }

    @NotNull
    public final List<CardSequence> handleCardSort(@NotNull List<CardSequence> cards) {
        return HomeUtils.isMifitApp() ? b(cards) : a(cards);
    }
}
