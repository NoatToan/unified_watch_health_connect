package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.v;
import com.google.firebase.perf.FirebasePerformance;
import j20.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import lc.u0;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes14.dex */
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
    public final Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.datasource");
    }

    private DataSpec(Uri uri, long j8, int i14, byte[] bArr, Map<String, String> map, long j14, long j15, String str, int i15, Object obj) {
        byte[] bArr2 = bArr;
        long j16 = j8 + j14;
        Assertions.checkArgument(j16 >= 0);
        Assertions.checkArgument(j14 >= 0);
        Assertions.checkArgument(j15 > 0 || j15 == -1);
        this.uri = uri;
        this.uriPositionOffset = j8;
        this.httpMethod = i14;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j14;
        this.absoluteStreamPosition = j16;
        this.length = j15;
        this.key = str;
        this.flags = i15;
        this.customData = obj;
    }

    public static String getStringForHttpMethod(int i14) {
        if (i14 == 1) {
            return FirebasePerformance.HttpMethod.GET;
        }
        if (i14 == 2) {
            return FirebasePerformance.HttpMethod.POST;
        }
        if (i14 == 3) {
            return FirebasePerformance.HttpMethod.HEAD;
        }
        x.h();
        return null;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i14) {
        return (this.flags & i14) == i14;
    }

    public DataSpec subrange(long j8, long j14) {
        return (j8 == 0 && this.length == j14) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j8, j14, this.key, this.flags, this.customData);
    }

    public String toString() {
        String httpMethodString = getHttpMethodString();
        String strValueOf = String.valueOf(this.uri);
        long j8 = this.position;
        long j14 = this.length;
        String str = this.key;
        int i14 = this.flags;
        StringBuilder sbD = v.d(v.a(strValueOf.length() + v.a(70, httpMethodString), str), "DataSpec[", httpMethodString, StringUtils.SPACE, strValueOf);
        x.j(j8, ", ", ", ", sbD);
        p6.b.k(j14, ", ", str, sbD);
        return u0.k(sbD, ", ", i14, "]");
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.httpRequestHeaders);
        map2.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map2, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public static final class Builder {
        private Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        private String key;
        private long length;
        private long position;
        private Uri uri;
        private long uriPositionOffset;

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        public Builder setCustomData(Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setFlags(int i14) {
            this.flags = i14;
            return this;
        }

        public Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public Builder setHttpMethod(int i14) {
            this.httpMethod = i14;
            return this;
        }

        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setLength(long j8) {
            this.length = j8;
            return this;
        }

        public Builder setPosition(long j8) {
            this.position = j8;
            return this;
        }

        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        public Builder setUriPositionOffset(long j8) {
            this.uriPositionOffset = j8;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.EMPTY_MAP;
            this.length = -1L;
        }
    }

    public DataSpec subrange(long j8) {
        long j14 = this.length;
        return subrange(j8, j14 != -1 ? j14 - j8 : -1L);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(Uri uri, long j8, long j14) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j8, j14, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int i14) {
        this(uri, 0L, -1L, null, i14);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j14, String str) {
        this(uri, j8, j8, j14, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j14, String str, int i14) {
        this(uri, j8, j8, j14, str, i14);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j14, String str, int i14, Map<String, String> map) {
        this(uri, 1, null, j8, j8, j14, str, i14, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j8, long j14, long j15, String str, int i14) {
        this(uri, null, j8, j14, j15, str, i14);
    }

    @Deprecated
    public DataSpec(Uri uri, byte[] bArr, long j8, long j14, long j15, String str, int i14) {
        this(uri, bArr != null ? 2 : 1, bArr, j8, j14, j15, str, i14);
    }

    @Deprecated
    public DataSpec(Uri uri, int i14, byte[] bArr, long j8, long j14, long j15, String str, int i15) {
        this(uri, i14, bArr, j8, j14, j15, str, i15, Collections.EMPTY_MAP);
    }

    @Deprecated
    public DataSpec(Uri uri, int i14, byte[] bArr, long j8, long j14, long j15, String str, int i15, Map<String, String> map) {
        this(uri, j8 - j14, i14, bArr, map, j14, j15, str, i15, null);
    }
}
