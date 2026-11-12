package defpackage;

import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class edx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32823c;
    private DeviceDownloadSourceInfo d;
    private long e;
    private String f;
    private Map<String, String> g;
    private String h;
    private String i = "3";
    private int j;
    private String k;
    private edw l;
    private String m;
    private String n;
    private String o;

    public String c() {
        return this.f;
    }

    public void h(String str) {
        this.f = str;
    }

    public String f() {
        return (String) lst.d(this.i);
    }

    public void f(String str) {
        this.i = (String) lst.d(str);
    }

    public String g() {
        return (String) lst.d(this.k);
    }

    public void g(String str) {
        this.k = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.n);
    }

    public void e(String str) {
        this.n = (String) lst.d(str);
    }

    public String e() {
        return (String) lst.d(this.m);
    }

    public void b(String str) {
        this.m = (String) lst.d(str);
    }

    public void a(long j) {
        this.e = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void d(String str) {
        this.f32821a = (String) lst.d(str);
    }

    public void a(String str) {
        this.f32822b = (String) lst.d(str);
    }

    public void e(int i) {
        this.j = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void c(String str) {
        this.f32823c = (String) lst.d(str);
    }

    public edw a() {
        return (edw) lst.d(this.l);
    }

    public void c(edw edwVar) {
        this.l = (edw) lst.d(edwVar);
    }

    public void i(String str) {
        this.h = str;
    }

    public void j(String str) {
        this.o = str;
    }

    public Map<String, String> h() {
        return (Map) lst.d(this.g);
    }

    public void a(Map<String, String> map) {
        this.g = (Map) lst.d(map);
    }

    public DeviceDownloadSourceInfo d() {
        return (DeviceDownloadSourceInfo) lst.d(this.d);
    }

    public void d(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        this.d = (DeviceDownloadSourceInfo) lst.d(deviceDownloadSourceInfo);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PluginIndexFilePlugins{, uuid='");
        stringBuffer.append(this.n);
        stringBuffer.append("', version='");
        stringBuffer.append(this.m);
        stringBuffer.append("', digest='");
        stringBuffer.append(this.f32821a);
        stringBuffer.append("', descUrl='");
        stringBuffer.append(this.f32823c);
        stringBuffer.append("', protocol='");
        stringBuffer.append(this.h);
        stringBuffer.append("', supportMode='");
        stringBuffer.append(this.o);
        stringBuffer.append("', versionRule='");
        stringBuffer.append(this.l.toString());
        stringBuffer.append(", downloadSource='");
        stringBuffer.append(this.d.toString());
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }
}
