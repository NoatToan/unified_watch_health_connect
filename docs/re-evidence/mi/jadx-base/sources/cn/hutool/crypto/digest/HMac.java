package cn.hutool.crypto.digest;

import defpackage.au3;
import defpackage.cid;
import defpackage.cze;
import defpackage.dze;
import defpackage.jm9;
import defpackage.m7c;
import defpackage.o12;
import defpackage.tt3;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class HMac implements Serializable {
    private static final long serialVersionUID = 1;
    private final cze engine;

    public HMac(HmacAlgorithm hmacAlgorithm) {
        this(hmacAlgorithm, (Key) null);
    }

    public byte[] digest(String str, Charset charset) {
        return digest(tt3.g(str, charset));
    }

    public String digestBase64(String str, boolean z) {
        return digestBase64(str, au3.f3449b, z);
    }

    public String digestHex(String str, Charset charset) {
        return m7c.e(digest(str, charset));
    }

    public String getAlgorithm() {
        return this.engine.getAlgorithm();
    }

    public cze getEngine() {
        return this.engine;
    }

    public int getMacLength() {
        return this.engine.b();
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    public HMac(HmacAlgorithm hmacAlgorithm, byte[] bArr) {
        this(hmacAlgorithm.getValue(), bArr);
    }

    public byte[] digest(String str) {
        return digest(str, au3.f3449b);
    }

    public String digestBase64(String str, Charset charset, boolean z) {
        return o12.c(digest(str, charset), false, z);
    }

    public String digestHex(String str) {
        return digestHex(str, au3.f3449b);
    }

    public HMac(HmacAlgorithm hmacAlgorithm, Key key) {
        this(hmacAlgorithm.getValue(), key);
    }

    public byte[] digest(File file) throws Throwable {
        BufferedInputStream bufferedInputStreamS;
        try {
            bufferedInputStreamS = jm9.s(file);
            try {
                byte[] bArrDigest = digest(bufferedInputStreamS);
                cid.a(bufferedInputStreamS);
                return bArrDigest;
            } catch (Throwable th) {
                th = th;
                cid.a(bufferedInputStreamS);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStreamS = null;
        }
    }

    public String digestHex(File file) {
        return m7c.e(digest(file));
    }

    public HMac(String str, byte[] bArr) {
        this(str, new SecretKeySpec(bArr, str));
    }

    public String digestHex(byte[] bArr) {
        return m7c.e(digest(bArr));
    }

    public HMac(String str, Key key) {
        this(dze.a(str, key));
    }

    public String digestHex(InputStream inputStream) {
        return m7c.e(digest(inputStream));
    }

    public HMac(cze czeVar) {
        this.engine = czeVar;
    }

    public String digestHex(InputStream inputStream, int i) {
        return m7c.e(digest(inputStream, i));
    }

    public byte[] digest(byte[] bArr) {
        return digest(new ByteArrayInputStream(bArr), -1);
    }

    public byte[] digest(InputStream inputStream) {
        return digest(inputStream, 8192);
    }

    public byte[] digest(InputStream inputStream, int i) {
        return this.engine.c(inputStream, i);
    }
}
