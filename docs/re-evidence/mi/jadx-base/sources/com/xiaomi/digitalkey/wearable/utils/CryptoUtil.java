package com.xiaomi.digitalkey.wearable.utils;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.c0;
import defpackage.c0e;
import defpackage.k0;
import defpackage.n83;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes7.dex */
public class CryptoUtil {
    private static final boolean DEBUG = Logger.LOG_SECURITY;
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-CryptoUtil:";

    public static byte[] aesCcmDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n83 n83Var = new n83(new k0());
        n83Var.g(false, new c0(new c0e(bArr), bArr4.length * 8, bArr3, null));
        byte[] bArr6 = new byte[bArr2.length];
        if (bArr5 != null) {
            n83Var.h(bArr5, 0, bArr5.length);
        }
        int i = n83Var.i(bArr2, 0, bArr2.length, bArr6, 0);
        try {
            int iB = i + n83Var.b(bArr6, i);
            byte[] bArr7 = new byte[iB];
            System.arraycopy(bArr6, 0, bArr7, 0, iB);
            byte[] bArrD = n83Var.d();
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("decode mac is: ");
                sb.append(ByteUtils.toHexString(bArrD));
            }
            return bArr7;
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] aesCcmEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n83 n83Var = new n83(new k0());
        n83Var.g(true, new c0(new c0e(bArr), bArr4.length * 8, bArr3, null));
        byte[] bArr6 = new byte[n83Var.e(bArr2.length)];
        if (bArr5 != null) {
            n83Var.h(bArr5, 0, bArr5.length);
        }
        int i = n83Var.i(bArr2, 0, bArr2.length, bArr6, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("plaint len is: ");
        sb.append(i);
        try {
            int iB = i + n83Var.b(bArr6, i);
            byte[] bArr7 = new byte[iB];
            System.arraycopy(bArr6, 0, bArr7, 0, iB);
            byte[] bArrD = n83Var.d();
            if (DEBUG) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tag len is: ");
                sb2.append(bArr4.length);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("output len is: ");
                sb3.append(iB);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("encode mac is: ");
                sb4.append(ByteUtils.toHexString(bArrD));
            }
            System.arraycopy(bArrD, 0, bArr4, 0, bArr4.length);
            return bArr7;
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] aesGcmDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return aesGcmXcrypt(bArr, bArr2, bArr3, 2);
    }

    public static byte[] aesGcmEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return aesGcmXcrypt(bArr, bArr2, bArr3, 1);
    }

    public static byte[] aesGcmXcrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String hexString;
        boolean z = DEBUG;
        if (i == 1) {
            if (z) {
                sb = new StringBuilder();
                str = "data to encrypt: ";
                sb.append(str);
                sb.append(ByteUtils.toHexString(bArr));
            }
        } else if (z) {
            sb = new StringBuilder();
            str = "data to decrypt: ";
            sb.append(str);
            sb.append(ByteUtils.toHexString(bArr));
        }
        boolean z2 = DEBUG;
        if (z2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AES-GCM key: ");
            sb3.append(ByteUtils.toHexString(bArr3));
        }
        if (z2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("AES-GCM IV is: ");
            sb4.append(ByteUtils.toHexString(bArr2));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(i, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            if (i == 1) {
                if (z2) {
                    sb2 = new StringBuilder();
                    sb2.append("encrypted data: ");
                    hexString = ByteUtils.toHexString(bArrDoFinal);
                    sb2.append(hexString);
                }
            } else if (z2) {
                sb2 = new StringBuilder();
                sb2.append("decrypted data: ");
                hexString = ByteUtils.toHexString(bArrDoFinal);
                sb2.append(hexString);
            }
            return bArrDoFinal;
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            e.printStackTrace();
            return null;
        } catch (BadPaddingException e4) {
            e = e4;
            e.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            e.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            e.printStackTrace();
            return null;
        }
    }

    public static X509Certificate createCertifcate(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] decrypt_share_data(byte[] bArr, byte[] bArr2) {
        return aesGcmDecrypt(ByteUtils.clone(bArr, 12), ByteUtils.clone(bArr, 0, 12), bArr2);
    }

    public static byte[] encyptShareData(byte[] bArr, byte[] bArr2) {
        byte[] bArrRandomByteArry = ByteUtils.randomByteArry(12);
        return ByteUtils.concatenate(bArrRandomByteArry, aesGcmEncrypt(bArr, bArrRandomByteArry, bArr2));
    }

    public static KeyPair generateKeyPair() {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCGenParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] getECPKHex(ECPublicKey eCPublicKey) {
        int length;
        int i;
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        byte[] bArr = new byte[65];
        int i2 = 1;
        int length2 = 32;
        if (byteArray.length > 32) {
            i = 1;
            length = 32;
        } else {
            length = byteArray.length;
            i = 0;
        }
        bArr[0] = 4;
        System.arraycopy(byteArray, i, bArr, 33 - length, length);
        if (byteArray2.length <= 32) {
            length2 = byteArray2.length;
            i2 = 0;
        }
        System.arraycopy(byteArray2, i2, bArr, 65 - length2, length2);
        return bArr;
    }

    public static PublicKey getPkFromHex(byte[] bArr) {
        ECPoint eCPoint = new ECPoint(new BigInteger(1, ByteUtils.clone(bArr, 1, 32)), new BigInteger(1, ByteUtils.clone(bArr, 33, 32)));
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
            ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("pub key is : ");
                sb.append(ByteUtils.toHexString(getECPKHex(eCPublicKey)));
            }
            return eCPublicKey;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | InvalidParameterSpecException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] getSha256Digist(byte[] bArr) {
        try {
            return MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isPkValid(byte[] bArr, byte[] bArr2) {
        byte[] sha256Digist = getSha256Digist(bArr);
        if (sha256Digist == null) {
            return false;
        }
        boolean zEquals = ByteUtils.equals(sha256Digist, bArr2);
        boolean z = DEBUG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(" receiver pk : ");
            sb.append(ByteUtils.toHexString(bArr));
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" compute hash: ");
            sb2.append(ByteUtils.toHexString(sha256Digist));
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" received hash: ");
            sb3.append(ByteUtils.toHexString(bArr2));
        }
        return zEquals;
    }

    public static byte[] xCryptAesEcb(byte[] bArr, byte[] bArr2, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(i, secretKeySpec);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
