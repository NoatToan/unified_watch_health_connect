package com.huami.module.homepage.cards.sort.repo;

import androidx.annotation.WorkerThread;
import com.huami.module.homepage.cards.sort.db.CardExpand;
import com.huami.module.homepage.cards.sort.db.CardSequence;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepo;", "", "", "Lcom/huami/module/homepage/cards/sort/db/CardSequence;", "loadCardSequenceForDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "loadCardSequenceForNet", "Lkotlinx/coroutines/flow/Flow;", "loadCardSequenceFlow", "cardList", "", "updateCardSequence", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardExpand", "Lcom/huami/module/homepage/cards/sort/db/CardExpand;", "loadCardExpandForDb", "cardExpand", "updateCardExpand", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface HomeCardRepo {
    @WorkerThread
    @Nullable
    Object loadCardExpand(@NotNull Continuation<? super Unit> continuation);

    @WorkerThread
    @Nullable
    Object loadCardExpandForDb(@NotNull Continuation<? super List<CardExpand>> continuation);

    @WorkerThread
    @Nullable
    Object loadCardSequenceFlow(@NotNull Continuation<? super Flow<? extends List<CardSequence>>> continuation);

    @WorkerThread
    @Nullable
    Object loadCardSequenceForDb(@NotNull Continuation<? super List<CardSequence>> continuation);

    @Nullable
    Object loadCardSequenceForNet(@NotNull Continuation<? super Unit> continuation);

    void updateCardExpand(@NotNull CardExpand cardExpand);

    @WorkerThread
    @Nullable
    Object updateCardSequence(@NotNull List<CardSequence> list, @NotNull Continuation<? super Boolean> continuation);
}
