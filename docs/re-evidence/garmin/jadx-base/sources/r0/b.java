package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.c0;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f148692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.g f148693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f148695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f148696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f148697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f148698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f148699h;

    public b(T t7, j0.g gVar, int i14, Size size, Rect rect, int i15, Matrix matrix, c0 c0Var) {
        if (t7 == null) {
            x.l("Null data");
            throw null;
        }
        this.f148692a = t7;
        this.f148693b = gVar;
        this.f148694c = i14;
        if (size == null) {
            x.l("Null size");
            throw null;
        }
        this.f148695d = size;
        if (rect == null) {
            x.l("Null cropRect");
            throw null;
        }
        this.f148696e = rect;
        this.f148697f = i15;
        if (matrix == null) {
            x.l("Null sensorToBufferTransform");
            throw null;
        }
        this.f148698g = matrix;
        if (c0Var != null) {
            this.f148699h = c0Var;
        } else {
            x.l("Null cameraCaptureResult");
            throw null;
        }
    }

    @Override // r0.k
    public final c0 a() {
        return this.f148699h;
    }

    @Override // r0.k
    public final Rect b() {
        return this.f148696e;
    }

    @Override // r0.k
    public final T c() {
        return this.f148692a;
    }

    @Override // r0.k
    public final j0.g d() {
        return this.f148693b;
    }

    @Override // r0.k
    public final int e() {
        return this.f148694c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f148692a.equals(kVar.c())) {
            return false;
        }
        j0.g gVar = this.f148693b;
        if (gVar == null) {
            if (kVar.d() != null) {
                return false;
            }
        } else if (!gVar.equals(kVar.d())) {
            return false;
        }
        return this.f148694c == kVar.e() && this.f148695d.equals(kVar.h()) && this.f148696e.equals(kVar.b()) && this.f148697f == kVar.f() && this.f148698g.equals(kVar.g()) && this.f148699h.equals(kVar.a());
    }

    @Override // r0.k
    public final int f() {
        return this.f148697f;
    }

    @Override // r0.k
    public final Matrix g() {
        return this.f148698g;
    }

    @Override // r0.k
    public final Size h() {
        return this.f148695d;
    }

    public final int hashCode() {
        int iHashCode = (this.f148692a.hashCode() ^ 1000003) * 1000003;
        j0.g gVar = this.f148693b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f148694c) * 1000003) ^ this.f148695d.hashCode()) * 1000003) ^ this.f148696e.hashCode()) * 1000003) ^ this.f148697f) * 1000003) ^ this.f148698g.hashCode()) * 1000003) ^ this.f148699h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f148692a + ", exif=" + this.f148693b + ", format=" + this.f148694c + ", size=" + this.f148695d + ", cropRect=" + this.f148696e + ", rotationDegrees=" + this.f148697f + ", sensorToBufferTransform=" + this.f148698g + ", cameraCaptureResult=" + this.f148699h + StringSubstitutor.DEFAULT_VAR_END;
    }
}
