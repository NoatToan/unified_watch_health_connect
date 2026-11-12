package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pfd implements SampleSequenceAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess
    public HiHealthData onSampleSequenceAfterProcess(HiDataInsertOption hiDataInsertOption, HiHealthData hiHealthData, String str) {
        boolean z;
        String metaData = hiHealthData.getMetaData();
        if (metaData == null) {
            ReleaseLogUtil.d("ServicesApi_MicroExamSampleSequenceAfterProcess", "onSamplSequenceAfterProcess() skipped by empty content");
            return hiHealthData;
        }
        try {
            JSONObject jSONObject = new JSONObject(metaData);
            if (jSONObject.has("name")) {
                z = true;
            } else {
                jSONObject.put("name", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1002));
                z = false;
            }
            DeviceInfo deviceInfoD = d();
            if (deviceInfoD == null) {
                ReleaseLogUtil.e("ServicesApi_MicroExamSampleSequenceAfterProcess", "onSamplSequenceAfterProcess() connected device NOT found");
                return hiHealthData;
            }
            String deviceName = deviceInfoD.getDeviceName();
            if (!TextUtils.isEmpty(deviceName)) {
                jSONObject.put("deviceName", deviceName);
                z = false;
            }
            if (!jSONObject.has("deviceType")) {
                jSONObject.put("deviceType", deviceInfoD.getProductType());
            } else if (z) {
                ReleaseLogUtil.d("ServicesApi_MicroExamSampleSequenceAfterProcess", "onSamplSequenceAfterProcess() data NOT change");
                return hiHealthData;
            }
            ReleaseLogUtil.d("ServicesApi_MicroExamSampleSequenceAfterProcess", "onSamplSequenceAfterProcess() data filled");
            hiHealthData.setMetaData(jSONObject.toString());
            return hiHealthData;
        } catch (JSONException unused) {
            ReleaseLogUtil.a("ServicesApi_MicroExamSampleSequenceAfterProcess", "onSamplSequenceAfterProcess() failed by JSONException");
            return hiHealthData;
        }
    }

    private DeviceInfo d() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ServicesApi_MicroExamSampleSequenceAfterProcess");
        if (njy.e(deviceList)) {
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2 != null && !eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("ServicesApi_MicroExamSampleSequenceAfterProcess", "getConnectDeviceInfo() deviceInfo ", deviceInfo);
        return deviceInfo;
    }
}
