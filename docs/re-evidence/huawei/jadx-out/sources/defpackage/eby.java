package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwcloudmodel.model.unite.DevInfo;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.ServiceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eby extends MeasurableDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f32715a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32716c;
    private String d;
    private List<c> e;

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
    }

    public eby() {
    }

    public eby(String str) {
        this.f32716c = str;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public String getProductId() {
        return this.f32716c;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void setProductId(String str) {
        this.f32716c = str;
    }

    public List<c> d() {
        return this.e;
    }

    public void a(List<c> list) {
        this.e = list;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        long jB;
        if (a() == null) {
            LogUtil.j("WiFiDevice", "doCreateBond device info is null");
            return false;
        }
        String str = a().l;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WiFiDevice", "doCreateBond serial number is null");
            return false;
        }
        eby ebyVarI = ecf.i(str);
        LogUtil.a("WiFiDevice", "deleteDevice check huawei device ", ebyVarI == null ? "is null" : "is not null");
        if (ebyVarI != null) {
            jB = ecf.c(this);
        } else {
            jB = ecf.b(this);
        }
        if (jB >= 0) {
            iDeviceEventHandler.onStateChanged(7);
            return true;
        }
        LogUtil.j("WiFiDevice", "doCreateBond Failed to save device information to WiFiBindDevice database");
        if (dmp.d().a(a().l, false) != null) {
            LogUtil.a("WiFiDevice", "doCreateBond delete device information in device database");
            drw.e().o(a().l);
        }
        iDeviceEventHandler.onStateChanged(8);
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        return ecf.c(getSerialNumber()) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(StringBuffer stringBuffer, String str, String str2, String str3) {
        if (str != null && str.length() < 512) {
            stringBuffer.append(str);
        }
        if (str2 != null && str2.length() < 512) {
            stringBuffer.append(str2);
        }
        if (str3 == null || str3.length() >= 512) {
            return;
        }
        stringBuffer.append(str3);
    }

    public void d(String str) {
        this.d = str;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32720c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private int n;
        private int o;

        public String c() {
            return this.f32720c;
        }

        public void c(String str) {
            this.f32720c = str;
        }

        public long d() {
            return this.f32719b;
        }

        public void a(long j) {
            this.f32719b = j;
        }

        public String l() {
            return this.l;
        }

        public void h(String str) {
            this.l = str;
        }

        public String f() {
            return this.f;
        }

        public void j(String str) {
            this.f = str;
        }

        public String a() {
            return this.f32718a;
        }

        public void d(String str) {
            this.f32718a = str;
        }

        public String j() {
            return this.h;
        }

        public void i(String str) {
            this.h = str;
        }

        public String h() {
            return this.i;
        }

        public void f(String str) {
            this.i = str;
        }

        public String e() {
            return this.d;
        }

        public void b(String str) {
            this.d = str;
        }

        public String g() {
            return this.j;
        }

        public void g(String str) {
            this.j = str;
        }

        public String b() {
            return this.e;
        }

        public void e(String str) {
            this.e = str;
        }

        public String i() {
            return this.g;
        }

        public void a(String str) {
            this.g = str;
        }

        public String k() {
            return this.k;
        }

        public void m(String str) {
            this.k = str;
        }

        public int o() {
            return this.n;
        }

        public void a(int i) {
            this.n = i;
        }

        public int m() {
            return this.o;
        }

        public void b(int i) {
            this.o = i;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(1024);
            stringBuffer.append("DeviceInfo{");
            eby.a(stringBuffer, "deviceId ='", dyg.b(this.f32720c), "'");
            eby.a(stringBuffer, ", sn ='", dyg.b(this.l), "'");
            eby.a(stringBuffer, ", model ='", this.f, "'");
            eby.a(stringBuffer, ", deviceType ='", this.f32718a, "'");
            eby.a(stringBuffer, ", manu ='", this.h, "'");
            eby.a(stringBuffer, ", proId ='", this.i, "'");
            eby.a(stringBuffer, ", hiv =", this.d, "'");
            eby.a(stringBuffer, ", mac =", this.j, "'");
            eby.a(stringBuffer, ", fwv =", this.e, "'");
            eby.a(stringBuffer, ", hwv =", this.g, "'");
            eby.a(stringBuffer, ", swv =", this.k, "'");
            stringBuffer.append(", protType =").append(this.n).append('\'');
            stringBuffer.append(", source =").append(this.o).append('\'');
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public boolean n() {
            return TextUtils.isEmpty(this.f32720c) || TextUtils.isEmpty(this.l) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.f32718a) || TextUtils.isEmpty(this.h) || TextUtils.isEmpty(this.d);
        }
    }

    public boolean g() {
        return TextUtils.isEmpty(this.f32716c) || this.f32715a.n();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32717a;
        private String d;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("ServiceInfo{sid ='");
            stringBuffer.append(this.f32717a).append("'st ='");
            stringBuffer.append(this.d);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        String deviceName = super.getDeviceName();
        if (!TextUtils.isEmpty(deviceName)) {
            return deviceName;
        }
        d dVar = this.f32715a;
        if (dVar != null && !TextUtils.isEmpty(dVar.f)) {
            return this.f32715a.f;
        }
        LogUtil.j("WiFiDevice", "can not get deviceName, return default");
        return "WiFiDevice";
    }

    public String e() {
        d dVar = this.f32715a;
        if (dVar != null) {
            return dVar.f32720c;
        }
        LogUtil.j("WiFiDevice", "getDeviceId mDeviceInfo is null");
        return "";
    }

    public long b() {
        d dVar = this.f32715a;
        if (dVar != null) {
            return dVar.f32719b;
        }
        LogUtil.j("WiFiDevice", "getDeviceCode mDeviceInfo is null");
        return 0L;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        d dVar = this.f32715a;
        if (dVar != null) {
            return dVar.j;
        }
        LogUtil.j("WiFiDevice", "getAddress mDeviceInfo is null");
        return "";
    }

    public String c() {
        return this.d;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        d dVar = this.f32715a;
        if (dVar != null) {
            return dVar.f32720c;
        }
        LogUtil.j("WiFiDevice", "getUniqueId mDeviceInfo is null");
        return "";
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public String getSerialNumber() {
        d dVar = this.f32715a;
        if (dVar != null && !TextUtils.isEmpty(dVar.l)) {
            return this.f32715a.l;
        }
        LogUtil.j("WiFiDevice", "can not get SerialNumber from mDeviceInfo");
        return super.getSerialNumber();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(512);
        stringBuffer.append("WiFiDevice{");
        a(stringBuffer, "mProductId ='", this.f32716c, "'");
        a(stringBuffer, ", mDeviceInfo ='", this.f32715a.toString(), "'");
        a(stringBuffer, "uniqueId ='", getUniqueId(), "'");
        a(stringBuffer, "sn ='", getSerialNumber(), null);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public d a() {
        return this.f32715a;
    }

    public void a(d dVar) {
        this.f32715a = dVar;
    }

    public void c(DeviceDetailInfo deviceDetailInfo) {
        d dVar;
        if (deviceDetailInfo != null && (dVar = this.f32715a) != null) {
            dVar.f32720c = deviceDetailInfo.getDevId();
            if (deviceDetailInfo.getDeviceCode() != null) {
                this.f32715a.f32719b = deviceDetailInfo.getDeviceCode().longValue();
            }
            DevInfo devInfo = deviceDetailInfo.getDevInfo();
            if (devInfo != null) {
                this.f32715a.l = devInfo.getSn();
                this.f32715a.f = devInfo.getModel();
                this.f32715a.f32718a = devInfo.getDevType();
                this.f32715a.h = devInfo.getManu();
                this.f32715a.i = devInfo.getProdId();
                this.f32715a.d = devInfo.getHiv();
                this.f32715a.j = devInfo.getMac();
                this.f32715a.e = devInfo.getFwv();
                this.f32715a.g = devInfo.getHwv();
                this.f32715a.k = devInfo.getSwv();
                this.f32715a.n = devInfo.getProtType();
            }
            List<ServiceInfo> services = deviceDetailInfo.getServices();
            if (services == null || services.size() <= 0) {
                return;
            }
            this.e = new ArrayList(16);
            for (ServiceInfo serviceInfo : services) {
                c cVar = new c();
                cVar.f32717a = serviceInfo.sid;
                cVar.d = serviceInfo.st;
                this.e.add(cVar);
            }
            return;
        }
        LogUtil.j("WiFiDevice", "setDeviceInfo device or mDeviceInfo is null");
    }
}
