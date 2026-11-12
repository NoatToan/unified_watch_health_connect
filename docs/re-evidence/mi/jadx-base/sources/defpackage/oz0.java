package defpackage;

import android.text.TextUtils;
import com.miuipub.internal.hybrid.SignUtils;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class oz0 {
    public static String a(String str, l83 l83Var, boolean z) {
        if (!TextUtils.isEmpty(str) && l83Var != null && !TextUtils.isEmpty(l83Var.b()) && l83Var.b().length() == 16 && !TextUtils.isEmpty(l83Var.a()) && l83Var.a().length() == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(l83Var.b().getBytes(StandardCharsets.UTF_8), "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(l83Var.a().getBytes());
                if (z) {
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    return d(cipher.doFinal(str.getBytes()));
                }
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return new String(cipher.doFinal(x12.a(str)));
            } catch (Exception e) {
                ycm.a("Error: encrypt cbc: " + e.getMessage());
            }
        }
        return "";
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (str.length() >= str2.length() - 11) {
            str = str.substring(0, str2.length() - 11);
        }
        byte[] bArrA = x12.a(str2);
        byte[] bArrA2 = x12.a(str);
        try {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePrivate(new PKCS8EncodedKeySpec(bArrA));
            Cipher cipher = Cipher.getInstance(SignUtils.KEY_RSA);
            cipher.init(2, rSAPrivateKey);
            return new String(cipher.doFinal(bArrA2), StandardCharsets.UTF_8);
        } catch (InvalidKeyException e) {
            e = e;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (InvalidKeySpecException e3) {
            e = e3;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (BadPaddingException e4) {
            e = e4;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            e.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (Exception e7) {
            e7.printStackTrace();
            ycm.a("Error: decrypt by RSA Exception unexpection，" + e7.getMessage());
            return null;
        }
    }

    public static String c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (str.length() >= str2.length() - 11) {
            str = str.substring(0, str2.length() - 11);
        }
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(x12.a(str2)));
            Cipher cipher = Cipher.getInstance(SignUtils.KEY_RSA);
            cipher.init(1, rSAPublicKey);
            return x12.c(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
        } catch (InvalidKeyException e) {
            e = e;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (InvalidKeySpecException e3) {
            e = e3;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (BadPaddingException e4) {
            e = e4;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            e.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception，" + e.getMessage());
            return null;
        } catch (Exception e7) {
            e7.printStackTrace();
            ycm.a("Error: encrypt by RSA Exception unexpection，" + e7.getMessage());
            return null;
        }
    }

    public static String d(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? "" : x12.d(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i) {
        return nz0.b(bArr, i);
    }

    public static rz0 f(int i) {
        if (i != 2048 && i != 1024 && i != 512) {
            ycm.a("Error: Invalid RSA key length");
            throw new RuntimeException("InValid RSA key length");
        }
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(SignUtils.KEY_RSA);
            keyPairGenerator.initialize(i);
            return new rz0(keyPairGenerator.generateKeyPair(), 1);
        } catch (NoSuchAlgorithmException e) {
            ycm.b(e.getMessage());
            return null;
        }
    }
}
