package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.heathdevice.RemindType;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.SimpleTime;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BC\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000fHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*\"\u0004\b-\u0010.R\u0019\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b4\u00102\"\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/CommonRemindConfig;", "", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "adjustConfig", "", "toString", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "component1", "", "component2", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "component3", "component4", "", "component5", "component6", "type", "index", "startTime", "invalidTime", "enable", "supportInvalidTime", "copy", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "getType", "()Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "setType", "(Lcom/huami/bluetooth/profile/heathdevice/RemindType;)V", "b", "B", "getIndex", "()B", "c", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "getStartTime", "()Lcom/xiaomi/hm/health/bt/model/SimpleTime;", GoogleApiAvailabilityLight.a, "getInvalidTime", "setInvalidTime", "(Lcom/xiaomi/hm/health/bt/model/SimpleTime;)V", "e", "Z", "getEnable", "()Z", "f", "getSupportInvalidTime", "setSupportInvalidTime", "(Z)V", "<init>", "(Lcom/huami/bluetooth/profile/heathdevice/RemindType;BLcom/xiaomi/hm/health/bt/model/SimpleTime;Lcom/xiaomi/hm/health/bt/model/SimpleTime;ZZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonRemindConfig {
    private static final byte g = 0;
    private static final byte h = 1;
    private static final byte i = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private RemindType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final SimpleTime startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private SimpleTime invalidTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean enable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean supportInvalidTime;

    public CommonRemindConfig(@NotNull RemindType remindType, byte b, @Nullable SimpleTime simpleTime, @Nullable SimpleTime simpleTime2, boolean z, boolean z2) {
        this.type = remindType;
        this.index = b;
        this.startTime = simpleTime;
        this.invalidTime = simpleTime2;
        this.enable = z;
        this.supportInvalidTime = z2;
    }

    public static /* synthetic */ CommonRemindConfig copy$default(CommonRemindConfig commonRemindConfig, RemindType remindType, byte b, SimpleTime simpleTime, SimpleTime simpleTime2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            remindType = commonRemindConfig.type;
        }
        if ((i2 & 2) != 0) {
            b = commonRemindConfig.index;
        }
        byte b2 = b;
        if ((i2 & 4) != 0) {
            simpleTime = commonRemindConfig.startTime;
        }
        SimpleTime simpleTime3 = simpleTime;
        if ((i2 & 8) != 0) {
            simpleTime2 = commonRemindConfig.invalidTime;
        }
        SimpleTime simpleTime4 = simpleTime2;
        if ((i2 & 16) != 0) {
            z = commonRemindConfig.enable;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = commonRemindConfig.supportInvalidTime;
        }
        return commonRemindConfig.copy(remindType, b2, simpleTime3, simpleTime4, z3, z2);
    }

    public final void adjustConfig(@Nullable DeviceInfo deviceInfo) {
        RemindType remindType;
        if (deviceInfo == null) {
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        boolean zHasFeatureJHS = HMDeviceFeature.hasFeatureJHS(deviceSource);
        if (zHasFeatureJHS && (this.type instanceof RemindType.EatBreakfast) && ProfileUtils.isValidFirmware(deviceInfo, "V1.0.7.86")) {
            byte b = this.index;
            if (b == 0) {
                remindType = RemindType.EatBreakfast.INSTANCE;
            } else if (b == 1) {
                remindType = RemindType.EatLaunch.INSTANCE;
            } else {
                remindType = b == 2 ? RemindType.EatDinner.INSTANCE : this.type;
            }
            this.type = remindType;
        }
        boolean zHasQinLingFuture = HMDeviceFeature.hasQinLingFuture(deviceSource);
        if (zHasFeatureJHS || zHasQinLingFuture) {
            return;
        }
        this.supportInvalidTime = false;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RemindType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SimpleTime getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SimpleTime getInvalidTime() {
        return this.invalidTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSupportInvalidTime() {
        return this.supportInvalidTime;
    }

    @NotNull
    public final CommonRemindConfig copy(@NotNull RemindType type, byte index, @Nullable SimpleTime startTime, @Nullable SimpleTime invalidTime, boolean enable, boolean supportInvalidTime) {
        return new CommonRemindConfig(type, index, startTime, invalidTime, enable, supportInvalidTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRemindConfig)) {
            return false;
        }
        CommonRemindConfig commonRemindConfig = (CommonRemindConfig) other;
        return Intrinsics.areEqual(this.type, commonRemindConfig.type) && this.index == commonRemindConfig.index && Intrinsics.areEqual(this.startTime, commonRemindConfig.startTime) && Intrinsics.areEqual(this.invalidTime, commonRemindConfig.invalidTime) && this.enable == commonRemindConfig.enable && this.supportInvalidTime == commonRemindConfig.supportInvalidTime;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final byte getIndex() {
        return this.index;
    }

    @Nullable
    public final SimpleTime getInvalidTime() {
        return this.invalidTime;
    }

    @Nullable
    public final SimpleTime getStartTime() {
        return this.startTime;
    }

    public final boolean getSupportInvalidTime() {
        return this.supportInvalidTime;
    }

    @NotNull
    public final RemindType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.index) * 31;
        SimpleTime simpleTime = this.startTime;
        int iHashCode2 = (iHashCode + (simpleTime == null ? 0 : simpleTime.hashCode())) * 31;
        SimpleTime simpleTime2 = this.invalidTime;
        int iHashCode3 = (iHashCode2 + (simpleTime2 != null ? simpleTime2.hashCode() : 0)) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode3 + r1) * 31;
        boolean z2 = this.supportInvalidTime;
        return i2 + (z2 ? 1 : z2);
    }

    public final void setInvalidTime(@Nullable SimpleTime simpleTime) {
        this.invalidTime = simpleTime;
    }

    public final void setSupportInvalidTime(boolean z) {
        this.supportInvalidTime = z;
    }

    public final void setType(@NotNull RemindType remindType) {
        this.type = remindType;
    }

    @NotNull
    public String toString() {
        return "CommonRemind[type: " + this.type + ", startTime: " + this.startTime + ", invalidTime: " + this.invalidTime + ", enable: " + this.enable + ", index: " + ((int) this.index) + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ CommonRemindConfig(RemindType remindType, byte b, SimpleTime simpleTime, SimpleTime simpleTime2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(remindType, (i2 & 2) != 0 ? (byte) 0 : b, (i2 & 4) != 0 ? null : simpleTime, (i2 & 8) != 0 ? null : simpleTime2, z, (i2 & 32) != 0 ? true : z2);
    }
}
