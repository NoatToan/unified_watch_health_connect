package com.huawei.wisecloud.drmclient.utils;

import com.huawei.wisecloud.drmclient.exception.HwDrmException;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import com.huawei.wisecloud.drmclient.log.HwDrmLog;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes20.dex */
public class RSAUtil {
    private static final String RSA_DECRYPT_MGF1 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final String RSA_DECRYPT_PKCS1 = "RSA/ECB/PKCS1Padding";

    public static boolean verifyRSASignature(String str, PublicKey publicKey, int i, byte[] bArr) throws HwDrmException {
        try {
            byte[] bytes = str.getBytes(HwDrmConstant.DRM_CHARSET);
            Signature signature = Signature.getInstance(RSASignAlgo.getAlgoName(i));
            signature.initVerify(publicKey);
            signature.update(bytes);
            return signature.verify(bArr);
        } catch (InvalidKeyException e) {
            String str2 = "fail to verify, InvalidKeyException: " + HwDrmLog.printException((Exception) e);
            HwDrmLog.e("RSAUtil", str2);
            throw new HwDrmException(str2);
        } catch (NoSuchAlgorithmException e2) {
            String str3 = "fail to verify, NoSuchAlgorithmException: " + HwDrmLog.printException((Exception) e2);
            HwDrmLog.e("RSAUtil", str3);
            throw new HwDrmException(str3);
        } catch (SignatureException e3) {
            String str4 = "fail to verify, SignatureException: " + HwDrmLog.printException((Exception) e3);
            HwDrmLog.e("RSAUtil", str4);
            throw new HwDrmException(str4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static byte[] decrypt(byte[] bArr, PrivateKey privateKey, String str) throws HwDrmException {
        byte b2;
        try {
            if (privateKey == null) {
                HwDrmLog.e("RSAUtil", "privateKey is null");
                throw new HwDrmException("privateKey is null");
            }
            Cipher cipher = Cipher.getInstance(str);
            int iHashCode = str.hashCode();
            if (iHashCode != 192372773) {
                if (iHashCode == 1220791914 && str.equals(RSA_DECRYPT_MGF1)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(RSA_DECRYPT_PKCS1)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                cipher.init(2, privateKey);
                return cipher.doFinal(bArr);
            }
            if (b2 == 1) {
                cipher.init(2, privateKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
                return cipher.doFinal(bArr);
            }
            String str2 = "fail to decrypt, unsupported Algorithm: " + str;
            HwDrmLog.e("RSAUtil", str2);
            throw new HwDrmException(str2);
        } catch (InvalidAlgorithmParameterException e) {
            String str3 = "fail to decrypt, InvalidAlgorithmParameterException: " + HwDrmLog.printException((Exception) e);
            HwDrmLog.e("RSAUtil", str3);
            throw new HwDrmException(str3);
        } catch (InvalidKeyException e2) {
            String str4 = "fail to decrypt, InvalidKeyException: " + HwDrmLog.printException((Exception) e2);
            HwDrmLog.e("RSAUtil", str4);
            throw new HwDrmException(str4);
        } catch (NoSuchAlgorithmException e3) {
            String str5 = "fail to decrypt, NoSuchAlgorithmException: " + HwDrmLog.printException((Exception) e3);
            HwDrmLog.e("RSAUtil", str5);
            throw new HwDrmException(str5);
        } catch (BadPaddingException e4) {
            String str6 = "fail to decrypt, BadPaddingException: " + HwDrmLog.printException((Exception) e4);
            HwDrmLog.e("RSAUtil", str6);
            throw new HwDrmException(str6);
        } catch (IllegalBlockSizeException e5) {
            String str7 = "fail to decrypt, IllegalBlockSizeException: " + HwDrmLog.printException((Exception) e5);
            HwDrmLog.e("RSAUtil", str7);
            throw new HwDrmException(str7);
        } catch (NoSuchPaddingException e6) {
            String str8 = "fail to decrypt, NoSuchPaddingException: " + HwDrmLog.printException((Exception) e6);
            HwDrmLog.e("RSAUtil", str8);
            throw new HwDrmException(str8);
        }
    }
}
