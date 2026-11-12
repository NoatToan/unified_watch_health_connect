package com.xiaomi.fitness.rn.settings.ui;

import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.eci;
import defpackage.v0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.rn.settings.ui.RnPolicyActivity$revokePrivacy$1$1", f = "RnPolicyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RnPolicyActivity$revokePrivacy$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    final /* synthetic */ eci $progressDialog;
    int label;
    final /* synthetic */ RnPolicyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnPolicyActivity$revokePrivacy$1$1(eci eciVar, boolean z, RnPolicyActivity rnPolicyActivity, Continuation<? super RnPolicyActivity$revokePrivacy$1$1> continuation) {
        super(2, continuation);
        this.$progressDialog = eciVar;
        this.$it = z;
        this.this$0 = rnPolicyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RnPolicyActivity$revokePrivacy$1$1(this.$progressDialog, this.$it, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$progressDialog.dismiss();
        ToastUtil.showLongToast(this.$it ? v0j.F : v0j.D);
        if (this.$it) {
            this.this$0.setRevokeSuccessResult();
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RnPolicyActivity$revokePrivacy$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
