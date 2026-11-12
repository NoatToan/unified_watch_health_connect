package com.xiaomi.fitness.nfc.ui;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import defpackage.o0j;
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
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BankCardSplashFragment$checkCRSStatus$1$1$1", f = "BankCardSplashFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BankCardSplashFragment$checkCRSStatus$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $setSeSuc;
    int label;
    final /* synthetic */ BankCardSplashFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankCardSplashFragment$checkCRSStatus$1$1$1(BankCardSplashFragment bankCardSplashFragment, boolean z, Continuation<? super BankCardSplashFragment$checkCRSStatus$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bankCardSplashFragment;
        this.$setSeSuc = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BankCardSplashFragment$checkCRSStatus$1$1$1(this.this$0, this.$setSeSuc, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        if (this.$setSeSuc) {
            BaseCardFragment.gotoPage$default(this.this$0, MasterCardListFragment.class, null, 2, null);
            this.this$0.finish();
        } else {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, o0j.common_hint_unkonwn_error);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BankCardSplashFragment$checkCRSStatus$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
