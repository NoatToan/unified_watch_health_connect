package defpackage;

import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lwv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40994c;
    private int d;
    private int e;
    private String f;
    private int h;
    private long i;

    public void a(long j) {
        this.i = j;
    }

    public void c(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.f40992a = str;
    }

    public void a(String str) {
        this.f40993b = str;
    }

    public void a(int i) {
        this.f40994c = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.d = i;
    }

    public String toString() {
        return "EventInfo{ts=" + this.i + ", tokenType=" + this.h + ", token='" + this.f + "', appId='" + this.f40992a + "', deviceId='" + BTDeviceMgrUtil.c().e(this.f40993b) + "', siteId='" + this.f40994c + "', iversion='" + this.e + "', source='" + this.d + "'}";
    }
}
