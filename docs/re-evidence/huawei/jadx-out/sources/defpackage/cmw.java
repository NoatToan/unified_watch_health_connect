package defpackage;

import com.huawei.devicesdk.entity.SimpleDataHead;

/* JADX INFO: loaded from: classes4.dex */
public class cmw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f1805a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f1807c;
    private SimpleDataHead d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f1806b = new byte[0];
    private byte[] e = new byte[2];

    public SimpleDataHead a() {
        return this.d;
    }

    public void c(SimpleDataHead simpleDataHead) {
        this.d = simpleDataHead;
    }

    public void a(byte b2) {
        this.f1805a = b2;
    }

    public byte e() {
        return this.f1807c;
    }

    public void d(byte b2) {
        this.f1807c = b2;
    }

    public byte[] c() {
        return this.f1806b;
    }

    public void a(byte[] bArr) {
        this.f1806b = bArr;
    }

    public void b(byte[] bArr) {
        this.e = bArr;
    }
}
