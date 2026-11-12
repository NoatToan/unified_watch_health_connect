package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class pve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45896c;
    private byte[] d;
    private String e;

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public int a() {
        return this.f45895b;
    }

    public void c(int i) {
        this.f45895b = i;
    }

    public String b() {
        return this.f45896c;
    }

    public void d(String str) {
        this.f45896c = str;
    }

    public byte[] d() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void c(byte[] bArr) {
        if (bArr != null) {
            this.d = (byte[]) bArr.clone();
        } else {
            this.d = null;
        }
    }

    public String toString() {
        return "CommonDataType{key='" + this.e + "', type=" + this.f45895b + ", value='" + this.f45896c + "', iconBytes=" + Arrays.toString(this.d) + ", iconType='" + this.f45894a + "'}";
    }
}
