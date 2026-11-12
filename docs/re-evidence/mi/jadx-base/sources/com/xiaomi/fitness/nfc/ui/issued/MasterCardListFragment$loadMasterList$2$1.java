package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.o0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment$loadMasterList$2$1", f = "MasterCardListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MasterCardListFragment$loadMasterList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MasterCardListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterCardListFragment$loadMasterList$2$1(MasterCardListFragment masterCardListFragment, Continuation<? super MasterCardListFragment$loadMasterList$2$1> continuation) {
        super(2, continuation);
        this.this$0 = masterCardListFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MasterCardListFragment masterCardListFragment, DialogInterface dialogInterface) {
        PageState.DefaultImpls.showLoading$default(masterCardListFragment, null, 0, false, 5, null);
        masterCardListFragment.loadMasterList();
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MasterCardListFragment$loadMasterList$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        int i = o0j.common_load_fail;
        int i2 = o0j.v0;
        int i3 = o0j.common_retry;
        FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        int i4 = o0j.common_cancel;
        final MasterCardListFragment masterCardListFragment = this.this$0;
        UtilsKt.showMsgDialog$default(i, i2, i3, childFragmentManager, i4, new Function1() { // from class: com.xiaomi.fitness.nfc.ui.issued.q
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return MasterCardListFragment$loadMasterList$2$1.invokeSuspend$lambda$0(masterCardListFragment, (DialogInterface) obj2);
            }
        }, (Function1) null, 64, (Object) null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MasterCardListFragment$loadMasterList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
