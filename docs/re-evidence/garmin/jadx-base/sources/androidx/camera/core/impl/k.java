package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5589j;

    public k(int i14, String str, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26) {
        this.f5580a = i14;
        if (str == null) {
            j20.x.l("Null mediaType");
            throw null;
        }
        this.f5581b = str;
        this.f5582c = i15;
        this.f5583d = i16;
        this.f5584e = i17;
        this.f5585f = i18;
        this.f5586g = i19;
        this.f5587h = i24;
        this.f5588i = i25;
        this.f5589j = i26;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int a() {
        return this.f5587h;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int b() {
        return this.f5582c;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int c() {
        return this.f5588i;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int d() {
        return this.f5580a;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int e() {
        return this.f5583d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1.c)) {
            return false;
        }
        f1.c cVar = (f1.c) obj;
        return this.f5580a == cVar.d() && this.f5581b.equals(cVar.h()) && this.f5582c == cVar.b() && this.f5583d == cVar.e() && this.f5584e == cVar.k() && this.f5585f == cVar.g() && this.f5586g == cVar.i() && this.f5587h == cVar.a() && this.f5588i == cVar.c() && this.f5589j == cVar.f();
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int f() {
        return this.f5589j;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int g() {
        return this.f5585f;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final String h() {
        return this.f5581b;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f5580a ^ 1000003) * 1000003) ^ this.f5581b.hashCode()) * 1000003) ^ this.f5582c) * 1000003) ^ this.f5583d) * 1000003) ^ this.f5584e) * 1000003) ^ this.f5585f) * 1000003) ^ this.f5586g) * 1000003) ^ this.f5587h) * 1000003) ^ this.f5588i) * 1000003) ^ this.f5589j;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int i() {
        return this.f5586g;
    }

    @Override // androidx.camera.core.impl.f1.c
    public final int k() {
        return this.f5584e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoProfileProxy{codec=");
        sb3.append(this.f5580a);
        sb3.append(", mediaType=");
        sb3.append(this.f5581b);
        sb3.append(", bitrate=");
        sb3.append(this.f5582c);
        sb3.append(", frameRate=");
        sb3.append(this.f5583d);
        sb3.append(", width=");
        sb3.append(this.f5584e);
        sb3.append(", height=");
        sb3.append(this.f5585f);
        sb3.append(", profile=");
        sb3.append(this.f5586g);
        sb3.append(", bitDepth=");
        sb3.append(this.f5587h);
        sb3.append(", chromaSubsampling=");
        sb3.append(this.f5588i);
        sb3.append(", hdrFormat=");
        return am.j.q(sb3, this.f5589j, StringSubstitutor.DEFAULT_VAR_END);
    }
}
