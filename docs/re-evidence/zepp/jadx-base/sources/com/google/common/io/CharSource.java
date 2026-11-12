package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
public abstract class CharSource {

    public final class a extends ByteSource {
        public final Charset a;

        public a(Charset charset) {
            this.a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
            return charset.equals(this.a) ? CharSource.this : super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return new f(CharSource.this.openStream(), this.a, 8192);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.a + ")";
        }
    }

    public static class b extends CharSource {
        private static final Splitter b = Splitter.onPattern("\r\n|\n|\r");
        public final CharSequence a;

        public class a extends AbstractIterator<String> {
            public Iterator<String> c;

            public a() {
                this.c = b.b.split(b.this.a).iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public String computeNext() {
                if (this.c.hasNext()) {
                    String next = this.c.next();
                    if (this.c.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        public b(CharSequence charSequence) {
            this.a = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        private Iterator<String> c() {
            return new a();
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
            return this.a.length() == 0;
        }

        @Override // com.google.common.io.CharSource
        public long length() {
            return this.a.length();
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.of(Long.valueOf(this.a.length()));
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() {
            return new com.google.common.io.b(this.a);
        }

        @Override // com.google.common.io.CharSource
        public String read() {
            return this.a.toString();
        }

        @Override // com.google.common.io.CharSource
        public String readFirstLine() {
            Iterator<String> itC = c();
            if (itC.hasNext()) {
                return itC.next();
            }
            return null;
        }

        @Override // com.google.common.io.CharSource
        public ImmutableList<String> readLines() {
            return ImmutableList.copyOf(c());
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.a, 30, "...") + ")";
        }

        @Override // com.google.common.io.CharSource
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
            Iterator<String> itC = c();
            while (itC.hasNext() && lineProcessor.processLine(itC.next())) {
            }
            return lineProcessor.getResult();
        }
    }

    public static final class c extends CharSource {
        private final Iterable<? extends CharSource> a;

        public c(Iterable<? extends CharSource> iterable) {
            this.a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws IOException {
            Iterator<? extends CharSource> it2 = this.a.iterator();
            while (it2.hasNext()) {
                if (!it2.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public long length() throws IOException {
            Iterator<? extends CharSource> it2 = this.a.iterator();
            long length = 0;
            while (it2.hasNext()) {
                length += it2.next().length();
            }
            return length;
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            Iterator<? extends CharSource> it2 = this.a.iterator();
            long jLongValue = 0;
            while (it2.hasNext()) {
                Optional<Long> optionalLengthIfKnown = it2.next().lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return Optional.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
            return new com.google.common.io.e(this.a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.a + ")";
        }
    }

    public static final class d extends e {
        private static final d c = new d();

        private d() {
            super("");
        }

        @Override // com.google.common.io.CharSource.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    private long a(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new c(iterable);
    }

    public static CharSource empty() {
        return d.c;
    }

    public static CharSource wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new e((String) charSequence) : new b(charSequence);
    }

    @Beta
    public ByteSource asByteSource(Charset charset) {
        return new a(charset);
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws Throwable {
        Preconditions.checkNotNull(appendable);
        Closer closerCreate = Closer.create();
        try {
            long jCopy = CharStreams.copy((Reader) closerCreate.register(openStream()), appendable);
            closerCreate.close();
            return jCopy;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        Closer closerCreate = Closer.create();
        try {
            boolean z = ((Reader) closerCreate.register(openStream())).read() == -1;
            closerCreate.close();
            return z;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @Beta
    public long length() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        Closer closerCreate = Closer.create();
        try {
            long jA = a((Reader) closerCreate.register(openStream()));
            closerCreate.close();
            return jA;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @Beta
    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws Throwable {
        Closer closerCreate = Closer.create();
        try {
            String string = CharStreams.toString((Reader) closerCreate.register(openStream()));
            closerCreate.close();
            return string;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @NullableDecl
    public String readFirstLine() throws Throwable {
        Closer closerCreate = Closer.create();
        try {
            String line = ((BufferedReader) closerCreate.register(openBufferedStream())).readLine();
            closerCreate.close();
            return line;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public ImmutableList<String> readLines() throws Throwable {
        Closer closerCreate = Closer.create();
        try {
            BufferedReader bufferedReader = (BufferedReader) closerCreate.register(openBufferedStream());
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListNewArrayList);
                    closerCreate.close();
                    return immutableListCopyOf;
                }
                arrayListNewArrayList.add(line);
            }
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public static class e extends b {
        public e(String str) {
            super(str);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.a);
            return this.a.length();
        }

        @Override // com.google.common.io.CharSource.b, com.google.common.io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.a);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(CharSink charSink) throws Throwable {
            Preconditions.checkNotNull(charSink);
            Closer closerCreate = Closer.create();
            try {
                ((Writer) closerCreate.register(charSink.openStream())).write((String) this.a);
                long length = this.a.length();
                closerCreate.close();
                return length;
            } catch (Throwable th) {
                try {
                    throw closerCreate.rethrow(th);
                } catch (Throwable th2) {
                    closerCreate.close();
                    throw th2;
                }
            }
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it2) {
        return concat(ImmutableList.copyOf(it2));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws Throwable {
        Preconditions.checkNotNull(charSink);
        Closer closerCreate = Closer.create();
        try {
            long jCopy = CharStreams.copy((Reader) closerCreate.register(openStream()), (Writer) closerCreate.register(charSink.openStream()));
            closerCreate.close();
            return jCopy;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    @CanIgnoreReturnValue
    @Beta
    public <T> T readLines(LineProcessor<T> lineProcessor) throws Throwable {
        Preconditions.checkNotNull(lineProcessor);
        Closer closerCreate = Closer.create();
        try {
            T t = (T) CharStreams.readLines((Reader) closerCreate.register(openStream()), lineProcessor);
            closerCreate.close();
            return t;
        } catch (Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }
}
