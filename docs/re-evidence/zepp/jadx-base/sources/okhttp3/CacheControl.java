package okhttp3;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.http.HttpHeaders;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes23.dex */
public final class CacheControl {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    @Nullable
    public String m;
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    public static final class Builder {
        public boolean a;
        public boolean b;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public boolean f;
        public boolean g;
        public boolean h;

        public CacheControl build() {
            return new CacheControl(this);
        }

        public Builder immutable() {
            this.h = true;
            return this;
        }

        public Builder maxAge(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.c = seconds > ParserMinimalBase.MAX_INT_L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i);
        }

        public Builder maxStale(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.d = seconds > ParserMinimalBase.MAX_INT_L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public Builder minFresh(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.e = seconds > ParserMinimalBase.MAX_INT_L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i);
        }

        public Builder noCache() {
            this.a = true;
            return this;
        }

        public Builder noStore() {
            this.b = true;
            return this;
        }

        public Builder noTransform() {
            this.g = true;
            return this;
        }

        public Builder onlyIfCached() {
            this.f = true;
            return this;
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        if (this.c != -1) {
            sb.append("max-age=");
            sb.append(this.c);
            sb.append(", ");
        }
        if (this.d != -1) {
            sb.append("s-maxage=");
            sb.append(this.d);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:87:0x0133 A[SYNTHETIC] */
    public static CacheControl parse(Headers headers) {
        int i;
        int iSkipUntil;
        String strTrim;
        int iSkipUntil2;
        String strTrim2;
        int size = headers.size();
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int seconds = -1;
        int seconds2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int seconds3 = -1;
        int seconds4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        for (int i2 = 0; i2 < size; i2++) {
            String strName = headers.name(i2);
            String strValue = headers.value(i2);
            if (strName.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strValue;
                }
                for (i = 0; i < strValue.length(); i = iSkipUntil2) {
                    iSkipUntil = HttpHeaders.skipUntil(strValue, i, "=,;");
                    strTrim = strValue.substring(i, iSkipUntil).trim();
                    if (iSkipUntil != strValue.length() || strValue.charAt(iSkipUntil) == ',' || strValue.charAt(iSkipUntil) == ';') {
                        iSkipUntil2 = iSkipUntil + 1;
                        strTrim2 = null;
                    } else {
                        int iSkipWhitespace = HttpHeaders.skipWhitespace(strValue, iSkipUntil + 1);
                        if (iSkipWhitespace >= strValue.length() || strValue.charAt(iSkipWhitespace) != '\"') {
                            iSkipUntil2 = HttpHeaders.skipUntil(strValue, iSkipWhitespace, ",;");
                            strTrim2 = strValue.substring(iSkipWhitespace, iSkipUntil2).trim();
                        } else {
                            int i3 = iSkipWhitespace + 1;
                            int iSkipUntil3 = HttpHeaders.skipUntil(strValue, i3, "\"");
                            strTrim2 = strValue.substring(i3, iSkipUntil3);
                            iSkipUntil2 = iSkipUntil3 + 1;
                        }
                    }
                    if (HTTP.NO_CACHE.equalsIgnoreCase(strTrim)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z3 = true;
                    } else if (HTTP.MAX_AGE.equalsIgnoreCase(strTrim)) {
                        seconds = HttpHeaders.parseSeconds(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        seconds2 = HttpHeaders.parseSeconds(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(strTrim)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        seconds3 = HttpHeaders.parseSeconds(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        seconds4 = HttpHeaders.parseSeconds(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z9 = true;
                    }
                }
            } else {
                if (strName.equalsIgnoreCase(com.google.common.net.HttpHeaders.PRAGMA)) {
                }
            }
            z = false;
            while (i < strValue.length()) {
                iSkipUntil = HttpHeaders.skipUntil(strValue, i, "=,;");
                strTrim = strValue.substring(i, iSkipUntil).trim();
                if (iSkipUntil != strValue.length()) {
                    iSkipUntil2 = iSkipUntil + 1;
                    strTrim2 = null;
                } else {
                    iSkipUntil2 = iSkipUntil + 1;
                    strTrim2 = null;
                }
                if (HTTP.NO_CACHE.equalsIgnoreCase(strTrim)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z3 = true;
                } else if (HTTP.MAX_AGE.equalsIgnoreCase(strTrim)) {
                    seconds = HttpHeaders.parseSeconds(strTrim2, -1);
                } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                    seconds2 = HttpHeaders.parseSeconds(strTrim2, -1);
                } else if ("private".equalsIgnoreCase(strTrim)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(strTrim)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                    seconds3 = HttpHeaders.parseSeconds(strTrim2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                    seconds4 = HttpHeaders.parseSeconds(strTrim2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(strTrim)) {
                    z9 = true;
                }
            }
        }
        return new CacheControl(z2, z3, seconds, seconds2, z4, z5, z6, seconds3, seconds4, z7, z8, z9, !z ? null : str);
    }

    public boolean immutable() {
        return this.l;
    }

    public boolean isPrivate() {
        return this.e;
    }

    public boolean isPublic() {
        return this.f;
    }

    public int maxAgeSeconds() {
        return this.c;
    }

    public int maxStaleSeconds() {
        return this.h;
    }

    public int minFreshSeconds() {
        return this.i;
    }

    public boolean mustRevalidate() {
        return this.g;
    }

    public boolean noCache() {
        return this.a;
    }

    public boolean noStore() {
        return this.b;
    }

    public boolean noTransform() {
        return this.k;
    }

    public boolean onlyIfCached() {
        return this.j;
    }

    public int sMaxAgeSeconds() {
        return this.d;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.m = strA;
        return strA;
    }

    public CacheControl(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = builder.d;
        this.i = builder.e;
        this.j = builder.f;
        this.k = builder.g;
        this.l = builder.h;
    }
}
