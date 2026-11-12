package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes16.dex */
public class qlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46451a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f46452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46453c;
    private float d;
    private float e;
    private int f;

    public boolean d() {
        return this.f46453c;
    }

    public void b(boolean z) {
        this.f46453c = z;
    }

    public float c() {
        return this.f46451a;
    }

    public float e() {
        return this.d;
    }

    public void c(float f) {
        this.d = f;
    }

    public Drawable a() {
        return this.f46452b;
    }

    public void e(Drawable drawable) {
        this.f46452b = drawable;
    }

    public float b() {
        float f = this.e;
        return f == 0.0f ? qre.a(this.f) : f;
    }

    public void e(float f) {
        this.e = f;
    }

    public String toString() {
        return "CursorData{mIsShow=" + this.f46453c + ", mAlpha=" + this.f46451a + ", mProportion=" + this.d + ", mDrawable=" + this.f46452b + ", mVerticalOffset=" + this.e + ", mVerticalOffsetId=" + this.f + '}';
    }
}
