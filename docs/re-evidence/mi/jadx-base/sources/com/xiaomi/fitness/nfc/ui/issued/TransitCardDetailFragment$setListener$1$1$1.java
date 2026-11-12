package com.xiaomi.fitness.nfc.ui.issued;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.nfc.ui.TransferOutIntroFragment;
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
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment$setListener$1$1$1", f = "TransitCardDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TransitCardDetailFragment$setListener$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $canRemove;
    int label;
    final /* synthetic */ TransitCardDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitCardDetailFragment$setListener$1$1$1(TransitCardDetailFragment transitCardDetailFragment, String str, Continuation<? super TransitCardDetailFragment$setListener$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = transitCardDetailFragment;
        this.$canRemove = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitCardDetailFragment$setListener$1$1$1(this.this$0, this.$canRemove, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        if (this.$canRemove == null) {
            this.this$0.gotoPageForResult(TransferOutIntroFragment.class, null, TransitCardDetailFragment.INSTANCE.getSRequestTansferOut());
        } else {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastLong(mActivity, this.$canRemove);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitCardDetailFragment$setListener$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
