package defpackage;

import android.graphics.Color;

/* JADX INFO: loaded from: classes10.dex */
public class jrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f38948a = Color.rgb(251, 101, 34);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38950c = f38948a;
    private float i = 16.0f;
    private boolean d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38949b = false;
    private jpg f = null;
    private jpg e = null;
    private float g = 0.0f;

    public jrt c(int i) {
        this.f38950c = i;
        return this;
    }

    public jrt b(float f) {
        this.i = f;
        return this;
    }

    public jrt a(boolean z) {
        this.d = z;
        return this;
    }

    public jrt d(boolean z) {
        this.f38949b = z;
        return this;
    }

    public jrt b(jpg jpgVar) {
        this.f = jpgVar;
        return this;
    }

    public jrt e(jpg jpgVar) {
        this.e = jpgVar;
        return this;
    }

    public int e() {
        return this.f38950c;
    }

    public float a() {
        return this.i;
    }

    public boolean j() {
        return this.f38949b;
    }

    public jpg d() {
        return this.f;
    }

    public jpg b() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }

    public float c() {
        return this.g;
    }

    public void e(float f) {
        this.g = f;
    }
}
