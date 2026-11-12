package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;
import net.openid.appauth.internal.Logger;

/* JADX INFO: loaded from: classes20.dex */
public final class zrb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f54527a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void a(String str) {
        zre.e(43 <= str.length(), "codeVerifier length is shorter than allowed by the PKCE specification");
        zre.e(str.length() <= 128, "codeVerifier length is longer than allowed by the PKCE specification");
        zre.e(f54527a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    public static String d() {
        return c(new SecureRandom(), 64);
    }

    public static String c(SecureRandom secureRandom, int i) {
        zre.c(secureRandom, "entropySource cannot be null");
        zre.e(32 <= i, "entropyBytes is less than the minimum permitted");
        zre.e(i <= 96, "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e) {
            Logger.a("ISO-8859-1 encoding not supported on this device!", e);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e);
        } catch (NoSuchAlgorithmException e2) {
            Logger.c("SHA-256 is not supported on this device! Using plain challenge", e2);
            return str;
        }
    }

    public static String e() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }
}
