package com.smarthome.core.ota;

import android.content.Context;
import android.text.TextUtils;
import com.smarthome.core.device.SmartDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.core.server.internal.device.DeviceFactory;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import defpackage.i0d;
import defpackage.nv2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/smarthome/core/ota/SDKBleOtaPresenter;", "", "", "checkBleUpdate", "()V", "startUpgrade", "Lnv2;", "mPresenter", "Lnv2;", "getMPresenter", "()Lnv2;", "setMPresenter", "(Lnv2;)V", "Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;", "mUpdateInfo", "Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;", "getMUpdateInfo", "()Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;", "setMUpdateInfo", "(Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;)V", "Landroid/content/Context;", "context", "Li0d;", b.E, "", "authType", "Lcom/smarthome/core/device/SmartDeviceInfo;", "btDevice", "<init>", "(Landroid/content/Context;Li0d;ILcom/smarthome/core/device/SmartDeviceInfo;)V", "smarthome-core_release"}, k = 1, mv = {1, 6, 0})
public final class SDKBleOtaPresenter {

    @NotNull
    private nv2 mPresenter;

    @Nullable
    private BleMeshFirmwareUpdateInfo mUpdateInfo;

    public SDKBleOtaPresenter(@NotNull Context context, @NotNull final i0d host, int i, @NotNull SmartDeviceInfo btDevice) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(btDevice, "btDevice");
        i0d i0dVar = new i0d() { // from class: com.smarthome.core.ota.SDKBleOtaPresenter$iUpgradeHost$1
            @Override // defpackage.i0d
            public void checkBleUpdateInfo(@Nullable String currentVersion, @Nullable BleMeshFirmwareUpdateInfo updateInfo) {
                this.setMUpdateInfo(updateInfo);
                if ((updateInfo == null ? null : updateInfo.mcuUpdateInfo) != null && !TextUtils.isEmpty(updateInfo.mcuUpdateInfo.currentMcuVersion)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) currentVersion);
                    sb.append('.');
                    sb.append((Object) updateInfo.mcuUpdateInfo.currentMcuVersion);
                    currentVersion = sb.toString();
                }
                host.checkBleUpdateInfo(currentVersion, updateInfo);
            }

            @Override // defpackage.i0d
            @NotNull
            public Context getContext() {
                Context context2 = host.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "host.getContext()");
                return context2;
            }

            @Override // defpackage.i0d
            public void onCheckFail(int code) {
                host.onCheckFail(code);
            }

            @Override // defpackage.i0d
            public void onInstalling() {
                host.onInstalling();
            }

            @Override // defpackage.i0d
            public void onSuccess() {
                host.onSuccess();
            }

            @Override // defpackage.i0d
            public void onUpgradeFail(int code) {
                host.onUpgradeFail(code);
            }

            @Override // defpackage.i0d
            public void onUpgrading() {
                host.onUpgrading();
            }

            @Override // defpackage.i0d
            public void showLog(@Nullable String msg) {
                host.showLog(msg);
            }

            @Override // defpackage.i0d
            public void showProgress(int progress) {
                host.showProgress(progress);
            }
        };
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", btDevice.getModel());
        jSONObject.put("mac", btDevice.getMac());
        jSONObject.put("did", btDevice.getDid());
        if (btDevice.getExtraJson() != null) {
            jSONObject.put("extra", new JSONObject(btDevice.getExtraJson()));
        }
        this.mPresenter = new nv2(context, i0dVar, i, DeviceFactory.createDevice(jSONObject), "", "debug:", "");
    }

    public final void checkBleUpdate() {
        this.mPresenter.T();
    }

    @NotNull
    public final nv2 getMPresenter() {
        return this.mPresenter;
    }

    @Nullable
    public final BleMeshFirmwareUpdateInfo getMUpdateInfo() {
        return this.mUpdateInfo;
    }

    public final void setMPresenter(@NotNull nv2 nv2Var) {
        Intrinsics.checkNotNullParameter(nv2Var, "<set-?>");
        this.mPresenter = nv2Var;
    }

    public final void setMUpdateInfo(@Nullable BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo) {
        this.mUpdateInfo = bleMeshFirmwareUpdateInfo;
    }

    public final void startUpgrade() {
        if (this.mUpdateInfo == null) {
            return;
        }
        getMPresenter().m0(getMUpdateInfo());
    }
}
