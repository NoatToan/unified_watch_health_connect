package com.xiaomi.fitness.notify.init;

import android.app.Application;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.util.BlueToothSender;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.init.NotifyComponent$DataHandlerImpl$handlePacket$2", f = "NotifyComponent.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyComponent$DataHandlerImpl$handlePacket$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $deviceModel;
    final /* synthetic */ String $number;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyComponent$DataHandlerImpl$handlePacket$2(String str, WearableDeviceModel wearableDeviceModel, Continuation<? super NotifyComponent$DataHandlerImpl$handlePacket$2> continuation) {
        super(2, continuation);
        this.$number = str;
        this.$deviceModel = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifyComponent$DataHandlerImpl$handlePacket$2(this.$number, this.$deviceModel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            Application app = AppUtil.getApp();
            String str = this.$number;
            this.label = 1;
            obj = notifyUtil.getContactsDisplayName(app, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str2 = (String) obj;
        boolean z = str2 == null || str2.length() == 0;
        String str3 = this.$number;
        BleNotifyModel bleNotifyModel = BleNotifyModel.INSTANCE;
        InCall inCall = bleNotifyModel.getInCall(this.$deviceModel.getDid());
        Logger.i(NotifyComponent.TAG, "packet.getContact displayName is empty = " + z + " number is " + str3 + " isIncallNameDisplayEnabled = " + (inCall != null ? Boxing.boxBoolean(inCall.isIncallNameDisplayEnabled()) : null));
        if (TextUtils.isEmpty(str2)) {
            return Unit.INSTANCE;
        }
        if (DeviceModelExtKt.isBluetooth(this.$deviceModel)) {
            InCall inCall2 = bleNotifyModel.getInCall(this.$deviceModel.getDid());
            if (inCall2 == null || !inCall2.isIncallNameDisplayEnabled()) {
                Logger.d(NotifyComponent.TAG, "packet.getContact inCallNameDisplayEnabled is false");
            } else {
                BlueToothSender.INSTANCE.sendContactInfo(this.$number, str2);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifyComponent$DataHandlerImpl$handlePacket$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
