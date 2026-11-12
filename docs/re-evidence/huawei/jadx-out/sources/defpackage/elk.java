package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class elk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDevice.HealthDeviceKind f33136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<elj> f33137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<elj> f33138c;
    private String e;

    public elk(HealthDevice.HealthDeviceKind healthDeviceKind, String str, String str2) {
        this.f33136a = healthDeviceKind;
        this.e = str;
        LogUtil.d("ProductGroup", "icon=", str2);
        this.f33137b = new ArrayList<>();
        this.f33138c = new ArrayList<>();
    }

    public HealthDevice.HealthDeviceKind e() {
        return (HealthDevice.HealthDeviceKind) dym.d(this.f33136a);
    }

    public String c() {
        return (String) dym.d(this.e);
    }

    public ArrayList<elj> b() {
        return this.f33137b;
    }

    public void e(elj eljVar) {
        this.f33137b.add(eljVar);
    }

    public ArrayList<elj> a() {
        return this.f33138c;
    }

    public void c(elj eljVar) {
        this.f33138c.add(eljVar);
    }
}
