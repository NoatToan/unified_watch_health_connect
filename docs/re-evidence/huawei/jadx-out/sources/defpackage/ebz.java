package defpackage;

import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ebz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f32721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f32722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32723c;
    private String d;
    private Integer e;
    private Long f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;

    public String i() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public String h() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public String e() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String g() {
        return this.k;
    }

    public void i(String str) {
        this.k = str;
    }

    public String b() {
        return this.g;
    }

    public void e(String str) {
        this.g = str;
    }

    public String f() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public Long j() {
        return this.f;
    }

    public void c(Long l) {
        this.f = l;
    }

    public int a() {
        return this.f32723c;
    }

    public void b(int i) {
        this.f32723c = i;
    }

    public Integer c() {
        return this.e;
    }

    public void b(Integer num) {
        this.e = num;
    }

    public Integer d() {
        return this.f32721a;
    }

    public void c(Integer num) {
        this.f32721a = num;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("VerifyCode2CoapSessionInfo{snAppRandom ='");
        String str = this.j;
        Object obj = Constants.NULL;
        if (str == null) {
            str = Constants.NULL;
        }
        stringBuffer.append(str).append("', snDeviceRandom ='");
        String str2 = this.h;
        if (str2 == null) {
            str2 = Constants.NULL;
        }
        stringBuffer.append(str2).append("', deviceId ='");
        String str3 = this.d;
        if (str3 == null) {
            str3 = Constants.NULL;
        }
        stringBuffer.append(str3).append("', verifyCode ='");
        String str4 = this.k;
        if (str4 == null) {
            str4 = Constants.NULL;
        }
        stringBuffer.append(str4).append("', psk ='");
        String str5 = this.g;
        if (str5 == null) {
            str5 = Constants.NULL;
        }
        stringBuffer.append(str5).append("', modeSupport ='");
        Object obj2 = this.f32722b;
        if (obj2 == null) {
            obj2 = Constants.NULL;
        }
        stringBuffer.append(obj2).append("', sessId ='");
        String str6 = this.i;
        if (str6 == null) {
            str6 = Constants.NULL;
        }
        stringBuffer.append(str6).append("', seq ='");
        Long l = this.f;
        if (l != null) {
            obj = l;
        }
        stringBuffer.append(obj).append("', optSeq =");
        stringBuffer.append(this.f32723c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
