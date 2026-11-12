package cn.hutool.crypto.symmetric;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import defpackage.fql;
import defpackage.tt3;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class DES extends SymmetricCrypto {
    private static final long serialVersionUID = 1;

    public DES() {
        super(SymmetricAlgorithm.DES);
    }

    public DES(byte[] bArr) {
        super(SymmetricAlgorithm.DES, bArr);
    }

    public DES(Mode mode, Padding padding) {
        this(mode.name(), padding.name());
    }

    public DES(Mode mode, Padding padding, byte[] bArr) {
        this(mode, padding, bArr, (byte[]) null);
    }

    public DES(Mode mode, Padding padding, byte[] bArr, byte[] bArr2) {
        this(mode.name(), padding.name(), bArr, bArr2);
    }

    public DES(Mode mode, Padding padding, SecretKey secretKey) {
        this(mode, padding, secretKey, (IvParameterSpec) null);
    }

    public DES(Mode mode, Padding padding, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        this(mode.name(), padding.name(), secretKey, ivParameterSpec);
    }

    public DES(String str, String str2) {
        this(str, str2, (byte[]) null);
    }

    public DES(String str, String str2, byte[] bArr) {
        this(str, str2, fql.f("DES", bArr), (IvParameterSpec) null);
    }

    public DES(String str, String str2, byte[] bArr, byte[] bArr2) {
        this(str, str2, fql.f("DES", bArr), bArr2 == null ? null : new IvParameterSpec(bArr2));
    }

    public DES(String str, String str2, SecretKey secretKey) {
        this(str, str2, secretKey, (IvParameterSpec) null);
    }

    public DES(String str, String str2, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        super(tt3.y("DES/{}/{}", str, str2), secretKey, ivParameterSpec);
    }
}
