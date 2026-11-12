package defpackage;

import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes46.dex */
public class yjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MonitorDataCallback f53516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53518c;
    private int d;
    private Device e;

    public yjn(int i, int i2, MonitorDataCallback monitorDataCallback, Device device, String str) {
        this.d = i;
        this.f53518c = i2;
        this.f53516a = monitorDataCallback;
        this.e = device;
        this.f53517b = str;
    }

    public int d() {
        return this.d;
    }

    public int c() {
        return this.f53518c;
    }

    public Device b() {
        return this.e;
    }

    public String a() {
        return this.f53517b;
    }

    public MonitorDataCallback e() {
        return this.f53516a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj instanceof yjn) {
            yjn yjnVar = (yjn) obj;
            return this.d == yjnVar.d && this.f53518c == yjnVar.f53518c;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.d), Integer.valueOf(this.f53518c));
    }
}
