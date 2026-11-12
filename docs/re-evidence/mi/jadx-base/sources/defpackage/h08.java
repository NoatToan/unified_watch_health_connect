package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class h08 {

    public interface a {
        void a(String str);
    }

    public static void a(InputStream inputStream, a aVar) throws IOException {
        b(inputStream, false, aVar);
    }

    public static void b(InputStream inputStream, boolean z, a aVar) throws IOException {
        if (inputStream == null || aVar == null) {
            return;
        }
        if (z) {
            try {
                if (!(inputStream instanceof GZIPInputStream)) {
                    inputStream = new GZIPInputStream(inputStream);
                }
            } finally {
                inputStream.close();
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            if (!q08.a(line) && !line.startsWith("###")) {
                aVar.a(line);
            }
        }
    }
}
