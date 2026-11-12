package com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import defpackage.eeq;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.mkf;
import defpackage.mzx;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HwTwsGetDeviceTask extends BaseTwsTask {
    private static final int ACCOUNT_ID = 1;
    private static final int COMPARE_BIG = 1;
    private static final int COMPARE_SMALL = -1;
    private static final int CONVERT_TIME = 2;
    private static final int DEFAULT_VALUE = 0;
    private static final int DEVICE_NAME_ORDER = 4;
    private static final int FRAME_MAX_NUMBER = 4;
    private static final int INDEX_VALUE = 8;
    private static final int LENGTH_VALUE = 1;
    private static final int LIST_ORDER = 129;
    private static final int MAC_VALUE = 5;
    private static final String SERVICE_DEVICE_TYPE = "serviceDeviceType";
    private static final int STRUCT_ORDER = 130;
    private static final int SUPPORT_MAX_NUMBER = 3;
    private static final String TAG = "HwTwsGetDeviceTask";
    private static final String TAG_RELEASE = "R_HwTwsGetDeviceTask";
    private static final int TIME_STAMP_VALUE = 7;
    private static final int TOKEN_VALUE = 6;
    private static final int TOTAL_NAME = 2;
    private static final int UUID_ORDER = 3;
    private static final long WAIT_MESSAGE_TIMEOUT = 20000;
    private Context mContext;
    private List<mzx> mPairDeviceList = null;
    private eet mTlvUtils;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean isTypeGet() {
        return true;
    }

    public HwTwsGetDeviceTask(eet eetVar, Context context) {
        this.mTlvUtils = eetVar;
        this.mContext = context;
    }

    static class e implements Comparator<mzx>, Serializable {
        private static final long serialVersionUID = -7495480833886617508L;

        private e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(mzx mzxVar, mzx mzxVar2) {
            if (mzxVar.l() > mzxVar2.l()) {
                return -1;
            }
            return mzxVar.l() < mzxVar2.l() ? 1 : 0;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public String getTaskName() {
        return "DeviceConnect";
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onExecutor(ProfileClient profileClient) {
        List<mzx> devicesFromProfile = getDevicesFromProfile(profileClient);
        if (devicesFromProfile == null) {
            LogUtil.j(TAG, "Task find pair list is null,task name:", getTaskName());
            return true;
        }
        this.mPairDeviceList = devicesFromProfile;
        ReleaseLogUtil.d(TAG, "getDevicesPromProfile total pair lists.size:", Integer.valueOf(devicesFromProfile.size()));
        sendCommand18(devicesFromProfile.size());
        setWaitMessage("Wait_5_43_18", 20000L);
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onWaitFor(String str, Object obj) {
        LogUtil.a(TAG, "onWaitFor:", str, ",taskName:", getTaskName());
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr == null || bArr.length <= 0) {
            LogUtil.j(TAG, "onWaitFor do not find wait message");
            return true;
        }
        receiverCommand18(bArr);
        return true;
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

    private List<mzx> getDevicesFromProfile(ProfileClient profileClient) {
        LogUtil.a(TAG, "getDevicesPromProfile enter");
        List<DeviceProfile> devicesByType = profileClient.getDevicesByType("082", true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devicesByType == null) {
            LogUtil.j(TAG, "getDevicesPromProfile but profile find error");
            return null;
        }
        LogUtil.a(TAG, "getDevicesByType list size = ", Integer.valueOf(devicesByType.size()));
        ArrayList arrayList = new ArrayList(16);
        for (DeviceProfile deviceProfile : devicesByType) {
            if (deviceProfile == null || TextUtils.isEmpty(deviceProfile.getId())) {
                LogUtil.j(TAG, "getDevicesPromProfile but deviceProfile is null or get id is null");
            } else {
                Map<String, Object> profile = deviceProfile.getProfile();
                String valueFromProfile = getValueFromProfile(profile, "devType");
                if (!"082".equals(valueFromProfile)) {
                    LogUtil.j(TAG, "getDevicesPromProfile but not Tws type:", valueFromProfile);
                } else {
                    String valueFromProfile2 = getValueFromProfile(profile, "mac");
                    if (TextUtils.isEmpty(valueFromProfile2)) {
                        LogUtil.j(TAG, "getDevicesPromProfile but not find mac address:");
                    } else {
                        String valueFromProfile3 = getValueFromProfile(profile, "udid");
                        Map<String, Object> serviceProfileMap = getServiceProfileMap(profileClient, valueFromProfile3);
                        if (serviceProfileMap == null || serviceProfileMap.isEmpty()) {
                            LogUtil.j(TAG, "getDevicesPromProfile do not get serviceProfileMap");
                        } else {
                            mzx mzxVarBuildTrustPairDevice = buildTrustPairDevice(valueFromProfile, valueFromProfile3, valueFromProfile2, profile, serviceProfileMap);
                            if (mzxVarBuildTrustPairDevice == null) {
                                LogUtil.j(TAG, "getDevicesPromProfile do not create pair device");
                            } else {
                                mzx deviceByUdId = getDeviceByUdId(valueFromProfile3, arrayList);
                                if (deviceByUdId != null) {
                                    arrayList.remove(deviceByUdId);
                                    LogUtil.j(TAG, "getDevicesPromProfile find same udid device,need remove");
                                }
                                LogUtil.a(TAG, "getDevicesPromProfile add trust pair device");
                                arrayList.add(mzxVarBuildTrustPairDevice);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private mzx getDeviceByUdId(String str, List<mzx> list) {
        for (mzx mzxVar : list) {
            if (str.equals(mzxVar.m())) {
                return mzxVar;
            }
        }
        return null;
    }

    private mzx buildTrustPairDevice(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        mzx mzxVar = new mzx();
        mzxVar.k(str2);
        mzxVar.b(str3);
        mzxVar.c(str);
        mzxVar.m(getValueFromProfile(map, "udid"));
        mzxVar.g(getValueFromProfile(map, "model"));
        mzxVar.j(getValueFromProfile(map, ProfileRequestConstants.MANU));
        mzxVar.f(getValueFromProfile(map, "prodId"));
        mzxVar.e(getValueFromProfile(map, ProfileRequestConstants.HIV));
        mzxVar.a(getValueFromProfile(map, "deviceName"));
        mzxVar.h("SyncPairToken");
        mzxVar.i(getValueFromProfile(map2, SERVICE_DEVICE_TYPE));
        if (!mzxVar.c(eeq.c(getValueFromProfile(map2, "pairToken")))) {
            LogUtil.j(TAG, "buildTrustPairDevice but do not find token");
            return null;
        }
        long longFromProfile = getLongFromProfile(map2, "timestamp");
        if (longFromProfile == null) {
            longFromProfile = 0L;
            LogUtil.a(TAG, "buildTrustPairDevice find timestamp is null");
        }
        mzxVar.b(longFromProfile);
        return mzxVar;
    }

    private Map<String, Object> getServiceProfileMap(ProfileClient profileClient, String str) {
        List<ServiceProfile> serviceProfiles = getServiceProfiles(profileClient, str);
        if (serviceProfiles == null) {
            LogUtil.j(TAG, "getServiceProfileMap getServicesOfDevice : fail,serviceProfileList is null");
            return null;
        }
        LogUtil.j(TAG, "getServiceProfileMap serviceProfileList.size():", Integer.valueOf(serviceProfiles.size()));
        for (ServiceProfile serviceProfile : serviceProfiles) {
            if ("SyncPairToken".equals(serviceProfile.getId())) {
                if (TextUtils.isEmpty(serviceProfile.getType())) {
                    LogUtil.j(TAG, "getServiceProfileMap serviceProfile.getType() is empty");
                    return null;
                }
                ServiceCharacteristicProfile serviceCharacteristicProfile = getServiceCharacteristicProfile(profileClient, str);
                if (serviceCharacteristicProfile == null) {
                    LogUtil.j(TAG, "getServiceProfileMap characteristicProfile is null");
                    return null;
                }
                Map<String, Object> profile = serviceCharacteristicProfile.getProfile();
                profile.put(SERVICE_DEVICE_TYPE, serviceProfile.getType());
                return profile;
            }
        }
        return null;
    }

    private ServiceCharacteristicProfile getServiceCharacteristicProfile(ProfileClient profileClient, String str) {
        LogUtil.a(TAG, "getServiceCharacteristicProfile enter");
        ServiceCharacteristicProfile serviceCharacteristics = profileClient.getServiceCharacteristics(str, "SyncPairToken", false, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics != null && serviceCharacteristics.getProfile() != null && !serviceCharacteristics.getProfile().isEmpty() && isTokensValid(serviceCharacteristics)) {
            return serviceCharacteristics;
        }
        LogUtil.j(TAG, "getServiceCharacteristicProfile mIsSyncFromCloud is true");
        return profileClient.getServiceCharacteristics(str, "SyncPairToken", true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
    }

    private boolean isTokensValid(ServiceCharacteristicProfile serviceCharacteristicProfile) {
        LogUtil.a(TAG, "isTokensValid enter");
        if (serviceCharacteristicProfile == null) {
            LogUtil.j(TAG, "isTokensValid characteristicProfile is null");
            return false;
        }
        Map<String, Object> profile = serviceCharacteristicProfile.getProfile();
        if (profile == null || profile.isEmpty()) {
            LogUtil.j(TAG, "isTokensValid characteristicProfile.getProfile() is empty");
            return false;
        }
        byte[] bArrC = eeq.c(getValueFromProfile(profile, "pairToken"));
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j(TAG, "isTokensValid is false");
        return false;
    }

    private List<ServiceProfile> getServiceProfiles(ProfileClient profileClient, String str) {
        LogUtil.a(TAG, "getServiceProfiles enter");
        List<ServiceProfile> servicesOfDevice = profileClient.getServicesOfDevice(str, false, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice != null && servicesOfDevice.size() != 0) {
            return servicesOfDevice;
        }
        LogUtil.j(TAG, "getServiceProfiles mIsSyncFromCloud is true");
        return profileClient.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
    }

    private Long getLongFromProfile(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            LogUtil.j(TAG, "getLong: Get fail key.");
            return null;
        }
        if (!(obj instanceof Long)) {
            LogUtil.j(TAG, "getLong: class type is wrong key.");
            return null;
        }
        return (Long) obj;
    }

    private void receiverCommand18(byte[] bArr) {
        int iV;
        int iV2;
        ReleaseLogUtil.d(TAG_RELEASE, "receiverCommand18 enter.");
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j(TAG, "handleTws18 data is error");
            return;
        }
        int i = 0;
        try {
            List<eew> listE = this.mTlvUtils.b(strE.substring(4)).e();
            if (njy.e(listE)) {
                LogUtil.e(TAG, "receiverCommand18 tlvs isEmpty");
                return;
            }
            iV2 = 0;
            iV = 0;
            for (eew eewVar : listE) {
                try {
                    int iV3 = CommonUtil.v(eewVar.e());
                    if (iV3 == 3) {
                        iV2 = CommonUtil.v(eewVar.b());
                    } else if (iV3 == 4) {
                        iV = CommonUtil.v(eewVar.b());
                    } else {
                        LogUtil.j(TAG, "receiverCommand18 default");
                    }
                } catch (eeu unused) {
                    i = iV;
                    LogUtil.e(TAG, "receiverCommand18 TlvException");
                    iV = i;
                } catch (IndexOutOfBoundsException unused2) {
                    i = iV2;
                    LogUtil.e(TAG, "receiverCommand18 IndexOutOfBoundsException");
                    iV2 = i;
                } catch (NumberFormatException unused3) {
                    i = iV2;
                    LogUtil.e(TAG, "receiverCommand18 NumberFormatException");
                    iV2 = i;
                }
            }
            if (iV2 > 0 && iV > 0) {
                sendCommand19(iV2, iV);
            } else {
                LogUtil.e(TAG, "receiverCommand18 but sendCommand19 find error");
            }
        } catch (eeu unused4) {
            iV2 = 0;
        } catch (IndexOutOfBoundsException unused5) {
            iV = 0;
        } catch (NumberFormatException unused6) {
            iV = 0;
        }
    }

    private void sendCommand18(int i) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1000);
        if (accountInfo == null) {
            accountInfo = "";
        }
        String str = (eeq.d(1) + eeq.d(eeq.a(accountInfo).length() / 2) + eeq.a(accountInfo)) + eeq.d(2) + eeq.d(2) + eeq.e(i);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(43);
        deviceCommand.setCommandID(18);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        LogUtil.a(TAG, "sendCommand18, deviceCommand :", deviceCommand.toString());
        mkf.e(this.mContext).sendDeviceData(deviceCommand);
    }

    private void sendCommand19(int i, int i2) {
        int i3;
        ReleaseLogUtil.d(TAG_RELEASE, "sendCommand19 enter.");
        if (this.mPairDeviceList.size() < i) {
            LogUtil.a(TAG, "supportMaxNum is bigger than maxNumber.");
            i = this.mPairDeviceList.size();
            if (this.mPairDeviceList.size() == 0) {
                String str = eeq.d(129) + eeq.d(0) + (eeq.d(8) + eeq.d(1) + eeq.d(0));
                DeviceCommand deviceCommand = new DeviceCommand();
                deviceCommand.setServiceID(43);
                deviceCommand.setCommandID(19);
                deviceCommand.setDataContent(eeq.c(str));
                deviceCommand.setDataLen(eeq.c(str).length);
                LogUtil.a(TAG, "deviceCommand :", deviceCommand.toString());
                mkf.e(this.mContext).sendDeviceData(deviceCommand);
                return;
            }
        }
        if (i % i2 == 0) {
            i3 = i / i2;
        } else {
            i3 = (i / i2) + 1;
        }
        Collections.sort(this.mPairDeviceList, new e());
        sendFramesCommand(i, i3, i2);
    }

    private void sendFramesCommand(int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(i);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            int i6 = i5 * i3;
            if (i6 > i) {
                i6 = i;
            }
            for (int i7 = i4 * i3; i7 < i6; i7++) {
                mzx mzxVar = this.mPairDeviceList.get(i7);
                String str = ((((eeq.d(3) + eeq.d(eeq.a(mzxVar.m()).length() / 2) + eeq.a(mzxVar.m())) + eeq.d(4) + eeq.d(eeq.a(mzxVar.a()).length() / 2) + eeq.a(mzxVar.a())) + eeq.d(5) + eeq.d(eeq.a(mzxVar.f()).length() / 2) + eeq.a(mzxVar.f())) + eeq.d(6) + eeq.d(eeq.e(mzxVar.o()).length() / 2) + eeq.e(mzxVar.o())) + eeq.d(7) + eeq.d(eeq.b(mzxVar.l()).length() / 2) + eeq.b(mzxVar.l());
                stringBuffer.append(eeq.d(130) + eeq.b(str.length() / 2) + str);
            }
            String str2 = (eeq.d(129) + eeq.b(stringBuffer.length() / 2) + ((Object) stringBuffer)) + eeq.d(8) + eeq.d(1) + eeq.d(i4);
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(43);
            deviceCommand.setCommandID(19);
            deviceCommand.setDataContent(eeq.c(str2));
            deviceCommand.setDataLen(eeq.c(str2).length);
            LogUtil.a(TAG, "sendFramesCommand: ", deviceCommand.toString());
            mkf.e(this.mContext).sendDeviceData(deviceCommand);
            if (i2 == i5) {
                LogUtil.a(TAG, "totalFrames clear.");
            }
            i4 = i5;
        }
    }
}
