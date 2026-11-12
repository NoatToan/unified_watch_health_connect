package cn.com.smartdevices.bracelet.rom;

/* JADX INFO: loaded from: classes2.dex */
public class Manufacturer {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(int i) {
        this.a = i;
    }

    public String getManufacturer() {
        return this.e;
    }

    public String getPhoneBrand() {
        return this.b;
    }

    public String getPhoneDisplay() {
        return this.d;
    }

    public String getPhoneModel() {
        return this.c;
    }

    public int getVersionSDK() {
        return this.a;
    }

    public void setPhoneModel(String str) {
        this.c = str;
    }
}
