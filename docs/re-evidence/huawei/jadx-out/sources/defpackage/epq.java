package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.device.model.HealthDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class epq {
    private ArrayList<HealthDevice> e = new ArrayList<>(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<ept> f33323b = new ArrayList<>(10);

    public ArrayList<HealthDevice> a() {
        return this.e;
    }

    public void c(ArrayList<HealthDevice> arrayList) {
        this.e = arrayList;
    }

    public ArrayList<ept> e() {
        return this.f33323b;
    }

    public void d(ArrayList<ept> arrayList) {
        this.f33323b = arrayList;
    }

    public int c() {
        if (ete.d().b()) {
            ArrayList<ept> arrayList = this.f33323b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }
        ArrayList<HealthDevice> arrayList2 = this.e;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        return 0;
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList(10);
        if (ete.d().b()) {
            Iterator<ept> it = this.f33323b.iterator();
            while (it.hasNext()) {
                DeviceInfo deviceInfoB = it.next().b();
                if (deviceInfoB != null) {
                    arrayList.add(deviceInfoB.getDeviceMac());
                }
            }
        } else {
            for (HealthDevice healthDevice : this.e) {
                if (healthDevice != null) {
                    arrayList.add(healthDevice.getAddress());
                }
            }
        }
        return arrayList;
    }

    public String c(int i) {
        if (ete.d().b()) {
            return e(i).b().getDeviceMac();
        }
        String address = b(i).getAddress();
        return TextUtils.isEmpty(address) ? b(i).getUniqueId() : address;
    }

    public String d(int i) {
        if (ete.d().b()) {
            if (e(i).b() != null) {
                return e(i).b().getDeviceName();
            }
            return "empty_name";
        }
        return b(i).getDeviceName();
    }

    private ept e(int i) {
        ept eptVar;
        return (!njy.c(this.f33323b, i) || (eptVar = this.f33323b.get(i)) == null) ? new ept("empty_name", new DeviceInfo(), "") : eptVar;
    }

    private HealthDevice b(int i) {
        HealthDevice healthDevice;
        return (!njy.c(this.e, i) || (healthDevice = this.e.get(i)) == null) ? new HealthDevice() { // from class: epq.5
            @Override // com.huawei.health.device.model.HealthDevice
            public String getDeviceName() {
                return "empty_name";
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getAddress() {
                return "empty_mac";
            }

            @Override // com.huawei.health.device.model.HealthDevice
            public String getUniqueId() {
                return "empty_mac";
            }
        } : healthDevice;
    }
}
