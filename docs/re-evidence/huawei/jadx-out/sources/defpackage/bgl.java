package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes23.dex */
public class bgl extends LinearGradient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader.TileMode f1091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f1092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f1093c;
    private final int[] d;
    private final float e;
    private final float f;
    private final float h;

    public bgl(float f, float f2, float f3, float f4, int[] iArr, float[] fArr, Shader.TileMode tileMode) {
        super(f, f2, f3, f4, iArr, fArr, tileMode);
        this.f1093c = f;
        this.f = f2;
        this.e = f3;
        this.h = f4;
        this.d = iArr;
        this.f1092b = fArr;
        this.f1091a = tileMode;
    }

    public float e() {
        return this.f1093c;
    }

    public float j() {
        return this.f;
    }

    public float a() {
        return this.e;
    }

    public float g() {
        return this.h;
    }

    public int[] b() {
        return this.d;
    }

    public float[] d() {
        return this.f1092b;
    }

    public Shader.TileMode c() {
        return this.f1091a;
    }
}
