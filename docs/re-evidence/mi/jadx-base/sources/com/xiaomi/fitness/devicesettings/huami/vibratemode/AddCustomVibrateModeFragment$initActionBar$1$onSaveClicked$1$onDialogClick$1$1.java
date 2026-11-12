package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import defpackage.wzi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1", f = "AddCustomVibrateModeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogInterface $dialog;
    final /* synthetic */ Boolean $it;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ AddCustomVibrateModeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1(Boolean bool, AddCustomVibrateModeFragment addCustomVibrateModeFragment, String str, DialogInterface dialogInterface, Continuation<? super AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1> continuation) {
        super(2, continuation);
        this.$it = bool;
        this.this$0 = addCustomVibrateModeFragment;
        this.$name = str;
        this.$dialog = dialogInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1(this.$it, this.this$0, this.$name, this.$dialog, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(this.$it, Boxing.boxBoolean(true))) {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.C);
            }
            return Unit.INSTANCE;
        }
        String str = this.$name;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        VibrateBean vibrateBean = new VibrateBean(str, string, AddCustomVibrateModeFragment.access$getMBinding(this.this$0).C.getVibrateTimes());
        PageState.DefaultImpls.showLoading$default(this.this$0, null, 0, false, 5, null);
        VibrateModeAddViewModel vibrateModeAddViewModelAccess$getMViewModel = AddCustomVibrateModeFragment.access$getMViewModel(this.this$0);
        int i = this.this$0.index;
        VibrateType vibrateTypeIndex2Mode = VibrateSpUtils.INSTANCE.index2Mode(this.this$0.index);
        AddCustomVibrateModeFragment addCustomVibrateModeFragment = this.this$0;
        vibrateModeAddViewModelAccess$getMViewModel.addVibrate(i, vibrateTypeIndex2Mode, vibrateBean, addCustomVibrateModeFragment.returnNewID(addCustomVibrateModeFragment.max));
        DialogInterface dialogInterface = this.$dialog;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
