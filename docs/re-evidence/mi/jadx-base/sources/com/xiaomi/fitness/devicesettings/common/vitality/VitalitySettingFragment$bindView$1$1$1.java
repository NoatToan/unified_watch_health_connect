package com.xiaomi.fitness.devicesettings.common.vitality;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import defpackage.ij6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalitySettingFragment$bindView$1$1$1", f = "VitalitySettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VitalitySettingFragment$bindView$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ boolean $it;
    final /* synthetic */ ij6 $this_bindView;
    int label;
    final /* synthetic */ VitalitySettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VitalitySettingFragment$bindView$1$1$1(VitalitySettingFragment vitalitySettingFragment, boolean z, ij6 ij6Var, boolean z2, Continuation<? super VitalitySettingFragment$bindView$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = vitalitySettingFragment;
        this.$it = z;
        this.$this_bindView = ij6Var;
        this.$isChecked = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VitalitySettingFragment$bindView$1$1$1(this.this$0, this.$it, this.$this_bindView, this.$isChecked, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        if (this.$it) {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_success);
            }
            SwitchButtonBindingTwoLineTextView vitalityProgressButton = this.$this_bindView.C;
            Intrinsics.checkNotNullExpressionValue(vitalityProgressButton, "vitalityProgressButton");
            ExtUtilsKt.setVisible(vitalityProgressButton, this.$isChecked);
            SwitchButtonBindingTwoLineTextView vitalityLimitButton = this.$this_bindView.B;
            Intrinsics.checkNotNullExpressionValue(vitalityLimitButton, "vitalityLimitButton");
            ExtUtilsKt.setVisible(vitalityLimitButton, this.$isChecked);
            this.$this_bindView.C.setSwitch(this.$isChecked);
            this.$this_bindView.B.setSwitch(this.$isChecked);
        } else {
            this.$this_bindView.A.setSwitch(!this.$isChecked);
            FragmentActivity mActivity2 = this.this$0.getMActivity();
            if (mActivity2 != null) {
                WearableDeviceModel mDeviceModel = VitalitySettingFragment.access$getMViewModel(this.this$0).getMDeviceModel();
                ToastExtKt.toastShort(mActivity2, (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) ? wzi.u : wzi.common_set_error);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VitalitySettingFragment$bindView$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
