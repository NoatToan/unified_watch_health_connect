package com.huawei.hms.network.base.common;

import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.trans.ByteString;
import com.huawei.hms.network.base.common.trans.CounterOutputStream;
import com.huawei.hms.network.httpclient.RequestBody;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class MultipartBody extends RequestBody {
    private static final String f = "MultipartBody";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaType f14481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteString f14482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Part> f14483c;
    private final MediaType d;
    private long e = -1;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] g = {58, 32};
    private static final byte[] h = {13, 10};
    private static final byte[] i = {45, 45};

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteString f14484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Part> f14485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaType f14486c;

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            if (mediaType.type().equals("multipart")) {
                this.f14486c = mediaType;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + this.f14486c);
        }

        public MultipartBody build() {
            if (this.f14485b.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this);
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public Builder addPart(Part part) {
            if (part == null) {
                throw new NullPointerException("part == null");
            }
            this.f14485b.add(part);
            return this;
        }

        public Builder addPart(@Nullable Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addFormDataPart(String str, @Nullable String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder(String str) {
            this.f14485b = new ArrayList();
            this.f14486c = MultipartBody.MIXED;
            this.f14484a = ByteString.encodeUtf8(str);
        }

        public Builder() {
            this(UUID.randomUUID().toString());
        }
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        a(outputStream, false);
    }

    public MediaType type() {
        return this.f14481a;
    }

    public int size() {
        return this.f14483c.size();
    }

    public List<Part> parts() {
        return this.f14483c;
    }

    public static final class Part {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        final Headers f14487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final RequestBody f14488b;

        @Nullable
        public Headers headers() {
            return this.f14487a;
        }

        public RequestBody body() {
            return this.f14488b;
        }

        public static Part createFormData(String str, @Nullable String str2, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.a(sb, str2);
            }
            return create(Headers.of("Content-Disposition", sb.toString()), requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBodyProviders.create((MediaType) null, str2));
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part create(@Nullable Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        private Part(@Nullable Headers headers, RequestBody requestBody) {
            this.f14487a = headers;
            this.f14488b = requestBody;
        }
    }

    public Part part(int i2) {
        return this.f14483c.get(i2);
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public String contentType() {
        MediaType mediaType = this.d;
        if (mediaType == null) {
            return null;
        }
        return mediaType.toString();
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public long contentLength() {
        long j = this.e;
        if (j != -1) {
            return j;
        }
        this.e = a((OutputStream) null, true);
        Logger.i(f, "get the contentLength,and the contentLength =" + this.e);
        return this.e;
    }

    public String boundary() {
        return this.f14482b.utf8();
    }

    static StringBuilder a(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                str2 = "%0A";
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    str2 = "%22";
                }
            } else {
                str2 = "%0D";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    private long a(OutputStream outputStream, boolean z) throws IOException {
        CounterOutputStream counterOutputStream = new CounterOutputStream();
        if (z) {
            outputStream = counterOutputStream;
        }
        int size = this.f14483c.size();
        long lenth = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Part part = this.f14483c.get(i2);
            Headers headers = part.f14487a;
            RequestBody requestBody = part.f14488b;
            outputStream.write(i);
            outputStream.write(StringUtils.getBytes(boundary()));
            outputStream.write(h);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    outputStream.write(StringUtils.getBytes(headers.name(i3)));
                    outputStream.write(g);
                    outputStream.write(StringUtils.getBytes(headers.value(i3)));
                    outputStream.write(h);
                }
            }
            String strContentType = requestBody.contentType();
            if (strContentType != null) {
                outputStream.write(StringUtils.getBytes("Content-Type: "));
                outputStream.write(StringUtils.getBytes(strContentType));
                outputStream.write(h);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                outputStream.write(StringUtils.getBytes("Content-Length: "));
                outputStream.write(StringUtils.getBytes(jContentLength));
                outputStream.write(h);
            } else if (z) {
                return -1L;
            }
            byte[] bArr = h;
            outputStream.write(bArr);
            if (z) {
                lenth += jContentLength;
            } else {
                requestBody.writeTo(outputStream);
            }
            outputStream.write(bArr);
        }
        byte[] bArr2 = i;
        outputStream.write(bArr2);
        outputStream.write(StringUtils.getBytes(boundary()));
        outputStream.write(bArr2);
        outputStream.write(h);
        if (z) {
            lenth += counterOutputStream.getLenth();
            IoUtils.closeSecure((OutputStream) counterOutputStream);
        }
        Logger.v(f, "the length of the requestBody is %s", Long.valueOf(lenth));
        return lenth;
    }

    MultipartBody(Builder builder) {
        this.f14483c = builder.f14485b;
        ByteString byteString = builder.f14484a;
        this.f14482b = byteString;
        MediaType mediaType = builder.f14486c;
        this.f14481a = mediaType;
        this.d = MediaType.get(mediaType + "; boundary=" + byteString.utf8());
    }
}
