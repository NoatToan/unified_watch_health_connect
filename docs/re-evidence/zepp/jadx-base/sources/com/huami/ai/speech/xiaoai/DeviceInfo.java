package com.huami.ai.speech.xiaoai;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.api.engine.VoiceCodeType;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ`\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\fR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\f¨\u00063"}, d2 = {"Lcom/huami/ai/speech/xiaoai/DeviceInfo;", "", "", "component1", "component2", "Lcom/huami/ai/speech/api/engine/VoiceCodeType;", "component3", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "component4", "component5", "", "component6", "()Ljava/lang/Integer;", "component7", "deviceID", "mItoDID", "voiceType", "voiceConfig", "deviceName", DTransferConstants.PID, "vid", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/api/engine/VoiceCodeType;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/ai/speech/xiaoai/DeviceInfo;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDeviceID", "()Ljava/lang/String;", "b", "getMItoDID", "c", "Lcom/huami/ai/speech/api/engine/VoiceCodeType;", "getVoiceType", "()Lcom/huami/ai/speech/api/engine/VoiceCodeType;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "getVoiceConfig", "()Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "e", "getDeviceName", "f", "Ljava/lang/Integer;", "getPid", "g", "getVid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/api/engine/VoiceCodeType;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String deviceID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String mItoDID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final VoiceCodeType voiceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final VoiceConfig voiceConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String deviceName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer pid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer vid;

    public DeviceInfo(@Nullable String str, @Nullable String str2, @NotNull VoiceCodeType voiceCodeType, @NotNull VoiceConfig voiceConfig, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        this.deviceID = str;
        this.mItoDID = str2;
        this.voiceType = voiceCodeType;
        this.voiceConfig = voiceConfig;
        this.deviceName = str3;
        this.pid = num;
        this.vid = num2;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, VoiceCodeType voiceCodeType, VoiceConfig voiceConfig, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.deviceID;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.mItoDID;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            voiceCodeType = deviceInfo.voiceType;
        }
        VoiceCodeType voiceCodeType2 = voiceCodeType;
        if ((i & 8) != 0) {
            voiceConfig = deviceInfo.voiceConfig;
        }
        VoiceConfig voiceConfig2 = voiceConfig;
        if ((i & 16) != 0) {
            str3 = deviceInfo.deviceName;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            num = deviceInfo.pid;
        }
        Integer num3 = num;
        if ((i & 64) != 0) {
            num2 = deviceInfo.vid;
        }
        return deviceInfo.copy(str, str4, voiceCodeType2, voiceConfig2, str5, num3, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceID() {
        return this.deviceID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMItoDID() {
        return this.mItoDID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VoiceCodeType getVoiceType() {
        return this.voiceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VoiceConfig getVoiceConfig() {
        return this.voiceConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPid() {
        return this.pid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getVid() {
        return this.vid;
    }

    @NotNull
    public final DeviceInfo copy(@Nullable String deviceID, @Nullable String mItoDID, @NotNull VoiceCodeType voiceType, @NotNull VoiceConfig voiceConfig, @Nullable String deviceName, @Nullable Integer pid, @Nullable Integer vid) {
        return new DeviceInfo(deviceID, mItoDID, voiceType, voiceConfig, deviceName, pid, vid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceID, deviceInfo.deviceID) && Intrinsics.areEqual(this.mItoDID, deviceInfo.mItoDID) && this.voiceType == deviceInfo.voiceType && Intrinsics.areEqual(this.voiceConfig, deviceInfo.voiceConfig) && Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && Intrinsics.areEqual(this.pid, deviceInfo.pid) && Intrinsics.areEqual(this.vid, deviceInfo.vid);
    }

    @Nullable
    public final String getDeviceID() {
        return this.deviceID;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getMItoDID() {
        return this.mItoDID;
    }

    @Nullable
    public final Integer getPid() {
        return this.pid;
    }

    @Nullable
    public final Integer getVid() {
        return this.vid;
    }

    @NotNull
    public final VoiceConfig getVoiceConfig() {
        return this.voiceConfig;
    }

    @NotNull
    public final VoiceCodeType getVoiceType() {
        return this.voiceType;
    }

    public int hashCode() {
        String str = this.deviceID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mItoDID;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.voiceType.hashCode()) * 31) + this.voiceConfig.hashCode()) * 31;
        String str3 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.pid;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.vid;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(deviceID=" + ((Object) this.deviceID) + ", mItoDID=" + ((Object) this.mItoDID) + ", voiceType=" + this.voiceType + ", voiceConfig=" + this.voiceConfig + ", deviceName=" + ((Object) this.deviceName) + ", pid=" + this.pid + ", vid=" + this.vid + ')';
    }

    public /* synthetic */ DeviceInfo(String str, String str2, VoiceCodeType voiceCodeType, VoiceConfig voiceConfig, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? VoiceCodeType.PCM_16K : voiceCodeType, voiceConfig, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
    }
}
