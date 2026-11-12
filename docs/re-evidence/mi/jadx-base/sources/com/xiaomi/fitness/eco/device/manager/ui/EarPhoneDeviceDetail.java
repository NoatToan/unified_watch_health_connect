package com.xiaomi.fitness.eco.device.manager.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.BatteryInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/EarPhoneDeviceDetail;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "statusText", "", "getStatusText", "()Ljava/lang/String;", "des", "getDes", "getRemainderTime", "getBatteryText", "batteryInfo", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "CREATOR", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EarPhoneDeviceDetail extends EcoDeviceDetail {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.EarPhoneDeviceDetail$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/EarPhoneDeviceDetail$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EarPhoneDeviceDetail;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/manager/ui/EarPhoneDeviceDetail;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EarPhoneDeviceDetail> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EarPhoneDeviceDetail createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EarPhoneDeviceDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EarPhoneDeviceDetail[] newArray(int size) {
            return new EarPhoneDeviceDetail[size];
        }
    }

    public EarPhoneDeviceDetail() {
    }

    private final String getBatteryText(BatteryInfo batteryInfo) {
        LogExtKt.logi("getBatteryText: batteryInfo=" + batteryInfo);
        String string = ResourceExtKt.getString(yzi.L, Integer.valueOf(batteryInfo.getBattery()));
        Logger.i("EarPhoneDeviceDetail", "batteryText = " + string);
        return string;
    }

    private final String getRemainderTime() {
        BatteryInfo batteryInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(getDid());
        if (wearableDeviceModel == null) {
            return null;
        }
        try {
            batteryInfo = wearableDeviceModel.getDeviceInfo().getBatteryInfo();
        } catch (Exception e) {
            Logger.e("can DeviceStatusViewnot get battery info because " + e, new Object[0]);
            batteryInfo = null;
        }
        LogExtKt.logi("updateBatteryText: batteryInfo = " + batteryInfo + ",battery = " + (batteryInfo != null ? Integer.valueOf(batteryInfo.getBattery()) : null));
        if (batteryInfo == null || batteryInfo.getBattery() < 0) {
            return null;
        }
        return getBatteryText(batteryInfo);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail
    @NotNull
    public String getDes() {
        switch (getConnectStatus()) {
            case -1:
                return ResourceExtKt.getString(yzi.h);
            case 0:
            default:
                return ResourceExtKt.getString(yzi.p0);
            case 1:
            case 4:
                return ResourceExtKt.getString(yzi.p0);
            case 2:
                return ResourceExtKt.getString(yzi.g);
            case 3:
            case 5:
            case 7:
                String remainderTime = getRemainderTime();
                return remainderTime != null ? ResourceExtKt.getString(yzi.r0, ResourceExtKt.getString(yzi.d), remainderTime) : ResourceExtKt.getString(yzi.d);
            case 6:
                return ResourceExtKt.getString(yzi.z0);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail
    @NotNull
    public String getStatusText() {
        int connectStatus = getConnectStatus();
        if (connectStatus != 2) {
            if (connectStatus != 3) {
                if (connectStatus != 6) {
                    if (connectStatus != 7) {
                        String string = ApplicationExtKt.getApplication().getString(yzi.o0);
                        Intrinsics.checkNotNull(string);
                        return string;
                    }
                }
            }
            String string2 = ApplicationExtKt.getApplication().getString(yzi.y0);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        return "...";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EarPhoneDeviceDetail(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
