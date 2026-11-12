package com.google.android.exoplayer2.upstream;

import defpackage.wlq;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.a {

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, com.google.android.exoplayer2.upstream.b bVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, bVar, 1);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        /* JADX WARN: Illegal instructions before constructor call */
        public InvalidContentTypeException(String str, com.google.android.exoplayer2.upstream.b bVar) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), bVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int i, Map<String, List<String>> map, com.google.android.exoplayer2.upstream.b bVar) {
            this(i, null, map, bVar, wlq.f);
        }

        @Deprecated
        public InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, com.google.android.exoplayer2.upstream.b bVar) {
            this(i, str, map, bVar, wlq.f);
        }

        public InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, com.google.android.exoplayer2.upstream.b bVar, byte[] bArr) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response code: ");
            sb.append(i);
            super(sb.toString(), bVar, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8392a = new c();

        public abstract HttpDataSource b(c cVar);

        @Deprecated
        public final c c() {
            return this.f8392a;
        }

        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        public final HttpDataSource a() {
            return b(this.f8392a);
        }
    }

    public interface b extends com.google.android.exoplayer2.upstream.a.InterfaceC0205a {
        @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
        HttpDataSource a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f8393a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f8394b;

        public synchronized Map<String, String> a() {
            try {
                if (this.f8394b == null) {
                    this.f8394b = Collections.unmodifiableMap(new HashMap(this.f8393a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f8394b;
        }

        public synchronized void b(Map<String, String> map) {
            this.f8394b = null;
            this.f8393a.putAll(map);
        }
    }

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final com.google.android.exoplayer2.upstream.b dataSpec;
        public final int type;

        public HttpDataSourceException(com.google.android.exoplayer2.upstream.b bVar, int i) {
            this.dataSpec = bVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, com.google.android.exoplayer2.upstream.b bVar, int i) {
            super(str);
            this.dataSpec = bVar;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, com.google.android.exoplayer2.upstream.b bVar, int i) {
            super(iOException);
            this.dataSpec = bVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, com.google.android.exoplayer2.upstream.b bVar, int i) {
            super(str, iOException);
            this.dataSpec = bVar;
            this.type = i;
        }
    }
}
