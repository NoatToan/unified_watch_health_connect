package defpackage;

import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class phz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceDownloadSourceInfo f45406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45407c;
    private String d;
    private String e;
    private int f;
    private Map<String, String> g;
    private String h;
    private String i;
    private String j = "3";
    private pim k;
    private String m;
    private String n;
    private String o;

    public String i() {
        return (String) lst.d(this.j);
    }

    public void j(String str) {
        this.j = (String) lst.d(str);
    }

    public String k() {
        return (String) lst.d(this.o);
    }

    public void i(String str) {
        this.o = (String) lst.d(str);
    }

    public String a() {
        return (String) lst.d(this.m);
    }

    public void b(String str) {
        this.m = (String) lst.d(str);
    }

    public String g() {
        return (String) lst.d(this.n);
    }

    public void c(String str) {
        this.n = (String) lst.d(str);
    }

    public long d() {
        return ((Long) lst.d(Long.valueOf(this.f45405a))).longValue();
    }

    public void a(long j) {
        this.f45405a = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public String e() {
        return (String) lst.d(this.e);
    }

    public void e(String str) {
        this.e = (String) lst.d(str);
    }

    public String c() {
        return (String) lst.d(this.f45407c);
    }

    public void d(String str) {
        this.f45407c = (String) lst.d(str);
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f))).intValue();
    }

    public void c(int i) {
        this.f = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(String str) {
        this.d = (String) lst.d(str);
    }

    public pim h() {
        return (pim) lst.d(this.k);
    }

    public void d(pim pimVar) {
        this.k = (pim) lst.d(pimVar);
    }

    public String j() {
        return this.h;
    }

    public void h(String str) {
        this.h = str;
    }

    public String o() {
        return this.i;
    }

    public void f(String str) {
        this.i = str;
    }

    public Map<String, String> f() {
        return (Map) lst.d(this.g);
    }

    public void e(Map<String, String> map) {
        this.g = (Map) lst.d(map);
    }

    public void d(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        this.f45406b = (DeviceDownloadSourceInfo) lst.d(deviceDownloadSourceInfo);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PluginIndexFilePlugins{, uuid='");
        stringBuffer.append(this.m);
        stringBuffer.append("', version='");
        stringBuffer.append(this.n);
        stringBuffer.append("', digest='");
        stringBuffer.append(this.e);
        stringBuffer.append("', descUrl='");
        stringBuffer.append(this.d);
        stringBuffer.append("', protocol='");
        stringBuffer.append(this.h);
        stringBuffer.append("', supportMode='");
        stringBuffer.append(this.i);
        stringBuffer.append("', versionRule='");
        pim pimVar = this.k;
        if (pimVar != null) {
            stringBuffer.append(pimVar.toString());
        }
        stringBuffer.append(", downloadSource='");
        DeviceDownloadSourceInfo deviceDownloadSourceInfo = this.f45406b;
        if (deviceDownloadSourceInfo != null) {
            stringBuffer.append(deviceDownloadSourceInfo.toString());
        }
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }
}
