package com.xiaomi.fitness.nfc.ui.issued;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
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
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment$checkUserBind$1$1", f = "MasterCardListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MasterCardListFragment$checkUserBind$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isCheck;
    final /* synthetic */ String $message;
    int label;
    final /* synthetic */ MasterCardListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterCardListFragment$checkUserBind$1$1(boolean z, MasterCardListFragment masterCardListFragment, String str, Continuation<? super MasterCardListFragment$checkUserBind$1$1> continuation) {
        super(2, continuation);
        this.$isCheck = z;
        this.this$0 = masterCardListFragment;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MasterCardListFragment$checkUserBind$1$1(this.$isCheck, this.this$0, this.$message, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity mActivity;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isCheck) {
            NfcPreference.INSTANCE.setCheckUserBind(true);
            this.this$0.loadMasterList();
        } else {
            String str = this.$message;
            if (str != null && str.length() != 0 && (mActivity = this.this$0.getMActivity()) != null) {
                ToastExtKt.toastShort(mActivity, this.$message);
            }
            this.this$0.hideLoading();
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MasterCardListFragment$checkUserBind$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
