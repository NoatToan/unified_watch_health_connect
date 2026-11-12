package okhttp3;

import ch.qos.logback.core.CoreConstants;
import fb1.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p005kotlin.Metadata;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String username, String password, Charset charset) {
        username.getClass();
        password.getClass();
        charset.getClass();
        String str = username + CoreConstants.COLON_CHAR + password;
        h.f183361d.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return c.n("Basic ", new h(bytes).a());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            charset.getClass();
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2) {
        str.getClass();
        str2.getClass();
        return basic$default(str, str2, null, 4, null);
    }
}
