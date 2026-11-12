package com.xiaomi.fitness.aivs.bluetooth;

import android.os.Handler;
import com.xiaomi.ai.api.General;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.base.BaseEventSession;
import com.xiaomi.fitness.aivs.util.BindVoiceAssistUtil;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.p01;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSpeechRecognizerManager;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "mAivsService", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "handler", "Landroid/os/Handler;", "<init>", "(Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;Landroid/os/Handler;)V", "isL67BelowOta2OrStoreVersion", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "receiveAudioData", "", "did", "", "data", "", "receiveAudioCommand", "command", "Lcom/xiaomi/fitness/aivs/bluetooth/AivsCommand;", "sendAivsError", "errorCode", "", "convertErrorCode", "createEventSession", "Lcom/xiaomi/fitness/aivs/base/BaseEventSession;", "sessionId", "", "checkDid", "getCurrentSessionId", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothSpeechRecognizerManager extends BaseAivsSpeechRecognizerManager {

    @NotNull
    private final BluetoothAivsService mAivsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothSpeechRecognizerManager(@NotNull BluetoothAivsService mAivsService, @NotNull Handler handler) {
        super(mAivsService, handler);
        Intrinsics.checkNotNullParameter(mAivsService, "mAivsService");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.mAivsService = mAivsService;
    }

    private final int convertErrorCode(int errorCode) {
        if (errorCode == 401) {
            return 81;
        }
        switch (errorCode) {
            case StdStatuses.ASR_TIME_OUT /* 50010004 */:
                return 112;
            case StdStatuses.TTS_TIME_OUT /* 50010005 */:
                return 113;
            default:
                return 80;
        }
    }

    private final boolean isL67BelowOta2OrStoreVersion(WearableDeviceModel deviceModel) {
        String firmwareVersion;
        if (deviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel)) == null) {
            firmwareVersion = "";
        }
        boolean z = StringsKt__StringsJVMKt.startsWith$default(firmwareVersion, "1.0", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(firmwareVersion, "1.1", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(firmwareVersion, "1.2", false, 2, null);
        boolean zStartsWith$default = StringsKt__StringsJVMKt.startsWith$default(firmwareVersion, "3", false, 2, null);
        if (deviceModel == null || !DeviceModelExtKt.isL67(deviceModel)) {
            return false;
        }
        return z || zStartsWith$default;
    }

    private final void receiveAudioCommand(String did, AivsCommand command) {
        byte[] data;
        BaseEventSession mEventSession;
        Logger.i(BaseAivsSpeechRecognizerManager.TAG, "did:" + did + " receive command:" + ((int) command.getType()));
        byte type = command.getType();
        if (type != 1) {
            if (type == 2) {
                audioDataInput(did, command.getData());
                return;
            }
            if (type == 3) {
                stopAudioInput(did);
                return;
            }
            if (type == 4) {
                BluetoothAivsService bluetoothAivsService = this.mAivsService;
                Event<?> eventBuildEvent = APIUtils.buildEvent(new General.ClearSession());
                Intrinsics.checkNotNullExpressionValue(eventBuildEvent, "buildEvent(...)");
                bluetoothAivsService.postEvent(eventBuildEvent);
                getMNeedRenewSession().put(did, Boolean.TRUE);
                stopAudioInput(did);
                this.mAivsService.interrupt();
                dialogFinish();
                return;
            }
            return;
        }
        if (command.getData() != null) {
            byte[] data2 = command.getData();
            if ((data2 == null || data2.length != 1) && ((data = command.getData()) == null || data.length != 2)) {
                return;
            }
            byte[] data3 = command.getData();
            Logger.i(BaseAivsSpeechRecognizerManager.TAG, "receive command: 1 command.data.size = " + (data3 != null ? Integer.valueOf(data3.length) : null));
            byte[] data4 = command.getData();
            if (data4 == null || data4.length <= 1) {
                this.mAivsService.setTtsMode(false);
            } else {
                byte[] data5 = command.getData();
                Intrinsics.checkNotNull(data5);
                byte b2 = data5[1];
                Logger.i(BaseAivsSpeechRecognizerManager.TAG, "receive command: 1 enabled = " + ((int) b2));
                this.mAivsService.setTtsMode(b2 == 1);
            }
            byte[] data6 = command.getData();
            Intrinsics.checkNotNull(data6);
            prepareAudioInput(did, data6[0]);
            this.mAivsService.stopTtsPlay();
            BindVoiceAssistUtil.INSTANCE.bindService();
            if (!AppUtil.INSTANCE.isDevChannel() || (mEventSession = getMEventSession()) == null) {
                return;
            }
            mEventSession.resetFileName();
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public boolean checkDid(@NotNull String did, byte sessionId) {
        Intrinsics.checkNotNullParameter(did, "did");
        String currentSessionDid = getCurrentSessionDid();
        if (currentSessionDid == null || Intrinsics.areEqual(currentSessionDid, did)) {
            return true;
        }
        p01 p01Var = new p01();
        p01Var.c = 82;
        p01Var.d = sessionId;
        p01.a aVar = new p01.a();
        aVar.c = new p01[]{p01Var};
        this.mAivsService.sendAivsInstructions(did, aVar);
        return false;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    @NotNull
    public BaseEventSession createEventSession(@NotNull String did, byte sessionId) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new BluetoothEventSession(did, sessionId, this.mAivsService);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public byte getCurrentSessionId() {
        BaseEventSession mEventSession = getMEventSession();
        if (mEventSession != null) {
            return mEventSession.getSessionId();
        }
        return (byte) 0;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public void receiveAudioData(@NotNull String did, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (data != null) {
            Iterator<AivsCommand> it = AivsCommand.INSTANCE.parse(data, isL67BelowOta2OrStoreVersion((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did))).iterator();
            while (it.hasNext()) {
                receiveAudioCommand(did, it.next());
            }
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager
    public void sendAivsError(int errorCode) {
        String did;
        if (hasSession() || (this.mAivsService.getTtsMode() && errorCode == 50010005)) {
            int iConvertErrorCode = convertErrorCode(errorCode);
            BaseEventSession mEventSession = getMEventSession();
            if (mEventSession != null) {
                byte sessionId = mEventSession.getSessionId();
                BaseEventSession mEventSession2 = getMEventSession();
                if (mEventSession2 == null || (did = mEventSession2.getDid()) == null) {
                    return;
                }
                p01 p01Var = new p01();
                p01Var.c = iConvertErrorCode;
                p01Var.d = ByteUtil.byteToInt(sessionId);
                p01.a aVar = new p01.a();
                aVar.c = new p01[]{p01Var};
                this.mAivsService.sendAivsInstructions(did, aVar);
            }
        }
    }
}
