package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IORunnable;
import org.apache.commons.io.function.IOTriConsumer;
import org.apache.commons.io.function.Uncheck;

/* JADX INFO: loaded from: classes46.dex */
public final class UncheckedFilterOutputStream extends FilterOutputStream {

    public static class Builder extends AbstractStreamBuilder<UncheckedFilterOutputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterOutputStream get() throws IOException {
            return new UncheckedFilterOutputStream(getOutputStream());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private UncheckedFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda4
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                this.f$0.m2270x705c6664();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$close$0$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2270x705c6664() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                this.f$0.m2271x3ee88f7();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$flush$1$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2271x3ee88f7() throws IOException {
        super.flush();
    }

    /* JADX INFO: renamed from: lambda$write$2$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2272x6026fe5b(byte[] bArr) throws IOException {
        super.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.m2272x6026fe5b((byte[]) obj);
            }
        }, bArr);
    }

    /* JADX INFO: renamed from: lambda$write$3$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2273xed14157a(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) throws IOException {
                this.f$0.m2273xed14157a((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: lambda$write$4$org-apache-commons-io-output-UncheckedFilterOutputStream, reason: not valid java name */
    /* synthetic */ void m2274x7a012c99(int i) throws IOException {
        super.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.output.UncheckedFilterOutputStream$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.m2274x7a012c99(((Integer) obj).intValue());
            }
        }, Integer.valueOf(i));
    }
}
