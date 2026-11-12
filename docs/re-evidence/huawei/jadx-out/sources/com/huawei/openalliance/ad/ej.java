package com.huawei.openalliance.ad;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes41.dex */
public class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f18689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ei f18690b;
    private float d;
    private float e;
    private float f;
    private float g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18691c = -1;
    private final float[] h = new float[16];
    private boolean i = false;
    private final float[] j = new float[16];

    public void b(float f, float f2) {
        this.f = f;
        this.g = f2;
        this.i = false;
    }

    public void a(ek ekVar, float[] fArr) {
        Matrix.multiplyMM(this.j, 0, fArr, 0, b(), 0);
        ekVar.a(new el(this.j, this.f18690b.a(), 0, this.f18690b.c(), this.f18690b.f(), this.f18690b.d(), f18689a, this.f18690b.b(), this.f18691c, this.f18690b.e()));
    }

    public void a(int i) {
        this.f18691c = i;
    }

    public void a(float f, float f2) {
        this.d = f;
        this.e = f2;
        this.i = false;
    }

    private float[] b() {
        if (!this.i) {
            a();
        }
        return this.h;
    }

    private void a() {
        float[] fArr = this.h;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.f, this.g, 0.0f);
        Matrix.scaleM(fArr, 0, this.d, this.e, 1.0f);
        this.i = true;
    }

    public ej(ei eiVar) {
        this.f18690b = eiVar;
    }

    static {
        float[] fArr = new float[16];
        f18689a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }
}
