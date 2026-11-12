package defpackage;

import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47081c;
    private String d;
    private int e;
    private String f;
    private String g;
    private Map<String, String> h;
    private DeviceDownloadSourceInfo i;
    private Map<String, edt> j;
    private String k;
    private int m;
    private List<String> o;

    public int n() {
        return this.m;
    }

    public void e(int i) {
        this.m = i;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public String i() {
        return this.f;
    }

    public void d(String str) {
        this.f = str;
    }

    public List<String> l() {
        return this.o;
    }

    public void a(List<String> list) {
        this.o = list;
    }

    public String j() {
        return this.g;
    }

    public Map<String, edt> h() {
        return this.j;
    }

    public void c(Map<String, edt> map) {
        this.j = map;
    }

    public void a(String str) {
        this.g = str;
    }

    public String d() {
        return this.f47080b;
    }

    public void b(String str) {
        this.f47080b = str;
    }

    public Map<String, String> f() {
        return this.h;
    }

    public void b(Map<String, String> map) {
        this.h = map;
    }

    public int a() {
        return this.f47081c;
    }

    public void d(int i) {
        this.f47081c = i;
    }

    public int b() {
        return this.f47079a;
    }

    public void b(int i) {
        this.f47079a = i;
    }

    public String m() {
        return this.k;
    }

    public void e(String str) {
        this.k = str;
    }

    public DeviceDownloadSourceInfo g() {
        return this.i;
    }

    public void a(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        this.i = deviceDownloadSourceInfo;
    }

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof rbe) || (str = this.d) == null) {
            return false;
        }
        return str.equals(((rbe) obj).c());
    }

    public int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }
}
