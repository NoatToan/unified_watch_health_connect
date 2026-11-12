package defpackage;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import net.lingala.zip4j.crypto.PBKDF2.PRF;

/* JADX INFO: loaded from: classes20.dex */
public class zol implements PRF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Mac f54392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteArrayOutputStream f54393c = new ByteArrayOutputStream(4096);
    private int d;

    public zol(String str) {
        this.f54391a = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.f54392b = mac;
            this.d = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public byte[] doFinal(byte[] bArr) {
        if (this.f54393c.size() > 0) {
            d(0);
        }
        return this.f54392b.doFinal(bArr);
    }

    public byte[] d() {
        return c(0);
    }

    public byte[] c(int i) {
        if (this.f54393c.size() > 0) {
            d(i);
        }
        return this.f54392b.doFinal();
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public int getHLen() {
        return this.d;
    }

    @Override // net.lingala.zip4j.crypto.PBKDF2.PRF
    public void init(byte[] bArr) {
        try {
            this.f54392b.init(new SecretKeySpec(bArr, this.f54391a));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public void b(byte[] bArr, int i, int i2) {
        try {
            if (this.f54393c.size() + i2 > 4096) {
                d(0);
            }
            this.f54393c.write(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }

    private void d(int i) {
        byte[] byteArray = this.f54393c.toByteArray();
        int length = byteArray.length - i;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 16;
            this.f54392b.update(byteArray, i2, i3 <= length ? 16 : length - i2);
            i2 = i3;
        }
        this.f54393c.reset();
    }
}
