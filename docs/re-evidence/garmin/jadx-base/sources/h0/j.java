package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f80497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.l0.f f80498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0.l0.h f80499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.l0.h f80500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f80501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f80502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f80503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f80505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f80506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<androidx.camera.core.impl.s> f80507m;

    public j(Executor executor, b0.l0.f fVar, b0.l0.g gVar, b0.l0.h hVar, b0.l0.h hVar2, Rect rect, Matrix matrix, int i14, int i15, int i16, boolean z14, List<androidx.camera.core.impl.s> list) {
        if (executor == null) {
            j20.x.l("Null appExecutor");
            throw null;
        }
        this.f80497c = executor;
        this.f80498d = fVar;
        this.f80499e = hVar;
        this.f80500f = hVar2;
        if (rect == null) {
            j20.x.l("Null cropRect");
            throw null;
        }
        this.f80501g = rect;
        if (matrix == null) {
            j20.x.l("Null sensorToBufferTransform");
            throw null;
        }
        this.f80502h = matrix;
        this.f80503i = i14;
        this.f80504j = i15;
        this.f80505k = i16;
        this.f80506l = z14;
        if (list != null) {
            this.f80507m = list;
        } else {
            j20.x.l("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    @Override // h0.v0
    public final Executor a() {
        return this.f80497c;
    }

    @Override // h0.v0
    public final int b() {
        return this.f80505k;
    }

    @Override // h0.v0
    public final Rect c() {
        return this.f80501g;
    }

    @Override // h0.v0
    public final b0.l0.f d() {
        return this.f80498d;
    }

    @Override // h0.v0
    public final int e() {
        return this.f80504j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!this.f80497c.equals(v0Var.a())) {
            return false;
        }
        b0.l0.f fVar = this.f80498d;
        if (fVar == null) {
            if (v0Var.d() != null) {
                return false;
            }
        } else if (!fVar.equals(v0Var.d())) {
            return false;
        }
        if (v0Var.f() != null) {
            return false;
        }
        b0.l0.h hVar = this.f80499e;
        if (hVar == null) {
            if (v0Var.g() != null) {
                return false;
            }
        } else if (!hVar.equals(v0Var.g())) {
            return false;
        }
        b0.l0.h hVar2 = this.f80500f;
        if (hVar2 == null) {
            if (v0Var.i() != null) {
                return false;
            }
        } else if (!hVar2.equals(v0Var.i())) {
            return false;
        }
        return this.f80501g.equals(v0Var.c()) && this.f80502h.equals(v0Var.j()) && this.f80503i == v0Var.h() && this.f80504j == v0Var.e() && this.f80505k == v0Var.b() && this.f80506l == v0Var.m() && this.f80507m.equals(v0Var.k());
    }

    @Override // h0.v0
    public final b0.l0.g f() {
        return null;
    }

    @Override // h0.v0
    public final b0.l0.h g() {
        return this.f80499e;
    }

    @Override // h0.v0
    public final int h() {
        return this.f80503i;
    }

    public final int hashCode() {
        int iHashCode = (this.f80497c.hashCode() ^ 1000003) * 1000003;
        b0.l0.f fVar = this.f80498d;
        int iHashCode2 = (((iHashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003) ^ 0) * 1000003;
        b0.l0.h hVar = this.f80499e;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        b0.l0.h hVar2 = this.f80500f;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f80501g.hashCode()) * 1000003) ^ this.f80502h.hashCode()) * 1000003) ^ this.f80503i) * 1000003) ^ this.f80504j) * 1000003) ^ this.f80505k) * 1000003) ^ (this.f80506l ? 1231 : 1237)) * 1000003) ^ this.f80507m.hashCode();
    }

    @Override // h0.v0
    public final b0.l0.h i() {
        return this.f80500f;
    }

    @Override // h0.v0
    public final Matrix j() {
        return this.f80502h;
    }

    @Override // h0.v0
    public final List<androidx.camera.core.impl.s> k() {
        return this.f80507m;
    }

    @Override // h0.v0
    public final boolean m() {
        return this.f80506l;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb3.append(this.f80497c);
        sb3.append(", inMemoryCallback=");
        sb3.append(this.f80498d);
        sb3.append(", onDiskCallback=");
        sb3.append((Object) null);
        sb3.append(", outputFileOptions=");
        sb3.append(this.f80499e);
        sb3.append(", secondaryOutputFileOptions=");
        sb3.append(this.f80500f);
        sb3.append(", cropRect=");
        sb3.append(this.f80501g);
        sb3.append(", sensorToBufferTransform=");
        sb3.append(this.f80502h);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f80503i);
        sb3.append(", jpegQuality=");
        sb3.append(this.f80504j);
        sb3.append(", captureMode=");
        sb3.append(this.f80505k);
        sb3.append(", simultaneousCapture=");
        sb3.append(this.f80506l);
        sb3.append(", sessionConfigCameraCaptureCallbacks=");
        return u62.z.c(sb3, this.f80507m, StringSubstitutor.DEFAULT_VAR_END);
    }
}
