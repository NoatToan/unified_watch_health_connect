package defpackage;

import io.sentry.Session;
import io.sentry.protocol.n;
import io.sentry.q;
import io.sentry.util.p;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class jul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q f23151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Iterable<fvl> f23152b;

    public jul(@NotNull q qVar, @NotNull Iterable<fvl> iterable) {
        this.f23151a = (q) p.c(qVar, "SentryEnvelopeHeader is required.");
        this.f23152b = (Iterable) p.c(iterable, "SentryEnvelope items are required.");
    }

    @NotNull
    public static jul a(@NotNull eyc eycVar, @NotNull Session session, @Nullable n nVar) throws IOException {
        p.c(eycVar, "Serializer is required.");
        p.c(session, "session is required.");
        return new jul(null, nVar, fvl.C(eycVar, session));
    }

    @NotNull
    public q b() {
        return this.f23151a;
    }

    @NotNull
    public Iterable<fvl> c() {
        return this.f23152b;
    }

    public jul(@Nullable io.sentry.protocol.p pVar, @Nullable n nVar, @NotNull fvl fvlVar) {
        p.c(fvlVar, "SentryEnvelopeItem is required.");
        this.f23151a = new q(pVar, nVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(fvlVar);
        this.f23152b = arrayList;
    }
}
