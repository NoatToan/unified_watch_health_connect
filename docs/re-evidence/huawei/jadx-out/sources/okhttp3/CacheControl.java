package okhttp3;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.network.embedded.y;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zes;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    /* JADX INFO: renamed from: isPrivate, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name and from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name and from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name and from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name and from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name and from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name and from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name and from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name and from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name and from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name and from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        zcp.b((Object) string, "");
        this.headerValue = string;
        return string;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder maxAge(int maxAge, TimeUnit timeUnit) {
            zcp.c(timeUnit, "");
            if (maxAge < 0) {
                throw new IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(maxAge));
            return this;
        }

        public final Builder maxStale(int maxStale, TimeUnit timeUnit) {
            zcp.c(timeUnit, "");
            if (maxStale < 0) {
                throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(maxStale));
            return this;
        }

        public final Builder minFresh(int minFresh, TimeUnit timeUnit) {
            zcp.c(timeUnit, "");
            if (minFresh < 0) {
                throw new IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(minFresh));
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004c  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00df  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:44:0x0108  */
        /* JADX WARN: Code duplicated, block: B:45:0x010b  */
        /* JADX WARN: Code duplicated, block: B:47:0x0114  */
        /* JADX WARN: Code duplicated, block: B:48:0x0117  */
        /* JADX WARN: Code duplicated, block: B:50:0x0120  */
        /* JADX WARN: Code duplicated, block: B:51:0x0123  */
        /* JADX WARN: Code duplicated, block: B:53:0x012b  */
        /* JADX WARN: Code duplicated, block: B:54:0x0133  */
        /* JADX WARN: Code duplicated, block: B:56:0x013b  */
        /* JADX WARN: Code duplicated, block: B:57:0x0141  */
        /* JADX WARN: Code duplicated, block: B:59:0x014b  */
        /* JADX WARN: Code duplicated, block: B:60:0x014e  */
        /* JADX WARN: Code duplicated, block: B:62:0x0157  */
        /* JADX WARN: Code duplicated, block: B:63:0x015a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0162  */
        /* JADX WARN: Code duplicated, block: B:83:0x0164 A[SYNTHETIC] */
        @JvmStatic
        public final CacheControl parse(Headers headers) {
            int i;
            int iIndexOfElement;
            String string;
            int iIndexOfElement2;
            String string2;
            zcp.c(headers, "");
            int size = headers.size();
            boolean z = true;
            boolean z2 = true;
            int i2 = 0;
            String str = null;
            boolean z3 = false;
            boolean z4 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                String strName = headers.name(i2);
                String strValue = headers.value(i2);
                if (!zes.d(strName, "Cache-Control", z)) {
                    if (zes.d(strName, "Pragma", z)) {
                    }
                    i2++;
                    z = z;
                } else {
                    if (str == null) {
                        str = strValue;
                    }
                    i = 0;
                    while (i < strValue.length()) {
                        iIndexOfElement = this.indexOfElement(strValue, "=,;", i);
                        String strSubstring = strValue.substring(i, iIndexOfElement);
                        zcp.b((Object) strSubstring, "");
                        string = zes.a((CharSequence) strSubstring).toString();
                        if (iIndexOfElement != strValue.length() || strValue.charAt(iIndexOfElement) == ',' || strValue.charAt(iIndexOfElement) == ';') {
                            iIndexOfElement2 = iIndexOfElement + 1;
                            string2 = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement + 1);
                            if (iIndexOfNonWhitespace < strValue.length() && strValue.charAt(iIndexOfNonWhitespace) == '\"') {
                                int i3 = iIndexOfNonWhitespace + 1;
                                int iA = zes.a((CharSequence) strValue, '\"', i3, false, 4, (Object) null);
                                string2 = strValue.substring(i3, iA);
                                zcp.b((Object) string2, "");
                                iIndexOfElement2 = iA + 1;
                            } else {
                                iIndexOfElement2 = this.indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement2);
                                zcp.b((Object) strSubstring2, "");
                                string2 = zes.a((CharSequence) strSubstring2).toString();
                            }
                        }
                        if (zes.d("no-cache", string, true)) {
                            z3 = true;
                        } else if (zes.d("no-store", string, true)) {
                            z4 = true;
                        } else {
                            if (zes.d("max-age", string, true)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if (zes.d("s-maxage", string, true)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (zes.d("private", string, true)) {
                                z5 = true;
                            } else if (zes.d("public", string, true)) {
                                z6 = true;
                            } else if (zes.d("must-revalidate", string, true)) {
                                z7 = true;
                            } else if (zes.d("max-stale", string, true)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (zes.d("min-fresh", string, true)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (zes.d("only-if-cached", string, true)) {
                                z8 = true;
                            } else if (zes.d("no-transform", string, true)) {
                                z9 = true;
                            } else if (zes.d("immutable", string, true)) {
                                z10 = true;
                            }
                            z = true;
                            i = iIndexOfElement2;
                            this = this;
                        }
                        z = true;
                        i = iIndexOfElement2;
                        this = this;
                    }
                    i2++;
                    z = z;
                }
                z2 = false;
                i = 0;
                while (i < strValue.length()) {
                    iIndexOfElement = this.indexOfElement(strValue, "=,;", i);
                    String strSubstring3 = strValue.substring(i, iIndexOfElement);
                    zcp.b((Object) strSubstring3, "");
                    string = zes.a((CharSequence) strSubstring3).toString();
                    if (iIndexOfElement != strValue.length()) {
                        iIndexOfElement2 = iIndexOfElement + 1;
                        string2 = null;
                    } else {
                        iIndexOfElement2 = iIndexOfElement + 1;
                        string2 = null;
                    }
                    if (zes.d("no-cache", string, true)) {
                        z3 = true;
                    } else if (zes.d("no-store", string, true)) {
                        z4 = true;
                    } else {
                        if (zes.d("max-age", string, true)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if (zes.d("s-maxage", string, true)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if (zes.d("private", string, true)) {
                            z5 = true;
                        } else if (zes.d("public", string, true)) {
                            z6 = true;
                        } else if (zes.d("must-revalidate", string, true)) {
                            z7 = true;
                        } else if (zes.d("max-stale", string, true)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if (zes.d("min-fresh", string, true)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if (zes.d("only-if-cached", string, true)) {
                            z8 = true;
                        } else if (zes.d("no-transform", string, true)) {
                            z9 = true;
                        } else if (zes.d("immutable", string, true)) {
                            z10 = true;
                        }
                        z = true;
                        i = iIndexOfElement2;
                        this = this;
                    }
                    z = true;
                    i = iIndexOfElement2;
                    this = this;
                }
                i2++;
                z = z;
            }
            return new CacheControl(z3, z4, nonNegativeInt, nonNegativeInt2, z5, z6, z7, nonNegativeInt3, nonNegativeInt4, z8, z9, z10, !z2 ? null : str, null);
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (zes.b((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final CacheControl parse(Headers headers) {
        return INSTANCE.parse(headers);
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, zcm zcmVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
