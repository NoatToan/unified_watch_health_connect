package defpackage;

import com.google.android.exoplayer2.source.k;

/* JADX INFO: loaded from: classes4.dex */
public final class ojf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f29217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29218b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ojf(k.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f29217a = aVar;
        this.f29218b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public ojf a(long j) {
        return j == this.c ? this : new ojf(this.f29217a, this.f29218b, j, this.d, this.e, this.f, this.g, this.h);
    }

    public ojf b(long j) {
        return j == this.f29218b ? this : new ojf(this.f29217a, j, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ojf.class != obj.getClass()) {
            return false;
        }
        ojf ojfVar = (ojf) obj;
        return this.f29218b == ojfVar.f29218b && this.c == ojfVar.c && this.d == ojfVar.d && this.e == ojfVar.e && this.f == ojfVar.f && this.g == ojfVar.g && this.h == ojfVar.h && wlq.c(this.f29217a, ojfVar.f29217a);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f29217a.hashCode()) * 31) + ((int) this.f29218b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
