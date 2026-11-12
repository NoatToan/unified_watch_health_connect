package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ElementTypesAreNonnullByDefault;
import com.google.common.io.LineProcessor;
import com.google.common.io.ParametricNullness;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apc {
    static CharBuffer a() {
        return CharBuffer.allocate(2048);
    }

    public static long d(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            if (appendable instanceof StringBuilder) {
                return c((Reader) readable, (StringBuilder) appendable);
            }
            return b((Reader) readable, a(appendable));
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charBufferA = a();
        long jRemaining = 0;
        while (readable.read(charBufferA) != -1) {
            apd.b(charBufferA);
            appendable.append(charBufferA);
            jRemaining += (long) charBufferA.remaining();
            apd.d(charBufferA);
        }
        return jRemaining;
    }

    static long c(Reader reader, StringBuilder sb) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(sb);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (i == -1) {
                return j;
            }
            sb.append(cArr, 0, i);
            j += (long) i;
        }
    }

    static long b(Reader reader, Writer writer) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (i == -1) {
                return j;
            }
            writer.write(cArr, 0, i);
            j += (long) i;
        }
    }

    public static String e(Readable readable) throws IOException {
        return c(readable).toString();
    }

    private static StringBuilder c(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            c((Reader) readable, sb);
            return sb;
        }
        d(readable, sb);
        return sb;
    }

    @ParametricNullness
    public static <T> T d(Readable readable, LineProcessor<T> lineProcessor) throws IOException {
        String strC;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineProcessor);
        apg apgVar = new apg(readable);
        do {
            strC = apgVar.c();
            if (strC == null) {
                break;
            }
        } while (lineProcessor.processLine(strC));
        return lineProcessor.getResult();
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new aoz(appendable);
    }
}
