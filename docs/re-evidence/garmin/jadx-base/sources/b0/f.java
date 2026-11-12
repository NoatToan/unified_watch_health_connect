package b0;

import android.graphics.Matrix;
import androidx.camera.core.impl.w2;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f13878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f13881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13882e;

    public f(w2 w2Var, long j8, int i14, Matrix matrix, int i15) {
        if (w2Var == null) {
            j20.x.l("Null tagBundle");
            throw null;
        }
        this.f13878a = w2Var;
        this.f13879b = j8;
        this.f13880c = i14;
        if (matrix == null) {
            j20.x.l("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.f13881d = matrix;
        this.f13882e = i15;
    }

    @Override // b0.m0
    public final w2 a() {
        return this.f13878a;
    }

    @Override // b0.r0, b0.m0
    public final int b() {
        return this.f13882e;
    }

    @Override // b0.r0, b0.m0
    public final Matrix d() {
        return this.f13881d;
    }

    @Override // b0.m0
    public final int e() {
        return this.f13880c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        f fVar = (f) r0Var;
        return this.f13878a.equals(fVar.f13878a) && this.f13879b == fVar.f13879b && this.f13880c == fVar.f13880c && this.f13881d.equals(r0Var.d()) && this.f13882e == r0Var.b();
    }

    @Override // b0.m0
    public final long getTimestamp() {
        return this.f13879b;
    }

    public final int hashCode() {
        int iHashCode = (this.f13878a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f13879b;
        return ((((((iHashCode ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f13880c) * 1000003) ^ this.f13881d.hashCode()) * 1000003) ^ this.f13882e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb3.append(this.f13878a);
        sb3.append(", timestamp=");
        sb3.append(this.f13879b);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f13880c);
        sb3.append(", sensorToBufferTransformMatrix=");
        sb3.append(this.f13881d);
        sb3.append(", flashState=");
        return am.j.q(sb3, this.f13882e, StringSubstitutor.DEFAULT_VAR_END);
    }
}
