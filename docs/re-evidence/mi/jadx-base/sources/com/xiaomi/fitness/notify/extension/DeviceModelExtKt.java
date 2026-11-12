package com.xiaomi.fitness.notify.extension;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SmsManager;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.notify.HuaMiNotifySettingImpl;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.onetrack.api.b;
import defpackage.eu6;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Leu6;", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "callback", "", "getHuaMiInCall", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Leu6;)V", "setCallReplyDelegate", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "isSupportSmsReply", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "", b.n, "hasSoftwareFeature", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;I)Z", "", TSMAuthContants.PARAM_PHONE_NUMBER, "replyMsg", "Lkotlin/Function1;", "sendSms", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "registerSendSmsStateReceiver", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "ACTION_SEND_SMS_STATE", "Ljava/lang/String;", "notify_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {

    @NotNull
    private static final String ACTION_SEND_SMS_STATE = "com.xiaomi.wear.smsreply.ACTION_SEND_SMS_STATE";

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.extension.DeviceModelExtKt$getHuaMiInCall$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.extension.DeviceModelExtKt$getHuaMiInCall$1", f = "DeviceModelExt.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ eu6<InCall> $callback;
        final /* synthetic */ WearableDeviceModel $this_getHuaMiInCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eu6<InCall> eu6Var, WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = eu6Var;
            this.$this_getHuaMiInCall = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$this_getHuaMiInCall, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                DeviceModelExtKt$getHuaMiInCall$1$inCall$1 deviceModelExtKt$getHuaMiInCall$1$inCall$1 = new DeviceModelExtKt$getHuaMiInCall$1$inCall$1(this.$this_getHuaMiInCall, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, deviceModelExtKt$getHuaMiInCall$1$inCall$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InCall inCall = (InCall) obj;
            if (inCall == null) {
                inCall = new InCall();
            }
            this.$callback.onResult(inCall);
            HuaMiNotifySettingImpl.INSTANCE.getInstance().setInCall(this.$this_getHuaMiInCall.getDid(), inCall);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void getHuaMiInCall(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull eu6<InCall> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ScopeExtKt.scope$default(null, new AnonymousClass1(callback, wearableDeviceModel, null), 1, null);
    }

    private static final boolean hasSoftwareFeature(WearableDeviceModel wearableDeviceModel, int i) {
        HuamiApiCaller huaMiApiCaller;
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && (huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel))) != null) {
            return huaMiApiCaller.hasSoftwareFeature(i);
        }
        return false;
    }

    public static final boolean isSupportSmsReply(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SMS_REPLY);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            zIsSupportFeature = zIsSupportFeature && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(wearableDeviceModel) && hasSoftwareFeature(wearableDeviceModel, 26);
        }
        Logger.i(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(wearableDeviceModel) + " isSupportSmsReply:" + zIsSupportFeature, new Object[0]);
        return zIsSupportFeature;
    }

    private static final void registerSendSmsStateReceiver(Context context, final Function1<? super Boolean, Unit> function1) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_SEND_SMS_STATE);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.notify.extension.DeviceModelExtKt$registerSendSmsStateReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                int resultCode = getResultCode();
                Logger.i("SEND_MSG", "onReceived send state:" + resultCode);
                if (resultCode == -1) {
                    function1.invoke2(Boolean.TRUE);
                } else if (resultCode == 1 || resultCode == 2 || resultCode != 3) {
                    function1.invoke2(Boolean.FALSE);
                } else {
                    function1.invoke2(Boolean.FALSE);
                }
                context2.unregisterReceiver(this);
            }
        };
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static final void sendSms(@NotNull String phoneNumber, @NotNull String replyMsg, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(replyMsg, "replyMsg");
        Logger.i("sendSms " + phoneNumber + ", msg:" + replyMsg, new Object[0]);
        if (function1 != null) {
            registerSendSmsStateReceiver(ApplicationExtKt.getApplication(), function1);
        }
        PendingIntent broadcastPendingIntent = PendingIntentExtKt.getBroadcastPendingIntent(ApplicationExtKt.getApplication(), 0, new Intent(ACTION_SEND_SMS_STATE), 0);
        SmsManager smsManager = SmsManager.getDefault();
        if (replyMsg.length() <= 70) {
            smsManager.sendTextMessage(phoneNumber, null, replyMsg, broadcastPendingIntent, null);
            return;
        }
        ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(replyMsg);
        ArrayList<PendingIntent> arrayList = new ArrayList<>();
        int size = arrayListDivideMessage.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(broadcastPendingIntent);
        }
        smsManager.sendMultipartTextMessage(phoneNumber, null, arrayListDivideMessage, arrayList, null);
    }

    public static /* synthetic */ void sendSms$default(String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        sendSms(str, str2, function1);
    }

    public static final void setCallReplyDelegate(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
        if (huaMiApiCaller != null) {
            huaMiApiCaller.setReplyDelegate(new DeviceModelExtKt$setCallReplyDelegate$1$1(huaMiApiCaller));
        }
    }
}
