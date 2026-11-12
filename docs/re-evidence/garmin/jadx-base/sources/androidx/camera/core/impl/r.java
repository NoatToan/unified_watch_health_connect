package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f5716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, Size> f5717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f5718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f5719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f5720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f5721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f5722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<Integer, Size> f5723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, Size> f5724i;

    public r(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            j20.x.l("Null analysisSize");
            throw null;
        }
        this.f5716a = size;
        if (map == null) {
            j20.x.l("Null s720pSizeMap");
            throw null;
        }
        this.f5717b = map;
        if (size2 == null) {
            j20.x.l("Null previewSize");
            throw null;
        }
        this.f5718c = size2;
        if (map2 == null) {
            j20.x.l("Null s1440pSizeMap");
            throw null;
        }
        this.f5719d = map2;
        if (size3 == null) {
            j20.x.l("Null recordSize");
            throw null;
        }
        this.f5720e = size3;
        if (map3 == null) {
            j20.x.l("Null maximumSizeMap");
            throw null;
        }
        this.f5721f = map3;
        if (map4 == null) {
            j20.x.l("Null maximum4x3SizeMap");
            throw null;
        }
        this.f5722g = map4;
        if (map5 == null) {
            j20.x.l("Null maximum16x9SizeMap");
            throw null;
        }
        this.f5723h = map5;
        if (map6 != null) {
            this.f5724i = map6;
        } else {
            j20.x.l("Null ultraMaximumSizeMap");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.u2
    public final Size a() {
        return this.f5716a;
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> b() {
        return this.f5723h;
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> c() {
        return this.f5722g;
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> d() {
        return this.f5721f;
    }

    @Override // androidx.camera.core.impl.u2
    public final Size e() {
        return this.f5718c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return this.f5716a.equals(u2Var.a()) && this.f5717b.equals(u2Var.h()) && this.f5718c.equals(u2Var.e()) && this.f5719d.equals(u2Var.g()) && this.f5720e.equals(u2Var.f()) && this.f5721f.equals(u2Var.d()) && this.f5722g.equals(u2Var.c()) && this.f5723h.equals(u2Var.b()) && this.f5724i.equals(u2Var.i());
    }

    @Override // androidx.camera.core.impl.u2
    public final Size f() {
        return this.f5720e;
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> g() {
        return this.f5719d;
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> h() {
        return this.f5717b;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f5716a.hashCode() ^ 1000003) * 1000003) ^ this.f5717b.hashCode()) * 1000003) ^ this.f5718c.hashCode()) * 1000003) ^ this.f5719d.hashCode()) * 1000003) ^ this.f5720e.hashCode()) * 1000003) ^ this.f5721f.hashCode()) * 1000003) ^ this.f5722g.hashCode()) * 1000003) ^ this.f5723h.hashCode()) * 1000003) ^ this.f5724i.hashCode();
    }

    @Override // androidx.camera.core.impl.u2
    public final Map<Integer, Size> i() {
        return this.f5724i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurfaceSizeDefinition{analysisSize=");
        sb3.append(this.f5716a);
        sb3.append(", s720pSizeMap=");
        sb3.append(this.f5717b);
        sb3.append(", previewSize=");
        sb3.append(this.f5718c);
        sb3.append(", s1440pSizeMap=");
        sb3.append(this.f5719d);
        sb3.append(", recordSize=");
        sb3.append(this.f5720e);
        sb3.append(", maximumSizeMap=");
        sb3.append(this.f5721f);
        sb3.append(", maximum4x3SizeMap=");
        sb3.append(this.f5722g);
        sb3.append(", maximum16x9SizeMap=");
        sb3.append(this.f5723h);
        sb3.append(", ultraMaximumSizeMap=");
        return am.j.s(sb3, this.f5724i, StringSubstitutor.DEFAULT_VAR_END);
    }
}
