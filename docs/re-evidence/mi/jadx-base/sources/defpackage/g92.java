package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g92 implements uif {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18744b;
    public final long c;
    public long d;

    public g92(long j, long j2) {
        this.f18744b = j;
        this.c = j2;
        f();
    }

    public final void c() {
        long j = this.d;
        if (j < this.f18744b || j > this.c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.d;
    }

    public boolean e() {
        return this.d > this.c;
    }

    public void f() {
        this.d = this.f18744b - 1;
    }

    @Override // defpackage.uif
    public boolean next() {
        this.d++;
        return !e();
    }
}
