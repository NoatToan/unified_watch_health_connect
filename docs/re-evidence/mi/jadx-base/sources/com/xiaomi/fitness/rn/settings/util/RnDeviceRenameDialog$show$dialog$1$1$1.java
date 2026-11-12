package com.xiaomi.fitness.rn.settings.util;

import android.content.DialogInterface;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
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
@DebugMetadata(c = "com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialog$show$dialog$1$1$1", f = "RnDeviceRenameDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RnDeviceRenameDialog$show$dialog$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogInterface $dialog;
    final /* synthetic */ int $it;
    final /* synthetic */ String $newName;
    int label;
    final /* synthetic */ RnDeviceRenameDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnDeviceRenameDialog$show$dialog$1$1$1(int i, DialogInterface dialogInterface, RnDeviceRenameDialog rnDeviceRenameDialog, String str, Continuation<? super RnDeviceRenameDialog$show$dialog$1$1$1> continuation) {
        super(2, continuation);
        this.$it = i;
        this.$dialog = dialogInterface;
        this.this$0 = rnDeviceRenameDialog;
        this.$newName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RnDeviceRenameDialog$show$dialog$1$1$1(this.$it, this.$dialog, this.this$0, this.$newName, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Logger.i("RnDeviceRename", "requestRenameDevice, result code(" + this.$it + ")");
        int i = this.$it;
        if (i == 0) {
            this.$dialog.dismiss();
            ToastUtil.showLongToast(v0j.A);
            this.this$0.callBack.invoke2(this.$newName);
        } else {
            this.this$0.showErrorNameToast(i);
            this.this$0.callBack.invoke2(null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RnDeviceRenameDialog$show$dialog$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
