package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.manager.SampleEventCache;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes20.dex */
public class xiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53070a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f53071c;
    private xgt d;
    private BroadcastReceiver e;

    /* synthetic */ xiq(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* JADX INFO: renamed from: xiq$1, reason: invalid class name */
    class AnonymousClass1 extends BroadcastReceiver {
        AnonymousClass1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (intent == null) {
                LogUtil.e("SampleCommandManager", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                LogUtil.e("SampleCommandManager", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.b("SampleCommandManager", "mDeviceStatusReceiver onReceive action: ", action);
            try {
                parcelableExtra = intent.getParcelableExtra("deviceinfo");
            } catch (BadParcelableException unused) {
                LogUtil.d("SampleCommandManager", "fuzzy test exception, no care this.");
                parcelableExtra = null;
            }
            final DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
            if (deviceInfo == null) {
                LogUtil.e("SampleCommandManager", "deviceInfo is null");
                return;
            }
            if (!"main_relationship".equals(deviceInfo.getRelationship())) {
                LogUtil.e("SampleCommandManager", "deviceInfo is not main device");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            if (deviceConnectState == 2) {
                xiq.this.f53071c.set(true);
                ThreadPoolManager.c().execute(new Runnable() { // from class: xis
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53076b.d(deviceInfo);
                    }
                });
            } else {
                if (deviceConnectState != 3) {
                    return;
                }
                xiq.this.f53071c.set(false);
            }
        }

        /* synthetic */ void d(DeviceInfo deviceInfo) {
            xiq.this.d(deviceInfo.getDeviceIdentify());
        }
    }

    private xiq() {
        this.f53071c = new AtomicBoolean(false);
        this.e = new AnonymousClass1();
        LogUtil.b("SampleCommandManager", "create SampleCommandManager");
        this.f53070a = BaseApplication.b();
        xgt xgtVarB = xgt.b();
        this.d = xgtVarB;
        xgtVarB.a(this.f53070a);
        BroadcastManagerUtil.c(BaseApplication.b(), this.e, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), clx.e, null);
    }

    public static xiq a() {
        return c.e;
    }

    public boolean d(DeviceInfo deviceInfo, eef eefVar, String str) {
        LogUtil.b("SampleCommandManager", "sendSampleConfigCommand enter. tag: ", str);
        if (e(deviceInfo)) {
            return false;
        }
        if (!cqd.c(deviceInfo, 83)) {
            LogUtil.e("SampleCommandManager", "sendSampleConfigCommand capability is not support.");
            return false;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarB = xjf.b(eefVar);
        if (cmgVarB == null) {
            LogUtil.e("SampleCommandManager", "sendSampleConfigCommand commandMessage is invalid.");
            return false;
        }
        cpl.d("SampleCommandManager", cmgVarB.b(), "sendSampleConfigCommand commandMessage: ");
        this.d.sendCommand(uniteDeviceD, cmgVarB);
        return true;
    }

    public boolean c(DeviceInfo deviceInfo, eee eeeVar, String str) {
        LogUtil.b("SampleCommandManager", "sendSampleEventCommand enter. tag: ", str);
        if (e(deviceInfo)) {
            return false;
        }
        if (!cqd.c(deviceInfo, 84)) {
            LogUtil.e("SampleCommandManager", "sendSampleEventCommand capability is not support.");
            return false;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(eeeVar);
        if (cmgVarC == null) {
            LogUtil.e("SampleCommandManager", "sendEventConfigCommand commandMessage is invalid.");
            return false;
        }
        this.d.sendCommand(uniteDeviceD, cmgVarC);
        return true;
    }

    public boolean b(DeviceInfo deviceInfo, eee eeeVar, SampleEventCache.e eVar, String str) {
        LogUtil.b("SampleCommandManager", "sendSampleEventCommand sampleEventCacheParam enter. tag: ", str);
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("SampleCommandManager", "sampleEventCacheParam, checkError deviceInfo is invalid.");
            return false;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.b("SampleCommandManager", "sampleEventCacheParam, checkError deviceInfo connectState is invalid.");
            SampleEventCache.c(deviceInfo.getDeviceIdentify(), eeeVar, eVar);
            return false;
        }
        if (!cqd.c(deviceInfo, 84)) {
            LogUtil.e("SampleCommandManager", "sendSampleEventCommand capability is not support.");
            return false;
        }
        return b(deviceInfo.getDeviceIdentify(), eeeVar, str);
    }

    public boolean a(DeviceInfo deviceInfo, eeh eehVar, String str) {
        LogUtil.b("SampleCommandManager", "sendSamplePointCommand enter. tag: ", str);
        if (e(deviceInfo)) {
            return false;
        }
        if (!cqd.c(deviceInfo, 85)) {
            LogUtil.e("SampleCommandManager", "sendSamplePointCommand capability is not support.");
            return false;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(eehVar);
        if (cmgVarC == null) {
            LogUtil.e("SampleCommandManager", "sendSamplePointCommand commandMessage is invalid.");
            return false;
        }
        this.d.sendCommand(uniteDeviceD, cmgVarC);
        return true;
    }

    public boolean e(DeviceInfo deviceInfo, eea eeaVar, String str) {
        LogUtil.b("SampleCommandManager", "sendDictionaryPointInfoCommand enter. tag: ", str);
        if (e(deviceInfo)) {
            return false;
        }
        if (!cqd.c(deviceInfo, 173)) {
            LogUtil.e("SampleCommandManager", "sendDictionaryPointInfoCommand capability is not support.");
            return false;
        }
        UniteDevice uniteDeviceD = xjg.d(deviceInfo.getDeviceIdentify());
        cmg cmgVarC = xjf.c(eeaVar);
        if (cmgVarC == null) {
            LogUtil.e("SampleCommandManager", "sendSamplePointCommand commandMessage is invalid.");
            return false;
        }
        cpl.d("SampleCommandManager", cmgVarC.b(), "sendDictionaryPointInfoCommand commandMessage: ");
        this.d.sendCommand(uniteDeviceD, cmgVarC);
        return true;
    }

    public void b(String str, DataReceiveCallback dataReceiveCallback) {
        LogUtil.b("SampleCommandManager", "registerDeviceMessageListener srcPkgName: ", str);
        if (dataReceiveCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.e("SampleCommandManager", "callback or srcPkgName is invalid.");
        } else {
            this.d.registerListener(str, "sampleCommandCallback", dataReceiveCallback);
        }
    }

    public void a(String str, DataReceiveCallback dataReceiveCallback, String str2) {
        LogUtil.b("SampleCommandManager", "registerDeviceMessageListener srcPkgName: ", str);
        if (dataReceiveCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.e("SampleCommandManager", "callback or callback is invalid.");
            return;
        }
        this.d.registerListener(str + str2, "sampleCommandCallback", dataReceiveCallback);
    }

    public void e(String str) {
        LogUtil.b("SampleCommandManager", "unRegisterDeviceMessageListener srcPkgName: ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SampleCommandManager", "srcPkgName is invalid.");
        } else {
            this.d.unregisterListener(str, "sampleCommandCallback");
        }
    }

    public void a(UniteDevice uniteDevice, byte[] bArr, DataReceiveCallback dataReceiveCallback) {
        boolean zA = a(bArr);
        LogUtil.b("SampleCommandManager", "isSampleCommand Result: ", Boolean.valueOf(zA));
        if (!zA || dataReceiveCallback == null) {
            return;
        }
        DeviceInfo deviceInfoC = cox.c(uniteDevice);
        cpl.d("SampleCommandManager", bArr, "getResult() message: ");
        byte b2 = bArr[1];
        if (b2 == 1) {
            d(bArr, deviceInfoC, dataReceiveCallback);
            return;
        }
        if (b2 == 2) {
            e(bArr, deviceInfoC, dataReceiveCallback);
            return;
        }
        if (b2 == 3) {
            c(bArr, deviceInfoC, dataReceiveCallback);
        } else if (b2 == 4) {
            a(bArr, deviceInfoC, dataReceiveCallback);
        } else {
            LogUtil.e("SampleCommandManager", "getResult default branch.");
        }
    }

    private boolean a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            LogUtil.e("SampleCommandManager", "isSampleCommandResult input param is invalid.");
            return false;
        }
        if (bArr[0] != 55) {
            return false;
        }
        LogUtil.b("SampleCommandManager", "isSampleCommandResult data received");
        return true;
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo, DataReceiveCallback dataReceiveCallback) {
        LogUtil.b("SampleCommandManager", "processSampleConfig enter.");
        eef eefVar = new eef();
        eefVar.setCommandId(1);
        try {
            cqk cqkVarC = new cql().c(bArr, 2);
            List<cqi> listD = cqkVarC.d();
            List<cqk> listC = cqkVarC.c();
            int iC = c(listD, eefVar);
            if (iC != 100000) {
                LogUtil.e("SampleCommandManager", "processSampleConfig errorCode is not default value.");
                dataReceiveCallback.onDataReceived(iC, deviceInfo, eefVar);
                return;
            }
            if (listC != null && listC.size() > 0) {
                LogUtil.b("SampleCommandManager", "5.55.1 tlvFatherList.size() :", Integer.valueOf(listC.size()));
                Iterator<cqk> it = listC.iterator();
                while (it.hasNext()) {
                    List<cqk> listC2 = it.next().c();
                    if (listC2 != null && listC2.size() > 0) {
                        LogUtil.b("SampleCommandManager", "5.55.1 childTLVFatherList.size() :", Integer.valueOf(listC2.size()));
                        d(iC, deviceInfo, listC2, eefVar, dataReceiveCallback);
                    }
                    LogUtil.e("SampleCommandManager", "childTLVFatherList is null or size is zero");
                    return;
                }
                return;
            }
            LogUtil.e("SampleCommandManager", "tlvFatherList is null or size is zero");
        } catch (cpy e) {
            LogUtil.d("SampleCommandManager", "processSampleConfig Exception: ", cpc.c(e));
        }
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo, DataReceiveCallback dataReceiveCallback) {
        LogUtil.b("SampleCommandManager", "processSampleEvent enter.");
        eee eeeVar = new eee();
        eeeVar.setCommandId(2);
        try {
            List<cqi> listD = new cql().c(bArr, 2).d();
            int iC = c(listD, eeeVar);
            if (iC != 100000) {
                LogUtil.e("SampleCommandManager", "processSampleEvent errorCode is not default value.");
                dataReceiveCallback.onDataReceived(iC, deviceInfo, eeeVar);
                return;
            }
            if (coq.d(listD)) {
                LogUtil.e("SampleCommandManager", "getResult tlvList isEmpty.");
                return;
            }
            for (cqi cqiVar : listD) {
                byte bC = cqiVar.c();
                if (bC == 3) {
                    eeeVar.a(cph.a(cqiVar.d(), -1L));
                } else if (bC == 4) {
                    eeeVar.a(cph.e(cqiVar.d(), -1));
                } else if (bC == 5) {
                    eeeVar.e(cqiVar.d());
                } else {
                    LogUtil.e("SampleCommandManager", "processSampleEvent default type: ", Integer.valueOf(bC));
                }
            }
            dataReceiveCallback.onDataReceived(iC, deviceInfo, eeeVar);
        } catch (cpy e) {
            LogUtil.d("SampleCommandManager", "processSampleEvent Exception: ", cpc.c(e));
        }
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo, DataReceiveCallback dataReceiveCallback) {
        LogUtil.b("SampleCommandManager", "processSamplePoint enter.");
        eeh eehVar = new eeh();
        eehVar.setCommandId(3);
        try {
            cqk cqkVarC = new cql().c(bArr, 2);
            List<cqi> listD = cqkVarC.d();
            List<cqk> listC = cqkVarC.c();
            int iE = e(listD, eehVar);
            if (iE != 100000) {
                LogUtil.e("SampleCommandManager", "processSamplePoint errorCode is not default value.");
                dataReceiveCallback.onDataReceived(iE, deviceInfo, eehVar);
                return;
            }
            if (listC != null && listC.size() > 0) {
                LogUtil.b("SampleCommandManager", "5.55.3 tlvFatherList.size() :", Integer.valueOf(listC.size()));
                Iterator<cqk> it = listC.iterator();
                while (it.hasNext()) {
                    List<cqk> listC2 = it.next().c();
                    if (listC2 != null && listC2.size() > 0) {
                        LogUtil.b("SampleCommandManager", "5.55.3 childTLVFatherList.size(): ", Integer.valueOf(listC2.size()));
                        a(iE, deviceInfo, listC2, eehVar, dataReceiveCallback);
                    }
                    LogUtil.e("SampleCommandManager", "childTLVFatherList is null or size is zero");
                    return;
                }
                return;
            }
            LogUtil.e("SampleCommandManager", "tlvFatherList is null or size is zero");
        } catch (cpy e) {
            LogUtil.d("SampleCommandManager", "processSamplePoint Exception: ", cpc.c(e));
        }
    }

    private void a(byte[] bArr, DeviceInfo deviceInfo, DataReceiveCallback dataReceiveCallback) {
        int iD;
        LogUtil.b("SampleCommandManager", "processDictionaryPoint enter.");
        eea eeaVar = new eea();
        eeaVar.setCommandId(4);
        try {
            cqk cqkVarC = new cql().c(bArr, 2);
            List<cqi> listD = cqkVarC.d();
            List<cqk> listC = cqkVarC.c();
            if (listC == null || listC.size() <= 0) {
                LogUtil.e("SampleCommandManager", "processDictionaryPoint tlvFatherList is null or size is zero");
                eeaVar.a(0);
                iD = d(listD, eeaVar);
                if (iD != 100000) {
                    LogUtil.e("SampleCommandManager", "processDictionaryPoint errorCode is not default value.");
                    dataReceiveCallback.onDataReceived(iD, deviceInfo, eeaVar);
                    return;
                }
            } else {
                LogUtil.e("SampleCommandManager", "processDictionaryPoint tlvFatherList is size ：", Integer.valueOf(listC.size()));
                eeaVar.a(1);
                iD = c(listD, eeaVar);
                LogUtil.b("SampleCommandManager", "processDictionaryPoint dictionaryPointInfo header to string: ", eeaVar.toString());
                if (iD != 100000) {
                    LogUtil.e("SampleCommandManager", "processDictionaryPoint errorCode is not default value.");
                    dataReceiveCallback.onDataReceived(iD, deviceInfo, eeaVar);
                    return;
                }
                b(eeaVar, listC);
            }
            LogUtil.b("SampleCommandManager", "processDictionaryPoint dictionaryPointInfo data to string: ", eeaVar.toString());
            dataReceiveCallback.onDataReceived(iD, deviceInfo, eeaVar);
            LogUtil.b("SampleCommandManager", "processDictionaryPoint callback successful");
        } catch (cpy e) {
            LogUtil.d("SampleCommandManager", "processDictionaryPoint Exception: ", cpc.c(e));
        }
    }

    private void b(eea eeaVar, List<cqk> list) {
        List<cqk> listC = list.get(0).c();
        ArrayList arrayList = new ArrayList(5);
        for (cqk cqkVar : listC) {
            List<cqi> listD = cqkVar.d();
            if (listD == null || listD.size() <= 0) {
                LogUtil.e("SampleCommandManager", "processDictionaryPoint fillTlvPointList childTlvList is null or size is zero");
            } else {
                eeb eebVar = new eeb();
                for (cqi cqiVar : listD) {
                    byte bC = cqiVar.c();
                    if (bC == 6) {
                        eebVar.c(cph.a(cqiVar.d(), -1L));
                    } else if (bC == 7) {
                        eebVar.d(cph.a(cqiVar.d(), -1L));
                    } else if (bC == 8) {
                        eebVar.a(cph.a(cqiVar.d(), -1L));
                    } else if (bC != 13) {
                        LogUtil.e("SampleCommandManager", "processDictionaryPoint fillTlvPointList fillTlvInfo default: ", Integer.valueOf(bC));
                    } else {
                        eebVar.d(cqiVar.d());
                    }
                }
                LogUtil.b("SampleCommandManager", "processDictionaryPoint fillTlvPointList dictionaryPointInfo time to string: ", eeaVar.toString());
                List<cqk> listC2 = cqkVar.c();
                if (listC2 == null || listC2.size() <= 0) {
                    LogUtil.e("SampleCommandManager", "processDictionaryPoint fillTlvPointList childDataList is null or size is zero");
                    arrayList.add(eebVar);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    c(listC2, arrayList2);
                    eebVar.e(arrayList2);
                    arrayList.add(eebVar);
                    LogUtil.b("SampleCommandManager", "processDictionaryPoint fillTlvPointList dictionaryPointInfo key-value to string: ", eeaVar.toString());
                }
            }
        }
        eeaVar.a(arrayList);
    }

    private void c(List<cqk> list, List<eed> list2) {
        Iterator<cqk> it = list.get(0).c().iterator();
        while (it.hasNext()) {
            List<cqi> listD = it.next().d();
            eed eedVar = new eed();
            for (cqi cqiVar : listD) {
                byte bC = cqiVar.c();
                if (bC == 11) {
                    eedVar.e(cph.a(cqiVar.d(), -1L));
                } else if (bC == 12) {
                    eedVar.a(cqiVar.d());
                } else {
                    LogUtil.e("SampleCommandManager", "processDictionaryPoint fillTlvPointListKeyAndValue default branches.");
                }
            }
            LogUtil.b("SampleCommandManager", "processDictionaryPoint pointInfo fillTlvPointListKeyAndValue to string: ", list2.toString());
            list2.add(eedVar);
        }
    }

    private int c(List<cqi> list, eec eecVar) {
        if (coq.d(list)) {
            LogUtil.e("SampleCommandManager", "fillHeadInfo tlvList is null or size is zero");
            return -1;
        }
        LogUtil.b("SampleCommandManager", "fillHeadInfo enter.");
        int iE = 100000;
        for (cqi cqiVar : list) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.e("SampleCommandManager", "fillHeadInfo Constant.SRC_PKG_TYPE is null.");
                    return -1;
                }
                eecVar.setSrcPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 2) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.e("SampleCommandManager", "fillHeadInfo Constant.DEST_PKG_TYPE is null.");
                    return -1;
                }
                eecVar.setWearPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 127) {
                LogUtil.b("SampleCommandManager", "fillHeadInfo CommonUtil.ERROR_TYPE");
                iE = cph.e(cqiVar.d(), -1);
            } else {
                LogUtil.e("SampleCommandManager", "fillHeadInfo default: ", Integer.valueOf(bC));
            }
        }
        return iE;
    }

    private int e(List<cqi> list, eeh eehVar) {
        if (coq.d(list)) {
            LogUtil.e("SampleCommandManager", "fillHeadInfo tlvList is null or size is zero");
            return -1;
        }
        LogUtil.b("SampleCommandManager", "fillHeadInfo");
        int iE = 100000;
        for (cqi cqiVar : list) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillHeadInfo Constant.SRC_PKG_TYPE is null.");
                    return -1;
                }
                eehVar.setSrcPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 2) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillHeadInfo Constant.DEST_PKG_TYPE is null.");
                    return -1;
                }
                eehVar.setWearPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 3) {
                eehVar.d(cph.a(cqiVar.d(), -1L));
            } else if (bC == 4) {
                eehVar.c(cph.a(cqiVar.d(), -1L));
            } else if (bC == 5) {
                eehVar.a(cph.a(cqiVar.d(), -1L));
            } else if (bC == 10) {
                eehVar.d(cqiVar.d());
            } else if (bC == 127) {
                LogUtil.b("SampleCommandManager", "fillHeadInfo CommonUtil.ERROR_TYPE");
                iE = cph.e(cqiVar.d(), -1);
            } else {
                LogUtil.e("SampleCommandManager", "fillTlvInfo default: ", Integer.valueOf(bC));
            }
        }
        return iE;
    }

    private int c(List<cqi> list, eea eeaVar) {
        if (coq.d(list)) {
            LogUtil.e("SampleCommandManager", "fillTlvPointInfo fillHeadInfo tlvList is null or size is zero");
            return -1;
        }
        LogUtil.b("SampleCommandManager", "fillTlvPointInfo fillHeadInfo");
        int iE = 100000;
        for (cqi cqiVar : list) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvPointInfo fillHeadInfo Constant.SRC_PKG_TYPE is null.");
                    return -1;
                }
                eeaVar.setSrcPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 2) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvPointInfo fillHeadInfo Constant.DEST_PKG_TYPE is null.");
                    return -1;
                }
                eeaVar.setWearPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 3) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvPointInfo fillHeadInfo DICT_ID_TYPE is null.");
                    return -1;
                }
                eeaVar.c(cph.a(cqiVar.d(), -1L));
            } else if (bC == 127) {
                LogUtil.b("SampleCommandManager", "fillTlvPointInfo fillHeadInfo CommonUtil.ERROR_TYPE");
                iE = cph.e(cqiVar.d(), -1);
            } else {
                LogUtil.e("SampleCommandManager", "fillTlvPointInfo fillTlvInfo default: ", Integer.valueOf(bC));
            }
        }
        LogUtil.b("SampleCommandManager", "fillTlvPointInfo dictionaryPointInfo：", eeaVar);
        return iE;
    }

    private int d(List<cqi> list, eea eeaVar) {
        if (coq.d(list)) {
            LogUtil.e("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo tlvList is null or size is zero");
            return -1;
        }
        LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo");
        ArrayList arrayList = new ArrayList();
        eeb eebVar = new eeb();
        int iE = 100000;
        for (cqi cqiVar : list) {
            byte bC = cqiVar.c();
            if (bC == 1) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo Constant.SRC_PKG_TYPE is null.");
                    return -1;
                }
                eeaVar.setSrcPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 2) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo Constant.DEST_PKG_TYPE is null.");
                    return -1;
                }
                eeaVar.setWearPkgName(new String(cqiVar.d(), StandardCharsets.UTF_8));
            } else if (bC == 3) {
                if (cqiVar.d() == null || cqiVar.d().length == 0) {
                    LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo DICT_ID_TYPE is null.");
                    return -1;
                }
                eeaVar.c(cph.a(cqiVar.d(), 16L));
            } else if (bC == 6) {
                eebVar.c(cph.a(cqiVar.d(), 16L));
            } else if (bC == 7) {
                eebVar.d(cph.a(cqiVar.d(), 16L));
            } else if (bC == 8) {
                eebVar.a(cph.a(cqiVar.d(), 16L));
            } else {
                if (bC == 14) {
                    eeaVar.b(cph.e(cqiVar.d(), Integer.MAX_VALUE));
                    LogUtil.b("SampleCommandManager", "current sample limit is " + eeaVar.b());
                } else if (bC == 127) {
                    LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo fillHeadInfo CommonUtil.ERROR_TYPE");
                    iE = cph.e(cqiVar.d(), 16);
                }
                LogUtil.e("SampleCommandManager", "fillTlvRequestPointInfo fillTlvInfo default: ", Integer.valueOf(bC));
            }
        }
        arrayList.add(eebVar);
        eeaVar.a(arrayList);
        LogUtil.b("SampleCommandManager", "fillTlvRequestPointInfo dictionaryPointInfo：", eeaVar);
        return iE;
    }

    private void d(int i, DeviceInfo deviceInfo, List<cqk> list, eef eefVar, DataReceiveCallback dataReceiveCallback) {
        ArrayList arrayList = new ArrayList(5);
        eefVar.setConfigInfoList(arrayList);
        Iterator<cqk> it = list.iterator();
        while (it.hasNext()) {
            List<cqi> listD = it.next().d();
            if (listD == null || listD.size() <= 0) {
                LogUtil.e("SampleCommandManager", "childTlv is null or size is zero");
                return;
            }
            eeg eegVar = new eeg();
            for (cqi cqiVar : listD) {
                byte bC = cqiVar.c();
                if (bC == 5) {
                    eegVar.b(cph.a(cqiVar.d(), -1L));
                } else if (bC == 6) {
                    eegVar.b(cph.e(cqiVar.d(), -1));
                } else if (bC == 7) {
                    eegVar.d(cqiVar.d());
                } else if (bC == 8) {
                    LogUtil.b("SampleCommandManager", "received loseWeight capability parse tlv start.");
                    eegVar.c(Long.valueOf(cph.a(cqiVar.d(), -1L)));
                } else {
                    LogUtil.e("SampleCommandManager", "default branches.");
                }
            }
            LogUtil.b("SampleCommandManager", "configInfo to string:", eegVar.toString());
            arrayList.add(eegVar);
        }
        dataReceiveCallback.onDataReceived(i, deviceInfo, eefVar);
        LogUtil.e("SampleCommandManager", "onDataReceived successful.");
    }

    private void a(int i, DeviceInfo deviceInfo, List<cqk> list, eeh eehVar, DataReceiveCallback dataReceiveCallback) {
        ArrayList arrayList = new ArrayList(5);
        eehVar.e(arrayList);
        Iterator<cqk> it = list.iterator();
        while (it.hasNext()) {
            List<cqi> listD = it.next().d();
            if (listD == null || listD.size() <= 0) {
                LogUtil.e("SampleCommandManager", "childTlv is null or size is zero");
                return;
            }
            eed eedVar = new eed();
            for (cqi cqiVar : listD) {
                byte bC = cqiVar.c();
                if (bC == 8) {
                    eedVar.e(cph.a(cqiVar.d(), -1L));
                } else if (bC != 9) {
                    LogUtil.e("SampleCommandManager", "default branches.");
                } else {
                    eedVar.a(cqiVar.d());
                }
            }
            LogUtil.b("SampleCommandManager", "pointInfo to string: ", eedVar.toString());
            arrayList.add(eedVar);
        }
        dataReceiveCallback.onDataReceived(i, deviceInfo, eehVar);
    }

    private boolean b(String str, eee eeeVar, String str2) {
        LogUtil.b("SampleCommandManager", "sendSampleEventCommand enter. tag: ", str2);
        UniteDevice uniteDeviceD = xjg.d(str);
        cmg cmgVarC = xjf.c(eeeVar);
        if (cmgVarC == null) {
            LogUtil.e("SampleCommandManager", "sendEventConfigCommand commandMessage is invalid.");
            return false;
        }
        this.d.sendCommand(uniteDeviceD, cmgVarC);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        String strE = SampleEventCache.e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("SampleCommandManager", "deviceIdentify is empty");
            return;
        }
        if (!strE.equals(str)) {
            LogUtil.e("SampleCommandManager", "currentDeviceIdentify equals deviceIdentify is different");
            SampleEventCache.b();
            return;
        }
        List<SampleEventCache.a> listD = SampleEventCache.d();
        if (coq.d(listD)) {
            LogUtil.e("SampleCommandManager", "sampleEvents is empty");
            return;
        }
        Iterator<SampleEventCache.a> it = listD.iterator();
        LogUtil.b("SampleCommandManager", "updateCache sampleEvents");
        while (it.hasNext()) {
            SampleEventCache.a next = it.next();
            if (!this.f53071c.get()) {
                LogUtil.e("SampleCommandManager", "handCacheSampleEvent disConnected");
                break;
            }
            if (next.d() > System.currentTimeMillis()) {
                LogUtil.b("SampleCommandManager", "in validity time need cacheSampleEvent sendSampleEventCom");
                b(strE, next.c(), "sampleEventCache");
            }
            it.remove();
        }
        SampleEventCache.d(listD);
    }

    private boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.e("SampleCommandManager", "checkError deviceInfo is invalid.");
            return true;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            return false;
        }
        LogUtil.e("SampleCommandManager", "checkError deviceInfo connectState is invalid.");
        return true;
    }

    static class c {
        private static xiq e = new xiq(null);
    }
}
