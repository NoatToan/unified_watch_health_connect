package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mapbox/common/ResponseReadStream;", "Lcom/mapbox/common/ReadStream;", "Lw63/e;", "okioBuffer", "<init>", "(Lw63/e;)V", "", "readBytes", "()J", "", "isExhausted", "()Z", "isReadable", "Lcom/mapbox/common/Buffer;", "commonBuffer", "Lcom/mapbox/bindgen/Expected;", "", "read", "(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;", "Lw63/e;", "getOkioBuffer", "()Lw63/e;", "J", "getReadBytes", "setReadBytes", "(J)V", "exhausted", "Z", "getExhausted", "setExhausted", "(Z)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ResponseReadStream implements ReadStream {
    private boolean exhausted;
    private final w63.e okioBuffer;
    private long readBytes;

    public ResponseReadStream(w63.e eVar) {
        eVar.getClass();
        this.okioBuffer = eVar;
    }

    public final boolean getExhausted() {
        return this.exhausted;
    }

    public final w63.e getOkioBuffer() {
        return this.okioBuffer;
    }

    public final long getReadBytes() {
        return this.readBytes;
    }

    @Override // com.mapbox.common.ReadStream
    /* JADX INFO: renamed from: isExhausted */
    public boolean getExhausted() {
        return this.exhausted;
    }

    @Override // com.mapbox.common.ReadStream
    public boolean isReadable() {
        return this.okioBuffer.f183349b > 0;
    }

    @Override // com.mapbox.common.ReadStream
    public Expected<String, Long> read(Buffer commonBuffer) {
        commonBuffer.getClass();
        try {
            ByteBuffer buffer = commonBuffer.getData().getBuffer();
            buffer.getClass();
            long j8 = 0;
            while (isReadable() && buffer.hasRemaining()) {
                int i14 = this.okioBuffer.read(buffer);
                if (i14 == -1) {
                    this.exhausted = true;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j8));
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
                }
                long j14 = i14;
                j8 += j14;
                this.readBytes += j14;
            }
            Expected<String, Long> expectedCreateValue2 = ExpectedFactory.createValue(Long.valueOf(j8));
            expectedCreateValue2.getClass();
            return expectedCreateValue2;
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "Unknown stream error";
            }
            Expected<String, Long> expectedCreateError = ExpectedFactory.createError(message);
            expectedCreateError.getClass();
            return expectedCreateError;
        }
    }

    @Override // com.mapbox.common.ReadStream
    /* JADX INFO: renamed from: readBytes */
    public long getProcessed() {
        return this.readBytes;
    }

    public final void setExhausted(boolean z14) {
        this.exhausted = z14;
    }

    public final void setReadBytes(long j8) {
        this.readBytes = j8;
    }
}
