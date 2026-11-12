package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.circulate.device.api.Column;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.bean.EcoBatteryInfo, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\n¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBatteryInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", Column.BATTERY, "", "getBattery", "()I", "setBattery", "(I)V", "lastCharge", "Ljava/util/Calendar;", "getLastCharge", "()Ljava/util/Calendar;", "setLastCharge", "(Ljava/util/Calendar;)V", "isCharging", "", "()Z", "setCharging", "(Z)V", "isChargeFull", "setChargeFull", "lastChargeDays", "getLastChargeDays", "writeToParcel", "", "flags", "describeContents", "toString", "", "CREATOR", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatteryInfo implements Parcelable {
    public static final int CHARGE_ERROR = -2;
    public static final int CHARGE_NONE = -1;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int battery;
    private boolean isChargeFull;
    private boolean isCharging;

    @Nullable
    private Calendar lastCharge;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.bean.EcoBatteryInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBatteryInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBatteryInfo;", "<init>", "()V", "CHARGE_NONE", "", "CHARGE_ERROR", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "(I)[Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBatteryInfo;", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<BatteryInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BatteryInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BatteryInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BatteryInfo[] newArray(int size) {
            return new BatteryInfo[size];
        }
    }

    public BatteryInfo() {
        this.battery = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBattery() {
        return this.battery;
    }

    @Nullable
    public final Calendar getLastCharge() {
        return this.lastCharge;
    }

    public final int getLastChargeDays() {
        Calendar calendar = this.lastCharge;
        if (calendar == null) {
            return -1;
        }
        Intrinsics.checkNotNull(calendar);
        if (calendar.getTimeInMillis() == 0) {
            return -1;
        }
        Calendar calendar2 = this.lastCharge;
        Intrinsics.checkNotNull(calendar2);
        if (calendar2.get(1) == 1970) {
            return -2;
        }
        int timeInMillis = ((int) Calendar.getInstance().getTimeInMillis()) / 86400000;
        Calendar calendar3 = this.lastCharge;
        Intrinsics.checkNotNull(calendar3);
        int timeInMillis2 = timeInMillis - (((int) calendar3.getTimeInMillis()) / 86400000);
        if (timeInMillis2 < 0) {
            return -2;
        }
        return timeInMillis2;
    }

    /* JADX INFO: renamed from: isChargeFull, reason: from getter */
    public final boolean getIsChargeFull() {
        return this.isChargeFull;
    }

    /* JADX INFO: renamed from: isCharging, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    public final void setBattery(int i) {
        this.battery = i;
    }

    public final void setChargeFull(boolean z) {
        this.isChargeFull = z;
    }

    public final void setCharging(boolean z) {
        this.isCharging = z;
    }

    public final void setLastCharge(@Nullable Calendar calendar) {
        this.lastCharge = calendar;
    }

    @NotNull
    public String toString() {
        return "BatteryInfo(battery=" + this.battery + ", lastCharge=" + this.lastCharge + ", isCharging=" + this.isCharging + ", isChargeFull=" + this.isChargeFull + ", lastChargeDays=" + getLastChargeDays() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.battery);
        parcel.writeInt(this.isCharging ? 1 : 0);
        parcel.writeInt(this.isChargeFull ? 1 : 0);
        parcel.writeSerializable(this.lastCharge);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.battery = parcel.readInt();
        this.isCharging = parcel.readInt() == 1;
        this.isChargeFull = parcel.readInt() == 1;
        this.lastCharge = (Calendar) parcel.readSerializable();
    }
}
