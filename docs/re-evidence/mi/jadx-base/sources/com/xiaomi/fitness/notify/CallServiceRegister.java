package com.xiaomi.fitness.notify;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelperExtKt;
import com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelper;
import com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelperExtKt;
import com.xiaomi.fitness.notify.CallServiceRegister;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.aje;
import defpackage.ni4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 #2\u00020\u0001:\u0004#$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u001a\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/notify/CallServiceRegister;", "", "<init>", "()V", "mAudioManager", "Landroid/media/AudioManager;", "huamiApiCaller", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "()Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "mPhoneStateListener", "Lcom/xiaomi/fitness/notify/CallServiceRegister$MyPhoneStateListener;", "mCallServiceReceiver", "Lcom/xiaomi/fitness/notify/CallServiceRegister$CallServiceReceiver;", "mAudioModeReceiver", "Lcom/xiaomi/fitness/notify/CallServiceRegister$SilenceRingerReceiver;", "registerReceiver", "", "unregisterReceivers", "mLastRingerMode", "", "getMLastRingerMode", "()I", "setMLastRingerMode", "(I)V", "lastPhoneState", "handleState", "incomingNumber", "", "state", "alertOutGoingCall", "alertPhoneInCallStop", "alertPhoneInCall", "phoneNum", MediaStoreUtil.MediaInfo.DISPLAY_NAME, "Companion", "MyPhoneStateListener", "CallServiceReceiver", "SilenceRingerReceiver", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CallServiceRegister {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<CallServiceRegister> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: va3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallServiceRegister.instance_delegate$lambda$0();
        }
    });
    private volatile int lastPhoneState;

    @Nullable
    private AudioManager mAudioManager;

    @NotNull
    private final MyPhoneStateListener mPhoneStateListener = new MyPhoneStateListener();

    @NotNull
    private final CallServiceReceiver mCallServiceReceiver = new CallServiceReceiver();

    @NotNull
    private final SilenceRingerReceiver mAudioModeReceiver = new SilenceRingerReceiver();
    private int mLastRingerMode = -1;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/CallServiceRegister$CallServiceReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/CallServiceRegister;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CallServiceReceiver extends BroadcastReceiver {
        public CallServiceReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        @RequiresApi(31)
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            int i;
            String did;
            Bundle extras;
            String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("incoming_number");
            String stringExtra = intent != null ? intent.getStringExtra("state") : null;
            if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_RINGING)) {
                i = 1;
            } else if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_IDLE)) {
                i = 0;
            } else {
                i = Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK) ? 2 : -1;
            }
            Logger.i(BaseNotifySyncService.TAG, "registerCustomTelephonyCallback CustomTelephonyCallback incomingNumber isEmpty = " + (string == null || string.length() == 0) + " action = " + i);
            if (i != 0) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                    did = "";
                }
                Logger.i(AIApiConstants.FindPhone.NAME, "CallServiceReceiver stop  did:" + did);
                FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).stop(did);
            }
            if (i == -1) {
                return;
            }
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle() || !(string == null || string.length() == 0)) {
                CallServiceRegister.this.handleState(string, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/CallServiceRegister$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/notify/CallServiceRegister;", "getInstance", "()Lcom/xiaomi/fitness/notify/CallServiceRegister;", "instance$delegate", "Lkotlin/Lazy;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CallServiceRegister getInstance() {
            return (CallServiceRegister) CallServiceRegister.instance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/CallServiceRegister$MyPhoneStateListener;", "Landroid/telephony/PhoneStateListener;", "<init>", "(Lcom/xiaomi/fitness/notify/CallServiceRegister;)V", "onCallStateChanged", "", "state", "", "incomingNumber", "", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyPhoneStateListener extends PhoneStateListener {
        public MyPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int state, @Nullable String incomingNumber) {
            String did;
            if (state != 0) {
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                    did = "";
                }
                Logger.i(AIApiConstants.FindPhone.NAME, "CallServiceReceiver MyPhoneStateListener stop  did:" + did);
                FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).stop(did);
            }
            CallServiceRegister.this.handleState(incomingNumber, state);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/CallServiceRegister$SilenceRingerReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/notify/CallServiceRegister;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SilenceRingerReceiver extends BroadcastReceiver {
        public SilenceRingerReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            int intExtra = intent.getIntExtra(Constant.sDeviceType, 0);
            boolean zIsNotificationPolicyAccessGranted = NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -849741398) {
                    if (iHashCode == -743591626 && action.equals(Constant.NORMAL)) {
                        Logger.i(BaseNotifySyncService.TAG, "SilenceRingerReceiver NORMAL notificationPolicyAccessGranted: " + zIsNotificationPolicyAccessGranted);
                        if (zIsNotificationPolicyAccessGranted && intExtra == 1) {
                            AudioManager audioManager = CallServiceRegister.this.mAudioManager;
                            if (audioManager == null || audioManager.getRingerMode() != 2) {
                                CallServiceRegister callServiceRegister = CallServiceRegister.this;
                                AudioManager audioManager2 = callServiceRegister.mAudioManager;
                                callServiceRegister.setMLastRingerMode(audioManager2 != null ? audioManager2.getRingerMode() : -1);
                                AudioManager audioManager3 = CallServiceRegister.this.mAudioManager;
                                if (audioManager3 != null) {
                                    audioManager3.setRingerMode(2);
                                }
                            }
                            HuamiApiCaller huamiApiCaller = CallServiceRegister.this.getHuamiApiCaller();
                            if (huamiApiCaller != null) {
                                huamiApiCaller.updatePhoneMuteState(false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action.equals(Constant.SILENCE_RINGER)) {
                    Logger.i(BaseNotifySyncService.TAG, "SilenceRingerReceiver SILENCE_RINGER notificationPolicyAccessGranted: " + zIsNotificationPolicyAccessGranted);
                    if (zIsNotificationPolicyAccessGranted) {
                        if (intExtra != 1) {
                            AudioManager audioManager4 = CallServiceRegister.this.mAudioManager;
                            if (audioManager4 == null || audioManager4.getRingerMode() != 0) {
                                CallServiceRegister callServiceRegister2 = CallServiceRegister.this;
                                AudioManager audioManager5 = callServiceRegister2.mAudioManager;
                                callServiceRegister2.setMLastRingerMode(audioManager5 != null ? audioManager5.getRingerMode() : -1);
                                AudioManager audioManager6 = CallServiceRegister.this.mAudioManager;
                                if (audioManager6 != null) {
                                    audioManager6.setRingerMode(0);
                                }
                            }
                            PhoneMuteHelperExtKt.getInstance(PhoneMuteHelper.INSTANCE).syncMuteMode(true);
                            return;
                        }
                        AudioManager audioManager7 = CallServiceRegister.this.mAudioManager;
                        if (audioManager7 == null || audioManager7.getRingerMode() != 0) {
                            CallServiceRegister callServiceRegister3 = CallServiceRegister.this;
                            AudioManager audioManager8 = callServiceRegister3.mAudioManager;
                            callServiceRegister3.setMLastRingerMode(audioManager8 != null ? audioManager8.getRingerMode() : -1);
                            AudioManager audioManager9 = CallServiceRegister.this.mAudioManager;
                            if (audioManager9 != null) {
                                audioManager9.setRingerMode(0);
                            }
                        }
                        HuamiApiCaller huamiApiCaller2 = CallServiceRegister.this.getHuamiApiCaller();
                        if (huamiApiCaller2 != null) {
                            huamiApiCaller2.updatePhoneMuteState(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.CallServiceRegister$handleState$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.CallServiceRegister$handleState$1", f = "CallServiceRegister.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<String> $displayName;
        final /* synthetic */ String $incomingNumber;
        Object L$0;
        int label;
        final /* synthetic */ CallServiceRegister this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<String> objectRef, String str, CallServiceRegister callServiceRegister, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$displayName = objectRef;
            this.$incomingNumber = str;
            this.this$0 = callServiceRegister;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$displayName, this.$incomingNumber, this.this$0, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<String> objectRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef<String> objectRef2 = this.$displayName;
                NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
                Application application = ApplicationExtKt.getApplication();
                String str = this.$incomingNumber;
                this.L$0 = objectRef2;
                this.label = 1;
                Object contactsDisplayName = notifyUtil.getContactsDisplayName(application, str, this);
                if (contactsDisplayName == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = contactsDisplayName;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            String str2 = (String) obj;
            T t = str2;
            if (str2 == null) {
                t = "";
            }
            objectRef.element = t;
            if (this.this$0.lastPhoneState != 1) {
                Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged has call stop");
                return Unit.INSTANCE;
            }
            this.this$0.alertPhoneInCall(this.$incomingNumber, this.$displayName.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void alertOutGoingCall() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isBluetooth(wearableDeviceModel) && NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
            BleNotifyModel.INSTANCE.alertOutGoingCall();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alertPhoneInCall(String phoneNum, String displayName) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().alertCall(wearableDeviceModel, phoneNum, displayName);
        } else {
            if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BleNotifyModel.INSTANCE.alertCall(wearableDeviceModel, phoneNum, displayName);
        }
    }

    private final void alertPhoneInCallStop() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuaMiNotifyModel.INSTANCE.getInstance().alertInCallStop(wearableDeviceModel);
        } else {
            if (wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                return;
            }
            BleNotifyModel.INSTANCE.alertInCallStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleState(String incomingNumber, int state) {
        HuaMiNotifyModel.INSTANCE.getInstance().updatePhoneStatus(state);
        BleNotifyModel.INSTANCE.updatePhoneStatus(state);
        if (state == 0) {
            Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_IDLE incomingNumber.isNullOrEmpty = " + (incomingNumber == null || incomingNumber.length() == 0));
            Constant.INSTANCE.setInOutGoingCall(false);
            if (this.lastPhoneState == 1) {
                alertPhoneInCallStop();
            }
            this.lastPhoneState = 0;
            if (this.mLastRingerMode == -1 || !NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                return;
            }
            Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_IDLE mLastRingerMode  changed");
            AudioManager audioManager = this.mAudioManager;
            if (audioManager != null) {
                audioManager.setRingerMode(this.mLastRingerMode);
            }
            this.mLastRingerMode = -1;
            return;
        }
        if (state != 1) {
            if (state != 2) {
                return;
            }
            if (this.lastPhoneState == 1) {
                Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_OFFHOOK last state is CALL_STATE_RINGING alertPhoneInCallStop");
                alertPhoneInCallStop();
            } else {
                Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_OFFHOOK  alertOutGoingCall");
                Constant.INSTANCE.setInOutGoingCall(true);
                alertOutGoingCall();
            }
            this.lastPhoneState = 2;
            if (this.mLastRingerMode == -1 || !NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                return;
            }
            Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_OFFHOOK mLastRingerMode  changed");
            AudioManager audioManager2 = this.mAudioManager;
            if (audioManager2 != null) {
                audioManager2.setRingerMode(this.mLastRingerMode);
            }
            this.mLastRingerMode = -1;
            return;
        }
        Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged CALL_STATE_RINGING incomingNumber.isNullOrEmpty = " + (incomingNumber == null || incomingNumber.length() == 0));
        if (this.lastPhoneState != 1) {
            this.lastPhoneState = 1;
            Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged TelephonyManager.CALL_STATE_RINGING ");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (!TextUtils.isEmpty(incomingNumber)) {
                Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged getDisplayName isContactPermissionGranted = " + (ni4.a(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS") == 0));
                AnyExtKt.io$default(null, new AnonymousClass1(objectRef, incomingNumber, this, null), 1, null);
            } else if (this.lastPhoneState == 1) {
                alertPhoneInCall(incomingNumber, (String) objectRef.element);
            }
            Logger.i(BaseNotifySyncService.TAG, "onCallStateChanged getDisplayName displayName.isNullOrEmpty = " + (((CharSequence) objectRef.element).length() == 0));
        }
        this.mLastRingerMode = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallServiceRegister instance_delegate$lambda$0() {
        return new CallServiceRegister();
    }

    @Nullable
    public final HuamiApiCaller getHuamiApiCaller() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    public final int getMLastRingerMode() {
        return this.mLastRingerMode;
    }

    public final void registerReceiver() {
        MyPhoneStateListener myPhoneStateListener = this.mPhoneStateListener;
        CallServiceReceiver callServiceReceiver = this.mCallServiceReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("CallServiceRegister registerReceiver ");
        sb.append(myPhoneStateListener);
        sb.append(" ");
        sb.append(callServiceReceiver);
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.mAudioManager = (AudioManager) systemService;
        try {
            Object systemService2 = ApplicationExtKt.getApplication().getSystemService("phone");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService2;
            if (Build.VERSION.SDK_INT >= 31) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                ApplicationExtKt.getApplication().registerReceiver(this.mCallServiceReceiver, intentFilter);
            } else {
                MyPhoneStateListener myPhoneStateListener2 = this.mPhoneStateListener;
                Intrinsics.checkNotNull(myPhoneStateListener2);
                telephonyManager.listen(myPhoneStateListener2, 32);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(Constant.SILENCE_RINGER);
        intentFilter2.addAction(Constant.NORMAL);
        aje.b(ApplicationExtKt.getApplication()).c(this.mAudioModeReceiver, intentFilter2);
    }

    public final void setMLastRingerMode(int i) {
        this.mLastRingerMode = i;
    }

    public final void unregisterReceivers() {
        aje.b(ApplicationExtKt.getApplication()).e(this.mAudioModeReceiver);
        if (Build.VERSION.SDK_INT >= 31) {
            ApplicationExtKt.getApplication().unregisterReceiver(this.mCallServiceReceiver);
        }
    }
}
