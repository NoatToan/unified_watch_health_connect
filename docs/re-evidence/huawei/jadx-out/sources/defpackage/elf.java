package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public class elf implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33121c;
    private String d;
    private String e;
    private int h;
    private String j;

    public void d(int i) {
        this.h = i;
    }

    public void g(String str) {
        this.j = str;
    }

    public void c(String str) {
        this.f33119a = str;
    }

    public void d(String str) {
        this.f33120b = str;
    }

    public void e(String str) {
        this.f33121c = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public String toString() {
        return "NemoDeviceInfo{deviceType=" + this.h + ", deviceVersion='" + this.j + "', deviceSoftVersion='" + this.f33119a + "', deviceSn='" + this.f33120b + "', deviceModel='" + this.f33121c + "', deviceOtaPackageName='" + this.d + "', deviceSubModelId='" + this.e + "'}";
    }
}
