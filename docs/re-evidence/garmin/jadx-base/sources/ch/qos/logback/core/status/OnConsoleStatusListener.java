package ch.qos.logback.core.status;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes7.dex */
public class OnConsoleStatusListener extends OnPrintStreamStatusListenerBase {
    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase
    public PrintStream getPrintStream() {
        return System.out;
    }
}
