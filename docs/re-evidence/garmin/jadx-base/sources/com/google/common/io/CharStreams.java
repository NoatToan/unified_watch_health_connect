package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    private CharStreams() {
    }

    public static Writer asWriter(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    @CanIgnoreReturnValue
    public static long copy(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? copyReaderToBuilder((Reader) readable, (StringBuilder) appendable) : copyReaderToWriter((Reader) readable, asWriter(appendable));
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charBufferCreateBuffer = createBuffer();
        long jRemaining = 0;
        while (readable.read(charBufferCreateBuffer) != -1) {
            Java8Compatibility.flip(charBufferCreateBuffer);
            appendable.append(charBufferCreateBuffer);
            jRemaining += (long) charBufferCreateBuffer.remaining();
            Java8Compatibility.clear(charBufferCreateBuffer);
        }
        return jRemaining;
    }

    @CanIgnoreReturnValue
    public static long copyReaderToBuilder(Reader reader, StringBuilder sb3) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(sb3);
        char[] cArr = new char[2048];
        long j8 = 0;
        while (true) {
            int i14 = reader.read(cArr);
            if (i14 == -1) {
                return j8;
            }
            sb3.append(cArr, 0, i14);
            j8 += (long) i14;
        }
    }

    @CanIgnoreReturnValue
    public static long copyReaderToWriter(Reader reader, Writer writer) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j8 = 0;
        while (true) {
            int i14 = reader.read(cArr);
            if (i14 == -1) {
                return j8;
            }
            writer.write(cArr, 0, i14);
            j8 += (long) i14;
        }
    }

    public static CharBuffer createBuffer() {
        return CharBuffer.allocate(2048);
    }

    @CanIgnoreReturnValue
    public static long exhaust(Readable readable) {
        CharBuffer charBufferCreateBuffer = createBuffer();
        long j8 = 0;
        while (true) {
            long j14 = readable.read(charBufferCreateBuffer);
            if (j14 == -1) {
                return j8;
            }
            j8 += j14;
            Java8Compatibility.clear(charBufferCreateBuffer);
        }
    }

    public static Writer nullWriter() {
        return NullWriter.INSTANCE;
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> lineProcessor) {
        String line;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineProcessor);
        LineReader lineReader = new LineReader(readable);
        do {
            line = lineReader.readLine();
            if (line == null) {
                break;
            }
        } while (lineProcessor.processLine(line));
        return lineProcessor.getResult();
    }

    public static void skipFully(Reader reader, long j8) throws IOException {
        Preconditions.checkNotNull(reader);
        while (j8 > 0) {
            long jSkip = reader.skip(j8);
            if (jSkip == 0) {
                h.m();
                return;
            }
            j8 -= jSkip;
        }
    }

    public static String toString(Readable readable) {
        return toStringBuilder(readable).toString();
    }

    private static StringBuilder toStringBuilder(Readable readable) throws IOException {
        StringBuilder sb3 = new StringBuilder();
        if (readable instanceof Reader) {
            copyReaderToBuilder((Reader) readable, sb3);
            return sb3;
        }
        copy(readable, sb3);
        return sb3;
    }

    public static final class NullWriter extends Writer {
        private static final NullWriter INSTANCE = new NullWriter();

        private NullWriter() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(String str, int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15 + i14, str.length());
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            Preconditions.checkNotNull(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15 + i14, cArr.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public void write(int i14) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c14) {
            return this;
        }
    }

    public static List<String> readLines(Readable readable) {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(readable);
        while (true) {
            String line = lineReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }
}
