package com.xiaomi.fitness.aivs.huami;

import android.os.Handler;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/aivs/huami/HuamiSpeechRecognizerManager;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "mAivsService", "Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;Landroid/os/Handler;)V", "receiveAudioData", "", "did", "", "data", "", "getHuamiDevice", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "sendAivsError", "errotCode", "", "createEventSession", "Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "sessionId", "", "checkDid", "", "getCurrentSessionId", "onEngineReady", "success", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiSpeechRecognizerManager extends BaseAivsSpeechRecognizerManager {

    @NotNull
    private final HuamiAivsService mAivsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuamiSpeechRecognizerManager(@NotNull HuamiAivsService mAivsService, @NotNull Handler handler) {
        super(mAivsService, handler);
        Intrinsics.checkNotNullParameter(mAivsService, "mAivsService");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.mAivsService = mAivsService;
    }

    private final HuamiApiCaller getHuamiDevice() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(this.mAivsService.getDid());
        if (wearableDeviceModel == null) {
            return null;
        }
        return DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public boolean checkDid(@NotNull String did, byte sessionId) {
        Intrinsics.checkNotNullParameter(did, "did");
        return true;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    @NotNull
    public BaseEventSession createEventSession(@NotNull String did, byte sessionId) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new HuamiEventSession(did, sessionId, this.mAivsService);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public byte getCurrentSessionId() {
        return (byte) 0;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public void onEngineReady(boolean success) {
        HuamiApiCaller huaMiApiCaller;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null) {
            return;
        }
        if (success) {
            huaMiApiCaller.sendVoiceReadyCommand(this.mAivsService.getSuggestList());
        } else {
            huaMiApiCaller.sendVoiceInvalidateTokenCommand();
        }
        super.onEngineReady(success);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public void receiveAudioData(@NotNull String did, @Nullable byte[] data) {
        BaseEventSession mEventSession;
        Intrinsics.checkNotNullParameter(did, "did");
        if (data != null) {
            if (getMEventSession() == null || ((mEventSession = getMEventSession()) != null && mEventSession.isInterrupted())) {
                prepareAudioInput(did, (byte) 0);
            } else {
                audioDataInput(did, data);
            }
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public void sendAivsError(int errotCode) {
        HuamiApiCaller huamiDevice = getHuamiDevice();
        switch (errotCode) {
            case StdStatuses.NETWORK_DISABLED /* 40010007 */:
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceNetworkDisable();
                }
                break;
            case StdStatuses.CONNECTION_INTERRUPT /* 40010008 */:
            case StdStatuses.CONNECTION_INTERRUPTED /* 50010006 */:
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceNetworkError();
                }
                break;
            case StdStatuses.ASR_TIME_OUT /* 50010004 */:
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceAsrTimeOut();
                }
                break;
            case StdStatuses.TTS_TIME_OUT /* 50010005 */:
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceTtsTimeout();
                }
                break;
            default:
                if (huamiDevice != null) {
                    huamiDevice.sendVoiceUnknownErrorCommand();
                }
                break;
        }
    }
}
