package org.koin.core.logger;

import com.google.firebase.messaging.Constants;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000bJ)\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lorg/koin/core/logger/Logger;", "", "Lorg/koin/core/logger/Level;", "level", "<init>", "(Lorg/koin/core/logger/Level;)V", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "(Lorg/koin/core/logger/Level;Ljava/lang/String;)V", "debug", "(Ljava/lang/String;)V", "info", "warn", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "lvl", "", "isAt", "(Lorg/koin/core/logger/Level;)Z", "log", "Lkotlin/Function0;", "(Lorg/koin/core/logger/Level;Le23/a;)V", "Lorg/koin/core/logger/Level;", "getLevel", "()Lorg/koin/core/logger/Level;", "setLevel", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Logger {
    private Level level;

    public /* synthetic */ Logger(Level level, int i14, j jVar) {
        this((i14 & 1) != 0 ? Level.INFO : level);
    }

    public final void debug(String msg) {
        msg.getClass();
        log(Level.DEBUG, msg);
    }

    public abstract void display(Level level, String msg);

    public final void error(String msg) {
        msg.getClass();
        log(Level.ERROR, msg);
    }

    public final Level getLevel() {
        return this.level;
    }

    public final void info(String msg) {
        msg.getClass();
        log(Level.INFO, msg);
    }

    public final boolean isAt(Level lvl) {
        lvl.getClass();
        return getLevel().compareTo(lvl) <= 0;
    }

    public final void log(Level lvl, a<String> msg) {
        lvl.getClass();
        msg.getClass();
        if (getLevel().compareTo(lvl) <= 0) {
            display(lvl, msg.invoke());
        }
    }

    public final void setLevel(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void warn(String msg) {
        msg.getClass();
        log(Level.WARNING, msg);
    }

    public Logger(Level level) {
        level.getClass();
        this.level = level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Logger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void log(Level lvl, String msg) {
        lvl.getClass();
        msg.getClass();
        if (getLevel().compareTo(lvl) <= 0) {
            display(lvl, msg);
        }
    }
}
