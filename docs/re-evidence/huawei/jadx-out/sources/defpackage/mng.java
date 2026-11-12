package defpackage;

import android.content.Intent;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionBean;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mng implements DataReceiveCallback {
    private static volatile mng e;

    public static mng b() {
        if (e == null) {
            synchronized (mng.class) {
                if (e == null) {
                    e = new mng();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.b("FallDetectionManager", "onDataReceived enter");
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "onDataReceived device or sampleBase is null");
            return;
        }
        if (!(eecVar instanceof eef)) {
            ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "onDataReceived sampleBase not SampleConfig");
            return;
        }
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (njy.e(configInfoList)) {
            ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "onDataReceived configInfoList isEmpty");
            return;
        }
        eeg eegVar = configInfoList.get(0);
        ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "onDataReceived sampleConfigInfo ", eegVar);
        if (eegVar == null) {
            return;
        }
        String str = new String(eegVar.e(), StandardCharsets.UTF_8);
        ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "onDataReceived switchJson ", str);
        FallDetectionBean fallDetectionBean = (FallDetectionBean) HiJsonUtil.d(str, FallDetectionBean.class);
        if (fallDetectionBean == null) {
            ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "onDataReceived FallDetectionBean is null");
        } else {
            c(str, fallDetectionBean);
        }
    }

    private void c(String str, FallDetectionBean fallDetectionBean) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction(FallDetectionConstant.ACTION_FALL_DETECTION_STATUS);
        intent.putExtra(FallDetectionConstant.EXTRA_FALL_DETECTION_SWITCH, fallDetectionBean.getFallDetectionSwitch());
        BaseApplication.getContext().sendBroadcast(intent);
        qhq.d("9005", FallDetectionConstant.CONFIG_ID_STRING, str, new HiDataOperateListener() { // from class: mnh
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                mng.d(i, obj);
            }
        }, System.currentTimeMillis());
    }

    static /* synthetic */ void d(int i, Object obj) {
        ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "setSampleConfig code: ", Integer.valueOf(i), ", object: ", obj);
        if (i == 0) {
            xkb.a(System.currentTimeMillis());
        }
    }

    public void a() {
        LogUtil.b("FallDetectionManager", "registerFallDetectionListener");
        edc.e().registerDeviceSampleListener(FallDetectionConstant.SRC_PKG_NAME, this);
    }

    public void e() {
        LogUtil.b("FallDetectionManager", "unRegisterFallDetectioListener");
        edc.e().unRegisterDeviceSampleListener(FallDetectionConstant.SRC_PKG_NAME);
    }

    public void d(final DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FallDetectionConstant.CONFIG_ID_STRING);
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: mng.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (i != 0) {
                    return;
                }
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform isListTypeMatch false");
                    mng.this.d(false, deviceInfo, 0, 0L);
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    mng.this.d(false, deviceInfo, 0, 0L);
                    ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform list isEmpty");
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null) {
                    mng.this.d(false, deviceInfo, 0, 0L);
                    ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform hiSampleConfig is null");
                    return;
                }
                String configData = hiSampleConfig.getConfigData();
                ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform configData is ", configData);
                FallDetectionBean fallDetectionBean = (FallDetectionBean) HiJsonUtil.d(configData, FallDetectionBean.class);
                if (fallDetectionBean != null) {
                    mng.this.d(true, deviceInfo, fallDetectionBean.getFallDetectionSwitch(), fallDetectionBean.getTimeStamp());
                } else {
                    ReleaseLogUtil.e("DEVMGR_FallDetectionManager", "getFallDetectionStatusFromPlatform FallDetectionBean is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(boolean z, DeviceInfo deviceInfo, int i, long j) {
        if (deviceInfo == null) {
            ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "sendSampleConfigToDevice deviceInfo is null");
            return false;
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName(FallDetectionConstant.SRC_PKG_NAME);
        eefVar.setWearPkgName(FallDetectionConstant.WEAR_PKG_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(FallDetectionConstant.CONFIG_ID);
        eegVar.b(z ? 1 : 2);
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FallDetectionConstant.EXTRA_FALL_DETECTION_SWITCH, i);
                jSONObject.put("timeStamp", j);
                ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "sendSampleConfigToDevice json is ", jSONObject.toString());
                eegVar.d(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            } catch (JSONException unused) {
                ReleaseLogUtil.a("DEVMGR_FallDetectionManager", "sendSampleConfigToDevice JSONException");
            }
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "FallDetectionManager");
        ReleaseLogUtil.d("DEVMGR_FallDetectionManager", "sendSampleConfigToDevice isSendSuccess ", Boolean.valueOf(zSendSampleConfigCommand), " isSetting ", Boolean.valueOf(z));
        return zSendSampleConfigCommand;
    }
}
