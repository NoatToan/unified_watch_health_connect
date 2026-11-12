package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;

    @Nullable
    public final Object customData;
    public final int flags;

    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;

    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    public static final class Builder {

        @Nullable
        private Uri a;
        private long b;
        private int c;

        @Nullable
        private byte[] d;
        private Map<String, String> e;
        private long f;
        private long g;

        @Nullable
        private String h;
        private int i;

        @Nullable
        private Object j;

        public DataSpec build() {
            Assertions.checkStateNotNull(this.a, "The uri must be set.");
            return new DataSpec(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public Builder setCustomData(@Nullable Object customData) {
            this.j = customData;
            return this;
        }

        public Builder setFlags(int flags) {
            this.i = flags;
            return this;
        }

        public Builder setHttpBody(@Nullable byte[] httpBody) {
            this.d = httpBody;
            return this;
        }

        public Builder setHttpMethod(int httpMethod) {
            this.c = httpMethod;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> httpRequestHeaders) {
            this.e = httpRequestHeaders;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.h = key;
            return this;
        }

        public Builder setLength(long length) {
            this.g = length;
            return this;
        }

        public Builder setPosition(long position) {
            this.f = position;
            return this;
        }

        public Builder setUri(String uriString) {
            this.a = Uri.parse(uriString);
            return this;
        }

        public Builder setUriPositionOffset(long uriPositionOffset) {
            this.b = uriPositionOffset;
            return this;
        }

        public Builder() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        public Builder setUri(Uri uri) {
            this.a = uri;
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.a = dataSpec.uri;
            this.b = dataSpec.uriPositionOffset;
            this.c = dataSpec.httpMethod;
            this.d = dataSpec.httpBody;
            this.e = dataSpec.httpRequestHeaders;
            this.f = dataSpec.position;
            this.g = dataSpec.length;
            this.h = dataSpec.key;
            this.i = dataSpec.flags;
            this.j = dataSpec.customData;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    public static String getStringForHttpMethod(int httpMethod) {
        if (httpMethod == 1) {
            return "GET";
        }
        if (httpMethod == 2) {
            return "POST";
        }
        if (httpMethod == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int flag) {
        return (this.flags & flag) == flag;
    }

    public DataSpec subrange(long offset) {
        long j = this.length;
        return subrange(offset, j != -1 ? j - offset : -1L);
    }

    public String toString() {
        String httpMethodString = getHttpMethodString();
        String strValueOf = String.valueOf(this.uri);
        long j = this.position;
        long j2 = this.length;
        String str = this.key;
        int i = this.flags;
        StringBuilder sb = new StringBuilder(String.valueOf(httpMethodString).length() + 70 + strValueOf.length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(httpMethodString);
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public DataSpec withAdditionalHeaders(Map<String, String> additionalHttpRequestHeaders) {
        HashMap map = new HashMap(this.httpRequestHeaders);
        map.putAll(additionalHttpRequestHeaders);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> httpRequestHeaders) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec subrange(long offset, long length) {
        return (offset == 0 && this.length == length) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + offset, length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri, long position, long length) {
        this(uri, 0L, 1, null, Collections.emptyMap(), position, length, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int flags) {
        this(uri, 0L, -1L, null, flags);
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key) {
        this(uri, position, position, length, key, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key, int flags) {
        this(uri, position, position, length, key, flags);
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key, int flags, Map<String, String> httpRequestHeaders) {
        this(uri, 1, null, position, position, length, key, flags, httpRequestHeaders);
    }

    @Deprecated
    public DataSpec(Uri uri, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
        this(uri, null, absoluteStreamPosition, position, length, key, flags);
    }

    @Deprecated
    public DataSpec(Uri uri, @Nullable byte[] postBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
        this(uri, postBody != null ? 2 : 1, postBody, absoluteStreamPosition, position, length, key, flags);
    }

    @Deprecated
    public DataSpec(Uri uri, int httpMethod, @Nullable byte[] httpBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
        this(uri, httpMethod, httpBody, absoluteStreamPosition, position, length, key, flags, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int httpMethod, @Nullable byte[] httpBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags, Map<String, String> httpRequestHeaders) {
        this(uri, absoluteStreamPosition - position, httpMethod, httpBody, httpRequestHeaders, position, length, key, flags, null);
    }

    private DataSpec(Uri uri, long uriPositionOffset, int httpMethod, @Nullable byte[] httpBody, Map<String, String> httpRequestHeaders, long position, long length, @Nullable String key, int flags, @Nullable Object customData) {
        byte[] bArr = httpBody;
        long j = uriPositionOffset + position;
        boolean z = true;
        Assertions.checkArgument(j >= 0);
        Assertions.checkArgument(position >= 0);
        if (length <= 0 && length != -1) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.uri = uri;
        this.uriPositionOffset = uriPositionOffset;
        this.httpMethod = httpMethod;
        this.httpBody = (bArr == null || bArr.length == 0) ? null : bArr;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(httpRequestHeaders));
        this.position = position;
        this.absoluteStreamPosition = j;
        this.length = length;
        this.key = key;
        this.flags = flags;
        this.customData = customData;
    }
}
