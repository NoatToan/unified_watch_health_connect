package defpackage;

import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxd implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41009a = new Object();
    private static lxd d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f41010c;
    private IBaseResponseCallback e;

    public static lxd b() {
        lxd lxdVar;
        synchronized (f41009a) {
            if (d == null) {
                LogUtil.a("HwFindDeviceMgr", "getInstance");
                lxd lxdVar2 = new lxd();
                d = lxdVar2;
                lxdVar2.c();
            }
            lxdVar = d;
        }
        return lxdVar;
    }

    private lxd() {
    }

    public void c() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.finddevice", this);
    }

    public boolean b(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        this.e = iBaseResponseCallback;
        return edc.e().sendSampleConfigCommand(deviceInfo, b(2), "HwFindDeviceMgr");
    }

    public boolean e(DeviceInfo deviceInfo, IBaseResponseCallback iBaseResponseCallback) {
        this.f41010c = iBaseResponseCallback;
        return edc.e().sendSampleConfigCommand(deviceInfo, b(1), "HwFindDeviceMgr");
    }

    private eef b(int i) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.finddevice");
        eefVar.setWearPkgName("findDevice");
        eefVar.setCommandId(1);
        ArrayList arrayList = new ArrayList(5);
        eeg eegVar = new eeg();
        eegVar.b(900100002L);
        eegVar.b(i);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (eecVar instanceof eef) {
            eef eefVar = (eef) eecVar;
            if (eecVar.getCommandId() != 1) {
                LogUtil.j("HwFindDeviceMgr", "onDataReceived, message commandId", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            List<eeg> configInfoList = eefVar.getConfigInfoList();
            if (configInfoList == null || configInfoList.size() == 0) {
                LogUtil.j("HwFindDeviceMgr", "onDataReceived sampleConfigInfos empty");
                return;
            }
            ReleaseLogUtil.d("DEVMGR_HwFindDeviceMgr", "onDataReceived configAction", Integer.valueOf(configInfoList.get(0).d()));
            if (configInfoList.get(0).d() == 1) {
                this.f41010c.a(i, configInfoList.get(0));
            }
            if (configInfoList.get(0).d() == 2) {
                this.e.a(i, configInfoList.get(0));
            }
            if (configInfoList.get(0).d() == 4) {
                this.e.a(i, configInfoList.get(0));
            }
        }
    }

    public void a() {
        this.e = null;
        this.f41010c = null;
    }
}
