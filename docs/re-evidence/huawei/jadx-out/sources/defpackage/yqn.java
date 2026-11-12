package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes20.dex */
public class yqn {
    public static String c(InputStream inputStream, String str) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                c(inputStreamReader, stringWriter);
                String string = stringWriter.toString();
                stringWriter.close();
                inputStreamReader.close();
                return string;
            } catch (Throwable th) {
                try {
                    stringWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                inputStreamReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static long d(Reader reader, Writer writer, char[] cArr) throws IOException {
        int i = reader.read(cArr);
        long j = 0;
        while (-1 != i) {
            writer.write(cArr, 0, i);
            j += (long) i;
            i = reader.read(cArr);
        }
        return j;
    }

    public static long c(Reader reader, Writer writer) throws IOException {
        return d(reader, writer, new char[4096]);
    }
}
