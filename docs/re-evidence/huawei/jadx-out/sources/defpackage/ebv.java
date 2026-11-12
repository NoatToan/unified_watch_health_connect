package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class ebv implements Serializable {
    private static final long serialVersionUID = -6977434421058883312L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32705c;
    private String d;
    private String e;
    private String g = "unknown";
    private String h;
    private String i;
    private String j;

    public ebv() {
    }

    public ebv(String str, String str2, int i) {
        this.j = str;
        this.e = str2;
        this.f32703a = i;
    }

    public String j() {
        return (String) dym.d(this.h);
    }

    public void b(String str) {
        this.h = (String) dym.d(str);
    }

    public String i() {
        return (String) dym.d(this.j);
    }

    public void h(String str) {
        this.j = (String) dym.d(str);
    }

    public String f() {
        return (String) dym.d(this.i);
    }

    public void j(String str) {
        this.i = (String) dym.d(str);
    }

    public String d() {
        return (String) dym.d(this.e);
    }

    public void d(String str) {
        this.e = (String) dym.d(str);
    }

    public String e() {
        return (String) dym.d(this.f32704b);
    }

    public void c(String str) {
        this.f32704b = (String) dym.d(str);
    }

    public String a() {
        return (String) dym.d(this.d);
    }

    public void e(String str) {
        this.d = (String) dym.d(str);
    }

    public String c() {
        return (String) dym.d(this.f32705c);
    }

    public void a(String str) {
        this.f32705c = (String) dym.d(str);
    }

    public String h() {
        return (String) dym.d(this.g);
    }

    public void i(String str) {
        this.g = (String) dym.d(str);
    }

    public int b() {
        return ((Integer) dym.d(Integer.valueOf(this.f32703a))).intValue();
    }

    public void c(int i) {
        this.f32703a = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebv)) {
            return false;
        }
        ebv ebvVar = (ebv) obj;
        return (d(ebvVar) || c(ebvVar) || b(ebvVar) || e(ebvVar) || a(ebvVar)) ? false : true;
    }

    private boolean d(ebv ebvVar) {
        if (i() != null) {
            return !i().equals(ebvVar.i());
        }
        return ebvVar.i() != null;
    }

    private boolean c(ebv ebvVar) {
        if (f() != null) {
            return !f().equals(ebvVar.f());
        }
        return ebvVar.f() != null;
    }

    private boolean b(ebv ebvVar) {
        if (e() != null) {
            return !e().equals(ebvVar.e());
        }
        return ebvVar.e() != null;
    }

    private boolean e(ebv ebvVar) {
        if (d() != null) {
            return !d().equals(ebvVar.d());
        }
        return ebvVar.d() != null;
    }

    private boolean a(ebv ebvVar) {
        if (h() != null) {
            return !h().equals(ebvVar.h());
        }
        return ebvVar.h() != null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AddDeviceInfo{ssid ='");
        stringBuffer.append(dyg.b(this.j)).append("', productId ='");
        stringBuffer.append(dyg.b(this.i)).append("', deviceSn ='");
        stringBuffer.append(dyg.b(this.e)).append("', deviceId ='");
        stringBuffer.append(dyg.b(this.f32704b)).append("', mac ='");
        stringBuffer.append(dyg.b(this.d)).append("', baseUrl ='");
        stringBuffer.append(this.f32705c).append("', sourceType ='");
        stringBuffer.append(this.g).append("', encryptMode =");
        stringBuffer.append(this.f32703a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public int hashCode() {
        int iHashCode = i() != null ? i().hashCode() : 0;
        int iHashCode2 = f() != null ? f().hashCode() : 0;
        int iHashCode3 = e() != null ? e().hashCode() : 0;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0);
    }
}
