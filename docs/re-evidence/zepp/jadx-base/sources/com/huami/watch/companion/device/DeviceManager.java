package com.huami.watch.companion.device;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.companion.config.Config;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceManager {
    private static final String e = "Device-Manager";
    private static final int f = 4;
    private static DeviceManager g;
    private Context a;
    private Device c;
    private final List<Device> b = new ArrayList();
    private Map<String, Boolean> d = new HashMap();

    public class a extends TypeToken<ArrayList<Device>> {
        public a() {
        }
    }

    public static class b implements Comparator<Device> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Device device, Device device2) {
            try {
                return device2.info().modelNumber().compareTo(device.info().modelNumber());
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    private DeviceManager(Context context) {
        this.a = context;
    }

    private void a(@NonNull Device device) {
        device.setConnected(true);
        save(device);
    }

    private void b(@NonNull Device device) {
        device.setConnected(false);
        save(device);
    }

    private void c() {
        String string = Box.getBox(this.a, e).getString("Devices");
        Log.json(e, "Load Devices : ", string);
        synchronized (this.b) {
            if (!TextUtils.isEmpty(string)) {
                this.b.addAll((ArrayList) new Gson().fromJson(string, new a().getType()));
                Log.d(e, "Load Devices : " + this.b.size() + ", " + this.b, new Object[0]);
                if (this.b.size() > 0) {
                    Collections.sort(this.b, new b(null));
                    for (Device device : this.b) {
                        device.setConnected(false);
                        device.setMcuMode(false);
                        if (device.isActive()) {
                            d(device);
                        }
                    }
                    if (this.c == null) {
                        Log.i(e, "There is NO active device Now!!", new Object[0]);
                    }
                }
            }
        }
    }

    private void d(Device device) {
        Log.d(e, "Update CurrentDevice : " + device + ", Prev : " + this.c, new Object[0]);
        this.c = device;
    }

    public static DeviceManager getManager(Context context) {
        if (g == null) {
            DeviceManager deviceManager = new DeviceManager(context.getApplicationContext());
            g = deviceManager;
            deviceManager.c();
        }
        return g;
    }

    public void active(@NonNull Device device) {
        device.setActive(true);
        save(device);
        d(device);
    }

    public void channelChanged(String str, boolean z) {
        this.d.put(str, Boolean.valueOf(z));
    }

    public void clear() {
        Log.d(e, "Clear All Devices!!", new Object[0]);
        synchronized (this.b) {
            d(null);
            this.b.clear();
            Box.getBox(this.a, e).clear();
        }
    }

    public void connected(String str) {
        Device deviceFind = find(str);
        if (deviceFind != null) {
            a(deviceFind);
        }
    }

    public void disconnected(String str) {
        Device deviceFind = find(str);
        if (deviceFind != null) {
            b(deviceFind);
        }
    }

    public Device find(String str) {
        Device next;
        synchronized (this.b) {
            Iterator<Device> it2 = this.b.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!next.address().equals(str));
        }
        Log.d(e, "Find Device : " + str + ", " + next, new Object[0]);
        return next;
    }

    public Device findByDeviceId(String str) {
        Device device = null;
        if (TextUtils.isEmpty(str)) {
            Log.w(e, "Find Device by DID : " + str + ", Ignore!!", new Object[0]);
            return null;
        }
        synchronized (this.b) {
            for (Device device2 : this.b) {
                if (!str.equals(DeviceUtil.UNKNOWN_DID) && !str.equals(device2.getCpuId())) {
                }
                device = device2;
            }
        }
        Log.d(e, "Find Device by DID : " + str + ", " + device, new Object[0]);
        return device;
    }

    public Device findByModel(String str) {
        Device device = null;
        if (TextUtils.isEmpty(str)) {
            Log.w(e, "Find Device by Model : " + str + ", Ignore!!", new Object[0]);
            return null;
        }
        synchronized (this.b) {
            for (Device device2 : this.b) {
                if (str.equals(device2.info().getHuamiModel())) {
                    device = device2;
                    break;
                }
            }
        }
        Log.d(e, "Find Device by model : " + str + ", " + device, new Object[0]);
        return device;
    }

    public Device findDeviceByDataSource(String str) {
        for (Device device : this.b) {
            if (DeviceSource.DATA_SOURCE_HUANGHE.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelHuanghe(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_EVEREST.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelEverest(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_EVEREST_S.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelEverestS(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_QOGIR.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelQogir(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_XIHU.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelXihu(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_XIHUE.equalsIgnoreCase(str)) {
                if (DeviceSource.isModelXihuE(device)) {
                    return device;
                }
            } else if (DeviceSource.DATA_SOURCE_XIHUEA.equalsIgnoreCase(str) && DeviceSource.isModelXihuEA(device)) {
                return device;
            }
        }
        return null;
    }

    public List<Device> getAll() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        Log.d(e, "All Devices : " + arrayList.size() + ", " + arrayList, new Object[0]);
        return arrayList;
    }

    public int getAllCount() {
        int size;
        synchronized (this.b) {
            size = this.b.size();
        }
        Log.d(e, "All Devices : " + this.b.size(), new Object[0]);
        return size;
    }

    public Device getCurrentDevice() {
        return this.c;
    }

    public boolean hasBoundDevice() {
        StringBuilder sb = new StringBuilder();
        sb.append("Has Bound Device : ");
        sb.append(this.c != null);
        Log.d(e, sb.toString(), new Object[0]);
        return this.c != null;
    }

    public void inactive(@NonNull Device device) {
        device.setActive(false);
        save(device);
        Device device2 = this.c;
        if (device2 == null || !device2.address().equals(device.address())) {
            return;
        }
        d(null);
    }

    public boolean isBindedEverest() {
        synchronized (this.b) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (DeviceSource.isModelEverest(this.b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean isBoundDeviceConnected() {
        Device device = this.c;
        boolean z = device != null;
        boolean z2 = z && device.isConnected();
        Log.d(e, "Has Bound Device : " + z + ", Is Connected : " + z2, new Object[0]);
        return z2;
    }

    public boolean isBoundDeviceExceed() {
        return getAllCount() >= 4 && !Config.isTestMode();
    }

    public boolean isChannelAvailable(String str) {
        Boolean bool = this.d.get(str);
        boolean z = bool != null && bool.booleanValue();
        Log.d(e, "IsChannelAvailable : " + str + ", Available : " + z, new Object[0]);
        return z;
    }

    public boolean isCurrentDeviceBLE() {
        Device device = this.c;
        return (device != null) && DeviceSource.isSeriesEverest2(device);
    }

    public void remove(String str) {
        Log.d(e, "Remove Device by [" + str + "]", new Object[0]);
        Device deviceFind = find(str);
        if (deviceFind != null) {
            remove(deviceFind);
        }
    }

    public void save(Device device) {
        save(device, false);
    }

    public void save(@NonNull Device device, boolean z) {
        Log.d(e, "Save Device [" + device + "], AddIfNotExist : " + z, new Object[0]);
        synchronized (this.b) {
            if (!this.b.contains(device)) {
                if (!z) {
                    Log.d(e, "Device not Exist, Abort!!", new Object[0]);
                    return;
                }
                Log.d(e, "Add New Device!!", new Object[0]);
                Device deviceFind = find(device.address());
                if (deviceFind != null) {
                    this.b.remove(deviceFind);
                }
                this.b.add(device);
            }
            Collections.sort(this.b, new b(null));
            String json = new Gson().toJson(this.b);
            Log.json(e, "Save Devices : " + this.b.size() + ", " + this.b, json);
            Box.getBox(this.a, e).put("Devices", json);
        }
    }

    public void remove(@NonNull Device device) {
        Log.d(e, "Remove Device [" + device + "]", new Object[0]);
        synchronized (this.b) {
            if (!this.b.contains(device)) {
                Log.d(e, "Device not Exist, Abort!!", new Object[0]);
                return;
            }
            this.b.remove(device);
            Collections.sort(this.b, new b(null));
            String json = new Gson().toJson(this.b);
            Log.json(e, "Save Devices : " + this.b.size() + ", " + this.b, json);
            Box.getBox(this.a, e).put("Devices", json);
            Device device2 = this.c;
            if (device2 == null || !device2.address().equals(device.address())) {
                return;
            }
            d(null);
        }
    }
}
