package defpackage;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class bse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4561b;

    public bse(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    public long a() {
        return this.f4561b;
    }

    public long b() {
        return this.f4560a;
    }

    public String toString() {
        return this.f4560a + "/" + this.f4561b;
    }

    public bse(long j, long j2) {
        this.f4560a = j;
        this.f4561b = j2;
    }
}
