package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class kw3 {
    public static Cipher a(String str, Provider provider) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
