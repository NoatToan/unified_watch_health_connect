package com.xiaomi.fitness.aivs.huami;

import android.os.Handler;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.aivs.base.BaseAivsSpeechRecognizerManager;
import com.xiaomi.fitness.aivs.util.Constants;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.e01;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/aivs/huami/HuamiAivsService;", "Lcom/xiaomi/fitness/aivs/base/BaseAivsService;", "did", "", "<init>", "(Ljava/lang/String;)V", "voiceConfig", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "getVoiceConfig", "()Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "setVoiceConfig", "(Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "getUserAgent", "buildConfig", "", "createClientInfo", "Lcom/xiaomi/ai/api/Settings$ClientInfo;", "cleanInstructions", "createInstructionCapability", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "handler", "Landroid/os/Handler;", "createSpeechRecognizerManager", "Lcom/xiaomi/fitness/aivs/base/BaseAivsSpeechRecognizerManager;", "createSpeechSynthesizerCapability", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "stopAudioInput", "getTtsMode", "", "setTtsMode", "ttsMode", "onStartSession", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiAivsService extends BaseAivsService {

    @Nullable
    private VoiceConfig voiceConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuamiAivsService(@NotNull String did) {
        super(did);
        Intrinsics.checkNotNullParameter(did, "did");
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void buildConfig() {
        super.buildConfig();
        e01 mAivsConfig = getMAivsConfig();
        if (mAivsConfig != null) {
            mAivsConfig.l("auth.oauth.upload_miot_did", false);
            mAivsConfig.l("auth.support_multiply_client_id", true);
        }
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void cleanInstructions() {
        InstructionCapability mInstructionCapability = getMInstructionCapability();
        Intrinsics.checkNotNull(mInstructionCapability, "null cannot be cast to non-null type com.xiaomi.fitness.aivs.huami.HuamiInstructionCapabilityImpl");
        ((HuamiInstructionCapabilityImpl) mInstructionCapability).clearInstructions();
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @Nullable
    public Settings.ClientInfo createClientInfo() {
        Settings.ClientInfo clientInfo = new Settings.ClientInfo();
        clientInfo.setDeviceId(getMDeviceId());
        clientInfo.setCapabilitiesVersion(2L);
        clientInfo.setVid(getMVid());
        clientInfo.setPid(getMPid());
        return clientInfo;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public InstructionCapability createInstructionCapability(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new HuamiInstructionCapabilityImpl(handler, this);
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public BaseAivsSpeechRecognizerManager createSpeechRecognizerManager() {
        return new HuamiSpeechRecognizerManager(this, getHandler());
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @Nullable
    public SpeechSynthesizerCapability createSpeechSynthesizerCapability() {
        return null;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public boolean getTtsMode() {
        return false;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    @NotNull
    public String getUserAgent() {
        return Constants.AIVS_USER_AGENT;
    }

    @Nullable
    public final VoiceConfig getVoiceConfig() {
        return this.voiceConfig;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void onStartSession(@NotNull VoiceConfig voiceConfig) {
        Intrinsics.checkNotNullParameter(voiceConfig, "voiceConfig");
        super.onStartSession(voiceConfig);
        this.voiceConfig = voiceConfig;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void setTtsMode(boolean ttsMode) {
    }

    public final void setVoiceConfig(@Nullable VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
    }

    @Override // com.xiaomi.fitness.aivs.base.BaseAivsService
    public void stopAudioInput() {
        HuamiApiCaller huaMiApiCaller;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(getDid());
        if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null) {
            return;
        }
        huaMiApiCaller.stopVoiceCommand();
    }
}
