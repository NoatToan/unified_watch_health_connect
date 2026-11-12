package com.huami.ai.helper;

import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/ai/helper/SpeechDeviceImpl;", "Lcom/huami/ai/helper/SpeechDevice;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "command", "Lkotlin/Function1;", "", "", "result", "", "sendCommand", "batteryInfo", "Lcom/xiaomi/hm/health/bt/profile/speech/HMSpeechInfo;", "speechInfo", "sendSpeechInfoSync", "", "getFirmwareVersion", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "<init>", "()V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechDeviceImpl implements SpeechDevice, KoinComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Send Command,But device null";
        }
    }

    private final HMBaseDevice a() {
        return (HMBaseDevice) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(HMBaseDevice.class), null, null);
    }

    @Override // com.huami.ai.helper.SpeechDevice
    public int batteryInfo() {
        BatteryInfo batteryInfo;
        HMBaseDevice hMBaseDeviceA = a();
        if (hMBaseDeviceA == null || (batteryInfo = hMBaseDeviceA.getBatteryInfo()) == null) {
            return 0;
        }
        return batteryInfo.getLevel();
    }

    @Override // com.huami.ai.helper.SpeechDevice
    @Nullable
    public String getFirmwareVersion() {
        String deviceVersion;
        HMBaseDevice hMBaseDeviceA = a();
        if (hMBaseDeviceA == null || (deviceVersion = hMBaseDeviceA.getDeviceVersion()) == null) {
            return null;
        }
        return m.replace$default(deviceVersion, ".", "", false, 4, (Object) null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.helper.SpeechDevice
    public boolean sendCommand(@NotNull VoiceCommand command, @Nullable Function1<? super Integer, Unit> result) {
        HMBaseDevice hMBaseDeviceA = a();
        Boolean boolValueOf = hMBaseDeviceA == null ? null : Boolean.valueOf(DeviceUtilsKt.sendCommand(hMBaseDeviceA, command, result));
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        HMLog.warn$default("speech", null, a.a, 2, null);
        return false;
    }

    @Override // com.huami.ai.helper.SpeechDevice
    public boolean sendSpeechInfoSync(@NotNull HMSpeechInfo speechInfo) {
        if (a() == null) {
            return false;
        }
        HMBaseDevice hMBaseDeviceA = a();
        Objects.requireNonNull(hMBaseDeviceA, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        return ((HMMiLiProDevice) hMBaseDeviceA).sendSpeechInfoSync(speechInfo);
    }
}
