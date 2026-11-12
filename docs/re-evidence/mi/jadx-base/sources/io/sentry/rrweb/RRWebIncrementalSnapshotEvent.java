package io.sentry.rrweb;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RRWebIncrementalSnapshotEvent extends io.sentry.rrweb.b {
    public IncrementalSource c;

    public enum IncrementalSource implements cud {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements fsd<IncrementalSource> {
            @Override // defpackage.fsd
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public IncrementalSource a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
                return IncrementalSource.values()[f4hVar.nextInt()];
            }
        }

        @Override // defpackage.cud
        public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.d(ordinal());
        }
    }

    public static final class a {
        public boolean a(@NotNull RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, @NotNull String str, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            if (!str.equals("source")) {
                return false;
            }
            rRWebIncrementalSnapshotEvent.c = (IncrementalSource) p.c((IncrementalSource) f4hVar.A(iLogger, new IncrementalSource.a()), "");
            return true;
        }
    }

    public static final class b {
        public void a(@NotNull RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, @NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.g("source").j(iLogger, rRWebIncrementalSnapshotEvent.c);
        }
    }

    public RRWebIncrementalSnapshotEvent(@NotNull IncrementalSource incrementalSource) {
        super(RRWebEventType.IncrementalSnapshot);
        this.c = incrementalSource;
    }
}
