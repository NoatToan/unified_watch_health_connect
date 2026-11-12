package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ajo {
    public static long a(InputStream inputStream, long j) throws IOException {
        b6i.g(inputStream);
        b6i.b(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j;
    }
}
