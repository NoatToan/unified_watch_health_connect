package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.lookup.StringLookupFactory;

/* JADX INFO: loaded from: classes14.dex */
public interface HttpDataSource extends DataSource {
    public static final Predicate<String> REJECT_PAYWALL_TYPES = new d(2);

    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        public abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    public interface Factory extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        /* JADX WARN: Illegal instructions before constructor call */
        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = Ascii.toLowerCase(str);
        return (TextUtils.isEmpty(lowerCase) || (lowerCase.contains("text") && !lowerCase.contains(MimeTypes.TEXT_VTT)) || lowerCase.contains("html") || lowerCase.contains(StringLookupFactory.KEY_XML)) ? false : true;
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // com.google.android.exoplayer2.upstream.DataSource
    void close();

    int getResponseCode();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    Map<String, List<String>> getResponseHeaders();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    long open(DataSpec dataSpec);

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] bArr, int i14, int i15);

    void setRequestProperty(String str, String str2);

    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i14, int i15) {
            super(assignErrorCode(i14, i15));
            this.dataSpec = dataSpec;
            this.type = i15;
        }

        private static int assignErrorCode(int i14, int i15) {
            if (i14 == 2000 && i15 == 1) {
                return 2001;
            }
            return i14;
        }

        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i14) {
            int i15;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i15 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i15 = 1004;
            } else {
                i15 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            return i15 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i15, i14);
        }

        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i14) {
            this(dataSpec, 2000, i14);
        }

        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i14) {
            this(str, dataSpec, 2000, i14);
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i14, int i15) {
            super(str, assignErrorCode(i14, i15));
            this.dataSpec = dataSpec;
            this.type = i15;
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i14) {
            this(iOException, dataSpec, 2000, i14);
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i14, int i15) {
            super(iOException, assignErrorCode(i14, i15));
            this.dataSpec = dataSpec;
            this.type = i15;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i14) {
            this(str, iOException, dataSpec, 2000, i14);
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i14, int i15) {
            super(str, iOException, assignErrorCode(i14, i15));
            this.dataSpec = dataSpec;
            this.type = i15;
        }
    }

    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        public InvalidResponseCodeException(int i14, String str, IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super(v.b(26, i14, "Response code: "), iOException, dataSpec, 2004, 1);
            this.responseCode = i14;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }

        @Deprecated
        public InvalidResponseCodeException(int i14, String str, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i14, str, null, map, dataSpec, Util.EMPTY_BYTE_ARRAY);
        }

        @Deprecated
        public InvalidResponseCodeException(int i14, Map<String, List<String>> map, DataSpec dataSpec) {
            this(i14, null, null, map, dataSpec, Util.EMPTY_BYTE_ARRAY);
        }
    }
}
