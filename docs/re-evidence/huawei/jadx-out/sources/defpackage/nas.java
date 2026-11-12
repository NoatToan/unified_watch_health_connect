package defpackage;

/* JADX INFO: loaded from: classes11.dex */
class nas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42838b;
    private String e;

    public nas(String str, String str2, String str3) {
        this.f42838b = str;
        this.e = str2;
        this.f42837a = str3;
    }

    public String c() {
        return this.f42837a;
    }

    public String b() {
        return this.f42838b;
    }

    public String a() {
        return this.e;
    }

    public String toString() {
        return "DeviceModeInfo{mDeviceModel='" + this.f42838b + ", mDeviceId='" + this.e + ", mDeviceType='" + this.f42837a + '}';
    }
}
