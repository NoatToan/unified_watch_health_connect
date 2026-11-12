package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class evc {
    public static String a(File file, Charset charset) throws IOException {
        return b(new FileInputStream(file), charset);
    }

    public static String b(InputStream inputStream, Charset charset) throws IOException {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        while (true) {
            try {
                int i = inputStreamReader.read(cArr, 0, 1024);
                if (i < 0) {
                    String string = sb.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb.append(cArr, 0, i);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }
}
