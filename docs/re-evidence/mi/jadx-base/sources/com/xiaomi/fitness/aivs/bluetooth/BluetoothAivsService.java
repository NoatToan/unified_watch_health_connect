package com.xiaomi.fitness.aivs.bluetooth;

import android.os.Handler;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.util.AivsPreferenceSupport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import defpackage.e01;
import defpackage.p01;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010)J\r\u0010*\u001a\u00020\u0002¢\u0006\u0004\b*\u0010\u0004J\u0015\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010\u0004R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothAivsService;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "", "buildConfig", "()V", "", "getUserAgent", "()Ljava/lang/String;", "", "getXiaoaiVersionCode", "()I", "Lcom/xiaomi/ai/api/Settings$ClientInfo;", "createClientInfo", "()Lcom/xiaomi/ai/api/Settings$ClientInfo;", "cleanInstructions", "Landroid/os/Handler;", "handler", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "createInstructionCapability", "(Landroid/os/Handler;)Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "createSpeechRecognizerManager", "()Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "createSpeechSynthesizerCapability", "()Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "", "getTtsMode", "()Z", "ttsMode", "setTtsMode", "(Z)V", "Lp01;", "aivsInstruction", "sendAivsInstruction", "(Lp01;)V", "Lp01$a;", "aivsInstructionList", "sendAivsInstructions", "(Lp01$a;)V", "did", "(Ljava/lang/String;Lp01$a;)V", "stopTtsPlay", "Lcom/xiaomi/ai/api/SpeechRecognizer$ExpectSpeech;", "expectSpeech", "setExpectSpeech", "(Lcom/xiaomi/ai/api/SpeechRecognizer$ExpectSpeech;)V", "releaseEngine", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSender;", "bluetoothSender", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSender;", "xiaoAiPkgName", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BluetoothAivsService extends BaseAivsService {

    @NotNull
    private BluetoothSender bluetoothSender;

    @NotNull
    private final String xiaoAiPkgName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothAivsService(@NotNull String did) {
        super(did);
        Intrinsics.checkNotNullParameter(did, "did");
        this.bluetoothSender = new BluetoothSender();
        this.xiaoAiPkgName = "com.miui.voiceassist";
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void buildConfig() {
        super.buildConfig();
        e01 mAivsConfig = getMAivsConfig();
        if (mAivsConfig != null) {
            mAivsConfig.l("asr.enable_new_vad", true);
            mAivsConfig.o("asr.codec", "OPUS");
            mAivsConfig.l("asr.encoded_by_client", false);
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void cleanInstructions() {
        if (getMInstructionCapability() != null) {
            InstructionCapability mInstructionCapability = getMInstructionCapability();
            Intrinsics.checkNotNull(mInstructionCapability, "null cannot be cast to non-null type com.xiaomi.fitness.aivs.bluetooth.BluetoothInstructionCapabilityImpl");
            ((BluetoothInstructionCapabilityImpl) mInstructionCapability).clearInstructions();
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public Settings.ClientInfo createClientInfo() {
        Settings.ClientInfo clientInfo = new Settings.ClientInfo();
        clientInfo.setDeviceId(getMDeviceId());
        if (getMCapability() > 0) {
            Logger.i(BaseAivsService.TAG, "setCapabilitiesVersion:" + getMCapability());
            clientInfo.setCapabilitiesVersion((long) getMCapability());
        }
        return clientInfo;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public InstructionCapability createInstructionCapability(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new BluetoothInstructionCapabilityImpl(handler, this);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public BaseAivsSpeechRecognizerManager createSpeechRecognizerManager() {
        return new BluetoothSpeechRecognizerManager(this, getHandler());
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @Nullable
    public SpeechSynthesizerCapability createSpeechSynthesizerCapability() {
        return new SpeechSynthesizerCapabilityImpl();
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public boolean getTtsMode() {
        Boolean ttsEnableSp = AivsPreferenceSupport.INSTANCE.getTtsEnableSp(getDid(), getMClientId());
        if (ttsEnableSp != null) {
            return ttsEnableSp.booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public String getUserAgent() {
        return "XiaomiWear_App; DetailDM/" + getMModel() + " ";
    }

    public final int getXiaoaiVersionCode() {
        try {
            return ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(this.xiaoAiPkgName, 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void releaseEngine() {
        super.releaseEngine();
        InstructionCapability mInstructionCapability = getMInstructionCapability();
        BluetoothInstructionCapabilityImpl bluetoothInstructionCapabilityImpl = mInstructionCapability instanceof BluetoothInstructionCapabilityImpl ? (BluetoothInstructionCapabilityImpl) mInstructionCapability : null;
        if (bluetoothInstructionCapabilityImpl != null) {
            bluetoothInstructionCapabilityImpl.release();
        }
    }

    public final void sendAivsInstruction(@NotNull p01 aivsInstruction) {
        Intrinsics.checkNotNullParameter(aivsInstruction, "aivsInstruction");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager == null || !mSpeechRecognizerManager.hasSession()) {
            return;
        }
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = getMSpeechRecognizerManager();
        Intrinsics.checkNotNull(mSpeechRecognizerManager2);
        aivsInstruction.d = ByteUtil.byteToInt(mSpeechRecognizerManager2.getCurrentSessionId());
        p01.a aVar = new p01.a();
        aVar.c = new p01[]{aivsInstruction};
        sendAivsInstructions(getDid(), aVar);
    }

    public final void sendAivsInstructions(@NotNull p01.a aivsInstructionList) {
        Intrinsics.checkNotNullParameter(aivsInstructionList, "aivsInstructionList");
        BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
        if (mSpeechRecognizerManager == null || !mSpeechRecognizerManager.hasSession()) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(aivsInstructionList.c);
        while (it.hasNext()) {
            p01 p01Var = (p01) it.next();
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager2 = getMSpeechRecognizerManager();
            p01Var.d = ByteUtil.byteToInt(mSpeechRecognizerManager2 != null ? mSpeechRecognizerManager2.getCurrentSessionId() : (byte) 0);
        }
        sendAivsInstructions(getDid(), aivsInstructionList);
    }

    public final void setExpectSpeech(@NotNull SpeechRecognizer.ExpectSpeech expectSpeech) {
        Intrinsics.checkNotNullParameter(expectSpeech, "expectSpeech");
        if ((getMSpeechSynthesizerCapability() instanceof SpeechSynthesizerCapabilityImpl) && (getMSpeechRecognizerManager() instanceof BluetoothSpeechRecognizerManager)) {
            SpeechSynthesizerCapability mSpeechSynthesizerCapability = getMSpeechSynthesizerCapability();
            Intrinsics.checkNotNull(mSpeechSynthesizerCapability, "null cannot be cast to non-null type com.xiaomi.fitness.aivs.bluetooth.SpeechSynthesizerCapabilityImpl");
            BaseAivsSpeechRecognizerManager mSpeechRecognizerManager = getMSpeechRecognizerManager();
            Intrinsics.checkNotNull(mSpeechRecognizerManager, "null cannot be cast to non-null type com.xiaomi.fitness.aivs.bluetooth.BluetoothSpeechRecognizerManager");
            ((SpeechSynthesizerCapabilityImpl) mSpeechSynthesizerCapability).setExpectSpeech((BluetoothSpeechRecognizerManager) mSpeechRecognizerManager, expectSpeech);
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void setTtsMode(boolean ttsMode) {
        AivsPreferenceSupport.INSTANCE.setTtsEnableSp(getDid(), getMClientId(), ttsMode);
    }

    public final void stopTtsPlay() {
        if (getMSpeechSynthesizerCapability() instanceof SpeechSynthesizerCapabilityImpl) {
            SpeechSynthesizerCapability mSpeechSynthesizerCapability = getMSpeechSynthesizerCapability();
            Intrinsics.checkNotNull(mSpeechSynthesizerCapability, "null cannot be cast to non-null type com.xiaomi.fitness.aivs.bluetooth.SpeechSynthesizerCapabilityImpl");
            ((SpeechSynthesizerCapabilityImpl) mSpeechSynthesizerCapability).stopPlay();
        }
    }

    public final void sendAivsInstructions(@NotNull String did, @NotNull p01.a aivsInstructionList) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(aivsInstructionList, "aivsInstructionList");
        if (aivsInstructionList.c() > 3072) {
            p01 p01Var = new p01();
            p01Var.c = 83;
            p01[] list = aivsInstructionList.c;
            if (list != null) {
                Intrinsics.checkNotNullExpressionValue(list, "list");
                if (!(list.length == 0)) {
                    p01Var.d = aivsInstructionList.c[0].d;
                }
            }
            p01.a aVar = new p01.a();
            aVar.c = new p01[]{p01Var};
            this.bluetoothSender.sendAivsInstructions(did, aVar);
            stopTtsPlay();
            return;
        }
        this.bluetoothSender.sendAivsInstructions(did, aivsInstructionList);
    }
}
