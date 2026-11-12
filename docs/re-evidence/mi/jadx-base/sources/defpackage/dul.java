package defpackage;

import io.sentry.util.r;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class dul implements iul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iul f15944a;

    public dul() {
        if (a()) {
            this.f15944a = new jvl();
        } else {
            this.f15944a = new nvl();
        }
    }

    public static boolean a() {
        return r.c() && r.b();
    }

    @Override // defpackage.iul
    @NotNull
    public hul now() {
        return this.f15944a.now();
    }
}
