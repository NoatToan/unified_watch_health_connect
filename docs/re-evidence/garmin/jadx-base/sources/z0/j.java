package z0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f200656c;

    public j(long j8, long j14, b bVar) {
        this.f200654a = j8;
        this.f200655b = j14;
        if (bVar != null) {
            this.f200656c = bVar;
        } else {
            j20.x.l("Null audioStats");
            throw null;
        }
    }

    @Override // z0.d0
    public final b a() {
        return this.f200656c;
    }

    @Override // z0.d0
    public final long b() {
        return this.f200655b;
    }

    @Override // z0.d0
    public final long c() {
        return this.f200654a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f200654a == d0Var.c() && this.f200655b == d0Var.b() && this.f200656c.equals(d0Var.a());
    }

    public final int hashCode() {
        long j8 = this.f200654a;
        int i14 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j14 = this.f200655b;
        return ((i14 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f200656c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f200654a + ", numBytesRecorded=" + this.f200655b + ", audioStats=" + this.f200656c + StringSubstitutor.DEFAULT_VAR_END;
    }
}
