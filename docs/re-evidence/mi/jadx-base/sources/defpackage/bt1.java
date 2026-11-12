package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class bt1 extends lqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f4580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f4581b;
    public final Size c;

    public bt1(Size size, Size size2, Size size3) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f4580a = size;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f4581b = size2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.c = size3;
    }

    @Override // defpackage.lqo
    public Size b() {
        return this.f4580a;
    }

    @Override // defpackage.lqo
    public Size c() {
        return this.f4581b;
    }

    @Override // defpackage.lqo
    public Size d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqo)) {
            return false;
        }
        lqo lqoVar = (lqo) obj;
        return this.f4580a.equals(lqoVar.b()) && this.f4581b.equals(lqoVar.c()) && this.c.equals(lqoVar.d());
    }

    public int hashCode() {
        return ((((this.f4580a.hashCode() ^ 1000003) * 1000003) ^ this.f4581b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f4580a + ", previewSize=" + this.f4581b + ", recordSize=" + this.c + "}";
    }
}
