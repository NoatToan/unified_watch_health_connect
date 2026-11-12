package com.xiaomi.fitness.devicesettings.common.phonemute;

import android.media.AudioManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.gxo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/phonemute/PhoneMuteManager;", "", "<init>", "()V", "TAG", "", "syncMuteMode", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "requestByDevice", "", "modifyMuteMode", "isMute", "syncHuamiMuteMode", "handleSyncBluetoothMuteMode", "syncBluetoothMuteMode", "syncBleNoPermission", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneMuteManager {

    @NotNull
    public static final PhoneMuteManager INSTANCE = new PhoneMuteManager();

    @NotNull
    private static final String TAG = "PhoneMuteHelper";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.phonemute.PhoneMuteManager$syncBleNoPermission$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.phonemute.PhoneMuteManager$syncBleNoPermission$1", f = "PhoneMuteManager.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ZenUtils zenUtils = ZenUtils.INSTANCE;
                this.label = 1;
                if (zenUtils.postDeviceNoPermission(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private PhoneMuteManager() {
    }

    private final void syncBleNoPermission() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    private final void syncHuamiMuteMode(WearableDeviceModel deviceModel, boolean isMute) {
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i(TAG, "syncPhoneMuteState result: " + (huaMiApiCaller != null ? huaMiApiCaller.updatePhoneMuteState(isMute) : false));
    }

    public static /* synthetic */ void syncMuteMode$default(PhoneMuteManager phoneMuteManager, WearableDeviceModel wearableDeviceModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wearableDeviceModel = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        phoneMuteManager.syncMuteMode(wearableDeviceModel, z);
    }

    public final void handleSyncBluetoothMuteMode(boolean isMute, boolean requestByDevice) {
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted() || !requestByDevice) {
            syncBluetoothMuteMode(isMute);
        } else {
            Logger.i(TAG, "request sync mode fail: permission lack");
            syncBleNoPermission();
        }
    }

    public final void modifyMuteMode(boolean isMute) {
        if (!NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted()) {
            Logger.i(TAG, "request modify mode fail: permission lack");
            syncBleNoPermission();
            return;
        }
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        audioManager.setRingerMode(isMute ? 1 : 2);
        syncBluetoothMuteMode(isMute);
    }

    public final void syncBluetoothMuteMode(boolean isMute) {
        txo txoVar = new txo();
        gxo gxoVar = new gxo();
        gxo.a aVar = new gxo.a();
        aVar.c = isMute;
        gxoVar.c = aVar;
        txoVar.g0(gxoVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 44;
        s7rVar.c0(txoVar);
        Logger.i(TAG, "syncPhoneMuteState: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public final void syncMuteMode(@Nullable WearableDeviceModel deviceModel, boolean requestByDevice) {
        Logger.i(TAG, "syncMuteMode device: " + deviceModel);
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        int ringerMode = audioManager.getRingerMode();
        Logger.i(TAG, "syncMuteMode: " + ringerMode);
        if (deviceModel == null || !DeviceModelExtKt.isHuaMi(deviceModel)) {
            handleSyncBluetoothMuteMode(ringerMode != 2, requestByDevice);
        } else {
            syncHuamiMuteMode(deviceModel, ringerMode == 0);
        }
    }
}
