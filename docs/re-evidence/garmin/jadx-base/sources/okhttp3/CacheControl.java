package okhttp3;

import am.j;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import d53.u;
import d53.w;
import java.util.concurrent.TimeUnit;
import o13.e;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j8) {
            if (j8 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j8;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (maxAge >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
                return this;
            }
            h.x(j.h(maxAge, "maxAge < 0: "));
            return null;
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (maxStale >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
                return this;
            }
            h.x(j.h(maxStale, "maxStale < 0: "));
            return null;
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            timeUnit.getClass();
            if (minFresh >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
                return this;
            }
            h.x(j.h(minFresh, "minFresh < 0: "));
            return null;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    private CacheControl(boolean z14, boolean z15, int i14, int i15, boolean z16, boolean z17, boolean z18, int i16, int i17, boolean z19, boolean z24, boolean z25, String str) {
        this.noCache = z14;
        this.noStore = z15;
        this.maxAgeSeconds = i14;
        this.sMaxAgeSeconds = i15;
        this.isPrivate = z16;
        this.isPublic = z17;
        this.mustRevalidate = z18;
        this.maxStaleSeconds = i16;
        this.minFreshSeconds = i17;
        this.onlyIfCached = z19;
        this.noTransform = z24;
        this.immutable = z25;
        this.headerValue = str;
    }

    public static final CacheControl parse(Headers headers) {
        return INSTANCE.parse(headers);
    }

    @e
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @e
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.noCache) {
            sb3.append("no-cache, ");
        }
        if (this.noStore) {
            sb3.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb3.append("max-age=");
            sb3.append(this.maxAgeSeconds);
            sb3.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb3.append("s-maxage=");
            sb3.append(this.sMaxAgeSeconds);
            sb3.append(", ");
        }
        if (this.isPrivate) {
            sb3.append("private, ");
        }
        if (this.isPublic) {
            sb3.append("public, ");
        }
        if (this.mustRevalidate) {
            sb3.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb3.append("max-stale=");
            sb3.append(this.maxStaleSeconds);
            sb3.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb3.append("min-fresh=");
            sb3.append(this.minFreshSeconds);
            sb3.append(", ");
        }
        if (this.onlyIfCached) {
            sb3.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb3.append("no-transform, ");
        }
        if (this.immutable) {
            sb3.append("immutable, ");
        }
        if (sb3.length() == 0) {
            return "";
        }
        sb3.delete(sb3.length() - 2, sb3.length());
        String string = sb3.toString();
        this.headerValue = string;
        return string;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i14) {
            int length = str.length();
            while (i14 < length) {
                if (w.A(str2, str.charAt(i14))) {
                    return i14;
                }
                i14++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = 0;
            }
            return companion.indexOfElement(str, str2, i14);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00df  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:54:0x012e  */
        /* JADX WARN: Code duplicated, block: B:57:0x013c  */
        /* JADX WARN: Code duplicated, block: B:75:0x00bb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x0167 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0105 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0115 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0145 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0156 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00d3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0136 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x015f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x014e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x011e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x010d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x00fd A[SYNTHETIC] */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            String string;
            boolean z14;
            String string2;
            Headers headers2 = headers;
            headers2.getClass();
            int size = headers2.size();
            boolean z15 = true;
            boolean z16 = true;
            int i14 = 0;
            String str = null;
            boolean z17 = false;
            boolean z18 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z19 = false;
            boolean z24 = false;
            boolean z25 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            while (i14 < size) {
                String strName = headers2.name(i14);
                String strValue = headers2.value(i14);
                if (u.q(strName, HttpHeaders.CACHE_CONTROL, z15)) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        string = w.i0(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
                        z14 = z15;
                        if (iIndexOfElement2 != strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                            iIndexOfElement = iIndexOfElement2 + 1;
                            string2 = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                string2 = w.i0(strValue.substring(iIndexOfNonWhitespace, iIndexOfElement)).toString();
                            } else {
                                int i15 = iIndexOfNonWhitespace + 1;
                                int iG = w.G(CoreConstants.DOUBLE_QUOTE_CHAR, i15, 4, strValue);
                                string2 = strValue.substring(i15, iG);
                                iIndexOfElement = iG + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z17 = z15;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z18 = z15;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z19 = z15;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z24 = z15;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z25 = z15;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z26 = z15;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z27 = z15;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z15 = z14;
                                z28 = z15;
                            }
                            z15 = z14;
                        }
                    }
                    i14++;
                    headers2 = headers;
                    z15 = z15;
                } else {
                    if (u.q(strName, HttpHeaders.PRAGMA, z15)) {
                    }
                    i14++;
                    headers2 = headers;
                    z15 = z15;
                }
                z16 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    string = w.i0(strValue.substring(iIndexOfElement, iIndexOfElement2)).toString();
                    z14 = z15;
                    if (iIndexOfElement2 != strValue.length()) {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    } else {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z15 = z14;
                        z17 = z15;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z15 = z14;
                        z18 = z15;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z19 = z15;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z24 = z15;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z25 = z15;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z26 = z15;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z27 = z15;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z15 = z14;
                            z28 = z15;
                        }
                        z15 = z14;
                    }
                }
                i14++;
                headers2 = headers;
                z15 = z15;
            }
            return new CacheControl(z17, z18, nonNegativeInt, nonNegativeInt2, z19, z24, z25, nonNegativeInt3, nonNegativeInt4, z26, z27, z28, !z16 ? null : str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z14, boolean z15, int i14, int i15, boolean z16, boolean z17, boolean z18, int i16, int i17, boolean z19, boolean z24, boolean z25, String str, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, i14, i15, z16, z17, z18, i16, i17, z19, z24, z25, str);
    }
}
