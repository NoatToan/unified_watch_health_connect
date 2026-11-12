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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,B!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b+\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0016\u0010*\u001a\u00020'8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "", "", "component1", "", "component2", "component3", "Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "component4", "version", "meterEnhancement", "autoSideListen", "hrBroadcast", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "Z", "getMeterEnhancement", "()Z", "c", "getAutoSideListen", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "getHrBroadcast", "()Lcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;", "e", "getMeterEnhancementEnable", "meterEnhancementEnable", "f", "getSportHrBroadcastEnable", "sportHrBroadcastEnable", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(IZZLcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;)V", "(ZZLcom/huami/bluetooth/profile/ecf/data/HrBroadcastType;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetSportSetting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int g = 0;
    private static final int h = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean meterEnhancement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean autoSideListen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final HrBroadcastType hrBroadcast;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean meterEnhancementEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean sportHrBroadcastEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "from", "", "HEADSET_SPORT_CONFIG_BYTES", LogUtil.I, "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HeadsetSportSetting from(@Nullable byte[] bytes) {
            if (bytes == null || bytes.length < 4) {
                return null;
            }
            int i = bytes[0] & 255;
            HrBroadcastType hrBroadcastType = HrBroadcastType.INSTANCE.parseHrBroadcastType(bytes[3] & 255);
            if (hrBroadcastType == null) {
                hrBroadcastType = HrBroadcastType.CLOSE;
            }
            return new HeadsetSportSetting(i, ByteUtilsKt.toBoolean(bytes[1]), ByteUtilsKt.toBoolean(bytes[2]), hrBroadcastType);
        }
    }

    public HeadsetSportSetting(int i, boolean z, boolean z2, @NotNull HrBroadcastType hrBroadcastType) {
        this.version = i;
        this.meterEnhancement = z;
        this.autoSideListen = z2;
        this.hrBroadcast = hrBroadcastType;
        this.meterEnhancementEnable = true;
        this.sportHrBroadcastEnable = true;
    }

    public static /* synthetic */ HeadsetSportSetting copy$default(HeadsetSportSetting headsetSportSetting, int i, boolean z, boolean z2, HrBroadcastType hrBroadcastType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = headsetSportSetting.version;
        }
        if ((i2 & 2) != 0) {
            z = headsetSportSetting.meterEnhancement;
        }
        if ((i2 & 4) != 0) {
            z2 = headsetSportSetting.autoSideListen;
        }
        if ((i2 & 8) != 0) {
            hrBroadcastType = headsetSportSetting.hrBroadcast;
        }
        return headsetSportSetting.copy(i, z, z2, hrBroadcastType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMeterEnhancement() {
        return this.meterEnhancement;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAutoSideListen() {
        return this.autoSideListen;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HrBroadcastType getHrBroadcast() {
        return this.hrBroadcast;
    }

    @NotNull
    public final HeadsetSportSetting copy(int version, boolean meterEnhancement, boolean autoSideListen, @NotNull HrBroadcastType hrBroadcast) {
        return new HeadsetSportSetting(version, meterEnhancement, autoSideListen, hrBroadcast);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetSportSetting)) {
            return false;
        }
        HeadsetSportSetting headsetSportSetting = (HeadsetSportSetting) other;
        return this.version == headsetSportSetting.version && this.meterEnhancement == headsetSportSetting.meterEnhancement && this.autoSideListen == headsetSportSetting.autoSideListen && this.hrBroadcast == headsetSportSetting.hrBroadcast;
    }

    public final boolean getAutoSideListen() {
        return this.autoSideListen;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        return new byte[]{(byte) this.version, ByteUtilsKt.toByte(this.meterEnhancement), ByteUtilsKt.toByte(this.autoSideListen), (byte) this.hrBroadcast.getValue()};
    }

    @NotNull
    public final HrBroadcastType getHrBroadcast() {
        return this.hrBroadcast;
    }

    public final boolean getMeterEnhancement() {
        return this.meterEnhancement;
    }

    public final boolean getMeterEnhancementEnable() {
        return this.meterEnhancementEnable;
    }

    public final boolean getSportHrBroadcastEnable() {
        return this.sportHrBroadcastEnable;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = this.version * 31;
        boolean z = this.meterEnhancement;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.autoSideListen;
        return ((i2 + (z2 ? 1 : z2)) * 31) + this.hrBroadcast.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeadsetSportSetting(version=" + this.version + ", meterEnhancement=" + this.meterEnhancement + ", autoSideListen=" + this.autoSideListen + ", hrBroadcast=" + this.hrBroadcast + ')';
    }

    public /* synthetic */ HeadsetSportSetting(int i, boolean z, boolean z2, HrBroadcastType hrBroadcastType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, z2, (i2 & 8) != 0 ? HrBroadcastType.CLOSE : hrBroadcastType);
    }

    public HeadsetSportSetting(boolean z, boolean z2, @NotNull HrBroadcastType hrBroadcastType) {
        this(0, z, z2, hrBroadcastType);
    }
}
