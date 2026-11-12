package org.koin.core.logger;

import p005kotlin.Metadata;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/koin/core/logger/Level;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    NONE;

    private static final /* synthetic */ a $ENTRIES = b.g(values());

    public static a<Level> getEntries() {
        return $ENTRIES;
    }
}
