package com.xiaomi.fitness.devicesettings.common.vitality;

import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import defpackage.ar9;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.vitality.VitalitySettingFragment$onViewCreated$1$1", f = "VitalitySettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VitalitySettingFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ar9 $activityReminder;
    int label;
    final /* synthetic */ VitalitySettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VitalitySettingFragment$onViewCreated$1$1(VitalitySettingFragment vitalitySettingFragment, ar9 ar9Var, Continuation<? super VitalitySettingFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = vitalitySettingFragment;
        this.$activityReminder = ar9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VitalitySettingFragment$onViewCreated$1$1(this.this$0, this.$activityReminder, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        ar9 ar9Var = this.$activityReminder;
        if ((ar9Var == null || !ar9Var.c) && (ar9Var == null || !ar9Var.d)) {
            VitalitySettingFragment.access$getMBinding(this.this$0).A.setSwitch(false);
            SwitchButtonBindingTwoLineTextView vitalityProgressButton = VitalitySettingFragment.access$getMBinding(this.this$0).C;
            Intrinsics.checkNotNullExpressionValue(vitalityProgressButton, "vitalityProgressButton");
            ExtUtilsKt.setVisible(vitalityProgressButton, false);
            SwitchButtonBindingTwoLineTextView vitalityLimitButton = VitalitySettingFragment.access$getMBinding(this.this$0).B;
            Intrinsics.checkNotNullExpressionValue(vitalityLimitButton, "vitalityLimitButton");
            ExtUtilsKt.setVisible(vitalityLimitButton, false);
        } else {
            VitalitySettingFragment.access$getMBinding(this.this$0).A.setSwitch(true);
            SwitchButtonBindingTwoLineTextView vitalityProgressButton2 = VitalitySettingFragment.access$getMBinding(this.this$0).C;
            Intrinsics.checkNotNullExpressionValue(vitalityProgressButton2, "vitalityProgressButton");
            ExtUtilsKt.setVisible(vitalityProgressButton2, true);
            SwitchButtonBindingTwoLineTextView vitalityLimitButton2 = VitalitySettingFragment.access$getMBinding(this.this$0).B;
            Intrinsics.checkNotNullExpressionValue(vitalityLimitButton2, "vitalityLimitButton");
            ExtUtilsKt.setVisible(vitalityLimitButton2, true);
            VitalitySettingFragment.access$getMBinding(this.this$0).C.setSwitch(this.$activityReminder.c);
            VitalitySettingFragment.access$getMBinding(this.this$0).B.setSwitch(this.$activityReminder.d);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VitalitySettingFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
