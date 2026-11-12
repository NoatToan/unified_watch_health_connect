package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.CustomConfigWatchFaceService;
import com.huawei.unitedevice.manager.SampleEventCache;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class edc extends AppBundlePluginProxy<SendSampleCommandApi> implements SendSampleCommandApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile edc f32773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f32774c;
    private SendSampleCommandApi d;

    private edc() {
        super("SendSampleCommandProxy", "SendSampleCommandProxy", "com.huawei.hwdevice.outofprocess.impl.SendSampleCommandImpl");
        this.d = createPluginApi();
    }

    public static edc e() {
        edc edcVar;
        if (f32773b == null) {
            synchronized (edc.class) {
                if (f32773b == null) {
                    f32773b = new edc();
                }
                edcVar = f32773b;
            }
            return edcVar;
        }
        return f32773b;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return f32773b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(SendSampleCommandApi sendSampleCommandApi) {
        this.d = sendSampleCommandApi;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleConfigCommand(DeviceInfo deviceInfo, eef eefVar, String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            return sendSampleCommandApi.sendSampleConfigCommand(deviceInfo, eefVar, str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            return sendSampleCommandApi.sendSampleEventCommand(deviceInfo, eeeVar, str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSampleEventCommand(DeviceInfo deviceInfo, eee eeeVar, SampleEventCache.e eVar, String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            return sendSampleCommandApi.sendSampleEventCommand(deviceInfo, eeeVar, eVar, str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendSamplePointCommand(DeviceInfo deviceInfo, eeh eehVar, String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            return sendSampleCommandApi.sendSamplePointCommand(deviceInfo, eehVar, str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public boolean sendDictionaryPointInfoCommand(DeviceInfo deviceInfo, eea eeaVar, String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            return sendSampleCommandApi.sendDictionaryPointInfoCommand(deviceInfo, eeaVar, str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback) {
        c(str);
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            sendSampleCommandApi.registerDeviceSampleListener(str, dataReceiveCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void unRegisterDeviceSampleListener(String str) {
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            sendSampleCommandApi.unRegisterDeviceSampleListener(str);
        }
    }

    private static void c(String str) {
        if (f32774c < 5 && !ProcessUtil.b() && CustomConfigWatchFaceService.CUSTOM_CONFIG_APP_PACKAGE_NAME.equals(str)) {
            String strD = DfxUtils.d(Thread.currentThread(), null);
            ReleaseLogUtil.d("R_SendSampleCommandProxy", "callPidError stackTraceInfo= ", strD);
            xjt.aq("callPidError stackTraceInfo: " + strD);
            f32774c = f32774c + 1;
        }
    }

    @Override // com.huawei.health.devicemgr.api.outofprocess.SendSampleCommandApi
    public void registerDeviceSampleListener(String str, DataReceiveCallback dataReceiveCallback, String str2) {
        c(str);
        SendSampleCommandApi sendSampleCommandApi = this.d;
        if (sendSampleCommandApi != null) {
            sendSampleCommandApi.registerDeviceSampleListener(str, dataReceiveCallback, str2);
        }
    }
}
