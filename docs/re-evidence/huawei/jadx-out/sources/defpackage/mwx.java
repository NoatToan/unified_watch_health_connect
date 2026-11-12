package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mwx implements DataReceiveCallback {
    private static mwx d;
    private static final Object e = new Object();

    public static mwx e() {
        mwx mwxVar;
        synchronized (e) {
            if (d == null) {
                d = new mwx();
            }
            mwxVar = d;
        }
        return mwxVar;
    }

    private mwx() {
    }

    public void b() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.physiological", this);
    }

    private void a() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.physiological");
    }

    private List<eeb> a(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(5);
        for (HiHealthData hiHealthData : list) {
            eeb eebVar = new eeb();
            eebVar.c(hiHealthData.getStartTime());
            eebVar.d(hiHealthData.getEndTime());
            eebVar.a(hiHealthData.getModifiedTime());
            eed eedVar = new eed();
            eedVar.e(hiHealthData.getType());
            eedVar.a(eeq.h(hiHealthData.getIntValue()));
            ArrayList arrayList2 = new ArrayList(5);
            arrayList2.add(eedVar);
            eebVar.e(arrayList2);
            arrayList.add(eebVar);
        }
        LogUtil.d("HwMenstrualDictionaryManager", "sampleConfigInfos is:", arrayList);
        return arrayList;
    }

    private boolean c(List<eeb> list) {
        DeviceInfo deviceInfoA = mwv.d().a("HwMenstrualDictionaryManager");
        if (!cqd.c(deviceInfoA, 174)) {
            ReleaseLogUtil.e("HwMenstrualDictionaryManager", "sendMenstrualFlowCommand capability is not support.");
            return false;
        }
        boolean zSendDictionaryPointInfoCommand = edc.e().sendDictionaryPointInfoCommand(deviceInfoA, e(list), "HwMenstrualDictionaryManager");
        if (!zSendDictionaryPointInfoCommand) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualDictionaryManager", "sendFindDeviceCommand fail");
        }
        return zSendDictionaryPointInfoCommand;
    }

    private eea e(List<eeb> list) {
        eea eeaVar = new eea();
        eeaVar.setSrcPkgName("hw.unitedevice.physiological");
        eeaVar.setWearPkgName("hw.watch.health.physiological");
        eeaVar.setCommandId(4);
        eeaVar.c(400018L);
        eeaVar.a(1);
        eeaVar.a(list);
        return eeaVar;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null || a(eecVar)) {
            ReleaseLogUtil.e("DEVMGR_HwMenstrualDictionaryManager", "device == null or isCheckSampleError");
            return;
        }
        if (eecVar instanceof eea) {
            eea eeaVar = (eea) eecVar;
            LogUtil.d("HwMenstrualDictionaryManager", "sampleConfig is:", eeaVar);
            if (eeaVar.c() != 400018) {
                ReleaseLogUtil.e("DEVMGR_HwMenstrualDictionaryManager", "onDataReceived, message dictTypeId", Long.valueOf(eeaVar.c()));
                return;
            }
            final eeb eebVar = eeaVar.e().get(0);
            if (eebVar == null) {
                LogUtil.j("HwMenstrualDictionaryManager", "getDataInfoList onResult pointInfo is null");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: mww
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42614a.c(eebVar);
                    }
                });
            }
        }
    }

    /* synthetic */ void c(eeb eebVar) {
        List<HiHealthData> menstrualFlow = qec.a().getMenstrualFlow(eebVar.e(), eebVar.c(), eebVar.d());
        b(menstrualFlow);
        ArrayList arrayList = new ArrayList();
        if (menstrualFlow.size() < 10) {
            arrayList.addAll(menstrualFlow);
        } else {
            arrayList.addAll(menstrualFlow.subList(0, 10));
        }
        c(a(arrayList));
        ReleaseLogUtil.d("DEVMGR_HwMenstrualDictionaryManager", "sendMenstrualFlowCommand is success.");
    }

    private void b(List<HiHealthData> list) {
        Collections.sort(list, new Comparator<HiHealthData>() { // from class: mwx.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return Long.compare(hiHealthData.getStartTime(), hiHealthData2.getStartTime());
            }
        });
    }

    private boolean a(eec eecVar) {
        if (eecVar == null) {
            ReleaseLogUtil.d("DEVMGR_HwMenstrualDictionaryManager", "sampleBase == null");
            return true;
        }
        if (eecVar.getCommandId() == 4 && "hw.watch.health.physiological".equals(eecVar.getSrcPkgName()) && "hw.unitedevice.physiological".equals(eecVar.getWearPkgName())) {
            return false;
        }
        LogUtil.j("HwMenstrualDictionaryManager", "message: ", eecVar.toString());
        return true;
    }

    public void c(long j, long j2, long j3) {
        List<HiHealthData> menstrualFlow = qec.a().getMenstrualFlow(j, j2, j3);
        b(menstrualFlow);
        c(a(menstrualFlow));
        ReleaseLogUtil.d("DEVMGR_HwMenstrualDictionaryManager", "sendMenstrualFlowCommand is success.");
    }

    public void c() {
        a();
        LogUtil.a("HwMenstrualDictionaryManager", "onDestroy()");
    }
}
