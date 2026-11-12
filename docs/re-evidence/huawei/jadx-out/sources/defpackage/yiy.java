package defpackage;

import android.text.TextUtils;
import com.huawei.wearengine.core.device.VirtualDevice;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.monitor.MonitorMessage;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import defpackage.yit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes46.dex */
public class yiy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Map<yjn, Map<String, List<String>>> f53405b = new ConcurrentHashMap();

    public int e(String str, List<MonitorItem> list, yjn yjnVar) {
        if (!a(str, list, yjnVar)) {
            yit.b("MonitorCallbackManager", "HandleMonitorCallbackProxy parameters is invalid");
            return 5;
        }
        yit.a("MonitorCallbackManager", "registerMonitor monitorCallbackProxy pid is:" + yjnVar.d() + ", hashcode is:" + yjnVar.c());
        yjn yjnVarA = a(yjnVar);
        if (yjnVarA == null) {
            Iterator<MonitorItem> it = list.iterator();
            int iD = 0;
            while (it.hasNext()) {
                iD = d(yjnVar.a(), e(str, it.next().getName()));
                if (iD >= 10) {
                    yit.b("MonitorCallbackManager", "monitor data callback is exceed 10!");
                    return 11;
                }
            }
            yit.e("MonitorCallbackManager", "registerMonitor new monitor, ListSize：" + iD);
            c(str, list, yjnVar);
        } else {
            yit.e("MonitorCallbackManager", "registerMonitor already has monitor");
            d(str, list, yjnVarA);
        }
        yit.a("MonitorCallbackManager", "handleMonitorCallbackProxy mDeviceMonitorCallbackMap is:" + this.f53405b.toString());
        return 0;
    }

    private int d(String str, List<yjn> list) {
        int i = 0;
        for (yjn yjnVar : list) {
            if (yjnVar != null && yjnVar.a().equals(str)) {
                i++;
            }
        }
        return i;
    }

    private void d(String str, List<MonitorItem> list, yjn yjnVar) {
        Map<String, List<String>> map = this.f53405b.get(yjnVar);
        List<String> copyOnWriteArrayList = map.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        for (MonitorItem monitorItem : list) {
            if (!copyOnWriteArrayList.contains(monitorItem.getName())) {
                copyOnWriteArrayList.add(monitorItem.getName());
            }
        }
        map.put(str, copyOnWriteArrayList);
    }

    private boolean a(String str, List<MonitorItem> list, yjn yjnVar) {
        if (str == null || yjnVar == null || list == null) {
            yit.b("MonitorCallbackManager", "isValidParameters parameter is null");
            return false;
        }
        if (TextUtils.isEmpty(yjnVar.a())) {
            yit.b("MonitorCallbackManager", "isValidParameters srcPkgName is null");
            return false;
        }
        for (MonitorItem monitorItem : list) {
            if (monitorItem == null || TextUtils.isEmpty(monitorItem.getName())) {
                yit.b("MonitorCallbackManager", "isValidParameters MonitorItem’name is null");
                return false;
            }
        }
        return true;
    }

    public yjn a(yjn yjnVar) {
        if (yjnVar == null) {
            return null;
        }
        yit.a("MonitorCallbackManager", "getContainMonitor monitorCallbackProxy pid is:" + yjnVar.d() + ", hashcode is:" + yjnVar.c());
        for (yjn yjnVar2 : this.f53405b.keySet()) {
            if (yjnVar2.equals(yjnVar)) {
                yit.e("MonitorCallbackManager", "getContainMonitor get the same monitorCallbackProxy");
                return yjnVar2;
            }
        }
        yit.e("MonitorCallbackManager", "getContainMonitor no same monitorCallbackProxy");
        return null;
    }

    private List<yjn> e(String str, String str2) {
        yit.e("MonitorCallbackManager", "getMonitorDataCallbackList enter");
        yit.a("MonitorCallbackManager", "getMonitorDataCallbackList deviceId: " + str + ", monitorItemType: " + str2);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yit.b("MonitorCallbackManager", "getMonitorDataCallbackList parameters is invalid");
            return arrayList;
        }
        if (this.f53405b.isEmpty()) {
            yit.b("MonitorCallbackManager", "getMonitorDataCallbackList deviceMonitorCallbackMap is null");
            return arrayList;
        }
        yit.a("MonitorCallbackManager", "getMonitorDataCallbackList map is：" + this.f53405b.toString());
        for (Map.Entry<yjn, Map<String, List<String>>> entry : this.f53405b.entrySet()) {
            Map<String, List<String>> value = entry.getValue();
            if (!value.containsKey(str)) {
                yit.e("MonitorCallbackManager", "getMonitorDataCallbackList not contains deviceId");
            } else {
                List<String> list = value.get(str);
                if (list != null && list.contains(str2)) {
                    yit.e("MonitorCallbackManager", "getMonitorDataCallbackList deviceMonitorCallbackMap hit");
                    arrayList.add(entry.getKey());
                }
            }
        }
        yit.e("MonitorCallbackManager", "getMonitorDataCallbackList monitorItemType:" + str2 + ", size: " + arrayList.size());
        return arrayList;
    }

    public boolean c(String str) {
        yit.e("MonitorCallbackManager", "isSwitchStatusOpen enter, monitorItemType: " + str);
        return MonitorItem.MONITOR_ITEM_CONNECTION.getName().equals(str) || MonitorItem.MONITOR_ITEM_POWER_MODE.getName().equals(str);
    }

    private void c(String str, List<MonitorItem> list, yjn yjnVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator<MonitorItem> it = list.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add(it.next().getName());
        }
        concurrentHashMap.put(str, copyOnWriteArrayList);
        this.f53405b.put(yjnVar, concurrentHashMap);
    }

    public void c(int i, MonitorMessage monitorMessage) {
        yit.e("MonitorCallbackManager", "handleReceive enter");
        if (monitorMessage == null) {
            yit.b("MonitorCallbackManager", "handleReceive monitorMessage is null");
            return;
        }
        if (this.f53405b.isEmpty()) {
            yit.b("MonitorCallbackManager", "handleReceive deviceMonitorCallbackMap is null");
            return;
        }
        String deviceId = monitorMessage.getDeviceId();
        String monitorItemType = monitorMessage.getMonitorItemType();
        if (TextUtils.isEmpty(deviceId) || TextUtils.isEmpty(monitorItemType)) {
            yit.b("MonitorCallbackManager", "getMonitorList parameters is invalid");
            return;
        }
        MonitorData monitorDataE = e(monitorMessage);
        if (monitorDataE == null) {
            yit.b("MonitorCallbackManager", "getMonitorList parameter monitorData is invalid");
            return;
        }
        List<yjn> listE = e(deviceId, monitorItemType);
        if (listE.isEmpty()) {
            yit.b("MonitorCallbackManager", "handleReceive monitorList is empty");
            return;
        }
        MonitorItem monitorItem = new MonitorItem();
        monitorItem.setName(monitorItemType);
        Iterator<yjn> it = listE.iterator();
        while (it.hasNext()) {
            MonitorDataCallback monitorDataCallbackE = it.next().e();
            if (monitorDataCallbackE == null) {
                yit.c("MonitorCallbackManager", "handleReceive monitorDataCallback is null continue");
            } else {
                try {
                    monitorDataCallbackE.onChanged(i, monitorItem, monitorDataE);
                } catch (Exception unused) {
                    yit.c("MonitorCallbackManager", "handleReceive exception");
                }
            }
        }
    }

    public MonitorData e(MonitorMessage monitorMessage) {
        HashMap map = null;
        if (monitorMessage == null) {
            return null;
        }
        HashMap<String, MonitorMessage> mapData = monitorMessage.getMapData();
        if (mapData != null) {
            map = new HashMap(16);
            for (Map.Entry<String, MonitorMessage> entry : mapData.entrySet()) {
                map.put(entry.getKey(), e(entry.getValue()));
            }
        }
        return new MonitorData(monitorMessage.isBooleanData(), monitorMessage.getIntData(), monitorMessage.getStringData(), map);
    }

    public void d(yjn yjnVar) {
        if (yjnVar == null) {
            yit.c("MonitorCallbackManager", "removeMonitorCallback monitorInfo is null!");
            return;
        }
        this.f53405b.remove(yjnVar);
        yit.e("MonitorCallbackManager", "removeMonitorCallback deviceMonitorCallbackMap size is:" + this.f53405b.size());
    }

    public Map<String, List<String>> c(yjn yjnVar) {
        HashMap map = new HashMap(16);
        if (yjnVar == null) {
            yit.c("MonitorCallbackManager", "getNeedCloseMonitorCallback monitorInfo is null!");
            return map;
        }
        Map<String, List<String>> map2 = this.f53405b.get(yjnVar);
        if (map2 == null) {
            yit.c("MonitorCallbackManager", "getNeedCloseMonitorCallback needCloseSwitchMap is null!");
            return Collections.EMPTY_MAP;
        }
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            List<String> value = entry.getValue();
            for (int size = value.size() - 1; size >= 0; size--) {
                if (e(entry.getKey(), value.get(size)).size() > 1) {
                    value.remove(size);
                }
            }
        }
        yit.a("MonitorCallbackManager", "getNeedCloseMonitorCallback :" + map2);
        return map2;
    }

    public int c() {
        return this.f53405b.size();
    }

    public Set<String> e(String str) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            for (Map<String, List<String>> map : this.f53405b.values()) {
                if (map != null && map.get(str) != null) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return hashSet;
    }

    public void e() {
        if (this.f53405b.isEmpty()) {
            yit.b("MonitorCallbackManager", "clearDiedMonitor deviceMonitorCallbackMap is null");
            return;
        }
        Iterator<Map.Entry<yjn, Map<String, List<String>>>> it = this.f53405b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<yjn, Map<String, List<String>>> next = it.next();
            if (!next.getKey().e().asBinder().pingBinder()) {
                yit.a("MonitorCallbackManager", "clearDiedMonitor hit died monitor and remove");
                c(next.getKey().b(), next.getValue());
                it.remove();
            }
        }
        yit.e("MonitorCallbackManager", "clearDiedMonitor deviceMonitorCallbackMap size is:" + this.f53405b.size());
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.c("MonitorCallbackManager", "clearDiedMonitorByDevice deviceId isEmpty");
            return;
        }
        if (this.f53405b.isEmpty()) {
            yit.c("MonitorCallbackManager", "clearDiedMonitorByDevice map isEmpty");
            return;
        }
        yit.e("MonitorCallbackManager", "clearDiedMonitorByDevice before is:" + this.f53405b);
        Iterator<Map.Entry<yjn, Map<String, List<String>>>> it = this.f53405b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<yjn, Map<String, List<String>>> next = it.next();
            if (next.getValue() != null) {
                c(str, next.getValue());
                if (next.getValue().size() == 0) {
                    it.remove();
                }
            }
        }
        yit.e("MonitorCallbackManager", "clearDiedMonitorByDevice after is:" + this.f53405b);
    }

    private void c(String str, Map<String, List<String>> map) {
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getKey())) {
                it.remove();
            }
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.b("MonitorCallbackManager", "clearDiedMonitorByClientName srcPkgName is null or empty");
            return;
        }
        yit.e("MonitorCallbackManager", "clearDiedMonitorByClientName start, srcPkgName is:" + str);
        if (this.f53405b.isEmpty()) {
            yit.b("MonitorCallbackManager", "clearDiedMonitorByClientName deviceMonitorCallbackMap is null");
            return;
        }
        Iterator<Map.Entry<yjn, Map<String, List<String>>>> it = this.f53405b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<yjn, Map<String, List<String>>> next = it.next();
            if (str.equals(next.getKey().a())) {
                c(next.getKey().b(), next.getValue());
                it.remove();
            }
        }
        yit.e("MonitorCallbackManager", "clearDiedMonitor deviceMonitorCallbackMap size is:" + this.f53405b.size());
    }

    private void c(Device device, Map<String, List<String>> map) {
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("MonitorCallbackManager", "deviceAdapter is null");
            return;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            for (int size = value.size() - 1; size >= 0; size--) {
                String key = entry.getKey();
                String str = value.get(size);
                if (e(key, str).size() <= 1) {
                    SwitchStatusCallback switchStatusCallbackA = a();
                    if (!c(str)) {
                        virtualDeviceE.switchMonitorStatus(2, key, str, switchStatusCallbackA);
                    }
                }
            }
        }
    }

    private SwitchStatusCallback a() {
        return new SwitchStatusCallback.Stub() { // from class: com.huawei.wearengine.core.device.MonitorCallbackManager$1
            @Override // com.huawei.wearengine.monitor.SwitchStatusCallback
            public void onResult(int i) {
                yit.a("MonitorCallbackManager", "getMonitorQueryCallback result:" + i);
            }
        };
    }
}
