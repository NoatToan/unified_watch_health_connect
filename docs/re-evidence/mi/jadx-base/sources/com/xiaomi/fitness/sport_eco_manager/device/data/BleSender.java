package com.xiaomi.fitness.sport_eco_manager.device.data;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.sport_eco_manager.data.ISender;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import defpackage.hon;
import defpackage.nzn;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010,\u001a\u00020%¢\u0006\u0004\b-\u0010+J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/device/data/BleSender;", "Lcom/xiaomi/fitness/sport_eco_manager/data/ISender;", "Lu7r;", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "callback", "", "call", "(Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "", "timeout", "callTimeout", "(Lu7r;ZLcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;I)V", "Lhon;", "getGymLock", "(Lhon;)V", "", "speed", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "ftpTest", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "ftpPercentRpm", "setGymFtpPercentRpm", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "pace", "setGymPace", "Lnzn;", "", "getSportReportList", "(Lnzn;)V", "wakeMachineScreen", "()V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "deviceModel", "<init>", "Companion", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BleSender implements ISender {

    @NotNull
    public static final String TAG = "BleSender";

    @Nullable
    private EcoDeviceModel mDeviceModel;

    public BleSender(@NotNull EcoDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.mDeviceModel = deviceModel;
    }

    public final void call(@NotNull u7r wearPacket, boolean needResponse, @NotNull OnEcoSyncCallback callback) {
        Intrinsics.checkNotNullParameter(wearPacket, "wearPacket");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("BleSender", "call , mDeviceModel : " + getMDeviceModel() + " , ");
        EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
        EcoDeviceModel mDeviceModel = getMDeviceModel();
        EcoDeviceContact.DefaultImpls.call$default(ecoDeviceSyncExtKt, mDeviceModel != null ? mDeviceModel.getDid() : null, wearPacket, needResponse, callback, 0, 16, null);
    }

    public final void callTimeout(@NotNull u7r wearPacket, boolean needResponse, @NotNull OnEcoSyncCallback callback, int timeout) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(wearPacket, "wearPacket");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FitnessLogUtils.i("BleSender", "call , callTimeout");
        if (getMDeviceModel() != null) {
            EcoDeviceContact ecoDeviceSyncExtKt = EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE);
            EcoDeviceModel mDeviceModel = getMDeviceModel();
            ecoDeviceSyncExtKt.call((mDeviceModel == null || (deviceInfo = mDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getDid(), wearPacket, needResponse, callback, timeout);
        }
    }

    public void getGymLock(@Nullable hon callback) {
    }

    @Nullable
    public EcoDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    public void getSportReportList(@Nullable nzn<Object> callback) {
    }

    public void setGymFtpPercentRpm(int ftpPercentRpm, @Nullable SportRequestCallback callback) {
    }

    public void setGymFtpTest(boolean ftpTest, @Nullable SportRequestCallback callback) {
    }

    public void setGymPace(int pace, @Nullable SportRequestCallback callback) {
    }

    public void setGymSpeed(float speed, @Nullable SportRequestCallback callback) {
    }

    public void setMDeviceModel(@Nullable EcoDeviceModel ecoDeviceModel) {
        this.mDeviceModel = ecoDeviceModel;
    }

    public void wakeMachineScreen() {
    }
}
