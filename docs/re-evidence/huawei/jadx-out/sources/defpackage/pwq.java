package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;

/* JADX INFO: loaded from: classes15.dex */
public class pwq extends AbsPairedDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45917c;
    private String d;
    private String e;
    private int f;
    private String j;

    public void d(int i) {
        this.f = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int j() {
        return ((Integer) lst.d(Integer.valueOf(this.f))).intValue();
    }

    public void e(String str) {
        this.d = (String) lst.d(str);
    }

    public String e() {
        return (String) lst.d(this.d);
    }

    public String h() {
        return (String) lst.d(this.j);
    }

    public void d(String str) {
        this.e = str;
    }

    public String a() {
        return this.e;
    }

    public void a(String str) {
        this.f45917c = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.f45917c);
    }

    public String d() {
        return (String) lst.d(this.f45916b);
    }

    public void c(String str) {
        this.f45916b = (String) lst.d(str);
    }

    public String c() {
        return (String) lst.d(this.f45915a);
    }

    public void b(String str) {
        this.f45915a = (String) lst.d(str);
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public int getPairedIDType() {
        return j();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getPairedID() {
        return a();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getPairedDeviceName() {
        return b();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalId() {
        return e();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalVendor() {
        return "";
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalModel() {
        return d();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalSwVersion() {
        return c();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalMsisdn() {
        return h();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalIccid() {
        return "";
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public String getTerminalEid() {
        return a();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public boolean getEuiccPairing() {
        LogUtil.a("MultiSimPairedDevice", "euiccPairing is true");
        return true;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public boolean getLiveIdSupported() {
        LogUtil.a("MultiSimPairedDevice", "liveIdSupported is true");
        return true;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice
    public obn getSecondaryDeviceId() {
        obn obnVar = new obn();
        obnVar.b(e());
        return obnVar;
    }

    public String toString() {
        return "deviceinfo type=" + this.f + ",name=" + this.f45917c;
    }
}
