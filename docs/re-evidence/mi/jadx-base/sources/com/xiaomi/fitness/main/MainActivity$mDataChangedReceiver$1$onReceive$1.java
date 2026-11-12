package com.xiaomi.fitness.main;

import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.main.MainActivity$mDataChangedReceiver$1$onReceive$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MainActivity$mDataChangedReceiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$mDataChangedReceiver$1$onReceive$1(Intent intent, MainActivity mainActivity, Continuation<? super MainActivity$mDataChangedReceiver$1$onReceive$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$mDataChangedReceiver$1$onReceive$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String model;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Intent intent = this.$intent;
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1484986885 && action.equals("recent_data_changed_broadcast") && this.$intent.getIntExtra("error_code", -1) == 7) {
            FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
            fitnessDataPreference.setDEVICE_SYNC_INVALID_VERSION(AppVersionUtil.INSTANCE.getAppVersionName());
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            fitnessDataPreference.setDEVICE_SYNC_INVALID_MODEL_INFO(model);
            AppUpgradeHelper appUpgradeHelper = this.this$0.getAppUpgradeHelper();
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            appUpgradeHelper.doCheckAppUpgradeInSyncError(supportFragmentManager);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$mDataChangedReceiver$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
