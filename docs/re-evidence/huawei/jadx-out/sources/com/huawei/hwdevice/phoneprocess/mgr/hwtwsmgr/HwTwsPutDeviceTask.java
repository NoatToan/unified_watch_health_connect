package com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.mkf;
import defpackage.mzx;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HwTwsPutDeviceTask extends BaseTwsTask {
    private static final int ACCOUNT_ID_ORDER = 12;
    private static final int CLASS_ORDER = 14;
    private static final int CONVERT_TIME = 2;
    private static final int DEFAULT_VALUE = 0;
    private static final int DEVICE_NAME_ORDER = 7;
    private static final int DEVICE_TYPE_ORDER = 3;
    private static final int HIV_ORDER = 6;
    private static final int LENGTH_VALUE = 1;
    private static final int MAC_ORDER = 8;
    private static final int MANU_ORDER = 4;
    private static final int MODEL_ORDER = 2;
    private static final int PAIR_STATE_ORDER = 10;
    private static final int PRODID_ORDER = 5;
    private static final int PRODUCT_TYPE_WEAR = 4;
    private static final int RESULT_ORDER = 13;
    private static final String SERVICE_ID = "SyncPairToken";
    private static final String SERVICE_TYPE = "syncPairToken";
    private static final int STRING_THRID = 16;
    private static final String TAG = "HwTwsPutDeviceTask";
    private static final String TAG_RELEASE = "R_HwTwsPutDeviceTask";
    private static final int TIMESTAMP_ORDER = 11;
    private static final int TOKEN_ORDER = 9;
    private static final int TOTAL_LENGTH = 32;
    private static final int UDID_ORDER = 1;
    private static final int UUID1_ORDER = 15;
    private static final int UUID2_ORDER = 16;
    private static final int UUID3_ORDER = 17;
    private static final int UUID4_ORDER = 18;
    private static final int UUID5_ORDER = 19;
    private static final int UUID6_ORDER = 20;
    private static final int UUID7_ORDER = 21;
    private static final int UUID8_ORDER = 22;
    private Context mContext;
    private String mData;
    private eet mTlvUtils;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onWaitFor(String str, Object obj) {
        return false;
    }

    public HwTwsPutDeviceTask(String str, eet eetVar, Context context) {
        this.mData = str;
        this.mTlvUtils = eetVar;
        this.mContext = context;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onExecutor(ProfileClient profileClient) {
        String strHandlerReceiverCommand20 = handlerReceiverCommand20(profileClient);
        boolean z = !TextUtils.isEmpty(strHandlerReceiverCommand20);
        ReleaseLogUtil.d(TAG_RELEASE, "Put device to profile is success:", Boolean.valueOf(z));
        sendCommand20(z, strHandlerReceiverCommand20);
        return true;
    }

    private String handlerReceiverCommand20(ProfileClient profileClient) {
        boolean zI = NetworkUtil.i();
        LogUtil.a(TAG, "handlerReceiverCommand20 networkAvailable=", Boolean.valueOf(zI));
        if (!zI) {
            ReleaseLogUtil.d(TAG_RELEASE, "handlerReceiverCommand20Put networkAvailable is not available");
            return "";
        }
        mzx mzxVarBuildPairDevice = buildPairDevice();
        if (mzxVarBuildPairDevice == null) {
            return "";
        }
        if (!isSameAccount(mzxVarBuildPairDevice.e())) {
            LogUtil.j(TAG, "handlerReceiverCommand20 but account not match");
            return "";
        }
        if (!profileClient.putDevice(buildDeviceProfile(mzxVarBuildPairDevice))) {
            LogUtil.j(TAG, "handlerReceiverCommand20 but put device failed!");
            return "";
        }
        if (!profileClient.putServiceOfDevice(mzxVarBuildPairDevice.m(), buildServiceProfile(mzxVarBuildPairDevice))) {
            LogUtil.j(TAG, "handlerReceiverCommand20 but put service failed!");
            return "";
        }
        if (!profileClient.putServiceCharacteristic(mzxVarBuildPairDevice.m(), mzxVarBuildPairDevice.n(), buildServiceCharacteristicProfile(mzxVarBuildPairDevice))) {
            LogUtil.j(TAG, "handlerReceiverCommand20 but put service characteristic failed!");
            return "";
        }
        try {
            Thread.sleep(ProfileExtendConstants.TIME_OUT);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "handlerReceiverCommand20 occur InterruptedException");
        }
        List<DeviceProfile> devicesByType = profileClient.getDevicesByType(mzxVarBuildPairDevice.b(), true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        boolean z = false;
        if (devicesByType != null && devicesByType.size() > 0) {
            ReleaseLogUtil.d(TAG_RELEASE, "handlerReceiverCommand20 deviceListByType size=", Integer.valueOf(devicesByType.size()));
            for (DeviceProfile deviceProfile : devicesByType) {
                if (deviceProfile == null || TextUtils.isEmpty(deviceProfile.getId())) {
                    ReleaseLogUtil.e(TAG_RELEASE, "handlerReceiverCommand20 deviceListByType but profile is null or get id is null");
                } else {
                    Map<String, Object> profile = deviceProfile.getProfile();
                    if (mzxVarBuildPairDevice.b().equals(getValueFromProfile(profile, "devType"))) {
                        String valueFromProfile = getValueFromProfile(profile, "mac");
                        if (!TextUtils.isEmpty(valueFromProfile) && mzxVarBuildPairDevice.f().equals(valueFromProfile)) {
                            ReleaseLogUtil.e(TAG_RELEASE, "handlerReceiverCommand20 deviceListByType match macAddress");
                            z = true;
                        }
                    }
                }
            }
        } else {
            ReleaseLogUtil.d(TAG_RELEASE, "handlerReceiverCommand20 deviceListByType is empty");
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handlerReceiverCommand20 flag=", Boolean.valueOf(z));
        if (!z) {
            return "";
        }
        return mzxVarBuildPairDevice.m();
    }

    private String getValueFromProfile(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            LogUtil.j(TAG, "getValueFromProfile: Get fail key.");
            return "";
        }
        if (!(obj instanceof String)) {
            LogUtil.j(TAG, "getValueFromProfile: class type is wrong key.");
            return "";
        }
        return (String) obj;
    }

    private ServiceCharacteristicProfile buildServiceCharacteristicProfile(mzx mzxVar) {
        ServiceCharacteristicProfile serviceCharacteristicProfile = new ServiceCharacteristicProfile();
        serviceCharacteristicProfile.setIsNeedCloud(true);
        serviceCharacteristicProfile.addEntityInfo("pairToken", eeq.e(mzxVar.o()));
        serviceCharacteristicProfile.addEntityInfo("pairState", Integer.valueOf(mzxVar.i()));
        serviceCharacteristicProfile.addEntityInfo("UUID", mzxVar.p());
        if (mzxVar.d() > 0) {
            serviceCharacteristicProfile.addEntityInfo("class", Integer.valueOf(mzxVar.d()));
        }
        if (mzxVar.l() > 0) {
            serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(mzxVar.l()));
        }
        return serviceCharacteristicProfile;
    }

    private ServiceProfile buildServiceProfile(mzx mzxVar) {
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setIsNeedCloud(true);
        serviceProfile.setId(mzxVar.n());
        serviceProfile.setType(mzxVar.k());
        if (mzxVar.l() > 0) {
            serviceProfile.addEntityInfo("timestamp", Long.valueOf(mzxVar.l()));
        }
        return serviceProfile;
    }

    private mzx buildPairDevice() {
        ees eesVarB;
        try {
            eesVarB = this.mTlvUtils.b(this.mData);
        } catch (eeu unused) {
            LogUtil.e(TAG, "buildPairDevice but find TlvException");
            eesVarB = null;
        }
        if (eesVarB == null) {
            LogUtil.j(TAG, "buildPairDevice but not build tlv father");
            return null;
        }
        List<eew> listE = eesVarB.e();
        if (njy.e(listE)) {
            LogUtil.j(TAG, "buildPairDevice but tlv list is empty");
            return null;
        }
        StringBuilder sb = new StringBuilder(16);
        mzx mzxVar = new mzx();
        buildDeviceFromTlv(mzxVar, sb, listE);
        if (TextUtils.isEmpty(mzxVar.f())) {
            LogUtil.j(TAG, "buildPairDevice but not find mac");
            return null;
        }
        if (mzxVar.o().length <= 0) {
            LogUtil.j(TAG, "buildPairDevice but not find token");
            return null;
        }
        mzxVar.m(sb.toString());
        mzxVar.h(SERVICE_ID);
        mzxVar.i(SERVICE_TYPE);
        return mzxVar;
    }

    private void buildDeviceFromTlv(mzx mzxVar, StringBuilder sb, List<eew> list) {
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            switch (iV) {
                case 1:
                    mzxVar.k(eeq.d(eewVar.b()));
                    break;
                case 2:
                    mzxVar.g(eeq.d(eewVar.b()));
                    break;
                case 3:
                    mzxVar.c(eeq.d(eewVar.b()));
                    break;
                case 4:
                    mzxVar.j(eeq.d(eewVar.b()));
                    break;
                case 5:
                    mzxVar.f(eeq.d(eewVar.b()));
                    break;
                case 6:
                    mzxVar.e(eeq.d(eewVar.b()));
                    break;
                case 7:
                    mzxVar.a(eeq.d(eewVar.b()));
                    break;
                case 8:
                    mzxVar.b(eeq.d(eewVar.b()));
                    break;
                case 9:
                    mzxVar.c(eeq.c(eewVar.b()));
                    break;
                case 10:
                    mzxVar.b(CommonUtil.v(eewVar.b()));
                    break;
                case 11:
                    mzxVar.b(Long.valueOf(CommonUtil.x(eewVar.b())));
                    break;
                case 12:
                    mzxVar.d(eeq.d(eewVar.b()));
                    break;
                case 13:
                default:
                    appendUuid(iV, sb, eewVar);
                    break;
                case 14:
                    mzxVar.e(CommonUtil.v(eewVar.b()));
                    break;
            }
        }
    }

    private void appendUuid(int i, StringBuilder sb, eew eewVar) {
        switch (i) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                sb.append(buildUuid(eewVar.b()));
                break;
            default:
                LogUtil.j(TAG, "receiverCommand20 default:", Integer.valueOf(i));
                break;
        }
    }

    private boolean isSameAccount(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1000);
        if (TextUtils.isEmpty(accountInfo)) {
            return false;
        }
        return accountInfo.equals(str);
    }

    private void addEntityInfo(DeviceProfile deviceProfile, String str, int i) {
        deviceProfile.addEntityInfo(str, Integer.valueOf(i));
    }

    private void addEntityInfo(DeviceProfile deviceProfile, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        deviceProfile.addEntityInfo(str, str2);
    }

    private DeviceProfile buildDeviceProfile(mzx mzxVar) {
        DeviceProfile deviceProfile = new DeviceProfile();
        deviceProfile.setIsNeedCloud(true);
        deviceProfile.setId(mzxVar.m());
        deviceProfile.setType(mzxVar.b());
        addEntityInfo(deviceProfile, "udid", mzxVar.m());
        addEntityInfo(deviceProfile, "devType", mzxVar.b());
        addEntityInfo(deviceProfile, "model", mzxVar.h());
        addEntityInfo(deviceProfile, ProfileRequestConstants.MANU, mzxVar.g());
        addEntityInfo(deviceProfile, "prodId", mzxVar.j());
        addEntityInfo(deviceProfile, ProfileRequestConstants.HIV, mzxVar.c());
        addEntityInfo(deviceProfile, "mac", mzxVar.f());
        addEntityInfo(deviceProfile, "deviceName", mzxVar.a());
        addEntityInfo(deviceProfile, ProfileRequestConstants.PROT_TYPE, 4);
        return deviceProfile;
    }

    private void sendCommand20(boolean z, String str) {
        String str2;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(43);
        deviceCommand.setCommandID(20);
        if (str != null && str.length() != 0) {
            str2 = eeq.d(1) + eeq.d(eeq.a(str).length() / 2) + eeq.a(str);
        } else {
            str2 = "";
        }
        String str3 = str2 + eeq.d(13) + eeq.d(1) + eeq.d(!z ? 1 : 0);
        deviceCommand.setDataContent(eeq.c(str3));
        deviceCommand.setDataLen(eeq.c(str3).length);
        LogUtil.a(TAG, "sendCommand20: ", deviceCommand.toString());
        mkf.e(this.mContext).sendDeviceData(deviceCommand);
    }

    private String buildUuid(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 32) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        int[] iArr = {8, 4, 4, 4, 12};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (str.length() < i2) {
                LogUtil.j(TAG, "out of tempValue length");
            } else {
                sb.append(str.substring(0, i2));
                if (i2 == 12) {
                    sb.append(",");
                } else {
                    sb.append(Constants.LINK);
                    str = str.substring(i2);
                }
            }
        }
        String string = sb.toString();
        LogUtil.a(TAG, "buildUuid success");
        return string;
    }
}
