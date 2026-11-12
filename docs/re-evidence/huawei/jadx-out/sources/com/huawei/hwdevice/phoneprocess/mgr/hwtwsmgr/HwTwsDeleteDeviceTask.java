package com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.client.profile.ProfileClient;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HwTwsDeleteDeviceTask extends BaseTwsTask {
    private static final int CONVERT_TIME = 2;
    private static final int DEFAULT_VALUE = 0;
    private static final int LENGTH_VALUE = 1;
    private static final int RECEIVE_ACCOUNT_ORDER = 2;
    private static final int RECEIVE_TIMESTAMP_ORDER = 3;
    private static final int RECEIVE_UDID_ORDER = 1;
    private static final int RESULT_INFO = 4;
    private static final String TAG = "HwTwsDeleteDeviceTask";
    private static final String TAG_RELEASE = "R_HwTwsDeleteDeviceTask";
    private Context mContext;
    private String mData;
    private eet mTlvUtils;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onWaitFor(String str, Object obj) {
        return false;
    }

    public HwTwsDeleteDeviceTask(String str, eet eetVar, Context context) {
        this.mData = str;
        this.mTlvUtils = eetVar;
        this.mContext = context;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr.BaseTwsTask
    public boolean onExecutor(ProfileClient profileClient) {
        doExecutor(profileClient);
        return true;
    }

    private void doExecutor(ProfileClient profileClient) {
        mzx mzxVarBuildPairDevice = buildPairDevice();
        if (mzxVarBuildPairDevice == null || TextUtils.isEmpty(mzxVarBuildPairDevice.m())) {
            LogUtil.j(TAG, "doExecutor but pair device is error");
            return;
        }
        String strM = mzxVarBuildPairDevice.m();
        boolean zTryDeleteDeviceById = tryDeleteDeviceById(profileClient, mzxVarBuildPairDevice.e(), strM);
        ReleaseLogUtil.d(TAG_RELEASE, "onExecutor tryDeleteDeviceById is success:", Boolean.valueOf(zTryDeleteDeviceById));
        sendCommand21(zTryDeleteDeviceById, strM);
    }

    private void sendCommand21(boolean z, String str) {
        String str2;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(43);
        deviceCommand.setCommandID(21);
        if (str != null && str.length() != 0) {
            str2 = eeq.d(1) + eeq.d(eeq.a(str).length() / 2) + eeq.a(str);
        } else {
            str2 = "";
        }
        String str3 = str2 + eeq.d(4) + eeq.d(1) + eeq.d(!z ? 1 : 0);
        deviceCommand.setDataContent(eeq.c(str3));
        deviceCommand.setDataLen(eeq.c(str3).length);
        LogUtil.a(TAG, "sendCommand21, deviceCommand:", deviceCommand.toString());
        mkf.e(this.mContext).sendDeviceData(deviceCommand);
    }

    private boolean tryDeleteDeviceById(ProfileClient profileClient, String str, String str2) {
        if (!isSameAccount(str)) {
            LogUtil.j(TAG, "tryDeleteDeviceById but account not match");
            return false;
        }
        deleteServiceProfileAndCharacter(profileClient, str2);
        if (profileClient.deleteDevice(str2)) {
            return true;
        }
        LogUtil.j(TAG, "tryDeleteDeviceById delete device failed");
        return false;
    }

    private void deleteServiceProfileAndCharacter(ProfileClient profileClient, String str) {
        List<ServiceProfile> servicesOfDevice = profileClient.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (njy.e(servicesOfDevice)) {
            LogUtil.j(TAG, "deleteServiceProfileAndCharacter do not find any service profile list");
            return;
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            deleteAllCharacter(profileClient, str, id);
            if (!profileClient.deleteServiceOfDevice(str, id)) {
                LogUtil.j(TAG, "deleteAllServices find one service device failed!");
            }
        }
    }

    private boolean isSameAccount(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1000);
        if (TextUtils.isEmpty(accountInfo)) {
            return false;
        }
        return accountInfo.equals(str);
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
            return null;
        }
        List<eew> listE = eesVarB.e();
        if (njy.e(listE)) {
            return null;
        }
        mzx mzxVar = new mzx();
        for (eew eewVar : listE) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 1) {
                mzxVar.k(eeq.d(eewVar.b()));
            } else if (iV == 2) {
                mzxVar.d(eeq.d(eewVar.b()));
            } else if (iV == 3) {
                LogUtil.a(TAG, "buildPairDevice timestamp:", Long.valueOf(CommonUtil.x(eewVar.b())));
            }
        }
        return mzxVar;
    }

    private void deleteAllCharacter(ProfileClient profileClient, String str, String str2) {
        ServiceCharacteristicProfile serviceCharacteristics = profileClient.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j(TAG, "deleteAllCharacter but not find characteristic profile.");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (profile.isEmpty()) {
            LogUtil.j(TAG, "deleteAllCharacter profile map is empty");
            return;
        }
        Iterator<Map.Entry<String, Object>> it = profile.entrySet().iterator();
        while (it.hasNext()) {
            if (!profileClient.deleteServiceCharacteristic(str, str2, it.next().getKey())) {
                LogUtil.j(TAG, "deleteAllCharacter find one characteristic delete failed");
            }
        }
    }
}
