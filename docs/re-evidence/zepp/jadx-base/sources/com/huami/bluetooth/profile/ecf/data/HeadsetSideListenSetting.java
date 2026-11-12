package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b!\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u00020\u001d8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "", "", "component1", "component2", "", "component3", "version", "volume", "voiceEnhancement", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "getVolume", "c", "Z", "getVoiceEnhancement", "()Z", GoogleApiAvailabilityLight.a, "getVoiceEnhancementEnable", "voiceEnhancementEnable", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(IIZ)V", "(IZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetSideListenSetting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int e = 0;
    private static final int f = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int volume;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean voiceEnhancement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean voiceEnhancementEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "from", "", "HEADSET_SIDE_LISTEN_SETTING_BYTES", LogUtil.I, "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HeadsetSideListenSetting from(@Nullable byte[] bytes) {
            if (bytes != null && bytes.length >= 3) {
                return new HeadsetSideListenSetting(bytes[0], bytes[1], ByteUtilsKt.toBoolean(bytes[2]));
            }
            return null;
        }
    }

    public HeadsetSideListenSetting(int i, int i2, boolean z) {
        this.version = i;
        this.volume = i2;
        this.voiceEnhancement = z;
        this.voiceEnhancementEnable = true;
    }

    public static /* synthetic */ HeadsetSideListenSetting copy$default(HeadsetSideListenSetting headsetSideListenSetting, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = headsetSideListenSetting.version;
        }
        if ((i3 & 2) != 0) {
            i2 = headsetSideListenSetting.volume;
        }
        if ((i3 & 4) != 0) {
            z = headsetSideListenSetting.voiceEnhancement;
        }
        return headsetSideListenSetting.copy(i, i2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getVoiceEnhancement() {
        return this.voiceEnhancement;
    }

    @NotNull
    public final HeadsetSideListenSetting copy(int version, int volume, boolean voiceEnhancement) {
        return new HeadsetSideListenSetting(version, volume, voiceEnhancement);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetSideListenSetting)) {
            return false;
        }
        HeadsetSideListenSetting headsetSideListenSetting = (HeadsetSideListenSetting) other;
        return this.version == headsetSideListenSetting.version && this.volume == headsetSideListenSetting.volume && this.voiceEnhancement == headsetSideListenSetting.voiceEnhancement;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        return new byte[]{(byte) this.version, (byte) this.volume, ByteUtilsKt.toByte(this.voiceEnhancement)};
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean getVoiceEnhancement() {
        return this.voiceEnhancement;
    }

    public final boolean getVoiceEnhancementEnable() {
        return this.voiceEnhancementEnable;
    }

    public final int getVolume() {
        return this.volume;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int i = ((this.version * 31) + this.volume) * 31;
        boolean z = this.voiceEnhancement;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    @NotNull
    public String toString() {
        return "HeadsetSideListenSetting(version=" + this.version + ", volume=" + this.volume + ", voiceEnhancement=" + this.voiceEnhancement + ')';
    }

    public HeadsetSideListenSetting(int i, boolean z) {
        this(0, i, z);
    }
}
