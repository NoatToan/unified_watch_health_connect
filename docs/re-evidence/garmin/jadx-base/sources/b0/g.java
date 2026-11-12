package b0;

import android.graphics.Rect;
import android.util.Size;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f13888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f13889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.l0 f13890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13892e;

    public g(Size size, Rect rect, androidx.camera.core.impl.l0 l0Var, int i14, boolean z14) {
        if (size == null) {
            j20.x.l("Null inputSize");
            throw null;
        }
        this.f13888a = size;
        if (rect == null) {
            j20.x.l("Null inputCropRect");
            throw null;
        }
        this.f13889b = rect;
        this.f13890c = l0Var;
        this.f13891d = i14;
        this.f13892e = z14;
    }

    @Override // b0.c1.a
    public final androidx.camera.core.impl.l0 a() {
        return this.f13890c;
    }

    @Override // b0.c1.a
    public final Rect b() {
        return this.f13889b;
    }

    @Override // b0.c1.a
    public final Size c() {
        return this.f13888a;
    }

    @Override // b0.c1.a
    public final boolean d() {
        return this.f13892e;
    }

    @Override // b0.c1.a
    public final int e() {
        return this.f13891d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1.a)) {
            return false;
        }
        c1.a aVar = (c1.a) obj;
        if (!this.f13888a.equals(aVar.c()) || !this.f13889b.equals(aVar.b())) {
            return false;
        }
        androidx.camera.core.impl.l0 l0Var = this.f13890c;
        if (l0Var == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!l0Var.equals(aVar.a())) {
            return false;
        }
        return this.f13891d == aVar.e() && this.f13892e == aVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((this.f13888a.hashCode() ^ 1000003) * 1000003) ^ this.f13889b.hashCode()) * 1000003;
        androidx.camera.core.impl.l0 l0Var = this.f13890c;
        return ((((iHashCode ^ (l0Var == null ? 0 : l0Var.hashCode())) * 1000003) ^ this.f13891d) * 1000003) ^ (this.f13892e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CameraInputInfo{inputSize=");
        sb3.append(this.f13888a);
        sb3.append(", inputCropRect=");
        sb3.append(this.f13889b);
        sb3.append(", cameraInternal=");
        sb3.append(this.f13890c);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f13891d);
        sb3.append(", mirroring=");
        return hb.a.k(sb3, this.f13892e, StringSubstitutor.DEFAULT_VAR_END);
    }
}
