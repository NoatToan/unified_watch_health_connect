package defpackage;

import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;

/* JADX INFO: loaded from: classes3.dex */
public class phy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pic f45403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceDownloadSourceInfo f45404c;
    private String d;
    private String e;
    private String i;

    public phy() {
    }

    public phy(String str, String str2, String str3, pic picVar) {
        this.e = str;
        this.i = str2;
        this.d = str3;
        this.f45403b = picVar;
    }

    public String d() {
        return this.f45402a;
    }

    public void d(String str) {
        this.f45402a = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public String b() {
        return this.e;
    }

    public String j() {
        return this.i;
    }

    public pic c() {
        return this.f45403b;
    }

    public String a() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public DeviceDownloadSourceInfo e() {
        return this.f45404c;
    }

    public void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        this.f45404c = deviceDownloadSourceInfo;
    }
}
