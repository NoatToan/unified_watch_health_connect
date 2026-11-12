package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f42492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42494c;
    private String d;
    private long e;
    private List<mvj> g = new ArrayList(16);
    private int h;

    public void e(long j) {
        this.e = j;
    }

    public int d() {
        return this.f42494c;
    }

    public void a(int i) {
        this.f42494c = i;
    }

    public int e() {
        return this.f42493b;
    }

    public void c(int i) {
        this.f42493b = i;
    }

    public int c() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public List<mvj> b() {
        return this.g;
    }

    public DeviceInfo a() {
        return this.f42492a;
    }

    public void a(DeviceInfo deviceInfo) {
        this.f42492a = deviceInfo;
    }

    public String toString() {
        return "{mDictTypeId:" + this.f42494c + this.g + "}";
    }
}
