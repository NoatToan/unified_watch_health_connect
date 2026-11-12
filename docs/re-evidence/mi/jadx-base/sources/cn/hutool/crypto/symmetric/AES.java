package cn.hutool.crypto.symmetric;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import defpackage.p8i;
import defpackage.tt3;
import defpackage.u0e;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class AES extends SymmetricCrypto {
    private static final long serialVersionUID = 1;

    public AES() {
        super(SymmetricAlgorithm.AES);
    }

    public AES(byte[] bArr) {
        super(SymmetricAlgorithm.AES, bArr);
    }

    public AES(SecretKey secretKey) {
        super(SymmetricAlgorithm.AES, secretKey);
    }

    public AES(Mode mode, Padding padding) {
        this(mode.name(), padding.name());
    }

    public AES(Mode mode, Padding padding, byte[] bArr) {
        this(mode, padding, bArr, (byte[]) null);
    }

    public AES(Mode mode, Padding padding, byte[] bArr, byte[] bArr2) {
        this(mode.name(), padding.name(), bArr, bArr2);
    }

    public AES(Mode mode, Padding padding, SecretKey secretKey) {
        this(mode, padding, secretKey, (IvParameterSpec) null);
    }

    public AES(Mode mode, Padding padding, SecretKey secretKey, byte[] bArr) {
        this(mode, padding, secretKey, p8i.c(bArr) ? null : new IvParameterSpec(bArr));
    }

    public AES(Mode mode, Padding padding, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        this(mode.name(), padding.name(), secretKey, ivParameterSpec);
    }

    public AES(String str, String str2) {
        this(str, str2, (byte[]) null);
    }

    public AES(String str, String str2, byte[] bArr) {
        this(str, str2, bArr, (byte[]) null);
    }

    public AES(String str, String str2, byte[] bArr, byte[] bArr2) {
        this(str, str2, u0e.f(SymmetricAlgorithm.AES.getValue(), bArr), p8i.c(bArr2) ? null : new IvParameterSpec(bArr2));
    }

    public AES(String str, String str2, SecretKey secretKey) {
        this(str, str2, secretKey, (IvParameterSpec) null);
    }

    public AES(String str, String str2, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        super(tt3.y("AES/{}/{}", str, str2), secretKey, ivParameterSpec);
    }
}
