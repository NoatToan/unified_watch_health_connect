package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum SentryLevel implements cud {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements fsd<SentryLevel> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SentryLevel a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            return SentryLevel.valueOf(f4hVar.nextString().toUpperCase(Locale.ROOT));
        }
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.c(name().toLowerCase(Locale.ROOT));
    }
}
