package cn.hutool.crypto.digest;

import defpackage.ew6;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class MD5 extends Digester {
    private static final long serialVersionUID = 1;

    public MD5() {
        super(DigestAlgorithm.MD5);
    }

    public static MD5 create() {
        return new MD5();
    }

    public String digestHex16(String str, Charset charset) {
        return ew6.a(digestHex(str, charset));
    }

    public MD5(byte[] bArr) {
        this(bArr, 0, 1);
    }

    public String digestHex16(String str) {
        return ew6.a(digestHex(str));
    }

    public MD5(byte[] bArr, int i) {
        this(bArr, 0, i);
    }

    public String digestHex16(InputStream inputStream) {
        return ew6.a(digestHex(inputStream));
    }

    public MD5(byte[] bArr, int i, int i2) {
        this();
        this.salt = bArr;
        this.saltPosition = i;
        this.digestCount = i2;
    }

    public String digestHex16(File file) {
        return ew6.a(digestHex(file));
    }

    public String digestHex16(byte[] bArr) {
        return ew6.a(digestHex(bArr));
    }
}
