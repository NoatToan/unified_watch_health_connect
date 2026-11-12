package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class w6s extends r6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6s f37673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37674b;
    public final long c;

    public w6s(r6s r6sVar, long j, long j2, boolean z) {
        this.f37673a = r6sVar;
        long jD = d(j);
        this.f37674b = jD;
        this.c = d(jD + j2);
    }

    @Override // defpackage.r6s
    public final long a() {
        return this.c - this.f37674b;
    }

    @Override // defpackage.r6s
    public final InputStream b(long j, long j2) throws IOException {
        long jD = d(this.f37674b);
        return this.f37673a.b(jD, d(j2 + jD) - jD);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final long d(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f37673a.a() ? this.f37673a.a() : j;
    }
}
