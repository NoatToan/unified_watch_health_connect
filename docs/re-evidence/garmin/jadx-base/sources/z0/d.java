package z0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f200606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f200607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f200608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f200609e;

    public d(int i14, double d14, long j8, Throwable th3) {
        this.f200606b = i14;
        this.f200607c = d14;
        this.f200608d = j8;
        this.f200609e = th3;
    }

    @Override // z0.b
    public final double a() {
        return this.f200607c;
    }

    @Override // z0.b
    public final long b() {
        return this.f200608d;
    }

    @Override // z0.b
    public final int c() {
        return this.f200606b;
    }

    @Override // z0.b
    public final Throwable d() {
        return this.f200609e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f200606b != bVar.c() || Double.doubleToLongBits(this.f200607c) != Double.doubleToLongBits(bVar.a()) || this.f200608d != bVar.b()) {
            return false;
        }
        Throwable th3 = this.f200609e;
        if (th3 == null) {
            return bVar.d() == null;
        }
        return th3.equals(bVar.d());
    }

    public final int hashCode() {
        int i14 = (this.f200606b ^ 1000003) * 1000003;
        double d14 = this.f200607c;
        int iDoubleToLongBits = (i14 ^ ((int) (Double.doubleToLongBits(d14) ^ (Double.doubleToLongBits(d14) >>> 32)))) * 1000003;
        long j8 = this.f200608d;
        int i15 = (iDoubleToLongBits ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Throwable th3 = this.f200609e;
        return i15 ^ (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f200606b + ", audioAmplitudeInternal=" + this.f200607c + ", audioBytesRecorded=" + this.f200608d + ", errorCause=" + this.f200609e + StringSubstitutor.DEFAULT_VAR_END;
    }
}
