package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import com.nimbusds.jose.JWEObject;
import com.service.mi.common.util.a;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class czd {
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        return cipher.doFinal(bArr2);
    }

    public static String b(String str) {
        try {
            RSAPrivateKey rSAPrivateKeyD = d(j7i.a(a.a().getApplicationContext(), qvf.i));
            JWEObject jWEObject = JWEObject.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append("头信息：");
            sb.append(jWEObject.getHeader());
            byte[] bArrC = c(jWEObject.getEncryptedKey().decode(), rSAPrivateKeyD);
            String strE = m7c.e(bArrC);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("16进制-AES_KEY:");
            sb2.append(strE);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("base64-AES_KEY:");
            sb3.append(o12.d(bArrC));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("AES_KEY长度:");
            sb4.append(bArrC.length);
            byte[] bArrDecode = jWEObject.getCipherText().decode();
            byte[] bArrDecode2 = jWEObject.getAuthTag().decode();
            byte[] bArr = new byte[bArrDecode.length + bArrDecode2.length];
            System.arraycopy(bArrDecode, 0, bArr, 0, bArrDecode.length);
            System.arraycopy(bArrDecode2, 0, bArr, bArrDecode.length, bArrDecode2.length);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("iv:");
            sb5.append(jWEObject.getIV());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("iv长度:");
            sb6.append(jWEObject.getIV().decode().length);
            String str2 = new String(a(bArrC, bArr, jWEObject.getIV().decode(), null));
            StringBuilder sb7 = new StringBuilder();
            sb7.append("解密后的报文1:");
            sb7.append(str2.trim());
            return str2.trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] c(byte[] bArr, RSAPrivateKey rSAPrivateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
        cipher.init(2, rSAPrivateKey);
        int iBitLength = rSAPrivateKey.getModulus().bitLength() / 8;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - i;
            if (i3 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byte[] bArrDoFinal = i3 > iBitLength ? cipher.doFinal(bArr, i, iBitLength) : cipher.doFinal(bArr, i, i3);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
            i = i2 * iBitLength;
        }
    }

    public static RSAPrivateKey d(String str) {
        try {
            return (RSAPrivateKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePrivate(new PKCS8EncodedKeySpec(o12.a(str)));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
