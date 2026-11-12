package com.xiaomi.fitness.electronic.scale.config.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.configwifi.WifiPBApi;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.MainActivity;
import com.xiaomi.fitness.electronic.scale.OTALogExtKt;
import com.xiaomi.fitness.electronic.scale.WifiInfoActivity;
import com.xiaomi.fitness.electronic.scale.WifiStatusExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.cz7;
import defpackage.f4b;
import defpackage.jz7;
import defpackage.lni;
import defpackage.u7r;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/config/main/EightDeviceConfig;", "Lcom/xiaomi/fitness/electronic/scale/config/main/BaseDeviceConfig;", "<init>", "()V", "isShowVisitor", "", "()Z", "setShowVisitor", "(Z)V", "isShowDeviceShared", "setShowDeviceShared", "isShowDeviceUpdate", "setShowDeviceUpdate", "isShowWifiSetting", "setShowWifiSetting", "isShowToBeClaim", "setShowToBeClaim", "isShowDataReport", "setShowDataReport", "weightPath", "", "getWeightPath", "()Ljava/lang/String;", "setWeightPath", "(Ljava/lang/String;)V", "babyWeightPath", "getBabyWeightPath", "setBabyWeightPath", "deviceUpdatePath", "getDeviceUpdatePath", "setDeviceUpdatePath", "toWifiInfo", "", "baseActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "did", "getMainIcon", "", "model", "getMainTitle", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EightDeviceConfig extends BaseDeviceConfig {

    @NotNull
    public static final String TAG = "EightDeviceMain";
    private boolean isShowVisitor = true;
    private boolean isShowDeviceShared = true;
    private boolean isShowDeviceUpdate = true;
    private boolean isShowWifiSetting = true;
    private boolean isShowToBeClaim = true;
    private boolean isShowDataReport = true;

    @NotNull
    private String weightPath = ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT;

    @NotNull
    private String babyWeightPath = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT;

    @NotNull
    private String deviceUpdatePath = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_OTA;

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    @NotNull
    public String getBabyWeightPath() {
        return this.babyWeightPath;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    @NotNull
    public String getDeviceUpdatePath() {
        return this.deviceUpdatePath;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.DeviceConfig
    public int getMainIcon(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return lni.s;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.DeviceConfig
    public int getMainTitle(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return zzi.x;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    @NotNull
    public String getWeightPath() {
        return this.weightPath;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowDataReport, reason: from getter */
    public boolean getIsShowDataReport() {
        return this.isShowDataReport;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowDeviceShared, reason: from getter */
    public boolean getIsShowDeviceShared() {
        return this.isShowDeviceShared;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowDeviceUpdate, reason: from getter */
    public boolean getIsShowDeviceUpdate() {
        return this.isShowDeviceUpdate;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowToBeClaim, reason: from getter */
    public boolean getIsShowToBeClaim() {
        return this.isShowToBeClaim;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowVisitor, reason: from getter */
    public boolean getIsShowVisitor() {
        return this.isShowVisitor;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    /* JADX INFO: renamed from: isShowWifiSetting, reason: from getter */
    public boolean getIsShowWifiSetting() {
        return this.isShowWifiSetting;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setBabyWeightPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.babyWeightPath = str;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setDeviceUpdatePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceUpdatePath = str;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowDataReport(boolean z) {
        this.isShowDataReport = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowDeviceShared(boolean z) {
        this.isShowDeviceShared = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowDeviceUpdate(boolean z) {
        this.isShowDeviceUpdate = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowToBeClaim(boolean z) {
        this.isShowToBeClaim = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowVisitor(boolean z) {
        this.isShowVisitor = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setShowWifiSetting(boolean z) {
        this.isShowWifiSetting = z;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.BaseDeviceConfig
    public void setWeightPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weightPath = str;
    }

    @Override // com.xiaomi.fitness.electronic.scale.config.main.DeviceConfig
    public void toWifiInfo(@NotNull final BaseActivity baseActivity, @NotNull String did) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(did, "did");
        WifiPBApi.INSTANCE.getWifi(did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.config.main.EightDeviceConfig.toWifiInfo.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                ToastUtil.showShortToast(ResourceExtKt.getString(zzi.m));
                OTALogExtKt.loge(MainActivity.TAG, "getWifiByPb onError, did: " + did2 + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            @SuppressLint({"SetTextI18n"})
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                u7r packet;
                cz7 cz7VarP;
                OTALogExtKt.logi(EightDeviceConfig.TAG, "getWifiByPb, onSuccess, result" + f4b.c(result));
                jz7 jz7VarT = (result == null || (packet = result.getPacket()) == null || (cz7VarP = packet.p()) == null) ? null : cz7VarP.t();
                if (jz7VarT == null || !WifiStatusExtKt.isConfigured(jz7VarT)) {
                    ElectronicScaleManagerExtKt.startConfigWifiActivity(baseActivity, did2, null);
                    return;
                }
                Intent intent = new Intent(baseActivity, (Class<?>) WifiInfoActivity.class);
                intent.putExtra("did", did2);
                intent.putExtra(ElectronicScaleManagerExtKt.PARAM_SSID, jz7VarT != null ? jz7VarT.d : null);
                baseActivity.startActivity(intent);
            }
        });
    }
}
