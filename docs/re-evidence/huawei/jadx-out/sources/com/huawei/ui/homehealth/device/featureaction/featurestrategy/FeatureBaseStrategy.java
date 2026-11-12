package com.huawei.ui.homehealth.device.featureaction.featurestrategy;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.R;
import defpackage.dmz;
import defpackage.ecu;
import defpackage.iov;
import defpackage.lvl;
import defpackage.maq;
import defpackage.qpx;
import defpackage.rpr;
import defpackage.rtg;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class FeatureBaseStrategy implements FeatureStrategy {
    private static final String TAG = "FeatureBaseStrategy";
    public DeviceInfo mDeviceInfo;

    protected boolean canJumpWithBaseModel() {
        return false;
    }

    protected abstract boolean canJumpWithConnect();

    protected boolean canJumpWithOtaTransfering() {
        return false;
    }

    protected abstract void reportBiEvent();

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        DeviceInfo deviceInfo2;
        DeviceInfo deviceInfo3;
        this.mDeviceInfo = deviceInfo;
        if (!canJumpWithBaseModel() && LoginInit.checkBaseServiceModel()) {
            LogUtil.j(TAG, "jumpToFeaturePage checkBaseServiceModel");
            if (emitter != null) {
                emitter.onError("baseServiceModel");
            }
            return true;
        }
        if (!canJumpWithConnect() && ((deviceInfo3 = this.mDeviceInfo) == null || deviceInfo3.getDeviceConnectState() != 2)) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_device_pair_connect_detail);
            if (emitter != null) {
                emitter.onError("device not connected");
            }
            return true;
        }
        if (!canJumpWithOtaTransfering() && (deviceInfo2 = this.mDeviceInfo) != null && isOtaTransfering(deviceInfo2.getDeviceIdentify()) && ignoreOtaTransfering()) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_device_ota_later_note);
            if (emitter != null) {
                emitter.onError("device OtaTransfering");
            }
            return true;
        }
        reportBiEvent();
        return false;
    }

    private boolean isOtaTransfering(String str) {
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(com.huawei.haf.application.BaseApplication.b());
        return deviceSettingsInteractorsE.e(str) != null && deviceSettingsInteractorsE.e(str).isOtaUpdate() && maq.b().c(str) == 6;
    }

    private boolean isPowerSaveModel() {
        DeviceInfo deviceInfo = this.mDeviceInfo;
        if (deviceInfo == null) {
            LogUtil.a(TAG, "isPowerSaveModel deviceInfo is null");
            return false;
        }
        int powerSaveModel = deviceInfo.getPowerSaveModel();
        LogUtil.a(TAG, "powerSaveModel:", Integer.valueOf(powerSaveModel));
        return powerSaveModel == 1;
    }

    private boolean ignoreOtaTransfering() {
        if (isPowerSaveModel()) {
            return ((this instanceof rtg) || (this instanceof rpr)) ? false : true;
        }
        return true;
    }

    public DeviceInfo getDeviceInfoByDeviceUUID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return getDeviceInfoFromCloud(str);
        }
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
    }

    private static DeviceInfo getDeviceInfoFromCloud(String str) {
        List<DeviceInfo> listD;
        if (TextUtils.isEmpty(str) || (listD = lvl.d()) == null) {
            return null;
        }
        for (DeviceInfo deviceInfo : listD) {
            if (deviceInfo instanceof CloudDeviceInfo) {
                if (str.equals(((CloudDeviceInfo) deviceInfo).getDeviceProfileId())) {
                    LogUtil.a(TAG, "deviceInfo is CloudDeviceInfo");
                    return deviceInfo;
                }
            } else if (str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.a(TAG, "deviceInfo is local DeviceInfo");
                return deviceInfo;
            }
        }
        return null;
    }

    public void startActivity(String str, HashMap<String, String> map) {
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        if (map != null && !map.isEmpty()) {
            for (String str2 : map.keySet()) {
                intent.putExtra(str2, map.get(str2));
            }
        }
        intent.setClassName(dmz.y, str);
        iov.d(BaseApplication.getContext(), intent);
    }
}
