package com.xiaomi.fitness.nfc.ui;

import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BankCardSplashFragment$checkPinOnce$1$1", f = "BankCardSplashFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BankCardSplashFragment$checkPinOnce$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BankCardSplashFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankCardSplashFragment$checkPinOnce$1$1(BankCardSplashFragment bankCardSplashFragment, Continuation<? super BankCardSplashFragment$checkPinOnce$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bankCardSplashFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(BankCardSplashFragment bankCardSplashFragment, boolean z, String str) throws Exception {
        bankCardSplashFragment.checkPinTwice();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(BankCardSplashFragment bankCardSplashFragment, boolean z, String str) throws Exception {
        bankCardSplashFragment.checkPinTwice();
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BankCardSplashFragment$checkPinOnce$1$1(this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.this$0.mPinStatus;
        if (i == 1) {
            this.this$0.hideLoading();
            BaseCardFragment.gotoPage$default(this.this$0, MasterCardListFragment.class, null, 2, null);
            this.this$0.finish();
        } else if (i == 2) {
            this.this$0.hideLoading();
            this.this$0.setUnWearPwd();
        } else if (i == 3) {
            this.this$0.checkCRSStatus();
        } else if (i == 4) {
            this.this$0.hideLoading();
            BaseCardFragment.gotoPage$default(this.this$0, MasterCardListFragment.class, null, 2, null);
            this.this$0.finish();
        } else if (i == 6) {
            BanCardSplashViewModel banCardSplashViewModelAccess$getMViewModel = BankCardSplashFragment.access$getMViewModel(this.this$0);
            final BankCardSplashFragment bankCardSplashFragment = this.this$0;
            banCardSplashViewModelAccess$getMViewModel.clearSE(new Function2() { // from class: com.xiaomi.fitness.nfc.ui.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BankCardSplashFragment$checkPinOnce$1$1.invokeSuspend$lambda$1(bankCardSplashFragment, ((Boolean) obj2).booleanValue(), (String) obj3);
                }
            });
        } else if (i != 7) {
            this.this$0.checkPinTwice();
        } else {
            BanCardSplashViewModel banCardSplashViewModelAccess$getMViewModel2 = BankCardSplashFragment.access$getMViewModel(this.this$0);
            final BankCardSplashFragment bankCardSplashFragment2 = this.this$0;
            banCardSplashViewModelAccess$getMViewModel2.clearSE(new Function2() { // from class: com.xiaomi.fitness.nfc.ui.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BankCardSplashFragment$checkPinOnce$1$1.invokeSuspend$lambda$0(bankCardSplashFragment2, ((Boolean) obj2).booleanValue(), (String) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BankCardSplashFragment$checkPinOnce$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
