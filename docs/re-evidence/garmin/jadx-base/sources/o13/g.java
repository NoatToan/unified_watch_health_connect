package o13;

import java.io.PrintWriter;
import java.io.StringWriter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
public class g {
    public static void a(Throwable th3, Throwable th4) {
        th3.getClass();
        th4.getClass();
        if (th3 != th4) {
            x13.b.f188452a.a(th3, th4);
        }
    }

    public static String b(Throwable th3) {
        th3.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th3.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
