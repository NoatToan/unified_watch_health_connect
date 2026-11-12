package androidx.media3.common;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f8173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8177e;

    public c0(Surface surface, int i14, int i15, int i16, boolean z14) {
        fa.a.b(i16 == 0 || i16 == 90 || i16 == 180 || i16 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f8173a = surface;
        this.f8174b = i14;
        this.f8175c = i15;
        this.f8176d = i16;
        this.f8177e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f8174b == c0Var.f8174b && this.f8175c == c0Var.f8175c && this.f8176d == c0Var.f8176d && this.f8177e == c0Var.f8177e && this.f8173a.equals(c0Var.f8173a);
    }

    public final int hashCode() {
        return (((((((this.f8173a.hashCode() * 31) + this.f8174b) * 31) + this.f8175c) * 31) + this.f8176d) * 31) + (this.f8177e ? 1 : 0);
    }

    public c0(Surface surface, int i14, int i15, int i16) {
        this(surface, i14, i15, i16, false);
    }

    public c0(Surface surface, int i14, int i15) {
        this(surface, i14, i15, 0);
    }
}
