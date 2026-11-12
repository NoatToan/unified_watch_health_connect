package defpackage;

import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import health.compact.a.CommonLibUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ebd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f32656c;
    private int d;
    private String e;
    private ScanFilter f;
    private int g;
    private byte[] h;
    private String i;
    private String j;
    private String k;
    private String n;

    public String f() {
        return this.k;
    }

    public String j() {
        return this.j;
    }

    public void e(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.f32655b = i;
    }

    public void h(String str) {
        this.n = str;
    }

    public byte[] i() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public void b(byte[] bArr) {
        if (bArr != null) {
            this.h = (byte[]) bArr.clone();
        }
    }

    public String d() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public byte[] e() {
        byte[] bArr = this.f32656c;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public void e(byte[] bArr) {
        if (bArr != null) {
            this.f32656c = (byte[]) bArr.clone();
        }
    }

    public int c() {
        return this.g;
    }

    public String a() {
        return this.i;
    }

    public ScanFilter g() {
        return this.f;
    }

    public void d(ScanFilter scanFilter) {
        this.f = scanFilter;
    }

    public void d(String str) {
        this.k = (String) dym.d(str);
    }

    public void c(String str) {
        this.j = (String) dym.d(str);
    }

    public void e(String str) {
        this.f32654a = (String) dym.d(str);
    }

    public void d(int i) {
        this.g = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public void b(String str) {
        this.i = (String) dym.d(str);
    }

    public String b() {
        return (String) dym.d(this.f32654a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("MulticastInfo{mSsid =");
        stringBuffer.append(this.k);
        stringBuffer.append("mPassword =").append(dyg.b(this.j));
        stringBuffer.append("mAppIpAddress =").append(dyg.b(String.valueOf(this.d)));
        stringBuffer.append("mAppPort =").append(this.f32655b);
        stringBuffer.append("mToken =").append(this.n);
        stringBuffer.append("mDeviceSn =").append(this.f32654a);
        stringBuffer.append("mHuaweiKeyIv =").append(CommonLibUtil.d(this.h));
        stringBuffer.append("mAesKey =").append(this.e);
        stringBuffer.append("mAesKeyIv =").append(CommonLibUtil.d(this.f32656c));
        stringBuffer.append("mEncryptMode =").append(this.g);
        stringBuffer.append("mDeviceSsid =").append(this.i);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
