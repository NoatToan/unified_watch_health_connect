package org.koin.core.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&J\u0012\u0010\f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007J\u0012\u0010\r\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007J\u0012\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lorg/koin/core/logger/Logger;", "", "Lorg/koin/core/logger/Level;", FirebaseAnalytics.Param.LEVEL, "", "a", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "", "b", "log", "debug", "info", "error", "lvl", "isAt", "Lkotlin/Function0;", "Lorg/koin/core/logger/Level;", "getLevel", "()Lorg/koin/core/logger/Level;", "setLevel", "(Lorg/koin/core/logger/Level;)V", "<init>", "koin-core"}, k = 1, mv = {1, 5, 1})
public abstract class Logger {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Level level;

    /* JADX WARN: Multi-variable type inference failed */
    public Logger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Logger(@NotNull Level level) {
        this.level = level;
    }

    private final boolean a(Level level) {
        return this.level.compareTo(level) <= 0;
    }

    private final void b(Level level, String msg) {
        if (a(level)) {
            log(level, msg);
        }
    }

    public final void debug(@NotNull String msg) {
        b(Level.DEBUG, msg);
    }

    public final void error(@NotNull String msg) {
        b(Level.ERROR, msg);
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    public final void info(@NotNull String msg) {
        b(Level.INFO, msg);
    }

    public final boolean isAt(@NotNull Level lvl) {
        return this.level.compareTo(lvl) <= 0;
    }

    public abstract void log(@NotNull Level level, @NotNull String msg);

    public final void log(@NotNull Level lvl, @NotNull Function0<String> msg) {
        if (isAt(lvl)) {
            b(lvl, msg.invoke());
        }
    }

    public final void setLevel(@NotNull Level level) {
        this.level = level;
    }

    public /* synthetic */ Logger(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }
}
