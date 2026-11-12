package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lrx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mIcon")
    private byte[] f40746c;
    private String d;

    @SerializedName("mICCID")
    private String e;
    private String g;

    @SerializedName("mProfieName")
    private String h;

    @SerializedName("mSPN")
    private String i;
    private byte[] j;

    public String a() {
        return (String) lst.d(this.e);
    }

    public void d(String str) {
        this.e = (String) lst.d(str);
    }

    public String d() {
        return (String) lst.d(this.i);
    }

    public void h(String str) {
        this.i = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.h);
    }

    public void e(String str) {
        this.h = (String) lst.d(str);
    }

    public void b(String str) {
        this.d = (String) lst.d(str);
    }

    public void d(int i) {
        this.f40744a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public byte[] c() {
        byte[] bArr = this.f40746c;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public void e(byte[] bArr) {
        if (bArr == null) {
            this.f40746c = null;
        } else {
            this.f40746c = (byte[]) bArr.clone();
        }
    }

    public void a(String str) {
        this.f40745b = (String) lst.d(str);
    }

    public void c(String str) {
        this.g = (String) lst.d(str);
    }

    public byte[] e() {
        return (byte[]) lst.d(this.j);
    }

    public void b(byte[] bArr) {
        this.j = (byte[]) lst.d(bArr);
    }

    public String toString() {
        return "EmbeddedSimProfile{mIccid='" + this.e + "', mSpn='" + this.i + "', mProfileName='" + this.h + "', mProfileClass='" + this.d + "', mIconType='" + this.f40744a + "', mConfigurationInfo='" + this.f40745b + "', mProfileOwner='" + this.g + "'}";
    }
}
