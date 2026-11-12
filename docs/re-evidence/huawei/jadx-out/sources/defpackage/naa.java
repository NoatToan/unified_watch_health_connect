package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.model.WechatDeviceRegistReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.WechatDeviceSignReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class naa implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile naa f42803c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lqo f42804b;

    public naa() {
        LogUtil.a("HWWechatDeviceMgr", "HWWechatDeviceMgr(). ");
        this.f42804b = lqo.b(BaseApplication.getContext());
    }

    public static naa e() {
        if (f42803c == null) {
            synchronized (naa.class) {
                if (f42803c == null) {
                    f42803c = new naa();
                }
            }
        }
        return f42803c;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.j("HWWechatDeviceMgr", "onDataReceived deviceInfo is null");
            return;
        }
        if (eecVar instanceof eef) {
            LogUtil.a("HWWechatDeviceMgr", "onDataReceived sampleBase instanceof SampleConfig");
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() <= 0) {
                LogUtil.j("HWWechatDeviceMgr", "onDataReceived sampleConfigInfos is null or empty");
            } else {
                d(configInfoList);
            }
        }
    }

    private void d(List<eeg> list) {
        LogUtil.a("HWWechatDeviceMgr", "configDeviceDbInfo in. ");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HWWechatDeviceMgr");
        if (deviceList == null || deviceList.size() == 0) {
            LogUtil.j("HWWechatDeviceMgr", "configDeviceDbInfo main device is null or empty");
            return;
        }
        for (eeg eegVar : list) {
            String strD = eeq.d(eeq.e(eegVar.e()));
            LogUtil.a("HWWechatDeviceMgr", "configDeviceDbInfo configData = ", strD);
            final DeviceInfo deviceInfo = deviceList.get(0);
            if (eegVar.d() == 3) {
                final WechatDeviceSignReq wechatDeviceSignReqC = c(strD);
                String strA = this.f42804b.a(wechatDeviceSignReqC);
                d(strA, deviceInfo);
                LogUtil.a("HWWechatDeviceMgr", "signRsp: ", strA);
                final WechatDeviceRegistReq wechatDeviceRegistReq = new WechatDeviceRegistReq();
                ThreadPoolManager.c().a("HWWechatDeviceMgr", new Runnable() { // from class: nah
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.e(deviceInfo, wechatDeviceRegistReq, wechatDeviceSignReqC);
                    }
                });
            } else {
                LogUtil.j("HWWechatDeviceMgr", "configDeviceDbInfo configAction is not match");
            }
        }
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, final WechatDeviceRegistReq wechatDeviceRegistReq, final WechatDeviceSignReq wechatDeviceSignReq) {
        nat.a(deviceInfo, new ICloudOperationResult() { // from class: naj
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f42827c.c(wechatDeviceRegistReq, wechatDeviceSignReq, (String) obj, str, z);
            }
        });
    }

    /* synthetic */ void c(WechatDeviceRegistReq wechatDeviceRegistReq, WechatDeviceSignReq wechatDeviceSignReq, String str, String str2, boolean z) {
        ReleaseLogUtil.d("R_HWWechatDeviceMgr", "configDeviceDbInfo getDeviceCodeAsync deviceCode: ", CommonUtil.n(str), ",resp: ", CommonUtil.n(str2), ",isSuccess: ", Boolean.valueOf(z));
        wechatDeviceRegistReq.setDeviceList(Arrays.asList(new WechatDeviceRegistReq.WechatDevice(wechatDeviceSignReq.getDeviceSn(), str)));
        wechatDeviceRegistReq.setProductId(wechatDeviceSignReq.getProductId());
        LogUtil.a("HWWechatDeviceMgr", "registerRsp: ", this.f42804b.e(wechatDeviceRegistReq));
    }

    private WechatDeviceSignReq c(String str) {
        LogUtil.a("HWWechatDeviceMgr", "parseJson: ", str);
        WechatDeviceSignReq wechatDeviceSignReq = new WechatDeviceSignReq();
        try {
            return (WechatDeviceSignReq) new Gson().fromJson(str, new TypeToken<WechatDeviceSignReq>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwwechatdevicemgr.HWWechatDeviceMgr$1
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HWWechatDeviceMgr", "savedMessage jsonSyntaxException ");
            return wechatDeviceSignReq;
        } catch (NumberFormatException unused2) {
            LogUtil.e("HWWechatDeviceMgr", "savedMessage NumberFormatException");
            return wechatDeviceSignReq;
        }
    }

    private void d(String str, DeviceInfo deviceInfo) {
        LogUtil.a("HWWechatDeviceMgr", "sendCommand: ", deviceInfo.toString());
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.wechatDevice");
        eefVar.setWearPkgName("com.tencent.wechatrtos");
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(b(str));
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "HWWechatDeviceMgr");
    }

    private eeg b(String str) {
        eeg eegVar = new eeg();
        eegVar.b(900100009L);
        eegVar.b(1);
        eegVar.d(eeq.c(eeq.a(str)));
        LogUtil.a("HWWechatDeviceMgr", "constructSampleConfigInfo: ", eegVar);
        return eegVar;
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.wechatDevice", this);
    }
}
