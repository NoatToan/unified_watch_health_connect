package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.DeviceVoiceType;
import com.huami.ai.helper.UnitType;
import com.huami.ai.skill.VolumeControlSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.OpenContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/VolumeControlSkillImpl;", "Lcom/huami/ai/skill/VolumeControlSkill;", "", "option", "", "value", "", "c", "(BLjava/lang/Integer;)Z", "b", "(ILjava/lang/Integer;)Z", "a", "Lcom/huami/ai/helper/DeviceVoiceType;", "voiceType", "valueDelta", "Lcom/huami/ai/helper/UnitType;", "unitType", "adjustVolume", "isMute", "mute", "setVolume", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class VolumeControlSkillImpl implements VolumeControlSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final DeviceSpeechID deviceSpeechID;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("发送音量静音的指令：", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("发送打开音乐APP的指令:", Boolean.valueOf(this.a));
        }
    }

    public VolumeControlSkillImpl(@NotNull HMBaseDevice hMBaseDevice, @Nullable DeviceSpeechID deviceSpeechID) {
        this.baseDevice = hMBaseDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    private final boolean a() {
        DeviceSpeechID deviceSpeechID = this.deviceSpeechID;
        if (deviceSpeechID == null) {
            return false;
        }
        return ((HMMiLiProDevice) this.baseDevice).sendSpeechInfoSync(new HMSpeechInfo(deviceSpeechID.getId(), SpeechType.OPEN, new OpenContent((byte) 13)));
    }

    private final boolean b(int option, Integer value) {
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(9, new OpenAppContent.MusicParameter(option, value))), null, 2, null);
        HMLog.info("speech", new b(zSendCommand$default));
        return zSendCommand$default;
    }

    private final boolean c(byte option, Integer value) {
        OpenContent.MusicContent musicContent = new OpenContent.MusicContent(option);
        if (option == 25) {
            musicContent.setPercentOfVolume((byte) value.intValue());
        }
        OpenContent openContent = new OpenContent((byte) 9);
        openContent.setParam(musicContent);
        DeviceSpeechID deviceSpeechID = this.deviceSpeechID;
        if (deviceSpeechID == null) {
            return false;
        }
        return ((HMMiLiProDevice) this.baseDevice).sendSpeechInfoSync(new HMSpeechInfo(deviceSpeechID.getId(), SpeechType.OPEN, openContent));
    }

    @Override // com.huami.ai.skill.VolumeControlSkill
    public boolean adjustVolume(@NotNull DeviceVoiceType voiceType, int valueDelta, @NotNull UnitType unitType) {
        if (this.baseDevice.getMDeviceSource() == HMDeviceSource.MILI_CINCO) {
            return c(valueDelta <= 0 ? (byte) 6 : (byte) 5, null);
        }
        return b(valueDelta <= 0 ? (byte) 6 : (byte) 5, null);
    }

    @Override // com.huami.ai.skill.VolumeControlSkill
    public boolean mute(boolean isMute) {
        if (this.baseDevice.getMDeviceSource() == HMDeviceSource.MILI_CINCO) {
            return a();
        }
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(13, null, 2, null)), null, 2, null);
        HMLog.info("speech", new a(zSendCommand$default));
        return zSendCommand$default;
    }

    @Override // com.huami.ai.skill.VolumeControlSkill
    public boolean setVolume(@NotNull DeviceVoiceType voiceType, int value, @NotNull UnitType unitType) {
        return this.baseDevice.getMDeviceSource() == HMDeviceSource.MILI_CINCO ? c((byte) 25, Integer.valueOf(value)) : b(7, Integer.valueOf(value));
    }
}
