package okhttp3;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class Cache implements Closeable, Flushable {
    private static final int h = 201105;
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    public final InternalCache a;
    public final DiskLruCache b;
    public int c;
    public int d;
    private int e;
    private int f;
    private int g;

    public class a implements InternalCache {
        public a() {
        }

        @Override // okhttp3.internal.cache.InternalCache
        public Response get(Request request) throws IOException {
            return Cache.this.b(request);
        }

        @Override // okhttp3.internal.cache.InternalCache
        public CacheRequest put(Response response) throws IOException {
            return Cache.this.c(response);
        }

        @Override // okhttp3.internal.cache.InternalCache
        public void remove(Request request) throws IOException {
            Cache.this.e(request);
        }

        @Override // okhttp3.internal.cache.InternalCache
        public void trackConditionalCacheHit() {
            Cache.this.f();
        }

        @Override // okhttp3.internal.cache.InternalCache
        public void trackResponse(CacheStrategy cacheStrategy) {
            Cache.this.g(cacheStrategy);
        }

        @Override // okhttp3.internal.cache.InternalCache
        public void update(Response response, Response response2) {
            Cache.this.h(response, response2);
        }
    }

    public class b implements Iterator<String> {
        public final Iterator<DiskLruCache.Snapshot> a;

        @Nullable
        public String b;
        public boolean c;

        public b() throws IOException {
            this.a = Cache.this.b.snapshots();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.b;
            this.b = null;
            this.c = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b != null) {
                return true;
            }
            this.c = false;
            while (this.a.hasNext()) {
                DiskLruCache.Snapshot next = this.a.next();
                try {
                    this.b = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                    next.close();
                    return true;
                } catch (IOException unused) {
                    next.close();
                } catch (Throwable th) {
                    next.close();
                    throw th;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.c) {
                throw new IllegalStateException("remove() before next()");
            }
            this.a.remove();
        }
    }

    public final class c implements CacheRequest {
        private final DiskLruCache.Editor a;
        private Sink b;
        private Sink c;
        public boolean d;

        public class a extends ForwardingSink {
            public final /* synthetic */ Cache a;
            public final /* synthetic */ DiskLruCache.Editor b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Sink sink, Cache cache, DiskLruCache.Editor editor) {
                super(sink);
                this.a = cache;
                this.b = editor;
            }

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (Cache.this) {
                    c cVar = c.this;
                    if (cVar.d) {
                        return;
                    }
                    cVar.d = true;
                    Cache.this.c++;
                    super.close();
                    this.b.commit();
                }
            }
        }

        public c(DiskLruCache.Editor editor) {
            this.a = editor;
            Sink sinkNewSink = editor.newSink(1);
            this.b = sinkNewSink;
            this.c = new a(sinkNewSink, Cache.this, editor);
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (this.d) {
                    return;
                }
                this.d = true;
                Cache.this.d++;
                Util.closeQuietly(this.b);
                try {
                    this.a.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public Sink body() {
            return this.c;
        }
    }

    public static class d extends ResponseBody {
        public final DiskLruCache.Snapshot b;
        private final BufferedSource c;

        @Nullable
        private final String d;

        @Nullable
        private final String e;

        public class a extends ForwardingSource {
            public final /* synthetic */ DiskLruCache.Snapshot a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Source source, DiskLruCache.Snapshot snapshot) {
                super(source);
                this.a = snapshot;
            }

            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.a.close();
                super.close();
            }
        }

        public d(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.b = snapshot;
            this.d = str;
            this.e = str2;
            this.c = Okio.buffer(new a(snapshot.getSource(1), snapshot));
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                String str = this.e;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.d;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.c;
        }
    }

    public Cache(File file, long j2) {
        this(file, j2, FileSystem.SYSTEM);
    }

    private void a(@Nullable DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static int d(BufferedSource bufferedSource) throws IOException {
        try {
            long decimalLong = bufferedSource.readDecimalLong();
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (decimalLong >= 0 && decimalLong <= ParserMinimalBase.MAX_INT_L && utf8LineStrict.isEmpty()) {
                return (int) decimalLong;
            }
            throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static String key(HttpUrl httpUrl) {
        return ByteString.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    @Nullable
    public Response b(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.b.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                e eVar = new e(snapshot.getSource(0));
                Response responseD = eVar.d(snapshot);
                if (eVar.b(request, responseD)) {
                    return responseD;
                }
                Util.closeQuietly(responseD.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Nullable
    public CacheRequest c(Response response) {
        DiskLruCache.Editor editorEdit;
        String strMethod = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                e(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strMethod.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        }
        e eVar = new e(response);
        try {
            editorEdit = this.b.edit(key(response.request().url()));
            if (editorEdit == null) {
                return null;
            }
            try {
                eVar.f(editorEdit);
                return new c(editorEdit);
            } catch (IOException unused2) {
                a(editorEdit);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    public void delete() throws IOException {
        this.b.delete();
    }

    public File directory() {
        return this.b.getDirectory();
    }

    public void e(Request request) throws IOException {
        this.b.remove(key(request.url()));
    }

    public void evictAll() throws IOException {
        this.b.evictAll();
    }

    public synchronized void f() {
        this.f++;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.b.flush();
    }

    public synchronized void g(CacheStrategy cacheStrategy) {
        this.g++;
        if (cacheStrategy.networkRequest != null) {
            this.e++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.f++;
        }
    }

    public void h(Response response, Response response2) {
        DiskLruCache.Editor editorEdit;
        e eVar = new e(response2);
        try {
            editorEdit = ((d) response.body()).b.edit();
            if (editorEdit != null) {
                try {
                    eVar.f(editorEdit);
                    editorEdit.commit();
                } catch (IOException unused) {
                    a(editorEdit);
                }
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    public synchronized int hitCount() {
        return this.f;
    }

    public void initialize() throws IOException {
        this.b.initialize();
    }

    public boolean isClosed() {
        return this.b.isClosed();
    }

    public long maxSize() {
        return this.b.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.e;
    }

    public synchronized int requestCount() {
        return this.g;
    }

    public long size() throws IOException {
        return this.b.size();
    }

    public Iterator<String> urls() throws IOException {
        return new b();
    }

    public synchronized int writeAbortCount() {
        return this.d;
    }

    public synchronized int writeSuccessCount() {
        return this.c;
    }

    public Cache(File file, long j2, FileSystem fileSystem) {
        this.a = new a();
        this.b = DiskLruCache.create(fileSystem, file, h, 2, j2);
    }

    public static final class e {
        private static final String k = Platform.get().getPrefix() + "-Sent-Millis";
        private static final String l = Platform.get().getPrefix() + "-Received-Millis";
        private final String a;
        private final Headers b;
        private final String c;
        private final Protocol d;
        private final int e;
        private final String f;
        private final Headers g;

        @Nullable
        private final Handshake h;
        private final long i;
        private final long j;

        public e(Source source) throws IOException {
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(source);
                this.a = bufferedSourceBuffer.readUtf8LineStrict();
                this.c = bufferedSourceBuffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int iD = Cache.d(bufferedSourceBuffer);
                for (int i = 0; i < iD; i++) {
                    builder.a(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.b = builder.build();
                StatusLine statusLine = StatusLine.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.d = statusLine.protocol;
                this.e = statusLine.code;
                this.f = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int iD2 = Cache.d(bufferedSourceBuffer);
                for (int i2 = 0; i2 < iD2; i2++) {
                    builder2.a(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = k;
                String str2 = builder2.get(str);
                String str3 = l;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.i = str2 != null ? Long.parseLong(str2) : 0L;
                this.j = str4 != null ? Long.parseLong(str4) : 0L;
                this.g = builder2.build();
                if (a()) {
                    String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict + "\"");
                    }
                    this.h = Handshake.get(!bufferedSourceBuffer.exhausted() ? TlsVersion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()), c(bufferedSourceBuffer), c(bufferedSourceBuffer));
                } else {
                    this.h = null;
                }
                source.close();
            } catch (Throwable th) {
                source.close();
                throw th;
            }
        }

        private boolean a() {
            return this.a.startsWith("https://");
        }

        private List<Certificate> c(BufferedSource bufferedSource) throws IOException {
            int iD = Cache.d(bufferedSource);
            if (iD == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(ACRAConstants.DEFAULT_CERTIFICATE_TYPE);
                ArrayList arrayList = new ArrayList(iD);
                for (int i = 0; i < iD; i++) {
                    String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    buffer.write(ByteString.decodeBase64(utf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void e(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.of(list.get(i).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean b(Request request, Response response) {
            return this.a.equals(request.url().toString()) && this.c.equals(request.method()) && HttpHeaders.varyMatches(response, this.b, request);
        }

        public Response d(DiskLruCache.Snapshot snapshot) {
            String str = this.g.get("Content-Type");
            String str2 = this.g.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.a).method(this.c, null).headers(this.b).build()).protocol(this.d).code(this.e).message(this.f).headers(this.g).body(new d(snapshot, str, str2)).handshake(this.h).sentRequestAtMillis(this.i).receivedResponseAtMillis(this.j).build();
        }

        public void f(DiskLruCache.Editor editor) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
            bufferedSinkBuffer.writeUtf8(this.a).writeByte(10);
            bufferedSinkBuffer.writeUtf8(this.c).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.b.size()).writeByte(10);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                bufferedSinkBuffer.writeUtf8(this.b.name(i)).writeUtf8(": ").writeUtf8(this.b.value(i)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(new StatusLine(this.d, this.e, this.f).toString()).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.g.size() + 2).writeByte(10);
            int size2 = this.g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bufferedSinkBuffer.writeUtf8(this.g.name(i2)).writeUtf8(": ").writeUtf8(this.g.value(i2)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(k).writeUtf8(": ").writeDecimalLong(this.i).writeByte(10);
            bufferedSinkBuffer.writeUtf8(l).writeUtf8(": ").writeDecimalLong(this.j).writeByte(10);
            if (a()) {
                bufferedSinkBuffer.writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.h.cipherSuite().javaName()).writeByte(10);
                e(bufferedSinkBuffer, this.h.peerCertificates());
                e(bufferedSinkBuffer, this.h.localCertificates());
                bufferedSinkBuffer.writeUtf8(this.h.tlsVersion().javaName()).writeByte(10);
            }
            bufferedSinkBuffer.close();
        }

        public e(Response response) {
            this.a = response.request().url().toString();
            this.b = HttpHeaders.varyHeaders(response);
            this.c = response.request().method();
            this.d = response.protocol();
            this.e = response.code();
            this.f = response.message();
            this.g = response.headers();
            this.h = response.handshake();
            this.i = response.sentRequestAtMillis();
            this.j = response.receivedResponseAtMillis();
        }
    }
}
