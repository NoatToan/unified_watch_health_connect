package nh;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public class d {
    public static void a(Throwable th3) {
        try {
            StringWriter stringWriter = new StringWriter();
            th3.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        } catch (Throwable unused) {
        }
    }
}
