package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes23.dex */
final class g {
    private static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String l = " \"<>^`{}|\\?#";
    private final String a;
    private final HttpUrl b;

    @Nullable
    private String c;

    @Nullable
    private HttpUrl.Builder d;
    private final Request.Builder e;

    @Nullable
    private MediaType f;
    private final boolean g;

    @Nullable
    private MultipartBody.Builder h;

    @Nullable
    private FormBody.Builder i;

    @Nullable
    private RequestBody j;

    public static class a extends RequestBody {
        private final RequestBody a;
        private final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.a.writeTo(bufferedSink);
        }
    }

    public g(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        Request.Builder builder = new Request.Builder();
        this.e = builder;
        this.f = mediaType;
        this.g = z;
        if (headers != null) {
            builder.headers(headers);
        }
        if (z2) {
            this.i = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder2 = new MultipartBody.Builder();
            this.h = builder2;
            builder2.setType(MultipartBody.FORM);
        }
    }

    private static String h(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || l.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                i(buffer, str, iCharCount, length, z);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void i(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || l.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    while (!buffer2.exhausted()) {
                        int i3 = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        char[] cArr = k;
                        buffer.writeByte((int) cArr[(i3 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i3 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.i.addEncoded(str, str2);
        } else {
            this.i.add(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.e.addHeader(str, str2);
            return;
        }
        MediaType mediaType = MediaType.parse(str2);
        if (mediaType != null) {
            this.f = mediaType;
            return;
        }
        throw new IllegalArgumentException("Malformed content type: " + str2);
    }

    public void c(Headers headers, RequestBody requestBody) {
        this.h.addPart(headers, requestBody);
    }

    public void d(MultipartBody.Part part) {
        this.h.addPart(part);
    }

    public void e(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 == null) {
            throw new AssertionError();
        }
        this.c = str3.replace("{" + str + com.alipay.sdk.m.u.i.d, h(str2, z));
    }

    public void f(String str, @Nullable String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl.Builder builderNewBuilder = this.b.newBuilder(str3);
            this.d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
            this.c = null;
        }
        if (z) {
            this.d.addEncodedQueryParameter(str, str2);
        } else {
            this.d.addQueryParameter(str, str2);
        }
    }

    public Request g() {
        HttpUrl httpUrlResolve;
        HttpUrl.Builder builder = this.d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = this.b.resolve(this.c);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.c);
            }
        }
        RequestBody aVar = this.j;
        if (aVar == null) {
            FormBody.Builder builder2 = this.i;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.h;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.g) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.e.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.e.url(httpUrlResolve).method(this.a, aVar).build();
    }

    public void j(RequestBody requestBody) {
        this.j = requestBody;
    }

    public void k(Object obj) {
        this.c = obj.toString();
    }
}
