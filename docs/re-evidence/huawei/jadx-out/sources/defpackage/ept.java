package defpackage;

import com.huawei.devicesdk.entity.DeviceInfo;

/* JADX INFO: loaded from: classes7.dex */
public class ept extends efx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33328a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f33329c;

    public ept(String str, DeviceInfo deviceInfo, String str2) {
        this.f33328a = str;
        if (deviceInfo == null) {
            this.f33329c = new DeviceInfo();
        } else {
            this.f33329c = deviceInfo;
        }
        super.setProductId(str2);
    }

    public String d() {
        return this.f33328a;
    }

    public DeviceInfo b() {
        return this.f33329c;
    }
}
