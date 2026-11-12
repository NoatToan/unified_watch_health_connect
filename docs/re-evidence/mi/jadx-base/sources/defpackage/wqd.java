package defpackage;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class wqd implements vvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Runtime f38253a = Runtime.getRuntime();

    @Override // defpackage.vvc
    public void c() {
    }

    @Override // defpackage.vvc
    public void d(@NotNull sqh sqhVar) {
        sqhVar.b(new lpf(System.currentTimeMillis(), this.f38253a.totalMemory() - this.f38253a.freeMemory()));
    }
}
