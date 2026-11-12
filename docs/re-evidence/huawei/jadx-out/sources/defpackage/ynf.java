package defpackage;

import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;

/* JADX INFO: loaded from: classes20.dex */
public class ynf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f53652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CipherAlg f53653c = CipherAlg.UNKNOWN;
    private byte[] d;

    public byte[] a() {
        return yoc.a(this.d);
    }

    public void d(byte[] bArr) {
        this.d = yoc.a(bArr);
    }

    public byte[] b() {
        return yoc.a(this.f53652b);
    }

    public void a(byte[] bArr) {
        this.f53652b = yoc.a(bArr);
    }

    public CipherAlg c() {
        return this.f53653c;
    }

    public void d(CipherAlg cipherAlg) {
        this.f53653c = cipherAlg;
    }
}
