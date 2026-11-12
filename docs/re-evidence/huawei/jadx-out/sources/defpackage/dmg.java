package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.hihealth.HiUserInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class dmg extends AppBundlePluginProxy<DeviceManagerApi> implements DeviceManagerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile dmg f32000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceManagerApi f32001b;

    private dmg() {
        super("DeviceManagerProxy", "PluginDevice", "com.huawei.health.impl.DeviceManagerImpl");
        this.f32001b = createPluginApi();
    }

    public static dmg a() {
        dmg dmgVar;
        if (f32000a == null) {
            synchronized (dmg.class) {
                if (f32000a == null) {
                    f32000a = new dmg();
                }
                dmgVar = f32000a;
            }
            return dmgVar;
        }
        return f32000a;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f32001b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(DeviceManagerApi deviceManagerApi) {
        this.f32001b = deviceManagerApi;
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void init() {
        if (isPluginAvaiable()) {
            this.f32001b.init();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void startMeasureBackground(Context context, int i, HealthDevice.HealthDeviceKind healthDeviceKind, MeasureResult.MeasureResultListener measureResultListener) {
        if (isPluginAvaiable()) {
            this.f32001b.startMeasureBackground(context, i, healthDeviceKind, measureResultListener);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void stopMeasureBackground(String str, String str2) {
        if (isPluginAvaiable()) {
            this.f32001b.stopMeasureBackground(str, str2);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<String> getBondedProductsForDeviceOnly(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedProductsForDeviceOnly(healthDeviceKind);
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public com.huawei.hihealth.device.open.HealthDevice getBondedDeviceUniversal(String str, String str2) {
        return this.f32001b.getBondedDeviceUniversal(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void syncDevice() {
        if (isPluginAvaiable()) {
            this.f32001b.syncDevice();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isRopeDeviceBtConnected() {
        if (isPluginAvaiable()) {
            return this.f32001b.isRopeDeviceBtConnected();
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setSkippingTargetMode(SkippingTargetMode skippingTargetMode) {
        if (isPluginAvaiable()) {
            this.f32001b.setSkippingTargetMode(skippingTargetMode);
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int[] iArr) {
        if (isPluginAvaiable()) {
            this.f32001b.setFitnessMachineControl(i, iArr);
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int i2, int[] iArr) {
        if (isPluginAvaiable()) {
            this.f32001b.setFitnessMachineControl(i, i2, iArr);
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setMessageOrStateCallback(String str, MessageOrStateCallback messageOrStateCallback, boolean z) {
        if (isPluginAvaiable()) {
            this.f32001b.setMessageOrStateCallback(str, messageOrStateCallback, z);
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void removeMessageOrStateCallback(String str, boolean z) {
        if (isPluginAvaiable()) {
            this.f32001b.removeMessageOrStateCallback(str, z);
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void releaseResource() {
        if (isPluginAvaiable()) {
            this.f32001b.releaseResource();
        }
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public String getCurrentMacAddress() {
        if (isPluginAvaiable()) {
            return this.f32001b.getCurrentMacAddress();
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void requestDeviceInfoAndState(String str) {
        if (isPluginAvaiable()) {
            this.f32001b.requestDeviceInfoAndState(str);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getProductId() {
        if (isPluginAvaiable()) {
            return this.f32001b.getProductId();
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserWeight(int i) {
        if (isPluginAvaiable()) {
            this.f32001b.setUserWeight(i);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setHeightIsNotSet(boolean z) {
        if (isPluginAvaiable()) {
            this.f32001b.setHeightIsNotSet(z);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isMiniScaleDevice(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.isMiniScaleDevice(str);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean getResetWifi() {
        if (isPluginAvaiable()) {
            return this.f32001b.getResetWifi();
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void deliveringUserInformation(String str, String str2, HiUserInfo hiUserInfo) {
        if (isPluginAvaiable()) {
            this.f32001b.deliveringUserInformation(str, str2, hiUserInfo);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void uploadDeviceToCloud(String str, String str2) {
        if (isPluginAvaiable()) {
            this.f32001b.uploadDeviceToCloud(str, str2);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserGender(int i, HiUserInfo hiUserInfo) {
        if (isPluginAvaiable()) {
            this.f32001b.setUserGender(i, hiUserInfo);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<String> getBondedWiFiDevices() {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedWiFiDevices();
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isBondHuaweiBleScaleDevice() {
        if (isPluginAvaiable()) {
            return this.f32001b.isBondHuaweiBleScaleDevice();
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean showConfirmUserInfo(String str, boolean z) {
        if (isPluginAvaiable()) {
            return this.f32001b.showConfirmUserInfo(str, z);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendUserInfo(String str) {
        if (isPluginAvaiable()) {
            this.f32001b.sendUserInfo(str);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendUserInfo(Bundle bundle) {
        if (isPluginAvaiable()) {
            this.f32001b.sendUserInfo(bundle);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHonourWeightDevice(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.isHonourWeightDevice(str);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHagridWiFiDevice(String str, String str2) {
        if (isPluginAvaiable()) {
            return this.f32001b.isHagridWiFiDevice(str, str2);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setBindStatus(int i) {
        if (isPluginAvaiable()) {
            this.f32001b.setBindStatus(i);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHonourScaleDevice(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.isHonourScaleDevice(str);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getH5Path(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getH5Path(str);
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getSubProductId(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getSubProductId(str);
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void downloadBloodSugarDeviceResource(Activity activity) {
        if (isPluginAvaiable()) {
            this.f32001b.downloadBloodSugarDeviceResource(activity);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void destroyResourceDownloadTool() {
        if (isPluginAvaiable()) {
            this.f32001b.destroyResourceDownloadTool();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setBeginMeasureBiAnalytics(String str) {
        if (isPluginAvaiable()) {
            this.f32001b.setBeginMeasureBiAnalytics(str);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserGoalWeight(float f) {
        if (isPluginAvaiable()) {
            this.f32001b.setUserGoalWeight(f);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public float getLastestWeight() {
        if (isPluginAvaiable()) {
            return this.f32001b.getLastestWeight();
        }
        return 0.0f;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean getHeightIsNotSet() {
        if (isPluginAvaiable()) {
            return this.f32001b.getHeightIsNotSet();
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void scaleUpdateJump(Context context, Uri uri) {
        if (isPluginAvaiable()) {
            this.f32001b.scaleUpdateJump(context, uri);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getUserName(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getUserName(str);
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getMainUserUuid() {
        if (isPluginAvaiable()) {
            return this.f32001b.getMainUserUuid();
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void initUserIfEmpty() {
        if (isPluginAvaiable()) {
            this.f32001b.initUserIfEmpty();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void startSync() {
        if (isPluginAvaiable()) {
            this.f32001b.startSync();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendEventToKaKa(int i) {
        if (isPluginAvaiable()) {
            this.f32001b.sendEventToKaKa(i);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserCollectionSwitch(boolean z) {
        if (isPluginAvaiable()) {
            this.f32001b.setUserCollectionSwitch(z);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void confirmDevUserInfo() {
        if (isPluginAvaiable()) {
            this.f32001b.confirmDevUserInfo();
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<Long> getDeviceCodeFromWiFiDevice() {
        if (isPluginAvaiable()) {
            return this.f32001b.getDeviceCodeFromWiFiDevice();
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByUniqueId(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedDeviceByUniqueId(str);
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByUniqueId(String str, boolean z) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedDeviceByUniqueId(str, z);
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByBroadcastName(String str, String str2) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedDeviceByBroadcastName(str, str2);
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ContentValues getDeviceInfoByUniqueId(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getDeviceInfoByUniqueId(str);
        }
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<ContentValues> getBondedDeviceByProductId(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedDeviceByProductId(str);
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<MeasurableDevice> getBondedDevices(String str, boolean z) {
        if (isPluginAvaiable()) {
            return this.f32001b.getBondedDevices(str, z);
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isBondedDevice(String str) {
        if (isPluginAvaiable()) {
            return this.f32001b.isBondedDevice(str);
        }
        return false;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public int updateBondedDevice(ContentValues contentValues, String str, String[] strArr) {
        if (isPluginAvaiable()) {
            return this.f32001b.updateBondedDevice(contentValues, str, strArr);
        }
        return -1;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setFitnessRopeConfig(int i, int i2, int[] iArr) {
        if (isPluginAvaiable()) {
            this.f32001b.setFitnessRopeConfig(i, i2, iArr);
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void registerDeviceInfo(String str, HealthDevice healthDevice, String str2) {
        if (isPluginAvaiable()) {
            this.f32001b.registerDeviceInfo(str, healthDevice, str2);
        }
    }
}
