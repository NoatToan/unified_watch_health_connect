package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, d2 = {"fileReadStream", "Lcom/mapbox/common/ReadStream;", "path", "", "memoryReadStream", "str", "asReadStream", "Ljava/io/InputStream;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PlatformStreamFactoryKt {
    public static final ReadStream asReadStream(final InputStream inputStream) {
        inputStream.getClass();
        return new ReadStream() { // from class: com.mapbox.common.PlatformStreamFactoryKt.asReadStream.1
            private boolean exhausted;
            private long processed;

            @Override // com.mapbox.common.ReadStream
            /* JADX INFO: renamed from: isExhausted, reason: from getter */
            public boolean getExhausted() {
                return this.exhausted;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isReadable() {
                return true;
            }

            @Override // com.mapbox.common.ReadStream
            public Expected<String, Long> read(Buffer commonBuffer) {
                commonBuffer.getClass();
                try {
                    ByteBuffer buffer = commonBuffer.getData().getBuffer();
                    buffer.getClass();
                    long j8 = 0;
                    while (j8 < buffer.capacity()) {
                        int i14 = inputStream.read();
                        if (i14 == -1) {
                            this.exhausted = true;
                            break;
                        }
                        buffer.put((byte) i14);
                        j8++;
                    }
                    this.processed += j8;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j8));
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
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
            /* JADX INFO: renamed from: readBytes, reason: from getter */
            public long getProcessed() {
                return this.processed;
            }
        };
    }

    public static final ReadStream fileReadStream(String str) {
        str.getClass();
        return asReadStream(new FileInputStream(new File(str)));
    }

    public static final ReadStream memoryReadStream(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        return asReadStream(new ByteArrayInputStream(bytes));
    }
}
