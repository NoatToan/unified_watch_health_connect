package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import org.apache.commons.io.output.StringBuilderWriter;

/* JADX INFO: loaded from: classes3.dex */
public class dvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f15960a = File.separatorChar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15961b;

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        f15961b = stringBuilderWriter.toString();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(InputStream inputStream) {
        a(inputStream);
    }

    public static int c(Reader reader, Writer writer) throws IOException {
        long jF = f(reader, writer);
        if (jF > 2147483647L) {
            return -1;
        }
        return (int) jF;
    }

    public static void d(InputStream inputStream, Writer writer) throws IOException {
        c(new InputStreamReader(inputStream), writer);
    }

    public static void e(InputStream inputStream, Writer writer, String str) throws IOException {
        if (str == null) {
            d(inputStream, writer);
        } else {
            c(new InputStreamReader(inputStream, str), writer);
        }
    }

    public static long f(Reader reader, Writer writer) throws IOException {
        return g(reader, writer, new char[4096]);
    }

    public static long g(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (-1 == i) {
                return j;
            }
            writer.write(cArr, 0, i);
            j += (long) i;
        }
    }

    public static String h(InputStream inputStream, String str) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        e(inputStream, stringBuilderWriter, str);
        return stringBuilderWriter.toString();
    }
}
