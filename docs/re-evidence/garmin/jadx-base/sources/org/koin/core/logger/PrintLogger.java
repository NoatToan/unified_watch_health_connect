package org.koin.core.logger;

import com.google.firebase.messaging.Constants;
import java.io.PrintStream;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lorg/koin/core/logger/PrintLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "<init>", "(Lorg/koin/core/logger/Level;)V", "printer", "Ljava/io/PrintStream;", "kotlin.jvm.PlatformType", "Ljava/io/PrintStream;", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrintLogger extends Logger {
    private final PrintStream printer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrintLogger(Level level) {
        super(level);
        level.getClass();
        this.printer = level.compareTo(Level.WARNING) >= 0 ? System.err : System.out;
    }

    @Override // org.koin.core.logger.Logger
    public void display(Level level, String msg) {
        level.getClass();
        msg.getClass();
        this.printer.println("[" + level + "] [Koin] " + msg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrintLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PrintLogger(Level level, int i14, j jVar) {
        this((i14 & 1) != 0 ? Level.INFO : level);
    }
}
