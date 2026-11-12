package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f5629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f5630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5631c;

    public m(Surface surface, Size size, int i14) {
        if (surface == null) {
            j20.x.l("Null surface");
            throw null;
        }
        this.f5629a = surface;
        if (size == null) {
            j20.x.l("Null size");
            throw null;
        }
        this.f5630b = size;
        this.f5631c = i14;
    }

    @Override // androidx.camera.core.impl.b2
    public final int a() {
        return this.f5631c;
    }

    @Override // androidx.camera.core.impl.b2
    public final Size b() {
        return this.f5630b;
    }

    @Override // androidx.camera.core.impl.b2
    public final Surface c() {
        return this.f5629a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f5629a.equals(b2Var.c()) && this.f5630b.equals(b2Var.b()) && this.f5631c == b2Var.a();
    }

    public final int hashCode() {
        return ((((this.f5629a.hashCode() ^ 1000003) * 1000003) ^ this.f5630b.hashCode()) * 1000003) ^ this.f5631c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OutputSurface{surface=");
        sb3.append(this.f5629a);
        sb3.append(", size=");
        sb3.append(this.f5630b);
        sb3.append(", imageFormat=");
        return am.j.q(sb3, this.f5631c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
