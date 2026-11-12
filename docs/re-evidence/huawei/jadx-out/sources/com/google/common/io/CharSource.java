package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.huawei.operation.utils.Constants;
import defpackage.aml;
import defpackage.apb;
import defpackage.apc;
import defpackage.apf;
import defpackage.aph;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharSource {
    public abstract Reader openStream() throws IOException;

    protected CharSource() {
    }

    public ByteSource asByteSource(Charset charset) {
        return new e(charset);
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader readerOpenStream = openStream();
        if (readerOpenStream instanceof BufferedReader) {
            return (BufferedReader) readerOpenStream;
        }
        return new BufferedReader(readerOpenStream);
    }

    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public long length() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        Closer closerB = Closer.b();
        try {
            long jCountBySkipping = countBySkipping((Reader) closerB.b(openStream()));
            closerB.close();
            return jCountBySkipping;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    private long countBySkipping(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public long copyTo(Appendable appendable) throws Throwable {
        Preconditions.checkNotNull(appendable);
        Closer closerB = Closer.b();
        try {
            long jD = apc.d((Reader) closerB.b(openStream()), appendable);
            closerB.close();
            return jD;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public long copyTo(CharSink charSink) throws Throwable {
        Preconditions.checkNotNull(charSink);
        Closer closerB = Closer.b();
        try {
            long jD = apc.d((Reader) closerB.b(openStream()), (Writer) closerB.b(charSink.openStream()));
            closerB.close();
            return jD;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public String read() throws Throwable {
        Closer closerB = Closer.b();
        try {
            String strE = apc.e((Reader) closerB.b(openStream()));
            closerB.close();
            return strE;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    @CheckForNull
    public String readFirstLine() throws Throwable {
        Closer closerB = Closer.b();
        try {
            String line = ((BufferedReader) closerB.b(openBufferedStream())).readLine();
            closerB.close();
            return line;
        } catch (Throwable th) {
            try {
                throw closerB.e(th);
            } catch (Throwable th2) {
                closerB.close();
                throw th2;
            }
        }
    }

    public ImmutableList<String> readLines() throws Throwable {
        Closer closerB = Closer.b();
        try {
            BufferedReader bufferedReader = (BufferedReader) closerB.b(openBufferedStream());
            ArrayList arrayListE = aml.e();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    arrayListE.add(line);
                } else {
                    ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListE);
                    closerB.close();
                    return immutableListCopyOf;
                }
            }
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
    public <T> T readLines(LineProcessor<T> lineProcessor) throws Throwable {
        Preconditions.checkNotNull(lineProcessor);
        Closer closerB = Closer.b();
        try {
            T t = (T) apc.d((Reader) closerB.b(openStream()), lineProcessor);
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

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        Closer closerB = Closer.b();
        try {
            boolean z = ((Reader) closerB.b(openStream())).read() == -1;
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

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new c(iterable);
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    public static CharSource wrap(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return new d((String) charSequence);
        }
        return new b(charSequence);
    }

    public static CharSource empty() {
        return a.f4606a;
    }

    final class e extends ByteSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f4608a;

        e(Charset charset) {
            this.f4608a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
            if (charset.equals(this.f4608a)) {
                return CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return new apf(CharSource.this.openStream(), this.f4608a, 8192);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.f4608a + Constants.RIGHT_BRACKET_ONLY;
        }
    }

    static class b extends CharSource {
        private static final Splitter d = Splitter.onPattern("\r\n|\n|\r");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final CharSequence f4607b;

        protected b(CharSequence charSequence) {
            this.f4607b = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() {
            return new apb(this.f4607b);
        }

        @Override // com.google.common.io.CharSource
        public String read() {
            return this.f4607b.toString();
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
            return this.f4607b.length() == 0;
        }

        @Override // com.google.common.io.CharSource
        public long length() {
            return this.f4607b.length();
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.of(Long.valueOf(this.f4607b.length()));
        }

        private Iterator<String> c() {
            return new AbstractIterator<String>() { // from class: com.google.common.io.CharSource.b.2
                Iterator<String> e;

                {
                    this.e = b.d.split(b.this.f4607b).iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public String computeNext() {
                    if (this.e.hasNext()) {
                        String next = this.e.next();
                        if (this.e.hasNext() || !next.isEmpty()) {
                            return next;
                        }
                    }
                    return endOfData();
                }
            };
        }

        @Override // com.google.common.io.CharSource
        @CheckForNull
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

        @Override // com.google.common.io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
            Iterator<String> itC = c();
            while (itC.hasNext() && lineProcessor.processLine(itC.next())) {
            }
            return lineProcessor.getResult();
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.f4607b, 30, "...") + Constants.RIGHT_BRACKET_ONLY;
        }
    }

    static class d extends b {
        protected d(String str) {
            super(str);
        }

        @Override // com.google.common.io.CharSource.b, com.google.common.io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.f4607b);
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.f4607b);
            return this.f4607b.length();
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(CharSink charSink) throws Throwable {
            Preconditions.checkNotNull(charSink);
            Closer closerB = Closer.b();
            try {
                ((Writer) closerB.b(charSink.openStream())).write((String) this.f4607b);
                long length = this.f4607b.length();
                closerB.close();
                return length;
            } catch (Throwable th) {
                try {
                    throw closerB.e(th);
                } catch (Throwable th2) {
                    closerB.close();
                    throw th2;
                }
            }
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f4606a = new a();

        private a() {
            super("");
        }

        @Override // com.google.common.io.CharSource.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    static final class c extends CharSource {
        private final Iterable<? extends CharSource> e;

        c(Iterable<? extends CharSource> iterable) {
            this.e = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
            return new aph(this.e.iterator());
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws IOException {
            Iterator<? extends CharSource> it = this.e.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
            Iterator<? extends CharSource> it = this.e.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalLengthIfKnown = it.next().lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return Optional.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.CharSource
        public long length() throws IOException {
            Iterator<? extends CharSource> it = this.e.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        public String toString() {
            return "CharSource.concat(" + this.e + Constants.RIGHT_BRACKET_ONLY;
        }
    }
}
