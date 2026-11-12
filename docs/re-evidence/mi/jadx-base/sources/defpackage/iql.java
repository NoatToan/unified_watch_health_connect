package defpackage;

import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.miot.ble.bouncycastle.crypto.InvalidCipherTextException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class iql {
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return b(bArr, bArr2, bArr3, null);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return c(new SecretKeySpec(bArr, "AES"), bArr2, Arrays.copyOfRange(bArr3, 0, bArr3.length - 4), bArr4, Arrays.copyOfRange(bArr3, bArr3.length - 4, bArr3.length));
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidCipherTextException {
        m83 m83VarG = g(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[m83VarG.d(length)];
        m83VarG.b(bArr6, m83VarG.g(bArr5, 0, length, bArr6, 0));
        return bArr6;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return e(bArr, bArr2, bArr3, null);
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return f(new SecretKeySpec(bArr, "AES"), bArr2, bArr3, bArr4).a();
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static wq1 f(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidCipherTextException, IOException {
        m83 m83VarG = g(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[m83VarG.d(bArr2.length)];
        int iG = m83VarG.g(bArr2, 0, bArr2.length, bArr4, 0);
        int iB = (iG + m83VarG.b(bArr4, iG)) - 4;
        byte[] bArr5 = new byte[iB];
        byte[] bArr6 = new byte[4];
        System.arraycopy(bArr4, 0, bArr5, 0, iB);
        System.arraycopy(bArr4, iB, bArr6, 0, 4);
        return new wq1(bArr5, bArr6);
    }

    public static m83 g(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        m83 m83Var = new m83(h(secretKey, z));
        m83Var.f(z, new f0(new e0e(secretKey.getEncoded()), 32, bArr, bArr2));
        return m83Var;
    }

    public static o0 h(SecretKey secretKey, boolean z) {
        o0 o0Var = new o0();
        o0Var.a(z, new e0e(secretKey.getEncoded()));
        return o0Var;
    }

    public static byte[] i(String str, byte[] bArr, byte[] bArr2) {
        try {
            c9c c9cVarE = c9c.e("HmacSHA256");
            c9cVarE.f(bArr, bArr2);
            return c9cVarE.d(str.getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KeyPair j() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] k(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static byte[] l(PublicKey publicKey) {
        byte[] bArrC = w77.c((ECPublicKey) publicKey);
        return bArrC.length == 65 ? Arrays.copyOfRange(bArrC, 1, 65) : bArrC;
    }

    public static SecretKey m(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(IECDHAlgorithm.ALGORITHM_ECDH);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret(IECDHAlgorithm.ALGORITHM_ECDH);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
