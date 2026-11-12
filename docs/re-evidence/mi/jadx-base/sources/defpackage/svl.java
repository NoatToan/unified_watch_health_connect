package defpackage;

import io.sentry.o;
import io.sentry.protocol.r;
import io.sentry.protocol.w;
import io.sentry.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class svl implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f34037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f34038b;

    public svl(@Nullable String str, @Nullable String str2) {
        this.f34037a = str;
        this.f34038b = str2;
    }

    @Override // defpackage.ae8
    @NotNull
    public s a(@NotNull s sVar, @Nullable c8c c8cVar) {
        return (s) d(sVar);
    }

    @Override // defpackage.ae8
    @NotNull
    public w b(@NotNull w wVar, @Nullable c8c c8cVar) {
        return (w) d(wVar);
    }

    @NotNull
    public final <T extends o> T d(@NotNull T t) {
        if (t.C().getRuntime() == null) {
            t.C().setRuntime(new r());
        }
        r runtime = t.C().getRuntime();
        if (runtime != null && runtime.d() == null && runtime.e() == null) {
            runtime.f(this.f34038b);
            runtime.h(this.f34037a);
        }
        return t;
    }

    public svl() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
