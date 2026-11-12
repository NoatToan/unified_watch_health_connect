package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f13983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f13987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13988f;

    public j(Rect rect, int i14, int i15, boolean z14, Matrix matrix, boolean z15) {
        if (rect == null) {
            j20.x.l("Null getCropRect");
            throw null;
        }
        this.f13983a = rect;
        this.f13984b = i14;
        this.f13985c = i15;
        this.f13986d = z14;
        if (matrix == null) {
            j20.x.l("Null getSensorToBufferTransform");
            throw null;
        }
        this.f13987e = matrix;
        this.f13988f = z15;
    }

    @Override // b0.g1.g
    public final Rect a() {
        return this.f13983a;
    }

    @Override // b0.g1.g
    public final int b() {
        return this.f13984b;
    }

    @Override // b0.g1.g
    public final Matrix c() {
        return this.f13987e;
    }

    @Override // b0.g1.g
    public final int d() {
        return this.f13985c;
    }

    @Override // b0.g1.g
    public final boolean e() {
        return this.f13986d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1.g)) {
            return false;
        }
        g1.g gVar = (g1.g) obj;
        return this.f13983a.equals(gVar.a()) && this.f13984b == gVar.b() && this.f13985c == gVar.d() && this.f13986d == gVar.e() && this.f13987e.equals(gVar.c()) && this.f13988f == gVar.f();
    }

    @Override // b0.g1.g
    public final boolean f() {
        return this.f13988f;
    }

    public final int hashCode() {
        return ((((((((((this.f13983a.hashCode() ^ 1000003) * 1000003) ^ this.f13984b) * 1000003) ^ this.f13985c) * 1000003) ^ (this.f13986d ? 1231 : 1237)) * 1000003) ^ this.f13987e.hashCode()) * 1000003) ^ (this.f13988f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TransformationInfo{getCropRect=");
        sb3.append(this.f13983a);
        sb3.append(", getRotationDegrees=");
        sb3.append(this.f13984b);
        sb3.append(", getTargetRotation=");
        sb3.append(this.f13985c);
        sb3.append(", hasCameraTransform=");
        sb3.append(this.f13986d);
        sb3.append(", getSensorToBufferTransform=");
        sb3.append(this.f13987e);
        sb3.append(", isMirroring=");
        return hb.a.k(sb3, this.f13988f, StringSubstitutor.DEFAULT_VAR_END);
    }
}
