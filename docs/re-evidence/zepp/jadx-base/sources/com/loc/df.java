package com.loc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes18.dex */
public final class df {
    private static volatile dg a;

    public static void a(Throwable th) {
        if (cu.a) {
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (cause instanceof UnknownHostException) {
                    return;
                }
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.toString();
        }
    }
}
