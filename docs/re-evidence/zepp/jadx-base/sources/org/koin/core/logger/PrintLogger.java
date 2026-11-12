package org.koin.core.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lorg/koin/core/logger/PrintLogger;", "Lorg/koin/core/logger/Logger;", "Lorg/koin/core/logger/Level;", FirebaseAnalytics.Param.LEVEL, "", "Lorg/koin/core/logger/MESSAGE;", "msg", "", "log", "<init>", "(Lorg/koin/core/logger/Level;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class PrintLogger extends Logger {
    /* JADX WARN: Multi-variable type inference failed */
    public PrintLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PrintLogger(@NotNull Level level) {
        super(level);
    }

    @Override // org.koin.core.logger.Logger
    public void log(@NotNull Level level, @NotNull String msg) {
        if (getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String().compareTo(level) <= 0) {
            (level.compareTo(Level.ERROR) >= 0 ? System.err : System.out).println(JsonLexerKt.BEGIN_LIST + level + "] [Koin] " + msg);
        }
    }

    public /* synthetic */ PrintLogger(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }
}
