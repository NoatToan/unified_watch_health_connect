package com.xiaomi.fitness.sport_manager.device.data;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport_manager.data.ISender;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import defpackage.gon;
import defpackage.mzn;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010'\u001a\u00020 ¢\u0006\u0004\b(\u0010&J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/device/data/BleSender;", "Lcom/xiaomi/fitness/sport_manager/data/ISender;", "Ls7r;", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callback", "", "call", "(Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "", "timeout", "callTimeout", "(Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;I)V", "Lgon;", "getGymLock", "(Lgon;)V", "", "speed", "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "pace", "setGymPace", "(ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "Lmzn;", "", "getSportReportList", "(Lmzn;)V", "wakeMachineScreen", "()V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "deviceModel", "<init>", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BleSender implements ISender {

    @NotNull
    public static final String TAG = "BleSender";

    @Nullable
    private WearableDeviceModel mDeviceModel;

    public BleSender(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.mDeviceModel = deviceModel;
    }

    public final void call(@NotNull s7r wearPacket, boolean needResponse, @NotNull OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(wearPacket, "wearPacket");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("BleSender", "call , mDeviceModel : " + getMDeviceModel() + " , ");
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, mDeviceModel != null ? mDeviceModel.getDid() : null, wearPacket, needResponse, callback, 0, 16, (Object) null);
    }

    public final void callTimeout(@NotNull s7r wearPacket, boolean needResponse, @NotNull OnSyncCallback callback, int timeout) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(wearPacket, "wearPacket");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("BleSender", "call , callTimeout");
        if (getMDeviceModel() != null) {
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            deviceSyncExtKt.call((mDeviceModel == null || (deviceInfo = mDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), wearPacket, needResponse, callback, timeout);
        }
    }

    public void getGymLock(@Nullable gon callback) {
    }

    @Nullable
    public WearableDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    public void getSportReportList(@Nullable mzn<Object> callback) {
    }

    public void setGymPace(int pace, @Nullable SportRequestCallback callback) {
    }

    public void setGymSpeed(float speed, @Nullable SportRequestCallback callback) {
    }

    public void setMDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.mDeviceModel = wearableDeviceModel;
    }

    public void wakeMachineScreen() {
    }
}
