package com.google.common.io;

import com.google.common.base.Preconditions;
import com.huawei.operation.utils.Constants;
import defpackage.aoy;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ByteSink {
    public abstract OutputStream openStream() throws IOException;

    protected ByteSink() {
    }

    public CharSink asCharSink(Charset charset) {
        return new e(charset);
    }

    public OutputStream openBufferedStream() throws IOException {
        OutputStream outputStreamOpenStream = openStream();
        if (outputStreamOpenStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStreamOpenStream;
        }
        return new BufferedOutputStream(outputStreamOpenStream);
    }

    public void write(byte[] bArr) throws Throwable {
        Preconditions.checkNotNull(bArr);
        Closer closerB = Closer.b();
        try {
            OutputStream outputStream = (OutputStream) closerB.b(openStream());
            outputStream.write(bArr);
            outputStream.flush();
            closerB.close();
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public long writeFrom(InputStream inputStream) throws Throwable {
        Preconditions.checkNotNull(inputStream);
        Closer closerB = Closer.b();
        try {
            OutputStream outputStream = (OutputStream) closerB.b(openStream());
            long jE = aoy.e(inputStream, outputStream);
            outputStream.flush();
            closerB.close();
            return jE;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    final class e extends CharSink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Charset f4597a;

        private e(Charset charset) {
            this.f4597a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSink
        public Writer openStream() throws IOException {
            return new OutputStreamWriter(ByteSink.this.openStream(), this.f4597a);
        }

        public String toString() {
            return ByteSink.this.toString() + ".asCharSink(" + this.f4597a + Constants.RIGHT_BRACKET_ONLY;
        }
    }
}
