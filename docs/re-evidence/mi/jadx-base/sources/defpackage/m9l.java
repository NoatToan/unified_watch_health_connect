package defpackage;

import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final owp f25920a;

    public m9l(@NotNull owp owpVar, @Nullable ie5 ie5Var) {
        this.f25920a = (owp) p.c(owpVar, "transactionContexts is required");
    }

    @NotNull
    public owp a() {
        return this.f25920a;
    }
}
