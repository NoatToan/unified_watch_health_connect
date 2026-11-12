package defpackage;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class gul {
    public static final gul d = new gul();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Boolean f19346b;

    @NotNull
    public final Object c = new Object();

    public static gul a() {
        return d;
    }

    public void b(boolean z) {
        synchronized (this.c) {
            try {
                if (!this.f19345a) {
                    this.f19346b = Boolean.valueOf(z);
                    this.f19345a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
