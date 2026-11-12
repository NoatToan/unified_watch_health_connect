package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class mfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41610c;
    private byte[] d;
    private String e;
    private int h;
    private int j;

    public String a() {
        return this.e;
    }

    public int i() {
        return this.h;
    }

    public long e() {
        return this.f41610c;
    }

    public int h() {
        return this.j;
    }

    public String c() {
        return this.f41608a;
    }

    public String d() {
        return this.f41609b;
    }

    public byte[] b() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return new byte[0];
    }

    public void d(String str) {
        this.e = str;
    }

    public void c(int i) {
        this.h = i;
    }

    public void c(long j) {
        this.f41610c = j;
    }

    public void b(int i) {
        this.j = i;
    }

    public void e(String str) {
        this.f41608a = str;
    }

    public void c(String str) {
        this.f41609b = str;
    }

    public void e(byte[] bArr) {
        if (bArr != null) {
            this.d = (byte[]) bArr.clone();
        }
    }

    public String toString() {
        return "FaqMessageInfo{mMessageId='" + this.e + "', mMessageType=" + this.h + ", mMessageExpireTime=" + this.f41610c + ", mMotorEnable=" + this.j + ", mMessageTitle='" + this.f41608a + "', mMessageContext='" + this.f41609b + "', mMessageIcon=" + Arrays.toString(this.d) + '}';
    }
}
