package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.huawei.operation.utils.Constants;
import defpackage.aoy;
import defpackage.ape;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ByteSource {
    public abstract InputStream openStream() throws IOException;

    protected ByteSource() {
    }

    public CharSource asCharSource(Charset charset) {
        return new e(charset);
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream inputStreamOpenStream = openStream();
        if (inputStreamOpenStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamOpenStream;
        }
        return new BufferedInputStream(inputStreamOpenStream);
    }

    public ByteSource slice(long j, long j2) {
        return new b(j, j2);
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue() == 0;
        }
        Closer closerB = Closer.b();
        try {
            boolean z = ((InputStream) closerB.b(openStream())).read() == -1;
            closerB.close();
            return z;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    public long size() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue();
        }
        Closer closerB = Closer.b();
        try {
            long jCountBySkipping = countBySkipping((InputStream) closerB.b(openStream()));
            closerB.close();
            return jCountBySkipping;
        } catch (IOException unused) {
            closerB.close();
            Closer closerB2 = Closer.b();
            try {
                long jE = aoy.e((InputStream) closerB2.b(openStream()));
                closerB2.close();
                return jE;
            } catch (Throwable th) {
                try {
                    throw closerB2.e(th);
                } catch (Throwable th2) {
                    closerB2.close();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            closerB.close();
            throw th3;
        }
    }

    private long countBySkipping(InputStream inputStream) throws IOException {
        long j = 0;
        while (true) {
            long jE = aoy.e(inputStream, 2147483647L);
            if (jE <= 0) {
                return j;
            }
            j += jE;
        }
    }

    public long copyTo(OutputStream outputStream) throws Throwable {
        Preconditions.checkNotNull(outputStream);
        Closer closerB = Closer.b();
        try {
            long jE = aoy.e((InputStream) closerB.b(openStream()), outputStream);
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

    public long copyTo(ByteSink byteSink) throws Throwable {
        Preconditions.checkNotNull(byteSink);
        Closer closerB = Closer.b();
        try {
            long jE = aoy.e((InputStream) closerB.b(openStream()), (OutputStream) closerB.b(byteSink.openStream()));
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

    public byte[] read() throws Throwable {
        byte[] bArrA;
        Closer closerB = Closer.b();
        try {
            InputStream inputStream = (InputStream) closerB.b(openStream());
            Optional<Long> optionalSizeIfKnown = sizeIfKnown();
            if (optionalSizeIfKnown.isPresent()) {
                bArrA = aoy.a(inputStream, optionalSizeIfKnown.get().longValue());
            } else {
                bArrA = aoy.a(inputStream);
            }
            closerB.close();
            return bArrA;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    @ParametricNullness
    public <T> T read(ByteProcessor<T> byteProcessor) throws Throwable {
        Preconditions.checkNotNull(byteProcessor);
        Closer closerB = Closer.b();
        try {
            T t = (T) aoy.b((InputStream) closerB.b(openStream()), byteProcessor);
            closerB.close();
            return t;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public HashCode hash(HashFunction hashFunction) throws Throwable {
        Hasher hasherNewHasher = hashFunction.newHasher();
        copyTo(Funnels.e(hasherNewHasher));
        return hasherNewHasher.hash();
    }

    public boolean contentEquals(ByteSource byteSource) throws Throwable {
        int iC;
        Preconditions.checkNotNull(byteSource);
        byte[] bArrB = aoy.b();
        byte[] bArrB2 = aoy.b();
        Closer closerB = Closer.b();
        try {
            InputStream inputStream = (InputStream) closerB.b(openStream());
            InputStream inputStream2 = (InputStream) closerB.b(byteSource.openStream());
            do {
                iC = aoy.c(inputStream, bArrB, 0, bArrB.length);
                if (iC == aoy.c(inputStream2, bArrB2, 0, bArrB2.length) && Arrays.equals(bArrB, bArrB2)) {
                }
                closerB.close();
                return false;
            } while (iC == bArrB.length);
            closerB.close();
            return true;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new c(iterable);
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    public static ByteSource wrap(byte[] bArr) {
        return new d(bArr);
    }

    public static ByteSource empty() {
        return a.d;
    }

    class e extends CharSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Charset f4605b;

        e(Charset charset) {
            this.f4605b = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSource
        public ByteSource asByteSource(Charset charset) {
            if (charset.equals(this.f4605b)) {
                return ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
            return new InputStreamReader(ByteSource.this.openStream(), this.f4605b);
        }

        @Override // com.google.common.io.CharSource
        public String read() throws IOException {
            return new String(ByteSource.this.read(), this.f4605b);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.f4605b + Constants.RIGHT_BRACKET_ONLY;
        }
    }

    final class b extends ByteSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f4600b;
        final long d;

        b(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.d = j;
            this.f4600b = j2;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return b(ByteSource.this.openStream());
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() throws IOException {
            return b(ByteSource.this.openBufferedStream());
        }

        private InputStream b(InputStream inputStream) throws Throwable {
            long j = this.d;
            if (j > 0) {
                try {
                    if (aoy.e(inputStream, j) < this.d) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th) {
                    Closer closerB = Closer.b();
                    closerB.b(inputStream);
                    try {
                        throw closerB.e(th);
                    } catch (Throwable th2) {
                        closerB.close();
                        throw th2;
                    }
                }
            }
            return aoy.d(inputStream, this.f4600b);
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long j3 = this.f4600b - j;
            if (j3 <= 0) {
                return ByteSource.empty();
            }
            return ByteSource.this.slice(this.d + j, Math.min(j2, j3));
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
            return this.f4600b == 0 || super.isEmpty();
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Optional<Long> optionalSizeIfKnown = ByteSource.this.sizeIfKnown();
            if (optionalSizeIfKnown.isPresent()) {
                long jLongValue = optionalSizeIfKnown.get().longValue();
                return Optional.of(Long.valueOf(Math.min(this.f4600b, jLongValue - Math.min(this.d, jLongValue))));
            }
            return Optional.absent();
        }

        public String toString() {
            return ByteSource.this.toString() + ".slice(" + this.d + ", " + this.f4600b + Constants.RIGHT_BRACKET_ONLY;
        }
    }

    static class d extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f4602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4603b;
        final int e;

        d(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        d(byte[] bArr, int i, int i2) {
            this.f4602a = bArr;
            this.f4603b = i;
            this.e = i2;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f4602a, this.f4603b, this.e);
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
            return this.e == 0;
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
            return this.e;
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return Optional.of(Long.valueOf(this.e));
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
            byte[] bArr = this.f4602a;
            int i = this.f4603b;
            return Arrays.copyOfRange(bArr, i, this.e + i);
        }

        @Override // com.google.common.io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
            byteProcessor.processBytes(this.f4602a, this.f4603b, this.e);
            return byteProcessor.getResult();
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.f4602a, this.f4603b, this.e);
            return this.e;
        }

        @Override // com.google.common.io.ByteSource
        public HashCode hash(HashFunction hashFunction) throws IOException {
            return hashFunction.hashBytes(this.f4602a, this.f4603b, this.e);
        }

        @Override // com.google.common.io.ByteSource
        public ByteSource slice(long j, long j2) {
            Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long jMin = Math.min(j, this.e);
            return new d(this.f4602a, this.f4603b + ((int) jMin), (int) Math.min(j2, ((long) this.e) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.f4602a, this.f4603b, this.e), 30, "...") + Constants.RIGHT_BRACKET_ONLY;
        }
    }

    static final class a extends d {
        static final a d = new a();

        a() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.io.ByteSource.d, com.google.common.io.ByteSource
        public byte[] read() {
            return this.f4602a;
        }

        @Override // com.google.common.io.ByteSource.d
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    static final class c extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterable<? extends ByteSource> f4601a;

        c(Iterable<? extends ByteSource> iterable) {
            this.f4601a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return new ape(this.f4601a.iterator());
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() throws IOException {
            Iterator<? extends ByteSource> it = this.f4601a.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Iterable<? extends ByteSource> iterable = this.f4601a;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            Iterator<? extends ByteSource> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalSizeIfKnown = it.next().sizeIfKnown();
                if (!optionalSizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return Optional.of(Long.MAX_VALUE);
                }
            }
            return Optional.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws IOException {
            Iterator<? extends ByteSource> it = this.f4601a.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += it.next().size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        public String toString() {
            return "ByteSource.concat(" + this.f4601a + Constants.RIGHT_BRACKET_ONLY;
        }
    }
}
