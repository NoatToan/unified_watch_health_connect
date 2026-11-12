package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.EnumMonitorType;
import com.huawei.wearengine.monitor.MonitorCallback;
import com.huawei.wearengine.monitor.MonitorMessage;
import com.huawei.wearengine.monitor.QueryDataCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yht extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53341a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yjv f53342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, Integer> f53343c;
    private MonitorCallback d;
    private Map<String, Map<String, List<QueryDataCallback>>> e;

    static class d {
        private static final yht e = new yht();
    }

    private yht() {
        super(BaseApplication.getContext());
        this.e = new HashMap(16);
        this.d = null;
        this.f53343c = new HashMap(16);
        LogUtil.a("WearEngine_HwWearEngineManager", "enter HwWearEngineManager");
        this.e.clear();
        this.f53342b = new yjv(50);
        c();
        yjk.d().a();
    }

    private void c() {
        this.f53343c.put(3, Integer.valueOf(EnumMonitorType.EVENT_WEAR_APP_INSTALLATION_REPORT.getValue()));
    }

    public static yht d() {
        return d.e;
    }

    public void b(MonitorCallback monitorCallback) {
        synchronized (this) {
            if (monitorCallback != null) {
                LogUtil.a("WearEngine_HwWearEngineManager", "subscribeMonitorReceiver enter");
                this.d = monitorCallback;
            }
        }
    }

    public void a() {
        synchronized (this) {
            LogUtil.a("WearEngine_HwWearEngineManager", "unsubscribeMonitorReceiver enter");
            this.d = null;
        }
    }

    public MonitorCallback b() {
        return this.d;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 53;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("WearEngine_HwWearEngineManager", "getResult");
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.j("WearEngine_HwWearEngineManager", "device or dataContents is null");
            return;
        }
        cpl.d("WearEngine_HwWearEngineManager", bArr, "HwWearEngineManager getResult ");
        byte b2 = bArr[1];
        if (b2 == 2) {
            c(deviceInfo, bArr);
        } else if (b2 == 3) {
            yjx.a().d(bArr);
        } else {
            LogUtil.a("WearEngine_HwWearEngineManager", "other commandID");
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr) {
        int iB;
        String strE;
        List<eew> listB = ykx.b(bArr);
        if (listB == null || listB.size() <= 0) {
            LogUtil.e("WearEngine_HwWearEngineManager", "onResponseCallback tlv is invalid");
            return;
        }
        int iB2 = ykx.b(listB, 1);
        int iB3 = ykx.b(listB, 2);
        if (d(iB2, iB3)) {
            strE = ykx.e(ykx.d(listB, 3));
            iB = -1;
        } else {
            iB = ykx.b(listB, 3);
            strE = "";
        }
        if (iB2 == -1) {
            LogUtil.e("WearEngine_HwWearEngineManager", "onResponseCallback subCmd is invalid");
        } else {
            e(iB2, iB3, iB, strE, deviceInfo);
        }
    }

    private boolean d(int i, int i2) {
        Integer num = this.f53343c.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue() == i2;
        }
        LogUtil.j("WearEngine_HwWearEngineManager", "isEventValueForString eventStringType not exist");
        return false;
    }

    private void e(int i, int i2, int i3, String str, DeviceInfo deviceInfo) {
        if (d(i, i2)) {
            c(i, i2, str, deviceInfo);
        } else {
            c(i, i2, i3, deviceInfo);
        }
    }

    private void c(int i, int i2, int i3, DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwWearEngineManager", "handleEventResultCallback eventValue is", Integer.valueOf(i3));
        Device deviceA = ykx.a(deviceInfo);
        if (deviceA == null) {
            LogUtil.e("WearEngine_HwWearEngineManager", "handleEventResultCallback device is empty");
            return;
        }
        String descByValue = EnumMonitorType.getDescByValue(i2);
        if (descByValue == null) {
            return;
        }
        if (i == 1 || i == 2) {
            yjq.a().c(descByValue, i, i3);
            return;
        }
        if (i != 3) {
            if (i == 5) {
                a(i3, deviceInfo, deviceA, descByValue);
                return;
            } else {
                LogUtil.e("WearEngine_HwWearEngineManager", "handleEventResultCallback subCmd is invalid");
                return;
            }
        }
        c(deviceInfo.getDeviceIdentify(), descByValue, i3);
        MonitorMessage monitorMessage = new MonitorMessage(descByValue, deviceA.getUuid(), i3);
        MonitorCallback monitorCallback = this.d;
        if (monitorCallback == null) {
            LogUtil.j("WearEngine_HwWearEngineManager", "handleEventResultCallback mMonitorCallback is null");
            return;
        }
        try {
            monitorCallback.onChanged(a.w, monitorMessage);
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwWearEngineManager", "send EventReportMessage failed.");
        }
    }

    private void c(int i, int i2, String str, DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwWearEngineManager", "handleEventResultCallback eventValue is ", str);
        if (i == 3) {
            a(i2, str, deviceInfo);
        } else {
            LogUtil.e("WearEngine_HwWearEngineManager", "handleEventResultCallback subCmd is invalid");
        }
    }

    private void a(int i, String str, DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HwWearEngineManager", "handleEventStringResult eventType is " + i);
        if (i == EnumMonitorType.EVENT_WEAR_APP_INSTALLATION_REPORT.getValue()) {
            e(str, deviceInfo);
        }
    }

    private void e(String str, DeviceInfo deviceInfo) {
        yih yihVarB = yih.b();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        yid yidVar = new yid();
        yidVar.d(1);
        yidVar.c(str);
        yihVarB.a(deviceIdentify, yidVar);
    }

    private void a(int i, DeviceInfo deviceInfo, Device device, String str) {
        Map<String, List<QueryDataCallback>> mapRemove;
        c(deviceInfo.getDeviceIdentify(), str, i);
        MonitorMessage monitorMessage = new MonitorMessage(str, device.getUuid(), i);
        synchronized (f53341a) {
            mapRemove = this.e.remove(deviceInfo.getDeviceIdentify());
        }
        if (mapRemove == null) {
            LogUtil.e("WearEngine_HwWearEngineManager", "handleQueryCallback deviceCallback is null");
            return;
        }
        List<QueryDataCallback> list = mapRemove.get(str);
        if (list == null) {
            LogUtil.e("WearEngine_HwWearEngineManager", "handleQueryCallback callbacks is null");
            return;
        }
        try {
            Iterator<QueryDataCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onDataReceived(0, monitorMessage);
            }
        } catch (RemoteException unused) {
            LogUtil.e("WearEngine_HwWearEngineManager", "handle QueryDataResultCallback RemoteException");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    public void d(String str, String str2, QueryDataCallback queryDataCallback) {
        byte b2;
        if (str == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "wearStatus":
                b2 = 0;
                break;
            case "sportStatus":
                b2 = 1;
                break;
            case "powerStatus":
                b2 = 2;
                break;
            case "sleepStatus":
                b2 = 3;
                break;
            case "chargeStatus":
                b2 = 4;
                break;
            case "userAvailableKbytes":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            yjp.a().a(str2, queryDataCallback);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                yjo.c().d(str2, queryDataCallback);
                return;
            } else if (b2 != 3 && b2 != 4 && b2 != 5) {
                LogUtil.e("WearEngine_HwWearEngineManager", "not supported eventType", str);
                return;
            }
        }
        a(str, str2, queryDataCallback);
    }

    private void a(String str, String str2, QueryDataCallback queryDataCallback) {
        List<QueryDataCallback> arrayList;
        synchronized (f53341a) {
            Map<String, List<QueryDataCallback>> map = this.e.get(str2);
            if (map == null) {
                map = new HashMap<>(16);
                arrayList = new ArrayList<>(16);
            } else {
                arrayList = map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                }
            }
            arrayList.add(queryDataCallback);
            map.put(str, arrayList);
            this.e.put(str2, map);
        }
        LogUtil.a("WearEngine_HwWearEngineManager", "registerQueryDataListener callback ok");
    }

    public void b(DeviceInfo deviceInfo, byte[] bArr) {
        yjp.a().c(deviceInfo, bArr);
        yjo.c().d(deviceInfo, bArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    private void c(String str, String str2, int i) {
        byte b2;
        if (str == null || str2 == null) {
            return;
        }
        str2.hashCode();
        switch (str2) {
            case "wearStatus":
                b2 = 0;
                break;
            case "sportStatus":
                b2 = 1;
                break;
            case "powerStatus":
                b2 = 2;
                break;
            case "sleepStatus":
                b2 = 3;
                break;
            case "heartRateAlarm":
                b2 = 4;
                break;
            case "chargeStatus":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            e(str, str2, i);
            return;
        }
        if (b2 == 1) {
            c(this.f53342b, str, str2, i);
            return;
        }
        if (b2 == 2) {
            a(str, str2, i);
            return;
        }
        if (b2 == 3) {
            e(this.f53342b, str, str2, i);
            return;
        }
        if (b2 == 4) {
            b(this.f53342b, str, str2, i);
        } else if (b2 == 5) {
            d(this.f53342b, str, str2, i);
        } else {
            LogUtil.e("WearEngine_HwWearEngineManager", "not supported eventType", str2);
        }
    }

    public void e(String str, String str2, QueryDataCallback queryDataCallback) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || queryDataCallback == null) {
            LogUtil.e("WearEngine_HwWearEngineManager", "sendQueryCommand has null param");
            return;
        }
        DeviceCommand deviceCommandA = yli.a(str2);
        if (deviceCommandA == null) {
            LogUtil.e("WearEngine_HwWearEngineManager", "sendQueryCommand command is null");
            try {
                queryDataCallback.onDataReceived(12, new MonitorMessage());
            } catch (RemoteException unused) {
                LogUtil.e("WearEngine_HwWearEngineManager", "sendQueryCommand RemoteException");
            }
            throw new IllegalStateException(String.valueOf(12));
        }
        LogUtil.a("WearEngine_HwWearEngineManager", "sendQueryCommand command is:", deviceCommandA.toString());
        deviceCommandA.setmIdentify(str);
        d(str2, str, queryDataCallback);
        ykx.c(deviceCommandA);
    }

    private void a(String str, String str2, int i) {
        int iD = yjo.c().d(i, -1);
        if (iD != -1) {
            yjo.c().b(str, str2, String.valueOf(iD));
        }
    }

    private void e(String str, String str2, int i) {
        int iE = yjp.a().e(i, -1);
        if (iE != -1) {
            yjp.a().d(str, str2, String.valueOf(iE));
        }
    }

    private void c(yjv yjvVar, String str, String str2, int i) {
        if (i < 1 || i > 255) {
            i = -1;
        }
        if (i != -1) {
            yjvVar.c(str, str2, String.valueOf(i));
        }
    }

    private void e(yjv yjvVar, String str, String str2, int i) {
        if (i != 1 && i != 2) {
            i = -1;
        }
        if (i != -1) {
            yjvVar.c(str, str2, String.valueOf(i));
        }
    }

    private void b(yjv yjvVar, String str, String str2, int i) {
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            i = -1;
        }
        if (i != -1) {
            yjvVar.c(str, str2, String.valueOf(i));
        }
    }

    private void d(yjv yjvVar, String str, String str2, int i) {
        if (i != 1 && i != 2 && i != 3) {
            i = -1;
        }
        if (i != -1) {
            yjvVar.c(str, str2, String.valueOf(i));
        }
    }
}
