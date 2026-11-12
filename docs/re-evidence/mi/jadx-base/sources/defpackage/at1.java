package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class at1 extends oeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f3424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f3425b;
    public final int c;

    public at1(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f3424a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3425b = size;
        this.c = i;
    }

    @Override // defpackage.oeh
    public int b() {
        return this.c;
    }

    @Override // defpackage.oeh
    public Size c() {
        return this.f3425b;
    }

    @Override // defpackage.oeh
    public Surface d() {
        return this.f3424a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oeh)) {
            return false;
        }
        oeh oehVar = (oeh) obj;
        return this.f3424a.equals(oehVar.d()) && this.f3425b.equals(oehVar.c()) && this.c == oehVar.b();
    }

    public int hashCode() {
        return ((((this.f3424a.hashCode() ^ 1000003) * 1000003) ^ this.f3425b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f3424a + ", size=" + this.f3425b + ", imageFormat=" + this.c + "}";
    }
}
