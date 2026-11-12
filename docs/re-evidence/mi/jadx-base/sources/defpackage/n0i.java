package defpackage;

import androidx.annotation.CheckResult;

/* JADX INFO: loaded from: classes4.dex */
public final class n0i {
    public static final n0i d = new n0i(1.0f);
    public static final j63<n0i> e = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27407b;
    public final int c;

    public n0i(float f) {
        this(f, 1.0f);
    }

    public long a(long j) {
        return j * ((long) this.c);
    }

    @CheckResult
    public n0i b(float f) {
        return new n0i(f, this.f27407b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0i.class != obj.getClass()) {
            return false;
        }
        n0i n0iVar = (n0i) obj;
        return this.f27406a == n0iVar.f27406a && this.f27407b == n0iVar.f27407b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f27406a)) * 31) + Float.floatToRawIntBits(this.f27407b);
    }

    public String toString() {
        return wlq.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f27406a), Float.valueOf(this.f27407b));
    }

    public n0i(float f, float f2) {
        rk1.a(f > 0.0f);
        rk1.a(f2 > 0.0f);
        this.f27406a = f;
        this.f27407b = f2;
        this.c = Math.round(f * 1000.0f);
    }
}
