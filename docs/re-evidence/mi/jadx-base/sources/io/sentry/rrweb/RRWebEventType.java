package io.sentry.rrweb;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum RRWebEventType implements cud {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class a implements fsd<RRWebEventType> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RRWebEventType a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            return RRWebEventType.values()[f4hVar.nextInt()];
        }
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.d(ordinal());
    }
}
