package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class mec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41489a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41490c;
    private String d;

    public mec(String str, String str2, String str3) {
        this.d = str;
        this.f41489a = str2;
        this.f41490c = str3;
    }

    public String c() {
        return this.f41490c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f41489a;
    }

    public String toString() {
        return "DeviceModeInfo{mDeviceModel='" + this.d + ", mDeviceId='" + this.f41489a + ", mDeviceType='" + this.f41490c + '}';
    }
}
