package okhttp3;

import com.google.firebase.analytics.FirebaseAnalytics;
import d53.c;
import e23.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import jg.b;
import okhttp3.internal.Util;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;
import w63.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lw63/g;", "consumer", "", "sizeMapper", "consumeSource", "(Le23/l;Le23/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lw63/g;", "", "bytes", "()[B", "Lw63/h;", "byteString", "()Lw63/h;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lw63/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lw63/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", BooleanUtils.OFF, "len", "read", "([CII)I", "", "close", "()V", "Lw63/g;", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final g source;

        public BomAwareReader(g gVar, Charset charset) {
            gVar.getClass();
            charset.getClass();
            this.source = gVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            cbuf.getClass();
            if (this.closed) {
                h.C("Stream closed");
                return 0;
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.v4(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = get$contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(c.f57666b)) == null) ? c.f57666b : charset;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    private final <T> T consumeSource(l<? super g, ? extends T> consumer, l<? super T, Integer> sizeMapper) throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            h.C(e.e(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        g gVarSource = get$this_asResponseBody();
        try {
            T tInvoke = consumer.invoke(gVarSource);
            b.l(gVarSource, null);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            StringBuilder sbW = v.h.w(iIntValue, "Content-Length (", ") and stream length (", jContentLength);
            sbW.append(") disagree");
            throw new IOException(sbW.toString());
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                b.l(gVarSource, th3);
                throw th4;
            }
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    public final InputStream byteStream() {
        return get$this_asResponseBody().v4();
    }

    public final w63.h byteString() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            h.C(e.e(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        g gVarSource = get$this_asResponseBody();
        try {
            w63.h hVarZ0 = gVarSource.z0();
            gVarSource.close();
            int iD = hVarZ0.d();
            if (jContentLength == -1 || jContentLength == iD) {
                return hVarZ0;
            }
            StringBuilder sbW = v.h.w(iD, "Content-Length (", ") and stream length (", jContentLength);
            sbW.append(") disagree");
            throw new IOException(sbW.toString());
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                b.l(gVarSource, th3);
                throw th4;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            h.C(e.e(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        g gVarSource = get$this_asResponseBody();
        try {
            byte[] bArrJ2 = gVarSource.J2();
            gVarSource.close();
            int length = bArrJ2.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrJ2;
            }
            StringBuilder sbW = v.h.w(length, "Content-Length (", ") and stream length (", jContentLength);
            sbW.append(") disagree");
            throw new IOException(sbW.toString());
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                b.l(gVarSource, th3);
                throw th4;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(get$this_asResponseBody());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long get$contentLength();

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    /* JADX INFO: renamed from: source */
    public abstract g get$this_asResponseBody();

    public final String string() throws IOException {
        g gVarSource = get$this_asResponseBody();
        try {
            String strP2 = gVarSource.P2(Util.readBomAsCharset(gVarSource, charset()));
            gVarSource.close();
            return strP2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                b.l(gVarSource, th3);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lw63/h;", "(Lw63/h;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lw63/g;", "", "contentLength", "(Lw63/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", FirebaseAnalytics.Param.CONTENT, "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lw63/h;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLw63/g;)Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, g gVar, MediaType mediaType, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                mediaType = null;
            }
            if ((i14 & 2) != 0) {
                j8 = -1;
            }
            return companion.create(gVar, mediaType, j8);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            Charset charset = c.f57666b;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            w63.e eVar = new w63.e();
            charset.getClass();
            eVar.P(str, 0, str.length(), charset);
            return create(eVar, mediaType, eVar.f183349b);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, w63.h hVar, MediaType mediaType, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(hVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            w63.e eVar = new w63.e();
            eVar.write(bArr, 0, bArr.length);
            return create(eVar, mediaType, bArr.length);
        }

        public final ResponseBody create(w63.h hVar, MediaType mediaType) {
            hVar.getClass();
            w63.e eVar = new w63.e();
            eVar.E(hVar);
            return create(eVar, mediaType, hVar.d());
        }

        public final ResponseBody create(final g gVar, final MediaType mediaType, final long j8) {
            gVar.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j8;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public g get$this_asResponseBody() {
                    return gVar;
                }
            };
        }

        @o13.e
        public final ResponseBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @o13.e
        public final ResponseBody create(MediaType contentType, byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @o13.e
        public final ResponseBody create(MediaType contentType, w63.h content) {
            content.getClass();
            return create(content, contentType);
        }

        @o13.e
        public final ResponseBody create(MediaType contentType, long contentLength, g content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    @o13.e
    public static final ResponseBody create(MediaType mediaType, long j8, g gVar) {
        return INSTANCE.create(mediaType, j8, gVar);
    }

    @o13.e
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @o13.e
    public static final ResponseBody create(MediaType mediaType, w63.h hVar) {
        return INSTANCE.create(mediaType, hVar);
    }

    @o13.e
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final ResponseBody create(g gVar, MediaType mediaType, long j8) {
        return INSTANCE.create(gVar, mediaType, j8);
    }

    public static final ResponseBody create(w63.h hVar, MediaType mediaType) {
        return INSTANCE.create(hVar, mediaType);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
