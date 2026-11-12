package com.xiaomi.fitness.device.manager.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.mibi.sdk.component.Constants;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\bH\u0016J\b\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020,H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\n¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", Column.BATTERY, "", "getBattery", "()I", "setBattery", "(I)V", "chargeInfo", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;", "getChargeInfo", "()Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;", "setChargeInfo", "(Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;)V", Constants.KEY_CHARGE_STATUS, "getChargeStatus", "setChargeStatus", "lastCharge", "Ljava/util/Calendar;", "getLastCharge", "()Ljava/util/Calendar;", "setLastCharge", "(Ljava/util/Calendar;)V", "isCharging", "", "()Z", "setCharging", "(Z)V", "isChargeFull", "setChargeFull", "lastChargeDays", "getLastChargeDays", "chargeDays", "getChargeDays", "writeToParcel", "", "flags", "describeContents", "toString", "", "CREATOR", "ChargeInfo", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatteryInfo implements Parcelable {
    public static final int CHARGE_ERROR = -2;
    public static final int CHARGE_NONE = -1;
    public static final int CHARGING = 1;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FULL = 3;
    public static final int NOT_CHARGING = 2;
    public static final int UNKNOWN = 0;
    private int battery;

    @Nullable
    private ChargeInfo chargeInfo;
    private int chargeStatus;
    private boolean isChargeFull;
    private boolean isCharging;

    @Nullable
    private Calendar lastCharge;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.bean.BatteryInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "<init>", "()V", "CHARGE_NONE", "", "CHARGE_ERROR", DeviceTypes.UNKNOWN, "CHARGING", "NOT_CHARGING", "FULL", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "(I)[Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "state", "", "getState", "()I", "setState", "(I)V", "timestamp", "", "getTimestamp", "()J", "setTimestamp", "(J)V", "describeContents", "writeToParcel", "", "dest", "flags", "toString", "", "CREATOR", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChargeInfo implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int LAST_CHARGE = 2;
        public static final int LAST_FULL_CHARGE = 3;
        public static final int NOT_CHARGE_AFTER_BIND = 1;
        public static final int UNKNOWN = 0;
        private int state;
        private long timestamp;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.bean.BatteryInfo$ChargeInfo$CREATOR, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001d\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;", "<init>", "()V", DeviceTypes.UNKNOWN, "", "NOT_CHARGE_AFTER_BIND", "LAST_CHARGE", "LAST_FULL_CHARGE", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "(I)[Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo$ChargeInfo;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<ChargeInfo> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public ChargeInfo createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ChargeInfo(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public ChargeInfo[] newArray(int size) {
                return new ChargeInfo[size];
            }
        }

        public ChargeInfo() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ChargeInfo(@NotNull Parcel parcel) {
            this();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.state = parcel.readInt();
            this.timestamp = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getState() {
            return this.state;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final void setState(int i) {
            this.state = i;
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }

        @NotNull
        public String toString() {
            return "ChargeInfo(state=" + this.state + ", timestamp=" + this.timestamp + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.state);
            dest.writeLong(this.timestamp);
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

    public final int getChargeDays() {
        long j;
        Calendar calendar = this.lastCharge;
        int i = -1;
        if (calendar != null) {
            Intrinsics.checkNotNull(calendar);
            if (calendar.getTimeInMillis() != 0) {
                Calendar calendar2 = this.lastCharge;
                Intrinsics.checkNotNull(calendar2);
                if (calendar2.get(1) == 1970) {
                    return -2;
                }
                Calendar calendar3 = Calendar.getInstance();
                Calendar calendar4 = this.lastCharge;
                if (calendar4 != null) {
                    Logger.i("lastCharge:" + calendar4, new Object[0]);
                    Calendar calendar5 = Calendar.getInstance();
                    calendar5.set(calendar4.get(1), calendar4.get(2), calendar4.get(5), 0, 0, 0);
                    long timeInMillis = calendar3.getTimeInMillis() - calendar5.getTime().getTime();
                    if (timeInMillis < 0) {
                        j = -1;
                    } else {
                        long j2 = 86400000;
                        j = timeInMillis % j2 == 0 ? (timeInMillis / j2) - 1 : timeInMillis / j2;
                    }
                    i = (int) j;
                }
                Logger.i("charge " + i + " days ago", new Object[0]);
                if (i < 0) {
                    return -2;
                }
                return i;
            }
        }
        return -1;
    }

    @Nullable
    public final ChargeInfo getChargeInfo() {
        return this.chargeInfo;
    }

    public final int getChargeStatus() {
        return this.chargeStatus;
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
        Calendar calendar3 = Calendar.getInstance();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long timeInMillis = calendar3.getTimeInMillis();
        Calendar calendar4 = this.lastCharge;
        Intrinsics.checkNotNull(calendar4);
        int days = (int) timeUnit.toDays(timeInMillis - calendar4.getTimeInMillis());
        Logger.i(days + " days ago", new Object[0]);
        if (days < 0) {
            return -2;
        }
        return days;
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

    public final void setChargeInfo(@Nullable ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public final void setChargeStatus(int i) {
        this.chargeStatus = i;
    }

    public final void setCharging(boolean z) {
        this.isCharging = z;
    }

    public final void setLastCharge(@Nullable Calendar calendar) {
        this.lastCharge = calendar;
    }

    @NotNull
    public String toString() {
        return "BatteryInfo(battery=" + this.battery + ", chargeStatue = " + this.chargeStatus + ",lastCharge=" + this.lastCharge + ", isCharging=" + this.isCharging + ", isChargeFull=" + this.isChargeFull + ", lastChargeDays=" + getLastChargeDays() + ",chargeDays = " + getChargeDays() + ",chargeInfo=" + this.chargeInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.battery);
        parcel.writeInt(this.chargeStatus);
        parcel.writeInt(this.isCharging ? 1 : 0);
        parcel.writeInt(this.isChargeFull ? 1 : 0);
        parcel.writeSerializable(this.lastCharge);
        parcel.writeParcelable(this.chargeInfo, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.battery = parcel.readInt();
        this.chargeStatus = parcel.readInt();
        this.isCharging = parcel.readInt() == 1;
        this.isChargeFull = parcel.readInt() == 1;
        this.lastCharge = (Calendar) parcel.readSerializable();
        this.chargeInfo = (ChargeInfo) parcel.readParcelable(ChargeInfo.class.getClassLoader());
    }
}
