package b0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m0 f13847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13849g;

    public a1(androidx.camera.core.e eVar, Size size, m0 m0Var) {
        super(eVar);
        this.f13846d = new Object();
        if (size == null) {
            this.f13848f = this.f5432b.getWidth();
            this.f13849g = this.f5432b.getHeight();
        } else {
            this.f13848f = size.getWidth();
            this.f13849g = size.getHeight();
        }
        this.f13847e = m0Var;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.e
    public final m0 A0() {
        return this.f13847e;
    }

    public final void c(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f13848f, this.f13849g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f13846d) {
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.e
    public final int getHeight() {
        return this.f13849g;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.e
    public final int getWidth() {
        return this.f13848f;
    }

    public a1(androidx.camera.core.e eVar, m0 m0Var) {
        this(eVar, null, m0Var);
    }
}
