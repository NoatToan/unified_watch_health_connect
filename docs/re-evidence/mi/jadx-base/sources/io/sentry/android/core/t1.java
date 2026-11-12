package io.sentry.android.core;

import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21592b;
    public long c;
    public long d;
    public long e;

    public void a(long j, long j2, boolean z, boolean z2) {
        this.e += j;
        if (z2) {
            this.d += j2;
            this.f21592b++;
        } else if (z) {
            this.c += j2;
            this.f21591a++;
        }
    }

    public int b() {
        return this.f21592b;
    }

    public long c() {
        return this.d;
    }

    public int d() {
        return this.f21591a;
    }

    public long e() {
        return this.c;
    }

    public int f() {
        return this.f21591a + this.f21592b;
    }

    public long g() {
        return this.e;
    }
}
