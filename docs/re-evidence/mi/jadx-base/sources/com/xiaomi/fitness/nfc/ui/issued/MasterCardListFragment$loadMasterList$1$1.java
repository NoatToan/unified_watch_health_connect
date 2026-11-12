package com.xiaomi.fitness.nfc.ui.issued;

import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import defpackage.ltg;
import java.util.List;
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
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment$loadMasterList$1$1", f = "MasterCardListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MasterCardListFragment$loadMasterList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CardWrapper> $it;
    int label;
    final /* synthetic */ MasterCardListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterCardListFragment$loadMasterList$1$1(List<CardWrapper> list, MasterCardListFragment masterCardListFragment, Continuation<? super MasterCardListFragment$loadMasterList$1$1> continuation) {
        super(2, continuation);
        this.$it = list;
        this.this$0 = masterCardListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MasterCardListFragment$loadMasterList$1$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NfcEventModule.INSTANCE.updateCardNumber(this.$it.size());
        ltg.c().p();
        if (this.$it.isEmpty()) {
            MasterCardListFragment.access$getMBinding(this.this$0).C.setVisibility(0);
            MasterCardListFragment.access$getMBinding(this.this$0).B.setVisibility(8);
        } else {
            MasterCardListFragment.access$getMBinding(this.this$0).C.setVisibility(8);
            MasterCardListFragment.access$getMBinding(this.this$0).B.setVisibility(0);
            this.this$0.updateCardViews(this.$it);
        }
        this.this$0.queryInvalidateCard(this.$it);
        this.this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MasterCardListFragment$loadMasterList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
