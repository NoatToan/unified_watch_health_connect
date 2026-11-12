package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f5540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f5542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.b0 f5543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c3.b> f5544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0 f5545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range<Integer> f5547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5548i;

    public f(t2 t2Var, int i14, Size size, b0.b0 b0Var, List<c3.b> list, x0 x0Var, int i15, Range<Integer> range, boolean z14) {
        if (t2Var == null) {
            j20.x.l("Null surfaceConfig");
            throw null;
        }
        this.f5540a = t2Var;
        this.f5541b = i14;
        if (size == null) {
            j20.x.l("Null size");
            throw null;
        }
        this.f5542c = size;
        if (b0Var == null) {
            j20.x.l("Null dynamicRange");
            throw null;
        }
        this.f5543d = b0Var;
        if (list == null) {
            j20.x.l("Null captureTypes");
            throw null;
        }
        this.f5544e = list;
        this.f5545f = x0Var;
        this.f5546g = i15;
        if (range == null) {
            j20.x.l("Null targetFrameRate");
            throw null;
        }
        this.f5547h = range;
        this.f5548i = z14;
    }

    @Override // androidx.camera.core.impl.e
    public final List<c3.b> a() {
        return this.f5544e;
    }

    @Override // androidx.camera.core.impl.e
    public final b0.b0 b() {
        return this.f5543d;
    }

    @Override // androidx.camera.core.impl.e
    public final int c() {
        return this.f5541b;
    }

    @Override // androidx.camera.core.impl.e
    public final x0 d() {
        return this.f5545f;
    }

    @Override // androidx.camera.core.impl.e
    public final int e() {
        return this.f5546g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f5540a.equals(eVar.g()) || this.f5541b != eVar.c() || !this.f5542c.equals(eVar.f()) || !this.f5543d.equals(eVar.b()) || !this.f5544e.equals(eVar.a())) {
            return false;
        }
        x0 x0Var = this.f5545f;
        if (x0Var == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!x0Var.equals(eVar.d())) {
            return false;
        }
        return this.f5546g == eVar.e() && this.f5547h.equals(eVar.h()) && this.f5548i == eVar.i();
    }

    @Override // androidx.camera.core.impl.e
    public final Size f() {
        return this.f5542c;
    }

    @Override // androidx.camera.core.impl.e
    public final t2 g() {
        return this.f5540a;
    }

    @Override // androidx.camera.core.impl.e
    public final Range<Integer> h() {
        return this.f5547h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f5540a.hashCode() ^ 1000003) * 1000003) ^ this.f5541b) * 1000003) ^ this.f5542c.hashCode()) * 1000003) ^ this.f5543d.hashCode()) * 1000003) ^ this.f5544e.hashCode()) * 1000003;
        x0 x0Var = this.f5545f;
        return ((((((iHashCode ^ (x0Var == null ? 0 : x0Var.hashCode())) * 1000003) ^ this.f5546g) * 1000003) ^ this.f5547h.hashCode()) * 1000003) ^ (this.f5548i ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.e
    public final boolean i() {
        return this.f5548i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb3.append(this.f5540a);
        sb3.append(", imageFormat=");
        sb3.append(this.f5541b);
        sb3.append(", size=");
        sb3.append(this.f5542c);
        sb3.append(", dynamicRange=");
        sb3.append(this.f5543d);
        sb3.append(", captureTypes=");
        sb3.append(this.f5544e);
        sb3.append(", implementationOptions=");
        sb3.append(this.f5545f);
        sb3.append(", sessionType=");
        sb3.append(this.f5546g);
        sb3.append(", targetFrameRate=");
        sb3.append(this.f5547h);
        sb3.append(", strictFrameRateRequired=");
        return hb.a.k(sb3, this.f5548i, StringSubstitutor.DEFAULT_VAR_END);
    }
}
