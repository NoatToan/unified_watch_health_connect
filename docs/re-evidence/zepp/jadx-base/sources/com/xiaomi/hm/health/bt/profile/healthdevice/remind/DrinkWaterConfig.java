package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.model.SimpleTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JA\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/DrinkWaterConfig;", "", "", "toString", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "component1", "component2", "", "component3", "component4", "", "component5", "startTime", "stopTime", "interval", "invalidTime", "enable", "copy", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "getStartTime", "()Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "b", "getStopTime", "c", LogUtil.I, "getInterval", "()I", GoogleApiAvailabilityLight.a, "getInvalidTime", "e", "Z", "getEnable", "()Z", "<init>", "(Lcom/xiaomi/hm/health/bt/model/SimpleTime;Lcom/xiaomi/hm/health/bt/model/SimpleTime;ILcom/xiaomi/hm/health/bt/model/SimpleTime;Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DrinkWaterConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final SimpleTime startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final SimpleTime stopTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int interval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final SimpleTime invalidTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean enable;

    public DrinkWaterConfig(@Nullable SimpleTime simpleTime, @Nullable SimpleTime simpleTime2, int i, @Nullable SimpleTime simpleTime3, boolean z) {
        this.startTime = simpleTime;
        this.stopTime = simpleTime2;
        this.interval = i;
        this.invalidTime = simpleTime3;
        this.enable = z;
    }

    public static /* synthetic */ DrinkWaterConfig copy$default(DrinkWaterConfig drinkWaterConfig, SimpleTime simpleTime, SimpleTime simpleTime2, int i, SimpleTime simpleTime3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            simpleTime = drinkWaterConfig.startTime;
        }
        if ((i2 & 2) != 0) {
            simpleTime2 = drinkWaterConfig.stopTime;
        }
        SimpleTime simpleTime4 = simpleTime2;
        if ((i2 & 4) != 0) {
            i = drinkWaterConfig.interval;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            simpleTime3 = drinkWaterConfig.invalidTime;
        }
        SimpleTime simpleTime5 = simpleTime3;
        if ((i2 & 16) != 0) {
            z = drinkWaterConfig.enable;
        }
        return drinkWaterConfig.copy(simpleTime, simpleTime4, i3, simpleTime5, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SimpleTime getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SimpleTime getStopTime() {
        return this.stopTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInterval() {
        return this.interval;
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

    @NotNull
    public final DrinkWaterConfig copy(@Nullable SimpleTime startTime, @Nullable SimpleTime stopTime, int interval, @Nullable SimpleTime invalidTime, boolean enable) {
        return new DrinkWaterConfig(startTime, stopTime, interval, invalidTime, enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrinkWaterConfig)) {
            return false;
        }
        DrinkWaterConfig drinkWaterConfig = (DrinkWaterConfig) other;
        return Intrinsics.areEqual(this.startTime, drinkWaterConfig.startTime) && Intrinsics.areEqual(this.stopTime, drinkWaterConfig.stopTime) && this.interval == drinkWaterConfig.interval && Intrinsics.areEqual(this.invalidTime, drinkWaterConfig.invalidTime) && this.enable == drinkWaterConfig.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getInterval() {
        return this.interval;
    }

    @Nullable
    public final SimpleTime getInvalidTime() {
        return this.invalidTime;
    }

    @Nullable
    public final SimpleTime getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final SimpleTime getStopTime() {
        return this.stopTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        SimpleTime simpleTime = this.startTime;
        int iHashCode = (simpleTime == null ? 0 : simpleTime.hashCode()) * 31;
        SimpleTime simpleTime2 = this.stopTime;
        int iHashCode2 = (((iHashCode + (simpleTime2 == null ? 0 : simpleTime2.hashCode())) * 31) + this.interval) * 31;
        SimpleTime simpleTime3 = this.invalidTime;
        int iHashCode3 = (iHashCode2 + (simpleTime3 != null ? simpleTime3.hashCode() : 0)) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    @NotNull
    public String toString() {
        return "DrinkRemind[startTime: " + this.startTime + ", stopTime: " + this.stopTime + ", interval: " + this.interval + ", invalidTime: " + this.invalidTime + ", enable: " + this.enable + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ DrinkWaterConfig(SimpleTime simpleTime, SimpleTime simpleTime2, int i, SimpleTime simpleTime3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : simpleTime, (i2 & 2) != 0 ? null : simpleTime2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : simpleTime3, z);
    }
}
