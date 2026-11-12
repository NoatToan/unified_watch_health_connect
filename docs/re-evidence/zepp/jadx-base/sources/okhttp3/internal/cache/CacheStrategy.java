package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

/* JADX INFO: loaded from: classes23.dex */
public final class CacheStrategy {

    @Nullable
    public final Response cacheResponse;

    @Nullable
    public final Request networkRequest;

    public static class Factory {
        public final long a;
        public final Request b;
        public final Response c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l;

        public Factory(long j, Request request, Response response) {
            this.l = -1;
            this.a = j;
            this.b = request;
            this.c = response;
            if (response != null) {
                this.i = response.sentRequestAtMillis();
                this.j = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strName = headers.name(i);
                    String strValue = headers.value(i);
                    if ("Date".equalsIgnoreCase(strName)) {
                        this.d = HttpDate.parse(strValue);
                        this.e = strValue;
                    } else if ("Expires".equalsIgnoreCase(strName)) {
                        this.h = HttpDate.parse(strValue);
                    } else if ("Last-Modified".equalsIgnoreCase(strName)) {
                        this.f = HttpDate.parse(strValue);
                        this.g = strValue;
                    } else if ("ETag".equalsIgnoreCase(strName)) {
                        this.k = strValue;
                    } else if ("Age".equalsIgnoreCase(strName)) {
                        this.l = HttpHeaders.parseSeconds(strValue, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.d;
            long jMax = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return jMax + (j - this.i) + (this.a - j);
        }

        private long b() {
            CacheControl cacheControl = this.c.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            if (this.h != null) {
                Date date = this.d;
                long time = this.h.getTime() - (date != null ? date.getTime() : this.j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f == null || this.c.request().url().query() != null) {
                return 0L;
            }
            Date date2 = this.d;
            long time2 = (date2 != null ? date2.getTime() : this.i) - this.f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private CacheStrategy c() {
            if (this.c == null) {
                return new CacheStrategy(this.b, null);
            }
            if (this.b.isHttps() && this.c.handshake() == null) {
                return new CacheStrategy(this.b, null);
            }
            if (!CacheStrategy.isCacheable(this.c, this.b)) {
                return new CacheStrategy(this.b, null);
            }
            CacheControl cacheControl = this.b.cacheControl();
            if (cacheControl.noCache() || d(this.b)) {
                return new CacheStrategy(this.b, null);
            }
            CacheControl cacheControl2 = this.c.cacheControl();
            long jA = a();
            long jB = b();
            if (cacheControl.maxAgeSeconds() != -1) {
                jB = Math.min(jB, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControl2.noCache()) {
                long j = millis2 + jA;
                if (j < millis + jB) {
                    Response.Builder builderNewBuilder = this.c.newBuilder();
                    if (j >= jB) {
                        builderNewBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && e()) {
                        builderNewBuilder.addHeader(com.google.common.net.HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy(null, builderNewBuilder.build());
                }
            }
            String str = this.k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = com.google.common.net.HttpHeaders.IF_NONE_MATCH;
            } else if (this.f != null) {
                str = this.g;
            } else {
                if (this.d == null) {
                    return new CacheStrategy(this.b, null);
                }
                str = this.e;
            }
            Headers.Builder builderNewBuilder2 = this.b.headers().newBuilder();
            Internal.instance.addLenient(builderNewBuilder2, str2, str);
            return new CacheStrategy(this.b.newBuilder().headers(builderNewBuilder2.build()).build(), this.c);
        }

        private static boolean d(Request request) {
            return (request.header("If-Modified-Since") == null && request.header(com.google.common.net.HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        private boolean e() {
            return this.c.cacheControl().maxAgeSeconds() == -1 && this.h == null;
        }

        public CacheStrategy get() {
            CacheStrategy cacheStrategyC = c();
            return (cacheStrategyC.networkRequest == null || !this.b.cacheControl().onlyIfCached()) ? cacheStrategyC : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.cacheControl().isPrivate() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isCacheable(Response response, Request request) {
        int iCode = response.code();
        if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
            if (iCode != 307) {
                if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (response.header("Expires") == null) {
                if (response.cacheControl().maxAgeSeconds() == -1) {
                    if (!response.cacheControl().isPublic()) {
                    }
                }
            }
        }
        return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
    }
}
