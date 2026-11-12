package defpackage;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class q0 {
    public static byte[] a(Cipher cipher) throws JOSEException {
        GCMParameterSpec gCMParameterSpecB = b(cipher);
        byte[] iv = gCMParameterSpecB.getIV();
        e(iv, gCMParameterSpecB.getTLen());
        return iv;
    }

    public static GCMParameterSpec b(Cipher cipher) throws JOSEException {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters == null) {
            throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
        }
        try {
            return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
        } catch (InvalidParameterSpecException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static xq1 c(SecretKey secretKey, ch4<byte[]> ch4Var, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        SecretKey secretKeyA = v0e.a(secretKey);
        byte[] bArrA = ch4Var.a();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA, new GCMParameterSpec(128, bArrA));
            cipher.updateAAD(bArr2);
            try {
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                int length = bArrDoFinal.length - y73.c(128);
                byte[] bArrF = y73.f(bArrDoFinal, 0, length);
                byte[] bArrF2 = y73.f(bArrDoFinal, length, y73.c(128));
                ch4Var.b(a(cipher));
                return new xq1(bArrF, bArrF2);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new JOSEException("Couldn't encrypt with AES/GCM/NoPadding: " + e.getMessage(), e);
            }
        } catch (NoClassDefFoundError unused) {
            return wee.c(secretKeyA, bArrA, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new JOSEException("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static byte[] d(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static void e(byte[] bArr, int i) throws JOSEException {
        if (y73.e(bArr) != 96) {
            throw new JOSEException(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(y73.e(bArr))));
        }
        if (i != 128) {
            throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i)));
        }
    }
}
