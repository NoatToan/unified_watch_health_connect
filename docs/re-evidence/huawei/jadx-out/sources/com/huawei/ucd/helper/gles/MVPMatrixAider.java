package com.huawei.ucd.helper.gles;

import android.opengl.Matrix;
import java.util.Stack;

/* JADX INFO: loaded from: classes43.dex */
public class MVPMatrixAider {
    private ProjectType f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f23222c = new float[16];
    private float[] j = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f23221b = new float[16];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f23220a = new float[16];
    private float[] e = new float[16];
    private float[] i = new float[16];
    public Stack<float[]> d = new Stack<>();

    enum ProjectType {
        ORTHO,
        FRUSTUM
    }

    public void h() {
        this.d.push((float[]) this.f23221b.clone());
    }

    public void g() {
        this.f23221b = this.d.pop();
    }

    public void i() {
        this.f23222c = null;
        this.j = null;
        this.f23221b = null;
        this.f23220a = null;
        this.e = null;
        this.i = null;
    }

    public float[] f() {
        Matrix.multiplyMM(this.i, 0, this.f23222c, 0, this.j, 0);
        return (float[]) this.i.clone();
    }

    public float[] c() {
        Matrix.multiplyMM(this.e, 0, this.j, 0, this.f23221b, 0);
        float[] fArr = this.e;
        Matrix.multiplyMM(fArr, 0, this.f23222c, 0, fArr, 0);
        return (float[]) this.e.clone();
    }

    public float[] a() {
        Matrix.multiplyMM(this.f23220a, 0, this.j, 0, this.f23221b, 0);
        return (float[]) this.f23220a.clone();
    }

    public float[] e() {
        return (float[]) this.f23222c.clone();
    }

    public float[] d() {
        return (float[]) this.j.clone();
    }

    public float[] b() {
        return (float[]) this.f23221b.clone();
    }

    public void j() {
        Matrix.setRotateM(this.f23221b, 0, 0.0f, 1.0f, 0.0f, 0.0f);
    }

    public void c(float f, float f2, float f3) {
        Matrix.translateM(this.f23221b, 0, f, f2, f3);
    }

    public void d(float f, float f2, float f3, float f4) {
        Matrix.rotateM(this.f23221b, 0, f, f2, f3, f4);
    }

    public void d(float f, float f2, float f3) {
        Matrix.scaleM(this.f23221b, 0, f, f2, f3);
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Matrix.setLookAtM(this.j, 0, f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.frustumM(this.f23222c, 0, f, f2, f3, f4, f5, f6);
        this.f = ProjectType.FRUSTUM;
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix.orthoM(this.f23222c, 0, f, f2, f3, f4, f5, f6);
        this.f = ProjectType.ORTHO;
    }
}
