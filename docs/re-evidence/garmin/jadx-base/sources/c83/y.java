package c83;

import com.google.common.net.HttpHeaders;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f25884l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f25885m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f25887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f25889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f25890e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers.Builder f25891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaType f25892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MultipartBody.Builder f25894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FormBody.Builder f25895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RequestBody f25896k;

    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f25897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaType f25898b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f25897a = requestBody;
            this.f25898b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f25897a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            return this.f25898b;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(w63.f fVar) {
            this.f25897a.writeTo(fVar);
        }
    }

    public y(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z14, boolean z15, boolean z16) {
        this.f25886a = str;
        this.f25887b = httpUrl;
        this.f25888c = str2;
        this.f25892g = mediaType;
        this.f25893h = z14;
        if (headers != null) {
            this.f25891f = headers.newBuilder();
        } else {
            this.f25891f = new Headers.Builder();
        }
        if (z15) {
            this.f25895j = new FormBody.Builder();
        } else if (z16) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f25894i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2, boolean z14) {
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f25892g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e4) {
                n23.j.w(fb1.c.n("Malformed content type: ", str2), e4);
                return;
            }
        }
        Headers.Builder builder = this.f25891f;
        if (z14) {
            builder.addUnsafeNonAscii(str, str2);
        } else {
            builder.add(str, str2);
        }
    }

    public final void b(String str, String str2, boolean z14) {
        String str3 = this.f25888c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f25887b;
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder(str3);
            this.f25889d = builderNewBuilder;
            if (builderNewBuilder == null) {
                StringBuilder sb3 = new StringBuilder("Malformed URL. Base: ");
                sb3.append(httpUrl);
                c22.t.j(sb3, ", Relative: ", this.f25888c);
                return;
            }
            this.f25888c = null;
        }
        HttpUrl.Builder builder = this.f25889d;
        if (z14) {
            builder.addEncodedQueryParameter(str, str2);
        } else {
            builder.addQueryParameter(str, str2);
        }
    }
}
