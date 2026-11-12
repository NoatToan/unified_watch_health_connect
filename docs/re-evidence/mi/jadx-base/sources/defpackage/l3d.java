package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class l3d {
    public static final l3d i = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24601b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Bitmap.Config g;
    public final n3d h;

    public l3d(m3d m3dVar) {
        this.f24600a = m3dVar.h();
        this.f24601b = m3dVar.f();
        this.c = m3dVar.j();
        this.d = m3dVar.e();
        this.e = m3dVar.g();
        this.g = m3dVar.b();
        this.h = m3dVar.d();
        this.f = m3dVar.i();
        m3dVar.c();
    }

    public static l3d a() {
        return i;
    }

    public static m3d b() {
        return new m3d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l3d l3dVar = (l3d) obj;
        return this.f24601b == l3dVar.f24601b && this.c == l3dVar.c && this.d == l3dVar.d && this.e == l3dVar.e && this.f == l3dVar.f && this.g == l3dVar.g && this.h == l3dVar.h;
    }

    public int hashCode() {
        int iOrdinal = ((((((((((((this.f24600a * 31) + (this.f24601b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g.ordinal()) * 31;
        n3d n3dVar = this.h;
        return (iOrdinal + (n3dVar != null ? n3dVar.hashCode() : 0)) * 31;
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", Integer.valueOf(this.f24600a), Boolean.valueOf(this.f24601b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.g.name(), this.h, null);
    }
}
