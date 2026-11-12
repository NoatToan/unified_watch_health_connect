package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phdkit.DataReceiveListener;
import com.huawei.phdkit.DeviceData;
import com.huawei.phdkit.DiscoveryListener;
import com.huawei.phdkit.DvLiteDevice;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.AsyncStopCallback;
import com.huawei.wearengine.sensor.DataResult;
import com.huawei.wearengine.sensor.Sensor;
import defpackage.oqn;
import defpackage.yit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes46.dex */
public class ykw {
    private final yjb m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53603a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53604b = new Object();
    private static final String[] f = {Sensor.NAME_ACC, Sensor.NAME_PPG, Sensor.NAME_ECG, Sensor.NAME_HR, Sensor.NAME_GYRO, Sensor.NAME_MAG};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f53605c = {Sensor.NAME_ACC, Sensor.NAME_PPG, Sensor.NAME_ECG};
    private static final String[] d = {Sensor.NAME_PPG, Sensor.NAME_ECG, Sensor.NAME_HR};
    private static final String[] e = {Sensor.NAME_ACC, Sensor.NAME_GYRO, Sensor.NAME_MAG};
    private Map<String, List<Sensor>> o = new ConcurrentHashMap();
    private Map<String, List<Sensor>> k = new ConcurrentHashMap();
    private Map<String, AsyncReadCallback> i = new ConcurrentHashMap();
    private Map<String, ykr> j = new ConcurrentHashMap();
    private AtomicInteger p = new AtomicInteger(20000);
    private Map<Integer, AsyncReadCallback> g = new ConcurrentHashMap();
    private Map<Integer, AsyncStopCallback> n = new ConcurrentHashMap();
    private yiu h = new yiu(0);
    private ConcurrentHashMap<String, MonitorDataCallback> l = new ConcurrentHashMap<>(16);
    private oql s = oql.d(yiv.a());

    public static int a(int i) {
        int i2 = 2;
        if (i != 2 && i != 3) {
            i2 = 4;
            if (i != 4 && i != 5 && i != 6) {
                return 0;
            }
        }
        return i2;
    }

