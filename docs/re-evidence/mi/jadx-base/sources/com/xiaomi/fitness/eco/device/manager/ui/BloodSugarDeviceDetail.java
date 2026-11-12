package com.xiaomi.fitness.eco.device.manager.ui;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.DeviceTime;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.nxi;
import defpackage.yzi;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\n\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002J\u0015\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/BloodSugarDeviceDetail;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "des", "", "getDes", "()Ljava/lang/String;", "getRemainderTime", "conversionTime", "time", "", "(Ljava/lang/Long;)Ljava/lang/String;", "CREATOR", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodSugarDeviceDetail extends EcoDeviceDetail {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.BloodSugarDeviceDetail$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/BloodSugarDeviceDetail$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/ui/BloodSugarDeviceDetail;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/manager/ui/BloodSugarDeviceDetail;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<BloodSugarDeviceDetail> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BloodSugarDeviceDetail createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BloodSugarDeviceDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BloodSugarDeviceDetail[] newArray(int size) {
            return new BloodSugarDeviceDetail[size];
        }
    }

    public BloodSugarDeviceDetail() {
    }

    private final String getRemainderTime() {
        WearableDeviceModel wearableDeviceModel;
        if (TextUtils.isEmpty(getDid()) || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(getDid())) == null) {
            return null;
        }
        DeviceTime deviceExpireTime = BloodSugarExtKt.getDeviceExpireTime(wearableDeviceModel);
        Logger.i("DeviceTime", "activeTime = " + conversionTime(deviceExpireTime.getActiveTime()) + " activeExpireTime = " + conversionTime(deviceExpireTime.getActiveTime()));
        if (deviceExpireTime.getActiveExpireTime() != null && deviceExpireTime.getActiveTime() != null) {
            Long activeExpireTime = deviceExpireTime.getActiveExpireTime();
            Intrinsics.checkNotNull(activeExpireTime);
            long jLongValue = activeExpireTime.longValue();
            Long activeTime = deviceExpireTime.getActiveTime();
            Intrinsics.checkNotNull(activeTime);
            long jLongValue2 = (jLongValue + activeTime.longValue()) - System.currentTimeMillis();
            Resources resources = ApplicationExtKt.getApplication().getResources();
            if (jLongValue2 <= 0) {
                return ResourceExtKt.getString(yzi.c, resources.getQuantityString(nxi.f28544a, 0, 0), resources.getQuantityString(nxi.f28545b, 0, 0), resources.getQuantityString(nxi.c, 0, 0));
            }
            int i = (int) (jLongValue2 / 86400000);
            long j = jLongValue2 % 86400000;
            int i2 = (int) (j / 3600000);
            int i3 = (int) ((j % 3600000) / 60000);
            return ResourceExtKt.getString(yzi.c, resources.getQuantityString(nxi.f28544a, i, Integer.valueOf(i)), resources.getQuantityString(nxi.f28545b, i2, Integer.valueOf(i2)), resources.getQuantityString(nxi.c, i3, Integer.valueOf(i3)));
        }
        return null;
    }

    @NotNull
    public final String conversionTime(@Nullable Long time) {
        if (time == null) {
            return "0";
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time.longValue()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail
    @NotNull
    public String getDes() {
        int connectStatus = getConnectStatus();
        if (connectStatus == -1) {
            return ResourceExtKt.getString(yzi.h);
        }
        if (connectStatus != 7) {
            if (connectStatus != 1) {
                if (connectStatus == 2) {
                    return ResourceExtKt.getString(yzi.g);
                }
                if (connectStatus != 3) {
                    if (connectStatus != 4) {
                        if (connectStatus != 5) {
                            return ResourceExtKt.getString(yzi.r0, ResourceExtKt.getString(yzi.e), ResourceExtKt.getString(yzi.f));
                        }
                    }
                }
            }
            return ResourceExtKt.getString(yzi.r0, ResourceExtKt.getString(yzi.e), ResourceExtKt.getString(yzi.f));
        }
        String remainderTime = getRemainderTime();
        return remainderTime != null ? ResourceExtKt.getString(yzi.r0, ResourceExtKt.getString(yzi.d), remainderTime) : ResourceExtKt.getString(yzi.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BloodSugarDeviceDetail(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
