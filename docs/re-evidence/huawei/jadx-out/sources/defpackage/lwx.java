package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lwx implements DataReceiveCallback {
    private static final Object d = new Object();
    private static lwx e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f40995a;

    private lwx() {
    }

    public static lwx d() {
        lwx lwxVar;
        synchronized (d) {
            if (e == null) {
                LogUtil.a("DynamicBpManager", "getInstance");
                lwx lwxVar2 = new lwx();
                e = lwxVar2;
                lwxVar2.b();
            }
            lwxVar = e;
        }
        return lwxVar;
    }

    private void b() {
        edc.e().registerDeviceSampleListener("hw.health.dynamicBp", this);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("R_DynamicBpManager", "onDataReceived");
        if (this.f40995a == null) {
            LogUtil.j("DynamicBpManager", "onDataReceived mDynamicResponseCallback is null");
            return;
        }
        if (!(eecVar instanceof eef)) {
            LogUtil.j("DynamicBpManager", "message not instanceof SampleConfig");
            this.f40995a.a(-1, null);
            return;
        }
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (configInfoList == null || configInfoList.size() == 0) {
            LogUtil.j("DynamicBpManager", "onDataReceived sampleConfigInfoList empty");
            this.f40995a.a(-1, null);
            return;
        }
        eeg eegVar = configInfoList.get(0);
        if (eegVar == null) {
            LogUtil.j("DynamicBpManager", "onDataReceived configInfo is null");
            this.f40995a.a(-1, null);
            return;
        }
        String strB = HEXUtils.b(HEXUtils.a(eegVar.e()));
        LogUtil.a("DynamicBpManager", "onDataReceived configData: ", strB);
        xkb.d("900300039", strB, new HiDataOperateListener() { // from class: lwx.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                ReleaseLogUtil.d("R_DynamicBpManager", "setConfig errorCode: ", Integer.valueOf(i2), " object: ", obj);
            }
        });
        this.f40995a.a(i, (dfn) HiJsonUtil.d(strB, dfn.class));
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DynamicBpManager", "sendDynamicBpCommand enter");
        this.f40995a = iBaseResponseCallback;
        DeviceInfo deviceInfoD = mgg.d("DynamicBpManager");
        if (deviceInfoD != null) {
            ReleaseLogUtil.d("R_DynamicBpManager", "sendDynamicBpCommand isSuccess: ", Boolean.valueOf(edc.e().sendSampleConfigCommand(deviceInfoD, c(), "DynamicBpManager")));
        } else {
            iBaseResponseCallback.a(-1, null);
        }
    }

    private eef c() {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.health.dynamicBp");
        eefVar.setWearPkgName("hw.watch.health.dynamicbp");
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900300039L);
        eegVar.b(2);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    public static void e() {
        ReleaseLogUtil.d("R_DynamicBpManager", "releaseMgr");
        synchronized (d) {
            if (e == null) {
                ReleaseLogUtil.d("R_DynamicBpManager", "sInstance is null");
            } else {
                edc.e().unRegisterDeviceSampleListener("hw.health.dynamicBp");
                e = null;
            }
        }
    }
}