    private int b(int i) {
        int i2 = 13;
        if (i != 13) {
            i2 = 300;
            if (i != 300) {
                switch (i) {
                    case 0:
                    case 1:
                    case 3:
                        return 0;
                    case 2:
                        break;
                    case 4:
                        return 301;
                    case 5:
                        return 302;
                    case 6:
                        return 303;
                    default:
                        return 12;
                }
            }
        }
        return i2;
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return 6;
            case 2:
            default:
                return -1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 1;
            case 7:
                return 0;
            case 8:
                return 4;
        }
    }

    private int d(int i) {
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i;
        }
        return 2;
    }

    public static int e(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 2 ? 0 : 7;
        }
        return 5;
    }

    public ykw(yjb yjbVar) {
        this.m = yjbVar;
    }

    public List<Sensor> c(Device device) {
        List<Sensor> listA;
        yit.e("SensorCoreManager", "synchronizeGetSensors");
        if (device == null) {
            yit.b("SensorCoreManager", "synchronizeGetSensors parameters is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        synchronized (f53603a) {
            listA = a(device);
            this.o.put(device.getUuid(), listA);
            synchronized (f53604b) {
                this.k.put(device.getUuid(), listA);
            }
        }
        return listA;
    }

    public List<Sensor> d(List<Sensor> list, Device device) {
        List<String> listAsList;
        if (list == null) {
            yit.b("SensorCoreManager", "filterSensorList sensorList == null ");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device == null) {
            yit.b("SensorCoreManager", "filterSensorList device == null ");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device.getModel() == null) {
            yit.b("SensorCoreManager", "model == null ");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device.getModel().contains("Vidar") || device.getModel().contains("Kanon")) {
            listAsList = Arrays.asList(f53605c);
        } else {
            listAsList = Arrays.asList(f);
        }
        return b(list, listAsList);
    }

    public List<Sensor> c(List<Sensor> list) {
        return b(list, Arrays.asList(d));
    }

    public List<Sensor> a(List<Sensor> list) {
        return b(list, Arrays.asList(e));
    }

    public int e(Device device, Sensor sensor, AsyncReadCallback asyncReadCallback, String str) {
        if (device == null || asyncReadCallback == null || str == null) {
            yit.b("SensorCoreManager", "doAsyncReadSensor parameters is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        e(device.getUuid(), sensor, asyncReadCallback, str);
        int iC = c();
        this.g.put(Integer.valueOf(iC), asyncReadCallback);
        yit.e("SensorCoreManager", "doAsyncReadSensor controlSensor ENABLE_SENSOR");
        e(device.getUuid(), sensor, iC, "ENABLE");
        d(device);
        return 0;
    }

    private void d(final Device device) {
        if (this.l.containsKey(device.getUuid())) {
            return;
        }
        final int iMyPid = Process.myPid();
        MonitorDataCallback.Stub stub = new MonitorDataCallback.Stub() { // from class: com.huawei.wearengine.sensor.SensorCoreManager$1
            @Override // com.huawei.wearengine.monitor.MonitorDataCallback
            public void onChanged(int i, MonitorItem monitorItem, MonitorData monitorData) {
                if (monitorItem == null || monitorData == null) {
                    yit.c("SensorCoreManager", "registerConnectMonitor monitorDataCallback");
                    return;
                }
                if (i == 0 && MonitorItem.MONITOR_ITEM_CONNECTION.getName().equals(monitorItem.getName()) && monitorData.asInt() == 3) {
                    this.this$0.c(device.getUuid());
                    this.this$0.d(iMyPid, device.getUuid());
                    yit.e("SensorCoreManager", "registerConnectMonitor monitorDataCallback onChanged errorCode:" + i + " pid:" + iMyPid);
                }
            }
        };
        this.l.put(device.getUuid(), stub);
        yit.e("SensorCoreManager", "registerConnectMonitor result:" + this.m.d(device, new ArrayList(Collections.singleton(MonitorItem.MONITOR_ITEM_CONNECTION)), new yjn(iMyPid, System.identityHashCode(stub), stub, device, "com.huawei.wearengine.internal")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        boolean z = false;
        for (Map.Entry<String, ykr> entry : this.j.entrySet()) {
            if (entry.getKey().startsWith(str)) {
                this.j.remove(entry.getKey());
                z = true;
            }
        }
        if (z) {
            return;
        }
        for (Map.Entry<String, AsyncReadCallback> entry2 : this.i.entrySet()) {
            if (entry2.getKey().startsWith(str)) {
                this.i.remove(entry2.getKey());
            }
        }
    }

    private boolean g(String str) {
        Iterator<Map.Entry<String, ykr>> it = this.j.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().startsWith(str)) {
                return true;
            }
        }
        Iterator<Map.Entry<String, AsyncReadCallback>> it2 = this.i.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getKey().startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        MonitorDataCallback monitorDataCallback = this.l.get(str);
        yjn yjnVarA = this.m.f().a(new yjn(i, System.identityHashCode(monitorDataCallback), monitorDataCallback, null, null));
        this.l.remove(str);
        try {
            if (yjnVarA == null) {
                yit.b("SensorCoreManager", "unregisterListener map do not have the listener");
                return;
            }
            yit.e("SensorCoreManager", "unRegisterConnectMonitor result:" + this.m.b(yjnVarA));
        } catch (IllegalStateException unused) {
            yit.b("SensorCoreManager", "unregisterListener illegalStateException");
        }
    }

    private boolean c(Sensor sensor) {
        if (sensor == null || sensor.getSupportFrequencyList() == null || sensor.getSupportFrequencyList().isEmpty()) {
            return false;
        }
        int type = sensor.getType();
        return type == 2 || type == 3 || type == 4;
    }

    public int e(Device device, Sensor sensor, AsyncStopCallback asyncStopCallback, String str) throws RemoteException {
        if (device == null || sensor == null || asyncStopCallback == null || str == null) {
            yit.b("SensorCoreManager", "doStopAsyncReadSensor parameters is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        c(device.getUuid(), sensor, str);
        if (c(sensor)) {
            ykr ykrVar = this.j.get(b(device.getUuid(), sensor.getId()));
            if (ykrVar != null && ykrVar.e() > 0) {
                yit.e("SensorCoreManager", "stopAsyncRead asyncReadCallbacks not null, callback asyncStopCallback myself");
                asyncStopCallback.onStopResult(0);
                return 0;
            }
        } else if (d(device.getUuid(), sensor.getId()).size() > 0) {
            yit.e("SensorCoreManager", "stopAsyncRead asyncReadCallbacks not null, callback asyncStopCallback myself");
            asyncStopCallback.onStopResult(0);
            return 0;
        }
        int iC = c();
        this.n.put(Integer.valueOf(iC), asyncStopCallback);
        e(device.getUuid(), sensor, iC, "DISABLE");
        if (!g(device.getUuid())) {
            d(Process.myPid(), device.getUuid());
        }
        return 0;
    }

    public void a(String str) {
        if (str == null) {
            yit.b("SensorCoreManager", "clean parameters is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        h(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.b("SensorCoreManager", "cleanByDevice deviceId isEmpty");
        } else {
            f(str);
        }
    }

    private void h(String str) {
        for (Map.Entry<String, List<Sensor>> entry : this.o.entrySet()) {
            List<Sensor> value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                for (Sensor sensor : value) {
                    if (c(sensor)) {
                        a(key, sensor, str);
                    } else {
                        b(str, key, sensor);
                    }
                }
            }
        }
    }

    private void f(String str) {
        List<Sensor> list = this.o.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Sensor sensor : list) {
            if (c(sensor)) {
                a(str, sensor, "");
            } else {
                b("", str, sensor);
            }
        }
    }

    private void b(String str, String str2, Sensor sensor) {
        if (d(str2, sensor.getId()).size() == 0) {
            yit.a("SensorCoreManager", "stopSensor other app used， no need stop");
            return;
        }
        c(str2, sensor, str);
        if (d(str2, sensor.getId()).size() > 0) {
            yit.a("SensorCoreManager", "stopSensor other app used， no need stop");
            return;
        }
        yit.a("SensorCoreManager", "stopSensors turely stop deviceId: " + str2 + " sensorName: " + sensor.getName());
        e(str2, sensor, c(), "DISABLE");
    }

    private void a(String str, Sensor sensor, String str2) {
        ykr ykrVar = this.j.get(b(str, sensor.getId()));
        if (ykrVar == null || ykrVar.e() == 0) {
            yit.a("SensorCoreManager", "stopMultiFreSensor other app used， no need stop");
            return;
        }
        c(str, sensor, str2);
        if (ykrVar.e() > 0) {
            yit.a("SensorCoreManager", "stopMultiFreSensor other app used， no need stop");
            return;
        }
        yit.a("SensorCoreManager", "stopMultiFreSensor stop deviceId: " + str + " sensorName: " + sensor.getName());
        e(str, sensor, c(), "DISABLE");
    }

    private List<Sensor> b(List<Sensor> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (Sensor sensor : list) {
                if (list2.contains(sensor.getName())) {
                    arrayList.add(sensor);
                }
            }
        }
        return arrayList;
    }

    private void e(String str, Sensor sensor, int i, String str2) {
        yit.e("SensorCoreManager", "controlSensor: " + sensor.getName() + ", seq = " + i + ", cmd = " + str2);
        StringBuilder sb = new StringBuilder("controlSensor: ");
        sb.append(str2);
        yit.a("SensorCoreManager", sb.toString());
        this.s.c(str, oqq.d(sensor, i, str2));
    }

    private List<AsyncReadCallback> d(String str, int i) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, AsyncReadCallback> entry : this.i.entrySet()) {
            if (entry.getKey().startsWith(str + Constants.LINK + i)) {
                linkedList.add(entry.getValue());
            }
        }
        return linkedList;
    }

    private void e(String str, Sensor sensor, AsyncReadCallback asyncReadCallback, String str2) {
        yit.e("SensorCoreManager", "registerAsyncReadCallback");
        yit.a("SensorCoreManager", "registerAsyncReadCallback deviceId " + str + " sensorId " + sensor.getId());
        if (!c(sensor)) {
            this.i.put(c(str, sensor.getId(), str2), asyncReadCallback);
        } else {
            a(str, sensor, asyncReadCallback, str2);
        }
    }

    private void a(String str, Sensor sensor, AsyncReadCallback asyncReadCallback, String str2) {
        ykr ykrVar;
        yit.e("SensorCoreManager", "enter registerMultiFreReadCallback");
        String strB = b(str, sensor.getId());
        int iD = ymn.d(sensor.getExtendJson());
        ykr ykrVarC = c(str, sensor.getType());
        ykv ykvVarD = d(sensor, iD);
        if (this.j.get(strB) != null) {
            ykrVar = this.j.get(strB);
            if (ykvVarD != null && ykrVar.d() > ykvVarD.d()) {
                ykrVar.c(ykvVarD);
                yit.e("SensorCoreManager", "update asyncReadGroup Frequency");
            }
        } else {
            if (ykrVarC != null && ykrVarC.d() == 1) {
                yit.e("SensorCoreManager", "change Frequency to high");
                iD = 1;
            }
            ykr ykrVar2 = new ykr(strB, iD);
            this.j.put(strB, ykrVar2);
            yit.e("SensorCoreManager", "add new asyncReadGroup");
            ykrVar = ykrVar2;
        }
        if (ymn.d(sensor.getExtendJson()) == 1) {
            ykrVar.d(true);
        }
        if (ykvVarD != null && ykrVarC != null && ykrVarC.d() > ykvVarD.d()) {
            ykrVarC.c(ykvVarD);
            yit.e("SensorCoreManager", "update otherReadGroup Frequency");
        }
        ykrVar.a(str2, sensor, asyncReadCallback);
    }

    private ykr c(String str, int i) {
        Sensor next;
        if (i != 2 && i != 3) {
            return null;
        }
        List<Sensor> list = this.o.get(str);
        int iD = d(i);
        Iterator<Sensor> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getType() != iD);
        if (next == null) {
            return null;
        }
        return this.j.get(b(str, next.getId()));
    }

    private ykv d(Sensor sensor, int i) {
        if (sensor == null) {
            return null;
        }
        for (ykv ykvVar : sensor.getSupportFrequencyList()) {
            if (ykvVar.d() == i) {
                return ykvVar;
            }
        }
        return null;
    }

    private String b(String str, int i) {
        return str + Constants.LINK + i;
    }

    private String c(String str, int i, String str2) {
        return b(str, i) + Constants.LINK + str2;
    }

    private void c(String str, Sensor sensor, String str2) {
        yit.e("SensorCoreManager", "unRegisterAsyncReadCallback");
        yit.a("SensorCoreManager", "unRegisterAsyncReadCallback deviceId " + str + " sensorId " + sensor.getId() + " packageName " + str2);
        if (c(sensor)) {
            String strB = b(str, sensor.getId());
            if (TextUtils.isEmpty(str2)) {
                this.j.remove(strB);
            }
            ykr ykrVar = this.j.get(strB);
            if (ykrVar != null) {
                ykrVar.c(str2);
                if (ykrVar.e() == 0) {
                    this.j.remove(strB);
                    yit.e("SensorCoreManager", "remove groupKey");
                    if (ymn.d(sensor.getExtendJson()) == 1) {
                        e(str, sensor);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e(str, sensor, str2);
    }

    private void e(String str, Sensor sensor, String str2) {
        String strC = c(str, sensor.getId(), str2);
        Iterator<Map.Entry<String, AsyncReadCallback>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (!TextUtils.isEmpty(str2)) {
                if (key.equals(strC)) {
                    it.remove();
                }
            } else if (key.startsWith(strC)) {
                it.remove();
            }
        }
    }

    private void e(String str, Sensor sensor) {
        ykr ykrVarC = c(str, sensor.getType());
        ykv ykvVarD = d(sensor, 2);
        if (ykrVarC == null || ykrVarC.b() || !ykrVarC.e(ykvVarD)) {
            return;
        }
        ykrVarC.c(ykvVarD);
        yit.e("SensorCoreManager", "downFrequency asyncReadGroup Frequency");
    }

    private List<Sensor> a(Device device) {
        this.o.remove(device.getUuid());
        this.o.put(device.getUuid(), new ArrayList());
        this.h = new yiu(1);
        i(device.getUuid());
        this.s.c(b(device).getUdid(), oqq.a());
        try {
            if (!this.h.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("SensorCoreManager", "getSensorListByDevice asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(12));
            }
            return this.o.get(device.getUuid());
        } catch (InterruptedException unused) {
            yit.b("SensorCoreManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    private void i(String str) {
        yit.e("SensorCoreManager", "getDataReceiveListener enter");
        if (this.s.d().get(str) != null) {
            yit.e("SensorCoreManager", "getDataReceiveListener deviceDataListener is not null");
            return;
        }
        DataReceiveListener dataReceiveListenerE = e(str);
        this.s.e(str, dataReceiveListenerE);
        this.s.d().put(str, dataReceiveListenerE);
    }

    private DataReceiveListener e(final String str) {
        return new DataReceiveListener.Stub() { // from class: com.huawei.wearengine.sensor.SensorCoreManager$2
            ConcurrentHashMap<String, Long> lastSendHeartTimeMap = new ConcurrentHashMap<>(16);

            @Override // com.huawei.phdkit.DataReceiveListener
            public void onDataChanged(DeviceData deviceData) throws RemoteException {
                if (deviceData == null) {
                    yit.b("SensorCoreManager", "onDataChanged deviceData is null");
                    return;
                }
                yit.a("SensorCoreManager", "onDataChanged " + Arrays.toString(deviceData.getDataContents()));
                yit.a("SensorCoreManager", "onDataChanged " + oqn.a(deviceData.getDataContents()));
                int linkType = deviceData.getLinkType();
                if (linkType == 1) {
                    yit.e("SensorCoreManager", "getSensorList onDataChanged LINK_TYPE_DATA");
                    this.this$0.c(str, (ConcurrentHashMap<String, Long>) this.lastSendHeartTimeMap, deviceData);
                } else if (linkType != 2) {
                    yit.e("SensorCoreManager", "handleDataChanged default");
                } else {
                    yit.e("SensorCoreManager", "getSensorList onDataChanged LINK_TYPE_CMD");
                    this.this$0.a(deviceData.getDataContents(), (List<Sensor>) this.this$0.o.get(str));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, ConcurrentHashMap<String, Long> concurrentHashMap, DeviceData deviceData) throws RemoteException {
        boolean zD;
        String str2 = str + Constants.LINK + ((int) deviceData.getDataContents()[0]);
        long jLongValue = concurrentHashMap.get(str2) == null ? 0L : concurrentHashMap.get(str2).longValue();
        if (deviceData.getDataContents()[0] == 126) {
            zD = e(deviceData, str);
        } else {
            zD = d(str, deviceData.getDataContents());
        }
        if (!zD || System.currentTimeMillis() - jLongValue < 1000) {
            return;
        }
        this.s.d(str, oqq.d(deviceData.getDataContents()[0]));
        concurrentHashMap.put(str2, Long.valueOf(System.currentTimeMillis()));
    }

    private boolean e(DeviceData deviceData, String str) throws RemoteException {
        yit.e("SensorCoreManager", "handlerAccGyro enter");
        try {
            String strA = oqn.a(oqq.d(deviceData.getDataContents()));
            if (TextUtils.isEmpty(strA)) {
                yit.c("SensorCoreManager", "agStr is null");
                return false;
            }
            String[] strArrSplit = strA.split("3B3B");
            yit.a("SensorCoreManager", "valueArr length: " + strArrSplit.length + "; agStr = " + strA);
            if (strArrSplit.length == 2) {
                return d(str, oqn.a(strArrSplit[0])) && d(str, oqn.a(strArrSplit[1]));
            }
            yit.b("SensorCoreManager", "valueArr is Empty");
            return false;
        } catch (StringIndexOutOfBoundsException unused) {
            yit.b("SensorCoreManager", "handleCmd default");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, List<Sensor> list) throws RemoteException {
        if (bArr == null) {
            return;
        }
        yit.a("SensorCoreManager", "handleCmd dataContents " + Arrays.toString(bArr));
        yit.a("SensorCoreManager", "handleCmd dataContents " + oqn.a(bArr));
        int iC = oqq.c(bArr);
        if (iC == 1) {
            yit.e("SensorCoreManager", "handleCmd SENSOR_SYNC");
            oqq.d(bArr, list, this.h);
        } else if (iC == 2) {
            yit.e("SensorCoreManager", "handleCmd SENSOR_ENABLE");
            oqq.c(bArr, this.g, this.n);
        } else {
            yit.a("SensorCoreManager", "handleCmd default");
        }
    }

    private boolean d(String str, byte[] bArr) {
        yit.e("SensorCoreManager", "doAsyncReadCallback");
        if (bArr == null || bArr.length < 1) {
            yit.e("SensorCoreManager", "doAsyncReadCallback value is wrong data");
            return false;
        }
        byte b2 = bArr[0];
        Sensor sensorE = e(str, b2);
        if (sensorE == null) {
            yit.e("SensorCoreManager", "doAsyncReadCallback can not find sensor!");
            return false;
        }
        DataResult dataResult = new DataResult();
        int iD = d(sensorE, bArr, dataResult);
        if (c(sensorE)) {
            ykr ykrVar = this.j.get(b(str, sensorE.getId()));
            if (ykrVar == null) {
                yit.e("SensorCoreManager", "asyncReadGroup has no sensor to callback");
                return false;
            }
            yit.e("SensorCoreManager", "doAsyncReadCallback multiFre => type: " + sensorE.getType());
            a(iD, dataResult);
            ykrVar.b(iD, dataResult);
        } else {
            List<AsyncReadCallback> listD = d(str, b2);
            if (listD.isEmpty()) {
                yit.e("SensorCoreManager", "doAsyncReadCallback has no sensor to callback");
                return false;
            }
            for (AsyncReadCallback asyncReadCallback : listD) {
                try {
                    yit.e("SensorCoreManager", "doAsyncReadCallback => type: " + sensorE.getType());
                    a(iD, dataResult);
                    asyncReadCallback.onReadResult(b(iD), dataResult);
                } catch (Exception unused) {
                    yit.e("SensorCoreManager", "doAsyncReadCallback onReadResult Exception");
                }
            }
        }
        yit.e("SensorCoreManager", "doAsyncReadCallback has callback");
        if (iD != 13) {
            return true;
        }
        e(str, sensorE, c(), "DISABLE");
        yit.b("SensorCoreManager", "Device version is not supported");
        return false;
    }

    private void a(int i, DataResult dataResult) {
        if (dataResult != null) {
            StringBuilder sb = new StringBuilder("errorCode:[");
            sb.append(i);
            sb.append("]");
            if (dataResult.getSensor() != null) {
                sb.append("name:[");
                sb.append(dataResult.getSensor().getName());
                sb.append("]sensorId:[");
                sb.append(dataResult.getSensor().getId());
                sb.append("]sensorType:[");
                sb.append(dataResult.getSensor().getType());
                sb.append("]accuracy:[");
                sb.append(dataResult.getSensor().getAccuracy());
                sb.append("]resolution:[");
                sb.append(dataResult.getSensor().getResolution());
                sb.append("]");
            }
            sb.append("get value:[");
            sb.append(Arrays.toString(dataResult.asFloats()));
            sb.append("]value size:[");
            sb.append(dataResult.asFloats().length);
            sb.append("]Timestamp:[");
            sb.append(dataResult.getTimestamp());
            sb.append("]");
            yit.e("SensorCoreManager", "doAsyncReadCallback => result: " + sb.toString());
        }
    }

    private int d(Sensor sensor, byte[] bArr, DataResult dataResult) {
        yit.e("SensorCoreManager", "buildSensorData");
        dataResult.setSensor(sensor);
        switch (sensor.getType()) {
            case 0:
            case 1:
                yit.e("SensorCoreManager", "buildSensorData for multi channel sensor");
                return oqq.c(sensor.getType(), oqq.d(bArr), dataResult);
            case 2:
            case 3:
            case 4:
            case 5:
                yit.e("SensorCoreManager", "buildSensorData for none channel sensor");
                return oqq.e(sensor.getType(), sensor.isSupportUtc(), oqq.d(bArr), dataResult);
            case 6:
                yit.e("SensorCoreManager", "buildSensorData for Heart Rate sensor");
                return oqq.e(sensor.getType(), oqq.d(bArr), dataResult);
            default:
                dataResult.setValues(oqq.e(4, bArr, false));
                return 0;
        }
    }

    private Sensor e(String str, int i) {
        List<Sensor> list;
        yit.e("SensorCoreManager", "getSensorById sensorId :" + i);
        synchronized (f53604b) {
            list = this.k.get(str);
        }
        yit.e("SensorCoreManager", "getSensorById after");
        if (list == null) {
            return null;
        }
        for (Sensor sensor : list) {
            if (sensor.getId() == i) {
                return sensor;
            }
        }
        return null;
    }

    private DvLiteDevice b(final Device device) {
        final DvLiteDevice[] dvLiteDeviceArr = new DvLiteDevice[1];
        final yiu yiuVar = new yiu(1);
        this.s.b(0, new DiscoveryListener.Stub() { // from class: com.huawei.wearengine.sensor.SensorCoreManager$3
            @Override // com.huawei.phdkit.DiscoveryListener
            public void onDeviceFound(List<DvLiteDevice> list) throws RemoteException {
                yit.e("SensorCoreManager", "getSensorList onDeviceFound");
                if (list != null) {
                    this.this$0.b(device, dvLiteDeviceArr, yiuVar, list);
                } else {
                    yit.b("SensorCoreManager", "getSensorList onDeviceFound devices is null");
                }
            }
        });
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("SensorCoreManager", "getDvLiteDevice asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(12));
            }
            return dvLiteDeviceArr[0];
        } catch (InterruptedException unused) {
            yit.b("SensorCoreManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Device device, DvLiteDevice[] dvLiteDeviceArr, yiu yiuVar, List<DvLiteDevice> list) {
        for (int i = 0; i < list.size(); i++) {
            if (device.getUuid().equals(list.get(i).getUdid())) {
                yit.a("SensorCoreManager", "handleDeviceFound got the device " + device.getUuid());
                dvLiteDeviceArr[0] = list.get(i);
                break;
            }
        }
        yiuVar.onFinish();
    }

    private int c() {
        if (this.p.get() >= 30000) {
            this.p.set(20000);
        }
        return this.p.getAndIncrement();
    }

    public boolean d(String str) {
        return this.s.d().get(str) == null;
    }
}
