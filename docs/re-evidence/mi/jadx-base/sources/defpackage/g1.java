package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f18446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cipher f18447b;
    public Cipher c;
    public boolean d = false;

    public byte[] a(byte[] bArr) {
        try {
            return this.f18447b.doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
            return bArr;
        }
    }

    public boolean b(String str) {
        this.f18446a = new SecretKeySpec(Base64.decode(str.getBytes(StandardCharsets.UTF_8), 2), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            this.f18447b = cipher;
            cipher.init(1, this.f18446a);
            Cipher cipher2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            this.c = cipher2;
            cipher2.init(2, this.f18446a);
            this.d = true;
            return true;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return false;
        }
    }
}
