package com.huami.module.homepage.cards.manager;

import com.huami.module.homepage.cards.business.sky.StarSkyHelper;
import com.huami.module.homepage.cards.sort.use.CardSortUseCase;
import com.huami.module.homepage.utils.HomeUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class CardManager$1$invokeSuspend$$inlined$collect$1 implements FlowCollector<Unit> {
    public final /* synthetic */ CardManager a;

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.manager.CardManager$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.manager.CardManager$1$invokeSuspend$$inlined$collect$1", f = "CardManager.kt", i = {0}, l = {138, 141}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return CardManager$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public CardManager$1$invokeSuspend$$inlined$collect$1(CardManager cardManager) {
        this.a = cardManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Unit unit, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        CardManager$1$invokeSuspend$$inlined$collect$1 cardManager$1$invokeSuspend$$inlined$collect$1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.b;
        if (i2 != 0) {
            if (i2 == 1) {
                cardManager$1$invokeSuspend$$inlined$collect$1 = (CardManager$1$invokeSuspend$$inlined$collect$1) anonymousClass1.d;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        StarSkyHelper starSkyHelper = StarSkyHelper.INSTANCE;
        if (!HomeUtils.isMifitApp()) {
            anonymousClass1.d = this;
            anonymousClass1.b = 1;
            if (starSkyHelper.requestSkyCardEntry(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        cardManager$1$invokeSuspend$$inlined$collect$1 = this;
        CardSortUseCase cardSortUseCase = cardManager$1$invokeSuspend$$inlined$collect$1.a.cardSortUseCase;
        anonymousClass1.d = null;
        anonymousClass1.b = 2;
        if (cardSortUseCase.reLoadCardSortForNet(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
