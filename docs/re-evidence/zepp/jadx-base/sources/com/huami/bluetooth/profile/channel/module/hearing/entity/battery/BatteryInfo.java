package com.huami.bluetooth.profile.channel.module.hearing.entity.battery;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019¨\u0006."}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/BatteryInfo;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "component5", "remainElectricity", "charging", "lastTimeFullCharge", "lastTimeCharge", "levelLastCharge", "copy", "hashCode", "other", "equals", "a", LogUtil.I, "getRemainElectricity", "()I", "setRemainElectricity", "(I)V", "b", "Z", "getCharging", "()Z", "setCharging", "(Z)V", "c", "Ljava/lang/String;", "getLastTimeFullCharge", "()Ljava/lang/String;", "setLastTimeFullCharge", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getLastTimeCharge", "setLastTimeCharge", "e", "getLevelLastCharge", "setLevelLastCharge", "<init>", "(IZLjava/lang/String;Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatteryInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int remainElectricity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean charging;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String lastTimeFullCharge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String lastTimeCharge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int levelLastCharge;

    public BatteryInfo() {
        this(0, false, null, null, 0, 31, null);
    }

    public BatteryInfo(int i, boolean z, @NotNull String str, @NotNull String str2, int i2) {
        this.remainElectricity = i;
        this.charging = z;
        this.lastTimeFullCharge = str;
        this.lastTimeCharge = str2;
        this.levelLastCharge = i2;
    }

    public static /* synthetic */ BatteryInfo copy$default(BatteryInfo batteryInfo, int i, boolean z, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = batteryInfo.remainElectricity;
        }
        if ((i3 & 2) != 0) {
            z = batteryInfo.charging;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            str = batteryInfo.lastTimeFullCharge;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = batteryInfo.lastTimeCharge;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            i2 = batteryInfo.levelLastCharge;
        }
        return batteryInfo.copy(i, z2, str3, str4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRemainElectricity() {
        return this.remainElectricity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCharging() {
        return this.charging;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastTimeFullCharge() {
        return this.lastTimeFullCharge;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastTimeCharge() {
        return this.lastTimeCharge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLevelLastCharge() {
        return this.levelLastCharge;
    }

    @NotNull
    public final BatteryInfo copy(int remainElectricity, boolean charging, @NotNull String lastTimeFullCharge, @NotNull String lastTimeCharge, int levelLastCharge) {
        return new BatteryInfo(remainElectricity, charging, lastTimeFullCharge, lastTimeCharge, levelLastCharge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryInfo)) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) other;
        return this.remainElectricity == batteryInfo.remainElectricity && this.charging == batteryInfo.charging && Intrinsics.areEqual(this.lastTimeFullCharge, batteryInfo.lastTimeFullCharge) && Intrinsics.areEqual(this.lastTimeCharge, batteryInfo.lastTimeCharge) && this.levelLastCharge == batteryInfo.levelLastCharge;
    }

    public final boolean getCharging() {
        return this.charging;
    }

    @NotNull
    public final String getLastTimeCharge() {
        return this.lastTimeCharge;
    }

    @NotNull
    public final String getLastTimeFullCharge() {
        return this.lastTimeFullCharge;
    }

    public final int getLevelLastCharge() {
        return this.levelLastCharge;
    }

    public final int getRemainElectricity() {
        return this.remainElectricity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int i = this.remainElectricity * 31;
        boolean z = this.charging;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((i + r1) * 31) + this.lastTimeFullCharge.hashCode()) * 31) + this.lastTimeCharge.hashCode()) * 31) + this.levelLastCharge;
    }

    public final void setCharging(boolean z) {
        this.charging = z;
    }

    public final void setLastTimeCharge(@NotNull String str) {
        this.lastTimeCharge = str;
    }

    public final void setLastTimeFullCharge(@NotNull String str) {
        this.lastTimeFullCharge = str;
    }

    public final void setLevelLastCharge(int i) {
        this.levelLastCharge = i;
    }

    public final void setRemainElectricity(int i) {
        this.remainElectricity = i;
    }

    @NotNull
    public String toString() {
        return "BatteryInfo{remainElectricity=" + this.remainElectricity + ",charging=" + this.charging + ",lastTimeFullCharge=" + this.lastTimeFullCharge + ",lastTimeCharge=" + this.lastTimeCharge + ",levelLastCharge=" + this.levelLastCharge + '}';
    }

    public /* synthetic */ BatteryInfo(int i, boolean z, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? -1 : i2);
    }
}
