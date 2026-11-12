package com.mapbox.common.module.okhttp;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Buffer;
import com.mapbox.common.ReadStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import vb.h;
import w63.e;
import w63.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/module/okhttp/StreamingRequestBody;", "Lokhttp3/RequestBody;", "Lcom/mapbox/common/ReadStream;", "inputStream", "Lokhttp3/MediaType;", "contentType", "<init>", "(Lcom/mapbox/common/ReadStream;Lokhttp3/MediaType;)V", "()Lokhttp3/MediaType;", "", "isOneShot", "()Z", "", "contentLength", "()J", "Lw63/f;", "sink", "", "writeTo", "(Lw63/f;)V", "Lcom/mapbox/common/ReadStream;", "getInputStream", "()Lcom/mapbox/common/ReadStream;", "Lokhttp3/MediaType;", "getContentType", "Lw63/e;", "buffer", "Lw63/e;", "getBuffer", "()Lw63/e;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StreamingRequestBody extends RequestBody {
    private final e buffer;
    private final MediaType contentType;
    private final ReadStream inputStream;

    public StreamingRequestBody(ReadStream readStream, MediaType mediaType) throws IOException {
        readStream.getClass();
        this.inputStream = readStream;
        this.contentType = mediaType;
        this.buffer = new e();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
        Buffer buffer = new Buffer(new DataRef(byteBufferAllocateDirect));
        while (!this.inputStream.getExhausted()) {
            byteBufferAllocateDirect.clear();
            Expected<String, Long> expected = this.inputStream.read(buffer);
            expected.getClass();
            if (!expected.isValue()) {
                String error = expected.getError();
                error.getClass();
                h.C(error);
                throw null;
            }
            Long value = expected.getValue();
            value.getClass();
            byteBufferAllocateDirect.limit((int) value.longValue());
            this.buffer.write(byteBufferAllocateDirect);
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.buffer.f183349b;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    public final e getBuffer() {
        return this.buffer;
    }

    public final MediaType getContentType() {
        return this.contentType;
    }

    public final ReadStream getInputStream() {
        return this.inputStream;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return false;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(f sink) {
        sink.getClass();
        sink.G3(this.buffer.e());
    }
}
