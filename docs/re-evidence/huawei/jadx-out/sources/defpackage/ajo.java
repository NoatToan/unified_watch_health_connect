package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.cache.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ajo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f486c;
    private final long d;
    private final long e;
    private final long f;

    public ajo(long j, long j2, long j3, long j4, long j5, long j6) {
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j4 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        this.d = j;
        this.f485b = j2;
        this.f484a = j3;
        this.f486c = j4;
        this.f = j5;
        this.e = j6;
    }

    public long d() {
        return this.d;
    }

    public long c() {
        return this.f485b;
    }

    public long a() {
        return this.f484a;
    }

    public long e() {
        return this.f486c;
    }

    public long f() {
        return this.f;
    }

    public long b() {
        return this.e;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.d), Long.valueOf(this.f485b), Long.valueOf(this.f484a), Long.valueOf(this.f486c), Long.valueOf(this.f), Long.valueOf(this.e));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof ajo)) {
            return false;
        }
        ajo ajoVar = (ajo) obj;
        return this.d == ajoVar.d && this.f485b == ajoVar.f485b && this.f484a == ajoVar.f484a && this.f486c == ajoVar.f486c && this.f == ajoVar.f && this.e == ajoVar.e;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("hitCount", this.d).add("missCount", this.f485b).add("loadSuccessCount", this.f484a).add("loadExceptionCount", this.f486c).add("totalLoadTime", this.f).add("evictionCount", this.e).toString();
    }
}
