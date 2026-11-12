package defpackage;

import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;

/* JADX INFO: loaded from: classes20.dex */
public class yno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f53672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f53673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SignAlg f53674c = SignAlg.UNKNOWN;

    public byte[] b() {
        return yoc.a(this.f53673b);
    }

    public void d(byte[] bArr) {
        this.f53673b = yoc.a(bArr);
    }

    public byte[] a() {
        return yoc.a(this.f53672a);
    }

    public void e(byte[] bArr) {
        this.f53672a = yoc.a(bArr);
    }

    public SignAlg c() {
        return this.f53674c;
    }

    public void c(SignAlg signAlg) {
        this.f53674c = signAlg;
    }
}
