package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class udp {
    public static String a(@NotNull Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
