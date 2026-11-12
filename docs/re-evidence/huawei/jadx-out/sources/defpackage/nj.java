package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes4.dex */
public class nj {
    /* JADX WARN: Code duplicated, block: B:45:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        try {
            PublicKey publicKeyC = c(JceNames.RSA, str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyC);
            byte[] bytes = str.getBytes("UTF-8");
            int blockSize = cipher.getBlockSize();
            byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < bytes.length; i += blockSize) {
                try {
                    try {
                        byteArrayOutputStream.write(cipher.doFinal(bytes, i, bytes.length - i < blockSize ? bytes.length - i : blockSize));
                    } catch (Exception e) {
                        e = e;
                        oq.c(e);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                oq.c(e);
                                return bArr;
                            }
                        }
                        return bArr;
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e3) {
                            oq.c(e3);
                        }
                    }
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e4) {
                e = e4;
                bArr = byteArray;
                oq.c(e);
                return bArr;
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            throw th;
        }
    }

    public static PublicKey c(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(ng.a(str2)));
    }
}
