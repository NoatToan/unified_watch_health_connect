package io.sentry.android.core.performance;

import android.os.SystemClock;
import defpackage.hul;
import defpackage.lvl;
import defpackage.yq5;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class e implements Comparable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21575b;
    public long c;
    public long d;
    public long e;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull e eVar) {
        return Long.compare(this.c, eVar.c);
    }

    @Nullable
    public String b() {
        return this.f21574a;
    }

    public long c() {
        if (r()) {
            return this.e - this.d;
        }
        return 0L;
    }

    @Nullable
    public hul d() {
        if (r()) {
            return new lvl(yq5.h(e()));
        }
        return null;
    }

    public long e() {
        if (p()) {
            return this.c + c();
        }
        return 0L;
    }

    public double h() {
        return yq5.i(e());
    }

    @Nullable
    public hul i() {
        if (p()) {
            return new lvl(yq5.h(k()));
        }
        return null;
    }

    public long k() {
        return this.c;
    }

    public double l() {
        return yq5.i(this.c);
    }

    public long m() {
        return this.d;
    }

    public boolean n() {
        return this.d == 0;
    }

    public boolean o() {
        return this.e == 0;
    }

    public boolean p() {
        return this.d != 0;
    }

    public boolean r() {
        return this.e != 0;
    }

    public void s(@Nullable String str) {
        this.f21574a = str;
    }

    @TestOnly
    public void u(long j) {
        this.c = j;
    }

    public void w(long j) {
        this.d = j;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.d;
        this.c = System.currentTimeMillis() - jUptimeMillis;
        this.f21575b = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(jUptimeMillis);
    }

    public void x(long j) {
        this.e = j;
    }

    public void y() {
        this.e = SystemClock.uptimeMillis();
    }
}
