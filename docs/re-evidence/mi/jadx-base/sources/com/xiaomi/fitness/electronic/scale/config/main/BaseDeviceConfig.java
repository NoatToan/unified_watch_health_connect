package com.xiaomi.fitness.electronic.scale.config.main;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\"\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J,\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/config/main/BaseDeviceConfig;", "Lcom/xiaomi/fitness/electronic/scale/config/main/DeviceConfig;", "<init>", "()V", "isShowVisitor", "", "()Z", "setShowVisitor", "(Z)V", "isShowDeviceShared", "setShowDeviceShared", "isShowDeviceUpdate", "setShowDeviceUpdate", "isShowWifiSetting", "setShowWifiSetting", "isShowToBeClaim", "setShowToBeClaim", "isShowDataReport", "setShowDataReport", "weightPath", "", "getWeightPath", "()Ljava/lang/String;", "setWeightPath", "(Ljava/lang/String;)V", "babyWeightPath", "getBabyWeightPath", "setBabyWeightPath", "deviceUpdatePath", "getDeviceUpdatePath", "setDeviceUpdatePath", "unbindDevice", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "did", "unbindCallback", "Lcom/xiaomi/fitness/electronic/scale/config/main/UnbindDeviceCallback;", "unbind", "unbindMember", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDeviceConfig implements DeviceConfig {
    private boolean isShowDataReport;
    private boolean isShowDeviceShared;
    private boolean isShowDeviceUpdate;
    private boolean isShowToBeClaim;
    private boolean isShowVisitor;
    private boolean isShowWifiSetting;

    @NotNull
    private String weightPath = "";

    @NotNull
    private String babyWeightPath = "";

    @NotNull
    private String deviceUpdatePath = "";

    /* JADX INFO: Access modifiers changed from: private */
    public final void unbind(final BaseActivity activity, String did, final UnbindDeviceCallback unbindCallback) {
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig.unbind.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                AnyExtKt.main$default(null, new BaseDeviceConfig$unbind$1$onFail$1(activity, unbindCallback, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                AnyExtKt.main$default(null, new BaseDeviceConfig$unbind$1$onSuccess$1(activity, unbindCallback, null), 1, null);
            }
        });
    }

    private final void unbindMember(EcoDeviceModel deviceModel, final BaseActivity activity, String did, final UnbindDeviceCallback unbindCallback) {
        if (deviceModel != null && !deviceModel.getIsDeviceConnected()) {
            EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE).showConnectDialogForUnbindMember(activity);
        } else {
            activity.showLoading();
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delSharedMember(Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig.unbindMember.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did2, int type, int code) {
                    Logger.i(EightDeviceConfig.TAG, "ScaleCmdHelper.delSharedMember error type:" + type + ",code" + code);
                    activity.dismissDialog();
                    BaseActivity baseActivity = activity;
                    String string = baseActivity.getString(zzi.w4);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ToastExtKt.toastShort(baseActivity, string);
                    UnbindDeviceCallback unbindDeviceCallback = unbindCallback;
                    if (unbindDeviceCallback != null) {
                        unbindDeviceCallback.onUnbindFailure();
                    }
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did2, int type, EcoSyncResult result) {
                    Logger.i(EightDeviceConfig.TAG, "ScaleCmdHelper.delSharedMember success" + (result != null ? result.getPacket() : null));
                    EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
                    Intrinsics.checkNotNull(did2);
                    ecoDeviceManagerExtKt.disconnectDevice(did2);
                    BaseDeviceConfig.this.unbind(activity, did2, unbindCallback);
                }
            });
        }
    }

    @NotNull
    public String getBabyWeightPath() {
        return this.babyWeightPath;
    }

    @NotNull
    public String getDeviceUpdatePath() {
        return this.deviceUpdatePath;
    }

    @NotNull
    public String getWeightPath() {
        return this.weightPath;
    }

    /* JADX INFO: renamed from: isShowDataReport, reason: from getter */
    public boolean getIsShowDataReport() {
        return this.isShowDataReport;
    }

    /* JADX INFO: renamed from: isShowDeviceShared, reason: from getter */
    public boolean getIsShowDeviceShared() {
        return this.isShowDeviceShared;
    }

    /* JADX INFO: renamed from: isShowDeviceUpdate, reason: from getter */
    public boolean getIsShowDeviceUpdate() {
        return this.isShowDeviceUpdate;
    }

    /* JADX INFO: renamed from: isShowToBeClaim, reason: from getter */
    public boolean getIsShowToBeClaim() {
        return this.isShowToBeClaim;
    }

    /* JADX INFO: renamed from: isShowVisitor, reason: from getter */
    public boolean getIsShowVisitor() {
        return this.isShowVisitor;
    }

    /* JADX INFO: renamed from: isShowWifiSetting, reason: from getter */
    public boolean getIsShowWifiSetting() {
        return this.isShowWifiSetting;
    }

    public void setBabyWeightPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.babyWeightPath = str;
    }

    public void setDeviceUpdatePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceUpdatePath = str;
    }

    public void setShowDataReport(boolean z) {
        this.isShowDataReport = z;
    }

    public void setShowDeviceShared(boolean z) {
        this.isShowDeviceShared = z;
    }

    public void setShowDeviceUpdate(boolean z) {
        this.isShowDeviceUpdate = z;
    }

    public void setShowToBeClaim(boolean z) {
        this.isShowToBeClaim = z;
    }

    public void setShowVisitor(boolean z) {
        this.isShowVisitor = z;
    }

    public void setShowWifiSetting(boolean z) {
        this.isShowWifiSetting = z;
    }

    public void setWeightPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weightPath = str;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.DeviceConfig
    public void unbindDevice(@NotNull final BaseActivity activity, @NotNull String did, @Nullable final UnbindDeviceCallback unbindCallback) {
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(did, "did");
        if (!NetworkExtKt.isNetworkAvailable()) {
            String string = activity.getString(zzi.e4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(activity, string);
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel != null && (deviceInfo = ecoDeviceModel.getDeviceInfo()) != null && !deviceInfo.isOwner()) {
            unbindMember(ecoDeviceModel, activity, did, unbindCallback);
            return;
        }
        activity.showLoading();
        if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            unbind(activity, did, unbindCallback);
        } else {
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).restoreFactory(did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig.unbindDevice.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did2, int type, int code) {
                    Logger.i(EightDeviceConfig.TAG, "unbind error type:" + type + ",code" + code);
                    activity.dismissDialog();
                    BaseActivity baseActivity = activity;
                    String string2 = baseActivity.getString(zzi.w4);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    ToastExtKt.toastShort(baseActivity, string2);
                    UnbindDeviceCallback unbindDeviceCallback = unbindCallback;
                    if (unbindDeviceCallback != null) {
                        unbindDeviceCallback.onUnbindFailure();
                    }
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did2, int type, EcoSyncResult result) {
                    Logger.i(EightDeviceConfig.TAG, "unbind success" + (result != null ? result.getPacket() : null));
                    EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
                    Intrinsics.checkNotNull(did2);
                    ecoDeviceManagerExtKt.disconnectDevice(did2);
                    BaseDeviceConfig.this.unbind(activity, did2, unbindCallback);
                }
            });
        }
    }
}
