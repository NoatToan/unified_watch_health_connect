package defpackage;

import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;

/* JADX INFO: loaded from: classes26.dex */
class dky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private edl f31927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceDownloadSourceInfo f31929c;
    private String d;
    private String e;
    private String j;

    public dky() {
    }

    public dky(String str, String str2, String str3, edl edlVar) {
        this.d = str;
        this.j = str2;
        this.f31928b = str3;
        this.f31927a = edlVar;
    }

    public String d() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public String b() {
        return this.d;
    }

    public String g() {
        return this.j;
    }

    public edl e() {
        return this.f31927a;
    }

    public String a() {
        return this.f31928b;
    }

    public DeviceDownloadSourceInfo c() {
        return this.f31929c;
    }

    public void a(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        this.f31929c = deviceDownloadSourceInfo;
    }
}
