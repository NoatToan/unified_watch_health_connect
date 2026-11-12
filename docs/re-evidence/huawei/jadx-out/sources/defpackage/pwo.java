package defpackage;

import android.os.Build;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;

/* JADX INFO: loaded from: classes15.dex */
public class pwo extends AbsPrimaryDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45911a;
    private String d;
    private String e;

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public int getPrimaryIDType() {
        return 0;
    }

    public void b(String str) {
        this.d = (String) lst.d(str);
    }

    public String d() {
        return (String) lst.d(this.d);
    }

    public String c() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public String e() {
        return this.f45911a;
    }

    public void c(String str) {
        this.f45911a = str;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getPrimaryID() {
        return d();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getTerminalId() {
        return c();
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getTerminalVendor() {
        return Build.MANUFACTURER;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getTerminalModel() {
        return Build.MODEL;
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getTerminalSwVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice
    public String getCompanionTerminalService() {
        return e();
    }
}
