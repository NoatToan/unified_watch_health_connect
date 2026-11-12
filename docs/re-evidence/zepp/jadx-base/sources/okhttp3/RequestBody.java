package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes23.dex */
public abstract class RequestBody {

    public class a extends RequestBody {
        public final /* synthetic */ MediaType a;
        public final /* synthetic */ ByteString b;

        public a(MediaType mediaType, ByteString byteString) {
            this.a = mediaType;
            this.b = byteString;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.b.size();
        }

        @Override // okhttp3.RequestBody
        @Nullable
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.b);
        }
    }

    public class b extends RequestBody {
        public final /* synthetic */ MediaType a;
        public final /* synthetic */ int b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ int d;

        public b(MediaType mediaType, int i, byte[] bArr, int i2) {
            this.a = mediaType;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        @Nullable
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.c, this.d, this.b);
        }
    }

    public class c extends RequestBody {
        public final /* synthetic */ MediaType a;
        public final /* synthetic */ File b;

        public c(MediaType mediaType, File file) {
            this.a = mediaType;
            this.b = file;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.b.length();
        }

        @Override // okhttp3.RequestBody
        @Nullable
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Source source = null;
            try {
                source = Okio.source(this.b);
                bufferedSink.writeAll(source);
            } finally {
                Util.closeQuietly(source);
            }
        }
    }

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static RequestBody create(@Nullable MediaType mediaType, ByteString byteString) {
        return new a(mediaType, byteString);
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new b(mediaType, i2, bArr, i);
    }

    public static RequestBody create(@Nullable MediaType mediaType, File file) {
        Objects.requireNonNull(file, "file == null");
        return new c(mediaType, file);
    }
}
