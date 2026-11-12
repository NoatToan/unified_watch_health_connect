package com.xiaomi.fitness.devicesettings;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import defpackage.d2m;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1", f = "DeviceSettingsComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeviceSettingsComponent$mainSystemHandler$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1(DeviceSettingsComponent$mainSystemHandler$1 deviceSettingsComponent$mainSystemHandler$1, Continuation<? super DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceSettingsComponent$mainSystemHandler$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(Activity activity, DeviceSettingsComponent$mainSystemHandler$1 deviceSettingsComponent$mainSystemHandler$1) {
        d2m.x(activity);
        deviceSettingsComponent$mainSystemHandler$1.setWifiSettingDialog(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(DeviceSettingsComponent$mainSystemHandler$1 deviceSettingsComponent$mainSystemHandler$1) {
        deviceSettingsComponent$mainSystemHandler$1.setWifiSettingDialog(null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CommonDialog<?> wifiSettingDialog = this.this$0.getWifiSettingDialog();
        if (wifiSettingDialog != null) {
            wifiSettingDialog.dismissAllowingStateLoss();
        }
        final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            final DeviceSettingsComponent$mainSystemHandler$1 deviceSettingsComponent$mainSystemHandler$1 = this.this$0;
            int i = wzi.c5;
            int i2 = wzi.b5;
            int i3 = wzi.Z1;
            Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.devicesettings.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1.invokeSuspend$lambda$2$lambda$0(currentActivity, deviceSettingsComponent$mainSystemHandler$1);
                }
            };
            Function0 function1 = new Function0() { // from class: com.xiaomi.fitness.devicesettings.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1.invokeSuspend$lambda$2$lambda$1(deviceSettingsComponent$mainSystemHandler$1);
                }
            };
            FragmentManager supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            deviceSettingsComponent$mainSystemHandler$1.setWifiSettingDialog(UtilsKt.showAlertDialog$default(i, i2, i3, 0, function0, function1, supportFragmentManager, 8, null));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceSettingsComponent$mainSystemHandler$1$handlePacket$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
