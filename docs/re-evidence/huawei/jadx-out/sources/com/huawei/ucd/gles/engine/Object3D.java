package com.huawei.ucd.gles.engine;

import android.content.Context;
import android.opengl.GLES20;
import defpackage.qid;
import defpackage.qio;
import defpackage.qir;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes43.dex */
public class Object3D extends Actor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FloatBuffer f23214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FloatBuffer f23216c;
    private int d;
    private FloatBuffer e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int m;
    private int[] n;
    private int o;

    protected void j() {
    }

    public Object3D(Context context) {
        super(context);
        this.f = -1;
        this.g = -1;
        this.m = -1;
        this.j = -1;
        this.i = -1;
        this.d = -1;
        this.h = -1;
        this.o = -1;
        this.f23215b = false;
        this.n = new int[3];
        this.mDefaultTextureOptions = qio.d();
        this.mDefaultMaterialName = "gles_engine_object3d/default_simple_object3d.mat";
    }

    public void e(float[] fArr, float[] fArr2, float[] fArr3) {
        c(fArr, fArr2, fArr3);
    }

    private void c(float[] fArr, float[] fArr2, float[] fArr3) {
        b(fArr, fArr2, fArr3);
        this.f23215b = true;
        requestRender();
    }

    public void b(float[] fArr, float[] fArr2, float[] fArr3) {
        qid.e("Object3D", qid.a() + "count vertices=" + fArr.length + " normals=" + fArr2.length + " texCoors=" + fArr3.length);
        this.mVertexCount = fArr.length / 3;
        this.f23216c = qir.c(fArr);
        this.f23214a = qir.c(fArr2);
        this.e = qir.c(fArr3);
    }

    @Override // com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onSurfaceCreated() {
        super.onSurfaceCreated();
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.gles.engine.Object3D.3
            @Override // java.lang.Runnable
            public void run() {
                Object3D.this.c();
            }
        });
    }

    protected void c() {
        GLES20.glGenBuffers(3, this.n, 0);
        GLES20.glBindBuffer(34962, this.n[0]);
        GLES20.glBufferData(34962, this.f23216c.capacity() * 4, this.f23216c, 35044);
        GLES20.glBindBuffer(34962, this.n[1]);
        GLES20.glBufferData(34962, this.f23214a.capacity() * 4, this.f23214a, 35044);
        GLES20.glBindBuffer(34962, this.n[2]);
        GLES20.glBufferData(34962, this.e.capacity() * 4, this.e, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    @Override // com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onSurfaceChanged(int i, int i2) {
        super.onSurfaceChanged(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        setProjectFrustum(-f, f, -1.0f, 1.0f, 2.0f, 1000.0f);
        setCamera(0.0f, 0.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    @Override // com.huawei.ucd.gles.engine.Actor
    public void onShaderLocationInit() {
        this.f = d();
        this.g = b();
        this.m = h();
        this.j = a();
        this.i = f();
        this.d = e();
        this.h = g();
        this.o = i();
        qid.e("Object3D", qid.a() + " muMVPMatrixHandle=" + this.f + " muModelMatrixHandle=" + this.g + " muViewMatrixHandle=" + this.m + " muModelViewMatrixHandle=" + this.j + " maPositionHandle=" + this.i + " maNormalHandle=" + this.d + " maTexCoorHandle=" + this.h + " muTextureHandle=" + this.o);
    }

    protected int d() {
        return getMaterialHandler("uMVPMatrix");
    }

    protected int b() {
        return getMaterialHandler("uModelMatrix");
    }

    protected int h() {
        return getMaterialHandler("uViewMatrix");
    }

    protected int a() {
        return getMaterialHandler("uModelViewMatrix");
    }

    protected int f() {
        return getMaterialHandler("aPosition");
    }

    protected int e() {
        return getMaterialHandler("aNormal");
    }

    protected int g() {
        return getMaterialHandler("aTexCoor");
    }

    protected int i() {
        return getMaterialHandler("uTexture");
    }

    @Override // com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onDrawFrame() {
        if (this.f23215b) {
            GLES20.glEnable(2929);
            GLES20.glEnable(2884);
            super.onDrawFrame();
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
        }
    }

    @Override // com.huawei.ucd.gles.engine.Actor
    protected void onDraw() {
        super.onDraw();
        int i = this.f;
        if (i != -1) {
            GLES20.glUniformMatrix4fv(i, 1, false, getMVPMatrix(), 0);
        }
        int i2 = this.g;
        if (i2 != -1) {
            GLES20.glUniformMatrix4fv(i2, 1, false, getModelMatrix(), 0);
        }
        int i3 = this.m;
        if (i3 != -1) {
            GLES20.glUniformMatrix4fv(i3, 1, false, getViewMatrix(), 0);
        }
        int i4 = this.j;
        if (i4 != -1) {
            GLES20.glUniformMatrix4fv(i4, 1, false, getModelViewMatrix(), 0);
        }
        if (this.i != -1) {
            GLES20.glBindBuffer(34962, this.n[0]);
            GLES20.glVertexAttribPointer(this.i, 3, 5126, false, 0, 0);
            GLES20.glEnableVertexAttribArray(this.i);
        }
        if (this.d != -1) {
            GLES20.glBindBuffer(34962, this.n[1]);
            GLES20.glVertexAttribPointer(this.d, 3, 5126, false, 0, 0);
            GLES20.glEnableVertexAttribArray(this.d);
        }
        if (this.h != -1) {
            GLES20.glBindBuffer(34962, this.n[2]);
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 0, 0);
            GLES20.glEnableVertexAttribArray(this.h);
        }
        GLES20.glBindBuffer(34962, 0);
        k();
        GLES20.glDrawArrays(4, 0, this.mVertexCount);
        j();
    }

    protected void k() {
        if (this.o == -1 || this.mTextureID == -1) {
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mTextureID);
        GLES20.glUniform1i(this.o, 0);
    }

    @Override // com.huawei.ucd.gles.engine.Actor
    public void onDestroy() {
        FloatBuffer floatBuffer = this.f23216c;
        if (floatBuffer != null) {
            floatBuffer.clear();
            this.f23216c = null;
        }
        FloatBuffer floatBuffer2 = this.f23214a;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
            this.f23214a = null;
        }
        FloatBuffer floatBuffer3 = this.e;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
            this.e = null;
        }
        super.onDestroy();
    }
}
