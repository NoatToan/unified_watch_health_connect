package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IORunnable;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.IOTriFunction;
import org.apache.commons.io.function.Uncheck;

/* JADX INFO: loaded from: classes46.dex */
public final class UncheckedFilterInputStream extends FilterInputStream {

    public static class Builder extends AbstractStreamBuilder<UncheckedFilterInputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterInputStream get() {
            return (UncheckedFilterInputStream) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$Builder$$ExternalSyntheticLambda0
                @Override // org.apache.commons.io.function.IOSupplier
                public final Object get() {
                    return this.f$0.m2255xbffad909();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$get$0$org-apache-commons-io-input-UncheckedFilterInputStream$Builder, reason: not valid java name */
        /* synthetic */ UncheckedFilterInputStream m2255xbffad909() throws IOException {
            return new UncheckedFilterInputStream(getInputStream());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private UncheckedFilterInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda4
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return this.f$0.m2248xe65b9a5f();
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: lambda$available$0$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ Integer m2248xe65b9a5f() throws IOException {
        return Integer.valueOf(super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IORunnable
            public final void run() throws IOException {
                this.f$0.m2249x2286bf6f();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$close$1$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ void m2249x2286bf6f() throws IOException {
        super.close();
    }

    /* JADX INFO: renamed from: lambda$read$2$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ Integer m2250x2766e7d6() throws IOException {
        return Integer.valueOf(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws UncheckedIOException {
        return ((Integer) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return this.f$0.m2250x2766e7d6();
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: lambda$read$3$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ Integer m2251x289d3ab5(byte[] bArr) throws IOException {
        return Integer.valueOf(super.read(bArr));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda6
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.m2251x289d3ab5((byte[]) obj);
            }
        }, bArr)).intValue();
    }

    /* JADX INFO: renamed from: lambda$read$4$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ Integer m2252x29d38d94(byte[] bArr, int i, int i2) throws IOException {
        return Integer.valueOf(super.read(bArr, i, i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws UncheckedIOException {
        return ((Integer) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return this.f$0.m2252x29d38d94((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    /* JADX INFO: renamed from: lambda$reset$5$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ void m2253x2dd38774() throws IOException {
        super.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws UncheckedIOException {
        synchronized (this) {
            Uncheck.run(new IORunnable() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda1
                @Override // org.apache.commons.io.function.IORunnable
                public final void run() throws IOException {
                    this.f$0.m2253x2dd38774();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$skip$6$org-apache-commons-io-input-UncheckedFilterInputStream, reason: not valid java name */
    /* synthetic */ Long m2254x2b981389(long j) throws IOException {
        return Long.valueOf(super.skip(j));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws UncheckedIOException {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.input.UncheckedFilterInputStream$$ExternalSyntheticLambda5
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return this.f$0.m2254x2b981389(((Long) obj).longValue());
            }
        }, Long.valueOf(j))).longValue();
    }
}
