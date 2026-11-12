package com.sogou.map.loc;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
class x1 implements o1 {
    private /* synthetic */ b0 a;

    public x1(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // com.sogou.map.loc.o1
    public final void a() {
        r0.b("wifi connected");
        this.a.i.i(true);
    }

    @Override // com.sogou.map.loc.o1
    public final void b() {
        r0.b("wifi disconnected");
        this.a.i.i(false);
    }

    public static String a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return str2;
        }
        byte[] bArrZ = j0.z(str);
        byte[] bArrZ2 = j0.z(str2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrZ, com.huami.network.hmnetwork.utils.a.a);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return b(cipher.doFinal(bArrZ2));
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
        }
        return stringBuffer.toString();
    }
}
