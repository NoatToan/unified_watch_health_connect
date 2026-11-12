package defpackage;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ivl extends hul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Instant f22143a;

    public ivl() {
        this(Instant.now());
    }

    @Override // defpackage.hul
    public long h() {
        return yq5.m(this.f22143a.getEpochSecond()) + ((long) this.f22143a.getNano());
    }

    public ivl(@NotNull Instant instant) {
        this.f22143a = instant;
    }
}
