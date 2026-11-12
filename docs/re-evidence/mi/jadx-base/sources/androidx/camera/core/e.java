package androidx.camera.core;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class e extends r.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1699b;
    public final int c;

    public e(Rect rect, int i, int i2) {
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f1698a = rect;
        this.f1699b = i;
        this.c = i2;
    }

    @Override // androidx.camera.core.r.g
    public Rect a() {
        return this.f1698a;
    }

    @Override // androidx.camera.core.r.g
    public int b() {
        return this.f1699b;
    }

    @Override // androidx.camera.core.r.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.g)) {
            return false;
        }
        r.g gVar = (r.g) obj;
        return this.f1698a.equals(gVar.a()) && this.f1699b == gVar.b() && this.c == gVar.c();
    }

    public int hashCode() {
        return ((((this.f1698a.hashCode() ^ 1000003) * 1000003) ^ this.f1699b) * 1000003) ^ this.c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f1698a + ", rotationDegrees=" + this.f1699b + ", targetRotation=" + this.c + "}";
    }
}
