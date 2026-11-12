package defpackage;

import com.miui.tsmclient.util.Constants;
import io.sentry.util.p;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k67 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f23512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f23513b;

    @Nullable
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final URI e;

    public k67(@Nullable String str) throws IllegalArgumentException {
        try {
            p.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !Constants.URI_SCHEME.equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f23513b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f23512a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            this.e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), strSubstring + "api/" + strSubstring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    @NotNull
    public String a() {
        return this.d;
    }

    @Nullable
    public String b() {
        return this.c;
    }

    @NotNull
    public URI c() {
        return this.e;
    }
}
