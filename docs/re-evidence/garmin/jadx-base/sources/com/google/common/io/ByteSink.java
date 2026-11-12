package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class ByteSink {

    public final class AsCharSink extends CharSink {
        private final Charset charset;

        private AsCharSink(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSink
        public Writer openStream() {
            return new OutputStreamWriter(ByteSink.this.openStream(), this.charset);
        }

        public String toString() {
            return ByteSink.this.toString() + ".asCharSink(" + this.charset + ")";
        }
    }

    public CharSink asCharSink(Charset charset) {
        return new AsCharSink(charset);
    }

    public OutputStream openBufferedStream() {
        OutputStream outputStreamOpenStream = openStream();
        return outputStreamOpenStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamOpenStream : new BufferedOutputStream(outputStreamOpenStream);
    }

    public abstract OutputStream openStream();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public void write(byte[] bArr) throws X {
        Preconditions.checkNotNull(bArr);
        Closer closerCreate = Closer.create();
        try {
            OutputStream outputStream = (OutputStream) closerCreate.register(openStream());
            outputStream.write(bArr);
            outputStream.flush();
            closerCreate.close();
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long writeFrom(InputStream inputStream) throws X {
        Preconditions.checkNotNull(inputStream);
        Closer closerCreate = Closer.create();
        try {
            OutputStream outputStream = (OutputStream) closerCreate.register(openStream());
            long jCopy = ByteStreams.copy(inputStream, outputStream);
            outputStream.flush();
            closerCreate.close();
            return jCopy;
        } catch (Throwable th3) {
            try {
                throw closerCreate.rethrow(th3);
            } catch (Throwable th4) {
                closerCreate.close();
                throw th4;
            }
        }
    }
}
