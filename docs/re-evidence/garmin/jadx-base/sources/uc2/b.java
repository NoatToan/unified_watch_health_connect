package uc2;

import am.j;
import p005kotlin.Metadata;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luc2/b;", "", "", "serverResponseCode", "", "serverResponseCodeTimestampUTC", "retryAfterSeconds", "retryAfterTimestampUTC", "<init>", "(IJIJ)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f170002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f170003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f170004d;

    public b(int i14, long j8, int i15, long j14) {
        this.f170001a = i14;
        this.f170002b = j8;
        this.f170003c = i15;
        this.f170004d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f170001a == bVar.f170001a && this.f170002b == bVar.f170002b && this.f170003c == bVar.f170003c && this.f170004d == bVar.f170004d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170004d) + q2.d(this.f170003c, f.e(Integer.hashCode(this.f170001a) * 31, 31, this.f170002b), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RateLimitData(serverResponseCode=");
        sb3.append(this.f170001a);
        sb3.append(", serverResponseCodeTimestampUTC=");
        sb3.append(this.f170002b);
        sb3.append(", retryAfterSeconds=");
        sb3.append(this.f170003c);
        sb3.append(", retryAfterTimestampUTC=");
        return j.i(this.f170004d, ")", sb3);
    }
}
