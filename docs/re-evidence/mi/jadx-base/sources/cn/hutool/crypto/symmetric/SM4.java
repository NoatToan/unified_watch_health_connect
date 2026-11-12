package cn.hutool.crypto.symmetric;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import defpackage.fql;
import defpackage.p8i;
import defpackage.tt3;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class SM4 extends SymmetricCrypto {
    public static final String ALGORITHM_NAME = "SM4";
    private static final long serialVersionUID = 1;

    public SM4() {
        super(ALGORITHM_NAME);
    }

    public SM4(byte[] bArr) {
        super(ALGORITHM_NAME, bArr);
    }

    public SM4(Mode mode, Padding padding) {
        this(mode.name(), padding.name());
    }

    public SM4(Mode mode, Padding padding, byte[] bArr) {
        this(mode, padding, bArr, (byte[]) null);
    }

    public SM4(Mode mode, Padding padding, byte[] bArr, byte[] bArr2) {
        this(mode.name(), padding.name(), bArr, bArr2);
    }

    public SM4(Mode mode, Padding padding, SecretKey secretKey) {
        this(mode, padding, secretKey, (IvParameterSpec) null);
    }

    public SM4(Mode mode, Padding padding, SecretKey secretKey, byte[] bArr) {
        this(mode, padding, secretKey, p8i.c(bArr) ? null : new IvParameterSpec(bArr));
    }

    public SM4(Mode mode, Padding padding, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        this(mode.name(), padding.name(), secretKey, ivParameterSpec);
    }

    public SM4(String str, String str2) {
        this(str, str2, (byte[]) null);
    }

    public SM4(String str, String str2, byte[] bArr) {
        this(str, str2, bArr, (byte[]) null);
    }

    public SM4(String str, String str2, byte[] bArr, byte[] bArr2) {
        this(str, str2, fql.f(ALGORITHM_NAME, bArr), p8i.c(bArr2) ? null : new IvParameterSpec(bArr2));
    }

    public SM4(String str, String str2, SecretKey secretKey) {
        this(str, str2, secretKey, (IvParameterSpec) null);
    }

    public SM4(String str, String str2, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        super(tt3.y("SM4/{}/{}", str, str2), secretKey, ivParameterSpec);
    }
}
