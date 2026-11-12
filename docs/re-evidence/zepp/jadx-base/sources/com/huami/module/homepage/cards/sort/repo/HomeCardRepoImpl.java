package com.huami.module.homepage.cards.sort.repo;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.sort.db.CardExpand;
import com.huami.module.homepage.cards.sort.db.CardExpandDao;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import com.huami.module.homepage.cards.sort.db.CardSequenceDao;
import com.huami.module.homepage.cards.sort.db.HomeCardDb;
import com.huami.module.homepage.cards.sort.interceptor.CardSortHelper;
import com.huami.module.homepage.cards.sort.repo.HomeCardRepoImpl;
import com.huami.module.homepage.cards.sort.web.CardExpandEntry;
import com.huami.module.homepage.cards.sort.web.CardShowEntry;
import com.huami.module.homepage.cards.sort.web.CardWebApi;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepoImpl;", "Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepo;", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", "loadCardSequenceForDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "loadCardSequenceForNet", "Lkotlinx/coroutines/flow/Flow;", "loadCardSequenceFlow", "cardList", "", "updateCardSequence", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardExpand", "Lcom/huami/module/homepage/cards/sort/db/CardExpand;", "loadCardExpandForDb", "cardExpand", "updateCardExpand", "Lcom/huami/module/homepage/cards/sort/web/CardWebApi;", "a", "Lcom/huami/module/homepage/cards/sort/web/CardWebApi;", "webApi", "Lcom/huami/module/homepage/cards/sort/db/CardSequenceDao;", "b", "Lcom/huami/module/homepage/cards/sort/db/CardSequenceDao;", "cardSequenceDao", "Lcom/huami/module/homepage/cards/sort/db/CardExpandDao;", "c", "Lcom/huami/module/homepage/cards/sort/db/CardExpandDao;", "cardExpandDao", "Lcom/huami/module/homepage/cards/sort/repo/CardExecutor;", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/cards/sort/repo/CardExecutor;", "cardExecutor", "Lcom/huami/module/homepage/cards/sort/db/HomeCardDb;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/module/homepage/cards/sort/web/CardWebApi;Lcom/huami/module/homepage/cards/sort/db/HomeCardDb;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HomeCardRepoImpl implements HomeCardRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CardWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CardSequenceDao cardSequenceDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CardExpandDao cardExpandDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CardExecutor cardExecutor = new CardExecutor(null, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<CardSequence> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<CardSequence> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "云端请求结果:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<CardSequence> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<CardSequence> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "处理后的结果:" + this.a;
        }
    }

    public HomeCardRepoImpl(@NotNull CardWebApi cardWebApi, @NotNull HomeCardDb homeCardDb) {
        this.webApi = cardWebApi;
        this.cardSequenceDao = homeCardDb.cardSequenceDao();
        this.cardExpandDao = homeCardDb.cardExpandDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HomeCardRepoImpl homeCardRepoImpl) {
        List<CardExpandEntry> listLoadCardExpand = homeCardRepoImpl.webApi.loadCardExpand();
        if (!listLoadCardExpand.isEmpty()) {
            CardExpandDao cardExpandDao = homeCardRepoImpl.cardExpandDao;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadCardExpand, 10));
            for (CardExpandEntry cardExpandEntry : listLoadCardExpand) {
                arrayList.add(new CardExpand(cardExpandEntry.getType(), cardExpandEntry.getExpand()));
            }
            cardExpandDao.insertCard(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HomeCardRepoImpl homeCardRepoImpl) {
        if (HomeUtils.isAnonymousUser()) {
            homeCardRepoImpl.cardSequenceDao.insertCard(CardSortHelper.INSTANCE.getDefaultCards());
            return;
        }
        if (homeCardRepoImpl.cardSequenceDao.queryCard().isEmpty()) {
            homeCardRepoImpl.cardSequenceDao.insertCard(CardSortHelper.INSTANCE.getDefaultCards());
        }
        List<CardShowEntry> listLoadCardSort = homeCardRepoImpl.webApi.loadCardSort();
        if (!(!listLoadCardSort.isEmpty())) {
            listLoadCardSort = null;
        }
        if (listLoadCardSort == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadCardSort, 10));
        for (CardShowEntry cardShowEntry : listLoadCardSort) {
            arrayList.add(new CardSequence(cardShowEntry.getType(), cardShowEntry.getShow()));
        }
        HMLog.info("HomeCard", new a(arrayList));
        List<CardSequence> listHandleCardSort = CardSortHelper.INSTANCE.handleCardSort(arrayList);
        List<CardSequence> listQueryCard = homeCardRepoImpl.cardSequenceDao.queryCard();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryCard, 10));
        Iterator<T> it2 = listQueryCard.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CardSequence) it2.next()).getCardName());
        }
        List<String> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listHandleCardSort, 10));
        Iterator<T> it3 = listHandleCardSort.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((CardSequence) it3.next()).getCardName());
        }
        mutableList.removeAll(arrayList3);
        if (!mutableList.isEmpty()) {
            homeCardRepoImpl.cardSequenceDao.removeCards(mutableList);
        }
        HMLog.info("HomeCard", new b(listHandleCardSort));
        homeCardRepoImpl.cardSequenceDao.insertCard(listHandleCardSort);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HomeCardRepoImpl homeCardRepoImpl, CardExpand cardExpand) {
        homeCardRepoImpl.cardExpandDao.insertCard(cardExpand);
        CardWebApi cardWebApi = homeCardRepoImpl.webApi;
        List<CardExpand> listQueryCard = homeCardRepoImpl.cardExpandDao.queryCard();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryCard, 10));
        for (CardExpand cardExpand2 : listQueryCard) {
            arrayList.add(new CardExpandEntry(cardExpand2.getCardName(), cardExpand2.getShowExpand()));
        }
        cardWebApi.uploadCardExpand(arrayList);
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object loadCardExpand(@NotNull Continuation<? super Unit> continuation) {
        this.cardExecutor.networkIO().execute(new Runnable() { // from class: d84
            @Override // java.lang.Runnable
            public final void run() {
                HomeCardRepoImpl.d(this.a);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object loadCardExpandForDb(@NotNull Continuation<? super List<CardExpand>> continuation) {
        return this.cardExpandDao.queryCard();
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object loadCardSequenceFlow(@NotNull Continuation<? super Flow<? extends List<CardSequence>>> continuation) {
        return this.cardSequenceDao.queryCardFlow();
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object loadCardSequenceForDb(@NotNull Continuation<? super List<CardSequence>> continuation) {
        return this.cardSequenceDao.queryCard();
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object loadCardSequenceForNet(@NotNull Continuation<? super Unit> continuation) {
        this.cardExecutor.networkIO().execute(new Runnable() { // from class: e84
            @Override // java.lang.Runnable
            public final void run() {
                HomeCardRepoImpl.e(this.a);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    public void updateCardExpand(@NotNull final CardExpand cardExpand) {
        this.cardExecutor.networkIO().execute(new Runnable() { // from class: f84
            @Override // java.lang.Runnable
            public final void run() {
                HomeCardRepoImpl.f(this.a, cardExpand);
            }
        });
    }

    @Override // com.huami.module.homepage.cards.sort.repo.HomeCardRepo
    @Nullable
    public Object updateCardSequence(@NotNull List<CardSequence> list, @NotNull Continuation<? super Boolean> continuation) {
        CardWebApi cardWebApi = this.webApi;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CardSequence cardSequence : list) {
            arrayList.add(new CardShowEntry(cardSequence.getCardName(), cardSequence.getShowCard()));
        }
        boolean zUploadCardSort = cardWebApi.uploadCardSort(arrayList);
        if (zUploadCardSort) {
            this.cardSequenceDao.insertCard(list);
        }
        return Boxing.boxBoolean(zUploadCardSort);
    }
}
